import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.poyectofinal.R
import com.google.android.material.navigation.NavigationView
import org.w3c.dom.Text

object Components {
    fun showInfoToast(context: Context, message: String, layoutResourceId: Int) {
        val toast = Toast(context)
        val inflater = LayoutInflater.from(context)
        val toastView = inflater.inflate(layoutResourceId, null)
        val textView = toastView.findViewById<TextView>(R.id.toast_text)

        textView.text = message
        toast.view = toastView
        toast.duration = Toast.LENGTH_LONG
        toast.show()
    }
}
