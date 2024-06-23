package com.example.matrimony.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.matrimony.databinding.GestureProfileAdapterBinding
import com.example.matrimony.model.MatrimonyData
import com.example.matrimony.utilis.CommonListener

class GestureRecyclerViewAdapter(private val profileInterestInterface: CommonListener.ProfileInterestInterface) :
    RecyclerView.Adapter<GestureRecyclerViewAdapter.GestureProfileViewHolder>() {

    private var gestureProfileAdapterBinding: GestureProfileAdapterBinding? = null
    private var matrimonyDetails: List<MatrimonyData>? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GestureProfileViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        gestureProfileAdapterBinding = GestureProfileAdapterBinding.inflate(layoutInflater)
        return GestureProfileViewHolder(gestureProfileAdapterBinding!!)

    }

    override fun onBindViewHolder(holder: GestureProfileViewHolder, position: Int) {
        holder.bind(matrimonyDetails?.get(position), profileInterestInterface)
    }
    override fun getItemCount(): Int {
        return matrimonyDetails?.size ?: 0
    }
    fun setData(list: List<MatrimonyData>) {
        this.matrimonyDetails = list
        notifyDataSetChanged()
    }

    class GestureProfileViewHolder(private val gestureProfileAdapterBinding: GestureProfileAdapterBinding) :
        RecyclerView.ViewHolder(gestureProfileAdapterBinding.root) {
        fun bind(
            profileData: MatrimonyData?,
            gestureClickListener: CommonListener.ProfileInterestInterface
        ) {
            gestureProfileAdapterBinding.gestureProfileViewModel = profileData
            profileData?.profilePic?.let {
                gestureProfileAdapterBinding.ivProfile.setImageResource(
                    it
                )
            }
            gestureProfileAdapterBinding.clickListener = gestureClickListener
            gestureProfileAdapterBinding.position = adapterPosition
        }
    }
}