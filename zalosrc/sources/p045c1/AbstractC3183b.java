package p045c1;

import java.util.ArrayList;
import p045c1.C3186e;
import p700z0.C31131b;
import p700z0.C31133d;
import p700z0.C31138i;

/* renamed from: c1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3183b {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:            if (r7 == 2) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:            r5 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0035, code lost:            r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x004b, code lost:            if (r7 == 2) goto L16;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Type inference failed for: r1v40, types: [c1.e] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [c1.e] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void m15993a(C3187f c3187f, C31133d c31133d, int i11, int i12, C3184c c3184c) {
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        C3186e c3186e;
        C3185d c3185d;
        C3185d c3185d2;
        C3185d c3185d3;
        C3186e c3186e2;
        int i13;
        C3186e c3186e3;
        C3185d c3185d4;
        C31138i c31138i;
        C31138i c31138i2;
        C3186e c3186e4;
        C3185d c3185d5;
        C3186e c3186e5;
        C31138i c31138i3;
        C3186e c3186e6;
        C3186e c3186e7;
        C31138i c31138i4;
        float f11;
        int size;
        int i14;
        ArrayList arrayList2;
        int i15;
        boolean z14;
        boolean z15;
        C3186e c3186e8;
        C3186e c3186e9;
        int i16;
        int i17 = i11;
        C3186e c3186e10 = c3184c.f13433a;
        C3186e c3186e11 = c3184c.f13435c;
        C3186e c3186e12 = c3184c.f13434b;
        C3186e c3186e13 = c3184c.f13436d;
        C3186e c3186e14 = c3184c.f13437e;
        float f12 = c3184c.f13443k;
        boolean z16 = c3187f.f13524b0[i17] == C3186e.b.WRAP_CONTENT;
        if (i17 == 0) {
            int i18 = c3186e14.f13493I0;
            z11 = i18 == 0;
            z12 = i18 == 1;
        } else {
            int i19 = c3186e14.f13495J0;
            z11 = i19 == 0;
            z12 = i19 == 1;
        }
        boolean z17 = z12;
        boolean z18 = false;
        boolean z19 = z11;
        ?? r82 = c3186e10;
        while (true) {
            if (z18) {
                break;
            }
            C3185d c3185d6 = r82.f13519Y[i12];
            int i21 = z13 ? 1 : 4;
            int m16003f = c3185d6.m16003f();
            C3186e.b bVar = r82.f13524b0[i17];
            float f13 = f12;
            C3186e.b bVar2 = C3186e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && r82.f13569y[i17] == 0) {
                z14 = z18;
                z15 = true;
            } else {
                z14 = z18;
                z15 = false;
            }
            C3185d c3185d7 = c3185d6.f13460f;
            if (c3185d7 != null && r82 != c3186e10) {
                m16003f += c3185d7.m16003f();
            }
            int i22 = m16003f;
            if (!z13 || r82 == c3186e10 || r82 == c3186e12) {
                c3186e8 = c3186e14;
            } else {
                c3186e8 = c3186e14;
                i21 = 8;
            }
            C3185d c3185d8 = c3185d6.f13460f;
            if (c3185d8 != null) {
                if (r82 == c3186e12) {
                    c3186e9 = c3186e10;
                    c31133d.m151270h(c3185d6.f13463i, c3185d8.f13463i, i22, 6);
                } else {
                    c3186e9 = c3186e10;
                    c31133d.m151270h(c3185d6.f13463i, c3185d8.f13463i, i22, 8);
                }
                if (z15 && !z13) {
                    i21 = 5;
                }
                c31133d.m151267e(c3185d6.f13463i, c3185d6.f13460f.f13463i, i22, (r82 == c3186e12 && z13 && r82.m16094j0(i17)) ? 5 : i21);
            } else {
                c3186e9 = c3186e10;
            }
            if (z16) {
                if (r82.m16068X() == 8 || r82.f13524b0[i17] != bVar2) {
                    i16 = 0;
                } else {
                    C3185d[] c3185dArr = r82.f13519Y;
                    i16 = 0;
                    c31133d.m151270h(c3185dArr[i12 + 1].f13463i, c3185dArr[i12].f13463i, 0, 5);
                }
                c31133d.m151270h(r82.f13519Y[i12].f13463i, c3187f.f13519Y[i12].f13463i, i16, 8);
            }
            C3185d c3185d9 = r82.f13519Y[i12 + 1].f13460f;
            if (c3185d9 != null) {
                ?? r12 = c3185d9.f13458d;
                C3185d c3185d10 = r12.f13519Y[i12].f13460f;
                if (c3185d10 != null && c3185d10.f13458d == r82) {
                    r21 = r12;
                }
            }
            if (r21 != null) {
                r82 = r21;
                z18 = z14;
            } else {
                z18 = true;
            }
            c3186e14 = c3186e8;
            f12 = f13;
            c3186e10 = c3186e9;
            r82 = r82;
        }
        C3186e c3186e15 = c3186e14;
        float f14 = f12;
        C3186e c3186e16 = c3186e10;
        if (c3186e13 != null) {
            int i23 = i12 + 1;
            if (c3186e11.f13519Y[i23].f13460f != null) {
                C3185d c3185d11 = c3186e13.f13519Y[i23];
                if (c3186e13.f13524b0[i17] == C3186e.b.MATCH_CONSTRAINT && c3186e13.f13569y[i17] == 0 && !z13) {
                    C3185d c3185d12 = c3185d11.f13460f;
                    if (c3185d12.f13458d == c3187f) {
                        c31133d.m151267e(c3185d11.f13463i, c3185d12.f13463i, -c3185d11.m16003f(), 5);
                        c31133d.m151272j(c3185d11.f13463i, c3186e11.f13519Y[i23].f13460f.f13463i, -c3185d11.m16003f(), 6);
                        if (z16) {
                            int i24 = i12 + 1;
                            C31138i c31138i5 = c3187f.f13519Y[i24].f13463i;
                            C3185d c3185d13 = c3186e11.f13519Y[i24];
                            c31133d.m151270h(c31138i5, c3185d13.f13463i, c3185d13.m16003f(), 8);
                        }
                        arrayList = c3184c.f13440h;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            float f15 = (c3184c.f13450r || c3184c.f13452t) ? f14 : c3184c.f13442j;
                            float f16 = 0.0f;
                            C3186e c3186e17 = null;
                            i14 = 0;
                            float f17 = 0.0f;
                            while (i14 < size) {
                                C3186e c3186e18 = (C3186e) arrayList.get(i14);
                                float f18 = c3186e18.f13501M0[i17];
                                if (f18 < f16) {
                                    if (c3184c.f13452t) {
                                        C3185d[] c3185dArr2 = c3186e18.f13519Y;
                                        c31133d.m151267e(c3185dArr2[i12 + 1].f13463i, c3185dArr2[i12].f13463i, 0, 4);
                                        arrayList2 = arrayList;
                                        i15 = size;
                                        i14++;
                                        size = i15;
                                        arrayList = arrayList2;
                                        f16 = 0.0f;
                                    } else {
                                        f18 = 1.0f;
                                    }
                                }
                                if (f18 == 0.0f) {
                                    C3185d[] c3185dArr3 = c3186e18.f13519Y;
                                    c31133d.m151267e(c3185dArr3[i12 + 1].f13463i, c3185dArr3[i12].f13463i, 0, 8);
                                    arrayList2 = arrayList;
                                    i15 = size;
                                    i14++;
                                    size = i15;
                                    arrayList = arrayList2;
                                    f16 = 0.0f;
                                } else {
                                    if (c3186e17 != null) {
                                        C3185d[] c3185dArr4 = c3186e17.f13519Y;
                                        C31138i c31138i6 = c3185dArr4[i12].f13463i;
                                        int i25 = i12 + 1;
                                        C31138i c31138i7 = c3185dArr4[i25].f13463i;
                                        C3185d[] c3185dArr5 = c3186e18.f13519Y;
                                        arrayList2 = arrayList;
                                        C31138i c31138i8 = c3185dArr5[i12].f13463i;
                                        C31138i c31138i9 = c3185dArr5[i25].f13463i;
                                        i15 = size;
                                        C31131b m151278r = c31133d.m151278r();
                                        m151278r.m151240l(f17, f15, f18, c31138i6, c31138i7, c31138i8, c31138i9);
                                        c31133d.m151266d(m151278r);
                                    } else {
                                        arrayList2 = arrayList;
                                        i15 = size;
                                    }
                                    c3186e17 = c3186e18;
                                    f17 = f18;
                                    i14++;
                                    size = i15;
                                    arrayList = arrayList2;
                                    f16 = 0.0f;
                                }
                            }
                        }
                        if (c3186e12 == null && (c3186e12 == c3186e13 || z13)) {
                            C3185d c3185d14 = c3186e16.f13519Y[i12];
                            int i26 = i12 + 1;
                            C3185d c3185d15 = c3186e11.f13519Y[i26];
                            C3185d c3185d16 = c3185d14.f13460f;
                            C31138i c31138i10 = c3185d16 != null ? c3185d16.f13463i : null;
                            C3185d c3185d17 = c3185d15.f13460f;
                            C31138i c31138i11 = c3185d17 != null ? c3185d17.f13463i : null;
                            C3185d c3185d18 = c3186e12.f13519Y[i12];
                            if (c3186e13 != null) {
                                c3185d15 = c3186e13.f13519Y[i26];
                            }
                            if (c31138i10 != null && c31138i11 != null) {
                                if (i17 == 0) {
                                    f11 = c3186e15.f13554q0;
                                } else {
                                    f11 = c3186e15.f13556r0;
                                }
                                c31133d.m151265c(c3185d18.f13463i, c31138i10, c3185d18.m16003f(), f11, c31138i11, c3185d15.f13463i, c3185d15.m16003f(), 7);
                            }
                        } else if (z19 || c3186e12 == null) {
                            int i27 = 8;
                            if (z17 && c3186e12 != null) {
                                int i28 = c3184c.f13442j;
                                boolean z21 = i28 <= 0 && c3184c.f13441i == i28;
                                C3186e c3186e19 = c3186e12;
                                c3186e = c3186e19;
                                while (c3186e != null) {
                                    C3186e c3186e20 = c3186e.f13505O0[i17];
                                    while (c3186e20 != null && c3186e20.m16068X() == i27) {
                                        c3186e20 = c3186e20.f13505O0[i17];
                                    }
                                    if (c3186e == c3186e12 || c3186e == c3186e13 || c3186e20 == null) {
                                        c3186e2 = c3186e19;
                                        i13 = 8;
                                    } else {
                                        C3186e c3186e21 = c3186e20 == c3186e13 ? null : c3186e20;
                                        C3185d c3185d19 = c3186e.f13519Y[i12];
                                        C31138i c31138i12 = c3185d19.f13463i;
                                        C3185d c3185d20 = c3185d19.f13460f;
                                        if (c3185d20 != null) {
                                            C31138i c31138i13 = c3185d20.f13463i;
                                        }
                                        int i29 = i12 + 1;
                                        C31138i c31138i14 = c3186e19.f13519Y[i29].f13463i;
                                        int m16003f2 = c3185d19.m16003f();
                                        int m16003f3 = c3186e.f13519Y[i29].m16003f();
                                        if (c3186e21 != null) {
                                            c3185d4 = c3186e21.f13519Y[i12];
                                            C31138i c31138i15 = c3185d4.f13463i;
                                            c3186e3 = c3186e21;
                                            C3185d c3185d21 = c3185d4.f13460f;
                                            c31138i2 = c3185d21 != null ? c3185d21.f13463i : null;
                                            c31138i = c31138i15;
                                        } else {
                                            c3186e3 = c3186e21;
                                            c3185d4 = c3186e13.f13519Y[i12];
                                            c31138i = c3185d4 != null ? c3185d4.f13463i : null;
                                            c31138i2 = c3186e.f13519Y[i29].f13463i;
                                        }
                                        if (c3185d4 != null) {
                                            m16003f3 += c3185d4.m16003f();
                                        }
                                        int i31 = m16003f3;
                                        int m16003f4 = c3186e19.f13519Y[i29].m16003f() + m16003f2;
                                        int i32 = z21 ? 8 : 4;
                                        if (c31138i12 == null || c31138i14 == null || c31138i == null || c31138i2 == null) {
                                            c3186e4 = c3186e3;
                                            c3186e2 = c3186e19;
                                            i13 = 8;
                                        } else {
                                            c3186e4 = c3186e3;
                                            c3186e2 = c3186e19;
                                            i13 = 8;
                                            c31133d.m151265c(c31138i12, c31138i14, m16003f4, 0.5f, c31138i, c31138i2, i31, i32);
                                        }
                                        c3186e20 = c3186e4;
                                    }
                                    c3186e19 = c3186e.m16068X() != i13 ? c3186e : c3186e2;
                                    i17 = i11;
                                    c3186e = c3186e20;
                                    i27 = 8;
                                }
                                C3185d c3185d22 = c3186e12.f13519Y[i12];
                                c3185d = c3186e16.f13519Y[i12].f13460f;
                                int i33 = i12 + 1;
                                c3185d2 = c3186e13.f13519Y[i33];
                                c3185d3 = c3186e11.f13519Y[i33].f13460f;
                                if (c3185d != null) {
                                    if (c3186e12 != c3186e13) {
                                        c31133d.m151267e(c3185d22.f13463i, c3185d.f13463i, c3185d22.m16003f(), 5);
                                    } else if (c3185d3 != null) {
                                        c31133d.m151265c(c3185d22.f13463i, c3185d.f13463i, c3185d22.m16003f(), 0.5f, c3185d2.f13463i, c3185d3.f13463i, c3185d2.m16003f(), 5);
                                    }
                                }
                                if (c3185d3 != null && c3186e12 != c3186e13) {
                                    c31133d.m151267e(c3185d2.f13463i, c3185d3.f13463i, -c3185d2.m16003f(), 5);
                                }
                            }
                        } else {
                            int i34 = c3184c.f13442j;
                            boolean z22 = i34 > 0 && c3184c.f13441i == i34;
                            C3186e c3186e22 = c3186e12;
                            C3186e c3186e23 = c3186e22;
                            while (c3186e23 != null) {
                                C3186e c3186e24 = c3186e23.f13505O0[i17];
                                while (c3186e24 != null && c3186e24.m16068X() == 8) {
                                    c3186e24 = c3186e24.f13505O0[i17];
                                }
                                if (c3186e24 != null || c3186e23 == c3186e13) {
                                    C3185d c3185d23 = c3186e23.f13519Y[i12];
                                    C31138i c31138i16 = c3185d23.f13463i;
                                    C3185d c3185d24 = c3185d23.f13460f;
                                    C31138i c31138i17 = c3185d24 != null ? c3185d24.f13463i : null;
                                    if (c3186e22 != c3186e23) {
                                        c31138i17 = c3186e22.f13519Y[i12 + 1].f13463i;
                                    } else if (c3186e23 == c3186e12) {
                                        C3185d c3185d25 = c3186e16.f13519Y[i12].f13460f;
                                        c31138i17 = c3185d25 != null ? c3185d25.f13463i : null;
                                    }
                                    int m16003f5 = c3185d23.m16003f();
                                    int i35 = i12 + 1;
                                    int m16003f6 = c3186e23.f13519Y[i35].m16003f();
                                    if (c3186e24 != null) {
                                        c3185d5 = c3186e24.f13519Y[i12];
                                        c31138i3 = c3185d5.f13463i;
                                    } else {
                                        c3185d5 = c3186e11.f13519Y[i35].f13460f;
                                        if (c3185d5 != null) {
                                            c31138i3 = c3185d5.f13463i;
                                        } else {
                                            c3186e5 = c3186e24;
                                            c31138i3 = null;
                                            C31138i c31138i18 = c3186e23.f13519Y[i35].f13463i;
                                            if (c3185d5 != null) {
                                                m16003f6 += c3185d5.m16003f();
                                            }
                                            int m16003f7 = m16003f5 + c3186e22.f13519Y[i35].m16003f();
                                            if (c31138i16 != null || c31138i17 == null || c31138i3 == null || c31138i18 == null) {
                                                c3186e6 = c3186e5;
                                            } else {
                                                if (c3186e23 == c3186e12) {
                                                    m16003f7 = c3186e12.f13519Y[i12].m16003f();
                                                }
                                                int i36 = m16003f7;
                                                c3186e6 = c3186e5;
                                                c3186e7 = c3186e22;
                                                c31133d.m151265c(c31138i16, c31138i17, i36, 0.5f, c31138i3, c31138i18, c3186e23 == c3186e13 ? c3186e13.f13519Y[i35].m16003f() : m16003f6, z22 ? 8 : 5);
                                                if (c3186e23.m16068X() != 8) {
                                                    c3186e23 = c3186e7;
                                                }
                                                c3186e22 = c3186e23;
                                                c3186e23 = c3186e6;
                                            }
                                        }
                                    }
                                    c3186e5 = c3186e24;
                                    C31138i c31138i182 = c3186e23.f13519Y[i35].f13463i;
                                    if (c3185d5 != null) {
                                    }
                                    int m16003f72 = m16003f5 + c3186e22.f13519Y[i35].m16003f();
                                    if (c31138i16 != null) {
                                    }
                                    c3186e6 = c3186e5;
                                } else {
                                    c3186e6 = c3186e24;
                                }
                                c3186e7 = c3186e22;
                                if (c3186e23.m16068X() != 8) {
                                }
                                c3186e22 = c3186e23;
                                c3186e23 = c3186e6;
                            }
                        }
                        if ((z19 && !z17) || c3186e12 == null || c3186e12 == c3186e13) {
                            return;
                        }
                        C3185d[] c3185dArr6 = c3186e12.f13519Y;
                        C3185d c3185d26 = c3185dArr6[i12];
                        if (c3186e13 == null) {
                            c3186e13 = c3186e12;
                        }
                        int i37 = i12 + 1;
                        C3185d c3185d27 = c3186e13.f13519Y[i37];
                        C3185d c3185d28 = c3185d26.f13460f;
                        c31138i4 = c3185d28 != null ? c3185d28.f13463i : null;
                        C3185d c3185d29 = c3185d27.f13460f;
                        C31138i c31138i19 = c3185d29 != null ? c3185d29.f13463i : null;
                        if (c3186e11 != c3186e13) {
                            C3185d c3185d30 = c3186e11.f13519Y[i37].f13460f;
                            c31138i19 = c3185d30 != null ? c3185d30.f13463i : null;
                        }
                        if (c3186e12 == c3186e13) {
                            c3185d27 = c3185dArr6[i37];
                        }
                        if (c31138i4 == null || c31138i19 == null) {
                            return;
                        }
                        c31133d.m151265c(c3185d26.f13463i, c31138i4, c3185d26.m16003f(), 0.5f, c31138i19, c3185d27.f13463i, c3186e13.f13519Y[i37].m16003f(), 5);
                        return;
                    }
                }
                if (z13) {
                    C3185d c3185d31 = c3185d11.f13460f;
                    if (c3185d31.f13458d == c3187f) {
                        c31133d.m151267e(c3185d11.f13463i, c3185d31.f13463i, -c3185d11.m16003f(), 4);
                    }
                }
                c31133d.m151272j(c3185d11.f13463i, c3186e11.f13519Y[i23].f13460f.f13463i, -c3185d11.m16003f(), 6);
                if (z16) {
                }
                arrayList = c3184c.f13440h;
                if (arrayList != null) {
                    if (c3184c.f13450r) {
                    }
                    float f162 = 0.0f;
                    C3186e c3186e172 = null;
                    i14 = 0;
                    float f172 = 0.0f;
                    while (i14 < size) {
                    }
                }
                if (c3186e12 == null) {
                }
                if (z19) {
                }
                int i272 = 8;
                if (z17) {
                    int i282 = c3184c.f13442j;
                    if (i282 <= 0) {
                    }
                    C3186e c3186e192 = c3186e12;
                    c3186e = c3186e192;
                    while (c3186e != null) {
                    }
                    C3185d c3185d222 = c3186e12.f13519Y[i12];
                    c3185d = c3186e16.f13519Y[i12].f13460f;
                    int i332 = i12 + 1;
                    c3185d2 = c3186e13.f13519Y[i332];
                    c3185d3 = c3186e11.f13519Y[i332].f13460f;
                    if (c3185d != null) {
                    }
                    if (c3185d3 != null) {
                        c31133d.m151267e(c3185d2.f13463i, c3185d3.f13463i, -c3185d2.m16003f(), 5);
                    }
                }
                if (z19) {
                }
                C3185d[] c3185dArr62 = c3186e12.f13519Y;
                C3185d c3185d262 = c3185dArr62[i12];
                if (c3186e13 == null) {
                }
                int i372 = i12 + 1;
                C3185d c3185d272 = c3186e13.f13519Y[i372];
                C3185d c3185d282 = c3185d262.f13460f;
                if (c3185d282 != null) {
                }
                C3185d c3185d292 = c3185d272.f13460f;
                if (c3185d292 != null) {
                }
                if (c3186e11 != c3186e13) {
                }
                if (c3186e12 == c3186e13) {
                }
                if (c31138i4 == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        if (z16) {
        }
        arrayList = c3184c.f13440h;
        if (arrayList != null) {
        }
        if (c3186e12 == null) {
        }
        if (z19) {
        }
        int i2722 = 8;
        if (z17) {
        }
        if (z19) {
        }
        C3185d[] c3185dArr622 = c3186e12.f13519Y;
        C3185d c3185d2622 = c3185dArr622[i12];
        if (c3186e13 == null) {
        }
        int i3722 = i12 + 1;
        C3185d c3185d2722 = c3186e13.f13519Y[i3722];
        C3185d c3185d2822 = c3185d2622.f13460f;
        if (c3185d2822 != null) {
        }
        C3185d c3185d2922 = c3185d2722.f13460f;
        if (c3185d2922 != null) {
        }
        if (c3186e11 != c3186e13) {
        }
        if (c3186e12 == c3186e13) {
        }
        if (c31138i4 == null) {
        }
    }

    /* renamed from: b */
    public static void m15994b(C3187f c3187f, C31133d c31133d, ArrayList arrayList, int i11) {
        int i12;
        C3184c[] c3184cArr;
        int i13;
        if (i11 == 0) {
            i12 = c3187f.f13590f1;
            c3184cArr = c3187f.f13593i1;
            i13 = 0;
        } else {
            i12 = c3187f.f13591g1;
            c3184cArr = c3187f.f13592h1;
            i13 = 2;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            C3184c c3184c = c3184cArr[i14];
            c3184c.m15997a();
            if (arrayList == null || arrayList.contains(c3184c.f13433a)) {
                m15993a(c3187f, c31133d, i11, i13, c3184c);
            }
        }
    }
}
