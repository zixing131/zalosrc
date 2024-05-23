package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yb */
/* loaded from: classes2.dex */
public final class C5200yb extends AbstractC5126wb {

    /* renamed from: a */
    public String f30870a;

    /* renamed from: b */
    public long f30871b;

    /* renamed from: c */
    public String f30872c;

    /* renamed from: d */
    public String f30873d;

    /* renamed from: e */
    public String f30874e;

    public C5200yb(String str) {
        String str2;
        String str3;
        String str4;
        this.f30870a = "E";
        this.f30871b = -1L;
        this.f30872c = "E";
        this.f30873d = "E";
        this.f30874e = "E";
        HashMap m27586a = AbstractC5126wb.m27586a(str);
        if (m27586a != null) {
            if (m27586a.get(0) == null) {
                str2 = "E";
            } else {
                str2 = (String) m27586a.get(0);
            }
            this.f30870a = str2;
            this.f30871b = m27586a.get(1) != null ? ((Long) m27586a.get(1)).longValue() : -1L;
            if (m27586a.get(2) == null) {
                str3 = "E";
            } else {
                str3 = (String) m27586a.get(2);
            }
            this.f30872c = str3;
            if (m27586a.get(3) == null) {
                str4 = "E";
            } else {
                str4 = (String) m27586a.get(3);
            }
            this.f30873d = str4;
            this.f30874e = m27586a.get(4) != null ? (String) m27586a.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5126wb
    /* renamed from: b */
    protected final HashMap mo21352b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f30870a);
        hashMap.put(4, this.f30874e);
        hashMap.put(3, this.f30873d);
        hashMap.put(2, this.f30872c);
        hashMap.put(1, Long.valueOf(this.f30871b));
        return hashMap;
    }
}
