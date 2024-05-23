package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uw */
/* loaded from: classes2.dex */
public final class C5072uw extends AbstractC5184xw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5072uw(int i11, String str, Float f11) {
        super(1, str, f11, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26196a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m28040n(), ((Float) m28039m()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo26197b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(m28040n()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(m28040n())));
        }
        return (Float) m28039m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo26198c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m28040n(), ((Float) m28039m()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo26199d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(m28040n(), ((Float) obj).floatValue());
    }
}
