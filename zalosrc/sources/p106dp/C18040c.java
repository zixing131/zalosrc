package p106dp;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: dp.c */
/* loaded from: classes4.dex */
public final class C18040c {

    /* renamed from: a */
    private boolean f91318a;

    /* renamed from: b */
    private boolean f91319b;

    /* renamed from: c */
    private boolean f91320c;

    /* renamed from: d */
    private boolean f91321d;

    /* renamed from: e */
    private boolean f91322e;

    /* renamed from: f */
    private float f91323f;

    /* renamed from: g */
    private int f91324g;

    /* renamed from: h */
    private boolean f91325h;

    public C18040c(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, float f11, int i11, boolean z16) {
        this.f91318a = z11;
        this.f91319b = z12;
        this.f91320c = z13;
        this.f91321d = z14;
        this.f91322e = z15;
        this.f91323f = f11;
        this.f91324g = i11;
        this.f91325h = z16;
    }

    /* renamed from: a */
    public final C18040c m95899a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, float f11, int i11, boolean z16) {
        return new C18040c(z11, z12, z13, z14, z15, f11, i11, z16);
    }

    /* renamed from: c */
    public final boolean m95900c() {
        return this.f91325h;
    }

    /* renamed from: d */
    public final boolean m95901d() {
        return this.f91322e;
    }

    /* renamed from: e */
    public final boolean m95902e() {
        return this.f91320c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18040c)) {
            return false;
        }
        C18040c c18040c = (C18040c) obj;
        return this.f91318a == c18040c.f91318a && this.f91319b == c18040c.f91319b && this.f91320c == c18040c.f91320c && this.f91321d == c18040c.f91321d && this.f91322e == c18040c.f91322e && Float.compare(this.f91323f, c18040c.f91323f) == 0 && this.f91324g == c18040c.f91324g && this.f91325h == c18040c.f91325h;
    }

    /* renamed from: f */
    public final boolean m95903f() {
        return this.f91319b;
    }

    /* renamed from: g */
    public final boolean m95904g() {
        return this.f91321d;
    }

    /* renamed from: h */
    public final boolean m95905h() {
        return this.f91318a;
    }

    public int hashCode() {
        return (((((((((((((AbstractC2144f.m11520a(this.f91318a) * 31) + AbstractC2144f.m11520a(this.f91319b)) * 31) + AbstractC2144f.m11520a(this.f91320c)) * 31) + AbstractC2144f.m11520a(this.f91321d)) * 31) + AbstractC2144f.m11520a(this.f91322e)) * 31) + Float.floatToIntBits(this.f91323f)) * 31) + this.f91324g) * 31) + AbstractC2144f.m11520a(this.f91325h);
    }

    public String toString() {
        return "FeedVideoViewState(videoThumb=" + this.f91318a + ", loadingView=" + this.f91319b + ", buttonSpeaker=" + this.f91320c + ", playButton=" + this.f91321d + ", barrierView=" + this.f91322e + ", viewRatio=" + this.f91323f + ", viewHeight=" + this.f91324g + ", animRhythmView=" + this.f91325h + ")";
    }

    public /* synthetic */ C18040c(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, float f11, int i11, boolean z16, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15, (i12 & 32) != 0 ? C18039b.f91314a.m95895a() : f11, (i12 & 64) != 0 ? 0 : i11, (i12 & 128) == 0 ? z16 : false);
    }
}
