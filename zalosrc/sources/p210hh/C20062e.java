package p210hh;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: hh.e */
/* loaded from: classes3.dex */
public final class C20062e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f98650a;

    /* renamed from: b */
    private int f98651b;

    /* renamed from: hh.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C20062e(String str, int i11) {
        AbstractC19074t.m100208f(str, "name");
        this.f98650a = str;
        this.f98651b = i11;
    }

    /* renamed from: a */
    public final int m104230a() {
        return this.f98651b;
    }

    /* renamed from: b */
    public final String m104231b() {
        return this.f98650a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20062e)) {
            return false;
        }
        C20062e c20062e = (C20062e) obj;
        return AbstractC19074t.m100204b(this.f98650a, c20062e.f98650a) && this.f98651b == c20062e.f98651b;
    }

    public int hashCode() {
        return (this.f98650a.hashCode() * 31) + this.f98651b;
    }

    public String toString() {
        return "TagNameTruncatedInfo(name=" + this.f98650a + ", maxLength=" + this.f98651b + ")";
    }
}
