package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class v43 implements k53 {
    /* renamed from: b */
    public static v43 m27166b(char c11) {
        return new s43(c11);
    }

    /* renamed from: a */
    public abstract boolean mo26247a(char c11);

    @Override // com.google.android.gms.internal.ads.k53
    public final /* synthetic */ boolean zza(Object obj) {
        return mo26247a(((Character) obj).charValue());
    }
}
