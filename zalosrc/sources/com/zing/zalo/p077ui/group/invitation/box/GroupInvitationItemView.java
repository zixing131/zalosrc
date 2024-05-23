package com.zing.zalo.p077ui.group.invitation.box;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p656xs.AbstractC30201b;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class GroupInvitationItemView extends ModulesView {

    /* renamed from: K */
    private C16716d f61993K;

    /* renamed from: L */
    private C22129e f61994L;

    /* renamed from: M */
    private C22124b0 f61995M;

    /* renamed from: N */
    private C22124b0 f61996N;

    /* renamed from: O */
    private C22126c0 f61997O;

    /* renamed from: P */
    public C21693c f61998P;

    /* renamed from: Q */
    private C21693c f61999Q;

    /* renamed from: R */
    private final int f62000R;

    /* renamed from: S */
    private final int f62001S;

    /* renamed from: T */
    private final int f62002T;

    /* renamed from: U */
    private final int f62003U;

    /* renamed from: V */
    private final int f62004V;

    /* renamed from: W */
    private final int f62005W;

    /* renamed from: a0 */
    private final int f62006a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupInvitationItemView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f62000R = AbstractC23136l9.m118742r(48.0f);
        this.f62001S = AbstractC23136l9.m118742r(16.0f);
        this.f62002T = AbstractC23136l9.m118742r(24.0f);
        this.f62003U = AbstractC23136l9.m118742r(12.0f);
        this.f62004V = AbstractC23136l9.m118742r(15.0f);
        this.f62005W = AbstractC23136l9.m118742r(2.0f);
        this.f62006a0 = AbstractC23136l9.m118742r(13.0f);
        m66160X();
    }

    /* renamed from: V */
    private final void m66159V(GroupInvitationInfo groupInvitationInfo) {
        C22124b0 c22124b0 = null;
        if (m66161Y(groupInvitationInfo)) {
            C22124b0 c22124b02 = this.f61996N;
            if (c22124b02 == null) {
                AbstractC19074t.m100223u("descModule");
                c22124b02 = null;
            }
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c22124b02.m115402s1(null, null, C27280g.m139658a(context, AbstractC23322a.zds_oic_oa_star_check_color_24), null);
            C22124b0 c22124b03 = this.f61996N;
            if (c22124b03 == null) {
                AbstractC19074t.m100223u("descModule");
            } else {
                c22124b0 = c22124b03;
            }
            int i11 = AbstractC23222t7.f112590v;
            c22124b0.m115403t1(i11, i11);
            return;
        }
        C22124b0 c22124b04 = this.f61996N;
        if (c22124b04 == null) {
            AbstractC19074t.m100223u("descModule");
            c22124b04 = null;
        }
        c22124b04.m115402s1(null, null, null, null);
    }

    /* renamed from: X */
    private final void m66160X() {
        C16716d c16716d = new C16716d(getContext());
        this.f61993K = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89048d0(this.f62003U).m89044a0(this.f62003U);
        c16716d.m89087B0(AbstractC16803z.stencils_group_invitation_bg);
        C22129e c22129e = new C22129e(getContext(), this.f62000R);
        this.f61994L = c22129e;
        C16718f m89106L = c22129e.m89106L();
        int i11 = this.f62000R;
        m89106L.m89028L(i11, i11).m89034R(this.f62001S).m89035S(this.f62001S).m89027K(true);
        setMenuModule(new C21693c(getContext()));
        C21693c menuModule = getMenuModule();
        C16718f m89028L = menuModule.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89017A(bool).m89046b0(this.f62002T).m89048d0(this.f62002T).m89047c0(this.f62001S).m89044a0(this.f62002T).m89027K(true);
        menuModule.mo111925v1(AbstractC23136l9.m118665N(menuModule.getContext(), AbstractC16803z.ic_horizontal_overflow_menu));
        C16716d c16716d2 = new C16716d(getContext());
        C16718f m89027K = c16716d2.m89106L().m89028L(-2, -2).m89027K(true);
        C22129e c22129e2 = this.f61994L;
        C16716d c16716d3 = null;
        if (c22129e2 == null) {
            AbstractC19074t.m100223u("avatarModule");
            c22129e2 = null;
        }
        m89027K.m89054h0(c22129e2).m89049e0(getMenuModule());
        c16716d2.m89087B0(AbstractC16803z.stencils_group_invitation_bg);
        C21693c c21693c = new C21693c(getContext());
        this.f61999Q = c21693c;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_group_solid_16, AbstractC2807a.chat_community_badge_icon));
        C21693c c21693c2 = this.f61999Q;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mCommunityIcon");
            c21693c2 = null;
        }
        c21693c2.m89085A0(AbstractC23136l9.m118663M(AbstractC16803z.bg_community_icon_tab_message));
        C21693c c21693c3 = this.f61999Q;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mCommunityIcon");
            c21693c3 = null;
        }
        c21693c3.m89106L().m89028L(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(20.0f)).m89041Y(AbstractC23136l9.m118742r(2.0f)).m89073z(bool).m89035S(AbstractC23136l9.m118742r(4.0f));
        C21693c c21693c4 = this.f61999Q;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("mCommunityIcon");
            c21693c4 = null;
        }
        c21693c4.mo44614b1(8);
        C21693c c21693c5 = this.f61999Q;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("mCommunityIcon");
            c21693c5 = null;
        }
        c16716d2.m89001g1(c21693c5);
        C22124b0 c22124b0 = new C22124b0(getContext());
        this.f61995M = c22124b0;
        C16718f m89028L2 = c22124b0.m89106L().m89028L(-2, -2);
        C21693c c21693c6 = this.f61999Q;
        if (c21693c6 == null) {
            AbstractC19074t.m100223u("mCommunityIcon");
            c21693c6 = null;
        }
        m89028L2.m89054h0(c21693c6);
        c22124b0.m115399p1(AbstractC23222t7.f112556e);
        C22124b0 c22124b02 = this.f61995M;
        if (c22124b02 == null) {
            AbstractC19074t.m100223u("groupNameModule");
            c22124b02 = null;
        }
        C22126c0 c22126c0 = c22124b02.f108888M0;
        c22126c0.m89106L().m89028L(-2, -2);
        c22126c0.mo111964L1(this.f62004V);
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        C22124b0 c22124b03 = this.f61995M;
        if (c22124b03 == null) {
            AbstractC19074t.m100223u("groupNameModule");
            c22124b03 = null;
        }
        c16716d2.m89001g1(c22124b03);
        C22124b0 c22124b04 = new C22124b0(getContext());
        this.f61996N = c22124b04;
        C16718f m89028L3 = c22124b04.m89106L().m89028L(-2, -2);
        C22124b0 c22124b05 = this.f61995M;
        if (c22124b05 == null) {
            AbstractC19074t.m100223u("groupNameModule");
            c22124b05 = null;
        }
        m89028L3.m89023G(c22124b05).m89036T(this.f62005W);
        C22126c0 c22126c02 = c22124b04.f108888M0;
        c22126c02.m89106L().m89028L(-2, -2);
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(truncateAt);
        c22126c02.mo111964L1(this.f62006a0);
        c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC21196a.TextColor2));
        c22124b04.m115399p1(AbstractC23222t7.f112552c);
        C22124b0 c22124b06 = this.f61996N;
        if (c22124b06 == null) {
            AbstractC19074t.m100223u("descModule");
            c22124b06 = null;
        }
        c16716d2.m89001g1(c22124b06);
        C22126c0 c22126c03 = new C22126c0(getContext());
        this.f61997O = c22126c03;
        C16718f m89028L4 = c22126c03.m89106L().m89028L(-2, -2);
        C22124b0 c22124b07 = this.f61996N;
        if (c22124b07 == null) {
            AbstractC19074t.m100223u("descModule");
            c22124b07 = null;
        }
        m89028L4.m89023G(c22124b07).m89036T(this.f62005W);
        c22126c03.m111953A1(1);
        c22126c03.m111980v1(truncateAt);
        c22126c03.mo111964L1(this.f62006a0);
        c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC21196a.TextColor2));
        C22126c0 c22126c04 = this.f61997O;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("expireTimeModule");
            c22126c04 = null;
        }
        c16716d2.m89001g1(c22126c04);
        C16716d c16716d4 = this.f61993K;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("itemContainer");
            c16716d4 = null;
        }
        C22129e c22129e3 = this.f61994L;
        if (c22129e3 == null) {
            AbstractC19074t.m100223u("avatarModule");
            c22129e3 = null;
        }
        c16716d4.m89001g1(c22129e3);
        C16716d c16716d5 = this.f61993K;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("itemContainer");
            c16716d5 = null;
        }
        c16716d5.m89001g1(getMenuModule());
        C16716d c16716d6 = this.f61993K;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("itemContainer");
            c16716d6 = null;
        }
        c16716d6.m89001g1(c16716d2);
        C16716d c16716d7 = this.f61993K;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("itemContainer");
        } else {
            c16716d3 = c16716d7;
        }
        mo69681L(c16716d3);
    }

    /* renamed from: Y */
    private final boolean m66161Y(GroupInvitationInfo groupInvitationInfo) {
        if (AbstractC30201b.m148948a() && groupInvitationInfo.m40889g() == 1 && AbstractC19074t.m100204b(groupInvitationInfo.m40892j().f42434r, String.valueOf(groupInvitationInfo.m40888f())) && groupInvitationInfo.m40892j().m40387S0() && groupInvitationInfo.m40892j().m40359B0()) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final void m66162W(GroupInvitationInfo groupInvitationInfo) {
        Drawable drawable;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(groupInvitationInfo, "item");
        C21693c c21693c = null;
        if (groupInvitationInfo.m40883a().length() > 0) {
            C22129e c22129e = this.f61994L;
            if (c22129e == null) {
                AbstractC19074t.m100223u("avatarModule");
                c22129e = null;
            }
            c22129e.m115434r1(groupInvitationInfo.m40883a());
        } else {
            C22129e c22129e2 = this.f61994L;
            if (c22129e2 == null) {
                AbstractC19074t.m100223u("avatarModule");
                c22129e2 = null;
            }
            c22129e2.m115441y1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_ava_group));
        }
        C22124b0 c22124b0 = this.f61995M;
        if (c22124b0 == null) {
            AbstractC19074t.m100223u("groupNameModule");
            c22124b0 = null;
        }
        c22124b0.f108888M0.m111959G1(groupInvitationInfo.m40887e());
        if (groupInvitationInfo.m40900t()) {
            drawable = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_e2ee_tab_msg);
        } else {
            drawable = null;
        }
        C22124b0 c22124b02 = this.f61995M;
        if (c22124b02 == null) {
            AbstractC19074t.m100223u("groupNameModule");
            c22124b02 = null;
        }
        c22124b02.m115402s1(drawable, null, null, null);
        int i12 = 0;
        String m40383Q = groupInvitationInfo.m40892j().m40383Q(true, false);
        AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
        int length = m40383Q.length() - 1;
        int i13 = 0;
        boolean z12 = false;
        while (i13 <= length) {
            if (!z12) {
                i11 = i13;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(m40383Q.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i13++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_group_invited_by, m40383Q.subSequence(i13, length + 1).toString());
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        C22124b0 c22124b03 = this.f61996N;
        if (c22124b03 == null) {
            AbstractC19074t.m100223u("descModule");
            c22124b03 = null;
        }
        c22124b03.f108888M0.m111959G1(m118746s0);
        m66159V(groupInvitationInfo);
        if (groupInvitationInfo.m40895m() == 0) {
            getMenuModule().mo44614b1(0);
            C22126c0 c22126c0 = this.f61997O;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("expireTimeModule");
                c22126c0 = null;
            }
            c22126c0.mo44614b1(0);
            C22126c0 c22126c02 = this.f61997O;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("expireTimeModule");
                c22126c02 = null;
            }
            c22126c02.m111959G1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_group_expired_invitation_in, groupInvitationInfo.m40885c()));
        } else {
            getMenuModule().mo44614b1(8);
            C22126c0 c22126c03 = this.f61997O;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("expireTimeModule");
                c22126c03 = null;
            }
            c22126c03.mo44614b1(8);
        }
        C21693c c21693c2 = this.f61999Q;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mCommunityIcon");
        } else {
            c21693c = c21693c2;
        }
        if (!groupInvitationInfo.m40898p()) {
            i12 = 8;
        }
        c21693c.mo44614b1(i12);
    }

    public final C21693c getMenuModule() {
        C21693c c21693c = this.f61998P;
        if (c21693c != null) {
            return c21693c;
        }
        AbstractC19074t.m100223u("menuModule");
        return null;
    }

    public final void setMenuModule(C21693c c21693c) {
        AbstractC19074t.m100208f(c21693c, "<set-?>");
        this.f61998P = c21693c;
    }
}
