package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.o2 */
/* loaded from: classes2.dex */
abstract class AbstractC5811o2 {

    /* renamed from: a */
    private static final C5805n2 f33396a;

    /* renamed from: b */
    private static final C5805n2 f33397b;

    static {
        C5805n2 c5805n2;
        try {
            c5805n2 = (C5805n2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c5805n2 = null;
        }
        f33396a = c5805n2;
        f33397b = new C5805n2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5805n2 m30421a() {
        return f33396a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5805n2 m30422b() {
        return f33397b;
    }
}
