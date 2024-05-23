package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.n6 */
/* loaded from: classes2.dex */
public final class C4786n6 implements jm4 {

    /* renamed from: l */
    public static final qm4 f25041l = new qm4() { // from class: com.google.android.gms.internal.ads.k6
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4786n6()};
        }
    };

    /* renamed from: e */
    private boolean f25046e;

    /* renamed from: f */
    private boolean f25047f;

    /* renamed from: g */
    private boolean f25048g;

    /* renamed from: h */
    private long f25049h;

    /* renamed from: i */
    private C4601i6 f25050i;

    /* renamed from: j */
    private mm4 f25051j;

    /* renamed from: k */
    private boolean f25052k;

    /* renamed from: a */
    private final a72 f25042a = new a72(0);

    /* renamed from: c */
    private final x02 f25044c = new x02(4096);

    /* renamed from: b */
    private final SparseArray f25043b = new SparseArray();

    /* renamed from: d */
    private final C4637j6 f25045d = new C4637j6();

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        byte[] bArr = new byte[14];
        yl4 yl4Var = (yl4) km4Var;
        yl4Var.mo23963f(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        yl4Var.m28247k(bArr[13] & 7, false);
        yl4Var.mo23963f(bArr, 0, 3, false);
        if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f25051j = mm4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:            if (r0 != r7) goto L10;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo19971e(long j11, long j12) {
        C4601i6 c4601i6;
        int i11;
        a72 a72Var = this.f25042a;
        if (a72Var.m20017e() != -9223372036854775807L) {
            long m20015c = a72Var.m20015c();
            if (m20015c != -9223372036854775807L) {
                if (m20015c != 0) {
                }
            }
            c4601i6 = this.f25050i;
            if (c4601i6 != null) {
                c4601i6.m26992d(j12);
            }
            for (i11 = 0; i11 < this.f25043b.size(); i11++) {
                ((C4711l6) this.f25043b.valueAt(i11)).m24134b();
            }
        }
        a72Var.m20018f(j12);
        c4601i6 = this.f25050i;
        if (c4601i6 != null) {
        }
        while (i11 < this.f25043b.size()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        long j11;
        InterfaceC4822o5 c4897q5;
        v71.m27171b(this.f25051j);
        long zzd = km4Var.zzd();
        if (zzd != -1) {
            C4637j6 c4637j6 = this.f25045d;
            if (!c4637j6.m23547e()) {
                return c4637j6.m23544a(km4Var, c4667k);
            }
        }
        if (!this.f25052k) {
            this.f25052k = true;
            C4637j6 c4637j62 = this.f25045d;
            if (c4637j62.m23545b() != -9223372036854775807L) {
                C4601i6 c4601i6 = new C4601i6(c4637j62.m23546d(), c4637j62.m23545b(), zzd);
                this.f25050i = c4601i6;
                this.f25051j.mo21603f(c4601i6.m26990b());
            } else {
                this.f25051j.mo21603f(new C4741m(c4637j62.m23545b(), 0L));
            }
        }
        C4601i6 c4601i62 = this.f25050i;
        if (c4601i62 != null && c4601i62.m26993e()) {
            return c4601i62.m26989a(km4Var, c4667k);
        }
        km4Var.zzj();
        if (zzd != -1) {
            j11 = zzd - km4Var.zze();
        } else {
            j11 = -1;
        }
        if ((j11 != -1 && j11 < 4) || !km4Var.mo23963f(this.f25044c.m27777h(), 0, 4, true)) {
            return -1;
        }
        this.f25044c.m27775f(0);
        int m27782m = this.f25044c.m27782m();
        if (m27782m == 441) {
            return -1;
        }
        if (m27782m == 442) {
            yl4 yl4Var = (yl4) km4Var;
            yl4Var.mo23963f(this.f25044c.m27777h(), 0, 10, false);
            this.f25044c.m27775f(9);
            yl4Var.m28248l((this.f25044c.m27788s() & 7) + 14, false);
            return 0;
        }
        if (m27782m == 443) {
            yl4 yl4Var2 = (yl4) km4Var;
            yl4Var2.mo23963f(this.f25044c.m27777h(), 0, 2, false);
            this.f25044c.m27775f(0);
            yl4Var2.m28248l(this.f25044c.m27792w() + 6, false);
            return 0;
        }
        if ((m27782m >> 8) != 1) {
            ((yl4) km4Var).m28248l(1, false);
            return 0;
        }
        int i11 = m27782m & 255;
        C4711l6 c4711l6 = (C4711l6) this.f25043b.get(i11);
        if (!this.f25046e) {
            if (c4711l6 == null) {
                InterfaceC4822o5 interfaceC4822o5 = null;
                if (i11 == 189) {
                    c4897q5 = new C4415d5(null);
                    this.f25047f = true;
                    this.f25049h = km4Var.zzf();
                } else if ((m27782m & 224) == 192) {
                    c4897q5 = new C4379c6(null);
                    this.f25047f = true;
                    this.f25049h = km4Var.zzf();
                } else {
                    if ((m27782m & 240) == 224) {
                        c4897q5 = new C4897q5(null);
                        this.f25048g = true;
                        this.f25049h = km4Var.zzf();
                    }
                    if (interfaceC4822o5 != null) {
                        interfaceC4822o5.mo20010b(this.f25051j, new C4344b7(Integer.MIN_VALUE, i11, 256));
                        c4711l6 = new C4711l6(interfaceC4822o5, this.f25042a);
                        this.f25043b.put(i11, c4711l6);
                    }
                }
                interfaceC4822o5 = c4897q5;
                if (interfaceC4822o5 != null) {
                }
            }
            long j12 = 1048576;
            if (this.f25047f && this.f25048g) {
                j12 = 8192 + this.f25049h;
            }
            if (km4Var.zzf() > j12) {
                this.f25046e = true;
                this.f25051j.zzC();
            }
        }
        yl4 yl4Var3 = (yl4) km4Var;
        yl4Var3.mo23963f(this.f25044c.m27777h(), 0, 2, false);
        this.f25044c.m27775f(0);
        int m27792w = this.f25044c.m27792w() + 6;
        if (c4711l6 == null) {
            yl4Var3.m28248l(m27792w, false);
        } else {
            this.f25044c.m27772c(m27792w);
            yl4Var3.mo23962e(this.f25044c.m27777h(), 0, m27792w, false);
            this.f25044c.m27775f(6);
            c4711l6.m24133a(this.f25044c);
            x02 x02Var = this.f25044c;
            x02Var.m27774e(x02Var.m27779j());
        }
        return 0;
    }
}
