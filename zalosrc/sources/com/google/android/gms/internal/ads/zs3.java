package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zs3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m28598a(byte[] bArr, int i11, ys3 ys3Var) {
        int m28607j = m28607j(bArr, i11, ys3Var);
        int i12 = ys3Var.f31090a;
        if (i12 >= 0) {
            if (i12 <= bArr.length - m28607j) {
                if (i12 == 0) {
                    ys3Var.f31092c = mt3.f24751q;
                    return m28607j;
                }
                ys3Var.f31092c = mt3.m24727J(bArr, m28607j, i12);
                return m28607j + i12;
            }
            throw zzgrq.m28825j();
        }
        throw zzgrq.m28822f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m28599b(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m28600c(tw3 tw3Var, byte[] bArr, int i11, int i12, int i13, ys3 ys3Var) {
        cw3 cw3Var = (cw3) tw3Var;
        Object zze = cw3Var.zze();
        int m21225F = cw3Var.m21225F(zze, bArr, i11, i12, i13, ys3Var);
        cw3Var.mo21226a(zze);
        ys3Var.f31092c = zze;
        return m21225F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m28601d(tw3 tw3Var, byte[] bArr, int i11, int i12, ys3 ys3Var) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = m28608k(i14, bArr, i13, ys3Var);
            i14 = ys3Var.f31090a;
        }
        int i15 = i13;
        if (i14 >= 0 && i14 <= i12 - i15) {
            Object zze = tw3Var.zze();
            int i16 = i14 + i15;
            tw3Var.mo21232g(zze, bArr, i15, i16, ys3Var);
            tw3Var.mo21226a(zze);
            ys3Var.f31092c = zze;
            return i16;
        }
        throw zzgrq.m28825j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m28602e(tw3 tw3Var, int i11, byte[] bArr, int i12, int i13, cv3 cv3Var, ys3 ys3Var) {
        int m28601d = m28601d(tw3Var, bArr, i12, i13, ys3Var);
        cv3Var.add(ys3Var.f31092c);
        while (m28601d < i13) {
            int m28607j = m28607j(bArr, m28601d, ys3Var);
            if (i11 != ys3Var.f31090a) {
                break;
            }
            m28601d = m28601d(tw3Var, bArr, m28607j, i13, ys3Var);
            cv3Var.add(ys3Var.f31092c);
        }
        return m28601d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m28603f(byte[] bArr, int i11, cv3 cv3Var, ys3 ys3Var) {
        uu3 uu3Var = (uu3) cv3Var;
        int m28607j = m28607j(bArr, i11, ys3Var);
        int i12 = ys3Var.f31090a + m28607j;
        while (m28607j < i12) {
            m28607j = m28607j(bArr, m28607j, ys3Var);
            uu3Var.mo27068f(ys3Var.f31090a);
        }
        if (m28607j == i12) {
            return m28607j;
        }
        throw zzgrq.m28825j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m28604g(byte[] bArr, int i11, ys3 ys3Var) {
        int m28607j = m28607j(bArr, i11, ys3Var);
        int i12 = ys3Var.f31090a;
        if (i12 >= 0) {
            if (i12 == 0) {
                ys3Var.f31092c = "";
                return m28607j;
            }
            ys3Var.f31092c = new String(bArr, m28607j, i12, dv3.f19426b);
            return m28607j + i12;
        }
        throw zzgrq.m28822f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m28605h(byte[] bArr, int i11, ys3 ys3Var) {
        int m28607j = m28607j(bArr, i11, ys3Var);
        int i12 = ys3Var.f31090a;
        if (i12 >= 0) {
            if (i12 == 0) {
                ys3Var.f31092c = "";
                return m28607j;
            }
            ys3Var.f31092c = nx3.m25038h(bArr, m28607j, i12);
            return m28607j + i12;
        }
        throw zzgrq.m28822f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m28606i(int i11, byte[] bArr, int i12, int i13, yw3 yw3Var, ys3 ys3Var) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                yw3Var.m28376h(i11, Integer.valueOf(m28599b(bArr, i12)));
                                return i12 + 4;
                            }
                            throw zzgrq.m28819c();
                        }
                        int i15 = (i11 & (-8)) | 4;
                        yw3 m28371e = yw3.m28371e();
                        int i16 = 0;
                        while (true) {
                            if (i12 >= i13) {
                                break;
                            }
                            int m28607j = m28607j(bArr, i12, ys3Var);
                            int i17 = ys3Var.f31090a;
                            if (i17 == i15) {
                                i16 = i17;
                                i12 = m28607j;
                                break;
                            }
                            i16 = i17;
                            i12 = m28606i(i17, bArr, m28607j, i13, m28371e, ys3Var);
                        }
                        if (i12 <= i13 && i16 == i15) {
                            yw3Var.m28376h(i11, m28371e);
                            return i12;
                        }
                        throw zzgrq.m28823g();
                    }
                    int m28607j2 = m28607j(bArr, i12, ys3Var);
                    int i18 = ys3Var.f31090a;
                    if (i18 >= 0) {
                        if (i18 <= bArr.length - m28607j2) {
                            if (i18 == 0) {
                                yw3Var.m28376h(i11, mt3.f24751q);
                            } else {
                                yw3Var.m28376h(i11, mt3.m24727J(bArr, m28607j2, i18));
                            }
                            return m28607j2 + i18;
                        }
                        throw zzgrq.m28825j();
                    }
                    throw zzgrq.m28822f();
                }
                yw3Var.m28376h(i11, Long.valueOf(m28611n(bArr, i12)));
                return i12 + 8;
            }
            int m28610m = m28610m(bArr, i12, ys3Var);
            yw3Var.m28376h(i11, Long.valueOf(ys3Var.f31091b));
            return m28610m;
        }
        throw zzgrq.m28819c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m28607j(byte[] bArr, int i11, ys3 ys3Var) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            ys3Var.f31090a = b11;
            return i12;
        }
        return m28608k(b11, bArr, i12, ys3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m28608k(int i11, byte[] bArr, int i12, ys3 ys3Var) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            ys3Var.f31090a = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            ys3Var.f31090a = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            ys3Var.f31090a = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            ys3Var.f31090a = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] < 0) {
                i21 = i23;
            } else {
                ys3Var.f31090a = i22;
                return i23;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m28609l(int i11, byte[] bArr, int i12, int i13, cv3 cv3Var, ys3 ys3Var) {
        uu3 uu3Var = (uu3) cv3Var;
        int m28607j = m28607j(bArr, i12, ys3Var);
        uu3Var.mo27068f(ys3Var.f31090a);
        while (m28607j < i13) {
            int m28607j2 = m28607j(bArr, m28607j, ys3Var);
            if (i11 != ys3Var.f31090a) {
                break;
            }
            m28607j = m28607j(bArr, m28607j2, ys3Var);
            uu3Var.mo27068f(ys3Var.f31090a);
        }
        return m28607j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m28610m(byte[] bArr, int i11, ys3 ys3Var) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            ys3Var.f31091b = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            i14 += 7;
            j12 |= (r10 & Byte.MAX_VALUE) << i14;
            b11 = bArr[i13];
            i13 = i15;
        }
        ys3Var.f31091b = j12;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m28611n(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }
}
