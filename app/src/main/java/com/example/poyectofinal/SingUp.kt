package com.example.poyectofinal
import Components
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SingUp : Fragment() {
    // TODO: Rename and change types of parameters
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
        val rootView = inflater.inflate(R.layout.fragment_sing_up, container, false)
        val logInButton = rootView.findViewById<Button>(R.id.buttonLogIn)
        val registerButton = rootView.findViewById<Button>(R.id.buttonRegister)

        val textEmailLayout = rootView.findViewById<TextInputLayout>(R.id.emailLogin)
        val textUserNameLayout = rootView.findViewById<TextInputLayout>(R.id.usernameRegister)
        val textPasswordLayout = rootView.findViewById<TextInputLayout>(R.id.passwordRegister)

        val textEmail = textEmailLayout.findViewById<TextInputEditText>(R.id.emailText)
        val textUserName = textUserNameLayout.findViewById<TextInputEditText>(R.id.usernameText)
        val textPassword = textPasswordLayout.findViewById<TextInputEditText>(R.id.passwordText)

        logInButton.setOnClickListener {
            findNavController().navigate(R.id.action_singUp_to_loginFragment)
        }
        registerButton.setOnClickListener{
            val email = textEmail.text.toString()
            val username = textUserName.text.toString()
            val password = textPassword.text.toString()

            if (isAdded) {
                Components.showInfoToast(requireContext(), "Registrando Usuario...", R.layout.info_toast)
                registerUser(email, username, password)
            }else {
                println("Ha ocurrido un error")
            }
        }

        return rootView

    }
    private fun registerUser(email: String, username: String, password: String) {
        val url = "http://192.168.100.65:8080/api/users/register"
        val client = OkHttpClient()

        val json = """
        {
            "email": "$email",
            "userName": "$username",
            "password": "$password"
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
                // Mostrar Toast usando requireContext()
                requireActivity().runOnUiThread {
                    if (response.isSuccessful) {
                        Components.showInfoToast(requireContext(), "Usuario Registrado", R.layout.info_toast)

                    } else {
                        Toast.makeText(requireContext(), response.toString(), Toast.LENGTH_LONG).show()
                    }
                }
            }
        })
    }




    companion object {
    }
}