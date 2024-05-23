package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
/* loaded from: classes2.dex */
public final class C5704z extends AbstractC5670x {
    public C5704z() {
        this.f32893a.add(EnumC5501n0.EQUALS);
        this.f32893a.add(EnumC5501n0.GREATER_THAN);
        this.f32893a.add(EnumC5501n0.GREATER_THAN_EQUALS);
        this.f32893a.add(EnumC5501n0.IDENTITY_EQUALS);
        this.f32893a.add(EnumC5501n0.IDENTITY_NOT_EQUALS);
        this.f32893a.add(EnumC5501n0.LESS_THAN);
        this.f32893a.add(EnumC5501n0.LESS_THAN_EQUALS);
        this.f32893a.add(EnumC5501n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m30090c(InterfaceC5551q interfaceC5551q, InterfaceC5551q interfaceC5551q2) {
        if (interfaceC5551q.getClass().equals(interfaceC5551q2.getClass())) {
            if ((interfaceC5551q instanceof C5636v) || (interfaceC5551q instanceof C5517o)) {
                return true;
            }
            if (interfaceC5551q instanceof C5415i) {
                if (Double.isNaN(interfaceC5551q.zzh().doubleValue()) || Double.isNaN(interfaceC5551q2.zzh().doubleValue()) || interfaceC5551q.zzh().doubleValue() != interfaceC5551q2.zzh().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (interfaceC5551q instanceof C5619u) {
                return interfaceC5551q.zzi().equals(interfaceC5551q2.zzi());
            }
            if (interfaceC5551q instanceof C5381g) {
                return interfaceC5551q.zzg().equals(interfaceC5551q2.zzg());
            }
            if (interfaceC5551q != interfaceC5551q2) {
                return false;
            }
            return true;
        }
        if (((interfaceC5551q instanceof C5636v) || (interfaceC5551q instanceof C5517o)) && ((interfaceC5551q2 instanceof C5636v) || (interfaceC5551q2 instanceof C5517o))) {
            return true;
        }
        boolean z11 = interfaceC5551q instanceof C5415i;
        if (z11 && (interfaceC5551q2 instanceof C5619u)) {
            return m30090c(interfaceC5551q, new C5415i(interfaceC5551q2.zzh()));
        }
        boolean z12 = interfaceC5551q instanceof C5619u;
        if (z12 && (interfaceC5551q2 instanceof C5415i)) {
            return m30090c(new C5415i(interfaceC5551q.zzh()), interfaceC5551q2);
        }
        if (interfaceC5551q instanceof C5381g) {
            return m30090c(new C5415i(interfaceC5551q.zzh()), interfaceC5551q2);
        }
        if (interfaceC5551q2 instanceof C5381g) {
            return m30090c(interfaceC5551q, new C5415i(interfaceC5551q2.zzh()));
        }
        if ((!z12 && !z11) || !(interfaceC5551q2 instanceof InterfaceC5483m)) {
            if (!(interfaceC5551q instanceof InterfaceC5483m) || (!(interfaceC5551q2 instanceof C5619u) && !(interfaceC5551q2 instanceof C5415i))) {
                return false;
            }
            return m30090c(new C5619u(interfaceC5551q.zzi()), interfaceC5551q2);
        }
        return m30090c(interfaceC5551q, new C5619u(interfaceC5551q2.zzi()));
    }

    /* renamed from: d */
    private static boolean m30091d(InterfaceC5551q interfaceC5551q, InterfaceC5551q interfaceC5551q2) {
        if (interfaceC5551q instanceof InterfaceC5483m) {
            interfaceC5551q = new C5619u(interfaceC5551q.zzi());
        }
        if (interfaceC5551q2 instanceof InterfaceC5483m) {
            interfaceC5551q2 = new C5619u(interfaceC5551q2.zzi());
        }
        if ((interfaceC5551q instanceof C5619u) && (interfaceC5551q2 instanceof C5619u)) {
            if (interfaceC5551q.zzi().compareTo(interfaceC5551q2.zzi()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC5551q.zzh().doubleValue();
        double doubleValue2 = interfaceC5551q2.zzh().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m30092e(InterfaceC5551q interfaceC5551q, InterfaceC5551q interfaceC5551q2) {
        if (interfaceC5551q instanceof InterfaceC5483m) {
            interfaceC5551q = new C5619u(interfaceC5551q.zzi());
        }
        if (interfaceC5551q2 instanceof InterfaceC5483m) {
            interfaceC5551q2 = new C5619u(interfaceC5551q2.zzi());
        }
        if (((!(interfaceC5551q instanceof C5619u) || !(interfaceC5551q2 instanceof C5619u)) && (Double.isNaN(interfaceC5551q.zzh().doubleValue()) || Double.isNaN(interfaceC5551q2.zzh().doubleValue()))) || m30091d(interfaceC5551q2, interfaceC5551q)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        boolean m30090c;
        boolean m30090c2;
        AbstractC5608t5.m29617h(AbstractC5608t5.m29614e(str).name(), 2, list);
        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
        int ordinal = AbstractC5608t5.m29614e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal != 48) {
                if (ordinal != 42) {
                    if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                m30090c = m30091d(m29589b2, m29589b);
                                break;
                            case 38:
                                m30090c = m30092e(m29589b2, m29589b);
                                break;
                            case 39:
                                m30090c = AbstractC5608t5.m29621l(m29589b, m29589b2);
                                break;
                            case 40:
                                m30090c2 = AbstractC5608t5.m29621l(m29589b, m29589b2);
                                break;
                            default:
                                return super.m29990b(str);
                        }
                    } else {
                        m30090c = m30092e(m29589b, m29589b2);
                    }
                } else {
                    m30090c = m30091d(m29589b, m29589b2);
                }
            } else {
                m30090c2 = m30090c(m29589b, m29589b2);
            }
            m30090c = !m30090c2;
        } else {
            m30090c = m30090c(m29589b, m29589b2);
        }
        if (m30090c) {
            return InterfaceC5551q.f32735i;
        }
        return InterfaceC5551q.f32736j;
    }
}
