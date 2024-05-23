package gq;

import com.zing.zalo.control.ItemAlbumMobile;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p107dq.C18054j;
import qm0.AbstractC25368s;

/* renamed from: gq.d */
/* loaded from: classes4.dex */
public final class C19581d implements InterfaceC19584g {

    /* renamed from: a */
    public static final C19581d f97279a = new C19581d();

    /* renamed from: gq.d$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        String mo102501a();

        /* renamed from: b */
        String mo102502b();

        /* renamed from: c */
        String mo102503c();

        /* renamed from: d */
        String mo102504d();

        /* renamed from: e */
        String mo102505e();

        /* renamed from: f */
        String mo102506f();

        /* renamed from: g */
        String mo102507g();

        /* renamed from: h */
        String mo102508h();
    }

    private C19581d() {
    }

    /* renamed from: n */
    private final List m102490n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 304.0d, 202.67d, 0.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(210.67d, 120.0d, 310.66999999999996d, 20.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(210.67d, 228.0d, 310.66999999999996d, 128.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(210.67d, 336.0d, 310.66999999999996d, 236.0d, m102498u()));
        return arrayList;
    }

    /* renamed from: o */
    private final List m102491o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(23.0d, 212.0d, 341.0d, 0.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 336.0d, 116.0d, 220.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(124.0d, 336.0d, 240.0d, 220.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(248.0d, 336.0d, 364.0d, 220.0d, m102498u()));
        return arrayList;
    }

    /* renamed from: p */
    private final List m102492p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 300.0d, 200.0d, 0.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(208.0d, 186.0d, 350.0d, 44.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(208.0d, 336.0d, 350.0d, 194.0d, m102498u()));
        return arrayList;
    }

    /* renamed from: q */
    private final List m102493q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 200.0d, 266.67d, 0.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(36.0d, 336.0d, 164.0d, 208.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(172.0d, 336.0d, 300.0d, 208.0d, m102498u()));
        return arrayList;
    }

    /* renamed from: r */
    private final List m102494r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 304.0d, 171.0d, 0.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(179.0d, 336.0d, 350.0d, 32.0d, m102498u()));
        return arrayList;
    }

    /* renamed from: s */
    private final List m102495s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 164.0d, 262.4d, 0.0d, m102498u()));
        arrayList.add(new ItemAlbumMobile.C7883c(37.6d, 336.0d, 300.0d, 172.0d, m102498u()));
        return arrayList;
    }

    /* renamed from: x */
    private final a m102496x() {
        if (C19587j.f97307a.m102528d(3) == 2) {
            return C19583f.f97289a;
        }
        return C19582e.f97280a;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: a */
    public int mo102458a() {
        return 12;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: b */
    public int mo102459b() {
        return 12;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: c */
    public int mo102460c() {
        return 16;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: d */
    public List mo102461d(List list) {
        List m131502j;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        if (!((AbstractC19588k) list.get(0)).m102535i() && !((AbstractC19588k) list.get(0)).m102534h()) {
            int size = list.size();
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        if (size != 4) {
                            return m102490n();
                        }
                        return m102490n();
                    }
                    return m102492p();
                }
                return m102494r();
            }
            return C19579b.f97277a.m102482v(list);
        }
        int size2 = list.size();
        if (size2 != 1) {
            if (size2 != 2) {
                if (size2 != 3) {
                    if (size2 != 4) {
                        return m102491o();
                    }
                    return m102491o();
                }
                return m102493q();
            }
            return m102495s();
        }
        return C19579b.f97277a.m102482v(list);
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: e */
    public int mo102462e() {
        return 12;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: f */
    public int mo102463f() {
        return 16;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: g */
    public int mo102464g() {
        return 16;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: h */
    public int mo102465h() {
        return 4;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: i */
    public int mo102466i() {
        return 3;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: j */
    public int mo102467j() {
        return 4;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: k */
    public boolean mo102468k() {
        return true;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: l */
    public C18054j mo102469l(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        a m102496x = m102496x();
        if (!((AbstractC19588k) list.get(0)).m102535i() && !((AbstractC19588k) list.get(0)).m102534h()) {
            int size = list.size();
            if (size == 1) {
                return null;
            }
            if (size != 2 && size != 3) {
                if (size != 4) {
                    return new C18054j(m102496x.mo102508h(), m102496x.mo102501a());
                }
                return new C18054j(m102496x.mo102508h(), m102496x.mo102501a());
            }
            return new C18054j(m102496x.mo102503c(), m102496x.mo102507g());
        }
        int size2 = list.size();
        if (size2 == 1) {
            return null;
        }
        if (size2 != 2 && size2 != 3) {
            if (size2 != 4) {
                return new C18054j(m102496x.mo102506f(), m102496x.mo102505e());
            }
            return new C18054j(m102496x.mo102506f(), m102496x.mo102505e());
        }
        return new C18054j(m102496x.mo102504d(), m102496x.mo102502b());
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: m */
    public boolean mo102470m() {
        return true;
    }

    /* renamed from: t */
    public final int m102497t(String str) {
        AbstractC19074t.m100208f(str, "backgroundUrl");
        C19583f c19583f = C19583f.f97289a;
        if (c19583f.m102511i().contains(str)) {
            return c19583f.m102512j();
        }
        return C19582e.f97280a.m102509i();
    }

    /* renamed from: u */
    public double m102498u() {
        return 1.05d;
    }

    /* renamed from: v */
    public final int m102499v(String str) {
        AbstractC19074t.m100208f(str, "backgroundUrl");
        C19583f c19583f = C19583f.f97289a;
        if (c19583f.m102511i().contains(str)) {
            return c19583f.m102513k();
        }
        return C19582e.f97280a.m102510j();
    }

    /* renamed from: w */
    public final int m102500w(String str) {
        AbstractC19074t.m100208f(str, "backgroundUrl");
        if (C19583f.f97289a.m102511i().contains(str)) {
            return 2;
        }
        return 1;
    }
}
