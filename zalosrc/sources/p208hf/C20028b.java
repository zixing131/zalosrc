package p208hf;

import fn0.AbstractC19074t;

/* renamed from: hf.b */
/* loaded from: classes3.dex */
public final class C20028b {

    /* renamed from: a */
    private final int f98464a;

    /* renamed from: b */
    private final String f98465b;

    /* renamed from: c */
    private final String f98466c;

    public C20028b(int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "fontPath");
        AbstractC19074t.m100208f(str2, "fontName");
        this.f98464a = i11;
        this.f98465b = str;
        this.f98466c = str2;
    }

    /* renamed from: a */
    public final String m103963a() {
        return this.f98466c;
    }

    /* renamed from: b */
    public final String m103964b() {
        return this.f98465b;
    }

    /* renamed from: c */
    public final int m103965c() {
        return this.f98464a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20028b)) {
            return false;
        }
        C20028b c20028b = (C20028b) obj;
        return this.f98464a == c20028b.f98464a && AbstractC19074t.m100204b(this.f98465b, c20028b.f98465b) && AbstractC19074t.m100204b(this.f98466c, c20028b.f98466c);
    }

    public int hashCode() {
        return (((this.f98464a * 31) + this.f98465b.hashCode()) * 31) + this.f98466c.hashCode();
    }

    public String toString() {
        return "LyricFontItem(id=" + this.f98464a + ", fontPath=" + this.f98465b + ", fontName=" + this.f98466c + ")";
    }
}
