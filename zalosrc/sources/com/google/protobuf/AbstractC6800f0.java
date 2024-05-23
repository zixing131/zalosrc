package com.google.protobuf;

/* renamed from: com.google.protobuf.f0 */
/* loaded from: classes3.dex */
abstract class AbstractC6800f0 {

    /* renamed from: a */
    private static final InterfaceC6794d0 f37269a = m34817c();

    /* renamed from: b */
    private static final InterfaceC6794d0 f37270b = new C6797e0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC6794d0 m34815a() {
        return f37269a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC6794d0 m34816b() {
        return f37270b;
    }

    /* renamed from: c */
    private static InterfaceC6794d0 m34817c() {
        try {
            return (InterfaceC6794d0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
