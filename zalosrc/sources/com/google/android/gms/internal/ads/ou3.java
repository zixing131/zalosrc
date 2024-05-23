package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ou3 implements xv3 {

    /* renamed from: a */
    private static final ou3 f25958a = new ou3();

    private ou3() {
    }

    /* renamed from: c */
    public static ou3 m25331c() {
        return f25958a;
    }

    @Override // com.google.android.gms.internal.ads.xv3
    /* renamed from: a */
    public final wv3 mo25332a(Class cls) {
        if (tu3.class.isAssignableFrom(cls)) {
            try {
                return (wv3) tu3.m26758n(cls.asSubclass(tu3.class)).mo20044D(3, null, null);
            } catch (Exception e11) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e11);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.xv3
    /* renamed from: b */
    public final boolean mo25333b(Class cls) {
        return tu3.class.isAssignableFrom(cls);
    }
}
