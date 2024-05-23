package p056cj;

import bo.C3000l0;
import is.AbstractC20826v0;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: cj.e */
/* loaded from: classes3.dex */
public class C3537e {

    /* renamed from: a */
    public boolean f14918a;

    /* renamed from: b */
    public boolean f14919b;

    /* renamed from: c */
    public boolean f14920c;

    /* renamed from: d */
    public C3000l0 f14921d;

    /* renamed from: e */
    public String f14922e;

    public C3537e(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        try {
            if (AbstractC18069a.m96085d(jSONObject, "unread") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f14918a = z11;
            if (AbstractC18069a.m96085d(jSONObject, "bump_top") == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f14919b = z12;
            this.f14920c = AbstractC18069a.m96085d(jSONObject, "notification") == 1;
            JSONObject jSONObject2 = jSONObject.getJSONObject("feed");
            this.f14921d = AbstractC20826v0.m108750B0(jSONObject2);
            this.f14922e = jSONObject2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
