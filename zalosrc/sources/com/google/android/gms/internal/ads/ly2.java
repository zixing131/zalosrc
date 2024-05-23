package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ly2 {

    /* renamed from: b */
    private static final ly2 f24310b = new ly2();

    /* renamed from: a */
    private Context f24311a;

    private ly2() {
    }

    /* renamed from: b */
    public static ly2 m24419b() {
        return f24310b;
    }

    /* renamed from: a */
    public final Context m24420a() {
        return this.f24311a;
    }

    /* renamed from: c */
    public final void m24421c(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f24311a = context2;
    }
}
