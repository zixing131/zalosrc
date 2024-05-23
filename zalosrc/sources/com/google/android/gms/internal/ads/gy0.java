package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class gy0 {

    /* renamed from: a */
    private final Map f21453a;

    /* renamed from: b */
    private final Map f21454b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gy0(Map map, Map map2) {
        this.f21453a = map;
        this.f21454b = map2;
    }

    /* renamed from: a */
    public final void m22636a(tq2 tq2Var) {
        for (rq2 rq2Var : tq2Var.f28473b.f27824c) {
            if (this.f21453a.containsKey(rq2Var.f27347a)) {
                ((jy0) this.f21453a.get(rq2Var.f27347a)).mo23779a(rq2Var.f27348b);
            } else if (this.f21454b.containsKey(rq2Var.f27347a)) {
                iy0 iy0Var = (iy0) this.f21454b.get(rq2Var.f27347a);
                JSONObject jSONObject = rq2Var.f27348b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                iy0Var.mo20772a(hashMap);
            }
        }
    }
}
