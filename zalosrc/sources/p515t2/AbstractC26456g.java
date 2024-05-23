package p515t2;

import android.content.Context;
import androidx.work.AbstractC2253u;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p470r2.InterfaceC25615a;
import p595w2.InterfaceC28696c;
import pm0.C24848g0;
import qm0.AbstractC25332a0;

/* renamed from: t2.g */
/* loaded from: classes.dex */
public abstract class AbstractC26456g {

    /* renamed from: a */
    private final InterfaceC28696c f125645a;

    /* renamed from: b */
    private final Context f125646b;

    /* renamed from: c */
    private final Object f125647c;

    /* renamed from: d */
    private final LinkedHashSet f125648d;

    /* renamed from: e */
    private Object f125649e;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC26456g(Context context, InterfaceC28696c interfaceC28696c) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
        this.f125645a = interfaceC28696c;
        Context applicationContext = context.getApplicationContext();
        AbstractC19074t.m100207e(applicationContext, "context.applicationContext");
        this.f125646b = applicationContext;
        this.f125647c = new Object();
        this.f125648d = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m136358b(List list, AbstractC26456g abstractC26456g) {
        AbstractC19074t.m100208f(list, "$listenersList");
        AbstractC19074t.m100208f(abstractC26456g, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC25615a) it.next()).mo132298a(abstractC26456g.f125649e);
        }
    }

    /* renamed from: c */
    public final void m136359c(InterfaceC25615a interfaceC25615a) {
        String str;
        AbstractC19074t.m100208f(interfaceC25615a, "listener");
        synchronized (this.f125647c) {
            try {
                if (this.f125648d.add(interfaceC25615a)) {
                    if (this.f125648d.size() == 1) {
                        this.f125649e = mo136351e();
                        AbstractC2253u m11895e = AbstractC2253u.m11895e();
                        str = AbstractC26457h.f125650a;
                        m11895e.mo11898a(str, getClass().getSimpleName() + ": initial state = " + this.f125649e);
                        mo11683h();
                    }
                    interfaceC25615a.mo132298a(this.f125649e);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Context m136360d() {
        return this.f125646b;
    }

    /* renamed from: e */
    public abstract Object mo136351e();

    /* renamed from: f */
    public final void m136361f(InterfaceC25615a interfaceC25615a) {
        AbstractC19074t.m100208f(interfaceC25615a, "listener");
        synchronized (this.f125647c) {
            try {
                if (this.f125648d.remove(interfaceC25615a) && this.f125648d.isEmpty()) {
                    mo11684i();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m136362g(Object obj) {
        final List m131185M0;
        synchronized (this.f125647c) {
            Object obj2 = this.f125649e;
            if (obj2 != null && AbstractC19074t.m100204b(obj2, obj)) {
                return;
            }
            this.f125649e = obj;
            m131185M0 = AbstractC25332a0.m131185M0(this.f125648d);
            this.f125645a.mo143749a().execute(new Runnable() { // from class: t2.f
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26456g.m136358b(m131185M0, this);
                }
            });
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: h */
    public abstract void mo11683h();

    /* renamed from: i */
    public abstract void mo11684i();
}
