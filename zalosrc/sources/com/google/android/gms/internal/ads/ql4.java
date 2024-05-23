package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ql4 {

    /* renamed from: a */
    private final long f26854a;

    /* renamed from: b */
    private final long f26855b;

    /* renamed from: c */
    private final long f26856c;

    /* renamed from: d */
    private long f26857d = 0;

    /* renamed from: e */
    private long f26858e;

    /* renamed from: f */
    private long f26859f;

    /* renamed from: g */
    private long f26860g;

    /* renamed from: h */
    private long f26861h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ql4(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f26854a = j11;
        this.f26855b = j12;
        this.f26858e = j14;
        this.f26859f = j15;
        this.f26860g = j16;
        this.f26856c = j17;
        this.f26861h = m25785f(j12, 0L, j14, j15, j16, j17);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static long m25785f(long j11, long j12, long j13, long j14, long j15, long j16) {
        if (j14 + 1 < j15 && 1 + j12 < j13) {
            long j17 = ((float) (j11 - j12)) * (((float) (j15 - j14)) / ((float) (j13 - j12)));
            return g92.m22336b0(((j14 + j17) - j16) - (j17 / 20), j14, (-1) + j15);
        }
        return j14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m25786g(ql4 ql4Var, long j11, long j12) {
        ql4Var.f26858e = j11;
        ql4Var.f26860g = j12;
        ql4Var.m25788i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m25787h(ql4 ql4Var, long j11, long j12) {
        ql4Var.f26857d = j11;
        ql4Var.f26859f = j12;
        ql4Var.m25788i();
    }

    /* renamed from: i */
    private final void m25788i() {
        this.f26861h = m25785f(this.f26855b, this.f26857d, this.f26858e, this.f26859f, this.f26860g, this.f26856c);
    }
}
