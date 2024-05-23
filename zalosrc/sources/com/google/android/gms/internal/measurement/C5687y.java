package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* loaded from: classes2.dex */
public final class C5687y {

    /* renamed from: a */
    final Map f32922a = new HashMap();

    /* renamed from: b */
    final C5467l0 f32923b = new C5467l0();

    public C5687y() {
        m30035b(new C5653w());
        m30035b(new C5704z());
        m30035b(new C5280a0());
        m30035b(new C5348e0());
        m30035b(new C5433j0());
        m30035b(new C5450k0());
        m30035b(new C5484m0());
    }

    /* renamed from: a */
    public final InterfaceC5551q m30034a(C5590s4 c5590s4, InterfaceC5551q interfaceC5551q) {
        AbstractC5670x abstractC5670x;
        AbstractC5608t5.m29612c(c5590s4);
        if (interfaceC5551q instanceof C5568r) {
            C5568r c5568r = (C5568r) interfaceC5551q;
            ArrayList m29569b = c5568r.m29569b();
            String m29568a = c5568r.m29568a();
            if (this.f32922a.containsKey(m29568a)) {
                abstractC5670x = (AbstractC5670x) this.f32922a.get(m29568a);
            } else {
                abstractC5670x = this.f32923b;
            }
            return abstractC5670x.mo28856a(m29568a, c5590s4, m29569b);
        }
        return interfaceC5551q;
    }

    /* renamed from: b */
    final void m30035b(AbstractC5670x abstractC5670x) {
        Iterator it = abstractC5670x.f32893a.iterator();
        while (it.hasNext()) {
            this.f32922a.put(((EnumC5501n0) it.next()).m29459c().toString(), abstractC5670x);
        }
    }
}
