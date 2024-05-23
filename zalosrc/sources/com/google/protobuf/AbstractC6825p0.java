package com.google.protobuf;

/* renamed from: com.google.protobuf.p0 */
/* loaded from: classes3.dex */
abstract class AbstractC6825p0 {

    /* renamed from: a */
    private static final InterfaceC6821n0 f37457a = m35088c();

    /* renamed from: b */
    private static final InterfaceC6821n0 f37458b = new C6823o0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC6821n0 m35086a() {
        return f37457a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC6821n0 m35087b() {
        return f37458b;
    }

    /* renamed from: c */
    private static InterfaceC6821n0 m35088c() {
        try {
            return (InterfaceC6821n0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
