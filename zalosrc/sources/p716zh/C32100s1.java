package p716zh;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nh0.C23793c;
import org.json.JSONObject;
import p142ey.C18644n;
import p348mi.AbstractC23309i;
import p364nj.C23801b;

/* renamed from: zh.s1 */
/* loaded from: classes3.dex */
public class C32100s1 {

    /* renamed from: a */
    private final Map f147984a;

    /* renamed from: b */
    private Map f147985b;

    /* renamed from: c */
    private boolean f147986c;

    /* renamed from: d */
    private boolean f147987d;

    /* renamed from: zh.s1$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo60323a();

        /* renamed from: b */
        void mo60324b(String str, int i11);

        /* renamed from: c */
        void mo60325c(int i11, int i12, C23801b c23801b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zh.s1$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public static final C32100s1 f147988a = new C32100s1();
    }

    /* renamed from: b */
    private void m154952b(C23801b c23801b, int i11, int i12, boolean z11, String str, a aVar) {
        String str2;
        int i13;
        int i14;
        if (c23801b == null) {
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                str2 = "";
            } else {
                str2 = c23801b.f115039f;
            }
        } else {
            str2 = c23801b.f115038e;
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo60324b(str2, i11);
        }
        if (c23801b.f115036c == 0) {
            return;
        }
        long mo124311f = C23793c.m124316k().mo124311f();
        if (this.f147985b == null) {
            this.f147985b = new HashMap();
        }
        HashMap hashMap = (HashMap) this.f147985b.get(str);
        if (i11 == 1) {
            i13 = 101;
        } else {
            i13 = 100;
        }
        if (i11 == 1) {
            i14 = 103;
        } else {
            i14 = 102;
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        int i15 = c23801b.f115036c;
        if (i15 == 0) {
            return;
        }
        if ((i15 & 1) == 1 && z11 && !this.f147987d) {
            aVar.mo60325c(1, i11, c23801b);
        }
        if ((i15 & 2) == 2 && z11 && !this.f147987d) {
            aVar.mo60325c(2, i11, c23801b);
        }
        if ((i15 & 4) == 4 && z11 && i12 > 0) {
            Long l11 = (Long) hashMap.get(Integer.valueOf(i13));
            if (!hashMap.containsKey(Integer.valueOf(i13)) || l11 == null) {
                l11 = Long.valueOf("0");
            }
            if (l11.longValue() + 300000 < mo124311f) {
                aVar.mo60325c(4, i11, c23801b);
                hashMap.put(Integer.valueOf(i13), Long.valueOf(mo124311f));
                this.f147985b.put(str, hashMap);
            }
        }
        if ((i15 & 8) == 8 && z11 && i12 > 0) {
            Long l12 = (Long) hashMap.get(Integer.valueOf(i14));
            if (!hashMap.containsKey(Integer.valueOf(i14)) || l12 == null) {
                l12 = Long.valueOf("0");
            }
            if (l12.longValue() + 300000 < mo124311f) {
                aVar.mo60325c(8, i11, c23801b);
                hashMap.put(Integer.valueOf(i14), Long.valueOf(mo124311f));
                this.f147985b.put(str, hashMap);
            }
        }
        if ((i15 & 16) == 16 && z11) {
            aVar.mo60325c(16, i11, c23801b);
        }
    }

    /* renamed from: d */
    public static C32100s1 m154953d() {
        return b.f147988a;
    }

    /* renamed from: g */
    private void m154954g(C23801b c23801b, int i11, boolean z11, String str, a aVar) {
        try {
            long j11 = c23801b.f115040g * 1000;
            long j12 = c23801b.f115041h * 1000;
            if (C23793c.m124316k().mo124311f() >= j11 && C23793c.m124316k().mo124311f() <= j11 + j12) {
                int i12 = c23801b.f115037d;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            m154952b(c23801b, 1, i11, z11, str, aVar);
                            m154952b(c23801b, 2, i11, z11, str, aVar);
                        }
                    } else {
                        m154952b(c23801b, 2, i11, z11, str, aVar);
                    }
                } else {
                    m154952b(c23801b, 1, i11, z11, str, aVar);
                }
            } else {
                aVar.mo60323a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m154955h(int i11, String str, boolean z11, String str2) {
        Map map;
        synchronized (this) {
            try {
                map = this.f147984a;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (map == null) {
                return;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        map.clear();
                        m154957l(str, z11);
                        m154958m(str2, z11);
                    }
                } else {
                    map.remove(2);
                    m154958m(str2, z11);
                }
            } else {
                map.remove(1);
                m154957l(str, z11);
            }
        }
    }

    /* renamed from: k */
    private void m154956k(final int i11, final String str, final String str2, final boolean z11) {
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: zh.r1
            @Override // java.lang.Runnable
            public final void run() {
                C32100s1.this.m154955h(i11, str, z11, str2);
            }
        });
    }

    /* renamed from: l */
    private void m154957l(String str, boolean z11) {
        try {
            if (!this.f147984a.containsKey(1)) {
                if (z11) {
                    str = AbstractC23309i.m120812C1();
                } else {
                    AbstractC23309i.m121089Jj(str);
                }
                if (str != null && !TextUtils.isEmpty(str)) {
                    this.f147984a.put(1, new C23801b(new JSONObject(str), 1));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    private void m154958m(String str, boolean z11) {
        try {
            if (!this.f147984a.containsKey(2)) {
                if (z11) {
                    str = AbstractC23309i.m120849D1();
                } else {
                    AbstractC23309i.m121126Kj(str);
                }
                if (str != null && !TextUtils.isEmpty(str)) {
                    this.f147984a.put(2, new C23801b(new JSONObject(str), 2));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m154959c() {
        this.f147985b.clear();
        this.f147984a.clear();
    }

    /* renamed from: e */
    public C23801b m154960e(int i11) {
        return (C23801b) this.f147984a.get(Integer.valueOf(i11));
    }

    /* renamed from: f */
    public void m154961f(int i11, String str, a aVar, boolean z11) {
        Map map;
        C23801b c23801b;
        try {
            if (!C18644n.m98531l().m98558u(str)) {
                return;
            }
            if (!z11) {
                aVar.mo60325c(0, 1, null);
                aVar.mo60325c(0, 2, null);
            }
            if ((!this.f147986c || !this.f147987d) && (map = this.f147984a) != null && !map.isEmpty()) {
                if (this.f147984a.containsKey(2)) {
                    c23801b = (C23801b) this.f147984a.get(2);
                    if (c23801b != null && (!c23801b.f115043j.contains(str) || !c23801b.f115035b)) {
                        if (this.f147984a.containsKey(1)) {
                            c23801b = (C23801b) this.f147984a.get(1);
                        } else {
                            return;
                        }
                    }
                } else if (this.f147984a.containsKey(1)) {
                    c23801b = (C23801b) this.f147984a.get(1);
                } else {
                    return;
                }
                C23801b c23801b2 = c23801b;
                if (c23801b2 == null || !c23801b2.f115035b) {
                    return;
                }
                m154954g(c23801b2, i11, z11, str, aVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m154962i(String str, String str2) {
        m154956k(3, str, str2, false);
    }

    /* renamed from: j */
    public void m154963j() {
        m154956k(3, "", "", true);
    }

    /* renamed from: n */
    public void m154964n(String str) {
        m154956k(1, str, "", false);
    }

    /* renamed from: o */
    public void m154965o(String str) {
        m154956k(2, "", str, false);
    }

    /* renamed from: p */
    public void m154966p(boolean z11) {
        this.f147986c = z11;
    }

    /* renamed from: q */
    public void m154967q(boolean z11) {
        this.f147987d = z11;
    }

    /* renamed from: r */
    public void m154968r() {
        this.f147986c = false;
        this.f147987d = false;
    }

    /* renamed from: s */
    public synchronized void m154969s(C23801b c23801b) {
        try {
            if (c23801b == null) {
                return;
            }
            try {
                String str = "";
                String str2 = "";
                int i11 = c23801b.f115044k;
                if (i11 == 1) {
                    this.f147984a.put(1, c23801b);
                    JSONObject m124370a = c23801b.m124370a();
                    if (m124370a != null) {
                        str = m124370a.toString();
                    }
                } else if (i11 == 2) {
                    this.f147984a.put(2, c23801b);
                    JSONObject m124370a2 = c23801b.m124370a();
                    if (m124370a2 != null) {
                        str2 = m124370a2.toString();
                    }
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    m154962i(str, str2);
                } else if (!TextUtils.isEmpty(str)) {
                    m154964n(str);
                } else if (!TextUtils.isEmpty(str2)) {
                    m154965o(str2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private C32100s1() {
        this.f147986c = false;
        this.f147987d = false;
        this.f147984a = Collections.synchronizedMap(new HashMap());
        this.f147985b = Collections.synchronizedMap(new HashMap());
    }
}
