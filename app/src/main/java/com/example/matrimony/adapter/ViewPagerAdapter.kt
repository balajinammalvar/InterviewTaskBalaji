package com.example.matrimony.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.matrimony.R
import com.example.matrimony.model.ProfileImageModel
import java.util.Objects

class ViewPagerAdapter(val context: Context) : PagerAdapter() {

    var imageList: List<ProfileImageModel>? = null

    fun setImages(imageList: List<ProfileImageModel>) {
        this.imageList = imageList
        notifyDataSetChanged()
    }

    override fun getCount(): Int {
        return imageList?.size ?: 0
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ConstraintLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val itemView: View = mLayoutInflater.inflate(R.layout.view_pager_adapter, container, false)

        val imageView: ImageView = itemView.findViewById<View>(R.id.idIVImage) as ImageView

        imageList?.get(position)?.profileName?.let { imageView.setImageResource(it) }

        Objects.requireNonNull(container).addView(itemView)

        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }

}