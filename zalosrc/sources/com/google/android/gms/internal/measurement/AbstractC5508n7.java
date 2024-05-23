package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.n7 */
/* loaded from: classes.dex */
public abstract class AbstractC5508n7 {
    /* renamed from: a */
    public static InterfaceC5423i7 m29464a(InterfaceC5423i7 interfaceC5423i7) {
        if (!(interfaceC5423i7 instanceof C5474l7) && !(interfaceC5423i7 instanceof C5440j7)) {
            if (interfaceC5423i7 instanceof Serializable) {
                return new C5440j7(interfaceC5423i7);
            }
            return new C5474l7(interfaceC5423i7);
        }
        return interfaceC5423i7;
    }

    /* renamed from: b */
    public static InterfaceC5423i7 m29465b(Object obj) {
        return new C5491m7(obj);
    }
}
