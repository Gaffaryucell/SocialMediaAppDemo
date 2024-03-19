package com.androiddevelopers.socialmediaappdemo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddevelopers.socialmediaappdemo.R
import com.androiddevelopers.socialmediaappdemo.adapter.HomeAdapter
import com.androiddevelopers.socialmediaappdemo.databinding.FragmentHomeBinding
import com.androiddevelopers.socialmediaappdemo.model.PostModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {

    private lateinit var adapter: HomeAdapter

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
        val postList = ArrayList<PostModel>()

        val post1 = PostModel(
            id = "1",
            description = "Sıcak bir kahvenin yanında derin düşüncelere dalmanın keyfi.\n",
            image = "https://www.yurtgazetesi.com.tr/d/gallery/865_23.jpg",
            profileImage = "https://www.yurtgazetesi.com.tr/d/gallery/865_23.jpg",
            like = 20,
            userName = "Kullanıcı Adı 1"
        )
        postList.add(post1)

        val post2 = PostModel(
            id = "2",
            description = "Yağmurun romantik bir atmosfer oluşturduğu renkli şemsiyeler.\n",
            image = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Jennifer_Lawrence_at_the_83rd_Academy_Awards_crop.jpg/1200px-Jennifer_Lawrence_at_the_83rd_Academy_Awards_crop.jpg",
            profileImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Jennifer_Lawrence_at_the_83rd_Academy_Awards_crop.jpg/1200px-Jennifer_Lawrence_at_the_83rd_Academy_Awards_crop.jpg",
            like = 15,
            userName = "Kullanıcı Adı 2"
        )
        postList.add(post2)

        val post3 = PostModel(
            id = "3",
            description ="Dünyanın yüksekten çekilmiş görüntüsü ve muazzam doğal güzellikler.\n",
            image = "https://image.hurimg.com/i/hurriyet/75/382x0/5fd9b31e7152d829744433a2.jpg",
            profileImage = "https://image.hurimg.com/i/hurriyet/75/382x0/5fd9b31e7152d829744433a2.jpg",
            like = 30,
            userName = "Kullanıcı Adı 3"
        )
        postList.add(post3)

        val post4 = PostModel(
            id = "4",
            description ="Şık ve trend leopar desenli çanta ile stilinizi tamamlayın.\n",
            image = "https://www.yurtgazetesi.com.tr/d/gallery/865_12.jpg",
            profileImage = "https://www.yurtgazetesi.com.tr/d/gallery/865_12.jpg",
            like = 25,
            userName = "Kullanıcı Adı 4"
        )
        postList.add(post4)

        val post5 = PostModel(
            id = "5",
            description = "Beşinci gönderi açıklaması",
            image = "https://image.milimaj.com/i/milliyet/75/0x0/5c8e19df07291c1d74056dbf.jpg",
            profileImage = "https://image.milimaj.com/i/milliyet/75/0x0/5c8e19df07291c1d74056dbf.jpg",
            like = 18,
            userName = "Kullanıcı Adı 5"
        )
        postList.add(post5)

        val post6 = PostModel(
            id = "6",
            description = "AAntika bir saatle zamanın izlerini takip etmek.\nı",
            image = "https://www.yurtgazetesi.com.tr/d/gallery/865_5.jpg",
            profileImage = "https://www.yurtgazetesi.com.tr/d/gallery/865_5.jpg",
            like = 22,
            userName = "Kullanıcı Adı 6"
        )
        postList.add(post6)
        val post7 = PostModel(
            id = "6",
            description = "Renkli balonların serbestçe uçuştuğu hafif rüzgarlı bir gün.\n",
            image = "https://www.yurtgazetesi.com.tr/d/gallery/865_22.jpg",
            profileImage = "https://www.yurtgazetesi.com.tr/d/gallery/865_22.jpg",
            like = 22,
            userName = "Kullanıcı Adı 6"
        )

        postList.add(post7)
        adapter = HomeAdapter(postList)
        binding.rvHome.layoutManager = LinearLayoutManager(requireContext())
        binding.rvHome.adapter = adapter
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}