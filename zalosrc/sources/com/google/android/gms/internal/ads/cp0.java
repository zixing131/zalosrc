package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class cp0 implements Iterable {

    /* renamed from: p */
    private final List f18512p = new ArrayList();

    /* renamed from: d */
    public final bp0 m20978d(fn0 fn0Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            bp0 bp0Var = (bp0) it.next();
            if (bp0Var.f17943a == fn0Var) {
                return bp0Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m20979e(bp0 bp0Var) {
        this.f18512p.add(bp0Var);
    }

    /* renamed from: g */
    public final void m20980g(bp0 bp0Var) {
        this.f18512p.remove(bp0Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18512p.iterator();
    }

    /* renamed from: j */
    public final boolean m20981j(fn0 fn0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            bp0 bp0Var = (bp0) it.next();
            if (bp0Var.f17943a == fn0Var) {
                arrayList.add(bp0Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((bp0) it2.next()).f17944b.mo23993i();
        }
        return true;
    }
}
