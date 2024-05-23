package p348mi;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;

/* renamed from: mi.j */
/* loaded from: classes.dex */
public abstract class AbstractC23310j {

    /* renamed from: a */
    private InterfaceC18494a f113487a;

    /* renamed from: b */
    private volatile Object f113488b;

    public AbstractC23310j(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "creator");
        this.f113487a = interfaceC18494a;
    }

    /* renamed from: a */
    public final Object m122672a() {
        Object obj = this.f113488b;
        if (obj == null) {
            synchronized (this) {
                obj = this.f113488b;
                if (obj == null) {
                    InterfaceC18494a interfaceC18494a = this.f113487a;
                    AbstractC19074t.m100205c(interfaceC18494a);
                    obj = interfaceC18494a.mo12V4();
                    this.f113488b = obj;
                    this.f113487a = null;
                }
            }
        }
        return obj;
    }
}
