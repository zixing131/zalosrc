package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y5 */
/* loaded from: classes2.dex */
final class C5194y5 {

    /* renamed from: a */
    private final InterfaceC4928r f30762a;

    /* renamed from: b */
    private long f30763b;

    /* renamed from: c */
    private boolean f30764c;

    /* renamed from: d */
    private int f30765d;

    /* renamed from: e */
    private long f30766e;

    /* renamed from: f */
    private boolean f30767f;

    /* renamed from: g */
    private boolean f30768g;

    /* renamed from: h */
    private boolean f30769h;

    /* renamed from: i */
    private boolean f30770i;

    /* renamed from: j */
    private boolean f30771j;

    /* renamed from: k */
    private long f30772k;

    /* renamed from: l */
    private long f30773l;

    /* renamed from: m */
    private boolean f30774m;

    public C5194y5(InterfaceC4928r interfaceC4928r) {
        this.f30762a = interfaceC4928r;
    }

    /* renamed from: e */
    private final void m28126e(int i11) {
        long j11 = this.f30773l;
        if (j11 == -9223372036854775807L) {
            return;
        }
        boolean z11 = this.f30774m;
        long j12 = this.f30763b;
        long j13 = this.f30772k;
        this.f30762a.mo23302f(j11, z11 ? 1 : 0, (int) (j12 - j13), i11, null);
    }

    /* renamed from: a */
    public final void m28127a(long j11, int i11, boolean z11) {
        if (this.f30771j && this.f30768g) {
            this.f30774m = this.f30764c;
            this.f30771j = false;
        } else {
            if (!this.f30769h && !this.f30768g) {
                return;
            }
            if (z11 && this.f30770i) {
                m28126e(i11 + ((int) (j11 - this.f30763b)));
            }
            this.f30772k = this.f30763b;
            this.f30773l = this.f30766e;
            this.f30774m = this.f30764c;
            this.f30770i = true;
        }
    }

    /* renamed from: b */
    public final void m28128b(byte[] bArr, int i11, int i12) {
        boolean z11;
        if (this.f30767f) {
            int i13 = this.f30765d;
            int i14 = (i11 + 2) - i13;
            if (i14 < i12) {
                if ((bArr[i14] & 128) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f30768g = z11;
                this.f30767f = false;
                return;
            }
            this.f30765d = i13 + (i12 - i11);
        }
    }

    /* renamed from: c */
    public final void m28129c() {
        this.f30767f = false;
        this.f30768g = false;
        this.f30769h = false;
        this.f30770i = false;
        this.f30771j = false;
    }

    /* renamed from: d */
    public final void m28130d(long j11, int i11, int i12, long j12, boolean z11) {
        boolean z12;
        boolean z13 = false;
        this.f30768g = false;
        this.f30769h = false;
        this.f30766e = j12;
        this.f30765d = 0;
        this.f30763b = j11;
        if (i12 >= 32 && i12 != 40) {
            if (this.f30770i && !this.f30771j) {
                if (z11) {
                    m28126e(i11);
                }
                this.f30770i = false;
            }
            if (i12 <= 35 || i12 == 39) {
                this.f30769h = !this.f30771j;
                this.f30771j = true;
            }
        }
        if (i12 >= 16 && i12 <= 21) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f30764c = z12;
        if (z12 || i12 <= 9) {
            z13 = true;
        }
        this.f30767f = z13;
    }
}
