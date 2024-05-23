package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class l24 {
    /* renamed from: a */
    public static i94 m24109a(Context context, w24 w24Var, boolean z11) {
        LogSessionId logSessionId;
        d94 m21291g = d94.m21291g(context);
        if (m21291g == null) {
            lr1.m24356e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new i94(logSessionId);
        }
        if (z11) {
            w24Var.m27510s(m21291g);
        }
        return new i94(m21291g.m21304e());
    }
}
