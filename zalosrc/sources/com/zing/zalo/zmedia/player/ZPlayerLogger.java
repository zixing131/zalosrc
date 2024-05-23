package com.zing.zalo.zmedia.player;

import android.os.Environment;
import com.zing.zalo.utils.Keep;
import com.zing.zalocore.CoreUtility;
import java.io.File;
import p371nv.C23952g;

@Keep
/* loaded from: classes.dex */
public final class ZPlayerLogger {
    private static final String TAG = "com.zing.zalo.zmedia.player.ZPlayerLogger";
    private static String mDir = "";

    @Keep
    private static String getLogDirectory() {
        if (mDir.isEmpty()) {
            if (ZMediaPlayerSettings.DEBUG_ENABLED) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(CoreUtility.getAppContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                String str = File.separator;
                sb2.append(str);
                sb2.append("log");
                sb2.append(str);
                return sb2.toString();
            }
            return ZMediaPlayerSettings.getLogDir() + File.separator;
        }
        return mDir;
    }

    @Keep
    public static void setLogDirectory(String str) {
        mDir = str;
    }

    @Keep
    public static void submitNativeLog(String str, int i11) {
        boolean z11;
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!str.isEmpty() && new File(str).isFile()) {
            C23952g.m125346k(3, str, z11);
        }
    }
}
