package p716zh;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONObject;
import p055ce.C3433b;
import p055ce.C3442k;
import p304ks.AbstractC21935u;

/* renamed from: zh.cb */
/* loaded from: classes3.dex */
public class C31874cb {

    /* renamed from: A */
    public int f146379A;

    /* renamed from: B */
    public String f146380B;

    /* renamed from: C */
    public boolean f146381C;

    /* renamed from: D */
    public boolean f146382D;

    /* renamed from: E */
    public long f146383E;

    /* renamed from: F */
    public int f146384F;

    /* renamed from: a */
    public String f146385a;

    /* renamed from: b */
    public String f146386b;

    /* renamed from: c */
    public String f146387c;

    /* renamed from: d */
    public int f146388d;

    /* renamed from: e */
    public int f146389e;

    /* renamed from: f */
    public int f146390f;

    /* renamed from: g */
    public int f146391g;

    /* renamed from: h */
    public String f146392h;

    /* renamed from: i */
    public String f146393i;

    /* renamed from: j */
    public String f146394j;

    /* renamed from: k */
    public int f146395k;

    /* renamed from: l */
    public String f146396l;

    /* renamed from: m */
    public String f146397m;

    /* renamed from: n */
    public long f146398n;

    /* renamed from: o */
    public int f146399o;

    /* renamed from: p */
    public int f146400p;

    /* renamed from: q */
    public String f146401q;

    /* renamed from: r */
    public int f146402r;

    /* renamed from: s */
    public String f146403s;

    /* renamed from: t */
    public boolean f146404t;

    /* renamed from: u */
    public boolean f146405u;

    /* renamed from: v */
    public int f146406v;

    /* renamed from: w */
    public int f146407w;

    /* renamed from: x */
    public boolean f146408x;

    /* renamed from: y */
    public int f146409y;

    /* renamed from: z */
    public int f146410z;

    public C31874cb() {
        this.f146385a = "";
        this.f146386b = "";
        this.f146387c = "";
        this.f146388d = 0;
        this.f146389e = -1;
        this.f146390f = 0;
        this.f146391g = 1;
        this.f146392h = "";
        this.f146393i = "";
        this.f146394j = "";
        this.f146395k = 0;
        this.f146396l = "";
        this.f146397m = "";
        this.f146398n = 0L;
        this.f146399o = 1;
        this.f146400p = -1;
        this.f146401q = "";
        this.f146402r = 0;
        this.f146403s = "";
        this.f146404t = true;
        this.f146405u = false;
        this.f146406v = 1;
        this.f146407w = 1;
        this.f146408x = false;
        this.f146409y = -1;
        this.f146410z = -1;
        this.f146379A = 0;
        this.f146380B = "";
        this.f146381C = false;
        this.f146382D = false;
        this.f146383E = 0L;
        this.f146384F = -1;
    }

    /* renamed from: a */
    public ContactProfile m153177a() {
        ContactProfile contactProfile = new ContactProfile(this.f146385a);
        contactProfile.f42434r = this.f146385a;
        contactProfile.f42446v = this.f146393i;
        contactProfile.f42455y = this.f146394j;
        contactProfile.f42373R0 = this.f146389e;
        contactProfile.f42437s = this.f146387c;
        contactProfile.m40401d1(this.f146396l);
        contactProfile.f42352K0 = this.f146390f;
        contactProfile.f42361N0 = this.f146402r;
        contactProfile.f42364O0 = this.f146403s;
        return contactProfile;
    }

    /* renamed from: b */
    public C3433b m153178b() {
        if (!TextUtils.isEmpty(this.f146403s)) {
            try {
                return new C3433b(new JSONObject(this.f146403s));
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public String m153179c() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("{");
            sb2.append("\"uid\":");
            sb2.append(JSONObject.quote(this.f146385a));
            sb2.append(",");
            sb2.append("\"avt\":");
            sb2.append(JSONObject.quote(this.f146393i));
            sb2.append(",");
            sb2.append("\"phone\":");
            sb2.append(JSONObject.quote(this.f146394j));
            sb2.append(",");
            sb2.append("\"reqSrc\":");
            sb2.append(JSONObject.quote("" + this.f146389e));
            sb2.append(",");
            sb2.append("\"dpn\":");
            sb2.append(JSONObject.quote(this.f146387c));
            sb2.append(",");
            sb2.append("\"srcType\":");
            sb2.append(JSONObject.quote("" + this.f146399o));
            sb2.append(",");
            sb2.append("\"customText\":");
            sb2.append(JSONObject.quote("" + this.f146397m));
            sb2.append(",");
            sb2.append("\"msg\":");
            sb2.append(JSONObject.quote("" + this.f146396l));
            sb2.append(",");
            sb2.append("\"type\":");
            sb2.append(JSONObject.quote("" + this.f146390f));
            sb2.append(",");
            sb2.append("\"account_type\":");
            sb2.append(this.f146402r);
            sb2.append(",");
            sb2.append("\"business_account\":");
            String str = this.f146403s;
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append(",");
            sb2.append("\"visibleActionMain\":");
            sb2.append(JSONObject.quote("" + this.f146406v));
            sb2.append(",");
            sb2.append("\"visibleActionRemove\":");
            sb2.append(JSONObject.quote("" + this.f146407w));
            sb2.append(",");
            sb2.append("\"timePush\":");
            sb2.append(JSONObject.quote("" + this.f146383E));
            sb2.append(",");
            sb2.append("\"timestamp\":");
            sb2.append(JSONObject.quote("" + this.f146398n));
            sb2.append("}");
        } catch (Exception unused) {
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public String m153180d(boolean z11, boolean z12) {
        if (z11) {
            return AbstractC21935u.m114539f(this.f146394j, this.f146385a, this.f146387c);
        }
        return AbstractC21935u.m114541h(this.f146394j, this.f146387c, z12);
    }

    /* renamed from: e */
    public String m153181e() {
        C3433b m153178b = m153178b();
        if (m153178b != null && C3442k.f14460a.m17300e(m153178b.m17256i())) {
            return m153178b.m17255h();
        }
        return "";
    }

    public C31874cb(ContactProfile contactProfile) {
        this.f146385a = "";
        this.f146386b = "";
        this.f146387c = "";
        this.f146388d = 0;
        this.f146389e = -1;
        this.f146390f = 0;
        this.f146391g = 1;
        this.f146392h = "";
        this.f146393i = "";
        this.f146394j = "";
        this.f146395k = 0;
        this.f146396l = "";
        this.f146397m = "";
        this.f146398n = 0L;
        this.f146399o = 1;
        this.f146400p = -1;
        this.f146401q = "";
        this.f146402r = 0;
        this.f146403s = "";
        this.f146404t = true;
        this.f146405u = false;
        this.f146406v = 1;
        this.f146407w = 1;
        this.f146408x = false;
        this.f146409y = -1;
        this.f146410z = -1;
        this.f146379A = 0;
        this.f146380B = "";
        this.f146381C = false;
        this.f146382D = false;
        this.f146383E = 0L;
        this.f146384F = -1;
        this.f146385a = contactProfile.f42434r;
        this.f146393i = contactProfile.f42446v;
        this.f146387c = contactProfile.f42437s;
        this.f146394j = contactProfile.f42455y;
        this.f146395k = contactProfile.f42449w;
        this.f146389e = contactProfile.f42373R0;
        this.f146390f = contactProfile.f42352K0;
        this.f146396l = contactProfile.m40378N();
        this.f146398n = contactProfile.f42330D;
        this.f146402r = contactProfile.f42361N0;
        this.f146403s = contactProfile.f42364O0;
        this.f146381C = false;
    }

    public C31874cb(JSONObject jSONObject) {
        this.f146385a = "";
        this.f146386b = "";
        this.f146387c = "";
        this.f146388d = 0;
        this.f146389e = -1;
        this.f146390f = 0;
        this.f146391g = 1;
        this.f146392h = "";
        this.f146393i = "";
        this.f146394j = "";
        this.f146395k = 0;
        this.f146396l = "";
        this.f146397m = "";
        this.f146398n = 0L;
        this.f146399o = 1;
        this.f146400p = -1;
        this.f146401q = "";
        this.f146402r = 0;
        this.f146403s = "";
        this.f146404t = true;
        this.f146405u = false;
        this.f146406v = 1;
        this.f146407w = 1;
        this.f146408x = false;
        this.f146409y = -1;
        this.f146410z = -1;
        this.f146379A = 0;
        this.f146380B = "";
        this.f146381C = false;
        this.f146382D = false;
        this.f146383E = 0L;
        this.f146384F = -1;
        this.f146385a = !jSONObject.isNull("uid") ? jSONObject.optString("uid") : "";
        this.f146393i = !jSONObject.isNull("avt") ? jSONObject.optString("avt") : "";
        this.f146394j = !jSONObject.isNull("phone") ? jSONObject.optString("phone") : "";
        this.f146389e = !jSONObject.isNull("reqSrc") ? jSONObject.optInt("reqSrc") : -1;
        this.f146387c = !jSONObject.isNull("dpn") ? jSONObject.optString("dpn") : "";
        this.f146399o = jSONObject.isNull("srcType") ? -1 : jSONObject.optInt("srcType");
        this.f146397m = !jSONObject.isNull("customText") ? jSONObject.optString("customText") : "";
        this.f146396l = !jSONObject.isNull("msg") ? jSONObject.optString("msg") : "";
        this.f146390f = !jSONObject.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) : 0;
        this.f146402r = jSONObject.optInt("account_type", 0);
        this.f146403s = jSONObject.optString("business_account", "");
        this.f146406v = !jSONObject.isNull("visibleActionMain") ? jSONObject.optInt("visibleActionMain") : 1;
        this.f146407w = jSONObject.isNull("visibleActionRemove") ? 1 : jSONObject.optInt("visibleActionRemove");
        this.f146383E = !jSONObject.isNull("timePush") ? jSONObject.optLong("timePush") : 0L;
        this.f146398n = jSONObject.isNull("timestamp") ? 0L : jSONObject.optLong("timestamp");
    }
}
