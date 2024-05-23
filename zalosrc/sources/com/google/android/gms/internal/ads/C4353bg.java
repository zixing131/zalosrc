package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.bg */
/* loaded from: classes2.dex */
public final class C4353bg {

    /* renamed from: a */
    private final Map f17738a = new HashMap();

    /* renamed from: a */
    public final AtomicReference m20512a(String str) {
        synchronized (this) {
            try {
                if (!this.f17738a.containsKey(str)) {
                    this.f17738a.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) this.f17738a.get(str);
    }
}
