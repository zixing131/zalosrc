package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tj3 {

    /* renamed from: a */
    private final Class f28386a;

    /* renamed from: b */
    private final ss3 f28387b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ tj3(Class cls, ss3 ss3Var, sj3 sj3Var) {
        this.f28386a = cls;
        this.f28387b = ss3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tj3)) {
            return false;
        }
        tj3 tj3Var = (tj3) obj;
        if (!tj3Var.f28386a.equals(this.f28386a) || !tj3Var.f28387b.equals(this.f28387b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28386a, this.f28387b});
    }

    public final String toString() {
        return this.f28386a.getSimpleName() + ", object identifier: " + String.valueOf(this.f28387b);
    }
}
