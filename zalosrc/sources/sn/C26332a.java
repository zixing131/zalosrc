package sn;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p361nb.C23669z;

/* renamed from: sn.a */
/* loaded from: classes4.dex */
public final class C26332a {

    /* renamed from: a */
    private int f125005a;

    /* renamed from: b */
    private long f125006b;

    /* renamed from: c */
    private long f125007c;

    /* renamed from: d */
    private int f125008d;

    /* renamed from: e */
    private C23669z f125009e;

    /* renamed from: f */
    private String f125010f;

    /* renamed from: g */
    private int f125011g;

    /* renamed from: h */
    private int f125012h;

    public C26332a(int i11, long j11, long j12, int i12, C23669z c23669z, String str, int i13, int i14) {
        AbstractC19074t.m100208f(c23669z, "trackingInfo");
        AbstractC19074t.m100208f(str, "zVideoID");
        this.f125005a = i11;
        this.f125006b = j11;
        this.f125007c = j12;
        this.f125008d = i12;
        this.f125009e = c23669z;
        this.f125010f = str;
        this.f125011g = i13;
        this.f125012h = i14;
    }

    /* renamed from: a */
    public final int m135485a() {
        return this.f125008d;
    }

    /* renamed from: b */
    public final long m135486b() {
        return this.f125007c;
    }

    /* renamed from: c */
    public final long m135487c() {
        return this.f125006b;
    }

    /* renamed from: d */
    public final C23669z m135488d() {
        return this.f125009e;
    }

    /* renamed from: e */
    public final int m135489e() {
        return this.f125005a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26332a)) {
            return false;
        }
        C26332a c26332a = (C26332a) obj;
        return this.f125005a == c26332a.f125005a && this.f125006b == c26332a.f125006b && this.f125007c == c26332a.f125007c && this.f125008d == c26332a.f125008d && AbstractC19074t.m100204b(this.f125009e, c26332a.f125009e) && AbstractC19074t.m100204b(this.f125010f, c26332a.f125010f) && this.f125011g == c26332a.f125011g && this.f125012h == c26332a.f125012h;
    }

    /* renamed from: f */
    public final int m135490f() {
        return this.f125012h;
    }

    /* renamed from: g */
    public final String m135491g() {
        return this.f125010f;
    }

    /* renamed from: h */
    public final int m135492h() {
        return this.f125011g;
    }

    public int hashCode() {
        return (((((((((((((this.f125005a * 31) + AbstractC2147g0.m11521a(this.f125006b)) * 31) + AbstractC2147g0.m11521a(this.f125007c)) * 31) + this.f125008d) * 31) + this.f125009e.hashCode()) * 31) + this.f125010f.hashCode()) * 31) + this.f125011g) * 31) + this.f125012h;
    }

    /* renamed from: i */
    public final void m135493i(int i11) {
        this.f125008d = i11;
    }

    /* renamed from: j */
    public final void m135494j(long j11) {
        this.f125007c = j11;
    }

    /* renamed from: k */
    public final void m135495k(long j11) {
        this.f125006b = j11;
    }

    /* renamed from: l */
    public final void m135496l(C23669z c23669z) {
        AbstractC19074t.m100208f(c23669z, "<set-?>");
        this.f125009e = c23669z;
    }

    /* renamed from: m */
    public final void m135497m(int i11) {
        this.f125005a = i11;
    }

    /* renamed from: n */
    public final void m135498n(int i11) {
        this.f125012h = i11;
    }

    /* renamed from: o */
    public final void m135499o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f125010f = str;
    }

    /* renamed from: p */
    public final void m135500p(int i11) {
        this.f125011g = i11;
    }

    public String toString() {
        return "FeedImpressionTrackingData(type=" + this.f125005a + ", startTime=" + this.f125006b + ", endTime=" + this.f125007c + ", averageVideoFeedFPS=" + this.f125008d + ", trackingInfo=" + this.f125009e + ", zVideoID=" + this.f125010f + ", zVideoPreviewTime=" + this.f125011g + ", zVideoAutoPlay=" + this.f125012h + ")";
    }

    public /* synthetic */ C26332a(int i11, long j11, long j12, int i12, C23669z c23669z, String str, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0L : j11, (i15 & 4) == 0 ? j12 : 0L, (i15 & 8) != 0 ? -1 : i12, (i15 & 16) != 0 ? new C23669z() : c23669z, (i15 & 32) != 0 ? "" : str, (i15 & 64) != 0 ? 0 : i13, (i15 & 128) == 0 ? i14 : 0);
    }
}
