package com.yahya.challengechapter3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.yahya.challengechapter3.HomeFragment.Companion.KEY
import com.yahya.challengechapter3.databinding.FragmentListCitiesBinding

class ListCitiesFragment : Fragment() {

    private var _fragmentBinding: FragmentListCitiesBinding?= null
    private val fragmentBinding get() = _fragmentBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        _fragmentBinding = FragmentListCitiesBinding.inflate(inflater, container, false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentBinding.rvListCities.setHasFixedSize(true)

        val arguments = arguments?.getString(KEY)
        var wordsLists = arrayListOf<String>()
        val title = "List of cities from $arguments"
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            setTitle(title)
            setDisplayHomeAsUpEnabled(true)
        }

        when(arguments) {
            Cities.A.char -> {
                wordsLists = Cities.A.listCities
            }

            Cities.B.char -> {
                wordsLists = Cities.B.listCities
            }

            Cities.C.char -> {
                wordsLists = Cities.C.listCities
            }

            Cities.D.char -> {
                wordsLists = Cities.D.listCities
            }

            Cities.E.char -> {
                wordsLists = Cities.E.listCities
            }

            Cities.F.char -> {
                wordsLists = Cities.F.listCities
            }

            Cities.G.char -> {
                wordsLists = Cities.G.listCities
            }

            Cities.H.char -> {
                wordsLists = Cities.H.listCities
            }

            Cities.I.char -> {
                wordsLists = Cities.I.listCities
            }

            Cities.J.char -> {
                wordsLists = Cities.J.listCities
            }

            Cities.K.char -> {
                wordsLists = Cities.K.listCities
            }

            Cities.L.char -> {
                wordsLists = Cities.L.listCities
            }

            Cities.M.char -> {
                wordsLists = Cities.M.listCities
            }

            Cities.N.char -> {
                wordsLists = Cities.N.listCities
            }

            Cities.O.char -> {
                wordsLists = Cities.O.listCities
            }

            Cities.P.char -> {
                wordsLists = Cities.P.listCities
            }

            Cities.Q.char -> {
                wordsLists = Cities.Q.listCities
            }

            Cities.R.char -> {
                wordsLists = Cities.R.listCities
            }

            Cities.S.char -> {
                wordsLists = Cities.S.listCities
            }

            Cities.T.char -> {
                wordsLists = Cities.T.listCities
            }

            Cities.U.char -> {
                wordsLists = Cities.U.listCities
            }

            Cities.V.char -> {
                wordsLists = Cities.V.listCities
            }

            Cities.W.char -> {
                wordsLists = Cities.W.listCities
            }

            Cities.X.char -> {
                wordsLists = Cities.X.listCities
            }

            Cities.Y.char -> {
                wordsLists = Cities.Y.listCities
            }

            Cities.Z.char -> {
                wordsLists = Cities.Z.listCities
            }
        }

        val adapter = ListAdapter {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://google.com/search?q=$it"))
            activity?.startActivity(intent)
        }
        adapter.submitList(wordsLists)
        fragmentBinding.rvListCities.also {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(activity)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                findNavController().navigate(R.id.action_listCitiesFragment_to_homeFragment)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        _fragmentBinding = null
    }

}