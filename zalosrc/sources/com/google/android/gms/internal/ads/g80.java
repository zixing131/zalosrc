package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public final class g80 extends wl0 {

    /* renamed from: d */
    private final zzbb f20463d;

    /* renamed from: c */
    private final Object f20462c = new Object();

    /* renamed from: e */
    private boolean f20464e = false;

    /* renamed from: f */
    private int f20465f = 0;

    public g80(zzbb zzbbVar) {
        this.f20463d = zzbbVar;
    }

    /* renamed from: f */
    public final b80 m22293f() {
        boolean z11;
        b80 b80Var = new b80(this);
        synchronized (this.f20462c) {
            m27653e(new c80(this, b80Var), new d80(this, b80Var));
            if (this.f20465f >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19726o(z11);
            this.f20465f++;
        }
        return b80Var;
    }

    /* renamed from: g */
    public final void m22294g() {
        boolean z11;
        synchronized (this.f20462c) {
            if (this.f20465f >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19726o(z11);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f20464e = true;
            m22295h();
        }
    }

    /* renamed from: h */
    protected final void m22295h() {
        boolean z11;
        synchronized (this.f20462c) {
            try {
                if (this.f20465f >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC4205o.m19726o(z11);
                if (this.f20464e && this.f20465f == 0) {
                    zze.zza("No reference is left (including root). Cleaning up engine.");
                    m27653e(new f80(this), new sl0());
                } else {
                    zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final void m22296i() {
        boolean z11;
        synchronized (this.f20462c) {
            if (this.f20465f > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19726o(z11);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f20465f--;
            m22295h();
        }
    }
}
