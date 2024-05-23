package p715zg;

import am.C0903c0;
import am.C0923m;
import com.zing.zalo.control.WebAppInterface;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import pm0.C24848g0;

/* renamed from: zg.d */
/* loaded from: classes3.dex */
public final class C31830d extends AbstractC31827a {
    public static final a Companion = new a(null);

    /* renamed from: zg.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31830d(String str, String str2, InterfaceC25792a.c cVar) {
        super(str, str2, cVar);
        AbstractC19074t.m100208f(str, "action");
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        JSONObject m131571b = AbstractC25384a.m131571b(m152908f());
        if (m131571b == null) {
            return;
        }
        String optString = m131571b.optString("miniAppId", "");
        if (optString != null && optString.length() != 0) {
            JSONObject m152909g = m152909g();
            if (m152909g != null && m152909g.optBoolean("isGranted", false)) {
                AbstractC19074t.m100205c(optString);
                m152911i(optString);
                return;
            } else {
                InterfaceC25792a.c m152910h = m152910h();
                if (m152910h != null) {
                    InterfaceC25792a.c.a.m132932a(m152910h, m152905b(WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST, "The user rejected! (dismissed the bottom sheet)", m152907e()), null, 2, null);
                    return;
                }
                return;
            }
        }
        InterfaceC25792a.c m152910h2 = m152910h();
        if (m152910h2 != null) {
            InterfaceC25792a.c.a.m132932a(m152910h2, m152905b(-1, "MiniAppId is invalid", m152907e()), null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:            if (r4 == null) goto L21;     */
    @Override // p715zg.AbstractC31827a
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo152912j(String str) {
        int i11;
        C0903c0 c0903c0;
        C0903c0 c0903c02;
        AbstractC19074t.m100208f(str, "payloadData");
        JSONObject m152909g = m152909g();
        if (m152909g != null) {
            try {
                JSONArray jSONArray = m152909g.getJSONArray("permissions");
                String optString = m152909g.optString("miniAppId", "");
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() > 0 && optString != null && optString.length() != 0) {
                    int length = jSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            AbstractC19074t.m100207e(jSONObject, "getJSONObject(...)");
                            String optString2 = jSONObject.optString("id", "");
                            if (jSONObject.optBoolean("isGranted", false)) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            try {
                                C0923m m2889a = C0923m.Companion.m2889a();
                                if (m2889a != null) {
                                    AbstractC19074t.m100205c(optString);
                                    AbstractC19074t.m100205c(optString2);
                                    c0903c02 = m2889a.m2886d(optString, optString2);
                                }
                                AbstractC19074t.m100205c(optString);
                                AbstractC19074t.m100205c(optString2);
                                c0903c0 = new C0903c0(optString, optString2, i11, 0, 8, null);
                            } catch (Exception unused) {
                                AbstractC19074t.m100205c(optString);
                                AbstractC19074t.m100205c(optString2);
                                c0903c0 = new C0903c0(optString, optString2, i11, 0, 8, null);
                            }
                            c0903c02 = c0903c0;
                            c0903c02.m2794d(i11);
                            arrayList.add(c0903c02);
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    AbstractC20110a.f98889a.mo104548a("Update permission list successful", new Object[0]);
                    try {
                        C0923m m2889a2 = C0923m.Companion.m2889a();
                        if (m2889a2 != null) {
                            AbstractC19074t.m100205c(optString);
                            m2889a2.m2888h(optString, arrayList, false);
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            return;
                        }
                        return;
                    } catch (Exception unused2) {
                        C24848g0 c24848g02 = C24848g0.f119245a;
                        return;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("Permission list is empty", new Object[0]);
                C24848g0 c24848g03 = C24848g0.f119245a;
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                C24848g0 c24848g04 = C24848g0.f119245a;
            }
        }
    }
}
