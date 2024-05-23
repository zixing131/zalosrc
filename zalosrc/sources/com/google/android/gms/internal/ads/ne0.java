package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ne0 {

    /* renamed from: a */
    private final zk4 f25161a = new zk4();

    /* renamed from: a */
    public final ne0 m24904a(int i11) {
        this.f25161a.m28538a(i11);
        return this;
    }

    /* renamed from: b */
    public final ne0 m24905b(jg0 jg0Var) {
        C4336b c4336b;
        zk4 zk4Var = this.f25161a;
        c4336b = jg0Var.f22807a;
        for (int i11 = 0; i11 < c4336b.m20360b(); i11++) {
            zk4Var.m28538a(c4336b.m20359a(i11));
        }
        return this;
    }

    /* renamed from: c */
    public final ne0 m24906c(int... iArr) {
        zk4 zk4Var = this.f25161a;
        for (int i11 = 0; i11 < 21; i11++) {
            zk4Var.m28538a(iArr[i11]);
        }
        return this;
    }

    /* renamed from: d */
    public final ne0 m24907d(int i11, boolean z11) {
        zk4 zk4Var = this.f25161a;
        if (z11) {
            zk4Var.m28538a(i11);
        }
        return this;
    }

    /* renamed from: e */
    public final jg0 m24908e() {
        return new jg0(this.f25161a.m28539b(), null);
    }
}
