package com.zing.zalo.zlogger;

import com.zing.zalo.utils.Keep;
import hu.AbstractC20130d;
import java.io.File;
import p371nv.C23952g;

@Keep
/* loaded from: classes7.dex */
public final class ZPlayerLogger {

    /* renamed from: a */
    private static String f88014a = "";

    @Keep
    public static void ForceSubmitLog() {
        _forceSubmitLog();
    }

    @Keep
    private static void SubmitNativeLog(String str, int i11) {
        boolean z11;
        if (i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!str.isEmpty() && new File(str).isFile()) {
            C23952g.m125346k(3, str, z11);
        }
    }

    static native void _forceSubmitLog();

    @Keep
    private static String getLogDirectory() {
        if (f88014a.isEmpty()) {
            return AbstractC20130d.m104866a0() + "player";
        }
        return f88014a;
    }

    @Keep
    public static void setLogDirectory(String str) {
        f88014a = str;
    }
}
