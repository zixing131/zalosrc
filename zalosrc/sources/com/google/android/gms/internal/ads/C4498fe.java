package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.fe */
/* loaded from: classes2.dex */
public final class C4498fe extends AbstractC5126wb {

    /* renamed from: a */
    public Long f20090a;

    /* renamed from: b */
    public Long f20091b;

    public C4498fe(String str) {
        HashMap m27586a = AbstractC5126wb.m27586a(str);
        if (m27586a != null) {
            this.f20090a = (Long) m27586a.get(0);
            this.f20091b = (Long) m27586a.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5126wb
    /* renamed from: b */
    protected final HashMap mo21352b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f20090a);
        hashMap.put(1, this.f20091b);
        return hashMap;
    }
}
