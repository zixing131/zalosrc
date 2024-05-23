package p716zh;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import me0.AbstractC23136l9;
import org.json.JSONException;
import org.json.JSONObject;
import p133ek.AbstractC18458a;

/* renamed from: zh.g */
/* loaded from: classes3.dex */
public class C31922g {

    /* renamed from: a */
    public int f146640a;

    /* renamed from: b */
    private String f146641b;

    /* renamed from: c */
    private boolean f146642c;

    /* renamed from: d */
    private String f146643d;

    /* renamed from: e */
    private String f146644e;

    /* renamed from: f */
    private String f146645f;

    /* renamed from: g */
    private String f146646g;

    /* renamed from: h */
    private String f146647h;

    /* renamed from: i */
    private boolean f146648i;

    /* renamed from: j */
    private JSONObject f146649j;

    /* renamed from: k */
    private C32005l7 f146650k;

    /* renamed from: l */
    private String f146651l;

    /* renamed from: m */
    private String f146652m;

    public C31922g(int i11) {
        this.f146640a = i11;
    }

    /* renamed from: a */
    private void m153379a() {
        if (!this.f146642c) {
            this.f146642c = true;
            if (!TextUtils.isEmpty(this.f146641b)) {
                try {
                    JSONObject jSONObject = new JSONObject(this.f146641b);
                    this.f146644e = jSONObject.optString("desc_vi");
                    this.f146643d = jSONObject.optString("desc_en");
                    this.f146645f = jSONObject.optString("desc_friend_en");
                    this.f146646g = jSONObject.optString("desc_friend_vi");
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private void m153380b() {
        try {
            if (!this.f146648i) {
                this.f146648i = true;
                if (!TextUtils.isEmpty(this.f146647h)) {
                    JSONObject jSONObject = new JSONObject(this.f146647h);
                    this.f146649j = jSONObject;
                    String optString = jSONObject.optString("desc_vi");
                    this.f146652m = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.f146652m = AbstractC23136l9.m118743r0(AbstractC8020f0.str_be_careful_when_chatting_with_stranger);
                    }
                    String optString2 = this.f146649j.optString("desc_en");
                    this.f146651l = optString2;
                    if (TextUtils.isEmpty(optString2)) {
                        this.f146651l = AbstractC23136l9.m118743r0(AbstractC8020f0.str_be_careful_when_chatting_with_stranger);
                    }
                    JSONObject optJSONObject = this.f146649j.optJSONObject("action");
                    if (optJSONObject != null) {
                        this.f146650k = new C32005l7(optJSONObject);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static C31922g m153381c() {
        return new C31922g(0);
    }

    /* renamed from: d */
    public int m153382d() {
        return this.f146640a;
    }

    /* renamed from: e */
    public String m153383e(boolean z11) {
        m153379a();
        if (TextUtils.equals(AbstractC18458a.f93019a, "vi")) {
            if (z11) {
                return this.f146646g;
            }
            return this.f146644e;
        }
        if (z11) {
            return this.f146645f;
        }
        return this.f146643d;
    }

    /* renamed from: f */
    public JSONObject m153384f() {
        m153380b();
        return this.f146649j;
    }

    /* renamed from: g */
    public C32005l7 m153385g() {
        m153380b();
        return this.f146650k;
    }

    /* renamed from: h */
    public String m153386h() {
        m153380b();
        if (TextUtils.equals(AbstractC18458a.f93019a, "vi")) {
            return this.f146652m;
        }
        return this.f146651l;
    }

    /* renamed from: i */
    public boolean m153387i() {
        int i11 = this.f146640a;
        return i11 == 2 || i11 == 1 || i11 == 0;
    }

    public C31922g(JSONObject jSONObject) {
        this.f146640a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f146641b = jSONObject.optString("banner_warning");
        this.f146647h = jSONObject.optString("msg_info_warning");
    }
}
