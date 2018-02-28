package ru.kpfu.itis.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv_test);

        textView.setOnClickListener(v -> {
            Toast.makeText(this, "I'm text viewhhhhhhhhhhhhhhhhhh j j jjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjj", Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        if (ev.getAction() == MotionEvent.ACTION_POINTER_DOWN) {
            flag++;
            Toast.makeText(this, Integer.toString(flag), Toast.LENGTH_SHORT).show();
        }

        return false;
    }
}
