package com.example.karan.sellingapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MyMart_Page extends AppCompatActivity {
  CardView manage_order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_mart__page);
        manage_order=findViewById(R.id.manage_order);
       manage_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MyMart_Page.this, Manage_Order.class);
                startActivity(intent);

            }
        });


    }
}
