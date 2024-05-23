package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vy0 implements iy0 {

    /* renamed from: a */
    private final hq2 f29632a;

    public vy0(hq2 hq2Var) {
        this.f29632a = hq2Var;
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f29632a.m22998b(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
