package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class vl4 {
    /* renamed from: a */
    public static void m27303a(long j11, x02 x02Var, InterfaceC4928r[] interfaceC4928rArr) {
        int i11;
        boolean z11;
        while (true) {
            boolean z12 = true;
            if (x02Var.m27778i() > 1) {
                int m27305c = m27305c(x02Var);
                int m27305c2 = m27305c(x02Var);
                int m27780k = x02Var.m27780k() + m27305c2;
                if (m27305c2 != -1 && m27305c2 <= x02Var.m27778i()) {
                    if (m27305c == 4 && m27305c2 >= 8) {
                        int m27788s = x02Var.m27788s();
                        int m27792w = x02Var.m27792w();
                        if (m27792w == 49) {
                            i11 = x02Var.m27782m();
                            m27792w = 49;
                        } else {
                            i11 = 0;
                        }
                        int m27788s2 = x02Var.m27788s();
                        if (m27792w == 47) {
                            x02Var.m27776g(1);
                            m27792w = 47;
                        }
                        if (m27788s != 181 || ((m27792w != 49 && m27792w != 47) || m27788s2 != 3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (m27792w == 49) {
                            if (i11 != 1195456820) {
                                z12 = false;
                            }
                            z11 &= z12;
                        }
                        if (z11) {
                            m27304b(j11, x02Var, interfaceC4928rArr);
                        }
                    }
                } else {
                    lr1.m24356e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    m27780k = x02Var.m27781l();
                }
                x02Var.m27775f(m27780k);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m27304b(long j11, x02 x02Var, InterfaceC4928r[] interfaceC4928rArr) {
        int m27788s = x02Var.m27788s();
        if ((m27788s & 64) != 0) {
            x02Var.m27776g(1);
            int i11 = (m27788s & 31) * 3;
            int m27780k = x02Var.m27780k();
            for (InterfaceC4928r interfaceC4928r : interfaceC4928rArr) {
                x02Var.m27775f(m27780k);
                interfaceC4928r.mo23301e(x02Var, i11);
                if (j11 != -9223372036854775807L) {
                    interfaceC4928r.mo23302f(j11, 1, i11, 0, null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m27305c(x02 x02Var) {
        int i11 = 0;
        while (x02Var.m27778i() != 0) {
            int m27788s = x02Var.m27788s();
            i11 += m27788s;
            if (m27788s != 255) {
                return i11;
            }
        }
        return -1;
    }
}
