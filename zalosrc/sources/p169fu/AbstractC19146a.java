package p169fu;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import ho0.AbstractC20110a;
import me0.AbstractC23110j5;
import p678yd.C30907b;
import ru.C25978a;

/* renamed from: fu.a */
/* loaded from: classes4.dex */
public abstract class AbstractC19146a {
    /* renamed from: a */
    public static Bitmap m100462a(Bitmap bitmap) {
        return bitmap.copy(bitmap.getConfig(), true);
    }

    /* renamed from: b */
    public static float[] m100463b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = 0;
        loop0: while (true) {
            if (i11 < width) {
                for (int i12 = 0; i12 < height; i12++) {
                    if (iArr[(i12 * width) + i11] != 0) {
                        break loop0;
                    }
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        int i13 = 0;
        loop2: while (true) {
            if (i13 < height) {
                for (int i14 = i11; i14 < width; i14++) {
                    if (iArr[(i13 * width) + i14] != 0) {
                        break loop2;
                    }
                }
                i13++;
            } else {
                i13 = 0;
                break;
            }
        }
        int i15 = width - 1;
        int i16 = i15;
        loop4: while (true) {
            if (i16 >= i11) {
                for (int i17 = height - 1; i17 >= i13; i17--) {
                    if (iArr[(i17 * width) + i16] != 0) {
                        break loop4;
                    }
                }
                i16--;
            } else {
                i16 = width;
                break;
            }
        }
        int i18 = height - 1;
        loop6: while (true) {
            if (i18 >= i13) {
                for (int i19 = i15; i19 >= i11; i19--) {
                    if (iArr[(i18 * width) + i19] != 0) {
                        break loop6;
                    }
                }
                i18--;
            } else {
                i18 = height;
                break;
            }
        }
        float f11 = width;
        float f12 = height;
        return new float[]{(i11 * 1.0f) / f11, (i16 * 1.0f) / f11, (i13 * 1.0f) / f12, (i18 * 1.0f) / f12};
    }

    /* renamed from: c */
    public static boolean m100464c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (bitmap.getPixel(0, 0) != 0) {
            return false;
        }
        int i11 = height - 1;
        if (bitmap.getPixel(0, i11) != 0) {
            return false;
        }
        int i12 = width - 1;
        if (bitmap.getPixel(i12, 0) != 0 || bitmap.getPixel(i12, i11) != 0 || bitmap.getPixel(AbstractC23110j5.m118487a(1, width - 2), AbstractC23110j5.m118487a(1, height - 2)) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static Bitmap m100465d(Bitmap bitmap, int i11) {
        return new C30907b(C25978a.m133807a()).m150160a(i11, bitmap);
    }

    /* renamed from: e */
    public static Bitmap m100466e(Bitmap bitmap, int i11) {
        AbstractC20110a.m104538g("Rotate bitmap: " + i11, new Object[0]);
        if (i11 != 0 && bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i11, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap != createBitmap) {
                    bitmap.recycle();
                    return createBitmap;
                }
                return bitmap;
            } catch (OutOfMemoryError unused) {
                return bitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: f */
    public static Bitmap m100467f(Bitmap bitmap, int i11, int i12, float f11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f11);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    /* renamed from: g */
    public static Bitmap m100468g(Bitmap bitmap, float f11) {
        return Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f11), Math.round(f11 * bitmap.getHeight()), true);
    }

    /* renamed from: h */
    public static Bitmap m100469h(Bitmap bitmap, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i12 = i11 & 16777215;
        for (int i13 = 0; i13 < width; i13++) {
            iArr[i13] = (iArr[i13] & (-16777216)) | i12;
        }
        createBitmap.setPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return createBitmap;
    }

    /* renamed from: i */
    public static Bitmap m100470i(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            if (i12 < bitmap.getWidth()) {
                for (int i13 = 0; i13 < bitmap.getHeight(); i13++) {
                    if (iArr[(bitmap.getWidth() * i13) + i12] != 0) {
                        break loop0;
                    }
                }
                i12++;
            } else {
                i12 = 0;
                break;
            }
        }
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= bitmap.getHeight()) {
                break;
            }
            for (int i15 = i12; i15 < bitmap.getWidth(); i15++) {
                if (iArr[(bitmap.getWidth() * i14) + i15] != 0) {
                    i11 = i14;
                    break loop2;
                }
            }
            i14++;
        }
        int width2 = bitmap.getWidth() - 1;
        loop4: while (true) {
            if (width2 < i12) {
                break;
            }
            for (int height2 = bitmap.getHeight() - 1; height2 >= i11; height2--) {
                if (iArr[(bitmap.getWidth() * height2) + width2] != 0) {
                    width = width2;
                    break loop4;
                }
            }
            width2--;
        }
        int height3 = bitmap.getHeight() - 1;
        loop6: while (true) {
            if (height3 < i11) {
                break;
            }
            for (int width3 = bitmap.getWidth() - 1; width3 >= i12; width3--) {
                if (iArr[(bitmap.getWidth() * height3) + width3] != 0) {
                    height = height3;
                    break loop6;
                }
            }
            height3--;
        }
        int i16 = width - i12;
        int i17 = height - i11;
        if (i16 % 2 != 0) {
            i16--;
        }
        return Bitmap.createBitmap(bitmap, i12, i11, i16, i17);
    }
}
