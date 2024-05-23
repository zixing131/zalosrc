package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l9 */
/* loaded from: classes.dex */
abstract class AbstractC5476l9 {

    /* renamed from: a */
    private static final AbstractC5442j9 f32479a = new C5459k9();

    /* renamed from: b */
    private static final AbstractC5442j9 f32480b;

    static {
        AbstractC5442j9 abstractC5442j9;
        try {
            abstractC5442j9 = (AbstractC5442j9) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC5442j9 = null;
        }
        f32480b = abstractC5442j9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC5442j9 m29420a() {
        AbstractC5442j9 abstractC5442j9 = f32480b;
        if (abstractC5442j9 != null) {
            return abstractC5442j9;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC5442j9 m29421b() {
        return f32479a;
    }
}
