package com.yahya.challengechapter3

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.yahya.challengechapter3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _fragmentBinding: FragmentHomeBinding? = null
    private val fragmentBinding get() = _fragmentBinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        _fragmentBinding = FragmentHomeBinding.inflate(inflater, container, false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentBinding.rvAlphabet.setHasFixedSize(true)
        fragmentBinding.rvAlphabet.layoutManager = LinearLayoutManager(requireContext())

        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            setTitle(R.string.app_name)
            setDisplayHomeAsUpEnabled(false)
        }

        val adapter = ListAdapter {
            val bundle = Bundle()
            bundle.putString(KEY, it)
            findNavController().navigate(R.id.listCitiesFragment, bundle)
        }

        adapter.submitList(alphabets)
        fragmentBinding.rvAlphabet.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.grid -> {
                fragmentBinding.rvAlphabet.layoutManager = GridLayoutManager(requireContext(), 2)
            }

            R.id.list -> {
                fragmentBinding.rvAlphabet.layoutManager = LinearLayoutManager(requireContext())
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        _fragmentBinding = null
    }

    companion object {
        const val KEY = "KEY"
    }

}