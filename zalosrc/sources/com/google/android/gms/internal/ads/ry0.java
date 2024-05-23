package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ry0 implements iy0 {

    /* renamed from: a */
    private final cw1 f27411a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ry0(cw1 cw1Var) {
        this.f27411a = cw1Var;
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21139U7)).booleanValue()) {
            return;
        }
        String str = (String) map.get("policy_violations");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27411a.m21181l(str);
    }
}
