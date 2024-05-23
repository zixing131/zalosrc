package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* loaded from: classes2.dex */
public final class C5572r3 {

    /* renamed from: a */
    final C5687y f32763a;

    /* renamed from: b */
    final C5590s4 f32764b;

    /* renamed from: c */
    final C5590s4 f32765c;

    /* renamed from: d */
    final C5661w7 f32766d;

    public C5572r3() {
        C5687y c5687y = new C5687y();
        this.f32763a = c5687y;
        C5590s4 c5590s4 = new C5590s4(null, c5687y);
        this.f32765c = c5590s4;
        this.f32764b = c5590s4.m29588a();
        C5661w7 c5661w7 = new C5661w7();
        this.f32766d = c5661w7;
        c5590s4.m29594g("require", new C5669wf(c5661w7));
        c5661w7.m29982a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.q2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C5703yf();
            }
        });
        c5590s4.m29594g("runtime.counter", new C5415i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final InterfaceC5551q m29571a(C5590s4 c5590s4, C5574r5... c5574r5Arr) {
        InterfaceC5551q interfaceC5551q = InterfaceC5551q.f32730d;
        for (C5574r5 c5574r5 : c5574r5Arr) {
            interfaceC5551q = AbstractC5643v6.m29773a(c5574r5);
            AbstractC5608t5.m29612c(this.f32765c);
            if ((interfaceC5551q instanceof C5568r) || (interfaceC5551q instanceof C5534p)) {
                interfaceC5551q = this.f32763a.m30034a(c5590s4, interfaceC5551q);
            }
        }
        return interfaceC5551q;
    }
}
