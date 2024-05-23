package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class v83 extends AbstractMap {

    /* renamed from: p */
    private transient Set f29231p;

    /* renamed from: q */
    private transient Collection f29232q;

    /* renamed from: a */
    abstract Set mo23131a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f29231p;
        if (set == null) {
            Set mo23131a = mo23131a();
            this.f29231p = mo23131a;
            return mo23131a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f29232q;
        if (collection == null) {
            u83 u83Var = new u83(this);
            this.f29232q = u83Var;
            return u83Var;
        }
        return collection;
    }
}
