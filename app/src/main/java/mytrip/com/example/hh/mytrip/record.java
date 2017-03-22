package mytrip.com.example.hh.mytrip;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class record extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
    String a11="你还没写东西呢，快去写吧!";
    String a1="你还没写东西呢，快去写吧!";
    String a2="你还没写东西呢，快去写吧!";
    String a3="你还没写东西呢，快去写吧!";
    String a4="你还没写东西呢，快去写吧!";
    String a5="你还没写东西呢，快去写吧!";
    String a6="你还没写东西呢，快去写吧!";
    String a7="你还没写东西呢，快去写吧!";
    String a8="你还没写东西呢，快去写吧!";
    String a10="你还没写东西呢，快去写吧!";
    String a9="你还没写东西呢，快去写吧!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        button1=(Button) findViewById(R.id.button1);
        button1.getBackground().setAlpha(100);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button1:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a1);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button2=(Button) findViewById(R.id.button2);
        button2.getBackground().setAlpha(100);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button2:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a2);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button3=(Button) findViewById(R.id.button3);
        button3.getBackground().setAlpha(100);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button3:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a3);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button4=(Button) findViewById(R.id.button4);
        button4.getBackground().setAlpha(100);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button4:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a4);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button5=(Button) findViewById(R.id.button5);
        button5.getBackground().setAlpha(100);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button5:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a5);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button6=(Button) findViewById(R.id.button6);
        button6.getBackground().setAlpha(100);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button6:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a6);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button7=(Button) findViewById(R.id.button7);
        button7.getBackground().setAlpha(100);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button7:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a7);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button8=(Button) findViewById(R.id.button8);
        button8.getBackground().setAlpha(100);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button8:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a8);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button9=(Button) findViewById(R.id.button9);
        button9.getBackground().setAlpha(100);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button9:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a9);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button10=(Button) findViewById(R.id.button10);
        button10.getBackground().setAlpha(100);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button10:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a10);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button11=(Button) findViewById(R.id.button11);
        button11.getBackground().setAlpha(100);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button11:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage(a11);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        button12=(Button) findViewById(R.id.info);
        button12.getBackground().setAlpha(100);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.info:
                        AlertDialog.Builder dialog=new AlertDialog.Builder(record.this);
                        dialog.setTitle("我的沉思");
                        dialog.setMessage("最多只能存11条哦！深思熟虑的话总是很少的！");
                        dialog.setCancelable(true);
                        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
