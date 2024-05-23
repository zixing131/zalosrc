package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class lr2 {

    /* renamed from: a */
    private final iq2 f24028a;

    /* renamed from: b */
    private final lq2 f24029b;

    /* renamed from: c */
    private final n22 f24030c;

    /* renamed from: d */
    private final ox2 f24031d;

    /* renamed from: e */
    private final vw2 f24032e;

    public lr2(n22 n22Var, ox2 ox2Var, iq2 iq2Var, lq2 lq2Var, vw2 vw2Var) {
        this.f24028a = iq2Var;
        this.f24029b = lq2Var;
        this.f24030c = n22Var;
        this.f24031d = ox2Var;
        this.f24032e = vw2Var;
    }

    /* renamed from: a */
    public final void m24359a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m24360b((String) it.next(), 2);
        }
    }

    /* renamed from: b */
    public final void m24360b(String str, int i11) {
        if (!this.f24028a.f22334k0) {
            this.f24031d.m25355c(str, this.f24032e);
        } else {
            this.f24030c.m24800d(new p22(zzt.zzB().mo105913a(), this.f24029b.f24014b, str, i11));
        }
    }

    /* renamed from: c */
    public final void m24361c(List list, int i11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m24360b((String) it.next(), i11);
        }
    }
}
