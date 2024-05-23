package com.zing.zalo.zlottie.jni;

import android.graphics.Bitmap;
import android.util.Size;

/* loaded from: classes7.dex */
public final class ZLottieJNI {

    /* renamed from: com.zing.zalo.zlottie.jni.ZLottieJNI$a */
    /* loaded from: classes7.dex */
    public enum EnumC17287a {
        FILE_PATH,
        JSON_DATA
    }

    static {
        AbstractC17288a.m92133c();
    }

    /* renamed from: a */
    public static long m92125a(String str, String str2, int i11, int i12, int[] iArr, boolean z11, String str3, boolean z12) {
        if (!AbstractC17288a.m92131a()) {
            return 0L;
        }
        return nCreate(str, str2, i11, i12, iArr, z11, str3, z12);
    }

    /* renamed from: b */
    public static void m92126b(long j11, int i11, int i12) {
        if (AbstractC17288a.m92131a()) {
            nCreateCache(j11, i11, i12);
        }
    }

    /* renamed from: c */
    public static long m92127c(String str, String str2, int[] iArr, boolean z11) {
        if (!AbstractC17288a.m92131a()) {
            return 0L;
        }
        return nCreateWithJson(str, str2, iArr, z11);
    }

    /* renamed from: d */
    public static void m92128d(long j11) {
        if (AbstractC17288a.m92131a()) {
            nDestroy(j11);
        }
    }

    /* renamed from: e */
    public static int m92129e(long j11, int i11, Bitmap bitmap, int i12, int i13, int i14) {
        if (!AbstractC17288a.m92131a()) {
            return -1;
        }
        return nGetFrame(j11, i11, bitmap, i12, i13, i14);
    }

    /* renamed from: f */
    public static Size m92130f(String str, EnumC17287a enumC17287a) {
        int[] nGetOriginalSizeFromJson;
        if (!AbstractC17288a.m92131a()) {
            return new Size(0, 0);
        }
        try {
            if (enumC17287a == EnumC17287a.FILE_PATH) {
                nGetOriginalSizeFromJson = nGetOriginalSize(str);
            } else {
                nGetOriginalSizeFromJson = nGetOriginalSizeFromJson(str);
            }
            return new Size(nGetOriginalSizeFromJson[0], nGetOriginalSizeFromJson[1]);
        } catch (Exception unused) {
            return new Size(0, 0);
        }
    }

    private static native long nCreate(String str, String str2, int i11, int i12, int[] iArr, boolean z11, String str3, boolean z12);

    private static native void nCreateCache(long j11, int i11, int i12);

    private static native long nCreateWithJson(String str, String str2, int[] iArr, boolean z11);

    private static native void nDestroy(long j11);

    private static native int nGetFrame(long j11, int i11, Bitmap bitmap, int i12, int i13, int i14);

    private static native int[] nGetOriginalSize(String str);

    private static native int[] nGetOriginalSizeFromJson(String str);
}
