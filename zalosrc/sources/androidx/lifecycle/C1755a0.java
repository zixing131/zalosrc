package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p376o0.C23974b;

/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes2.dex */
public class C1755a0 extends C1761c0 {

    /* renamed from: l */
    private C23974b f7291l = new C23974b();

    /* renamed from: androidx.lifecycle.a0$a */
    /* loaded from: classes2.dex */
    private static class a implements InterfaceC1764d0 {

        /* renamed from: p */
        final LiveData f7292p;

        /* renamed from: q */
        final InterfaceC1764d0 f7293q;

        /* renamed from: r */
        int f7294r = -1;

        a(LiveData liveData, InterfaceC1764d0 interfaceC1764d0) {
            this.f7292p = liveData;
            this.f7293q = interfaceC1764d0;
        }

        /* renamed from: a */
        void m9257a() {
            this.f7292p.m9220k(this);
        }

        /* renamed from: b */
        void m9258b() {
            this.f7292p.mo9222o(this);
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public void mo8524qp(Object obj) {
            if (this.f7294r != this.f7292p.m9216g()) {
                this.f7294r = this.f7292p.m9216g();
                this.f7293q.mo8524qp(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: l */
    public void mo181l() {
        Iterator it = this.f7291l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).m9257a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: m */
    public void mo182m() {
        Iterator it = this.f7291l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).m9258b();
        }
    }

    /* renamed from: r */
    public void m9256r(LiveData liveData, InterfaceC1764d0 interfaceC1764d0) {
        if (liveData != null) {
            a aVar = new a(liveData, interfaceC1764d0);
            a aVar2 = (a) this.f7291l.mo125458l(liveData, aVar);
            if (aVar2 != null && aVar2.f7293q != interfaceC1764d0) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (aVar2 == null && m9217h()) {
                aVar.m9257a();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }
}
