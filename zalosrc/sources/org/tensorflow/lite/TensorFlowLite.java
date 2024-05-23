package org.tensorflow.lite;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.tensorflow.lite.InterfaceC24498e;

/* loaded from: classes7.dex */
public final class TensorFlowLite {

    /* renamed from: b */
    private static final String[][] f118038b;

    /* renamed from: c */
    private static final Throwable f118039c;

    /* renamed from: e */
    private static AtomicBoolean[] f118041e;

    /* renamed from: a */
    private static final Logger f118037a = Logger.getLogger(InterfaceC24498e.class.getName());

    /* renamed from: d */
    private static volatile boolean f118040d = false;

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        f118038b = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (String[] strArr2 : strArr) {
            for (String str : strArr2) {
                try {
                    System.loadLibrary(str);
                    f118037a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e11) {
                    f118037a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e11;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e11);
                    }
                }
            }
        }
        f118039c = unsatisfiedLinkError;
        f118041e = new AtomicBoolean[InterfaceC24498e.a.EnumC32920a.values().length];
        for (int i11 = 0; i11 < InterfaceC24498e.a.EnumC32920a.values().length; i11++) {
            f118041e[i11] = new AtomicBoolean();
        }
    }

    /* renamed from: a */
    public static void m127818a() {
        if (f118040d) {
            return;
        }
        try {
            nativeDoNothing();
            f118040d = true;
        } catch (UnsatisfiedLinkError e11) {
            Throwable th2 = f118039c;
            if (th2 == null) {
                th2 = e11;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th2);
            unsatisfiedLinkError.initCause(e11);
            throw unsatisfiedLinkError;
        }
    }

    private static native void nativeDoNothing();
}
