package com.example.a3lamya.azkar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   public int counter =0;
    String x;
   TextView Text_view_counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text_view_counter=(TextView)findViewById(R.id.text_view_counter);
       counter();

    }

private  void  counter(){

    Text_view_counter.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (counter<33){
                counter=counter+1;
                x=String.valueOf(counter);

                Text_view_counter.setText("     "+x);

            }
            else {

                counter=0;
                x=String.valueOf(counter);
                Text_view_counter.setText("Again ;)");

            }


        }
    });


}



    }

