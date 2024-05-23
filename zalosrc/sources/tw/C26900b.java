package tw;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: tw.b */
/* loaded from: classes4.dex */
public final class C26900b {

    /* renamed from: a */
    private int f127298a;

    /* renamed from: b */
    private boolean f127299b;

    public C26900b(int i11, boolean z11) {
        this.f127298a = i11;
        this.f127299b = z11;
    }

    /* renamed from: a */
    public final void m138635a() {
        this.f127298a--;
    }

    /* renamed from: b */
    public final int m138636b() {
        return this.f127298a;
    }

    /* renamed from: c */
    public final void m138637c() {
        this.f127298a++;
    }

    /* renamed from: d */
    public final boolean m138638d() {
        return this.f127299b;
    }

    /* renamed from: e */
    public final void m138639e() {
        this.f127299b = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26900b)) {
            return false;
        }
        C26900b c26900b = (C26900b) obj;
        return this.f127298a == c26900b.f127298a && this.f127299b == c26900b.f127299b;
    }

    /* renamed from: f */
    public final void m138640f() {
        this.f127299b = true;
    }

    /* renamed from: g */
    public final void m138641g() {
        this.f127298a = 0;
        this.f127299b = false;
    }

    /* renamed from: h */
    public final void m138642h(int i11) {
        this.f127298a = i11;
        this.f127299b = true;
    }

    public int hashCode() {
        return (this.f127298a * 31) + AbstractC2144f.m11520a(this.f127299b);
    }

    public String toString() {
        return "DBRowCount(count=" + this.f127298a + ", isRealCount=" + this.f127299b + ")";
    }

    public /* synthetic */ C26900b(int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? false : z11);
    }
}
