package p302ko;

import bo.C3000l0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: ko.g */
/* loaded from: classes4.dex */
public final class C21785g implements InterfaceC21781c, InterfaceC21783e {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final Object f105738c = new Object();

    /* renamed from: d */
    private static C21785g f105739d;

    /* renamed from: a */
    private final InterfaceC21783e f105740a;

    /* renamed from: b */
    private final InterfaceC21781c f105741b;

    /* renamed from: ko.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21785g m112431a() {
            C21785g c21785g;
            C21785g c21785g2 = C21785g.f105739d;
            if (c21785g2 == null) {
                synchronized (C21785g.f105738c) {
                    c21785g = new C21785g(new C21784f(), new C21782d(), null);
                    C21785g.f105739d = c21785g;
                }
                return c21785g;
            }
            return c21785g2;
        }
    }

    public /* synthetic */ C21785g(InterfaceC21783e interfaceC21783e, InterfaceC21781c interfaceC21781c, AbstractC19060k abstractC19060k) {
        this(interfaceC21783e, interfaceC21781c);
    }

    /* renamed from: F0 */
    public static final C21785g m112430F0() {
        return Companion.m112431a();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: A */
    public String mo112386A() {
        return this.f105740a.mo112386A();
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: A0 */
    public void mo112347A0(String str, String str2, String str3, String str4, TrackingSource trackingSource, long j11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "viewerId");
        AbstractC19074t.m100208f(str3, "feedType");
        AbstractC19074t.m100208f(str4, "numComment");
        this.f105741b.mo112347A0(str, str2, str3, str4, trackingSource, j11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: B */
    public void mo112348B(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "data");
        this.f105741b.mo112348B(str, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: B0 */
    public void mo112349B0(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105741b.mo112349B0(str, i11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: C */
    public void mo112350C(String str, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        this.f105741b.mo112350C(str, i11, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: D */
    public void mo112351D(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "sourceParams");
        this.f105741b.mo112351D(str, str2, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: E */
    public void mo112387E(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105740a.mo112387E(str, z11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: F */
    public void mo112352F(String str, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userID");
        this.f105741b.mo112352F(str, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: G */
    public void mo112388G(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactprofile");
        this.f105740a.mo112388G(contactProfile);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: H */
    public void mo112389H(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "fid");
        AbstractC19074t.m100208f(str3, "content");
        this.f105740a.mo112389H(str, str2, str3);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: I */
    public void mo112353I(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userID");
        this.f105741b.mo112353I(str, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: J */
    public void mo112354J(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        this.f105741b.mo112354J(str, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: K */
    public void mo112390K(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f105740a.mo112390K(jSONObject);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: L */
    public void mo112391L(String str, int i11) {
        AbstractC19074t.m100208f(str, "userID");
        this.f105740a.mo112391L(str, i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: M */
    public void mo112392M(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f105740a.mo112392M(jSONObject);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: N */
    public void mo112393N(String str) {
        AbstractC19074t.m100208f(str, "extendProfileString");
        this.f105740a.mo112393N(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: O */
    public void mo112355O(String str, InterfaceC20094a interfaceC20094a, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(str, "userId");
        this.f105741b.mo112355O(str, interfaceC20094a, trackingSource);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: P */
    public void mo112394P(int i11) {
        this.f105740a.mo112394P(i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: Q */
    public void mo112395Q(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105740a.mo112395Q(str, i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: R */
    public int mo112396R() {
        return this.f105740a.mo112396R();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: S */
    public void mo112397S(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105740a.mo112397S(str, i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: T */
    public boolean mo112398T() {
        return this.f105740a.mo112398T();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: U */
    public void mo112399U(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        this.f105740a.mo112399U(contactProfile);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: V */
    public void mo112400V(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "cUid");
        AbstractC19074t.m100208f(str2, "id");
        AbstractC19074t.m100208f(str3, "content");
        AbstractC19074t.m100208f(str4, "feedComment");
        this.f105740a.mo112400V(str, str2, str3, str4);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: W */
    public void mo112401W(ContactProfile contactProfile, boolean z11) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        this.f105740a.mo112401W(contactProfile, z11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: X */
    public void mo112356X(String str, InterfaceC20094a interfaceC20094a, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105741b.mo112356X(str, interfaceC20094a, i11);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: Y */
    public void mo112357Y(String str, InterfaceC20094a interfaceC20094a, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(str, "userIds");
        this.f105741b.mo112357Y(str, interfaceC20094a, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: Z */
    public void mo112358Z(String str, String str2, String str3, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "viewerid");
        AbstractC19074t.m100208f(str2, "ownerid");
        AbstractC19074t.m100208f(str3, "feedid");
        this.f105741b.mo112358Z(str, str2, str3, i11, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: a */
    public boolean mo112402a() {
        return this.f105740a.mo112402a();
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: a0 */
    public void mo112359a0(String str, String str2, String str3, String str4, int i11, String str5, boolean z11, boolean z12, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uidto");
        AbstractC19074t.m100208f(str2, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str3, "objectid");
        AbstractC19074t.m100208f(str4, "message");
        AbstractC19074t.m100208f(str5, "content");
        this.f105741b.mo112359a0(str, str2, str3, str4, i11, str5, z11, z12, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: b */
    public void mo112403b(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105740a.mo112403b(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: b0 */
    public void mo112360b0(int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        this.f105741b.mo112360b0(i11, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: c */
    public void mo112404c(String str) {
        AbstractC19074t.m100208f(str, "uidFriend");
        this.f105740a.mo112404c(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: c0 */
    public void mo112405c0(String str) {
        AbstractC19074t.m100208f(str, "userID");
        this.f105740a.mo112405c0(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: d */
    public void mo112406d(String str) {
        AbstractC19074t.m100208f(str, "uinfo");
        this.f105740a.mo112406d(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: d0 */
    public void mo112361d0(String str, String str2, String str3, String str4, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "commentId");
        AbstractC19074t.m100208f(str4, "commentSck");
        this.f105741b.mo112361d0(str, str2, str3, str4, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: e */
    public void mo112362e(ArrayList arrayList, InterfaceC20094a interfaceC20094a) {
        this.f105741b.mo112362e(arrayList, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: e0 */
    public void mo112363e0(String str, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        this.f105741b.mo112363e0(str, i11, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: f */
    public void mo112364f(String str, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userID");
        this.f105741b.mo112364f(str, i11, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: f0 */
    public void mo112365f0(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "picId");
        AbstractC19074t.m100208f(str2, "commentId");
        this.f105741b.mo112365f0(str, str2, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: g */
    public void mo112366g(String str, int i11, TrackingSource trackingSource, boolean z11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        this.f105741b.mo112366g(str, i11, trackingSource, z11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: g0 */
    public void mo112367g0(String str, int i11, int i12, long j11, long j12, String str2, int i13, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "tracking");
        this.f105741b.mo112367g0(str, i11, i12, j11, j12, str2, i13, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: h */
    public boolean mo112407h(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f105740a.mo112407h(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: h0 */
    public String mo112408h0() {
        return this.f105740a.mo112408h0();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: i */
    public String mo112409i() {
        return this.f105740a.mo112409i();
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: i0 */
    public void mo112368i0(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        this.f105741b.mo112368i0(str, i11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: j */
    public C3000l0 mo112410j(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        return this.f105740a.mo112410j(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: j0 */
    public void mo112411j0(String str) {
        AbstractC19074t.m100208f(str, "uidFriend");
        this.f105740a.mo112411j0(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: k */
    public void mo112369k(String str, String str2, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "photoId");
        AbstractC19074t.m100208f(str2, "commentId");
        this.f105741b.mo112369k(str, str2, i11, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: k0 */
    public void mo112412k0(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "cUid");
        AbstractC19074t.m100208f(str2, "id");
        AbstractC19074t.m100208f(str3, "content");
        this.f105740a.mo112412k0(str, str2, str3);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: l */
    public void mo112370l(int i11, long j11, boolean z11, InterfaceC20094a interfaceC20094a) {
        this.f105741b.mo112370l(i11, j11, z11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: l0 */
    public boolean mo112413l0() {
        return this.f105740a.mo112413l0();
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: m */
    public void mo112371m(int i11, InterfaceC20094a interfaceC20094a, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        this.f105741b.mo112371m(i11, interfaceC20094a, trackingSource);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: m0 */
    public void mo112372m0(String str, String str2, int i11, TrackingSource trackingSource, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "commentId");
        this.f105741b.mo112372m0(str, str2, i11, trackingSource, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: n */
    public boolean mo112414n() {
        return this.f105740a.mo112414n();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: n0 */
    public boolean mo112415n0() {
        return this.f105740a.mo112415n0();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: o */
    public List mo112416o(String str) {
        AbstractC19074t.m100208f(str, "currentUid");
        return this.f105740a.mo112416o(str);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: o0 */
    public void mo112373o0(List list, int i11, InterfaceC20094a interfaceC20094a) {
        this.f105741b.mo112373o0(list, i11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: p */
    public void mo112374p(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "ownerid");
        this.f105741b.mo112374p(str, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: p0 */
    public void mo112417p0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105740a.mo112417p0(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: q */
    public boolean mo112418q() {
        return this.f105740a.mo112418q();
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: q0 */
    public void mo112375q0(String str, String str2, String str3, String str4, int i11, String str5, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uidTo");
        AbstractC19074t.m100208f(str2, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str3, "objectId");
        AbstractC19074t.m100208f(str4, "message");
        AbstractC19074t.m100208f(str5, "content");
        this.f105741b.mo112375q0(str, str2, str3, str4, i11, str5, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: r */
    public void mo112376r(String str, String str2, int i11, int i12, String str3, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "defaultInvitationMsg");
        AbstractC19074t.m100208f(str3, "sourceParams");
        this.f105741b.mo112376r(str, str2, i11, 0, str3, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: r0 */
    public int mo112419r0() {
        return this.f105740a.mo112419r0();
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: s */
    public void mo112377s(String str, int i11, String str2, boolean z11, TrackingSource trackingSource, long j11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "picId");
        AbstractC19074t.m100208f(str2, "feedId");
        this.f105741b.mo112377s(str, i11, str2, z11, trackingSource, j11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: s0 */
    public void mo112378s0(ArrayList arrayList, InterfaceC20094a interfaceC20094a) {
        this.f105741b.mo112378s0(arrayList, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: t */
    public void mo112379t(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "feedId");
        this.f105741b.mo112379t(str, i11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: t0 */
    public void mo112380t0(String str, String str2, int i11, int i12, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "types");
        this.f105741b.mo112380t0(str, str2, i11, i12, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: u */
    public void mo112381u(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "srcParamsJSON");
        this.f105741b.mo112381u(str, str2, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: u0 */
    public boolean mo112420u0() {
        return this.f105740a.mo112420u0();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: v */
    public String mo112421v() {
        return this.f105740a.mo112421v();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: v0 */
    public void mo112422v0(String str, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "feedId");
        this.f105740a.mo112422v0(str, str2);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: w */
    public void mo112382w(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "userId");
        this.f105741b.mo112382w(str, i11, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: w0 */
    public void mo112383w0(ArrayList arrayList, String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "sourceParams");
        this.f105741b.mo112383w0(arrayList, str, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: x */
    public void mo112384x(String str, InterfaceC20094a interfaceC20094a, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105741b.mo112384x(str, interfaceC20094a, i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: x0 */
    public void mo112423x0(ContactProfile contactProfile, boolean z11) {
        AbstractC19074t.m100208f(contactProfile, "profile");
        this.f105740a.mo112423x0(contactProfile, z11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: y */
    public void mo112424y(String str) {
        AbstractC19074t.m100208f(str, "currentUserId");
        this.f105740a.mo112424y(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: y0 */
    public int mo112425y0() {
        return this.f105740a.mo112425y0();
    }

    @Override // p302ko.InterfaceC21781c
    /* renamed from: z */
    public void mo112385z(String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        this.f105741b.mo112385z(str, interfaceC20094a);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: z0 */
    public boolean mo112426z0() {
        return this.f105740a.mo112426z0();
    }

    private C21785g(InterfaceC21783e interfaceC21783e, InterfaceC21781c interfaceC21781c) {
        this.f105740a = interfaceC21783e;
        this.f105741b = interfaceC21781c;
    }
}
