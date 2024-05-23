package androidx.work.impl;

import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import androidx.work.InterfaceC2257y;
import androidx.work.impl.utils.futures.C2230c;

/* renamed from: androidx.work.impl.q */
/* loaded from: classes.dex */
public class C2218q implements InterfaceC2257y {

    /* renamed from: c */
    private final C1761c0 f9295c = new C1761c0();

    /* renamed from: d */
    private final C2230c f9296d = C2230c.m11809t();

    public C2218q() {
        m11725a(InterfaceC2257y.f9482b);
    }

    /* renamed from: a */
    public void m11725a(InterfaceC2257y.b bVar) {
        this.f9295c.mo9221n(bVar);
        if (bVar instanceof InterfaceC2257y.b.c) {
            this.f9296d.mo11798p((InterfaceC2257y.b.c) bVar);
        } else if (bVar instanceof InterfaceC2257y.b.a) {
            this.f9296d.mo11799q(((InterfaceC2257y.b.a) bVar).m11913a());
        }
    }

    @Override // androidx.work.InterfaceC2257y
    public LiveData getState() {
        return this.f9295c;
    }
}
