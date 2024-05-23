package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.play_billing.y0 */
/* loaded from: classes2.dex */
public final class C5869y0 {

    /* renamed from: b */
    private static volatile C5869y0 f33448b;

    /* renamed from: c */
    static final C5869y0 f33449c = new C5869y0(true);

    /* renamed from: a */
    private final Map f33450a = Collections.emptyMap();

    C5869y0(boolean z11) {
    }

    /* renamed from: a */
    public static C5869y0 m30566a() {
        C5869y0 c5869y0 = f33448b;
        if (c5869y0 != null) {
            return c5869y0;
        }
        synchronized (C5869y0.class) {
            try {
                C5869y0 c5869y02 = f33448b;
                if (c5869y02 != null) {
                    return c5869y02;
                }
                C5869y0 m30211a = AbstractC5750e1.m30211a(C5869y0.class);
                f33448b = m30211a;
                return m30211a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final AbstractC5768h1 m30567b(InterfaceC5775i2 interfaceC5775i2, int i11) {
        AbstractC30228a.m149044a(this.f33450a.get(new C5863x0(interfaceC5775i2, i11)));
        return null;
    }
}
