package mq;

import bo.C2961d1;
import bo.C2966e1;
import bo.C2983h3;
import bo.C2991j1;
import bo.C2993j3;
import bo.C3000l0;
import bo.C3019p;
import bo.C3020p0;
import bo.C3032r2;
import bo.C3037s2;
import bo.C3041t2;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19074t;
import p304ks.C21933s;
import p716zh.C31862c;

/* renamed from: mq.a */
/* loaded from: classes4.dex */
public final class C23419a extends AbstractC23421c {

    /* renamed from: c */
    private final C2966e1 f113817c = new C2966e1(new C3019p());

    /* renamed from: d */
    private final C2966e1 f113818d = new C2966e1(new C2983h3());

    /* renamed from: e */
    private final C2966e1 f113819e = new C2966e1(new C2993j3());

    /* renamed from: f */
    private final C2966e1 f113820f = new C2966e1(new C2991j1(null, null, false, false, false, null, 63, null));

    /* renamed from: g */
    private final C2966e1 f113821g = new C2966e1(new C2961d1());

    /* renamed from: h */
    private final C2966e1 f113822h = new C2966e1((C3000l0) null, (C3020p0) null, 66);

    /* renamed from: i */
    private final C2966e1 f113823i = new C2966e1((C3000l0) null, (C3020p0) null, 69);

    /* renamed from: j */
    private final C2966e1 f113824j = new C2966e1(new C3032r2());

    /* renamed from: k */
    private final C2966e1 f113825k = new C2966e1(new C3041t2());

    /* renamed from: l */
    private final C2966e1 f113826l = new C2966e1(new C3037s2());

    @Override // mq.AbstractC23421c
    /* renamed from: a */
    public void mo123078a(int i11) {
        if (i11 != 66) {
            if (i11 != 67) {
                if (i11 != 69) {
                    if (i11 != 79) {
                        if (i11 != 86) {
                            switch (i11) {
                                case 73:
                                    m123094d().add(this.f113818d);
                                    return;
                                case 74:
                                    m123094d().add(this.f113824j);
                                    return;
                                case 75:
                                    m123094d().add(this.f113825k);
                                    return;
                                case 76:
                                    m123094d().add(this.f113826l);
                                    return;
                                case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                    m123094d().add(this.f113819e);
                                    return;
                                default:
                                    super.mo123078a(i11);
                                    return;
                            }
                        }
                        m123094d().add(this.f113820f);
                        return;
                    }
                    m123094d().add(this.f113821g);
                    return;
                }
                m123094d().add(this.f113823i);
                return;
            }
            m123094d().add(this.f113817c);
            return;
        }
        m123094d().add(this.f113822h);
    }

    /* renamed from: g */
    public final C3019p m123079g() {
        C3019p c3019p = this.f113817c.f11712j;
        AbstractC19074t.m100207e(c3019p, "bioData");
        return c3019p;
    }

    /* renamed from: h */
    public final C2991j1 m123080h() {
        C2991j1 c2991j1 = this.f113820f.f11714l;
        AbstractC19074t.m100207e(c2991j1, "friendProfileSuggestActionData");
        return c2991j1;
    }

    /* renamed from: i */
    public final C2961d1 m123081i() {
        C2961d1 c2961d1 = this.f113821g.f11720r;
        AbstractC19074t.m100207e(c2961d1, "mFeedProfileQuickAccessData");
        return c2961d1;
    }

    /* renamed from: j */
    public final C2993j3 m123082j() {
        C2993j3 c2993j3 = this.f113819e.f11718p;
        if (c2993j3 == null) {
            return new C2993j3(C21933s.m114404I());
        }
        return c2993j3;
    }

    /* renamed from: k */
    public final void m123083k(C3019p c3019p) {
        AbstractC19074t.m100208f(c3019p, "bioData");
        this.f113817c.f11712j = c3019p;
    }

    /* renamed from: l */
    public final void m123084l(C2991j1 c2991j1) {
        AbstractC19074t.m100208f(c2991j1, "friendProfileSuggestActionData");
        this.f113820f.f11714l = c2991j1;
    }

    /* renamed from: m */
    public final void m123085m(C3032r2 c3032r2) {
        AbstractC19074t.m100208f(c3032r2, "oaCoverAvatarViewData");
        this.f113824j.f11715m = c3032r2;
    }

    /* renamed from: n */
    public final void m123086n(C3037s2 c3037s2) {
        AbstractC19074t.m100208f(c3037s2, "oaFooterViewData");
        this.f113826l.f11717o = c3037s2;
    }

    /* renamed from: o */
    public final void m123087o(C3041t2 c3041t2) {
        AbstractC19074t.m100208f(c3041t2, "oaHeaderViewData");
        this.f113825k.f11716n = c3041t2;
    }

    /* renamed from: p */
    public final void m123088p(C2961d1 c2961d1) {
        AbstractC19074t.m100208f(c2961d1, "feedProfileQuickAccessData");
        this.f113821g.f11720r = c2961d1;
    }

    /* renamed from: q */
    public final void m123089q(C31862c c31862c) {
        this.f113823i.f11728z = c31862c;
    }

    /* renamed from: r */
    public final void m123090r(C2983h3 c2983h3) {
        AbstractC19074t.m100208f(c2983h3, "suggestChatLayoutData");
        this.f113818d.f11713k = c2983h3;
    }

    /* renamed from: s */
    public final void m123091s(C2993j3 c2993j3) {
        AbstractC19074t.m100208f(c2993j3, "friendLayoutData");
        this.f113819e.f11718p = c2993j3;
    }
}
