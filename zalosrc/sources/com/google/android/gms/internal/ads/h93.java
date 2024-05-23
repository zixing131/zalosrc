package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h93 extends j93 implements Serializable {

    /* renamed from: p */
    static final h93 f21590p = new h93();

    private h93() {
    }

    @Override // com.google.android.gms.internal.ads.j93
    /* renamed from: a */
    public final j93 mo22746a() {
        return s93.f27597p;
    }

    @Override // com.google.android.gms.internal.ads.j93, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
