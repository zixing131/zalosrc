package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes.dex */
public final class C5945c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5945c(Context context) {
    }

    /* renamed from: a */
    public static final boolean m30814a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
