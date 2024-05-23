package q20;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import fn0.AbstractC19074t;

/* renamed from: q20.f */
/* loaded from: classes5.dex */
public final class C25083f {

    /* renamed from: a */
    public static final C25083f f120483a = new C25083f();

    private C25083f() {
    }

    /* renamed from: b */
    private final Bitmap m130013b(Bitmap bitmap, int i11) {
        int i12;
        if (i11 < 1) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int i14 = (i11 * 2) + 1;
        int[][] iArr5 = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            iArr5[i15] = new int[3];
        }
        int i16 = i11 + 1;
        int i17 = i16 * i16;
        int i18 = i17 * 256;
        int[] iArr6 = new int[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            iArr6[i19] = i19 / i17;
        }
        int[] iArr7 = new int[i14];
        for (int i21 = 0; i21 < i14; i21++) {
            iArr7[i21] = i16 - Math.abs(i21 - i11);
        }
        int[] iArr8 = new int[Math.max(width, height)];
        int i22 = 0;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i23 = width - 1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i26 < height) {
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            for (int i37 = -i11; i37 <= i11; i37++) {
                int i38 = iArr[Math.max(i22, Math.min(i37, i23)) + i24];
                int i39 = i37 + i11;
                int[] iArr9 = iArr5[i39];
                int i41 = (i38 & 16711680) >> 16;
                iArr9[i22] = i41;
                int i42 = (i38 & 65280) >> 8;
                iArr9[1] = i42;
                int i43 = i38 & 255;
                iArr9[2] = i43;
                int i44 = iArr7[i39];
                i27 += i41 * i44;
                i28 += i42 * i44;
                i29 += i44 * i43;
                if (i37 > 0) {
                    i34 += i41;
                    i35 += i42;
                    i36 += i43;
                } else {
                    i31 += i41;
                    i32 += i42;
                    i33 += i43;
                }
            }
            int i45 = 0;
            int i46 = 0;
            while (i45 < width) {
                iArr2[i25] = iArr6[i27];
                iArr3[i25] = iArr6[i28];
                iArr4[i25] = iArr6[i29];
                int i47 = i27 - i31;
                int i48 = i28 - i32;
                int i49 = i29 - i33;
                int[] iArr10 = iArr5[i46];
                i46 = (i46 + 1) % i14;
                int i51 = i31 - iArr10[i22];
                int i52 = i32 - iArr10[1];
                int i53 = i33 - iArr10[2];
                if (i26 == 0) {
                    iArr8[i45] = Math.min(i45 + i11 + 1, i23);
                }
                int i54 = iArr[iArr8[i45] + i24];
                int i55 = (i54 & 16711680) >> 16;
                iArr10[0] = i55;
                int i56 = (i54 & 65280) >> 8;
                iArr10[1] = i56;
                int i57 = i54 & 255;
                iArr10[2] = i57;
                int i58 = i34 + i55;
                int i59 = i35 + i56;
                int i61 = i36 + i57;
                i27 = i47 + i58;
                i28 = i48 + i59;
                i29 = i49 + i61;
                int[] iArr11 = iArr5[(i46 + i11) % i14];
                int i62 = iArr11[0];
                i31 = i51 + i62;
                int i63 = iArr11[1];
                i32 = i52 + i63;
                int i64 = iArr11[2];
                i33 = i53 + i64;
                i34 = i58 - i62;
                i35 = i59 - i63;
                i36 = i61 - i64;
                i45++;
                i25++;
                i22 = 0;
            }
            i26++;
            i24 += width;
            i22 = 0;
        }
        int i65 = height - 1;
        int i66 = 0;
        while (i66 < width) {
            int i67 = -i11;
            int i68 = i67 * width;
            int i69 = 0;
            int i71 = 0;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            while (i67 <= i11) {
                int[] iArr12 = iArr;
                int max = Math.max(0, i68) + i66;
                int i79 = i67 + i11;
                int[] iArr13 = iArr5[i79];
                int i81 = iArr2[max];
                iArr13[0] = i81;
                int i82 = iArr3[max];
                iArr13[1] = i82;
                int i83 = iArr4[max];
                iArr13[2] = i83;
                int i84 = iArr7[i79];
                i69 += i81 * i84;
                i71 += i82 * i84;
                i72 += i84 * i83;
                if (i67 > 0) {
                    i76 += i81;
                    i77 += i82;
                    i78 += i83;
                } else {
                    i73 += i81;
                    i74 += i82;
                    i75 += i83;
                }
                if (i67 < i65) {
                    i68 += width;
                }
                i67++;
                iArr = iArr12;
            }
            int[] iArr14 = iArr;
            int i85 = i66;
            int i86 = 0;
            int i87 = 0;
            while (i86 < height) {
                iArr14[i85] = (iArr14[i85] & (-16777216)) | (iArr6[i69] << 16) | (iArr6[i71] << 8) | iArr6[i72];
                int i88 = i69 - i73;
                int i89 = i71 - i74;
                int i91 = i72 - i75;
                int[] iArr15 = iArr5[i87];
                i87 = (i87 + 1) % i14;
                int i92 = i73 - iArr15[0];
                int i93 = i74 - iArr15[1];
                int i94 = i75 - iArr15[2];
                if (i66 == 0) {
                    i12 = height;
                    iArr8[i86] = Math.min(i86 + i11 + 1, i65) * width;
                } else {
                    i12 = height;
                }
                int i95 = iArr8[i86] + i66;
                int i96 = iArr2[i95];
                iArr15[0] = i96;
                int i97 = iArr3[i95];
                iArr15[1] = i97;
                int i98 = iArr4[i95];
                iArr15[2] = i98;
                int i99 = i76 + i96;
                int i100 = i77 + i97;
                int i101 = i78 + i98;
                i69 = i88 + i99;
                i71 = i89 + i100;
                i72 = i91 + i101;
                int[] iArr16 = iArr5[(i87 + i11) % i14];
                int i102 = iArr16[0];
                i73 = i92 + i102;
                int i103 = iArr16[1];
                i74 = i93 + i103;
                int i104 = iArr16[2];
                i75 = i94 + i104;
                i76 = i99 - i102;
                i77 = i100 - i103;
                i78 = i101 - i104;
                i86++;
                i85 += width;
                height = i12;
            }
            i66++;
            iArr = iArr14;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }

    /* renamed from: a */
    public final Bitmap m130014a(Bitmap bitmap, float f11) {
        float f12;
        AbstractC19074t.m100208f(bitmap, "bitmap");
        float f13 = 25.0f;
        if (f11 > 25.0f) {
            f12 = f11 / 25.0f;
        } else {
            f13 = f11;
            f12 = 1.0f;
        }
        try {
            Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
            if (f12 > 1.0f) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(copy, (int) (bitmap.getWidth() / f12), (int) (bitmap.getHeight() / f12), true);
                copy.recycle();
                copy = createScaledBitmap;
            }
            AbstractC19074t.m100205c(copy);
            return m130013b(copy, (int) f13);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void m130015c(Bitmap bitmap, int i11) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        new Canvas(bitmap).drawColor(i11);
    }
}
