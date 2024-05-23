package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4211q;
import p229i5.AbstractC20299t;

/* renamed from: com.google.firebase.k */
/* loaded from: classes.dex */
public final class C6591k {

    /* renamed from: a */
    private final String f36551a;

    /* renamed from: b */
    private final String f36552b;

    /* renamed from: c */
    private final String f36553c;

    /* renamed from: d */
    private final String f36554d;

    /* renamed from: e */
    private final String f36555e;

    /* renamed from: f */
    private final String f36556f;

    /* renamed from: g */
    private final String f36557g;

    private C6591k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC4205o.m19727p(!AbstractC20299t.m105962a(str), "ApplicationId must be set.");
        this.f36552b = str;
        this.f36551a = str2;
        this.f36553c = str3;
        this.f36554d = str4;
        this.f36555e = str5;
        this.f36556f = str6;
        this.f36557g = str7;
    }

    /* renamed from: a */
    public static C6591k m33678a(Context context) {
        C4211q c4211q = new C4211q(context);
        String m19742a = c4211q.m19742a("google_app_id");
        if (TextUtils.isEmpty(m19742a)) {
            return null;
        }
        return new C6591k(m19742a, c4211q.m19742a("google_api_key"), c4211q.m19742a("firebase_database_url"), c4211q.m19742a("ga_trackingId"), c4211q.m19742a("gcm_defaultSenderId"), c4211q.m19742a("google_storage_bucket"), c4211q.m19742a("project_id"));
    }

    /* renamed from: b */
    public String m33679b() {
        return this.f36551a;
    }

    /* renamed from: c */
    public String m33680c() {
        return this.f36552b;
    }

    /* renamed from: d */
    public String m33681d() {
        return this.f36555e;
    }

    /* renamed from: e */
    public String m33682e() {
        return this.f36557g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6591k)) {
            return false;
        }
        C6591k c6591k = (C6591k) obj;
        if (!AbstractC4199m.m19701a(this.f36552b, c6591k.f36552b) || !AbstractC4199m.m19701a(this.f36551a, c6591k.f36551a) || !AbstractC4199m.m19701a(this.f36553c, c6591k.f36553c) || !AbstractC4199m.m19701a(this.f36554d, c6591k.f36554d) || !AbstractC4199m.m19701a(this.f36555e, c6591k.f36555e) || !AbstractC4199m.m19701a(this.f36556f, c6591k.f36556f) || !AbstractC4199m.m19701a(this.f36557g, c6591k.f36557g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f36552b, this.f36551a, this.f36553c, this.f36554d, this.f36555e, this.f36556f, this.f36557g);
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("applicationId", this.f36552b).m19704a("apiKey", this.f36551a).m19704a("databaseUrl", this.f36553c).m19704a("gcmSenderId", this.f36555e).m19704a("storageBucket", this.f36556f).m19704a("projectId", this.f36557g).toString();
    }
}
