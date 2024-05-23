package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.C17074y0;
import com.zing.zalo.zdesign.component.C17075z;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import l80.C22126c0;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p132ej.C18451m;
import p262jb.AbstractC21196a;
import ui0.C27274a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class TabMsgCommonItemModuleView extends TabMsgItemModulesView {
    public static final C12429a Companion = new C12429a(null);

    /* renamed from: R */
    private static int f65015R;

    /* renamed from: S */
    private static int f65016S;

    /* renamed from: T */
    private static int f65017T;

    /* renamed from: U */
    private static int f65018U;

    /* renamed from: V */
    private static int f65019V;

    /* renamed from: W */
    private static int f65020W;

    /* renamed from: a0 */
    private static int f65021a0;

    /* renamed from: b0 */
    private static final int f65022b0;

    /* renamed from: c0 */
    private static final int f65023c0;

    /* renamed from: d0 */
    private static final int f65024d0;

    /* renamed from: e0 */
    private static final int f65025e0;

    /* renamed from: f0 */
    private static final int f65026f0;

    /* renamed from: g0 */
    private static final int f65027g0;

    /* renamed from: h0 */
    private static final int f65028h0;

    /* renamed from: K */
    private final C12260j f65029K;

    /* renamed from: L */
    private C16959c0 f65030L;

    /* renamed from: M */
    public C16971e f65031M;

    /* renamed from: N */
    protected C16716d f65032N;

    /* renamed from: O */
    protected C22126c0 f65033O;

    /* renamed from: P */
    protected C16716d f65034P;

    /* renamed from: Q */
    protected C16977g f65035Q;

    /* renamed from: com.zing.zalo.ui.moduleview.message.TabMsgCommonItemModuleView$a */
    /* loaded from: classes6.dex */
    public static final class C12429a {
        private C12429a() {
        }

        public /* synthetic */ C12429a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m69861a() {
            return TabMsgCommonItemModuleView.f65018U;
        }

        /* renamed from: b */
        public final int m69862b() {
            return TabMsgCommonItemModuleView.f65023c0;
        }

        /* renamed from: c */
        public final int m69863c() {
            return TabMsgCommonItemModuleView.f65024d0;
        }

        /* renamed from: d */
        public final int m69864d() {
            return TabMsgCommonItemModuleView.f65025e0;
        }

        /* renamed from: e */
        public final int m69865e() {
            return TabMsgCommonItemModuleView.f65022b0;
        }

        /* renamed from: f */
        public final int m69866f() {
            return TabMsgCommonItemModuleView.f65015R;
        }

        /* renamed from: g */
        public final int m69867g() {
            return TabMsgCommonItemModuleView.f65016S;
        }

        /* renamed from: h */
        public final int m69868h() {
            return TabMsgCommonItemModuleView.f65021a0;
        }
    }

    static {
        int i11 = AbstractC23222t7.f112568k;
        f65022b0 = i11;
        f65023c0 = i11;
        int i12 = AbstractC23222t7.f112586t;
        f65024d0 = i12;
        f65025e0 = i12;
        f65026f0 = AbstractC23222t7.f112576o;
        int i13 = AbstractC23222t7.f112566j;
        f65027g0 = i13;
        f65028h0 = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabMsgCommonItemModuleView(Context context, C12260j c12260j) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65029K = c12260j;
        mo69826s0();
        m88987U(-1, -2);
        C16959c0 c16959c0 = new C16959c0(context);
        this.f65030L = c16959c0;
        c16959c0.m89106L().m89048d0(f65022b0).m89044a0(f65023c0);
        C16719g mo69842m0 = mo69842m0();
        C16716d mo69823n0 = mo69823n0();
        C16716d mo69824o0 = mo69824o0();
        this.f65030L.m90814p1(mo69842m0);
        this.f65030L.m90817s1(mo69823n0);
        this.f65030L.m90818t1(mo69824o0);
        mo69681L(this.f65030L);
        this.f65030L.m90820w1().mo89093E0(false);
    }

    /* renamed from: h0 */
    private final void m69857h0(C18451m c18451m) {
        int mo69782q0 = mo69782q0(c18451m);
        boolean mo69825r0 = mo69825r0(c18451m, mo69782q0);
        mo69768k0(c18451m, mo69825r0);
        mo69767j0(c18451m, mo69825r0);
        mo69766i0(c18451m, mo69825r0);
        mo69781l0(c18451m, mo69825r0, mo69782q0);
        m69860f0(c18451m);
    }

    /* renamed from: p0 */
    private final C22126c0 m69858p0() {
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.mo111965M1(0);
        c22126c0.mo111964L1(f65026f0);
        c22126c0.m111962J1(f65021a0);
        c22126c0.m111953A1(1);
        c22126c0.m111980v1(TextUtils.TruncateAt.END);
        c22126c0.m89106L().m89027K(true).m89028L(-2, -2).m89017A(Boolean.TRUE);
        setMTime(c22126c0);
        return c22126c0;
    }

    /* renamed from: t0 */
    private final boolean m69859t0(String str) {
        return AbstractC23089h6.m118442j(str);
    }

    /* renamed from: C */
    public void mo69822C(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        String mo97719a = c18451m.mo97719a();
        mo69769u0(mo97719a, m69859t0(mo97719a));
        mo69765g0(mo97719a);
        mo69764e0(c18451m, i11);
        m69857h0(c18451m);
    }

    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
    }

    /* renamed from: f0 */
    public final void m69860f0(C18451m c18451m) {
        int i11;
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        C17075z m90821x1 = this.f65030L.m90821x1();
        if (c18451m.f92993d) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        m90821x1.mo44614b1(i11);
    }

    /* renamed from: g0 */
    public void mo69765g0(String str) {
        boolean z11;
        AbstractC19074t.m100208f(str, "uid");
        C12260j c12260j = this.f65029K;
        if (c12260j != null && c12260j.m68702V()) {
            if (str.length() > 0) {
                C12260j c12260j2 = this.f65029K;
                AbstractC19074t.m100205c(c12260j2);
                if (c12260j2.m68694M(str)) {
                    z11 = true;
                    this.f65030L.m90820w1().mo89099H0(z11);
                    C12260j c12260j3 = this.f65029K;
                    AbstractC19074t.m100205c(c12260j3);
                    this.f65030L.m90820w1().m91362p1(c12260j3.f63837B.containsKey(str), false);
                    this.f65030L.m90799A1(AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type2), 0, 0, 0);
                    this.f65030L.m90820w1().mo44614b1(0);
                    return;
                }
            }
            z11 = false;
            this.f65030L.m90820w1().mo89099H0(z11);
            C12260j c12260j32 = this.f65029K;
            AbstractC19074t.m100205c(c12260j32);
            this.f65030L.m90820w1().m91362p1(c12260j32.f63837B.containsKey(str), false);
            this.f65030L.m90799A1(AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type2), 0, 0, 0);
            this.f65030L.m90820w1().mo44614b1(0);
            return;
        }
        this.f65030L.m90820w1().mo44614b1(8);
        this.f65030L.m90799A1(AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type1), 0, 0, 0);
    }

    public final C16971e getMAvatar() {
        C16971e c16971e = this.f65031M;
        if (c16971e != null) {
            return c16971e;
        }
        AbstractC19074t.m100223u("mAvatar");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C16716d getMLine1RightSide() {
        C16716d c16716d = this.f65032N;
        if (c16716d != null) {
            return c16716d;
        }
        AbstractC19074t.m100223u("mLine1RightSide");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C16716d getMLine2RightSide() {
        C16716d c16716d = this.f65034P;
        if (c16716d != null) {
            return c16716d;
        }
        AbstractC19074t.m100223u("mLine2RightSide");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C16959c0 getMListItemModule() {
        return this.f65030L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C22126c0 getMTime() {
        C22126c0 c22126c0 = this.f65033O;
        if (c22126c0 != null) {
            return c22126c0;
        }
        AbstractC19074t.m100223u("mTime");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C16977g getMUnreadBadge() {
        C16977g c16977g = this.f65035Q;
        if (c16977g != null) {
            return c16977g;
        }
        AbstractC19074t.m100223u("mUnreadBadge");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewParent
    public final C12260j getParent() {
        return this.f65029K;
    }

    /* renamed from: i0 */
    public void mo69766i0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        if (z11) {
            getMTime().mo111965M1(1);
            getMTime().m111962J1(f65020W);
        } else {
            getMTime().mo111965M1(0);
            getMTime().m111962J1(f65021a0);
        }
    }

    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        if (z11) {
            i11 = f65018U;
        } else {
            i11 = f65019V;
        }
        this.f65030L.m90801C1(i11);
        this.f65030L.m90804F1(z11);
    }

    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "item");
        this.f65030L.m90809K1(z11);
    }

    /* renamed from: l0 */
    public void mo69781l0(C18451m c18451m, boolean z11, int i11) {
        int i12;
        AbstractC19074t.m100208f(c18451m, "item");
        C16977g mUnreadBadge = getMUnreadBadge();
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        mUnreadBadge.mo44614b1(i12);
    }

    /* renamed from: m0 */
    public C16719g mo69842m0() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        setMAvatar(new C17074y0(context, EnumC16949e.SIZE_58));
        getMAvatar().mo90908r2();
        getMAvatar().m90781p1(C27274a.f128311a.m139635c());
        return getMAvatar();
    }

    /* renamed from: n0 */
    public C16716d mo69823n0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89017A(Boolean.TRUE).m89034R(f65027g0).m89028L(-2, -2);
        c16716d.m89001g1(m69858p0());
        setMLine1RightSide(c16716d);
        return c16716d;
    }

    /* renamed from: o0 */
    public C16716d mo69824o0() {
        C16716d c16716d = new C16716d(getContext());
        C16718f m89028L = c16716d.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89017A(bool).m89034R(f65028h0);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16977g c16977g = new C16977g(context);
        c16977g.m89106L().m89017A(bool).m89027K(true);
        setMUnreadBadge(c16977g);
        c16716d.m89001g1(c16977g);
        setMLine2RightSide(c16716d);
        return c16716d;
    }

    /* renamed from: q0 */
    public int mo69782q0(C18451m c18451m) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        return 0;
    }

    /* renamed from: r0 */
    public boolean mo69825r0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "item");
        return i11 > 0;
    }

    /* renamed from: s0 */
    public void mo69826s0() {
        f65015R = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        int m119607o = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2);
        f65016S = m119607o;
        int i11 = f65015R;
        f65017T = i11;
        f65018U = i11;
        f65019V = m119607o;
        f65020W = i11;
        f65021a0 = m119607o;
    }

    public final void setMAvatar(C16971e c16971e) {
        AbstractC19074t.m100208f(c16971e, "<set-?>");
        this.f65031M = c16971e;
    }

    protected final void setMLine1RightSide(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f65032N = c16716d;
    }

    protected final void setMLine2RightSide(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f65034P = c16716d;
    }

    protected final void setMListItemModule(C16959c0 c16959c0) {
        AbstractC19074t.m100208f(c16959c0, "<set-?>");
        this.f65030L = c16959c0;
    }

    protected final void setMTime(C22126c0 c22126c0) {
        AbstractC19074t.m100208f(c22126c0, "<set-?>");
        this.f65033O = c22126c0;
    }

    protected final void setMUnreadBadge(C16977g c16977g) {
        AbstractC19074t.m100208f(c16977g, "<set-?>");
        this.f65035Q = c16977g;
    }

    /* renamed from: u0 */
    public void mo69769u0(String str, boolean z11) {
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        HashMap hashMap;
        AbstractC19074t.m100208f(str, "uid");
        if (z11) {
            i11 = AbstractC16803z.stencils_contact_bg_highlight_pin;
        } else {
            i11 = AbstractC16803z.stencils_contact_bg_2;
        }
        C12260j c12260j = this.f65029K;
        if (c12260j != null) {
            z12 = c12260j.m68702V();
        } else {
            z12 = false;
        }
        C12260j c12260j2 = this.f65029K;
        if (c12260j2 != null && (hashMap = c12260j2.f63837B) != null) {
            z13 = hashMap.containsKey(str);
        } else {
            z13 = false;
        }
        if (z12 && z13) {
            i11 = AbstractC16803z.stencils_contact_bg_highlight_mark_as_read;
        }
        this.f65030L.m89087B0(i11);
        C12260j c12260j3 = this.f65029K;
        if (c12260j3 != null) {
            z14 = c12260j3.m68694M(str);
        } else {
            z14 = false;
        }
        if (z12 && !z14) {
            setEnabled(false);
            setAlpha(0.5f);
        } else {
            setEnabled(true);
            setAlpha(1.0f);
        }
    }
}
