package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class vh4 implements Comparable {

    /* renamed from: p */
    private final boolean f29320p;

    /* renamed from: q */
    private final boolean f29321q;

    public vh4(C4671k3 c4671k3, int i11) {
        this.f29320p = 1 == (c4671k3.f23091d & 1);
        this.f29321q = si4.m26330r(i11, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(vh4 vh4Var) {
        return r73.m25988i().mo25417d(this.f29321q, vh4Var.f29321q).mo25417d(this.f29320p, vh4Var.f29320p).mo25414a();
    }
}
