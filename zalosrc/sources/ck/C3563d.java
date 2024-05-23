package ck;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ck.d */
/* loaded from: classes3.dex */
public class C3563d {

    /* renamed from: a */
    public String f15090a;

    /* renamed from: b */
    public double f15091b;

    /* renamed from: c */
    public double f15092c;

    /* renamed from: d */
    public int f15093d;

    /* renamed from: e */
    public String f15094e;

    /* renamed from: f */
    public String f15095f;

    /* renamed from: g */
    public List f15096g;

    /* renamed from: ck.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        String f15097a;

        /* renamed from: b */
        String f15098b;

        /* renamed from: c */
        String f15099c;

        /* renamed from: d */
        int f15100d;

        public a(JSONObject jSONObject) {
            String str;
            String str2;
            int i11;
            if (jSONObject != null) {
                try {
                    if (jSONObject.isNull("name")) {
                        str = "";
                    } else {
                        str = jSONObject.getString("name");
                    }
                    this.f15097a = str;
                    if (jSONObject.isNull("value")) {
                        str2 = "";
                    } else {
                        str2 = jSONObject.getString("value");
                    }
                    this.f15098b = str2;
                    this.f15099c = jSONObject.isNull("icon") ? "" : jSONObject.getString("icon");
                    if (!jSONObject.isNull("promote")) {
                        i11 = jSONObject.getInt("promote");
                    } else {
                        i11 = 0;
                    }
                    this.f15100d = i11;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public String m18102a() {
            return this.f15099c;
        }

        /* renamed from: b */
        public String m18103b() {
            return this.f15097a;
        }

        /* renamed from: c */
        public String m18104c() {
            return this.f15098b;
        }

        /* renamed from: d */
        public JSONObject m18105d() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.f15097a);
                jSONObject.put("value", this.f15098b);
                jSONObject.put("icon", this.f15099c);
                jSONObject.put("promote", this.f15100d);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    public C3563d(JSONObject jSONObject) {
        String str;
        int i11;
        String str2;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        double d11;
        if (jSONObject != null) {
            try {
                if (jSONObject.isNull("description")) {
                    str = "";
                } else {
                    str = jSONObject.getString("description");
                }
                this.f15090a = str;
                if (!jSONObject.isNull("openlocation")) {
                    i11 = jSONObject.getInt("openlocation");
                } else {
                    i11 = 0;
                }
                this.f15093d = i11;
                if (jSONObject.isNull("historymessage")) {
                    str2 = "";
                } else {
                    str2 = jSONObject.getString("historymessage");
                }
                this.f15094e = str2;
                this.f15095f = jSONObject.isNull("alias") ? "" : jSONObject.getString("alias");
                if (!jSONObject.isNull("locations")) {
                    jSONArray = jSONObject.getJSONArray("locations");
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null && jSONArray.length() > 0 && (jSONObject2 = jSONArray.getJSONObject(0)) != null) {
                    if (!jSONObject2.isNull("lon")) {
                        d11 = jSONObject2.getDouble("lon");
                    } else {
                        d11 = 0.0d;
                    }
                    this.f15091b = d11;
                    this.f15092c = jSONObject2.isNull("lat") ? 0.0d : jSONObject2.getDouble("lat");
                }
                JSONArray jSONArray2 = jSONObject.isNull("oainfoitem") ? null : jSONObject.getJSONArray("oainfoitem");
                if (jSONArray2 != null) {
                    this.f15096g = new ArrayList();
                    int length = jSONArray2.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        this.f15096g.add(new a(jSONArray2.getJSONObject(i12)));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public double m18097a() {
        return this.f15092c;
    }

    /* renamed from: b */
    public List m18098b() {
        ArrayList arrayList = new ArrayList();
        List<a> list = this.f15096g;
        if (list != null) {
            for (a aVar : list) {
                if (aVar.f15100d == 0 && !TextUtils.isEmpty(aVar.f15097a) && !TextUtils.isEmpty(aVar.f15098b)) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public double m18099c() {
        return this.f15091b;
    }

    /* renamed from: d */
    public List m18100d() {
        ArrayList arrayList = new ArrayList();
        List<a> list = this.f15096g;
        if (list != null) {
            for (a aVar : list) {
                if (aVar.f15100d == 1 && !TextUtils.isEmpty(aVar.f15097a) && !TextUtils.isEmpty(aVar.f15098b)) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public JSONObject m18101e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("description", this.f15090a);
            jSONObject.put("openlocation", this.f15093d);
            jSONObject.put("historymessage", this.f15094e);
            jSONObject.put("alias", this.f15095f);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("lon", this.f15091b);
            jSONObject2.put("lat", this.f15092c);
            jSONArray.put(jSONObject2);
            jSONObject.put("locations", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            List list = this.f15096g;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((a) it.next()).m18105d());
                }
            }
            jSONObject.put("oainfoitem", jSONArray2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
