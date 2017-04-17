# loading-dialog
加载等待对话框，loading，loading＋文字，自定义等

package com.liuchao.sample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.liuchao.sun.LCProgressConstant;
import com.liuchao.sun.LCProgressCustom;
import com.liuchao.sun.LCProgressFlower;
import com.liuchao.sun.LCProgressPie;

import cc.cloudist.acpsample.R;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);
        findViewById(R.id.button_3).setOnClickListener(this);
        findViewById(R.id.button_4).setOnClickListener(this);
        findViewById(R.id.button_5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1: {
                LCProgressFlower dialog = new LCProgressFlower.Builder(this, R.style.NonDimACProgressDialog)
                        .direction(LCProgressConstant.DIRECT_CLOCKWISE)
                        .themeColor(Color.WHITE)
                        .fadeColor(Color.DKGRAY).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_2: {
                LCProgressFlower dialog = new LCProgressFlower.Builder(this)
                        .direction(LCProgressConstant.DIRECT_ANTI_CLOCKWISE)
                        .themeColor(Color.GREEN)
                        .fadeColor(Color.RED).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_3: {
                LCProgressFlower dialog = new LCProgressFlower.Builder(this)
                        .textSize(30)
                        .textMarginTop(2)
                        .text("processing")
                        .build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_4: {
                LCProgressPie dialog = new LCProgressPie.Builder(this).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_5: {
                LCProgressCustom dialog = new LCProgressCustom.Builder(this)
                        .useImages(R.drawable.p0, R.drawable.p1, R.drawable.p2, R.drawable.p3).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
        }
    }
}

使用方法非常简单，上面的onclick方法已经介绍的很清楚，可以下载demo跑起来看看效果。
