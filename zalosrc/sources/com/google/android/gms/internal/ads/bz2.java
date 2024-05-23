package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class bz2 {
    /* renamed from: a */
    public static float m20773a(View view) {
        return view.getZ();
    }

    /* renamed from: b */
    public static String m20774b(View view) {
        if (view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility == 8) {
                return "viewGone";
            }
            if (visibility == 4) {
                return "viewInvisible";
            }
            if (visibility != 0) {
                return "viewNotVisible";
            }
            if (view.getAlpha() == 0.0f) {
                return "viewAlphaZero";
            }
            return null;
        }
        return "notAttached";
    }
}
