package com.zing.zalo.zlottie.jni;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.zing.zalo.zlottie.jni.a */
/* loaded from: classes7.dex */
public abstract class AbstractC17288a {

    /* renamed from: a */
    private static final AtomicBoolean f88018a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m92131a() {
        return f88018a.get();
    }

    /* renamed from: b */
    private static void m92132b() {
        try {
            NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84891h0);
            f88018a.set(true);
        } catch (Throwable unused) {
            f88018a.set(false);
        }
    }

    /* renamed from: c */
    public static synchronized void m92133c() {
        synchronized (AbstractC17288a.class) {
            if (!m92131a()) {
                m92132b();
            }
        }
    }
}
