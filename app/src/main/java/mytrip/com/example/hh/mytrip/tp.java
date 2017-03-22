package mytrip.com.example.hh.mytrip;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tp extends AppCompatActivity {

    Button take,photo,add;
    public static final int TAKE_PHOTO=1;
    public static final int CHOOSE_PHOTO=2;
    private ImageView picture;
    private Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
        picture=(ImageView) findViewById(R.id.pic);
        take=(Button) findViewById(R.id.take);
        picture=(ImageView) findViewById(R.id.pic);
        take.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                File outputImage=new File(getExternalCacheDir(),"photo.jpg");
                try{
                    if(outputImage.exists()){
                        outputImage.delete();
                    }
                    outputImage.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
                if(Build.VERSION.SDK_INT>=24){
                    imageUri= FileProvider.getUriForFile(tp.this,"com.example.tp.flieprovider",outputImage);
                }else{
                    imageUri=Uri.fromFile(outputImage);
                }
                Intent inten1=new Intent("android.media.action.IMAGE_CAPTURE");
                inten1.putExtra(MediaStore.EXTRA_OUTPUT,imageUri);
                startActivityForResult(inten1,TAKE_PHOTO);
            }
        });
        photo=(Button) findViewById(R.id.photo);
        photo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
              /*  if(ContextCompat.checkSelfPermission(tp.this, Manifest.permission.WRITE_EXTERNAL_STORAGE!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(tp.this,new String[]{Manifest.permission.WRITE_EXETERNAL_STORAGE},1);
                }*/
            }
        });
        add=(Button) findViewById(R.id.add);

    }
    @Override
    protected  void onActivityResult(int requestCode,int resultCode,Intent data){
        switch(requestCode){
            case TAKE_PHOTO:
                if (resultCode==RESULT_OK){
                    try{
                        Bitmap bitmap= BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
                        picture.setImageBitmap(bitmap);
                    }catch(FileNotFoundException e){
                        e.printStackTrace();
                    }
                }
                break;
            default:
                break;
        }
    }
}
