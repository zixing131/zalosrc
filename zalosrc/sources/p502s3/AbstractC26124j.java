package p502s3;

import android.graphics.Bitmap;

/* renamed from: s3.j */
/* loaded from: classes2.dex */
public abstract class AbstractC26124j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3.j$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124363a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f124363a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124363a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124363a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124363a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static int m134492a(int i11, int i12, Bitmap.Config config) {
        return i11 * i12 * m134494c(config);
    }

    /* renamed from: b */
    public static int m134493b(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: c */
    private static int m134494c(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f124363a[config.ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2 || i11 == 3) {
            return 2;
        }
        return 4;
    }
}
