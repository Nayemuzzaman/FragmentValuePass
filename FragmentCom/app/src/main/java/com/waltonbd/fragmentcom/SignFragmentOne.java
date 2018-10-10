package com.waltonbd.fragmentcom;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SignFragmentOne extends Fragment implements View.OnClickListener {
    Button btnAdd, btnSub, btnMul, btnDiv, btnSum;

    OperatrionInterface operatrionInterface;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OperatrionInterface) {
            operatrionInterface = (OperatrionInterface) context;
        }
    }
    public SignFragmentOne() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_two, container, false);
        btnAdd = view.findViewById(R.id.btnAdd);
        btnSub = view.findViewById(R.id.btnSub);
        btnMul = view.findViewById(R.id.btnMul);
        btnDiv = view.findViewById(R.id.btnDiv);
        btnSum = view.findViewById(R.id.btnSubmit);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAdd:
                operatrionInterface.TakeOperation("add");
                break;

            case R.id.btnSub:
                operatrionInterface.TakeOperation("sub");
                break;

            case R.id.btnMul:
                operatrionInterface.TakeOperation("mul");
                break;

            case R.id.btnDiv:
                operatrionInterface.TakeOperation("div");
                break;

        }



    }

}
