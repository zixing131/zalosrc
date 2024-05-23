package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class vj3 {

    /* renamed from: a */
    private final Class f29373a;

    /* renamed from: b */
    private final Class f29374b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ vj3(Class cls, Class cls2, uj3 uj3Var) {
        this.f29373a = cls;
        this.f29374b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vj3)) {
            return false;
        }
        vj3 vj3Var = (vj3) obj;
        if (!vj3Var.f29373a.equals(this.f29373a) || !vj3Var.f29374b.equals(this.f29374b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29373a, this.f29374b});
    }

    public final String toString() {
        return this.f29373a.getSimpleName() + " with serialization type: " + this.f29374b.getSimpleName();
    }
}
