package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.v0 */
/* loaded from: classes2.dex */
final class C5077v0 extends AbstractC5114w0 {

    /* renamed from: b */
    private long f29103b;

    /* renamed from: c */
    private long[] f29104c;

    /* renamed from: d */
    private long[] f29105d;

    public C5077v0() {
        super(new im4());
        this.f29103b = -9223372036854775807L;
        this.f29104c = new long[0];
        this.f29105d = new long[0];
    }

    /* renamed from: g */
    private static Double m27102g(x02 x02Var) {
        return Double.valueOf(Double.longBitsToDouble(x02Var.m27795z()));
    }

    /* renamed from: h */
    private static Object m27103h(x02 x02Var, int i11) {
        if (i11 != 0) {
            boolean z11 = false;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 8) {
                            if (i11 != 10) {
                                if (i11 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) m27102g(x02Var).doubleValue());
                                x02Var.m27776g(2);
                                return date;
                            }
                            int m27791v = x02Var.m27791v();
                            ArrayList arrayList = new ArrayList(m27791v);
                            for (int i12 = 0; i12 < m27791v; i12++) {
                                Object m27103h = m27103h(x02Var, x02Var.m27788s());
                                if (m27103h != null) {
                                    arrayList.add(m27103h);
                                }
                            }
                            return arrayList;
                        }
                        return m27105j(x02Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String m27104i = m27104i(x02Var);
                        int m27788s = x02Var.m27788s();
                        if (m27788s == 9) {
                            return hashMap;
                        }
                        Object m27103h2 = m27103h(x02Var, m27788s);
                        if (m27103h2 != null) {
                            hashMap.put(m27104i, m27103h2);
                        }
                    }
                } else {
                    return m27104i(x02Var);
                }
            } else {
                if (x02Var.m27788s() == 1) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        } else {
            return m27102g(x02Var);
        }
    }

    /* renamed from: i */
    private static String m27104i(x02 x02Var) {
        int m27792w = x02Var.m27792w();
        int m27780k = x02Var.m27780k();
        x02Var.m27776g(m27792w);
        return new String(x02Var.m27777h(), m27780k, m27792w);
    }

    /* renamed from: j */
    private static HashMap m27105j(x02 x02Var) {
        int m27791v = x02Var.m27791v();
        HashMap hashMap = new HashMap(m27791v);
        for (int i11 = 0; i11 < m27791v; i11++) {
            String m27104i = m27104i(x02Var);
            Object m27103h = m27103h(x02Var, x02Var.m27788s());
            if (m27103h != null) {
                hashMap.put(m27104i, m27103h);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5114w0
    /* renamed from: a */
    protected final boolean mo26217a(x02 x02Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5114w0
    /* renamed from: b */
    protected final boolean mo26218b(x02 x02Var, long j11) {
        if (x02Var.m27788s() != 2 || !"onMetaData".equals(m27104i(x02Var)) || x02Var.m27778i() == 0 || x02Var.m27788s() != 8) {
            return false;
        }
        HashMap m27105j = m27105j(x02Var);
        Object obj = m27105j.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f29103b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m27105j.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f29104c = new long[size];
                this.f29105d = new long[size];
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj5 = list.get(i11);
                    Object obj6 = list2.get(i11);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f29104c[i11] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f29105d[i11] = ((Double) obj5).longValue();
                    } else {
                        this.f29104c = new long[0];
                        this.f29105d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long m27106d() {
        return this.f29103b;
    }

    /* renamed from: e */
    public final long[] m27107e() {
        return this.f29105d;
    }

    /* renamed from: f */
    public final long[] m27108f() {
        return this.f29104c;
    }
}
