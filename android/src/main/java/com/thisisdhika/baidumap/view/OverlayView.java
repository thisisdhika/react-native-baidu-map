/*
 * Copyright (c) 2016-present, lovebing.net.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.thisisdhika.baidumap.view;

import com.baidu.mapapi.map.BaiduMap;

/**
 * @author lovebing Created on Dec 09, 2018
 */
public interface OverlayView {

    void addTopMap(BaiduMap baiduMap);
    void removeFromMap(BaiduMap baiduMap);
}
