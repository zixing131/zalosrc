package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class dy2 {

    /* renamed from: a */
    private final String f19444a;

    /* renamed from: b */
    private final String f19445b;

    private dy2(String str, String str2) {
        this.f19444a = str;
        this.f19445b = str2;
    }

    /* renamed from: a */
    public static dy2 m21566a(String str, String str2) {
        az2.m20352a(str, "Name is null or empty");
        az2.m20352a(str2, "Version is null or empty");
        return new dy2(str, str2);
    }

    /* renamed from: b */
    public final String m21567b() {
        return this.f19444a;
    }

    /* renamed from: c */
    public final String m21568c() {
        return this.f19445b;
    }
}
