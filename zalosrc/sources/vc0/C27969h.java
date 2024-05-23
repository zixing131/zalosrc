package vc0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import vc0.AbstractC27964c;

/* renamed from: vc0.h */
/* loaded from: classes4.dex */
public class C27969h extends AbstractC27964c {

    /* renamed from: h */
    final RecyclerView f130406h;

    public C27969h(RecyclerView recyclerView, AbstractC27964c.a aVar) {
        super(aVar);
        this.f130406h = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:            if (r0 > r2) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:            if (r0 < r2) goto L28;     */
    @Override // vc0.AbstractC27964c
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo140956g(int i11, int i12, int i13, float f11, float f12, boolean z11) {
        InterfaceC27968g interfaceC27968g;
        List dragItems;
        m140963n(i11);
        Object m9900t0 = this.f130406h.m9900t0(i11);
        if (m9900t0 instanceof InterfaceC27967f) {
            interfaceC27968g = ((InterfaceC27967f) m9900t0).mo36848d();
        } else {
            interfaceC27968g = null;
        }
        if (interfaceC27968g != null && (dragItems = interfaceC27968g.getDragItems()) != null && !dragItems.isEmpty()) {
            if ((z11 && this.f130399c < i11 && i11 < this.f130397a) || (this.f130399c > i11 && i11 > this.f130397a)) {
                z11 = false;
            }
            if (!z11) {
                int i14 = this.f130397a;
                int i15 = this.f130399c;
                if (i14 >= i15) {
                }
            }
            int i16 = this.f130397a;
            int i17 = this.f130399c;
            if (i16 <= i17) {
            }
            if (f11 != Float.MIN_VALUE) {
                if (i11 == this.f130397a) {
                    m140951b(interfaceC27968g, f11, f12);
                } else {
                    int i18 = this.f130399c;
                    if (i11 > i18) {
                        m140952c(interfaceC27968g, z11, f11, f12);
                    } else if (i11 < i18) {
                        m140953d(interfaceC27968g, z11, f11, f12);
                    }
                }
            }
        }
        for (int min = Math.min(this.f130399c, i11); min <= Math.max(this.f130399c, i11); min++) {
            m140962m(min);
        }
        this.f130399c = i11;
    }

    /* renamed from: m */
    void m140962m(int i11) {
        InterfaceC27968g interfaceC27968g;
        Object m9900t0 = this.f130406h.m9900t0(i11);
        if (m9900t0 instanceof InterfaceC27967f) {
            interfaceC27968g = ((InterfaceC27967f) m9900t0).mo36848d();
        } else {
            interfaceC27968g = null;
        }
        if (interfaceC27968g != null) {
            interfaceC27968g.mo69522F();
        }
    }

    /* renamed from: n */
    void m140963n(int i11) {
        List mo36808f;
        Object adapter = this.f130406h.getAdapter();
        if (!(adapter instanceof InterfaceC27963b)) {
            return;
        }
        InterfaceC27963b interfaceC27963b = (InterfaceC27963b) adapter;
        if (this.f130399c == i11) {
            this.f130399c = this.f130400d;
        }
        int i12 = this.f130399c;
        this.f130400d = i12;
        for (int min = Math.min(i11, i12); min <= Math.max(i11, this.f130399c); min++) {
            if (min != i11 && (mo36808f = interfaceC27963b.mo36808f(min)) != null && !mo36808f.isEmpty()) {
                int size = mo36808f.size();
                for (int i13 = 0; i13 < size; i13++) {
                    InterfaceC27965d interfaceC27965d = (InterfaceC27965d) mo36808f.get(i13);
                    int i14 = this.f130397a;
                    boolean z11 = true;
                    if (min == i14 ? i11 >= i14 ? i13 < this.f130398b : i13 > this.f130398b : (min >= i14 || i11 >= min) && (i14 >= min || min >= i11)) {
                        z11 = false;
                    }
                    if (interfaceC27965d.mo40584b() != z11 && (z11 || this.f130401e.containsKey(interfaceC27965d.mo40586c()) || !m140950a(interfaceC27965d))) {
                        m140955f(interfaceC27965d, min, z11);
                    } else if (z11 && m140950a(interfaceC27965d)) {
                        this.f130401e.put(interfaceC27965d.mo40586c(), Boolean.TRUE);
                    }
                }
            }
        }
    }
}
