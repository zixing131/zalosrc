package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class g33 {
    /* renamed from: a */
    public static f33 m22275a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new h33(new n33(context));
    }
}
