package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class oy2 {

    /* renamed from: f */
    private static oy2 f25993f;

    /* renamed from: a */
    private float f25994a = 0.0f;

    /* renamed from: b */
    private final hy2 f25995b;

    /* renamed from: c */
    private final fy2 f25996c;

    /* renamed from: d */
    private gy2 f25997d;

    /* renamed from: e */
    private iy2 f25998e;

    public oy2(hy2 hy2Var, fy2 fy2Var) {
        this.f25995b = hy2Var;
        this.f25996c = fy2Var;
    }

    /* renamed from: b */
    public static oy2 m25357b() {
        if (f25993f == null) {
            f25993f = new oy2(new hy2(), new fy2());
        }
        return f25993f;
    }

    /* renamed from: a */
    public final float m25358a() {
        return this.f25994a;
    }

    /* renamed from: c */
    public final void m25359c(Context context) {
        this.f25997d = new gy2(new Handler(), context, new ey2(), this, null);
    }

    /* renamed from: d */
    public final void m25360d(float f11) {
        this.f25994a = f11;
        if (this.f25998e == null) {
            this.f25998e = iy2.m23465a();
        }
        Iterator it = this.f25998e.m23466b().iterator();
        while (it.hasNext()) {
            ((xx2) it.next()).m28060g().m27095h(f11);
        }
    }

    /* renamed from: e */
    public final void m25361e() {
        jy2.m23780a().m23785d(this);
        jy2.m23780a().m23783b();
        iz2.m23475d().m23483i();
        this.f25997d.m22642a();
    }

    /* renamed from: f */
    public final void m25362f() {
        iz2.m23475d().m23484j();
        jy2.m23780a().m23784c();
        this.f25997d.m22643b();
    }
}
