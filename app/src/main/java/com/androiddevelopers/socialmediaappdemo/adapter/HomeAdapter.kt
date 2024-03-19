package com.androiddevelopers.socialmediaappdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androiddevelopers.socialmediaappdemo.model.PostModel
import com.androiddevelopers.socialmediaappdemo.databinding.RowHomeBinding
import com.androiddevelopers.socialmediaappdemo.databinding.RowJobBinding
import com.androiddevelopers.socialmediaappdemo.model.JobCategory
import com.bumptech.glide.Glide
import kotlin.random.Random

class HomeAdapter(val list : List<JobCategory>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    inner class HomeViewHolder(val binding : RowHomeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = RowHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeAdapter.HomeViewHolder, position: Int) {
        val post = list[position]

        val randomNum = Random.nextInt(20000)
        holder.binding.tvTitle.text = post.name
        holder.binding.tvOpr.text = randomNum.toString()+ " açık pozisyon"
        holder.binding.ivIcon.setImageResource(post.image)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}


class JobAdapter(val list : List<PostModel>) : RecyclerView.Adapter<JobAdapter.HomeViewHolder>() {
    inner class HomeViewHolder(val binding : RowJobBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = RowJobBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: JobAdapter.HomeViewHolder, position: Int) {
        val post = list[position]

        holder.binding.tvTitle.text = post.title
        holder.binding.tvDescription.text = post.description
        holder.binding.ivIcon.setImageResource(post.image)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}
