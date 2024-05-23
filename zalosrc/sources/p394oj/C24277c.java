package p394oj;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oj.c */
/* loaded from: classes3.dex */
public class C24277c {

    /* renamed from: a */
    public int f117240a;

    /* renamed from: b */
    public String f117241b;

    /* renamed from: c */
    public int f117242c;

    /* renamed from: d */
    public int f117243d;

    /* renamed from: e */
    public int f117244e;

    /* renamed from: f */
    public String f117245f;

    /* renamed from: g */
    public String f117246g;

    /* renamed from: h */
    public boolean f117247h;

    public C24277c(JSONObject jSONObject) {
        this.f117241b = "";
        this.f117243d = 100;
        this.f117247h = false;
        try {
            this.f117242c = jSONObject.getInt("rType");
            this.f117241b = jSONObject.getString("rIcon");
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public C24277c() {
        this.f117241b = "";
        this.f117243d = 100;
        this.f117247h = false;
    }
}
