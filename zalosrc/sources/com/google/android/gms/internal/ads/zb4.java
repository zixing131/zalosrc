package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes2.dex */
public final class zb4 implements n94 {

    /* renamed from: b */
    private int f31434b;

    /* renamed from: c */
    private float f31435c = 1.0f;

    /* renamed from: d */
    private float f31436d = 1.0f;

    /* renamed from: e */
    private m94 f31437e;

    /* renamed from: f */
    private m94 f31438f;

    /* renamed from: g */
    private m94 f31439g;

    /* renamed from: h */
    private m94 f31440h;

    /* renamed from: i */
    private boolean f31441i;

    /* renamed from: j */
    private yb4 f31442j;

    /* renamed from: k */
    private ByteBuffer f31443k;

    /* renamed from: l */
    private ShortBuffer f31444l;

    /* renamed from: m */
    private ByteBuffer f31445m;

    /* renamed from: n */
    private long f31446n;

    /* renamed from: o */
    private long f31447o;

    /* renamed from: p */
    private boolean f31448p;

    public zb4() {
        m94 m94Var = m94.f24443e;
        this.f31437e = m94Var;
        this.f31438f = m94Var;
        this.f31439g = m94Var;
        this.f31440h = m94Var;
        ByteBuffer byteBuffer = n94.f25095a;
        this.f31443k = byteBuffer;
        this.f31444l = byteBuffer.asShortBuffer();
        this.f31445m = byteBuffer;
        this.f31434b = -1;
    }

    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: a */
    public final void mo20072a(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        yb4 yb4Var = this.f31442j;
        yb4Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f31446n += remaining;
        yb4Var.m28189f(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: b */
    public final m94 mo22775b(m94 m94Var) {
        if (m94Var.f24446c == 2) {
            int i11 = this.f31434b;
            if (i11 == -1) {
                i11 = m94Var.f24444a;
            }
            this.f31437e = m94Var;
            m94 m94Var2 = new m94(i11, m94Var.f24445b, 2);
            this.f31438f = m94Var2;
            this.f31441i = true;
            return m94Var2;
        }
        throw new zznf(m94Var);
    }

    /* renamed from: c */
    public final long m28469c(long j11) {
        long j12 = this.f31447o;
        if (j12 >= 1024) {
            long j13 = this.f31446n;
            this.f31442j.getClass();
            long m28185b = j13 - r3.m28185b();
            int i11 = this.f31440h.f24444a;
            int i12 = this.f31439g.f24444a;
            if (i11 == i12) {
                return g92.m22346g0(j11, m28185b, j12);
            }
            return g92.m22346g0(j11, m28185b * i11, j12 * i12);
        }
        return (long) (this.f31435c * j11);
    }

    /* renamed from: d */
    public final void m28470d(float f11) {
        if (this.f31436d != f11) {
            this.f31436d = f11;
            this.f31441i = true;
        }
    }

    /* renamed from: e */
    public final void m28471e(float f11) {
        if (this.f31435c != f11) {
            this.f31435c = f11;
            this.f31441i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final ByteBuffer zzb() {
        int m28184a;
        yb4 yb4Var = this.f31442j;
        if (yb4Var != null && (m28184a = yb4Var.m28184a()) > 0) {
            if (this.f31443k.capacity() < m28184a) {
                ByteBuffer order = ByteBuffer.allocateDirect(m28184a).order(ByteOrder.nativeOrder());
                this.f31443k = order;
                this.f31444l = order.asShortBuffer();
            } else {
                this.f31443k.clear();
                this.f31444l.clear();
            }
            yb4Var.m28187d(this.f31444l);
            this.f31447o += m28184a;
            this.f31443k.limit(m28184a);
            this.f31445m = this.f31443k;
        }
        ByteBuffer byteBuffer = this.f31445m;
        this.f31445m = n94.f25095a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final void zzc() {
        if (zzg()) {
            m94 m94Var = this.f31437e;
            this.f31439g = m94Var;
            m94 m94Var2 = this.f31438f;
            this.f31440h = m94Var2;
            if (this.f31441i) {
                this.f31442j = new yb4(m94Var.f24444a, m94Var.f24445b, this.f31435c, this.f31436d, m94Var2.f24444a);
            } else {
                yb4 yb4Var = this.f31442j;
                if (yb4Var != null) {
                    yb4Var.m28186c();
                }
            }
        }
        this.f31445m = n94.f25095a;
        this.f31446n = 0L;
        this.f31447o = 0L;
        this.f31448p = false;
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final void zzd() {
        yb4 yb4Var = this.f31442j;
        if (yb4Var != null) {
            yb4Var.m28188e();
        }
        this.f31448p = true;
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final void zzf() {
        this.f31435c = 1.0f;
        this.f31436d = 1.0f;
        m94 m94Var = m94.f24443e;
        this.f31437e = m94Var;
        this.f31438f = m94Var;
        this.f31439g = m94Var;
        this.f31440h = m94Var;
        ByteBuffer byteBuffer = n94.f25095a;
        this.f31443k = byteBuffer;
        this.f31444l = byteBuffer.asShortBuffer();
        this.f31445m = byteBuffer;
        this.f31434b = -1;
        this.f31441i = false;
        this.f31442j = null;
        this.f31446n = 0L;
        this.f31447o = 0L;
        this.f31448p = false;
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final boolean zzg() {
        if (this.f31438f.f24444a == -1) {
            return false;
        }
        if (Math.abs(this.f31435c - 1.0f) < 1.0E-4f && Math.abs(this.f31436d - 1.0f) < 1.0E-4f && this.f31438f.f24444a == this.f31437e.f24444a) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final boolean zzh() {
        if (!this.f31448p) {
            return false;
        }
        yb4 yb4Var = this.f31442j;
        return yb4Var == null || yb4Var.m28184a() == 0;
    }
}
