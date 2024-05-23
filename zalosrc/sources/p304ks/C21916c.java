package p304ks;

import ae.C0766k;
import am.AbstractC0906d0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hu.C20131e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23056e6;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p716zh.C31901e8;

/* renamed from: ks.c */
/* loaded from: classes4.dex */
public class C21916c {

    /* renamed from: c */
    c f107746c;

    /* renamed from: d */
    AtomicBoolean f107747d = new AtomicBoolean(false);

    /* renamed from: e */
    AtomicInteger f107748e = new AtomicInteger(0);

    /* renamed from: f */
    public AtomicBoolean f107749f = new AtomicBoolean(true);

    /* renamed from: a */
    final Set f107744a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    final Map f107745b = Collections.synchronizedMap(new HashMap());

    /* renamed from: ks.c$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC23309i.m120941Fj(System.currentTimeMillis());
            AbstractC23309i.m120904Ej(3600000L);
            C21916c.this.f107747d.set(false);
            C21916c.this.m114225p();
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:            if (r1 != false) goto L67;     */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:            p304ks.C21916c.this.m114225p();     */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:            r13 = am.AbstractC0906d0.m2802h(com.zing.zalo.MainApplication.getAppContext());        r1 = p304ks.C21916c.this;        r1.m114227r(r1.m114224o(r13));        p348mi.AbstractC23309i.m120941Fj(java.lang.System.currentTimeMillis());        p304ks.C21916c.this.f107747d.set(false);     */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:            if (r1 == false) goto L68;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            boolean z11 = true;
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    long j11 = 3600;
                    if (optJSONObject != null) {
                        JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                        if (optJSONArray != null) {
                            int length = optJSONArray.length();
                            if (length > 0) {
                                HashMap hashMap = new HashMap();
                                hashMap.clear();
                                C21916c.this.f107744a.clear();
                                for (int i11 = 0; i11 < length; i11++) {
                                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                                    if (optJSONObject2 != null) {
                                        b bVar = new b(optJSONObject2);
                                        hashMap.put(bVar.f107751a, bVar);
                                        C21916c.this.f107745b.put(bVar.f107752b, bVar.f107751a);
                                        C21916c.this.f107744a.add(bVar.f107751a);
                                    }
                                }
                                if (hashMap.size() > 0) {
                                    C7960e.m41971c6().m42460m3();
                                    C7960e.m41971c6().m42552u7(hashMap);
                                }
                            }
                            C21917c0.m114228c().m114230b();
                            C21913a0.m114177i().m114189p(new HashMap(C21916c.this.f107745b));
                            z11 = false;
                        }
                        j11 = optJSONObject.optLong("expired_time", 3600L) * 1000;
                    }
                    AbstractC23309i.m120904Ej(j11);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                if (z11) {
                    C21916c.this.m114225p();
                }
                List m2802h = AbstractC0906d0.m2802h(MainApplication.getAppContext());
                C21916c c21916c = C21916c.this;
                c21916c.m114227r(c21916c.m114224o(m2802h));
                AbstractC23309i.m120941Fj(System.currentTimeMillis());
                C21916c.this.f107747d.set(false);
                throw th2;
            }
        }
    }

    /* renamed from: ks.c$c */
    /* loaded from: classes4.dex */
    public class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    C21916c.this.f107746c.removeMessages(1);
                    C21916c.this.m114211a();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: ks.c$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        static final C21916c f107754a = new C21916c();
    }

    C21916c() {
        HandlerThread handlerThread = new HandlerThread("Z:DiscoverContact");
        handlerThread.start();
        this.f107746c = new c(handlerThread.getLooper());
    }

    /* renamed from: e */
    public static C21916c m114210e() {
        return d.f107754a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:            if (r0 == false) goto L102;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m114211a() {
        boolean z11;
        if (m114213c()) {
            boolean z12 = false;
            if (AbstractC23309i.m121259O4() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f107747d.get() && (z11 || (AbstractC23304d.f113411m1.get() && this.f107749f.get()))) {
                this.f107747d.set(true);
                List<C31901e8> m2802h = AbstractC0906d0.m2802h(MainApplication.getAppContext());
                Set m114215f = m114215f();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                boolean z13 = false;
                for (C31901e8 c31901e8 : m2802h) {
                    String m153298m = c31901e8.m153298m();
                    if (m114215f != null && !m114215f.contains(m153298m)) {
                        z13 = true;
                    }
                    hashSet.add(m153298m);
                    if (!TextUtils.isEmpty(m153298m) && !TextUtils.equals(AbstractC23056e6.f112062a, m153298m)) {
                        if (c31901e8.m153300r() > 0) {
                            this.f107745b.put(String.valueOf(c31901e8.m153300r()), m153298m);
                        } else {
                            arrayList.add(m153298m);
                        }
                    }
                }
                if (m114215f != null) {
                    Iterator it = m114215f.iterator();
                    while (it.hasNext()) {
                        if (!hashSet.contains((String) it.next())) {
                            break;
                        }
                    }
                }
                if (!z13) {
                }
                z12 = true;
                m114212b(arrayList, z12);
                return;
            }
            this.f107746c.sendEmptyMessageDelayed(1, 300000L);
        }
    }

    /* renamed from: b */
    void m114212b(ArrayList arrayList, boolean z11) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!m114221l() && !z11) {
                m114226q();
                this.f107747d.set(false);
                return;
            }
            if (m114213c()) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a());
                String m114223n = m114223n(arrayList);
                if (!TextUtils.isEmpty(m114223n)) {
                    c0766k.mo1754ua(m114223n, AbstractC23352g.m122788d(m114223n), true, this.f107748e.get());
                    return;
                } else {
                    this.f107747d.set(false);
                    m114226q();
                    return;
                }
            }
            this.f107747d.set(false);
            return;
        }
        AbstractC23309i.m121914fp(1);
        m114226q();
        this.f107747d.set(false);
    }

    /* renamed from: c */
    boolean m114213c() {
        if (!TextUtils.isEmpty(CoreUtility.f89232h) && !CoreUtility.f89232h.equals("null") && !TextUtils.isEmpty(CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m114214d(int i11) {
        this.f107748e.set(i11);
        this.f107746c.sendEmptyMessage(1);
    }

    /* renamed from: f */
    Set m114215f() {
        try {
            C20131e c20131e = C20131e.f99303a;
            if (AbstractC23041d2.m118194A(c20131e.m104934P())) {
                return m114217h(AbstractC23041d2.m118196C(c20131e.m104934P()));
            }
        } catch (Exception | OutOfMemoryError e11) {
            e11.printStackTrace();
        }
        if (!AbstractC23034c6.m118121G()) {
            return null;
        }
        return new HashSet();
    }

    /* renamed from: g */
    public Set m114216g() {
        if (this.f107744a != null && !m114221l()) {
            return this.f107744a;
        }
        return null;
    }

    /* renamed from: h */
    Set m114217h(String str) {
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                hashSet.add(jSONArray.optString(i11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return hashSet;
    }

    /* renamed from: i */
    public boolean m114218i() {
        return this.f107747d.get();
    }

    /* renamed from: j */
    public boolean m114219j(String str) {
        try {
            Set m114216g = m114216g();
            if (m114216g != null) {
                return m114216g.contains(str);
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: k */
    public boolean m114220k() {
        if (!m114221l() && this.f107744a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    boolean m114221l() {
        if (System.currentTimeMillis() - AbstractC23309i.m122563x1() > AbstractC23309i.m122526w1()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void m114222m() {
        try {
            if (!m114221l()) {
                Map m42308X4 = C7960e.m41971c6().m42308X4();
                this.f107744a.clear();
                this.f107744a.addAll(m42308X4.keySet());
                this.f107745b.clear();
                Iterator it = m42308X4.entrySet().iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((Map.Entry) it.next()).getValue();
                    this.f107745b.put(bVar.f107752b, bVar.f107751a);
                }
                if (this.f107745b.size() > 0) {
                    C21913a0.m114177i().m114189p(new HashMap(this.f107745b));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    String m114223n(List list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(AbstractC23056e6.m118285k((String) it.next()));
            }
            jSONObject.put("data", jSONArray);
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    String m114224o(List list) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C31901e8) it.next()).m153298m());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONArray.toString();
    }

    /* renamed from: p */
    void m114225p() {
        try {
            C23744a.m124114c().m124116d(6089, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: q */
    void m114226q() {
        try {
            C21917c0.m114228c().m114230b();
            C23744a.m124114c().m124116d(6089, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r */
    void m114227r(String str) {
        try {
            C20131e c20131e = C20131e.f99303a;
            if (AbstractC23041d2.m118194A(c20131e.m104934P())) {
                AbstractC23041d2.m118208g(c20131e.m104934P());
            }
            AbstractC23041d2.m118201H(c20131e.m104934P(), str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ks.c$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public String f107751a;

        /* renamed from: b */
        public String f107752b;

        public b(JSONObject jSONObject) {
            this.f107751a = jSONObject.optString("phone");
            this.f107752b = jSONObject.optString("uid");
        }

        public b(String str, String str2) {
            this.f107751a = str;
            this.f107752b = str2;
        }
    }
}
