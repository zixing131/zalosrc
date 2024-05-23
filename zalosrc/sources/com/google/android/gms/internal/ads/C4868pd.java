package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pd */
/* loaded from: classes2.dex */
public final class C4868pd extends AbstractC5126wb {

    /* renamed from: a */
    public Long f26166a;

    /* renamed from: b */
    public Long f26167b;

    /* renamed from: c */
    public Long f26168c;

    public C4868pd(String str) {
        HashMap m27586a = AbstractC5126wb.m27586a(str);
        if (m27586a != null) {
            this.f26166a = (Long) m27586a.get(0);
            this.f26167b = (Long) m27586a.get(1);
            this.f26168c = (Long) m27586a.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5126wb
    /* renamed from: b */
    protected final HashMap mo21352b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f26166a);
        hashMap.put(1, this.f26167b);
        hashMap.put(2, this.f26168c);
        return hashMap;
    }
}
