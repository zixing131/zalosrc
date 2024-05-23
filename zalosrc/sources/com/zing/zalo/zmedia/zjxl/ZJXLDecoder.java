package com.zing.zalo.zmedia.zjxl;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.zing.zalo.utils.Keep;

/* loaded from: classes7.dex */
public class ZJXLDecoder extends AbstractC17392a {

    @Keep
    /* loaded from: classes7.dex */
    public static class Options {

        /* renamed from: a */
        public boolean f88636a;

        @Keep
        public int bmOrientation;

        @Keep
        public int bmPreviewHeight;

        @Keep
        public int bmPreviewWidth;
    }

    /* renamed from: b */
    public static double m92542b(byte[] bArr, int i11, Bitmap bitmap) {
        if (!AbstractC17392a.f88637a) {
            AbstractC17392a.m92551a();
        }
        return jxlDecodeImageData(bArr, i11, bitmap);
    }

    /* renamed from: c */
    public static double m92543c(String str, int i11, Bitmap bitmap) {
        if (!AbstractC17392a.f88637a) {
            AbstractC17392a.m92551a();
        }
        return jxlDecodeImageFile(str, i11, bitmap);
    }

    /* renamed from: d */
    public static int m92544d(double d11) {
        if (!AbstractC17392a.f88637a) {
            AbstractC17392a.m92551a();
        }
        return jxlGetErrorCode(d11);
    }

    /* renamed from: e */
    public static double m92545e(String str, Object obj) {
        if (!AbstractC17392a.f88637a) {
            AbstractC17392a.m92551a();
        }
        return jxlGetInfoFromFile(str, obj);
    }

    /* renamed from: f */
    public static double m92546f(byte[] bArr, Object obj) {
        if (!AbstractC17392a.f88637a) {
            AbstractC17392a.m92551a();
        }
        return jxlGetInfoFromStream(bArr, obj);
    }

    /* renamed from: g */
    public static int m92547g(double d11) {
        if (!AbstractC17392a.f88637a) {
            AbstractC17392a.m92551a();
        }
        return jxlGetProcessingTime(d11);
    }

    @Keep
    private static native double jxlDecodeImageData(byte[] bArr, int i11, Bitmap bitmap);

    @Keep
    private static native double jxlDecodeImageFile(String str, int i11, Bitmap bitmap);

    @Keep
    private static native int jxlGetErrorCode(double d11);

    @Keep
    private static native double jxlGetInfoFromFile(String str, Object obj);

    @Keep
    private static native double jxlGetInfoFromStream(byte[] bArr, Object obj);

    @Keep
    private static native int jxlGetProcessingTime(double d11);

    public static native int prepairData(String str, AssetManager assetManager);
}
