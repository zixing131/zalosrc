package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class vt3 {

    /* renamed from: d */
    private static volatile int f29482d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f29483e = 0;

    /* renamed from: a */
    int f29484a;

    /* renamed from: b */
    final int f29485b = f29482d;

    /* renamed from: c */
    wt3 f29486c;

    public /* synthetic */ vt3(ut3 ut3Var) {
    }

    /* renamed from: e */
    public static int m27352e(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    /* renamed from: f */
    public static long m27353f(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    /* renamed from: g */
    public static vt3 m27354g(InputStream inputStream, int i11) {
        return new tt3(inputStream, 4096, null);
    }

    /* renamed from: h */
    public static vt3 m27355h(byte[] bArr, int i11, int i12, boolean z11) {
        ot3 ot3Var = new ot3(bArr, i11, i12, z11, null);
        try {
            ot3Var.mo25275l(i12);
            return ot3Var;
        } catch (zzgrq e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* renamed from: A */
    public abstract String mo25259A();

    /* renamed from: B */
    public abstract void mo25260B(int i11);

    /* renamed from: a */
    public abstract void mo25268a(int i11);

    /* renamed from: b */
    public abstract boolean mo25269b();

    /* renamed from: c */
    public abstract boolean mo25270c();

    /* renamed from: d */
    public abstract boolean mo25271d(int i11);

    /* renamed from: i */
    public abstract double mo25272i();

    /* renamed from: j */
    public abstract float mo25273j();

    /* renamed from: k */
    public abstract int mo25274k();

    /* renamed from: l */
    public abstract int mo25275l(int i11);

    /* renamed from: m */
    public abstract int mo25276m();

    /* renamed from: n */
    public abstract int mo25277n();

    /* renamed from: o */
    public abstract int mo25278o();

    /* renamed from: p */
    public abstract int mo25279p();

    /* renamed from: q */
    public abstract int mo25280q();

    /* renamed from: r */
    public abstract int mo25281r();

    /* renamed from: s */
    public abstract int mo25282s();

    /* renamed from: t */
    public abstract long mo25283t();

    /* renamed from: u */
    public abstract long mo25284u();

    /* renamed from: v */
    public abstract long mo25285v();

    /* renamed from: w */
    public abstract long mo25286w();

    /* renamed from: x */
    public abstract long mo25287x();

    /* renamed from: y */
    public abstract mt3 mo25288y();

    /* renamed from: z */
    public abstract String mo25289z();
}
