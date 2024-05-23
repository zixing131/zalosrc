package com.google.gson;

import java.util.Set;
import p674y9.C30851h;

/* renamed from: com.google.gson.h */
/* loaded from: classes3.dex */
public final class C6747h extends AbstractC6745f {

    /* renamed from: p */
    private final C30851h f37131p = new C30851h();

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof C6747h) || !((C6747h) obj).f37131p.equals(this.f37131p))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f37131p.hashCode();
    }

    /* renamed from: n */
    public void m34555n(String str, AbstractC6745f abstractC6745f) {
        C30851h c30851h = this.f37131p;
        if (abstractC6745f == null) {
            abstractC6745f = C6746g.f37130p;
        }
        c30851h.put(str, abstractC6745f);
    }

    /* renamed from: p */
    public Set m34556p() {
        return this.f37131p.entrySet();
    }
}
