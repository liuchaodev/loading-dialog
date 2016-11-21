package com.liuchao.sun;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

import com.liuchao.sun.R;

public abstract class LCProgressBaseDialog extends Dialog {

    protected LCProgressBaseDialog(Context context) {
        super(context, R.style.ACPLDialog);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    protected LCProgressBaseDialog(Context context, int theme) {
        super(context, theme);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    protected int getMinimumSideOfScreen(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point size = new Point();
            display.getSize(size);
            return Math.min(size.x, size.y);
        } else {
            return Math.min(display.getWidth(), display.getHeight());
        }
    }

}
