package p056cj;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p212hj.AbstractC20071b;
import p461qu.AbstractC25495a;
import pm0.C24848g0;

/* renamed from: cj.a */
/* loaded from: classes3.dex */
public final class C3533a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f14874a;

    /* renamed from: b */
    private long f14875b;

    /* renamed from: c */
    private long f14876c;

    /* renamed from: d */
    private long f14877d;

    /* renamed from: e */
    private long f14878e;

    /* renamed from: f */
    private long f14879f;

    /* renamed from: g */
    private String f14880g;

    /* renamed from: h */
    private int f14881h;

    /* renamed from: i */
    private int f14882i;

    /* renamed from: j */
    private int f14883j;

    /* renamed from: k */
    private long f14884k;

    /* renamed from: l */
    private int f14885l;

    /* renamed from: m */
    private int f14886m;

    /* renamed from: n */
    private boolean f14887n;

    /* renamed from: o */
    private int f14888o;

    /* renamed from: p */
    private String f14889p;

    /* renamed from: q */
    private String f14890q;

    /* renamed from: r */
    private int f14891r;

    /* renamed from: s */
    private EnumC3539g f14892s;

    /* renamed from: t */
    private boolean f14893t;

    /* renamed from: cj.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3533a m17932a(String str, String str2) {
            AbstractC19074t.m100208f(str, "json");
            AbstractC19074t.m100208f(str2, "uid");
            AbstractC19060k abstractC19060k = null;
            if (str.length() == 0) {
                return null;
            }
            try {
                if (TextUtils.isDigitsOnly(str)) {
                    return new C3533a(0L, Long.parseLong(str), 0L, str2, 0L, 0, 0, 0);
                }
                return new C3533a(str, abstractC19060k);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
    }

    public /* synthetic */ C3533a(String str, AbstractC19060k abstractC19060k) {
        this(str);
    }

    /* renamed from: a */
    public final boolean m17906a() {
        return AbstractC25495a.m132079d(this.f14880g);
    }

    /* renamed from: b */
    public final String m17907b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ack_error", this.f14888o);
            jSONObject.put("e2ee_native_error", this.f14891r);
            jSONObject.put("request_retry", this.f14889p);
            jSONObject.put("retry_key", this.f14890q);
            jSONObject.put("is_device_change_in_11", this.f14892s.m17988c());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("E2EE", e11);
            return "";
        }
    }

    /* renamed from: c */
    public final long m17908c() {
        return this.f14875b;
    }

    /* renamed from: d */
    public final long m17909d() {
        return this.f14879f;
    }

    /* renamed from: e */
    public final String m17910e() {
        return this.f14890q;
    }

    /* renamed from: f */
    public final int m17911f() {
        return this.f14888o;
    }

    /* renamed from: g */
    public final long m17912g() {
        return this.f14876c;
    }

    /* renamed from: h */
    public final int m17913h() {
        return this.f14883j;
    }

    /* renamed from: i */
    public final int m17914i() {
        return this.f14881h;
    }

    /* renamed from: j */
    public final String m17915j() {
        return this.f14880g;
    }

    /* renamed from: k */
    public final String m17916k() {
        return this.f14889p;
    }

    /* renamed from: l */
    public final long m17917l() {
        return this.f14878e;
    }

    /* renamed from: m */
    public final int m17918m() {
        return this.f14882i;
    }

    /* renamed from: n */
    public final int m17919n() {
        return this.f14874a;
    }

    /* renamed from: o */
    public final boolean m17920o() {
        return this.f14893t;
    }

    /* renamed from: p */
    public final void m17921p(String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f14888o = jSONObject.optInt("ack_error");
                this.f14891r = jSONObject.optInt("e2ee_native_error");
                String optString = jSONObject.optString("request_retry");
                AbstractC19074t.m100207e(optString, "optString(...)");
                this.f14889p = optString;
                String optString2 = jSONObject.optString("retry_key");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f14890q = optString2;
                this.f14892s = EnumC3539g.Companion.m17989a(jSONObject.optInt("is_device_change_in_11", -1));
            } catch (Exception e11) {
                AbstractC23350e.m122776f("E2EE", e11);
            }
        }
    }

    /* renamed from: q */
    public final void m17922q(boolean z11) {
        this.f14893t = z11;
    }

    /* renamed from: r */
    public final void m17923r(EnumC3539g enumC3539g) {
        AbstractC19074t.m100208f(enumC3539g, "<set-?>");
        this.f14892s = enumC3539g;
    }

    /* renamed from: s */
    public final void m17924s() {
        this.f14887n = true;
    }

    /* renamed from: t */
    public final void m17925t(int i11) {
        this.f14891r = i11;
    }

    public String toString() {
        return "AckMsgStatus(gmi = " + this.f14876c + ", owner = " + this.f14880g + ")";
    }

    /* renamed from: u */
    public final void m17926u(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f14890q = str;
    }

    /* renamed from: v */
    public final void m17927v(int i11) {
        this.f14888o = i11;
    }

    /* renamed from: w */
    public final void m17928w(String str) {
        AbstractC19074t.m100208f(str, "requestRetry");
        this.f14889p = str;
    }

    /* renamed from: x */
    public final void m17929x(int i11) {
        this.f14874a = i11;
    }

    /* renamed from: y */
    public final JSONObject m17930y() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cmi", this.f14875b);
            jSONObject.put("gmi", this.f14876c);
            long j11 = this.f14877d;
            if (j11 != 0) {
                jSONObject.put("rGmi", j11);
            }
            jSONObject.put("si", this.f14878e);
            jSONObject.put("di", this.f14879f);
            jSONObject.put("mt", this.f14881h);
            jSONObject.put("st", this.f14882i);
            jSONObject.put("cmd", this.f14883j);
            jSONObject.put("at", this.f14885l);
            jSONObject.put("ts", this.f14884k);
            int i11 = this.f14886m;
            if (i11 != -1) {
                jSONObject.put("fromDI", i11);
            }
            if (this.f14887n) {
                jSONObject.put("retry", 1);
            }
            int i12 = this.f14888o;
            if (i12 != 0) {
                jSONObject.put("err", i12);
            }
            if (!TextUtils.isEmpty(this.f14889p)) {
                jSONObject.put("request_retry", this.f14889p);
            }
            if (this.f14890q.length() > 0) {
                jSONObject.put("retry_key", this.f14890q);
            }
            if (this.f14891r != 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eel", this.f14891r);
                if (!m17906a()) {
                    jSONObject2.put("cd", this.f14892s.m17988c());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                jSONObject.put("log", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: z */
    public final String m17931z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cliMsgID", this.f14875b);
            jSONObject.put("globalMsgID", this.f14876c);
            long j11 = this.f14877d;
            if (j11 != 0) {
                jSONObject.put("realGlobalID", j11);
            }
            jSONObject.put("senderID", this.f14878e);
            jSONObject.put("destID", this.f14879f);
            jSONObject.put("ownerID", this.f14880g);
            jSONObject.put("srcType", this.f14882i);
            jSONObject.put("msgCmd", this.f14883j);
            jSONObject.put("msgType", this.f14881h);
            jSONObject.put("at", this.f14885l);
            jSONObject.put("ts", this.f14884k);
            jSONObject.put("stt", this.f14874a);
            int i11 = this.f14886m;
            if (i11 != -1) {
                jSONObject.put("fromDI", i11);
            }
            if (this.f14887n) {
                jSONObject.put("retry", 1);
            }
            int i12 = this.f14888o;
            if (i12 != 0) {
                jSONObject.put("err", i12);
            }
            if (!TextUtils.isEmpty(this.f14889p)) {
                jSONObject.put("request_retry", this.f14889p);
            }
            int i13 = this.f14891r;
            if (i13 != 0) {
                jSONObject.put("e2ee_error_log", i13);
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public C3533a(int i11, String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(jSONObject, "jsonMsg");
        AbstractC19074t.m100208f(str2, "ownerID");
        this.f14874a = 3;
        this.f14880g = "";
        this.f14882i = -1;
        this.f14883j = -1;
        this.f14884k = -1L;
        this.f14885l = -1;
        this.f14886m = -1;
        this.f14889p = "";
        this.f14890q = "";
        this.f14892s = EnumC3539g.f14933q;
        try {
            this.f14880g = str2;
            if (jSONObject.has("cliMsgId")) {
                this.f14875b = jSONObject.getLong("cliMsgId");
            }
            if (jSONObject.has("id")) {
                this.f14876c = jSONObject.getLong("id");
            }
            if (jSONObject.has("realMsgId")) {
                this.f14877d = jSONObject.getLong("realMsgId");
            }
            if (jSONObject.has("fromU")) {
                this.f14878e = jSONObject.getLong("fromU");
            }
            if (this.f14878e == 0 && AbstractC20071b.Companion.m104322a(str) && jSONObject.has("senderId")) {
                this.f14878e = jSONObject.optLong("senderId");
            }
            if (jSONObject.has("to")) {
                this.f14879f = jSONObject.getLong("to");
            }
            if (this.f14879f == 0 && AbstractC20071b.Companion.m104322a(str) && jSONObject.has("groupId")) {
                this.f14879f = jSONObject.optLong("groupId");
            }
            if (jSONObject.has("srcType")) {
                this.f14882i = jSONObject.getInt("srcType");
            }
            this.f14883j = i11;
            this.f14881h = AbstractC19646n0.m102884D(str);
            if (jSONObject.has("at")) {
                this.f14885l = jSONObject.getInt("at");
            }
            if (jSONObject.has("ts")) {
                this.f14884k = jSONObject.getLong("ts");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("paramsExt");
            if (optJSONObject != null) {
                this.f14886m = optJSONObject.optInt("platformType", -1);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("e2ee");
            if (optJSONObject2 != null) {
                this.f14887n = optJSONObject2.optBoolean("retry");
            }
            if (str2.length() == 0) {
                AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("AckMsgStatus#constructor ownerId is empty\n"));
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104551d("AckMsgStatus JSONObject Ex: " + e11, new Object[0]);
        }
    }

    public C3533a(C17945a0 c17945a0) {
        long parseLong;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        this.f14874a = 3;
        this.f14880g = "";
        this.f14882i = -1;
        this.f14883j = -1;
        this.f14884k = -1L;
        this.f14885l = -1;
        this.f14886m = -1;
        this.f14889p = "";
        this.f14890q = "";
        this.f14892s = EnumC3539g.f14933q;
        try {
            this.f14875b = c17945a0.m95029V3().m41045i();
            this.f14876c = c17945a0.m95029V3().m41047k();
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            this.f14878e = Long.parseLong(m94862C4);
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            this.f14880g = mo95039W2;
            if (AbstractC25495a.m132079d(mo95039W2)) {
                parseLong = Long.parseLong(AbstractC25495a.m132088m(this.f14880g));
            } else if (AbstractC19074t.m100204b(c17945a0.m94862C4(), CoreUtility.f89233i)) {
                String mo95039W22 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                parseLong = Long.parseLong(mo95039W22);
            } else {
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                parseLong = Long.parseLong(str);
            }
            this.f14879f = parseLong;
            this.f14881h = AbstractC19646n0.m102878B(c17945a0.m95041W4(), false);
            this.f14882i = c17945a0.m94905H4();
            this.f14885l = c17945a0.m94887F4();
            this.f14884k = c17945a0.mo95213o();
            this.f14886m = c17945a0.m95196m4();
            this.f14888o = c17945a0.m95168j3();
            if (this.f14880g.length() == 0) {
                AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("AckMsgStatus#constructor ownerId is empty\n"));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d("AckMsgStatus chatContent Ex: " + e11, new Object[0]);
        }
    }

    public C3533a(long j11, long j12, long j13, String str, long j14, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(str, "ownerID");
        this.f14874a = 3;
        this.f14880g = "";
        this.f14882i = -1;
        this.f14883j = -1;
        this.f14884k = -1L;
        this.f14885l = -1;
        this.f14886m = -1;
        this.f14889p = "";
        this.f14890q = "";
        this.f14892s = EnumC3539g.f14933q;
        try {
            this.f14875b = j11;
            this.f14876c = j12;
            this.f14878e = j13;
            this.f14880g = str;
            if (j13 == 0 && !AbstractC25495a.m132079d(str)) {
                this.f14878e = Long.parseLong(str);
            }
            this.f14881h = i11;
            this.f14882i = i13;
            this.f14883j = i12;
            this.f14879f = j14;
            if (j14 == 0 && AbstractC25495a.m132079d(str)) {
                this.f14879f = Long.parseLong(AbstractC25495a.m132089n(str));
            }
            if (str.length() == 0) {
                AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("AckMsgStatus#constructor ownerId is empty\n"));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d("AckMsgStatus Ex: " + e11, new Object[0]);
        }
    }

    private C3533a(String str) {
        this.f14874a = 3;
        this.f14880g = "";
        this.f14882i = -1;
        this.f14883j = -1;
        this.f14884k = -1L;
        this.f14885l = -1;
        this.f14886m = -1;
        this.f14889p = "";
        this.f14890q = "";
        this.f14892s = EnumC3539g.f14933q;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14875b = jSONObject.optLong("cliMsgID");
            this.f14876c = jSONObject.optLong("globalMsgID");
            this.f14877d = jSONObject.optLong("realGlobalID");
            this.f14878e = jSONObject.optLong("senderID");
            this.f14879f = jSONObject.optLong("destID");
            String optString = jSONObject.optString("ownerID");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f14880g = optString;
            this.f14882i = jSONObject.optInt("srcType", -1);
            this.f14883j = jSONObject.optInt("msgCmd", -1);
            this.f14881h = jSONObject.optInt("msgType", -1);
            this.f14885l = jSONObject.optInt("at", -1);
            this.f14884k = jSONObject.optLong("ts", -1L);
            this.f14886m = jSONObject.optInt("fromDI", -1);
            boolean z11 = true;
            if (jSONObject.optInt("retry") != 1) {
                z11 = false;
            }
            this.f14887n = z11;
            this.f14888o = jSONObject.optInt("err");
            this.f14874a = jSONObject.optInt("stt");
            if (this.f14880g.length() == 0) {
                AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("AckMsgStatus#constructor ownerId is empty\n"));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d("AckMsgStatus jsonStr Ex: " + e11, new Object[0]);
        }
    }
}
