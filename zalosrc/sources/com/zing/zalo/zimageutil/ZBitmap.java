package com.zing.zalo.zimageutil;

import android.graphics.Bitmap;
import com.zing.zalo.utils.Keep;

@Keep
/* loaded from: classes7.dex */
public class ZBitmap extends AbstractC17092a {
    static {
        AbstractC17092a.m91415a();
    }

    @Keep
    private static native void _blurBitmap(Bitmap bitmap, int i11, int i12, int i13, int i14, int i15);

    @Keep
    private static native int _clearBitmapColor(Bitmap bitmap, int i11, int i12, int i13, int i14, int i15);

    @Keep
    private static native int _pinBitmap(Bitmap bitmap);

    @Keep
    private static native int _roundBitmap(Bitmap bitmap);

    @Keep
    private static native int _setHasAlpha(Bitmap bitmap, boolean z11);

    /* renamed from: b */
    public static void m91413b(Bitmap bitmap, int i11, boolean z11) {
        if (bitmap != null && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            _blurBitmap(bitmap, i11, z11 ? 1 : 0, bitmap.getWidth(), bitmap.getHeight(), bitmap.getRowBytes());
        }
    }

    /* renamed from: c */
    public static int m91414c(Bitmap bitmap, boolean z11, int i11, int i12, int i13, int i14) {
        if (bitmap != null && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return _clearBitmapColor(bitmap, z11 ? 1 : 0, i11, i12, i13, i14);
        }
        return -1;
    }
}
