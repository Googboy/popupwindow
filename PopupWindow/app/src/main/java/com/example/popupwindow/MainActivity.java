package com.example.popupwindow;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_show = findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupWindow();
            }
        });
    }

    private void showPopupWindow() {
        View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.popuplayout,null);
        popupWindow = new PopupWindow(contentView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT,true);
        popupWindow.setContentView(contentView);
//        popupWindow = new PopupWindow(contentView);
//        popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
//        popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView tv1 = contentView.findViewById(R.id.pop_computer);
        TextView tv2 = contentView.findViewById(R.id.pop_financial);
        TextView tv3 = contentView.findViewById(R.id.pop_manage);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        //显示popupwindow
        View rootview = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_main,null);
        popupWindow.showAtLocation(rootview, Gravity.BOTTOM,0,0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pop_computer:
                Toast.makeText(this,"click computer",Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
                break;
            case R.id.pop_financial:
                Toast.makeText(this,"click financial",Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
                break;
            case R.id.pop_manage:
                Toast.makeText(this,"click computer",Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
                break;
        }
    }
}
