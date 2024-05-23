package com.zing.zalo.p077ui.group.invitation.box;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.p077ui.group.invitation.box.GroupInvitationRespondView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import fn0.AbstractC19074t;
import l80.C22126c0;
import ld0.C22448a;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p656xs.AbstractC30201b;

/* loaded from: classes5.dex */
public final class GroupInvitationRespondView extends ModulesView {

    /* renamed from: K */
    private C16971e f62017K;

    /* renamed from: L */
    private C22126c0 f62018L;

    /* renamed from: M */
    private C22126c0 f62019M;

    /* renamed from: N */
    private C22126c0 f62020N;

    /* renamed from: O */
    private C22126c0 f62021O;

    /* renamed from: P */
    private C22126c0 f62022P;

    /* renamed from: Q */
    private GroupInvitationInfo f62023Q;

    /* renamed from: R */
    private InterfaceC11905a f62024R;

    /* renamed from: com.zing.zalo.ui.group.invitation.box.GroupInvitationRespondView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11905a {
        /* renamed from: a */
        void mo66188a();

        /* renamed from: b */
        void mo66189b();

        /* renamed from: c */
        void mo66190c();
    }

    /* renamed from: com.zing.zalo.ui.group.invitation.box.GroupInvitationRespondView$b */
    /* loaded from: classes5.dex */
    public static final class C11906b extends ClickableSpan {
        C11906b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            if (GroupInvitationRespondView.this.getMListener() != null) {
                InterfaceC11905a mListener = GroupInvitationRespondView.this.getMListener();
                AbstractC19074t.m100205c(mListener);
                mListener.mo66190c();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(GroupInvitationRespondView.this.getContext(), AbstractC21196a.TextColor1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupInvitationRespondView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m66184e0();
        m66180a0();
    }

    /* renamed from: a0 */
    private final void m66180a0() {
        C22126c0 c22126c0 = this.f62020N;
        C16971e c16971e = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("acceptTextModule");
            c22126c0 = null;
        }
        c22126c0.mo89109M0(new C16719g.c() { // from class: d70.l
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                GroupInvitationRespondView.m66181b0(GroupInvitationRespondView.this, c16719g);
            }
        });
        C22126c0 c22126c02 = this.f62021O;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("declineTextModule");
            c22126c02 = null;
        }
        c22126c02.mo89109M0(new C16719g.c() { // from class: d70.m
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                GroupInvitationRespondView.m66182c0(GroupInvitationRespondView.this, c16719g);
            }
        });
        C16971e c16971e2 = this.f62017K;
        if (c16971e2 == null) {
            AbstractC19074t.m100223u("avatarModule");
        } else {
            c16971e = c16971e2;
        }
        c16971e.mo89109M0(new C16719g.c() { // from class: d70.n
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                GroupInvitationRespondView.m66183d0(GroupInvitationRespondView.this, c16719g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m66181b0(GroupInvitationRespondView groupInvitationRespondView, C16719g c16719g) {
        AbstractC19074t.m100208f(groupInvitationRespondView, "this$0");
        InterfaceC11905a interfaceC11905a = groupInvitationRespondView.f62024R;
        if (interfaceC11905a != null) {
            AbstractC19074t.m100205c(interfaceC11905a);
            interfaceC11905a.mo66189b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m66182c0(GroupInvitationRespondView groupInvitationRespondView, C16719g c16719g) {
        AbstractC19074t.m100208f(groupInvitationRespondView, "this$0");
        InterfaceC11905a interfaceC11905a = groupInvitationRespondView.f62024R;
        if (interfaceC11905a != null) {
            AbstractC19074t.m100205c(interfaceC11905a);
            interfaceC11905a.mo66188a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m66183d0(GroupInvitationRespondView groupInvitationRespondView, C16719g c16719g) {
        AbstractC19074t.m100208f(groupInvitationRespondView, "this$0");
        InterfaceC11905a interfaceC11905a = groupInvitationRespondView.f62024R;
        if (interfaceC11905a != null) {
            AbstractC19074t.m100205c(interfaceC11905a);
            interfaceC11905a.mo66190c();
        }
    }

    /* renamed from: e0 */
    private final void m66184e0() {
        C16719g c16719g;
        int m118742r = AbstractC23136l9.m118742r(40.0f);
        int m118742r2 = AbstractC23136l9.m118742r(16.0f);
        int m118742r3 = AbstractC23136l9.m118742r(24.0f);
        AbstractC23136l9.m118742r(36.0f);
        int m118742r4 = AbstractC23136l9.m118742r(15.0f);
        int m118742r5 = AbstractC23136l9.m118742r(10.0f);
        int m118742r6 = AbstractC23136l9.m118742r(13.0f);
        int m118742r7 = AbstractC23136l9.m118742r(12.0f);
        int m118742r8 = AbstractC23136l9.m118742r(8.0f);
        int m118722k0 = (AbstractC23136l9.m118722k0() - (m118742r2 * 3)) / 2;
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PopupBackgroundColor));
        C16719g c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-1, AbstractC23136l9.m118742r(0.5f)).m89033Q(m118742r2);
        c22126c0.mo89161z0(C23212s8.m119607o(c22126c0.getContext(), AbstractC16781w.TabBottomLineColor));
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89023G(c22126c0);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16971e c16971e = new C16971e(context, EnumC16949e.SIZE_32);
        this.f62017K = c16971e;
        c16971e.m89106L().m89034R(m118742r2);
        C16971e c16971e2 = this.f62017K;
        if (c16971e2 == null) {
            AbstractC19074t.m100223u("avatarModule");
            c16971e2 = null;
        }
        c16971e2.m89007n1(false);
        C16971e c16971e3 = this.f62017K;
        if (c16971e3 == null) {
            AbstractC19074t.m100223u("avatarModule");
            c16971e3 = null;
        }
        c16716d.m89001g1(c16971e3);
        C22126c0 c22126c02 = new C22126c0(getContext());
        this.f62018L = c22126c02;
        C16718f m89028L = c22126c02.m89106L().m89028L(-2, -2);
        C16971e c16971e4 = this.f62017K;
        if (c16971e4 == null) {
            AbstractC19074t.m100223u("avatarModule");
            c16971e4 = null;
        }
        m89028L.m89054h0(c16971e4).m89034R(m118742r5).m89035S(m118742r2);
        c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC21196a.TextColor1));
        float f11 = m118742r4;
        c22126c02.mo111964L1(f11);
        C22126c0 c22126c03 = this.f62018L;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("titleModule");
            c22126c03 = null;
        }
        c16716d.m89001g1(c22126c03);
        C22126c0 c22126c04 = new C22126c0(getContext());
        this.f62019M = c22126c04;
        C16718f m89028L2 = c22126c04.m89106L().m89028L(-2, -2);
        C16971e c16971e5 = this.f62017K;
        if (c16971e5 == null) {
            AbstractC19074t.m100223u("avatarModule");
            c16971e5 = null;
        }
        C16718f m89054h0 = m89028L2.m89054h0(c16971e5);
        C22126c0 c22126c05 = this.f62018L;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("titleModule");
            c22126c05 = null;
        }
        m89054h0.m89023G(c22126c05).m89034R(m118742r5).m89035S(m118742r2);
        c22126c04.m111962J1(C23212s8.m119607o(c22126c04.getContext(), AbstractC21196a.TextColor2));
        c22126c04.mo111964L1(f11);
        C22126c0 c22126c06 = this.f62019M;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("descModule");
            c22126c06 = null;
        }
        c16716d.m89001g1(c22126c06);
        C22126c0 c22126c07 = new C22126c0(getContext());
        this.f62020N = c22126c07;
        c22126c07.m89106L().m89028L(m118722k0, -2).m89023G(c16716d).m89042Z(0, m118742r5, 0, m118742r7).m89036T(m118742r2).m89033Q(m118742r3).m89034R(m118742r2);
        float f12 = m118742r6;
        c22126c07.mo111964L1(f12);
        c22126c07.m115422R1();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c22126c07.m111961I1(alignment);
        c22126c07.m111962J1(C23212s8.m119607o(c22126c07.getContext(), AbstractC16781w.AppPrimaryColor));
        c22126c07.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_join_group));
        AbstractC23022b5.m118023a(c22126c07, AbstractC8915g0.btnType2_medium_standard);
        C22126c0 c22126c08 = new C22126c0(getContext());
        this.f62021O = c22126c08;
        c22126c08.m89106L().m89028L(m118722k0, -2).m89023G(c16716d).m89042Z(0, m118742r5, 0, m118742r7).m89036T(m118742r2).m89033Q(m118742r3).m89017A(Boolean.TRUE).m89035S(m118742r2);
        c22126c08.mo111964L1(f12);
        c22126c08.m115422R1();
        c22126c08.m111961I1(alignment);
        c22126c08.m111962J1(C23212s8.m119607o(c22126c08.getContext(), AbstractC16781w.SeparatorColor3));
        c22126c08.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_decline_group_invitation));
        AbstractC23022b5.m118023a(c22126c08, AbstractC8915g0.btnType5_medium);
        C22126c0 c22126c09 = new C22126c0(getContext());
        this.f62022P = c22126c09;
        c22126c09.m89106L().m89028L(-1, -2).m89023G(c16716d).m89029M(15).m89042Z(0, m118742r8, 0, m118742r8).m89032P(m118742r, m118742r2, m118742r, m118742r3).m89026J(true);
        AbstractC23022b5.m118023a(c22126c09, AbstractC8915g0.btnType1_medium);
        c22126c09.mo111964L1(f12);
        c22126c09.m111953A1(1);
        c22126c09.m111979u1(true);
        c22126c09.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_discover_requested));
        c22126c09.mo89099H0(false);
        mo69681L(c22126c0);
        mo69681L(c16716d);
        C16719g c16719g2 = this.f62020N;
        if (c16719g2 == null) {
            AbstractC19074t.m100223u("acceptTextModule");
            c16719g2 = null;
        }
        mo69681L(c16719g2);
        C16719g c16719g3 = this.f62021O;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("declineTextModule");
            c16719g3 = null;
        }
        mo69681L(c16719g3);
        C16719g c16719g4 = this.f62022P;
        if (c16719g4 == null) {
            AbstractC19074t.m100223u("pendingTextModule");
            c16719g = null;
        } else {
            c16719g = c16719g4;
        }
        mo69681L(c16719g);
    }

    /* renamed from: f0 */
    private final boolean m66185f0(GroupInvitationInfo groupInvitationInfo) {
        if (AbstractC30201b.m148948a() && groupInvitationInfo.m40889g() == 1 && AbstractC19074t.m100204b(groupInvitationInfo.m40892j().f42434r, String.valueOf(groupInvitationInfo.m40888f())) && groupInvitationInfo.m40892j().m40387S0() && groupInvitationInfo.m40892j().m40359B0()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final void m66186Y(GroupInvitationInfo groupInvitationInfo) {
        int i11;
        this.f62023Q = groupInvitationInfo;
        if (groupInvitationInfo != null) {
            C16971e c16971e = this.f62017K;
            C22126c0 c22126c0 = null;
            if (c16971e == null) {
                AbstractC19074t.m100223u("avatarModule");
                c16971e = null;
            }
            String str = groupInvitationInfo.m40894l().f42446v;
            AbstractC19074t.m100207e(str, "avt");
            c16971e.m90886N1(str);
            if (m66185f0(groupInvitationInfo)) {
                C16971e c16971e2 = this.f62017K;
                if (c16971e2 == null) {
                    AbstractC19074t.m100223u("avatarModule");
                    c16971e2 = null;
                }
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C16974f c16974f = new C16974f(context);
                c16974f.m90974x(EnumC16991i.OA);
                c16974f.m90970t(false);
                c16974f.m90971u(EnumC16980h.SIZE_12);
                c16971e2.m90897c2(c16974f);
            }
            String str2 = groupInvitationInfo.m40894l().f42437s;
            GroupInvitationInfo groupInvitationInfo2 = this.f62023Q;
            if (groupInvitationInfo2 != null && groupInvitationInfo2.m40898p()) {
                i11 = AbstractC8020f0.str_invited_you_to_join_community_title;
            } else {
                i11 = AbstractC8020f0.str_invited_you_to_join_group_title;
            }
            SpannableString spannableString = new SpannableString(str2 + " " + AbstractC23136l9.m118743r0(i11));
            spannableString.setSpan(new C11906b(), 0, str2.length(), 33);
            C22126c0 c22126c02 = this.f62018L;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("titleModule");
                c22126c02 = null;
            }
            c22126c02.m111959G1(spannableString);
            C22126c0 c22126c03 = this.f62018L;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("titleModule");
                c22126c03 = null;
            }
            c22126c03.m111955C1(new C22448a());
            C22126c0 c22126c04 = this.f62019M;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("descModule");
                c22126c04 = null;
            }
            c22126c04.m111959G1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_group_expired_invitation_in, groupInvitationInfo.m40885c()));
            int m40895m = groupInvitationInfo.m40895m();
            if (m40895m != 0) {
                if (m40895m == 1) {
                    C22126c0 c22126c05 = this.f62020N;
                    if (c22126c05 == null) {
                        AbstractC19074t.m100223u("acceptTextModule");
                        c22126c05 = null;
                    }
                    c22126c05.mo44614b1(8);
                    C22126c0 c22126c06 = this.f62021O;
                    if (c22126c06 == null) {
                        AbstractC19074t.m100223u("declineTextModule");
                        c22126c06 = null;
                    }
                    c22126c06.mo44614b1(8);
                    C22126c0 c22126c07 = this.f62022P;
                    if (c22126c07 == null) {
                        AbstractC19074t.m100223u("pendingTextModule");
                        c22126c07 = null;
                    }
                    c22126c07.mo44614b1(0);
                    C22126c0 c22126c08 = this.f62019M;
                    if (c22126c08 == null) {
                        AbstractC19074t.m100223u("descModule");
                        c22126c08 = null;
                    }
                    c22126c08.mo44614b1(8);
                    C16971e c16971e3 = this.f62017K;
                    if (c16971e3 == null) {
                        AbstractC19074t.m100223u("avatarModule");
                        c16971e3 = null;
                    }
                    c16971e3.m89106L().m89027K(true);
                    C22126c0 c22126c09 = this.f62018L;
                    if (c22126c09 == null) {
                        AbstractC19074t.m100223u("titleModule");
                        c22126c09 = null;
                    }
                    c22126c09.m89106L().m89027K(true);
                }
            } else {
                C22126c0 c22126c010 = this.f62020N;
                if (c22126c010 == null) {
                    AbstractC19074t.m100223u("acceptTextModule");
                    c22126c010 = null;
                }
                c22126c010.mo44614b1(0);
                C22126c0 c22126c011 = this.f62021O;
                if (c22126c011 == null) {
                    AbstractC19074t.m100223u("declineTextModule");
                    c22126c011 = null;
                }
                c22126c011.mo44614b1(0);
                C22126c0 c22126c012 = this.f62022P;
                if (c22126c012 == null) {
                    AbstractC19074t.m100223u("pendingTextModule");
                    c22126c012 = null;
                }
                c22126c012.mo44614b1(8);
                C22126c0 c22126c013 = this.f62019M;
                if (c22126c013 == null) {
                    AbstractC19074t.m100223u("descModule");
                    c22126c013 = null;
                }
                c22126c013.mo44614b1(0);
            }
            GroupInvitationInfo groupInvitationInfo3 = this.f62023Q;
            if (groupInvitationInfo3 != null && groupInvitationInfo3.m40898p()) {
                C22126c0 c22126c014 = this.f62020N;
                if (c22126c014 == null) {
                    AbstractC19074t.m100223u("acceptTextModule");
                } else {
                    c22126c0 = c22126c014;
                }
                c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_join_community));
            }
        }
    }

    /* renamed from: g0 */
    public final void m66187g0(GroupInvitationInfo groupInvitationInfo) {
        Integer num;
        C22126c0 c22126c0 = null;
        if (groupInvitationInfo != null) {
            num = Integer.valueOf(groupInvitationInfo.m40895m());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C22126c0 c22126c02 = this.f62020N;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("acceptTextModule");
                c22126c02 = null;
            }
            c22126c02.mo44614b1(0);
            C22126c0 c22126c03 = this.f62021O;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("declineTextModule");
                c22126c03 = null;
            }
            c22126c03.mo44614b1(0);
            C22126c0 c22126c04 = this.f62022P;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("pendingTextModule");
            } else {
                c22126c0 = c22126c04;
            }
            c22126c0.mo44614b1(8);
            return;
        }
        if (num != null && num.intValue() == 1) {
            C22126c0 c22126c05 = this.f62020N;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("acceptTextModule");
                c22126c05 = null;
            }
            c22126c05.mo44614b1(8);
            C22126c0 c22126c06 = this.f62021O;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("declineTextModule");
                c22126c06 = null;
            }
            c22126c06.mo44614b1(8);
            C22126c0 c22126c07 = this.f62022P;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("pendingTextModule");
            } else {
                c22126c0 = c22126c07;
            }
            c22126c0.mo44614b1(0);
        }
    }

    public final InterfaceC11905a getMListener() {
        return this.f62024R;
    }

    public final void setMListener(InterfaceC11905a interfaceC11905a) {
        this.f62024R = interfaceC11905a;
    }

    public final void setOnEventListener(InterfaceC11905a interfaceC11905a) {
        this.f62024R = interfaceC11905a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupInvitationRespondView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m66184e0();
        m66180a0();
    }
}
