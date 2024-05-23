package com.zing.zalo.p077ui.moduleview.group;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import bi.C2806e;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p656xs.AbstractC30200a;
import p716zh.C32020m7;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class GroupInvitationBoxModuleView extends MsgItemInfoModulesView {
    public static final C12417a Companion = new C12417a(null);

    /* renamed from: V */
    private static final int f64753V;

    /* renamed from: W */
    private static final int f64754W;

    /* renamed from: a0 */
    private static final int f64755a0;

    /* renamed from: b0 */
    private static final int f64756b0;

    /* renamed from: K */
    private final C12260j f64757K;

    /* renamed from: L */
    private C16716d f64758L;

    /* renamed from: M */
    private C16719g f64759M;

    /* renamed from: N */
    private C21693c f64760N;

    /* renamed from: O */
    private C22126c0 f64761O;

    /* renamed from: P */
    private C22126c0 f64762P;

    /* renamed from: Q */
    private C16716d f64763Q;

    /* renamed from: R */
    private C16716d f64764R;

    /* renamed from: S */
    private C22126c0 f64765S;

    /* renamed from: T */
    private final int f64766T;

    /* renamed from: U */
    private final int f64767U;

    /* renamed from: com.zing.zalo.ui.moduleview.group.GroupInvitationBoxModuleView$a */
    /* loaded from: classes6.dex */
    public static final class C12417a {
        private C12417a() {
        }

        public /* synthetic */ C12417a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        int i11 = AbstractC23222t7.f112576o;
        f64753V = i11;
        f64754W = i11;
        int i12 = AbstractC23222t7.f112566j;
        f64755a0 = i12;
        f64756b0 = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupInvitationBoxModuleView(Context context, C12260j c12260j) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f64757K = c12260j;
        this.f64766T = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64767U = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        m69748V();
    }

    /* renamed from: V */
    private final void m69748V() {
        int i11;
        C16716d c16716d = new C16716d(getContext());
        this.f64758L = c16716d;
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
        TabMsgCommonItemModuleView.C12429a c12429a = TabMsgCommonItemModuleView.Companion;
        m89028L.m89048d0(c12429a.m69865e()).m89044a0(c12429a.m69862b()).m89046b0(c12429a.m69863c()).m89047c0(c12429a.m69864d());
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        C21693c c21693c = new C21693c(getContext());
        this.f64760N = c21693c;
        C16718f m89046b0 = c21693c.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.avt_La), AbstractC23136l9.m118655I(AbstractC16802y.avt_La)).m89025I(true).m89035S(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112556e).m89046b0(AbstractC23222t7.f112556e);
        Boolean bool = Boolean.TRUE;
        m89046b0.m89073z(bool);
        c21693c.m111929z1(0);
        c21693c.mo111925v1(AbstractC1388a.m6964f(c21693c.getContext(), AbstractC16803z.invitation_box_avatar));
        C16716d c16716d2 = new C16716d(getContext());
        C16718f m89027K = c16716d2.m89106L().m89028L(-1, -2).m89027K(true);
        C21693c c21693c2 = this.f64760N;
        C16719g c16719g = null;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mAvatar");
            c21693c2 = null;
        }
        m89027K.m89054h0(c21693c2);
        C22126c0 c22126c0 = new C22126c0(getContext());
        this.f64761O = c22126c0;
        c22126c0.mo111964L1(AbstractC23222t7.f112586t);
        c22126c0.mo111965M1(1);
        c22126c0.m111962J1(this.f64766T);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        if (AbstractC30200a.m148947f()) {
            i11 = AbstractC8020f0.str_group_invitation_item_title_v2;
        } else {
            i11 = AbstractC8020f0.str_group_invitation_item_title;
        }
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(i11));
        c22126c0.m89106L().m89028L(-1, -2);
        C22126c0 c22126c02 = new C22126c0(getContext());
        this.f64762P = c22126c02;
        c22126c02.mo111964L1(AbstractC23222t7.f112582r);
        c22126c02.m111962J1(this.f64766T);
        c22126c02.m111953A1(1);
        c22126c02.m111959G1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_group_invitation_item_mesage_plural, 3));
        c22126c02.m111980v1(truncateAt);
        C16718f m89106L = c22126c02.m89106L();
        C22126c0 c22126c03 = this.f64761O;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("title");
            c22126c03 = null;
        }
        m89106L.m89023G(c22126c03).m89028L(-1, -2);
        C22126c0 c22126c04 = this.f64761O;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("title");
            c22126c04 = null;
        }
        c16716d2.m89001g1(c22126c04);
        C22126c0 c22126c05 = this.f64762P;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("message");
            c22126c05 = null;
        }
        c16716d2.m89001g1(c22126c05);
        C16716d c16716d3 = new C16716d(getContext());
        this.f64763Q = c16716d3;
        c16716d3.m89106L().m89017A(bool).m89034R(f64754W).m89035S(0).m89028L(-2, -2);
        C22126c0 c22126c06 = new C22126c0(getContext());
        this.f64765S = c22126c06;
        c22126c06.mo111965M1(0);
        c22126c06.mo111964L1(f64753V);
        c22126c06.m111962J1(C23212s8.m119607o(c22126c06.getContext(), AbstractC21196a.TextColor2));
        c22126c06.m111953A1(1);
        c22126c06.m111980v1(truncateAt);
        c22126c06.m89106L().m89027K(true).m89028L(-2, -2).m89017A(bool);
        C16716d c16716d4 = this.f64763Q;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mLine1RightSide");
            c16716d4 = null;
        }
        C22126c0 c22126c07 = this.f64765S;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("mTime");
            c22126c07 = null;
        }
        c16716d4.m89001g1(c22126c07);
        C16716d c16716d5 = new C16716d(getContext());
        this.f64764R = c16716d5;
        C16718f m89017A = c16716d5.m89106L().m89028L(-2, -2).m89017A(bool);
        C16716d c16716d6 = this.f64763Q;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mLine1RightSide");
            c16716d6 = null;
        }
        m89017A.m89023G(c16716d6).m89036T(f64755a0).m89034R(f64756b0).m89035S(0);
        C16716d c16716d7 = this.f64758L;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mItemContainer");
            c16716d7 = null;
        }
        C21693c c21693c3 = this.f64760N;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mAvatar");
            c21693c3 = null;
        }
        c16716d7.m89001g1(c21693c3);
        C16716d c16716d8 = this.f64758L;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("mItemContainer");
            c16716d8 = null;
        }
        c16716d8.m89001g1(c16716d2);
        C16716d c16716d9 = this.f64758L;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("mItemContainer");
            c16716d9 = null;
        }
        C16716d c16716d10 = this.f64763Q;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("mLine1RightSide");
            c16716d10 = null;
        }
        c16716d9.m89001g1(c16716d10);
        C16716d c16716d11 = this.f64758L;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("mItemContainer");
            c16716d11 = null;
        }
        C16716d c16716d12 = this.f64764R;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("mLine2RightSide");
            c16716d12 = null;
        }
        c16716d11.m89001g1(c16716d12);
        C16719g c16719g2 = new C16719g(getContext());
        this.f64759M = c16719g2;
        c16719g2.mo89161z0(C23212s8.m119607o(c16719g2.getContext(), AbstractC16781w.ItemSeparatorColor));
        C16718f m89028L2 = c16719g2.m89106L().m89028L(-1, 1);
        C16716d c16716d13 = this.f64758L;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("mItemContainer");
            c16716d13 = null;
        }
        m89028L2.m89023G(c16716d13).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type1));
        C16716d c16716d14 = this.f64758L;
        if (c16716d14 == null) {
            AbstractC19074t.m100223u("mItemContainer");
            c16716d14 = null;
        }
        mo69681L(c16716d14);
        C16719g c16719g3 = this.f64759M;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("mBottomLine");
        } else {
            c16719g = c16719g3;
        }
        mo69681L(c16719g);
    }

    public final C12260j getAdapter() {
        return this.f64757K;
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        String string;
        AbstractC19074t.m100208f(c32020m7, "msgItem");
        C2806e c2806e = C2806e.f11255a;
        C22126c0 c22126c0 = null;
        if (c2806e.m13577b() > 0) {
            C22126c0 c22126c02 = this.f64761O;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("title");
                c22126c02 = null;
            }
            c22126c02.mo111965M1(1);
            C22126c0 c22126c03 = this.f64762P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("message");
                c22126c03 = null;
            }
            c22126c03.mo111965M1(1);
            C22126c0 c22126c04 = this.f64762P;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("message");
                c22126c04 = null;
            }
            c22126c04.m111962J1(this.f64766T);
            C22126c0 c22126c05 = this.f64765S;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTime");
                c22126c05 = null;
            }
            c22126c05.mo111965M1(1);
        } else {
            C22126c0 c22126c06 = this.f64761O;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("title");
                c22126c06 = null;
            }
            c22126c06.mo111965M1(0);
            C22126c0 c22126c07 = this.f64762P;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("message");
                c22126c07 = null;
            }
            c22126c07.mo111965M1(0);
            C22126c0 c22126c08 = this.f64762P;
            if (c22126c08 == null) {
                AbstractC19074t.m100223u("message");
                c22126c08 = null;
            }
            c22126c08.m111962J1(this.f64767U);
            C22126c0 c22126c09 = this.f64765S;
            if (c22126c09 == null) {
                AbstractC19074t.m100223u("mTime");
                c22126c09 = null;
            }
            c22126c09.mo111965M1(0);
        }
        C22126c0 c22126c010 = this.f64762P;
        if (c22126c010 == null) {
            AbstractC19074t.m100223u("message");
        } else {
            c22126c0 = c22126c010;
        }
        if (c2806e.m13582g() == 1) {
            string = getResources().getString(AbstractC8020f0.str_group_invitation_item_message_singular_v2, Integer.valueOf(c2806e.m13582g()));
        } else {
            string = getResources().getString(AbstractC8020f0.str_group_invitation_item_message_plural_v2, Integer.valueOf(c2806e.m13582g()));
        }
        c22126c0.m111959G1(string);
    }
}
