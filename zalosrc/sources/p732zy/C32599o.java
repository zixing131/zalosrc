package p732zy;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zy.o */
/* loaded from: classes4.dex */
public final class C32599o {

    /* renamed from: a */
    private boolean f150669a;

    /* renamed from: b */
    private int f150670b;

    /* renamed from: c */
    private String f150671c;

    /* renamed from: d */
    private boolean f150672d;

    /* renamed from: e */
    private long f150673e;

    /* renamed from: f */
    private boolean f150674f;

    /* renamed from: g */
    private boolean f150675g;

    public C32599o(boolean z11, int i11, String str, boolean z12, long j11, boolean z13, boolean z14) {
        AbstractC19074t.m100208f(str, "sourceFillQuickMessage");
        this.f150669a = z11;
        this.f150670b = i11;
        this.f150671c = str;
        this.f150672d = z12;
        this.f150673e = j11;
        this.f150674f = z13;
        this.f150675g = z14;
    }

    /* renamed from: a */
    public final void m157879a() {
        this.f150669a = false;
        this.f150670b = -1;
        this.f150671c = "";
        this.f150672d = false;
        this.f150673e = -1L;
        this.f150674f = false;
        this.f150675g = false;
    }

    /* renamed from: b */
    public final long m157880b() {
        return this.f150673e;
    }

    /* renamed from: c */
    public final boolean m157881c() {
        return this.f150669a;
    }

    /* renamed from: d */
    public final String m157882d() {
        return this.f150671c;
    }

    /* renamed from: e */
    public final int m157883e() {
        return this.f150670b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32599o)) {
            return false;
        }
        C32599o c32599o = (C32599o) obj;
        return this.f150669a == c32599o.f150669a && this.f150670b == c32599o.f150670b && AbstractC19074t.m100204b(this.f150671c, c32599o.f150671c) && this.f150672d == c32599o.f150672d && this.f150673e == c32599o.f150673e && this.f150674f == c32599o.f150674f && this.f150675g == c32599o.f150675g;
    }

    /* renamed from: f */
    public final boolean m157884f() {
        return this.f150675g;
    }

    /* renamed from: g */
    public final boolean m157885g() {
        return this.f150672d;
    }

    /* renamed from: h */
    public final boolean m157886h() {
        return this.f150674f;
    }

    public int hashCode() {
        return (((((((((((AbstractC2144f.m11520a(this.f150669a) * 31) + this.f150670b) * 31) + this.f150671c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f150672d)) * 31) + AbstractC2147g0.m11521a(this.f150673e)) * 31) + AbstractC2144f.m11520a(this.f150674f)) * 31) + AbstractC2144f.m11520a(this.f150675g);
    }

    /* renamed from: i */
    public final void m157887i(boolean z11) {
        this.f150675g = z11;
    }

    /* renamed from: j */
    public final void m157888j(boolean z11) {
        this.f150672d = z11;
    }

    /* renamed from: k */
    public final void m157889k(long j11) {
        this.f150673e = j11;
    }

    /* renamed from: l */
    public final void m157890l(boolean z11) {
        this.f150674f = z11;
    }

    /* renamed from: m */
    public final void m157891m(boolean z11) {
        this.f150669a = z11;
    }

    /* renamed from: n */
    public final void m157892n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f150671c = str;
    }

    /* renamed from: o */
    public final void m157893o(int i11) {
        this.f150670b = i11;
    }

    public String toString() {
        return "QuickMessageLogDataCSC(showSuggestViewTypeWithPrefix=" + this.f150669a + ", suggestionQMCount=" + this.f150670b + ", sourceFillQuickMessage=" + this.f150671c + ", isFilledChatWithQM=" + this.f150672d + ", filledQMId=" + this.f150673e + ", isFirstTimeTextChangeAfterFillQM=" + this.f150674f + ", isEditedFilledQM=" + this.f150675g + ")";
    }

    public /* synthetic */ C32599o(boolean z11, int i11, String str, boolean z12, long j11, boolean z13, boolean z14, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? -1L : j11, (i12 & 32) != 0 ? false : z13, (i12 & 64) == 0 ? z14 : false);
    }
}
