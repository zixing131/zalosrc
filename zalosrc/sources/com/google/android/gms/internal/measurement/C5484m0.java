package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* loaded from: classes2.dex */
public final class C5484m0 extends AbstractC5670x {
    public C5484m0() {
        this.f32893a.add(EnumC5501n0.ASSIGN);
        this.f32893a.add(EnumC5501n0.CONST);
        this.f32893a.add(EnumC5501n0.CREATE_ARRAY);
        this.f32893a.add(EnumC5501n0.CREATE_OBJECT);
        this.f32893a.add(EnumC5501n0.EXPRESSION_LIST);
        this.f32893a.add(EnumC5501n0.GET);
        this.f32893a.add(EnumC5501n0.GET_INDEX);
        this.f32893a.add(EnumC5501n0.GET_PROPERTY);
        this.f32893a.add(EnumC5501n0.NULL);
        this.f32893a.add(EnumC5501n0.SET_PROPERTY);
        this.f32893a.add(EnumC5501n0.TYPEOF);
        this.f32893a.add(EnumC5501n0.UNDEFINED);
        this.f32893a.add(EnumC5501n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        String str2;
        EnumC5501n0 enumC5501n0 = EnumC5501n0.ADD;
        int ordinal = AbstractC5608t5.m29614e(str).ordinal();
        int i11 = 0;
        if (ordinal == 3) {
            AbstractC5608t5.m29617h(EnumC5501n0.ASSIGN.name(), 2, list);
            InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
            if (m29589b instanceof C5619u) {
                if (c5590s4.m29595h(m29589b.zzi())) {
                    InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
                    c5590s4.m29594g(m29589b.zzi(), m29589b2);
                    return m29589b2;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", m29589b.zzi()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", m29589b.getClass().getCanonicalName()));
        }
        if (ordinal == 14) {
            AbstractC5608t5.m29618i(EnumC5501n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i12 = 0; i12 < list.size() - 1; i12 += 2) {
                    InterfaceC5551q m29589b3 = c5590s4.m29589b((InterfaceC5551q) list.get(i12));
                    if (m29589b3 instanceof C5619u) {
                        c5590s4.m29593f(m29589b3.zzi(), c5590s4.m29589b((InterfaceC5551q) list.get(i12 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", m29589b3.getClass().getCanonicalName()));
                    }
                }
                return InterfaceC5551q.f32730d;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal == 24) {
            AbstractC5608t5.m29618i(EnumC5501n0.EXPRESSION_LIST.name(), 1, list);
            InterfaceC5551q interfaceC5551q = InterfaceC5551q.f32730d;
            while (i11 < list.size()) {
                interfaceC5551q = c5590s4.m29589b((InterfaceC5551q) list.get(i11));
                if (interfaceC5551q instanceof C5398h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i11++;
            }
            return interfaceC5551q;
        }
        if (ordinal == 33) {
            AbstractC5608t5.m29617h(EnumC5501n0.GET.name(), 1, list);
            InterfaceC5551q m29589b4 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
            if (m29589b4 instanceof C5619u) {
                return c5590s4.m29591d(m29589b4.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", m29589b4.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            AbstractC5608t5.m29617h(EnumC5501n0.NULL.name(), 0, list);
            return InterfaceC5551q.f32731e;
        }
        if (ordinal == 58) {
            AbstractC5608t5.m29617h(EnumC5501n0.SET_PROPERTY.name(), 3, list);
            InterfaceC5551q m29589b5 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
            InterfaceC5551q m29589b6 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
            InterfaceC5551q m29589b7 = c5590s4.m29589b((InterfaceC5551q) list.get(2));
            if (m29589b5 != InterfaceC5551q.f32730d && m29589b5 != InterfaceC5551q.f32731e) {
                if ((m29589b5 instanceof C5364f) && (m29589b6 instanceof C5415i)) {
                    ((C5364f) m29589b5).m29111v(m29589b6.zzh().intValue(), m29589b7);
                } else if (m29589b5 instanceof InterfaceC5483m) {
                    ((InterfaceC5483m) m29589b5).mo29100g(m29589b6.zzi(), m29589b7);
                }
                return m29589b7;
            }
            throw new IllegalStateException(String.format("Can't set property %s of %s", m29589b6.zzi(), m29589b5.zzi()));
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new C5364f();
            }
            C5364f c5364f = new C5364f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC5551q m29589b8 = c5590s4.m29589b((InterfaceC5551q) it.next());
                if (!(m29589b8 instanceof C5398h)) {
                    c5364f.m29111v(i11, m29589b8);
                    i11++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return c5364f;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new C5500n();
            }
            if (list.size() % 2 == 0) {
                C5500n c5500n = new C5500n();
                while (i11 < list.size() - 1) {
                    InterfaceC5551q m29589b9 = c5590s4.m29589b((InterfaceC5551q) list.get(i11));
                    InterfaceC5551q m29589b10 = c5590s4.m29589b((InterfaceC5551q) list.get(i11 + 1));
                    if (!(m29589b9 instanceof C5398h) && !(m29589b10 instanceof C5398h)) {
                        c5500n.mo29100g(m29589b9.zzi(), m29589b10);
                        i11 += 2;
                    } else {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                }
                return c5500n;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal != 35 && ordinal != 36) {
            switch (ordinal) {
                case 62:
                    AbstractC5608t5.m29617h(EnumC5501n0.TYPEOF.name(), 1, list);
                    InterfaceC5551q m29589b11 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                    if (m29589b11 instanceof C5636v) {
                        str2 = AdError.UNDEFINED_DOMAIN;
                    } else if (m29589b11 instanceof C5381g) {
                        str2 = "boolean";
                    } else if (m29589b11 instanceof C5415i) {
                        str2 = "number";
                    } else if (m29589b11 instanceof C5619u) {
                        str2 = "string";
                    } else if (m29589b11 instanceof C5534p) {
                        str2 = "function";
                    } else {
                        if ((m29589b11 instanceof C5568r) || (m29589b11 instanceof C5398h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", m29589b11));
                        }
                        str2 = "object";
                    }
                    return new C5619u(str2);
                case 63:
                    AbstractC5608t5.m29617h(EnumC5501n0.UNDEFINED.name(), 0, list);
                    return InterfaceC5551q.f32730d;
                case 64:
                    AbstractC5608t5.m29618i(EnumC5501n0.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC5551q m29589b12 = c5590s4.m29589b((InterfaceC5551q) it2.next());
                        if (m29589b12 instanceof C5619u) {
                            c5590s4.m29592e(m29589b12.zzi(), InterfaceC5551q.f32730d);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", m29589b12.getClass().getCanonicalName()));
                        }
                    }
                    return InterfaceC5551q.f32730d;
                default:
                    return super.m29990b(str);
            }
        }
        AbstractC5608t5.m29617h(EnumC5501n0.GET_PROPERTY.name(), 2, list);
        InterfaceC5551q m29589b13 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        InterfaceC5551q m29589b14 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
        if ((m29589b13 instanceof C5364f) && AbstractC5608t5.m29620k(m29589b14)) {
            return ((C5364f) m29589b13).m29104m(m29589b14.zzh().intValue());
        }
        if (m29589b13 instanceof InterfaceC5483m) {
            return ((InterfaceC5483m) m29589b13).mo29101j(m29589b14.zzi());
        }
        if (m29589b13 instanceof C5619u) {
            if ("length".equals(m29589b14.zzi())) {
                return new C5415i(Double.valueOf(m29589b13.zzi().length()));
            }
            if (AbstractC5608t5.m29620k(m29589b14) && m29589b14.zzh().doubleValue() < m29589b13.zzi().length()) {
                return new C5619u(String.valueOf(m29589b13.zzi().charAt(m29589b14.zzh().intValue())));
            }
        }
        return InterfaceC5551q.f32730d;
    }
}
