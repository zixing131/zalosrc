package com.zing.zalo.p077ui.zviews;

import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: com.zing.zalo.ui.zviews.mx */
/* loaded from: classes6.dex */
public final class C15923mx implements Serializable {

    /* renamed from: p */
    private final String f81274p;

    /* renamed from: q */
    private final String f81275q;

    /* renamed from: r */
    private final String f81276r;

    public C15923mx(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "subTitle");
        AbstractC19074t.m100208f(str3, "img");
        this.f81274p = str;
        this.f81275q = str2;
        this.f81276r = str3;
    }

    /* renamed from: a */
    public final String m87376a() {
        return this.f81276r;
    }

    /* renamed from: b */
    public final String m87377b() {
        return this.f81275q;
    }

    /* renamed from: c */
    public final String m87378c() {
        return this.f81274p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15923mx)) {
            return false;
        }
        C15923mx c15923mx = (C15923mx) obj;
        return AbstractC19074t.m100204b(this.f81274p, c15923mx.f81274p) && AbstractC19074t.m100204b(this.f81275q, c15923mx.f81275q) && AbstractC19074t.m100204b(this.f81276r, c15923mx.f81276r);
    }

    public int hashCode() {
        return (((this.f81274p.hashCode() * 31) + this.f81275q.hashCode()) * 31) + this.f81276r.hashCode();
    }

    public String toString() {
        return "MiniAppAwarenessData(title=" + this.f81274p + ", subTitle=" + this.f81275q + ", img=" + this.f81276r + ")";
    }
}
