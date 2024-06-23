package com.example.matrimony.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.matrimony.databinding.HomeProfileAdapterBinding
import com.example.matrimony.model.MatrimonyData
import com.example.matrimony.utilis.CommonListener

class DashBoardAdapter(
    private val profileInterestInterface: CommonListener.ProfileInterestInterface
) :
    RecyclerView.Adapter<DashBoardAdapter.DashBoardViewHolder>() {

    private var homeProfileAdapterBinding: HomeProfileAdapterBinding? = null
    private var matrimonyDetails: List<MatrimonyData>? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashBoardViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        homeProfileAdapterBinding = HomeProfileAdapterBinding.inflate(layoutInflater)
        return DashBoardViewHolder(homeProfileAdapterBinding!!)

    }

    override fun onBindViewHolder(holder: DashBoardViewHolder, position: Int) {
        holder.bind(matrimonyDetails?.get(position), profileInterestInterface)
    }

    override fun getItemCount(): Int {
        return matrimonyDetails?.size ?: 0
    }

    fun setData(list: List<MatrimonyData>) {
        this.matrimonyDetails = list
        notifyDataSetChanged()
    }

    class DashBoardViewHolder(private val dashBoardAdapterBinding: HomeProfileAdapterBinding) :
        RecyclerView.ViewHolder(dashBoardAdapterBinding.root) {
        fun bind(
            profileData: MatrimonyData?,
            profileInterestInterface: CommonListener.ProfileInterestInterface
        ) {
            dashBoardAdapterBinding.dashboardViewModel = profileData
            profileData?.profilePic?.let { dashBoardAdapterBinding.ivProfile.setImageResource(it) }
            dashBoardAdapterBinding.clickListener = profileInterestInterface
            dashBoardAdapterBinding.position = adapterPosition
        }
    }
}