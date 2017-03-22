package mytrip.com.example.hh.mytrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button map,record,trace,first,sec,thr,four;
    private static int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得手机宽度
        DisplayMetrics metric = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metric);
        int width = metric.widthPixels;     // 屏幕宽度（像素）
        int height = metric.heightPixels;   // 屏幕高度（像素）
        float density = metric.density;      // 屏幕密度（0.75 / 1.0 / 1.5）
        int densityDpi = metric.densityDpi;  // 屏幕密度DPI（120 / 160 / 240）
        //
        record=(Button) findViewById(R.id.record);
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, record.class);
                startActivity(intent);
            }
        });
        map=(Button) findViewById(R.id.map);
        trace=(Button) findViewById(R.id.trace);

        first=(Button) findViewById(R.id.first);
        first.getBackground().setAlpha(254);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    sec.getBackground().setAlpha(0);
                    thr.getBackground().setAlpha(0);
                    four.getBackground().setAlpha(0);
                    flag = 0;
                } else {
                    sec.getBackground().setAlpha(255);
                    thr.getBackground().setAlpha(255);
                    four.getBackground().setAlpha(255);
                    flag = 1;
                }
            }
        });
            sec=(Button) findViewById(R.id.top);
            sec.getBackground().setAlpha(0);
            thr=(Button) findViewById(R.id.left);
            thr.getBackground().setAlpha(0);
            four=(Button) findViewById(R.id.right);
            four.getBackground().setAlpha(0);
            four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten1 = new Intent(MainActivity.this, tp.class);
                startActivity(inten1);
            }
        });
        }
    }
