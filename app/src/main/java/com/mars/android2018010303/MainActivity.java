package com.mars.android2018010303;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button bt;
    SeekBar sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
        sb = (SeekBar)findViewById(R.id.seekBar);
        bt = (Button)findViewById(R.id.button) ;

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override//i就是他的進度數值
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv.setText(String.valueOf(i));//放到textview裡面
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //按鈕後顯示進度數值
        bt.setOnClickListener(new View.OnClickListener() {
            @Override//用getpress()來取進度
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,String.valueOf(sb.getProgress()),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
