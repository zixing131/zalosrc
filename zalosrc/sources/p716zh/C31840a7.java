package p716zh;

import ae.C0766k;
import android.text.TextUtils;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p394oj.C24278d;
import p716zh.C31840a7;

/* renamed from: zh.a7 */
/* loaded from: classes3.dex */
public class C31840a7 {

    /* renamed from: c */
    static C31840a7 f146132c;

    /* renamed from: a */
    Map f146133a = new a(100);

    /* renamed from: b */
    Set f146134b = Collections.synchronizedSet(new HashSet());

    /* renamed from: zh.a7$a */
    /* loaded from: classes3.dex */
    class a extends LinkedHashMap {
        a(int i11) {
            super(i11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.a7$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f146136a;

        /* renamed from: b */
        final /* synthetic */ f f146137b;

        b(String str, f fVar) {
            this.f146136a = str;
            this.f146137b = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m152985d(Object obj, String str, f fVar) {
            try {
                C24278d m152981i = C31840a7.this.m152981i(str, "", (JSONObject) obj);
                if (fVar != null && m152981i != null) {
                    fVar.mo61621i(m152981i.f117250c);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            f fVar = this.f146137b;
            if (fVar != null) {
                fVar.mo61621i("");
            }
            C31840a7.this.m152982j(false, this.f146136a, "");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            final String str = this.f146136a;
            final f fVar = this.f146137b;
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.b7
                @Override // java.lang.Runnable
                public final void run() {
                    C31840a7.b.this.m152985d(obj, str, fVar);
                }
            });
            C31840a7.this.m152982j(false, this.f146136a, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.a7$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String[] f146139a;

        /* renamed from: b */
        final /* synthetic */ String f146140b;

        /* renamed from: c */
        final /* synthetic */ g f146141c;

        c(String[] strArr, String str, g gVar) {
            this.f146139a = strArr;
            this.f146140b = str;
            this.f146141c = gVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                c20096c.m104492d();
                c20096c.m104491c();
            }
            g gVar = this.f146141c;
            if (gVar != null) {
                gVar.mo43895ds(this.f146140b, this.f146139a, false);
            }
            C31840a7.this.m152982j(false, this.f146140b, this.f146139a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("videos");
                if (optJSONObject != null) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = this.f146139a;
                        if (i11 >= strArr.length) {
                            break;
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject(strArr[i11]);
                        if (optJSONObject2 != null) {
                            C31840a7.this.m152981i(this.f146140b, this.f146139a[i11], optJSONObject2);
                        }
                        i11++;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            } finally {
                C31840a7.this.m152982j(false, this.f146140b, this.f146139a);
            }
            g gVar = this.f146141c;
            if (gVar != null) {
                gVar.mo43895ds(this.f146140b, this.f146139a, true);
            }
        }
    }

    /* renamed from: zh.a7$d */
    /* loaded from: classes3.dex */
    class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C32120t7 f146143a;

        /* renamed from: b */
        final /* synthetic */ e f146144b;

        d(C32120t7 c32120t7, e eVar) {
            this.f146143a = c32120t7;
            this.f146144b = eVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C32120t7 c32120t7;
            e eVar;
            if (c20096c != null) {
                try {
                    try {
                        c20096c.m104492d();
                        c20096c.m104491c();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        c32120t7 = this.f146143a;
                        c32120t7.f148089f = false;
                        eVar = this.f146144b;
                        if (eVar == null) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    C32120t7 c32120t72 = this.f146143a;
                    c32120t72.f148089f = false;
                    e eVar2 = this.f146144b;
                    if (eVar2 != null) {
                        eVar2.mo82411Af(c32120t72, false, c20096c);
                    }
                    throw th2;
                }
            }
            c32120t7 = this.f146143a;
            c32120t7.f148089f = false;
            eVar = this.f146144b;
            if (eVar == null) {
                return;
            }
            eVar.mo82411Af(c32120t7, false, c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C32120t7 c32120t7;
            e eVar;
            boolean z11;
            C32106s7 c32106s7;
            try {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    C32120t7 c32120t72 = this.f146143a;
                    if (jSONObject.optInt("hasMore") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c32120t72.f148087d = z11;
                    this.f146143a.f148085b = jSONObject.optInt("dataSize");
                    if (jSONObject.has("page")) {
                        this.f146143a.f148086c = jSONObject.optInt("page");
                    }
                    this.f146143a.f148088e = jSONObject.optLong("last_arId");
                    jSONObject.optLong("serverTime");
                    JSONArray optJSONArray = jSONObject.optJSONArray("data");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 != null) {
                                c32106s7 = C32106s7.m154972a(C32098s.m154930o(jSONObject2));
                            } else {
                                c32106s7 = null;
                            }
                            if (c32106s7 != null) {
                                this.f146143a.f148084a.add(c32106s7);
                            }
                        }
                        C31840a7.this.m152983k(this.f146143a, this.f146144b);
                    }
                    c32120t7 = this.f146143a;
                    c32120t7.f148089f = false;
                    eVar = this.f146144b;
                    if (eVar == null) {
                        return;
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    c32120t7 = this.f146143a;
                    c32120t7.f148089f = false;
                    eVar = this.f146144b;
                    if (eVar == null) {
                        return;
                    }
                }
                eVar.mo82411Af(c32120t7, true, null);
            } catch (Throwable th2) {
                C32120t7 c32120t73 = this.f146143a;
                c32120t73.f148089f = false;
                e eVar2 = this.f146144b;
                if (eVar2 != null) {
                    eVar2.mo82411Af(c32120t73, true, null);
                }
                throw th2;
            }
        }
    }

    /* renamed from: zh.a7$e */
    /* loaded from: classes3.dex */
    public interface e extends g {
        /* renamed from: Af */
        void mo82411Af(C32120t7 c32120t7, boolean z11, C20096c c20096c);
    }

    /* renamed from: zh.a7$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: i */
        void mo61621i(String str);
    }

    /* renamed from: zh.a7$g */
    /* loaded from: classes3.dex */
    public interface g {
        /* renamed from: ds */
        void mo43895ds(String str, String[] strArr, boolean z11);
    }

    C31840a7() {
    }

    /* renamed from: c */
    public static synchronized C31840a7 m152973c() {
        C31840a7 c31840a7;
        synchronized (C31840a7.class) {
            try {
                if (f146132c == null) {
                    f146132c = new C31840a7();
                }
                c31840a7 = f146132c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31840a7;
    }

    /* renamed from: a */
    String m152974a(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + str2;
    }

    /* renamed from: b */
    public void m152975b(String str, f fVar) {
        if (TextUtils.isEmpty(str)) {
            if (fVar != null) {
                fVar.mo61621i("");
            }
        } else {
            m152982j(true, str, "");
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(str, fVar));
            c0766k.mo1723r3(str);
        }
    }

    /* renamed from: d */
    public void m152976d(String str, String[] strArr, g gVar) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length != 0) {
            m152982j(true, str, strArr);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(strArr, str, gVar));
            c0766k.mo1794z9(str, strArr);
            return;
        }
        if (gVar != null) {
            gVar.mo43895ds(str, strArr, false);
        }
    }

    /* renamed from: e */
    public void m152977e(C32120t7 c32120t7, long j11, int i11, e eVar) {
        if (c32120t7 != null && c32120t7.f148087d && !c32120t7.f148089f) {
            c32120t7.f148089f = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d(c32120t7, eVar));
            c0766k.mo1542T8(j11, c32120t7.f148088e, i11, 20);
            return;
        }
        if (eVar != null) {
            eVar.mo82411Af(c32120t7, false, null);
        }
    }

    /* renamed from: f */
    public C24278d m152978f(String str) {
        return (C24278d) this.f146133a.get(str);
    }

    /* renamed from: g */
    public C24278d m152979g(String str, String str2) {
        return (C24278d) this.f146133a.get(m152974a(str, str2));
    }

    /* renamed from: h */
    public boolean m152980h(String str, String str2) {
        return this.f146134b.contains(m152974a(str, str2));
    }

    /* renamed from: i */
    C24278d m152981i(String str, String str2, JSONObject jSONObject) {
        C24278d c24278d;
        C24278d c24278d2 = null;
        try {
            c24278d = new C24278d(str, str2, jSONObject);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            this.f146133a.put(m152974a(str, str2), c24278d);
            return c24278d;
        } catch (Exception e12) {
            e = e12;
            c24278d2 = c24278d;
            e.printStackTrace();
            return c24278d2;
        }
    }

    /* renamed from: j */
    void m152982j(boolean z11, String str, String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str2 : strArr) {
            try {
                String m152974a = m152974a(str, str2);
                if (z11) {
                    this.f146134b.add(m152974a);
                } else {
                    this.f146134b.remove(m152974a);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: k */
    public void m152983k(C32120t7 c32120t7, g gVar) {
        if (c32120t7 != null) {
            try {
                ArrayList arrayList = c32120t7.f148084a;
                if (arrayList != null && !arrayList.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    Iterator it = c32120t7.f148084a.iterator();
                    String str = null;
                    while (it.hasNext()) {
                        C32106s7 c32106s7 = (C32106s7) it.next();
                        if (c32106s7 != null && !TextUtils.isEmpty(c32106s7.m154977f()) && !TextUtils.isEmpty(c32106s7.m154975d())) {
                            str = c32106s7.m154977f();
                            String m154975d = c32106s7.m154975d();
                            C24278d m152979g = m152979g(str, m154975d);
                            c32106s7.m154980i(m152979g);
                            if (m152979g != null && !m152979g.m126783a()) {
                            }
                            Set set = (Set) hashMap.get(str);
                            if (set == null) {
                                set = new HashSet();
                                hashMap.put(str, set);
                            }
                            set.add(m154975d);
                        }
                    }
                    for (String str2 : hashMap.keySet()) {
                        Set set2 = (Set) hashMap.get(str);
                        if (set2 != null && !set2.isEmpty()) {
                            m152976d(str2, (String[]) set2.toArray(new String[set2.size()]), gVar);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
