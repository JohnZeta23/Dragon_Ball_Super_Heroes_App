package com.example.dragonballsuperheroes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dragonballsuperheroes.databinding.FragmentPersonajesBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class PersonajesFragment : Fragment() {

    private var _binding: FragmentPersonajesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPersonajesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.btnGohan.setOnClickListener{
            showBottomSheet(R.layout.gohan_sheet)
        }

        binding.btnPiccolo.setOnClickListener{
            showBottomSheet(R.layout.piccolo_sheet)
        }

        binding.btnPan.setOnClickListener{
            showBottomSheet(R.layout.pan_sheet)
        }

        binding.name1.setOnClickListener{
            showBottomSheet(R.layout.gohan_sheet)
        }

        binding.name2.setOnClickListener{
            showBottomSheet(R.layout.piccolo_sheet)
        }

        binding.name3.setOnClickListener{
            showBottomSheet(R.layout.pan_sheet)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showBottomSheet(resource:Int){
        val sheetFragment = BottomSheetDialog(requireContext())
        val dialogView = layoutInflater.inflate(resource,null)
        sheetFragment.setContentView(dialogView)
        sheetFragment.show()
    }
}