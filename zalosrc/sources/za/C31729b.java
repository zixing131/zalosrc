package za;

/* renamed from: za.b */
/* loaded from: classes3.dex */
public final class C31729b extends AbstractC31741n {

    /* renamed from: b */
    private static final char[] f145792b;

    /* renamed from: c */
    private static final char[] f145793c = {'T', 'N', '*', 'E'};

    /* renamed from: d */
    private static final char[] f145794d = {'/', ':', '+', '.'};

    /* renamed from: e */
    private static final char f145795e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f145792b = cArr;
        f145795e = cArr[0];
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        int i11;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c11 = f145795e;
            sb2.append(c11);
            sb2.append(str);
            sb2.append(c11);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f145792b;
            boolean m152686a = AbstractC31728a.m152686a(cArr, upperCase);
            boolean m152686a2 = AbstractC31728a.m152686a(cArr, upperCase2);
            char[] cArr2 = f145793c;
            boolean m152686a3 = AbstractC31728a.m152686a(cArr2, upperCase);
            boolean m152686a4 = AbstractC31728a.m152686a(cArr2, upperCase2);
            if (m152686a) {
                if (!m152686a2) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (m152686a3) {
                if (!m152686a4) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (!m152686a2 && !m152686a4) {
                StringBuilder sb3 = new StringBuilder();
                char c12 = f145795e;
                sb3.append(c12);
                sb3.append(str);
                sb3.append(c12);
                str = sb3.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: " + str);
            }
        }
        int i12 = 20;
        for (int i13 = 1; i13 < str.length() - 1; i13++) {
            if (!Character.isDigit(str.charAt(i13)) && str.charAt(i13) != '-' && str.charAt(i13) != '$') {
                if (AbstractC31728a.m152686a(f145794d, str.charAt(i13))) {
                    i12 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i13) + '\'');
                }
            } else {
                i12 += 9;
            }
        }
        boolean[] zArr = new boolean[i12 + (str.length() - 1)];
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i15));
            if (i15 == 0 || i15 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i16 = 0;
            while (true) {
                char[] cArr3 = AbstractC31728a.f145789a;
                if (i16 < cArr3.length) {
                    if (upperCase3 == cArr3[i16]) {
                        i11 = AbstractC31728a.f145790b[i16];
                        break;
                    }
                    i16++;
                } else {
                    i11 = 0;
                    break;
                }
            }
            int i17 = 0;
            boolean z11 = true;
            while (true) {
                int i18 = 0;
                while (i17 < 7) {
                    zArr[i14] = z11;
                    i14++;
                    if (((i11 >> (6 - i17)) & 1) != 0 && i18 != 1) {
                        i18++;
                    } else {
                        z11 = !z11;
                        i17++;
                    }
                }
                break;
            }
            if (i15 < str.length() - 1) {
                zArr[i14] = false;
                i14++;
            }
        }
        return zArr;
    }
}
