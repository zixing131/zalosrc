package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.db */
/* loaded from: classes.dex */
public final class C5342db {

    /* renamed from: c */
    private static final C5342db f32335c = new C5342db();

    /* renamed from: b */
    private final ConcurrentMap f32337b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC5410hb f32336a = new C5528oa();

    private C5342db() {
    }

    /* renamed from: a */
    public static C5342db m29065a() {
        return f32335c;
    }

    /* renamed from: b */
    public final InterfaceC5393gb m29066b(Class cls) {
        AbstractC5290aa.m28884c(cls, "messageType");
        InterfaceC5393gb interfaceC5393gb = (InterfaceC5393gb) this.f32337b.get(cls);
        if (interfaceC5393gb == null) {
            interfaceC5393gb = this.f32336a.mo29189a(cls);
            AbstractC5290aa.m28884c(cls, "messageType");
            AbstractC5290aa.m28884c(interfaceC5393gb, "schema");
            InterfaceC5393gb interfaceC5393gb2 = (InterfaceC5393gb) this.f32337b.putIfAbsent(cls, interfaceC5393gb);
            if (interfaceC5393gb2 != null) {
                return interfaceC5393gb2;
            }
        }
        return interfaceC5393gb;
    }
}
