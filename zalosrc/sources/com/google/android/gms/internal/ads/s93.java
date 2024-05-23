package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class s93 extends j93 implements Serializable {

    /* renamed from: p */
    static final s93 f27597p = new s93();

    private s93() {
    }

    @Override // com.google.android.gms.internal.ads.j93
    /* renamed from: a */
    public final j93 mo22746a() {
        return h93.f21590p;
    }

    @Override // com.google.android.gms.internal.ads.j93, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
