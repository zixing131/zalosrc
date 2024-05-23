package p716zh;

import dj.C17969i0;
import fn0.AbstractC19074t;
import sx.C26406h;

/* renamed from: zh.t9 */
/* loaded from: classes3.dex */
public final class C32122t9 {

    /* renamed from: a */
    private final String f148091a;

    /* renamed from: b */
    private String f148092b;

    /* renamed from: c */
    private int f148093c;

    /* renamed from: d */
    private final C17969i0 f148094d;

    /* renamed from: e */
    private final C26406h f148095e;

    public C32122t9(String str, String str2, int i11, C17969i0 c17969i0, C26406h c26406h) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "path");
        this.f148091a = str;
        this.f148092b = str2;
        this.f148093c = i11;
        this.f148094d = c17969i0;
        this.f148095e = c26406h;
    }

    /* renamed from: a */
    public final C17969i0 m155023a() {
        return this.f148094d;
    }

    /* renamed from: b */
    public final int m155024b() {
        return this.f148093c;
    }

    /* renamed from: c */
    public final String m155025c() {
        return this.f148091a;
    }

    /* renamed from: d */
    public final String m155026d() {
        return this.f148092b;
    }

    /* renamed from: e */
    public final C26406h m155027e() {
        return this.f148095e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32122t9)) {
            return false;
        }
        C32122t9 c32122t9 = (C32122t9) obj;
        return AbstractC19074t.m100204b(this.f148091a, c32122t9.f148091a) && AbstractC19074t.m100204b(this.f148092b, c32122t9.f148092b) && this.f148093c == c32122t9.f148093c && AbstractC19074t.m100204b(this.f148094d, c32122t9.f148094d) && AbstractC19074t.m100204b(this.f148095e, c32122t9.f148095e);
    }

    /* renamed from: f */
    public final void m155028f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f148092b = str;
    }

    public int hashCode() {
        int hashCode = ((((this.f148091a.hashCode() * 31) + this.f148092b.hashCode()) * 31) + this.f148093c) * 31;
        C17969i0 c17969i0 = this.f148094d;
        int hashCode2 = (hashCode + (c17969i0 == null ? 0 : c17969i0.hashCode())) * 31;
        C26406h c26406h = this.f148095e;
        return hashCode2 + (c26406h != null ? c26406h.hashCode() : 0);
    }

    public String toString() {
        return "SendRichMessageParams(ownerId=" + this.f148091a + ", path=" + this.f148092b + ", messageType=" + this.f148093c + ", chatRichContent=" + this.f148094d + ", shareMessageProperties=" + this.f148095e + ")";
    }
}
