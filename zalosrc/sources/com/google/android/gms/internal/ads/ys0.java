package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ys0 {

    /* renamed from: a */
    private final zzcgv f31082a;

    /* renamed from: b */
    private final Context f31083b;

    /* renamed from: c */
    private final WeakReference f31084c;

    public /* synthetic */ ys0(ws0 ws0Var, xs0 xs0Var) {
        zzcgv zzcgvVar;
        Context context;
        WeakReference weakReference;
        zzcgvVar = ws0Var.f30087a;
        this.f31082a = zzcgvVar;
        context = ws0Var.f30088b;
        this.f31083b = context;
        weakReference = ws0Var.f30089c;
        this.f31084c = weakReference;
    }

    /* renamed from: a */
    public final Context m28330a() {
        return this.f31083b;
    }

    /* renamed from: b */
    public final C4830od m28331b() {
        return new C4830od(new zzi(this.f31083b, this.f31082a));
    }

    /* renamed from: c */
    public final C5001sz m28332c() {
        return new C5001sz(this.f31083b);
    }

    /* renamed from: d */
    public final zzcgv m28333d() {
        return this.f31082a;
    }

    /* renamed from: e */
    public final String m28334e() {
        return zzt.zzp().zzc(this.f31083b, this.f31082a.f32030p);
    }

    /* renamed from: f */
    public final WeakReference m28335f() {
        return this.f31084c;
    }
}
