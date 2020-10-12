package ru.ramozjikevic.mymap.ui.component.first

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_characters.view.*
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.data.remote.models.CharactersRes

class FirstAdapter : PagedListAdapter<CharactersRes, CharactersViewHolder>(DiffCallbacks()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_characters, parent, false)
        return CharactersViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}


class CharactersViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bind(item: CharactersRes?) {
        item?.let {
            containerView.name.text = item.name
            containerView.gender.text = item.gender
            containerView.father.text = item.father
            containerView.mother.text = item.mother
        }
    }
}

class DiffCallbacks : DiffUtil.ItemCallback<CharactersRes>() {
    override fun areItemsTheSame(oldItem: CharactersRes, newItem: CharactersRes) =
        oldItem.url == newItem.url

    override fun areContentsTheSame(oldItem: CharactersRes, newItem: CharactersRes) =
        oldItem == newItem
}