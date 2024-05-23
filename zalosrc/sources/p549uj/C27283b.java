package p549uj;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: uj.b */
/* loaded from: classes3.dex */
public class C27283b extends AbstractC27282a {

    /* renamed from: h */
    private LinkedHashMap f128364h;

    /* renamed from: i */
    protected boolean f128365i;

    public C27283b(JSONObject jSONObject) {
        super(jSONObject);
        this.f128365i = false;
        try {
            this.f128364h = new LinkedHashMap();
            if (jSONObject.has("submenus")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("submenus");
                    if (jSONArray != null) {
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            C27283b c27283b = new C27283b(jSONArray.getJSONObject(i11));
                            if (c27283b.m139678i()) {
                                this.f128364h.put(c27283b.m139670b(), c27283b);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (this.f128364h.size() > 0) {
                this.f128365i = true;
            } else if (this.f128355d == 0) {
                this.f128365i = false;
            } else {
                this.f128365i = m139675g();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: i */
    public boolean m139678i() {
        return this.f128365i;
    }

    /* renamed from: j */
    public Map m139679j() {
        return this.f128364h;
    }

    /* renamed from: k */
    public boolean m139680k() {
        LinkedHashMap linkedHashMap = this.f128364h;
        if (linkedHashMap != null && linkedHashMap.size() > 0) {
            return true;
        }
        return false;
    }
}
