package p299kj;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p325lj.C22498e;
import p325lj.C22499f;
import p348mi.AbstractC23309i;
import sj.C26275a;

/* renamed from: kj.b */
/* loaded from: classes3.dex */
public final class C21743b implements InterfaceC21742a {
    @Override // p299kj.InterfaceC21742a
    /* renamed from: a */
    public void mo112187a(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC0924m0.m4054ni(str);
    }

    @Override // p299kj.InterfaceC21742a
    /* renamed from: b */
    public C22499f mo112188b() {
        String m3421S7 = AbstractC0924m0.m3421S7();
        AbstractC19074t.m100205c(m3421S7);
        if (m3421S7.length() > 0) {
            return C22499f.Companion.m116340a(m3421S7);
        }
        return null;
    }

    @Override // p299kj.InterfaceC21742a
    /* renamed from: c */
    public Map mo112189c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String m4275v1 = AbstractC0924m0.m4275v1();
            AbstractC19074t.m100205c(m4275v1);
            if (m4275v1.length() > 0) {
                JSONArray jSONArray = new JSONArray(m4275v1);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    AbstractC19074t.m100205c(jSONObject);
                    C26275a c26275a = new C26275a(jSONObject);
                    linkedHashMap.put(Integer.valueOf(c26275a.m135171g()), c26275a);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return linkedHashMap;
    }

    @Override // p299kj.InterfaceC21742a
    /* renamed from: d */
    public void mo112190d(String str) {
        AbstractC19074t.m100208f(str, "jsonData");
        AbstractC23309i.m121473Tx(str);
    }

    @Override // p299kj.InterfaceC21742a
    /* renamed from: e */
    public C22498e mo112191e() {
        String m120860Dc = AbstractC23309i.m120860Dc();
        AbstractC19074t.m100205c(m120860Dc);
        if (m120860Dc.length() > 0) {
            return new C22498e(new JSONObject(m120860Dc));
        }
        return null;
    }

    @Override // p299kj.InterfaceC21742a
    /* renamed from: f */
    public void mo112192f(C22499f c22499f) {
        String str;
        if (c22499f == null || (str = c22499f.toString()) == null) {
            str = "";
        }
        AbstractC0924m0.m3643Zq(str);
    }
}
