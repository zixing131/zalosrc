package c50;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: c50.e */
/* loaded from: classes5.dex */
public final class C3294e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f14094a;

    /* renamed from: b */
    private int f14095b;

    /* renamed from: c */
    private final C3295f f14096c;

    /* renamed from: d */
    private int f14097d;

    /* renamed from: e */
    private boolean f14098e;

    /* renamed from: c50.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C3294e(int i11, int i12, C3295f c3295f, int i13, boolean z11) {
        AbstractC19074t.m100208f(c3295f, "syncTextSpanInfo");
        this.f14094a = i11;
        this.f14095b = i12;
        this.f14096c = c3295f;
        this.f14097d = i13;
        this.f14098e = z11;
    }

    /* renamed from: a */
    public final int m16713a() {
        return this.f14095b;
    }

    /* renamed from: b */
    public final int m16714b() {
        return this.f14097d;
    }

    /* renamed from: c */
    public final C3295f m16715c() {
        return this.f14096c;
    }

    /* renamed from: d */
    public final boolean m16716d() {
        return this.f14098e;
    }

    /* renamed from: e */
    public final void m16717e(int i11) {
        this.f14095b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3294e)) {
            return false;
        }
        C3294e c3294e = (C3294e) obj;
        return this.f14094a == c3294e.f14094a && this.f14095b == c3294e.f14095b && AbstractC19074t.m100204b(this.f14096c, c3294e.f14096c) && this.f14097d == c3294e.f14097d && this.f14098e == c3294e.f14098e;
    }

    /* renamed from: f */
    public final void m16718f(int i11) {
        this.f14097d = i11;
    }

    public int hashCode() {
        return (((((((this.f14094a * 31) + this.f14095b) * 31) + this.f14096c.hashCode()) * 31) + this.f14097d) * 31) + AbstractC2144f.m11520a(this.f14098e);
    }

    public String toString() {
        return "SyncStateData(actionType=" + this.f14094a + ", actionState=" + this.f14095b + ", syncTextSpanInfo=" + this.f14096c + ", percentProcessed=" + this.f14097d + ", isIndeterminateProgress=" + this.f14098e + ")";
    }

    public /* synthetic */ C3294e(int i11, int i12, C3295f c3295f, int i13, boolean z11, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? new C3295f(null, 0, 0, 0, 0, 31, null) : c3295f, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) == 0 ? z11 : false);
    }
}
