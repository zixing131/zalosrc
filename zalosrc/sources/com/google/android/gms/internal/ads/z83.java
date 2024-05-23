package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class z83 extends d93 {

    /* renamed from: a */
    final /* synthetic */ Comparator f31410a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z83(Comparator comparator) {
        this.f31410a = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.d93
    /* renamed from: a */
    public final Map mo21289a() {
        return new TreeMap(this.f31410a);
    }
}
