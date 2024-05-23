package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vw */
/* loaded from: classes2.dex */
public final class C5109vw extends AbstractC5184xw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5109vw(int i11, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26196a(JSONObject jSONObject) {
        return jSONObject.optString(m28040n(), (String) m28039m());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo26197b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(m28040n()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(m28040n()));
        }
        return (String) m28039m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo26198c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m28040n(), (String) m28039m());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo26199d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(m28040n(), (String) obj);
    }
}
