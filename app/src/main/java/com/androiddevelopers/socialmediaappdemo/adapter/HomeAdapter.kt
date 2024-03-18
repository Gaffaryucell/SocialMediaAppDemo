package com.androiddevelopers.socialmediaappdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androiddevelopers.socialmediaappdemo.model.PostModel
import com.androiddevelopers.socialmediaappdemo.databinding.RowHomeBinding
import com.bumptech.glide.Glide
import kotlin.random.Random

class HomeAdapter(val list : List<PostModel>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    inner class HomeViewHolder(val binding : RowHomeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        println("onCreateViewHolder")
        val binding = RowHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeAdapter.HomeViewHolder, position: Int) {
        val post = list[position]

        val randomNum = Random.nextInt(20000)
            holder.binding.tvUserName.text = post.userName
            holder.binding.tvPostDescription.text = post.description
            holder.binding.tvLike.text = "${randomNum} Beğeni"
            holder.binding.tvComment.text ="${randomNum-20} Yorum"




        Glide.with(holder.itemView.context)
            .load(post.image)
            .into(holder.binding.ivPost)

        Glide.with(holder.itemView.context)
            .load(post.profileImage)
            .into(holder.binding.ivUserProfile)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
