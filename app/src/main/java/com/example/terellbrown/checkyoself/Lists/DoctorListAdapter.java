package com.example.terellbrown.checkyoself.Lists;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.terellbrown.checkyoself.API.Provider;
import com.example.terellbrown.checkyoself.R;

import java.util.List;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.DoctorListViewHolder> {



    public DoctorListAdapter(List<Provider>)
    @Override
    public DoctorListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor_list, parent, false);

        return new DoctorListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DoctorListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DoctorListViewHolder extends RecyclerView.ViewHolder {

    public DoctorListViewHolder(View itemView) {
        super(itemView);
    }

        public void bind(Provider provider) {

        }
}
}
