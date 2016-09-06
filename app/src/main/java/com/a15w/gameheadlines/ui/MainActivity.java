package com.a15w.gameheadlines.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.a15w.gameheadlines.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private long exitTime;
    @BindView(R.id.activity_main_radioGroup)
    RadioGroup radioGroup;
    @BindView(R.id.activity_main_rb_news)
    RadioButton newsRb;
    @BindView(R.id.activity_main_rb_video)
    RadioButton videoRb;
    @BindView(R.id.activity_main_rb_contest)
    RadioButton contestRb;
    @BindView(R.id.activity_main_rb_bid)
    RadioButton bidRb;
    @BindView(R.id.activity_main_rb_mine)
    RadioButton mineRb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.activity_main_rb_news:
                        break;
                    case R.id.activity_main_rb_video:
                        break;
                    case R.id.activity_main_rb_contest:
                        break;
                    case R.id.activity_main_rb_bid:
                        break;
                    case R.id.activity_main_rb_mine:
                        break;
                    default:
                        break;
                }
            }
        });
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            if (System.currentTimeMillis() - exitTime > 3000){
                Toast.makeText(MainActivity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            }
            else {
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
