package com.zing.zalo.location;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import org.json.JSONException;
import org.json.JSONObject;
import p461qu.AbstractC25495a;

/* renamed from: com.zing.zalo.location.o */
/* loaded from: classes4.dex */
public class C8969o {

    /* renamed from: a */
    public long f47980a;

    /* renamed from: b */
    public String f47981b;

    /* renamed from: c */
    public String f47982c;

    /* renamed from: d */
    ContactProfile f47983d;

    /* renamed from: e */
    public double f47984e;

    /* renamed from: f */
    public double f47985f;

    /* renamed from: g */
    public double f47986g;

    /* renamed from: h */
    public double f47987h;

    /* renamed from: i */
    public MessageId f47988i;

    /* renamed from: j */
    public long f47989j;

    /* renamed from: k */
    public long f47990k;

    /* renamed from: l */
    public String f47991l;

    /* renamed from: m */
    public String f47992m;

    /* renamed from: n */
    public byte f47993n;

    /* renamed from: o */
    public int f47994o;

    /* renamed from: p */
    public long f47995p;

    /* renamed from: q */
    public String f47996q;

    /* renamed from: r */
    public boolean f47997r;

    /* renamed from: s */
    C17945a0 f47998s;

    public C8969o() {
        this.f47993n = (byte) 0;
        this.f47994o = 0;
        this.f47995p = -1L;
        this.f47996q = CoreUtility.f89233i;
    }

    /* renamed from: c */
    public static int m47963c(String str, byte b11) {
        if (b11 == 1) {
            str = AbstractC25495a.m132088m(str);
        }
        return Integer.parseInt(str);
    }

    /* renamed from: d */
    public static byte m47964d(String str) {
        return AbstractC25495a.m132079d(str) ? (byte) 1 : (byte) 0;
    }

    /* renamed from: a */
    public void m47965a(C8969o c8969o) {
        if (c8969o != null) {
            this.f47985f = c8969o.f47985f;
            this.f47984e = c8969o.f47984e;
            this.f47995p = c8969o.f47995p;
        }
    }

    /* renamed from: b */
    public ContactProfile m47966b() {
        if (this.f47983d == null && !TextUtils.isEmpty(this.f47982c)) {
            this.f47983d = new ContactProfile(this.f47982c);
        }
        ContactProfile contactProfile = this.f47983d;
        if (contactProfile != null) {
            contactProfile.f42446v = this.f47992m;
            contactProfile.f42437s = this.f47991l;
        }
        return contactProfile;
    }

    /* renamed from: e */
    public void m47967e() {
        try {
            byte m47964d = m47964d(this.f47981b);
            this.f47993n = m47964d;
            this.f47994o = m47963c(this.f47981b, m47964d);
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public JSONObject m47968f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("live_location_id", this.f47980a);
            if (!TextUtils.isEmpty(this.f47982c)) {
                jSONObject.put("uid", Long.parseLong(this.f47982c));
            }
            jSONObject.put("displayName", this.f47991l);
            jSONObject.put("avatar", this.f47992m);
            jSONObject.put("expired_time", this.f47990k);
            jSONObject.put("start_time", this.f47989j);
            jSONObject.put("long", this.f47985f);
            jSONObject.put("lat", this.f47984e);
            jSONObject.put("liveVer", this.f47995p);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C8969o(JSONObject jSONObject) {
        this();
        try {
            this.f47980a = jSONObject.optLong("live_location_id");
            if (jSONObject.has("uid")) {
                this.f47982c = String.valueOf(jSONObject.optLong("uid"));
            }
            this.f47991l = jSONObject.optString("displayName");
            this.f47992m = jSONObject.optString("avatar");
            this.f47990k = jSONObject.optLong("expired_time");
            this.f47989j = jSONObject.optLong("start_time");
            this.f47985f = jSONObject.optDouble("long", 0.0d);
            this.f47984e = jSONObject.optDouble("lat", 0.0d);
            this.f47995p = jSONObject.optLong("liveVer", -1L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
