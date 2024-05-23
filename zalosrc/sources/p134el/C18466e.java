package p134el;

import fn0.AbstractC19074t;

/* renamed from: el.e */
/* loaded from: classes3.dex */
public final class C18466e implements InterfaceC18463b {

    /* renamed from: a */
    private final String f93032a;

    /* renamed from: b */
    private final int f93033b;

    /* renamed from: c */
    private final int f93034c;

    public C18466e(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "emo");
        this.f93032a = str;
        this.f93033b = i11;
        this.f93034c = i12;
    }

    /* renamed from: a */
    public final String m97799a() {
        return this.f93032a;
    }

    /* renamed from: b */
    public final int m97800b() {
        return this.f93033b;
    }

    /* renamed from: c */
    public final int m97801c() {
        return this.f93034c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18466e)) {
            return false;
        }
        C18466e c18466e = (C18466e) obj;
        return AbstractC19074t.m100204b(this.f93032a, c18466e.f93032a) && this.f93033b == c18466e.f93033b && this.f93034c == c18466e.f93034c;
    }

    public int hashCode() {
        return (((this.f93032a.hashCode() * 31) + this.f93033b) * 31) + this.f93034c;
    }

    public String toString() {
        return "EmojiLongClickParam(emo=" + this.f93032a + ", x=" + this.f93033b + ", y=" + this.f93034c + ")";
    }
}
