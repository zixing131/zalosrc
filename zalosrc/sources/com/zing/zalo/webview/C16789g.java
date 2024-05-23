package com.zing.zalo.webview;

import ac.C0708i;
import ac.C0732w;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.os.SystemClock;
import bv.EnumC3143a;
import bv.EnumC3144b;
import com.zing.zalo.p077ui.zviews.MPWebView;
import com.zing.zalo.p077ui.zviews.MiniAppPopupView;
import com.zing.zalo.zview.ZaloView;
import cv.C17575a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import li.AbstractC22490a;
import org.json.JSONObject;
import p112dv.C18071a;
import p667y2.C30268e;
import yf0.C30946k;

/* renamed from: com.zing.zalo.webview.g */
/* loaded from: classes5.dex */
public final class C16789g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f85193a;

    /* renamed from: j */
    private String f85202j;

    /* renamed from: k */
    private String f85203k;

    /* renamed from: l */
    private boolean f85204l;

    /* renamed from: m */
    private boolean f85205m;

    /* renamed from: n */
    private boolean f85206n;

    /* renamed from: p */
    private boolean f85208p;

    /* renamed from: c */
    private List f85195c = new ArrayList();

    /* renamed from: d */
    private List f85196d = new ArrayList();

    /* renamed from: g */
    private EnumC3143a f85199g = EnumC3143a.f13264q;

    /* renamed from: h */
    private int f85200h = -1;

    /* renamed from: i */
    private int f85201i = -1;

    /* renamed from: o */
    private boolean f85207o = true;

    /* renamed from: q */
    private long f85209q = m89660k();

    /* renamed from: b */
    private String f85194b = String.valueOf(m89660k());

    /* renamed from: e */
    private long f85197e = m89660k();

    /* renamed from: f */
    private long f85198f = m89660k();

    /* renamed from: com.zing.zalo.webview.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0732w.c m89680a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            try {
                C0732w.c cVar = new C0732w.c();
                String optString = jSONObject.optString("customData");
                AbstractC19074t.m100207e(optString, "optString(...)");
                cVar.m1192b(optString);
                return cVar;
            } catch (Exception e11) {
                m89682c(e11);
                return null;
            }
        }

        /* renamed from: b */
        public final C0708i m89681b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            AbstractC20110a.f98889a.mo104548a(jSONObject.toString(), new Object[0]);
            try {
                C0708i c0708i = new C0708i();
                c0708i.m1073d("timeOnApp", jSONObject.optLong("timeOnApp"));
                c0708i.m1072c("sourceOpen", jSONObject.optInt("sourceOpen"));
                c0708i.m1072c("srcType", jSONObject.optInt("srcType"));
                String optString = jSONObject.optString("miniAppId");
                AbstractC19074t.m100207e(optString, "optString(...)");
                c0708i.m1075f("miniAppId", optString);
                String optString2 = jSONObject.optString("sessionId");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                c0708i.m1075f("sessionId", optString2);
                String optString3 = jSONObject.optString("reasonEnd");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                c0708i.m1075f("reasonEnd", optString3);
                return c0708i;
            } catch (Exception e11) {
                m89682c(e11);
                return null;
            }
        }

        /* renamed from: c */
        public final void m89682c(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            AbstractC22490a.m116282e(new Exception("MiniAppSessionLog", exc));
        }
    }

    public C16789g() {
        m89656c(new C18071a(101, 0L));
    }

    /* renamed from: A */
    private final void m89652A() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.webview.f
            @Override // java.lang.Runnable
            public final void run() {
                C16789g.m89653B(C16789g.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m89653B(C16789g c16789g) {
        String m3357Q1;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        AbstractC19074t.m100208f(c16789g, "this$0");
        try {
            String str = c16789g.f85202j;
            if (str != null && (m3357Q1 = AbstractC0924m0.m3357Q1()) != null && m3357Q1.length() != 0 && (optJSONObject = (jSONObject = new JSONObject(m3357Q1)).optJSONObject(str)) != null) {
                optJSONObject.put("timeOnApp", c16789g.m89663w(c16789g.f85193a));
                jSONObject.put(str, optJSONObject);
                AbstractC0924m0.m3345Pi(jSONObject.toString());
            }
        } catch (Exception e11) {
            Companion.m89682c(e11);
        }
    }

    /* renamed from: c */
    private final void m89656c(C18071a c18071a) {
        this.f85195c.add(c18071a);
    }

    /* renamed from: g */
    private final C18071a m89657g(int i11) {
        return new C18071a(i11, m89660k() - this.f85198f);
    }

    /* renamed from: h */
    private final JSONObject m89658h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeOnApp", m89663w(this.f85193a));
        jSONObject.put("sourceOpen", this.f85200h);
        jSONObject.put("srcType", this.f85201i);
        jSONObject.put("miniAppId", this.f85202j);
        jSONObject.put("sessionId", this.f85194b);
        jSONObject.put("reasonEnd", this.f85199g.m15826c());
        jSONObject.put("customData", m89659i());
        return jSONObject;
    }

    /* renamed from: i */
    private final String m89659i() {
        JSONObject jSONObject = new JSONObject();
        C17575a c17575a = C17575a.f89535a;
        String jSONObject2 = jSONObject.put("eventTracking", c17575a.m93604a(this.f85195c)).put("link", this.f85203k).put("devTracking", c17575a.m93604a(this.f85196d)).toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: k */
    private final long m89660k() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: n */
    public static /* synthetic */ void m89661n(C16789g c16789g, ZaloView zaloView, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            zaloView = null;
        }
        c16789g.m89672m(zaloView);
    }

    /* renamed from: u */
    private final void m89662u() {
        String m3357Q1;
        try {
            String str = this.f85202j;
            if (str != null && (m3357Q1 = AbstractC0924m0.m3357Q1()) != null && m3357Q1.length() != 0) {
                JSONObject jSONObject = new JSONObject(m3357Q1);
                jSONObject.put(str, m89658h());
                AbstractC0924m0.m3345Pi(jSONObject.toString());
            }
        } catch (Exception e11) {
            Companion.m89682c(e11);
        }
    }

    /* renamed from: w */
    private final int m89663w(long j11) {
        return (int) Math.rint(j11 / 1000);
    }

    /* renamed from: x */
    private final void m89664x() {
        this.f85193a += m89660k() - this.f85197e;
    }

    /* renamed from: y */
    private final void m89665y() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.webview.e
            @Override // java.lang.Runnable
            public final void run() {
                C16789g.m89666z(C16789g.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m89666z(C16789g c16789g) {
        String m3357Q1;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        AbstractC19074t.m100208f(c16789g, "this$0");
        try {
            String str = c16789g.f85202j;
            if (str != null && (m3357Q1 = AbstractC0924m0.m3357Q1()) != null && m3357Q1.length() != 0 && (optJSONObject = (jSONObject = new JSONObject(m3357Q1)).optJSONObject(str)) != null) {
                optJSONObject.put("customData", c16789g.m89659i());
                optJSONObject.put("timeOnApp", c16789g.m89663w(c16789g.f85193a));
                optJSONObject.put("reasonEnd", c16789g.f85199g.m15826c());
                jSONObject.put(str, optJSONObject);
                AbstractC0924m0.m3345Pi(jSONObject.toString());
            }
        } catch (Exception e11) {
            Companion.m89682c(e11);
        }
    }

    /* renamed from: d */
    public final void m89667d(EnumC3144b enumC3144b) {
        AbstractC19074t.m100208f(enumC3144b, "startupEvent");
        if (enumC3144b == EnumC3144b.f13275q) {
            this.f85209q = m89660k();
            this.f85196d.add(new C18071a(enumC3144b.m15828c(), 0L));
        } else {
            this.f85196d.add(new C18071a(enumC3144b.m15828c(), m89660k() - this.f85209q));
        }
    }

    /* renamed from: e */
    public final void m89668e() {
        m89662u();
        m89656c(m89657g(102));
        m89665y();
    }

    /* renamed from: f */
    public final void m89669f(EnumC3143a enumC3143a) {
        AbstractC19074t.m100208f(enumC3143a, "source");
        if (this.f85204l) {
            return;
        }
        this.f85199g = enumC3143a;
        m89656c(m89657g(120));
        m89665y();
        this.f85204l = true;
    }

    /* renamed from: j */
    public final String m89670j() {
        return this.f85202j;
    }

    /* renamed from: l */
    public final void m89671l() {
        String str = this.f85202j;
        if (str != null && C30946k.Companion.m150528a().m150514g(str)) {
            m89664x();
            m89652A();
            this.f85208p = true;
            if (this.f85204l) {
                return;
            }
            m89656c(m89657g(106));
            m89665y();
        }
    }

    /* renamed from: m */
    public final void m89672m(ZaloView zaloView) {
        this.f85197e = m89660k();
        if (!(zaloView instanceof MiniAppPopupView) && !(zaloView instanceof MPWebView) && !this.f85207o && !this.f85205m) {
            m89656c(m89657g(105));
            m89665y();
            return;
        }
        if (this.f85207o) {
            this.f85207o = false;
        }
        if (this.f85205m) {
            this.f85205m = false;
        }
    }

    /* renamed from: o */
    public final void m89673o(ZaloView zaloView) {
        String str = this.f85202j;
        if (str != null) {
            if (C30946k.Companion.m150528a().m150514g(str)) {
                if (!this.f85208p) {
                    this.f85208p = false;
                    m89664x();
                    m89652A();
                    if (this.f85204l) {
                        return;
                    }
                    m89656c(m89657g(106));
                    m89665y();
                    return;
                }
                return;
            }
            m89664x();
            if (!(zaloView instanceof MiniAppPopupView) && !this.f85204l && !this.f85205m && !this.f85206n) {
                m89656c(m89657g(106));
                m89665y();
                return;
            }
            m89652A();
            if (this.f85205m) {
                this.f85205m = false;
            }
            if (this.f85206n) {
                this.f85206n = false;
            }
        }
    }

    /* renamed from: p */
    public final void m89674p() {
        m89656c(m89657g(104));
        m89665y();
        this.f85206n = true;
    }

    /* renamed from: q */
    public final void m89675q(String str) {
        this.f85202j = str;
    }

    /* renamed from: r */
    public final void m89676r(String str) {
        this.f85203k = str;
    }

    /* renamed from: s */
    public final void m89677s(int i11) {
        this.f85200h = i11;
    }

    /* renamed from: t */
    public final void m89678t(int i11) {
        this.f85201i = i11;
    }

    public String toString() {
        if (this.f85202j == null) {
            return "{}";
        }
        String jSONObject = m89658h().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    /* renamed from: v */
    public final void m89679v() {
        m89656c(m89657g(103));
        m89665y();
        this.f85205m = true;
    }
}
