package example.com.testapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import example.com.testapplication.R;

/**
 * Created by Kumar M on 6/17/2016.
 */
public class FragmentB extends Fragment
{
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return view = inflater.inflate(R.layout.fragment_b,container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        FragmentC fragmentC = new FragmentC();
        FragmentTransaction mTransaction = getChildFragmentManager().beginTransaction();
        mTransaction.replace(R.id.xLinLayFragmentContentC, fragmentC).commit();
    }
}
