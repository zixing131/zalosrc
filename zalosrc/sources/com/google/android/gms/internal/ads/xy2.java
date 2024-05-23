package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public final class xy2 extends uy2 {

    /* renamed from: d */
    private WebView f30686d;

    /* renamed from: e */
    private Long f30687e = null;

    /* renamed from: f */
    private final Map f30688f;

    public xy2(Map map, String str) {
        this.f30688f = map;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    /* renamed from: c */
    public final void mo27090c() {
        long convert;
        super.mo27090c();
        if (this.f30687e == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f30687e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new wy2(this), Math.max(4000 - convert, 2000L));
        this.f30686d = null;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    /* renamed from: f */
    public final void mo27093f(xx2 xx2Var, vx2 vx2Var) {
        JSONObject jSONObject = new JSONObject();
        Map m27436i = vx2Var.m27436i();
        for (String str : m27436i.keySet()) {
            AbstractC30228a.m149044a(m27436i.get(str));
            yy2.m28395h(jSONObject, str, null);
        }
        m27094g(xx2Var, vx2Var, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.uy2
    /* renamed from: j */
    public final void mo27097j() {
        WebView webView = new WebView(ly2.m24419b().m24420a());
        this.f30686d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        m27096i(this.f30686d);
        WebView webView2 = this.f30686d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.f30688f.keySet().iterator();
        if (!it.hasNext()) {
            this.f30687e = Long.valueOf(System.nanoTime());
        } else {
            AbstractC30228a.m149044a(this.f30688f.get((String) it.next()));
            throw null;
        }
    }
}
