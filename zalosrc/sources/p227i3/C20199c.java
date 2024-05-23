package p227i3;

import android.content.Context;
import android.os.Looper;
import androidx.core.os.AbstractC1442h;
import com.adtima.Adtima;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p313l3.AbstractC22011d;
import p667y2.C30264a;
import p667y2.C30267d;
import p702z2.C31193a;

/* renamed from: i3.c */
/* loaded from: classes2.dex */
public class C20199c {

    /* renamed from: c */
    private static final String f99754c = "c";

    /* renamed from: d */
    private static C20199c f99755d;

    /* renamed from: e */
    public static Set f99756e;

    /* renamed from: f */
    public static HashMap f99757f;

    /* renamed from: b */
    private boolean f99759b = false;

    /* renamed from: a */
    private Context f99758a = Adtima.SharedContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.c$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f99760p;

        /* renamed from: q */
        final /* synthetic */ String f99761q;

        /* renamed from: r */
        final /* synthetic */ boolean f99762r;

        /* renamed from: i3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C32838a implements C31193a.d {
            C32838a() {
            }

            @Override // p702z2.C31193a.d
            /* renamed from: a */
            public void mo105348a(boolean z11, C31193a.e eVar) {
                if (z11 && !a.this.f99762r) {
                    C30264a.m149320k().m149323g(true);
                }
                C20199c.this.m105343f(eVar, System.currentTimeMillis());
                C20199c.this.m105338k(AbstractC22011d.m114916q(eVar.f144052b));
            }
        }

        a(String str, String str2, boolean z11) {
            this.f99760p = str;
            this.f99761q = str2;
            this.f99762r = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Adtima.m18326d(C20199c.f99754c, "------------------------");
            Adtima.m18326d(C20199c.f99754c, "doAdBlockDetect hostName : " + this.f99760p);
            new C31193a(C20199c.this.f99758a).m151991c(this.f99761q, new C32838a());
        }
    }

    private C20199c() {
    }

    /* renamed from: d */
    private void m105335d(String str) {
        try {
            Set set = f99756e;
            if (set != null) {
                set.add(str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "doAddToCheckedDomain", e11);
        }
    }

    /* renamed from: g */
    public static C20199c m105336g() {
        if (f99755d == null) {
            f99755d = new C20199c();
            f99756e = new HashSet();
            f99757f = C30264a.m149320k().m149325i();
        }
        return f99755d;
    }

    /* renamed from: i */
    private JSONObject m105337i() {
        List asList;
        JSONObject jSONObject = null;
        try {
            HashMap m149325i = C30264a.m149320k().m149325i();
            if (m149325i != null && m149325i.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (String str : m149325i.keySet()) {
                    String str2 = (String) m149325i.get(str);
                    if (str2 != null && (asList = Arrays.asList(str2.split(","))) != null && asList.size() == 6) {
                        jSONArray.put(str + "," + Integer.parseInt((String) asList.get(1)) + "," + Integer.parseInt((String) asList.get(2)) + "," + Integer.parseInt((String) asList.get(3)) + "," + Integer.parseInt((String) asList.get(4)) + "," + Integer.parseInt((String) asList.get(5)));
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject2.put("domains", jSONArray);
                    jSONObject2.put("uid", C20205i.m105364t().m105380x());
                    jSONObject2.put("uid2", C30267d.m149339A().m149347I());
                    jSONObject2.put("sdkVersion", "2.0.7.20231025_TPL67");
                    jSONObject2.put("platform", "android");
                    jSONObject2.put("siteId", C20217u.m105538N0().m105577I0());
                    jSONObject = jSONObject2;
                }
                Adtima.m18328e(f99754c, "reportAdtimaAdBlock info : " + jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m105338k(String str) {
        try {
            Set set = f99756e;
            if (set != null) {
                set.remove(str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "removeCheckingDomain", e11);
        }
    }

    /* renamed from: n */
    private void m105339n(String str) {
        HashMap hashMap;
        try {
            Adtima.m18328e(f99754c, "sendGetRequestWithAdsBlockASync : " + str);
            if (str == null || str.length() == 0 || (hashMap = f99757f) == null) {
                return;
            }
            hashMap.clear();
            C30264a.m149320k().m149324h();
            C30264a.m149320k().m149321e(System.currentTimeMillis());
            C20214r.m105487b().m105501m(str, null, 2);
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "sendGetRequestWithAdsBlockASync", e11);
        }
    }

    /* renamed from: o */
    private boolean m105340o() {
        long m149327l;
        try {
            m149327l = C30264a.m149320k().m149327l();
        } catch (Exception unused) {
        }
        if (m149327l != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Adtima.m18328e(f99754c, "shouldDoReportAdBlock : currentTime: " + currentTimeMillis + " - savedTime : " + m149327l + " - ADBLOCK_REPORT_TIME : " + AbstractC20202f.f99834r0);
            if (currentTimeMillis - m149327l <= AbstractC20202f.f99834r0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private boolean m105341p(String str) {
        String str2;
        try {
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "shouldDetectDomain", e11);
        }
        if (f99756e.contains(str)) {
            return false;
        }
        HashMap hashMap = f99757f;
        if (hashMap != null && (str2 = (String) hashMap.get(str)) != null) {
            if (System.currentTimeMillis() - Long.parseLong(str2.substring(0, str2.indexOf(","))) < AbstractC20202f.f99836s0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void m105342e(String str, boolean z11) {
        if (str != null) {
            try {
                String m114916q = AbstractC22011d.m114916q(str);
                if (m114916q == null || !m105341p(m114916q) || f99756e.contains(m114916q)) {
                    return;
                }
                m105335d(m114916q);
                AbstractC1442h.m7349a(Looper.getMainLooper()).postDelayed(new a(m114916q, str, z11), AbstractC20202f.f99840u0);
            } catch (Exception e11) {
                Adtima.m18329e(f99754c, "doAdBlockDetect", e11);
            }
        }
    }

    /* renamed from: f */
    public void m105343f(C31193a.e eVar, long j11) {
        int i11;
        int i12;
        int i13;
        int i14;
        List asList;
        try {
            HashMap hashMap = f99757f;
            if (hashMap == null || eVar == null) {
                return;
            }
            String str = (String) hashMap.get(AbstractC22011d.m114916q(eVar.f144052b));
            if (str == null || (asList = Arrays.asList(str.split(","))) == null || asList.size() != 6) {
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                i11 = Integer.parseInt((String) asList.get(1));
                Integer.parseInt((String) asList.get(2));
                i13 = Integer.parseInt((String) asList.get(3));
                i14 = Integer.parseInt((String) asList.get(4));
                i12 = Integer.parseInt((String) asList.get(5));
            }
            int i15 = i11 + 1;
            C31193a.f fVar = eVar.f144051a;
            if (fVar == C31193a.f.BY_PING) {
                i12++;
            } else if (fVar == C31193a.f.BY_LOCAL_DNS) {
                i14++;
            } else if (fVar == C31193a.f.BY_LOCAL_PROXY) {
                i13++;
            }
            f99757f.put(AbstractC22011d.m114916q(eVar.f144052b), j11 + "," + i15 + ",0," + i13 + "," + i14 + "," + i12);
            C30264a.m149320k().m149322f(f99757f);
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "doUpdateAdBlockMap", e11);
        }
    }

    /* renamed from: h */
    public String m105344h(String str) {
        try {
            String encode = URLEncoder.encode(AbstractC20198b.m105331g(str, true), "UTF-8");
            Adtima.m18326d(f99754c, "ENC Report: " + encode);
            return encode;
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "buildEncReportData", e11);
            return null;
        }
    }

    /* renamed from: j */
    public void m105345j(String str) {
        try {
            String m149348e = C30267d.m149339A().m149348e(Adtima.SharedContext);
            if (!m149348e.equals("252") && !m149348e.equals("465")) {
                return;
            }
            if (AbstractC20202f.f99828o0 && AbstractC22011d.m114913n(this.f99758a)) {
                m105342e(str, true);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "doCDNAdBlockDetect", e11);
        }
    }

    /* renamed from: l */
    public boolean m105346l() {
        try {
            this.f99759b = C30264a.m149320k().m149326j();
        } catch (Exception unused) {
        }
        return this.f99759b;
    }

    /* renamed from: m */
    public void m105347m() {
        JSONObject m105337i;
        String m105344h;
        try {
            if (!m105340o() || (m105337i = m105337i()) == null || (m105344h = m105344h(m105337i.toString())) == null) {
                return;
            }
            m105339n(AbstractC20206j.m105392h() + m105344h);
        } catch (Exception e11) {
            Adtima.m18329e(f99754c, "reportAdtimaAdBlock", e11);
        }
    }
}
