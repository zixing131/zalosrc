package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.rw */
/* loaded from: classes2.dex */
public final class C4961rw extends AbstractC5184xw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4961rw(int i11, String str, Boolean bool) {
        super(i11, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26196a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m28040n(), ((Boolean) m28039m()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo26197b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(m28040n()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(m28040n())));
        }
        return (Boolean) m28039m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo26198c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m28040n(), ((Boolean) m28039m()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo26199d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(m28040n(), ((Boolean) obj).booleanValue());
    }
}
