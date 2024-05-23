package com.zing.zalo.zvideotranscode;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.Keep;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;

@Keep
/* loaded from: classes7.dex */
public class ZVideoTranscode {

    /* renamed from: a */
    static volatile boolean f88669a = m92592b();

    /* renamed from: b */
    static volatile boolean f88670b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zvideotranscode.ZVideoTranscode$b */
    /* loaded from: classes7.dex */
    public static class C17401b {

        /* renamed from: a */
        static final ZVideoTranscode f88671a = new ZVideoTranscode();
    }

    /* renamed from: a */
    public static ZVideoTranscode m92591a() {
        if (!f88669a) {
            f88669a = m92592b();
        }
        return C17401b.f88671a;
    }

    /* renamed from: b */
    static boolean m92592b() {
        if (!f88669a) {
            synchronized (ZVideoTranscode.class) {
                try {
                    if (!f88669a) {
                        NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84881X);
                        f88669a = true;
                    }
                } catch (Throwable unused) {
                    f88669a = false;
                } finally {
                }
            }
        }
        return f88669a;
    }

    @Keep
    public static native void setBitrate(int i11);

    @Keep
    public static native void setDst(String str);

    @Keep
    public static native void setDuration(long j11);

    @Keep
    public static native void setEncodeH265(boolean z11);

    @Keep
    public static native void setForceI(boolean z11);

    @Keep
    public static native void setFramerate(double d11);

    @Keep
    public static native void setHeight(int i11);

    @Keep
    public static native void setMaxSize(int i11);

    @Keep
    public static native void setMuteAudio(boolean z11);

    @Keep
    public static native void setPreset(String str);

    @Keep
    public static native void setProfile(String str);

    @Keep
    public static native void setResolution(String str);

    @Keep
    public static native void setSrc(String str);

    @Keep
    public static native void setStartTime(long j11);

    @Keep
    public static native void setWidth(int i11);

    @Keep
    public static native int transcodeVideo(String str, Object obj, String str2, boolean z11);

    private ZVideoTranscode() {
        synchronized (ZVideoTranscode.class) {
            try {
                if (!f88670b && f88669a) {
                    f88670b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
