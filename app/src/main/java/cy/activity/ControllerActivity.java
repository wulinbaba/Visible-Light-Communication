package cy.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.skyworthclub.visible_light_communication.R;

/*
* 这个activity是用于读取前6个商城
* 使用这个activity的时候，传一个"key_number"（整数型）给这个controller
*  0->维多利广场 1->广百百货  2->天河城  3->正佳广场  4->万菱汇  5->太古汇
* **/

public class ControllerActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int position = intent.getIntExtra("key_number", -1);
        String title = intent.getStringExtra("name");
        ActionBar actionBar = getSupportActionBar();
        switch (position){
            case 0:
                setContentView(R.layout.weiduoli_layout);
                imageView = (ImageView) findViewById(R.id.iv_wdl);
                imageView.setImageLevel(2);
                actionBar.setTitle(title);
                break;
            case 1:
                setContentView(R.layout.guangbaibaihuo_layout);
                imageView = (ImageView) findViewById(R.id.iv_gbbh);
                imageView.setImageLevel(2);
                actionBar.setTitle(title);
                break;
            case 2:
                setContentView(R.layout.tianhecheng_layout);
                imageView = (ImageView) findViewById(R.id.iv_thc);
                imageView.setImageLevel(2);
                actionBar.setTitle(title);
                break;
            case 3:
                setContentView(R.layout.zhengjiaguangchang_layout);
                imageView = (ImageView) findViewById(R.id.iv_zjgc);
                imageView.setImageLevel(2);
                actionBar.setTitle(title);
                break;
            case 4:
                setContentView(R.layout.wanlinghui_layout);
                imageView = (ImageView) findViewById(R.id.iv_wlh);
                imageView.setImageLevel(2);
                actionBar.setTitle(title);
                break;
            case 5:
                setContentView(R.layout.taiguhui_layout);
                imageView = (ImageView) findViewById(R.id.iv_tgh);
                imageView.setImageLevel(2);
                actionBar.setTitle(title);
                break;
            default:
        }
    }

    public void F1(View v){
        imageView.setImageLevel(2);
    }

    public void F2(View v){
        imageView.setImageLevel(4);
    }

    public void F3(View v){
        imageView.setImageLevel(6);
    }

    public void F4(View v){
        imageView.setImageLevel(8);
    }

    public void F5(View v){
        imageView.setImageLevel(10);
    }

    public void F6(View v){
        imageView.setImageLevel(12);
    }

    public void F7(View v){
        imageView.setImageLevel(14);
    }

    public void F8(View v){
        imageView.setImageLevel(16);
    }
}
