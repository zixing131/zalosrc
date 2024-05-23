package p268ji;

import ag0.C0815e1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p361nb.C23667x;
import p716zh.C31932g9;
import qm0.AbstractC25332a0;

/* renamed from: ji.q */
/* loaded from: classes3.dex */
public final class C21271q {
    public static final a Companion = new a(null);

    /* renamed from: ji.q$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21271q m110170a() {
            return b.f103634a.m110171a();
        }
    }

    /* renamed from: ji.q$b */
    /* loaded from: classes3.dex */
    private static final class b {

        /* renamed from: a */
        public static final b f103634a = new b();

        /* renamed from: b */
        private static final C21271q f103635b = new C21271q(null);

        private b() {
        }

        /* renamed from: a */
        public final C21271q m110171a() {
            return f103635b;
        }
    }

    private C21271q() {
    }

    public /* synthetic */ C21271q(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final void m110164a(C31932g9 c31932g9) {
        Object m131215o0;
        String str;
        List m131179G0;
        AbstractC19074t.m100208f(c31932g9, "trackingInfo");
        try {
            Set keySet = c31932g9.m153448e().keySet();
            AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
            m131215o0 = AbstractC25332a0.m131215o0(keySet);
            AbstractC19074t.m100207e(m131215o0, "last(...)");
            String str2 = (String) m131215o0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param1", str2);
            List list = (List) c31932g9.m153448e().get(str2);
            if (list != null) {
                m131179G0 = AbstractC25332a0.m131179G0(list, 30);
                if (m131179G0 != null) {
                    str = AbstractC25332a0.m131214n0(m131179G0, ",", null, null, 0, null, null, 62, null);
                    if (str == null) {
                    }
                    jSONObject.put("param2", str);
                    C0815e1.m2075D().m2109g(new C23667x(8, 0, 15, jSONObject));
                }
            }
            str = "";
            jSONObject.put("param2", str);
            C0815e1.m2075D().m2109g(new C23667x(8, 0, 15, jSONObject));
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final void m110165b(C31932g9 c31932g9) {
        AbstractC19074t.m100208f(c31932g9, "trackingInfo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param1", "time_close: " + c31932g9.m153445b());
            C0815e1.m2075D().m2109g(new C23667x(8, 0, 12, jSONObject));
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m110166c(C31932g9 c31932g9) {
        AbstractC19074t.m100208f(c31932g9, "trackingInfo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param1", "time_open: " + c31932g9.m153447d());
            C0815e1.m2075D().m2109g(new C23667x(8, 0, 12, jSONObject));
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    public final void m110167d(C31932g9 c31932g9) {
        AbstractC19074t.m100208f(c31932g9, "trackingInfo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param1", c31932g9.m153446c());
            C0815e1.m2075D().m2109g(new C23667x(8, 0, 13, jSONObject));
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public final void m110168e(C31932g9 c31932g9) {
        AbstractC19074t.m100208f(c31932g9, "trackingInfo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param1", c31932g9.m153446c());
            jSONObject.put("param2", c31932g9.m153450g());
            jSONObject.put("param3", c31932g9.m153449f());
            C0815e1.m2075D().m2109g(new C23667x(8, 0, 16, jSONObject));
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[Catch: JSONException -> 0x0073, TryCatch #0 {JSONException -> 0x0073, blocks: (B:3:0x0005, B:4:0x0018, B:6:0x001e, B:9:0x0030, B:12:0x003a, B:14:0x0052, B:16:0x005f, B:19:0x0077, B:21:0x0089, B:22:0x008f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m110169f(C31932g9 c31932g9) {
        String str;
        List list;
        int i11;
        List m131179G0;
        AbstractC19074t.m100208f(c31932g9, "trackingInfo");
        try {
            Set<String> keySet = c31932g9.m153448e().keySet();
            AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
            for (String str2 : keySet) {
                if (((List) c31932g9.m153448e().get(str2)) != null && (!r2.isEmpty())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("param1", str2);
                    List list2 = (List) c31932g9.m153448e().get(str2);
                    if (list2 != null) {
                        AbstractC19074t.m100205c(list2);
                        m131179G0 = AbstractC25332a0.m131179G0(list2, 30);
                        if (m131179G0 != null) {
                            str = AbstractC25332a0.m131214n0(m131179G0, ",", null, null, 0, null, null, 62, null);
                            if (str == null) {
                            }
                            jSONObject.put("param2", str);
                            list = (List) c31932g9.m153448e().get(str2);
                            if (list == null) {
                                i11 = list.size();
                            } else {
                                i11 = 0;
                            }
                            jSONObject.put("param3", i11);
                            C0815e1.m2075D().m2109g(new C23667x(8, 0, 14, jSONObject));
                        }
                    }
                    str = "";
                    jSONObject.put("param2", str);
                    list = (List) c31932g9.m153448e().get(str2);
                    if (list == null) {
                    }
                    jSONObject.put("param3", i11);
                    C0815e1.m2075D().m2109g(new C23667x(8, 0, 14, jSONObject));
                }
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
