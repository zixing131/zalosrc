package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bz0 implements iy0 {

    /* renamed from: a */
    private final cw1 f18055a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bz0(cw1 cw1Var) {
        this.f18055a = cw1Var;
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f18055a.m21182m(str.equals("true"));
    }
}
