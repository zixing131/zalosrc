package t20;

import android.view.View;
import fn0.AbstractC19074t;

/* renamed from: t20.b */
/* loaded from: classes.dex */
public final class C26465b {

    /* renamed from: a */
    public static final C26465b f125661a = new C26465b();

    /* renamed from: b */
    private static InterfaceC26464a f125662b;

    /* renamed from: t20.b$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC26464a {

        /* renamed from: a */
        private final /* synthetic */ InterfaceC26464a f125663a;

        public a(InterfaceC26464a interfaceC26464a) {
            AbstractC19074t.m100208f(interfaceC26464a, "delegate");
            this.f125663a = interfaceC26464a;
        }

        @Override // t20.InterfaceC26464a
        /* renamed from: a */
        public void mo17389a(View view) {
            AbstractC19074t.m100208f(view, "view");
            this.f125663a.mo17389a(view);
        }
    }

    private C26465b() {
    }

    /* renamed from: b */
    public static final void m136377b(InterfaceC26464a interfaceC26464a) {
        AbstractC19074t.m100208f(interfaceC26464a, "delegate");
        f125662b = new a(interfaceC26464a);
    }

    /* renamed from: a */
    public final InterfaceC26464a m136378a() {
        return f125662b;
    }
}
