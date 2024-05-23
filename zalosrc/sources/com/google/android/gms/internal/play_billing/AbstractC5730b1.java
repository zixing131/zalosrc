package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.b1 */
/* loaded from: classes2.dex */
abstract class AbstractC5730b1 {

    /* renamed from: a */
    private static final AbstractC5875z0 f33241a = new C5723a1();

    /* renamed from: b */
    private static final AbstractC5875z0 f33242b;

    static {
        AbstractC5875z0 abstractC5875z0;
        try {
            abstractC5875z0 = (AbstractC5875z0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC5875z0 = null;
        }
        f33242b = abstractC5875z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC5875z0 m30172a() {
        AbstractC5875z0 abstractC5875z0 = f33242b;
        if (abstractC5875z0 != null) {
            return abstractC5875z0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC5875z0 m30173b() {
        return f33241a;
    }
}
