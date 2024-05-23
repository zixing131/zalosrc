package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class qk4 {

    /* renamed from: a */
    private final dk4 f26833a = new dk4();

    /* renamed from: b */
    private final mk4 f26834b;

    /* renamed from: c */
    private final pk4 f26835c;

    /* renamed from: d */
    private boolean f26836d;

    /* renamed from: e */
    private Surface f26837e;

    /* renamed from: f */
    private float f26838f;

    /* renamed from: g */
    private float f26839g;

    /* renamed from: h */
    private float f26840h;

    /* renamed from: i */
    private float f26841i;

    /* renamed from: j */
    private int f26842j;

    /* renamed from: k */
    private long f26843k;

    /* renamed from: l */
    private long f26844l;

    /* renamed from: m */
    private long f26845m;

    /* renamed from: n */
    private long f26846n;

    /* renamed from: o */
    private long f26847o;

    /* renamed from: p */
    private long f26848p;

    /* renamed from: q */
    private long f26849q;

    public qk4(Context context) {
        mk4 mk4Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i11 = g92.f20474a;
            mk4Var = ok4.m25204b(applicationContext);
            if (mk4Var == null) {
                mk4Var = nk4.m24938b(applicationContext);
            }
        } else {
            mk4Var = null;
        }
        this.f26834b = mk4Var;
        this.f26835c = mk4Var != null ? pk4.m25475a() : null;
        this.f26843k = -9223372036854775807L;
        this.f26844l = -9223372036854775807L;
        this.f26838f = -1.0f;
        this.f26841i = 1.0f;
        this.f26842j = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m25760b(qk4 qk4Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            qk4Var.f26843k = refreshRate;
            qk4Var.f26844l = (refreshRate * 80) / 100;
        } else {
            lr1.m24356e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            qk4Var.f26843k = -9223372036854775807L;
            qk4Var.f26844l = -9223372036854775807L;
        }
    }

    /* renamed from: k */
    private final void m25761k() {
        Surface surface;
        if (g92.f20474a >= 30 && (surface = this.f26837e) != null && this.f26842j != Integer.MIN_VALUE && this.f26840h != 0.0f) {
            this.f26840h = 0.0f;
            lk4.m24327a(surface, 0.0f);
        }
    }

    /* renamed from: l */
    private final void m25762l() {
        this.f26845m = 0L;
        this.f26848p = -1L;
        this.f26846n = -1L;
    }

    /* renamed from: m */
    private final void m25763m() {
        float f11;
        if (g92.f20474a >= 30 && this.f26837e != null) {
            if (this.f26833a.m21456g()) {
                f11 = this.f26833a.m21450a();
            } else {
                f11 = this.f26838f;
            }
            float f12 = this.f26839g;
            if (f11 == f12) {
                return;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                float f13 = 1.0f;
                if (this.f26833a.m21456g() && this.f26833a.m21453d() >= 5000000000L) {
                    f13 = 0.02f;
                }
                if (Math.abs(f11 - this.f26839g) < f13) {
                    return;
                }
            } else if (f11 == -1.0f && this.f26833a.m21451b() < 30) {
                return;
            }
            this.f26839g = f11;
            m25764n(false);
        }
    }

    /* renamed from: n */
    private final void m25764n(boolean z11) {
        Surface surface;
        if (g92.f20474a >= 30 && (surface = this.f26837e) != null && this.f26842j != Integer.MIN_VALUE) {
            float f11 = 0.0f;
            if (this.f26836d) {
                float f12 = this.f26839g;
                if (f12 != -1.0f) {
                    f11 = this.f26841i * f12;
                }
            }
            if (!z11 && this.f26840h == f11) {
                return;
            }
            this.f26840h = f11;
            lk4.m24327a(surface, f11);
        }
    }

    /* renamed from: a */
    public final long m25765a(long j11) {
        long j12;
        if (this.f26848p != -1 && this.f26833a.m21456g()) {
            long m21452c = this.f26849q + (((float) (this.f26833a.m21452c() * (this.f26845m - this.f26848p))) / this.f26841i);
            if (Math.abs(j11 - m21452c) <= 20000000) {
                j11 = m21452c;
            } else {
                m25762l();
            }
        }
        this.f26846n = this.f26845m;
        this.f26847o = j11;
        pk4 pk4Var = this.f26835c;
        if (pk4Var != null && this.f26843k != -9223372036854775807L) {
            long j13 = pk4Var.f26244p;
            if (j13 == -9223372036854775807L) {
                return j11;
            }
            long j14 = this.f26843k;
            long j15 = j13 + (((j11 - j13) / j14) * j14);
            if (j11 <= j15) {
                j12 = j15 - j14;
            } else {
                j15 = j14 + j15;
                j12 = j15;
            }
            if (j15 - j11 >= j11 - j12) {
                j15 = j12;
            }
            return j15 - this.f26844l;
        }
        return j11;
    }

    /* renamed from: c */
    public final void m25766c(float f11) {
        this.f26838f = f11;
        this.f26833a.m21455f();
        m25763m();
    }

    /* renamed from: d */
    public final void m25767d(long j11) {
        long j12 = this.f26846n;
        if (j12 != -1) {
            this.f26848p = j12;
            this.f26849q = this.f26847o;
        }
        this.f26845m++;
        this.f26833a.m21454e(j11 * 1000);
        m25763m();
    }

    /* renamed from: e */
    public final void m25768e(float f11) {
        this.f26841i = f11;
        m25762l();
        m25764n(false);
    }

    /* renamed from: f */
    public final void m25769f() {
        m25762l();
    }

    /* renamed from: g */
    public final void m25770g() {
        this.f26836d = true;
        m25762l();
        if (this.f26834b != null) {
            pk4 pk4Var = this.f26835c;
            pk4Var.getClass();
            pk4Var.m25476b();
            this.f26834b.mo24621a(new jk4(this));
        }
        m25764n(false);
    }

    /* renamed from: h */
    public final void m25771h() {
        this.f26836d = false;
        mk4 mk4Var = this.f26834b;
        if (mk4Var != null) {
            mk4Var.zza();
            pk4 pk4Var = this.f26835c;
            pk4Var.getClass();
            pk4Var.m25477c();
        }
        m25761k();
    }

    /* renamed from: i */
    public final void m25772i(Surface surface) {
        if (true == (surface instanceof zzxj)) {
            surface = null;
        }
        if (this.f26837e == surface) {
            return;
        }
        m25761k();
        this.f26837e = surface;
        m25764n(true);
    }

    /* renamed from: j */
    public final void m25773j(int i11) {
        if (this.f26842j == i11) {
            return;
        }
        this.f26842j = i11;
        m25764n(true);
    }
}
