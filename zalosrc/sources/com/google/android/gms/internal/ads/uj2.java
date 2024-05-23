package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class uj2 implements rh2 {

    /* renamed from: a */
    private final List f28958a;

    public uj2(List list) {
        this.f28958a = list;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f28958a));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}
