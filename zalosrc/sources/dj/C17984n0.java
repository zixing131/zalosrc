package dj;

import android.text.TextUtils;
import com.zing.zalo.control.C7907e;
import gw.AbstractC19620d0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p450qj.C25301c;

/* renamed from: dj.n0 */
/* loaded from: classes3.dex */
public class C17984n0 extends C17969i0 {

    /* renamed from: B */
    public String f91079B;

    /* renamed from: C */
    public int f91080C;

    /* renamed from: D */
    public List f91081D;

    /* renamed from: E */
    public String f91082E;

    /* renamed from: F */
    public String f91083F;

    /* renamed from: G */
    public C7907e f91084G;

    /* renamed from: H */
    public C7907e f91085H;

    /* renamed from: I */
    public C7907e f91086I;

    /* renamed from: J */
    public C7907e f91087J;

    /* renamed from: K */
    private String f91088K;

    /* renamed from: L */
    private String f91089L;

    /* renamed from: M */
    public int f91090M;

    public C17984n0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91079B = "";
        this.f91080C = 0;
        this.f91081D = new ArrayList();
        this.f91082E = "";
        this.f91083F = "";
        this.f91090M = -1;
        m95631h();
    }

    /* renamed from: h */
    private void m95631h() {
        C7907e c7907e;
        C7907e c7907e2;
        C7907e c7907e3;
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                this.f91079B = jSONObject.optString("header");
                this.f91080C = jSONObject.optInt("layoutType");
                String optString = jSONObject.optString("notifyTxt");
                this.f91082E = optString;
                if (optString.equals("null")) {
                    this.f91082E = "";
                }
                String optString2 = jSONObject.optString("previewTxt");
                this.f91083F = optString2;
                if (optString2.equals("null")) {
                    this.f91083F = "";
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("actions");
                if (optJSONArray != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        this.f91081D.add(new C25301c(optJSONArray.getJSONObject(i11)));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("titleInfo");
                C7907e c7907e4 = null;
                if (optJSONArray2 != null) {
                    c7907e = new C7907e(optJSONArray2);
                } else {
                    c7907e = null;
                }
                this.f91084G = c7907e;
                JSONArray optJSONArray3 = jSONObject.optJSONArray("descInfo");
                if (optJSONArray3 != null) {
                    c7907e2 = new C7907e(optJSONArray3);
                } else {
                    c7907e2 = null;
                }
                this.f91085H = c7907e2;
                JSONArray optJSONArray4 = jSONObject.optJSONArray("previewInfo");
                if (optJSONArray4 != null) {
                    c7907e3 = new C7907e(optJSONArray4);
                } else {
                    c7907e3 = null;
                }
                this.f91086I = c7907e3;
                JSONArray optJSONArray5 = jSONObject.optJSONArray("notifyInfo");
                if (optJSONArray5 != null) {
                    c7907e4 = new C7907e(optJSONArray5);
                }
                this.f91087J = c7907e4;
                if (jSONObject.has("ecard_msg_info")) {
                    this.f91090M = jSONObject.optInt("ecard_msg_info");
                }
            }
            this.f91088K = this.f91011p;
            this.f91089L = this.f91015t;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g */
    public void m95632g(String str) {
        C7907e c7907e = this.f91084G;
        if (c7907e != null) {
            this.f91011p = AbstractC19620d0.m102678O(c7907e.m40857g(), this.f91088K, str);
        }
        C7907e c7907e2 = this.f91085H;
        if (c7907e2 != null) {
            this.f91015t = AbstractC19620d0.m102678O(c7907e2.m40857g(), this.f91089L, str);
        }
    }

    public C17984n0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91079B = "";
        this.f91080C = 0;
        this.f91081D = new ArrayList();
        this.f91082E = "";
        this.f91083F = "";
        this.f91090M = -1;
        m95631h();
    }
}
