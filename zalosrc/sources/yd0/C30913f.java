package yd0;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.C17244x0;
import dj.C17945a0;
import dj.C17967h1;
import fn0.AbstractC19074t;
import java.util.Locale;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p185gc.AbstractC19378b;
import p185gc.AbstractC19383g;
import p348mi.AbstractC23306f;
import p623ww.C29251a;
import p623ww.C29257g;
import pm0.C24848g0;
import th.C26680a;
import xd0.C29599o;

/* renamed from: yd0.f */
/* loaded from: classes4.dex */
public final class C30913f extends AbstractC19383g {

    /* renamed from: yd0.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f142570a;

        /* renamed from: b */
        private final String f142571b;

        /* renamed from: c */
        private final String f142572c;

        /* renamed from: d */
        private final String f142573d;

        public a(String str, String str2, String str3, String str4) {
            AbstractC19074t.m100208f(str, "bin");
            AbstractC19074t.m100208f(str2, "bankName");
            AbstractC19074t.m100208f(str3, "accountNumber");
            AbstractC19074t.m100208f(str4, "accountName");
            this.f142570a = str;
            this.f142571b = str2;
            this.f142572c = str3;
            this.f142573d = str4;
        }

        /* renamed from: a */
        public final String m150199a() {
            return this.f142573d;
        }

        /* renamed from: b */
        public final String m150200b() {
            return this.f142572c;
        }

        /* renamed from: c */
        public final String m150201c() {
            return this.f142570a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f142570a, aVar.f142570a) && AbstractC19074t.m100204b(this.f142571b, aVar.f142571b) && AbstractC19074t.m100204b(this.f142572c, aVar.f142572c) && AbstractC19074t.m100204b(this.f142573d, aVar.f142573d);
        }

        public int hashCode() {
            return (((((this.f142570a.hashCode() * 31) + this.f142571b.hashCode()) * 31) + this.f142572c.hashCode()) * 31) + this.f142573d.hashCode();
        }

        public String toString() {
            return "BankTransferInfo(bin=" + this.f142570a + ", bankName=" + this.f142571b + ", accountNumber=" + this.f142572c + ", accountName=" + this.f142573d + ")";
        }
    }

    /* renamed from: yd0.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f142574a;

        /* renamed from: b */
        private final String f142575b;

        /* renamed from: c */
        private final a f142576c;

        public b(String str, String str2, a aVar) {
            AbstractC19074t.m100208f(str, "senderUid");
            AbstractC19074t.m100208f(str2, "ownerId");
            AbstractC19074t.m100208f(aVar, "bankTransferInfo");
            this.f142574a = str;
            this.f142575b = str2;
            this.f142576c = aVar;
        }

        /* renamed from: a */
        public final a m150202a() {
            return this.f142576c;
        }

        /* renamed from: b */
        public final String m150203b() {
            return this.f142575b;
        }

        /* renamed from: c */
        public final String m150204c() {
            return this.f142574a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f142574a, bVar.f142574a) && AbstractC19074t.m100204b(this.f142575b, bVar.f142575b) && AbstractC19074t.m100204b(this.f142576c, bVar.f142576c);
        }

        public int hashCode() {
            return (((this.f142574a.hashCode() * 31) + this.f142575b.hashCode()) * 31) + this.f142576c.hashCode();
        }

        public String toString() {
            return "Params(senderUid=" + this.f142574a + ", ownerId=" + this.f142575b + ", bankTransferInfo=" + this.f142576c + ")";
        }
    }

    /* renamed from: c */
    private final String m150195c(String str, a aVar, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("senderId", str);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("bankInfo", jSONObject);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("number", aVar.m150200b());
        jSONObject4.put("userName", aVar.m150199a());
        C24848g0 c24848g0 = C24848g0.f119245a;
        jSONObject3.put("accountInfo", jSONObject4);
        jSONObject3.put("qrContent", str2);
        jSONObject2.put("cardInfo", jSONObject3);
        String jSONObject5 = jSONObject2.toString();
        AbstractC19074t.m100207e(jSONObject5, "toString(...)");
        return jSONObject5;
    }

    /* renamed from: d */
    private final JSONObject m150196d(String str, a aVar) {
        JSONObject m150197e;
        try {
            String m137031i = C26680a.f126349a.m137031i();
            if (m137031i.length() == 0) {
                return null;
            }
            String m146045d = C29251a.f135466a.m146045d(aVar.m150201c(), aVar.m150200b());
            if (m146045d.length() == 0 || (m150197e = m150197e(aVar.m150201c())) == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(m137031i).getJSONObject("zinstantdata");
            jSONObject.put("bundle_data", m150195c(str, aVar, m146045d, m150197e));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bubbleItem", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("vi", "[" + AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.str_bank_card_preview_text) + "]");
            jSONObject4.put("en", "[" + AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.str_bank_card_preview_text) + "]");
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject3.put("msg", jSONObject4);
            jSONObject2.put("customMsg", jSONObject3);
            jSONObject2.put("canUndo", 1);
            jSONObject2.put("canPin", 0);
            jSONObject2.put("layoutType", 2);
            jSONObject2.put("maxWidth", 1.0d);
            jSONObject2.put("disableCustomCache", 1);
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: e */
    private final JSONObject m150197e(String str) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        JSONObject m146120i = C29257g.f135528a.m146120i(str);
        if (m146120i == null) {
            return null;
        }
        String optString6 = m146120i.optString("bin");
        if (optString6 != null && optString6.length() != 0 && (optString = m146120i.optString("thumb")) != null && optString.length() != 0 && (optString2 = m146120i.optString("name")) != null && optString2.length() != 0 && (optString3 = m146120i.optString("shortName")) != null && optString3.length() != 0 && (optString4 = m146120i.optString("key")) != null && optString4.length() != 0 && (optString5 = m146120i.optString("bgUrl")) != null && optString5.length() != 0) {
            return m146120i;
        }
        throw new Exception("Bank info is invalid");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        JSONObject m150196d = m150196d(bVar.m150204c(), bVar.m150202a());
        if (m150196d == null) {
            return;
        }
        try {
            m150196d.put("featureType", 2);
            JSONObject optJSONObject = m150196d.optJSONObject("bubbleItem");
            if (optJSONObject != null) {
                AbstractC19074t.m100205c(optJSONObject);
                m150196d.put("zinstantConfig", new C17244x0(2, optJSONObject, C30914g.f142577a.m150205a()).m92066d());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", m150196d);
            jSONObject.put("action", "zinstant.bankcard");
            C17945a0 m95365a = new C17945a0.w(MessageId.Companion.m41064b(AbstractC23306f.m120599M0().m103086b(), "", bVar.m150203b(), bVar.m150204c()), 24).m95368d(new C17967h1(jSONObject)).m95365a();
            AbstractC19074t.m100207e(m95365a, "build(...)");
            m95365a.m94951M9();
            C29599o m120694n1 = AbstractC23306f.m120694n1();
            AbstractC19074t.m100207e(m120694n1, "provideSendMessageUseCase(...)");
            AbstractC19378b.m101499c(m120694n1, new C29599o.a(bVar.m150203b(), m95365a, false, null, 12, null), null, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
