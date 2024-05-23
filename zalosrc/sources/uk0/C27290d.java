package uk0;

import ll0.C22518f;

/* renamed from: uk0.d */
/* loaded from: classes7.dex */
public class C27290d {

    /* renamed from: a */
    public InterfaceC27292f f128385a;

    /* renamed from: b */
    private final C22518f f128386b = new C22518f();

    public C27290d(InterfaceC27292f interfaceC27292f) {
        this.f128385a = interfaceC27292f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m139701b(C27293g c27293g) {
        InterfaceC27292f interfaceC27292f = this.f128385a;
        if (interfaceC27292f != null) {
            int i11 = c27293g.f128391c;
            String str = c27293g.f128390b;
            C27291e c27291e = c27293g.f128389a;
            interfaceC27292f.mo44291b(i11, str, c27291e.f128387a, c27291e.f128388b);
        }
    }

    /* renamed from: c */
    public void m139703c(final C27293g c27293g) {
        this.f128386b.m116438g(new Runnable() { // from class: uk0.c
            @Override // java.lang.Runnable
            public final void run() {
                C27290d.this.m139701b(c27293g);
            }
        }, null, false);
    }

    /* renamed from: e */
    public void m139704e(InterfaceC27292f interfaceC27292f) {
        this.f128385a = interfaceC27292f;
    }

    protected void finalize() {
        this.f128386b.m116443o();
        super.finalize();
    }
}
