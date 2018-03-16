package com.example.lars.android_wikipedia.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.lars.android_wikipedia.R
import com.example.lars.android_wikipedia.holders.CardHolder
import com.example.lars.android_wikipedia.holders.ListItemHolder

/**
 * Created by lars on 16-03-2018.
 */
class ArticleListItemRecyclerAdapter() : RecyclerView.Adapter<ListItemHolder>()
{
    override fun onBindViewHolder(holder: ListItemHolder?, position: Int) {
       //todo
    }

    override fun getItemCount(): Int {
        return 15 //temporary
    }



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListItemHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item, parent, false)
        return ListItemHolder(cardItem)
    }

}