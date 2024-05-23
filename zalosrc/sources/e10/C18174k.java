package e10;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import p559uv.C27373c;

/* renamed from: e10.k */
/* loaded from: classes5.dex */
public final class C18174k {

    /* renamed from: a */
    private final C27373c f92326a;

    /* renamed from: b */
    private final String f92327b;

    /* renamed from: c */
    private final boolean f92328c;

    /* renamed from: d */
    private final long f92329d;

    /* renamed from: e */
    private EnumC18172i f92330e;

    /* renamed from: f */
    private EnumC18172i f92331f;

    /* renamed from: g */
    private String f92332g;

    /* renamed from: h */
    private String f92333h;

    public C18174k(C27373c c27373c, String str, boolean z11) {
        AbstractC19074t.m100208f(c27373c, "videoInfo");
        AbstractC19074t.m100208f(str, "desc");
        this.f92326a = c27373c;
        this.f92327b = str;
        this.f92328c = z11;
        this.f92329d = System.currentTimeMillis();
        EnumC18172i enumC18172i = EnumC18172i.f92266p;
        this.f92330e = enumC18172i;
        this.f92331f = enumC18172i;
        this.f92332g = "";
        this.f92333h = "";
    }

    /* renamed from: a */
    public final String m96901a() {
        return this.f92327b;
    }

    /* renamed from: b */
    public final long m96902b() {
        return this.f92329d;
    }

    /* renamed from: c */
    public final boolean m96903c() {
        return this.f92328c;
    }

    /* renamed from: d */
    public final String m96904d() {
        return this.f92333h;
    }

    /* renamed from: e */
    public final EnumC18172i m96905e() {
        return this.f92331f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18174k)) {
            return false;
        }
        C18174k c18174k = (C18174k) obj;
        return AbstractC19074t.m100204b(this.f92326a, c18174k.f92326a) && AbstractC19074t.m100204b(this.f92327b, c18174k.f92327b) && this.f92328c == c18174k.f92328c;
    }

    /* renamed from: f */
    public final C27373c m96906f() {
        return this.f92326a;
    }

    /* renamed from: g */
    public final String m96907g() {
        return this.f92332g;
    }

    /* renamed from: h */
    public final void m96908h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f92333h = str;
    }

    public int hashCode() {
        return (((this.f92326a.hashCode() * 31) + this.f92327b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f92328c);
    }

    /* renamed from: i */
    public final void m96909i(EnumC18172i enumC18172i) {
        AbstractC19074t.m100208f(enumC18172i, "<set-?>");
        this.f92330e = enumC18172i;
    }

    /* renamed from: j */
    public final void m96910j(EnumC18172i enumC18172i) {
        AbstractC19074t.m100208f(enumC18172i, "<set-?>");
        this.f92331f = enumC18172i;
    }

    /* renamed from: k */
    public final void m96911k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f92332g = str;
    }

    public String toString() {
        return "UploadTask(videoInfo=" + this.f92326a + ", desc=" + this.f92327b + ", lockComment=" + this.f92328c + ")";
    }
}
