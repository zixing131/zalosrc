package p368nq;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: nq.b */
/* loaded from: classes4.dex */
public final class C23927b {

    /* renamed from: a */
    public String f115597a;

    /* renamed from: b */
    public String f115598b;

    /* renamed from: c */
    public String f115599c;

    /* renamed from: d */
    public String f115600d;

    /* renamed from: e */
    public int f115601e;

    /* renamed from: f */
    public String f115602f;

    /* renamed from: g */
    public String f115603g;

    /* renamed from: h */
    public boolean f115604h;

    /* renamed from: i */
    public boolean f115605i;

    /* renamed from: j */
    public boolean f115606j;

    /* renamed from: k */
    public int f115607k;

    /* renamed from: l */
    public int f115608l;

    public C23927b(JSONObject jSONObject) {
        this.f115597a = "";
        this.f115598b = "";
        this.f115599c = "";
        this.f115600d = "";
        this.f115601e = -1;
        this.f115602f = "";
        this.f115603g = "";
        this.f115607k = -1;
        if (jSONObject != null) {
            try {
                String m96089h = AbstractC18069a.m96089h(jSONObject, "action_data");
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                this.f115597a = m96089h;
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "action_type");
                AbstractC19074t.m100207e(m96089h2, "getJSONValue(...)");
                this.f115598b = m96089h2;
                this.f115607k = AbstractC18069a.m96086e(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
                JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "content");
                if (m96091j != null) {
                    String m96089h3 = AbstractC18069a.m96089h(m96091j, "description");
                    AbstractC19074t.m100207e(m96089h3, "getJSONValue(...)");
                    this.f115599c = m96089h3;
                    String m96089h4 = AbstractC18069a.m96089h(m96091j, "icon");
                    AbstractC19074t.m100207e(m96089h4, "getJSONValue(...)");
                    this.f115600d = m96089h4;
                    this.f115601e = AbstractC18069a.m96086e(m96091j, "size", 0);
                    String m96089h5 = AbstractC18069a.m96089h(m96091j, "thumb");
                    AbstractC19074t.m100207e(m96089h5, "getJSONValue(...)");
                    this.f115602f = m96089h5;
                    String m96089h6 = AbstractC18069a.m96089h(m96091j, "title");
                    AbstractC19074t.m100207e(m96089h6, "getJSONValue(...)");
                    this.f115603g = m96089h6;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
