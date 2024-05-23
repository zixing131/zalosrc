package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w20 implements c40 {

    /* renamed from: a */
    private final x20 f29667a;

    public w20(x20 x20Var) {
        this.f29667a = x20Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        if (this.f29667a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            yk0.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbu.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e11) {
                yk0.zzh("Failed to convert ad metadata to JSON.", e11);
            }
        }
        if (bundle == null) {
            yk0.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.f29667a.mo20209G(str, bundle);
        }
    }
}
