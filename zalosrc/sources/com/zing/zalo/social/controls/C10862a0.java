package com.zing.zalo.social.controls;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: com.zing.zalo.social.controls.a0 */
/* loaded from: classes5.dex */
public class C10862a0 {

    /* renamed from: a */
    private final String f54807a;

    /* renamed from: b */
    private final String f54808b;

    /* renamed from: c */
    private final String f54809c;

    /* renamed from: d */
    private final String f54810d;

    /* renamed from: e */
    private String f54811e;

    /* renamed from: f */
    private String f54812f;

    /* renamed from: g */
    private String f54813g;

    /* renamed from: h */
    private String f54814h;

    /* renamed from: i */
    private boolean f54815i;

    /* renamed from: j */
    private final int f54816j;

    /* renamed from: k */
    private final ZOMInsight f54817k;

    public C10862a0(Context context, int i11, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
        JSONObject jSONObject;
        this.f54815i = false;
        this.f54817k = zOMInsight;
        this.f54816j = i11;
        this.f54808b = str2;
        this.f54809c = str3;
        this.f54810d = str4;
        this.f54807a = str;
        JSONObject jSONObject2 = null;
        if (str5 != null) {
            try {
                if (!str5.isEmpty()) {
                    jSONObject2 = new JSONObject(str5);
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        if (jSONObject2 == null) {
            return;
        }
        try {
            if (jSONObject2.has("oa_popup")) {
                this.f54815i = true;
                JSONArray jSONArray = jSONObject2.getJSONArray("oa_popup");
                if (jSONArray.length() > 0 && (jSONObject = jSONArray.getJSONObject(0)) != null && jSONObject.has("popup")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("popup");
                    this.f54811e = AbstractC18069a.m96089h(jSONObject3, "title");
                    this.f54812f = AbstractC18069a.m96089h(jSONObject3, "desc");
                    this.f54813g = "";
                    this.f54814h = "";
                    if (jSONObject3.has("buttons")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("buttons");
                        if (jSONObject4.has("ok")) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("ok");
                            if (jSONObject5.has("label")) {
                                this.f54813g = AbstractC18069a.m96089h(jSONObject5, "label");
                            }
                        }
                        if (TextUtils.isEmpty(this.f54813g)) {
                            this.f54813g = context.getString(AbstractC8020f0.str_yes);
                        }
                        if (jSONObject4.has("cancel")) {
                            JSONObject jSONObject6 = jSONObject4.getJSONObject("cancel");
                            if (jSONObject6.has("label")) {
                                this.f54814h = AbstractC18069a.m96089h(jSONObject6, "label");
                            }
                        }
                        if (TextUtils.isEmpty(this.f54814h)) {
                            this.f54814h = context.getString(AbstractC8020f0.str_no);
                        }
                    }
                }
            }
        } catch (JSONException e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: a */
    public String m56341a() {
        return this.f54809c;
    }

    /* renamed from: b */
    public String m56342b() {
        return this.f54810d;
    }

    /* renamed from: c */
    public int m56343c() {
        return this.f54816j;
    }

    /* renamed from: d */
    public boolean m56344d() {
        return this.f54815i;
    }

    /* renamed from: e */
    public ZOMInsight m56345e() {
        return this.f54817k;
    }

    /* renamed from: f */
    public String m56346f() {
        return this.f54812f;
    }

    /* renamed from: g */
    public String m56347g() {
        return this.f54814h;
    }

    /* renamed from: h */
    public String m56348h() {
        return this.f54813g;
    }

    /* renamed from: i */
    public String m56349i() {
        return this.f54811e;
    }

    /* renamed from: j */
    public String m56350j() {
        return this.f54807a;
    }

    /* renamed from: k */
    public String m56351k() {
        return this.f54808b;
    }
}
