package gr;

import androidx.work.AbstractC2144f;
import bo.C3054x;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p716zh.C32123ta;

/* renamed from: gr.a */
/* loaded from: classes4.dex */
public final class C19589a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f97313a;

    /* renamed from: b */
    private C32123ta f97314b;

    /* renamed from: c */
    private boolean f97315c;

    /* renamed from: d */
    private String f97316d;

    /* renamed from: e */
    private String f97317e;

    /* renamed from: f */
    private int f97318f;

    /* renamed from: g */
    private int f97319g;

    /* renamed from: h */
    private C3054x f97320h;

    /* renamed from: i */
    private boolean f97321i;

    /* renamed from: gr.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19589a(int i11, C32123ta c32123ta, boolean z11, String str, String str2, int i12, int i13, C3054x c3054x, boolean z12) {
        AbstractC19074t.m100208f(c32123ta, "storyItem");
        AbstractC19074t.m100208f(str, "day");
        AbstractC19074t.m100208f(str2, "month");
        AbstractC19074t.m100208f(c3054x, "emptyContentData");
        this.f97313a = i11;
        this.f97314b = c32123ta;
        this.f97315c = z11;
        this.f97316d = str;
        this.f97317e = str2;
        this.f97318f = i12;
        this.f97319g = i13;
        this.f97320h = c3054x;
        this.f97321i = z12;
    }

    /* renamed from: a */
    public final String m102536a() {
        return this.f97316d;
    }

    /* renamed from: b */
    public final C3054x m102537b() {
        return this.f97320h;
    }

    /* renamed from: c */
    public final int m102538c() {
        return this.f97319g;
    }

    /* renamed from: d */
    public final int m102539d() {
        return this.f97318f;
    }

    /* renamed from: e */
    public final String m102540e() {
        return this.f97317e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19589a)) {
            return false;
        }
        C19589a c19589a = (C19589a) obj;
        return this.f97313a == c19589a.f97313a && AbstractC19074t.m100204b(this.f97314b, c19589a.f97314b) && this.f97315c == c19589a.f97315c && AbstractC19074t.m100204b(this.f97316d, c19589a.f97316d) && AbstractC19074t.m100204b(this.f97317e, c19589a.f97317e) && this.f97318f == c19589a.f97318f && this.f97319g == c19589a.f97319g && AbstractC19074t.m100204b(this.f97320h, c19589a.f97320h) && this.f97321i == c19589a.f97321i;
    }

    /* renamed from: f */
    public final int m102541f() {
        return this.f97313a;
    }

    /* renamed from: g */
    public final boolean m102542g() {
        return this.f97315c;
    }

    /* renamed from: h */
    public final C32123ta m102543h() {
        return this.f97314b;
    }

    public int hashCode() {
        return (((((((((((((((this.f97313a * 31) + this.f97314b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f97315c)) * 31) + this.f97316d.hashCode()) * 31) + this.f97317e.hashCode()) * 31) + this.f97318f) * 31) + this.f97319g) * 31) + this.f97320h.hashCode()) * 31) + AbstractC2144f.m11520a(this.f97321i);
    }

    /* renamed from: i */
    public final void m102544i(int i11) {
        this.f97319g = i11;
    }

    /* renamed from: j */
    public final void m102545j(int i11) {
        this.f97318f = i11;
    }

    /* renamed from: k */
    public final void m102546k(int i11) {
        this.f97313a = i11;
    }

    public String toString() {
        return "StoryArchiveAdapterData(rowType=" + this.f97313a + ", storyItem=" + this.f97314b + ", shouldShowDate=" + this.f97315c + ", day=" + this.f97316d + ", month=" + this.f97317e + ", footerPosition=" + this.f97318f + ", errorCode=" + this.f97319g + ", emptyContentData=" + this.f97320h + ", shouldAnimHighLight=" + this.f97321i + ")";
    }

    public /* synthetic */ C19589a(int i11, C32123ta c32123ta, boolean z11, String str, String str2, int i12, int i13, C3054x c3054x, boolean z12, int i14, AbstractC19060k abstractC19060k) {
        this(i11, (i14 & 2) != 0 ? new C32123ta() : c32123ta, (i14 & 4) != 0 ? false : z11, (i14 & 8) != 0 ? "" : str, (i14 & 16) == 0 ? str2 : "", (i14 & 32) != 0 ? 1 : i12, (i14 & 64) != 0 ? 50001 : i13, (i14 & 128) != 0 ? new C3054x(false, 1, null) : c3054x, (i14 & 256) == 0 ? z12 : false);
    }
}
