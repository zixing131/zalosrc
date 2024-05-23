package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.e */
/* loaded from: classes3.dex */
public final class C6744e extends AbstractC6745f implements Iterable {

    /* renamed from: p */
    private final List f37129p = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof C6744e) || !((C6744e) obj).f37129p.equals(this.f37129p))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f37129p.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f37129p.iterator();
    }

    /* renamed from: n */
    public void m34547n(AbstractC6745f abstractC6745f) {
        if (abstractC6745f == null) {
            abstractC6745f = C6746g.f37130p;
        }
        this.f37129p.add(abstractC6745f);
    }
}
