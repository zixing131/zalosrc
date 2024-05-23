package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes2.dex */
abstract class ma4 {
    /* renamed from: a */
    public static void m24529a(AudioTrack audioTrack, i94 i94Var) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId m23146a = i94Var.m23146a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = m23146a.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(m23146a);
        }
    }
}
