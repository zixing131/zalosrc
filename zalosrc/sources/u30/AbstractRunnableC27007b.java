package u30;

import ag0.InterfaceC0806b1;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Arrays;

/* renamed from: u30.b */
/* loaded from: classes5.dex */
public abstract class AbstractRunnableC27007b implements Runnable {

    /* renamed from: p */
    private final InterfaceC0806b1 f127651p;

    /* renamed from: q */
    private Object[] f127652q;

    public AbstractRunnableC27007b(InterfaceC0806b1 interfaceC0806b1) {
        AbstractC19074t.m100208f(interfaceC0806b1, "zaloExecutor");
        this.f127651p = interfaceC0806b1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m139137f(AbstractRunnableC27007b abstractRunnableC27007b, Object obj) {
        AbstractC19074t.m100208f(abstractRunnableC27007b, "this$0");
        abstractRunnableC27007b.mo116143d(obj);
    }

    /* renamed from: b */
    protected abstract Object mo116138b(Object... objArr);

    /* renamed from: c */
    public final void m139138c(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "params");
        mo139139e();
        this.f127652q = objArr;
        this.f127651p.mo2040a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo116143d(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo139139e() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Object obj;
        Object[] objArr = this.f127652q;
        if (objArr != null) {
            AbstractC19074t.m100205c(objArr);
            obj = mo116138b(Arrays.copyOf(objArr, objArr.length));
        } else {
            obj = null;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: u30.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractRunnableC27007b.m139137f(AbstractRunnableC27007b.this, obj);
            }
        });
    }
}
