package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.g */
/* loaded from: classes3.dex */
public class C6723g {

    /* renamed from: g */
    private static final Date f36986g = new Date(0);

    /* renamed from: a */
    private JSONObject f36987a;

    /* renamed from: b */
    private JSONObject f36988b;

    /* renamed from: c */
    private Date f36989c;

    /* renamed from: d */
    private JSONArray f36990d;

    /* renamed from: e */
    private JSONObject f36991e;

    /* renamed from: f */
    private long f36992f;

    /* renamed from: com.google.firebase.remoteconfig.internal.g$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private JSONObject f36993a;

        /* renamed from: b */
        private Date f36994b;

        /* renamed from: c */
        private JSONArray f36995c;

        /* renamed from: d */
        private JSONObject f36996d;

        /* renamed from: e */
        private long f36997e;

        /* renamed from: a */
        public C6723g m34388a() {
            return new C6723g(this.f36993a, this.f36994b, this.f36995c, this.f36996d, this.f36997e);
        }

        /* renamed from: b */
        public b m34389b(JSONObject jSONObject) {
            try {
                this.f36993a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: c */
        public b m34390c(JSONArray jSONArray) {
            try {
                this.f36995c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public b m34391d(Date date) {
            this.f36994b = date;
            return this;
        }

        /* renamed from: e */
        public b m34392e(JSONObject jSONObject) {
            try {
                this.f36996d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: f */
        public b m34393f(long j11) {
            this.f36997e = j11;
            return this;
        }

        private b() {
            this.f36993a = new JSONObject();
            this.f36994b = C6723g.f36986g;
            this.f36995c = new JSONArray();
            this.f36996d = new JSONObject();
            this.f36997e = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6723g m34379b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C6723g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    /* renamed from: c */
    private static C6723g m34380c(JSONObject jSONObject) {
        return m34379b(new JSONObject(jSONObject.toString()));
    }

    /* renamed from: j */
    public static b m34381j() {
        return new b();
    }

    /* renamed from: d */
    public JSONArray m34382d() {
        return this.f36990d;
    }

    /* renamed from: e */
    public Set m34383e(C6723g c6723g) {
        JSONObject m34384f = m34380c(c6723g.f36987a).m34384f();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = m34384f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!c6723g.m34384f().has(next)) {
                hashSet.add(next);
            } else if (!m34384f().get(next).equals(c6723g.m34384f().get(next))) {
                hashSet.add(next);
            } else if ((m34386h().has(next) && !c6723g.m34386h().has(next)) || (!m34386h().has(next) && c6723g.m34386h().has(next))) {
                hashSet.add(next);
            } else if (m34386h().has(next) && c6723g.m34386h().has(next) && !m34386h().getJSONObject(next).toString().equals(c6723g.m34386h().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else {
                m34384f.remove(next);
            }
        }
        Iterator<String> keys2 = m34384f.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6723g)) {
            return false;
        }
        return this.f36987a.toString().equals(((C6723g) obj).toString());
    }

    /* renamed from: f */
    public JSONObject m34384f() {
        return this.f36988b;
    }

    /* renamed from: g */
    public Date m34385g() {
        return this.f36989c;
    }

    /* renamed from: h */
    public JSONObject m34386h() {
        return this.f36991e;
    }

    public int hashCode() {
        return this.f36987a.hashCode();
    }

    /* renamed from: i */
    public long m34387i() {
        return this.f36992f;
    }

    public String toString() {
        return this.f36987a.toString();
    }

    private C6723g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j11) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j11);
        this.f36988b = jSONObject;
        this.f36989c = date;
        this.f36990d = jSONArray;
        this.f36991e = jSONObject2;
        this.f36992f = j11;
        this.f36987a = jSONObject3;
    }
}
