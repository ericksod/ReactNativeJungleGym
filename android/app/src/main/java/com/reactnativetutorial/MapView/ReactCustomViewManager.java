package com.reactnativetutorial.MapView;

import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ImageResizeMode;
import com.reactnativetutorial.MapView.MyCustomView;

import javax.annotation.Nullable;

/**
 * Created by danielleerickson on 2/5/16.
 */
public class ReactCustomViewManager extends SimpleViewManager<MyCustomView> {
    private static final String REACT_CLASS = "RCTMyCustomView";
    private Object mCallerContext = null;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected MyCustomView createViewInstance(ThemedReactContext context) {
        return new MyCustomView(context);
    }

    @ReactProp(name = "src")
    public void setSrc(MyCustomView view, @Nullable String src) {
        view.setSource(src);
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBorderRadius(MyCustomView view, float borderRadius) {
        view.setBorderRadius(borderRadius);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(MyCustomView view, @Nullable String resizeMode) {
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
    }

}
