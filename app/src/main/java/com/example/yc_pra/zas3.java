package com.example.yc_pra;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class zas3 extends Fragment {

    private ImageView mImageView;
    private int mImageId;

    public zas3() {
    }

    public static zas3 newInstance(int imageId) {
        zas3 fragment = new zas3();
        Bundle args = new Bundle();
        args.putInt("image_id", imageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImageId = getArguments().getInt("image_id");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.zas3, container, false);
        mImageView = view.findViewById(R.id.imageFrag3);
        mImageView.setImageResource(mImageId);
        return view;
    }
}