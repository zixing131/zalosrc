package com.google.android.gms.internal.measurement;

import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* loaded from: classes2.dex */
public final class C5433j0 extends AbstractC5670x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C5433j0() {
        this.f32893a.add(EnumC5501n0.FOR_IN);
        this.f32893a.add(EnumC5501n0.FOR_IN_CONST);
        this.f32893a.add(EnumC5501n0.FOR_IN_LET);
        this.f32893a.add(EnumC5501n0.FOR_LET);
        this.f32893a.add(EnumC5501n0.FOR_OF);
        this.f32893a.add(EnumC5501n0.FOR_OF_CONST);
        this.f32893a.add(EnumC5501n0.FOR_OF_LET);
        this.f32893a.add(EnumC5501n0.WHILE);
    }

    /* renamed from: c */
    private static InterfaceC5551q m29268c(InterfaceC5399h0 interfaceC5399h0, Iterator it, InterfaceC5551q interfaceC5551q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC5551q m29590c = interfaceC5399h0.mo29113a((InterfaceC5551q) it.next()).m29590c((C5364f) interfaceC5551q);
                if (m29590c instanceof C5398h) {
                    C5398h c5398h = (C5398h) m29590c;
                    if ("break".equals(c5398h.m29166b())) {
                        return InterfaceC5551q.f32730d;
                    }
                    if ("return".equals(c5398h.m29166b())) {
                        return c5398h;
                    }
                }
            }
        }
        return InterfaceC5551q.f32730d;
    }

    /* renamed from: d */
    private static InterfaceC5551q m29269d(InterfaceC5399h0 interfaceC5399h0, InterfaceC5551q interfaceC5551q, InterfaceC5551q interfaceC5551q2) {
        return m29268c(interfaceC5399h0, interfaceC5551q.zzl(), interfaceC5551q2);
    }

    /* renamed from: e */
    private static InterfaceC5551q m29270e(InterfaceC5399h0 interfaceC5399h0, InterfaceC5551q interfaceC5551q, InterfaceC5551q interfaceC5551q2) {
        if (interfaceC5551q instanceof Iterable) {
            return m29268c(interfaceC5399h0, ((Iterable) interfaceC5551q).iterator(), interfaceC5551q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        EnumC5501n0 enumC5501n0 = EnumC5501n0.ADD;
        int ordinal = AbstractC5608t5.m29614e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    AbstractC5608t5.m29617h(EnumC5501n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C5619u) {
                        String zzi = ((InterfaceC5551q) list.get(0)).zzi();
                        return m29269d(new C5416i0(c5590s4, zzi), c5590s4.m29589b((InterfaceC5551q) list.get(1)), c5590s4.m29589b((InterfaceC5551q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    AbstractC5608t5.m29617h(EnumC5501n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C5619u) {
                        String zzi2 = ((InterfaceC5551q) list.get(0)).zzi();
                        return m29269d(new C5365f0(c5590s4, zzi2), c5590s4.m29589b((InterfaceC5551q) list.get(1)), c5590s4.m29589b((InterfaceC5551q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    AbstractC5608t5.m29617h(EnumC5501n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C5619u) {
                        String zzi3 = ((InterfaceC5551q) list.get(0)).zzi();
                        return m29269d(new C5382g0(c5590s4, zzi3), c5590s4.m29589b((InterfaceC5551q) list.get(1)), c5590s4.m29589b((InterfaceC5551q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    AbstractC5608t5.m29617h(EnumC5501n0.FOR_LET.name(), 4, list);
                    InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                    if (m29589b instanceof C5364f) {
                        C5364f c5364f = (C5364f) m29589b;
                        InterfaceC5551q interfaceC5551q = (InterfaceC5551q) list.get(1);
                        InterfaceC5551q interfaceC5551q2 = (InterfaceC5551q) list.get(2);
                        InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(3));
                        C5590s4 m29588a = c5590s4.m29588a();
                        for (int i11 = 0; i11 < c5364f.m29103l(); i11++) {
                            String zzi4 = c5364f.m29104m(i11).zzi();
                            m29588a.m29594g(zzi4, c5590s4.m29591d(zzi4));
                        }
                        while (c5590s4.m29589b(interfaceC5551q).zzg().booleanValue()) {
                            InterfaceC5551q m29590c = c5590s4.m29590c((C5364f) m29589b2);
                            if (m29590c instanceof C5398h) {
                                C5398h c5398h = (C5398h) m29590c;
                                if ("break".equals(c5398h.m29166b())) {
                                    return InterfaceC5551q.f32730d;
                                }
                                if ("return".equals(c5398h.m29166b())) {
                                    return c5398h;
                                }
                            }
                            C5590s4 m29588a2 = c5590s4.m29588a();
                            for (int i12 = 0; i12 < c5364f.m29103l(); i12++) {
                                String zzi5 = c5364f.m29104m(i12).zzi();
                                m29588a2.m29594g(zzi5, m29588a.m29591d(zzi5));
                            }
                            m29588a2.m29589b(interfaceC5551q2);
                            m29588a = m29588a2;
                        }
                        return InterfaceC5551q.f32730d;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    AbstractC5608t5.m29617h(EnumC5501n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C5619u) {
                        String zzi6 = ((InterfaceC5551q) list.get(0)).zzi();
                        return m29270e(new C5416i0(c5590s4, zzi6), c5590s4.m29589b((InterfaceC5551q) list.get(1)), c5590s4.m29589b((InterfaceC5551q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    AbstractC5608t5.m29617h(EnumC5501n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C5619u) {
                        String zzi7 = ((InterfaceC5551q) list.get(0)).zzi();
                        return m29270e(new C5365f0(c5590s4, zzi7), c5590s4.m29589b((InterfaceC5551q) list.get(1)), c5590s4.m29589b((InterfaceC5551q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    AbstractC5608t5.m29617h(EnumC5501n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C5619u) {
                        String zzi8 = ((InterfaceC5551q) list.get(0)).zzi();
                        return m29270e(new C5382g0(c5590s4, zzi8), c5590s4.m29589b((InterfaceC5551q) list.get(1)), c5590s4.m29589b((InterfaceC5551q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.m29990b(str);
            }
        }
        AbstractC5608t5.m29617h(EnumC5501n0.WHILE.name(), 4, list);
        InterfaceC5551q interfaceC5551q3 = (InterfaceC5551q) list.get(0);
        InterfaceC5551q interfaceC5551q4 = (InterfaceC5551q) list.get(1);
        InterfaceC5551q interfaceC5551q5 = (InterfaceC5551q) list.get(2);
        InterfaceC5551q m29589b3 = c5590s4.m29589b((InterfaceC5551q) list.get(3));
        if (c5590s4.m29589b(interfaceC5551q5).zzg().booleanValue()) {
            InterfaceC5551q m29590c2 = c5590s4.m29590c((C5364f) m29589b3);
            if (m29590c2 instanceof C5398h) {
                C5398h c5398h2 = (C5398h) m29590c2;
                if ("break".equals(c5398h2.m29166b())) {
                    return InterfaceC5551q.f32730d;
                }
                if ("return".equals(c5398h2.m29166b())) {
                    return c5398h2;
                }
            }
        }
        while (c5590s4.m29589b(interfaceC5551q3).zzg().booleanValue()) {
            InterfaceC5551q m29590c3 = c5590s4.m29590c((C5364f) m29589b3);
            if (m29590c3 instanceof C5398h) {
                C5398h c5398h3 = (C5398h) m29590c3;
                if ("break".equals(c5398h3.m29166b())) {
                    return InterfaceC5551q.f32730d;
                }
                if ("return".equals(c5398h3.m29166b())) {
                    return c5398h3;
                }
            }
            c5590s4.m29589b(interfaceC5551q4);
        }
        return InterfaceC5551q.f32730d;
    }
}
