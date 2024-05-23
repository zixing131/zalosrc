package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.oc */
/* loaded from: classes.dex */
public final class C5530oc implements InterfaceC5513nc {

    /* renamed from: a */
    public static final AbstractC5677x6 f32707a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32708b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32709c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32710d;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29622a();
        f32707a = m29622a.m29627f("measurement.client.consent_state_v1", true);
        f32708b = m29622a.m29627f("measurement.client.3p_consent_state_v1", true);
        f32709c = m29622a.m29627f("measurement.service.consent_state_v1_W36", true);
        f32710d = m29622a.m29625d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5513nc
    public final long zza() {
        return ((Long) f32710d.m30014b()).longValue();
    }
}
