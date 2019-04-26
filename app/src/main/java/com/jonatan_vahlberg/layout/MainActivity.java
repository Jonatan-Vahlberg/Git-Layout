package com.jonatan_vahlberg.layout;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  Button load_table, load_constraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        load_table = findViewById(R.id.load_table);
        load_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.table_layout);

                Button btn = findViewById(R.id.return_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.main_menu);
                    }
                });

            }
        });


        load_constraint = findViewById(R.id.load_constraint);
        load_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.constraint_layout);
                ConstraintLayout layout = findViewById(R.id.constraint_layout);

                TextView tV = layout.findViewById(R.id.return_text);
                tV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.main_menu);
                    }
                });
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "onResume: ");
    }


}
