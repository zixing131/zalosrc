package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.td */
/* loaded from: classes.dex */
public final class C5616td implements InterfaceC5599sd {

    /* renamed from: a */
    public static final AbstractC5677x6 f32810a;

    /* renamed from: b */
    public static final AbstractC5677x6 f32811b;

    /* renamed from: c */
    public static final AbstractC5677x6 f32812c;

    /* renamed from: d */
    public static final AbstractC5677x6 f32813d;

    static {
        C5609t6 m29622a = new C5609t6(AbstractC5473l6.m29403a("com.google.android.gms.measurement")).m29622a();
        f32810a = m29622a.m29627f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f32811b = m29622a.m29627f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f32812c = m29622a.m29627f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f32813d = m29622a.m29625d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5599sd
    public final boolean zza() {
        return ((Boolean) f32812c.m30014b()).booleanValue();
    }
}
