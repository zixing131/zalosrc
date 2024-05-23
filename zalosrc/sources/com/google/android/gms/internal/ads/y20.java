package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class y20 implements c40 {

    /* renamed from: a */
    private final z20 f30727a;

    public y20(z20 z20Var) {
        this.f30727a = z20Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            yk0.zzj("App event with no name parameter.");
        } else {
            this.f30727a.mo20210j0(str, (String) map.get("info"));
        }
    }
}
