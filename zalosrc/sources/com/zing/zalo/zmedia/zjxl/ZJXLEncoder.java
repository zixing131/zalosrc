package com.zing.zalo.zmedia.zjxl;

/* loaded from: classes7.dex */
public class ZJXLEncoder extends AbstractC17392a {
    /* renamed from: b */
    public static double m92548b(Object obj, String str, int i11, int i12, boolean z11) {
        if (!AbstractC17392a.f88637a) {
            AbstractC17392a.m92551a();
        }
        return jxlEncodeImage(obj, str, i11, i12, z11);
    }

    /* renamed from: c */
    public static int m92549c(double d11) {
        return ZJXLDecoder.m92544d(d11);
    }

    /* renamed from: d */
    public static int m92550d(double d11) {
        return ZJXLDecoder.m92547g(d11);
    }

    private static native double jxlEncodeImage(Object obj, String str, int i11, int i12, boolean z11);

    private static native double jxlGetJpegFileInfo(String str, Object obj);
}
