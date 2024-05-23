package pm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.C22537f;

/* renamed from: pm0.i */
/* loaded from: classes.dex */
public final class C24851i implements Comparable {

    /* renamed from: t */
    public static final a f119249t = new a(null);

    /* renamed from: u */
    public static final C24851i f119250u = C24853j.m129207a();

    /* renamed from: p */
    private final int f119251p;

    /* renamed from: q */
    private final int f119252q;

    /* renamed from: r */
    private final int f119253r;

    /* renamed from: s */
    private final int f119254s;

    /* renamed from: pm0.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24851i(int i11, int i12, int i13) {
        this.f119251p = i11;
        this.f119252q = i12;
        this.f119253r = i13;
        this.f119254s = m129201c(i11, i12, i13);
    }

    /* renamed from: c */
    private final int m129201c(int i11, int i12, int i13) {
        if (new C22537f(0, 255).m116554l(i11) && new C22537f(0, 255).m116554l(i12) && new C22537f(0, 255).m116554l(i13)) {
            return (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i11 + '.' + i12 + '.' + i13).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C24851i c24851i) {
        AbstractC19074t.m100208f(c24851i, "other");
        return this.f119254s - c24851i.f119254s;
    }

    public boolean equals(Object obj) {
        C24851i c24851i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24851i) {
            c24851i = (C24851i) obj;
        } else {
            c24851i = null;
        }
        if (c24851i != null && this.f119254s == c24851i.f119254s) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f119254s;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f119251p);
        sb2.append('.');
        sb2.append(this.f119252q);
        sb2.append('.');
        sb2.append(this.f119253r);
        return sb2.toString();
    }
}
