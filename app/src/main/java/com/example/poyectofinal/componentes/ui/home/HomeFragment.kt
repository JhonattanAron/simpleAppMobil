package com.example.poyectofinal.componentes.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.poyectofinal.adpater.ArticlesAdapter
import com.example.poyectofinal.databinding.FragmentHomeBinding
import com.example.poyectofinal.model.Articles
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONArray
import java.io.IOException

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var articles: List<Articles>
    private lateinit var recyclerView: RecyclerView
    private lateinit var articlesAdapter: ArticlesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        recyclerView = binding.articlesView
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        // Inicializar el adaptador con una lista vacía (puedes ajustar esto según tus necesidades)
        articles = emptyList()
        articlesAdapter = ArticlesAdapter(articles, requireContext())
        recyclerView.adapter = articlesAdapter

        fetchArticlesData()

        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun fetchArticlesData() {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url("http://192.168.100.65:8080/api/articles")
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val responseData = response.body?.string()

                    responseData?.let {
                        val jsonArray = JSONArray(responseData)
                        val gson = Gson()
                        val articlesList = gson.fromJson<List<Articles>>(
                            jsonArray.toString(),
                            object : TypeToken<List<Articles>>() {}.type
                        )

                        // Actualizar la lista de artículos y notificar al adaptador en el hilo principal
                        requireActivity().runOnUiThread {
                            articles = articlesList
                            articlesAdapter = ArticlesAdapter(articles, requireContext())
                            recyclerView.layoutManager = LinearLayoutManager(requireContext())
                            recyclerView.adapter = articlesAdapter
                        }
                    }
                } else {
                    Log.d("HomeFragment", "Error en la respuesta del servidor: ${response.code}")
                }
            }

        })
    }

}
