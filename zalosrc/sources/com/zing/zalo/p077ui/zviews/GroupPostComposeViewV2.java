package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import am.AbstractC0924m0;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import com.zing.zalo.p077ui.zviews.GroupPostComposeViewV2;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23202r9;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.C23278z2;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p175g0.AbstractC19181d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p459qs.C25490c;
import p495rx.C25994h;
import p588vw.C28652r;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C31988k5;
import p716zh.C32104s5;
import sx.C26405g;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class GroupPostComposeViewV2 extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, TouchInterceptionFrameLayout.InterfaceC13549b, InterfaceC0733x {

    /* renamed from: A1 */
    C7904b f74021A1;

    /* renamed from: B1 */
    C26405g f74022B1;

    /* renamed from: E1 */
    String f74025E1;

    /* renamed from: F1 */
    String f74026F1;

    /* renamed from: G1 */
    KeyboardAwareRelativeLayout f74027G1;

    /* renamed from: P0 */
    KeyboardFrameLayout f74036P0;

    /* renamed from: P1 */
    EditText f74037P1;

    /* renamed from: Q0 */
    View f74038Q0;

    /* renamed from: R0 */
    ImageView f74040R0;

    /* renamed from: R1 */
    boolean f74041R1;

    /* renamed from: S0 */
    View f74042S0;

    /* renamed from: T0 */
    View f74044T0;

    /* renamed from: U0 */
    CustomEditText f74046U0;

    /* renamed from: V0 */
    View f74048V0;

    /* renamed from: W0 */
    ProgressBar f74049W0;

    /* renamed from: X0 */
    TextView f74050X0;

    /* renamed from: Y0 */
    TextView f74051Y0;

    /* renamed from: Z0 */
    RecyclingImageView f74052Z0;

    /* renamed from: a1 */
    View f74053a1;

    /* renamed from: b1 */
    TouchInterceptionFrameLayout f74054b1;

    /* renamed from: c1 */
    View f74055c1;

    /* renamed from: d1 */
    ImageView f74056d1;

    /* renamed from: e1 */
    ImageView f74057e1;

    /* renamed from: f1 */
    ImageView f74058f1;

    /* renamed from: g1 */
    View f74059g1;

    /* renamed from: h1 */
    View f74060h1;

    /* renamed from: i1 */
    View f74061i1;

    /* renamed from: j1 */
    boolean f74062j1;

    /* renamed from: k1 */
    int f74063k1;

    /* renamed from: l1 */
    float f74064l1;

    /* renamed from: m1 */
    float f74065m1;

    /* renamed from: o1 */
    TouchInterceptionFrameLayout f74067o1;

    /* renamed from: x1 */
    C23528a f74076x1;

    /* renamed from: y1 */
    String f74077y1;

    /* renamed from: z1 */
    C7904b f74078z1;

    /* renamed from: n1 */
    boolean f74066n1 = false;

    /* renamed from: p1 */
    boolean f74068p1 = false;

    /* renamed from: q1 */
    float f74069q1 = 0.0f;

    /* renamed from: r1 */
    float f74070r1 = 0.0f;

    /* renamed from: s1 */
    float f74071s1 = 0.0f;

    /* renamed from: t1 */
    float f74072t1 = 0.0f;

    /* renamed from: u1 */
    int f74073u1 = 0;

    /* renamed from: v1 */
    int f74074v1 = 0;

    /* renamed from: w1 */
    Handler f74075w1 = new Handler(Looper.getMainLooper());

    /* renamed from: C1 */
    boolean f74023C1 = false;

    /* renamed from: D1 */
    boolean f74024D1 = false;

    /* renamed from: H1 */
    boolean f74028H1 = false;

    /* renamed from: I1 */
    boolean f74029I1 = false;

    /* renamed from: J1 */
    int f74030J1 = 0;

    /* renamed from: K1 */
    int f74031K1 = -1;

    /* renamed from: L1 */
    boolean f74032L1 = true;

    /* renamed from: M1 */
    boolean f74033M1 = true;

    /* renamed from: N1 */
    boolean f74034N1 = false;

    /* renamed from: O1 */
    boolean f74035O1 = false;

    /* renamed from: Q1 */
    Rect f74039Q1 = new Rect();

    /* renamed from: S1 */
    Runnable f74043S1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.ym
        public /* synthetic */ RunnableC16381ym() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GroupPostComposeViewV2.this.m80440FM();
        }
    };

    /* renamed from: T1 */
    private boolean f74045T1 = false;

    /* renamed from: U1 */
    private boolean f74047U1 = false;

    /* loaded from: classes6.dex */
    public static class GroupPostDialog extends DialogView {

        /* renamed from: H0 */
        GroupPostComposeViewV2 f74079H0;

        /* renamed from: WK */
        public static GroupPostDialog m80486WK(int i11, GroupPostComposeViewV2 groupPostComposeViewV2) {
            GroupPostDialog groupPostDialog = new GroupPostDialog();
            groupPostDialog.f74079H0 = groupPostComposeViewV2;
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            groupPostDialog.mo60305zK(bundle);
            return groupPostDialog;
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            C8009j c8009j = null;
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (this.f74079H0 != null && bundle == null) {
                int i11 = m92642L3().getInt("id");
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                if (i11 == 6) {
                                    C8009j.a aVar = new C8009j.a(m92648SI());
                                    aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invalid_date_dialog_title)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_hint_choose_time_in_1_year)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                                    c8009j = aVar.m43152a();
                                }
                            } else {
                                C8009j.a aVar2 = new C8009j.a(m92648SI());
                                aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invalid_date_dialog_title)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_hint_choose_time_in_future)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                                c8009j = aVar2.m43152a();
                            }
                        } else {
                            C8009j.a aVar3 = new C8009j.a(m92648SI());
                            aVar3.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_msg_replace_pin_new_group_post)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_this_post), this.f74079H0);
                            c8009j = aVar3.m43152a();
                        }
                    } else {
                        GroupPostComposeViewV2 groupPostComposeViewV2 = this.f74079H0;
                        if (groupPostComposeViewV2.f74024D1) {
                            return null;
                        }
                        groupPostComposeViewV2.f74024D1 = true;
                        C8009j.a aVar4 = new C8009j.a(m92648SI());
                        View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.compose_status_link_layout, (ViewGroup) null);
                        this.f74079H0.f74037P1 = (EditText) inflate.findViewById(AbstractC6918a0.link_input_edit_text);
                        String str = "";
                        C26405g c26405g = this.f74079H0.f74022B1;
                        if (c26405g != null && !TextUtils.isEmpty(c26405g.f125481d)) {
                            str = this.f74079H0.f74022B1.f125481d;
                        } else if (AbstractC0924m0.m3510V9()) {
                            try {
                                String m119771j = ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119771j(m92648SI(), new SensitiveData("clipboard_paste_link_dialog", "paste_link_dialog"));
                                if (!TextUtils.isEmpty(m119771j)) {
                                    if (!TextUtils.isEmpty(new URI(m119771j).getHost())) {
                                        str = m119771j;
                                    }
                                }
                            } catch (Exception e12) {
                                AbstractC23350e.m122778h(e12);
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f74079H0.f74037P1.setText(str);
                            this.f74079H0.f74037P1.setSelection(str.length());
                            this.f74079H0.f74037P1.selectAll();
                        }
                        int i12 = AbstractC23222t7.f112514B;
                        aVar4.m43150A(inflate, i12, AbstractC23222t7.f112572m, i12, 0);
                        aVar4.m43154c(false);
                        aVar4.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_cancel), this.f74079H0);
                        aVar4.m43169r(AbstractC8020f0.str_cap_okay, this.f74079H0);
                        c8009j = aVar4.m43152a();
                        c8009j.m92867k().m92890I(37);
                    }
                } else {
                    C8009j.a aVar5 = new C8009j.a(m92648SI());
                    aVar5.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_havent_save_changed_ask_to_exit_screen)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dont_exit), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_exit), this.f74079H0);
                    c8009j = aVar5.m43152a();
                }
                if (c8009j != null) {
                    c8009j.m92853D(i11);
                }
                return c8009j;
            }
            dismiss();
            return super.mo13885LK(bundle);
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
        /* renamed from: Tv */
        public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
            super.mo12457Tv(interfaceC17463d);
            if (m92642L3().getInt("id") == 2) {
                try {
                    this.f74079H0.f74024D1 = false;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$a */
    /* loaded from: classes6.dex */
    public class C14415a implements KeyboardFrameLayout.InterfaceC13508a {
        C14415a() {
        }

        /* renamed from: b */
        public /* synthetic */ void m80488b() {
            GroupPostComposeViewV2.this.m80475WM();
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                GroupPostComposeViewV2.this.f74046U0.setCursorVisible(false);
                GroupPostComposeViewV2 groupPostComposeViewV2 = GroupPostComposeViewV2.this;
                groupPostComposeViewV2.f74028H1 = false;
                if (groupPostComposeViewV2.f74047U1) {
                    GroupPostComposeViewV2.this.f74047U1 = false;
                    GroupPostComposeViewV2.this.f74075w1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hn
                        public /* synthetic */ RunnableC15705hn() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupPostComposeViewV2.C14415a.this.m80488b();
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            try {
                GroupPostComposeViewV2.this.f74046U0.setCursorVisible(true);
                GroupPostComposeViewV2.this.f74028H1 = true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$b */
    /* loaded from: classes6.dex */
    public class C14416b extends AbstractC18391a {
        C14416b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (GroupPostComposeViewV2.this.f74046U0.getText().length() > 3000) {
                ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_max_chars_input), 3000));
                GroupPostComposeViewV2.this.f74046U0.setText(GroupPostComposeViewV2.this.f74046U0.getText().toString().substring(0, 3000));
                GroupPostComposeViewV2.this.f74046U0.setSelection(3000);
            } else {
                GroupPostComposeViewV2.this.m80469QM();
                GroupPostComposeViewV2.this.m80477YM();
                C28652r.m143349v().m143361W(editable);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$c */
    /* loaded from: classes6.dex */
    public class C14417c extends EditTextWithContextMenu.AbstractC13498a {
        C14417c() {
        }

        @Override // com.zing.zalo.p077ui.widget.EditTextWithContextMenu.AbstractC13498a
        /* renamed from: a */
        public void mo36093a() {
            String obj = GroupPostComposeViewV2.this.f74046U0.getText().toString();
            GroupPostComposeViewV2.this.f74046U0.setText(obj);
            GroupPostComposeViewV2.this.f74046U0.setSelection(obj.length());
            GroupPostComposeViewV2 groupPostComposeViewV2 = GroupPostComposeViewV2.this;
            if (groupPostComposeViewV2.f74022B1 == null) {
                GroupPostComposeViewV2.this.m80485zM(ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119771j(groupPostComposeViewV2.f72421L0.m92648SI(), new SensitiveData("clipboard_paste_link_dialog", "paste_link_dialog")), true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$d */
    /* loaded from: classes6.dex */
    class C14418d extends ZdsActionBar.AbstractC16987c {
        C14418d() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            if (GroupPostComposeViewV2.this.m80466LM()) {
                return;
            }
            GroupPostComposeViewV2.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$e */
    /* loaded from: classes6.dex */
    public class C14419e implements InterfaceC20094a {
        C14419e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                GroupPostComposeViewV2.this.f72421L0.mo49315c4();
                if (c20096c != null) {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                }
                GroupPostComposeViewV2.this.f74034N1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C31988k5 m132058d;
            try {
                GroupPostComposeViewV2.this.f72421L0.mo49315c4();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                C0943w.m4462l().m4472f(GroupPostComposeViewV2.this.f74077y1);
                if (optJSONObject != null) {
                    C7904b c7904b = new C7904b(optJSONObject, "group_" + GroupPostComposeViewV2.this.f74077y1);
                    if (optJSONObject.optBoolean("isPin")) {
                        AbstractC23184q2.m119438C(GroupPostComposeViewV2.this.f74077y1);
                    }
                    if (c7904b.f42732d > 0) {
                        m132058d = C25490c.m132054j().m132057c(c7904b);
                    } else {
                        m132058d = C25490c.m132054j().m132058d(c7904b);
                    }
                    if (GroupPostComposeViewV2.this.f74078z1 == null) {
                        if (c7904b.m40778p()) {
                            C23744a.m124114c().m124116d(68, m132058d.m154218b());
                            C25490c.m132054j().m132055a(GroupPostComposeViewV2.this.f74077y1, m132058d.m154218b());
                        }
                    } else {
                        C23744a.m124114c().m124116d(66, new Object[0]);
                    }
                    Intent intent = new Intent();
                    intent.putExtra("extra_group_board_gen_id", m132058d.m154218b());
                    GroupPostComposeViewV2.this.f72421L0.mo50035CK(-1, intent);
                    GroupPostComposeViewV2 groupPostComposeViewV2 = GroupPostComposeViewV2.this;
                    groupPostComposeViewV2.f74021A1 = c7904b;
                    groupPostComposeViewV2.m80483xM();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupPostComposeViewV2 groupPostComposeViewV22 = GroupPostComposeViewV2.this;
            groupPostComposeViewV22.f74034N1 = false;
            groupPostComposeViewV22.f72421L0.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$f */
    /* loaded from: classes6.dex */
    public class C14420f implements InterfaceC20094a {
        C14420f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 17064) {
                        C25994h.f124017a.m133919h("group_" + GroupPostComposeViewV2.this.f74077y1).m133960l();
                    }
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    new C7904b(optJSONObject, "group_" + GroupPostComposeViewV2.this.f74077y1);
                    if (C0943w.m4462l().m4472f(GroupPostComposeViewV2.this.f74077y1) != null) {
                        AbstractC23184q2.m119438C(GroupPostComposeViewV2.this.f74077y1);
                        AbstractC19646n0.m102996k2();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$g */
    /* loaded from: classes6.dex */
    public class C14421g implements InterfaceC20094a {
        C14421g() {
        }

        /* renamed from: e */
        public /* synthetic */ void m80491e() {
            GroupPostComposeViewV2.this.m80479aN();
            GroupPostComposeViewV2.this.m80478ZM();
        }

        /* renamed from: f */
        public /* synthetic */ void m80492f(C20096c c20096c) {
            if (c20096c.m104491c() == 1003) {
                GroupPostComposeViewV2.this.m80472TM(2);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_link_invalid));
            } else if (c20096c.m104491c() == 50001) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
            } else {
                ToastUtils.showMess(c20096c.m104492d());
            }
            GroupPostComposeViewV2.this.f74048V0.setVisibility(8);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupPostComposeViewV2.this.f74075w1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.in

                /* renamed from: q */
                public final /* synthetic */ C20096c f80700q;

                public /* synthetic */ RunnableC15742in(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPostComposeViewV2.C14421g.this.m80492f(r2);
                }
            });
            GroupPostComposeViewV2.this.f74035O1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                GroupPostComposeViewV2.this.f74022B1 = C26405g.m136174b(((JSONObject) obj).getJSONObject("data"));
                GroupPostComposeViewV2.this.f74075w1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jn
                    public /* synthetic */ RunnableC15778jn() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupPostComposeViewV2.C14421g.this.m80491e();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupPostComposeViewV2.this.f74035O1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$h */
    /* loaded from: classes6.dex */
    public class C14422h extends AnimatorListenerAdapter {
        C14422h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            GroupPostComposeViewV2 groupPostComposeViewV2 = GroupPostComposeViewV2.this;
            groupPostComposeViewV2.f74068p1 = false;
            groupPostComposeViewV2.f74062j1 = false;
            if (groupPostComposeViewV2.f74045T1) {
                GroupPostComposeViewV2.this.f74045T1 = false;
                GroupPostComposeViewV2 groupPostComposeViewV22 = GroupPostComposeViewV2.this;
                groupPostComposeViewV22.f74075w1.removeCallbacks(groupPostComposeViewV22.f74043S1);
                GroupPostComposeViewV2 groupPostComposeViewV23 = GroupPostComposeViewV2.this;
                groupPostComposeViewV23.f74075w1.post(groupPostComposeViewV23.f74043S1);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GroupPostComposeViewV2.this.m80464BM();
            GroupPostComposeViewV2 groupPostComposeViewV2 = GroupPostComposeViewV2.this;
            groupPostComposeViewV2.f74068p1 = false;
            groupPostComposeViewV2.f74062j1 = false;
            groupPostComposeViewV2.f74029I1 = false;
            if (groupPostComposeViewV2.f74045T1) {
                GroupPostComposeViewV2.this.f74045T1 = false;
                GroupPostComposeViewV2 groupPostComposeViewV22 = GroupPostComposeViewV2.this;
                groupPostComposeViewV22.f74075w1.removeCallbacks(groupPostComposeViewV22.f74043S1);
                GroupPostComposeViewV2 groupPostComposeViewV23 = GroupPostComposeViewV2.this;
                groupPostComposeViewV23.f74075w1.post(groupPostComposeViewV23.f74043S1);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GroupPostComposeViewV2.this.f74068p1 = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPostComposeViewV2$i */
    /* loaded from: classes6.dex */
    public class C14423i extends AnimatorListenerAdapter {
        C14423i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            GroupPostComposeViewV2 groupPostComposeViewV2 = GroupPostComposeViewV2.this;
            groupPostComposeViewV2.f74068p1 = false;
            groupPostComposeViewV2.f74062j1 = false;
            if (groupPostComposeViewV2.f74045T1) {
                GroupPostComposeViewV2.this.f74045T1 = false;
                GroupPostComposeViewV2 groupPostComposeViewV22 = GroupPostComposeViewV2.this;
                groupPostComposeViewV22.f74075w1.removeCallbacks(groupPostComposeViewV22.f74043S1);
                GroupPostComposeViewV2 groupPostComposeViewV23 = GroupPostComposeViewV2.this;
                groupPostComposeViewV23.f74075w1.post(groupPostComposeViewV23.f74043S1);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                GroupPostComposeViewV2 groupPostComposeViewV2 = GroupPostComposeViewV2.this;
                groupPostComposeViewV2.f74068p1 = false;
                groupPostComposeViewV2.f74062j1 = false;
                groupPostComposeViewV2.f74029I1 = true;
                if (groupPostComposeViewV2.f74045T1) {
                    GroupPostComposeViewV2.this.f74045T1 = false;
                    GroupPostComposeViewV2 groupPostComposeViewV22 = GroupPostComposeViewV2.this;
                    groupPostComposeViewV22.f74075w1.removeCallbacks(groupPostComposeViewV22.f74043S1);
                    GroupPostComposeViewV2 groupPostComposeViewV23 = GroupPostComposeViewV2.this;
                    groupPostComposeViewV23.f74075w1.post(groupPostComposeViewV23.f74043S1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GroupPostComposeViewV2.this.f74068p1 = true;
        }
    }

    /* renamed from: DM */
    public /* synthetic */ void m80438DM(InterfaceC0765j interfaceC0765j, String str) {
        m80473UM();
        interfaceC0765j.mo1511P9(str);
    }

    /* renamed from: EM */
    public /* synthetic */ void m80439EM() {
        try {
            if (!this.f72421L0.m92681pJ() && !this.f72421L0.m92677nJ()) {
                m80476XM();
                this.f74067o1.setPosition(this.f74069q1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: FM */
    public /* synthetic */ void m80440FM() {
        m80476XM();
        if (this.f74029I1) {
            m80475WM();
        } else {
            m80464BM();
        }
    }

    /* renamed from: GM */
    public /* synthetic */ void m80441GM() {
        AbstractC2379w.m12432f(this.f74046U0);
    }

    /* renamed from: HM */
    public /* synthetic */ void m80442HM() {
        m80472TM(2);
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_link_invalid));
    }

    /* renamed from: IM */
    public /* synthetic */ void m80443IM(boolean z11, MotionEvent motionEvent) {
        if (this.f74066n1) {
            return;
        }
        this.f74062j1 = true;
        if (!z11) {
            this.f74041R1 = false;
        }
        float rawY = this.f74065m1 + (motionEvent.getRawY() - this.f74064l1);
        float f11 = this.f74070r1;
        if (rawY < f11) {
            rawY = f11;
        }
        float f12 = this.f74071s1;
        if (rawY > f12) {
            rawY = f12;
        }
        this.f74067o1.setPosition(rawY);
    }

    /* renamed from: JM */
    public /* synthetic */ void m80444JM() {
        KeyboardAwareRelativeLayout keyboardAwareRelativeLayout = this.f74027G1;
        if (keyboardAwareRelativeLayout != null) {
            keyboardAwareRelativeLayout.requestLayout();
        }
    }

    /* renamed from: KM */
    public /* synthetic */ void m80445KM(View view) {
        AbstractC23647d.m123897g("1001613");
        m80467MM();
    }

    /* renamed from: NM */
    public void m80446NM() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", "group_" + this.f74077y1);
        bundle.putString("extra_group_topic_info_json", this.f74021A1.m40780r().toString());
        bundle.putString("STR_SOURCE_START_VIEW", "gr_note_create");
        m92693xK().m93069k2(UnpinTopicPinBoardView.class, bundle, 2, true);
    }

    /* renamed from: OM */
    private void m80447OM() {
        try {
            if (this.f74068p1) {
                this.f74045T1 = true;
            } else {
                this.f74075w1.removeCallbacks(this.f74043S1);
                this.f74075w1.post(this.f74043S1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: vM */
    private boolean m80461vM() {
        if (!TextUtils.isEmpty(this.f74077y1)) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74077y1);
            if (m4472f != null && (m4472f.m153742T() || !m4472f.m153763h0())) {
                return true;
            }
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_permission_to_change_pin_board_after_create_note));
        }
        return false;
    }

    /* renamed from: wM */
    private boolean m80462wM() {
        if (C25994h.f124017a.m133919h("group_" + this.f74077y1).m133973z()) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.gn
                public /* synthetic */ RunnableC15668gn() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPostComposeViewV2.this.m80446NM();
                }
            });
            return false;
        }
        return true;
    }

    /* renamed from: AM */
    void m80463AM(String str) {
        if (!this.f74035O1 && str != null && str.length() != 0) {
            C0766k c0766k = new C0766k();
            this.f74022B1 = null;
            this.f74035O1 = true;
            c0766k.mo1704o8(new C14421g());
            this.f74075w1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.fn

                /* renamed from: q */
                public final /* synthetic */ InterfaceC0765j f80376q;

                /* renamed from: r */
                public final /* synthetic */ String f80377r;

                public /* synthetic */ RunnableC15631fn(InterfaceC0765j c0766k2, String str2) {
                    r2 = c0766k2;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPostComposeViewV2.this.m80438DM(r2, r3);
                }
            }, 300L);
        }
    }

    /* renamed from: BM */
    void m80464BM() {
        this.f74067o1.setPosition(this.f74069q1);
        this.f74029I1 = false;
    }

    /* renamed from: CM */
    void m80465CM() {
        this.f74067o1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.xm
            public /* synthetic */ RunnableC16344xm() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostComposeViewV2.this.m80439EM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) layoutInflater.inflate(AbstractC7409c0.group_post_compose_view_v2, viewGroup, false);
        this.f74036P0 = keyboardFrameLayout;
        keyboardFrameLayout.setOnKeyboardListener(new C14415a());
        this.f74027G1 = (KeyboardAwareRelativeLayout) this.f74036P0.findViewById(AbstractC6918a0.keyboard_aware_rl);
        if (this.f72421L0.m92676n2() instanceof Activity) {
            this.f72421L0.m92676n2().mo35554O(18);
            this.f74027G1.setEnableMeasureKeyboard(false);
        }
        this.f74076x1 = new C23528a(this.f72421L0.getContext());
        m80471SM();
        return this.f74036P0;
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Jz */
    public void mo71217Jz(View view, MotionEvent motionEvent, float f11, float f12, boolean z11) {
        if (this.f74028H1) {
            return;
        }
        if (this.f74065m1 >= this.f74069q1) {
            if (z11) {
                return;
            } else {
                this.f74065m1 = this.f74071s1;
            }
        }
        this.f74075w1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.zm

            /* renamed from: q */
            public final /* synthetic */ boolean f82858q;

            /* renamed from: r */
            public final /* synthetic */ MotionEvent f82859r;

            public /* synthetic */ RunnableC16418zm(boolean z112, MotionEvent motionEvent2) {
                r2 = z112;
                r3 = motionEvent2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupPostComposeViewV2.this.m80443IM(r2, r3);
            }
        });
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        EditText editText;
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 1) {
            if (mo92862f != 2) {
                if (mo92862f == 3 && i11 == -1) {
                    interfaceC17463d.dismiss();
                    m80483xM();
                    return;
                }
                return;
            }
            if (i11 == -2) {
                EditText editText2 = this.f74037P1;
                if (editText2 != null) {
                    AbstractC2379w.m12430d(editText2);
                }
                interfaceC17463d.dismiss();
                this.f74024D1 = false;
                return;
            }
            if (i11 == -1 && (editText = this.f74037P1) != null) {
                String trim = editText.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    this.f74037P1.setText("");
                    AbstractC2379w.m12430d(this.f74037P1);
                    if (!TextUtils.isEmpty(C31944h6.m153548n(trim))) {
                        m80463AM(trim);
                    } else {
                        this.f74075w1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.bn
                            public /* synthetic */ RunnableC15480bn() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupPostComposeViewV2.this.m80442HM();
                            }
                        });
                    }
                    interfaceC17463d.dismiss();
                    this.f74024D1 = false;
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_input_inform));
                return;
            }
            return;
        }
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            this.f72421L0.finish();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Kj */
    public void mo71219Kj(View view, MotionEvent motionEvent) {
        this.f74064l1 = motionEvent.getRawY();
        this.f74065m1 = this.f74067o1.getPosition();
        this.f74066n1 = false;
        this.f74041R1 = true;
    }

    /* renamed from: LM */
    boolean m80466LM() {
        AbstractC2379w.m12430d(this.f74046U0);
        if (m87077NK() != null && m87077NK().getTrailingButton() != null && m87077NK().getTrailingButton().isEnabled()) {
            m80472TM(1);
            return true;
        }
        return false;
    }

    /* renamed from: MM */
    void m80467MM() {
        AbstractC2379w.m12430d(this.f74046U0);
        m80468PM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C14418d());
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.cn
                public /* synthetic */ ViewOnClickListenerC15516cn() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupPostComposeViewV2.this.m80445KM(view);
                }
            });
        }
    }

    /* renamed from: PM */
    void m80468PM() {
        C7904b c7904b;
        if (this.f74034N1) {
            return;
        }
        this.f74034N1 = true;
        if (this.f74022B1 != null) {
            c7904b = new C7904b(1);
            C26405g c26405g = this.f74022B1;
            c7904b.f42736h = c26405g.f125484g;
            c7904b.f42742n = c26405g.f125488k;
            c7904b.f42737i = c26405g.f125480c;
            c7904b.f42738j = c26405g.f125481d;
            c7904b.f42739k = c26405g.f125482e;
            c7904b.f42745q = c26405g.f125489l;
            c7904b.f42743o = c26405g.f125485h;
            c7904b.f42740l = c26405g.f125490m;
            c7904b.f42741m = c26405g.f125487j;
            c7904b.f42716D = this.f74046U0.getText().toString().trim();
        } else {
            c7904b = new C7904b(0);
            c7904b.f42736h = this.f74046U0.getText().toString().trim();
        }
        c7904b.f42731c = "📢";
        C7904b c7904b2 = this.f74078z1;
        if (c7904b2 == null) {
            c7904b.f42715C = "0";
        } else {
            c7904b.f42715C = c7904b2.f42715C;
        }
        c7904b.m40775m();
        if (TextUtils.isEmpty(this.f74077y1)) {
            this.f74034N1 = false;
            Bundle bundle = new Bundle();
            bundle.putInt("INT_EXTRA_SUGGEST_CONTENT_TYPE", 0);
            bundle.putBoolean("BOL_EXTRA_NEED_PIN", this.f74023C1);
            bundle.putString("extra_group_topic_info_json", c7904b.m40780r().toString());
            bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 2);
            bundle.putString("EXTRA_SUGGEST_ID", this.f74025E1);
            if (!TextUtils.isEmpty(this.f74026F1)) {
                bundle.putString("extra_preload_data", this.f74026F1);
            }
            this.f72421L0.m92662fJ().m93069k2(QuickCreateGroupView.class, bundle, 1, true);
            return;
        }
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14419e());
        if (c7904b.f42715C.equals("0")) {
            c0766k.mo1717q5(this.f74077y1, c7904b, false, "");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f74032L1 || this.f74033M1) {
            arrayList.add(new C32104s5(0, c7904b.m40764b().toString()));
            arrayList.add(new C32104s5(6, Integer.valueOf(c7904b.f42729a)));
        }
        c0766k.mo1616cb(this.f74077y1, c7904b.f42715C, arrayList);
    }

    /* renamed from: QM */
    void m80469QM() {
        try {
            String obj = this.f74046U0.getText().toString();
            int m119758v = AbstractC23244v8.m119758v(obj, System.getProperty("line.separator"));
            if (obj.length() <= 70 && m119758v <= 2) {
                this.f74046U0.setTextSize(1, 22.0f);
            }
            this.f74046U0.setTextSize(1, 16.0f);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: RM */
    void m80470RM(int i11) {
        this.f74030J1 = i11;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f74056d1.setVisibility(0);
                this.f74057e1.setVisibility(8);
                this.f74058f1.setVisibility(8);
                this.f74059g1.setVisibility(0);
                this.f74060h1.setVisibility(8);
                this.f74061i1.setVisibility(8);
                return;
            }
            return;
        }
        this.f74056d1.setVisibility(0);
        this.f74057e1.setVisibility(0);
        this.f74058f1.setVisibility(0);
        this.f74059g1.setVisibility(0);
        this.f74060h1.setVisibility(0);
        this.f74061i1.setVisibility(0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        bundle.putBoolean("isShowInputDialog", this.f74024D1);
    }

    /* renamed from: SM */
    void m80471SM() {
        try {
            View findViewById = this.f74036P0.findViewById(AbstractC6918a0.postAnchor);
            this.f74038Q0 = findViewById;
            findViewById.setOnClickListener(this);
            View findViewById2 = this.f74036P0.findViewById(AbstractC6918a0.pin_checker_container);
            this.f74042S0 = findViewById2;
            findViewById2.setOnClickListener(this);
            this.f74040R0 = (ImageView) this.f74036P0.findViewById(AbstractC6918a0.ic_pin_checker);
            this.f74044T0 = this.f74036P0.findViewById(AbstractC6918a0.pin_wrap);
            CustomEditText customEditText = (CustomEditText) this.f74036P0.findViewById(AbstractC6918a0.et_group_topic);
            this.f74046U0 = customEditText;
            customEditText.setForceHideClearBtn(true);
            this.f74046U0.setOnClickListener(this);
            this.f74046U0.addTextChangedListener(new C14416b());
            this.f74046U0.setTextContextChangeListener(new C14417c());
            this.f74048V0 = this.f74036P0.findViewById(AbstractC6918a0.layoutLinkTab);
            this.f74049W0 = (ProgressBar) this.f74036P0.findViewById(AbstractC6918a0.pb_link_progress);
            this.f74050X0 = (TextView) this.f74036P0.findViewById(AbstractC6918a0.tvLinkTitle);
            this.f74051Y0 = (TextView) this.f74036P0.findViewById(AbstractC6918a0.tvLinkDescription);
            View findViewById3 = this.f74036P0.findViewById(AbstractC6918a0.link_preview_delete);
            this.f74053a1 = findViewById3;
            findViewById3.setOnClickListener(this);
            this.f74052Z0 = (RecyclingImageView) this.f74036P0.findViewById(AbstractC6918a0.imvLinkHeader);
            this.f74048V0.setVisibility(8);
            this.f74054b1 = (TouchInterceptionFrameLayout) this.f74036P0.findViewById(AbstractC6918a0.btn_add_attachment_wrapper);
            View findViewById4 = this.f74036P0.findViewById(AbstractC6918a0.btn_add_attachment);
            this.f74055c1 = findViewById4;
            findViewById4.setOnClickListener(this);
            this.f74054b1.setScrollInterceptionListener(this);
            this.f74056d1 = (ImageView) this.f74036P0.findViewById(AbstractC6918a0.icn_hint_add_attachment_link);
            this.f74057e1 = (ImageView) this.f74036P0.findViewById(AbstractC6918a0.icn_hint_add_attachment_poll);
            this.f74058f1 = (ImageView) this.f74036P0.findViewById(AbstractC6918a0.icn_hint_add_attachment_reminder);
            m80478ZM();
            TouchInterceptionFrameLayout touchInterceptionFrameLayout = (TouchInterceptionFrameLayout) this.f74036P0.findViewById(AbstractC6918a0.drag_view);
            this.f74067o1 = touchInterceptionFrameLayout;
            touchInterceptionFrameLayout.setScrollInterceptionListener(this);
            View findViewById5 = this.f74036P0.findViewById(AbstractC6918a0.add_attachment_link);
            this.f74059g1 = findViewById5;
            findViewById5.setOnClickListener(this);
            View findViewById6 = this.f74036P0.findViewById(AbstractC6918a0.add_attachment_poll);
            this.f74060h1 = findViewById6;
            findViewById6.setOnClickListener(this);
            View findViewById7 = this.f74036P0.findViewById(AbstractC6918a0.add_attachment_reminder);
            this.f74061i1 = findViewById7;
            findViewById7.setOnClickListener(this);
            m80465CM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: TH */
    public void mo71235TH(View view, MotionEvent motionEvent, boolean z11) {
        TouchInterceptionFrameLayout touchInterceptionFrameLayout;
        try {
            this.f74066n1 = true;
            this.f74064l1 = 0.0f;
            this.f74065m1 = 0.0f;
            if (this.f74068p1 || (touchInterceptionFrameLayout = this.f74067o1) == null || touchInterceptionFrameLayout.getVisibility() != 0) {
                return;
            }
            if (this.f74067o1.getPosition() < this.f74071s1) {
                if (this.f74041R1) {
                    m80474VM();
                } else {
                    m80475WM();
                }
            } else {
                m80464BM();
                this.f74062j1 = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TM */
    public void m80472TM(int i11) {
        try {
            GroupPostDialog m80486WK = GroupPostDialog.m80486WK(i11, this);
            if (m80486WK != null) {
                if (m80486WK.m92687sJ()) {
                    m80486WK.dismiss();
                }
                m80486WK.mo83093TK(this.f72421L0.m92649TI());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: UM */
    void m80473UM() {
        this.f74048V0.setVisibility(0);
        this.f74050X0.setVisibility(4);
        this.f74051Y0.setVisibility(4);
        this.f74052Z0.setImageResource(AbstractC16803z.no_image2);
        this.f74049W0.setVisibility(0);
    }

    /* renamed from: VM */
    public void m80474VM() {
        AbstractC23202r9.m119537e(this.f74067o1, null, 300L, null, this.f74071s1, this.f74073u1, null, 0.0f, new C14422h());
    }

    /* renamed from: WM */
    public void m80475WM() {
        AbstractC23202r9.m119537e(this.f74067o1, null, 300L, null, this.f74070r1, this.f74073u1, null, 0.0f, new C14423i());
    }

    /* renamed from: XM */
    void m80476XM() {
        int measuredHeight;
        int dimension = (int) this.f72421L0.m92651WI().getDimension(AbstractC19181d.abc_action_bar_default_height_material);
        int i11 = 0;
        if (!this.f72421L0.m92676n2().mo35576n3()) {
            if (this.f72421L0.m92656bJ() != null && this.f72421L0.m92656bJ().getParent() != null && ((View) this.f72421L0.m92656bJ().getParent()).getMeasuredHeight() > 0) {
                KeyboardFrameLayout keyboardFrameLayout = this.f74036P0;
                if (keyboardFrameLayout != null && keyboardFrameLayout.getHeight() > 0) {
                    measuredHeight = this.f74036P0.getHeight();
                } else {
                    measuredHeight = ((View) this.f72421L0.m92656bJ().getParent()).getMeasuredHeight();
                }
                if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
                    i11 = AbstractC23136l9.m118737p0();
                }
                this.f74074v1 = measuredHeight - i11;
            } else {
                this.f74074v1 = this.f72421L0.m92651WI().getDisplayMetrics().heightPixels - AbstractC23136l9.m118737p0();
            }
        } else {
            View findViewById = this.f72421L0.m92676n2().findViewById(AbstractC6918a0.zalo_view_container);
            if (findViewById != null && findViewById.getMeasuredWidth() > 0 && findViewById.getMeasuredHeight() > 0 && (findViewById instanceof UpArrowLayout)) {
                Point pointTo = ((UpArrowLayout) findViewById).getPointTo();
                if (this.f72421L0.m92651WI().getConfiguration().orientation == 1) {
                    this.f74074v1 = findViewById.getMeasuredHeight() - pointTo.y;
                } else {
                    findViewById.getRootView().getWindowVisibleDisplayFrame(this.f74039Q1);
                    int measuredHeight2 = findViewById.getMeasuredHeight();
                    if (this.f74039Q1.top != 0) {
                        i11 = AbstractC17484n.Companion.m92931b();
                    }
                    this.f74074v1 = measuredHeight2 - i11;
                }
            } else if (this.f72421L0.m92656bJ() != null && this.f72421L0.m92656bJ().getParent() != null) {
                this.f74074v1 = ((View) this.f72421L0.m92656bJ().getParent()).getMeasuredHeight();
            }
        }
        int i12 = this.f74074v1 - dimension;
        this.f74074v1 = i12;
        this.f74073u1 = Math.min(i12, this.f74067o1.getHeight());
        int i13 = this.f74074v1;
        this.f74070r1 = i13 - r0;
        float f11 = i13;
        this.f74069q1 = f11;
        this.f74071s1 = f11 - this.f74054b1.getHeight();
        this.f74072t1 = this.f74073u1 / 3.0f;
    }

    /* renamed from: YM */
    void m80477YM() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK == null) {
            return;
        }
        boolean z11 = false;
        if (this.f74022B1 == null && this.f74046U0.getText().toString().trim().length() <= 0) {
            m87077NK.setEnableTrailingButton(false);
            return;
        }
        m80484yM();
        if (this.f74032L1 || this.f74033M1) {
            z11 = true;
        }
        m87077NK.setEnableTrailingButton(z11);
    }

    /* renamed from: ZM */
    void m80478ZM() {
        if (this.f74022B1 != null) {
            this.f74054b1.setVisibility(8);
        } else {
            this.f74054b1.setVisibility(0);
        }
        m80477YM();
    }

    /* renamed from: aN */
    void m80479aN() {
        this.f74049W0.setVisibility(8);
        if (this.f74022B1 != null) {
            this.f74050X0.setVisibility(0);
            this.f74051Y0.setVisibility(0);
            if (!TextUtils.isEmpty(this.f74022B1.f125478a)) {
                this.f74050X0.setText(this.f74022B1.f125478a);
            }
            try {
                if (!TextUtils.isEmpty(this.f74022B1.f125482e)) {
                    this.f74051Y0.setText(this.f74022B1.f125482e);
                } else {
                    URI uri = new URI(this.f74022B1.f125481d);
                    if (!TextUtils.isEmpty(uri.getHost())) {
                        this.f74051Y0.setText(uri.getHost());
                    }
                }
            } catch (URISyntaxException unused) {
                this.f74051Y0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_link_base_domain_invalid));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                this.f74051Y0.setText("");
            }
            this.f74052Z0.setVisibility(0);
            this.f74052Z0.setImageResource(AbstractC16803z.attach_gallery_96);
            if (!TextUtils.isEmpty(this.f74022B1.f125480c)) {
                ((C23528a) this.f74076x1.m123612r(this.f74052Z0)).m123618x(this.f74022B1.f125480c, C23278z2.m120083M0());
            }
            this.f74048V0.setVisibility(0);
            return;
        }
        this.f74048V0.setVisibility(8);
    }

    /* renamed from: bN */
    void m80480bN() {
        if (this.f74023C1) {
            this.f74040R0.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_icn_form_checkbox_round_checked));
        } else {
            this.f74040R0.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_form_radio_unchecked));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupPostComposeViewV2";
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: m6 */
    public boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12) {
        if (!this.f74062j1 && Math.abs(f12) < this.f74063k1) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.pin_checker_container) {
            boolean z11 = !this.f74023C1;
            this.f74023C1 = z11;
            if (z11) {
                AbstractC23647d.m123897g("1001671");
            } else {
                AbstractC23647d.m123897g("1001672");
            }
            m80480bN();
            m80477YM();
            m80478ZM();
            return;
        }
        if (id2 == AbstractC6918a0.link_preview_delete) {
            if (this.f74035O1) {
                return;
            }
            AbstractC23647d.m123897g("1001667");
            this.f74022B1 = null;
            m80479aN();
            m80478ZM();
            return;
        }
        if (id2 == AbstractC6918a0.btn_add_attachment) {
            AbstractC23647d.m123897g("1001601");
            if (this.f74028H1) {
                AbstractC2379w.m12430d(this.f74046U0);
                this.f74047U1 = true;
                return;
            } else {
                this.f74075w1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dn
                    public /* synthetic */ RunnableC15557dn() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupPostComposeViewV2.this.m80475WM();
                    }
                });
                return;
            }
        }
        if (id2 != AbstractC6918a0.et_group_topic && id2 != AbstractC6918a0.postAnchor) {
            if (id2 == AbstractC6918a0.add_attachment_link) {
                AbstractC23647d.m123897g("1001634");
                m80472TM(2);
                m80464BM();
                return;
            }
            if (id2 == AbstractC6918a0.add_attachment_poll) {
                AbstractC23647d.m123897g("1001644");
                if (!TextUtils.isEmpty(this.f74077y1)) {
                    C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74077y1);
                    if (m4472f == null) {
                        return;
                    }
                    if (m4472f.m153757e0() && !m4472f.m153742T()) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_admin_tool_lock_create_poll));
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", this.f74077y1);
                bundle.putBoolean("extra_pin_post", this.f74023C1);
                bundle.putString("EXTRA_QUESTION", this.f74046U0.getText().toString());
                this.f72421L0.finish();
                this.f72421L0.m92662fJ().m93069k2(GroupPollCreatingView.class, bundle, 1, true);
                return;
            }
            if (id2 == AbstractC6918a0.add_attachment_reminder) {
                AbstractC23647d.m123897g("1001646");
                if (!TextUtils.isEmpty(this.f74077y1)) {
                    C31973j5 m4472f2 = C0943w.m4462l().m4472f(this.f74077y1);
                    if (m4472f2 == null) {
                        return;
                    }
                    if (m4472f2.m153759f0() && !m4472f2.m153742T()) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_no_right_create_time_reminder));
                        return;
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("EXTRA_SUGGEST_ID", this.f74025E1);
                bundle2.putString("extra_preload_data", this.f74026F1);
                bundle2.putString("extra_group_id", this.f74077y1);
                bundle2.putBoolean("extra_pin_post", this.f74023C1);
                bundle2.putString("EXTRA_POST_CONTENT", this.f74046U0.getText().toString());
                bundle2.putInt("INT_EXTRA_TRACKING_SOURCE", this.f74031K1);
                bundle2.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
                this.f72421L0.finish();
                this.f72421L0.m92662fJ().m93069k2(GroupReminderComposeView.class, bundle2, 1, true);
                return;
            }
            return;
        }
        m80464BM();
        AbstractC2379w.m12432f(this.f74046U0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m80466LM()) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.an
                public /* synthetic */ RunnableC15443an() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPostComposeViewV2.this.m80444JM();
                }
            }, 200L);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: tM */
    void m80481tM(C7904b c7904b) {
        this.f74042S0.setVisibility(8);
        if (c7904b.f42729a == 1) {
            this.f74046U0.setText(c7904b.f42716D);
            C26405g c26405g = new C26405g();
            this.f74022B1 = c26405g;
            c26405g.f125484g = c7904b.f42736h;
            c26405g.f125488k = c7904b.f42742n;
            c26405g.f125480c = c7904b.f42737i;
            c26405g.f125481d = c7904b.f42738j;
            c26405g.f125482e = c7904b.f42739k;
            c26405g.f125489l = c7904b.f42745q;
            c26405g.f125485h = c7904b.f42743o;
            c26405g.f125490m = c7904b.f42740l;
            c26405g.f125487j = c7904b.f42741m;
            c26405g.f125478a = c7904b.m40768f();
            m80479aN();
        } else {
            this.f74046U0.setText(c7904b.f42736h);
        }
        CustomEditText customEditText = this.f74046U0;
        customEditText.setSelection(customEditText.getText().length());
        m80478ZM();
    }

    /* renamed from: uM */
    void m80482uM(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f74046U0.setText(str);
            this.f74046U0.requestFocus();
            this.f74046U0.setSelection(str.length());
        }
        if (!TextUtils.isEmpty(str2)) {
            m80485zM(str2, false);
        }
        m80480bN();
        m80478ZM();
        if (this.f74042S0.getVisibility() == 0) {
            AbstractC23184q2.m119437B(this.f74044T0, 1000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x004a, B:8:0x0053, B:10:0x0059, B:11:0x0060, B:13:0x006b, B:15:0x0071, B:18:0x0078, B:20:0x0089, B:22:0x008f, B:23:0x0096, B:25:0x00a3, B:27:0x00ad, B:29:0x00b1, B:31:0x00bf, B:32:0x00d9, B:33:0x00ff, B:37:0x00e1, B:38:0x0082), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0002, B:5:0x001d, B:7:0x004a, B:8:0x0053, B:10:0x0059, B:11:0x0060, B:13:0x006b, B:15:0x0071, B:18:0x0078, B:20:0x0089, B:22:0x008f, B:23:0x0096, B:25:0x00a3, B:27:0x00ad, B:29:0x00b1, B:31:0x00bf, B:32:0x00d9, B:33:0x00ff, B:37:0x00e1, B:38:0x0082), top: B:2:0x0002 }] */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37135xJ(Bundle bundle) {
        String str;
        String string;
        C7904b c7904b;
        try {
            super.mo37135xJ(bundle);
            this.f74063k1 = ViewConfiguration.get(this.f72421L0.getContext()).getScaledTouchSlop();
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f74077y1 = m92642L3.getString("extra_group_id");
                this.f74025E1 = m92642L3.getString("EXTRA_SUGGEST_ID", "");
                this.f74026F1 = m92642L3.getString("extra_preload_data", "");
                this.f74031K1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", -1);
                C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74077y1);
                if (m4472f == null) {
                    str = "";
                } else {
                    str = m4472f.m153793y();
                }
                if (m87077NK() != null) {
                    m87077NK().setMiddleSubtitle(str);
                }
                this.f74023C1 = m92642L3.getBoolean("extra_pin_post", false);
                if (m4472f != null && m4472f.m153763h0() && !m4472f.m153742T()) {
                    this.f74023C1 = false;
                    this.f74042S0.setVisibility(8);
                    if (m4472f != null && m4472f.m153747Y()) {
                        this.f74046U0.setHint(AbstractC8020f0.str_community_post_input_hint);
                    }
                    string = m92642L3.getString("extra_group_board_gen_id", "");
                    if (TextUtils.isEmpty(string)) {
                        C31988k5 m132062h = C25490c.m132054j().m132062h(string);
                        if (m132062h != null && (c7904b = m132062h.f147201b) != null) {
                            this.f74078z1 = c7904b;
                            m80481tM(c7904b);
                            m80470RM(1);
                            if (m87077NK() != null) {
                                m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post));
                                m87077NK().setTrailingButtonText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_group_reminder_btn_done));
                            }
                            AbstractC2364o0.m12370m(this.f74046U0, 100L);
                        }
                    } else {
                        m80482uM(m92642L3.getString("EXTRA_POST_CONTENT", ""), m92642L3.getString("EXTRA_LINK", ""));
                        m80470RM(1);
                        this.f74075w1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.en
                            public /* synthetic */ RunnableC15594en() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupPostComposeViewV2.this.m80441GM();
                            }
                        }, 300L);
                    }
                    m80477YM();
                }
                this.f74042S0.setVisibility(0);
                if (m4472f != null) {
                    this.f74046U0.setHint(AbstractC8020f0.str_community_post_input_hint);
                }
                string = m92642L3.getString("extra_group_board_gen_id", "");
                if (TextUtils.isEmpty(string)) {
                }
                m80477YM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xM */
    void m80483xM() {
        if (this.f74023C1 && m80461vM() && m80462wM()) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14420f());
            String str = this.f74077y1;
            C7904b c7904b = this.f74021A1;
            c0766k.mo1476L6(str, c7904b.f42729a, c7904b.f42715C);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: yJ */
    public void mo46830yJ(WindowInsets windowInsets) {
        super.mo46830yJ(windowInsets);
        m80447OM();
    }

    /* renamed from: yM */
    void m80484yM() {
        String str;
        C7904b c7904b = this.f74078z1;
        if (c7904b != null) {
            String trim = c7904b.f42736h.trim();
            C7904b c7904b2 = this.f74078z1;
            String str2 = "";
            if (c7904b2.f42729a != 1) {
                str = "";
            } else {
                trim = c7904b2.f42716D.trim();
                str = this.f74078z1.f42738j;
            }
            C26405g c26405g = this.f74022B1;
            if (c26405g != null) {
                str2 = c26405g.f125481d;
            }
            this.f74032L1 = !trim.equals(this.f74046U0.getText().toString().trim());
            this.f74033M1 = !str.equals(str2);
        }
    }

    /* renamed from: zM */
    boolean m80485zM(String str, boolean z11) {
        if (this.f74022B1 == null && !this.f74035O1) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String m153548n = C31944h6.m153548n(AbstractC23244v8.m119747k(str).trim());
                        if (!TextUtils.isEmpty(m153548n)) {
                            if (z11) {
                                AbstractC23647d.m123897g("1001614");
                            }
                            m80463AM(m153548n);
                            return true;
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
        return false;
    }
}
