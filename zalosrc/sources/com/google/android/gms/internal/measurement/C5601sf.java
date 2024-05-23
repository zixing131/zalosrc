package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.sf */
/* loaded from: classes2.dex */
public final class C5601sf extends AbstractC5432j {

    /* renamed from: r */
    final boolean f32792r;

    /* renamed from: s */
    final boolean f32793s;

    /* renamed from: t */
    final /* synthetic */ C5618tf f32794t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5601sf(C5618tf c5618tf, boolean z11, boolean z12) {
        super("log");
        this.f32794t = c5618tf;
        this.f32792r = z11;
        this.f32793s = z12;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        int i11;
        InterfaceC5329cf interfaceC5329cf;
        InterfaceC5329cf interfaceC5329cf2;
        InterfaceC5329cf interfaceC5329cf3;
        AbstractC5608t5.m29618i("log", 1, list);
        if (list.size() == 1) {
            interfaceC5329cf3 = this.f32794t.f32816r;
            interfaceC5329cf3.mo29032a(3, c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi(), Collections.emptyList(), this.f32792r, this.f32793s);
            return InterfaceC5551q.f32730d;
        }
        int m29611b = AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue());
        if (m29611b != 2) {
            if (m29611b != 3) {
                if (m29611b != 5) {
                    if (m29611b != 6) {
                        i11 = 3;
                    } else {
                        i11 = 2;
                    }
                } else {
                    i11 = 5;
                }
            } else {
                i11 = 1;
            }
        } else {
            i11 = 4;
        }
        String zzi = c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzi();
        if (list.size() == 2) {
            interfaceC5329cf2 = this.f32794t.f32816r;
            interfaceC5329cf2.mo29032a(i11, zzi, Collections.emptyList(), this.f32792r, this.f32793s);
            return InterfaceC5551q.f32730d;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
            arrayList.add(c5590s4.m29589b((InterfaceC5551q) list.get(i12)).zzi());
        }
        interfaceC5329cf = this.f32794t.f32816r;
        interfaceC5329cf.mo29032a(i11, zzi, arrayList, this.f32792r, this.f32793s);
        return InterfaceC5551q.f32730d;
    }
}
