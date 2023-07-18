package com.example.poyectofinal

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.navigation.fragment.findNavController
import com.example.poyectofinal.componentes.ui.login.UserDatabaseHelper
import com.example.poyectofinal.componentes.ui.login.UserModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class Login : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_login, container, false)

        val textEmailLayout = rootView.findViewById<TextInputLayout>(R.id.emailLogin)
        val textPasswordLayout = rootView.findViewById<TextInputLayout>(R.id.passwordLogin)

        val textEmail = textEmailLayout.findViewById<TextInputEditText>(R.id.emailTextLogin)
        val textPassword = textPasswordLayout.findViewById<TextInputEditText>(R.id.passwordTextLogin)

        val loginBtn = rootView.findViewById<Button>(R.id.loginBtn)
        val singUpButton = rootView.findViewById<Button>(R.id.buttonSingUp)

        singUpButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_singUp)
        }
        loginBtn.setOnClickListener {
            val email = textEmail.text.toString().trim()
            val pass = textPassword.text.toString().trim()
            Components.showInfoToast(requireContext(), "Iniciando Sesion...", R.layout.info_toast)
            loginUsuarios(email, pass)
        }



        return rootView

    }

    private fun loginUsuarios(email: String, password: String) {
        val url = "http://192.168.100.65:8080/api/users/login"
        val client = OkHttpClient()

        val json = """
        {
            "email": "$email",
            "password": "$password"
        }
    """.trimIndent()

        val requestBody = json.toRequestBody("application/json".toMediaTypeOrNull())

        val request = Request.Builder()
            .url(url)
            .post(requestBody)
            .build()

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = client.newCall(request).execute()
                val responseBody = response.body?.string()
                withContext(Dispatchers.Main) {
                    if (response.isSuccessful) {
                        val jsonObject = JSONObject(responseBody)
                        val userId = jsonObject.getString("id")
                        val userName = jsonObject.getString("email")
                        val userEmail = jsonObject.getString("userName")
                        guardarSesion(userId , userEmail  , userName)
                        findNavController().navigate(R.id.action_loginFragment_to_nav_home)
                    } else {
                        Components.showInfoToast(requireContext(), "Usuario No Encontrado\nRegístrate Por Favor", R.layout.info_toast)
                    }
                }
            } catch (e: IOException) {
                withContext(Dispatchers.Main) {
                    Components.showInfoToast(requireContext(), e.toString(), R.layout.info_toast)
                }
            }
        }
    }


    private fun guardarSesion(userId: String , userEmail: String ,userName: String ) {
        val sharedPreferences = requireContext().getSharedPreferences("Sesion", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("userId", userId)
        editor.putString("userEmail", userEmail)
        editor.putString("userName", userName)
        editor.apply()
    }




    companion object {
        fun newInstance(param1: String, param2: String) =
            Login().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}