package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class wm4 {

    /* renamed from: a */
    public final int f30015a;

    /* renamed from: b */
    public final int f30016b;

    /* renamed from: c */
    public final int f30017c;

    /* renamed from: d */
    public final int f30018d;

    /* renamed from: e */
    public final int f30019e;

    /* renamed from: f */
    public final int f30020f;

    /* renamed from: g */
    public final int f30021g;

    /* renamed from: h */
    public final int f30022h;

    /* renamed from: i */
    public final int f30023i;

    /* renamed from: j */
    public final long f30024j;

    /* renamed from: k */
    public final vm4 f30025k;

    /* renamed from: l */
    private final zzbq f30026l;

    private wm4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, vm4 vm4Var, zzbq zzbqVar) {
        this.f30015a = i11;
        this.f30016b = i12;
        this.f30017c = i13;
        this.f30018d = i14;
        this.f30019e = i15;
        this.f30020f = m27660i(i15);
        this.f30021g = i16;
        this.f30022h = i17;
        this.f30023i = m27659h(i17);
        this.f30024j = j11;
        this.f30025k = vm4Var;
        this.f30026l = zzbqVar;
    }

    /* renamed from: h */
    private static int m27659h(int i11) {
        if (i11 == 8) {
            return 1;
        }
        if (i11 == 12) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 != 20) {
            return i11 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: i */
    private static int m27660i(int i11) {
        switch (i11) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public final long m27661a() {
        long j11 = this.f30024j;
        if (j11 == 0) {
            return -9223372036854775807L;
        }
        return (j11 * 1000000) / this.f30019e;
    }

    /* renamed from: b */
    public final long m27662b(long j11) {
        return g92.m22336b0((j11 * this.f30019e) / 1000000, 0L, this.f30024j - 1);
    }

    /* renamed from: c */
    public final C4671k3 m27663c(byte[] bArr, zzbq zzbqVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i11 = this.f30018d;
        if (i11 <= 0) {
            i11 = -1;
        }
        zzbq m27664d = m27664d(zzbqVar);
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26523s("audio/flac");
        c5004t1.m26516l(i11);
        c5004t1.m26506e0(this.f30021g);
        c5004t1.m26524t(this.f30019e);
        c5004t1.m26513i(Collections.singletonList(bArr));
        c5004t1.m26517m(m27664d);
        return c5004t1.m26529y();
    }

    /* renamed from: d */
    public final zzbq m27664d(zzbq zzbqVar) {
        zzbq zzbqVar2 = this.f30026l;
        if (zzbqVar2 == null) {
            return zzbqVar;
        }
        return zzbqVar2.m28710d(zzbqVar);
    }

    /* renamed from: e */
    public final wm4 m27665e(List list) {
        return new wm4(this.f30015a, this.f30016b, this.f30017c, this.f30018d, this.f30019e, this.f30021g, this.f30022h, this.f30024j, this.f30025k, m27664d(new zzbq(list)));
    }

    /* renamed from: f */
    public final wm4 m27666f(vm4 vm4Var) {
        return new wm4(this.f30015a, this.f30016b, this.f30017c, this.f30018d, this.f30019e, this.f30021g, this.f30022h, this.f30024j, vm4Var, this.f30026l);
    }

    /* renamed from: g */
    public final wm4 m27667g(List list) {
        return new wm4(this.f30015a, this.f30016b, this.f30017c, this.f30018d, this.f30019e, this.f30021g, this.f30022h, this.f30024j, this.f30025k, m27664d(AbstractC5151x.m27758b(list)));
    }

    public wm4(byte[] bArr, int i11) {
        wz1 wz1Var = new wz1(bArr, bArr.length);
        wz1Var.m27751h(i11 * 8);
        this.f30015a = wz1Var.m27746c(16);
        this.f30016b = wz1Var.m27746c(16);
        this.f30017c = wz1Var.m27746c(24);
        this.f30018d = wz1Var.m27746c(24);
        int m27746c = wz1Var.m27746c(20);
        this.f30019e = m27746c;
        this.f30020f = m27660i(m27746c);
        this.f30021g = wz1Var.m27746c(3) + 1;
        int m27746c2 = wz1Var.m27746c(5) + 1;
        this.f30022h = m27746c2;
        this.f30023i = m27659h(m27746c2);
        this.f30024j = g92.m22350i0(wz1Var.m27746c(4), wz1Var.m27746c(32));
        this.f30025k = null;
        this.f30026l = null;
    }
}
