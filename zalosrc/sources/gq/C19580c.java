package gq;

import com.zing.zalo.control.ItemAlbumMobile;
import java.util.ArrayList;
import java.util.List;
import p107dq.C18054j;
import qm0.AbstractC25368s;

/* renamed from: gq.c */
/* loaded from: classes4.dex */
public final class C19580c implements InterfaceC19584g {

    /* renamed from: a */
    public static final C19580c f97278a = new C19580c();

    private C19580c() {
    }

    /* renamed from: n */
    private final List m102483n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(26.8d, 204.0d, 190.0d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(198.0d, 204.0d, 361.2d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 336.0d, 124.0d, 212.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(132.0d, 336.0d, 256.0d, 212.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(264.0d, 336.0d, 388.0d, 212.0d, m102489t()));
        return arrayList;
    }

    /* renamed from: o */
    private final List m102484o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 164.0d, 164.0d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(32.0d, 336.0d, 196.0d, 172.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(172.0d, 164.0d, 336.0d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(204.0d, 336.0d, 368.0d, 172.0d, m102489t()));
        return arrayList;
    }

    /* renamed from: p */
    private final List m102485p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 336.0d, 189.0d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(197.0d, 164.0d, 361.0d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(197.0d, 336.0d, 361.0d, 172.0d, m102489t()));
        return arrayList;
    }

    /* renamed from: q */
    private final List m102486q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 200.0d, 266.67d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(36.0d, 336.0d, 164.0d, 208.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(172.0d, 336.0d, 300.0d, 208.0d, m102489t()));
        return arrayList;
    }

    /* renamed from: r */
    private final List m102487r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 336.0d, 189.0d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(197.0d, 336.0d, 386.0d, 0.0d, m102489t()));
        return arrayList;
    }

    /* renamed from: s */
    private final List m102488s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 164.0d, 262.4d, 0.0d, m102489t()));
        arrayList.add(new ItemAlbumMobile.C7883c(24.0d, 336.0d, 286.4d, 172.0d, m102489t()));
        return arrayList;
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
                            if (size != 5) {
                                return m102483n();
                            }
                            return m102483n();
                        }
                        return m102484o();
                    }
                    return m102485p();
                }
                return m102487r();
            }
            return C19579b.f97277a.m102482v(list);
        }
        int size2 = list.size();
        if (size2 != 1) {
            if (size2 != 2) {
                if (size2 != 3) {
                    if (size2 != 4) {
                        if (size2 != 5) {
                            return m102483n();
                        }
                        return m102483n();
                    }
                    return m102484o();
                }
                return m102486q();
            }
            return m102488s();
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
        return 5;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: i */
    public int mo102466i() {
        return 1;
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
        return null;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: m */
    public boolean mo102470m() {
        return true;
    }

    /* renamed from: t */
    public double m102489t() {
        return 1.05d;
    }
}
