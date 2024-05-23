package tj;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: tj.a */
/* loaded from: classes3.dex */
public final class C26709a {

    /* renamed from: a */
    private final int f126644a;

    /* renamed from: b */
    private int f126645b;

    /* renamed from: c */
    private final String f126646c;

    /* renamed from: d */
    private final String f126647d;

    /* renamed from: e */
    private final List f126648e;

    public C26709a(JSONObject jSONObject) {
        String str;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f126648e = new ArrayList();
        this.f126644a = jSONObject.optInt("action");
        this.f126645b = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        JSONObject optJSONObject = jSONObject.optJSONObject("customMsg");
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        } else {
            str = null;
        }
        this.f126646c = str == null ? "" : str;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("customNotif");
        String jSONObject2 = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f126647d = jSONObject2 != null ? jSONObject2 : "";
        JSONArray optJSONArray = jSONObject.optJSONArray("contents");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f126648e.add(new C26711c(optJSONArray.getJSONObject(i11)));
            }
        }
    }

    /* renamed from: a */
    public final String m137320a() {
        return this.f126646c;
    }

    /* renamed from: b */
    public final String m137321b() {
        return this.f126647d;
    }

    /* renamed from: c */
    public final List m137322c() {
        return this.f126648e;
    }

    /* renamed from: d */
    public final boolean m137323d() {
        return this.f126645b == 1;
    }

    /* renamed from: e */
    public final boolean m137324e() {
        return this.f126645b == 0;
    }

    /* renamed from: f */
    public final boolean m137325f() {
        return this.f126644a == 1;
    }
}
