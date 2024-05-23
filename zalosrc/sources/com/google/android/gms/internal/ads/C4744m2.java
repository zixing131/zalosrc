package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.m2 */
/* loaded from: classes2.dex */
public final class C4744m2 implements InterfaceC4819o2 {

    /* renamed from: a */
    private final byte[] f24342a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque f24343b = new ArrayDeque();

    /* renamed from: c */
    private final C5079v2 f24344c = new C5079v2();

    /* renamed from: d */
    private InterfaceC4782n2 f24345d;

    /* renamed from: e */
    private int f24346e;

    /* renamed from: f */
    private int f24347f;

    /* renamed from: g */
    private long f24348g;

    /* renamed from: c */
    private final long m24445c(km4 km4Var, int i11) {
        ((yl4) km4Var).mo23962e(this.f24342a, 0, i11, false);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | (this.f24342a[i12] & 255);
        }
        return j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0087, code lost:            if (r0 == 1) goto L112;     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4819o2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo24446a(km4 km4Var) {
        String str;
        double longBitsToDouble;
        yl4 yl4Var;
        int m27123b;
        int m27124c;
        long j11;
        int i11;
        v71.m27171b(this.f24345d);
        while (true) {
            C4707l2 c4707l2 = (C4707l2) this.f24343b.peek();
            if (c4707l2 != null) {
                long zzf = km4Var.zzf();
                j11 = c4707l2.f23694b;
                if (zzf >= j11) {
                    InterfaceC4782n2 interfaceC4782n2 = this.f24345d;
                    i11 = ((C4707l2) this.f24343b.pop()).f23693a;
                    ((C4931r2) interfaceC4782n2).f27042a.m26554h(i11);
                    return true;
                }
            }
            int i12 = this.f24346e;
            if (i12 == 0) {
                long m27126d = this.f24344c.m27126d(km4Var, true, false, 4);
                if (m27126d == -2) {
                    km4Var.zzj();
                    while (true) {
                        yl4Var = (yl4) km4Var;
                        yl4Var.mo23963f(this.f24342a, 0, 4, false);
                        m27123b = C5079v2.m27123b(this.f24342a[0]);
                        if (m27123b != -1 && m27123b <= 4) {
                            m27124c = (int) C5079v2.m27124c(this.f24342a, m27123b, false);
                            C5005t2 c5005t2 = ((C4931r2) this.f24345d).f27042a;
                            if (C5005t2.m26541o(m27124c)) {
                                break;
                            }
                        }
                        yl4Var.m28248l(1, false);
                    }
                    yl4Var.m28248l(m27123b, false);
                    m27126d = m27124c;
                }
                if (m27126d == -1) {
                    return false;
                }
                this.f24347f = (int) m27126d;
                this.f24346e = 1;
            }
            this.f24348g = this.f24344c.m27126d(km4Var, false, true, 8);
            this.f24346e = 2;
            InterfaceC4782n2 interfaceC4782n22 = this.f24345d;
            int i13 = this.f24347f;
            C4931r2 c4931r2 = (C4931r2) interfaceC4782n22;
            C5005t2 c5005t22 = c4931r2.f27042a;
            int m26540n = C5005t2.m26540n(i13);
            if (m26540n != 0) {
                if (m26540n != 1) {
                    if (m26540n != 2) {
                        if (m26540n != 3) {
                            if (m26540n != 4) {
                                long j12 = this.f24348g;
                                if (j12 != 4 && j12 != 8) {
                                    throw zzbu.m28711a("Invalid float size: " + j12, null);
                                }
                                int i14 = (int) j12;
                                long m24445c = m24445c(km4Var, i14);
                                if (i14 == 4) {
                                    longBitsToDouble = Float.intBitsToFloat((int) m24445c);
                                } else {
                                    longBitsToDouble = Double.longBitsToDouble(m24445c);
                                }
                                c4931r2.f27042a.m26555i(i13, longBitsToDouble);
                                this.f24346e = 0;
                                return true;
                            }
                            c5005t22.m26553g(i13, (int) this.f24348g, km4Var);
                            this.f24346e = 0;
                            return true;
                        }
                        long j13 = this.f24348g;
                        if (j13 <= 2147483647L) {
                            int i15 = (int) j13;
                            if (i15 == 0) {
                                str = "";
                            } else {
                                byte[] bArr = new byte[i15];
                                ((yl4) km4Var).mo23962e(bArr, 0, i15, false);
                                while (i15 > 0) {
                                    int i16 = i15 - 1;
                                    if (bArr[i16] != 0) {
                                        break;
                                    }
                                    i15 = i16;
                                }
                                str = new String(bArr, 0, i15);
                            }
                            c4931r2.f27042a.m26558l(i13, str);
                            this.f24346e = 0;
                            return true;
                        }
                        throw zzbu.m28711a("String element size: " + j13, null);
                    }
                    long j14 = this.f24348g;
                    if (j14 <= 8) {
                        c4931r2.f27042a.m26556j(i13, m24445c(km4Var, (int) j14));
                        this.f24346e = 0;
                        return true;
                    }
                    throw zzbu.m28711a("Invalid integer size: " + j14, null);
                }
                long zzf2 = km4Var.zzf();
                this.f24343b.push(new C4707l2(i13, this.f24348g + zzf2, null));
                ((C4931r2) this.f24345d).f27042a.m26557k(this.f24347f, zzf2, this.f24348g);
                this.f24346e = 0;
                return true;
            }
            ((yl4) km4Var).m28248l((int) this.f24348g, false);
            this.f24346e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4819o2
    /* renamed from: b */
    public final void mo24447b(InterfaceC4782n2 interfaceC4782n2) {
        this.f24345d = interfaceC4782n2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4819o2
    public final void zzb() {
        this.f24346e = 0;
        this.f24343b.clear();
        this.f24344c.m27127e();
    }
}
