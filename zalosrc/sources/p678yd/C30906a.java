package p678yd;

import android.graphics.Bitmap;
import fn0.AbstractC19074t;

/* renamed from: yd.a */
/* loaded from: classes3.dex */
public final class C30906a {
    /* renamed from: a */
    public Bitmap m150158a(int i11, Bitmap bitmap) {
        AbstractC19074t.m100208f(bitmap, "original");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i12 = i11; i12 >= 1; i12 /= 2) {
            int i13 = height - i12;
            for (int i14 = i12; i14 < i13; i14++) {
                int i15 = width - i12;
                int i16 = i12;
                while (i16 < i15) {
                    int i17 = ((i14 - i12) * width) + i16;
                    int i18 = iArr[i17 - i12];
                    int i19 = iArr[i17 + i12];
                    int i21 = iArr[i17];
                    int i22 = ((i14 + i12) * width) + i16;
                    int i23 = iArr[i22 - i12];
                    int i24 = iArr[i22 + i12];
                    int i25 = iArr[i22];
                    int i26 = (i14 * width) + i16;
                    int i27 = i13;
                    int i28 = iArr[i26 - i12];
                    int i29 = i15;
                    int i31 = iArr[i26 + i12];
                    iArr[i26] = ((((((((((i18 & 16711680) + (i19 & 16711680)) + (i21 & 16711680)) + (i23 & 16711680)) + (i24 & 16711680)) + (i25 & 16711680)) + (i28 & 16711680)) + (i31 & 16711680)) >> 3) & 16711680) | ((((((((((i18 & 255) + (i19 & 255)) + (i21 & 255)) + (i23 & 255)) + (i24 & 255)) + (i25 & 255)) + (i28 & 255)) + (i31 & 255)) >> 3) & 255) | (-16777216) | ((((((((((i18 & 65280) + (i19 & 65280)) + (i21 & 65280)) + (i23 & 65280)) + (i24 & 65280)) + (i25 & 65280)) + (i28 & 65280)) + (i31 & 65280)) >> 3) & 65280);
                    i16++;
                    i13 = i27;
                    height = height;
                    i15 = i29;
                }
            }
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
