package g00;

import d00.C17687a;
import java.lang.reflect.Array;

/* renamed from: g00.k */
/* loaded from: classes4.dex */
abstract class AbstractC19198k {
    /* renamed from: a */
    public static C17687a m100655a(C17687a c17687a, C17687a c17687a2, C17687a c17687a3) {
        float[][] fArr;
        int i11;
        float[][] fArr2 = c17687a.f89691r;
        float[][] fArr3 = c17687a2.f89691r;
        int i12 = c17687a.f89695q;
        int i13 = c17687a.f89694p;
        if (c17687a3 == null) {
            fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i13, i12);
        } else {
            fArr = c17687a3.f89691r;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                float[] fArr4 = fArr[i14];
                float f11 = fArr2[i14][i15];
                float f12 = fArr3[i14][i15];
                fArr4[i15] = (float) Math.sqrt((f11 * f11) + (f12 * f12));
            }
        }
        C17687a c17687a4 = new C17687a(i12, i13);
        float[][] fArr5 = c17687a4.f89691r;
        for (int i16 = 1; i16 < i13 - 1; i16++) {
            for (int i17 = 1; i17 < i12 - 1; i17++) {
                float f13 = fArr2[i16][i17];
                int i18 = -1;
                float f14 = 0.0f;
                if (f13 > 0.0f) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                if (fArr3[i16][i17] <= 0.0f) {
                    i18 = 1;
                }
                if (Math.abs(f13) > Math.abs(fArr3[i16][i17])) {
                    float[] fArr6 = fArr[i16];
                    int i19 = i17 + i11;
                    float f15 = fArr6[i19];
                    float f16 = fArr[i16 - i18][i19];
                    int i21 = i17 - i11;
                    float f17 = fArr6[i21];
                    float f18 = fArr[i18 + i16][i21];
                    float abs = ((Math.abs(fArr2[i16][i17]) - Math.abs(fArr3[i16][i17])) * f15) + (Math.abs(fArr3[i16][i17]) * f16);
                    float abs2 = ((Math.abs(fArr2[i16][i17]) - Math.abs(fArr3[i16][i17])) * f17) + (Math.abs(fArr3[i16][i17]) * f18);
                    float abs3 = fArr[i16][i17] * Math.abs(fArr2[i16][i17]);
                    if (abs3 >= abs && abs3 > abs2) {
                        f14 = Math.abs(fArr2[i16][i17]);
                    }
                    fArr5[i16][i17] = f14;
                } else {
                    float[] fArr7 = fArr[i16 - i18];
                    float f19 = fArr7[i17];
                    float f21 = fArr7[i17 + i11];
                    float[] fArr8 = fArr[i18 + i16];
                    float f22 = fArr8[i17];
                    float f23 = fArr8[i17 - i11];
                    float abs4 = ((Math.abs(fArr3[i16][i17]) - Math.abs(fArr2[i16][i17])) * f19) + (Math.abs(fArr2[i16][i17]) * f21);
                    float abs5 = ((Math.abs(fArr3[i16][i17]) - Math.abs(fArr2[i16][i17])) * f22) + (Math.abs(fArr2[i16][i17]) * f23);
                    float abs6 = fArr[i16][i17] * Math.abs(fArr3[i16][i17]);
                    if (abs6 >= abs4 && abs6 > abs5) {
                        f14 = Math.abs(fArr3[i16][i17]);
                    }
                    fArr5[i16][i17] = f14;
                }
            }
        }
        return c17687a4;
    }
}
