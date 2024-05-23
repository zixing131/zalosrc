package p302ko;

import ae.C0766k;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ko.d */
/* loaded from: classes4.dex */
public final class C21782d implements InterfaceC21781c {
    @Override // p302ko.InterfaceC21781c
    /* renamed from: A0 */
    public void mo112347A0(String str, String str2, String str3, String str4, TrackingSource trackingSource, long j11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "viewerId");
        AbstractC19074t.m100208f(str3, "feedType");
        AbstractC19074t.m100208f(str4, "numComment");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1682l8(str, str4, trackingSource, j11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: B */
    public void mo112348B(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "data");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1592Za(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: B0 */
    public void mo112349B0(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1791z6(str, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: C */
    public void mo112350C(String str, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1514Q4(str, i11, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: D */
    public void mo112351D(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "sourceParams");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1751u7(str, str2);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: F */
    public void mo112352F(String str, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userID");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1427F6(str, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: I */
    public void mo112353I(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userID");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1756v4(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: J */
    public void mo112354J(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1615ca(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: O */
    public void mo112355O(String str, InterfaceC20094a interfaceC20094a, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(str, "userId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1466K4(str, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: X */
    public void mo112356X(String str, InterfaceC20094a interfaceC20094a, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1448Ha(str, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: Y */
    public void mo112357Y(String str, InterfaceC20094a interfaceC20094a, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(str, "userIds");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1481M3(str, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: Z */
    public void mo112358Z(String str, String str2, String str3, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "viewerid");
        AbstractC19074t.m100208f(str2, "ownerid");
        AbstractC19074t.m100208f(str3, "feedid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1590Z8(str2, str3, i11, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: a0 */
    public void mo112359a0(String str, String str2, String str3, String str4, int i11, String str5, boolean z11, boolean z12, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uidto");
        AbstractC19074t.m100208f(str2, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str3, "objectid");
        AbstractC19074t.m100208f(str4, "message");
        AbstractC19074t.m100208f(str5, "content");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1457J3(str, str2, str3, str4, i11, str5, z11, z12, "");
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: b0 */
    public void mo112360b0(int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1578Y4(i11, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: d0 */
    public void mo112361d0(String str, String str2, String str3, String str4, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "commentId");
        AbstractC19074t.m100208f(str4, "commentSck");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1500O6(str, str3);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: e */
    public void mo112362e(ArrayList arrayList, InterfaceC20094a interfaceC20094a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1563W5(arrayList);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: e0 */
    public void mo112363e0(String str, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1418E5(str, i11, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: f */
    public void mo112364f(String str, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userID");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1745t9(str, i11, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: f0 */
    public void mo112365f0(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "picId");
        AbstractC19074t.m100208f(str2, "commentId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1605b8(str, str2);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: g */
    public void mo112366g(String str, int i11, TrackingSource trackingSource, boolean z11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1503O9(str, i11, trackingSource, z11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: g0 */
    public void mo112367g0(String str, int i11, int i12, long j11, long j12, String str2, int i13, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "tracking");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1733s5(str, i11, i12, j11, j12, str2, i13, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: i0 */
    public void mo112368i0(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1403C6(str, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: k */
    public void mo112369k(String str, String str2, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "photoId");
        AbstractC19074t.m100208f(str2, "commentId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1456Ia(str, str2, String.valueOf(i11), trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: l */
    public void mo112370l(int i11, long j11, boolean z11, InterfaceC20094a interfaceC20094a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1415Da(i11, j11, z11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: m */
    public void mo112371m(int i11, InterfaceC20094a interfaceC20094a, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1766w6(i11, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: m0 */
    public void mo112372m0(String str, String str2, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "commentId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1684la(str, str2, String.valueOf(i11), trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: o0 */
    public void mo112373o0(List list, int i11, InterfaceC20094a interfaceC20094a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1649h4(list, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: p */
    public void mo112374p(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "ownerid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1665j5(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: q0 */
    public void mo112375q0(String str, String str2, String str3, String str4, int i11, String str5, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uidTo");
        AbstractC19074t.m100208f(str2, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str3, "objectId");
        AbstractC19074t.m100208f(str4, "message");
        AbstractC19074t.m100208f(str5, "content");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1787ya(str, str2, str3, str4, i11, str5);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: r */
    public void mo112376r(String str, String str2, int i11, int i12, String str3, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "defaultInvitationMsg");
        AbstractC19074t.m100208f(str3, "sourceParams");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1620d7(str, str2, i11, str3);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: s */
    public void mo112377s(String str, int i11, String str2, boolean z11, TrackingSource trackingSource, long j11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "picId");
        AbstractC19074t.m100208f(str2, "feedId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1507P5(str, i11, str2, z11, trackingSource, j11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: s0 */
    public void mo112378s0(ArrayList arrayList, InterfaceC20094a interfaceC20094a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1653h8(arrayList);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: t */
    public void mo112379t(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1487M9(str, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: t0 */
    public void mo112380t0(String str, String str2, int i11, int i12, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "types");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1550U8(str, str2, i11, i12);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: u */
    public void mo112381u(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "srcParamsJSON");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1534S8(str, str2);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: w */
    public void mo112382w(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1568Wa(str, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: w0 */
    public void mo112383w0(ArrayList arrayList, String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "sourceParams");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1453I7(arrayList, str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: x */
    public void mo112384x(String str, InterfaceC20094a interfaceC20094a, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1479L9(str, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: z */
    public void mo112385z(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.mo1497O3(str);
    }
}
