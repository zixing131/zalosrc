package dj;

import android.text.TextUtils;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p716zh.C32005l7;
import p716zh.C32118t5;

/* renamed from: dj.u0 */
/* loaded from: classes3.dex */
public class C18005u0 extends AbstractC18007v0 {

    /* renamed from: J */
    public boolean f91187J;

    /* renamed from: dj.u0$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final List f91188a = new ArrayList();

        /* renamed from: b */
        private ArrayList f91189b = new ArrayList();

        /* renamed from: c */
        private ArrayList f91190c = new ArrayList();

        /* renamed from: d */
        private C7907e f91191d;

        /* renamed from: e */
        private String f91192e;

        /* renamed from: f */
        private int f91193f;

        /* renamed from: g */
        private int f91194g;

        /* renamed from: h */
        private String f91195h;

        /* renamed from: i */
        private long f91196i;

        /* renamed from: j */
        private ArrayList f91197j;

        /* renamed from: k */
        private String f91198k;

        /* renamed from: a */
        public a m95719a(String str, String str2, String str3) {
            this.f91188a.add(new C32005l7(str, str2, str3, AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.cM1)));
            return this;
        }

        /* renamed from: b */
        public a m95720b(C32005l7 c32005l7) {
            this.f91188a.add(c32005l7);
            return this;
        }

        /* renamed from: c */
        public C18005u0 m95721c() {
            C18005u0 c18005u0;
            JSONException e11;
            try {
                c18005u0 = new C18005u0();
            } catch (JSONException e12) {
                c18005u0 = null;
                e11 = e12;
            }
            try {
                c18005u0.f91016u = "msginfo.actionlist";
                c18005u0.f91202D = this.f91188a;
                c18005u0.f91201C = this.f91191d;
                c18005u0.f91203E = this.f91189b;
                c18005u0.f91204F = this.f91190c;
                c18005u0.f91205G = this.f91192e;
                c18005u0.f91206H = this.f91193f;
                c18005u0.f91207I = this.f91194g;
                c18005u0.f91200B = this.f91197j;
                JSONObject mo95717g = c18005u0.mo95717g();
                if (!TextUtils.isEmpty(this.f91198k)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("vi", this.f91198k);
                    jSONObject.put("en", this.f91198k);
                    jSONObject.put("my", this.f91198k);
                    mo95717g.put("msg", jSONObject);
                }
                c18005u0.f91017v = mo95717g.toString();
            } catch (JSONException e13) {
                e11 = e13;
                e11.printStackTrace();
                return c18005u0;
            }
            return c18005u0;
        }

        /* renamed from: d */
        public C18011x0 m95722d(String str) {
            C18011x0 c18011x0 = new C18011x0();
            c18011x0.f91016u = str;
            c18011x0.f91202D = this.f91188a;
            c18011x0.f91201C = this.f91191d;
            c18011x0.f91203E = this.f91189b;
            c18011x0.f91204F = this.f91190c;
            c18011x0.f91205G = this.f91192e;
            c18011x0.f91206H = this.f91193f;
            c18011x0.f91207I = this.f91194g;
            c18011x0.f91248K = this.f91195h;
            c18011x0.f91249L = this.f91196i;
            c18011x0.f91017v = c18011x0.mo95717g().toString();
            return c18011x0;
        }

        /* renamed from: e */
        public a m95723e(ArrayList arrayList) {
            this.f91190c = arrayList;
            return this;
        }

        /* renamed from: f */
        public a m95724f(ArrayList arrayList) {
            this.f91189b = arrayList;
            return this;
        }

        /* renamed from: g */
        public a m95725g(C7907e c7907e) {
            this.f91191d = c7907e;
            return this;
        }

        /* renamed from: h */
        public a m95726h(ArrayList arrayList) {
            this.f91197j = arrayList;
            return this;
        }

        /* renamed from: i */
        public a m95727i(int i11) {
            this.f91194g = i11;
            return this;
        }

        /* renamed from: j */
        public a m95728j(String str) {
            this.f91192e = str;
            return this;
        }

        /* renamed from: k */
        public a m95729k(String str, long j11) {
            this.f91195h = str;
            this.f91196i = j11;
            return this;
        }

        /* renamed from: l */
        public a m95730l(String str) {
            this.f91198k = str;
            return this;
        }

        /* renamed from: m */
        public a m95731m(int i11) {
            this.f91193f = i11;
            return this;
        }
    }

    public C18005u0() {
        this.f91187J = false;
    }

    /* renamed from: h */
    public static int m95716h(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 7 ? i11 != 9 ? i11 != 14 ? i11 != 15 ? AbstractC16803z.icon : AbstractC16803z.ic_e2ee_msg_info : AbstractC16803z.chat_tip_icon_remove_name : AbstractC16803z.chat_tip_icon_poll : AbstractC16803z.chat_tip_icon_key_del : AbstractC16803z.chat_tip_icon_key : AbstractC16803z.chat_tip_icon_rename : AbstractC16803z.chat_tip_icon_theme;
    }

    /* renamed from: g */
    public JSONObject mo95717g() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f91202D != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f91202D.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C32005l7) it.next()).m154299a());
                }
                jSONObject.put("actions", jSONArray);
            }
            C7907e c7907e = this.f91201C;
            if (c7907e != null) {
                jSONObject.put("highLights", c7907e.m40862m());
            }
            if (this.f91200B != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < this.f91200B.size(); i11++) {
                    jSONArray2.put(((C32118t5) this.f91200B.get(i11)).m155008a());
                }
                jSONObject.put("highLightsV2", jSONArray2);
            }
            if (this.f91203E != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it2 = this.f91203E.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put((String) it2.next());
                }
                jSONObject.put("avatarUrl", jSONArray3);
            }
            if (this.f91204F != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator it3 = this.f91204F.iterator();
                while (it3.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it3.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("uid", contactProfile.f42434r);
                    jSONObject2.put("dpn", contactProfile.f42437s);
                    jSONObject2.put("avt", contactProfile.f42446v);
                    jSONArray4.put(jSONObject2);
                }
                jSONObject.put("simpleInfos", jSONArray4);
            }
            jSONObject.put("totalUpdateMem", this.f91206H);
            jSONObject.put("iconUrl", this.f91205G);
            jSONObject.put("iconType", this.f91207I);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void mo95718i() {
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                JSONArray optJSONArray = jSONObject.optJSONArray("actions");
                boolean z11 = false;
                if (optJSONArray != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        this.f91202D.add(new C32005l7(optJSONArray.getJSONObject(i11)));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("highLights");
                if (optJSONArray2 != null) {
                    this.f91201C = new C7907e(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("avatarUrl");
                if (optJSONArray3 != null) {
                    for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                        this.f91203E.add(optJSONArray3.getString(i12));
                    }
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("simpleInfos");
                if (optJSONArray4 != null) {
                    for (int i13 = 0; i13 < optJSONArray4.length(); i13++) {
                        JSONObject jSONObject2 = optJSONArray4.getJSONObject(i13);
                        String optString = jSONObject2.optString("uid");
                        String optString2 = jSONObject2.optString("dpn");
                        String optString3 = jSONObject2.optString("avt");
                        ContactProfile contactProfile = new ContactProfile(optString);
                        contactProfile.f42437s = optString2;
                        contactProfile.f42446v = optString3;
                        this.f91204F.add(contactProfile);
                    }
                }
                this.f91205G = jSONObject.optString("iconUrl");
                this.f91206H = jSONObject.optInt("totalUpdateMem");
                this.f91207I = jSONObject.optInt("iconType");
                if (jSONObject.has("isE2eeEcardMsgInfo")) {
                    if (jSONObject.optInt("isE2eeEcardMsgInfo", 0) == 1) {
                        z11 = true;
                    }
                    this.f91187J = z11;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C18005u0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91187J = false;
        mo95718i();
    }

    public C18005u0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91187J = false;
        mo95718i();
    }
}
