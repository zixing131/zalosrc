package me0;

import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.zviews.MiniProfileView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import gw.C19669z;
import is.C20834z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C31874cb;
import p716zh.C32002l4;

/* renamed from: me0.g2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23074g2 {
    /* renamed from: a */
    public static void m118375a(int i11, String str, String str2, int i12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m118376b(i11, arrayList, str2, i12);
    }

    /* renamed from: b */
    public static void m118376b(int i11, List list, String str, int i12) {
        m118377c(i11, list, str, false);
    }

    /* renamed from: c */
    public static void m118377c(int i11, List list, String str, boolean z11) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    if (i11 == 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (!TextUtils.isEmpty(str2)) {
                                C21933s.m114404I().m114407A0(str2);
                                C21933s.m114404I().m114409B0(str2);
                                C21933s.m114404I().m114504z0(str2);
                                MiniProfileView.m81802DM(str2);
                                AbstractC21935u.m114533W(str2, 3, str);
                            }
                        }
                    } else if (i11 == 1) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str3 = (String) it2.next();
                            if (!TextUtils.isEmpty(str3)) {
                                C21933s.m114404I().m114422I0(str3);
                                C21933s.m114404I().m114424J0(str3);
                                C21933s.m114404I().m114455a0(str3, z11);
                                MiniProfileView.m81803EM(str3);
                                AbstractC21935u.m114533W(str3, 5, str);
                                C23744a.m124114c().m124116d(6087, new Object[0]);
                            }
                        }
                    } else if (i11 == 2) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            String str4 = (String) it3.next();
                            if (!TextUtils.isEmpty(str4)) {
                                AbstractC21935u.m114533W(str4, -1, str);
                            }
                        }
                    }
                    C19669z.m103146Y().m103198O0();
                    m118378d();
                    C23744a.m124114c().m124116d(6093, new Object[0]);
                    AbstractC23304d.f113369c1 = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m118378d() {
        C20834z0.f102412a.m108927f(true);
        C23744a.m124114c().m124116d(115, new Object[0]);
    }

    /* renamed from: e */
    public static void m118379e(C31874cb c31874cb, C17487o0 c17487o0, int i11, int i12, int i13, int i14) {
        ZaloView m93012K0;
        InterfaceC27218a m92676n2;
        try {
            if (AbstractC23309i.m121664Z2() == 1) {
                Bundle m114503z = C21933s.m114404I().m114503z(c31874cb, i12, i13, i14);
                if (c17487o0 != null && (m93012K0 = c17487o0.m93012K0()) != null && (m92676n2 = m93012K0.m92676n2()) != null) {
                    C21933s.f107865n0 = m92676n2.mo35576n3();
                    c17487o0.m93066i2(MiniProfileView.class, m114503z, i11, 1, true);
                }
                AbstractC23647d.m123897g("782000");
                return;
            }
            m118381g(c31874cb.f146385a, c31874cb.f146399o, c31874cb.f146389e, c31874cb.f146398n, c17487o0, i11, C32002l4.m154264g(0));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static void m118380f(C31874cb c31874cb, C17487o0 c17487o0, int i11, int i12, int i13, int i14, int i15) {
        try {
            if (AbstractC23309i.m121664Z2() == 1) {
                Bundle m114503z = C21933s.m114404I().m114503z(c31874cb, i12, i13, i14);
                if (c17487o0 != null) {
                    C21933s.f107865n0 = c17487o0.m93012K0().m92676n2().mo35576n3();
                    m114503z.putInt("extra_reqSrc", i15);
                    c17487o0.m93066i2(MiniProfileView.class, m114503z, i11, 1, true);
                }
                AbstractC23647d.m123897g("782000");
                return;
            }
            m118381g(c31874cb.f146385a, c31874cb.f146399o, i15, c31874cb.f146398n, c17487o0, i11, C32002l4.m154264g(0));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m118381g(String str, int i11, int i12, long j11, C17487o0 c17487o0, int i13, C32002l4 c32002l4) {
        boolean z11;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i11 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            TrackingSource trackingSource = new TrackingSource(i12);
            if (i12 == 202 || i12 == 290) {
                trackingSource.m40677a("timestamp", Long.valueOf(j11));
            }
            TrackingSource m114310H = C21927m.m114302u().m114310H(str);
            if (m114310H != null) {
                trackingSource.m40677a("sourceView", m114310H.m40679l("sourceView"));
            }
            C21927m.m114302u().m114330e0(str, trackingSource);
            new C19171b().m101508a(new C19171b.a(c17487o0.m93021N0(), new C26365a.b(str, c32002l4).m135759r(z11).m135761t(false).m135740G(-1).m135743b(), i13, 1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m118382h(C31874cb c31874cb, C17487o0 c17487o0, int i11, C32002l4 c32002l4) {
        try {
            m118381g(c31874cb.f146385a, c31874cb.f146399o, c31874cb.f146389e, c31874cb.f146398n, c17487o0, i11, c32002l4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
