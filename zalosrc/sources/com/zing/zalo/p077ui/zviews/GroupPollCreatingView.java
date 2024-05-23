package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import ag0.C0815e1;
import ag0.C0856z;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7071g2;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.zviews.ChooseTimeSettingPollBottomView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C18005u0;
import ed0.AbstractC18391a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.C20218v;
import p348mi.AbstractC23304d;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p459qs.C25490c;
import p495rx.C25994h;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p649xl.C29832h4;
import p716zh.C31961i8;
import p716zh.C31973j5;
import p716zh.C31988k5;
import qm0.AbstractC25368s;
import sa0.C26203c;
import sa0.C26209i;
import sa0.EnumC26201a;
import vg.AbstractC28025b8;
import vg.C28176r6;
import vg.C28212v6;

/* loaded from: classes6.dex */
public final class GroupPollCreatingView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c {
    public static final C14388a Companion = new C14388a(null);

    /* renamed from: Q0 */
    private C29832h4 f73941Q0;

    /* renamed from: R0 */
    private boolean f73942R0;

    /* renamed from: S0 */
    private C7071g2 f73943S0;

    /* renamed from: U0 */
    private boolean f73945U0;

    /* renamed from: V0 */
    private boolean f73946V0;

    /* renamed from: W0 */
    private String f73947W0;

    /* renamed from: X0 */
    private String f73948X0;

    /* renamed from: Y0 */
    private boolean f73949Y0;

    /* renamed from: Z0 */
    private long f73950Z0;

    /* renamed from: c1 */
    private boolean f73953c1;

    /* renamed from: d1 */
    private boolean f73954d1;

    /* renamed from: f1 */
    private int f73956f1;

    /* renamed from: j1 */
    private C31961i8 f73960j1;

    /* renamed from: k1 */
    private C13306b f73961k1;

    /* renamed from: P0 */
    private final String f73940P0 = "GroupPollCreatingView";

    /* renamed from: T0 */
    private String f73944T0 = "";

    /* renamed from: a1 */
    private boolean f73951a1 = true;

    /* renamed from: b1 */
    private boolean f73952b1 = true;

    /* renamed from: e1 */
    private boolean f73955e1 = true;

    /* renamed from: g1 */
    private String f73957g1 = "";

    /* renamed from: h1 */
    private String f73958h1 = "";

    /* renamed from: i1 */
    private String f73959i1 = "0";

    /* renamed from: l1 */
    private final C13306b.c f73962l1 = new C14391d();

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$a */
    /* loaded from: classes6.dex */
    public static final class C14388a {
        private C14388a() {
        }

        public /* synthetic */ C14388a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC14389b implements Runnable {
        public RunnableC14389b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GroupPollCreatingView.this.m80315MM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$c */
    /* loaded from: classes6.dex */
    public static final class C14390c implements InterfaceC20094a {
        C14390c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str;
            if (c20096c != null) {
                str = c20096c.m104492d();
            } else {
                str = "";
            }
            if (str != null && !TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            GroupPollCreatingView.this.mo59032jx(AbstractC8020f0.str_msg_pin_successfully);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$d */
    /* loaded from: classes6.dex */
    public static final class C14391d extends C13306b.c {
        C14391d() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            AbstractC19074t.m100208f(c28212v6, "notiInfo");
            if (AbstractC19074t.m100204b(c28212v6.f131577c, "tip.poll_creating.advanced_options")) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            AbstractC19074t.m100208f(str, "tipCat");
            AbstractC19074t.m100208f(c28212v6, "notiInfo");
            AbstractC19074t.m100208f(c26203c, "showcaseConfigs");
            if (AbstractC19074t.m100204b(str, "tip.poll_creating.advanced_options")) {
                Context context = GroupPollCreatingView.this.getContext();
                AbstractC19074t.m100205c(context);
                c26203c.f124510a = AbstractC23136l9.m118641B(context, AbstractC16801x.black_60);
                c26203c.f124530u = EnumC26201a.RECTANGLE;
                c26203c.f124513d = AbstractC23136l9.m118742r(4.0f);
                c26203c.f124519j = 8388627;
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            String[] strArr = AbstractC28025b8.f130828E;
            AbstractC19074t.m100207e(strArr, "ARR_POLL_CREATING_VIEW_TIPS");
            return strArr;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            Rect m80309GM;
            AbstractC19074t.m100208f(str, "tipCat");
            C29832h4 c29832h4 = null;
            if (AbstractC19074t.m100204b(str, "tip.poll_creating.advanced_options")) {
                C29832h4 c29832h42 = GroupPollCreatingView.this.f73941Q0;
                if (c29832h42 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h42 = null;
                }
                if (c29832h42.f137978q.getVisibility() == 0 && (m80309GM = GroupPollCreatingView.this.m80309GM()) != null) {
                    C29832h4 c29832h43 = GroupPollCreatingView.this.f73941Q0;
                    if (c29832h43 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29832h4 = c29832h43;
                    }
                    C26209i c26209i = new C26209i(c29832h4.f137978q);
                    c26209i.f124547b = m80309GM;
                    return c26209i;
                }
                return null;
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (GroupPollCreatingView.this.f72421L0.m92672lJ() && GroupPollCreatingView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: m */
        public void mo66905m(ShowcaseView showcaseView, C28212v6 c28212v6) {
            String str;
            if (c28212v6 != null) {
                str = c28212v6.f131577c;
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, "tip.poll_creating.advanced_options")) {
                C0815e1.m2075D().m2100V(new C23648e(6, GroupPollCreatingView.this.f73958h1, 1, "gr_poll_view_promotion_tip", GroupPollCreatingView.this.f73959i1), false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$e */
    /* loaded from: classes6.dex */
    public static final class RunnableC14392e implements Runnable {

        /* renamed from: q */
        final /* synthetic */ int f73967q;

        public RunnableC14392e(int i11) {
            this.f73967q = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
            C29832h4 c29832h42 = null;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            int y11 = (int) c29832h4.f137979r.getY();
            C29832h4 c29832h43 = GroupPollCreatingView.this.f73941Q0;
            if (c29832h43 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h42 = c29832h43;
            }
            c29832h42.f137974L.scrollBy(0, y11 - this.f73967q);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$f */
    /* loaded from: classes6.dex */
    public static final class C14393f implements KeyboardFrameLayout.InterfaceC13508a {
        C14393f() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
                C29832h4 c29832h42 = null;
                if (c29832h4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h4 = null;
                }
                c29832h4.f137984w.requestFocus();
                C29832h4 c29832h43 = GroupPollCreatingView.this.f73941Q0;
                if (c29832h43 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29832h42 = c29832h43;
                }
                c29832h42.f137984w.setCursorVisible(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            try {
                C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
                if (c29832h4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h4 = null;
                }
                c29832h4.f137984w.setCursorVisible(true);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$g */
    /* loaded from: classes6.dex */
    public static final class RunnableC14394g implements Runnable {
        public RunnableC14394g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            c29832h4.f137986y.requestLayout();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$h */
    /* loaded from: classes6.dex */
    public static final class C14395h extends ZdsActionBar.AbstractC16987c {
        C14395h() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC23647d.m123897g("10010003");
            C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            AbstractC2379w.m12430d(c29832h4.f137984w);
            GroupPollCreatingView.this.m80312JM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$i */
    /* loaded from: classes6.dex */
    public static final class RunnableC14396i implements Runnable {

        /* renamed from: q */
        final /* synthetic */ ArrayList f73972q;

        public RunnableC14396i(ArrayList arrayList) {
            this.f73972q = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7071g2 c7071g2 = GroupPollCreatingView.this.f73943S0;
            if (c7071g2 != null) {
                c7071g2.m36084b(this.f73972q);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$j */
    /* loaded from: classes6.dex */
    public static final class C14397j implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$j$a */
        /* loaded from: classes6.dex */
        public static final class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ GroupPollCreatingView f73974p;

            public a(GroupPollCreatingView groupPollCreatingView) {
                this.f73974p = groupPollCreatingView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f73974p.showDialog(3);
            }
        }

        C14397j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                GroupPollCreatingView.this.mo78960q3();
                GroupPollCreatingView.this.f73945U0 = false;
                if (c20096c.m104491c() == -17206) {
                    GroupPollCreatingView groupPollCreatingView = GroupPollCreatingView.this;
                    groupPollCreatingView.mo70710wy(new a(groupPollCreatingView));
                } else {
                    String m104492d = c20096c.m104492d();
                    AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            int m127178g0;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                GroupPollCreatingView.this.mo78960q3();
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                    C31961i8 c31961i8 = new C31961i8(optJSONObject);
                    C28176r6.m141702d().m141711l(c31961i8);
                    String m153669g = c31961i8.m153669g();
                    AbstractC19074t.m100207e(m153669g, "getTrimQuestion(...)");
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m92652XI = GroupPollCreatingView.this.m92652XI(AbstractC8020f0.str_msg_info_create_poll);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    String format = String.format(m92652XI, Arrays.copyOf(new Object[]{GroupPollCreatingView.this.m92652XI(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne), m153669g}, 2));
                    AbstractC19074t.m100207e(format, "format(...)");
                    C7907e c7907e = new C7907e();
                    m127178g0 = AbstractC24342w.m127178g0(format, m153669g, 0, false, 6, null);
                    c7907e.m40852b(new C7907e.a(m127178g0, m153669g.length()));
                    C18005u0.a m95729k = new C18005u0.a().m95727i(9).m95725g(c7907e).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i8.f146880a), GroupPollCreatingView.this.m92652XI(AbstractC8020f0.str_view)).m95729k(c31961i8.f146880a, c31961i8.f146895p);
                    AbstractC19074t.m100207e(m95729k, "setPoll(...)");
                    AbstractC19646n0.m102983h1(format, m95729k.m95722d("create"), C0943w.f3447a.m4472f(GroupPollCreatingView.this.f73944T0), -1L);
                    C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
                    if (c29832h4 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h4 = null;
                    }
                    AbstractC2379w.m12430d(c29832h4.f137984w);
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    c31961i8.f146886g = contactProfile.f42446v;
                    c31961i8.f146885f = contactProfile.f42437s;
                    C31988k5 m132060f = C25490c.m132054j().m132060f(c31961i8);
                    AbstractC19074t.m100207e(m132060f, "cachePoll(...)");
                    C23744a.Companion.m124119a().m124116d(68, m132060f.m154218b());
                    C25490c.m132054j().m132055a(GroupPollCreatingView.this.f73944T0, m132060f.m154218b());
                    Intent intent = new Intent();
                    intent.putExtra("extra_poll_info_json", c31961i8.m153673k().toString());
                    GroupPollCreatingView.this.mo50035CK(-1, intent);
                    GroupPollCreatingView.this.finish();
                    GroupPollCreatingView.this.f73960j1 = c31961i8;
                    GroupPollCreatingView.this.m80307DM();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$k */
    /* loaded from: classes6.dex */
    public static final class C14398k extends AbstractC18391a {
        C14398k() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, "editable");
            try {
                C28652r.m143349v().m143361W(editable);
                GroupPollCreatingView.this.m80347FM();
                C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
                C29832h4 c29832h42 = null;
                if (c29832h4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h4 = null;
                }
                Editable text = c29832h4.f137984w.getText();
                AbstractC19074t.m100205c(text);
                if (text.length() > 120) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m92652XI = GroupPollCreatingView.this.m92652XI(AbstractC8020f0.str_poll_max_chars_input);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    String format = String.format(m92652XI, Arrays.copyOf(new Object[]{120}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    ToastUtils.showMess(format);
                    C29832h4 c29832h43 = GroupPollCreatingView.this.f73941Q0;
                    if (c29832h43 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h43 = null;
                    }
                    String valueOf = String.valueOf(c29832h43.f137984w.getText());
                    C29832h4 c29832h44 = GroupPollCreatingView.this.f73941Q0;
                    if (c29832h44 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h44 = null;
                    }
                    CustomEditText customEditText = c29832h44.f137984w;
                    String substring = valueOf.substring(0, 120);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    customEditText.setText(substring);
                    C29832h4 c29832h45 = GroupPollCreatingView.this.f73941Q0;
                    if (c29832h45 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29832h42 = c29832h45;
                    }
                    c29832h42.f137984w.setSelection(120);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$l */
    /* loaded from: classes6.dex */
    public static final class C14399l extends EditTextWithContextMenu.AbstractC13498a {
        C14399l() {
        }

        @Override // com.zing.zalo.p077ui.widget.EditTextWithContextMenu.AbstractC13498a
        /* renamed from: a */
        public void mo36093a() {
            String m127114D;
            String m127114D2;
            int i11;
            boolean z11;
            C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
            C29832h4 c29832h42 = null;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            m127114D = AbstractC24341v.m127114D(String.valueOf(c29832h4.f137984w.getText()), "\r\n", " ", false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "\n", " ", false, 4, null);
            int length = m127114D2.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(m127114D2.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = m127114D2.subSequence(i12, length + 1).toString();
            C29832h4 c29832h43 = GroupPollCreatingView.this.f73941Q0;
            if (c29832h43 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h43 = null;
            }
            c29832h43.f137984w.setText(obj);
            C29832h4 c29832h44 = GroupPollCreatingView.this.f73941Q0;
            if (c29832h44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h42 = c29832h44;
            }
            c29832h42.f137984w.setSelection(obj.length());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollCreatingView$m */
    /* loaded from: classes6.dex */
    public static final class C14400m implements C7071g2.b {
        C14400m() {
        }

        @Override // com.zing.zalo.adapters.C7071g2.b
        /* renamed from: a */
        public void mo36094a() {
            C29832h4 c29832h4 = GroupPollCreatingView.this.f73941Q0;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            AbstractC2379w.m12430d(c29832h4.f137984w);
        }

        @Override // com.zing.zalo.adapters.C7071g2.b
        /* renamed from: b */
        public void mo36095b() {
            GroupPollCreatingView.this.m80347FM();
        }

        @Override // com.zing.zalo.adapters.C7071g2.b
        /* renamed from: c */
        public void mo36096c() {
            GroupPollCreatingView.this.m80347FM();
        }
    }

    /* renamed from: BM */
    private final boolean m80305BM() {
        if (TextUtils.isEmpty(this.f73944T0)) {
            return false;
        }
        C31973j5 m4472f = C0943w.f3447a.m4472f(this.f73944T0);
        if (m4472f != null && (m4472f.m153742T() || !m4472f.m153763h0())) {
            return true;
        }
        ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_permission_to_change_pin_board_after_create_poll));
        return false;
    }

    /* renamed from: CM */
    private final boolean m80306CM() {
        C25994h c25994h = C25994h.f124017a;
        String str = this.f73944T0;
        AbstractC19074t.m100205c(str);
        if (c25994h.m133919h("group_" + str).m133973z()) {
            mo70710wy(new RunnableC14389b());
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final void m80307DM() {
        if (this.f73960j1 != null && this.f73946V0 && m80305BM() && m80306CM()) {
            C0856z m2416b = C0856z.Companion.m2416b();
            String str = this.f73944T0;
            C31961i8 c31961i8 = this.f73960j1;
            AbstractC19074t.m100205c(c31961i8);
            m2416b.m2408t(str, c31961i8.f146880a, new C14390c());
        }
    }

    /* renamed from: EM */
    private final void m80308EM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("ChooseTimeSettingPollBottomView");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public final Rect m80309GM() {
        int m116584g;
        int m116584g2;
        int m116580c;
        int m116580c2;
        C29832h4 c29832h4 = this.f73941Q0;
        C29832h4 c29832h42 = null;
        if (c29832h4 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h4 = null;
        }
        LinearLayout linearLayout = c29832h4.f137967E;
        AbstractC19074t.m100207e(linearLayout, "settingAnonymous");
        if (linearLayout.getVisibility() == 0) {
            C29832h4 c29832h43 = this.f73941Q0;
            if (c29832h43 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h43 = null;
            }
            if (c29832h43.f137967E.getWidth() > 0) {
                C29832h4 c29832h44 = this.f73941Q0;
                if (c29832h44 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h44 = null;
                }
                if (c29832h44.f137967E.getHeight() > 0) {
                    C29832h4 c29832h45 = this.f73941Q0;
                    if (c29832h45 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h45 = null;
                    }
                    LinearLayout linearLayout2 = c29832h45.f137970H;
                    AbstractC19074t.m100207e(linearLayout2, "settingHideVotePreview");
                    if (linearLayout2.getVisibility() == 0) {
                        C29832h4 c29832h46 = this.f73941Q0;
                        if (c29832h46 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29832h46 = null;
                        }
                        if (c29832h46.f137970H.getWidth() > 0) {
                            C29832h4 c29832h47 = this.f73941Q0;
                            if (c29832h47 == null) {
                                AbstractC19074t.m100223u("binding");
                                c29832h47 = null;
                            }
                            if (c29832h47.f137970H.getHeight() > 0) {
                                Rect rect = new Rect();
                                C29832h4 c29832h48 = this.f73941Q0;
                                if (c29832h48 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29832h48 = null;
                                }
                                int left = c29832h48.f137967E.getLeft();
                                C29832h4 c29832h49 = this.f73941Q0;
                                if (c29832h49 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29832h49 = null;
                                }
                                m116584g = AbstractC22543l.m116584g(left, c29832h49.f137970H.getLeft());
                                rect.left = m116584g;
                                C29832h4 c29832h410 = this.f73941Q0;
                                if (c29832h410 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29832h410 = null;
                                }
                                int top = c29832h410.f137967E.getTop();
                                C29832h4 c29832h411 = this.f73941Q0;
                                if (c29832h411 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29832h411 = null;
                                }
                                m116584g2 = AbstractC22543l.m116584g(top, c29832h411.f137970H.getTop());
                                rect.top = m116584g2;
                                C29832h4 c29832h412 = this.f73941Q0;
                                if (c29832h412 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29832h412 = null;
                                }
                                int right = c29832h412.f137967E.getRight();
                                C29832h4 c29832h413 = this.f73941Q0;
                                if (c29832h413 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29832h413 = null;
                                }
                                m116580c = AbstractC22543l.m116580c(right, c29832h413.f137970H.getRight());
                                rect.right = m116580c;
                                C29832h4 c29832h414 = this.f73941Q0;
                                if (c29832h414 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29832h414 = null;
                                }
                                int bottom = c29832h414.f137967E.getBottom();
                                C29832h4 c29832h415 = this.f73941Q0;
                                if (c29832h415 == null) {
                                    AbstractC19074t.m100223u("binding");
                                } else {
                                    c29832h42 = c29832h415;
                                }
                                m116580c2 = AbstractC22543l.m116580c(bottom, c29832h42.f137970H.getBottom());
                                rect.bottom = m116580c2;
                                return rect;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m80310HM(GroupPollCreatingView groupPollCreatingView) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        C13306b c13306b = groupPollCreatingView.f73961k1;
        if (c13306b == null) {
            AbstractC19074t.m100223u("mShowcaseManager");
            c13306b = null;
        }
        c13306b.m74699e("tip.poll_creating.advanced_options");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m80311IM(GroupPollCreatingView groupPollCreatingView) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        C13306b c13306b = groupPollCreatingView.f73961k1;
        if (c13306b == null) {
            AbstractC19074t.m100223u("mShowcaseManager");
            c13306b = null;
        }
        c13306b.m74699e("tip.poll_creating.advanced_options");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final boolean m80312JM() {
        C7071g2 c7071g2;
        ArrayList m36088f;
        int i11;
        boolean z11;
        C29832h4 c29832h4 = this.f73941Q0;
        if (c29832h4 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h4 = null;
        }
        String valueOf = String.valueOf(c29832h4.f137984w.getText());
        int length = valueOf.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(valueOf.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else {
                if (!z11) {
                    break;
                }
                length--;
            }
        }
        if (valueOf.subSequence(i12, length + 1).toString().length() > 0 || ((c7071g2 = this.f73943S0) != null && (m36088f = c7071g2.m36088f()) != null && m36088f.size() > 0)) {
            removeDialog(1);
            showDialog(1);
            return true;
        }
        mo50035CK(0, null);
        finish();
        return false;
    }

    /* renamed from: KM */
    private final void m80313KM() {
        C29832h4 c29832h4 = this.f73941Q0;
        if (c29832h4 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h4 = null;
        }
        AbstractC2379w.m12430d(c29832h4.f137984w);
        m80316NM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m80314LM(GroupPollCreatingView groupPollCreatingView, View view) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        AbstractC23647d.m123897g("10010002");
        groupPollCreatingView.m80313KM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public final void m80315MM() {
        if (this.f73960j1 == null) {
            return;
        }
        C7904b c7904b = new C7904b(3);
        C31961i8 c31961i8 = this.f73960j1;
        AbstractC19074t.m100205c(c31961i8);
        c7904b.f42715C = c31961i8.f146880a;
        C31961i8 c31961i82 = this.f73960j1;
        AbstractC19074t.m100205c(c31961i82);
        String str = c31961i82.f146881b;
        c7904b.f42754z = str;
        c7904b.f42736h = str;
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", "group_" + this.f73944T0);
        bundle.putString("extra_group_topic_info_json", c7904b.m40780r().toString());
        bundle.putString("STR_SOURCE_START_VIEW", "gr_poll_create");
        m92693xK().m93069k2(UnpinTopicPinBoardView.class, bundle, 2, true);
    }

    /* renamed from: NM */
    private final void m80316NM() {
        String m127114D;
        String m127114D2;
        int i11;
        boolean z11;
        if (this.f73942R0) {
            if (this.f73945U0) {
                return;
            }
            this.f73945U0 = true;
            C29832h4 c29832h4 = this.f73941Q0;
            ArrayList arrayList = null;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            m127114D = AbstractC24341v.m127114D(String.valueOf(c29832h4.f137984w.getText()), "\r\n", " ", false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "\n", " ", false, 4, null);
            int length = m127114D2.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(m127114D2.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = m127114D2.subSequence(i12, length + 1).toString();
            if (TextUtils.isEmpty(this.f73944T0)) {
                this.f73945U0 = false;
                C29832h4 c29832h42 = this.f73941Q0;
                if (c29832h42 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h42 = null;
                }
                AbstractC2379w.m12430d(c29832h42.f137984w);
                C31961i8 c31961i8 = new C31961i8();
                c31961i8.f146881b = obj;
                C7071g2 c7071g2 = this.f73943S0;
                if (c7071g2 != null) {
                    arrayList = c7071g2.m36088f();
                }
                c31961i8.f146882c = new ArrayList();
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        c31961i8.f146882c.add(new C31961i8.a((String) arrayList.get(i13), 0, false));
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt("INT_EXTRA_SUGGEST_CONTENT_TYPE", 1);
                bundle.putString("extra_poll_info_json", c31961i8.m153673k().toString());
                bundle.putBoolean("BOL_EXTRA_NEED_PIN", this.f73946V0);
                bundle.putBoolean("BOL_EXTRA_IS_MULTI_CHOICE_POLL", this.f73951a1);
                bundle.putBoolean("BOL_EXTRA_IS_ADD_ANSWER_POLL", this.f73952b1);
                bundle.putBoolean("BOL_EXTRA_IS_ANONYMOUS_POLL", this.f73953c1);
                bundle.putBoolean("BOL_EXTRA_IS_HIDE_VOTE_PREVIEW_POLL", this.f73954d1);
                bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 2);
                bundle.putString("EXTRA_SUGGEST_ID", this.f73947W0);
                if (!TextUtils.isEmpty(this.f73948X0)) {
                    bundle.putString("extra_preload_data", this.f73948X0);
                }
                C17487o0 m92662fJ = this.f72421L0.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(QuickCreateGroupView.class, bundle, 1, true);
                    return;
                }
                return;
            }
            mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14397j());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("srcType", this.f73956f1);
                if (!TextUtils.isEmpty(this.f73957g1)) {
                    jSONObject.put("kwd", this.f73957g1);
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
            AbstractC20110a.f98889a.mo104554k(this.f73940P0 + ": " + jSONObject, new Object[0]);
            String jSONObject2 = jSONObject.toString();
            String str = this.f73944T0;
            C7071g2 c7071g22 = this.f73943S0;
            if (c7071g22 != null) {
                arrayList = c7071g22.m36088f();
            }
            c0766k.mo1513Q3(jSONObject2, str, obj, arrayList, false, this.f73950Z0, this.f73951a1, this.f73952b1, this.f73953c1, this.f73954d1);
            return;
        }
        if (C28176r6.m141702d().m141705f() > 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = m92652XI(AbstractC8020f0.str_poll_warning_input_question_and_answers);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(C28176r6.m141702d().m141705f())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            ToastUtils.showMess(format);
            return;
        }
        ToastUtils.showMess(m92652XI(AbstractC8020f0.str_poll_warning_input_question_require));
    }

    /* renamed from: OM */
    private final void m80317OM() {
        String str;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73944T0);
            if (m4472f == null || (str = m4472f.m153793y()) == null) {
                str = "";
            }
            m87077NK.setMiddleSubtitle(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final boolean m80318RM(GroupPollCreatingView groupPollCreatingView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        if (i11 != 5) {
            return false;
        }
        C7071g2 c7071g2 = groupPollCreatingView.f73943S0;
        if (c7071g2 != null) {
            c7071g2.m36085c(0);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public static final void m80319SM(GroupPollCreatingView groupPollCreatingView, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        groupPollCreatingView.f73951a1 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m80320TM(GroupPollCreatingView groupPollCreatingView, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        groupPollCreatingView.f73952b1 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m80321UM(GroupPollCreatingView groupPollCreatingView, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        groupPollCreatingView.f73953c1 = z11;
        if (z11) {
            C0815e1.m2075D().m2100V(new C23648e(6, groupPollCreatingView.f73958h1, 0, "gr_poll_on_hide_voters", groupPollCreatingView.f73959i1), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m80322VM(GroupPollCreatingView groupPollCreatingView, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        groupPollCreatingView.f73954d1 = z11;
        C29832h4 c29832h4 = null;
        if (z11) {
            groupPollCreatingView.f73955e1 = groupPollCreatingView.f73952b1;
            groupPollCreatingView.f73952b1 = false;
            C29832h4 c29832h42 = groupPollCreatingView.f73941Q0;
            if (c29832h42 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h42 = null;
            }
            c29832h42.f137966D.setAlpha(0.4f);
            C29832h4 c29832h43 = groupPollCreatingView.f73941Q0;
            if (c29832h43 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h43 = null;
            }
            c29832h43.f137965C.setChecked(groupPollCreatingView.f73952b1);
            C29832h4 c29832h44 = groupPollCreatingView.f73941Q0;
            if (c29832h44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h44;
            }
            c29832h4.f137965C.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.dm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupPollCreatingView.m80323WM(view);
                }
            });
            if (z11) {
                C0815e1.m2075D().m2100V(new C23648e(6, groupPollCreatingView.f73958h1, 0, "gr_poll_on_hide_preview", groupPollCreatingView.f73959i1), false);
                return;
            }
            return;
        }
        C29832h4 c29832h45 = groupPollCreatingView.f73941Q0;
        if (c29832h45 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h45 = null;
        }
        c29832h45.f137965C.setOnClickListener(null);
        C29832h4 c29832h46 = groupPollCreatingView.f73941Q0;
        if (c29832h46 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h46 = null;
        }
        c29832h46.f137966D.setAlpha(1.0f);
        C29832h4 c29832h47 = groupPollCreatingView.f73941Q0;
        if (c29832h47 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29832h4 = c29832h47;
        }
        c29832h4.f137965C.setChecked(groupPollCreatingView.f73955e1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public static final void m80323WM(View view) {
        ToastUtils.m89266n(AbstractC8020f0.str_poll_toast_suggest_off_hide_vote_preview, new Object[0]);
    }

    /* renamed from: XM */
    private final void m80324XM() {
        try {
            m80308EM();
            this.f72421L0.m92649TI().m93060e2(0, ChooseTimeSettingPollBottomView.m78829sL(this.f73950Z0, new ChooseTimeSettingPollBottomView.InterfaceC14161a() { // from class: com.zing.zalo.ui.zviews.cm
                @Override // com.zing.zalo.p077ui.zviews.ChooseTimeSettingPollBottomView.InterfaceC14161a
                /* renamed from: e */
                public final void mo78835e(long j11) {
                    GroupPollCreatingView.m80325YM(GroupPollCreatingView.this, j11);
                }
            }), "ChooseTimeSettingPollBottomView", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m80325YM(GroupPollCreatingView groupPollCreatingView, long j11) {
        AbstractC19074t.m100208f(groupPollCreatingView, "this$0");
        if (j11 != 0 && j11 <= System.currentTimeMillis()) {
            groupPollCreatingView.showDialog(3);
        } else {
            groupPollCreatingView.m80348PM(j11);
        }
    }

    /* renamed from: ZM */
    private final void m80326ZM() {
        C29832h4 c29832h4 = null;
        if (this.f73946V0) {
            C29832h4 c29832h42 = this.f73941Q0;
            if (c29832h42 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h42;
            }
            c29832h4.f137985x.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_icn_form_checkbox_round_checked));
            return;
        }
        C29832h4 c29832h43 = this.f73941Q0;
        if (c29832h43 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29832h4 = c29832h43;
        }
        c29832h4.f137985x.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_form_radio_unchecked));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C8009j m43152a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    m43152a = null;
                } else {
                    C8009j.a aVar = new C8009j.a(getContext());
                    aVar.m43172u(m92652XI(AbstractC8020f0.str_invalid_date_dialog_title)).m43159h(4).m43162k(m92652XI(AbstractC8020f0.str_msg_hint_choose_time_in_future)).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                    m43152a = aVar.m43152a();
                }
            } else {
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.getContext());
                aVar2.m43172u(m92652XI(AbstractC8020f0.confirm)).m43159h(4).m43162k(m92652XI(AbstractC8020f0.str_dialog_msg_replace_pin_new_poll)).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_pin_this_poll), this);
                m43152a = aVar2.m43152a();
            }
        } else {
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.getContext());
            aVar3.m43172u(m92652XI(AbstractC8020f0.confirm)).m43159h(4).m43162k(m92652XI(AbstractC8020f0.str_poll_ask_to_cancel_creating_poll)).m43165n(m92652XI(AbstractC8020f0.str_btn_dont_exit), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_exit), this);
            m43152a = aVar3.m43152a();
        }
        AbstractC19074t.m100205c(m43152a);
        return m43152a;
    }

    /* renamed from: FM */
    public final void m80347FM() {
        int i11;
        int i12;
        boolean z11;
        ArrayList m36088f;
        try {
            C7071g2 c7071g2 = this.f73943S0;
            boolean z12 = false;
            if (c7071g2 != null && (m36088f = c7071g2.m36088f()) != null) {
                i11 = m36088f.size();
            } else {
                i11 = 0;
            }
            Button button = null;
            if (i11 >= C28176r6.m141702d().m141705f()) {
                C29832h4 c29832h4 = this.f73941Q0;
                if (c29832h4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h4 = null;
                }
                String valueOf = String.valueOf(c29832h4.f137984w.getText());
                int length = valueOf.length() - 1;
                int i13 = 0;
                boolean z13 = false;
                while (i13 <= length) {
                    if (!z13) {
                        i12 = i13;
                    } else {
                        i12 = length;
                    }
                    if (AbstractC19074t.m100209g(valueOf.charAt(i12), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z13) {
                        if (!z11) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (!TextUtils.isEmpty(valueOf.subSequence(i13, length + 1).toString())) {
                    z12 = true;
                }
            }
            this.f73942R0 = z12;
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                button = m87077NK.getTrailingButton();
            }
            if (button != null) {
                button.setEnabled(this.f73942R0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29832h4 m148025c = C29832h4.m148025c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148025c, "inflate(...)");
        this.f73941Q0 = m148025c;
        C29832h4 c29832h4 = null;
        if (m148025c == null) {
            AbstractC19074t.m100223u("binding");
            m148025c = null;
        }
        m148025c.getRoot().setOnKeyboardListener(new C14393f());
        m80349QM();
        C29832h4 c29832h42 = this.f73941Q0;
        if (c29832h42 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29832h4 = c29832h42;
        }
        KeyboardFrameLayout root = c29832h4.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C13306b c13306b = this.f73961k1;
        if (c13306b == null) {
            AbstractC19074t.m100223u("mShowcaseManager");
            c13306b = null;
        }
        c13306b.m74701i();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 1) {
            if (mo92862f == 2 && i11 == -1) {
                interfaceC17463d.dismiss();
                m80307DM();
                return;
            }
            return;
        }
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            mo50035CK(0, null);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C14395h());
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.am
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupPollCreatingView.m80314LM(GroupPollCreatingView.this, view);
                }
            });
        }
        m80317OM();
        m80347FM();
    }

    /* renamed from: PM */
    public final void m80348PM(long j11) {
        this.f73950Z0 = j11;
        C29832h4 c29832h4 = null;
        if (j11 > 0) {
            C29832h4 c29832h42 = this.f73941Q0;
            if (c29832h42 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h42;
            }
            c29832h4.f137975M.setText(AbstractC23160o0.m119206M0(getContext(), j11));
            return;
        }
        C29832h4 c29832h43 = this.f73941Q0;
        if (c29832h43 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29832h4 = c29832h43;
        }
        c29832h4.f137975M.setText(m92652XI(AbstractC8020f0.str_poll_end_time_option_no_limit_subtitle));
    }

    /* renamed from: QM */
    public final void m80349QM() {
        InterfaceC27218a m92676n2 = m92676n2();
        C13306b c13306b = null;
        if (m92676n2 != null && m92676n2.getWindow() != null) {
            m92676n2.mo35554O(18);
            C29832h4 c29832h4 = this.f73941Q0;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            c29832h4.f137986y.setEnableMeasureKeyboard(false);
        }
        C29832h4 c29832h42 = this.f73941Q0;
        if (c29832h42 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h42 = null;
        }
        c29832h42.f137987z.setOnClickListener(this);
        C29832h4 c29832h43 = this.f73941Q0;
        if (c29832h43 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h43 = null;
        }
        c29832h43.f137987z.setVisibility(8);
        C29832h4 c29832h44 = this.f73941Q0;
        if (c29832h44 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h44 = null;
        }
        c29832h44.f137984w.setImeOptions(5);
        C29832h4 c29832h45 = this.f73941Q0;
        if (c29832h45 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h45 = null;
        }
        c29832h45.f137984w.setRawInputType(16384);
        C29832h4 c29832h46 = this.f73941Q0;
        if (c29832h46 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h46 = null;
        }
        c29832h46.f137984w.setForceHideClearBtn(true);
        C29832h4 c29832h47 = this.f73941Q0;
        if (c29832h47 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h47 = null;
        }
        c29832h47.f137984w.addTextChangedListener(new C14398k());
        C29832h4 c29832h48 = this.f73941Q0;
        if (c29832h48 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h48 = null;
        }
        c29832h48.f137984w.setTextContextChangeListener(new C14399l());
        C29832h4 c29832h49 = this.f73941Q0;
        if (c29832h49 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h49 = null;
        }
        c29832h49.f137984w.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.vl
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m80318RM;
                m80318RM = GroupPollCreatingView.m80318RM(GroupPollCreatingView.this, textView, i11, keyEvent);
                return m80318RM;
            }
        });
        C29832h4 c29832h410 = this.f73941Q0;
        if (c29832h410 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h410 = null;
        }
        c29832h410.f137984w.setOnClickListener(this);
        C29832h4 c29832h411 = this.f73941Q0;
        if (c29832h411 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h411 = null;
        }
        this.f73943S0 = new C7071g2(getContext(), C28176r6.m141702d().m141705f(), (ViewGroup) c29832h411.getRoot().findViewById(AbstractC6918a0.container_list_options), new C14400m());
        C29832h4 c29832h412 = this.f73941Q0;
        if (c29832h412 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h412 = null;
        }
        c29832h412.f137979r.setOnClickListener(this);
        C29832h4 c29832h413 = this.f73941Q0;
        if (c29832h413 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h413 = null;
        }
        c29832h413.f137980s.setOnClickListener(this);
        C29832h4 c29832h414 = this.f73941Q0;
        if (c29832h414 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h414 = null;
        }
        c29832h414.f137969G.setOnClickListener(this);
        C29832h4 c29832h415 = this.f73941Q0;
        if (c29832h415 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h415 = null;
        }
        c29832h415.f137972J.setOnClickListener(this);
        C29832h4 c29832h416 = this.f73941Q0;
        if (c29832h416 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h416 = null;
        }
        c29832h416.f137973K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.wl
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                GroupPollCreatingView.m80319SM(GroupPollCreatingView.this, compoundButton, z11);
            }
        });
        C29832h4 c29832h417 = this.f73941Q0;
        if (c29832h417 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h417 = null;
        }
        c29832h417.f137964B.setOnClickListener(this);
        C29832h4 c29832h418 = this.f73941Q0;
        if (c29832h418 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h418 = null;
        }
        c29832h418.f137965C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.xl
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                GroupPollCreatingView.m80320TM(GroupPollCreatingView.this, compoundButton, z11);
            }
        });
        C29832h4 c29832h419 = this.f73941Q0;
        if (c29832h419 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h419 = null;
        }
        c29832h419.f137967E.setOnClickListener(this);
        C29832h4 c29832h420 = this.f73941Q0;
        if (c29832h420 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h420 = null;
        }
        c29832h420.f137968F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.yl
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                GroupPollCreatingView.m80321UM(GroupPollCreatingView.this, compoundButton, z11);
            }
        });
        C29832h4 c29832h421 = this.f73941Q0;
        if (c29832h421 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h421 = null;
        }
        c29832h421.f137970H.setOnClickListener(this);
        C29832h4 c29832h422 = this.f73941Q0;
        if (c29832h422 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h422 = null;
        }
        c29832h422.f137971I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.zl
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                GroupPollCreatingView.m80322VM(GroupPollCreatingView.this, compoundButton, z11);
            }
        });
        m80347FM();
        C13306b c13306b2 = new C13306b(m92648SI());
        this.f73961k1 = c13306b2;
        C29832h4 c29832h423 = this.f73941Q0;
        if (c29832h423 == null) {
            AbstractC19074t.m100223u("binding");
            c29832h423 = null;
        }
        c13306b2.m74687C(c29832h423.f137981t);
        C13306b c13306b3 = this.f73961k1;
        if (c13306b3 == null) {
            AbstractC19074t.m100223u("mShowcaseManager");
        } else {
            c13306b = c13306b3;
        }
        c13306b.m74697c(this.f73962l1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f73961k1;
        if (c13306b == null) {
            AbstractC19074t.m100223u("mShowcaseManager");
            c13306b = null;
        }
        c13306b.m74709u();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        String m127114D;
        String m127114D2;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            C29832h4 c29832h4 = this.f73941Q0;
            ArrayList arrayList = null;
            if (c29832h4 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h4 = null;
            }
            m127114D = AbstractC24341v.m127114D(String.valueOf(c29832h4.f137984w.getText()), "\r\n", " ", false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "\n", " ", false, 4, null);
            int length = m127114D2.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(m127114D2.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            bundle.putString("questionSavedState", m127114D2.subSequence(i12, length + 1).toString());
            C7071g2 c7071g2 = this.f73943S0;
            if (c7071g2 != null) {
                arrayList = c7071g2.m36088f();
            }
            bundle.putStringArrayList("optionsAnswerSavedState", arrayList);
            bundle.putBoolean("isPinCheckedSavedState", this.f73946V0);
            bundle.putLong("endTimeSavedState", this.f73950Z0);
            bundle.putBoolean("isMultiChoiceSavedState", this.f73951a1);
            bundle.putBoolean("isAddAnswerSavedState", this.f73952b1);
            bundle.putBoolean("isAnonymousSavedState", this.f73953c1);
            bundle.putBoolean("isHideVotePreviewSavedState", this.f73954d1);
            bundle.putBoolean("isOpenAdvanceSavedState", this.f73949Y0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: TL */
    protected List mo78192TL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(27);
        return arrayList;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: aK */
    public void mo54160aK(Bundle bundle) {
        super.mo54160aK(bundle);
        if (bundle != null) {
            String string = bundle.getString("questionSavedState");
            C29832h4 c29832h4 = null;
            if (!TextUtils.isEmpty(string)) {
                C29832h4 c29832h42 = this.f73941Q0;
                if (c29832h42 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h42 = null;
                }
                c29832h42.f137984w.setText(string);
                C29832h4 c29832h43 = this.f73941Q0;
                if (c29832h43 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h43 = null;
                }
                c29832h43.f137984w.requestFocus();
                C29832h4 c29832h44 = this.f73941Q0;
                if (c29832h44 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h44 = null;
                }
                CustomEditText customEditText = c29832h44.f137984w;
                AbstractC19074t.m100205c(string);
                customEditText.setSelection(string.length());
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("optionsAnswerSavedState");
            if (stringArrayList != null && stringArrayList.size() > 0) {
                mo70710wy(new RunnableC14396i(stringArrayList));
            }
            if (bundle.containsKey("isPinCheckedSavedState")) {
                this.f73946V0 = bundle.getBoolean("isPinCheckedSavedState");
                m80326ZM();
            }
            if (bundle.containsKey("endTimeSavedState")) {
                long j11 = bundle.getLong("endTimeSavedState");
                this.f73950Z0 = j11;
                m80348PM(j11);
            }
            if (bundle.containsKey("isMultiChoiceSavedState")) {
                this.f73951a1 = bundle.getBoolean("isMultiChoiceSavedState");
                C29832h4 c29832h45 = this.f73941Q0;
                if (c29832h45 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h45 = null;
                }
                c29832h45.f137973K.setChecked(this.f73951a1);
            }
            if (bundle.containsKey("isAddAnswerSavedState")) {
                this.f73952b1 = bundle.getBoolean("isAddAnswerSavedState");
                C29832h4 c29832h46 = this.f73941Q0;
                if (c29832h46 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h46 = null;
                }
                c29832h46.f137965C.setChecked(this.f73952b1);
            }
            if (bundle.containsKey("isAnonymousSavedState")) {
                this.f73953c1 = bundle.getBoolean("isAnonymousSavedState");
                C29832h4 c29832h47 = this.f73941Q0;
                if (c29832h47 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h47 = null;
                }
                c29832h47.f137968F.setChecked(this.f73953c1);
            }
            if (bundle.containsKey("isHideVotePreviewSavedState")) {
                this.f73954d1 = bundle.getBoolean("isHideVotePreviewSavedState");
                C29832h4 c29832h48 = this.f73941Q0;
                if (c29832h48 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h48 = null;
                }
                c29832h48.f137971I.setChecked(this.f73954d1);
            }
            boolean z11 = bundle.getBoolean("isOpenAdvanceSavedState", false);
            this.f73949Y0 = z11;
            if (z11) {
                C29832h4 c29832h49 = this.f73941Q0;
                if (c29832h49 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h49 = null;
                }
                c29832h49.f137980s.setVisibility(8);
                C29832h4 c29832h410 = this.f73941Q0;
                if (c29832h410 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29832h4 = c29832h410;
                }
                c29832h4.f137978q.setVisibility(0);
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupPollCreatingView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.pin_checker_container) {
            this.f73946V0 = !this.f73946V0;
            m80326ZM();
            return;
        }
        C29832h4 c29832h4 = null;
        if (id2 == AbstractC6918a0.et_group_poll_question) {
            C29832h4 c29832h42 = this.f73941Q0;
            if (c29832h42 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h42;
            }
            AbstractC2379w.m12432f(c29832h4.f137984w);
            return;
        }
        if (id2 == AbstractC6918a0.btn_add_option) {
            AbstractC23647d.m123897g("10010004");
            C7071g2 c7071g2 = this.f73943S0;
            if (c7071g2 != null) {
                AbstractC19074t.m100205c(c7071g2);
                if (c7071g2.m36086d() < C28176r6.m141702d().m141704e()) {
                    C29832h4 c29832h43 = this.f73941Q0;
                    if (c29832h43 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29832h4 = c29832h43;
                    }
                    int y11 = (int) c29832h4.f137979r.getY();
                    C7071g2 c7071g22 = this.f73943S0;
                    if (c7071g22 != null) {
                        c7071g22.m36083a();
                    }
                    AbstractC19444a.m101695c(new RunnableC14392e(y11));
                    return;
                }
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = m92652XI(AbstractC8020f0.str_poll_max_options_input);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(C28176r6.m141702d().m141704e())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            ToastUtils.showMess(format);
            C29832h4 c29832h44 = this.f73941Q0;
            if (c29832h44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h44;
            }
            AbstractC2379w.m12430d(c29832h4.f137984w);
            return;
        }
        if (id2 == AbstractC6918a0.btn_advanced_settings) {
            C29832h4 c29832h45 = this.f73941Q0;
            if (c29832h45 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h45 = null;
            }
            c29832h45.f137980s.setVisibility(8);
            C29832h4 c29832h46 = this.f73941Q0;
            if (c29832h46 == null) {
                AbstractC19074t.m100223u("binding");
                c29832h46 = null;
            }
            c29832h46.f137978q.setVisibility(0);
            this.f73949Y0 = true;
            C29832h4 c29832h47 = this.f73941Q0;
            if (c29832h47 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h47;
            }
            AbstractC2379w.m12430d(c29832h4.f137984w);
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.ul
                @Override // java.lang.Runnable
                public final void run() {
                    GroupPollCreatingView.m80311IM(GroupPollCreatingView.this);
                }
            }, 1000L);
            return;
        }
        if (id2 == AbstractC6918a0.setting_choose_end_time) {
            C29832h4 c29832h48 = this.f73941Q0;
            if (c29832h48 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h48;
            }
            AbstractC2379w.m12430d(c29832h4.f137984w);
            m80324XM();
            return;
        }
        if (id2 == AbstractC6918a0.setting_multi_choice) {
            C29832h4 c29832h49 = this.f73941Q0;
            if (c29832h49 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h49;
            }
            c29832h4.f137973K.setChecked(!this.f73951a1);
            return;
        }
        if (id2 == AbstractC6918a0.setting_add_new_option) {
            if (this.f73954d1) {
                ToastUtils.m89266n(AbstractC8020f0.str_poll_toast_suggest_off_hide_vote_preview, new Object[0]);
                return;
            }
            C29832h4 c29832h410 = this.f73941Q0;
            if (c29832h410 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h410;
            }
            c29832h4.f137965C.setChecked(!this.f73952b1);
            return;
        }
        if (id2 == AbstractC6918a0.setting_anonymous) {
            C29832h4 c29832h411 = this.f73941Q0;
            if (c29832h411 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h411;
            }
            c29832h4.f137968F.setChecked(!this.f73953c1);
            return;
        }
        if (id2 == AbstractC6918a0.setting_hide_vote_preview) {
            C29832h4 c29832h412 = this.f73941Q0;
            if (c29832h412 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29832h4 = c29832h412;
            }
            c29832h4.f137971I.setChecked(!this.f73954d1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            m80312JM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            this.f72827B0.postDelayed(new RunnableC14394g(), 200L);
            C13306b c13306b = this.f73961k1;
            if (c13306b == null) {
                AbstractC19074t.m100223u("mShowcaseManager");
                c13306b = null;
            }
            c13306b.m74710v();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        List m131505m;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 27 && objArr.length >= 3) {
            if (AbstractC19074t.m100204b(objArr[0], this.f73944T0)) {
                Object obj = objArr[1];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) obj).intValue() == 4) {
                    Object obj2 = objArr[2];
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
                    String[] split = TextUtils.split((String) obj2, ";");
                    AbstractC19074t.m100207e(split, "split(...)");
                    m131505m = AbstractC25368s.m131505m(Arrays.copyOf(split, split.length));
                    ArrayList arrayList = new ArrayList(m131505m);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (TextUtils.equals((CharSequence) arrayList.get(i12), CoreUtility.f89233i)) {
                            finish();
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0062, B:10:0x0068, B:13:0x006f, B:15:0x0075, B:16:0x007d, B:17:0x0090, B:19:0x009f, B:20:0x00a3, B:22:0x00b6, B:23:0x00ba, B:25:0x00cd, B:26:0x00d1, B:28:0x00e4, B:29:0x00e8, B:31:0x0106, B:33:0x010a, B:34:0x010e, B:36:0x0117, B:37:0x011b, B:39:0x0124, B:40:0x0128, B:41:0x0134, B:43:0x013c, B:45:0x0142, B:47:0x0146, B:48:0x0149, B:50:0x014d, B:51:0x0151, B:52:0x0083, B:54:0x0087, B:55:0x008b, B:56:0x0156, B:58:0x0160, B:60:0x0166, B:61:0x016a, B:63:0x0173, B:64:0x0178, B:65:0x01a3, B:70:0x0186, B:72:0x018c, B:73:0x0190, B:75:0x0199, B:76:0x019e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0062, B:10:0x0068, B:13:0x006f, B:15:0x0075, B:16:0x007d, B:17:0x0090, B:19:0x009f, B:20:0x00a3, B:22:0x00b6, B:23:0x00ba, B:25:0x00cd, B:26:0x00d1, B:28:0x00e4, B:29:0x00e8, B:31:0x0106, B:33:0x010a, B:34:0x010e, B:36:0x0117, B:37:0x011b, B:39:0x0124, B:40:0x0128, B:41:0x0134, B:43:0x013c, B:45:0x0142, B:47:0x0146, B:48:0x0149, B:50:0x014d, B:51:0x0151, B:52:0x0083, B:54:0x0087, B:55:0x008b, B:56:0x0156, B:58:0x0160, B:60:0x0166, B:61:0x016a, B:63:0x0173, B:64:0x0178, B:65:0x01a3, B:70:0x0186, B:72:0x018c, B:73:0x0190, B:75:0x0199, B:76:0x019e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0062, B:10:0x0068, B:13:0x006f, B:15:0x0075, B:16:0x007d, B:17:0x0090, B:19:0x009f, B:20:0x00a3, B:22:0x00b6, B:23:0x00ba, B:25:0x00cd, B:26:0x00d1, B:28:0x00e4, B:29:0x00e8, B:31:0x0106, B:33:0x010a, B:34:0x010e, B:36:0x0117, B:37:0x011b, B:39:0x0124, B:40:0x0128, B:41:0x0134, B:43:0x013c, B:45:0x0142, B:47:0x0146, B:48:0x0149, B:50:0x014d, B:51:0x0151, B:52:0x0083, B:54:0x0087, B:55:0x008b, B:56:0x0156, B:58:0x0160, B:60:0x0166, B:61:0x016a, B:63:0x0173, B:64:0x0178, B:65:0x01a3, B:70:0x0186, B:72:0x018c, B:73:0x0190, B:75:0x0199, B:76:0x019e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0062, B:10:0x0068, B:13:0x006f, B:15:0x0075, B:16:0x007d, B:17:0x0090, B:19:0x009f, B:20:0x00a3, B:22:0x00b6, B:23:0x00ba, B:25:0x00cd, B:26:0x00d1, B:28:0x00e4, B:29:0x00e8, B:31:0x0106, B:33:0x010a, B:34:0x010e, B:36:0x0117, B:37:0x011b, B:39:0x0124, B:40:0x0128, B:41:0x0134, B:43:0x013c, B:45:0x0142, B:47:0x0146, B:48:0x0149, B:50:0x014d, B:51:0x0151, B:52:0x0083, B:54:0x0087, B:55:0x008b, B:56:0x0156, B:58:0x0160, B:60:0x0166, B:61:0x016a, B:63:0x0173, B:64:0x0178, B:65:0x01a3, B:70:0x0186, B:72:0x018c, B:73:0x0190, B:75:0x0199, B:76:0x019e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0062, B:10:0x0068, B:13:0x006f, B:15:0x0075, B:16:0x007d, B:17:0x0090, B:19:0x009f, B:20:0x00a3, B:22:0x00b6, B:23:0x00ba, B:25:0x00cd, B:26:0x00d1, B:28:0x00e4, B:29:0x00e8, B:31:0x0106, B:33:0x010a, B:34:0x010e, B:36:0x0117, B:37:0x011b, B:39:0x0124, B:40:0x0128, B:41:0x0134, B:43:0x013c, B:45:0x0142, B:47:0x0146, B:48:0x0149, B:50:0x014d, B:51:0x0151, B:52:0x0083, B:54:0x0087, B:55:0x008b, B:56:0x0156, B:58:0x0160, B:60:0x0166, B:61:0x016a, B:63:0x0173, B:64:0x0178, B:65:0x01a3, B:70:0x0186, B:72:0x018c, B:73:0x0190, B:75:0x0199, B:76:0x019e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0062, B:10:0x0068, B:13:0x006f, B:15:0x0075, B:16:0x007d, B:17:0x0090, B:19:0x009f, B:20:0x00a3, B:22:0x00b6, B:23:0x00ba, B:25:0x00cd, B:26:0x00d1, B:28:0x00e4, B:29:0x00e8, B:31:0x0106, B:33:0x010a, B:34:0x010e, B:36:0x0117, B:37:0x011b, B:39:0x0124, B:40:0x0128, B:41:0x0134, B:43:0x013c, B:45:0x0142, B:47:0x0146, B:48:0x0149, B:50:0x014d, B:51:0x0151, B:52:0x0083, B:54:0x0087, B:55:0x008b, B:56:0x0156, B:58:0x0160, B:60:0x0166, B:61:0x016a, B:63:0x0173, B:64:0x0178, B:65:0x01a3, B:70:0x0186, B:72:0x018c, B:73:0x0190, B:75:0x0199, B:76:0x019e), top: B:2:0x0004 }] */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37135xJ(Bundle bundle) {
        C29832h4 c29832h4;
        C29832h4 c29832h42;
        C29832h4 c29832h43;
        C29832h4 c29832h44;
        String string;
        ArrayList<String> stringArrayList;
        C29832h4 c29832h45;
        C7071g2 c7071g2;
        try {
            super.mo37135xJ(bundle);
            Bundle m92642L3 = m92642L3();
            C29832h4 c29832h46 = null;
            if (m92642L3 != null) {
                this.f73944T0 = m92642L3.getString("extra_group_id");
                this.f73947W0 = m92642L3.getString("EXTRA_SUGGEST_ID", "");
                this.f73956f1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
                String string2 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                AbstractC19074t.m100207e(string2, "getString(...)");
                this.f73958h1 = string2;
                String string3 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
                AbstractC19074t.m100207e(string3, "getString(...)");
                this.f73959i1 = string3;
                C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73944T0);
                this.f73948X0 = m92642L3.getString("extra_preload_data", "");
                this.f73946V0 = m92642L3.getBoolean("extra_pin_post", false);
                if (m4472f != null && m4472f.m153763h0() && !m4472f.m153742T()) {
                    this.f73946V0 = false;
                    C29832h4 c29832h47 = this.f73941Q0;
                    if (c29832h47 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h47 = null;
                    }
                    c29832h47.f137987z.setVisibility(8);
                    m80326ZM();
                    this.f73951a1 = m92642L3.getBoolean("BOL_EXTRA_IS_MULTI_CHOICE_POLL", true);
                    c29832h4 = this.f73941Q0;
                    if (c29832h4 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h4 = null;
                    }
                    c29832h4.f137973K.setChecked(this.f73951a1);
                    this.f73952b1 = m92642L3.getBoolean("BOL_EXTRA_IS_ADD_ANSWER_POLL", true);
                    c29832h42 = this.f73941Q0;
                    if (c29832h42 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h42 = null;
                    }
                    c29832h42.f137965C.setChecked(this.f73952b1);
                    this.f73953c1 = m92642L3.getBoolean("BOL_EXTRA_IS_ANONYMOUS_POLL", false);
                    c29832h43 = this.f73941Q0;
                    if (c29832h43 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h43 = null;
                    }
                    c29832h43.f137968F.setChecked(this.f73953c1);
                    this.f73954d1 = m92642L3.getBoolean("BOL_EXTRA_IS_HIDE_VOTE_PREVIEW_POLL", false);
                    c29832h44 = this.f73941Q0;
                    if (c29832h44 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h44 = null;
                    }
                    c29832h44.f137971I.setChecked(this.f73954d1);
                    String string4 = m92642L3.getString("STR_EXTRA_KWD", "");
                    AbstractC19074t.m100207e(string4, "getString(...)");
                    this.f73957g1 = string4;
                    string = m92642L3.getString("EXTRA_QUESTION");
                    if (!TextUtils.isEmpty(string)) {
                        C29832h4 c29832h48 = this.f73941Q0;
                        if (c29832h48 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29832h48 = null;
                        }
                        c29832h48.f137984w.setText(string);
                        C29832h4 c29832h49 = this.f73941Q0;
                        if (c29832h49 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29832h49 = null;
                        }
                        c29832h49.f137984w.requestFocus();
                        C29832h4 c29832h410 = this.f73941Q0;
                        if (c29832h410 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29832h410 = null;
                        }
                        CustomEditText customEditText = c29832h410.f137984w;
                        AbstractC19074t.m100205c(string);
                        customEditText.setSelection(string.length());
                    }
                    stringArrayList = m92642L3.getStringArrayList("EXTRA_ANSWER");
                    if (stringArrayList != null && stringArrayList.size() > 0 && (c7071g2 = this.f73943S0) != null) {
                        c7071g2.m36084b(stringArrayList);
                    }
                    c29832h45 = this.f73941Q0;
                    if (c29832h45 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29832h45 = null;
                    }
                    AbstractC23184q2.m119437B(c29832h45.f137963A, 1000L);
                }
                C29832h4 c29832h411 = this.f73941Q0;
                if (c29832h411 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h411 = null;
                }
                c29832h411.f137987z.setVisibility(0);
                m80326ZM();
                this.f73951a1 = m92642L3.getBoolean("BOL_EXTRA_IS_MULTI_CHOICE_POLL", true);
                c29832h4 = this.f73941Q0;
                if (c29832h4 == null) {
                }
                c29832h4.f137973K.setChecked(this.f73951a1);
                this.f73952b1 = m92642L3.getBoolean("BOL_EXTRA_IS_ADD_ANSWER_POLL", true);
                c29832h42 = this.f73941Q0;
                if (c29832h42 == null) {
                }
                c29832h42.f137965C.setChecked(this.f73952b1);
                this.f73953c1 = m92642L3.getBoolean("BOL_EXTRA_IS_ANONYMOUS_POLL", false);
                c29832h43 = this.f73941Q0;
                if (c29832h43 == null) {
                }
                c29832h43.f137968F.setChecked(this.f73953c1);
                this.f73954d1 = m92642L3.getBoolean("BOL_EXTRA_IS_HIDE_VOTE_PREVIEW_POLL", false);
                c29832h44 = this.f73941Q0;
                if (c29832h44 == null) {
                }
                c29832h44.f137971I.setChecked(this.f73954d1);
                String string42 = m92642L3.getString("STR_EXTRA_KWD", "");
                AbstractC19074t.m100207e(string42, "getString(...)");
                this.f73957g1 = string42;
                string = m92642L3.getString("EXTRA_QUESTION");
                if (!TextUtils.isEmpty(string)) {
                }
                stringArrayList = m92642L3.getStringArrayList("EXTRA_ANSWER");
                if (stringArrayList != null) {
                    c7071g2.m36084b(stringArrayList);
                }
                c29832h45 = this.f73941Q0;
                if (c29832h45 == null) {
                }
                AbstractC23184q2.m119437B(c29832h45.f137963A, 1000L);
            }
            if (C28176r6.m141702d().m141709j()) {
                this.f73949Y0 = true;
                C29832h4 c29832h412 = this.f73941Q0;
                if (c29832h412 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h412 = null;
                }
                c29832h412.f137980s.setVisibility(8);
                C29832h4 c29832h413 = this.f73941Q0;
                if (c29832h413 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29832h46 = c29832h413;
                }
                c29832h46.f137978q.setVisibility(0);
                AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.bm
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupPollCreatingView.m80310HM(GroupPollCreatingView.this);
                    }
                }, 1000L);
            } else {
                this.f73949Y0 = false;
                C29832h4 c29832h414 = this.f73941Q0;
                if (c29832h414 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29832h414 = null;
                }
                c29832h414.f137980s.setVisibility(0);
                C29832h4 c29832h415 = this.f73941Q0;
                if (c29832h415 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29832h46 = c29832h415;
                }
                c29832h46.f137978q.setVisibility(8);
            }
            m80317OM();
            C0815e1.m2075D().m2100V(new C23648e(6, this.f73958h1, 1, "gr_poll_create", this.f73959i1), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
