package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import bi.C2804c;
import bi.C2806e;
import bi0.AbstractC2807a;
import bn.C2913t1;
import c70.C3334c;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.custom.ViewOnTouchListenerC11852c;
import com.zing.zalo.p077ui.group.invitation.box.ConfirmDeclineInvitationBottomSheet;
import com.zing.zalo.p077ui.group.invitation.box.GroupInvitationRespondView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.GroupHorizontalAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.zviews.GroupLobbyView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20379a;
import ib0.C20500d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import me0.AbstractC23028c0;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONException;
import org.json.JSONObject;
import p172fy.C19171b;
import p175g0.AbstractC19182e;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p588vw.C28652r;
import p656xs.AbstractC30200a;
import p656xs.AbstractC30201b;
import p716zh.C31884d6;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C32002l4;
import ui0.C27280g;

/* loaded from: classes6.dex */
public class GroupLobbyView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: P0 */
    View f73784P0;

    /* renamed from: Q0 */
    C23528a f73785Q0;

    /* renamed from: R0 */
    Context f73786R0;

    /* renamed from: S0 */
    ScrollView f73787S0;

    /* renamed from: T0 */
    GroupAvatarView f73788T0;

    /* renamed from: U0 */
    RobotoTextView f73789U0;

    /* renamed from: V0 */
    RobotoTextView f73790V0;

    /* renamed from: W0 */
    RobotoTextView f73791W0;

    /* renamed from: X0 */
    RobotoTextView f73792X0;

    /* renamed from: Y0 */
    RobotoTextView f73793Y0;

    /* renamed from: Z0 */
    RobotoTextView f73794Z0;

    /* renamed from: a1 */
    GroupHorizontalAvatarView f73795a1;

    /* renamed from: b1 */
    MultiStateView f73796b1;

    /* renamed from: c1 */
    GroupInvitationRespondView f73797c1;

    /* renamed from: g1 */
    String f73801g1;

    /* renamed from: i1 */
    C31973j5 f73803i1;

    /* renamed from: m1 */
    GroupInvitationInfo f73807m1;

    /* renamed from: o1 */
    ActionBarMenuItem f73809o1;

    /* renamed from: p1 */
    View f73810p1;

    /* renamed from: t1 */
    CustomEditText f73814t1;

    /* renamed from: u1 */
    Button f73815u1;

    /* renamed from: v1 */
    Button f73816v1;

    /* renamed from: d1 */
    public boolean f73798d1 = false;

    /* renamed from: e1 */
    boolean f73799e1 = false;

    /* renamed from: f1 */
    boolean f73800f1 = false;

    /* renamed from: h1 */
    int f73802h1 = 0;

    /* renamed from: j1 */
    int f73804j1 = 1;

    /* renamed from: k1 */
    private String f73805k1 = "";

    /* renamed from: l1 */
    C20500d f73806l1 = new C20500d(true);

    /* renamed from: n1 */
    boolean f73808n1 = false;

    /* renamed from: q1 */
    boolean f73811q1 = false;

    /* renamed from: r1 */
    boolean f73812r1 = false;

    /* renamed from: s1 */
    boolean f73813s1 = true;

    /* renamed from: w1 */
    C2804c.a f73817w1 = new C14358a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$a */
    /* loaded from: classes6.dex */
    public class C14358a extends C2804c.a {
        C14358a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80207f() {
            AbstractC23088h5.m118426g();
            if (GroupLobbyView.this.m92672lJ()) {
                ToastUtils.showMess(GroupLobbyView.this.m92652XI(AbstractC8020f0.add_to_ignore_list));
            }
        }

        @Override // bi.C2804c.a
        /* renamed from: a */
        public void mo13569a(C20096c c20096c) {
            if (c20096c.m104491c() == 0) {
                if (GroupLobbyView.this.m92676n2() != null) {
                    GroupLobbyView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pk
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupLobbyView.C14358a.this.m80207f();
                        }
                    });
                }
            } else if (GroupLobbyView.this.m92672lJ()) {
                ToastUtils.m89259g(c20096c.m104491c());
            }
        }

        @Override // bi.C2804c.a
        /* renamed from: b */
        public void mo13570b(C20096c c20096c) {
            GroupLobbyView.this.mo49315c4();
            if (c20096c.m104491c() == 0) {
                C19669z.m103146Y().m103198O0();
                GroupLobbyView.this.mo59032jx(AbstractC8020f0.str_decline_invitation_successfully_message);
                GroupLobbyView.this.finish();
            } else if (GroupLobbyView.this.m92672lJ()) {
                if (c20096c.m104492d().isEmpty()) {
                    GroupLobbyView.this.mo59032jx(AbstractC8020f0.error_general);
                } else {
                    GroupLobbyView.this.mo78936E(c20096c.m104492d());
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$b */
    /* loaded from: classes6.dex */
    class C14359b extends C20500d.a {
        C14359b() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: b */
        public void mo80168b(String str) {
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            AbstractC23184q2.m119465w(str, GroupLobbyView.this.f72421L0.getContext(), GroupLobbyView.this.f72421L0.m92676n2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$c */
    /* loaded from: classes6.dex */
    public class C14360c implements GroupInvitationRespondView.InterfaceC11905a {
        C14360c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m80209e(boolean z11, boolean z12) {
            GroupLobbyView.this.mo46829Y();
            C2804c c2804c = C2804c.f11236a;
            c2804c.m13566v(GroupLobbyView.this.f73807m1, z12);
            if (z11) {
                c2804c.m13563n(GroupLobbyView.this.f73807m1.m40892j(), 6);
            }
        }

        @Override // com.zing.zalo.p077ui.group.invitation.box.GroupInvitationRespondView.InterfaceC11905a
        /* renamed from: a */
        public void mo66188a() {
            ConfirmDeclineInvitationBottomSheet m66158a = ConfirmDeclineInvitationBottomSheet.Companion.m66158a(new ConfirmDeclineInvitationBottomSheet.InterfaceC11899a() { // from class: com.zing.zalo.ui.zviews.qk
                @Override // com.zing.zalo.p077ui.group.invitation.box.ConfirmDeclineInvitationBottomSheet.InterfaceC11899a
                /* renamed from: a */
                public final void mo66157a(boolean z11, boolean z12) {
                    GroupLobbyView.C14360c.this.m80209e(z11, z12);
                }
            }, GroupLobbyView.this.f73807m1);
            GroupLobbyView.this.f72421L0.m92649TI().m93058d2(0, m66158a, 2, m66158a.f61989U0, 0, false);
        }

        @Override // com.zing.zalo.p077ui.group.invitation.box.GroupInvitationRespondView.InterfaceC11905a
        /* renamed from: b */
        public void mo66189b() {
            GroupLobbyView.this.m80205zM();
        }

        @Override // com.zing.zalo.p077ui.group.invitation.box.GroupInvitationRespondView.InterfaceC11905a
        /* renamed from: c */
        public void mo66190c() {
            GroupLobbyView.this.m80183BM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$d */
    /* loaded from: classes6.dex */
    public class C14361d implements InterfaceC20094a {
        C14361d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                GroupLobbyView groupLobbyView = GroupLobbyView.this;
                groupLobbyView.f73811q1 = false;
                if (c20096c != null) {
                    ToastUtils.m89261i(c20096c, groupLobbyView.f73808n1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                GroupLobbyView groupLobbyView = GroupLobbyView.this;
                groupLobbyView.f73811q1 = false;
                groupLobbyView.f72421L0.finish();
                ToastUtils.m89266n(AbstractC8020f0.str_hide_group_success, new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$e */
    /* loaded from: classes6.dex */
    public class C14362e implements InterfaceC20094a {
        C14362e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m80212e() {
            try {
                GroupLobbyView.this.f73796b1.setVisibility(8);
                GroupLobbyView.this.m80199nM();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80213f(C20096c c20096c) {
            try {
                if (GroupLobbyView.this.f73796b1 != null) {
                    MultiStateView.EnumC15915f enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                    String m104492d = c20096c.m104492d();
                    int m104491c = c20096c.m104491c();
                    if (m104491c != 17002) {
                        if (m104491c != 17006) {
                            if (m104491c == 50001) {
                                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                                m104492d = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                            }
                        } else {
                            enumC15915f = MultiStateView.EnumC15915f.DELETED_ERROR;
                            m104492d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_no_longer_exists);
                        }
                    } else {
                        GroupLobbyView groupLobbyView = GroupLobbyView.this;
                        if (groupLobbyView.f73800f1) {
                            C2804c.f11236a.m13559K(groupLobbyView.f73807m1);
                            C19669z.m103146Y().m103198O0();
                            C23744a.m124114c().m124116d(5116, new Object[0]);
                        }
                        GroupLobbyView.this.f72421L0.finish();
                        AbstractC23161o1.m119320e(c20096c, GroupLobbyView.this.f73808n1);
                    }
                    if (c20096c.m104491c() != 17002) {
                        GroupLobbyView.this.f73796b1.setVisibility(0);
                        GroupLobbyView.this.f73796b1.setState(MultiStateView.EnumC15914e.ERROR);
                        GroupLobbyView.this.f73796b1.setErrorType(enumC15915f);
                        GroupLobbyView.this.f73796b1.setErrorTitleString(m104492d);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            GroupLobbyView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.rk
                @Override // java.lang.Runnable
                public final void run() {
                    GroupLobbyView.C14362e.this.m80213f(c20096c);
                }
            });
            GroupLobbyView.this.f73812r1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C19637j c19637j = C19637j.f97466a;
                Pair m102835R = c19637j.m102835R(jSONObject);
                GroupLobbyView groupLobbyView = GroupLobbyView.this;
                C31973j5 c31973j5 = (C31973j5) m102835R.first;
                groupLobbyView.f73803i1 = c31973j5;
                if (c31973j5.m153782r0() == 1) {
                    c19637j.m102847f0(GroupLobbyView.this.f73801g1, true);
                }
                GroupLobbyView groupLobbyView2 = GroupLobbyView.this;
                groupLobbyView2.f73808n1 = groupLobbyView2.f73803i1.m153747Y();
                ArrayList arrayList = new ArrayList();
                Iterator it = new ArrayList(GroupLobbyView.this.f73803i1.m153760g()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C31973j5.b) it.next()).m153802d());
                }
                GroupLobbyView.this.f73803i1.m153739R0(arrayList);
                C19637j.m102803N(GroupLobbyView.this.f73803i1);
                GroupLobbyView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sk
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupLobbyView.C14362e.this.m80212e();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupLobbyView.this.f73812r1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$f */
    /* loaded from: classes6.dex */
    public class C14363f extends ClickableSpan {
        C14363f() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (GroupLobbyView.this.f73803i1 != null) {
                AbstractC23647d.m123897g("8022005");
                AbstractC23211s7.m119563C(GroupLobbyView.this.f73803i1.m153758f(), GroupLobbyView.this.f72421L0.m92662fJ(), C32002l4.m154265h(40001, 1), null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(GroupLobbyView.this.f73786R0, AbstractC2807a.cta_link));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$g */
    /* loaded from: classes6.dex */
    public class C14364g extends ClickableSpan {
        C14364g() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            GroupLobbyView groupLobbyView = GroupLobbyView.this;
            groupLobbyView.f73813s1 = false;
            groupLobbyView.m80200pM();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(GroupLobbyView.this.f73786R0, AbstractC16781w.AppPrimaryColor));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$h */
    /* loaded from: classes6.dex */
    public class C14365h implements InterfaceC20094a {
        C14365h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m80215d() {
            C3334c c3334c = C3334c.f14156a;
            Context context = GroupLobbyView.this.getContext();
            int i11 = AbstractC8020f0.str_popup_title_unable_join_group;
            int i12 = AbstractC8020f0.str_popup_subtitle_limit_members_to_join_group;
            int i13 = AbstractC23322a.zds_il_community_error_spot_1_1;
            int i14 = AbstractC8020f0.str_popup_btn_close;
            GroupLobbyView groupLobbyView = GroupLobbyView.this;
            c3334c.m16810d(context, i11, i12, i13, i14, null, groupLobbyView.f73801g1, groupLobbyView.f72421L0, null, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str;
            try {
                GroupLobbyView.this.f72421L0.mo49315c4();
                if (c20096c != null) {
                    int m104491c = c20096c.m104491c();
                    if (m104491c != 17002) {
                        if (m104491c != 17032) {
                            if (m104491c != 18004) {
                                if (m104491c != 19530) {
                                    switch (m104491c) {
                                        case 17014:
                                        case 17015:
                                            AbstractC2364o0.m12373p(GroupLobbyView.this, 3);
                                            break;
                                        case 17016:
                                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.ERROR_CANNOT_JOIN_GROUP));
                                            break;
                                        default:
                                            AbstractC23161o1.m119321f(c20096c, GroupLobbyView.this.f73808n1);
                                            break;
                                    }
                                } else if (AbstractC30200a.m148947f()) {
                                    GroupLobbyView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.tk
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            GroupLobbyView.C14365h.this.m80215d();
                                        }
                                    });
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("gid", GroupLobbyView.this.f73801g1);
                                        jSONObject.put("member_role", "non_mem");
                                    } catch (JSONException e11) {
                                        AbstractC23350e.m122776f("GroupLobbyView", e11);
                                    }
                                    C20379a c20379a = C20379a.f100400a;
                                    if (GroupLobbyView.this.f73800f1) {
                                        str = "gr_invitation";
                                    } else {
                                        str = "gr_link";
                                    }
                                    c20379a.m106159a(str, 1, "limit_100_mem", jSONObject.toString());
                                } else {
                                    AbstractC23161o1.m119321f(c20096c, GroupLobbyView.this.f73808n1);
                                }
                            } else {
                                GroupLobbyView groupLobbyView = GroupLobbyView.this;
                                if (groupLobbyView.f73803i1 != null) {
                                    C2804c.f11236a.m13559K(groupLobbyView.f73807m1);
                                    C19669z.m103146Y().m103198O0();
                                    GroupLobbyView groupLobbyView2 = GroupLobbyView.this;
                                    AbstractC23211s7.m119577j(groupLobbyView2.f73803i1, groupLobbyView2.f72421L0.m92676n2(), true);
                                    GroupLobbyView.this.f72421L0.finish();
                                }
                            }
                        } else {
                            GroupLobbyView.this.f73803i1.m153706A0(2);
                            AbstractC23184q2.m119438C(GroupLobbyView.this.f73801g1);
                            GroupLobbyView.this.m80198DM();
                        }
                    } else {
                        GroupLobbyView groupLobbyView3 = GroupLobbyView.this;
                        if (groupLobbyView3.f73800f1) {
                            C2804c.f11236a.m13559K(groupLobbyView3.f73807m1);
                            C19669z.m103146Y().m103198O0();
                            C23744a.m124114c().m124116d(5116, new Object[0]);
                        }
                        GroupLobbyView.this.f72421L0.finish();
                        AbstractC23161o1.m119320e(c20096c, GroupLobbyView.this.f73808n1);
                    }
                }
                GroupLobbyView.this.f73799e1 = false;
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001f, B:10:0x002e, B:12:0x0035, B:14:0x003a, B:16:0x004d, B:17:0x0052, B:18:0x0050, B:19:0x005f, B:21:0x0065, B:22:0x0098, B:24:0x00b5, B:25:0x00ba, B:26:0x00b8, B:27:0x00c8), top: B:1:0x0000 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            int i11;
            C31973j5 c31973j5;
            int i12;
            int i13;
            try {
                GroupLobbyView.this.f72421L0.mo49315c4();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("isPendingList");
                    if (!TextUtils.isEmpty(optString) && !optString.equals("1")) {
                        i11 = 1;
                        c31973j5 = GroupLobbyView.this.f73803i1;
                        if (c31973j5 != null) {
                            c31973j5.m153706A0(i11);
                            if (i11 == 2) {
                                C19637j.f97466a.m102847f0(GroupLobbyView.this.f73801g1, true);
                                if (GroupLobbyView.this.f73803i1.m153747Y()) {
                                    i13 = AbstractC8020f0.str_community_request_sent_and_wait_admin_approval;
                                } else {
                                    i13 = AbstractC8020f0.str_request_sent_and_wait_admin_approval_v2;
                                }
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(i13));
                                GroupLobbyView.this.m80182AM();
                            } else {
                                if (GroupLobbyView.this.f73800f1) {
                                    C2806e c2806e = C2806e.f11255a;
                                    c2806e.m13585j(C23793c.m124316k().mo124314i());
                                    AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
                                    C2804c.f11236a.m13559K(GroupLobbyView.this.f73807m1);
                                    C19669z.m103146Y().m103198O0();
                                    C23744a.m124114c().m124116d(5116, new Object[0]);
                                }
                                GroupLobbyView groupLobbyView = GroupLobbyView.this;
                                AbstractC23211s7.m119578k(groupLobbyView.f73803i1, groupLobbyView.f72421L0.m92676n2(), true, GroupLobbyView.this.f73805k1);
                                if (GroupLobbyView.this.f73803i1.m153747Y()) {
                                    i12 = AbstractC8020f0.str_joined_community;
                                } else {
                                    i12 = AbstractC8020f0.str_joined_group;
                                }
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(i12));
                                GroupLobbyView.this.f72421L0.finish();
                            }
                        }
                        GroupLobbyView.this.m80198DM();
                        GroupLobbyView.this.f73799e1 = false;
                    }
                }
                i11 = 2;
                c31973j5 = GroupLobbyView.this.f73803i1;
                if (c31973j5 != null) {
                }
                GroupLobbyView.this.m80198DM();
                GroupLobbyView.this.f73799e1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$i */
    /* loaded from: classes6.dex */
    class C14366i extends AbstractC18391a {
        C14366i() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                String obj = editable.toString();
                Button button = GroupLobbyView.this.f73816v1;
                if (button != null) {
                    button.setEnabled(!TextUtils.isEmpty(obj));
                }
                if (obj.length() > 80) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_poll_max_chars_input, 80));
                    GroupLobbyView.this.f73814t1.setText(obj.substring(0, 80));
                    GroupLobbyView.this.f73814t1.setSelection(80);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupLobbyView$j */
    /* loaded from: classes6.dex */
    public class C14367j implements InterfaceC20094a {
        C14367j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupLobbyView.this.f72421L0.mo49315c4();
            if (!GroupLobbyView.this.f72421L0.m92681pJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            GroupLobbyView.this.f72421L0.mo49315c4();
            if (!GroupLobbyView.this.f72421L0.m92681pJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_group_done));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public void m80182AM() {
        if (this.f73800f1) {
            this.f73807m1.m40881C(1);
            C7960e.m41971c6().m42108E8(this.f73807m1);
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lk
                @Override // java.lang.Runnable
                public final void run() {
                    GroupLobbyView.this.m80195xM();
                }
            });
            C23744a.m124114c().m124116d(5116, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public void m80183BM() {
        GroupInvitationInfo groupInvitationInfo;
        try {
            if (m92662fJ() != null && (groupInvitationInfo = this.f73807m1) != null && !TextUtils.isEmpty(groupInvitationInfo.m40894l().mo2478b())) {
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(this.f73807m1.m40894l().mo2478b(), C32002l4.m154264g(40)).m135743b(), 0, 1));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oM */
    private void m80191oM() {
        GroupInvitationRespondView groupInvitationRespondView = this.f73797c1;
        if (groupInvitationRespondView != null) {
            groupInvitationRespondView.m66186Y(this.f73807m1);
        }
    }

    /* renamed from: tM */
    private void m80192tM() {
        if (this.f73808n1) {
            this.f73791W0.setText(AbstractC8020f0.str_community_lobby_hint);
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invitation_box_community_info_title));
        }
        GroupInvitationRespondView groupInvitationRespondView = (GroupInvitationRespondView) ((ViewStub) this.f73784P0.findViewById(AbstractC6918a0.vt_invitation_respond_view)).inflate();
        this.f73797c1 = groupInvitationRespondView;
        if (groupInvitationRespondView != null) {
            groupInvitationRespondView.setOnEventListener(new C14360c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m80193vM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23184q2.m119464v(this.f72421L0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m80194wM(int i11, String str) {
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14367j());
        c0766k.mo1787ya(this.f73801g1, "14", "", "", i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m80195xM() {
        this.f73797c1.m66187g0(this.f73807m1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m80196yM() {
        try {
            m80197CM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
    }

    /* renamed from: CM */
    void m80197CM() {
        if (this.f73803i1.m153752c() == 0) {
            this.f73794Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_join_to_chat));
            return;
        }
        if (this.f73803i1.m153752c() == 1) {
            this.f73794Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_discover_joined));
            this.f73794Z0.setEnabled(false);
        } else if (this.f73803i1.m153752c() == 2) {
            this.f73794Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_discover_requested));
            this.f73794Z0.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return new C2913t1(this.f72421L0.getContext()).m13865e(new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.nk
                        @Override // bn.C2913t1.b
                        /* renamed from: a */
                        public final void mo13056a(int i13, String str) {
                            GroupLobbyView.this.m80194wM(i13, str);
                        }
                    }).m13862b(AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_group_confirm), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no)).m13861a();
                }
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                if (this.f73803i1.m153747Y()) {
                    i12 = AbstractC8020f0.str_dialog_message_join_over_max_groups_join_community;
                } else {
                    i12 = AbstractC8020f0.str_dialog_message_join_over_max_groups_join_group;
                }
                aVar.m43159h(4).m43162k(String.format(MainApplication.getAppContext().getResources().getString(i12), Integer.valueOf(C19637j.f97466a.m102831L()))).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_choose_group_to_leave), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.mk
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                        GroupLobbyView.this.m80193vM(interfaceC17463d, i13);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                m43152a.m92873y(true);
                return m43152a;
            }
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            aVar2.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_msg_join_discover_group)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_agree), this);
            return aVar2.m43152a();
        }
        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
        View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.custom_edittext_dialog_layout, (ViewGroup) null);
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_title);
        this.f73814t1 = (CustomEditText) inflate.findViewById(AbstractC6918a0.et_content);
        this.f73815u1 = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_no);
        this.f73816v1 = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_yes);
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_join_group_request_dialog_title));
        this.f73814t1.addTextChangedListener(new C14366i());
        this.f73814t1.setText("");
        int m118712h = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 24.0f);
        aVar3.m43150A(inflate, m118712h, AbstractC23136l9.m118712h(MainApplication.getAppContext(), 10.0f), m118712h, 0);
        aVar3.m43154c(false);
        this.f73815u1.setOnClickListener(this);
        this.f73816v1.setOnClickListener(this);
        C8009j m43152a2 = aVar3.m43152a();
        m43152a2.m92867k().m92890I(37);
        return m43152a2;
    }

    /* renamed from: DM */
    void m80198DM() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ok
            @Override // java.lang.Runnable
            public final void run() {
                GroupLobbyView.this.m80196yM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        ActionBarMenuItem actionBarMenuItem;
        super.mo37482FJ(actionBarMenu);
        if (this.f73809o1 == null) {
            this.f73809o1 = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC19182e.abc_ic_menu_overflow_material);
        }
        if (this.f73810p1 == null && (actionBarMenuItem = this.f73809o1) != null) {
            this.f73810p1 = actionBarMenuItem.m92774j(AbstractC23136l9.m118724l(actionBarMenu.getContext(), AbstractC6918a0.menu_feed_report_abuse, AbstractC8020f0.str_reportabuse));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_discover_detail_layout, viewGroup, false);
        this.f73784P0 = inflate;
        this.f73787S0 = (ScrollView) inflate.findViewById(AbstractC6918a0.main_scroll_view);
        this.f73788T0 = (GroupAvatarView) this.f73784P0.findViewById(AbstractC6918a0.group_cover);
        this.f73789U0 = (RobotoTextView) this.f73784P0.findViewById(AbstractC6918a0.tv_group_name);
        this.f73790V0 = (RobotoTextView) this.f73784P0.findViewById(AbstractC6918a0.tv_creator);
        this.f73791W0 = (RobotoTextView) this.f73784P0.findViewById(AbstractC6918a0.tv_group_desc);
        this.f73792X0 = (RobotoTextView) this.f73784P0.findViewById(AbstractC6918a0.tv_member_total);
        this.f73793Y0 = (RobotoTextView) this.f73784P0.findViewById(AbstractC6918a0.tv_suggest_members);
        this.f73795a1 = (GroupHorizontalAvatarView) this.f73784P0.findViewById(AbstractC6918a0.group_avatar);
        RobotoTextView robotoTextView = (RobotoTextView) this.f73784P0.findViewById(AbstractC6918a0.btn_join_group);
        this.f73794Z0 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        Context context = this.f72421L0.getContext();
        this.f73786R0 = context;
        this.f73785Q0 = new C23528a(context);
        MultiStateView multiStateView = (MultiStateView) this.f73784P0.findViewById(AbstractC6918a0.multi_state);
        this.f73796b1 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.kk
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GroupLobbyView.this.m80201qM();
            }
        });
        this.f73806l1.m106538e(new C14359b());
        return this.f73784P0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d.mo92862f() == 2 && i11 == -1) {
            interfaceC17463d.dismiss();
            m80205zM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("8022002");
        } else if (i11 == AbstractC6918a0.menu_delete) {
            m80203sM();
        } else if (i11 == AbstractC6918a0.menu_feed_report_abuse) {
            this.f72421L0.showDialog(4);
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.group_link_lobby_title));
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C2804c.f11236a.m13558J(this.f73817w1);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C2804c.f11236a.m13561N(this.f73817w1);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupLobbyView";
    }

    /* renamed from: nM */
    public void m80199nM() {
        int i11;
        try {
            if (this.f73808n1) {
                this.f73791W0.setText(AbstractC8020f0.str_community_lobby_hint);
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invitation_box_community_info_title));
            }
            this.f73788T0.m75734f(this.f73803i1);
            this.f73789U0.setText(this.f73803i1.m153793y());
            if (this.f73803i1.m153750a0()) {
                Drawable m118665N = AbstractC23136l9.m118665N(this.f73786R0, AbstractC16803z.ic_e2ee_tab_msg);
                if (m118665N != null) {
                    int i12 = AbstractC23222t7.f112594x;
                    m118665N.setBounds(0, 0, i12, i12);
                    this.f73789U0.setCompoundDrawablePadding(AbstractC23222t7.f112566j);
                    this.f73789U0.setCompoundDrawables(m118665N, null, null, null);
                }
            } else {
                this.f73789U0.setCompoundDrawables(null, null, null, null);
            }
            if (this.f73800f1 && (!this.f73807m1.m40887e().equals(this.f73803i1.m153793y()) || !this.f73807m1.m40883a().equals(this.f73803i1.m153756e()))) {
                C2804c.f11236a.m13562O(this.f73807m1, this.f73803i1.m153793y(), this.f73803i1.m153756e());
            }
            m80200pM();
            ContactProfile m118084d = AbstractC23028c0.m118084d(this.f73803i1.m153758f());
            if (m118084d != null) {
                if (AbstractC30201b.m148949b(this.f73803i1, m118084d)) {
                    Drawable m139658a = C27280g.m139658a(m92689tK(), AbstractC23322a.zds_oic_oa_star_check_color_24);
                    if (m139658a != null) {
                        int i13 = AbstractC23222t7.f112586t;
                        m139658a.setBounds(0, 0, i13, i13);
                        this.f73790V0.setCompoundDrawablePadding(AbstractC23222t7.f112556e);
                        this.f73790V0.setCompoundDrawables(null, null, m139658a, null);
                    }
                } else {
                    this.f73790V0.setCompoundDrawables(null, null, null, null);
                }
                StringBuilder sb2 = new StringBuilder();
                Context context = this.f73790V0.getContext();
                if (this.f73803i1.m153747Y()) {
                    i11 = AbstractC8020f0.str_community_of;
                } else {
                    i11 = AbstractC8020f0.str_group_of;
                }
                sb2.append(context.getString(i11));
                sb2.append(" ");
                int length = sb2.length();
                sb2.append(AbstractC23028c0.m118085e(m118084d, true, AbstractC8020f0.str_me));
                int length2 = sb2.length();
                SpannableString spannableString = new SpannableString(sb2);
                spannableString.setSpan(new StyleSpan(1), length, length2, 33);
                spannableString.setSpan(new C14363f(), length, length2, 33);
                this.f73790V0.setText(spannableString);
                this.f73790V0.setOnTouchListener(new ViewOnTouchListenerC11852c(spannableString));
                this.f73790V0.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
            }
            this.f73792X0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_chat_info_participant_header, Integer.valueOf(this.f73803i1.m153732O())));
            this.f73793Y0.setVisibility(8);
            ArrayList arrayList = new ArrayList(this.f73803i1.m153767k());
            if (!arrayList.isEmpty()) {
                ArrayList m102802D = C19637j.m102802D(this.f73803i1, 5);
                ArrayList m80202rM = m80202rM(arrayList, m102802D);
                HashSet m102826G = C19637j.f97466a.m102826G();
                ArrayList arrayList2 = new ArrayList(5);
                Iterator it = m80202rM.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    ContactProfile m118084d2 = AbstractC23028c0.m118084d(str);
                    if (m118084d2 != null) {
                        m118084d2.f42338F1 = m102826G.contains(str) ? 1 : 0;
                        arrayList2.add(m118084d2);
                    }
                }
                this.f73795a1.m75737a(arrayList2, this.f73803i1.m153732O());
                if (m102802D.size() > 0) {
                    this.f73793Y0.setVisibility(0);
                }
                StringBuilder sb3 = new StringBuilder();
                int i14 = 0;
                for (int i15 = 0; i15 < m102802D.size() && i14 < 2; i15++) {
                    ContactProfile m118084d3 = AbstractC23028c0.m118084d((String) m102802D.get(i15));
                    if (m118084d3 != null) {
                        if (i14 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(AbstractC21935u.m114542i(m118084d3.f42434r, m118084d3.m40383Q(true, false)));
                        i14++;
                    }
                }
                if (m102802D.size() > 2) {
                    sb3.append(" ");
                    sb3.append(AbstractC23136l9.m118746s0(AbstractC8020f0.str_num_your_friends, Integer.valueOf(m102802D.size() - 2)));
                }
                sb3.append(" ");
                sb3.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_are_joinning));
                this.f73793Y0.setText(sb3.toString());
            }
            m80197CM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1 && i12 == -1) {
            try {
                C31973j5 c31973j5 = this.f73803i1;
                if (c31973j5 != null) {
                    c31973j5.m153706A0(2);
                    m80197CM();
                    m80182AM();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_join_group) {
            AbstractC23647d.m123897g("8022001");
            if (this.f73803i1 != null) {
                m80205zM();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_yes) {
            CustomEditText customEditText = this.f73814t1;
            if (customEditText != null) {
                AbstractC2379w.m12430d(customEditText);
                String trim = this.f73814t1.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    this.f72421L0.removeDialog(1);
                    m80204uM(trim);
                    this.f73814t1 = null;
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_no) {
            CustomEditText customEditText2 = this.f73814t1;
            if (customEditText2 != null) {
                AbstractC2379w.m12430d(customEditText2);
            }
            this.f72421L0.removeDialog(1);
            this.f73814t1 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("8022002");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: pM */
    void m80200pM() {
        String m153765j = this.f73803i1.m153765j();
        if (!TextUtils.isEmpty(m153765j)) {
            String m119456n = AbstractC23184q2.m119456n(this.f73803i1.m153765j());
            if (this.f73813s1 && !TextUtils.isEmpty(m119456n)) {
                m153765j = m119456n;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(m153765j));
            try {
                C31944h6.m153538d(spannableStringBuilder, 15, C31884d6.m153209a());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (this.f73813s1 && !TextUtils.isEmpty(m119456n)) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) m118743r0);
                spannableStringBuilder.setSpan(new C14364g(), length, spannableStringBuilder.length(), 33);
            }
            this.f73791W0.setText(spannableStringBuilder);
            this.f73791W0.setMovementMethod(this.f73806l1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qM */
    public void m80201qM() {
        if (!TextUtils.isEmpty(this.f73801g1) && !this.f73812r1) {
            this.f73812r1 = true;
            MultiStateView multiStateView = this.f73796b1;
            if (multiStateView != null) {
                multiStateView.setVisibility(0);
                this.f73796b1.setState(MultiStateView.EnumC15914e.LOADING);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14362e());
            c0766k.mo1761v9(this.f73802h1, 50, this.f73801g1);
        }
    }

    /* renamed from: rM */
    ArrayList m80202rM(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        HashSet m102826G = C19637j.f97466a.m102826G();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (arrayList3.size() >= 5) {
                break;
            }
            if (m102826G.contains(str) && AbstractC23028c0.m118084d(str) != null) {
                arrayList3.add(str);
                hashSet.add(str);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (arrayList3.size() >= 5) {
                break;
            }
            if (!hashSet.contains(str2) && AbstractC23028c0.m118084d(str2) != null) {
                arrayList3.add(str2);
                hashSet.add(str2);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            if (arrayList3.size() >= 5) {
                break;
            }
            if (!hashSet.contains(str3) && AbstractC23028c0.m118084d(str3) != null) {
                arrayList3.add(str3);
            }
        }
        return arrayList3;
    }

    /* renamed from: sM */
    void m80203sM() {
        if (this.f73811q1) {
            return;
        }
        this.f73811q1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14361d());
        c0766k.mo1696n8(this.f73801g1, this.f73803i1.m153711D());
    }

    /* renamed from: uM */
    void m80204uM(String str) {
        if (this.f73799e1) {
            return;
        }
        this.f73799e1 = true;
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14365h());
        c0766k.mo1445H7(this.f73801g1, str, this.f73804j1, this.f73803i1.m153711D(), this.f73805k1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f73801g1 = m92642L3.getString("extra_group_id", "");
            this.f73804j1 = m92642L3.getInt("INT_EXTRA_JOIN_SOURCE", 1);
            this.f73800f1 = m92642L3.getBoolean("EXTRA_FROM_INVITATION_BOX", false);
            this.f73805k1 = m92642L3.getString("EXTRA_GROUP_LINK", "");
            this.f73807m1 = (GroupInvitationInfo) m92642L3.getParcelable("EXTRA_GROUP_INVITATION_INFO");
            this.f73808n1 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY");
            if (!TextUtils.isEmpty(this.f73801g1)) {
                m80201qM();
            }
            this.f72421L0.invalidateOptionsMenu();
            if (this.f73800f1) {
                AbstractC23136l9.m118744r1(this.f73794Z0, 8);
                m80192tM();
                m80191oM();
            } else {
                if (this.f73808n1) {
                    this.f73791W0.setText(AbstractC8020f0.str_community_lobby_hint);
                    this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invitation_box_community_info_title));
                }
                AbstractC23136l9.m118744r1(this.f73794Z0, 0);
            }
        }
    }

    /* renamed from: zM */
    void m80205zM() {
        C31973j5 c31973j5 = this.f73803i1;
        if (c31973j5 == null) {
            return;
        }
        if (c31973j5.m153755d0() && !TextUtils.isEmpty(this.f73803i1.m153785t())) {
            AbstractC23211s7.m119593z(this.f72421L0.m92676n2(), this.f73803i1, this.f73804j1, 1, this.f73805k1);
        } else {
            m80204uM("");
        }
    }
}
