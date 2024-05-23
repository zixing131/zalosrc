package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class co0 {

    /* renamed from: a */
    private final C4915qn f18501a = new C4915qn(true, 65536);

    /* renamed from: b */
    private long f18502b = 15000000;

    /* renamed from: c */
    private long f18503c = 30000000;

    /* renamed from: d */
    private long f18504d = 2500000;

    /* renamed from: e */
    private long f18505e = 5000000;

    /* renamed from: f */
    private int f18506f;

    /* renamed from: g */
    private boolean f18507g;

    /* renamed from: a */
    public final void m20965a() {
        m20969e(false);
    }

    /* renamed from: b */
    public final void m20966b() {
        m20969e(true);
    }

    /* renamed from: c */
    public final void m20967c() {
        m20969e(true);
    }

    /* renamed from: d */
    public final void m20968d(InterfaceC4760mh[] interfaceC4760mhArr, C5137wm c5137wm, C4581hn c4581hn) {
        this.f18506f = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            if (c4581hn.m22977a(i11) != null) {
                this.f18506f += AbstractC4916qo.m25830f(interfaceC4760mhArr[i11].zzc());
            }
        }
        this.f18501a.m25815f(this.f18506f);
    }

    /* renamed from: e */
    final void m20969e(boolean z11) {
        this.f18506f = 0;
        this.f18507g = false;
        if (z11) {
            this.f18501a.m25814e();
        }
    }

    /* renamed from: f */
    public final synchronized void m20970f(int i11) {
        this.f18504d = i11 * 1000;
    }

    /* renamed from: g */
    public final synchronized void m20971g(int i11) {
        this.f18505e = i11 * 1000;
    }

    /* renamed from: h */
    public final synchronized void m20972h(int i11) {
        this.f18503c = i11 * 1000;
    }

    /* renamed from: i */
    public final synchronized void m20973i(int i11) {
        this.f18502b = i11 * 1000;
    }

    /* renamed from: j */
    public final synchronized boolean m20974j(long j11) {
        boolean z11;
        try {
            z11 = true;
            char c11 = j11 > this.f18503c ? (char) 0 : j11 < this.f18502b ? (char) 2 : (char) 1;
            int m25810a = this.f18501a.m25810a();
            int i11 = this.f18506f;
            if (c11 != 2 && (c11 != 1 || !this.f18507g || m25810a >= i11)) {
                z11 = false;
            }
            this.f18507g = z11;
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    /* renamed from: k */
    public final synchronized boolean m20975k(long j11, boolean z11) {
        try {
            long j12 = z11 ? this.f18505e : this.f18504d;
            return j12 <= 0 || j11 >= j12;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: l */
    public final C4915qn m20976l() {
        return this.f18501a;
    }
}
