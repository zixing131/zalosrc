package sc;

import ag0.C0815e1;
import com.zing.zalo.p062db.C7959d;
import dg0.AbstractC17930e;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p128ed.C18390e;
import p461qu.AbstractC25495a;
import vi.C28260f;
import vi.InterfaceC28256b;

/* renamed from: sc.d */
/* loaded from: classes3.dex */
public final class C26222d {

    /* renamed from: a */
    public static final C26222d f124594a = new C26222d();

    /* renamed from: b */
    private static final Map f124595b = new LinkedHashMap();

    private C26222d() {
    }

    /* renamed from: b */
    private final synchronized void m134849b() {
        Map map;
        try {
            try {
                map = f124595b;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (map.isEmpty()) {
                return;
            }
            Iterator it = map.entrySet().iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                i11++;
                i12 += ((Number) ((Map.Entry) it.next()).getValue()).intValue();
            }
            f124595b.clear();
            m134854l(4, i11, i12, 0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    private final int m134850c(ArrayList arrayList, JSONObject jSONObject) {
        Iterator it = arrayList.iterator();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            C28260f c28260f = (C28260f) it.next();
            int size = c28260f.m142309k().size();
            i13 += size;
            if (AbstractC25495a.m132079d(c28260f.m142310l())) {
                i11 += size;
            } else {
                i12 += size;
            }
        }
        jSONObject.put("cntGroupPhoto", i11);
        jSONObject.put("cntSinglePhoto", i12);
        return i13;
    }

    /* renamed from: d */
    private final int m134851d(ArrayList arrayList, JSONObject jSONObject) {
        Iterator it = arrayList.iterator();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            C28260f c28260f = (C28260f) it.next();
            Iterator it2 = c28260f.m142309k().values().iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                if (C18390e.f92781a.m97424r((InterfaceC28256b) it2.next())) {
                    i13++;
                    i14++;
                }
            }
            if (AbstractC25495a.m132079d(c28260f.m142310l())) {
                i11 += i14;
            } else {
                i12 += i14;
            }
        }
        jSONObject.put("cntGroupPhoto", i11);
        jSONObject.put("cntSinglePhoto", i12);
        return i13;
    }

    /* renamed from: i */
    private final int m134852i(ArrayList arrayList, JSONObject jSONObject, int i11) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (it.hasNext()) {
            C28260f c28260f = (C28260f) it.next();
            boolean m132079d = AbstractC25495a.m132079d(c28260f.m142310l());
            if (!hashSet.contains(c28260f.m142310l())) {
                i16++;
                if (m132079d) {
                    i13++;
                } else {
                    i12++;
                }
                hashSet.add(c28260f.m142310l());
            }
            if (m132079d) {
                i15++;
            } else {
                i14++;
            }
        }
        jSONObject.put("cntSingleThread", i12);
        jSONObject.put("cntGroupThread", i13);
        jSONObject.put("cntSingleZip", i14);
        jSONObject.put("cntGroupZip", i15);
        if (i11 == 1) {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            jSONObject.put("listThreadId", jSONArray.toString());
        }
        return i16;
    }

    /* renamed from: k */
    public static final void m134853k() {
        f124594a.m134849b();
    }

    /* renamed from: l */
    private final void m134854l(int i11, int i12, int i13, int i14) {
        try {
            C0815e1.m2075D().m2099U(3, 2, 42, "1", String.valueOf(i11), String.valueOf(i12), "0", String.valueOf(i13), String.valueOf(i14), "");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m */
    private final void m134855m(int i11, int i12, int i13, int i14, int i15, String str) {
        try {
            C0815e1.m2075D().m2099U(3, 2, 42, "1", String.valueOf(i11), String.valueOf(i12), String.valueOf(i13), String.valueOf(i14), String.valueOf(i15), str);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public final void m134856e(ArrayList arrayList, boolean z11) {
        AbstractC19074t.m100208f(arrayList, "listZipFileMDUploaded");
        try {
            JSONObject jSONObject = new JSONObject();
            int size = arrayList.size();
            int m134852i = m134852i(arrayList, jSONObject, 0);
            int m134851d = m134851d(arrayList, jSONObject);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m134855m(0, m134852i, size, m134851d, z11 ? 1 : 0, jSONObject2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final void m134857f(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listZipFileMDDownloaded");
        try {
            JSONObject jSONObject = new JSONObject();
            int size = arrayList.size();
            int m134852i = m134852i(arrayList, jSONObject, 1);
            int m134850c = m134850c(arrayList, jSONObject);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m134855m(1, m134852i, size, m134850c, 0, jSONObject2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final void m134858g(C28260f c28260f) {
        int i11;
        AbstractC19074t.m100208f(c28260f, "zipFileMDDownloaded");
        try {
            int m41705H = C7959d.Companion.m41850e().m41705H(c28260f.mo142291d());
            if (m41705H == 0) {
                C18390e.m97412t("Tracking photoCount invalid", true);
                return;
            }
            boolean m132079d = AbstractC25495a.m132079d(c28260f.m142310l());
            JSONObject jSONObject = new JSONObject();
            int i12 = 0;
            jSONObject.put("cntSingleThread", !m132079d ? 1 : 0);
            jSONObject.put("cntGroupThread", m132079d ? 1 : 0);
            jSONObject.put("cntSingleZip", 1 ^ (m132079d ? 1 : 0));
            jSONObject.put("cntGroupZip", m132079d ? 1 : 0);
            if (m132079d) {
                i11 = 0;
            } else {
                i11 = m41705H;
            }
            jSONObject.put("cntSinglePhoto", i11);
            if (m132079d) {
                i12 = m41705H;
            }
            jSONObject.put("cntGroupPhoto", i12);
            jSONObject.put("listThreadId", new JSONArray().put(c28260f.m142310l()).toString());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m134855m(1, 1, 1, m41705H, 0, jSONObject2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: h */
    public final void m134859h(ArrayList arrayList, boolean z11) {
        AbstractC19074t.m100208f(arrayList, "listZipFileMDDeleted");
        try {
            JSONObject jSONObject = new JSONObject();
            int size = arrayList.size();
            int m134852i = m134852i(arrayList, jSONObject, 2);
            int m134850c = m134850c(arrayList, jSONObject);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m134855m(2, m134852i, size, m134850c, z11 ? 1 : 0, jSONObject2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    public final synchronized void m134860j(String str) {
        try {
            AbstractC19074t.m100208f(str, "ownerId");
            try {
                Map map = f124595b;
                Integer num = (Integer) map.get(str);
                if (num == null) {
                    num = 0;
                }
                map.put(str, Integer.valueOf(num.intValue() + 1));
                AbstractC17930e.Companion.m94550a().mo94530d("DEBOUNCE_RECORD_TRACKING_LOG_DOWNLOAD_PHOTO_CSC", new Runnable() { // from class: sc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26222d.m134853k();
                    }
                }, 30000L);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: n */
    public final void m134861n(int i11, boolean z11) {
        m134854l(3, 0, i11, z11 ? 1 : 0);
    }
}
