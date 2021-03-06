package com.rkddlsgur983.kakaopay.view.main.adapter

import android.net.Uri
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.rkddlsgur983.kakaopay.R

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("bind_thumbnail")
    fun setThumbnailUrl(view: ImageView, url: String?) {

        if (url == null) {
            Glide.with(view.context).load(Uri.EMPTY).into(view)
        } else {
            if (url.isEmpty()) {
                Glide.with(view.context).load(Uri.EMPTY).into(view)
            } else {
                Glide.with(view.context)
                    .load(url)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .skipMemoryCache(true)
                    .thumbnail(0.1f)
                    .placeholder(R.drawable.ic_none)
                    .into(view)
            }
        }
    }

    @JvmStatic
    @BindingAdapter("bind_image")
    fun setImageUrl(view: ImageView, url: String?) {

        if (url == null) {
            Glide.with(view.context).load(Uri.EMPTY).into(view)
        } else {
            if (url.isEmpty()) {
                Glide.with(view.context).load(Uri.EMPTY).into(view)
            } else {
                Glide.with(view.context)
                    .load(url)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .skipMemoryCache(true)
                    .placeholder(R.drawable.ic_none)
                    .into(view)
            }
        }
    }
}