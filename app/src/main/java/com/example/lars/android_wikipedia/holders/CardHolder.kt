package com.example.lars.android_wikipedia.holders

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.lars.android_wikipedia.R
import kotlinx.android.synthetic.main.article_card_item.view.*
import org.w3c.dom.Text

/**
 * Created by lars on 16-03-2018.
 */
class CardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById<ImageView>(R.id.article_image)
    private val titleTextView: TextView = itemView.findViewById<TextView>(R.id.article_title)
}