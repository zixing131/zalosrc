package s00;

import ag0.C0824j;
import am.AbstractC0939u;
import android.os.SystemClock;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zinstant.C17244x0;
import la0.C22340u;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: s00.f */
/* loaded from: classes4.dex */
public class C26071f {

    /* renamed from: a */
    public String f124226a;

    /* renamed from: b */
    public int f124227b;

    /* renamed from: c */
    public int f124228c;

    /* renamed from: d */
    public int f124229d;

    /* renamed from: e */
    public int f124230e;

    /* renamed from: f */
    public int f124231f;

    /* renamed from: h */
    public int f124233h;

    /* renamed from: i */
    public long f124234i;

    /* renamed from: j */
    public long f124235j;

    /* renamed from: k */
    public String f124236k;

    /* renamed from: l */
    public JSONObject f124237l;

    /* renamed from: m */
    public C22340u f124238m;

    /* renamed from: o */
    private C17244x0 f124240o;

    /* renamed from: g */
    private volatile int f124232g = 0;

    /* renamed from: n */
    public volatile boolean f124239n = true;

    /* renamed from: s00.f$a */
    /* loaded from: classes4.dex */
    class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f124241a;

        a(String str) {
            this.f124241a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42304W8(C26071f.this, this.f124241a);
        }
    }

    public C26071f(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        this.f124228c = -1;
        this.f124229d = 0;
        this.f124230e = 0;
        this.f124231f = 0;
        this.f124233h = 1000;
        this.f124234i = 0L;
        if (jSONObject != null) {
            try {
                this.f124237l = jSONObject;
                this.f124226a = jSONObject.optString("id_reminder");
                this.f124227b = jSONObject.optInt("id_setting");
                this.f124228c = jSONObject.optInt("icon_reminder_type", -1);
                this.f124229d = jSONObject.optInt("priority", 0);
                this.f124230e = jSONObject.optInt("on_condition", 0);
                JSONObject optJSONObject3 = jSONObject.optJSONObject("off_condition");
                if (optJSONObject3 != null) {
                    this.f124231f = optJSONObject3.optInt("tap", 0);
                    this.f124233h = optJSONObject3.optInt("value", 1000);
                    this.f124234i = optJSONObject3.optLong("time_to_live", 0L);
                }
                this.f124235j = jSONObject.optLong("show_time");
                this.f124236k = jSONObject.optString("user_uid");
                JSONObject optJSONObject4 = jSONObject.optJSONObject("onboard_highlight");
                if (optJSONObject4 != null) {
                    C22340u c22340u = new C22340u(optJSONObject4);
                    this.f124238m = c22340u;
                    if (c22340u.m115790c() == 0) {
                        this.f124238m.m115794g(this.f124227b);
                    }
                }
                if (m134178i() && (optJSONObject = jSONObject.optJSONObject("banner_config")) != null && (optJSONObject2 = optJSONObject.optJSONObject("ZInstantAPIInfo")) != null) {
                    this.f124240o = new C17244x0(17, optJSONObject2);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: c */
    static String m134170c(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? "UNKNOWN" : "VALID_OFF_CONDITION" : "VALID_ON_CONDITION" : "INIT";
    }

    /* renamed from: a */
    public boolean m134171a() {
        return this.f124232g == 1 && this.f124239n;
    }

    /* renamed from: b */
    public long m134172b() {
        return this.f124235j + (this.f124234i * 1000);
    }

    /* renamed from: d */
    public boolean m134173d() {
        return this.f124239n;
    }

    /* renamed from: e */
    public int m134174e() {
        return this.f124232g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C26071f)) {
            return false;
        }
        C26071f c26071f = (C26071f) obj;
        if (!TextUtils.isEmpty(this.f124236k) && this.f124236k.equals(c26071f.f124236k) && !AbstractC26084s.m134246C(this.f124226a, c26071f.f124226a) && this.f124227b == c26071f.f124227b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C17244x0 m134175f() {
        return this.f124240o;
    }

    /* renamed from: g */
    public boolean m134176g() {
        C17244x0 c17244x0 = this.f124240o;
        if (c17244x0 != null && c17244x0.m92064b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m134177h() {
        if (this.f124234i > 0 && SystemClock.elapsedRealtime() - this.f124235j >= this.f124234i * 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m134178i() {
        return this.f124232g != 2;
    }

    /* renamed from: j */
    public boolean m134179j() {
        return this.f124234i > 0 && this.f124235j > 0;
    }

    /* renamed from: k */
    public void m134180k() {
        if (this.f124238m != null) {
            this.f124238m = null;
            JSONObject jSONObject = this.f124237l;
            if (jSONObject != null && jSONObject.has("onboard_highlight")) {
                this.f124237l.remove("onboard_highlight");
                C0824j.m2153b(new a(this.f124237l.toString()));
            }
        }
    }

    /* renamed from: l */
    public boolean m134181l(boolean z11) {
        if (this.f124239n == z11) {
            return false;
        }
        this.f124239n = z11;
        return true;
    }

    /* renamed from: m */
    public void m134182m(int i11) {
        this.f124232g = i11;
    }

    public String toString() {
        return "reminderId=" + this.f124226a + ", settingId=" + this.f124227b + ", state=" + m134170c(this.f124232g) + ", qualifiedVisible=" + this.f124239n + ", priority=" + this.f124229d + ", iconReminderType=" + this.f124228c + ", onCondition=" + this.f124230e + ", showTime=" + this.f124235j + ", isExpired=" + m134177h() + ", offConditionTap=" + this.f124231f + ", offConditionValue=" + this.f124233h + ", offConditionTTL=" + this.f124234i + ", userUid=" + this.f124236k;
    }
}
