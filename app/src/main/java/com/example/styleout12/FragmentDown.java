package com.example.styleout12;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentDown extends Fragment {

    View dView;
    private RecyclerView myRecyclerViewDown;
    private List<Down> lstDown;

    public FragmentDown() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        dView = inflater.inflate( R.layout.down_fragment, container, false );
        myRecyclerViewDown = (RecyclerView) dView.findViewById( R.id.down_recyclerview );
        RecyclerViewAdapterDown recyclerViewAdapterDown = new RecyclerViewAdapterDown( getContext(), lstDown );
        myRecyclerViewDown.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        myRecyclerViewDown.setAdapter( recyclerViewAdapterDown );
        return dView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        lstDown = new ArrayList<>();
        lstDown.add( new Down( R.drawable.pantaloni_tuta_regular ) );
        lstDown.add( new Down( R.drawable.pantaloni_tuta_slim ) );
        lstDown.add( new Down( R.drawable.pantaloni_sigaretta_tasconi ) );
        lstDown.add( new Down( R.drawable.pantaloni_vitaalta_regular ) );
        lstDown.add( new Down( R.drawable.pantaloni_vitaalta_sigaretta ) );
        lstDown.add( new Down( R.drawable.pantaloni_vitaalta_zampa ) );
        lstDown.add( new Down( R.drawable.tubino ) );
    }
}