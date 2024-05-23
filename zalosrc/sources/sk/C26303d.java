package sk;

import fn0.AbstractC19074t;
import java.util.List;
import p612wk.AbstractC29072d;

/* renamed from: sk.d */
/* loaded from: classes3.dex */
public final class C26303d {

    /* renamed from: a */
    private final EnumC26306g f124948a;

    /* renamed from: b */
    private String f124949b;

    /* renamed from: c */
    private final List f124950c;

    /* renamed from: d */
    private AbstractC29072d f124951d;

    public C26303d(EnumC26306g enumC26306g, String str, List list, AbstractC29072d abstractC29072d) {
        AbstractC19074t.m100208f(enumC26306g, "sectionType");
        AbstractC19074t.m100208f(str, "param");
        AbstractC19074t.m100208f(list, "data");
        AbstractC19074t.m100208f(abstractC29072d, "state");
        this.f124948a = enumC26306g;
        this.f124949b = str;
        this.f124950c = list;
        this.f124951d = abstractC29072d;
    }

    /* renamed from: a */
    public final List m135423a() {
        return this.f124950c;
    }

    /* renamed from: b */
    public final String m135424b() {
        return this.f124949b;
    }

    /* renamed from: c */
    public final EnumC26306g m135425c() {
        return this.f124948a;
    }

    /* renamed from: d */
    public final AbstractC29072d m135426d() {
        return this.f124951d;
    }

    /* renamed from: e */
    public final void m135427e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f124949b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26303d)) {
            return false;
        }
        C26303d c26303d = (C26303d) obj;
        return this.f124948a == c26303d.f124948a && AbstractC19074t.m100204b(this.f124949b, c26303d.f124949b) && AbstractC19074t.m100204b(this.f124950c, c26303d.f124950c) && AbstractC19074t.m100204b(this.f124951d, c26303d.f124951d);
    }

    /* renamed from: f */
    public final void m135428f(AbstractC29072d abstractC29072d) {
        AbstractC19074t.m100208f(abstractC29072d, "<set-?>");
        this.f124951d = abstractC29072d;
    }

    public int hashCode() {
        return (((((this.f124948a.hashCode() * 31) + this.f124949b.hashCode()) * 31) + this.f124950c.hashCode()) * 31) + this.f124951d.hashCode();
    }

    public String toString() {
        return "SectionDataDiscovery(sectionType=" + this.f124948a + ", param=" + this.f124949b + ", data=" + this.f124950c + ", state=" + this.f124951d + ")";
    }
}
