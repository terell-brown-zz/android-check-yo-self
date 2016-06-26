package com.example.terellbrown.checkyoself.Lists;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.terellbrown.checkyoself.API.NewProvider;
import com.example.terellbrown.checkyoself.DataStore;
import com.example.terellbrown.checkyoself.DoctorsInfoActivity;
import com.example.terellbrown.checkyoself.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.DoctorListViewHolder> {

    public Context  context;
    private final List<NewProvider.Datum> mProviders;

    public DoctorListAdapter(List<NewProvider.Datum> providers) {
        this.mProviders = providers;
    }
    @Override
    public DoctorListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor_list, parent, false);
        context = parent.getContext();
        return new DoctorListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DoctorListViewHolder holder, int position) {
        holder.bind(mProviders.get(position));
    }

    @Override
    public int getItemCount() {
        return mProviders.size();
    }

    public class DoctorListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        LinearLayout cv;
        TextView tvPrice;
        TextView tvSpeciality;
        TextView tvDistanceAway;
        TextView tvName;
        String npi;

        public DoctorListViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvSpeciality = (TextView) itemView.findViewById(R.id.tvSpecialty);
            tvDistanceAway = (TextView) itemView.findViewById(R.id.tvDistanceAway);
            tvPrice = (TextView) itemView.findViewById(R.id.tvPrice);
            cv = (LinearLayout) itemView.findViewById(R.id.card_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    toDoctorInfoActivity();
                }
            });
        }

        public void bind(NewProvider.Datum provider) {
            tvName.setText("Dr. " + provider.provider.first_name + " " + provider.provider.last_name);
            tvPrice.setText("$10000000");
            tvDistanceAway.setText(provider.distance + " miles away");
            tvSpeciality.setText(provider.provider.specialty_primary.get(0));
            npi = provider.provider.npi;
        }

        @Override
        public void onClick(View v) {
            //Intent intent = new Intent(this);
            toDoctorInfoActivity();
        }


        private void toDoctorInfoActivity() {
            Intent intent = new Intent(context, DoctorsInfoActivity.class);
            intent.putExtra("Provider", npi);
            intent.putExtra("AuthToken", DataStore.init(context).access_token().get());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}
