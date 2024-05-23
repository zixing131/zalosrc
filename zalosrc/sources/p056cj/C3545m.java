package p056cj;

import ak0.C0891f;
import ak0.InterfaceC0887b;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p549uj.C27283b;

/* renamed from: cj.m */
/* loaded from: classes3.dex */
public class C3545m {

    /* renamed from: a */
    private LinkedHashMap f14956a;

    /* renamed from: b */
    private long f14957b;

    /* renamed from: c */
    private long f14958c;

    /* renamed from: d */
    private int f14959d;

    /* renamed from: e */
    private JSONObject f14960e;

    /* renamed from: f */
    private InterfaceC0887b f14961f;

    public C3545m(JSONObject jSONObject, long j11) {
        this(jSONObject, j11, 0L);
    }

    /* renamed from: a */
    public long m18015a() {
        return this.f14957b;
    }

    /* renamed from: b */
    public LinkedHashMap m18016b() {
        return this.f14956a;
    }

    /* renamed from: c */
    public int m18017c() {
        return this.f14959d;
    }

    /* renamed from: d */
    public InterfaceC0887b m18018d() {
        return this.f14961f;
    }

    /* renamed from: e */
    public boolean m18019e() {
        LinkedHashMap linkedHashMap = this.f14956a;
        if (linkedHashMap != null && linkedHashMap.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m18020f() {
        return this.f14961f != null;
    }

    /* renamed from: g */
    public boolean m18021g() {
        if (System.currentTimeMillis() - this.f14957b > this.f14958c) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public String m18022h() {
        JSONObject jSONObject = this.f14960e;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "";
    }

    public C3545m(JSONObject jSONObject, long j11, long j12) {
        JSONArray jSONArray;
        this.f14961f = null;
        try {
            this.f14960e = jSONObject;
            long j13 = 0;
            if (j12 >= 0) {
                j13 = 1000 * j12;
            }
            this.f14958c = j13;
            this.f14956a = new LinkedHashMap();
            if (jSONObject.has("menu") && (jSONArray = jSONObject.getJSONArray("menu")) != null && jSONArray.length() > 0) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    try {
                        C27283b c27283b = new C27283b(jSONArray.getJSONObject(i11));
                        if (c27283b.m139678i()) {
                            this.f14956a.put(c27283b.m139670b(), c27283b);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
            this.f14959d = AbstractC18069a.m96085d(jSONObject, "ver");
            this.f14957b = j11;
            if (jSONObject.has("zinstant_menu")) {
                this.f14961f = C0891f.m2747g(jSONObject.getJSONObject("zinstant_menu"));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
