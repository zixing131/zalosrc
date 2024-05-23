package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class ju3 {

    /* renamed from: a */
    private static final hu3 f23000a = new iu3();

    /* renamed from: b */
    private static final hu3 f23001b;

    static {
        hu3 hu3Var;
        try {
            hu3Var = (hu3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            hu3Var = null;
        }
        f23001b = hu3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static hu3 m23755a() {
        hu3 hu3Var = f23001b;
        if (hu3Var != null) {
            return hu3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static hu3 m23756b() {
        return f23000a;
    }
}
