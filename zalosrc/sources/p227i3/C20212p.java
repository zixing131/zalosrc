package p227i3;

import com.adtima.Adtima;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p047c3.C3228a;
import p313l3.AbstractC22011d;
import p667y2.C30267d;
import p667y2.C30269f;

/* renamed from: i3.p */
/* loaded from: classes2.dex */
public class C20212p {

    /* renamed from: a */
    private static final String f99950a = "p";

    /* renamed from: b */
    private static C20212p f99951b = null;

    /* renamed from: c */
    private static Queue f99952c = null;

    /* renamed from: d */
    private static boolean f99953d = false;

    /* renamed from: e */
    private static boolean f99954e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.p$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC0008c {
        a() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            try {
                boolean unused = C20212p.f99953d = true;
                while (C20212p.f99952c.size() > 0) {
                    C30269f.m149375b().m149379f((C3228a) C20212p.f99952c.remove());
                }
                boolean unused2 = C20212p.f99953d = false;
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(C20212p.f99950a, "saveToCache", e11);
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Void r22) {
            String m149348e = C30267d.m149339A().m149348e(Adtima.SharedContext);
            if ((m149348e.equals("252") || m149348e.equals("465")) && AbstractC20202f.f99842v0 && AbstractC22011d.m114913n(Adtima.SharedContext)) {
                C20212p.this.m105477p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.p$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ JSONObject f99956p;

        b(JSONObject jSONObject) {
            this.f99956p = jSONObject;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground() {
            boolean z11 = false;
            try {
                JSONArray jSONArray = new JSONArray();
                Set m149380g = C30269f.m149375b().m149380g();
                HashSet hashSet = new HashSet();
                hashSet.addAll(m149380g);
                Iterator it = m149380g.iterator();
                int i11 = 0;
                while (it.hasNext() && (i11 = i11 + 1) <= AbstractC20202f.f99844w0) {
                    String str = (String) it.next();
                    jSONArray.put(str);
                    hashSet.remove(str);
                }
                C30269f.m149375b().m149377d(hashSet);
                if (jSONArray.length() > 0) {
                    this.f99956p.put("adLoad", jSONArray);
                    this.f99956p.put("sdkVersion", "2.0.7.20231025_TPL67");
                    this.f99956p.put("platform", "android");
                }
                z11 = true;
            } catch (Exception e11) {
                Adtima.m18329e(C20212p.f99950a, "submitQoS", e11);
            }
            return Boolean.valueOf(z11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            boolean unused = C20212p.f99954e = false;
            if (bool.booleanValue()) {
                C30269f.m149375b().m149376c(System.currentTimeMillis() + AbstractC20202f.f99848y0);
                C20212p.this.m105466k(AbstractC20206j.m105394j() + C20212p.this.m105474e(this.f99956p.toString()));
            }
        }
    }

    private C20212p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m105466k(String str) {
        try {
            Adtima.m18328e(f99950a, "ADTIMA - sendGetRequestWithQoSASync : " + str);
            if (str == null || str.length() == 0) {
                return;
            }
            C20214r.m105487b().m105501m(str, null, 2);
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "sendGetRequestWithAdsBlockASync", e11);
        }
    }

    /* renamed from: m */
    public static C20212p m105468m() {
        if (f99951b == null) {
            f99951b = new C20212p();
            f99952c = new LinkedList();
        }
        return f99951b;
    }

    /* renamed from: n */
    private void m105469n() {
        try {
            if ((f99952c != null) && (true ^ f99953d)) {
                C0009d.m11g(new a());
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "addToList", e11);
        }
    }

    /* renamed from: a */
    public C3228a m105470a(C3228a c3228a, String str) {
        C3228a c3228a2;
        Exception e11;
        boolean z11;
        try {
            z11 = AbstractC20202f.f99842v0;
        } catch (Exception e12) {
            c3228a2 = c3228a;
            e11 = e12;
        }
        if (!z11) {
            return null;
        }
        if (c3228a != null || !z11) {
            return c3228a;
        }
        c3228a2 = new C3228a();
        try {
            c3228a2.m16376j(str);
            c3228a2.m16378l(0L);
            c3228a2.m16368b(0L);
        } catch (Exception e13) {
            e11 = e13;
            Adtima.m18329e(f99950a, "setUpEntityWhenSchedule", e11);
            return c3228a2;
        }
        return c3228a2;
    }

    /* renamed from: b */
    public C3228a m105471b(C3228a c3228a, String str, boolean z11) {
        try {
            if (AbstractC20202f.f99842v0 && c3228a != null) {
                c3228a.m16372f(System.currentTimeMillis());
                c3228a.m16373g(str);
                c3228a.m16370d(z11);
                c3228a.m16384r(System.currentTimeMillis());
                m105475g(c3228a);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "setResultRenderAd", e11);
        }
        return null;
    }

    /* renamed from: c */
    public C3228a m105472c(C3228a c3228a, boolean z11) {
        try {
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "setResultScheduleAd", e11);
        }
        if (!AbstractC20202f.f99842v0) {
            return null;
        }
        if (c3228a != null) {
            c3228a.m16375i(System.currentTimeMillis());
            if (z11) {
                c3228a.m16379m(System.currentTimeMillis());
            } else {
                c3228a.m16379m(-1L);
                c3228a.m16384r(System.currentTimeMillis());
                m105475g(c3228a);
                c3228a = null;
            }
        }
        return c3228a;
    }

    /* renamed from: d */
    public C3228a m105473d(C3228a c3228a, boolean z11, boolean z12) {
        try {
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "setResultGetAd", e11);
        }
        if (!AbstractC20202f.f99842v0) {
            return null;
        }
        if (c3228a != null) {
            c3228a.m16368b(System.currentTimeMillis());
            if (!z12) {
                c3228a.m16382p(-1L);
                c3228a.m16379m(-1L);
                c3228a.m16384r(System.currentTimeMillis());
                m105475g(c3228a);
                c3228a = null;
            } else if (z11) {
                c3228a.m16378l(-1L);
            }
        }
        return c3228a;
    }

    /* renamed from: e */
    public String m105474e(String str) {
        try {
            String encode = URLEncoder.encode(AbstractC20198b.m105331g(str, false), "UTF-8");
            Adtima.m18326d(f99950a, "ADTIMA - ENC Report: " + encode);
            return encode;
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "buildEncReportData", e11);
            return null;
        }
    }

    /* renamed from: g */
    public void m105475g(C3228a c3228a) {
        try {
            Queue queue = f99952c;
            if (queue != null) {
                queue.add(c3228a);
                m105469n();
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "saveProfileAds", e11);
        }
    }

    /* renamed from: o */
    public boolean m105476o() {
        try {
            if (f99954e || System.currentTimeMillis() < C30269f.m149375b().m149378e()) {
                return false;
            }
            return C30269f.m149375b().m149381h() >= AbstractC20202f.f99844w0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    public void m105477p() {
        try {
            if (m105476o()) {
                f99954e = true;
                C0009d.m11g(new b(new JSONObject()));
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99950a, "submitQoS", e11);
        }
    }
}
