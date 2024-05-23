package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s5 */
/* loaded from: classes2.dex */
final class C4971s5 {

    /* renamed from: a */
    private final InterfaceC4928r f27547a;

    /* renamed from: b */
    private boolean f27548b;

    /* renamed from: c */
    private boolean f27549c;

    /* renamed from: d */
    private boolean f27550d;

    /* renamed from: e */
    private int f27551e;

    /* renamed from: f */
    private int f27552f;

    /* renamed from: g */
    private long f27553g;

    /* renamed from: h */
    private long f27554h;

    public C4971s5(InterfaceC4928r interfaceC4928r) {
        this.f27547a = interfaceC4928r;
    }

    /* renamed from: a */
    public final void m26248a(byte[] bArr, int i11, int i12) {
        boolean z11;
        if (this.f27549c) {
            int i13 = this.f27552f;
            int i14 = (i11 + 1) - i13;
            if (i14 < i12) {
                if (((bArr[i14] & 192) >> 6) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f27550d = z11;
                this.f27549c = false;
                return;
            }
            this.f27552f = i13 + (i12 - i11);
        }
    }

    /* renamed from: b */
    public final void m26249b(long j11, int i11, boolean z11) {
        if (this.f27551e == 182 && z11 && this.f27548b) {
            long j12 = this.f27554h;
            if (j12 != -9223372036854775807L) {
                long j13 = this.f27553g;
                this.f27547a.mo23302f(j12, this.f27550d ? 1 : 0, (int) (j11 - j13), i11, null);
            }
        }
        if (this.f27551e != 179) {
            this.f27553g = j11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26250c(int i11, long j11) {
        boolean z11;
        this.f27551e = i11;
        this.f27550d = false;
        if (i11 != 182) {
            if (i11 != 179) {
                z11 = false;
                this.f27548b = z11;
                this.f27549c = i11 == 182;
                this.f27552f = 0;
                this.f27554h = j11;
            }
            i11 = 179;
        }
        z11 = true;
        this.f27548b = z11;
        this.f27549c = i11 == 182;
        this.f27552f = 0;
        this.f27554h = j11;
    }

    /* renamed from: d */
    public final void m26251d() {
        this.f27548b = false;
        this.f27549c = false;
        this.f27550d = false;
        this.f27551e = -1;
    }
}
