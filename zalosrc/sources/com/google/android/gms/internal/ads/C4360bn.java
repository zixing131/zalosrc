package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.bn */
/* loaded from: classes2.dex */
public final class C4360bn extends AbstractC4507fn {

    /* renamed from: e */
    private final AtomicReference f17908e = new AtomicReference(new C4323an());

    public C4360bn(InterfaceC4544gn interfaceC4544gn) {
    }

    /* renamed from: g */
    protected static boolean m20605g(int i11, boolean z11) {
        int i12 = i11 & 3;
        if (i12 != 3) {
            return z11 && i12 == 2;
        }
        return true;
    }

    /* renamed from: h */
    private static int m20606h(int i11, int i12) {
        if (i11 == -1) {
            return i12 != -1 ? -1 : 0;
        }
        if (i12 == -1) {
            return 1;
        }
        return i11 - i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4507fn
    /* renamed from: e */
    protected final AbstractC5248zm[] mo20607e(InterfaceC4797nh[] interfaceC4797nhArr, C5137wm[] c5137wmArr, int[][][] iArr) {
        C4433dn c4433dn;
        int i11;
        C4433dn c4433dn2;
        C5099vm c5099vm;
        int[] iArr2;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        int m20606h;
        int i13 = 2;
        AbstractC5248zm[] abstractC5248zmArr = new AbstractC5248zm[2];
        C4323an c4323an = (C4323an) this.f17908e.get();
        int i14 = 0;
        boolean z14 = false;
        while (true) {
            int i15 = -1;
            int i16 = 1;
            if (i14 >= i13) {
                break;
            }
            if (interfaceC4797nhArr[i14].zzc() == i13) {
                if (!z14) {
                    InterfaceC4797nh interfaceC4797nh = interfaceC4797nhArr[i14];
                    C5137wm c5137wm = c5137wmArr[i14];
                    int[][] iArr3 = iArr[i14];
                    int i17 = c4323an.f17186d;
                    int i18 = -1;
                    int i19 = 0;
                    C5099vm c5099vm2 = null;
                    int i21 = 0;
                    int i22 = 0;
                    while (i19 < c5137wm.f30005a) {
                        C5099vm m27655b = c5137wm.m27655b(i19);
                        int i23 = m27655b.f29402a;
                        ArrayList arrayList2 = new ArrayList(i16);
                        for (int i24 = 0; i24 <= 0; i24++) {
                            arrayList2.add(Integer.valueOf(i24));
                        }
                        int[] iArr4 = iArr3[i19];
                        int i25 = 0;
                        while (i25 <= 0) {
                            C5137wm c5137wm2 = c5137wm;
                            if (m20605g(iArr4[i25], true)) {
                                zzasw m27307b = m27655b.m27307b(i25);
                                if (arrayList2.contains(Integer.valueOf(i25))) {
                                    int i26 = m27307b.f31840y;
                                    c5099vm = m27655b;
                                    z11 = true;
                                    z12 = true;
                                } else {
                                    c5099vm = m27655b;
                                    z11 = true;
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                    arrayList = arrayList2;
                                    i12 = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i12 = 2;
                                }
                                iArr2 = iArr4;
                                boolean m20605g = m20605g(iArr4[i25], false);
                                if (m20605g) {
                                    i12 += 1000;
                                }
                                if (i12 > i22) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i12 == i22) {
                                    if (m27307b.m28686a() != i18) {
                                        m20606h = m20606h(m27307b.m28686a(), i18);
                                    } else {
                                        m20606h = m20606h(m27307b.f31832q, i15);
                                    }
                                    if (m20605g && z12) {
                                        if (m20606h <= 0) {
                                        }
                                        i15 = m27307b.f31832q;
                                        i18 = m27307b.m28686a();
                                        i22 = i12;
                                        i21 = i25;
                                        c5099vm2 = c5099vm;
                                    } else {
                                        if (m20606h >= 0) {
                                        }
                                        i15 = m27307b.f31832q;
                                        i18 = m27307b.m28686a();
                                        i22 = i12;
                                        i21 = i25;
                                        c5099vm2 = c5099vm;
                                    }
                                } else {
                                    if (!z13) {
                                    }
                                    i15 = m27307b.f31832q;
                                    i18 = m27307b.m28686a();
                                    i22 = i12;
                                    i21 = i25;
                                    c5099vm2 = c5099vm;
                                }
                            } else {
                                c5099vm = m27655b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i25++;
                            c5137wm = c5137wm2;
                            m27655b = c5099vm;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i19++;
                        i16 = 1;
                    }
                    if (c5099vm2 == null) {
                        c4433dn2 = null;
                    } else {
                        c4433dn2 = new C4433dn(c5099vm2, i21, 0, null);
                    }
                    abstractC5248zmArr[i14] = c4433dn2;
                    if (c4433dn2 != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                int i27 = c5137wmArr[i14].f30005a;
            }
            i14++;
            i13 = 2;
        }
        boolean z15 = false;
        for (int i28 = 0; i28 < 2; i28++) {
            if (interfaceC4797nhArr[i28].zzc() == 1 && !z15) {
                C5137wm c5137wm3 = c5137wmArr[i28];
                int[][] iArr5 = iArr[i28];
                String str = c4323an.f17183a;
                int i29 = 0;
                int i31 = 0;
                int i32 = -1;
                int i33 = -1;
                while (i29 < c5137wm3.f30005a) {
                    C5099vm m27655b2 = c5137wm3.m27655b(i29);
                    int[] iArr6 = iArr5[i29];
                    int i34 = i33;
                    int i35 = i32;
                    int i36 = i31;
                    int i37 = 0;
                    while (true) {
                        int i38 = m27655b2.f29402a;
                        if (i37 <= 0) {
                            if (m20605g(iArr6[i37], true)) {
                                zzasw m27307b2 = m27655b2.m27307b(i37);
                                int i39 = iArr6[i37];
                                if (1 != (m27307b2.f31827M & 1)) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                if (m20605g(i39, false)) {
                                    i11 += 1000;
                                }
                                if (i11 > i36) {
                                    i35 = i29;
                                    i34 = i37;
                                    i36 = i11;
                                }
                            }
                            i37++;
                        }
                    }
                    i29++;
                    i31 = i36;
                    i32 = i35;
                    i33 = i34;
                }
                if (i32 == -1) {
                    c4433dn = null;
                } else {
                    c4433dn = new C4433dn(c5137wm3.m27655b(i32), i33, 0, null);
                }
                abstractC5248zmArr[i28] = c4433dn;
                if (c4433dn != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
        }
        return abstractC5248zmArr;
    }
}
