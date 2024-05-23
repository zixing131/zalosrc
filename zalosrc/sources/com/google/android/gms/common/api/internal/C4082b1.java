package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
/* loaded from: classes2.dex */
public final class C4082b1 {

    /* renamed from: c */
    public static final Status f16260c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a */
    final Set f16261a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C4079a1 f16262b = new C4079a1(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m19348a(BasePendingResult basePendingResult) {
        this.f16261a.add(basePendingResult);
        basePendingResult.m19286o(this.f16262b);
    }

    /* renamed from: b */
    public final void m19349b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f16261a.toArray(new BasePendingResult[0])) {
            basePendingResult.m19286o(null);
            if (basePendingResult.m19285n()) {
                this.f16261a.remove(basePendingResult);
            }
        }
    }
}
