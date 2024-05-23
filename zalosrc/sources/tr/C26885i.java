package tr;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nk0.C23855s0;

/* renamed from: tr.i */
/* loaded from: classes4.dex */
public final class C26885i {

    /* renamed from: a */
    private boolean f127254a;

    /* renamed from: b */
    private boolean f127255b;

    /* renamed from: c */
    private int f127256c;

    /* renamed from: d */
    private boolean f127257d;

    /* renamed from: e */
    private boolean f127258e;

    /* renamed from: f */
    private int f127259f;

    /* renamed from: g */
    private C23855s0 f127260g;

    public C26885i(boolean z11, boolean z12, int i11, boolean z13, boolean z14, int i12, C23855s0 c23855s0) {
        this.f127254a = z11;
        this.f127255b = z12;
        this.f127256c = i11;
        this.f127257d = z13;
        this.f127258e = z14;
        this.f127259f = i12;
        this.f127260g = c23855s0;
    }

    /* renamed from: a */
    public final boolean m138546a() {
        return this.f127258e;
    }

    /* renamed from: b */
    public final boolean m138547b() {
        return this.f127257d;
    }

    /* renamed from: c */
    public final boolean m138548c() {
        return this.f127254a;
    }

    /* renamed from: d */
    public final int m138549d() {
        return this.f127259f;
    }

    /* renamed from: e */
    public final boolean m138550e() {
        return this.f127255b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26885i)) {
            return false;
        }
        C26885i c26885i = (C26885i) obj;
        return this.f127254a == c26885i.f127254a && this.f127255b == c26885i.f127255b && this.f127256c == c26885i.f127256c && this.f127257d == c26885i.f127257d && this.f127258e == c26885i.f127258e && this.f127259f == c26885i.f127259f && AbstractC19074t.m100204b(this.f127260g, c26885i.f127260g);
    }

    /* renamed from: f */
    public final int m138551f() {
        return this.f127256c;
    }

    /* renamed from: g */
    public final C23855s0 m138552g() {
        return this.f127260g;
    }

    /* renamed from: h */
    public final void m138553h(boolean z11) {
        this.f127258e = z11;
    }

    public int hashCode() {
        int m11520a = ((((((((((AbstractC2144f.m11520a(this.f127254a) * 31) + AbstractC2144f.m11520a(this.f127255b)) * 31) + this.f127256c) * 31) + AbstractC2144f.m11520a(this.f127257d)) * 31) + AbstractC2144f.m11520a(this.f127258e)) * 31) + this.f127259f) * 31;
        C23855s0 c23855s0 = this.f127260g;
        return m11520a + (c23855s0 == null ? 0 : c23855s0.hashCode());
    }

    /* renamed from: i */
    public final void m138554i(boolean z11) {
        this.f127257d = z11;
    }

    /* renamed from: j */
    public final void m138555j(boolean z11) {
        this.f127254a = z11;
    }

    /* renamed from: k */
    public final void m138556k(int i11) {
        this.f127259f = i11;
    }

    /* renamed from: l */
    public final void m138557l(boolean z11) {
        this.f127255b = z11;
    }

    /* renamed from: m */
    public final void m138558m(int i11) {
        this.f127256c = i11;
    }

    /* renamed from: n */
    public final void m138559n(C23855s0 c23855s0) {
        this.f127260g = c23855s0;
    }

    public String toString() {
        return "TimelineVideoChannelConfig(forceShowLayoutLoading=" + this.f127254a + ", retryClicked=" + this.f127255b + ", retryCount=" + this.f127256c + ", forceHideSection=" + this.f127257d + ", forceClearData=" + this.f127258e + ", layoutHeight=" + this.f127259f + ", zinstantRoot=" + this.f127260g + ")";
    }

    public /* synthetic */ C26885i(boolean z11, boolean z12, int i11, boolean z13, boolean z14, int i12, C23855s0 c23855s0, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? false : z12, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) == 0 ? i12 : 0, (i13 & 64) != 0 ? null : c23855s0);
    }
}
