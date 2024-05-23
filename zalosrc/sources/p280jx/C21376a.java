package p280jx;

import p220hx.AbstractC20163a;

/* renamed from: jx.a */
/* loaded from: classes4.dex */
public class C21376a extends AbstractC20163a {

    /* renamed from: p */
    public boolean f104255p;

    /* renamed from: q */
    public final C21379d f104256q = new C21379d();

    /* renamed from: r */
    public final C21379d f104257r = new C21379d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C21376a c21376a = (C21376a) obj;
        if (this.f104255p != c21376a.f104255p || !this.f104256q.equals(c21376a.f104256q)) {
            return false;
        }
        return this.f104257r.equals(c21376a.f104257r);
    }

    public int hashCode() {
        return ((((this.f104255p ? 1 : 0) * 31) + this.f104256q.hashCode()) * 31) + this.f104257r.hashCode();
    }
}
