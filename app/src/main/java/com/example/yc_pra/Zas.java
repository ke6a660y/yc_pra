package com.example.yc_pra;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class Zas extends Fragment {

    private ImageView mImageView;
    private int mImageId;


    public Zas() {

    }

    public static Zas newInstance(int imageId) {
        Zas fragment = new Zas();
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
        View view = inflater.inflate(R.layout.zas1, container, false);
        mImageView = view.findViewById(R.id.imageFrag1);
        mImageView.setImageResource(mImageId);
        return view;
    }
}
