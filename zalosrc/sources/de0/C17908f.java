package de0;

import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import kg0.C21720c;
import mm0.AbstractC23350e;
import nl.C23870a;
import on0.AbstractC24341v;
import p185gc.AbstractC19383g;
import p348mi.AbstractC23306f;
import tg0.C26676b;
import ug0.C27255j;

/* renamed from: de0.f */
/* loaded from: classes4.dex */
public final class C17908f extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: de0.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: de0.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final boolean f90429a;

        /* renamed from: b */
        private final boolean f90430b;

        public b(boolean z11, boolean z12) {
            this.f90429a = z11;
            this.f90430b = z12;
        }

        /* renamed from: a */
        public final boolean m94482a() {
            return this.f90430b;
        }

        /* renamed from: b */
        public final boolean m94483b() {
            return this.f90429a;
        }
    }

    /* renamed from: c */
    private final void m94479c() {
        if (!AbstractC23306f.m120633X1().m89807v()) {
            return;
        }
        C26676b.m136956f("Force fetch Cloud Info after login success", C26676b.b.f126331p);
        AbstractC23306f.m120643a2().m89838g();
        AbstractC23306f.m120687l2().m152930g();
    }

    /* renamed from: d */
    private final void m94480d() {
        C26676b.m136956f("Force verify Cloud Queue after login success", C26676b.b.f126331p);
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        m120679j2.m124812h1(false);
        m120679j2.m124827q1(3);
        AbstractC23306f.m120655d2().m112075g();
        ZaloCloudRecoverCloudMediaWorker.Companion.m90205q(MainApplication.Companion.m35500c());
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: e */
    public void mo12006b(b bVar) {
        String m127130z;
        String m127130z2;
        String m127130z3;
        String m127130z4;
        AbstractC19074t.m100208f(bVar, "params");
        bVar.m94483b();
        bVar.m94482a();
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        AbstractC20110a.b m104564x = aVar.m104564x("PostLoginUseCase");
        m127130z = AbstractC24341v.m127130z("─", 33);
        m104564x.mo104556o(8, m127130z + "\nPost login flow of user (" + CoreUtility.f89233i + ")", new Object[0]);
        try {
            try {
                C21720c m120630W1 = AbstractC23306f.m120630W1();
                AbstractC19074t.m100207e(m120630W1, "provideZCloudMigrateSharedPrefManager(...)");
                C21720c.m112103m(m120630W1, false, 1, null);
                m94479c();
                m94480d();
                C27255j.f128107a.m139465f();
                AbstractC23306f.m120663f2().m90145p();
                AbstractC20110a.b m104564x2 = aVar.m104564x("PostLoginUseCase");
                String str = CoreUtility.f89233i;
                m127130z4 = AbstractC24341v.m127130z("─", 50);
                m104564x2.mo104556o(8, "Finished post login flow of user (" + str + ").\n" + m127130z4 + "\n", new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PostLoginUseCase", e11);
                AbstractC20110a.b m104564x3 = AbstractC20110a.f98889a.m104564x("PostLoginUseCase");
                String str2 = CoreUtility.f89233i;
                m127130z3 = AbstractC24341v.m127130z("─", 50);
                m104564x3.mo104556o(8, "Finished post login flow of user (" + str2 + ").\n" + m127130z3 + "\n", new Object[0]);
            }
        } catch (Throwable th2) {
            AbstractC20110a.b m104564x4 = AbstractC20110a.f98889a.m104564x("PostLoginUseCase");
            String str3 = CoreUtility.f89233i;
            m127130z2 = AbstractC24341v.m127130z("─", 50);
            m104564x4.mo104556o(8, "Finished post login flow of user (" + str3 + ").\n" + m127130z2 + "\n", new Object[0]);
            throw th2;
        }
    }
}
