package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class p73 extends r73 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p73() {
        super(null);
    }

    /* renamed from: j */
    static final r73 m25413j(int i11) {
        r73 r73Var;
        r73 r73Var2;
        r73 r73Var3;
        if (i11 < 0) {
            r73Var3 = r73.f27131b;
            return r73Var3;
        }
        if (i11 > 0) {
            r73Var2 = r73.f27132c;
            return r73Var2;
        }
        r73Var = r73.f27130a;
        return r73Var;
    }

    @Override // com.google.android.gms.internal.ads.r73
    /* renamed from: a */
    public final int mo25414a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.r73
    /* renamed from: b */
    public final r73 mo25415b(int i11, int i12) {
        return m25413j(i11 < i12 ? -1 : i11 > i12 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.r73
    /* renamed from: c */
    public final r73 mo25416c(Object obj, Object obj2, Comparator comparator) {
        return m25413j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.r73
    /* renamed from: d */
    public final r73 mo25417d(boolean z11, boolean z12) {
        return m25413j(ga3.m22381a(z11, z12));
    }

    @Override // com.google.android.gms.internal.ads.r73
    /* renamed from: e */
    public final r73 mo25418e(boolean z11, boolean z12) {
        return m25413j(ga3.m22381a(false, false));
    }
}
