package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.Keep;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.LoaderUtils;
import ho0.AbstractC20110a;
import me0.AbstractC23150n1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LoaderUtils {

    /* renamed from: a */
    static final Object f89262a = new Object();

    /* renamed from: b */
    static volatile boolean f89263b = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalocore.connection.socket.LoaderUtils$a */
    /* loaded from: classes.dex */
    public static class C17515a {

        /* renamed from: a */
        static final InterfaceC17524c f89264a = new InterfaceC17524c() { // from class: com.zing.zalocore.connection.socket.b
            @Override // com.zing.zalocore.connection.socket.InterfaceC17524c
            /* renamed from: a */
            public final boolean mo93352a() {
                boolean m93168b;
                m93168b = LoaderUtils.C17515a.m93168b();
                return m93168b;
            }
        };

        /* renamed from: b */
        public static /* synthetic */ boolean m93168b() {
            try {
                if (NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84890g0) < 0) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                AbstractC20110a.m104539h(th2);
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m93165a() {
        if (!f89263b) {
            synchronized (f89262a) {
                if (!f89263b) {
                    f89263b = C17515a.f89264a.mo93352a();
                    if (!f89263b) {
                        try {
                            System.loadLibrary("curl");
                            System.loadLibrary("leveldb-jni");
                            System.loadLibrary("znetwork");
                            f89263b = true;
                        } catch (UnsatisfiedLinkError e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                    if (f89263b) {
                        nativeSetNativePath(AbstractC23150n1.m118978x("/zalo/"), AbstractC23150n1.m118976w(null, true), CoreUtility.getAppContext().getNoBackupFilesDir().getPath() + "/");
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m93166b() {
        return f89263b;
    }

    @Keep
    private static native void nativeSetNativePath(String str, String str2, String str3);
}
