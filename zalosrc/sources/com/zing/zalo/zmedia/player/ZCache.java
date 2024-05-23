package com.zing.zalo.zmedia.player;

import android.os.Environment;
import android.text.TextUtils;
import com.zing.zalo.utils.Keep;
import me0.AbstractC23228u2;
import me0.AbstractC23238v2;

@Keep
/* loaded from: classes.dex */
public final class ZCache {
    private static final String TAG = "ZCache";
    private static long mFreeStorage;
    private static long mLastUpdate;

    @Keep
    private static long getFreeStorage() {
        long j11;
        if (System.currentTimeMillis() - mLastUpdate > 600000) {
            mLastUpdate = System.currentTimeMillis();
            String path = Environment.getExternalStorageDirectory().getPath();
            if (!TextUtils.isEmpty(path)) {
                j11 = AbstractC23238v2.m119721f(path) / 1048576;
            } else {
                j11 = 200;
            }
            mFreeStorage = j11;
        }
        return mFreeStorage;
    }

    @Keep
    private static String getHttpHeader(String str) {
        try {
            return (String) AbstractC23228u2.m119703b().get(str);
        } catch (Exception unused) {
            if ("viewerkey".equalsIgnoreCase(str)) {
                return "618748792251303848.1687847603906.92dd8fd5108e6f76e83dde4b17619d30";
            }
            if ("platform".equalsIgnoreCase(str)) {
                return "1";
            }
            if ("clientVersion".equalsIgnoreCase(str)) {
                return "12100699";
            }
            if ("networktype".equalsIgnoreCase(str)) {
                return "0";
            }
            if ("operator".equalsIgnoreCase(str)) {
                return "452019";
            }
            return "";
        }
    }

    private static String[] getHttpHeaderKey() {
        return null;
    }

    private static String[] getHttpHeaderValue() {
        return null;
    }

    @Keep
    private static String getHttpHeaders() {
        return "";
    }
}
