package p716zh;

import android.text.TextUtils;
import gw.AbstractC19646n0;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: zh.a9 */
/* loaded from: classes3.dex */
public class C31842a9 {

    /* renamed from: a */
    public String f146146a;

    /* renamed from: b */
    public String f146147b;

    /* renamed from: c */
    public boolean f146148c;

    /* renamed from: d */
    public String f146149d;

    /* renamed from: e */
    public a f146150e;

    /* renamed from: f */
    public String f146151f;

    /* renamed from: g */
    public String f146152g;

    /* renamed from: zh.a9$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f146153a;

        /* renamed from: b */
        public String f146154b;

        /* renamed from: c */
        public String f146155c;

        /* renamed from: d */
        public String f146156d;

        /* renamed from: e */
        public String f146157e;

        public a(JSONObject jSONObject) {
            try {
                this.f146157e = AbstractC18069a.m96089h(jSONObject, "content");
                if (jSONObject.has("popup")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("popup");
                    this.f146153a = AbstractC18069a.m96089h(jSONObject2, "title");
                    this.f146154b = AbstractC18069a.m96089h(jSONObject2, "desc");
                    this.f146155c = "";
                    this.f146156d = "";
                    if (jSONObject2.has("buttons")) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("buttons");
                        if (jSONObject3.has("ok")) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("ok");
                            if (jSONObject4.has("label")) {
                                this.f146155c = AbstractC18069a.m96089h(jSONObject4, "label");
                            }
                            if (jSONObject4.has("hidden") && AbstractC18069a.m96085d(jSONObject4, "hidden") == 1) {
                                this.f146155c = "";
                            }
                        }
                        if (this.f146155c == null) {
                            this.f146155c = "";
                        }
                        if (jSONObject3.has("cancel")) {
                            JSONObject jSONObject5 = jSONObject3.getJSONObject("cancel");
                            if (jSONObject5.has("label")) {
                                this.f146156d = AbstractC18069a.m96089h(jSONObject5, "label");
                            }
                            if (jSONObject5.has("hidden") && AbstractC18069a.m96085d(jSONObject5, "hidden") == 1) {
                                this.f146156d = "";
                            }
                        }
                        if (this.f146156d == null) {
                            this.f146156d = "";
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: a */
        public boolean m152987a() {
            if (!TextUtils.isEmpty(this.f146153a) && !TextUtils.isEmpty(this.f146154b)) {
                return true;
            }
            return false;
        }
    }

    public C31842a9(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            if (jSONObject.has("data")) {
                this.f146147b = AbstractC18069a.m96089h(jSONObject, "data");
            }
            if (jSONObject.has("is_tracking")) {
                this.f146148c = AbstractC18069a.m96083b(jSONObject, "is_tracking");
            }
            if (jSONObject.has("id_tracking")) {
                this.f146149d = AbstractC18069a.m96089h(jSONObject, "id_tracking");
            }
            if (jSONObject.has("data_popup")) {
                try {
                    if (!TextUtils.isEmpty(AbstractC18069a.m96089h(jSONObject, "data_popup")) && (jSONArray = jSONObject.getJSONArray("data_popup")) != null && jSONArray.length() > 0) {
                        this.f146150e = new a(jSONArray.getJSONObject(0));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            this.f146151f = AbstractC19646n0.m102890F(AbstractC18069a.m96091j(jSONObject, "customTitle"), -1);
            this.f146152g = AbstractC19646n0.m102890F(AbstractC18069a.m96091j(jSONObject, "customDesc"), -1);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
