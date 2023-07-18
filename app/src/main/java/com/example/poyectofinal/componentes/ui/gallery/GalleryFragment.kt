package com.example.poyectofinal.componentes.ui.gallery

import Components
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.poyectofinal.R
import com.example.poyectofinal.databinding.FragmentGalleryBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import java.io.IOException

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textTittleLayout = rootView.findViewById<TextInputLayout>(R.id.tituloInputLayout)
        val textautorLayout = rootView.findViewById<TextInputLayout>(R.id.autorInputLayout)
        val textImgUrlLayout = rootView.findViewById<TextInputLayout>(R.id.portadaInputLayout)
        val textIntrouductionLayout = rootView.findViewById<TextInputLayout>(R.id.introduccionInputLayout)
        val textContentLayout = rootView.findViewById<TextInputLayout>(R.id.contenidoInputLayout)

        val txtTittle = textTittleLayout.findViewById<TextInputEditText>(R.id.tituloEditText)
        val txtAuto = textautorLayout.findViewById<TextInputEditText>(R.id.autorEditText)
        val txtImg = textImgUrlLayout.findViewById<TextInputEditText>(R.id.portadaEditText)
        val txtIntroduccion = textIntrouductionLayout.findViewById<TextInputEditText>(R.id.introduccionEditText)
        val txtContent = textContentLayout.findViewById<TextInputEditText>(R.id.contenidoEditText)

        val btnRegister = rootView.findViewById<Button>(R.id.buttonRegisterArticle)

        btnRegister.setOnClickListener {
            val title = txtTittle.text.toString().trim()
            val autor = txtAuto.text.toString().trim()
            val imgUrl = txtImg.text.toString().trim()
            val intro = txtIntroduccion.text.toString().trim()
            val cont = txtContent.text.toString().trim()

            if (title.isEmpty() || autor.isEmpty() || imgUrl.isEmpty() || intro.isEmpty() || cont.isEmpty()) {
                Components.showInfoToast(requireContext(), "Llena Todos los Campos", R.layout.warning_toast)
            } else {
                Components.showInfoToast(requireContext(), "Registrando Articulo.....", R.layout.info_toast)
                registerArticle(title, autor, imgUrl, intro, cont)
                txtTittle.text = null
                txtAuto.text = null
                txtImg.text = null
                txtIntroduccion.text = null
                txtContent.text = null
            }
        }




        return rootView
    }


    private fun registerArticle(
        title: String,
        autor: String,
        imgUrl: String,
        intro: String,
        cont: String
    ) {
        val url = "http://192.168.100.65:8080/api/articles/register"
        val client = OkHttpClient()

        val escapedTitle = escapeJson(title)
        val escapedAutor = escapeJson(autor)
        val escapedImgUrl = escapeJson(imgUrl)
        val escapedIntro = escapeJson(intro)
        val escapedCont = escapeJson(cont)

        val json = """
        {
            "tittle": "$escapedTitle",
            "footer": "$escapedAutor",
            "imgUrl": "$escapedImgUrl",
            "paragraphOne": "$escapedIntro",
            "paragraphTwo": "$escapedCont"
        }
    """.trimIndent()

        val requestBody = json.toRequestBody("application/json".toMediaTypeOrNull())

        val request = Request.Builder()
            .url(url)
            .post(requestBody)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                requireActivity().runOnUiThread {
                    Components.showInfoToast(requireContext(), e.toString(), R.layout.info_toast)
                }
            }

            override fun onResponse(call: Call, response: Response) {
                requireActivity().runOnUiThread {
                    if (response.isSuccessful) {
                        Components.showInfoToast(requireContext(), "Articulo Registrado Con Exito", R.layout.info_toast)
                    } else {
                        Toast.makeText(requireContext(), response.toString(), Toast.LENGTH_LONG).show()
                    }
                }
            }
        })
    }

    private fun escapeJson(input: String): String {
        return input.replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t")
            .replace("\b", "\\b")
            .replace("\u000c", "\\f")
            .replace("'", "\\'")
            .replace("ñ", "\\u00F1")
            .replace("Ñ", "\\u00D1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
