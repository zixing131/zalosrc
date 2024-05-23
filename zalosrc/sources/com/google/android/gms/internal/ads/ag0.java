package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public abstract class ag0 extends ContextWrapper {
    /* renamed from: a */
    public static Context m20113a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }
}
