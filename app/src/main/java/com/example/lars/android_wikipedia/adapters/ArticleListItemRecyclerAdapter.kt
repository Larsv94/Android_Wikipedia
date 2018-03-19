package com.example.lars.android_wikipedia.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.lars.android_wikipedia.R
import com.example.lars.android_wikipedia.holders.CardHolder
import com.example.lars.android_wikipedia.holders.ListItemHolder
import com.example.lars.android_wikipedia.models.WikiPage

/**
 * Created by lars on 16-03-2018.
 */
class ArticleListItemRecyclerAdapter() : RecyclerView.Adapter<ListItemHolder>()
{
    val currentResults: ArrayList<WikiPage> = ArrayList<WikiPage>()
    override fun onBindViewHolder(holder: ListItemHolder?, position: Int) {
        var page =currentResults[position]
        holder?.updateWithPage(page)
    }

    override fun getItemCount(): Int {
        return currentResults.size //temporary
    }



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListItemHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item, parent, false)
        return ListItemHolder(cardItem)
    }

}