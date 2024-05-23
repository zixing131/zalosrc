package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class j63 implements Iterator {

    /* renamed from: p */
    final Iterator f22690p;

    /* renamed from: q */
    Object f22691q;

    /* renamed from: r */
    Collection f22692r;

    /* renamed from: s */
    Iterator f22693s;

    /* renamed from: t */
    final /* synthetic */ w63 f22694t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j63(w63 w63Var) {
        Map map;
        this.f22694t = w63Var;
        map = w63Var.f29832s;
        this.f22690p = map.entrySet().iterator();
        this.f22691q = null;
        this.f22692r = null;
        this.f22693s = l83.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f22690p.hasNext() && !this.f22693s.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f22693s.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f22690p.next();
            this.f22691q = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f22692r = collection;
            this.f22693s = collection.iterator();
        }
        return this.f22693s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22693s.remove();
        Collection collection = this.f22692r;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f22690p.remove();
        }
        w63.m27539l(this.f22694t);
    }
}
