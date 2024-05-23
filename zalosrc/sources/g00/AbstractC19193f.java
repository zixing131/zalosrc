package g00;

import d00.C17687a;

/* renamed from: g00.f */
/* loaded from: classes4.dex */
public abstract class AbstractC19193f {
    /* renamed from: a */
    public static void m100646a(C17687a c17687a, float[] fArr) {
        int length = fArr.length / 2;
        int length2 = c17687a.f89695q + fArr.length;
        float[] fArr2 = new float[length2];
        for (int i11 = 0; i11 < c17687a.f89694p; i11++) {
            for (int i12 = 0; i12 < length; i12++) {
                fArr2[i12] = c17687a.f89691r[i11][0];
            }
            int i13 = c17687a.f89695q;
            if (i13 >= 0) {
                System.arraycopy(c17687a.f89691r[i11], 0, fArr2, length, i13);
            }
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = c17687a.f89695q;
                fArr2[length + i15 + i14] = c17687a.f89691r[i11][i15 - 1];
            }
            int length3 = length2 - fArr.length;
            for (int i16 = 0; i16 < length3; i16++) {
                int length4 = fArr.length - 1;
                float f11 = 0.0f;
                int i17 = 0;
                while (i17 < fArr.length) {
                    f11 += fArr2[i16 + i17] * fArr[length4];
                    i17++;
                    length4--;
                }
                fArr2[i16] = f11;
            }
            int i18 = c17687a.f89695q;
            if (i18 >= 0) {
                System.arraycopy(fArr2, 0, c17687a.f89691r[i11], 0, i18);
            }
        }
    }

    /* renamed from: b */
    public static void m100647b(C17687a c17687a, float[] fArr) {
        int length = fArr.length / 2;
        int length2 = c17687a.f89694p + fArr.length;
        float[] fArr2 = new float[length2];
        for (int i11 = 0; i11 < c17687a.f89695q; i11++) {
            for (int i12 = 0; i12 < length; i12++) {
                fArr2[i12] = c17687a.f89691r[0][i11];
            }
            for (int i13 = 0; i13 < c17687a.f89694p; i13++) {
                fArr2[length + i13] = c17687a.f89691r[i13][i11];
            }
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = c17687a.f89694p;
                fArr2[length + i15 + i14] = c17687a.f89691r[i15 - 1][i11];
            }
            int length3 = length2 - fArr.length;
            for (int i16 = 0; i16 < length3; i16++) {
                int length4 = fArr.length - 1;
                float f11 = 0.0f;
                int i17 = 0;
                while (i17 < fArr.length) {
                    f11 += fArr2[i16 + i17] * fArr[length4];
                    i17++;
                    length4--;
                }
                fArr2[i16] = f11;
            }
            for (int i18 = 0; i18 < c17687a.f89694p; i18++) {
                c17687a.f89691r[i18][i11] = fArr2[i18];
            }
        }
    }
}
