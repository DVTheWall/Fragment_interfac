package com.example.peacock.demo_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by peacock on 10/10/17.
 */

public class Fragment_One extends Fragment implements View.OnClickListener {

    private static int i = 1;
    private Button mButton; //Add at the top of the fragment
    // declear Inteface Instance
    private OnFragmentInteractionListener mListener;

  /*  @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        //This also working instead of onCreate Method
            mListener = (OnFragmentInteractionListener) activity;

    }*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Only Initalize Instance of Interface
        mListener = (OnFragmentInteractionListener) getContext();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = null;
        view = inflater.inflate(R.layout.fragment_one, container, false);
        mButton = (Button) view.findViewById(R.id.frgment_button);
        mButton.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View view) {

        // Instance through get inteface Method
        mListener.onFragmentInteraction(++i);

    }

    public interface OnFragmentInteractionListener {

        // TODO: Update argument type and name
        void onFragmentInteraction(int i);

    }

}
