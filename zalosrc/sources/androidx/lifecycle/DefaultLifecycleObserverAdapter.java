package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1795t {

    /* renamed from: p */
    private final InterfaceC1767f f7214p;

    /* renamed from: q */
    private final InterfaceC1795t f7215q;

    /* renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C1742a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7216a;

        static {
            int[] iArr = new int[AbstractC1785o.a.values().length];
            try {
                iArr[AbstractC1785o.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1785o.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1785o.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1785o.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1785o.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1785o.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1785o.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7216a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC1767f interfaceC1767f, InterfaceC1795t interfaceC1795t) {
        AbstractC19074t.m100208f(interfaceC1767f, "defaultLifecycleObserver");
        this.f7214p = interfaceC1767f;
        this.f7215q = interfaceC1795t;
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "event");
        switch (C1742a.f7216a[aVar.ordinal()]) {
            case 1:
                this.f7214p.mo8645D5(interfaceC1801w);
                break;
            case 2:
                this.f7214p.mo8650wC(interfaceC1801w);
                break;
            case 3:
                this.f7214p.mo8646Ro(interfaceC1801w);
                break;
            case 4:
                this.f7214p.mo8649mr(interfaceC1801w);
                break;
            case 5:
                this.f7214p.mo8648Zv(interfaceC1801w);
                break;
            case 6:
                this.f7214p.mo8647Xy(interfaceC1801w);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1795t interfaceC1795t = this.f7215q;
        if (interfaceC1795t != null) {
            interfaceC1795t.mo4652X6(interfaceC1801w, aVar);
        }
    }
}
