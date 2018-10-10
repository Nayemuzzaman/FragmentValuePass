package com.waltonbd.fragmentcom;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OperatrionInterface, TakeTwoValueInterface {


    public String takeOperation;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        SignFragmentOne signFragmentOne = new SignFragmentOne();
        loadFragment(signFragmentOne);


    }

    void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fl_one, fragment).commit();
    }


    @Override
    public void TakeOperation(String operation) {
        Toast.makeText(this, "ok man " + operation, Toast.LENGTH_SHORT).show();
        takeOperation = operation;
        Log.e("taag", "value " + takeOperation);
        TakeValueFragment takeValueFragment = new TakeValueFragment();
        loadFragment(takeValueFragment);


    }

    @Override
    public void taketwoValue(int a, int b) {
        int sum = 0;
        switch (takeOperation) {
            case "add":
                sum= a + b;
                break;
            case "sub":
                sum = a-b;
                break;
            case "mul":
                sum = a*b;
                break;
            case "div":
                sum = a/b;
                break;

            default:
                break;
        }
        tvResult.setText("" + sum);

    }
}
