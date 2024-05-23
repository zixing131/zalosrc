package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tx */
/* loaded from: classes2.dex */
public final class C5036tx {

    /* renamed from: a */
    private final Map f28648a = new HashMap();

    /* renamed from: b */
    private final C5110vx f28649b;

    public C5036tx(C5110vx c5110vx) {
        this.f28649b = c5110vx;
    }

    /* renamed from: a */
    public final C5110vx m26788a() {
        return this.f28649b;
    }

    /* renamed from: b */
    public final void m26789b(String str, C4999sx c4999sx) {
        this.f28648a.put(str, c4999sx);
    }

    /* renamed from: c */
    public final void m26790c(String str, String str2, long j11) {
        C5110vx c5110vx = this.f28649b;
        C4999sx c4999sx = (C4999sx) this.f28648a.get(str2);
        String[] strArr = {str};
        if (c4999sx != null) {
            c5110vx.m27427e(c4999sx, j11, strArr);
        }
        this.f28648a.put(str, new C4999sx(j11, null, null));
    }
}
