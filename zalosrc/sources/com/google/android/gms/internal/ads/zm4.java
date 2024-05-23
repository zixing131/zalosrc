package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zm4 {

    /* renamed from: a */
    public final List f31591a;

    /* renamed from: b */
    public final int f31592b;

    /* renamed from: c */
    public final float f31593c;

    /* renamed from: d */
    public final String f31594d;

    private zm4(List list, int i11, int i12, int i13, float f11, String str) {
        this.f31591a = list;
        this.f31592b = i11;
        this.f31593c = f11;
        this.f31594d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0375 A[Catch: ArrayIndexOutOfBoundsException -> 0x0032, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0032, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0035, B:12:0x0038, B:14:0x0048, B:16:0x0055, B:19:0x0072, B:22:0x009c, B:24:0x00a2, B:26:0x00a7, B:29:0x00aa, B:32:0x00b2, B:34:0x00bb, B:36:0x00c3, B:38:0x00c9, B:39:0x00cb, B:41:0x00d1, B:43:0x00d3, B:46:0x00d6, B:48:0x00db, B:49:0x00e1, B:51:0x00eb, B:52:0x00ef, B:54:0x00fd, B:62:0x0126, B:63:0x0134, B:68:0x014a, B:70:0x0156, B:72:0x016e, B:78:0x017c, B:80:0x0182, B:85:0x01ae, B:88:0x0189, B:90:0x019d, B:93:0x01a3, B:96:0x01b3, B:98:0x01ba, B:100:0x01c7, B:101:0x01d5, B:104:0x01e8, B:106:0x01ee, B:108:0x0211, B:110:0x0217, B:112:0x0222, B:113:0x021e, B:116:0x0225, B:118:0x022f, B:120:0x0235, B:122:0x023b, B:124:0x0241, B:129:0x0246, B:131:0x024a, B:134:0x0257, B:136:0x025d, B:138:0x0261, B:140:0x0267, B:144:0x026a, B:146:0x0274, B:148:0x027a, B:150:0x027e, B:152:0x0284, B:157:0x0289, B:159:0x028d, B:162:0x0298, B:164:0x029e, B:166:0x02a4, B:168:0x02aa, B:172:0x02ad, B:174:0x02f2, B:175:0x02b6, B:177:0x02cd, B:179:0x02db, B:181:0x02e0, B:186:0x0302, B:189:0x0311, B:191:0x0317, B:193:0x0320, B:195:0x032a, B:197:0x0330, B:199:0x033a, B:202:0x0348, B:203:0x036f, B:205:0x0375, B:206:0x0378, B:208:0x037e, B:210:0x0388, B:211:0x038d, B:213:0x0393, B:214:0x0399, B:216:0x03a2, B:217:0x03a7, B:219:0x03c3, B:222:0x0353, B:223:0x0358, B:234:0x03df, B:238:0x03fb, B:240:0x0406, B:244:0x0401), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037e A[Catch: ArrayIndexOutOfBoundsException -> 0x0032, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0032, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0035, B:12:0x0038, B:14:0x0048, B:16:0x0055, B:19:0x0072, B:22:0x009c, B:24:0x00a2, B:26:0x00a7, B:29:0x00aa, B:32:0x00b2, B:34:0x00bb, B:36:0x00c3, B:38:0x00c9, B:39:0x00cb, B:41:0x00d1, B:43:0x00d3, B:46:0x00d6, B:48:0x00db, B:49:0x00e1, B:51:0x00eb, B:52:0x00ef, B:54:0x00fd, B:62:0x0126, B:63:0x0134, B:68:0x014a, B:70:0x0156, B:72:0x016e, B:78:0x017c, B:80:0x0182, B:85:0x01ae, B:88:0x0189, B:90:0x019d, B:93:0x01a3, B:96:0x01b3, B:98:0x01ba, B:100:0x01c7, B:101:0x01d5, B:104:0x01e8, B:106:0x01ee, B:108:0x0211, B:110:0x0217, B:112:0x0222, B:113:0x021e, B:116:0x0225, B:118:0x022f, B:120:0x0235, B:122:0x023b, B:124:0x0241, B:129:0x0246, B:131:0x024a, B:134:0x0257, B:136:0x025d, B:138:0x0261, B:140:0x0267, B:144:0x026a, B:146:0x0274, B:148:0x027a, B:150:0x027e, B:152:0x0284, B:157:0x0289, B:159:0x028d, B:162:0x0298, B:164:0x029e, B:166:0x02a4, B:168:0x02aa, B:172:0x02ad, B:174:0x02f2, B:175:0x02b6, B:177:0x02cd, B:179:0x02db, B:181:0x02e0, B:186:0x0302, B:189:0x0311, B:191:0x0317, B:193:0x0320, B:195:0x032a, B:197:0x0330, B:199:0x033a, B:202:0x0348, B:203:0x036f, B:205:0x0375, B:206:0x0378, B:208:0x037e, B:210:0x0388, B:211:0x038d, B:213:0x0393, B:214:0x0399, B:216:0x03a2, B:217:0x03a7, B:219:0x03c3, B:222:0x0353, B:223:0x0358, B:234:0x03df, B:238:0x03fb, B:240:0x0406, B:244:0x0401), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0393 A[Catch: ArrayIndexOutOfBoundsException -> 0x0032, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0032, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0035, B:12:0x0038, B:14:0x0048, B:16:0x0055, B:19:0x0072, B:22:0x009c, B:24:0x00a2, B:26:0x00a7, B:29:0x00aa, B:32:0x00b2, B:34:0x00bb, B:36:0x00c3, B:38:0x00c9, B:39:0x00cb, B:41:0x00d1, B:43:0x00d3, B:46:0x00d6, B:48:0x00db, B:49:0x00e1, B:51:0x00eb, B:52:0x00ef, B:54:0x00fd, B:62:0x0126, B:63:0x0134, B:68:0x014a, B:70:0x0156, B:72:0x016e, B:78:0x017c, B:80:0x0182, B:85:0x01ae, B:88:0x0189, B:90:0x019d, B:93:0x01a3, B:96:0x01b3, B:98:0x01ba, B:100:0x01c7, B:101:0x01d5, B:104:0x01e8, B:106:0x01ee, B:108:0x0211, B:110:0x0217, B:112:0x0222, B:113:0x021e, B:116:0x0225, B:118:0x022f, B:120:0x0235, B:122:0x023b, B:124:0x0241, B:129:0x0246, B:131:0x024a, B:134:0x0257, B:136:0x025d, B:138:0x0261, B:140:0x0267, B:144:0x026a, B:146:0x0274, B:148:0x027a, B:150:0x027e, B:152:0x0284, B:157:0x0289, B:159:0x028d, B:162:0x0298, B:164:0x029e, B:166:0x02a4, B:168:0x02aa, B:172:0x02ad, B:174:0x02f2, B:175:0x02b6, B:177:0x02cd, B:179:0x02db, B:181:0x02e0, B:186:0x0302, B:189:0x0311, B:191:0x0317, B:193:0x0320, B:195:0x032a, B:197:0x0330, B:199:0x033a, B:202:0x0348, B:203:0x036f, B:205:0x0375, B:206:0x0378, B:208:0x037e, B:210:0x0388, B:211:0x038d, B:213:0x0393, B:214:0x0399, B:216:0x03a2, B:217:0x03a7, B:219:0x03c3, B:222:0x0353, B:223:0x0358, B:234:0x03df, B:238:0x03fb, B:240:0x0406, B:244:0x0401), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a2 A[Catch: ArrayIndexOutOfBoundsException -> 0x0032, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0032, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0035, B:12:0x0038, B:14:0x0048, B:16:0x0055, B:19:0x0072, B:22:0x009c, B:24:0x00a2, B:26:0x00a7, B:29:0x00aa, B:32:0x00b2, B:34:0x00bb, B:36:0x00c3, B:38:0x00c9, B:39:0x00cb, B:41:0x00d1, B:43:0x00d3, B:46:0x00d6, B:48:0x00db, B:49:0x00e1, B:51:0x00eb, B:52:0x00ef, B:54:0x00fd, B:62:0x0126, B:63:0x0134, B:68:0x014a, B:70:0x0156, B:72:0x016e, B:78:0x017c, B:80:0x0182, B:85:0x01ae, B:88:0x0189, B:90:0x019d, B:93:0x01a3, B:96:0x01b3, B:98:0x01ba, B:100:0x01c7, B:101:0x01d5, B:104:0x01e8, B:106:0x01ee, B:108:0x0211, B:110:0x0217, B:112:0x0222, B:113:0x021e, B:116:0x0225, B:118:0x022f, B:120:0x0235, B:122:0x023b, B:124:0x0241, B:129:0x0246, B:131:0x024a, B:134:0x0257, B:136:0x025d, B:138:0x0261, B:140:0x0267, B:144:0x026a, B:146:0x0274, B:148:0x027a, B:150:0x027e, B:152:0x0284, B:157:0x0289, B:159:0x028d, B:162:0x0298, B:164:0x029e, B:166:0x02a4, B:168:0x02aa, B:172:0x02ad, B:174:0x02f2, B:175:0x02b6, B:177:0x02cd, B:179:0x02db, B:181:0x02e0, B:186:0x0302, B:189:0x0311, B:191:0x0317, B:193:0x0320, B:195:0x032a, B:197:0x0330, B:199:0x033a, B:202:0x0348, B:203:0x036f, B:205:0x0375, B:206:0x0378, B:208:0x037e, B:210:0x0388, B:211:0x038d, B:213:0x0393, B:214:0x0399, B:216:0x03a2, B:217:0x03a7, B:219:0x03c3, B:222:0x0353, B:223:0x0358, B:234:0x03df, B:238:0x03fb, B:240:0x0406, B:244:0x0401), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zm4 m28552a(x02 x02Var) {
        List singletonList;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f11;
        int i18;
        byte[] bArr2;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        try {
            x02Var.m27776g(21);
            int m27788s = x02Var.m27788s() & 3;
            int m27788s2 = x02Var.m27788s();
            int m27780k = x02Var.m27780k();
            int i28 = 0;
            int i29 = 0;
            for (int i31 = 0; i31 < m27788s2; i31++) {
                x02Var.m27776g(1);
                int m27792w = x02Var.m27792w();
                for (int i32 = 0; i32 < m27792w; i32++) {
                    int m27792w2 = x02Var.m27792w();
                    i29 += m27792w2 + 4;
                    x02Var.m27776g(m27792w2);
                }
            }
            x02Var.m27775f(m27780k);
            byte[] bArr3 = new byte[i29];
            String str = null;
            int i33 = 0;
            int i34 = 0;
            int i35 = -1;
            int i36 = -1;
            float f12 = 1.0f;
            while (i33 < m27788s2) {
                int m27788s3 = x02Var.m27788s() & 63;
                int m27792w3 = x02Var.m27792w();
                int i37 = 0;
                while (i37 < m27792w3) {
                    int m27792w4 = x02Var.m27792w();
                    System.arraycopy(AbstractC4557h.f21470a, i28, bArr3, i34, 4);
                    int i38 = i34 + 4;
                    System.arraycopy(x02Var.m27777h(), x02Var.m27780k(), bArr3, i38, m27792w4);
                    if (m27788s3 == 33 && i37 == 0) {
                        C4630j c4630j = new C4630j(bArr3, i34 + 6, i38 + m27792w4);
                        c4630j.m23493e(4);
                        int m23489a = c4630j.m23489a(3);
                        c4630j.m23492d();
                        int m23489a2 = c4630j.m23489a(2);
                        boolean m23494f = c4630j.m23494f();
                        int m23489a3 = c4630j.m23489a(5);
                        int i39 = 0;
                        for (int i41 = 0; i41 < 32; i41++) {
                            if (c4630j.m23494f()) {
                                i39 |= 1 << i41;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i42 = 0; i42 < 6; i42++) {
                            iArr[i42] = c4630j.m23489a(8);
                        }
                        int m23489a4 = c4630j.m23489a(8);
                        int i43 = 0;
                        for (int i44 = 0; i44 < m23489a; i44++) {
                            if (c4630j.m23494f()) {
                                i43 += 89;
                            }
                            if (c4630j.m23494f()) {
                                i43 += 8;
                            }
                        }
                        c4630j.m23493e(i43);
                        if (m23489a > 0) {
                            int i45 = 8 - m23489a;
                            c4630j.m23493e(i45 + i45);
                        }
                        c4630j.m23491c();
                        int m23491c = c4630j.m23491c();
                        if (m23491c == 3) {
                            c4630j.m23492d();
                            m23491c = 3;
                        }
                        int m23491c2 = c4630j.m23491c();
                        int m23491c3 = c4630j.m23491c();
                        if (c4630j.m23494f()) {
                            int m23491c4 = c4630j.m23491c();
                            int m23491c5 = c4630j.m23491c();
                            int m23491c6 = c4630j.m23491c();
                            int m23491c7 = c4630j.m23491c();
                            if (m23491c != 1) {
                                if (m23491c == 2) {
                                    i12 = m27788s2;
                                    m23491c = 2;
                                } else {
                                    i12 = m27788s2;
                                    i26 = 1;
                                    i25 = 1;
                                    if (m23491c != i26) {
                                        i27 = 2;
                                    } else {
                                        i27 = 1;
                                    }
                                    m23491c2 -= i25 * (m23491c4 + m23491c5);
                                    m23491c3 -= i27 * (m23491c6 + m23491c7);
                                }
                            } else {
                                i12 = m27788s2;
                            }
                            i26 = 1;
                            i25 = 2;
                            if (m23491c != i26) {
                            }
                            m23491c2 -= i25 * (m23491c4 + m23491c5);
                            m23491c3 -= i27 * (m23491c6 + m23491c7);
                        } else {
                            i12 = m27788s2;
                        }
                        c4630j.m23491c();
                        c4630j.m23491c();
                        int m23491c8 = c4630j.m23491c();
                        if (true != c4630j.m23494f()) {
                            i17 = m23489a;
                        } else {
                            i17 = 0;
                        }
                        while (i17 <= m23489a) {
                            c4630j.m23491c();
                            c4630j.m23491c();
                            c4630j.m23491c();
                            i17++;
                        }
                        c4630j.m23491c();
                        c4630j.m23491c();
                        c4630j.m23491c();
                        c4630j.m23491c();
                        c4630j.m23491c();
                        c4630j.m23491c();
                        if (c4630j.m23494f() && c4630j.m23494f()) {
                            int i46 = 0;
                            for (int i47 = 4; i46 < i47; i47 = 4) {
                                int i48 = 0;
                                for (int i49 = 6; i48 < i49; i49 = 6) {
                                    if (!c4630j.m23494f()) {
                                        c4630j.m23491c();
                                        i23 = m23491c2;
                                    } else {
                                        i23 = m23491c2;
                                        int min = Math.min(64, 1 << ((i46 + i46) + 4));
                                        if (i46 > 1) {
                                            c4630j.m23490b();
                                        }
                                        for (int i51 = 0; i51 < min; i51++) {
                                            c4630j.m23490b();
                                        }
                                    }
                                    if (i46 == 3) {
                                        i24 = 3;
                                    } else {
                                        i24 = 1;
                                    }
                                    i48 += i24;
                                    m23491c2 = i23;
                                }
                                i46++;
                            }
                        }
                        int i52 = m23491c2;
                        c4630j.m23493e(2);
                        if (c4630j.m23494f()) {
                            c4630j.m23493e(8);
                            c4630j.m23491c();
                            c4630j.m23491c();
                            c4630j.m23492d();
                        }
                        int m23491c9 = c4630j.m23491c();
                        int i53 = 0;
                        int[] iArr2 = new int[0];
                        int[] iArr3 = new int[0];
                        i15 = m27788s3;
                        i16 = m27792w3;
                        int i54 = -1;
                        int i55 = -1;
                        while (i53 < m23491c9) {
                            if (i53 != 0 && c4630j.m23494f()) {
                                i19 = m23491c9;
                                int i56 = i54 + i55;
                                boolean m23494f2 = c4630j.m23494f();
                                int m23491c10 = (1 - ((m23494f2 ? 1 : 0) + (m23494f2 ? 1 : 0))) * (c4630j.m23491c() + 1);
                                i18 = m27788s;
                                int i57 = i56 + 1;
                                bArr2 = bArr3;
                                boolean[] zArr = new boolean[i57];
                                i21 = i29;
                                for (int i58 = 0; i58 <= i56; i58++) {
                                    if (!c4630j.m23494f()) {
                                        zArr[i58] = c4630j.m23494f();
                                    } else {
                                        zArr[i58] = true;
                                    }
                                }
                                int[] iArr4 = new int[i57];
                                int[] iArr5 = new int[i57];
                                int i59 = 0;
                                for (int i61 = i55 - 1; i61 >= 0; i61--) {
                                    int i62 = iArr3[i61] + m23491c10;
                                    if (i62 < 0 && zArr[i54 + i61]) {
                                        iArr4[i59] = i62;
                                        i59++;
                                    }
                                }
                                if (m23491c10 < 0 && zArr[i56]) {
                                    iArr4[i59] = m23491c10;
                                    i59++;
                                }
                                i22 = i33;
                                int i63 = i59;
                                for (int i64 = 0; i64 < i54; i64++) {
                                    int i65 = iArr2[i64] + m23491c10;
                                    if (i65 < 0 && zArr[i64]) {
                                        iArr4[i63] = i65;
                                        i63++;
                                    }
                                }
                                int[] copyOf = Arrays.copyOf(iArr4, i63);
                                int i66 = 0;
                                for (int i67 = i54 - 1; i67 >= 0; i67--) {
                                    int i68 = iArr2[i67] + m23491c10;
                                    if (i68 > 0 && zArr[i67]) {
                                        iArr5[i66] = i68;
                                        i66++;
                                    }
                                }
                                if (m23491c10 > 0 && zArr[i56]) {
                                    iArr5[i66] = m23491c10;
                                    i66++;
                                }
                                int i69 = i66;
                                for (int i71 = 0; i71 < i55; i71++) {
                                    int i72 = iArr3[i71] + m23491c10;
                                    if (i72 > 0 && zArr[i54 + i71]) {
                                        iArr5[i69] = i72;
                                        i69++;
                                    }
                                }
                                iArr2 = copyOf;
                                iArr3 = Arrays.copyOf(iArr5, i69);
                                i55 = i69;
                                i54 = i63;
                            } else {
                                i18 = m27788s;
                                bArr2 = bArr3;
                                i19 = m23491c9;
                                i21 = i29;
                                i22 = i33;
                                int m23491c11 = c4630j.m23491c();
                                int m23491c12 = c4630j.m23491c();
                                int[] iArr6 = new int[m23491c11];
                                for (int i73 = 0; i73 < m23491c11; i73++) {
                                    iArr6[i73] = c4630j.m23491c() + 1;
                                    c4630j.m23492d();
                                }
                                int[] iArr7 = new int[m23491c12];
                                for (int i74 = 0; i74 < m23491c12; i74++) {
                                    iArr7[i74] = c4630j.m23491c() + 1;
                                    c4630j.m23492d();
                                }
                                i54 = m23491c11;
                                i55 = m23491c12;
                                iArr2 = iArr6;
                                iArr3 = iArr7;
                            }
                            i53++;
                            m23491c9 = i19;
                            m27788s = i18;
                            bArr3 = bArr2;
                            i29 = i21;
                            i33 = i22;
                        }
                        i11 = m27788s;
                        bArr = bArr3;
                        i13 = i29;
                        i14 = i33;
                        if (c4630j.m23494f()) {
                            for (int i75 = 0; i75 < c4630j.m23491c(); i75++) {
                                c4630j.m23493e(m23491c8 + 5);
                            }
                        }
                        c4630j.m23493e(2);
                        if (c4630j.m23494f()) {
                            if (c4630j.m23494f()) {
                                int m23489a5 = c4630j.m23489a(8);
                                if (m23489a5 == 255) {
                                    int m23489a6 = c4630j.m23489a(16);
                                    int m23489a7 = c4630j.m23489a(16);
                                    if (m23489a6 != 0 && m23489a7 != 0) {
                                        f11 = m23489a6 / m23489a7;
                                        if (c4630j.m23494f()) {
                                            c4630j.m23492d();
                                        }
                                        if (c4630j.m23494f()) {
                                            c4630j.m23493e(4);
                                            if (c4630j.m23494f()) {
                                                c4630j.m23493e(24);
                                            }
                                        }
                                        if (c4630j.m23494f()) {
                                            c4630j.m23491c();
                                            c4630j.m23491c();
                                        }
                                        c4630j.m23492d();
                                        if (c4630j.m23494f()) {
                                            m23491c3 += m23491c3;
                                        }
                                    }
                                } else if (m23489a5 < 17) {
                                    f11 = AbstractC4557h.f21471b[m23489a5];
                                    if (c4630j.m23494f()) {
                                    }
                                    if (c4630j.m23494f()) {
                                    }
                                    if (c4630j.m23494f()) {
                                    }
                                    c4630j.m23492d();
                                    if (c4630j.m23494f()) {
                                    }
                                } else {
                                    lr1.m24356e("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + m23489a5);
                                }
                            }
                            f11 = 1.0f;
                            if (c4630j.m23494f()) {
                            }
                            if (c4630j.m23494f()) {
                            }
                            if (c4630j.m23494f()) {
                            }
                            c4630j.m23492d();
                            if (c4630j.m23494f()) {
                            }
                        } else {
                            f11 = 1.0f;
                        }
                        str = x91.m27866b(m23489a2, m23494f, m23489a3, i39, iArr, m23489a4);
                        f12 = f11;
                        i36 = m23491c3;
                        i35 = i52;
                        i37 = 0;
                    } else {
                        i11 = m27788s;
                        i12 = m27788s2;
                        bArr = bArr3;
                        i13 = i29;
                        i14 = i33;
                        i15 = m27788s3;
                        i16 = m27792w3;
                    }
                    i34 = i38 + m27792w4;
                    x02Var.m27776g(m27792w4);
                    i37++;
                    m27788s3 = i15;
                    m27792w3 = i16;
                    m27788s2 = i12;
                    m27788s = i11;
                    bArr3 = bArr;
                    i29 = i13;
                    i33 = i14;
                    i28 = 0;
                }
                i33++;
                m27788s = m27788s;
                i28 = 0;
            }
            int i76 = m27788s;
            byte[] bArr4 = bArr3;
            if (i29 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr4);
            }
            return new zm4(singletonList, i76 + 1, i35, i36, f12, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw zzbu.m28711a("Error parsing HEVC config", e11);
        }
    }
}
