package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class c41 {

    /* renamed from: a */
    public final List f18099a;

    public c41(List list) {
        this.f18099a = list;
    }

    /* renamed from: a */
    public static c32 m20794a(c32 c32Var) {
        return new d32(c32Var, new y43() { // from class: com.google.android.gms.internal.ads.b41
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return new c41((v31) obj);
            }
        });
    }

    public c41(v31 v31Var) {
        this.f18099a = Collections.singletonList(kc3.m23877i(v31Var));
    }
}
