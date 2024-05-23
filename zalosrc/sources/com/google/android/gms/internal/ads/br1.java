package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class br1 {

    /* renamed from: a */
    private final Map f17953a = new ConcurrentHashMap();

    /* renamed from: b */
    private JSONObject f17954b;

    /* renamed from: c */
    private final Executor f17955c;

    /* renamed from: d */
    private boolean f17956d;

    /* renamed from: e */
    private JSONObject f17957e;

    public br1(Executor executor) {
        this.f17955c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void m20657f() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f17956d = true;
            bk0 zzh = zzt.zzo().m22936h().zzh();
            if (zzh == null) {
                return;
            }
            JSONObject m20558f = zzh.m20558f();
            if (m20558f == null) {
                return;
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21250g3)).booleanValue()) {
                jSONObject = m20558f.optJSONObject("common_settings");
            } else {
                jSONObject = null;
            }
            this.f17954b = jSONObject;
            this.f17957e = m20558f.optJSONObject("ad_unit_patterns");
            JSONArray optJSONArray = m20558f.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("ad_unit_id");
                        String optString2 = optJSONObject.optString("format");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                        if (optString != null && optJSONObject2 != null && optString2 != null) {
                            if (this.f17953a.containsKey(optString2)) {
                                map = (Map) this.f17953a.get(optString2);
                            } else {
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                this.f17953a.put(optString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(optString, optJSONObject2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public final JSONObject m20652a() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21250g3)).booleanValue()) {
            return null;
        }
        return this.f17954b;
    }

    /* renamed from: b */
    public final JSONObject m20653b(String str, String str2) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21240f3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f17956d) {
            m20657f();
        }
        Map map = (Map) this.f17953a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String m21532a = dr1.m21532a(this.f17957e, str, str2);
        if (m21532a == null) {
            return null;
        }
        return (JSONObject) map.get(m21532a);
    }

    /* renamed from: c */
    public final void m20654c() {
        zzt.zzo().m22936h().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.yq1
            @Override // java.lang.Runnable
            public final void run() {
                br1.this.m20656e();
            }
        });
        this.f17955c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zq1
            @Override // java.lang.Runnable
            public final void run() {
                br1.this.m20657f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m20656e() {
        this.f17955c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ar1
            @Override // java.lang.Runnable
            public final void run() {
                br1.this.m20655d();
            }
        });
    }
}
