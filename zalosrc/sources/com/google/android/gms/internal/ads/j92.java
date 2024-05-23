package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j92 {

    /* renamed from: a */
    private final Map f22732a = new HashMap();

    /* renamed from: b */
    private final Map f22733b = new HashMap();

    /* renamed from: c */
    private final Map f22734c = new HashMap();

    /* renamed from: d */
    private final Executor f22735d;

    /* renamed from: e */
    private JSONObject f22736e;

    public j92(Executor executor) {
        this.f22735d = executor;
    }

    /* renamed from: g */
    private final synchronized List m23564g(JSONObject jSONObject, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            if (jSONObject == null) {
                return arrayList;
            }
            Bundle m23569l = m23569l(jSONObject.optJSONObject("data"));
            JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
            if (optJSONArray == null) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                String optString = optJSONArray.optString(i11, "");
                if (!TextUtils.isEmpty(optString)) {
                    arrayList2.add(optString);
                }
            }
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                String str2 = (String) arrayList2.get(i12);
                m23574f(str2);
                if (((l92) this.f22732a.get(str2)) != null) {
                    arrayList.add(new l92(str2, str, m23569l));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: h */
    public final synchronized void m23565h() {
        this.f22733b.clear();
        this.f22732a.clear();
        m23567j();
        m23568k();
    }

    /* renamed from: i */
    private final synchronized void m23566i(String str, String str2, List list) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Map map = (Map) this.f22734c.get(str);
                if (map == null) {
                    map = new HashMap();
                }
                this.f22734c.put(str, map);
                List list2 = (List) map.get(str2);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.addAll(list);
                map.put(str2, list2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    private final synchronized void m23567j() {
        String optString;
        JSONArray optJSONArray;
        try {
            JSONObject m20558f = zzt.zzo().m22936h().zzh().m20558f();
            if (m20558f != null) {
                try {
                    JSONArray optJSONArray2 = m20558f.optJSONArray("ad_unit_id_settings");
                    this.f22736e = m20558f.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i11);
                            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21445z8)).booleanValue()) {
                                optString = jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                            } else {
                                optString = jSONObject.optString("ad_unit_id", "");
                            }
                            String optString2 = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                                    arrayList.addAll(m23564g(optJSONArray.getJSONObject(i12), optString2));
                                }
                            }
                            m23566i(optString2, optString, arrayList);
                        }
                    }
                } catch (JSONException e11) {
                    zze.zzb("Malformed config loading JSON.", e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: k */
    private final synchronized void m23568k() {
        if (!((Boolean) AbstractC4445dz.f19450e.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21438z1)).booleanValue()) {
                JSONObject m20558f = zzt.zzo().m22936h().zzh().m20558f();
                if (m20558f == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = m20558f.getJSONArray("signal_adapters");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        Bundle m23569l = m23569l(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f22733b.put(optString, new n92(optString, optBoolean2, optBoolean, m23569l));
                        }
                    }
                } catch (JSONException e11) {
                    zze.zzb("Malformed config loading JSON.", e11);
                }
            }
        }
    }

    /* renamed from: l */
    private static final Bundle m23569l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final synchronized Map m23570a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.f22734c.get(str);
            if (map == null) {
                return f83.m21967d();
            }
            List<l92> list = (List) map.get(str2);
            if (list == null) {
                String m21532a = dr1.m21532a(this.f22736e, str2, str);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21445z8)).booleanValue()) {
                    m21532a = m21532a.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(m21532a);
            }
            if (list == null) {
                return f83.m21967d();
            }
            HashMap hashMap = new HashMap();
            for (l92 l92Var : list) {
                String str3 = l92Var.f23794a;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, new ArrayList());
                }
                ((List) hashMap.get(str3)).add(l92Var.f23796c);
            }
            return f83.m21966c(hashMap);
        }
        return f83.m21967d();
    }

    /* renamed from: b */
    public final synchronized Map m23571b() {
        return f83.m21966c(this.f22733b);
    }

    /* renamed from: d */
    public final void m23572d() {
        zzt.zzo().m22936h().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.h92
            public /* synthetic */ h92() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                j92.this.m23573e();
            }
        });
        this.f22735d.execute(new i92(this));
    }

    /* renamed from: e */
    public final /* synthetic */ void m23573e() {
        this.f22735d.execute(new i92(this));
    }

    /* renamed from: f */
    public final synchronized void m23574f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f22732a.containsKey(str)) {
            return;
        }
        this.f22732a.put(str, new l92(str, "", new Bundle()));
    }
}
