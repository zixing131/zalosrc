package p179g4;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p010a4.AbstractC0116i;
import p010a4.AbstractC0123p;
import p010a4.C0128u;
import p030b4.InterfaceC2511e;
import p030b4.InterfaceC2519m;
import p197h4.InterfaceC19774x;
import p228i4.InterfaceC20230d;
import p255j4.InterfaceC20913a;
import p668y3.InterfaceC30282h;

/* renamed from: g4.c */
/* loaded from: classes.dex */
public class C19219c implements InterfaceC19221e {

    /* renamed from: f */
    private static final Logger f95680f = Logger.getLogger(C0128u.class.getName());

    /* renamed from: a */
    private final InterfaceC19774x f95681a;

    /* renamed from: b */
    private final Executor f95682b;

    /* renamed from: c */
    private final InterfaceC2511e f95683c;

    /* renamed from: d */
    private final InterfaceC20230d f95684d;

    /* renamed from: e */
    private final InterfaceC20913a f95685e;

    public C19219c(Executor executor, InterfaceC2511e interfaceC2511e, InterfaceC19774x interfaceC19774x, InterfaceC20230d interfaceC20230d, InterfaceC20913a interfaceC20913a) {
        this.f95682b = executor;
        this.f95683c = interfaceC2511e;
        this.f95681a = interfaceC19774x;
        this.f95684d = interfaceC20230d;
        this.f95685e = interfaceC20913a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m100863d(AbstractC0123p abstractC0123p, AbstractC0116i abstractC0116i) {
        this.f95684d.mo105722h0(abstractC0123p, abstractC0116i);
        this.f95681a.mo103478b(abstractC0123p, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m100864e(final AbstractC0123p abstractC0123p, InterfaceC30282h interfaceC30282h, AbstractC0116i abstractC0116i) {
        try {
            InterfaceC2519m mo12599a = this.f95683c.mo12599a(abstractC0123p.mo513b());
            if (mo12599a == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC0123p.mo513b());
                f95680f.warning(format);
                interfaceC30282h.mo553a(new IllegalArgumentException(format));
            } else {
                final AbstractC0116i mo12618b = mo12599a.mo12618b(abstractC0116i);
                this.f95685e.mo105819d(new InterfaceC20913a.a() { // from class: g4.b
                    @Override // p255j4.InterfaceC20913a.a
                    /* renamed from: d */
                    public final Object mo100860d() {
                        Object m100863d;
                        m100863d = C19219c.this.m100863d(abstractC0123p, mo12618b);
                        return m100863d;
                    }
                });
                interfaceC30282h.mo553a(null);
            }
        } catch (Exception e11) {
            f95680f.warning("Error scheduling event " + e11.getMessage());
            interfaceC30282h.mo553a(e11);
        }
    }

    @Override // p179g4.InterfaceC19221e
    /* renamed from: a */
    public void mo100865a(final AbstractC0123p abstractC0123p, final AbstractC0116i abstractC0116i, final InterfaceC30282h interfaceC30282h) {
        this.f95682b.execute(new Runnable() { // from class: g4.a
            @Override // java.lang.Runnable
            public final void run() {
                C19219c.this.m100864e(abstractC0123p, interfaceC30282h, abstractC0116i);
            }
        });
    }
}
