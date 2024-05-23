package p142ey;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.ToastUtils;
import d60.C17793b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p483rh.InterfaceC25792a;

/* renamed from: ey.a */
/* loaded from: classes.dex */
public class C18631a {

    /* renamed from: o */
    private static volatile C18631a f93745o;

    /* renamed from: p */
    private static final long[] f93746p = {21600000, 0, 15000, 30000, 60000, 900000, 3600000, 21600000, 86400000};

    /* renamed from: q */
    private static final Set f93747q = Collections.synchronizedSet(new HashSet());

    /* renamed from: r */
    private static final Object f93748r = new Object();

    /* renamed from: a */
    public boolean f93749a;

    /* renamed from: b */
    public boolean f93750b;

    /* renamed from: c */
    private int f93751c;

    /* renamed from: d */
    private final AtomicInteger f93752d = new AtomicInteger(1);

    /* renamed from: e */
    private final AtomicInteger f93753e = new AtomicInteger(1);

    /* renamed from: f */
    private long f93754f = 0;

    /* renamed from: g */
    public AtomicBoolean f93755g = new AtomicBoolean(false);

    /* renamed from: h */
    private final Map f93756h = Collections.synchronizedMap(new HashMap());

    /* renamed from: i */
    public final Set f93757i = Collections.synchronizedSet(new HashSet());

    /* renamed from: j */
    private final Map f93758j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public boolean f93759k = false;

    /* renamed from: l */
    boolean f93760l = false;

    /* renamed from: m */
    boolean f93761m = false;

    /* renamed from: n */
    String f93762n = "";

    /* renamed from: ey.a$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC25792a.b f93763a;

        /* renamed from: b */
        final /* synthetic */ String f93764b;

        a(InterfaceC25792a.b bVar, String str) {
            this.f93763a = bVar;
            this.f93764b = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x001e, code lost:            if (r4 == null) goto L30;     */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:            return;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    e11.printStackTrace();
                    InterfaceC25792a.b bVar = this.f93763a;
                }
            } finally {
                InterfaceC25792a.b bVar2 = this.f93763a;
                if (bVar2 != null) {
                    bVar2.mo40748m(this.f93764b);
                }
                C18631a.this.f93760l = false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:            if (r4 == null) goto L64;     */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:            r4.mo40748m(r3.f93764b);     */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:            p142ey.C18631a.this.f93760l = false;     */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:            if (r4 == null) goto L64;     */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            boolean z11;
            InterfaceC25792a.b bVar;
            InterfaceC25792a.b bVar2;
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    if (jSONObject.optInt("error_code", -1) == 0) {
                        z11 = true;
                        try {
                            try {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_notify_friend_success));
                                bVar2 = this.f93763a;
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z11) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_notify_friend_something_wrong));
                                }
                                bVar = this.f93763a;
                                if (bVar != null) {
                                    bVar.mo40748m(this.f93764b);
                                }
                                C18631a.this.f93760l = false;
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            e.printStackTrace();
                            if (!z11) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_notify_friend_something_wrong));
                            }
                            bVar2 = this.f93763a;
                        }
                    }
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_notify_friend_something_wrong));
                bVar2 = this.f93763a;
            } catch (Exception e12) {
                e = e12;
                z11 = false;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
                if (!z11) {
                }
                bVar = this.f93763a;
                if (bVar != null) {
                }
                C18631a.this.f93760l = false;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ey.a$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f93766a;

        b(String str) {
            this.f93766a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42543t8(this.f93766a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ey.a$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f93767a;

        c(String str) {
            this.f93767a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42457lc(this.f93767a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ey.a$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC0939u {
        d() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42607zb();
        }
    }

    /* renamed from: ey.a$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f93768a;

        e(int i11) {
            this.f93768a = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20887g.m109229g(124500, 124507, "");
            if (c20096c.m104491c() == -69) {
                C18631a.this.f93752d.set(0);
            } else if (C18631a.this.f93752d.incrementAndGet() >= C18631a.f93746p.length) {
                C18631a.this.f93752d.set(1);
            }
            C18631a.this.f93761m = false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00c3, code lost:            if (r8 == false) goto L94;     */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:            if (r2 != false) goto L95;     */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            boolean z11;
            JSONObject optJSONObject;
            AbstractC20887g.m109229g(124500, 124506, "");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.optInt("error_code") == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    if (this.f93768a <= 1) {
                        C18631a.this.f93757i.clear();
                    }
                    boolean m98464w = C18631a.this.m98464w(optJSONObject);
                    try {
                        if (m98464w) {
                            C18631a.this.f93753e.set(this.f93768a + 1);
                        } else {
                            C18631a.this.f93753e.set(1);
                            ArrayList arrayList = new ArrayList();
                            for (String str : new HashSet(C18631a.this.f93756h.keySet())) {
                                if (!C18631a.this.f93757i.contains(str)) {
                                    arrayList.add(str);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C18631a.this.f93756h.remove((String) it.next());
                                }
                                C18631a.this.m98460r();
                                C7960e.m41971c6().m42447kc(arrayList);
                            }
                            C18631a.this.f93757i.clear();
                        }
                    } catch (Exception e11) {
                        z11 = m98464w;
                        e = e11;
                        try {
                            e.printStackTrace();
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z11) {
                                AbstractC23309i.m122514vq(System.currentTimeMillis());
                            }
                            C18631a.this.f93752d.set(1);
                            C18631a.this.f93761m = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        z11 = m98464w;
                        th = th3;
                        if (!z11) {
                        }
                        C18631a.this.f93752d.set(1);
                        C18631a.this.f93761m = false;
                        throw th;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                z11 = false;
            } catch (Throwable th4) {
                th = th4;
                z11 = false;
            }
            AbstractC23309i.m122514vq(System.currentTimeMillis());
            C18631a.this.f93752d.set(1);
            C18631a.this.f93761m = false;
        }
    }

    C18631a() {
        boolean z11;
        this.f93749a = false;
        this.f93750b = false;
        if (AbstractC23309i.m122453u2() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f93749a = z11;
        this.f93750b = AbstractC23309i.m122454u3() == 1;
        this.f93751c = AbstractC23309i.m120782B8();
        m98449o();
    }

    /* renamed from: h */
    public static void m98445h() {
        f93747q.addAll(C7960e.m41971c6().m42472n5());
    }

    /* renamed from: i */
    public static synchronized C18631a m98446i() {
        C18631a c18631a;
        C18631a c18631a2;
        synchronized (C18631a.class) {
            c18631a = f93745o;
            if (c18631a == null) {
                synchronized (f93748r) {
                    try {
                        c18631a2 = f93745o;
                        if (c18631a2 == null) {
                            c18631a2 = new C18631a();
                            f93745o = c18631a2;
                        }
                    } finally {
                    }
                }
                c18631a = c18631a2;
            }
        }
        return c18631a;
    }

    /* renamed from: m */
    public static boolean m98447m(String str) {
        try {
            if (TextUtils.isEmpty(str) || str.startsWith("action_") || AbstractC25495a.m132079d(str) || str.startsWith("livestream_") || str.startsWith("-") || AbstractC25495a.m132083h(str) || AbstractC23309i.m122453u2() != 1) {
                return false;
            }
            if (!AbstractC21935u.m114558y(str)) {
                if (AbstractC23309i.m122454u3() != 1) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: n */
    public static boolean m98448n(String str) {
        return f93747q.contains(str);
    }

    /* renamed from: o */
    private void m98449o() {
        try {
            this.f93756h.clear();
            C17793b.m93923d().m93928h();
            this.f93756h.putAll(C7960e.m41971c6().m42240Q4());
            C17793b.m93923d().m93927g();
            this.f93755g.set(true);
            this.f93758j.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public static void m98450u() {
        f93747q.clear();
        C0824j.m2153b(new d());
    }

    /* renamed from: x */
    public static void m98451x(String str, boolean z11) {
        if (z11) {
            Set set = f93747q;
            if (!set.contains(str)) {
                set.add(str);
            }
            C0824j.m2153b(new b(str));
            return;
        }
        Set set2 = f93747q;
        if (set2.contains(str)) {
            set2.remove(str);
        }
        C0824j.m2153b(new c(str));
    }

    /* renamed from: e */
    public void m98452e(String str, String str2) {
        m98457l(str, str2);
    }

    /* renamed from: f */
    public void m98453f() {
        if (!m98446i().f93749a) {
            m98458p("enableFeature");
            return;
        }
        if (this.f93761m) {
            m98458p("isGettingListAlias");
            return;
        }
        if (System.currentTimeMillis() - AbstractC23309i.m121630Y5() > 604800000) {
            if (AbstractC23304d.f113427q1.get()) {
                m98458p("isDoingLogout");
                return;
            }
            if (AbstractC23304d.f113431r1.get()) {
                m98458p("isWaitingRestoreMsgFlow");
            } else if (System.currentTimeMillis() - this.f93754f >= f93746p[this.f93752d.get()]) {
                this.f93754f = System.currentTimeMillis();
                m98455j(this.f93753e.get());
            }
        }
    }

    /* renamed from: g */
    public String m98454g(String str) {
        if (!this.f93749a || TextUtils.isEmpty(str) || AbstractC25495a.m132078c(str)) {
            return null;
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f93756h.containsKey(str)) {
            if (!this.f93750b && !C18644n.m98531l().m98558u(str)) {
                return null;
            }
            return (String) this.f93756h.get(str);
        }
        if (!this.f93755g.get()) {
            if (this.f93758j.containsKey(str)) {
                return (String) this.f93758j.get(str);
            }
            this.f93758j.put(str, "");
            String m42425ib = C7960e.m41971c6().m42425ib(str);
            if (!TextUtils.isEmpty(m42425ib)) {
                this.f93758j.put(str, m42425ib);
            }
            return m42425ib;
        }
        return null;
    }

    /* renamed from: j */
    void m98455j(int i11) {
        this.f93761m = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(i11));
        AbstractC20887g.m109229g(124500, 124505, "PageIndex: " + i11);
        c0766k.mo1758v6(i11);
    }

    /* renamed from: k */
    public int m98456k() {
        return this.f93751c;
    }

    /* renamed from: l */
    void m98457l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            this.f93756h.remove(str);
            C7960e.m41971c6().m42435jb(str);
        } else {
            this.f93756h.put(str, str2);
            C7960e.m41971c6().m42509q7(str, str2);
        }
    }

    /* renamed from: p */
    void m98458p(String str) {
        if (!this.f93762n.equals(str)) {
            this.f93762n = str;
            AbstractC20887g.m109229g(124500, 124509, str);
        }
    }

    /* renamed from: q */
    public void m98459q() {
        this.f93752d.set(1);
        this.f93753e.set(1);
        this.f93754f = 0L;
        this.f93757i.clear();
        this.f93758j.clear();
        AbstractC23309i.m122514vq(0L);
        m98462t();
    }

    /* renamed from: r */
    public void m98460r() {
        this.f93759k = true;
        C23744a.m124114c().m124116d(6075, new Object[0]);
    }

    /* renamed from: s */
    public void m98461s(String str, InterfaceC25792a.b bVar) {
        try {
            if (!this.f93749a) {
                ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_unsupport));
                return;
            }
            if (TextUtils.isEmpty(m98446i().m98454g(str))) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_notify_friend_empty_alias));
                return;
            }
            if (this.f93760l) {
                return;
            }
            if (bVar != null) {
                bVar.mo40752q(str);
            }
            this.f93760l = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(bVar, str));
            c0766k.mo1454I8(Integer.parseInt(str), m98446i().m98454g(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public void m98462t() {
        try {
            AbstractC20887g.m109229g(124500, 124508, "");
            this.f93756h.clear();
            C7960e.m41971c6().m42446kb();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public void m98463v(int i11) {
        this.f93751c = i11;
        AbstractC23309i.m121956gt(i11);
    }

    /* renamed from: w */
    public boolean m98464w(JSONObject jSONObject) {
        boolean optBoolean;
        AbstractC20887g.m109229g(124500, 124503, "");
        boolean z11 = false;
        try {
            try {
                optBoolean = jSONObject.optBoolean("loadMore", false);
            } catch (Exception e11) {
                e = e11;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("aliases");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    if (length > 0) {
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                            if (optJSONObject != null) {
                                String valueOf = String.valueOf(optJSONObject.getInt("userId"));
                                String string = optJSONObject.getString("alias");
                                m98457l(valueOf, string);
                                if (!TextUtils.isEmpty(string)) {
                                    this.f93757i.add(valueOf);
                                }
                            }
                        }
                        m98460r();
                    }
                    AbstractC20887g.m109229g(124500, 124504, String.format("Size: %d, Loadmore: %d", Integer.valueOf(length), Integer.valueOf(optBoolean ? 1 : 0)));
                }
                this.f93755g.set(true);
                return optBoolean;
            } catch (Exception e12) {
                e = e12;
                z11 = optBoolean ? 1 : 0;
                AbstractC20887g.m109229g(124500, 124511, e.toString());
                e.printStackTrace();
                this.f93755g.set(true);
                return z11;
            }
        } catch (Throwable th2) {
            this.f93755g.set(true);
            throw th2;
        }
    }
}
