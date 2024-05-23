package p197h4;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p010a4.AbstractC0123p;
import p228i4.InterfaceC20230d;
import p255j4.InterfaceC20913a;

/* renamed from: h4.v */
/* loaded from: classes.dex */
public class C19772v {

    /* renamed from: a */
    private final Executor f97916a;

    /* renamed from: b */
    private final InterfaceC20230d f97917b;

    /* renamed from: c */
    private final InterfaceC19774x f97918c;

    /* renamed from: d */
    private final InterfaceC20913a f97919d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19772v(Executor executor, InterfaceC20230d interfaceC20230d, InterfaceC19774x interfaceC19774x, InterfaceC20913a interfaceC20913a) {
        this.f97916a = executor;
        this.f97917b = interfaceC20230d;
        this.f97918c = interfaceC19774x;
        this.f97919d = interfaceC20913a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m103519d() {
        Iterator it = this.f97917b.mo105727z().iterator();
        while (it.hasNext()) {
            this.f97918c.mo103478b((AbstractC0123p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m103520e() {
        this.f97919d.mo105819d(new InterfaceC20913a.a() { // from class: h4.u
            @Override // p255j4.InterfaceC20913a.a
            /* renamed from: d */
            public final Object mo100860d() {
                Object m103519d;
                m103519d = C19772v.this.m103519d();
                return m103519d;
            }
        });
    }

    /* renamed from: c */
    public void m103521c() {
        this.f97916a.execute(new Runnable() { // from class: h4.t
            @Override // java.lang.Runnable
            public final void run() {
                C19772v.this.m103520e();
            }
        });
    }
}
