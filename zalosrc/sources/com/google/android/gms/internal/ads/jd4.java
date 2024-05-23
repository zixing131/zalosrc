package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes2.dex */
abstract class jd4 {
    /* renamed from: a */
    public static void m23607a(ed4 ed4Var, i94 i94Var) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId m23146a = i94Var.m23146a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = m23146a.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = ed4Var.f19594b;
            stringId = m23146a.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
