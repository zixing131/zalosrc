package fn0;

import java.io.Serializable;

/* renamed from: fn0.a */
/* loaded from: classes7.dex */
public class C19040a implements InterfaceC19068o, Serializable {

    /* renamed from: p */
    protected final Object f94908p;

    /* renamed from: q */
    private final Class f94909q;

    /* renamed from: r */
    private final String f94910r;

    /* renamed from: s */
    private final String f94911s;

    /* renamed from: t */
    private final boolean f94912t;

    /* renamed from: u */
    private final int f94913u;

    /* renamed from: v */
    private final int f94914v;

    public C19040a(int i11, Object obj, Class cls, String str, String str2, int i12) {
        boolean z11;
        this.f94908p = obj;
        this.f94909q = cls;
        this.f94910r = str;
        this.f94911s = str2;
        if ((i12 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f94912t = z11;
        this.f94913u = i11;
        this.f94914v = i12 >> 1;
    }

    @Override // fn0.InterfaceC19068o
    /* renamed from: Lp */
    public int mo100147Lp() {
        return this.f94913u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19040a)) {
            return false;
        }
        C19040a c19040a = (C19040a) obj;
        if (this.f94912t == c19040a.f94912t && this.f94913u == c19040a.f94913u && this.f94914v == c19040a.f94914v && AbstractC19074t.m100204b(this.f94908p, c19040a.f94908p) && AbstractC19074t.m100204b(this.f94909q, c19040a.f94909q) && this.f94910r.equals(c19040a.f94910r) && this.f94911s.equals(c19040a.f94911s)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i11;
        int i12;
        Object obj = this.f94908p;
        int i13 = 0;
        if (obj != null) {
            i11 = obj.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = i11 * 31;
        Class cls = this.f94909q;
        if (cls != null) {
            i13 = cls.hashCode();
        }
        int hashCode = (((((i14 + i13) * 31) + this.f94910r.hashCode()) * 31) + this.f94911s.hashCode()) * 31;
        if (this.f94912t) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        return ((((hashCode + i12) * 31) + this.f94913u) * 31) + this.f94914v;
    }

    public String toString() {
        return AbstractC19061k0.m100174g(this);
    }
}
