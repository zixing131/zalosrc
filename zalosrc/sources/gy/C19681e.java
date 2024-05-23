package gy;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.C4070a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.service.ZaloBackgroundService;
import en0.InterfaceC18494a;
import fh0.AbstractC18942g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gy.C19681e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23138m0;
import mm0.AbstractC23350e;
import nh0.C23793c;
import p221hy.C20166b;
import p221hy.InterfaceC20165a;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p609wh.C29018k;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vg.AbstractC28105j8;

/* renamed from: gy.e */
/* loaded from: classes.dex */
public final class C19681e {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final String f97641a = C19681e.class.getSimpleName();

    /* renamed from: b */
    private static final AtomicBoolean f97642b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final InterfaceC24854k f97643c;

    /* renamed from: gy.e$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f97644q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19681e mo12V4() {
            return c.f97645a.m103277a();
        }
    }

    /* renamed from: gy.e$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19681e m103275a() {
            return (C19681e) C19681e.f97643c.getValue();
        }

        /* renamed from: b */
        public final AtomicBoolean m103276b() {
            return C19681e.f97642b;
        }
    }

    /* renamed from: gy.e$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f97645a = new c();

        /* renamed from: b */
        private static final C19681e f97646b = new C19681e();

        private c() {
        }

        /* renamed from: a */
        public final C19681e m103277a() {
            return f97646b;
        }
    }

    /* renamed from: gy.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends Thread {

        /* renamed from: p */
        private final Context f97647p;

        /* renamed from: q */
        private final AtomicBoolean f97648q;

        public d(Context context, AtomicBoolean atomicBoolean) {
            AbstractC19074t.m100208f(context, "mContext");
            AbstractC19074t.m100208f(atomicBoolean, "wakeUpBy");
            this.f97647p = context;
            this.f97648q = atomicBoolean;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f97648q.set(true);
                AbstractC23304d.m120554y();
                if (!ZaloBackgroundService.m50458i(this.f97647p)) {
                    AbstractC28105j8.m141584f(this.f97647p);
                } else if (!C29628e.m147249E0().m93432x()) {
                    AbstractC29633j.m147365n();
                }
                if (C29628e.m147249E0().m93373A()) {
                    AbstractC20110a.f98889a.mo104548a("native handle connection change!", new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: gy.e$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f97649a;

        e(String str) {
            this.f97649a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC20110a.f98889a.mo104556o(8, C19681e.f97641a + " : Submit token failed: error=" + c20096c.m104491c(), new Object[0]);
            b bVar = C19681e.Companion;
            synchronized (bVar.m103276b()) {
                try {
                    bVar.m103276b().set(false);
                    C20166b.a aVar = C20166b.Companion;
                    if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                        AbstractC23309i.m121319Pr(System.currentTimeMillis() - 604500000);
                    } else if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                        AbstractC23309i.m121356Qr(System.currentTimeMillis() - 604500000);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC20110a.f98889a.mo104556o(8, C19681e.f97641a + " : Submit token OK: " + obj + ", with token " + this.f97649a, new Object[0]);
            b bVar = C19681e.Companion;
            AtomicBoolean m103276b = bVar.m103276b();
            String str = this.f97649a;
            synchronized (m103276b) {
                try {
                    bVar.m103276b().set(false);
                    C20166b.a aVar = C20166b.Companion;
                    if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                        AbstractC23309i.m121582Wv(str);
                        AbstractC23309i.m121319Pr(System.currentTimeMillis());
                    } else if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                        AbstractC23309i.m121686Zo(str);
                        AbstractC23309i.m121356Qr(System.currentTimeMillis());
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: gy.e$f */
    /* loaded from: classes.dex */
    public static final class f implements C20166b.d {
        f() {
        }

        /* renamed from: g */
        public static final void m103279g(Context context, String str) {
            AbstractC19074t.m100208f(context, "$context");
            AbstractC19074t.m100208f(str, "$registrationId");
            try {
                AbstractC18942g.m99260p(context, str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // p221hy.C20166b.d
        /* renamed from: a */
        public void mo103280a(InterfaceC20165a.a aVar, String str) {
            String str2;
            AbstractC19074t.m100208f(aVar, "cloudType");
            AbstractC19074t.m100208f(str, "tokenServer");
            C20166b.a aVar2 = C20166b.Companion;
            if (aVar != aVar2.m105162b().m105152d()) {
                return;
            }
            try {
                if (AbstractC23138m0.Companion.m118777d() && !TextUtils.isEmpty(str)) {
                    InterfaceC20165a.a m105152d = aVar2.m105162b().m105152d();
                    InterfaceC20165a.a aVar3 = InterfaceC20165a.a.f99531p;
                    if (m105152d == aVar3) {
                        str2 = AbstractC23309i.m121749bb();
                    } else if (aVar2.m105162b().m105152d() != InterfaceC20165a.a.f99532q) {
                        str2 = "";
                    } else {
                        str2 = AbstractC23309i.m120963G4();
                    }
                    C20166b m105162b = aVar2.m105162b();
                    MainApplication.C6895a c6895a = MainApplication.Companion;
                    String m105151c = m105162b.m105151c(c6895a.m35500c());
                    if (TextUtils.isEmpty(m105151c)) {
                        AbstractC20887g.m109217D(266003, null, 2, null);
                        return;
                    }
                    if (!AbstractC19074t.m100204b(str, m105151c)) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (aVar2.m105162b().m105152d() == aVar3) {
                                AbstractC23309i.m121582Wv("");
                                AbstractC23309i.m121319Pr(0L);
                            } else if (aVar2.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                                AbstractC23309i.m121686Zo("");
                                AbstractC23309i.m121356Qr(0L);
                            }
                        }
                        AbstractC20887g.m109217D(266004, null, 2, null);
                        return;
                    }
                    AbstractC20110a.f98889a.mo104556o(8, "deleteInstanceId tokenServer=" + str, new Object[0]);
                    aVar2.m105162b().m105150b(c6895a.m35500c());
                    AbstractC20887g.m109217D(266002, null, 2, null);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // p221hy.C20166b.d
        /* renamed from: b */
        public void mo103281b(InterfaceC20165a.a aVar, Context context, String str) {
            AbstractC19074t.m100208f(aVar, "cloudType");
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, "registrationId");
            C20166b.a aVar2 = C20166b.Companion;
            if (aVar != aVar2.m105162b().m105152d()) {
                return;
            }
            if (AbstractC23304d.m120544o()) {
                AbstractC20110a.f98889a.mo104556o(8, "onRegistered " + str, new Object[0]);
            }
            AbstractC20110a.f98889a.mo104554k("onRegistered: " + str, new Object[0]);
            C19681e.this.m103268f(str);
            if (aVar2.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gy.f

                    /* renamed from: p */
                    public final /* synthetic */ Context f97651p;

                    /* renamed from: q */
                    public final /* synthetic */ String f97652q;

                    public /* synthetic */ RunnableC19682f(Context context2, String str2) {
                        r1 = context2;
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19681e.f.m103279g(r1, r2);
                    }
                });
            }
        }

        @Override // p221hy.C20166b.d
        /* renamed from: c */
        public void mo103282c(InterfaceC20165a.a aVar) {
            AbstractC19074t.m100208f(aVar, "cloudType");
            if (aVar != C20166b.Companion.m105162b().m105152d()) {
                return;
            }
            AbstractC20887g.m109217D(266001, null, 2, null);
        }

        @Override // p221hy.C20166b.d
        /* renamed from: d */
        public void mo103283d(InterfaceC20165a.a aVar, Context context, Map map, long j11) {
            int i11;
            AbstractC19074t.m100208f(aVar, "cloudType");
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(map, "data");
            if (aVar == C20166b.Companion.m105162b().m105152d()) {
                try {
                    String unused = C19681e.f97641a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received message. Extras: ");
                    sb2.append(map);
                    long mo124310e = C23793c.Companion.m124321a().mo124310e();
                    long abs = Math.abs(mo124310e - j11);
                    AbstractC20887g.m109216C(200000, null, j11, mo124310e, abs);
                    if (!map.containsKey("content")) {
                        return;
                    }
                    if (C29628e.m147249E0().m147261M0()) {
                        String unused2 = C19681e.f97641a;
                        return;
                    }
                    String str = (String) map.get("content");
                    if (map.containsKey("cmd")) {
                        Object obj = map.get("cmd");
                        AbstractC19074t.m100205c(obj);
                        i11 = Integer.parseInt((String) obj);
                    } else {
                        i11 = -1;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C29018k.m144898c().m144901e(str, i11, abs);
                    }
                    if (i11 > 0 && i11 < 66000) {
                        AbstractC20887g.m109246x(i11 + 200000, j11);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        @Override // p221hy.C20166b.d
        /* renamed from: e */
        public void mo103284e(InterfaceC20165a.a aVar, Context context, String str) {
            AbstractC19074t.m100208f(aVar, "cloudType");
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, "registrationId");
            C20166b.a aVar2 = C20166b.Companion;
            if (aVar != aVar2.m105162b().m105152d()) {
                return;
            }
            if (AbstractC23304d.m120544o()) {
                AbstractC20110a.f98889a.mo104556o(8, "onUnregistered " + str, new Object[0]);
            }
            String unused = C19681e.f97641a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onUnregistered: ");
            sb2.append(str);
            C19681e.this.m103273l();
            if (aVar2.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                AbstractC23309i.m121582Wv("");
            } else if (aVar2.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                AbstractC23309i.m121686Zo("");
            }
        }
    }

    /* renamed from: gy.e$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {
        g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC20110a.f98889a.mo104556o(8, C19681e.f97641a + " : Submit token failed: error=" + c20096c.m104491c(), new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            String unused = C19681e.f97641a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("removeTokenFCM success:");
            sb2.append(obj);
            AbstractC20110a.f98889a.mo104556o(8, C19681e.f97641a + " : removeTokenFCM token OK: " + obj, new Object[0]);
            C20166b.a aVar = C20166b.Companion;
            if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                AbstractC23309i.m121582Wv("");
            } else if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                AbstractC23309i.m121686Zo("");
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f97644q);
        f97643c = m129210a;
    }

    /* renamed from: h */
    public static final void m103266h(C19681e c19681e) {
        long j11;
        AbstractC19074t.m100208f(c19681e, "this$0");
        try {
            C20166b.a aVar = C20166b.Companion;
            InterfaceC20165a.a m105152d = aVar.m105162b().m105152d();
            InterfaceC20165a.a aVar2 = InterfaceC20165a.a.f99531p;
            if (m105152d == aVar2) {
                j11 = AbstractC23309i.m122347r7();
            } else if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                j11 = AbstractC23309i.m122384s7();
            } else {
                j11 = 0;
            }
            if (Math.abs(System.currentTimeMillis() - (j11 + 604800000)) < 300000) {
                if (aVar.m105162b().m105152d() == aVar2) {
                    AbstractC23309i.m121319Pr(0L);
                } else if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                    AbstractC23309i.m121356Qr(0L);
                }
                c19681e.m103268f(aVar.m105162b().m105151c(MainApplication.Companion.m35500c()));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public final void m103267e() {
        MainApplication.C6895a c6895a = MainApplication.Companion;
        if (!m103272k(c6895a.m35500c())) {
            C20166b.Companion.m105162b().m105153e(c6895a.m35500c(), InterfaceC20165a.a.f99532q);
        }
    }

    /* renamed from: f */
    public final void m103268f(String str) {
        long j11;
        int i11;
        AbstractC19074t.m100208f(str, "token");
        if (!AbstractC23138m0.Companion.m118777d() || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = f97641a;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(str));
        AtomicBoolean atomicBoolean = f97642b;
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.get()) {
                    return;
                }
                String str3 = "";
                String str4 = "";
                C20166b.a aVar = C20166b.Companion;
                if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                    str3 = AbstractC23309i.m121749bb();
                    j11 = AbstractC23309i.m122347r7();
                    str4 = "fcm";
                } else if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99532q) {
                    str3 = AbstractC23309i.m120963G4();
                    j11 = AbstractC23309i.m122384s7();
                    str4 = "hcm";
                } else {
                    j11 = 0;
                }
                if (str3 != null && str3.length() != 0 && AbstractC19074t.m100204b(str3, str) && Math.abs(System.currentTimeMillis() - j11) <= 604800000) {
                    AbstractC20110a.f98889a.mo104548a(str2 + ": skip submitTokenFCM token is not changed, last RegId: " + str3, new Object[0]);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                if (TextUtils.isEmpty(str3)) {
                    i11 = 1;
                } else if (!AbstractC19074t.m100204b(str3, str)) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                AbstractC20110a.f98889a.mo104556o(8, aVar.m105162b().m105152d() + " Submit token: type=1 token=" + str + " source=" + i11, new Object[0]);
                atomicBoolean.set(true);
                c0766k.mo1477L7(1, str, str4, i11);
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m103269g() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gy.d
            public /* synthetic */ RunnableC19680d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19681e.m103266h(C19681e.this);
            }
        });
    }

    /* renamed from: i */
    public final void m103270i() {
        try {
            m103268f(C20166b.Companion.m105162b().m105151c(MainApplication.Companion.m35500c()));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    public final void m103271j() {
        C20166b.a aVar = C20166b.Companion;
        aVar.m105162b().m105153e(MainApplication.Companion.m35500c(), InterfaceC20165a.a.f99531p);
        aVar.m105162b().m105159k(new f());
    }

    /* renamed from: k */
    public final boolean m103272k(Context context) {
        try {
            C4070a m19196p = C4070a.m19196p();
            AbstractC19074t.m100205c(context);
            if (m19196p.mo19200i(context) != 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: l */
    public final void m103273l() {
        String str;
        String str2 = f97641a;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new g());
        AbstractC20110a.f98889a.mo104556o(8, str2 + " : removeTokenFCM: type=2", new Object[0]);
        C20166b.a aVar = C20166b.Companion;
        if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
            str = "fcm";
        } else if (aVar.m105162b().m105152d() != InterfaceC20165a.a.f99532q) {
            str = "";
        } else {
            str = "hcm";
        }
        c0766k.mo1477L7(2, "", str, 0);
    }
}
