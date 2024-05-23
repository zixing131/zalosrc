package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.AbstractC0857z0;
import ag0.C0804b;
import am.C0943w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SettingGroupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me0.AbstractC23116k0;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23217t2;
import me0.C23055e5;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p394oj.C24275a;
import p716zh.C31973j5;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import s00.InterfaceC26070e;

/* loaded from: classes6.dex */
public class SettingGroupView extends SlidableZaloView implements InterfaceC17463d.d, C23744a.c, InterfaceC26066a, InterfaceC0733x {

    /* renamed from: P0 */
    RecyclerView f77475P0;

    /* renamed from: Q0 */
    C15035h f77476Q0;

    /* renamed from: R0 */
    C31973j5 f77477R0;

    /* renamed from: S0 */
    Integer[] f77478S0;

    /* renamed from: T0 */
    LinearLayoutManager f77479T0;

    /* renamed from: U0 */
    InterfaceC26070e f77480U0;

    /* renamed from: V0 */
    HightLightSettingView f77481V0;

    /* renamed from: c1 */
    int f77488c1;

    /* renamed from: d1 */
    int f77489d1;

    /* renamed from: W0 */
    boolean f77482W0 = false;

    /* renamed from: X0 */
    int f77483X0 = -1;

    /* renamed from: Y0 */
    int f77484Y0 = -1;

    /* renamed from: Z0 */
    boolean f77485Z0 = false;

    /* renamed from: a1 */
    private final InterfaceC0765j f77486a1 = new C0766k();

    /* renamed from: b1 */
    private final InterfaceC20094a f77487b1 = new C15032e();

    /* renamed from: e1 */
    boolean f77490e1 = false;

    /* renamed from: f1 */
    private final InterfaceC0765j f77491f1 = new C0766k();

    /* renamed from: g1 */
    private final InterfaceC20094a f77492g1 = new C15033f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$a */
    /* loaded from: classes6.dex */
    public class C15028a extends RecyclerView.AbstractC1892s {
        C15028a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    SettingGroupView.this.f77476Q0.m84150a0(false);
                    SettingGroupView.this.f77476Q0.m10008p();
                } else {
                    SettingGroupView.this.f77476Q0.m84150a0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            SettingGroupView.this.m84112nM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$b */
    /* loaded from: classes6.dex */
    class C15029b extends AbstractC23116k0.a {
        C15029b() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            try {
                interfaceC17463d.dismiss();
                if (SettingGroupView.this.f77477R0 != null) {
                    if (i11 == 4) {
                        SettingGroupView.this.m92662fJ().m93060e2(AbstractC6918a0.zalo_view_container, GroupNotificationSettingView.m80298mM("group_" + SettingGroupView.this.f77477R0.m153781r(), null, 6), "SettingGroupView", 1, true);
                    } else {
                        SettingGroupView.this.m84111mM(AbstractC19646n0.m103040w0(i11, "group_" + SettingGroupView.this.f77477R0.m153781r(), true, 3));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$c */
    /* loaded from: classes6.dex */
    public class C15030c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f77495a;

        C15030c(C24275a c24275a) {
            this.f77495a = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                SettingGroupView.this.f72421L0.mo49315c4();
                SettingGroupView.this.f77482W0 = false;
                ToastUtils.showMess(c20096c.m104492d());
                AbstractC2364o0.m12369l(SettingGroupView.this.f72421L0.m92676n2(), SettingGroupView.this.f77476Q0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C7860a.Companion.m40303b().m40260C0();
                SettingGroupView.this.f72421L0.mo49315c4();
                SettingGroupView.this.f77482W0 = false;
                C0804b.m2025g().m2029b(this.f77495a);
                AbstractC2364o0.m12369l(SettingGroupView.this.f72421L0.m92676n2(), SettingGroupView.this.f77476Q0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$d */
    /* loaded from: classes6.dex */
    public class C15031d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77497a;

        C15031d(String str) {
            this.f77497a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                SettingGroupView.this.f72421L0.mo49315c4();
                SettingGroupView.this.f77482W0 = false;
                ToastUtils.showMess(c20096c.m104492d());
                AbstractC2364o0.m12369l(SettingGroupView.this.f72421L0.m92676n2(), SettingGroupView.this.f77476Q0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                SettingGroupView.this.f72421L0.mo49315c4();
                SettingGroupView.this.f77482W0 = false;
                C0804b.m2025g().m2035l(this.f77497a, true);
                AbstractC2364o0.m12369l(SettingGroupView.this.f72421L0.m92676n2(), SettingGroupView.this.f77476Q0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$e */
    /* loaded from: classes6.dex */
    public class C15032e implements InterfaceC20094a {
        C15032e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m84123e() {
            try {
                SettingGroupView.this.f77476Q0.m84152c0(AbstractC23309i.m122450u());
                SettingGroupView.this.f77476Q0.m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m84124f() {
            SettingGroupView.this.f77476Q0.m84152c0(AbstractC23309i.m122450u());
            SettingGroupView.this.f77476Q0.m10008p();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    if (SettingGroupView.this.f72421L0.m92676n2() != null) {
                        SettingGroupView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.vh0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingGroupView.C15032e.this.m84124f();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingGroupView settingGroupView = SettingGroupView.this;
                settingGroupView.f77485Z0 = false;
                settingGroupView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingGroupView settingGroupView2 = SettingGroupView.this;
                settingGroupView2.f77485Z0 = false;
                settingGroupView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    SettingGroupView settingGroupView = SettingGroupView.this;
                    if (settingGroupView.f77483X0 == 13 && settingGroupView.f77484Y0 == 0) {
                        C7860a.Companion.m40303b().m40260C0();
                    }
                    SettingGroupView settingGroupView2 = SettingGroupView.this;
                    int i11 = settingGroupView2.f77483X0;
                    AbstractC23148n.m118851y(i11, settingGroupView2.f77484Y0, i11);
                    if (SettingGroupView.this.f72421L0.m92676n2() != null) {
                        SettingGroupView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.wh0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingGroupView.C15032e.this.m84123e();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingGroupView settingGroupView3 = SettingGroupView.this;
                settingGroupView3.f77485Z0 = false;
                settingGroupView3.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingGroupView settingGroupView4 = SettingGroupView.this;
                settingGroupView4.f77485Z0 = false;
                settingGroupView4.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$f */
    /* loaded from: classes6.dex */
    public class C15033f implements InterfaceC20094a {
        C15033f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m84127e() {
            try {
                SettingGroupView settingGroupView = SettingGroupView.this;
                AbstractC23148n.m118848v(settingGroupView.f77488c1, settingGroupView.f77489d1);
                SettingGroupView.this.f77476Q0.m84152c0(AbstractC23309i.m122450u());
                SettingGroupView.this.f77476Q0.m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m84128f() {
            SettingGroupView.this.f77476Q0.m84152c0(AbstractC23309i.m122450u());
            SettingGroupView.this.f77476Q0.m10008p();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    if (SettingGroupView.this.f72421L0.m92676n2() != null) {
                        SettingGroupView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yh0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingGroupView.C15033f.this.m84128f();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingGroupView settingGroupView = SettingGroupView.this;
                settingGroupView.f77490e1 = false;
                settingGroupView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingGroupView settingGroupView2 = SettingGroupView.this;
                settingGroupView2.f77490e1 = false;
                settingGroupView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingGroupView.this.f72421L0.m92676n2() != null) {
                        SettingGroupView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.xh0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingGroupView.C15033f.this.m84127e();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingGroupView settingGroupView = SettingGroupView.this;
                settingGroupView.f77490e1 = false;
                settingGroupView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$g */
    /* loaded from: classes6.dex */
    public class C15034g extends AbstractC0857z0 {
        C15034g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static /* synthetic */ int m84131w(C31973j5 c31973j5, C31973j5 c31973j52) {
            return c31973j5.m153795z().compareToIgnoreCase(c31973j52.m153795z());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m84132x(List list) {
            try {
                C15035h c15035h = SettingGroupView.this.f77476Q0;
                if (c15035h != null) {
                    c15035h.m84151b0(list);
                    SettingGroupView.this.f77476Q0.m10008p();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public ArrayList mo2432g(Void... voidArr) {
            ArrayList m4474h = C0943w.m4462l().m4474h();
            Collections.sort(m4474h, new Comparator() { // from class: com.zing.zalo.ui.zviews.zh0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m84131w;
                    m84131w = SettingGroupView.C15034g.m84131w((C31973j5) obj, (C31973j5) obj2);
                    return m84131w;
                }
            });
            AbstractC23309i.m122565x3();
            return m4474h;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo2438n(final List list) {
            try {
                if (!SettingGroupView.this.f72421L0.m92677nJ() && !SettingGroupView.this.f72421L0.m92681pJ() && SettingGroupView.this.f72421L0.m92676n2() != null) {
                    SettingGroupView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ai0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingGroupView.C15034g.this.m84132x(list);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$h */
    /* loaded from: classes6.dex */
    public class C15035h extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        List f77502r = new ArrayList();

        /* renamed from: s */
        boolean f77503s = true;

        /* renamed from: t */
        boolean f77504t = false;

        /* renamed from: u */
        int f77505u = -1;

        /* renamed from: v */
        int f77506v = 0;

        /* renamed from: w */
        boolean f77507w = true;

        /* renamed from: x */
        boolean f77508x = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zviews.SettingGroupView$h$a */
        /* loaded from: classes6.dex */
        public class a extends RecyclerView.AbstractC1876c0 {

            /* renamed from: I */
            GroupAvatarView f77510I;

            /* renamed from: J */
            RobotoTextView f77511J;

            /* renamed from: K */
            Switch f77512K;

            /* renamed from: L */
            ListItemSetting f77513L;

            /* renamed from: M */
            ListItemSetting f77514M;

            /* renamed from: N */
            LinearLayout f77515N;

            /* renamed from: O */
            LinearLayout f77516O;

            /* renamed from: P */
            ViewGroup f77517P;

            /* renamed from: Q */
            View f77518Q;

            /* renamed from: R */
            View f77519R;

            public a(View view, int i11) {
                super(view);
                if (i11 == 1) {
                    this.f77519R = view.findViewById(AbstractC6918a0.layout_empty);
                    this.f77513L = (ListItemSetting) view.findViewById(AbstractC6918a0.item_noti_new_msg);
                    this.f77514M = (ListItemSetting) view.findViewById(AbstractC6918a0.item_preview_message);
                    this.f77516O = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_noti_group);
                    this.f77515N = (LinearLayout) view.findViewById(AbstractC6918a0.ll_hint_setting_group);
                    this.f77517P = (ViewGroup) view.findViewById(AbstractC6918a0.zinstant_banner);
                    this.f77518Q = view.findViewById(AbstractC6918a0.title_section_group);
                    this.f77517P.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.fi0
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                            SettingGroupView.C15035h.a.this.m84157m0(view2, i12, i13, i14, i15, i16, i17, i18, i19);
                        }
                    });
                    this.f77513L.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.gi0
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                            SettingGroupView.C15035h.a.this.m84158n0(compoundButton, z11);
                        }
                    });
                    this.f77514M.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.hi0
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                            SettingGroupView.C15035h.a.this.m84159o0(compoundButton, z11);
                        }
                    });
                    this.f77514M.m90592m(false);
                    return;
                }
                this.f77510I = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
                this.f77511J = (RobotoTextView) view.findViewById(AbstractC6918a0.groupDisplayName);
                this.f77512K = (Switch) view.findViewById(AbstractC6918a0.stencil_switch);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: m0 */
            public /* synthetic */ void m84157m0(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                SettingGroupView.this.m84112nM();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: n0 */
            public /* synthetic */ void m84158n0(CompoundButton compoundButton, boolean z11) {
                m84161q0(this.f77513L, z11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: o0 */
            public /* synthetic */ void m84159o0(CompoundButton compoundButton, boolean z11) {
                m84161q0(this.f77514M, z11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: p0 */
            public /* synthetic */ void m84160p0() {
                this.f77513L.setSwitch(true);
            }

            /* renamed from: q0 */
            public void m84161q0(ListItemSetting listItemSetting, boolean z11) {
                if (this.f77513L == listItemSetting) {
                    if (z11) {
                        SettingGroupView.this.m84119o3(13, 1);
                    } else {
                        SettingGroupView.this.showDialog(2);
                        this.f77513L.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ii0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingGroupView.C15035h.a.this.m84160p0();
                            }
                        });
                    }
                    AbstractC26084s.m134269q(0, 65);
                    return;
                }
                if (this.f77514M == listItemSetting) {
                    SettingGroupView.this.m84118Ie(9, !z11 ? 1 : 0);
                    AbstractC26084s.m134269q(0, 66);
                }
            }
        }

        C15035h() {
        }

        /* renamed from: P */
        private void m84139P() {
            this.f77505u = -1;
            this.f77506v = 0;
            AbstractC23217t2.m119650b(SettingGroupView.this.f72421L0.m92642L3());
        }

        /* renamed from: S */
        private void m84140S(final a aVar) {
            if (this.f77505u >= 0) {
                try {
                    aVar.f7784p.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.di0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingGroupView.C15035h.this.m84142U(aVar);
                        }
                    }, 300L);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: T */
        public /* synthetic */ void m84141T(View view, int i11) {
            try {
                m84145Q(view, SettingGroupView.this.f77481V0, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U */
        public /* synthetic */ void m84142U(a aVar) {
            final ListItemSetting listItemSetting;
            long j11;
            try {
                int i11 = this.f77505u;
                if (i11 != 65) {
                    if (i11 != 66) {
                        listItemSetting = null;
                    } else {
                        listItemSetting = aVar.f77514M;
                    }
                } else {
                    listItemSetting = aVar.f77513L;
                }
                if (listItemSetting != null && listItemSetting.getVisibility() == 0) {
                    int[] iArr = new int[2];
                    listItemSetting.getLocationOnScreen(iArr);
                    if (iArr[1] + (listItemSetting.getWidth() / 2) > AbstractC23136l9.m118713h0() / 2) {
                        SettingGroupView.this.f77475P0.scrollBy(0, (iArr[1] + (listItemSetting.getWidth() / 2)) - (AbstractC23136l9.m118713h0() / 2));
                        j11 = 80;
                    } else {
                        j11 = 0;
                    }
                    if (AbstractC23217t2.m119659k(this.f77506v)) {
                        if (j11 > 0) {
                            final int i12 = this.f77506v;
                            listItemSetting.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ei0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingGroupView.C15035h.this.m84141T(listItemSetting, i12);
                                }
                            }, j11);
                        } else {
                            m84145Q(listItemSetting, SettingGroupView.this.f77481V0, this.f77506v);
                        }
                    }
                }
                m84139P();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: V */
        public /* synthetic */ void m84143V(C31973j5 c31973j5, View view) {
            SettingGroupView.this.f77477R0 = c31973j5;
            if (C0804b.m2025g().m2033i("group_" + c31973j5.m153781r())) {
                SettingGroupView.this.m84116sM();
            } else {
                SettingGroupView.this.f72421L0.showDialog(1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m84144W(C31973j5 c31973j5, View view) {
            SettingGroupView.this.f77477R0 = c31973j5;
            if (C0804b.m2025g().m2033i("group_" + c31973j5.m153781r())) {
                SettingGroupView.this.m84116sM();
            } else {
                SettingGroupView.this.f72421L0.showDialog(1);
            }
        }

        /* renamed from: Q */
        void m84145Q(View view, HightLightSettingView hightLightSettingView, int i11) {
            if (AbstractC23217t2.m119660l(i11)) {
                AbstractC23136l9.m118648E0(view, AbstractC23217t2.m119657i(i11), 1000L, true, view.getBackground(), null);
            } else {
                hightLightSettingView.m75744f(view, 1000L);
            }
        }

        /* renamed from: R */
        public C31973j5 m84146R(int i11) {
            int i12 = i11 - 1;
            if (i12 >= 0 && i12 < this.f77502r.size()) {
                return (C31973j5) this.f77502r.get(i12);
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public void mo9990A(a aVar, int i11) {
            try {
                if (mo10005m(i11) == 2) {
                    final C31973j5 m84146R = m84146R(i11);
                    if (m84146R != null) {
                        aVar.f77511J.setText(m84146R.m153793y());
                        if (aVar.f77510I.getViewType() > 1) {
                            aVar.f77510I.setImageOption(C23278z2.m120143n());
                        } else {
                            aVar.f77510I.setImageOption(C23278z2.m120141m0());
                        }
                        if (m84146R.m153786t0()) {
                            aVar.f77510I.m75732d(m84146R.m153756e());
                        } else if (m84146R.m153762h() != null) {
                            aVar.f77510I.m75733e(m84146R.m153762h());
                        }
                        Switch r02 = aVar.f77512K;
                        C0804b m2025g = C0804b.m2025g();
                        r02.m90686i(!m2025g.m2033i("group_" + m84146R.m153781r()), false);
                        aVar.f77512K.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.bi0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SettingGroupView.C15035h.this.m84143V(m84146R, view);
                            }
                        });
                        aVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ci0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SettingGroupView.C15035h.this.m84144W(m84146R, view);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (mo10005m(i11) == 1) {
                    aVar.f77513L.setSwitch(AbstractC23309i.m122450u());
                    int i12 = 8;
                    if (aVar.f77513L.m74615A()) {
                        aVar.f77513L.m90592m(true);
                        aVar.f77516O.setVisibility(0);
                        aVar.f77514M.setVisibility(0);
                        aVar.f77515N.setVisibility(8);
                        aVar.f77514M.setSwitch(AbstractC23309i.m122126la());
                        SettingGroupView.this.m84117tM(1, AbstractC6918a0.ll_preview_message);
                    } else {
                        aVar.f77513L.m90592m(false);
                        aVar.f77516O.setVisibility(8);
                        aVar.f77514M.setVisibility(8);
                        aVar.f77515N.setVisibility(0);
                    }
                    View view = aVar.f77519R;
                    if (this.f77502r.isEmpty()) {
                        i12 = 0;
                    }
                    view.setVisibility(i12);
                    if (this.f77507w) {
                        this.f77507w = false;
                        m84140S(aVar);
                    }
                    AbstractC26084s.m134251H(aVar.f77513L, 65);
                    AbstractC26084s.m134251H(aVar.f77514M, 66);
                    if (!this.f77508x) {
                        ViewParent viewParent = aVar.f77517P;
                        if (viewParent instanceof InterfaceC26070e) {
                            AbstractC26084s.m134249F(SettingGroupView.this, 64, (InterfaceC26070e) viewParent);
                            if (!this.f77504t) {
                                AbstractC26084s.m134267o((InterfaceC26070e) aVar.f77517P);
                            }
                        }
                    }
                    SettingGroupView.this.m84117tM(0, AbstractC6918a0.item_noti_new_msg);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public a mo9992C(ViewGroup viewGroup, int i11) {
            if (i11 == 1) {
                return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.setting_noti_group, viewGroup, false), 1);
            }
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.setting_group_row, viewGroup, false), 2);
        }

        /* renamed from: Z */
        public void m84149Z(int i11, int i12) {
            this.f77505u = i11;
            this.f77506v = i12;
        }

        /* renamed from: a0 */
        public void m84150a0(boolean z11) {
            this.f77504t = z11;
        }

        /* renamed from: b0 */
        public void m84151b0(List list) {
            this.f77502r = new ArrayList(list);
            this.f77503s = AbstractC23309i.m122450u();
        }

        /* renamed from: c0 */
        public void m84152c0(boolean z11) {
            this.f77503s = z11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            if (!this.f77503s) {
                return 1;
            }
            return 1 + this.f77502r.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: m */
        public int mo10005m(int i11) {
            return i11 > 0 ? 2 : 1;
        }
    }

    /* renamed from: Vp */
    private void m84104Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            int i11 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            int i12 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
            C15035h c15035h = this.f77476Q0;
            if (c15035h != null) {
                c15035h.m84149Z(i11, i12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public void m84111mM(C24275a c24275a) {
        if (c24275a == null || this.f77482W0) {
            return;
        }
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15030c(c24275a));
        this.f77482W0 = true;
        c0766k.mo1652h7(c24275a, new MuteTrackingSource(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: nM */
    public void m84112nM() {
        int m9737T1;
        View mo9732P;
        View m134265m;
        try {
            if (!m84114qM(2) && (m9737T1 = this.f77479T0.m9737T1()) >= 0 && m9737T1 < this.f77476Q0.mo10003k() && this.f77476Q0.mo10005m(m9737T1) == 1 && (mo9732P = this.f77479T0.mo9732P(m9737T1)) != null && (m134265m = AbstractC26084s.m134265m(mo9732P)) != 0 && AbstractC26084s.m134277y(m134265m)) {
                m84117tM(2, AbstractC6918a0.zinstant_banner);
                this.f77480U0 = (InterfaceC26070e) m134265m;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingGroupView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public void m84113oM() {
        try {
            C15035h c15035h = this.f77476Q0;
            if (c15035h != null) {
                c15035h.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingGroupView", e11);
        }
    }

    /* renamed from: qM */
    private boolean m84114qM(int i11) {
        if (i11 < 0) {
            return true;
        }
        Integer[] numArr = this.f77478S0;
        if (i11 >= numArr.length || numArr[i11].intValue() != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m84115rM() {
        try {
            C15035h c15035h = this.f77476Q0;
            c15035h.f77508x = false;
            c15035h.m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public void m84116sM() {
        if (!this.f77482W0 && this.f77477R0 != null) {
            this.f72421L0.mo46829Y();
            String str = "group_" + this.f77477R0.m153781r();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15031d(str));
            this.f77482W0 = true;
            c0766k.mo1413D8(2, str, new MuteTrackingSource(6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public void m84117tM(int i11, int i12) {
        if (this.f77478S0 == null) {
            Integer[] numArr = new Integer[3];
            this.f77478S0 = numArr;
            numArr[0] = -1;
            this.f77478S0[1] = -1;
            this.f77478S0[2] = -1;
        }
        if (i11 >= 0) {
            Integer[] numArr2 = this.f77478S0;
            if (i11 >= numArr2.length || numArr2[i11].intValue() != -1) {
                return;
            }
            this.f77478S0[i11] = Integer.valueOf(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_setting_group));
            aVar.m43173v(2);
            aVar.m43161j(AbstractC8020f0.str_content_dialog_setting_group_new);
            aVar.m43159h(7);
            aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b());
            aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_off_noti_msg), this);
            return aVar.m43152a();
        }
        return AbstractC23116k0.m118580h(this.f72421L0.m92648SI(), true, new C15029b());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_group_view, viewGroup, false);
        m84120pM(inflate);
        return inflate;
    }

    /* renamed from: Ie */
    void m84118Ie(int i11, int i12) {
        try {
            if (this.f77490e1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f77488c1 = i11;
                this.f77489d1 = i12;
                this.f77490e1 = true;
                this.f77491f1.mo1704o8(this.f77492g1);
                this.f77491f1.mo1545U3(i11, i12, "");
            } else {
                this.f77490e1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                this.f77476Q0.m84152c0(AbstractC23309i.m122450u());
                this.f77476Q0.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 2 && i11 == -1) {
                interfaceC17463d.dismiss();
                m84119o3(13, 0);
                AbstractC23309i.m120919Ey(System.currentTimeMillis() + 86400000);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_noti_group_title));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m84104Vp();
            C15035h c15035h = this.f77476Q0;
            if (c15035h != null) {
                c15035h.f77507w = true;
                c15035h.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m84113oM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        Integer[] numArr = this.f77478S0;
        if (numArr != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, numArr, m92656bJ()), true);
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        InterfaceC26070e interfaceC26070e;
        if (i11 == AbstractC6918a0.item_noti_new_msg) {
            return 65;
        }
        if (i11 == AbstractC6918a0.item_preview_message) {
            return 66;
        }
        if (i11 != AbstractC6918a0.zinstant_banner || (interfaceC26070e = this.f77480U0) == null || interfaceC26070e.getCurrentData() == null) {
            return -10;
        }
        return this.f77480U0.getCurrentData().f124227b;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingGroupView";
    }

    /* renamed from: o3 */
    void m84119o3(int i11, int i12) {
        try {
            if (this.f77485Z0) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f77483X0 = i11;
                this.f77484Y0 = i12;
                this.f77485Z0 = true;
                this.f77486a1.mo1704o8(this.f77487b1);
                this.f77486a1.mo1699o3(i11, i12);
            } else {
                this.f77485Z0 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                this.f77476Q0.m84152c0(AbstractC23309i.m122450u());
                this.f77476Q0.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    void m84120pM(View view) {
        long j11;
        try {
            this.f77475P0 = (RecyclerView) view.findViewById(AbstractC6918a0.recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
            this.f77479T0 = linearLayoutManager;
            this.f77475P0.setLayoutManager(linearLayoutManager);
            this.f77476Q0 = new C15035h();
            this.f77481V0 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            m84104Vp();
            this.f77475P0.setAdapter(this.f77476Q0);
            this.f77475P0.m9826E(new C15028a());
            if (this.f77476Q0.f77505u > 0) {
                j11 = 1680;
            } else {
                j11 = 400;
            }
            view.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.th0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingGroupView.this.m84115rM();
                }
            }, j11);
            new C15034g().m2434i(AbstractC0837p0.m2225f(), new Void[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.uh0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingGroupView.this.m84113oM();
                }
            });
        }
    }
}
