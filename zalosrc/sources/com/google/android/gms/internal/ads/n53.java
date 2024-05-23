package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class n53 implements Serializable, k53 {

    /* renamed from: p */
    private final List f25038p;

    public final boolean equals(Object obj) {
        if (obj instanceof n53) {
            return this.f25038p.equals(((n53) obj).f25038p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25038p.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f25038p;
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z11 = true;
        for (Object obj : list) {
            if (!z11) {
                sb2.append(',');
            }
            sb2.append(obj);
            z11 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.k53
    public final boolean zza(Object obj) {
        for (int i11 = 0; i11 < this.f25038p.size(); i11++) {
            if (!((k53) this.f25038p.get(i11)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
