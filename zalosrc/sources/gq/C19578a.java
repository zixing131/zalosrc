package gq;

import com.zing.zalo.control.ItemAlbumMobile;
import java.util.ArrayList;
import java.util.List;
import p107dq.C18054j;
import qm0.AbstractC25368s;

/* renamed from: gq.a */
/* loaded from: classes4.dex */
public final class C19578a implements InterfaceC19584g {

    /* renamed from: a */
    public static final C19578a f97276a = new C19578a();

    private C19578a() {
    }

    /* renamed from: n */
    private final List m102456n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 110.67d, 221.33d, 0.0d, m102471p()));
        arrayList.add(new ItemAlbumMobile.C7883c(16.0d, 227.34d, 237.33d, 116.67d, m102471p()));
        arrayList.add(new ItemAlbumMobile.C7883c(32.0d, 344.01d, 253.33d, 233.34d, m102471p()));
        return arrayList;
    }

    /* renamed from: o */
    private final List m102457o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ItemAlbumMobile.C7883c(0.0d, 169.0d, 270.4d, 0.0d, m102471p()));
        arrayList.add(new ItemAlbumMobile.C7883c(16.0d, 344.0d, 286.4d, 175.0d, m102471p()));
        return arrayList;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: a */
    public int mo102458a() {
        return 8;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: b */
    public int mo102459b() {
        return 8;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: c */
    public int mo102460c() {
        return 8;
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
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    return m102456n();
                }
                return m102456n();
            }
            return m102457o();
        }
        return C19579b.f97277a.m102482v(list);
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: e */
    public int mo102462e() {
        return 8;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: f */
    public int mo102463f() {
        return 8;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: g */
    public int mo102464g() {
        return 8;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: h */
    public int mo102465h() {
        return 3;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: i */
    public int mo102466i() {
        return 2;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: j */
    public int mo102467j() {
        return 8;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: k */
    public boolean mo102468k() {
        return false;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: l */
    public C18054j mo102469l(List list) {
        return null;
    }

    @Override // gq.InterfaceC19584g
    /* renamed from: m */
    public boolean mo102470m() {
        return false;
    }

    /* renamed from: p */
    public double m102471p() {
        return 1.075d;
    }
}
