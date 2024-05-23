package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class y73 extends x63 implements Serializable {

    /* renamed from: p */
    final Object f30829p;

    /* renamed from: q */
    final Object f30830q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y73(Object obj, Object obj2) {
        this.f30829p = obj;
        this.f30830q = obj2;
    }

    @Override // com.google.android.gms.internal.ads.x63, java.util.Map.Entry
    public final Object getKey() {
        return this.f30829p;
    }

    @Override // com.google.android.gms.internal.ads.x63, java.util.Map.Entry
    public final Object getValue() {
        return this.f30830q;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
