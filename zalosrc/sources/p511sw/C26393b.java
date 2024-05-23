package p511sw;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: sw.b */
/* loaded from: classes4.dex */
public final class C26393b {

    /* renamed from: a */
    private int f125376a;

    /* renamed from: b */
    private int f125377b;

    /* renamed from: c */
    private int f125378c;

    /* renamed from: d */
    private final List f125379d;

    public C26393b(int i11, int i12, int i13, List list) {
        AbstractC19074t.m100208f(list, "itemList");
        this.f125376a = i11;
        this.f125377b = i12;
        this.f125378c = i13;
        this.f125379d = list;
    }

    /* renamed from: a */
    public final boolean m136001a(int i11) {
        int i12 = this.f125377b;
        if (i12 <= i11 && i11 <= (i12 + m136016p()) - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m136002b(int i11) {
        int i12 = this.f125376a;
        if (i12 <= i11 && i11 <= (i12 + m136016p()) - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int m136003c() {
        return (this.f125376a + m136016p()) - 1;
    }

    /* renamed from: d */
    public final InterfaceC26396e m136004d() {
        return m136006f(0);
    }

    /* renamed from: e */
    public final InterfaceC26396e m136005e() {
        if (m136011k()) {
            return m136004d();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26393b)) {
            return false;
        }
        C26393b c26393b = (C26393b) obj;
        if (this.f125376a == c26393b.f125376a && this.f125377b == c26393b.f125377b && this.f125378c == c26393b.f125378c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final InterfaceC26396e m136006f(int i11) {
        return (InterfaceC26396e) this.f125379d.get(this.f125377b + i11);
    }

    /* renamed from: g */
    public final int m136007g() {
        return this.f125376a;
    }

    /* renamed from: h */
    public final int m136008h() {
        return this.f125377b;
    }

    public int hashCode() {
        return (((this.f125376a * 31) + this.f125377b) * 31) + this.f125378c;
    }

    /* renamed from: i */
    public final int m136009i() {
        return this.f125378c;
    }

    /* renamed from: j */
    public final boolean m136010j() {
        if (m136016p() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m136011k() {
        if (m136016p() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final InterfaceC26396e m136012l() {
        return m136006f(m136016p() - 1);
    }

    /* renamed from: m */
    public final void m136013m(int i11) {
        this.f125376a = i11;
    }

    /* renamed from: n */
    public final void m136014n(int i11) {
        this.f125377b = i11;
    }

    /* renamed from: o */
    public final void m136015o(int i11) {
        this.f125378c = i11;
    }

    /* renamed from: p */
    public final int m136016p() {
        return this.f125378c;
    }

    public String toString() {
        return "ItemPageInfo(index=" + this.f125376a + ", position=" + this.f125377b + ", size=" + this.f125378c + ")";
    }
}
