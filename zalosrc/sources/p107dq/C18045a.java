package p107dq;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dq.a */
/* loaded from: classes4.dex */
public final class C18045a {

    /* renamed from: a */
    private int f91328a;

    /* renamed from: b */
    private C18047c f91329b;

    /* renamed from: c */
    private C18054j f91330c;

    public C18045a() {
    }

    public C18045a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                    this.f91328a = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                }
                if (jSONObject.has("gradient")) {
                    this.f91329b = new C18047c(jSONObject.getJSONObject("gradient"));
                }
                if (jSONObject.has("thumb_url")) {
                    this.f91330c = new C18054j(jSONObject.getJSONObject("thumb_url"));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: a */
    public final C18047c m95913a() {
        return this.f91329b;
    }

    /* renamed from: b */
    public final C18054j m95914b() {
        return this.f91330c;
    }

    /* renamed from: c */
    public final int m95915c() {
        return this.f91328a;
    }

    /* renamed from: d */
    public final void m95916d(C18047c c18047c) {
        this.f91329b = c18047c;
    }

    /* renamed from: e */
    public final void m95917e(C18054j c18054j) {
        this.f91330c = c18054j;
    }

    /* renamed from: f */
    public final JSONObject m95918f() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f91328a);
            C18047c c18047c = this.f91329b;
            JSONObject jSONObject3 = null;
            if (c18047c != null) {
                jSONObject = c18047c.m95924c();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("gradient", jSONObject);
            C18054j c18054j = this.f91330c;
            if (c18054j != null) {
                jSONObject3 = c18054j.m95949c();
            }
            jSONObject2.put("thumb_url", jSONObject3);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject2;
    }
}
