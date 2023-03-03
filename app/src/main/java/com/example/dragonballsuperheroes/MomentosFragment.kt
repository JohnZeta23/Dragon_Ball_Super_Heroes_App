package com.example.dragonballsuperheroes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.example.dragonballsuperheroes.databinding.FragmentMomentosBinding


class MomentosFragment : Fragment() {

    private var _binding: FragmentMomentosBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMomentosBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.momento1.setOnClickListener {
            val WebView: WebView = binding.Wvmomento as WebView
            WebView.getSettings().setJavaScriptEnabled(true)
            WebView.getSettings().setPluginState(WebSettings.PluginState.ON)
            WebView.loadUrl("https://www.youtube.com/embed/R8PRjNttQWI?autoplay=1&vq=small")
            WebView.setWebChromeClient(WebChromeClient())
            binding.description.text = "En este momento, el poder de Gohan no es suficiente para contrarestar a los poderes del villano, por lo que recurre a una nueva transformación."
        }

        binding.momento2.setOnClickListener {
            val WebView: WebView = binding.Wvmomento as WebView
            WebView.getSettings().setJavaScriptEnabled(true)
            WebView.getSettings().setPluginState(WebSettings.PluginState.ON)
            WebView.loadUrl("https://www.youtube.com/embed/QFn5BQH5pOU?autoplay=1&vq=small")
            WebView.setWebChromeClient(WebChromeClient())
            binding.description.text = "En este momento, Piccolo se encuentra en un apuro mientras pelea con uno de los villanos del filme. Ante la falta de poder, logra una nueva evolución."
        }

        binding.momento3.setOnClickListener {
            val WebView: WebView = binding.Wvmomento as WebView
            WebView.getSettings().setJavaScriptEnabled(true)
            WebView.getSettings().setPluginState(WebSettings.PluginState.ON)
            WebView.loadUrl("https://www.youtube.com/embed/JiveNg2McEE?autoplay=1&vq=small")
            WebView.setWebChromeClient(WebChromeClient())
            binding.description.text = "En este momento, Pan quien aún no domina su ki, está bajo la tutela de Piccolo, quien trata de enseñarle como usar el poder que la niña posee."
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}