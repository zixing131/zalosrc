package p134el;

import c30.C3245i;
import fn0.AbstractC19074t;

/* renamed from: el.l */
/* loaded from: classes3.dex */
public final class C18473l {

    /* renamed from: a */
    private final int f93045a;

    /* renamed from: b */
    private final int f93046b;

    /* renamed from: c */
    private final int f93047c;

    /* renamed from: d */
    private final int f93048d;

    /* renamed from: e */
    private final C3245i f93049e;

    public C18473l(int i11, int i12, int i13, int i14, C3245i c3245i) {
        this.f93045a = i11;
        this.f93046b = i12;
        this.f93047c = i13;
        this.f93048d = i14;
        this.f93049e = c3245i;
    }

    /* renamed from: a */
    public final int m97811a() {
        return this.f93048d;
    }

    /* renamed from: b */
    public final C3245i m97812b() {
        return this.f93049e;
    }

    /* renamed from: c */
    public final int m97813c() {
        return this.f93045a;
    }

    /* renamed from: d */
    public final int m97814d() {
        return this.f93047c;
    }

    /* renamed from: e */
    public final int m97815e() {
        return this.f93046b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18473l)) {
            return false;
        }
        C18473l c18473l = (C18473l) obj;
        return this.f93045a == c18473l.f93045a && this.f93046b == c18473l.f93046b && this.f93047c == c18473l.f93047c && this.f93048d == c18473l.f93048d && AbstractC19074t.m100204b(this.f93049e, c18473l.f93049e);
    }

    public int hashCode() {
        int i11 = ((((((this.f93045a * 31) + this.f93046b) * 31) + this.f93047c) * 31) + this.f93048d) * 31;
        C3245i c3245i = this.f93049e;
        return i11 + (c3245i == null ? 0 : c3245i.hashCode());
    }

    public String toString() {
        return "PopupViewRectParam(left=" + this.f93045a + ", top=" + this.f93046b + ", right=" + this.f93047c + ", bottom=" + this.f93048d + ", category=" + this.f93049e + ")";
    }
}
