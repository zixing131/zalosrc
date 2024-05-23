package androidx.databinding;

import androidx.databinding.InterfaceC1674h;

/* renamed from: androidx.databinding.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1667a implements InterfaceC1674h {

    /* renamed from: p */
    private transient C1680n f6727p;

    @Override // androidx.databinding.InterfaceC1674h
    /* renamed from: a */
    public void mo8535a(InterfaceC1674h.a aVar) {
        synchronized (this) {
            try {
                if (this.f6727p == null) {
                    this.f6727p = new C1680n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6727p.m8545a(aVar);
    }

    @Override // androidx.databinding.InterfaceC1674h
    /* renamed from: c */
    public void mo8536c(InterfaceC1674h.a aVar) {
        synchronized (this) {
            try {
                C1680n c1680n = this.f6727p;
                if (c1680n == null) {
                    return;
                }
                c1680n.m8548j(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m8537d(int i11) {
        synchronized (this) {
            try {
                C1680n c1680n = this.f6727p;
                if (c1680n == null) {
                    return;
                }
                c1680n.m8547e(this, i11, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
