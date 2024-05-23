package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m53 {

    /* renamed from: a */
    private final Map f24400a = new HashMap();

    /* renamed from: b */
    private Map f24401b;

    /* renamed from: a */
    public final synchronized Map m24472a() {
        try {
            if (this.f24401b == null) {
                this.f24401b = Collections.unmodifiableMap(new HashMap(this.f24400a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24401b;
    }
}
