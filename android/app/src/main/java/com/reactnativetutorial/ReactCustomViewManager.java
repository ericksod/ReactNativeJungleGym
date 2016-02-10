package com.reactnativetutorial;

import android.content.Context;
import android.view.ViewManager;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.image.ReactImageView;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by danielleerickson on 2/5/16.
 */
public class ReactCustomViewManager extends SimpleViewManager<ReactImageView> {
    private static final String REACT_CLASS = "RCTMyCustomView";
    private Object mCallerContext = null;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ReactImageView createViewInstance(ThemedReactContext context) {
        return new ReactImageView(context, Fresco.newDraweeControllerBuilder(), mCallerContext);
    }

    @ReactProp(name = "src")
    public void setSrc(ReactImageView view, @Nullable String src) {
        view.setSource(src);
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBorderRadius(ReactImageView view, float borderRadius) {
        view.setBorderRadius(borderRadius);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(ReactImageView view, @Nullable String resizeMode) {
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
    }

}
