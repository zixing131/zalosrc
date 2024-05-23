package p082cp;

import android.text.TextUtils;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3030r0;
import bo.C3047v0;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import is.C20791e;
import java.util.ArrayList;
import java.util.List;
import p304ks.AbstractC21935u;
import p399op.C24390b;
import p489rn.AbstractC25881j;

/* renamed from: cp.u */
/* loaded from: classes4.dex */
public final class C17548u {

    /* renamed from: a */
    public static final C17548u f89430a = new C17548u();

    private C17548u() {
    }

    /* renamed from: a */
    private final void m93471a(C3000l0 c3000l0, C2966e1 c2966e1) {
        if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().f12023C != null && c3000l0.m14322a0().f12023C.f12108Q != null && C20791e.f102159a.m108488d()) {
            C3020p0 m14322a0 = c3000l0.m14322a0();
            C24390b c24390b = C24390b.f117764a;
            String str = m14322a0.f12057p;
            AbstractC19074t.m100207e(str, "fid");
            SongInfo songInfo = m14322a0.f12023C.f12108Q;
            AbstractC19074t.m100207e(songInfo, "songInfo");
            c2966e1.f11698G = c24390b.m127571b(str, songInfo, m14322a0.m14493X());
        }
    }

    /* renamed from: c */
    private final C2966e1 m93472c(C3000l0 c3000l0) {
        C2966e1 c2966e1 = new C2966e1(c3000l0, c3000l0.m14322a0(), m93474e(c3000l0));
        m93471a(c3000l0, c2966e1);
        return c2966e1;
    }

    /* renamed from: d */
    private final C2966e1 m93473d(C3000l0 c3000l0) {
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 70);
    }

    /* renamed from: e */
    private final int m93474e(C3000l0 c3000l0) {
        if (c3000l0 == null) {
            return 0;
        }
        int i11 = c3000l0.f11893p;
        if (i11 == 2) {
            return 19;
        }
        if (i11 == 0) {
            if (c3000l0.m14285C0()) {
                c3000l0.m14377z0();
            }
            C3020p0 m14322a0 = c3000l0.m14322a0();
            if (m14322a0 == null) {
                return 0;
            }
            int i12 = m14322a0.f12058q;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                if (i12 != 17) {
                                    switch (i12) {
                                        case 21:
                                            return 64;
                                        case 22:
                                            return 66;
                                        case 23:
                                            return 68;
                                        case 24:
                                            return 79;
                                        default:
                                            return 0;
                                    }
                                }
                                return 49;
                            }
                            if (m14322a0.m14480I()) {
                                return 62;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        if (c3000l0.m14295G0()) {
            C3020p0 m14322a02 = c3000l0.m14322a0();
            if (m14322a02 == null) {
                return 0;
            }
            int i13 = m14322a02.f12058q;
            if (i13 != 100) {
                if (i13 != 108) {
                    if (i13 != 109) {
                        return 0;
                    }
                    return 81;
                }
                return 52;
            }
            return 38;
        }
        if (c3000l0.m14283B0()) {
            return 39;
        }
        int i14 = c3000l0.f11893p;
        if (i14 == 1000) {
            return 58;
        }
        if (i14 == 1001) {
            return 59;
        }
        if (i14 == 1002) {
            return 65;
        }
        if (i14 != 1004) {
            return 0;
        }
        return 78;
    }

    /* renamed from: f */
    private final C2966e1 m93475f(C3000l0 c3000l0) {
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 41);
    }

    /* renamed from: g */
    private final C2966e1 m93476g(C3000l0 c3000l0) {
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 42);
    }

    /* renamed from: h */
    private final C2966e1 m93477h(C3000l0 c3000l0) {
        int i11;
        if (c3000l0.f11893p == 2) {
            i11 = 40;
        } else {
            i11 = 80;
        }
        return new C2966e1(c3000l0, c3000l0.m14322a0(), i11);
    }

    /* renamed from: i */
    private final C2966e1 m93478i(C3000l0 c3000l0) {
        if (c3000l0.m14297H0()) {
            return new C2966e1(c3000l0, c3000l0.m14322a0(), 47);
        }
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 43);
    }

    /* renamed from: j */
    private final C2966e1 m93479j(C3000l0 c3000l0, C3030r0 c3030r0) {
        C2966e1 c2966e1 = new C2966e1(c3000l0, c3000l0.m14322a0(), 67);
        c2966e1.f11706d = c3030r0;
        return c2966e1;
    }

    /* renamed from: k */
    private final C2966e1 m93480k(C3000l0 c3000l0) {
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 51);
    }

    /* renamed from: l */
    private final C2966e1 m93481l(C3000l0 c3000l0) {
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 73);
    }

    /* renamed from: m */
    private final boolean m93482m(C3000l0 c3000l0) {
        List list;
        C3047v0 c3047v0;
        if (c3000l0 == null || c3000l0.f11893p != 2 || (list = c3000l0.f11899s) == null || list.size() != 1) {
            return false;
        }
        C3020p0 c3020p0 = (C3020p0) c3000l0.f11899s.get(0);
        if (c3020p0 != null) {
            c3047v0 = c3020p0.f12022B;
        } else {
            c3047v0 = null;
        }
        if (c3047v0 == null || AbstractC19074t.m100204b(CoreUtility.f89233i, c3020p0.f12022B.f12280b) || !c3020p0.m14489T()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final ArrayList m93483b(List list, int i11) {
        C2966e1 m93472c;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C3000l0 c3000l0 = (C3000l0) list.get(i12);
                    if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().m14516l0()) {
                        int i13 = c3000l0.f11893p;
                        if (i13 == 1) {
                            arrayList.addAll(AbstractC25881j.m133527M(c3000l0, c3000l0.f11911y));
                        } else if (i13 == 1000) {
                            arrayList.add(m93472c(c3000l0));
                        } else if (c3000l0.m14293F0()) {
                            int i14 = c3000l0.m14322a0().f12058q;
                            if (c3000l0.m14322a0().m14489T()) {
                                arrayList.add(m93473d(c3000l0));
                            } else {
                                if (i11 == 0 && !c3000l0.m14297H0() && c3000l0.m14322a0().f12060s != null && !TextUtils.isEmpty(c3000l0.m14322a0().f12060s.f11958c)) {
                                    arrayList.add(m93480k(c3000l0));
                                }
                                if (i14 != 100 && i14 != 109) {
                                    arrayList.add(m93478i(c3000l0));
                                }
                                if (i14 != 1 && !c3000l0.m14322a0().m14491V()) {
                                    arrayList.add(m93472c(c3000l0));
                                }
                                if (c3000l0.m14322a0().m14479H()) {
                                    arrayList.add(new C2966e1(c3000l0, c3000l0.m14322a0(), 61));
                                }
                                if (i14 != 100 && i14 != 109 && !c3000l0.m14322a0().m14492W()) {
                                    arrayList.add(m93477h(c3000l0));
                                    List<C3030r0> m14467B = c3000l0.m14322a0().m14467B();
                                    if (m14467B != null) {
                                        for (C3030r0 c3030r0 : m14467B) {
                                            if (c3030r0 != null && c3030r0.f12204b == 0) {
                                                if (i11 == 0 && c3000l0.m14322a0() != null && AbstractC21935u.m114558y(c3030r0.f12209g)) {
                                                    arrayList.add(m93476g(c3000l0));
                                                }
                                            } else if (c3030r0 != null && c3030r0.f12204b == 1 && i11 == 0 && c3000l0.m14322a0() != null) {
                                                arrayList.add(m93479j(c3000l0, c3030r0));
                                            }
                                        }
                                    }
                                }
                                if (!c3000l0.m14322a0().m14491V()) {
                                    arrayList.add(m93475f(c3000l0));
                                }
                            }
                        } else {
                            if (m93482m(c3000l0)) {
                                m93472c = m93473d(c3000l0);
                            } else {
                                m93472c = m93472c(c3000l0);
                            }
                            arrayList.add(m93472c);
                        }
                    } else if (c3000l0 != null && c3000l0.f11893p == 1000) {
                        arrayList.add(m93472c(c3000l0));
                    } else if (c3000l0 != null && c3000l0.f11893p == 1001) {
                        arrayList.add(m93472c(c3000l0));
                    } else if (c3000l0 != null && c3000l0.f11893p == 1002) {
                        arrayList.add(m93472c(c3000l0));
                        arrayList.add(m93475f(c3000l0));
                    } else if (c3000l0 != null && c3000l0.f11893p == 1003) {
                        arrayList.add(m93481l(c3000l0));
                    } else if (c3000l0 != null && c3000l0.f11893p == 1004) {
                        arrayList.add(m93472c(c3000l0));
                        arrayList.add(m93475f(c3000l0));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }
}
