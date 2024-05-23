package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class z02 implements iv2 {

    /* renamed from: p */
    private final Map f31311p = new HashMap();

    /* renamed from: q */
    private final Map f31312q = new HashMap();

    /* renamed from: r */
    private final qv2 f31313r;

    public z02(Set set, qv2 qv2Var) {
        bv2 bv2Var;
        String str;
        bv2 bv2Var2;
        String str2;
        this.f31313r = qv2Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            y02 y02Var = (y02) it.next();
            Map map = this.f31311p;
            bv2Var = y02Var.f30719b;
            str = y02Var.f30718a;
            map.put(bv2Var, str);
            Map map2 = this.f31312q;
            bv2Var2 = y02Var.f30720c;
            str2 = y02Var.f30718a;
            map2.put(bv2Var2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: c */
    public final void mo20716c(bv2 bv2Var, String str) {
        this.f31313r.m25908d("task.".concat(String.valueOf(str)));
        if (this.f31311p.containsKey(bv2Var)) {
            this.f31313r.m25908d("label.".concat(String.valueOf((String) this.f31311p.get(bv2Var))));
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: g */
    public final void mo20717g(bv2 bv2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: n */
    public final void mo20720n(bv2 bv2Var, String str) {
        this.f31313r.m25909e("task.".concat(String.valueOf(str)), "s.");
        if (this.f31312q.containsKey(bv2Var)) {
            this.f31313r.m25909e("label.".concat(String.valueOf((String) this.f31312q.get(bv2Var))), "s.");
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: o */
    public final void mo20721o(bv2 bv2Var, String str, Throwable th2) {
        this.f31313r.m25909e("task.".concat(String.valueOf(str)), "f.");
        if (this.f31312q.containsKey(bv2Var)) {
            this.f31313r.m25909e("label.".concat(String.valueOf((String) this.f31312q.get(bv2Var))), "f.");
        }
    }
}
