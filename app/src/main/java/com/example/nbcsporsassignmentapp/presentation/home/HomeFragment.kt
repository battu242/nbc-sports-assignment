package com.example.nbcsporsassignmentapp.presentation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nbcsporsassignmentapp.R
import dagger.hilt.android.AndroidEntryPoint

class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var viewModel: HomeViewModel

    private lateinit var homeShelfListAdapter: HomeShelfListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]

        setUpRecyclerView(view)
        configureObservers()
    }

    private fun setUpRecyclerView(view: View) {
        homeShelfListAdapter = HomeShelfListAdapter()
        val rvShelfList = view.findViewById<RecyclerView>(R.id.rvShelfList)
        rvShelfList.layoutManager = LinearLayoutManager(requireContext())
        rvShelfList.adapter = homeShelfListAdapter
    }

    private fun configureObservers() {
        viewModel.shelves.observe(viewLifecycleOwner) {
            it?.run {
                homeShelfListAdapter.setShelves(it)
            }
        }
    }
}