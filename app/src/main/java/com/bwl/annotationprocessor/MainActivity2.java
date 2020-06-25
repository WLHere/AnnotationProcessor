package com.bwl.annotationprocessor;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bwl.libannotation.BindView;

/**
 * Created by baiwenlong on 2020/6/24
 */
public class MainActivity2 extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
