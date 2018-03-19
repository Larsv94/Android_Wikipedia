package com.example.lars.android_wikipedia.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.lars.android_wikipedia.R
import com.example.lars.android_wikipedia.models.WikiPage
import com.squareup.picasso.Picasso

/**
 * Created by lars on 16-03-2018.
 */
class ListItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById<ImageView>(R.id.result_icon)
    private val titleTextView: TextView = itemView.findViewById<TextView>(R.id.result_title)

    private var currentPage: WikiPage?=null

    fun updateWithPage(page: WikiPage){
        currentPage = page;

        titleTextView.text=page.title
        if (page.thumbnail!=null){
            Picasso.with(itemView.context).load(page.thumbnail!!.source).into(articleImageView)
        }
    }
}