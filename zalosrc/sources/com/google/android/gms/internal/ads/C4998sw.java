package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.sw */
/* loaded from: classes2.dex */
public final class C4998sw extends AbstractC5184xw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4998sw(int i11, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26196a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m28040n(), ((Integer) m28039m()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo26197b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(m28040n()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(m28040n())));
        }
        return (Integer) m28039m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo26198c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m28040n(), ((Integer) m28039m()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo26199d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(m28040n(), ((Integer) obj).intValue());
    }
}
