package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.d2 */
/* loaded from: classes2.dex */
abstract class AbstractC5745d2 {

    /* renamed from: a */
    private static final C5738c2 f33306a;

    /* renamed from: b */
    private static final C5738c2 f33307b;

    static {
        C5738c2 c5738c2;
        try {
            c5738c2 = (C5738c2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c5738c2 = null;
        }
        f33306a = c5738c2;
        f33307b = new C5738c2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5738c2 m30202a() {
        return f33306a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5738c2 m30203b() {
        return f33307b;
    }
}
