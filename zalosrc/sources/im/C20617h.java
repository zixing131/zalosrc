package im;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: im.h */
/* loaded from: classes3.dex */
public final class C20617h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f101391a;

    /* renamed from: b */
    private final long f101392b;

    /* renamed from: c */
    private final String f101393c;

    /* renamed from: im.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C20617h(int i11, long j11, String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f101391a = i11;
        this.f101392b = j11;
        this.f101393c = str;
    }

    /* renamed from: a */
    public final String m107322a() {
        return this.f101393c;
    }

    /* renamed from: b */
    public final int m107323b() {
        return this.f101391a;
    }

    /* renamed from: c */
    public final long m107324c() {
        return this.f101392b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20617h)) {
            return false;
        }
        C20617h c20617h = (C20617h) obj;
        return this.f101391a == c20617h.f101391a && this.f101392b == c20617h.f101392b && AbstractC19074t.m100204b(this.f101393c, c20617h.f101393c);
    }

    public int hashCode() {
        return (((this.f101391a * 31) + AbstractC2147g0.m11521a(this.f101392b)) * 31) + this.f101393c.hashCode();
    }

    public String toString() {
        return "ForwardInfo(srcType=" + this.f101391a + ", timeStamp=" + this.f101392b + ", id=" + this.f101393c + ")";
    }
}
