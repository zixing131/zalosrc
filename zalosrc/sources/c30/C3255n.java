package c30;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.text.TextUtils;
import c30.C3255n;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23193r0;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25811c;
import p588vw.C28644j;
import p716zh.AbstractC31962i9;
import p716zh.C31947h9;

/* renamed from: c30.n */
/* loaded from: classes5.dex */
public class C3255n {

    /* renamed from: d */
    private static final String f13948d = "n";

    /* renamed from: e */
    private static volatile C3255n f13949e;

    /* renamed from: a */
    private final Map f13950a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    boolean f13951b = false;

    /* renamed from: c */
    private final AtomicBoolean f13952c = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c30.n$a */
    /* loaded from: classes5.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC23309i.m121355Qq(System.currentTimeMillis());
            C3255n.this.f13951b = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C3255n.this.m16569D((JSONObject) obj);
                C3255n.this.m16570E(AbstractC23304d.f113461z);
                AbstractC23309i.m121355Qq(System.currentTimeMillis());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C3255n.this.f13951b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c30.n$b */
    /* loaded from: classes5.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C3255n.this.f13952c.set(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    jSONObject.optInt("error_code", 0);
                    jSONObject.optString("error_message", "");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    int optInt = jSONObject2.optInt("expired_time", 86400);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("tenor_sticker_map");
                    AbstractC23309i.m121611Xn(optInt);
                    AbstractC23309i.m122036iy(jSONObject3.toString());
                    C3255n.this.m16567B();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                C3255n.this.f13952c.set(false);
            }
        }
    }

    /* renamed from: c30.n$c */
    /* loaded from: classes5.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C3247j f13955a;

        c(C3247j c3247j) {
            this.f13955a = c3247j;
        }

        /* renamed from: d */
        public static /* synthetic */ void m16583d() {
            C23744a.m124114c().m124116d(8001, new Object[0]);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C7960e.m41971c6().m42371d9(this.f13955a, CoreUtility.f89233i);
                int size = C7960e.m41971c6().m42176K6(CoreUtility.f89233i).size();
                if (size > 40) {
                    C7960e.m41971c6().m42186L3(CoreUtility.f89233i, size - 40);
                    size = 40;
                }
                C28644j.m143233Y().m143295Z0(size);
                C28644j.m143229S0(-3);
                AbstractC19444a.m101695c(new Runnable() { // from class: c30.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3255n.c.m16583d();
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: c30.n$d */
    /* loaded from: classes5.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C3232b0 f13957a;

        d(C3232b0 c3232b0) {
            this.f13957a = c3232b0;
        }

        /* renamed from: d */
        public static /* synthetic */ void m16585d() {
            C23744a.m124114c().m124116d(8000, new Object[0]);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList m42163J6;
            boolean z11;
            int i11;
            boolean z12;
            try {
                m42163J6 = C7960e.m41971c6().m42163J6(CoreUtility.f89233i);
                z11 = false;
                if (m42163J6 != null) {
                    i11 = m42163J6.size();
                } else {
                    i11 = 0;
                }
                if (this.f13957a.m16416o() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f13957a.m16416o() == 2) {
                    z11 = true;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
            if (i11 > 0) {
                Iterator it = m42163J6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3232b0 c3232b0 = (C3232b0) it.next();
                    if (c3232b0 != null) {
                        String str = "";
                        if (z11 && c3232b0.m16416o() == 0) {
                            if (this.f13957a.m16411j() != null) {
                                str = this.f13957a.m16411j().m133092d();
                            }
                            if (C3255n.this.m16554d(c3232b0, str)) {
                                C7960e.m41971c6().m42440k4(c3232b0.m16403b(), c3232b0.m16407f(), CoreUtility.f89233i);
                                break;
                            }
                        } else if (z12 && c3232b0.m16416o() == 2) {
                            if (c3232b0.m16411j() != null) {
                                str = c3232b0.m16411j().m133092d();
                            }
                            if (C3255n.this.m16554d(this.f13957a, str)) {
                                C7960e.m41971c6().m42440k4(c3232b0.m16403b(), c3232b0.m16407f(), CoreUtility.f89233i);
                                break;
                            }
                        }
                        AbstractC20110a.m104539h(e11);
                        return;
                    }
                }
            }
            C7960e.m41971c6().m42360c9(this.f13957a, CoreUtility.f89233i);
            int size = C7960e.m41971c6().m42163J6(CoreUtility.f89233i).size();
            if (size > 40) {
                C7960e.m41971c6().m42197M3(CoreUtility.f89233i, size - 40);
                size = 40;
            }
            C28644j.m143233Y().m143299b1(size);
            C28644j.m143229S0(-2);
            AbstractC19444a.m101695c(new Runnable() { // from class: c30.p
                @Override // java.lang.Runnable
                public final void run() {
                    C3255n.d.m16585d();
                }
            });
        }
    }

    /* renamed from: c30.n$e */
    /* loaded from: classes5.dex */
    public static class e {

        /* renamed from: a */
        public String f13959a;

        /* renamed from: b */
        public int f13960b;

        /* renamed from: c */
        public int f13961c;

        public e(JSONObject jSONObject) {
            this.f13959a = jSONObject.optString("id", "");
            this.f13960b = jSONObject.optInt("cid", -1);
            this.f13961c = jSONObject.optInt("eid", -1);
        }
    }

    private C3255n() {
    }

    /* renamed from: c */
    private boolean m16553c() {
        if (AbstractC23309i.m121554W3() > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m16554d(C3232b0 c3232b0, String str) {
        e m16574p = m16562n().m16574p(str);
        if (m16574p != null && m16574p.f13960b == c3232b0.m16403b()) {
            if ((m16574p.f13961c + "").equals(c3232b0.m16407f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m16555f() {
        return AbstractC23309i.m121404S1();
    }

    /* renamed from: g */
    public static boolean m16556g() {
        if (AbstractC23193r0.m119506o() && AbstractC23309i.m121441T1()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m16557h() {
        if (AbstractC23309i.m121478U1() && AbstractC23193r0.m119506o() && AbstractC23304d.f113451w1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m16558i() {
        if (AbstractC23309i.m121515V1() && AbstractC23193r0.m119506o() && AbstractC23304d.f113451w1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m16559j() {
        if (AbstractC23309i.m121552W1() && AbstractC23193r0.m119506o() && AbstractC23304d.f113451w1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m16560k() {
        if (AbstractC23309i.m122380s3() && m16556g()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private String m16561m(C3245i c3245i) {
        return "{\"id\":" + JSONObject.quote("" + c3245i.f13854b) + ",\"name\":" + JSONObject.quote("" + c3245i.m16464f()) + ",\"is_hidden\":" + JSONObject.quote("" + c3245i.f13866n) + "}";
    }

    /* renamed from: n */
    public static synchronized C3255n m16562n() {
        C3255n c3255n;
        synchronized (C3255n.class) {
            try {
                if (f13949e == null) {
                    synchronized (C3255n.class) {
                        try {
                            if (f13949e == null) {
                                f13949e = new C3255n();
                            }
                        } finally {
                        }
                    }
                }
                c3255n = f13949e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3255n;
    }

    /* renamed from: q */
    private void m16563q(C3247j c3247j) {
        C0824j.m2153b(new c(c3247j));
    }

    /* renamed from: t */
    private void m16564t(C3232b0 c3232b0) {
        C0824j.m2153b(new d(c3232b0));
    }

    /* renamed from: y */
    public static boolean m16565y() {
        C31947h9 mo150752p = AbstractC23306f.m120726x1().mo150752p();
        if (AbstractC23309i.m121197Mg() && mo150752p != null && AbstractC31962i9.m153678d(mo150752p)) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public void m16566A() {
        try {
            String m3506V5 = AbstractC0924m0.m3506V5();
            if (m3506V5 != null && !TextUtils.isEmpty(m3506V5)) {
                m16568C(new JSONArray(m3506V5));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    public void m16567B() {
        try {
            JSONObject jSONObject = new JSONObject(AbstractC23309i.m121267Oc());
            Iterator<String> keys = jSONObject.keys();
            this.f13950a.clear();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    this.f13950a.put(next, new e(jSONObject.getJSONObject(next)));
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    synchronized void m16568C(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            AbstractC23304d.f113461z.clear();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null) {
                    C3245i c3245i = new C3245i(optJSONObject);
                    AbstractC23304d.f113461z.put(Integer.valueOf(c3245i.f13854b), c3245i);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    synchronized void m16569D(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject == null) {
            return;
        }
        try {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                ArrayList arrayList = new ArrayList();
                if (optJSONObject != null && optJSONObject.has("cates") && (optJSONArray = optJSONObject.optJSONArray("cates")) != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                        if (optJSONObject2 != null) {
                            C3245i c3245i = new C3245i(optJSONObject2);
                            arrayList.add(Integer.valueOf(c3245i.f13854b));
                            AbstractC23304d.f113461z.put(Integer.valueOf(c3245i.f13854b), c3245i);
                        }
                    }
                    for (C3245i c3245i2 : AbstractC23304d.f113461z.values()) {
                        if (!arrayList.contains(Integer.valueOf(c3245i2.f13854b)) && c3245i2.f13866n == 0) {
                            c3245i2.f13866n = 1;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: E */
    public void m16570E(Map map) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(new JSONObject(m16561m((C3245i) ((Map.Entry) it.next()).getValue())));
            }
            AbstractC0924m0.m4414zo(new JSONArray((Collection) arrayList).toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m16571e() {
        if (!this.f13952c.get() && !m16553c()) {
            this.f13952c.set(true);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            c0766k.mo1392B3();
        }
    }

    /* renamed from: l */
    public String m16572l(String str, String str2, C25630b c25630b) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (c25630b == null) {
            str3 = "";
        } else {
            str3 = c25630b.m132421c();
        }
        sb2.append(str3);
        sb2.append("_");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: o */
    public void m16573o() {
        if (this.f13951b) {
            return;
        }
        this.f13951b = true;
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a());
            c0766k.mo1658i5(1, 0, 0, 0, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public e m16574p(String str) {
        return (e) this.f13950a.get(str);
    }

    /* renamed from: r */
    public void m16575r(C25809a c25809a) {
        if (TextUtils.isEmpty(c25809a.m133081c())) {
            return;
        }
        try {
            C3232b0 c3232b0 = new C3232b0(1);
            c3232b0.m16417p(c25809a);
            C28644j.m143233Y().m143289V0(true);
            m16564t(c3232b0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: s */
    public void m16576s(C25811c c25811c) {
        try {
            C3232b0 c3232b0 = new C3232b0(2);
            c3232b0.m16418q(c25811c);
            C28644j.m143233Y().m143289V0(true);
            m16564t(c3232b0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f13948d, e11);
        }
    }

    /* renamed from: u */
    public void m16577u(C25630b c25630b) {
        try {
            C3247j c3247j = new C3247j();
            c3247j.f13888a = c25630b.m132432j();
            c3247j.f13890c = c25630b.m132429g();
            c3247j.f13891d = c25630b.m132433k();
            c3247j.f13892e = c25630b.m132434l() + "";
            c3247j.f13893f = "";
            c3247j.f13894g = c25630b.m132431i();
            c3247j.f13896i = c25630b.m132430h();
            c3247j.f13889b = c25630b.m132432j();
            C28644j.m143233Y().m143291W0(true);
            m16563q(c3247j);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f13948d, e11);
        }
    }

    /* renamed from: v */
    public void m16578v(C25630b c25630b) {
        if (c25630b == null) {
            return;
        }
        try {
            C3247j c3247j = new C3247j();
            c3247j.f13888a = c25630b.m132432j();
            c3247j.f13890c = c25630b.m132429g();
            c3247j.f13891d = c25630b.m132433k();
            c3247j.f13892e = c25630b.m132434l() + "";
            c3247j.f13893f = "";
            c3247j.f13894g = c25630b.m132431i();
            c3247j.f13896i = c25630b.m132430h();
            c3247j.f13889b = c25630b.m132432j();
            C3232b0 c3232b0 = new C3232b0(0);
            c3232b0.m16419r(c3247j);
            C28644j.m143233Y().m143289V0(true);
            m16564t(c3232b0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f13948d, e11);
        }
    }

    /* renamed from: w */
    public boolean m16579w(int i11) {
        C3245i c3245i = (C3245i) AbstractC23304d.f113461z.get(Integer.valueOf(i11));
        if (c3245i == null || c3245i.f13866n == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public boolean m16580x(int i11) {
        boolean z11;
        ArrayList arrayList = AbstractC23304d.f113273F;
        synchronized (arrayList) {
            try {
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3245i c3245i = (C3245i) it.next();
                        if (c3245i != null && c3245i.f13854b == i11) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: z */
    public boolean m16581z(C25630b c25630b, boolean z11) {
        if (c25630b.m132432j() > 0 && !C28644j.m143233Y().m143312x0(c25630b.m132432j()) && !z11 && !m16579w(c25630b.m132427f())) {
            return true;
        }
        return false;
    }
}
