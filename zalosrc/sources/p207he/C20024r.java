package p207he;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import gg0.AbstractC19444a;
import java.util.List;
import p394oj.C24277c;
import zm.voip.service.AbstractC32273e3;

/* renamed from: he.r */
/* loaded from: classes3.dex */
public final class C20024r {

    /* renamed from: b */
    private static C20024r f98458b;

    /* renamed from: a */
    private final C20022p f98459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.r$a */
    /* loaded from: classes3.dex */
    public class a implements IVoipServiceRequestCallback {
        a() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: he.r$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public static final C20024r f98461a = new C20024r();
    }

    /* synthetic */ C20024r(AbstractC20025s abstractC20025s) {
        this();
    }

    /* renamed from: b */
    public static void m103936b() {
        try {
            if (f98458b != null) {
                AbstractC32273e3.m155748Q().mo155810I();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static C20024r m103937c() {
        if (f98458b == null) {
            f98458b = b.f98461a;
        }
        return f98458b;
    }

    /* renamed from: d */
    public static long m103938d() {
        try {
            if (f98458b != null) {
                return AbstractC32273e3.m155748Q().mo155848T();
            }
            return 0L;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: e */
    public static int m103939e() {
        try {
            if (f98458b != null) {
                return AbstractC32273e3.m155748Q().mo155860Z();
            }
            return 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public static void m103940i() {
        try {
            if (m103943l()) {
                AbstractC32273e3.m155748Q().mo116929a(0, 8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static boolean m103941j() {
        return m103942k(true);
    }

    /* renamed from: k */
    public static boolean m103942k(boolean z11) {
        try {
            if (f98458b != null) {
                return AbstractC32273e3.m155748Q().mo155795E0(z11);
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m103943l() {
        try {
            if (f98458b != null) {
                return AbstractC32273e3.m155748Q().mo155799F0();
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m103944m() {
        try {
            if (f98458b == null) {
                return false;
            }
            return AbstractC32273e3.m155748Q().m155803G0();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: n */
    public static boolean m103945n() {
        try {
            if (f98458b != null) {
                return AbstractC32273e3.m155748Q().m155807H0();
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m103946p(String str, String str2, String str3, boolean z11, int i11, String str4) {
        AbstractC32273e3.m155748Q().mo155873d1(Integer.parseInt(str), str2, str3, z11, i11, str4);
    }

    /* renamed from: s */
    public static void m103947s(boolean z11) {
        try {
            if (f98458b != null) {
                AbstractC32273e3.m155748Q().m155876e1(z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public static void m103948t() {
        try {
            AbstractC32273e3.m155748Q().m155936x1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public static void m103949w() {
        try {
            if (f98458b != null) {
                AbstractC32273e3.m155748Q().mo155893k2();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m103950f(int i11, int i12, long j11, int i13) {
        try {
            this.f98459a.sendHijackNativeCall(new a(), i11, i12, j11, i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m103951g(int i11, int i12, String str) {
        AbstractC32273e3.m155748Q().mo155920t0(i11, i12, str);
    }

    /* renamed from: h */
    public void m103952h(int i11, int i12, String str) {
        AbstractC32273e3.m155748Q().mo155924u0(i11, i12, str);
    }

    /* renamed from: o */
    public void m103953o(int i11, int i12, List list, int i13, String str, int i14, String str2) {
        AbstractC32273e3.m155748Q().mo155834O0(i11, i12, list, i13, str, i14, str2);
    }

    /* renamed from: q */
    public void m103954q(int i11, int i12, int i13, String str, String str2, String str3, List list) {
        AbstractC32273e3.m155748Q().mo155870c1(i11, i12, i13, str, str2, str3, list);
    }

    /* renamed from: r */
    public void m103955r(String str, String str2, String str3, boolean z11, int i11, String str4) {
        AbstractC19444a.m101697e(new Runnable() { // from class: he.q

            /* renamed from: p */
            public final /* synthetic */ String f98452p;

            /* renamed from: q */
            public final /* synthetic */ String f98453q;

            /* renamed from: r */
            public final /* synthetic */ String f98454r;

            /* renamed from: s */
            public final /* synthetic */ boolean f98455s;

            /* renamed from: t */
            public final /* synthetic */ int f98456t;

            /* renamed from: u */
            public final /* synthetic */ String f98457u;

            public /* synthetic */ RunnableC20023q(String str5, String str22, String str32, boolean z112, int i112, String str42) {
                r1 = str5;
                r2 = str22;
                r3 = str32;
                r4 = z112;
                r5 = i112;
                r6 = str42;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20024r.m103946p(r1, r2, r3, r4, r5, r6);
            }
        });
    }

    /* renamed from: u */
    public void m103956u(String str, C24277c c24277c, ContactProfile contactProfile) {
        AbstractC32273e3.m155748Q().mo155780A1(str, c24277c, contactProfile);
    }

    /* renamed from: v */
    public void m103957v() {
        if (!m103941j()) {
            return;
        }
        AbstractC32273e3.m155748Q().mo116930b(100);
    }

    /* renamed from: x */
    public void m103958x(String str, int i11) {
        AbstractC32273e3.m155748Q().mo155850T2(str, i11, true);
    }

    private C20024r() {
        C20022p c20022p = new C20022p();
        this.f98459a = c20022p;
        AbstractC32273e3.m155764h2(c20022p);
    }
}
