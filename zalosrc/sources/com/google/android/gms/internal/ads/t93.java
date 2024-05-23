package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t93 extends j93 implements Serializable {

    /* renamed from: p */
    final j93 f28269p;

    public t93(j93 j93Var) {
        this.f28269p = j93Var;
    }

    @Override // com.google.android.gms.internal.ads.j93
    /* renamed from: a */
    public final j93 mo22746a() {
        return this.f28269p;
    }

    @Override // com.google.android.gms.internal.ads.j93, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f28269p.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t93) {
            return this.f28269p.equals(((t93) obj).f28269p);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f28269p.hashCode();
    }

    public final String toString() {
        j93 j93Var = this.f28269p;
        Objects.toString(j93Var);
        return j93Var.toString().concat(".reverse()");
    }
}
