package p134el;

import fn0.AbstractC19074t;

/* renamed from: el.c */
/* loaded from: classes3.dex */
public final class C18464c implements InterfaceC18463b {

    /* renamed from: a */
    private final String f93028a;

    /* renamed from: b */
    private final int f93029b;

    /* renamed from: c */
    private final int f93030c;

    public C18464c(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "emo");
        this.f93028a = str;
        this.f93029b = i11;
        this.f93030c = i12;
    }

    /* renamed from: a */
    public final String m97795a() {
        return this.f93028a;
    }

    /* renamed from: b */
    public final int m97796b() {
        return this.f93029b;
    }

    /* renamed from: c */
    public final int m97797c() {
        return this.f93030c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18464c)) {
            return false;
        }
        C18464c c18464c = (C18464c) obj;
        return AbstractC19074t.m100204b(this.f93028a, c18464c.f93028a) && this.f93029b == c18464c.f93029b && this.f93030c == c18464c.f93030c;
    }

    public int hashCode() {
        return (((this.f93028a.hashCode() * 31) + this.f93029b) * 31) + this.f93030c;
    }

    public String toString() {
        return "EmojiClickParam(emo=" + this.f93028a + ", x=" + this.f93029b + ", y=" + this.f93030c + ")";
    }
}
