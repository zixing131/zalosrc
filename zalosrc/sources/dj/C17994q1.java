package dj;

import android.text.TextUtils;
import bo.AbstractC3035s0;
import bo.C3000l0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import is.AbstractC20826v0;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p716zh.C32027n;
import p716zh.C32123ta;

/* renamed from: dj.q1 */
/* loaded from: classes3.dex */
public class C17994q1 {

    /* renamed from: a */
    public int f91139a;

    /* renamed from: b */
    public String f91140b;

    /* renamed from: c */
    public C3000l0 f91141c;

    /* renamed from: d */
    public C32123ta f91142d;

    /* renamed from: e */
    public C32027n f91143e;

    public C17994q1(int i11, String str) {
        this.f91139a = i11;
        this.f91140b = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m95678a(new JSONObject(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m95678a(JSONObject jSONObject) {
        try {
            int i11 = this.f91139a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 3) {
                        this.f91143e = new C32027n(jSONObject);
                    }
                } else {
                    this.f91142d = new C32123ta(jSONObject);
                }
            } else {
                this.f91141c = AbstractC20826v0.m108750B0(jSONObject.getJSONObject("feed"));
                if (AbstractC3035s0.f12231c) {
                    this.f91141c = AbstractC3035s0.m14606p();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C17994q1(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f91139a = jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) : -1;
            String m96089h = AbstractC18069a.m96089h(jSONObject, "data");
            this.f91140b = m96089h;
            if (TextUtils.isEmpty(m96089h)) {
                return;
            }
            try {
                m95678a(new JSONObject(this.f91140b));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }
}
