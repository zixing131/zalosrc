package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xq */
/* loaded from: classes2.dex */
public final class C5178xq {

    /* renamed from: a */
    final long f30571a;

    /* renamed from: b */
    final String f30572b;

    /* renamed from: c */
    final int f30573c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5178xq(long j11, String str, int i11) {
        this.f30571a = j11;
        this.f30572b = str;
        this.f30573c = i11;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5178xq)) {
            C5178xq c5178xq = (C5178xq) obj;
            if (c5178xq.f30571a == this.f30571a && c5178xq.f30573c == this.f30573c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f30571a;
    }
}
