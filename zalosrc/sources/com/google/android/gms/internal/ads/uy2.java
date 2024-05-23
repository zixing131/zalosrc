package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public abstract class uy2 {

    /* renamed from: a */
    private qz2 f29081a;

    /* renamed from: b */
    private long f29082b;

    /* renamed from: c */
    private int f29083c;

    public uy2() {
        m27089b();
        this.f29081a = new qz2(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final WebView m27088a() {
        return (WebView) this.f29081a.get();
    }

    /* renamed from: b */
    public final void m27089b() {
        this.f29082b = System.nanoTime();
        this.f29083c = 1;
    }

    /* renamed from: c */
    public void mo27090c() {
        this.f29081a.clear();
    }

    /* renamed from: d */
    public final void m27091d(String str, long j11) {
        if (j11 >= this.f29082b && this.f29083c != 3) {
            this.f29083c = 3;
            ny2.m25043a().m25048f(m27088a(), str);
        }
    }

    /* renamed from: e */
    public final void m27092e(String str, long j11) {
        if (j11 >= this.f29082b) {
            this.f29083c = 2;
            ny2.m25043a().m25048f(m27088a(), str);
        }
    }

    /* renamed from: f */
    public void mo27093f(xx2 xx2Var, vx2 vx2Var) {
        m27094g(xx2Var, vx2Var, null);
    }

    /* renamed from: g */
    public final void m27094g(xx2 xx2Var, vx2 vx2Var, JSONObject jSONObject) {
        String m28061h = xx2Var.m28061h();
        JSONObject jSONObject2 = new JSONObject();
        yy2.m28395h(jSONObject2, "environment", "app");
        yy2.m28395h(jSONObject2, "adSessionType", vx2Var.m27431d());
        JSONObject jSONObject3 = new JSONObject();
        yy2.m28395h(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        yy2.m28395h(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        yy2.m28395h(jSONObject3, "os", "Android");
        yy2.m28395h(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        yy2.m28395h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        yy2.m28395h(jSONObject4, "partnerName", vx2Var.m27432e().m21567b());
        yy2.m28395h(jSONObject4, "partnerVersion", vx2Var.m27432e().m21568c());
        yy2.m28395h(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        yy2.m28395h(jSONObject5, "libraryVersion", "1.3.31-google_20220407");
        yy2.m28395h(jSONObject5, "appId", ly2.m24419b().m24420a().getApplicationContext().getPackageName());
        yy2.m28395h(jSONObject2, "app", jSONObject5);
        if (vx2Var.m27433f() != null) {
            yy2.m28395h(jSONObject2, "contentUrl", vx2Var.m27433f());
        }
        yy2.m28395h(jSONObject2, "customReferenceData", vx2Var.m27434g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = vx2Var.m27435h().iterator();
        if (!it.hasNext()) {
            ny2.m25043a().m25049g(m27088a(), m28061h, jSONObject2, jSONObject6, jSONObject);
        } else {
            AbstractC30228a.m149044a(it.next());
            throw null;
        }
    }

    /* renamed from: h */
    public final void m27095h(float f11) {
        ny2.m25043a().m25047e(m27088a(), f11);
    }

    /* renamed from: i */
    public final void m27096i(WebView webView) {
        this.f29081a = new qz2(webView);
    }

    /* renamed from: j */
    public void mo27097j() {
    }

    /* renamed from: k */
    public final boolean m27098k() {
        if (this.f29081a.get() != 0) {
            return true;
        }
        return false;
    }
}
