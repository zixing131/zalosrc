package p248iy;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: iy.c */
/* loaded from: classes.dex */
public final class C20883c {

    /* renamed from: a */
    private int f102592a;

    /* renamed from: b */
    private int f102593b;

    /* renamed from: c */
    private int f102594c;

    /* renamed from: d */
    private int f102595d;

    /* renamed from: e */
    private long f102596e;

    /* renamed from: f */
    private long f102597f;

    /* renamed from: g */
    private String f102598g;

    /* renamed from: h */
    private int f102599h;

    /* renamed from: i */
    private int f102600i;

    /* renamed from: j */
    private int f102601j;

    /* renamed from: k */
    private int f102602k;

    /* renamed from: l */
    private long f102603l;

    /* renamed from: m */
    private long f102604m;

    public C20883c(int i11, int i12, int i13, int i14, long j11, long j12, String str, int i15, int i16, int i17, int i18, long j13, long j14) {
        AbstractC19074t.m100208f(str, "err");
        this.f102592a = i11;
        this.f102593b = i12;
        this.f102594c = i13;
        this.f102595d = i14;
        this.f102596e = j11;
        this.f102597f = j12;
        this.f102598g = str;
        this.f102599h = i15;
        this.f102600i = i16;
        this.f102601j = i17;
        this.f102602k = i18;
        this.f102603l = j13;
        this.f102604m = j14;
    }

    /* renamed from: A */
    public final void m109146A(long j11) {
        this.f102596e = j11;
    }

    /* renamed from: a */
    public final long m109147a() {
        return this.f102597f;
    }

    /* renamed from: b */
    public final int m109148b() {
        return this.f102599h;
    }

    /* renamed from: c */
    public final long m109149c() {
        return this.f102604m;
    }

    /* renamed from: d */
    public final String m109150d() {
        return this.f102598g;
    }

    /* renamed from: e */
    public final int m109151e() {
        return this.f102601j;
    }

    /* renamed from: f */
    public final int m109152f() {
        return this.f102595d;
    }

    /* renamed from: g */
    public final int m109153g() {
        return this.f102594c;
    }

    /* renamed from: h */
    public final int m109154h() {
        return this.f102593b;
    }

    /* renamed from: i */
    public final int m109155i() {
        return this.f102602k;
    }

    /* renamed from: j */
    public final int m109156j() {
        return this.f102592a;
    }

    /* renamed from: k */
    public final long m109157k() {
        return this.f102603l;
    }

    /* renamed from: l */
    public final int m109158l() {
        return this.f102600i;
    }

    /* renamed from: m */
    public final long m109159m() {
        return this.f102596e;
    }

    /* renamed from: n */
    public final void m109160n(C20883c c20883c) {
        long j11;
        AbstractC19074t.m100208f(c20883c, "qosItem");
        if (this.f102599h != c20883c.f102599h) {
            return;
        }
        int i11 = c20883c.f102593b;
        if (i11 > 0) {
            this.f102596e += c20883c.f102596e;
        }
        int i12 = this.f102593b + i11;
        this.f102593b = i12;
        this.f102594c += c20883c.f102594c;
        int i13 = this.f102595d;
        if (i13 == 0) {
            this.f102603l = c20883c.f102603l;
        }
        this.f102604m = c20883c.f102604m;
        this.f102595d = i13 + c20883c.f102595d;
        if (i12 > 0) {
            j11 = this.f102596e / i12;
        } else {
            j11 = 0;
        }
        this.f102597f = j11;
        this.f102592a = c20883c.f102592a;
        this.f102600i = c20883c.f102600i;
        this.f102598g = c20883c.f102598g;
        this.f102601j = c20883c.f102601j;
        this.f102602k = c20883c.f102602k;
    }

    /* renamed from: o */
    public final void m109161o(long j11) {
        this.f102597f = j11;
    }

    /* renamed from: p */
    public final void m109162p(int i11) {
        this.f102599h = i11;
    }

    /* renamed from: q */
    public final void m109163q(long j11) {
        this.f102604m = j11;
    }

    /* renamed from: r */
    public final void m109164r(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f102598g = str;
    }

    /* renamed from: s */
    public final void m109165s(int i11) {
        this.f102601j = i11;
    }

    /* renamed from: t */
    public final void m109166t(int i11) {
        this.f102595d = i11;
    }

    /* renamed from: u */
    public final void m109167u(int i11) {
        this.f102594c = i11;
    }

    /* renamed from: v */
    public final void m109168v(int i11) {
        this.f102593b = i11;
    }

    /* renamed from: w */
    public final void m109169w(int i11) {
        this.f102602k = i11;
    }

    /* renamed from: x */
    public final void m109170x(int i11) {
        this.f102592a = i11;
    }

    /* renamed from: y */
    public final void m109171y(long j11) {
        this.f102603l = j11;
    }

    /* renamed from: z */
    public final void m109172z(int i11) {
        this.f102600i = i11;
    }

    public /* synthetic */ C20883c(int i11, int i12, int i13, int i14, long j11, long j12, String str, int i15, int i16, int i17, int i18, long j13, long j14, int i19, AbstractC19060k abstractC19060k) {
        this((i19 & 1) != 0 ? 0 : i11, (i19 & 2) != 0 ? 0 : i12, (i19 & 4) != 0 ? 0 : i13, (i19 & 8) != 0 ? 0 : i14, (i19 & 16) != 0 ? 0L : j11, (i19 & 32) != 0 ? 0L : j12, (i19 & 64) != 0 ? "" : str, (i19 & 128) != 0 ? 0 : i15, (i19 & 256) != 0 ? 0 : i16, (i19 & 512) != 0 ? 5 : i17, (i19 & 1024) != 0 ? 0 : i18, (i19 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0L : j13, (i19 & 4096) != 0 ? 0L : j14);
    }
}
