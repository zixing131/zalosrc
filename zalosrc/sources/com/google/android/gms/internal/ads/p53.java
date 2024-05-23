package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p53 extends f53 {

    /* renamed from: p */
    private final Object f26075p;

    public p53(Object obj) {
        this.f26075p = obj;
    }

    @Override // com.google.android.gms.internal.ads.f53
    /* renamed from: a */
    public final f53 mo21949a(y43 y43Var) {
        Object apply = y43Var.apply(this.f26075p);
        j53.m23533c(apply, "the Function passed to Optional.transform() must not return null.");
        return new p53(apply);
    }

    @Override // com.google.android.gms.internal.ads.f53
    /* renamed from: b */
    public final Object mo21950b(Object obj) {
        return this.f26075p;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p53) {
            return this.f26075p.equals(((p53) obj).f26075p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26075p.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f26075p + ")";
    }
}
