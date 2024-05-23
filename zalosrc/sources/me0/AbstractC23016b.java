package me0;

import dj.C17945a0;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import p361nb.AbstractC23647d;

/* renamed from: me0.b */
/* loaded from: classes4.dex */
public abstract class AbstractC23016b {
    /* renamed from: a */
    public static void m118007a(C17945a0 c17945a0) {
        try {
            if (c17945a0.m95089b4() == 0) {
                AbstractC23647d.m123897g("10924");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public static void m118008b(C17945a0 c17945a0) {
        try {
            if (c17945a0.m95089b4() == 0) {
                if (c17945a0.m95171j8()) {
                    AbstractC23647d.m123897g("10924");
                } else {
                    AbstractC23647d.m123897g("10923");
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: c */
    public static void m118009c() {
        AbstractC23647d.m123897g("10922");
    }

    /* renamed from: d */
    public static void m118010d(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C17945a0) it.next()).m95089b4() == 0) {
                    AbstractC23647d.m123897g("10924");
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e */
    public static void m118011e(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C17945a0) it.next()).m95089b4() == 0) {
                    AbstractC23647d.m123897g("10929");
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f */
    public static void m118012f(List list) {
        try {
            if (((C17945a0) list.get(0)).m95171j8()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C17945a0) it.next()).m95089b4() == 0) {
                        AbstractC23647d.m123897g("10929");
                        break;
                    }
                }
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((C17945a0) it2.next()).m95089b4() == 0) {
                        AbstractC23647d.m123897g("10927");
                        break;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g */
    public static void m118013g() {
        AbstractC23647d.m123897g("10928");
    }

    /* renamed from: h */
    public static void m118014h() {
        AbstractC23647d.m123897g("10921");
    }

    /* renamed from: i */
    public static void m118015i(List list) {
        try {
            if (((C17945a0) list.get(0)).m95171j8()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C17945a0) it.next()).m95089b4() == 0) {
                        AbstractC23647d.m123897g("10924");
                        break;
                    }
                }
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((C17945a0) it2.next()).m95089b4() == 0) {
                        AbstractC23647d.m123897g("10923");
                        break;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
