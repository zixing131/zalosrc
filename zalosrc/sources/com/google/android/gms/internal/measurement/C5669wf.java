package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.wf */
/* loaded from: classes2.dex */
public final class C5669wf extends AbstractC5432j {

    /* renamed from: r */
    private final C5661w7 f32891r;

    /* renamed from: s */
    final Map f32892s;

    public C5669wf(C5661w7 c5661w7) {
        super("require");
        this.f32892s = new HashMap();
        this.f32891r = c5661w7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        InterfaceC5551q interfaceC5551q;
        AbstractC5608t5.m29617h("require", 1, list);
        String zzi = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
        if (this.f32892s.containsKey(zzi)) {
            return (InterfaceC5551q) this.f32892s.get(zzi);
        }
        C5661w7 c5661w7 = this.f32891r;
        if (c5661w7.f32884a.containsKey(zzi)) {
            try {
                interfaceC5551q = (InterfaceC5551q) ((Callable) c5661w7.f32884a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            interfaceC5551q = InterfaceC5551q.f32730d;
        }
        if (interfaceC5551q instanceof AbstractC5432j) {
            this.f32892s.put(zzi, (AbstractC5432j) interfaceC5551q);
        }
        return interfaceC5551q;
    }
}
