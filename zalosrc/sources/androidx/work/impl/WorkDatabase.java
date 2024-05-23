package androidx.work.impl;

import android.content.Context;
import androidx.work.InterfaceC2136b;
import androidx.work.impl.WorkDatabase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.Executor;
import p008a2.AbstractC0086w;
import p008a2.C0085v;
import p119e2.InterfaceC18183h;
import p147f2.C18700f;
import p535u2.InterfaceC26951b;
import p535u2.InterfaceC26954c0;
import p535u2.InterfaceC26957e;
import p535u2.InterfaceC26964k;
import p535u2.InterfaceC26969p;
import p535u2.InterfaceC26972s;
import p535u2.InterfaceC26977x;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC0086w {

    /* renamed from: o */
    public static final C2152a f9146o = new C2152a(null);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    /* loaded from: classes.dex */
    public static final class C2152a {
        private C2152a() {
        }

        public /* synthetic */ C2152a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static final InterfaceC18183h m11568c(Context context, InterfaceC18183h.b bVar) {
            AbstractC19074t.m100208f(context, "$context");
            AbstractC19074t.m100208f(bVar, "configuration");
            InterfaceC18183h.b.a m96934a = InterfaceC18183h.b.f92344f.m96934a(context);
            m96934a.m96932d(bVar.f92346b).m96931c(bVar.f92347c).m96933e(true).m96929a(true);
            return new C18700f().mo232a(m96934a.m96930b());
        }

        /* renamed from: b */
        public final WorkDatabase m11569b(Context context, Executor executor, InterfaceC2136b interfaceC2136b, boolean z11) {
            AbstractC0086w.a m367f;
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(executor, "queryExecutor");
            AbstractC19074t.m100208f(interfaceC2136b, "clock");
            if (z11) {
                m367f = C0085v.m329c(context, WorkDatabase.class).m364c();
            } else {
                m367f = C0085v.m327a(context, WorkDatabase.class, "androidx.work.workdb").m367f(new InterfaceC18183h.c() { // from class: androidx.work.impl.d0

                    /* renamed from: a */
                    public final /* synthetic */ Context f9246a;

                    public /* synthetic */ C2186d0(Context context2) {
                        r1 = context2;
                    }

                    @Override // p119e2.InterfaceC18183h.c
                    /* renamed from: a */
                    public final InterfaceC18183h mo232a(InterfaceC18183h.b bVar) {
                        InterfaceC18183h m11568c;
                        m11568c = WorkDatabase.C2152a.m11568c(r1, bVar);
                        return m11568c;
                    }
                });
            }
            return (WorkDatabase) m367f.m368g(executor).m362a(new C2185d(interfaceC2136b)).m363b(C2206k.f9286c).m363b(new C2231v(context2, 2, 3)).m363b(C2208l.f9287c).m363b(C2210m.f9288c).m363b(new C2231v(context2, 5, 6)).m363b(C2212n.f9290c).m363b(C2214o.f9291c).m363b(C2216p.f9292c).m363b(new C2225t0(context2)).m363b(new C2231v(context2, 10, 11)).m363b(C2198g.f9279c).m363b(C2200h.f9282c).m363b(C2202i.f9283c).m363b(C2204j.f9285c).m366e().m365d();
        }
    }

    /* renamed from: G */
    public abstract InterfaceC26951b mo11560G();

    /* renamed from: H */
    public abstract InterfaceC26957e mo11561H();

    /* renamed from: I */
    public abstract InterfaceC26964k mo11562I();

    /* renamed from: J */
    public abstract InterfaceC26969p mo11563J();

    /* renamed from: K */
    public abstract InterfaceC26972s mo11564K();

    /* renamed from: L */
    public abstract InterfaceC26977x mo11565L();

    /* renamed from: M */
    public abstract InterfaceC26954c0 mo11566M();
}
