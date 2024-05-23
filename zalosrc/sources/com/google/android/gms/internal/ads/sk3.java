package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class sk3 {

    /* renamed from: a */
    private HashMap f27776a = new HashMap();

    /* renamed from: a */
    public final uk3 m26350a() {
        if (this.f27776a != null) {
            uk3 uk3Var = new uk3(Collections.unmodifiableMap(this.f27776a), null);
            this.f27776a = null;
            return uk3Var;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
