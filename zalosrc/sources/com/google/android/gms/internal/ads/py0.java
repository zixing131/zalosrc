package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class py0 implements iy0 {

    /* renamed from: a */
    private final cw1 f26572a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public py0(cw1 cw1Var) {
        this.f26572a = cw1Var;
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        char c11;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c11 = 0;
            }
            c11 = 65535;
        } else {
            if (str.equals("flick")) {
                c11 = 1;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                this.f26572a.m21180k(yv1.NONE);
                return;
            } else {
                this.f26572a.m21180k(yv1.FLICK);
                return;
            }
        }
        this.f26572a.m21180k(yv1.SHAKE);
    }
}
