package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.t0 */
/* loaded from: classes3.dex */
public final class C6833t0 {

    /* renamed from: c */
    private static final C6833t0 f37482c = new C6833t0();

    /* renamed from: b */
    private final ConcurrentMap f37484b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC6841x0 f37483a = new C6785a0();

    private C6833t0() {
    }

    /* renamed from: a */
    public static C6833t0 m35141a() {
        return f37482c;
    }

    /* renamed from: b */
    public InterfaceC6839w0 m35142b(Class cls, InterfaceC6839w0 interfaceC6839w0) {
        AbstractC6830s.m35130b(cls, "messageType");
        AbstractC6830s.m35130b(interfaceC6839w0, "schema");
        return (InterfaceC6839w0) this.f37484b.putIfAbsent(cls, interfaceC6839w0);
    }

    /* renamed from: c */
    public InterfaceC6839w0 m35143c(Class cls) {
        AbstractC6830s.m35130b(cls, "messageType");
        InterfaceC6839w0 interfaceC6839w0 = (InterfaceC6839w0) this.f37484b.get(cls);
        if (interfaceC6839w0 == null) {
            InterfaceC6839w0 mo34726a = this.f37483a.mo34726a(cls);
            InterfaceC6839w0 m35142b = m35142b(cls, mo34726a);
            if (m35142b != null) {
                return m35142b;
            }
            return mo34726a;
        }
        return interfaceC6839w0;
    }

    /* renamed from: d */
    public InterfaceC6839w0 m35144d(Object obj) {
        return m35143c(obj.getClass());
    }
}
