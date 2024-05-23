package nz;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import nz.AbstractC23968e;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: nz.a */
/* loaded from: classes4.dex */
public final class C23964a {

    /* renamed from: b */
    private static volatile boolean f115976b;

    /* renamed from: f */
    private static C23966c f115980f;

    /* renamed from: a */
    public static final C23964a f115975a = new C23964a();

    /* renamed from: c */
    private static final List f115977c = new ArrayList();

    /* renamed from: d */
    private static final HashMap f115978d = new HashMap();

    /* renamed from: e */
    private static final HashMap f115979e = new HashMap();

    private C23964a() {
    }

    /* renamed from: a */
    private final String m125395a() {
        return "{\"report.reason\":[{\"id\":1,\"vi\":\"Nội dung nhạy cảm\",\"en\":\"Sensitive\"},{\"id\":2,\"vi\":\"Lừa đảo\",\"en\":\"Fraud\"},{\"id\":3,\"vi\":\"Làm phiền\",\"en\":\"Annoy\"},{\"id\":0,\"vi\":\"Lý do khác\",\"en\":\"Other\"}],\"report.object\":[{\"name\":\"person\",\"reasons\":[{\"id\":1},{\"id\":2},{\"id\":3},{\"id\":0}]}]}";
    }

    /* renamed from: b */
    private final synchronized C23966c m125396b() {
        if (f115980f == null) {
            try {
                m125398j(new JSONObject(m125395a()), true);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return f115980f;
    }

    /* renamed from: h */
    public static /* synthetic */ void m125397h(C23964a c23964a, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c23964a.m125404g(jSONObject, z11);
    }

    /* renamed from: j */
    private final void m125398j(JSONObject jSONObject, boolean z11) {
        JSONArray optJSONArray = jSONObject.optJSONArray("report.object");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    C23966c c23966c = new C23966c(optJSONObject, f115979e);
                    HashMap hashMap = f115978d;
                    if (!hashMap.containsKey(c23966c.m125423b()) || !z11) {
                        hashMap.put(c23966c.m125423b(), c23966c);
                    }
                    if (z11 && f115980f == null) {
                        f115980f = c23966c;
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private final void m125399k(AbstractC23968e.b bVar, JSONArray jSONArray) {
        String valueOf;
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("id");
                String optString = optJSONObject.optString("vi");
                String optString2 = optJSONObject.optString("en");
                if (bVar != null) {
                    if (bVar.m125430a().length() == 0) {
                        valueOf = String.valueOf(optInt);
                    } else {
                        valueOf = bVar.m125430a() + "." + optInt;
                    }
                } else {
                    valueOf = String.valueOf(optInt);
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    AbstractC19074t.m100205c(optString);
                    AbstractC19074t.m100205c(optString2);
                    AbstractC23968e.b bVar2 = new AbstractC23968e.b(optInt, optString, optString2, valueOf);
                    f115979e.put(bVar2.m125430a(), bVar2);
                    f115975a.m125399k(bVar2, optJSONArray);
                } else {
                    AbstractC19074t.m100205c(optString);
                    AbstractC19074t.m100205c(optString2);
                    AbstractC23968e.c cVar = new AbstractC23968e.c(optInt, optString, optString2, valueOf);
                    f115979e.put(cVar.m125430a(), cVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized C23965b m125400c(String str) {
        Object obj;
        try {
            AbstractC19074t.m100208f(str, "followAction");
            Iterator it = f115977c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC19074t.m100204b(str, ((C23965b) obj).m125406a())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C23965b) obj;
    }

    /* renamed from: d */
    public final synchronized C23966c m125401d(String str) {
        C23966c c23966c;
        try {
            c23966c = (C23966c) f115978d.get(str);
            if (c23966c != null) {
                if (!c23966c.m125426e()) {
                    c23966c = f115975a.m125396b();
                }
                if (c23966c == null) {
                }
            }
            c23966c = m125396b();
        } finally {
        }
        return c23966c;
    }

    /* renamed from: e */
    public final synchronized AbstractC23968e m125402e(String str) {
        return (AbstractC23968e) f115979e.get(str);
    }

    /* renamed from: f */
    public final boolean m125403f() {
        return f115976b;
    }

    /* renamed from: g */
    public final void m125404g(JSONObject jSONObject, boolean z11) {
        AbstractC19074t.m100208f(jSONObject, "configJObj");
        synchronized (this) {
            try {
                f115979e.clear();
                JSONArray optJSONArray = jSONObject.optJSONArray("report.reason");
                if (optJSONArray != null) {
                    AbstractC19074t.m100205c(optJSONArray);
                    f115975a.m125399k(null, optJSONArray);
                }
                f115977c.clear();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("report.action");
                if (optJSONArray2 != null) {
                    AbstractC19074t.m100205c(optJSONArray2);
                    int length = optJSONArray2.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        f115977c.add(new C23965b(optJSONArray2.optJSONObject(i11)));
                    }
                }
                f115978d.clear();
                f115975a.m125398j(jSONObject, z11);
                f115976b = true;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final void m125405i() {
        try {
            m125404g(new JSONObject(m125395a()), true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[REPORT_V2]", e11);
        }
    }
}
