package com.androiddevelopers.socialmediaappdemo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddevelopers.socialmediaappdemo.R
import com.androiddevelopers.socialmediaappdemo.adapter.HomeAdapter
import com.androiddevelopers.socialmediaappdemo.adapter.JobAdapter
import com.androiddevelopers.socialmediaappdemo.databinding.FragmentHomeBinding
import com.androiddevelopers.socialmediaappdemo.model.JobCategory
import com.androiddevelopers.socialmediaappdemo.model.PostModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {

    private lateinit var adapter: HomeAdapter
    private lateinit var jobAdapter: JobAdapter

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val kategoriler = ArrayList<JobCategory>()

        val inşaat = JobCategory("İnşaat", R.drawable.hook)
        val koordinatör = JobCategory("Koordinatör", R.drawable.work)
        val işveren = JobCategory("İşveren", R.drawable.employee)
        val finansKariyeri = JobCategory("Finans Kariyeri", R.drawable.saving)
        val bilgiTeknolojisi = JobCategory("Bilgi Teknolojisi", R.drawable.information)
        val pazarlama = JobCategory("Pazarlama", R.drawable.bullhorn)
        val kaliteKontrol = JobCategory("Kalite Kontrol", R.drawable.quality)
        val gayrimenkul = JobCategory("Gayrimenkul", R.drawable.agent)

        kategoriler.add(inşaat)
        kategoriler.add(koordinatör)
        kategoriler.add(işveren)
        kategoriler.add(finansKariyeri)
        kategoriler.add(bilgiTeknolojisi)
        kategoriler.add(pazarlama)
        kategoriler.add(kaliteKontrol)
        kategoriler.add(gayrimenkul)


        makeList()
        adapter = HomeAdapter(kategoriler)
        binding.rvHome.layoutManager = GridLayoutManager(requireContext(),2)
        binding.rvHome.adapter = adapter
    }
    private fun makeList(){

        val işPozisyonları = listOf(
            PostModel(
                "Front End Developer",
                "Soomas Yatırım A.Ş",
                R.drawable.hook
            ),
            PostModel(
                "Networking Engineer",
                "GUXOFT",
                R.drawable.work
            ),
            PostModel(
                "Senior UX Designer",
                "NetSuite",
                R.drawable.employee,
            ),
            PostModel(
                "JEB Product Sales Specialist, Russia & CIS",
                "General Electric",
                R.drawable.saving,
            ),
            PostModel(
                "Technical Support Specialist",
                "Man Power Group",
                R.drawable.information,
            ),
            PostModel(
                "Production/Assembly Worker",
                "Mandstad",
                R.drawable.bullhorn,
            )
        )

        jobAdapter = JobAdapter(işPozisyonları)
        binding.rvJob.layoutManager = LinearLayoutManager(requireContext())
        binding.rvJob.adapter = jobAdapter
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}