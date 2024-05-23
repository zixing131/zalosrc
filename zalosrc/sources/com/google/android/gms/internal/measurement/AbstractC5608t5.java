package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
/* loaded from: classes2.dex */
public abstract class AbstractC5608t5 {
    /* renamed from: a */
    public static double m29610a(double d11) {
        int i11;
        if (Double.isNaN(d11)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d11) && d11 != 0.0d && d11 != 0.0d) {
            if (d11 > 0.0d) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            return i11 * Math.floor(Math.abs(d11));
        }
        return d11;
    }

    /* renamed from: b */
    public static int m29611b(double d11) {
        int i11;
        if (!Double.isNaN(d11) && !Double.isInfinite(d11) && d11 != 0.0d) {
            if (d11 > 0.0d) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            return (int) ((i11 * Math.floor(Math.abs(d11))) % 4.294967296E9d);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m29612c(C5590s4 c5590s4) {
        int m29611b = m29611b(c5590s4.m29591d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (m29611b <= 1000000) {
            c5590s4.m29594g("runtime.counter", new C5415i(Double.valueOf(m29611b)));
            return m29611b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m29613d(double d11) {
        return m29611b(d11) & 4294967295L;
    }

    /* renamed from: e */
    public static EnumC5501n0 m29614e(String str) {
        EnumC5501n0 enumC5501n0 = null;
        if (str != null && !str.isEmpty()) {
            enumC5501n0 = EnumC5501n0.m29458b(Integer.parseInt(str));
        }
        if (enumC5501n0 != null) {
            return enumC5501n0;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* renamed from: f */
    public static Object m29615f(InterfaceC5551q interfaceC5551q) {
        if (InterfaceC5551q.f32731e.equals(interfaceC5551q)) {
            return null;
        }
        if (InterfaceC5551q.f32730d.equals(interfaceC5551q)) {
            return "";
        }
        if (interfaceC5551q instanceof C5500n) {
            return m29616g((C5500n) interfaceC5551q);
        }
        if (interfaceC5551q instanceof C5364f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C5364f) interfaceC5551q).iterator();
            while (it.hasNext()) {
                Object m29615f = m29615f((InterfaceC5551q) it.next());
                if (m29615f != null) {
                    arrayList.add(m29615f);
                }
            }
            return arrayList;
        }
        if (!interfaceC5551q.zzh().isNaN()) {
            return interfaceC5551q.zzh();
        }
        return interfaceC5551q.zzi();
    }

    /* renamed from: g */
    public static Map m29616g(C5500n c5500n) {
        HashMap hashMap = new HashMap();
        for (String str : c5500n.m29457a()) {
            Object m29615f = m29615f(c5500n.mo29101j(str));
            if (m29615f != null) {
                hashMap.put(str, m29615f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m29617h(String str, int i11, List list) {
        if (list.size() == i11) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i11), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: i */
    public static void m29618i(String str, int i11, List list) {
        if (list.size() >= i11) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i11), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: j */
    public static void m29619j(String str, int i11, List list) {
        if (list.size() <= i11) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i11), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: k */
    public static boolean m29620k(InterfaceC5551q interfaceC5551q) {
        if (interfaceC5551q == null) {
            return false;
        }
        Double zzh = interfaceC5551q.zzh();
        if (zzh.isNaN() || zzh.doubleValue() < 0.0d || !zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m29621l(InterfaceC5551q interfaceC5551q, InterfaceC5551q interfaceC5551q2) {
        if (!interfaceC5551q.getClass().equals(interfaceC5551q2.getClass())) {
            return false;
        }
        if ((interfaceC5551q instanceof C5636v) || (interfaceC5551q instanceof C5517o)) {
            return true;
        }
        if (interfaceC5551q instanceof C5415i) {
            if (Double.isNaN(interfaceC5551q.zzh().doubleValue()) || Double.isNaN(interfaceC5551q2.zzh().doubleValue())) {
                return false;
            }
            return interfaceC5551q.zzh().equals(interfaceC5551q2.zzh());
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
}
