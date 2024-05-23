package com.zing.zalo.zimageutil;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;

/* renamed from: com.zing.zalo.zimageutil.a */
/* loaded from: classes7.dex */
public abstract class AbstractC17092a {

    /* renamed from: a */
    private static final Object f87439a = new Object();

    /* renamed from: b */
    protected static volatile boolean f87440b = false;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m91415a() {
        if (!f87440b) {
            synchronized (f87439a) {
                try {
                    if (!f87440b) {
                        NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84883Z);
                        f87440b = true;
                    }
                } catch (Throwable th2) {
                    f87440b = false;
                    th2.printStackTrace();
                } finally {
                }
            }
        }
    }
}
