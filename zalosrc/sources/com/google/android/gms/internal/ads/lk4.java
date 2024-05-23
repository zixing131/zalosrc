package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes2.dex */
abstract class lk4 {
    /* renamed from: a */
    public static void m24327a(Surface surface, float f11) {
        int i11;
        if (f11 == 0.0f) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        try {
            surface.setFrameRate(f11, i11);
        } catch (IllegalStateException e11) {
            lr1.m24354c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e11);
        }
    }
}
