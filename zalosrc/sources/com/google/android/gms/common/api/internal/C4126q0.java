package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC4199m;
import p704z4.AbstractC31250s;
import p704z4.C31218b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.q0 */
/* loaded from: classes2.dex */
public final class C4126q0 {

    /* renamed from: a */
    private final C31218b f16426a;

    /* renamed from: b */
    private final Feature f16427b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4126q0(C31218b c31218b, Feature feature, AbstractC31250s abstractC31250s) {
        this.f16426a = c31218b;
        this.f16427b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4126q0)) {
            C4126q0 c4126q0 = (C4126q0) obj;
            if (AbstractC4199m.m19701a(this.f16426a, c4126q0.f16426a) && AbstractC4199m.m19701a(this.f16427b, c4126q0.f16427b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f16426a, this.f16427b);
    }

    public final String toString() {
        return AbstractC4199m.m19703c(this).m19704a("key", this.f16426a).m19704a("feature", this.f16427b).toString();
    }
}
