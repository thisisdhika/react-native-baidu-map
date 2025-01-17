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

/**
 * @author lovebing Created on Dec 09, 2018
 */
public class OverlayPolygonManager extends SimpleViewManager<OverlayPolygon> {

    @Override
    public String getName() {
        return "BaiduMapOverlayPolygon";
    }

    @Override
    protected OverlayPolygon createViewInstance(ThemedReactContext reactContext) {
        return new OverlayPolygon(reactContext);
    }

    @ReactProp(name = "points")
    public void setPoints(OverlayPolygon overlayPolygon, ReadableArray points) {
        overlayPolygon.setPoints(LatLngUtil.fromReadableArray(points));
    }

    @ReactProp(name = "fillColor")
    public void setFillColor(OverlayPolygon overlayPolygon, String fillColor) {
        overlayPolygon.setFillColor(ColorUtil.fromString(fillColor));
    }

    @ReactProp(name = "stroke")
    public void setStroke(OverlayPolygon overlayPolygon, ReadableMap stroke) {
        overlayPolygon.setStroke(StrokeUtil.fromReadableMap(stroke));
    }
}
