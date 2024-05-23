package p692ys;

import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.C31887d9;
import p716zh.C32119t6;
import vg.AbstractC28207v1;

/* renamed from: ys.a */
/* loaded from: classes4.dex */
public class C31070a {

    /* renamed from: a */
    public String f143228a;

    /* renamed from: b */
    public String f143229b;

    /* renamed from: c */
    public String f143230c;

    /* renamed from: d */
    public String f143231d;

    /* renamed from: e */
    public String f143232e;

    /* renamed from: f */
    public String f143233f;

    /* renamed from: g */
    public String f143234g;

    /* renamed from: h */
    public String f143235h;

    /* renamed from: i */
    public String f143236i;

    /* renamed from: j */
    long f143237j;

    /* renamed from: k */
    long f143238k;

    /* renamed from: l */
    public ArrayList f143239l;

    /* renamed from: m */
    public int f143240m;

    /* renamed from: n */
    public String f143241n;

    /* renamed from: o */
    boolean f143242o;

    /* renamed from: p */
    public int f143243p;

    public C31070a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        this.f143228a = "";
        this.f143229b = "";
        this.f143230c = "";
        this.f143231d = "";
        this.f143232e = "";
        this.f143233f = "";
        this.f143234g = "";
        this.f143235h = "";
        this.f143236i = "";
        this.f143239l = new ArrayList();
        this.f143240m = 0;
        this.f143241n = "";
        this.f143242o = false;
        this.f143243p = -1;
        try {
            this.f143228a = jSONObject.optString("id");
            this.f143229b = jSONObject.optString("avt");
            this.f143230c = jSONObject.optString("title");
            this.f143231d = jSONObject.optString("subTitle");
            this.f143241n = jSONObject.optString("thumbUrl");
            JSONObject optJSONObject = jSONObject.optJSONObject("actionBackground");
            if (optJSONObject != null) {
                this.f143232e = optJSONObject.optString("data");
                this.f143233f = optJSONObject.optString("act");
            }
            this.f143237j = jSONObject.optLong("startTime") * 1000;
            this.f143238k = jSONObject.optLong("expiredTime") * 1000;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("actionButton");
            if (optJSONObject2 != null) {
                this.f143236i = optJSONObject2.optString("label");
                this.f143234g = optJSONObject2.optString("data");
                String optString = optJSONObject2.optString("act");
                this.f143235h = optString;
                if (optString.equals("action.open.creategroup")) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(this.f143234g);
                        JSONObject optJSONObject3 = jSONObject2.optJSONObject("suggestGroupMember");
                        if (optJSONObject3 != null && (optJSONArray = optJSONObject3.optJSONArray("memberList")) != null) {
                            this.f143239l = new ArrayList();
                            this.f143240m = optJSONArray.length();
                            for (int i11 = 0; i11 < this.f143240m; i11++) {
                                this.f143239l.add(new InviteContactProfile(optJSONArray.getJSONObject(i11)));
                            }
                        }
                        JSONObject optJSONObject4 = jSONObject2.optJSONObject("contentFirst");
                        if (optJSONObject4 != null) {
                            this.f143243p = optJSONObject4.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("data");
                            if (optJSONObject5.has("completionType")) {
                                C31887d9 m155014e = C32119t6.m155009c().m155014e(optJSONObject5.optInt("completionType"));
                                if (m155014e != null) {
                                    if (m155014e.m153221k() == 0 || m155014e.m153221k() == 2) {
                                        this.f143242o = true;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            this.f143242o = true;
                            return;
                        }
                        this.f143242o = true;
                        return;
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        return;
                    }
                }
                if (this.f143235h.equals("action.open.groupnearby")) {
                    this.f143242o = true;
                } else if (this.f143235h.equals("action.open.calendar")) {
                    this.f143242o = true;
                } else {
                    this.f143242o = AbstractC28207v1.m141992i1(this.f143235h);
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: a */
    public boolean m150973a() {
        boolean z11;
        if (this.f143237j > 0) {
            long mo124310e = C23793c.m124316k().mo124310e();
            long j11 = this.f143237j;
            if (mo124310e <= j11 || mo124310e >= j11 + this.f143238k) {
                z11 = false;
                if (!this.f143242o && z11) {
                    return true;
                }
            }
        }
        z11 = true;
        return !this.f143242o ? false : false;
    }
}
