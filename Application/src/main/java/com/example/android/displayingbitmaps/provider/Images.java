/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.displayingbitmaps.provider;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * This are PicasaWeb URLs and could potentially change. Ideally the PicasaWeb API should be
     * used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageUrls = new String[] {
            "http://131.179.32.13:8888/uploads/20150601_173812.jpg",
            "http://131.179.32.13:8888/uploads/20150601_173931.jpg",
            "http://131.179.32.13:8888/uploads/20150601_175833.jpg",
            "http://131.179.32.13:8888/uploads/20150601_180434.jpg",
    };

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally the PicasaWeb API
     * should be used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageThumbUrls = new String[]{
            "http://131.179.32.13:8888/uploads/20150601_173812.jpg",
            "http://131.179.32.13:8888/uploads/20150601_173931.jpg",
            "http://131.179.32.13:8888/uploads/20150601_175833.jpg",
            "http://131.179.32.13:8888/uploads/20150601_180434.jpg",
    };
}
