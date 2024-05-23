package p719zk;

import am.AbstractC0924m0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import fi.C18953k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p647xj.C29675a;
import p647xj.C29677c;
import p647xj.C29680f;
import p647xj.C29681g;
import p683yj.C30997b;
import p716zh.AbstractC31962i9;
import p716zh.C31902e9;
import p716zh.C31947h9;
import p716zh.C32119t6;
import pm0.C24860q;

/* renamed from: zk.b */
/* loaded from: classes3.dex */
public final class C32221b implements InterfaceC32220a {

    /* renamed from: a */
    private final C7960e f148622a;

    public C32221b() {
        C7960e m120592K = AbstractC23306f.m120592K();
        AbstractC19074t.m100207e(m120592K, "provideDatabaseHelper(...)");
        this.f148622a = m120592K;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: A */
    public HashMap mo155357A() {
        HashMap hashMap = new HashMap();
        String m42329Z6 = this.f148622a.m42329Z6();
        AbstractC19074t.m100207e(m42329Z6, "getSuggestResultClickCountMapCurrentDay(...)");
        if (m42329Z6.length() > 0) {
            JSONObject jSONObject = new JSONObject(m42329Z6);
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    C31902e9.a aVar = C31902e9.Companion;
                    AbstractC19074t.m100205c(next);
                    hashMap.put(aVar.m153335a(next), Integer.valueOf(jSONObject.getInt(next)));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        return hashMap;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: B */
    public C31947h9 mo155358B() {
        String m3981l5 = AbstractC0924m0.m3981l5();
        AbstractC19074t.m100205c(m3981l5);
        if (m3981l5.length() > 0) {
            return AbstractC31962i9.m153677c(new JSONObject(m3981l5));
        }
        return null;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: C */
    public HashMap mo155359C() {
        HashMap hashMap = new HashMap();
        String m3892i6 = AbstractC0924m0.m3892i6();
        AbstractC19074t.m100205c(m3892i6);
        if (m3892i6.length() > 0) {
            JSONObject jSONObject = new JSONObject(m3892i6);
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    AbstractC19074t.m100205c(next);
                    Integer valueOf = Integer.valueOf(Integer.parseInt(next));
                    C30997b.b.a aVar = C30997b.b.Companion;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    hashMap.put(valueOf, aVar.m150689a(jSONObject2));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        return hashMap;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: D */
    public void mo155360D(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3322Oo(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: a */
    public C29680f mo155361a() {
        String m3535W5 = AbstractC0924m0.m3535W5();
        AbstractC19074t.m100205c(m3535W5);
        if (m3535W5.length() > 0) {
            return new C29680f(new JSONObject(m3535W5));
        }
        return null;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: b */
    public boolean mo155362b() {
        return AbstractC0924m0.m4344xc();
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: c */
    public void mo155363c(boolean z11) {
        AbstractC0924m0.m2916Ao(z11);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: d */
    public void mo155364d(long j11) {
        this.f148622a.m42599z0(j11);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: e */
    public void mo155365e(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC0924m0.m4412zm(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: f */
    public C29677c mo155366f() {
        String m3951k5 = AbstractC0924m0.m3951k5();
        AbstractC19074t.m100205c(m3951k5);
        if (m3951k5.length() > 0) {
            return new C29677c(new JSONObject(m3951k5));
        }
        return null;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: g */
    public void mo155367g() {
        this.f148622a.m42111Eb(CoreUtility.f89233i, C18953k.e.f94579r);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: h */
    public HashMap mo155368h() {
        HashMap hashMap = new HashMap();
        String m3922j6 = AbstractC0924m0.m3922j6();
        AbstractC19074t.m100205c(m3922j6);
        if (m3922j6.length() > 0) {
            JSONObject jSONObject = new JSONObject(m3922j6);
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    C31902e9.a aVar = C31902e9.Companion;
                    AbstractC19074t.m100205c(next);
                    hashMap.put(aVar.m153335a(next), Float.valueOf((float) jSONObject.getDouble(next)));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        return hashMap;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: i */
    public void mo155369i(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC0924m0.m4239tn(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: j */
    public C29675a mo155370j() {
        String m3273N4 = AbstractC0924m0.m3273N4();
        AbstractC19074t.m100205c(m3273N4);
        if (m3273N4.length() > 0) {
            return new C29675a(new JSONObject(m3273N4));
        }
        return null;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: k */
    public void mo155371k(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC0924m0.m2974Co(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: l */
    public void mo155372l(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC0924m0.m4209sn(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: m */
    public void mo155373m(String str) {
        AbstractC19074t.m100208f(str, "config");
        AbstractC0924m0.m2945Bo(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: n */
    public C29681g mo155374n() {
        String m3564X5 = AbstractC0924m0.m3564X5();
        AbstractC19074t.m100205c(m3564X5);
        if (m3564X5.length() > 0) {
            return new C29681g(new JSONObject(m3564X5));
        }
        return null;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: o */
    public void mo155375o() {
        this.f148622a.m42155Ib(C18953k.e.f94579r);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: p */
    public void mo155376p(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3264Mo(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: q */
    public HashMap mo155377q() {
        HashMap hashMap = new HashMap();
        String m3832g6 = AbstractC0924m0.m3832g6();
        AbstractC19074t.m100205c(m3832g6);
        if (m3832g6.length() > 0) {
            JSONObject jSONObject = new JSONObject(m3832g6);
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    AbstractC19074t.m100205c(next);
                    C31902e9.a aVar = C31902e9.Companion;
                    String optString = jSONObject.optString(next);
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    hashMap.put(next, aVar.m153335a(optString));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        return hashMap;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: r */
    public List mo155378r() {
        String m3795f = AbstractC0924m0.m3795f();
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC19074t.m100205c(m3795f);
            if (m3795f.length() > 0) {
                List m155010k = C32119t6.m155010k(new JSONArray(m3795f));
                AbstractC19074t.m100206d(m155010k, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.control.SearchInlineResult>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.control.SearchInlineResult> }");
                return (ArrayList) m155010k;
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return arrayList;
        }
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: s */
    public void mo155379s(long j11) {
        AbstractC0924m0.m3607Yj(j11);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: t */
    public void mo155380t(Map map) {
        AbstractC19074t.m100208f(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            C24860q c24860q = (C24860q) entry.getKey();
            try {
                jSONObject.put(c24860q.toString(), ((Number) entry.getValue()).intValue());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        this.f148622a.m42375de(jSONObject.toString());
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: u */
    public Map mo155381u(int i11) {
        List m42363cd = this.f148622a.m42363cd(i11);
        AbstractC19074t.m100207e(m42363cd, "suggestResultClickCountMapWithin(...)");
        HashMap hashMap = new HashMap();
        Iterator it = m42363cd.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = new JSONObject((String) it.next());
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    int i12 = jSONObject.getInt(next);
                    C31902e9.a aVar = C31902e9.Companion;
                    AbstractC19074t.m100205c(next);
                    C24860q m153335a = aVar.m153335a(next);
                    Integer num = (Integer) hashMap.get(m153335a);
                    if (num == null) {
                        num = 0;
                    }
                    hashMap.put(m153335a, Integer.valueOf(num.intValue() + i12));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        return hashMap;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: v */
    public long mo155382v() {
        return AbstractC0924m0.m3649a3();
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: w */
    public void mo155383w(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3816fk(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: x */
    public HashMap mo155384x() {
        HashMap hashMap = new HashMap();
        try {
            String m3859h3 = AbstractC0924m0.m3859h3();
            AbstractC19074t.m100205c(m3859h3);
            if (m3859h3.length() > 0) {
                JSONObject jSONObject = new JSONObject(m3859h3);
                Iterator<String> keys = jSONObject.keys();
                AbstractC19074t.m100207e(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            arrayList.add(Integer.valueOf(jSONArray.getInt(i11)));
                        }
                        AbstractC19074t.m100205c(next);
                        hashMap.put(next, arrayList);
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
        return hashMap;
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: y */
    public void mo155385y(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3166Jd(str);
    }

    @Override // p719zk.InterfaceC32220a
    /* renamed from: z */
    public void mo155386z(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3351Po(str);
    }
}
