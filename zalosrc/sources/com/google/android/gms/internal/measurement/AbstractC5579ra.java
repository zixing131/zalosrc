package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ra */
/* loaded from: classes.dex */
abstract class AbstractC5579ra {

    /* renamed from: a */
    private static final C5562qa f32767a;

    /* renamed from: b */
    private static final C5562qa f32768b;

    static {
        C5562qa c5562qa;
        try {
            c5562qa = (C5562qa) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c5562qa = null;
        }
        f32767a = c5562qa;
        f32768b = new C5562qa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5562qa m29583a() {
        return f32767a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5562qa m29584b() {
        return f32768b;
    }
}
