package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class gr2 {

    /* renamed from: a */
    private final JSONObject f20802a;

    public gr2(JSONObject jSONObject) {
        this.f20802a = jSONObject;
    }

    /* renamed from: a */
    public final String m22515a() {
        if (m22516b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* renamed from: b */
    public final int m22516b() {
        int optInt = this.f20802a.optInt("media_type", -1);
        if (optInt != 0) {
            if (optInt == 1) {
                return 1;
            }
            return 3;
        }
        return 2;
    }
}
