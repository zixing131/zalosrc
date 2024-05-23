package com.google.android.gms.internal.measurement;

import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5331d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static InterfaceC5551q m29033a(String str, C5364f c5364f, C5590s4 c5590s4, List list) {
        char c11;
        double d11;
        String str2;
        double d12;
        double d13;
        double min;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        AbstractC5432j abstractC5432j = null;
        switch (c11) {
            case 0:
                InterfaceC5551q zzd = c5364f.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) it.next());
                        if (!(m29589b instanceof C5398h)) {
                            C5364f c5364f2 = (C5364f) zzd;
                            int m29103l = c5364f2.m29103l();
                            if (m29589b instanceof C5364f) {
                                C5364f c5364f3 = (C5364f) m29589b;
                                Iterator m29106p = c5364f3.m29106p();
                                while (m29106p.hasNext()) {
                                    Integer num = (Integer) m29106p.next();
                                    c5364f2.m29111v(num.intValue() + m29103l, c5364f3.m29104m(num.intValue()));
                                }
                            } else {
                                c5364f2.m29111v(m29103l, m29589b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzd;
            case 1:
                AbstractC5608t5.m29617h("every", 1, list);
                InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                if (m29589b2 instanceof C5534p) {
                    if (c5364f.m29103l() == 0) {
                        return InterfaceC5551q.f32735i;
                    }
                    if (m29034b(c5364f, c5590s4, (C5534p) m29589b2, Boolean.FALSE, Boolean.TRUE).m29103l() != c5364f.m29103l()) {
                        return InterfaceC5551q.f32736j;
                    }
                    return InterfaceC5551q.f32735i;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                AbstractC5608t5.m29617h("filter", 1, list);
                InterfaceC5551q m29589b3 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                if (m29589b3 instanceof C5534p) {
                    if (c5364f.m29102k() == 0) {
                        return new C5364f();
                    }
                    InterfaceC5551q zzd2 = c5364f.zzd();
                    C5364f m29034b = m29034b(c5364f, c5590s4, (C5534p) m29589b3, null, Boolean.TRUE);
                    C5364f c5364f4 = new C5364f();
                    Iterator m29106p2 = m29034b.m29106p();
                    while (m29106p2.hasNext()) {
                        c5364f4.m29111v(c5364f4.m29103l(), ((C5364f) zzd2).m29104m(((Integer) m29106p2.next()).intValue()));
                    }
                    return c5364f4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                AbstractC5608t5.m29617h("forEach", 1, list);
                InterfaceC5551q m29589b4 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                if (m29589b4 instanceof C5534p) {
                    if (c5364f.m29102k() == 0) {
                        return InterfaceC5551q.f32730d;
                    }
                    m29034b(c5364f, c5590s4, (C5534p) m29589b4, null, null);
                    return InterfaceC5551q.f32730d;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                AbstractC5608t5.m29619j("indexOf", 2, list);
                InterfaceC5551q interfaceC5551q = InterfaceC5551q.f32730d;
                if (!list.isEmpty()) {
                    interfaceC5551q = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                }
                if (list.size() > 1) {
                    double m29610a = AbstractC5608t5.m29610a(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue());
                    if (m29610a >= c5364f.m29103l()) {
                        return new C5415i(Double.valueOf(-1.0d));
                    }
                    if (m29610a < 0.0d) {
                        d11 = c5364f.m29103l() + m29610a;
                    } else {
                        d11 = m29610a;
                    }
                } else {
                    d11 = 0.0d;
                }
                Iterator m29106p3 = c5364f.m29106p();
                while (m29106p3.hasNext()) {
                    int intValue = ((Integer) m29106p3.next()).intValue();
                    double d14 = intValue;
                    if (d14 >= d11 && AbstractC5608t5.m29621l(c5364f.m29104m(intValue), interfaceC5551q)) {
                        return new C5415i(Double.valueOf(d14));
                    }
                }
                return new C5415i(Double.valueOf(-1.0d));
            case 5:
                AbstractC5608t5.m29619j("join", 1, list);
                if (c5364f.m29103l() == 0) {
                    return InterfaceC5551q.f32737k;
                }
                if (!list.isEmpty()) {
                    InterfaceC5551q m29589b5 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                    if (!(m29589b5 instanceof C5517o) && !(m29589b5 instanceof C5636v)) {
                        str2 = m29589b5.zzi();
                    } else {
                        str2 = "";
                    }
                } else {
                    str2 = ",";
                }
                return new C5619u(c5364f.m29105n(str2));
            case 6:
                AbstractC5608t5.m29619j("lastIndexOf", 2, list);
                InterfaceC5551q interfaceC5551q2 = InterfaceC5551q.f32730d;
                if (!list.isEmpty()) {
                    interfaceC5551q2 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                }
                int m29103l2 = c5364f.m29103l() - 1;
                if (list.size() > 1) {
                    InterfaceC5551q m29589b6 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
                    d13 = Double.isNaN(m29589b6.zzh().doubleValue()) ? c5364f.m29103l() - 1 : AbstractC5608t5.m29610a(m29589b6.zzh().doubleValue());
                    d12 = 0.0d;
                    if (d13 < 0.0d) {
                        d13 += c5364f.m29103l();
                    }
                } else {
                    d12 = 0.0d;
                    d13 = m29103l2;
                }
                if (d13 < d12) {
                    return new C5415i(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(c5364f.m29103l(), d13); min2 >= 0; min2--) {
                    if (c5364f.m29112w(min2) && AbstractC5608t5.m29621l(c5364f.m29104m(min2), interfaceC5551q2)) {
                        return new C5415i(Double.valueOf(min2));
                    }
                }
                return new C5415i(Double.valueOf(-1.0d));
            case 7:
                AbstractC5608t5.m29617h("map", 1, list);
                InterfaceC5551q m29589b7 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                if (m29589b7 instanceof C5534p) {
                    if (c5364f.m29103l() == 0) {
                        return new C5364f();
                    }
                    return m29034b(c5364f, c5590s4, (C5534p) m29589b7, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                AbstractC5608t5.m29617h("pop", 0, list);
                int m29103l3 = c5364f.m29103l();
                if (m29103l3 == 0) {
                    return InterfaceC5551q.f32730d;
                }
                int i11 = m29103l3 - 1;
                InterfaceC5551q m29104m = c5364f.m29104m(i11);
                c5364f.m29110u(i11);
                return m29104m;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c5364f.m29111v(c5364f.m29103l(), c5590s4.m29589b((InterfaceC5551q) it2.next()));
                    }
                }
                return new C5415i(Double.valueOf(c5364f.m29103l()));
            case '\n':
                return m29035c(c5364f, c5590s4, list, true);
            case 11:
                return m29035c(c5364f, c5590s4, list, false);
            case '\f':
                AbstractC5608t5.m29617h("reverse", 0, list);
                int m29103l4 = c5364f.m29103l();
                if (m29103l4 != 0) {
                    for (int i12 = 0; i12 < m29103l4 / 2; i12++) {
                        if (c5364f.m29112w(i12)) {
                            InterfaceC5551q m29104m2 = c5364f.m29104m(i12);
                            c5364f.m29111v(i12, null);
                            int i13 = (m29103l4 - 1) - i12;
                            if (c5364f.m29112w(i13)) {
                                c5364f.m29111v(i12, c5364f.m29104m(i13));
                            }
                            c5364f.m29111v(i13, m29104m2);
                        }
                    }
                }
                return c5364f;
            case '\r':
                AbstractC5608t5.m29617h("shift", 0, list);
                if (c5364f.m29103l() == 0) {
                    return InterfaceC5551q.f32730d;
                }
                InterfaceC5551q m29104m3 = c5364f.m29104m(0);
                c5364f.m29110u(0);
                return m29104m3;
            case 14:
                AbstractC5608t5.m29619j("slice", 2, list);
                if (list.isEmpty()) {
                    return c5364f.zzd();
                }
                double m29103l5 = c5364f.m29103l();
                double m29610a2 = AbstractC5608t5.m29610a(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue());
                if (m29610a2 < 0.0d) {
                    min = Math.max(m29610a2 + m29103l5, 0.0d);
                } else {
                    min = Math.min(m29610a2, m29103l5);
                }
                if (list.size() == 2) {
                    double m29610a3 = AbstractC5608t5.m29610a(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue());
                    if (m29610a3 < 0.0d) {
                        m29103l5 = Math.max(m29103l5 + m29610a3, 0.0d);
                    } else {
                        m29103l5 = Math.min(m29103l5, m29610a3);
                    }
                }
                C5364f c5364f5 = new C5364f();
                for (int i14 = (int) min; i14 < m29103l5; i14++) {
                    c5364f5.m29111v(c5364f5.m29103l(), c5364f.m29104m(i14));
                }
                return c5364f5;
            case 15:
                AbstractC5608t5.m29617h("some", 1, list);
                InterfaceC5551q m29589b8 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                if (m29589b8 instanceof AbstractC5432j) {
                    if (c5364f.m29103l() == 0) {
                        return InterfaceC5551q.f32736j;
                    }
                    AbstractC5432j abstractC5432j2 = (AbstractC5432j) m29589b8;
                    Iterator m29106p4 = c5364f.m29106p();
                    while (m29106p4.hasNext()) {
                        int intValue2 = ((Integer) m29106p4.next()).intValue();
                        if (c5364f.m29112w(intValue2) && abstractC5432j2.mo28891a(c5590s4, Arrays.asList(c5364f.m29104m(intValue2), new C5415i(Double.valueOf(intValue2)), c5364f)).zzg().booleanValue()) {
                            return InterfaceC5551q.f32735i;
                        }
                    }
                    return InterfaceC5551q.f32736j;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                AbstractC5608t5.m29619j("sort", 1, list);
                if (c5364f.m29103l() >= 2) {
                    List m29107r = c5364f.m29107r();
                    if (!list.isEmpty()) {
                        InterfaceC5551q m29589b9 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                        if (m29589b9 instanceof AbstractC5432j) {
                            abstractC5432j = (AbstractC5432j) m29589b9;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(m29107r, new C5314c0(abstractC5432j, c5590s4));
                    c5364f.m29108s();
                    Iterator it3 = m29107r.iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        c5364f.m29111v(i15, (InterfaceC5551q) it3.next());
                        i15++;
                    }
                }
                return c5364f;
            case 17:
                if (list.isEmpty()) {
                    return new C5364f();
                }
                int m29610a4 = (int) AbstractC5608t5.m29610a(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue());
                if (m29610a4 < 0) {
                    m29610a4 = Math.max(0, m29610a4 + c5364f.m29103l());
                } else if (m29610a4 > c5364f.m29103l()) {
                    m29610a4 = c5364f.m29103l();
                }
                int m29103l6 = c5364f.m29103l();
                C5364f c5364f6 = new C5364f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) AbstractC5608t5.m29610a(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()));
                    if (max > 0) {
                        for (int i16 = m29610a4; i16 < Math.min(m29103l6, m29610a4 + max); i16++) {
                            c5364f6.m29111v(c5364f6.m29103l(), c5364f.m29104m(m29610a4));
                            c5364f.m29110u(m29610a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i17 = 2; i17 < list.size(); i17++) {
                            InterfaceC5551q m29589b10 = c5590s4.m29589b((InterfaceC5551q) list.get(i17));
                            if (!(m29589b10 instanceof C5398h)) {
                                c5364f.m29109t((m29610a4 + i17) - 2, m29589b10);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (m29610a4 < m29103l6) {
                        c5364f6.m29111v(c5364f6.m29103l(), c5364f.m29104m(m29610a4));
                        c5364f.m29111v(m29610a4, null);
                        m29610a4++;
                    }
                }
                return c5364f6;
            case 18:
                AbstractC5608t5.m29617h("toString", 0, list);
                return new C5619u(c5364f.m29105n(","));
            case 19:
                if (!list.isEmpty()) {
                    C5364f c5364f7 = new C5364f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        InterfaceC5551q m29589b11 = c5590s4.m29589b((InterfaceC5551q) it4.next());
                        if (!(m29589b11 instanceof C5398h)) {
                            c5364f7.m29111v(c5364f7.m29103l(), m29589b11);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int m29103l7 = c5364f7.m29103l();
                    Iterator m29106p5 = c5364f.m29106p();
                    while (m29106p5.hasNext()) {
                        Integer num2 = (Integer) m29106p5.next();
                        c5364f7.m29111v(num2.intValue() + m29103l7, c5364f.m29104m(num2.intValue()));
                    }
                    c5364f.m29108s();
                    Iterator m29106p6 = c5364f7.m29106p();
                    while (m29106p6.hasNext()) {
                        Integer num3 = (Integer) m29106p6.next();
                        c5364f.m29111v(num3.intValue(), c5364f7.m29104m(num3.intValue()));
                    }
                }
                return new C5415i(Double.valueOf(c5364f.m29103l()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* renamed from: b */
    private static C5364f m29034b(C5364f c5364f, C5590s4 c5590s4, AbstractC5432j abstractC5432j, Boolean bool, Boolean bool2) {
        C5364f c5364f2 = new C5364f();
        Iterator m29106p = c5364f.m29106p();
        while (m29106p.hasNext()) {
            int intValue = ((Integer) m29106p.next()).intValue();
            if (c5364f.m29112w(intValue)) {
                InterfaceC5551q mo28891a = abstractC5432j.mo28891a(c5590s4, Arrays.asList(c5364f.m29104m(intValue), new C5415i(Double.valueOf(intValue)), c5364f));
                if (mo28891a.zzg().equals(bool)) {
                    return c5364f2;
                }
                if (bool2 == null || mo28891a.zzg().equals(bool2)) {
                    c5364f2.m29111v(intValue, mo28891a);
                }
            }
        }
        return c5364f2;
    }

    /* renamed from: c */
    private static InterfaceC5551q m29035c(C5364f c5364f, C5590s4 c5590s4, List list, boolean z11) {
        InterfaceC5551q interfaceC5551q;
        int i11;
        int i12;
        AbstractC5608t5.m29618i("reduce", 1, list);
        AbstractC5608t5.m29619j("reduce", 2, list);
        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        if (m29589b instanceof AbstractC5432j) {
            if (list.size() == 2) {
                interfaceC5551q = c5590s4.m29589b((InterfaceC5551q) list.get(1));
                if (interfaceC5551q instanceof C5398h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c5364f.m29103l() != 0) {
                interfaceC5551q = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC5432j abstractC5432j = (AbstractC5432j) m29589b;
            int m29103l = c5364f.m29103l();
            if (z11) {
                i11 = 0;
            } else {
                i11 = m29103l - 1;
            }
            int i13 = -1;
            if (z11) {
                i12 = m29103l - 1;
            } else {
                i12 = 0;
            }
            if (true == z11) {
                i13 = 1;
            }
            if (interfaceC5551q == null) {
                interfaceC5551q = c5364f.m29104m(i11);
                i11 += i13;
            }
            while ((i12 - i11) * i13 >= 0) {
                if (!c5364f.m29112w(i11)) {
                    i11 += i13;
                } else {
                    interfaceC5551q = abstractC5432j.mo28891a(c5590s4, Arrays.asList(interfaceC5551q, c5364f.m29104m(i11), new C5415i(Double.valueOf(i11)), c5364f));
                    if (!(interfaceC5551q instanceof C5398h)) {
                        i11 += i13;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return interfaceC5551q;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
