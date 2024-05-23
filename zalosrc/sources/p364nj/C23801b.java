package p364nj;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: nj.b */
/* loaded from: classes3.dex */
public class C23801b {

    /* renamed from: a */
    public String f115034a;

    /* renamed from: b */
    public boolean f115035b;

    /* renamed from: c */
    public int f115036c;

    /* renamed from: d */
    public int f115037d;

    /* renamed from: e */
    public String f115038e;

    /* renamed from: f */
    public String f115039f;

    /* renamed from: g */
    public long f115040g;

    /* renamed from: h */
    public long f115041h;

    /* renamed from: i */
    public a f115042i;

    /* renamed from: j */
    public HashSet f115043j = new HashSet();

    /* renamed from: k */
    public int f115044k;

    /* renamed from: l */
    public long f115045l;

    public C23801b(JSONObject jSONObject, int i11) {
        this.f115042i = new a();
        try {
            this.f115044k = i11;
            this.f115034a = AbstractC18069a.m96089h(jSONObject, "id");
            boolean z11 = true;
            if (AbstractC18069a.m96085d(jSONObject, "enabled") != 1) {
                z11 = false;
            }
            this.f115035b = z11;
            this.f115036c = AbstractC18069a.m96085d(jSONObject, "mode");
            this.f115037d = AbstractC18069a.m96085d(jSONObject, "position");
            this.f115038e = AbstractC18069a.m96089h(jSONObject, "audio_icon_url");
            this.f115039f = AbstractC18069a.m96089h(jSONObject, "video_icon_url");
            this.f115040g = AbstractC18069a.m96087f(jSONObject, "start_ts");
            this.f115041h = AbstractC18069a.m96087f(jSONObject, "duration");
            if (jSONObject.has("start_ts_tip")) {
                this.f115045l = AbstractC18069a.m96087f(jSONObject, "start_ts_tip");
            } else {
                this.f115045l = this.f115040g;
            }
            if (jSONObject.has("tip_content")) {
                this.f115042i = new a(jSONObject.getJSONObject("tip_content"));
            }
            if (jSONObject.has("uid_list")) {
                JSONArray jSONArray = jSONObject.getJSONArray("uid_list");
                if (jSONArray.length() > 0) {
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        this.f115043j.add(jSONArray.getString(i12));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public JSONObject m124370a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f115034a);
            jSONObject.put("enabled", this.f115035b ? 1 : 0);
            jSONObject.put("mode", this.f115036c);
            jSONObject.put("position", this.f115037d);
            jSONObject.put("audio_icon_url", this.f115038e);
            jSONObject.put("video_icon_url", this.f115039f);
            jSONObject.put("start_ts", this.f115040g);
            jSONObject.put("duration", this.f115041h);
            jSONObject.put("start_ts_tip", this.f115045l);
            a aVar = this.f115042i;
            if (aVar != null) {
                jSONObject.put("tip_content", aVar.m124372a());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f115043j.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put("uid_list", jSONArray);
            return jSONObject;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public void m124371b(int i11) {
        int i12 = this.f115036c;
        if ((i12 & i11) == i11) {
            this.f115036c = i11 ^ i12;
        }
    }

    /* renamed from: nj.b$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f115046a;

        /* renamed from: b */
        public String f115047b;

        a(JSONObject jSONObject) {
            this.f115046a = AbstractC18069a.m96089h(jSONObject, "vi");
            this.f115047b = AbstractC18069a.m96089h(jSONObject, "en");
        }

        /* renamed from: a */
        JSONObject m124372a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("vi", this.f115046a);
                jSONObject.put("en", this.f115047b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        a() {
            this.f115046a = "";
            this.f115047b = "";
        }
    }
}
