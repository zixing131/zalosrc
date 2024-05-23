package of0;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import lf0.AbstractC22474d;
import lf0.C22472b;
import lf0.C22473c;
import lf0.InterfaceC22471a;
import org.json.JSONArray;
import org.json.JSONObject;
import p023av.EnumC2383a;

/* renamed from: of0.a */
/* loaded from: classes5.dex */
public final class C24248a implements InterfaceC22471a {

    /* renamed from: a */
    private final C22472b f117131a;

    /* renamed from: b */
    private final C22473c f117132b;

    /* renamed from: c */
    private final JSONObject f117133c;

    /* renamed from: d */
    private final String f117134d;

    /* renamed from: e */
    private final EnumC2383a f117135e;

    public C24248a(C22472b c22472b, C22473c c22473c, JSONObject jSONObject, String str, EnumC2383a enumC2383a) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(c22473c, "mediaHelper");
        AbstractC19074t.m100208f(jSONObject, "data");
        AbstractC19074t.m100208f(enumC2383a, "compressLevel");
        this.f117131a = c22472b;
        this.f117132b = c22473c;
        this.f117133c = jSONObject;
        this.f117134d = str;
        this.f117135e = enumC2383a;
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        JSONArray jSONArray;
        JSONObject optJSONObject = this.f117133c.optJSONObject("data");
        if (optJSONObject != null) {
            jSONArray = optJSONObject.optJSONArray("path");
        } else {
            jSONArray = null;
        }
        if (jSONArray != null && jSONArray.length() > 0) {
            C22473c c22473c = this.f117132b;
            C22472b c22472b = this.f117131a;
            List m116211f = c22473c.m116211f(c22472b, c22472b.m116189l(), jSONArray, this.f117135e);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = m116211f.iterator();
            while (it.hasNext()) {
                jSONArray2.put(AbstractC22474d.m116213a((String) it.next(), this.f117131a.m116194s()));
            }
            this.f117131a.m116197w(new JSONObject().put("path", jSONArray2).put("result_content", new JSONArray()), this.f117134d);
        }
    }
}
