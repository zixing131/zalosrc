package com.google.android.play.core.appupdate;

import android.content.Context;
import p051c7.AbstractC3311f0;

/* renamed from: com.google.android.play.core.appupdate.h */
/* loaded from: classes.dex */
public abstract class AbstractC6482h {

    /* renamed from: a */
    private static InterfaceC6478e f36287a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized InterfaceC6478e m33348a(Context context) {
        InterfaceC6478e interfaceC6478e;
        synchronized (AbstractC6482h.class) {
            try {
                if (f36287a == null) {
                    C6481g c6481g = new C6481g(null);
                    c6481g.m33347b(new C6488n(AbstractC3311f0.m16779a(context)));
                    f36287a = c6481g.m33346a();
                }
                interfaceC6478e = f36287a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC6478e;
    }
}
