package com.reactnativetutorial.MapView;

import android.content.Context;
import android.view.View;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/**
 * Created by danielleerickson on 2/9/16.
 */
public class MyCustomView extends View{
    private String source;
    private float borderRadius;
    private ScalingUtils.ScaleType scaleType;

    public MyCustomView(Context context) {
        super(context);
    }

    public void onReceiveNativeEvent() {
        WritableMap event = Arguments.createMap();
        event.putString("message", "MyMessage");
        ReactContext reactContext = (ReactContext)getContext();
        reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                "topChange",
                event);
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setBorderRadius(float borderRadius) {
        this.borderRadius = borderRadius;
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        this.scaleType = scaleType;
    }
}
