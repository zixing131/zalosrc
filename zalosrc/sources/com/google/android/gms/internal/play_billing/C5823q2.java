package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.play_billing.q2 */
/* loaded from: classes2.dex */
public final class C5823q2 {

    /* renamed from: c */
    private static final C5823q2 f33410c = new C5823q2();

    /* renamed from: b */
    private final ConcurrentMap f33412b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC5841t2 f33411a = new C5724a2();

    private C5823q2() {
    }

    /* renamed from: a */
    public static C5823q2 m30431a() {
        return f33410c;
    }

    /* renamed from: b */
    public final InterfaceC5835s2 m30432b(Class cls) {
        AbstractC5804n1.m30377c(cls, "messageType");
        InterfaceC5835s2 interfaceC5835s2 = (InterfaceC5835s2) this.f33412b.get(cls);
        if (interfaceC5835s2 == null) {
            interfaceC5835s2 = this.f33411a.mo30158a(cls);
            AbstractC5804n1.m30377c(cls, "messageType");
            InterfaceC5835s2 interfaceC5835s22 = (InterfaceC5835s2) this.f33412b.putIfAbsent(cls, interfaceC5835s2);
            if (interfaceC5835s22 != null) {
                return interfaceC5835s22;
            }
        }
        return interfaceC5835s2;
    }
}
