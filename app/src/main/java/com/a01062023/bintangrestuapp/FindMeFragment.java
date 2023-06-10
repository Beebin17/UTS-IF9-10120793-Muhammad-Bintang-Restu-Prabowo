package com.a01062023.bintangrestuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FindMeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FindMeFragment extends Fragment {
    WebView webview;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FindMeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FindMeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FindMeFragment newInstance(String param1, String param2) {
        FindMeFragment fragment = new FindMeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_find_me, container, false);
        webview = (WebView) v.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.google.com/maps/place/Jl.+Jurang+No.91,+Pasteur,+Kec.+Sukajadi,+Kota+Bandung,+Jawa+Barat+40161/@-6.8852285,107.5984664,17z");
        return v;
    }
}