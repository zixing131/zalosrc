package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sn */
/* loaded from: classes2.dex */
public final class C4989sn {

    /* renamed from: a */
    private final Map f27787a = new HashMap();

    /* renamed from: b */
    private Map f27788b;

    /* renamed from: a */
    public final synchronized Map m26369a() {
        try {
            if (this.f27788b == null) {
                this.f27788b = Collections.unmodifiableMap(new HashMap(this.f27787a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f27788b;
    }
}
