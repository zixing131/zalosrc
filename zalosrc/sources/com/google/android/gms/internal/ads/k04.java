package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class k04 implements j04, d04 {

    /* renamed from: b */
    private static final k04 f23053b = new k04(null);

    /* renamed from: a */
    private final Object f23054a;

    private k04(Object obj) {
        this.f23054a = obj;
    }

    /* renamed from: a */
    public static j04 m23792a(Object obj) {
        r04.m25934a(obj, "instance cannot be null");
        return new k04(obj);
    }

    /* renamed from: b */
    public static j04 m23793b(Object obj) {
        if (obj == null) {
            return f23053b;
        }
        return new k04(obj);
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final Object zzb() {
        return this.f23054a;
    }
}
