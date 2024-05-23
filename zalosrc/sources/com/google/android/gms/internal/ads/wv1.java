package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class wv1 {

    /* renamed from: a */
    private final String f30228a;

    /* renamed from: b */
    private final String f30229b;

    /* renamed from: c */
    private final String f30230c;

    /* renamed from: d */
    private final int f30231d;

    /* renamed from: e */
    private final String f30232e;

    /* renamed from: f */
    private final int f30233f;

    /* renamed from: g */
    private final boolean f30234g;

    public wv1(String str, String str2, String str3, int i11, String str4, int i12, boolean z11) {
        this.f30228a = str;
        this.f30229b = str2;
        this.f30230c = str3;
        this.f30231d = i11;
        this.f30232e = str4;
        this.f30233f = i12;
        this.f30234g = z11;
    }

    /* renamed from: a */
    public final JSONObject m27726a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f30228a);
        jSONObject.put("version", this.f30230c);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21176Y7)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f30229b);
        }
        jSONObject.put("status", this.f30231d);
        jSONObject.put("description", this.f30232e);
        jSONObject.put("initializationLatencyMillis", this.f30233f);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21185Z7)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f30234g);
        }
        return jSONObject;
    }
}
