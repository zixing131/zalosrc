package k50;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import n50.InterfaceC23567a;

/* renamed from: k50.b */
/* loaded from: classes5.dex */
public final class C21474b {

    /* renamed from: a */
    private C21473a f104494a;

    /* renamed from: b */
    private String f104495b;

    /* renamed from: c */
    private String f104496c;

    /* renamed from: d */
    private boolean f104497d;

    /* renamed from: k50.b$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC23567a {

        /* renamed from: a */
        private final C21474b f104498a;

        public a(C21474b c21474b) {
            AbstractC19074t.m100208f(c21474b, "categoryData");
            this.f104498a = c21474b;
        }

        /* renamed from: a */
        public final C21474b m111083a() {
            return this.f104498a;
        }
    }

    public C21474b(C21473a c21473a, String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(c21473a, "ringtoneCategory");
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "icon");
        this.f104494a = c21473a;
        this.f104495b = str;
        this.f104496c = str2;
        this.f104497d = z11;
    }

    /* renamed from: a */
    public final String m111079a() {
        return this.f104496c;
    }

    /* renamed from: b */
    public final C21473a m111080b() {
        return this.f104494a;
    }

    /* renamed from: c */
    public final String m111081c() {
        return this.f104495b;
    }

    /* renamed from: d */
    public final boolean m111082d() {
        return this.f104497d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21474b)) {
            return false;
        }
        C21474b c21474b = (C21474b) obj;
        return AbstractC19074t.m100204b(this.f104494a, c21474b.f104494a) && AbstractC19074t.m100204b(this.f104495b, c21474b.f104495b) && AbstractC19074t.m100204b(this.f104496c, c21474b.f104496c) && this.f104497d == c21474b.f104497d;
    }

    public int hashCode() {
        return (((((this.f104494a.hashCode() * 31) + this.f104495b.hashCode()) * 31) + this.f104496c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f104497d);
    }

    public String toString() {
        return "RingtoneCategoryData(ringtoneCategory=" + this.f104494a + ", title=" + this.f104495b + ", icon=" + this.f104496c + ", isSelected=" + this.f104497d + ")";
    }
}
