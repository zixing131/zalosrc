package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n73 extends j93 implements Serializable {

    /* renamed from: p */
    final Comparator f25081p;

    public n73(Comparator comparator) {
        comparator.getClass();
        this.f25081p = comparator;
    }

    @Override // com.google.android.gms.internal.ads.j93, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f25081p.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n73) {
            return this.f25081p.equals(((n73) obj).f25081p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25081p.hashCode();
    }

    public final String toString() {
        return this.f25081p.toString();
    }
}
