package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wd */
/* loaded from: classes.dex */
public final class C5667wd implements InterfaceC5650vd {

    /* renamed from: a */
    public static final AbstractC5677x6 f32886a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32887b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32888c;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29622a();
        f32886a = m29622a.m29625d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f32887b = m29622a.m29627f("measurement.lifecycle.app_backgrounded_tracking", true);
        f32888c = m29622a.m29627f("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5650vd
    public final boolean zza() {
        return ((Boolean) f32888c.m30014b()).booleanValue();
    }
}
