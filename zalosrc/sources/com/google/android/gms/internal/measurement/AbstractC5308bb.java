package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bb */
/* loaded from: classes.dex */
abstract class AbstractC5308bb {

    /* renamed from: a */
    private static final C5291ab f32292a;

    /* renamed from: b */
    private static final C5291ab f32293b;

    static {
        C5291ab c5291ab;
        try {
            c5291ab = (C5291ab) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c5291ab = null;
        }
        f32292a = c5291ab;
        f32293b = new C5291ab();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5291ab m28952a() {
        return f32292a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5291ab m28953b() {
        return f32293b;
    }
}
