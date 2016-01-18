/*
 * Copyright 2016 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.hotspot;

import android.graphics.drawable.Drawable;
import android.os.Build;

public class Hotspot {

    @SuppressWarnings("RedundantCast")
    public static void setHotspot(Drawable drawable, float x, float y) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            drawable.setHotspot(x, y);
        } else if (drawable instanceof Hotspotable) {
            ((Hotspotable) drawable).setHotspot(x, y);
        }
    }
}
