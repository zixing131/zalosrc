package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s9 */
/* loaded from: classes2.dex */
public final class C5595s9 extends C5500n {

    /* renamed from: q */
    private final C5313c f32788q;

    public C5595s9(C5313c c5313c) {
        this.f32788q = c5313c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C5500n, com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        char c11;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    if (c11 != 3) {
                        if (c11 != 4) {
                            if (c11 != 5) {
                                return super.mo29098d(str, c5590s4, list);
                            }
                            AbstractC5608t5.m29617h("setParamValue", 2, list);
                            String zzi = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
                            InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(1));
                            this.f32788q.m28955b().m28904g(zzi, AbstractC5608t5.m29615f(m29589b));
                            return m29589b;
                        }
                        AbstractC5608t5.m29617h("setEventName", 1, list);
                        InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                        if (!InterfaceC5551q.f32730d.equals(m29589b2) && !InterfaceC5551q.f32731e.equals(m29589b2)) {
                            this.f32788q.m28955b().m28903f(m29589b2.zzi());
                            return new C5619u(m29589b2.zzi());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    AbstractC5608t5.m29617h("getTimestamp", 0, list);
                    return new C5415i(Double.valueOf(this.f32788q.m28955b().m28898a()));
                }
                AbstractC5608t5.m29617h("getParams", 0, list);
                Map m28902e = this.f32788q.m28955b().m28902e();
                C5500n c5500n = new C5500n();
                for (String str2 : m28902e.keySet()) {
                    c5500n.mo29100g(str2, AbstractC5643v6.m29774b(m28902e.get(str2)));
                }
                return c5500n;
            }
            AbstractC5608t5.m29617h("getParamValue", 1, list);
            return AbstractC5643v6.m29774b(this.f32788q.m28955b().m28900c(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi()));
        }
        AbstractC5608t5.m29617h("getEventName", 0, list);
        return new C5619u(this.f32788q.m28955b().m28901d());
    }
}
