package com.zing.zalo.zmedia.zjxl;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;

/* renamed from: com.zing.zalo.zmedia.zjxl.a */
/* loaded from: classes7.dex */
public abstract class AbstractC17392a {

    /* renamed from: a */
    static volatile boolean f88637a;

    /* renamed from: b */
    static volatile boolean f88638b;

    static {
        m92551a();
        f88637a = false;
        f88638b = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m92551a() {
        synchronized (AbstractC17392a.class) {
            try {
                if (!f88637a) {
                    try {
                        NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84884a0);
                        f88637a = true;
                    } catch (Throwable th2) {
                        f88637a = false;
                        th2.printStackTrace();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
