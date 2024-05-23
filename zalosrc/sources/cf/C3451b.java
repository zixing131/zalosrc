package cf;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;

/* renamed from: cf.b */
/* loaded from: classes3.dex */
public final class C3451b {

    /* renamed from: a */
    private long f14514a;

    /* renamed from: b */
    private int f14515b;

    /* renamed from: c */
    private int f14516c;

    /* renamed from: d */
    private int f14517d;

    /* renamed from: e */
    private int f14518e;

    /* renamed from: f */
    private int f14519f;

    /* renamed from: g */
    private int f14520g;

    /* renamed from: h */
    private int f14521h;

    /* renamed from: i */
    private boolean f14522i;

    public C3451b() {
        this(0L, 0, 0, 0, 0, 0, 0, 0, false, 511, null);
    }

    /* renamed from: a */
    public final void m17371a(long j11) {
        this.f14514a += j11;
    }

    /* renamed from: b */
    public final int m17372b() {
        return this.f14521h;
    }

    /* renamed from: c */
    public final int m17373c() {
        return this.f14515b;
    }

    /* renamed from: d */
    public final int m17374d() {
        return this.f14516c;
    }

    /* renamed from: e */
    public final int m17375e() {
        return this.f14517d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3451b)) {
            return false;
        }
        C3451b c3451b = (C3451b) obj;
        return this.f14514a == c3451b.f14514a && this.f14515b == c3451b.f14515b && this.f14516c == c3451b.f14516c && this.f14517d == c3451b.f14517d && this.f14518e == c3451b.f14518e && this.f14519f == c3451b.f14519f && this.f14520g == c3451b.f14520g && this.f14521h == c3451b.f14521h && this.f14522i == c3451b.f14522i;
    }

    /* renamed from: f */
    public final int m17376f() {
        return this.f14518e;
    }

    /* renamed from: g */
    public final int m17377g() {
        return this.f14519f;
    }

    /* renamed from: h */
    public final int m17378h() {
        return this.f14520g;
    }

    public int hashCode() {
        return (((((((((((((((AbstractC2147g0.m11521a(this.f14514a) * 31) + this.f14515b) * 31) + this.f14516c) * 31) + this.f14517d) * 31) + this.f14518e) * 31) + this.f14519f) * 31) + this.f14520g) * 31) + this.f14521h) * 31) + AbstractC2144f.m11520a(this.f14522i);
    }

    /* renamed from: i */
    public final long m17379i() {
        return this.f14514a;
    }

    /* renamed from: j */
    public final void m17380j(int i11) {
        this.f14521h += i11;
    }

    /* renamed from: k */
    public final void m17381k(int i11) {
        this.f14515b += i11;
    }

    /* renamed from: l */
    public final void m17382l(int i11) {
        this.f14516c += i11;
    }

    /* renamed from: m */
    public final void m17383m(int i11) {
        this.f14517d += i11;
    }

    /* renamed from: n */
    public final void m17384n(int i11) {
        this.f14518e += i11;
    }

    /* renamed from: o */
    public final void m17385o(int i11) {
        this.f14519f += i11;
    }

    /* renamed from: p */
    public final void m17386p(int i11) {
        this.f14520g += i11;
    }

    /* renamed from: q */
    public final boolean m17387q() {
        return this.f14522i;
    }

    /* renamed from: r */
    public final void m17388r(boolean z11) {
        this.f14522i = z11;
    }

    public String toString() {
        return "totalTimeTrim=" + this.f14514a + " leftSideToLeft=" + this.f14515b + " leftSideToRight=" + this.f14516c + " rightSideToLeft=" + this.f14517d + " rightSideToRight=" + this.f14518e + " shiftLeft=" + this.f14519f + " shiftRight=" + this.f14520g + " changeSeekBar=" + this.f14521h + " isSaveTrimInfo=" + this.f14522i;
    }

    public C3451b(long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11) {
        this.f14514a = j11;
        this.f14515b = i11;
        this.f14516c = i12;
        this.f14517d = i13;
        this.f14518e = i14;
        this.f14519f = i15;
        this.f14520g = i16;
        this.f14521h = i17;
        this.f14522i = z11;
    }

    public /* synthetic */ C3451b(long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11, int i18, AbstractC19060k abstractC19060k) {
        this((i18 & 1) != 0 ? 0L : j11, (i18 & 2) != 0 ? 0 : i11, (i18 & 4) != 0 ? 0 : i12, (i18 & 8) != 0 ? 0 : i13, (i18 & 16) != 0 ? 0 : i14, (i18 & 32) != 0 ? 0 : i15, (i18 & 64) != 0 ? 0 : i16, (i18 & 128) != 0 ? 0 : i17, (i18 & 256) == 0 ? z11 : false);
    }
}
