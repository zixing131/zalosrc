package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* loaded from: classes2.dex */
public final class C5280a0 extends AbstractC5670x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C5280a0() {
        this.f32893a.add(EnumC5501n0.APPLY);
        this.f32893a.add(EnumC5501n0.BLOCK);
        this.f32893a.add(EnumC5501n0.BREAK);
        this.f32893a.add(EnumC5501n0.CASE);
        this.f32893a.add(EnumC5501n0.DEFAULT);
        this.f32893a.add(EnumC5501n0.CONTINUE);
        this.f32893a.add(EnumC5501n0.DEFINE_FUNCTION);
        this.f32893a.add(EnumC5501n0.FN);
        this.f32893a.add(EnumC5501n0.IF);
        this.f32893a.add(EnumC5501n0.QUOTE);
        this.f32893a.add(EnumC5501n0.RETURN);
        this.f32893a.add(EnumC5501n0.SWITCH);
        this.f32893a.add(EnumC5501n0.TERNARY);
    }

    /* renamed from: c */
    private static InterfaceC5551q m28855c(C5590s4 c5590s4, List list) {
        AbstractC5608t5.m29618i(EnumC5501n0.FN.name(), 2, list);
        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
        if (m29589b2 instanceof C5364f) {
            List m29107r = ((C5364f) m29589b2).m29107r();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C5534p(m29589b.zzi(), m29107r, arrayList, c5590s4);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", m29589b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:            if (r8.equals("continue") == false) goto L64;     */
    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        InterfaceC5551q interfaceC5551q;
        InterfaceC5551q interfaceC5551q2;
        InterfaceC5551q m29589b;
        EnumC5501n0 enumC5501n0 = EnumC5501n0.ADD;
        int ordinal = AbstractC5608t5.m29614e(str).ordinal();
        if (ordinal != 2) {
            if (ordinal != 15) {
                if (ordinal != 25) {
                    if (ordinal != 41) {
                        if (ordinal != 54) {
                            if (ordinal != 57) {
                                if (ordinal != 19) {
                                    if (ordinal != 20) {
                                        if (ordinal != 60) {
                                            if (ordinal != 61) {
                                                switch (ordinal) {
                                                    case 11:
                                                        return c5590s4.m29588a().m29590c(new C5364f(list));
                                                    case 12:
                                                        AbstractC5608t5.m29617h(EnumC5501n0.BREAK.name(), 0, list);
                                                        return InterfaceC5551q.f32733g;
                                                    case 13:
                                                        break;
                                                    default:
                                                        return super.m29990b(str);
                                                }
                                            } else {
                                                AbstractC5608t5.m29617h(EnumC5501n0.TERNARY.name(), 3, list);
                                                if (c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzg().booleanValue()) {
                                                    return c5590s4.m29589b((InterfaceC5551q) list.get(1));
                                                }
                                                return c5590s4.m29589b((InterfaceC5551q) list.get(2));
                                            }
                                        } else {
                                            AbstractC5608t5.m29617h(EnumC5501n0.SWITCH.name(), 3, list);
                                            InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                                            InterfaceC5551q m29589b3 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
                                            InterfaceC5551q m29589b4 = c5590s4.m29589b((InterfaceC5551q) list.get(2));
                                            if (m29589b3 instanceof C5364f) {
                                                if (m29589b4 instanceof C5364f) {
                                                    C5364f c5364f = (C5364f) m29589b3;
                                                    C5364f c5364f2 = (C5364f) m29589b4;
                                                    int i11 = 0;
                                                    boolean z11 = false;
                                                    while (true) {
                                                        if (i11 < c5364f.m29103l()) {
                                                            if (!z11 && !m29589b2.equals(c5590s4.m29589b(c5364f.m29104m(i11)))) {
                                                                z11 = false;
                                                            } else {
                                                                m29589b = c5590s4.m29589b(c5364f2.m29104m(i11));
                                                                if (m29589b instanceof C5398h) {
                                                                    if (((C5398h) m29589b).m29166b().equals("break")) {
                                                                        return InterfaceC5551q.f32730d;
                                                                    }
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                            }
                                                            i11++;
                                                        } else {
                                                            if (c5364f.m29103l() + 1 == c5364f2.m29103l()) {
                                                                m29589b = c5590s4.m29589b(c5364f2.m29104m(c5364f.m29103l()));
                                                                if (m29589b instanceof C5398h) {
                                                                    String m29166b = ((C5398h) m29589b).m29166b();
                                                                    if (!m29166b.equals("return")) {
                                                                    }
                                                                }
                                                            }
                                                            return InterfaceC5551q.f32730d;
                                                        }
                                                    }
                                                    return m29589b;
                                                }
                                                throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                                            }
                                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                                        }
                                    } else {
                                        AbstractC5608t5.m29618i(EnumC5501n0.DEFINE_FUNCTION.name(), 2, list);
                                        InterfaceC5551q m28855c = m28855c(c5590s4, list);
                                        AbstractC5432j abstractC5432j = (AbstractC5432j) m28855c;
                                        if (abstractC5432j.m29267b() == null) {
                                            c5590s4.m29594g("", m28855c);
                                        } else {
                                            c5590s4.m29594g(abstractC5432j.m29267b(), m28855c);
                                        }
                                        return m28855c;
                                    }
                                }
                                if (list.isEmpty()) {
                                    return InterfaceC5551q.f32730d;
                                }
                                InterfaceC5551q m29589b5 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                                if (m29589b5 instanceof C5364f) {
                                    return c5590s4.m29590c((C5364f) m29589b5);
                                }
                                return InterfaceC5551q.f32730d;
                            }
                            if (list.isEmpty()) {
                                return InterfaceC5551q.f32734h;
                            }
                            AbstractC5608t5.m29617h(EnumC5501n0.RETURN.name(), 1, list);
                            return new C5398h("return", c5590s4.m29589b((InterfaceC5551q) list.get(0)));
                        }
                        return new C5364f(list);
                    }
                    AbstractC5608t5.m29618i(EnumC5501n0.IF.name(), 2, list);
                    InterfaceC5551q m29589b6 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                    InterfaceC5551q m29589b7 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
                    if (list.size() > 2) {
                        interfaceC5551q = c5590s4.m29589b((InterfaceC5551q) list.get(2));
                    } else {
                        interfaceC5551q = null;
                    }
                    InterfaceC5551q interfaceC5551q3 = InterfaceC5551q.f32730d;
                    if (m29589b6.zzg().booleanValue()) {
                        interfaceC5551q2 = c5590s4.m29590c((C5364f) m29589b7);
                    } else if (interfaceC5551q != null) {
                        interfaceC5551q2 = c5590s4.m29590c((C5364f) interfaceC5551q);
                    } else {
                        interfaceC5551q2 = interfaceC5551q3;
                    }
                    if (interfaceC5551q2 instanceof C5398h) {
                        return interfaceC5551q2;
                    }
                    return interfaceC5551q3;
                }
                return m28855c(c5590s4, list);
            }
            AbstractC5608t5.m29617h(EnumC5501n0.BREAK.name(), 0, list);
            return InterfaceC5551q.f32732f;
        }
        AbstractC5608t5.m29617h(EnumC5501n0.APPLY.name(), 3, list);
        InterfaceC5551q m29589b8 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        String zzi = c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzi();
        InterfaceC5551q m29589b9 = c5590s4.m29589b((InterfaceC5551q) list.get(2));
        if (m29589b9 instanceof C5364f) {
            if (!zzi.isEmpty()) {
                return m29589b8.mo29098d(zzi, c5590s4, ((C5364f) m29589b9).m29107r());
            }
            throw new IllegalArgumentException("Function name for apply is undefined");
        }
        throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", m29589b9.getClass().getCanonicalName()));
    }
}
