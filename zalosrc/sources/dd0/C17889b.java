package dd0;

/* renamed from: dd0.b */
/* loaded from: classes4.dex */
public class C17889b {

    /* renamed from: b */
    static long f90397b = 922337203685477580L;

    /* renamed from: c */
    private static final float[] f90398c = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* renamed from: d */
    private static final float[] f90399d = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* renamed from: a */
    int f90400a;

    /* renamed from: a */
    public int m94432a() {
        return this.f90400a;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0089 A[EDGE_INSN: B:118:0x0089->B:47:0x0089 BREAK  A[LOOP:0: B:10:0x0032->B:17:0x007f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float m94433b(String str, int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        float f11;
        char charAt;
        int i18;
        boolean z13;
        boolean z14;
        char charAt2;
        this.f90400a = i11;
        if (i11 >= i12) {
            return Float.NaN;
        }
        char charAt3 = str.charAt(i11);
        if (charAt3 != '+') {
            if (charAt3 != '-') {
                z11 = false;
                int i19 = this.f90400a;
                long j11 = 0;
                i13 = 0;
                i14 = 0;
                int i21 = 0;
                z12 = false;
                int i22 = 0;
                while (true) {
                    i15 = this.f90400a;
                    if (i15 >= i12) {
                        break;
                    }
                    char charAt4 = str.charAt(i15);
                    if (charAt4 == '0') {
                        if (i13 == 0) {
                            i21++;
                        } else {
                            i14++;
                        }
                    } else if (charAt4 >= '1' && charAt4 <= '9') {
                        int i23 = i13 + i14;
                        while (i14 > 0) {
                            if (j11 > f90397b) {
                                return Float.NaN;
                            }
                            j11 *= 10;
                            i14--;
                        }
                        if (j11 > f90397b) {
                            return Float.NaN;
                        }
                        j11 = (j11 * 10) + (charAt4 - '0');
                        i13 = i23 + 1;
                        if (j11 < 0) {
                            return Float.NaN;
                        }
                    } else {
                        if (charAt4 != '.' || z12) {
                            break;
                        }
                        i22 = this.f90400a - i19;
                        z12 = true;
                    }
                    this.f90400a++;
                }
                if (!z12 && this.f90400a == i22 + 1) {
                    return Float.NaN;
                }
                if (i13 == 0) {
                    if (i21 == 0) {
                        return Float.NaN;
                    }
                    i13 = 1;
                }
                if (z12) {
                    i14 = (i22 - i21) - i13;
                }
                i16 = this.f90400a;
                if (i16 < i12 && ((charAt = str.charAt(i16)) == 'E' || charAt == 'e')) {
                    i18 = this.f90400a + 1;
                    this.f90400a = i18;
                    if (i18 != i12) {
                        return Float.NaN;
                    }
                    char charAt5 = str.charAt(i18);
                    if (charAt5 != '+') {
                        if (charAt5 != '-') {
                            switch (charAt5) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    z13 = false;
                                    z14 = false;
                                    break;
                                default:
                                    this.f90400a--;
                                    z13 = false;
                                    z14 = true;
                                    break;
                            }
                            if (!z14) {
                                int i24 = this.f90400a;
                                int i25 = 0;
                                while (true) {
                                    int i26 = this.f90400a;
                                    if (i26 < i12 && (charAt2 = str.charAt(i26)) >= '0' && charAt2 <= '9') {
                                        if (i25 > f90397b) {
                                            return Float.NaN;
                                        }
                                        i25 = (i25 * 10) + (charAt2 - '0');
                                        this.f90400a++;
                                    }
                                }
                                if (this.f90400a == i24) {
                                    return Float.NaN;
                                }
                                if (z13) {
                                    i14 -= i25;
                                } else {
                                    i14 += i25;
                                }
                            }
                        } else {
                            z13 = true;
                        }
                    } else {
                        z13 = false;
                    }
                    this.f90400a++;
                    z14 = false;
                    if (!z14) {
                    }
                }
                i17 = i13 + i14;
                if (i17 <= 39 || i17 < -44) {
                    return Float.NaN;
                }
                long j12 = j11;
                float f12 = (float) j12;
                if (j12 != 0) {
                    if (i14 > 0) {
                        f11 = f90398c[i14];
                    } else if (i14 < 0) {
                        if (i14 < -38) {
                            f12 = (float) (f12 * 1.0E-20d);
                            i14 += 20;
                        }
                        f11 = f90399d[-i14];
                    }
                    f12 *= f11;
                }
                if (z11) {
                    return -f12;
                }
                return f12;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        this.f90400a++;
        int i192 = this.f90400a;
        long j112 = 0;
        i13 = 0;
        i14 = 0;
        int i212 = 0;
        z12 = false;
        int i222 = 0;
        while (true) {
            i15 = this.f90400a;
            if (i15 >= i12) {
            }
            this.f90400a++;
        }
        if (!z12) {
        }
        if (i13 == 0) {
        }
        if (z12) {
        }
        i16 = this.f90400a;
        if (i16 < i12) {
            i18 = this.f90400a + 1;
            this.f90400a = i18;
            if (i18 != i12) {
            }
        }
        i17 = i13 + i14;
        if (i17 <= 39) {
        }
        return Float.NaN;
    }
}
