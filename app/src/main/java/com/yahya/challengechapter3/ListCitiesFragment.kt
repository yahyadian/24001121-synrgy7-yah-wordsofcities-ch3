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
        var alphabetsList = arrayListOf<String>()
        val title = "List of cities from $arguments"
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            setTitle(title)
            setDisplayHomeAsUpEnabled(true)
        }

        when(arguments) {
            Cities.A.char -> {
                alphabetsList = Cities.A.listCities
            }

            Cities.B.char -> {
                alphabetsList = Cities.B.listCities
            }

            Cities.C.char -> {
                alphabetsList = Cities.C.listCities
            }

            Cities.D.char -> {
                alphabetsList = Cities.D.listCities
            }

            Cities.E.char -> {
                alphabetsList = Cities.E.listCities
            }

            Cities.F.char -> {
                alphabetsList = Cities.F.listCities
            }

            Cities.G.char -> {
                alphabetsList = Cities.G.listCities
            }

            Cities.H.char -> {
                alphabetsList = Cities.H.listCities
            }

            Cities.I.char -> {
                alphabetsList = Cities.I.listCities
            }

            Cities.J.char -> {
                alphabetsList = Cities.J.listCities
            }

            Cities.K.char -> {
                alphabetsList = Cities.K.listCities
            }

            Cities.L.char -> {
                alphabetsList = Cities.L.listCities
            }

            Cities.M.char -> {
                alphabetsList = Cities.M.listCities
            }

            Cities.N.char -> {
                alphabetsList = Cities.N.listCities
            }

            Cities.O.char -> {
                alphabetsList = Cities.O.listCities
            }

            Cities.P.char -> {
                alphabetsList = Cities.P.listCities
            }

            Cities.Q.char -> {
                alphabetsList = Cities.Q.listCities
            }

            Cities.R.char -> {
                alphabetsList = Cities.R.listCities
            }

            Cities.S.char -> {
                alphabetsList = Cities.S.listCities
            }

            Cities.T.char -> {
                alphabetsList = Cities.T.listCities
            }

            Cities.U.char -> {
                alphabetsList = Cities.U.listCities
            }

            Cities.V.char -> {
                alphabetsList = Cities.V.listCities
            }

            Cities.W.char -> {
                alphabetsList = Cities.W.listCities
            }

            Cities.X.char -> {
                alphabetsList = Cities.X.listCities
            }

            Cities.Y.char -> {
                alphabetsList = Cities.Y.listCities
            }

            Cities.Z.char -> {
                alphabetsList = Cities.Z.listCities
            }
        }

        val adapter = ListAdapter {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://google.com/search?q=$it"))
            activity?.startActivity(intent)
        }
        adapter.submitList(alphabetsList)
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