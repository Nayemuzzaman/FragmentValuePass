package com.waltonbd.fragmentcom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;
import java.util.Map;


@SuppressLint("ValidFragment")
public class TakeValueFragment extends Fragment {

    private EditText etOne;
    private EditText etTwo;
    String operation;
    String tak;
    private Context context;
    MainActivity mainActivity;
    TakeTwoValueInterface takeTwoValueInterface;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof TakeTwoValueInterface) {
            takeTwoValueInterface = (TakeTwoValueInterface) context;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_frag_one, container, false);
        etOne = v.findViewById(R.id.etValueOne);
        etTwo = v.findViewById(R.id.etValueTwo);

        Button btnSubmit = v.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int messageOne = (int) Double.parseDouble(etOne.getText().toString());
                int messageTwo = (int) Double.parseDouble(etTwo.getText().toString());
                takeTwoValueInterface.taketwoValue(messageOne, messageTwo);

            }
        });
        return v;
    }


}
