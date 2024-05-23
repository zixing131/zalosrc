package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import am.C0943w;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import au.AbstractC2353j;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.datetimepicker.C8003a;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.EmojiBottomSheetView;
import com.zing.zalo.p077ui.zviews.RepeatTypeBottomPicker;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import ge.C19411c;
import ge.C19424p;
import ge.C19425q;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import l80.C22121a;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p193h0.AbstractC19694b;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p459qs.C25490c;
import p588vw.C28652r;
import p716zh.C31973j5;
import p716zh.C31988k5;
import p716zh.C31997l;
import p716zh.C32104s5;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class GroupReminderComposeView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC0733x {

    /* renamed from: F1 */
    C19411c f74176F1;

    /* renamed from: O1 */
    String f74185O1;

    /* renamed from: P0 */
    KeyboardFrameLayout f74186P0;

    /* renamed from: P1 */
    String f74187P1;

    /* renamed from: Q0 */
    KeyboardAwareRelativeLayout f74188Q0;

    /* renamed from: Q1 */
    String f74189Q1;

    /* renamed from: R0 */
    CustomEditText f74190R0;

    /* renamed from: S0 */
    View f74192S0;

    /* renamed from: T0 */
    ImageView f74194T0;

    /* renamed from: U0 */
    RobotoTextView f74196U0;

    /* renamed from: V0 */
    RobotoTextView f74197V0;

    /* renamed from: W0 */
    View f74198W0;

    /* renamed from: X0 */
    ImageView f74199X0;

    /* renamed from: Y0 */
    RobotoTextView f74200Y0;

    /* renamed from: Z0 */
    View f74201Z0;

    /* renamed from: a1 */
    ImageView f74202a1;

    /* renamed from: b1 */
    RobotoTextView f74203b1;

    /* renamed from: c1 */
    ModulesView f74204c1;

    /* renamed from: d1 */
    C22126c0 f74205d1;

    /* renamed from: e1 */
    C22126c0 f74206e1;

    /* renamed from: f1 */
    View f74207f1;

    /* renamed from: g1 */
    ImageView f74208g1;

    /* renamed from: h1 */
    RobotoTextView f74209h1;

    /* renamed from: i1 */
    ImageView f74210i1;

    /* renamed from: j1 */
    RobotoTextView f74211j1;

    /* renamed from: k1 */
    View f74212k1;

    /* renamed from: l1 */
    TextView f74213l1;

    /* renamed from: m1 */
    C23528a f74214m1;

    /* renamed from: q1 */
    C19425q f74218q1;

    /* renamed from: r1 */
    String f74219r1;

    /* renamed from: u1 */
    C19411c.a.e f74222u1;

    /* renamed from: v1 */
    C7904b f74223v1;

    /* renamed from: w1 */
    String f74224w1;

    /* renamed from: x1 */
    String f74225x1;

    /* renamed from: y1 */
    String f74226y1;

    /* renamed from: n1 */
    boolean f74215n1 = false;

    /* renamed from: o1 */
    long f74216o1 = Long.MIN_VALUE;

    /* renamed from: p1 */
    int f74217p1 = 0;

    /* renamed from: s1 */
    boolean f74220s1 = false;

    /* renamed from: t1 */
    int f74221t1 = 0;

    /* renamed from: z1 */
    boolean f74227z1 = true;

    /* renamed from: A1 */
    boolean f74171A1 = true;

    /* renamed from: B1 */
    boolean f74172B1 = true;

    /* renamed from: C1 */
    boolean f74173C1 = true;

    /* renamed from: D1 */
    boolean f74174D1 = false;

    /* renamed from: E1 */
    Calendar f74175E1 = Calendar.getInstance();

    /* renamed from: G1 */
    int f74177G1 = 2;

    /* renamed from: H1 */
    boolean f74178H1 = false;

    /* renamed from: I1 */
    int f74179I1 = -1;

    /* renamed from: J1 */
    int f74180J1 = 0;

    /* renamed from: K1 */
    boolean f74181K1 = true;

    /* renamed from: L1 */
    int f74182L1 = 0;

    /* renamed from: M1 */
    String f74183M1 = "";

    /* renamed from: N1 */
    String f74184N1 = "0";

    /* renamed from: R1 */
    EmojiBottomSheetView f74191R1 = null;

    /* renamed from: S1 */
    boolean f74193S1 = false;

    /* renamed from: T1 */
    int f74195T1 = -1;

    /* loaded from: classes6.dex */
    public static class GroupPostDialog extends DialogView {

        /* renamed from: H0 */
        GroupReminderComposeView f74228H0;

        /* renamed from: WK */
        public static GroupPostDialog m80624WK(int i11, GroupReminderComposeView groupReminderComposeView) {
            GroupPostDialog groupPostDialog = new GroupPostDialog();
            groupPostDialog.f74228H0 = groupReminderComposeView;
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            groupPostDialog.mo60305zK(bundle);
            return groupPostDialog;
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            int i11;
            C8009j c8009j = null;
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (this.f74228H0 != null && bundle == null) {
                int i12 = m92642L3().getInt("id");
                if (i12 != 1) {
                    if (i12 != 5) {
                        if (i12 == 6) {
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
                    C8009j.a m43159h = aVar3.m43159h(7);
                    if (this.f74228H0.f74174D1) {
                        i11 = AbstractC8020f0.str_havent_save_changed_ask_to_exit_edit_reminder_view;
                    } else {
                        i11 = AbstractC8020f0.str_havent_save_changed_ask_to_exit_create_reminder_view;
                    }
                    m43159h.m43162k(AbstractC23136l9.m118743r0(i11)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this.f74228H0);
                    c8009j = aVar3.m43152a();
                }
                if (c8009j != null) {
                    c8009j.m92853D(i12);
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
            m92642L3().getInt("id");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$a */
    /* loaded from: classes6.dex */
    class C14435a implements KeyboardFrameLayout.InterfaceC13508a {
        C14435a() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                GroupReminderComposeView.this.f74190R0.setCursorVisible(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            try {
                GroupReminderComposeView.this.f74190R0.setCursorVisible(true);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$b */
    /* loaded from: classes6.dex */
    class C14436b extends AbstractC18391a {
        C14436b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (GroupReminderComposeView.this.f74190R0.getText().length() > 3000) {
                    ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_max_chars_input), 3000));
                    GroupReminderComposeView.this.f74190R0.setText(GroupReminderComposeView.this.f74190R0.getText().toString().substring(0, 3000));
                    GroupReminderComposeView.this.f74190R0.setSelection(3000);
                } else {
                    GroupReminderComposeView.this.m80600LM();
                    GroupReminderComposeView.this.m80606TM();
                    C28652r.m143349v().m143361W(editable);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$c */
    /* loaded from: classes6.dex */
    class C14437c extends ZdsActionBar.AbstractC16987c {
        C14437c() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            if (GroupReminderComposeView.this.m80597FM()) {
                return;
            }
            GroupReminderComposeView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$d */
    /* loaded from: classes6.dex */
    public class C14438d implements C8003a.b {
        C14438d() {
        }

        @Override // com.zing.zalo.dialog.datetimepicker.C8003a.b
        /* renamed from: a */
        public void mo43146a(Date date, boolean z11) {
            C19424p c19424p;
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = 31536000000L + currentTimeMillis;
            long time = date.getTime();
            GroupReminderComposeView groupReminderComposeView = GroupReminderComposeView.this;
            boolean z12 = groupReminderComposeView.f74178H1;
            if (!z12 && time < currentTimeMillis) {
                groupReminderComposeView.m80604RM(5);
            } else if (!z12 && time > j11) {
                groupReminderComposeView.m80604RM(6);
            } else {
                groupReminderComposeView.f74216o1 = time;
                groupReminderComposeView.m80610XM(time, z11);
                GroupReminderComposeView groupReminderComposeView2 = GroupReminderComposeView.this;
                C19425q c19425q = groupReminderComposeView2.f74218q1;
                if (c19425q != null && (c19424p = c19425q.f96376a) != null) {
                    boolean z13 = true;
                    if (c19424p.f96375f != 1) {
                        z13 = false;
                    }
                    if (z11 != z13) {
                        c19424p.f96375f = groupReminderComposeView2.f74217p1;
                        groupReminderComposeView2.f74219r1 = c19425q.m101573a().toString();
                        GroupReminderComposeView groupReminderComposeView3 = GroupReminderComposeView.this;
                        groupReminderComposeView3.m80608VM(groupReminderComposeView3.f74218q1.f96376a);
                    }
                }
                GroupReminderComposeView.this.m80616rM();
                GroupReminderComposeView.this.m80606TM();
            }
            GroupReminderComposeView.this.f74215n1 = false;
        }

        @Override // com.zing.zalo.dialog.datetimepicker.C8003a.b
        /* renamed from: b */
        public void mo43147b() {
            GroupReminderComposeView.this.f74215n1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$e */
    /* loaded from: classes6.dex */
    public class C14439e implements InterfaceC20094a {
        C14439e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                GroupReminderComposeView.this.f72421L0.mo49315c4();
                if (c20096c != null) {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                }
                GroupReminderComposeView.this.f74193S1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                GroupReminderComposeView groupReminderComposeView = GroupReminderComposeView.this;
                groupReminderComposeView.f74193S1 = false;
                groupReminderComposeView.mo49315c4();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    if (GroupReminderComposeView.this.f74174D1) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("attend");
                        if (optJSONObject2 != null) {
                            optJSONObject2.put("userResponse", GroupReminderComposeView.this.f74176F1.f96285y.f96250b);
                        }
                        optJSONObject.put("attend", optJSONObject2);
                    }
                    Intent intent = new Intent();
                    intent.putExtra("STR_EXTRA_JSON_EVENT_DETAIL", optJSONObject.toString());
                    GroupReminderComposeView.this.mo50035CK(-1, intent);
                } else {
                    GroupReminderComposeView.this.mo50035CK(-1, null);
                }
                GroupReminderComposeView.this.finish();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$f */
    /* loaded from: classes6.dex */
    public class C14440f implements InterfaceC20094a {
        C14440f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                GroupReminderComposeView.this.f72421L0.mo49315c4();
                if (c20096c != null) {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                }
                GroupReminderComposeView.this.f74193S1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                GroupReminderComposeView.this.f72421L0.mo49315c4();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    C7904b c7904b = new C7904b(optJSONObject, "group_" + GroupReminderComposeView.this.f74224w1);
                    if (optJSONObject.optBoolean("isPin")) {
                        AbstractC23184q2.m119438C(GroupReminderComposeView.this.f74224w1);
                    }
                    C31988k5 m132057c = C25490c.m132054j().m132057c(c7904b);
                    Intent intent = new Intent();
                    intent.putExtra("extra_group_board_gen_id", m132057c.m154218b());
                    GroupReminderComposeView.this.f72421L0.mo50035CK(-1, intent);
                } else {
                    GroupReminderComposeView.this.mo50035CK(-1, null);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupReminderComposeView groupReminderComposeView = GroupReminderComposeView.this;
            groupReminderComposeView.f74193S1 = false;
            groupReminderComposeView.f72421L0.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$g */
    /* loaded from: classes6.dex */
    public class C14441g implements InterfaceC20094a {
        C14441g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            GroupReminderComposeView groupReminderComposeView = GroupReminderComposeView.this;
            groupReminderComposeView.f74193S1 = false;
            groupReminderComposeView.f72421L0.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                Intent intent = new Intent();
                intent.putExtra("STR_EXTRA_JSON_EVENT_DETAIL", optJSONObject.toString());
                GroupReminderComposeView.this.mo50035CK(-1, intent);
                GroupReminderComposeView.this.f72421L0.finish();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupReminderComposeView.this.f74193S1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupReminderComposeView$h */
    /* loaded from: classes6.dex */
    public class C14442h implements InterfaceC20094a {
        C14442h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            GroupReminderComposeView groupReminderComposeView = GroupReminderComposeView.this;
            groupReminderComposeView.f74193S1 = false;
            groupReminderComposeView.f72421L0.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                GroupReminderComposeView.this.mo50035CK(-1, null);
                GroupReminderComposeView.this.f72421L0.finish();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupReminderComposeView.this.f74193S1 = false;
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m80580AM(C16719g c16719g) {
        C19425q c19425q;
        C19424p c19424p;
        m80609WM(false, -1);
        RobotoTextView robotoTextView = this.f74200Y0;
        if (robotoTextView != null && (c19425q = this.f74218q1) != null && (c19424p = c19425q.f96376a) != null) {
            robotoTextView.setText(c19424p.m101571c());
        }
        m80606TM();
    }

    /* renamed from: BM */
    public static /* synthetic */ boolean m80581BM(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* renamed from: CM */
    public /* synthetic */ void m80582CM(View view) {
        m80598JM();
    }

    /* renamed from: DM */
    public /* synthetic */ void m80583DM(String str) {
        TextView textView = this.f74213l1;
        if (textView != null) {
            textView.setText(str);
        }
        m80606TM();
        m80618tM();
    }

    /* renamed from: EM */
    public /* synthetic */ void m80584EM(C19424p c19424p) {
        if (c19424p != null && c19424p.f96370a != -1) {
            if (this.f74217p1 == 0) {
                AbstractC23647d.m123897g("77705004");
            } else {
                AbstractC23647d.m123897g("77705005");
            }
        }
        C19425q c19425q = this.f74218q1;
        c19425q.f96376a = c19424p;
        this.f74219r1 = c19425q.m101573a().toString();
        m80608VM(this.f74218q1.f96376a);
        m80616rM();
        m80606TM();
    }

    /* renamed from: GM */
    private void m80585GM(String str) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setTrailingButtonText(str);
        }
    }

    /* renamed from: HM */
    private void m80586HM(String str) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (str == null) {
                str = "";
            }
            m87077NK.setMiddleSubtitle(str);
        }
    }

    /* renamed from: IM */
    private void m80587IM(String str) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (str == null) {
                str = "";
            }
            m87077NK.setMiddleTitle(str);
        }
    }

    /* renamed from: MM */
    private void m80588MM(int i11) {
        this.f74182L1 = i11;
        m80606TM();
        int i12 = this.f74182L1;
        if (i12 != 1 && i12 != 2 && i12 != 3) {
            m80589OM(false);
        } else {
            m80589OM(true);
        }
        int i13 = this.f74182L1;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    this.f74208g1.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
                    this.f74210i1.setImageResource(AbstractC16803z.ic_icn_form_checkbox_round_checked);
                    return;
                }
                return;
            }
            this.f74208g1.setImageResource(AbstractC16803z.ic_icn_form_checkbox_round_checked);
            this.f74210i1.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
            return;
        }
        this.f74208g1.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
        this.f74210i1.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
    }

    /* renamed from: OM */
    private void m80589OM(boolean z11) {
        if (z11) {
            this.f74207f1.setVisibility(0);
        } else {
            this.f74207f1.setVisibility(8);
        }
    }

    /* renamed from: zM */
    public /* synthetic */ void m80596zM(C16719g c16719g) {
        C19425q c19425q;
        C19424p c19424p;
        if (this.f74200Y0 != null && (c19425q = this.f74218q1) != null && (c19424p = c19425q.f96376a) != null) {
            m80609WM(true, c19424p.f96370a);
            this.f74200Y0.setText(this.f74218q1.f96376a.m101571c());
        }
        m80606TM();
    }

    /* renamed from: FM */
    boolean m80597FM() {
        AbstractC2379w.m12430d(this.f74190R0);
        if (m87077NK() != null && m87077NK().getTrailingButton() != null && m87077NK().getTrailingButton().isEnabled()) {
            m80604RM(1);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) layoutInflater.inflate(AbstractC7409c0.group_reminder_compose_view, viewGroup, false);
        this.f74186P0 = keyboardFrameLayout;
        keyboardFrameLayout.setOnKeyboardListener(new C14435a());
        this.f74188Q0 = (KeyboardAwareRelativeLayout) this.f74186P0.findViewById(AbstractC6918a0.keyboard_aware_rl);
        if (this.f72421L0.m92676n2() instanceof Activity) {
            this.f72421L0.m92676n2().mo35554O(18);
            this.f74188Q0.setEnableMeasureKeyboard(false);
        }
        this.f74214m1 = new C23528a(this.f72421L0.getContext());
        this.f74186P0.findViewById(AbstractC6918a0.content_post).setOnClickListener(this);
        View findViewById = this.f74186P0.findViewById(AbstractC6918a0.icon_layout);
        this.f74212k1 = findViewById;
        findViewById.setOnClickListener(this);
        this.f74213l1 = (TextView) this.f74186P0.findViewById(AbstractC6918a0.icon_topic);
        CustomEditText customEditText = (CustomEditText) this.f74186P0.findViewById(AbstractC6918a0.et_group_topic);
        this.f74190R0 = customEditText;
        customEditText.setForceHideClearBtn(true);
        this.f74190R0.addTextChangedListener(new C14436b());
        this.f74190R0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.lo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m80581BM;
                m80581BM = GroupReminderComposeView.m80581BM(view, motionEvent);
                return m80581BM;
            }
        });
        View findViewById2 = this.f74186P0.findViewById(AbstractC6918a0.reminder_time_wrapper);
        this.f74192S0 = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f74194T0 = (ImageView) this.f74192S0.findViewById(AbstractC6918a0.reminder_time_icon);
        this.f74196U0 = (RobotoTextView) this.f74192S0.findViewById(AbstractC6918a0.reminder_time_text);
        this.f74197V0 = (RobotoTextView) this.f74192S0.findViewById(AbstractC6918a0.reminder__lunar_time_text);
        View findViewById3 = this.f74186P0.findViewById(AbstractC6918a0.reminder_repeat_wrapper);
        this.f74198W0 = findViewById3;
        findViewById3.setOnClickListener(this);
        this.f74199X0 = (ImageView) this.f74198W0.findViewById(AbstractC6918a0.reminder_repeat_icon);
        this.f74200Y0 = (RobotoTextView) this.f74198W0.findViewById(AbstractC6918a0.reminder_repeat_text);
        View findViewById4 = this.f74186P0.findViewById(AbstractC6918a0.reminder_location_wrapper);
        this.f74201Z0 = findViewById4;
        findViewById4.setOnClickListener(this);
        this.f74202a1 = (ImageView) this.f74201Z0.findViewById(AbstractC6918a0.reminder_location_icon);
        this.f74203b1 = (RobotoTextView) this.f74201Z0.findViewById(AbstractC6918a0.reminder_location_text);
        this.f74207f1 = this.f74186P0.findViewById(AbstractC6918a0.reminder_notify_wrapper);
        ImageView imageView = (ImageView) this.f74186P0.findViewById(AbstractC6918a0.cb_noti_for_only_me);
        this.f74208g1 = imageView;
        imageView.setOnClickListener(this);
        RobotoTextView robotoTextView = (RobotoTextView) this.f74186P0.findViewById(AbstractC6918a0.tv_noti_for_only_me);
        this.f74209h1 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        ImageView imageView2 = (ImageView) this.f74186P0.findViewById(AbstractC6918a0.cb_noti_for_group);
        this.f74210i1 = imageView2;
        imageView2.setOnClickListener(this);
        RobotoTextView robotoTextView2 = (RobotoTextView) this.f74186P0.findViewById(AbstractC6918a0.tv_noti_for_group);
        this.f74211j1 = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
        return this.f74186P0;
    }

    /* renamed from: JM */
    void m80598JM() {
        int i11 = this.f74177G1;
        if (i11 != 1 && i11 != 2) {
            AbstractC2379w.m12430d(this.f74190R0);
            m80599KM();
        } else {
            AbstractC2379w.m12430d(this.f74190R0);
            m80599KM();
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
            interfaceC17463d.dismiss();
            this.f72421L0.finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 52);
    }

    /* renamed from: KM */
    void m80599KM() {
        int i11;
        boolean z11;
        C19411c.a.e eVar;
        boolean z12;
        if (this.f74193S1) {
            return;
        }
        this.f74193S1 = true;
        try {
            i11 = this.f74177G1;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f74193S1 = false;
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                int i12 = this.f74221t1;
                if (i12 == -1) {
                    AbstractC23647d.m123897g("77705006");
                } else if (i12 == 1) {
                    AbstractC23647d.m123897g("77705007");
                }
                C7904b c7904b = new C7904b(0);
                c7904b.f42736h = this.f74190R0.getText().toString().trim();
                c7904b.f42731c = this.f74213l1.getText().toString();
                c7904b.f42732d = this.f74216o1;
                c7904b.f42735g = this.f74217p1;
                C7904b c7904b2 = this.f74223v1;
                if (c7904b2 == null) {
                    c7904b.f42715C = "0";
                    c7904b.f42734f = this.f74219r1;
                    c7904b.f42725M = this.f74180J1;
                } else {
                    c7904b.f42715C = c7904b2.f42715C;
                    c7904b.f42747s = c7904b2.f42747s;
                    c7904b.f42750v = c7904b2.f42750v;
                    c7904b.f42751w = c7904b2.f42751w;
                }
                c7904b.m40775m();
                if (TextUtils.isEmpty(this.f74224w1)) {
                    this.f74193S1 = false;
                    Bundle bundle = new Bundle();
                    bundle.putInt("INT_EXTRA_SUGGEST_CONTENT_TYPE", 0);
                    bundle.putString("extra_group_topic_info_json", c7904b.m40780r().toString());
                    bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 2);
                    bundle.putString("EXTRA_SUGGEST_ID", this.f74225x1);
                    if (!TextUtils.isEmpty(this.f74226y1)) {
                        bundle.putString("extra_preload_data", this.f74226y1);
                    }
                    this.f72421L0.m92662fJ().m93069k2(QuickCreateGroupView.class, bundle, 1, true);
                    return;
                }
                this.f72421L0.mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14440f());
                if (c7904b.f42715C.equals("0")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("srcType", this.f74179I1);
                    } catch (JSONException e12) {
                        AbstractC23350e.m122778h(e12);
                    }
                    c0766k.mo1717q5(this.f74224w1, c7904b, false, jSONObject.toString());
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (this.f74171A1) {
                    arrayList.add(new C32104s5(3, new Object[]{Integer.valueOf(c7904b.f42735g), Long.valueOf(c7904b.f42732d), Long.valueOf(c7904b.f42733e), Integer.valueOf(c7904b.f42725M)}));
                }
                if (this.f74172B1) {
                    arrayList.add(new C32104s5(4, c7904b.f42731c));
                }
                if (this.f74173C1) {
                    arrayList.add(new C32104s5(1, this.f74219r1));
                }
                if (this.f74227z1) {
                    arrayList.add(new C32104s5(0, c7904b.m40764b().toString()));
                }
                c0766k.mo1616cb(this.f74224w1, c7904b.f42715C, arrayList);
                return;
            }
            int i13 = 5;
            if (TextUtils.isEmpty(this.f74224w1)) {
                this.f74193S1 = false;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("INT_EXTRA_SUGGEST_CONTENT_TYPE", 0);
                C19411c c19411c = new C19411c();
                this.f74176F1 = c19411c;
                c19411c.f96279s = 5;
                c19411c.f96273m = this.f74190R0.getText().toString().trim();
                this.f74176F1.f96282v = new C19411c.b();
                this.f74176F1.f96282v.f96314a = this.f74213l1.getText().toString();
                C19411c c19411c2 = this.f74176F1;
                c19411c2.f96272l = this.f74217p1;
                c19411c2.f96262b = this.f74216o1;
                c19411c2.f96266f = this.f74180J1;
                c19411c2.f96276p = 1;
                c19411c2.f96277q = 2;
                c19411c2.f96270j = this.f74218q1.m101573a();
                this.f74176F1.f96281u = new C19411c.a();
                C19411c c19411c3 = this.f74176F1;
                C19411c.a aVar = c19411c3.f96281u;
                if (this.f74182L1 == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                aVar.f96293g = z12;
                bundle2.putString("STR_EXTRA_JSON_EVENT_DETAIL", c19411c3.mo101533h().toString());
                bundle2.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 2);
                bundle2.putString("EXTRA_SUGGEST_ID", this.f74225x1);
                if (!TextUtils.isEmpty(this.f74226y1)) {
                    bundle2.putString("extra_preload_data", this.f74226y1);
                }
                this.f72421L0.m92662fJ().m93069k2(QuickCreateGroupView.class, bundle2, 1, true);
                return;
            }
            mo46829Y();
            C0766k c0766k2 = new C0766k();
            c0766k2.mo1704o8(new C14439e());
            C19411c.a aVar2 = null;
            if (this.f74174D1) {
                ArrayList arrayList2 = new ArrayList();
                if (this.f74227z1) {
                    arrayList2.add(new C31997l(3, new Object[]{this.f74190R0.getText().toString().trim(), null}));
                    C19411c.a aVar3 = this.f74176F1.f96281u;
                    if (aVar3 != null && (eVar = aVar3.f96289c) != null) {
                        eVar.f96312g = null;
                        aVar2 = aVar3;
                    }
                }
                if (this.f74171A1) {
                    arrayList2.add(new C31997l(6, new Object[]{Integer.valueOf(this.f74217p1), Long.valueOf(this.f74216o1), Long.valueOf(this.f74216o1), Integer.valueOf(this.f74180J1)}));
                }
                if (this.f74172B1) {
                    C19411c.b bVar = new C19411c.b();
                    bVar.f96314a = this.f74213l1.getText().toString();
                    arrayList2.add(new C31997l(9, bVar.m101542a()));
                }
                if (this.f74173C1) {
                    arrayList2.add(new C31997l(4, this.f74218q1.m101573a()));
                }
                if (aVar2 != null) {
                    arrayList2.add(new C31997l(2, aVar2.m101534a()));
                }
                c0766k2.mo1650h5(Long.parseLong(this.f74176F1.f96261a), arrayList2);
                return;
            }
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74224w1);
            ArrayList arrayList3 = new ArrayList();
            if (this.f74178H1) {
                i13 = 4;
            }
            arrayList3.add(new C31997l(0, Integer.valueOf(i13)));
            C19411c.a aVar4 = new C19411c.a();
            aVar4.f96288b = new C19411c.a.c(this.f74224w1, m4472f.m153793y());
            if (this.f74182L1 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar4.f96293g = z11;
            C19411c.a.e eVar2 = this.f74222u1;
            if (eVar2 != null) {
                aVar4.f96289c = eVar2;
            }
            arrayList3.add(new C31997l(2, aVar4.m101534a()));
            arrayList3.add(new C31997l(3, new Object[]{this.f74190R0.getText().toString().trim(), null}));
            C19411c.b bVar2 = new C19411c.b();
            bVar2.f96314a = this.f74213l1.getText().toString();
            arrayList3.add(new C31997l(9, bVar2.m101542a()));
            arrayList3.add(new C31997l(6, new Object[]{Integer.valueOf(this.f74217p1), Long.valueOf(this.f74216o1), Long.valueOf(this.f74216o1), Integer.valueOf(this.f74180J1)}));
            arrayList3.add(new C31997l(7, 1));
            arrayList3.add(new C31997l(8, 2));
            arrayList3.add(new C31997l(4, this.f74218q1.m101573a()));
            String str = "";
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("srcType", this.f74179I1);
                str = jSONObject2.toString();
            } catch (Exception e13) {
                AbstractC23350e.m122778h(e13);
            }
            c0766k2.mo1388A7(arrayList3, str);
            return;
            AbstractC20110a.m104539h(e11);
            this.f74193S1 = false;
            return;
        }
        if (this.f74174D1) {
            m80607UM(Long.parseLong(this.f74176F1.f96261a));
        } else {
            m80620vM();
        }
    }

    /* renamed from: LM */
    void m80600LM() {
        try {
            String obj = this.f74190R0.getText().toString();
            int m119758v = AbstractC23244v8.m119758v(obj, System.getProperty("line.separator"));
            if (obj.length() <= 70 && m119758v <= 2) {
                this.f74190R0.setTextSize(1, 22.0f);
            }
            this.f74190R0.setTextSize(1, 16.0f);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: NM */
    void m80601NM(boolean z11) {
        this.f74181K1 = z11;
        if (z11) {
            View view = this.f74198W0;
            if (view != null) {
                view.setOnClickListener(this);
                this.f74198W0.setEnabled(true);
                C19425q c19425q = this.f74218q1;
                if (c19425q != null) {
                    m80608VM(c19425q.f96376a);
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.f74198W0;
        if (view2 != null) {
            view2.setOnClickListener(null);
            this.f74198W0.setEnabled(false);
            RobotoTextView robotoTextView = this.f74200Y0;
            robotoTextView.setTextColor(AbstractC23136l9.m118641B(robotoTextView.getContext(), AbstractC16801x.cMtxt2));
            ImageView imageView = this.f74199X0;
            imageView.setImageDrawable(AbstractC23136l9.m118665N(imageView.getContext(), AbstractC16803z.icn_groupboard_reminder_decor_repeat_disable));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C14437c());
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.po
                public /* synthetic */ ViewOnClickListenerC16026po() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupReminderComposeView.this.m80582CM(view);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:            if (r7 <= r3) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0027, code lost:            if (r3 <= Long.MIN_VALUE) goto L43;     */
    /* renamed from: PM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m80602PM() {
        long j11;
        boolean z11;
        if (this.f74215n1) {
            return;
        }
        boolean z12 = true;
        this.f74215n1 = true;
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = 31536000000L + currentTimeMillis;
        if (!this.f74178H1) {
            long j13 = this.f74216o1;
            if (j13 >= currentTimeMillis) {
            }
            this.f74175E1.setTimeInMillis(currentTimeMillis + 3600000);
            int i11 = this.f74175E1.get(12);
            int i12 = i11 % 5;
            if (i12 != 0) {
                int i13 = i11 / 5;
                if (i12 >= 3) {
                    i13++;
                }
                this.f74175E1.set(12, i13 * 5);
            }
            this.f74175E1.set(13, 0);
            this.f74175E1.set(14, 0);
            j11 = this.f74175E1.getTimeInMillis();
            C8003a.a m43139c = new C8003a.a(this.f72421L0.m92649TI()).m43142f(m80621wM()).m43138b(new Date(j11)).m43139c(true);
            if (this.f74217p1 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            C8003a.a m43140d = m43139c.m43140d(z11);
            if (this.f74180J1 == 1) {
                z12 = false;
            }
            m43140d.m43141e(z12).m43137a().m43136j();
            return;
        }
        j11 = this.f74216o1;
    }

    /* renamed from: QM */
    void m80603QM() {
        try {
            m80618tM();
            this.f74191R1 = EmojiBottomSheetView.m79472nL(new EmojiBottomSheetView.InterfaceC14247b() { // from class: com.zing.zalo.ui.zviews.mo
                public /* synthetic */ C15901mo() {
                }

                @Override // com.zing.zalo.p077ui.zviews.EmojiBottomSheetView.InterfaceC14247b
                /* renamed from: c */
                public final void mo79474c(String str) {
                    GroupReminderComposeView.this.m80583DM(str);
                }
            }, AbstractC8020f0.str_emoji_picker_title);
            this.f72421L0.m92649TI().m93060e2(0, this.f74191R1, "EmojiBottomSheetView", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: RM */
    public void m80604RM(int i11) {
        try {
            GroupPostDialog m80624WK = GroupPostDialog.m80624WK(i11, this);
            if (m80624WK.m92687sJ()) {
                m80624WK.dismiss();
            }
            m80624WK.mo83093TK(this.f72421L0.m92649TI());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: SM */
    void m80605SM() {
        try {
            m80619uM();
            C19424p c19424p = this.f74218q1.f96376a;
            boolean z11 = true;
            if (this.f74217p1 != 1) {
                z11 = false;
            }
            this.f72421L0.m92649TI().m93060e2(0, RepeatTypeBottomPicker.m83621sL(c19424p, z11, new RepeatTypeBottomPicker.InterfaceC14937a() { // from class: com.zing.zalo.ui.zviews.oo
                public /* synthetic */ C15989oo() {
                }

                @Override // com.zing.zalo.p077ui.zviews.RepeatTypeBottomPicker.InterfaceC14937a
                /* renamed from: f */
                public final void mo83625f(C19424p c19424p2) {
                    GroupReminderComposeView.this.m80584EM(c19424p2);
                }
            }), "RepeatTypeBottomPicker", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TM */
    void m80606TM() {
        Button button;
        if (m87077NK() != null) {
            button = m87077NK().getTrailingButton();
        } else {
            button = null;
        }
        if (button == null) {
            return;
        }
        boolean z11 = false;
        if (this.f74190R0.getText().toString().trim().length() > 0 && this.f74216o1 > Long.MIN_VALUE && m80623yM(this.f74182L1)) {
            int i11 = this.f74177G1;
            if (i11 != 1 && i11 != 2) {
                if (this.f74223v1 != null) {
                    m80617sM();
                    if (this.f74227z1 || this.f74171A1 || this.f74172B1 || this.f74173C1) {
                        z11 = true;
                    }
                    button.setEnabled(z11);
                    return;
                }
                button.setEnabled(true);
                return;
            }
            if (this.f74176F1 != null) {
                m80614pM();
                if (this.f74227z1 || this.f74171A1 || this.f74172B1 || this.f74173C1) {
                    z11 = true;
                }
                button.setEnabled(z11);
                return;
            }
            button.setEnabled(true);
            return;
        }
        button.setEnabled(false);
    }

    /* renamed from: UM */
    void m80607UM(long j11) {
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14441g());
        ArrayList arrayList = new ArrayList();
        if (this.f74227z1) {
            arrayList.add(new C31997l(3, new Object[]{this.f74190R0.getText().toString().trim(), ""}));
        }
        if (this.f74171A1) {
            arrayList.add(new C31997l(6, new Object[]{Integer.valueOf(this.f74217p1), Long.valueOf(this.f74216o1), Long.valueOf(this.f74216o1), Integer.valueOf(this.f74180J1)}));
        }
        if (this.f74172B1) {
            C19411c.b bVar = new C19411c.b();
            bVar.f96314a = this.f74213l1.getText().toString();
            arrayList.add(new C31997l(9, bVar.m101542a()));
        }
        if (this.f74173C1) {
            arrayList.add(new C31997l(4, this.f74218q1.m101573a()));
        }
        c0766k.mo1650h5(j11, arrayList);
    }

    /* renamed from: VM */
    void m80608VM(C19424p c19424p) {
        if (c19424p != null && c19424p.f96370a != -1) {
            if (this.f74181K1) {
                RobotoTextView robotoTextView = this.f74200Y0;
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.HeaderFormTitleColor));
                ImageView imageView = this.f74199X0;
                imageView.setImageDrawable(AbstractC19694b.m103336d(imageView.getContext(), AbstractC16803z.icn_groupboard_reminder_decor_repeat));
            }
            this.f74200Y0.setText(c19424p.m101571c());
            return;
        }
        RobotoTextView robotoTextView2 = this.f74200Y0;
        robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC21196a.TextColor2));
        ImageView imageView2 = this.f74199X0;
        imageView2.setImageDrawable(AbstractC19694b.m103336d(imageView2.getContext(), AbstractC16803z.icn_groupboard_reminder_decor_repeat_disable));
        this.f74200Y0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_reminder_select_repeat_hint));
    }

    /* renamed from: WM */
    void m80609WM(boolean z11, int i11) {
        int i12;
        this.f74220s1 = z11;
        if (z11) {
            this.f74221t1 = -1;
            this.f74218q1.f96376a.f96372c.clear();
            this.f74218q1.f96376a.f96373d.clear();
            this.f74218q1.f96376a.f96372c.add(-1);
            if (i11 == 3 && (i12 = this.f74195T1) != -1) {
                this.f74218q1.f96376a.f96373d.add(Integer.valueOf(i12));
            }
            C22126c0 c22126c0 = this.f74206e1;
            c22126c0.m89085A0(AbstractC23136l9.m118665N(c22126c0.getContext(), AbstractC16803z.bg_monthly_note_select));
            C22126c0 c22126c02 = this.f74206e1;
            c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC21196a.TextColor1));
            C22126c0 c22126c03 = this.f74205d1;
            c22126c03.m89085A0(AbstractC23136l9.m118665N(c22126c03.getContext(), AbstractC16803z.bg_monthly_note_unselect));
            C22126c0 c22126c04 = this.f74205d1;
            c22126c04.m111963K1(AbstractC23136l9.m118645D(c22126c04.getContext(), AbstractC16801x.color_press_gray_blue));
        } else {
            this.f74221t1 = 1;
            this.f74218q1.f96376a.f96372c.clear();
            this.f74218q1.f96376a.f96373d.clear();
            C22126c0 c22126c05 = this.f74205d1;
            c22126c05.m89085A0(AbstractC23136l9.m118665N(c22126c05.getContext(), AbstractC16803z.bg_monthly_note_select));
            C22126c0 c22126c06 = this.f74205d1;
            c22126c06.m111962J1(C23212s8.m119607o(c22126c06.getContext(), AbstractC21196a.TextColor1));
            C22126c0 c22126c07 = this.f74206e1;
            c22126c07.m89085A0(AbstractC23136l9.m118665N(c22126c07.getContext(), AbstractC16803z.bg_monthly_note_unselect));
            C22126c0 c22126c08 = this.f74206e1;
            c22126c08.m111963K1(AbstractC23136l9.m118645D(c22126c08.getContext(), AbstractC16801x.color_press_gray_blue));
        }
        this.f74219r1 = this.f74218q1.m101573a().toString();
    }

    /* renamed from: XM */
    void m80610XM(long j11, boolean z11) {
        if (j11 >= 0) {
            RobotoTextView robotoTextView = this.f74196U0;
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.HeaderFormTitleColor));
            ImageView imageView = this.f74194T0;
            imageView.setImageDrawable(AbstractC19694b.m103336d(imageView.getContext(), AbstractC16803z.icn_groupboard_reminder_decor_time_n));
            if (z11) {
                this.f74217p1 = 1;
                this.f74175E1.setTimeInMillis(this.f74216o1);
                StringBuilder sb2 = new StringBuilder();
                if (this.f74180J1 == 1) {
                    sb2.append(AbstractC23160o0.m119193G(this.f74175E1, true, true, true));
                } else {
                    sb2.append(AbstractC23160o0.m119213Q(this.f74216o1, true));
                }
                this.f74196U0.setText(sb2.toString());
                this.f74197V0.setVisibility(0);
                this.f74197V0.setText("(" + AbstractC23160o0.m119199J(this.f74175E1, true, false, false) + ")");
                return;
            }
            this.f74217p1 = 0;
            StringBuilder sb3 = new StringBuilder();
            if (this.f74180J1 == 1) {
                this.f74175E1.setTimeInMillis(this.f74216o1);
                sb3.append(AbstractC23160o0.m119193G(this.f74175E1, true, true, true));
            } else {
                sb3.append(AbstractC23160o0.m119213Q(this.f74216o1, true));
            }
            this.f74196U0.setText(sb3.toString());
            this.f74197V0.setVisibility(8);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupReminderComposeView";
    }

    /* renamed from: mM */
    void m80611mM(C7904b c7904b) {
        int i11;
        boolean z11;
        this.f74190R0.setText(c7904b.f42736h);
        CustomEditText customEditText = this.f74190R0;
        customEditText.setSelection(customEditText.getText().length());
        this.f74213l1.setText(c7904b.f42731c);
        int i12 = c7904b.f42735g;
        this.f74217p1 = i12;
        long j11 = c7904b.f42732d;
        boolean z12 = false;
        if (j11 > 0) {
            this.f74216o1 = j11;
            if (i12 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            m80610XM(j11, z11);
        }
        C19425q c19425q = new C19425q(c7904b.f42734f, c7904b.f42735g);
        this.f74218q1 = c19425q;
        this.f74219r1 = c7904b.f42734f;
        C19424p c19424p = c19425q.f96376a;
        if (c19424p != null && (((i11 = c19424p.f96370a) == 2 || i11 == 3) && c19424p.f96372c.contains(-1))) {
            z12 = true;
        }
        this.f74220s1 = z12;
        m80608VM(this.f74218q1.f96376a);
        m80616rM();
    }

    /* renamed from: nM */
    void m80612nM() {
        boolean z11;
        int i11;
        boolean z12;
        this.f74190R0.setText(this.f74176F1.f96273m);
        CustomEditText customEditText = this.f74190R0;
        customEditText.setSelection(customEditText.getText().length());
        C19411c.b bVar = this.f74176F1.f96282v;
        if (bVar != null) {
            this.f74213l1.setText(bVar.f96314a);
        }
        C19411c c19411c = this.f74176F1;
        int i12 = c19411c.f96272l;
        this.f74217p1 = i12;
        long j11 = c19411c.f96262b;
        if (j11 > 0) {
            this.f74216o1 = j11;
            if (i12 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            m80610XM(j11, z12);
        }
        C19411c c19411c2 = this.f74176F1;
        C19425q c19425q = new C19425q(c19411c2.f96270j, c19411c2.f96272l);
        this.f74218q1 = c19425q;
        String jSONArray = c19425q.m101573a().toString();
        this.f74219r1 = jSONArray;
        this.f74185O1 = jSONArray;
        C19424p c19424p = this.f74218q1.f96376a;
        if (c19424p != null && (((i11 = c19424p.f96370a) == 2 || i11 == 3) && c19424p.f96372c.contains(-1))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f74220s1 = z11;
        if (this.f74176F1.f96279s == 4) {
            this.f74178H1 = true;
            m80601NM(false);
        } else {
            m80601NM(true);
        }
        m80608VM(this.f74218q1.f96376a);
        m80616rM();
    }

    /* renamed from: oM */
    void m80613oM(String str, String str2, long j11, int i11, String str3) {
        boolean z11;
        int i12;
        boolean z12;
        if (!TextUtils.isEmpty(str)) {
            this.f74190R0.setText(str);
            this.f74190R0.requestFocus();
            this.f74190R0.setSelection(str.length());
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f74213l1.setText(str2);
        }
        boolean z13 = false;
        if (j11 > System.currentTimeMillis()) {
            this.f74216o1 = j11;
            if (i11 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            m80610XM(j11, z12);
        } else {
            this.f74175E1.setTimeInMillis(System.currentTimeMillis() + 3600000);
            if (this.f74180J1 == 1) {
                AbstractC23160o0.m119301w1(this.f74175E1);
            } else {
                int i13 = this.f74175E1.get(12);
                int i14 = i13 % 5;
                if (i14 != 0) {
                    int i15 = i13 / 5;
                    if (i14 >= 3) {
                        i15++;
                    }
                    this.f74175E1.set(12, i15 * 5);
                }
                this.f74175E1.set(13, 0);
                this.f74175E1.set(14, 0);
            }
            long timeInMillis = this.f74175E1.getTimeInMillis();
            this.f74216o1 = timeInMillis;
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            m80610XM(timeInMillis, z11);
        }
        if (!TextUtils.isEmpty(str3)) {
            C19425q c19425q = new C19425q(str3, i11);
            this.f74218q1 = c19425q;
            this.f74219r1 = str3;
            C19424p c19424p = c19425q.f96376a;
            if (c19424p != null && (((i12 = c19424p.f96370a) == 2 || i12 == 3) && c19424p.f96372c.contains(-1))) {
                z13 = true;
            }
            this.f74220s1 = z13;
            m80616rM();
        } else {
            this.f74218q1 = new C19425q();
        }
        m80608VM(this.f74218q1.f96376a);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.icon_layout) {
            m80603QM();
            return;
        }
        if (id2 == AbstractC6918a0.content_post) {
            AbstractC2379w.m12432f(this.f74190R0);
            return;
        }
        if (id2 == AbstractC6918a0.reminder_time_wrapper) {
            m80602PM();
            return;
        }
        if (id2 == AbstractC6918a0.reminder_repeat_wrapper) {
            m80605SM();
            return;
        }
        if (id2 != AbstractC6918a0.reminder_location_wrapper) {
            if (id2 != AbstractC6918a0.cb_noti_for_only_me && id2 != AbstractC6918a0.tv_noti_for_only_me) {
                if (id2 == AbstractC6918a0.cb_noti_for_group || id2 == AbstractC6918a0.tv_noti_for_group) {
                    m80588MM(3);
                    return;
                }
                return;
            }
            m80588MM(2);
        }
    }

    /* renamed from: pM */
    void m80614pM() {
        String str;
        boolean z11;
        boolean z12;
        String str2 = this.f74176F1.f96273m;
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = "";
        }
        boolean z13 = true;
        this.f74227z1 = !str.equals(this.f74190R0.getText().toString().trim());
        C19411c c19411c = this.f74176F1;
        if (c19411c.f96262b == this.f74216o1 && c19411c.f96272l == this.f74217p1) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f74171A1 = z11;
        C19411c.b bVar = c19411c.f96282v;
        if (bVar != null && !bVar.f96314a.equals(this.f74213l1.getText().toString())) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f74172B1 = z12;
        String str3 = this.f74185O1;
        if (str3 == null || str3.equals(this.f74219r1)) {
            z13 = false;
        }
        this.f74173C1 = z13;
    }

    /* renamed from: qM */
    void m80615qM() {
        C19424p c19424p;
        int i11;
        C19425q c19425q = this.f74218q1;
        if (c19425q != null && (c19424p = c19425q.f96376a) != null) {
            long j11 = this.f74216o1;
            if (j11 > Long.MIN_VALUE && (((i11 = c19424p.f96370a) == 2 || i11 == 3) && this.f74217p1 == 1)) {
                this.f74175E1.setTimeInMillis(j11);
                int[] m12344g = AbstractC2353j.m12344g(this.f74175E1.get(5), this.f74175E1.get(2) + 1, this.f74175E1.get(1), 7.0d);
                if (m12344g[0] == 30) {
                    this.f74218q1.f96376a.f96372c.clear();
                    this.f74218q1.f96376a.f96373d.clear();
                    this.f74218q1.f96376a.f96372c.add(-1);
                    C19424p c19424p2 = this.f74218q1.f96376a;
                    if (c19424p2.f96370a == 3) {
                        c19424p2.f96373d.add(Integer.valueOf(m12344g[1]));
                    }
                    this.f74219r1 = this.f74218q1.m101573a().toString();
                } else {
                    this.f74218q1.f96376a.f96372c.clear();
                    this.f74218q1.f96376a.f96373d.clear();
                    this.f74219r1 = this.f74218q1.m101573a().toString();
                }
            } else {
                c19424p.f96372c.clear();
                this.f74218q1.f96376a.f96373d.clear();
                this.f74219r1 = this.f74218q1.m101573a().toString();
            }
            m80608VM(this.f74218q1.f96376a);
        }
    }

    /* renamed from: rM */
    void m80616rM() {
        C19425q c19425q;
        C19424p c19424p;
        int i11;
        int i12;
        if (this.f74181K1 && (c19425q = this.f74218q1) != null && (c19424p = c19425q.f96376a) != null) {
            long j11 = this.f74216o1;
            if (j11 != -1 && ((i11 = c19424p.f96370a) == 2 || i11 == 3)) {
                this.f74175E1.setTimeInMillis(j11);
                if (this.f74217p1 != 1) {
                    if (this.f74175E1.get(5) == this.f74175E1.getActualMaximum(5) && ((i12 = this.f74218q1.f96376a.f96370a) == 2 || (i12 == 3 && this.f74175E1.get(2) == 1))) {
                        if (m80622xM().getVisibility() != 0) {
                            this.f74204c1.setVisibility(0);
                        }
                        this.f74205d1.m111959G1(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_day_of_month), Integer.valueOf(this.f74175E1.get(5))));
                        this.f74195T1 = this.f74175E1.get(2) + 1;
                        m80609WM(this.f74220s1, this.f74218q1.f96376a.f96370a);
                        return;
                    }
                    ModulesView modulesView = this.f74204c1;
                    if (modulesView != null && modulesView.getVisibility() != 8) {
                        this.f74218q1.f96376a.f96372c.clear();
                        this.f74218q1.f96376a.f96373d.clear();
                        this.f74219r1 = this.f74218q1.m101573a().toString();
                        this.f74220s1 = false;
                        this.f74221t1 = 0;
                        this.f74204c1.setVisibility(8);
                        return;
                    }
                    return;
                }
                int[] m12344g = AbstractC2353j.m12344g(this.f74175E1.get(5), this.f74175E1.get(2) + 1, this.f74175E1.get(1), 7.0d);
                this.f74175E1.add(5, 1);
                if (m12344g[1] != AbstractC2353j.m12344g(this.f74175E1.get(5), this.f74175E1.get(2) + 1, this.f74175E1.get(1), 7.0d)[1]) {
                    if (m80622xM().getVisibility() != 0) {
                        this.f74204c1.setVisibility(0);
                    }
                    this.f74205d1.m111959G1(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_day_of_month), Integer.valueOf(m12344g[0])));
                    this.f74195T1 = m12344g[1];
                    m80609WM(this.f74220s1, this.f74218q1.f96376a.f96370a);
                    return;
                }
                ModulesView modulesView2 = this.f74204c1;
                if (modulesView2 != null && modulesView2.getVisibility() != 8) {
                    this.f74218q1.f96376a.f96372c.clear();
                    this.f74218q1.f96376a.f96373d.clear();
                    this.f74219r1 = this.f74218q1.m101573a().toString();
                    this.f74220s1 = false;
                    this.f74221t1 = 0;
                    this.f74204c1.setVisibility(8);
                    return;
                }
                return;
            }
            ModulesView modulesView3 = this.f74204c1;
            if (modulesView3 != null && modulesView3.getVisibility() != 8) {
                this.f74218q1.f96376a.f96372c.clear();
                this.f74218q1.f96376a.f96373d.clear();
                this.f74219r1 = this.f74218q1.m101573a().toString();
                this.f74220s1 = false;
                this.f74221t1 = 0;
                this.f74204c1.setVisibility(8);
                return;
            }
            return;
        }
        m80615qM();
    }

    /* renamed from: sM */
    void m80617sM() {
        boolean z11;
        String str;
        if (this.f74223v1 != null) {
            boolean z12 = true;
            this.f74227z1 = !r0.f42736h.trim().equals(this.f74190R0.getText().toString().trim());
            C7904b c7904b = this.f74223v1;
            if (c7904b.f42732d == this.f74216o1 && this.f74217p1 == c7904b.f42735g) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f74171A1 = z11;
            this.f74172B1 = !c7904b.f42731c.equals(this.f74213l1.getText().toString());
            if ((TextUtils.isEmpty(this.f74219r1) && TextUtils.isEmpty(this.f74223v1.f42734f)) || ((str = this.f74219r1) != null && str.equals(this.f74223v1.f42734f))) {
                z12 = false;
            }
            this.f74173C1 = z12;
        }
    }

    /* renamed from: tM */
    void m80618tM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("EmojiBottomSheetView");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: uM */
    void m80619uM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("RepeatTypeBottomPicker");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: vM */
    void m80620vM() {
        String str;
        boolean z11;
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14442h());
        ArrayList arrayList = new ArrayList();
        String trim = this.f74190R0.getText().toString().trim();
        String str2 = this.f74187P1;
        String str3 = this.f74189Q1;
        String str4 = CoreUtility.f89233i;
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str4);
        String str5 = "";
        if (m141809c == null) {
            str = "";
        } else {
            str = m141809c.mo2475c();
        }
        C19411c.a aVar = new C19411c.a();
        C19411c.a.e eVar = this.f74222u1;
        if (eVar != null) {
            aVar.f96289c = eVar;
        } else {
            aVar.f96289c = new C19411c.a.e(null, str, str4, str3, str2, 1, null);
        }
        if (this.f74182L1 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f96293g = z11;
        arrayList.add(new C31997l(0, 3));
        arrayList.add(new C31997l(1, new Object[]{str2}));
        arrayList.add(new C31997l(2, aVar.m101534a()));
        arrayList.add(new C31997l(3, new Object[]{trim, ""}));
        C19411c.b bVar = new C19411c.b();
        bVar.f96314a = this.f74213l1.getText().toString();
        arrayList.add(new C31997l(9, bVar.m101542a()));
        arrayList.add(new C31997l(6, new Object[]{Integer.valueOf(this.f74217p1), Long.valueOf(this.f74216o1), Long.valueOf(this.f74216o1), Integer.valueOf(this.f74180J1)}));
        arrayList.add(new C31997l(7, 1));
        arrayList.add(new C31997l(8, 1));
        arrayList.add(new C31997l(4, this.f74218q1.m101573a()));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 5);
            jSONObject.put("startTime", this.f74216o1);
            jSONObject.put("srcType", this.f74179I1);
            str5 = jSONObject.toString();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        c0766k.mo1388A7(arrayList, str5);
    }

    /* renamed from: wM */
    C8003a.b m80621wM() {
        return new C14438d();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (AbstractC23184q2.m119459q(this.f74224w1, i11, objArr)) {
                finish();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        try {
            super.mo37135xJ(bundle);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f74177G1 = m92642L3.getInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
                this.f74178H1 = m92642L3.getBoolean("BOL_EXTRA_IS_ANNI", false);
                this.f74180J1 = m92642L3.getInt("INT_EXTRA_ALLDAY", 0);
                m80601NM(!this.f74178H1);
                this.f74225x1 = m92642L3.getString("EXTRA_SUGGEST_ID", "");
                this.f74226y1 = m92642L3.getString("extra_preload_data", "");
                this.f74179I1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", -1);
                this.f74183M1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                this.f74184N1 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
                int i11 = this.f74177G1;
                if (i11 != 1) {
                    if (i11 != 2) {
                        this.f74224w1 = m92642L3.getString("extra_group_id");
                        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74224w1);
                        if (m4472f != null) {
                            m80586HM(m4472f.m153793y());
                        } else {
                            m80586HM("");
                        }
                        String string = m92642L3.getString("extra_group_board_gen_id", "");
                        if (!TextUtils.isEmpty(string)) {
                            C31988k5 m132062h = C25490c.m132054j().m132062h(string);
                            if (m132062h != null && m132062h.f147201b != null) {
                                this.f74174D1 = true;
                                m80585GM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_group_reminder_btn_done));
                                m80587IM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_group_reminder_title));
                                C7904b c7904b = m132062h.f147201b;
                                this.f74223v1 = c7904b;
                                m80611mM(c7904b);
                                this.f74180J1 = this.f74223v1.f42725M;
                            }
                        } else {
                            this.f74174D1 = false;
                            m80613oM(m92642L3.getString("EXTRA_POST_CONTENT", ""), m92642L3.getString("EXTRA_EMOJI", "⏰"), m92642L3.getLong("EXTRA_START_TIME", Long.MIN_VALUE), m92642L3.getInt("INT_EXTRA_CALENDAR_TYPE", 0), m92642L3.getString("STR_EXTRA_REPEAT_RULE"));
                            if (m92642L3.getBoolean("BOL_EXTRA_OPEN_TIME_PICKER", false)) {
                                mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.no
                                    public /* synthetic */ RunnableC15951no() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        GroupReminderComposeView.this.m80602PM();
                                    }
                                }, 200L);
                            }
                        }
                        this.f74211j1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder_notify_for_group));
                    } else {
                        this.f74211j1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder_notify_for_group));
                        String string2 = m92642L3.getString("STR_EXTRA_JSON_EVENT_DETAIL");
                        if (!TextUtils.isEmpty(string2)) {
                            try {
                                C19411c c19411c = new C19411c(new JSONObject(string2));
                                this.f74176F1 = c19411c;
                                if (c19411c.f96277q == 2) {
                                    this.f74224w1 = c19411c.f96278r;
                                }
                                this.f74180J1 = c19411c.f96266f;
                                this.f74217p1 = c19411c.f96272l;
                            } catch (Exception e11) {
                                AbstractC23350e.m122778h(e11);
                            }
                            this.f74174D1 = true;
                            m80612nM();
                            if (this.f74176F1.f96279s == 4) {
                                m80587IM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_anniversary_edit_title));
                                this.f74190R0.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_anniversary_input_hint));
                            } else {
                                m80587IM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_group_reminder_title));
                                this.f74190R0.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_time_remind_input_hint));
                            }
                            m80585GM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_group_reminder_btn_done));
                        } else {
                            if (this.f74178H1) {
                                m80587IM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_anni_event));
                                this.f74190R0.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_anniversary_input_hint));
                            } else {
                                m80587IM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_reminder_title));
                                this.f74190R0.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_time_remind_input_hint));
                            }
                            this.f74224w1 = m92642L3.getString("extra_group_id");
                            this.f74174D1 = false;
                            this.f74218q1 = new C19425q();
                            m80613oM(m92642L3.getString("EXTRA_POST_CONTENT", ""), m92642L3.getString("EXTRA_EMOJI", "⏰"), m92642L3.getLong("EXTRA_START_TIME", Long.MIN_VALUE), m92642L3.getInt("INT_EXTRA_CALENDAR_TYPE", 0), m92642L3.getString("STR_EXTRA_REPEAT_RULE"));
                            String string3 = m92642L3.getString("STR_EXTRA_EVENT_MSG_INFO");
                            if (!TextUtils.isEmpty(string3)) {
                                this.f74222u1 = new C19411c.a.e(new JSONObject(string3), this.f74224w1);
                            }
                            if (m92642L3.getBoolean("BOL_EXTRA_OPEN_TIME_PICKER", false)) {
                                mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.no
                                    public /* synthetic */ RunnableC15951no() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        GroupReminderComposeView.this.m80602PM();
                                    }
                                }, 200L);
                            }
                            if (m92642L3.containsKey("BOL_EXTRA_EVENT_ONLY_ME")) {
                                int i12 = m92642L3.getInt("BOL_EXTRA_EVENT_ONLY_ME", 0);
                                this.f74182L1 = i12;
                                m80588MM(i12);
                            }
                        }
                        C31973j5 m4472f2 = C0943w.m4462l().m4472f(this.f74224w1);
                        if (m4472f2 != null) {
                            m80586HM(m4472f2.m153793y());
                        } else {
                            m80586HM("");
                        }
                    }
                } else {
                    this.f74211j1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder_notify_for_both));
                    String string4 = m92642L3.getString("STR_EXTRA_JSON_EVENT_DETAIL");
                    if (!TextUtils.isEmpty(string4)) {
                        try {
                            C19411c c19411c2 = new C19411c(new JSONObject(string4));
                            this.f74176F1 = c19411c2;
                            this.f74217p1 = c19411c2.f96272l;
                        } catch (Exception e12) {
                            AbstractC23350e.m122778h(e12);
                        }
                        this.f74174D1 = true;
                        m80612nM();
                        m80587IM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_group_reminder_title));
                        m80586HM("");
                        m80585GM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_group_reminder_btn_done));
                    } else {
                        this.f74187P1 = m92642L3.getString("STR_EXTRA_CONTACT_UID");
                        this.f74189Q1 = m92642L3.getString("STR_EXTRA_CONTACT_NAME");
                        this.f74174D1 = false;
                        this.f74218q1 = new C19425q();
                        m80613oM(m92642L3.getString("EXTRA_POST_CONTENT", ""), m92642L3.getString("EXTRA_EMOJI", "⏰"), m92642L3.getLong("EXTRA_START_TIME", Long.MIN_VALUE), m92642L3.getInt("INT_EXTRA_CALENDAR_TYPE", 0), m92642L3.getString("STR_EXTRA_REPEAT_RULE"));
                        String string5 = m92642L3.getString("STR_EXTRA_EVENT_MSG_INFO");
                        if (!TextUtils.isEmpty(string5)) {
                            this.f74222u1 = new C19411c.a.e(new JSONObject(string5), null);
                        }
                        if (m92642L3.getBoolean("BOL_EXTRA_OPEN_TIME_PICKER", false)) {
                            mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.no
                                public /* synthetic */ RunnableC15951no() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    GroupReminderComposeView.this.m80602PM();
                                }
                            }, 200L);
                        }
                        m80586HM("");
                        if (m92642L3.containsKey("BOL_EXTRA_EVENT_ONLY_ME")) {
                            int i13 = m92642L3.getInt("BOL_EXTRA_EVENT_ONLY_ME", 0);
                            this.f74182L1 = i13;
                            m80588MM(i13);
                        }
                    }
                }
            }
            m80606TM();
            C0815e1.m2075D().m2100V(new C23648e(4, this.f74183M1, 1, "chat_reminder_create_full", this.f74184N1), false);
        } catch (Exception e13) {
            AbstractC23350e.m122778h(e13);
        }
    }

    /* renamed from: xM */
    ModulesView m80622xM() {
        if (this.f74204c1 == null) {
            this.f74204c1 = (ModulesView) this.f74186P0.findViewById(AbstractC6918a0.reminder_repeat_monthly_note_wrapper);
            C22121a c22121a = new C22121a(this.f72421L0.getContext());
            C22126c0 c22126c0 = new C22126c0(this.f72421L0.getContext());
            this.f74206e1 = c22126c0;
            c22126c0.mo111965M1(0);
            this.f74206e1.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_last_day_of_month));
            this.f74206e1.mo111964L1(AbstractC23136l9.m118742r(14.0f));
            this.f74206e1.m111953A1(1);
            C22126c0 c22126c02 = this.f74206e1;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c02.m111980v1(truncateAt);
            this.f74206e1.m89106L().m89028L(-2, -2).m89048d0(AbstractC23136l9.m118742r(8.0f)).m89044a0(AbstractC23136l9.m118742r(8.0f)).m89046b0(AbstractC23136l9.m118742r(8.0f)).m89047c0(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(6.0f)).m89036T(AbstractC23136l9.m118742r(6.0f));
            this.f74206e1.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.zviews.jo
                public /* synthetic */ C15779jo() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    GroupReminderComposeView.this.m80596zM(c16719g);
                }
            });
            C22126c0 c22126c03 = new C22126c0(this.f72421L0.getContext());
            this.f74205d1 = c22126c03;
            c22126c03.mo111965M1(0);
            this.f74205d1.mo111964L1(AbstractC23136l9.m118742r(14.0f));
            this.f74205d1.m111953A1(1);
            this.f74205d1.m111980v1(truncateAt);
            this.f74205d1.m89106L().m89028L(-2, -2).m89048d0(AbstractC23136l9.m118742r(8.0f)).m89044a0(AbstractC23136l9.m118742r(8.0f)).m89046b0(AbstractC23136l9.m118742r(8.0f)).m89047c0(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(6.0f)).m89036T(AbstractC23136l9.m118742r(6.0f));
            this.f74205d1.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.zviews.ko
                public /* synthetic */ C15822ko() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    GroupReminderComposeView.this.m80580AM(c16719g);
                }
            });
            c22121a.m89001g1(this.f74205d1);
            c22121a.m89001g1(this.f74206e1);
            this.f74204c1.mo69681L(c22121a);
        }
        return this.f74204c1;
    }

    /* renamed from: yM */
    boolean m80623yM(int i11) {
        return i11 != 1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 52);
    }
}
