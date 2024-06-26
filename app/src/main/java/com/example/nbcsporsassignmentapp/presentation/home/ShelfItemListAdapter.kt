package com.example.nbcsporsassignmentapp.presentation.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nbcsporsassignmentapp.R
import com.example.nbcsporsassignmentapp.domain.models.ShelfItem

class ShelfItemListAdapter(private val items: List<ShelfItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val TYPE_LIVE = 0
        private const val TYPE_EPISODE = 1
        private const val TYPE_SHOW = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_LIVE -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_live, parent, false)
                LiveViewHolder(view)
            }

            TYPE_EPISODE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_episode, parent, false)
                EpisodeViewHolder(view)
            }

            TYPE_SHOW -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_show, parent, false)
                ShowViewHolder(view)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is LiveViewHolder -> {
                holder.tvLiveTitle.text = item.title
                holder.tvLiveSubTitle.text = item.subtitle
                holder.tvLiveTagLine.text = item.tagline
                if (item.image.isNotEmpty()) {
                    Glide.with(holder.itemView.context)
                        .load(item.image)
                        .into(holder.ivLiveImage)
                }
            }

            is EpisodeViewHolder -> {
                holder.tvEpisodeTitle.text = item.title
                holder.tvEpisodeSubTitle.text = item.subtitle
                holder.tvEpisodeBadge.isVisible = !item.labelBadge.isNullOrEmpty()
                holder.tvEpisodeBadge.text = item.labelBadge
                if (item.image.isNotEmpty()) {
                    Glide.with(holder.itemView.context)
                        .load(item.image)
                        .into(holder.ivEpisodeImage)
                }
            }

            is ShowViewHolder -> {
                holder.tvShowTitle.text = item.title
                if (item.image.isNotEmpty()) {
                    Glide.with(holder.itemView.context)
                        .load(item.image)
                        .into(holder.ivShowImage)
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position].type) {
            "Live" -> TYPE_LIVE
            "Episode" -> TYPE_EPISODE
            "Show" -> TYPE_SHOW
            else -> throw IllegalArgumentException("Invalid type of data $position")
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class LiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivLiveImage: ImageView = itemView.findViewById(R.id.ivLiveImage)
        val tvLiveTitle: TextView = itemView.findViewById(R.id.tvLiveTitle)
        val tvLiveSubTitle: TextView = itemView.findViewById(R.id.tvLiveSubTitle)
        val tvLiveTagLine: TextView = itemView.findViewById(R.id.tvLiveTagLine)
    }

    inner class EpisodeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivEpisodeImage: ImageView = itemView.findViewById(R.id.ivEpisodeImage)
        val tvEpisodeTitle: TextView = itemView.findViewById(R.id.tvEpisodeTitle)
        val tvEpisodeSubTitle: TextView = itemView.findViewById(R.id.tvEpisodeSubTitle)
        val tvEpisodeBadge: TextView = itemView.findViewById(R.id.tvEpisodeBadge)
    }

    inner class ShowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivShowImage: ImageView = itemView.findViewById(R.id.ivShowImage)
        val tvShowTitle: TextView = itemView.findViewById(R.id.tvShowTitle)
    }
}