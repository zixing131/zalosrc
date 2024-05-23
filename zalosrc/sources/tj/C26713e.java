package tj;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tj.e */
/* loaded from: classes3.dex */
public final class C26713e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f126675a;

    /* renamed from: b */
    private List f126676b;

    /* renamed from: c */
    private String f126677c;

    /* renamed from: d */
    private boolean f126678d;

    /* renamed from: e */
    private boolean f126679e;

    /* renamed from: f */
    private int f126680f;

    /* renamed from: g */
    private String f126681g;

    /* renamed from: tj.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26713e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f126676b = new ArrayList();
        this.f126677c = "";
        boolean z11 = true;
        this.f126678d = true;
        this.f126679e = true;
        this.f126681g = "";
        try {
            int i11 = jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) : -1;
            this.f126675a = i11;
            if (i11 == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String jSONObject3 = jSONObject2.toString();
                AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                this.f126677c = jSONObject3;
                if (jSONObject2.has("canForward")) {
                    if (jSONObject2.optInt("canForward") != 1) {
                        z11 = false;
                    }
                    this.f126679e = z11;
                }
                JSONArray jSONArray = jSONObject2.getJSONArray("footerList");
                int length = jSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i12);
                    AbstractC19074t.m100207e(jSONObject4, "getJSONObject(...)");
                    this.f126676b.add(new C26712d(jSONObject4));
                }
                String optString = jSONObject2.optString("kwd");
                AbstractC19074t.m100207e(optString, "optString(...)");
                this.f126681g = optString;
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public final boolean m137356a() {
        return this.f126679e && this.f126680f == 0;
    }

    /* renamed from: b */
    public final int m137357b() {
        return this.f126680f;
    }

    /* renamed from: c */
    public final List m137358c() {
        return this.f126676b;
    }

    /* renamed from: d */
    public final String m137359d() {
        return this.f126677c;
    }

    /* renamed from: e */
    public final String m137360e() {
        return this.f126681g;
    }

    /* renamed from: f */
    public final int m137361f() {
        return this.f126675a;
    }

    /* renamed from: g */
    public final boolean m137362g() {
        return this.f126678d;
    }

    /* renamed from: h */
    public final JSONObject m137363h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f126675a);
            if (this.f126675a == 0 && this.f126677c.length() > 0) {
                JSONObject jSONObject2 = new JSONObject(this.f126677c);
                jSONObject2.put("kwd", this.f126681g);
                jSONObject.put("data", jSONObject2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C26713e(String str, int i11, String str2, String str3, boolean z11, int i12) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "actionType");
        AbstractC19074t.m100208f(str3, "actionData");
        this.f126676b = new ArrayList();
        this.f126677c = "";
        this.f126679e = true;
        try {
            this.f126675a = 0;
            this.f126681g = "";
            this.f126678d = z11;
            this.f126680f = i12;
            C26712d c26712d = new C26712d();
            c26712d.m137354v(i11);
            c26712d.m137351s(str2);
            c26712d.m137350r(str3);
            c26712d.m137353u(str);
            this.f126676b.add(c26712d);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(c26712d.m137355w());
            jSONObject2.put("footerList", jSONArray);
            jSONObject.put("data", jSONObject2);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f126675a);
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            this.f126677c = jSONObject3;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C26713e(ArrayList arrayList, boolean z11, int i11) {
        AbstractC19074t.m100208f(arrayList, "footerList");
        this.f126676b = new ArrayList();
        this.f126677c = "";
        this.f126679e = true;
        try {
            this.f126675a = 0;
            this.f126681g = "";
            this.f126678d = z11;
            this.f126680f = i11;
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = arrayList.get(i12);
                AbstractC19074t.m100207e(obj, "get(...)");
                C26712d c26712d = (C26712d) obj;
                this.f126676b.add(c26712d);
                jSONArray.put(c26712d.m137355w());
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("footerList", jSONArray);
            jSONObject.put("data", jSONObject2);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f126675a);
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            this.f126677c = jSONObject3;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C26713e(int i11, String str, boolean z11) {
        AbstractC19074t.m100208f(str, "footerData");
        this.f126676b = new ArrayList();
        boolean z12 = true;
        this.f126679e = true;
        this.f126681g = "";
        this.f126675a = i11;
        this.f126677c = str;
        this.f126678d = z11;
        if (i11 == 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("canForward")) {
                    if (jSONObject.optInt("canForward") != 1) {
                        z12 = false;
                    }
                    this.f126679e = z12;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("footerList");
                int length = jSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    this.f126676b.add(new C26712d(jSONObject2));
                }
                String optString = jSONObject.optString("kwd");
                AbstractC19074t.m100207e(optString, "optString(...)");
                this.f126681g = optString;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
