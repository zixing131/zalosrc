package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tw */
/* loaded from: classes2.dex */
public final class C5035tw extends AbstractC5184xw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5035tw(int i11, String str, Long l11) {
        super(1, str, l11, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26196a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m28040n(), ((Long) m28039m()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo26197b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(m28040n()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(m28040n())));
        }
        return (Long) m28039m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo26198c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m28040n(), ((Long) m28039m()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5184xw
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo26199d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(m28040n(), ((Long) obj).longValue());
    }
}
