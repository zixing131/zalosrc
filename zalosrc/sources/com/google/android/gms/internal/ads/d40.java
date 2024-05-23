package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d40 implements c40 {

    /* renamed from: a */
    private final cw1 f19079a;

    public d40(cw1 cw1Var) {
        AbstractC4205o.m19723l(cw1Var, "The Inspector Manager must not be null");
        this.f19079a = cw1Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j11 = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j11 = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.f19079a.m21178i((String) map.get("extras"), j11);
        }
    }
}
