package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.r */
/* loaded from: classes2.dex */
public class C3940r {

    /* renamed from: a */
    private final String f15627a;

    /* renamed from: b */
    private final String f15628b;

    /* renamed from: c */
    private final JSONObject f15629c;

    public C3940r(String str, String str2) {
        this.f15627a = str;
        this.f15628b = str2;
        this.f15629c = new JSONObject(str);
    }

    /* renamed from: i */
    private final ArrayList m18685i() {
        ArrayList arrayList = new ArrayList();
        if (this.f15629c.has("productIds")) {
            JSONArray optJSONArray = this.f15629c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    arrayList.add(optJSONArray.optString(i11));
                }
            }
        } else if (this.f15629c.has("productId")) {
            arrayList.add(this.f15629c.optString("productId"));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C3878a m18686a() {
        JSONObject jSONObject = this.f15629c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new C3878a(optString, optString2);
    }

    /* renamed from: b */
    public String m18687b() {
        return this.f15627a;
    }

    /* renamed from: c */
    public List m18688c() {
        return m18685i();
    }

    /* renamed from: d */
    public int m18689d() {
        if (this.f15629c.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    /* renamed from: e */
    public long m18690e() {
        return this.f15629c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3940r)) {
            return false;
        }
        C3940r c3940r = (C3940r) obj;
        if (TextUtils.equals(this.f15627a, c3940r.m18687b()) && TextUtils.equals(this.f15628b, c3940r.m18692g())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m18691f() {
        JSONObject jSONObject = this.f15629c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: g */
    public String m18692g() {
        return this.f15628b;
    }

    /* renamed from: h */
    public boolean m18693h() {
        return this.f15629c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f15627a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f15627a));
    }
}
