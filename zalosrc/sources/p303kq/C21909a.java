package p303kq;

import android.text.TextUtils;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3030r0;
import com.zing.zalo.feed.models.SongInfo;
import fn0.AbstractC19074t;
import is.C20791e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import l30.C22012a;
import me0.AbstractC23160o0;
import p304ks.AbstractC21935u;
import p399op.C24390b;

/* renamed from: kq.a */
/* loaded from: classes4.dex */
public final class C21909a {

    /* renamed from: a */
    public static final C21909a f107699a = new C21909a();

    private C21909a() {
    }

    /* renamed from: a */
    private final void m114148a(C3000l0 c3000l0, C2966e1 c2966e1) {
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

    /* renamed from: b */
    public static final ArrayList m114149b(List list, int i11) {
        boolean z11;
        C3020p0 m14322a0;
        C3030r0 m14533x;
        AbstractC19074t.m100208f(list, "feedContentList");
        ArrayList arrayList = new ArrayList();
        try {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C3000l0 c3000l0 = (C3000l0) list.get(i12);
                if (c3000l0.m14322a0() != null && c3000l0.m14322a0().m14516l0()) {
                    if (c3000l0.f11893p == 1) {
                        arrayList.addAll(f107699a.m114150c(c3000l0, c3000l0.f11911y));
                    } else if (c3000l0.m14293F0()) {
                        int i13 = c3000l0.m14322a0().f12058q;
                        if (i11 == 2 || i11 == 3) {
                            C3020p0 m14322a02 = c3000l0.m14322a0();
                            if (!c3000l0.f11875X) {
                                int i14 = i12 - 1;
                                if (i14 >= 0 && (m14322a0 = ((C3000l0) list.get(i14)).m14322a0()) != null) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTimeInMillis(m14322a0.f12062u);
                                    int i15 = calendar.get(1);
                                    calendar.setTimeInMillis(m14322a02.f12062u);
                                    if (i15 != calendar.get(1)) {
                                        m14322a0.f12047a0 = true;
                                        arrayList.add(new C2966e1(c3000l0, c3000l0.m14322a0(), 62));
                                        arrayList.add(new C2966e1(c3000l0, c3000l0.m14322a0(), 45));
                                    }
                                    Calendar calendar2 = Calendar.getInstance();
                                    calendar.setTimeInMillis(m14322a02.f12062u);
                                    Calendar.getInstance().setTimeInMillis(m14322a0.f12062u);
                                    if (AbstractC23160o0.m119235a1(calendar2, calendar)) {
                                    }
                                }
                                String m114157j = f107699a.m114157j(i12, c3000l0, list);
                                if (m114157j.length() > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    arrayList.add(new C22012a(c3000l0, c3000l0.m14322a0(), m114157j));
                                } else {
                                    arrayList.add(new C2966e1(c3000l0, c3000l0.m14322a0(), 64));
                                }
                                c3000l0.m14322a0().f12043W = z11;
                                f107699a.m114158k(i12, c3000l0, list);
                            }
                            arrayList.add(new C2966e1(c3000l0, c3000l0.m14322a0(), 64));
                            f107699a.m114158k(i12, c3000l0, list);
                        }
                        arrayList.add(new C2966e1(c3000l0, c3000l0.m14322a0(), 61));
                        if (i13 != 100) {
                            C21909a c21909a = f107699a;
                            C2966e1 m114156i = c21909a.m114156i(c3000l0);
                            if (m114156i != null) {
                                arrayList.add(m114156i);
                            }
                            arrayList.add(c21909a.m114155h(c3000l0));
                        }
                        if (i13 != 1) {
                            arrayList.add(f107699a.m114151d(c3000l0));
                        }
                        if (i13 != 100 && !c3000l0.m14322a0().m14492W()) {
                            C21909a c21909a2 = f107699a;
                            arrayList.add(c21909a2.m114154g(c3000l0));
                            if (i11 == 0 && c3000l0.m14322a0() != null && (m14533x = c3000l0.m14322a0().m14533x()) != null && AbstractC21935u.m114558y(m14533x.f12209g)) {
                                arrayList.add(c21909a2.m114153f(c3000l0));
                            }
                        }
                    } else {
                        arrayList.add(f107699a.m114151d(c3000l0));
                    }
                } else if (c3000l0.m14309N0()) {
                    arrayList.add(new C2966e1(c3000l0, (C3020p0) null, 90));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: c */
    private final ArrayList m114150c(C3000l0 c3000l0, boolean z11) {
        int i11;
        ArrayList arrayList = new ArrayList();
        C3020p0 m14324b0 = c3000l0.m14324b0(0);
        int i12 = m14324b0.f12058q;
        int i13 = 24;
        if (i12 != 7 && i12 != 24) {
            i13 = 0;
        }
        arrayList.add(new C2966e1(c3000l0, m14324b0, i13));
        int size = c3000l0.f11899s.size();
        if (size > 2 && !z11) {
            i11 = Math.min(2, size);
        } else {
            i11 = size;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            arrayList.add(new C2966e1(c3000l0, (C3020p0) c3000l0.f11899s.get(i14), 22));
        }
        if (i11 < size) {
            arrayList.add(new C2966e1(c3000l0, (C3020p0) null, 23));
        } else {
            C3020p0 c3020p0 = ((C2966e1) arrayList.get(arrayList.size() - 1)).f11704b;
            if (c3020p0 != null) {
                c3020p0.f12038R = true;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private final C2966e1 m114151d(C3000l0 c3000l0) {
        C2966e1 c2966e1 = new C2966e1(c3000l0, c3000l0.m14322a0(), m114152e(c3000l0));
        m114148a(c3000l0, c2966e1);
        return c2966e1;
    }

    /* renamed from: e */
    private final int m114152e(C3000l0 c3000l0) {
        int i11 = c3000l0.f11893p;
        if (i11 == 2) {
            return 0;
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
                                            return 59;
                                        case 22:
                                            return 65;
                                        case 23:
                                            return 88;
                                        case 24:
                                            break;
                                        default:
                                            return 0;
                                    }
                                } else {
                                    return 49;
                                }
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
                    return 0;
                }
                return 52;
            }
            return 38;
        }
        if (!c3000l0.m14283B0()) {
            return 0;
        }
        return 39;
    }

    /* renamed from: f */
    private final C2966e1 m114153f(C3000l0 c3000l0) {
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 42);
    }

    /* renamed from: g */
    private final C2966e1 m114154g(C3000l0 c3000l0) {
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 40);
    }

    /* renamed from: h */
    private final C2966e1 m114155h(C3000l0 c3000l0) {
        if (c3000l0.m14297H0()) {
            return new C2966e1(c3000l0, c3000l0.m14322a0(), 47);
        }
        return new C2966e1(c3000l0, c3000l0.m14322a0(), 43);
    }

    /* renamed from: i */
    private final C2966e1 m114156i(C3000l0 c3000l0) {
        if (!c3000l0.m14297H0() && c3000l0.m14285C0() && !c3000l0.m14322a0().m14498b0()) {
            return new C2966e1(c3000l0, c3000l0.m14322a0(), 63);
        }
        return null;
    }

    /* renamed from: j */
    private final String m114157j(int i11, C3000l0 c3000l0, List list) {
        String str;
        if (i11 != 0) {
            try {
                str = ((C3000l0) list.get(i11 - 1)).f11869R;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (!TextUtils.isEmpty(str)) {
                if (!AbstractC19074t.m100204b(str, c3000l0.f11869R)) {
                }
                return "";
            }
        }
        String str2 = c3000l0.f11869R;
        AbstractC19074t.m100207e(str2, "groupTitle");
        return str2;
    }

    /* renamed from: k */
    private final void m114158k(int i11, C3000l0 c3000l0, List list) {
        if (i11 != 0) {
            int i12 = i11 - 1;
            try {
                C3020p0 m14322a0 = c3000l0.m14322a0();
                if (((C3000l0) list.get(i12)).m14322a0() != null) {
                    m14322a0.f12044X = !AbstractC19074t.m100204b(r1.m14465A(), m14322a0.m14465A());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
