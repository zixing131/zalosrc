package p716zh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p471r3.C25630b;
import p611wj.C29053a;
import p611wj.C29054b;
import p611wj.C29055c;
import p611wj.C29056d;
import p611wj.C29057e;
import p611wj.C29058f;
import p732zy.C32596l;
import pm0.C24860q;

/* renamed from: zh.e9 */
/* loaded from: classes3.dex */
public final class C31902e9 implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private C31890dc f146565A;

    /* renamed from: B */
    private boolean f146566B;

    /* renamed from: C */
    private C32596l f146567C;

    /* renamed from: D */
    private C24860q f146568D;

    /* renamed from: E */
    private boolean f146569E;

    /* renamed from: F */
    private boolean f146570F;

    /* renamed from: p */
    private int f146571p;

    /* renamed from: q */
    private long f146572q;

    /* renamed from: r */
    private C25630b f146573r;

    /* renamed from: s */
    private C29055c f146574s;

    /* renamed from: t */
    private C29057e f146575t;

    /* renamed from: u */
    private C29058f f146576u;

    /* renamed from: v */
    private C29054b f146577v;

    /* renamed from: w */
    private C29056d f146578w;

    /* renamed from: x */
    private C29053a f146579x;

    /* renamed from: y */
    private C31887d9 f146580y;

    /* renamed from: z */
    private C31870c7 f146581z;

    /* renamed from: zh.e9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24860q m153335a(String str) {
            String m127114D;
            List m127132B0;
            AbstractC19074t.m100208f(str, "idString");
            String substring = str.substring(1, str.length() - 1);
            AbstractC19074t.m100207e(substring, "substring(...)");
            m127114D = AbstractC24341v.m127114D(substring, " ", "", false, 4, null);
            m127132B0 = AbstractC24342w.m127132B0(m127114D, new String[]{","}, false, 0, 6, null);
            if (m127132B0.size() == 2) {
                return new C24860q(Integer.valueOf(Integer.parseInt((String) m127132B0.get(0))), m127132B0.get(1));
            }
            throw new IllegalArgumentException("Wrong id string for ResultId");
        }
    }

    public C31902e9(long j11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f146571p = -1;
        this.f146572q = j11;
        if (jSONObject.has("content")) {
            this.f146571p = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            int i11 = this.f146571p;
            if (i11 == 0) {
                C25630b c25630b = new C25630b();
                String optString = jSONObject2.optString("cate_id");
                AbstractC19074t.m100207e(optString, "optString(...)");
                c25630b.m132404N(Integer.parseInt(optString));
                c25630b.m132414X(c25630b.m132427f());
                String optString2 = jSONObject2.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                AbstractC19074t.m100207e(optString2, "optString(...)");
                c25630b.m132410T(Integer.parseInt(optString2));
                String optString3 = jSONObject2.optString("sticker_id");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                c25630b.m132405O(Integer.parseInt(optString3));
                if (jSONObject2.has("subtype")) {
                    c25630b.m132420b0(jSONObject2.optInt("subtype"));
                    String optString4 = jSONObject2.optString("thumbUrl");
                    AbstractC19074t.m100207e(optString4, "optString(...)");
                    c25630b.m132424d0(optString4);
                    c25630b.m132422c0(jSONObject2.optInt("width"), jSONObject2.optInt("height"));
                }
                this.f146568D = new C24860q(Integer.valueOf(this.f146571p), String.valueOf(c25630b.m132429g()));
                m153334z(c25630b);
                return;
            }
            if (i11 == 1) {
                AbstractC19074t.m100205c(jSONObject2);
                C29055c c29055c = new C29055c(jSONObject2);
                this.f146568D = new C24860q(Integer.valueOf(this.f146571p), c29055c.m145107a());
                m153328t(c29055c);
                return;
            }
            if (i11 == 2) {
                AbstractC19074t.m100205c(jSONObject2);
                this.f146575t = new C29057e(jSONObject2);
                this.f146577v = new C29054b(jSONObject2);
                return;
            }
            if (i11 == 3) {
                AbstractC19074t.m100205c(jSONObject2);
                this.f146577v = new C29054b(jSONObject2);
                return;
            }
            if (i11 == 4) {
                AbstractC19074t.m100205c(jSONObject2);
                this.f146578w = new C29056d(jSONObject2);
            } else if (i11 == 5) {
                AbstractC19074t.m100205c(jSONObject2);
                this.f146579x = new C29053a(jSONObject2);
            } else {
                if (i11 != 7) {
                    return;
                }
                AbstractC19074t.m100205c(jSONObject2);
                C29058f c29058f = new C29058f(jSONObject2);
                this.f146568D = new C24860q(Integer.valueOf(this.f146571p), c29058f.m145129a());
                m153331w(c29058f);
            }
        }
    }

    /* renamed from: A */
    public final void m153307A(C31890dc c31890dc, boolean z11) {
        this.f146565A = c31890dc;
        this.f146566B = z11;
    }

    /* renamed from: B */
    public final JSONObject m153308B() {
        C29058f c29058f;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f146571p);
        JSONObject jSONObject2 = new JSONObject();
        int i11 = this.f146571p;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                if (i11 == 7 && (c29058f = this.f146576u) != null) {
                                    JSONObject m145135g = c29058f.m145135g();
                                    Iterator<String> keys = m145135g.keys();
                                    AbstractC19074t.m100207e(keys, "keys(...)");
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        jSONObject2.put(next, m145135g.get(next));
                                    }
                                }
                            } else {
                                C29053a c29053a = this.f146579x;
                                if (c29053a != null) {
                                    JSONObject m145100e = c29053a.m145100e();
                                    Iterator<String> keys2 = m145100e.keys();
                                    AbstractC19074t.m100207e(keys2, "keys(...)");
                                    while (keys2.hasNext()) {
                                        String next2 = keys2.next();
                                        jSONObject2.put(next2, m145100e.get(next2));
                                    }
                                }
                            }
                        } else {
                            C29056d c29056d = this.f146578w;
                            if (c29056d != null) {
                                JSONObject m145120h = c29056d.m145120h();
                                Iterator<String> keys3 = m145120h.keys();
                                AbstractC19074t.m100207e(keys3, "keys(...)");
                                while (keys3.hasNext()) {
                                    String next3 = keys3.next();
                                    jSONObject2.put(next3, m145120h.get(next3));
                                }
                            }
                        }
                    } else {
                        C29054b c29054b = this.f146577v;
                        if (c29054b != null) {
                            JSONObject m145106f = c29054b.m145106f();
                            Iterator<String> keys4 = m145106f.keys();
                            AbstractC19074t.m100207e(keys4, "keys(...)");
                            while (keys4.hasNext()) {
                                String next4 = keys4.next();
                                jSONObject2.put(next4, m145106f.get(next4));
                            }
                        }
                    }
                } else {
                    C29057e c29057e = this.f146575t;
                    if (c29057e != null) {
                        JSONObject m145128h = c29057e.m145128h();
                        Iterator<String> keys5 = m145128h.keys();
                        AbstractC19074t.m100207e(keys5, "keys(...)");
                        while (keys5.hasNext()) {
                            String next5 = keys5.next();
                            jSONObject2.put(next5, m145128h.get(next5));
                        }
                    }
                    C29054b c29054b2 = this.f146577v;
                    if (c29054b2 != null) {
                        JSONObject m145106f2 = c29054b2.m145106f();
                        Iterator<String> keys6 = m145106f2.keys();
                        AbstractC19074t.m100207e(keys6, "keys(...)");
                        while (keys6.hasNext()) {
                            String next6 = keys6.next();
                            jSONObject2.put(next6, m145106f2.get(next6));
                        }
                    }
                }
            } else {
                C29055c c29055c = this.f146574s;
                if (c29055c != null) {
                    JSONObject m145112f = c29055c.m145112f();
                    Iterator<String> keys7 = m145112f.keys();
                    AbstractC19074t.m100207e(keys7, "keys(...)");
                    while (keys7.hasNext()) {
                        String next7 = keys7.next();
                        jSONObject2.put(next7, m145112f.get(next7));
                    }
                }
            }
        } else {
            C25630b c25630b = this.f146573r;
            if (c25630b != null) {
                jSONObject2.put("cate_id", c25630b.m132427f());
                jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, c25630b.m132434l());
                jSONObject2.put("sticker_id", c25630b.m132429g());
            }
        }
        jSONObject.put("content", jSONObject2);
        return jSONObject;
    }

    /* renamed from: a */
    public final C29053a m153309a() {
        return this.f146579x;
    }

    /* renamed from: b */
    public final C29054b m153310b() {
        return this.f146577v;
    }

    /* renamed from: c */
    public final C29055c m153311c() {
        return this.f146574s;
    }

    /* renamed from: d */
    public final boolean m153312d() {
        return this.f146570F;
    }

    /* renamed from: e */
    public final long m153313e() {
        return this.f146572q;
    }

    /* renamed from: f */
    public final C29056d m153314f() {
        return this.f146578w;
    }

    /* renamed from: g */
    public final C31870c7 m153315g() {
        return this.f146581z;
    }

    /* renamed from: h */
    public final C29058f m153316h() {
        return this.f146576u;
    }

    /* renamed from: i */
    public final C32596l m153317i() {
        return this.f146567C;
    }

    /* renamed from: j */
    public final C24860q m153318j() {
        return this.f146568D;
    }

    /* renamed from: k */
    public final C31887d9 m153319k() {
        return this.f146580y;
    }

    /* renamed from: l */
    public final C29057e m153320l() {
        return this.f146575t;
    }

    /* renamed from: m */
    public final C25630b m153321m() {
        return this.f146573r;
    }

    /* renamed from: n */
    public final int m153322n() {
        return this.f146571p;
    }

    /* renamed from: o */
    public final C31890dc m153323o() {
        return this.f146565A;
    }

    /* renamed from: p */
    public final boolean m153324p() {
        return this.f146569E;
    }

    /* renamed from: q */
    public final boolean m153325q() {
        int i11 = this.f146571p;
        return i11 == 1 || i11 == 0 || i11 == 7;
    }

    /* renamed from: r */
    public final boolean m153326r() {
        return this.f146566B;
    }

    /* renamed from: s */
    public final void m153327s(boolean z11) {
        this.f146569E = z11;
    }

    /* renamed from: t */
    public final void m153328t(C29055c c29055c) {
        if (c29055c != null) {
            this.f146568D = new C24860q(Integer.valueOf(this.f146571p), c29055c.m145107a());
        }
        this.f146574s = c29055c;
    }

    /* renamed from: u */
    public final void m153329u(boolean z11) {
        this.f146570F = z11;
    }

    /* renamed from: v */
    public final void m153330v(C31870c7 c31870c7) {
        this.f146581z = c31870c7;
    }

    /* renamed from: w */
    public final void m153331w(C29058f c29058f) {
        if (c29058f != null) {
            this.f146568D = new C24860q(Integer.valueOf(this.f146571p), c29058f.m145129a());
        }
        this.f146576u = c29058f;
    }

    /* renamed from: x */
    public final void m153332x(C32596l c32596l) {
        this.f146567C = c32596l;
    }

    /* renamed from: y */
    public final void m153333y(C31887d9 c31887d9) {
        this.f146580y = c31887d9;
    }

    /* renamed from: z */
    public final void m153334z(C25630b c25630b) {
        if (c25630b != null) {
            this.f146568D = new C24860q(Integer.valueOf(this.f146571p), String.valueOf(c25630b.m132429g()));
        }
        this.f146573r = c25630b;
    }

    public C31902e9(int i11) {
        this.f146571p = i11;
        this.f146572q = System.nanoTime();
    }
}
