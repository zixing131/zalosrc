package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class e04 {

    /* renamed from: a */
    final LinkedHashMap f19485a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e04(int i11) {
        this.f19485a = g04.m22258b(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final e04 m21601a(Object obj, w04 w04Var) {
        LinkedHashMap linkedHashMap = this.f19485a;
        r04.m25934a(obj, "key");
        r04.m25934a(w04Var, "provider");
        linkedHashMap.put(obj, w04Var);
        return this;
    }
}
