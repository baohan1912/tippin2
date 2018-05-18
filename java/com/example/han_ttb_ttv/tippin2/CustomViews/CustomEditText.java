package com.example.han_ttb_ttv.tippin2.CustomViews;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.Animation;

import com.example.han_ttb_ttv.tippin2.R;

/**
 * Created by han-ttb-ttv on 5/18/2018.
 */

public class CustomEditText extends android.support.v7.widget.AppCompatEditText {

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //Call when added in xml
    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //Called in runtime
    public CustomEditText(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.d("WSize: ", String.valueOf(MeasureSpec.getSize(widthMeasureSpec)));
        Log.d("HSize: ", String.valueOf(MeasureSpec.getSize(heightMeasureSpec)));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    public void setAnimation(Animation animation) {
        animation.setBackgroundColor(getResources().getColor(R.color.all_colorWhite,null));
        animation.setDuration(2500);
        animation.setFillAfter(true);
        animation.setFillEnabled(true);
        super.setAnimation(animation);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

}
