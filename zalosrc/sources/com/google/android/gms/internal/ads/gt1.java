package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class gt1 implements iv2 {

    /* renamed from: q */
    private final ys1 f20812q;

    /* renamed from: r */
    private final InterfaceC20285f f20813r;

    /* renamed from: p */
    private final Map f20811p = new HashMap();

    /* renamed from: s */
    private final Map f20814s = new HashMap();

    public gt1(ys1 ys1Var, Set set, InterfaceC20285f interfaceC20285f) {
        bv2 bv2Var;
        this.f20812q = ys1Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ft1 ft1Var = (ft1) it.next();
            Map map = this.f20814s;
            bv2Var = ft1Var.f20281c;
            map.put(bv2Var, ft1Var);
        }
        this.f20813r = interfaceC20285f;
    }

    /* renamed from: a */
    private final void m22523a(bv2 bv2Var, boolean z11) {
        bv2 bv2Var2;
        String str;
        String str2;
        bv2Var2 = ((ft1) this.f20814s.get(bv2Var)).f20280b;
        if (true != z11) {
            str = "f.";
        } else {
            str = "s.";
        }
        if (this.f20811p.containsKey(bv2Var2)) {
            long mo105914b = this.f20813r.mo105914b();
            long longValue = ((Long) this.f20811p.get(bv2Var2)).longValue();
            Map m28337a = this.f20812q.m28337a();
            str2 = ((ft1) this.f20814s.get(bv2Var)).f20279a;
            m28337a.put("label.".concat(str2), str.concat(String.valueOf(Long.toString(mo105914b - longValue))));
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: c */
    public final void mo20716c(bv2 bv2Var, String str) {
        this.f20811p.put(bv2Var, Long.valueOf(this.f20813r.mo105914b()));
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: g */
    public final void mo20717g(bv2 bv2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: n */
    public final void mo20720n(bv2 bv2Var, String str) {
        if (this.f20811p.containsKey(bv2Var)) {
            this.f20812q.m28337a().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.f20813r.mo105914b() - ((Long) this.f20811p.get(bv2Var)).longValue()))));
        }
        if (this.f20814s.containsKey(bv2Var)) {
            m22523a(bv2Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: o */
    public final void mo20721o(bv2 bv2Var, String str, Throwable th2) {
        if (this.f20811p.containsKey(bv2Var)) {
            this.f20812q.m28337a().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.f20813r.mo105914b() - ((Long) this.f20811p.get(bv2Var)).longValue()))));
        }
        if (this.f20814s.containsKey(bv2Var)) {
            m22523a(bv2Var, false);
        }
    }
}
