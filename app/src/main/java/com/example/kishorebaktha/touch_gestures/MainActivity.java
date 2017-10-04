package com.example.kishorebaktha.touch_gestures;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
  TextView t1;
    private GestureDetectorCompat GestureDetect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.t1);
        GestureDetect=new GestureDetectorCompat(this,this);
        GestureDetect.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        GestureDetect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        t1.setText("onDown"+e.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        t1.setText("onShowPress"+e.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        t1.setText("onSingleTapUp"+e.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        t1.setText("onScroll"+ e1.toString()+e1.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        t1.setText("onLongPress"+ e.toString());
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        t1.setText("onFling"+ e1.toString()+e2.toString());
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        t1.setText("onSingleTapConfirmed"+ e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        t1.setText("onDoubleTap"+ e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        t1.setText("onDoubleTapEvent"+ e.toString());
        return false;
    }
}
