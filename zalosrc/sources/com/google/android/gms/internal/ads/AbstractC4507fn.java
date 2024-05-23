package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.ads.fn */
/* loaded from: classes2.dex */
public abstract class AbstractC4507fn extends AbstractC4654jn {

    /* renamed from: b */
    private final SparseArray f20195b = new SparseArray();

    /* renamed from: c */
    private final SparseBooleanArray f20196c = new SparseBooleanArray();

    /* renamed from: d */
    private C4470en f20197d;

    @Override // com.google.android.gms.internal.ads.AbstractC4654jn
    /* renamed from: a */
    public final C4691kn mo22086a(InterfaceC4797nh[] interfaceC4797nhArr, C5137wm c5137wm) {
        C4834oh c4834oh;
        int[] iArr;
        int[] iArr2 = new int[3];
        C5099vm[][] c5099vmArr = new C5099vm[3];
        int[][][] iArr3 = new int[3][];
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = c5137wm.f30005a;
            c5099vmArr[i11] = new C5099vm[i12];
            iArr3[i11] = new int[i12];
        }
        int i13 = 2;
        int[] iArr4 = new int[2];
        for (int i14 = 0; i14 < 2; i14++) {
            interfaceC4797nhArr[i14].zze();
            iArr4[i14] = 4;
        }
        int i15 = 0;
        while (i15 < c5137wm.f30005a) {
            C5099vm m27655b = c5137wm.m27655b(i15);
            int i16 = 0;
            int i17 = 0;
            int i18 = 2;
            while (true) {
                if (i16 < i13) {
                    InterfaceC4797nh interfaceC4797nh = interfaceC4797nhArr[i16];
                    int i19 = 0;
                    while (true) {
                        int i21 = m27655b.f29402a;
                        if (i19 <= 0) {
                            int mo21473a = interfaceC4797nh.mo21473a(m27655b.m27307b(i19)) & 3;
                            if (mo21473a > i17) {
                                if (mo21473a == 3) {
                                    break;
                                }
                                i18 = i16;
                                i17 = mo21473a;
                            }
                            i19++;
                        }
                    }
                } else {
                    i16 = i18;
                    break;
                }
                i16++;
                i13 = 2;
            }
            if (i16 == 2) {
                int i22 = m27655b.f29402a;
                iArr = new int[1];
            } else {
                InterfaceC4797nh interfaceC4797nh2 = interfaceC4797nhArr[i16];
                int i23 = m27655b.f29402a;
                int[] iArr5 = new int[1];
                for (int i24 = 0; i24 <= 0; i24++) {
                    iArr5[i24] = interfaceC4797nh2.mo21473a(m27655b.m27307b(i24));
                }
                iArr = iArr5;
            }
            int i25 = iArr2[i16];
            c5099vmArr[i16][i25] = m27655b;
            iArr3[i16][i25] = iArr;
            iArr2[i16] = i25 + 1;
            i15++;
            i13 = 2;
        }
        C5137wm[] c5137wmArr = new C5137wm[2];
        int[] iArr6 = new int[2];
        int i26 = 0;
        for (int i27 = 2; i26 < i27; i27 = 2) {
            int i28 = iArr2[i26];
            c5137wmArr[i26] = new C5137wm((C5099vm[]) Arrays.copyOf(c5099vmArr[i26], i28));
            iArr3[i26] = (int[][]) Arrays.copyOf(iArr3[i26], i28);
            iArr6[i26] = interfaceC4797nhArr[i26].zzc();
            i26++;
        }
        C5137wm c5137wm2 = new C5137wm((C5099vm[]) Arrays.copyOf(c5099vmArr[2], iArr2[2]));
        AbstractC5248zm[] mo20607e = mo20607e(interfaceC4797nhArr, c5137wmArr, iArr3);
        int i29 = 0;
        for (int i31 = 2; i29 < i31; i31 = 2) {
            if (this.f20196c.get(i29)) {
                mo20607e[i29] = null;
            } else {
                C5137wm c5137wm3 = c5137wmArr[i29];
                Map map = (Map) this.f20195b.get(i29);
                if (map != null) {
                    AbstractC30228a.m149044a(map.get(c5137wm3));
                }
            }
            i29++;
        }
        C4470en c4470en = new C4470en(iArr6, c5137wmArr, iArr4, iArr3, c5137wm2);
        C4834oh[] c4834ohArr = new C4834oh[2];
        for (int i32 = 0; i32 < 2; i32++) {
            if (mo20607e[i32] != null) {
                c4834oh = C4834oh.f25635b;
            } else {
                c4834oh = null;
            }
            c4834ohArr[i32] = c4834oh;
        }
        return new C4691kn(c5137wm, new C4581hn(mo20607e, null), c4470en, c4834ohArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4654jn
    /* renamed from: b */
    public final void mo22087b(Object obj) {
        this.f20197d = (C4470en) obj;
    }

    /* renamed from: e */
    protected abstract AbstractC5248zm[] mo20607e(InterfaceC4797nh[] interfaceC4797nhArr, C5137wm[] c5137wmArr, int[][][] iArr);

    /* renamed from: f */
    public final void m22088f(int i11, boolean z11) {
        if (this.f20196c.get(i11) == z11) {
            return;
        }
        this.f20196c.put(i11, z11);
        m23659d();
    }
}
