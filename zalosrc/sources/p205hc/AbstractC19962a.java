package p205hc;

import fn0.AbstractC19074t;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import pm0.C24848g0;

/* renamed from: hc.a */
/* loaded from: classes3.dex */
public abstract class AbstractC19962a implements InterfaceC19966e {

    /* renamed from: p */
    private InterfaceC19969h f98264p;

    /* renamed from: q */
    private final Map f98265q;

    /* renamed from: r */
    private volatile boolean f98266r;

    /* renamed from: s */
    private final InterfaceC19967f f98267s;

    public AbstractC19962a(InterfaceC19967f interfaceC19967f) {
        AbstractC19074t.m100208f(interfaceC19967f, "mvpView");
        this.f98267s = interfaceC19967f;
        this.f98265q = new HashMap();
    }

    /* renamed from: Cp */
    private final void m103741Cp(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* renamed from: Dp */
    public final InterfaceC19967f m103742Dp() {
        return this.f98267s;
    }

    /* renamed from: Ep */
    public final Object m103743Ep(String str) {
        Object obj;
        synchronized (this.f98265q) {
            obj = this.f98265q.get(str);
        }
        return obj;
    }

    @Override // p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        this.f98266r = true;
        synchronized (this.f98265q) {
            try {
                Iterator it = this.f98265q.values().iterator();
                while (it.hasNext()) {
                    m103741Cp(it.next());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Fp */
    public final InterfaceC19969h m103744Fp() {
        return this.f98264p;
    }

    /* renamed from: Gp */
    public final Object m103745Gp(String str, Object obj) {
        Object obj2;
        AbstractC19074t.m100208f(str, "key");
        synchronized (this.f98265q) {
            try {
                obj2 = this.f98265q.get(str);
                if (obj2 == null) {
                    this.f98265q.put(str, obj);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f98266r) {
            m103741Cp(obj);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Hp */
    public final void m103746Hp(InterfaceC19969h interfaceC19969h) {
        this.f98264p = interfaceC19969h;
    }

    @Override // p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        this.f98264p = interfaceC19969h;
    }
}
