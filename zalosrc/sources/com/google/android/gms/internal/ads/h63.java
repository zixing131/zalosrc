package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class h63 implements Iterator {

    /* renamed from: p */
    final Iterator f21555p;

    /* renamed from: q */
    Collection f21556q;

    /* renamed from: r */
    final /* synthetic */ i63 f21557r;

    public h63(i63 i63Var) {
        this.f21557r = i63Var;
        this.f21555p = i63Var.f22096r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21555p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f21555p.next();
        this.f21556q = (Collection) entry.getValue();
        return this.f21557r.m23132b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        if (this.f21556q != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23539i(z11, "no calls to next() since the last call to remove()");
        this.f21555p.remove();
        w63.m27541n(this.f21557r.f22097s, this.f21556q.size());
        this.f21556q.clear();
        this.f21556q = null;
    }
}
