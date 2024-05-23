package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.yl */
/* loaded from: classes2.dex */
final class C5210yl implements InterfaceC5138wn {

    /* renamed from: a */
    private final Uri f30992a;

    /* renamed from: b */
    private final InterfaceC4840on f30993b;

    /* renamed from: c */
    private final C5247zl f30994c;

    /* renamed from: d */
    private final C4434do f30995d;

    /* renamed from: e */
    private final C4836oj f30996e;

    /* renamed from: f */
    private volatile boolean f30997f;

    /* renamed from: g */
    private boolean f30998g;

    /* renamed from: h */
    private long f30999h;

    /* renamed from: i */
    private long f31000i;

    /* renamed from: j */
    final /* synthetic */ C4359bm f31001j;

    public C5210yl(C4359bm c4359bm, Uri uri, InterfaceC4840on interfaceC4840on, C5247zl c5247zl, C4434do c4434do) {
        this.f31001j = c4359bm;
        uri.getClass();
        this.f30992a = uri;
        interfaceC4840on.getClass();
        this.f30993b = interfaceC4840on;
        c5247zl.getClass();
        this.f30994c = c5247zl;
        this.f30995d = c4434do;
        this.f30996e = new C4836oj();
        this.f30998g = true;
        this.f31000i = -1L;
    }

    /* renamed from: b */
    public final void m28224b(long j11, long j12) {
        this.f30996e.f25657a = j11;
        this.f30999h = j12;
        this.f30998g = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5138wn
    public final void zzb() {
        this.f30997f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5138wn
    public final void zzc() {
        C4577hj c4577hj;
        long j11;
        while (!this.f30997f) {
            int i11 = 0;
            try {
                long j12 = this.f30996e.f25657a;
                long mo20618b = this.f30993b.mo20618b(new C4878pn(this.f30992a, null, j12, j12, -1L, null, 0));
                this.f31000i = mo20618b;
                if (mo20618b != -1) {
                    j11 = j12;
                    mo20618b += j11;
                    this.f31000i = mo20618b;
                } else {
                    j11 = j12;
                }
                c4577hj = new C4577hj(this.f30993b, j11, mo20618b);
                try {
                    InterfaceC4614ij m28541b = this.f30994c.m28541b(c4577hj, this.f30993b.zzc());
                    if (this.f30998g) {
                        m28541b.mo20544c(j11, this.f30999h);
                        this.f30998g = false;
                    }
                    long j13 = j11;
                    int i12 = 0;
                    while (true) {
                        if (i12 != 0) {
                            break;
                        }
                        try {
                            if (!this.f30997f) {
                                this.f30995d.m21512a();
                                i12 = m28541b.mo20543b(c4577hj, this.f30996e);
                                if (c4577hj.m22917d() > C4359bm.m20577s(this.f31001j) + j13) {
                                    j13 = c4577hj.m22917d();
                                    this.f30995d.m21513b();
                                    C4359bm c4359bm = this.f31001j;
                                    C4359bm.m20578t(c4359bm).post(C4359bm.m20582x(c4359bm));
                                }
                            } else {
                                i12 = 0;
                                break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i11 = i12;
                            if (i11 != 1 && c4577hj != null) {
                                this.f30996e.f25657a = c4577hj.m22917d();
                            }
                            AbstractC4916qo.m25837m(this.f30993b);
                            throw th;
                        }
                    }
                    if (i12 != 1) {
                        this.f30996e.f25657a = c4577hj.m22917d();
                        i11 = i12;
                    }
                    AbstractC4916qo.m25837m(this.f30993b);
                    if (i11 != 0) {
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                c4577hj = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5138wn
    public final boolean zze() {
        return this.f30997f;
    }
}
