package p456qp;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p185gc.AbstractC19383g;
import p456qp.C25464p;
import p509sp.C26359h;
import p509sp.C26364m;
import p509sp.InterfaceC26353b;

/* renamed from: qp.p */
/* loaded from: classes.dex */
public final class C25464p extends AbstractC19383g {

    /* renamed from: qp.p$a */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: c */
        public static final a f122032c = new a();

        private a() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: qp.p$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final boolean f122033a;

        /* renamed from: b */
        private final InterfaceC26353b f122034b;

        public b() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        /* renamed from: a */
        public final InterfaceC26353b m131922a() {
            return this.f122034b;
        }

        /* renamed from: b */
        public final boolean m131923b() {
            return this.f122033a;
        }

        public b(boolean z11, InterfaceC26353b interfaceC26353b) {
            this.f122033a = z11;
            this.f122034b = interfaceC26353b;
        }

        public /* synthetic */ b(boolean z11, InterfaceC26353b interfaceC26353b, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : interfaceC26353b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.p$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f122035q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "StopSongUseCase";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m131920e(b bVar) {
        AbstractC19074t.m100208f(bVar, "$params");
        C25451c.f121865a.m131830u(bVar.m131923b(), bVar.m131922a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(final b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        C26359h.f125209a.mo135685a("FEED_MUSIC", "USE_CASE_STOP_MUSIC", c.f122035q);
        C26364m.f125218a.m135711a(new Runnable() { // from class: qp.o
            @Override // java.lang.Runnable
            public final void run() {
                C25464p.m131920e(C25464p.b.this);
            }
        });
    }
}
