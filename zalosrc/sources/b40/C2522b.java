package b40;

import fn0.AbstractC19074t;

/* renamed from: b40.b */
/* loaded from: classes5.dex */
public final class C2522b {

    /* renamed from: a */
    private final int f10249a;

    /* renamed from: b */
    private final String f10250b;

    public C2522b(int i11, String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        this.f10249a = i11;
        this.f10250b = str;
    }

    /* renamed from: a */
    public final String m12636a() {
        return this.f10250b;
    }

    /* renamed from: b */
    public final int m12637b() {
        return this.f10249a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2522b)) {
            return false;
        }
        C2522b c2522b = (C2522b) obj;
        return this.f10249a == c2522b.f10249a && AbstractC19074t.m100204b(this.f10250b, c2522b.f10250b);
    }

    public int hashCode() {
        return (this.f10249a * 31) + this.f10250b.hashCode();
    }

    public String toString() {
        return "AIStickerLogInfo(posInCate=" + this.f10249a + ", entryPoint=" + this.f10250b + ")";
    }
}
