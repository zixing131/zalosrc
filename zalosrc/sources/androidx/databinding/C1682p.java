package androidx.databinding;

import androidx.lifecycle.InterfaceC1801w;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: androidx.databinding.p */
/* loaded from: classes2.dex */
public class C1682p extends WeakReference {

    /* renamed from: a */
    private final InterfaceC1678l f6744a;

    /* renamed from: b */
    protected final int f6745b;

    /* renamed from: c */
    private Object f6746c;

    public C1682p(ViewDataBinding viewDataBinding, int i11, InterfaceC1678l interfaceC1678l, ReferenceQueue referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f6745b = i11;
        this.f6744a = interfaceC1678l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public ViewDataBinding m8573a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            m8577e();
        }
        return viewDataBinding;
    }

    /* renamed from: b */
    public Object m8574b() {
        return this.f6746c;
    }

    /* renamed from: c */
    public void m8575c(InterfaceC1801w interfaceC1801w) {
        this.f6744a.mo8518a(interfaceC1801w);
    }

    /* renamed from: d */
    public void m8576d(Object obj) {
        m8577e();
        this.f6746c = obj;
        if (obj != null) {
            this.f6744a.mo8520c(obj);
        }
    }

    /* renamed from: e */
    public boolean m8577e() {
        boolean z11;
        Object obj = this.f6746c;
        if (obj != null) {
            this.f6744a.mo8519b(obj);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6746c = null;
        return z11;
    }
}
