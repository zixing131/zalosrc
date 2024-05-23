package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ws0 {

    /* renamed from: a */
    private zzcgv f30087a;

    /* renamed from: b */
    private Context f30088b;

    /* renamed from: c */
    private WeakReference f30089c;

    /* renamed from: c */
    public final ws0 m27709c(Context context) {
        this.f30089c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f30088b = context;
        return this;
    }

    /* renamed from: d */
    public final ws0 m27710d(zzcgv zzcgvVar) {
        this.f30087a = zzcgvVar;
        return this;
    }
}
