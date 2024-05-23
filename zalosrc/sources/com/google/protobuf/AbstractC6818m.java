package com.google.protobuf;

/* renamed from: com.google.protobuf.m */
/* loaded from: classes3.dex */
abstract class AbstractC6818m {

    /* renamed from: a */
    private static final AbstractC6814k f37377a = new C6816l();

    /* renamed from: b */
    private static final AbstractC6814k f37378b = m35054c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC6814k m35052a() {
        AbstractC6814k abstractC6814k = f37378b;
        if (abstractC6814k != null) {
            return abstractC6814k;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC6814k m35053b() {
        return f37377a;
    }

    /* renamed from: c */
    private static AbstractC6814k m35054c() {
        try {
            return (AbstractC6814k) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
