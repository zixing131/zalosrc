package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class j03 {

    /* renamed from: a */
    private final Context f22589a;

    /* renamed from: b */
    private final Looper f22590b;

    public j03(Context context, Looper looper) {
        this.f22589a = context;
        this.f22590b = looper;
    }

    /* renamed from: a */
    public final void m23498a(String str) {
        x03 m28410F = z03.m28410F();
        m28410F.m27796q(this.f22589a.getPackageName());
        m28410F.m27798s(2);
        u03 m27112F = v03.m27112F();
        m27112F.m26811q(str);
        m27112F.m26812r(2);
        m28410F.m27797r(m27112F);
        new k03(this.f22589a, this.f22590b, (z03) m28410F.m25898n()).m23791a();
    }
}
