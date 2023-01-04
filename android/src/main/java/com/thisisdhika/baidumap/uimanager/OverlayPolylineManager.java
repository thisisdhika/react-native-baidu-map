/*
 * Copyright (c) 2016-present, lovebing.net.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.thisisdhika.baidumap.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.thisisdhika.baidumap.util.ColorUtil;
import com.thisisdhika.baidumap.util.LatLngUtil;
import com.thisisdhika.baidumap.util.StrokeUtil;
import com.thisisdhika.baidumap.view.OverlayPolygon;
import com.thisisdhika.baidumap.view.OverlayPolyline;


/**
 * @author lovebing Created on Dec 09, 2018
 */
public class OverlayPolylineManager extends SimpleViewManager<OverlayPolyline> {

    @Override
    public String getName() {
        return "BaiduMapOverlayPolyline";
    }

    @Override
    protected OverlayPolyline createViewInstance(ThemedReactContext reactContext) {
        return new OverlayPolyline(reactContext);
    }

    @ReactProp(name = "points")
    public void setPoints(OverlayPolyline overlayPolyline, ReadableArray points) {
        overlayPolyline.setPoints(LatLngUtil.fromReadableArray(points));
    }

    @ReactProp(name = "stroke")
    public void setStroke(OverlayPolyline overlayPolyline, ReadableMap stroke) {
        overlayPolyline.setStroke(StrokeUtil.fromReadableMap(stroke));
    }

}
