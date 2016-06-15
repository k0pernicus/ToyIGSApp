package com.example.antonin.jouetigs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            IGSClass igs_object = new IGSClass();
            long beg = System.currentTimeMillis();
            int new_int = 0;
            for(int i=0; i<5000000; i++) {
                igs_object.a = increment(new_int);
                new_int = igs_object.a;
            }
            Log.d("EXECUTION_TIME", Long.toString(System.currentTimeMillis() - beg));
            finish();
            }
        });
    }

    static int increment(int my_integer) {
        return my_integer += my_integer;
    }

}
