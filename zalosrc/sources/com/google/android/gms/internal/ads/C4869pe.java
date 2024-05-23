package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pe */
/* loaded from: classes2.dex */
public final class C4869pe extends AbstractC5126wb {

    /* renamed from: a */
    public Long f26181a;

    /* renamed from: b */
    public Long f26182b;

    /* renamed from: c */
    public Long f26183c;

    /* renamed from: d */
    public Long f26184d;

    /* renamed from: e */
    public Long f26185e;

    public C4869pe(String str) {
        HashMap m27586a = AbstractC5126wb.m27586a(str);
        if (m27586a != null) {
            this.f26181a = (Long) m27586a.get(0);
            this.f26182b = (Long) m27586a.get(1);
            this.f26183c = (Long) m27586a.get(2);
            this.f26184d = (Long) m27586a.get(3);
            this.f26185e = (Long) m27586a.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5126wb
    /* renamed from: b */
    protected final HashMap mo21352b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f26181a);
        hashMap.put(1, this.f26182b);
        hashMap.put(2, this.f26183c);
        hashMap.put(3, this.f26184d);
        hashMap.put(4, this.f26185e);
        return hashMap;
    }
}
