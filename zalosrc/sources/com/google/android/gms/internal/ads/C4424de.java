package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.de */
/* loaded from: classes2.dex */
public final class C4424de extends AbstractC5126wb {

    /* renamed from: a */
    public Long f19187a;

    /* renamed from: b */
    public Boolean f19188b;

    /* renamed from: c */
    public Boolean f19189c;

    public C4424de(String str) {
        HashMap m27586a = AbstractC5126wb.m27586a(str);
        if (m27586a != null) {
            this.f19187a = (Long) m27586a.get(0);
            this.f19188b = (Boolean) m27586a.get(1);
            this.f19189c = (Boolean) m27586a.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5126wb
    /* renamed from: b */
    protected final HashMap mo21352b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f19187a);
        hashMap.put(1, this.f19188b);
        hashMap.put(2, this.f19189c);
        return hashMap;
    }
}
