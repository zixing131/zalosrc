package com.zing.zalo.p077ui.settings;

import ag0.C0809c1;
import am.AbstractC0939u;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.settings.SettingNotificationV2View;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.SettingGroupView;
import com.zing.zalo.p077ui.zviews.SettingMutedCallersView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import la0.C22229g7;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mj0.AbstractC23322a;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p445qe.C25244a;
import p542ub.InterfaceC27218a;
import p649xl.C30155zb;
import pm0.C24848g0;
import th.AbstractC26683d;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class SettingNotificationV2View extends BaseSettingView {

    /* renamed from: T0 */
    public C30155zb f67766T0;

    /* renamed from: U0 */
    private final int f67767U0 = 1;

    /* renamed from: V0 */
    private final int f67768V0 = 2;

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationV2View$a */
    /* loaded from: classes6.dex */
    public static final class C13148a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ boolean f67769a;

        C13148a(boolean z11) {
            this.f67769a = z11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            if (this.f67769a) {
                i11 = 19092;
            } else {
                i11 = 19093;
            }
            AbstractC20887g.m109246x(i11, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationV2View$b */
    /* loaded from: classes6.dex */
    public static final class C13149b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ boolean f67770a;

        C13149b(boolean z11) {
            this.f67770a = z11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            if (this.f67770a) {
                i11 = 19094;
            } else {
                i11 = 19095;
            }
            AbstractC20887g.m109246x(i11, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationV2View$c */
    /* loaded from: classes6.dex */
    public static final class C13150c extends AbstractC0939u {
        C13150c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC20887g.m109246x(19090, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationV2View$d */
    /* loaded from: classes6.dex */
    public static final class C13151d extends AbstractC19075u implements InterfaceC18505l {
        C13151d() {
            super(1);
        }

        /* renamed from: a */
        public final void m73987a(boolean z11) {
            SettingNotificationV2View.this.mo49315c4();
            SettingNotificationV2View.this.mo73550ao();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73987a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationV2View$e */
    /* loaded from: classes6.dex */
    public static final class C13152e extends AbstractC0939u {
        C13152e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC20887g.m109246x(19091, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationV2View$f */
    /* loaded from: classes6.dex */
    public static final class C13153f extends AbstractC19075u implements InterfaceC18505l {
        C13153f() {
            super(1);
        }

        /* renamed from: a */
        public final void m73988a(boolean z11) {
            SettingNotificationV2View.this.mo49315c4();
            SettingNotificationV2View.this.mo73550ao();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73988a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: NM */
    public static final void m73966NM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, false);
    }

    /* renamed from: OM */
    public static final void m73967OM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, false);
    }

    /* renamed from: PM */
    public static final void m73968PM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, false);
    }

    /* renamed from: QM */
    public static final void m73969QM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, z11);
    }

    /* renamed from: RM */
    public static final void m73970RM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, z11);
    }

    /* renamed from: SM */
    public static final void m73971SM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, z11);
    }

    /* renamed from: TM */
    public static final void m73972TM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, z11);
    }

    /* renamed from: UM */
    public static final void m73973UM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, z11);
    }

    /* renamed from: VM */
    public static final void m73974VM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, z11);
    }

    /* renamed from: WM */
    public static final void m73975WM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, false);
    }

    /* renamed from: XM */
    public static final void m73976XM(SettingNotificationV2View settingNotificationV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingNotificationV2View.m73977YM(listItemSetting, z11);
    }

    /* renamed from: YM */
    private final void m73977YM(ListItemSetting listItemSetting, boolean z11) {
        String str;
        String str2;
        if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140144z)) {
            int i11 = !z11 ? 1 : 0;
            m73556pM().mo74387o3(6, z11 ? 1 : 0);
            if (i11 != 0) {
                str2 = "37201";
            } else {
                str2 = "37202";
            }
            AbstractC23647d.m123906p(str2);
            AbstractC23647d.m123893c();
            C0809c1.m2050b(new C13148a(z11));
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140132A)) {
            int i12 = !z11 ? 1 : 0;
            m73556pM().mo74387o3(7, z11 ? 1 : 0);
            if (i12 != 0) {
                str = "37203";
            } else {
                str = "37204";
            }
            AbstractC23647d.m123906p(str);
            AbstractC23647d.m123893c();
            C0809c1.m2050b(new C13149b(z11));
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140140v)) {
            AbstractC23309i.m121055Im(z11);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140141w)) {
            Intent intent = new Intent();
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", MainApplication.Companion.m35500c().getPackageName());
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                MainApplication.C6895a c6895a = MainApplication.Companion;
                intent.putExtra("app_package", c6895a.m35500c().getPackageName());
                intent.putExtra("app_uid", c6895a.m35500c().getApplicationInfo().uid);
            }
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.startActivity(intent);
            }
            AbstractC23647d.m123897g("37207");
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140137s)) {
            if (z11) {
                m73556pM().mo74387o3(15, z11 ? 1 : 0);
                C0809c1.m2050b(new C13150c());
            } else {
                m73985MM().f140137s.post(new Runnable() { // from class: la0.t3
                    public /* synthetic */ RunnableC22336t3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingNotificationV2View.m73978ZM(SettingNotificationV2View.this);
                    }
                });
                this.f72421L0.showDialog(this.f67767U0);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140143y)) {
            m73556pM().mo74371Ie(9, !z11 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140139u)) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(SettingGroupView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140135q)) {
            if (C23055e5.m118272g(true)) {
                if (z11) {
                    mo46829Y();
                    C25244a.m130623Q(true, new C13151d());
                } else {
                    m73985MM().f140135q.post(new Runnable() { // from class: la0.u3
                        public /* synthetic */ RunnableC22344u3() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingNotificationV2View.m73979aN(SettingNotificationV2View.this);
                        }
                    });
                    showDialog(this.f67768V0);
                }
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140142x)) {
            Bundle bundle = new Bundle();
            bundle.putString("CALL_FROM_STRANGER_SETTING_ENTRY_POINT", "setting_call");
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(SettingMutedCallersView.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140138t)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("EXTRA_SETTING_ID", 14);
            bundle2.putBoolean("EXTRA_BOL_PRIVACY", false);
            C17487o0 m92662fJ3 = m92662fJ();
            if (m92662fJ3 != null) {
                m92662fJ3.m93069k2(BottomSheetSettingView.class, bundle2, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73985MM().f140136r)) {
            m73556pM().mo74371Ie(14, z11 ? 1 : 0);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: ZM */
    public static final void m73978ZM(SettingNotificationV2View settingNotificationV2View) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        settingNotificationV2View.m73985MM().f140137s.setSwitch(true);
    }

    /* renamed from: aN */
    public static final void m73979aN(SettingNotificationV2View settingNotificationV2View) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        settingNotificationV2View.m73985MM().f140135q.setSwitch(true);
    }

    /* renamed from: bN */
    public static final void m73980bN(SettingNotificationV2View settingNotificationV2View, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        settingNotificationV2View.m73556pM().mo74387o3(15, 0);
        AbstractC23309i.m120882Dy(System.currentTimeMillis() + 86400000);
        C0809c1.m2050b(new C13152e());
    }

    /* renamed from: cN */
    public static final void m73981cN(SettingNotificationV2View settingNotificationV2View, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingNotificationV2View, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (C23055e5.m118272g(true)) {
            settingNotificationV2View.mo46829Y();
            C25244a.m130623Q(false, new C13153f());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == this.f67767U0) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_off_noti_msg));
            aVar.m43173v(2);
            aVar.m43161j(AbstractC8020f0.str_content_dialog_off_noti_msg_new);
            aVar.m43159h(7);
            aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b());
            aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_off_noti_msg), new InterfaceC17463d.d() { // from class: la0.p3
                public /* synthetic */ C22304p3() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SettingNotificationV2View.m73980bN(SettingNotificationV2View.this, interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        if (i11 == this.f67768V0) {
            return new C8009j.a(getContext()).m43159h(7).m43172u(m92652XI(AbstractC8020f0.str_call_setting_notif_off_popup_title)).m43161j(AbstractC8020f0.str_call_setting_notif_off_popup_desc).m43169r(AbstractC8020f0.str_call_setting_notif_off_popup_confirm, new InterfaceC17463d.d() { // from class: la0.v3
                public /* synthetic */ C22352v3() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SettingNotificationV2View.m73981cN(SettingNotificationV2View.this, interfaceC17463d, i12);
                }
            }).m43164m(AbstractC8020f0.str_call_setting_notif_off_popup_cancel, new InterfaceC17463d.b()).m43152a();
        }
        return null;
    }

    /* renamed from: MM */
    public final C30155zb m73985MM() {
        C30155zb c30155zb = this.f67766T0;
        if (c30155zb != null) {
            return c30155zb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_notification_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dN */
    public final void m73986dN(C30155zb c30155zb) {
        AbstractC19074t.m100208f(c30155zb, "<set-?>");
        this.f67766T0 = c30155zb;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingNotificationView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 40;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73985MM().f140140v;
        AbstractC19074t.m100207e(listItemSetting, "itemNotiInApp");
        ListItemSetting listItemSetting2 = m73985MM().f140141w;
        AbstractC19074t.m100207e(listItemSetting2, "itemNotiSystem");
        ListItemSetting listItemSetting3 = m73985MM().f140137s;
        AbstractC19074t.m100207e(listItemSetting3, "itemNotiChat11");
        ListItemSetting listItemSetting4 = m73985MM().f140139u;
        AbstractC19074t.m100207e(listItemSetting4, "itemNotiGroup");
        ListItemSetting listItemSetting5 = m73985MM().f140135q;
        AbstractC19074t.m100207e(listItemSetting5, "itemCallIncoming");
        ListItemSetting listItemSetting6 = m73985MM().f140142x;
        AbstractC19074t.m100207e(listItemSetting6, "itemOffNotiCall");
        ListItemSetting listItemSetting7 = m73985MM().f140138t;
        AbstractC19074t.m100207e(listItemSetting7, "itemNotiFeed");
        ListItemSetting listItemSetting8 = m73985MM().f140136r;
        AbstractC19074t.m100207e(listItemSetting8, "itemNotiBirthday");
        ListItemSetting listItemSetting9 = m73985MM().f140144z;
        AbstractC19074t.m100207e(listItemSetting9, "itemSound");
        ListItemSetting listItemSetting10 = m73985MM().f140132A;
        AbstractC19074t.m100207e(listItemSetting10, "itemVibrate");
        ListItemSetting listItemSetting11 = m73985MM().f140143y;
        AbstractC19074t.m100207e(listItemSetting11, "itemPreviewChat11");
        return new C22229g7[]{new C22229g7(listItemSetting, 63), new C22229g7(listItemSetting2, 137), new C22229g7(listItemSetting3, 10), new C22229g7(listItemSetting4, 64), new C22229g7(listItemSetting5, 131), new C22229g7(listItemSetting6, 132), new C22229g7(listItemSetting7, 62), new C22229g7(listItemSetting8, 12), new C22229g7(listItemSetting9, 13), new C22229g7(listItemSetting10, 14), new C22229g7(listItemSetting11, 11)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        int i11;
        int i12;
        ListItemSetting listItemSetting = m73985MM().f140141w;
        Context context = listItemSetting.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Button button = new Button(context);
        button.m90539c(AbstractC2814h.ButtonSmall_SecondaryNeutral);
        button.setSupportiveIcon(C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_open_out_app_line_16, AbstractC2807a.icon_02));
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        listItemSetting.getLlRight().addView(button);
        listItemSetting.m90592m(false);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.w3

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109564q;

            public /* synthetic */ ViewOnClickListenerC22360w3(ListItemSetting listItemSetting2) {
                r2 = listItemSetting2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNotificationV2View.m73966NM(SettingNotificationV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting2 = m73985MM().f140137s;
        listItemSetting2.setSwitch(true);
        listItemSetting2.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.y3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109593b;

            public /* synthetic */ C22376y3(ListItemSetting listItemSetting22) {
                r2 = listItemSetting22;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingNotificationV2View.m73973UM(SettingNotificationV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting3 = m73985MM().f140143y;
        listItemSetting3.setSwitch(true);
        listItemSetting3.m90592m(false);
        listItemSetting3.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.z3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109607b;

            public /* synthetic */ C22384z3(ListItemSetting listItemSetting32) {
                r2 = listItemSetting32;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingNotificationV2View.m73974VM(SettingNotificationV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting4 = m73985MM().f140139u;
        listItemSetting4.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting4.setShowChevronRight(true);
        listItemSetting4.m90592m(false);
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: la0.a4

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109287q;

            public /* synthetic */ ViewOnClickListenerC22172a4(ListItemSetting listItemSetting42) {
                r2 = listItemSetting42;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNotificationV2View.m73975WM(SettingNotificationV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting5 = m73985MM().f140135q;
        listItemSetting5.setSwitch(true);
        listItemSetting5.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.b4

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109301b;

            public /* synthetic */ C22181b4(ListItemSetting listItemSetting52) {
                r2 = listItemSetting52;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingNotificationV2View.m73976XM(SettingNotificationV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting6 = m73985MM().f140142x;
        listItemSetting6.setShowChevronRight(true);
        listItemSetting6.m90592m(false);
        listItemSetting6.setOnClickListener(new View.OnClickListener() { // from class: la0.c4

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109314q;

            public /* synthetic */ ViewOnClickListenerC22190c4(ListItemSetting listItemSetting62) {
                r2 = listItemSetting62;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNotificationV2View.m73967OM(SettingNotificationV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting7 = m73985MM().f140138t;
        listItemSetting7.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting7.m90592m(false);
        listItemSetting7.setOnClickListener(new View.OnClickListener() { // from class: la0.d4

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109332q;

            public /* synthetic */ ViewOnClickListenerC22199d4(ListItemSetting listItemSetting72) {
                r2 = listItemSetting72;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNotificationV2View.m73968PM(SettingNotificationV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting8 = m73985MM().f140136r;
        listItemSetting8.setSwitch(true);
        listItemSetting8.m90592m(false);
        listItemSetting8.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.q3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109494b;

            public /* synthetic */ C22312q3(ListItemSetting listItemSetting82) {
                r2 = listItemSetting82;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingNotificationV2View.m73969QM(SettingNotificationV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting9 = m73985MM().f140140v;
        if (AbstractC26683d.f126399r) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItemSetting9.setVisibility(i11);
        LinearLayout linearLayout = m73985MM().f140133B;
        if (AbstractC23304d.f113347X1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
        if (Build.VERSION.SDK_INT < 26) {
            m73985MM().f140141w.setVisibility(8);
            m73985MM().f140140v.m90592m(false);
        }
        ListItemSetting listItemSetting10 = m73985MM().f140144z;
        listItemSetting10.setSwitch(true);
        listItemSetting10.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.r3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109507b;

            public /* synthetic */ C22320r3(ListItemSetting listItemSetting102) {
                r2 = listItemSetting102;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingNotificationV2View.m73970RM(SettingNotificationV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting11 = m73985MM().f140132A;
        listItemSetting11.setSwitch(true);
        listItemSetting11.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.s3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109517b;

            public /* synthetic */ C22328s3(ListItemSetting listItemSetting112) {
                r2 = listItemSetting112;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingNotificationV2View.m73971SM(SettingNotificationV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting12 = m73985MM().f140140v;
        listItemSetting12.setSwitch(true);
        listItemSetting12.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.x3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109579b;

            public /* synthetic */ C22368x3(ListItemSetting listItemSetting122) {
                r2 = listItemSetting122;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingNotificationV2View.m73972TM(SettingNotificationV2View.this, r2, compoundButton, z11);
            }
        });
        AbstractC23309i.m121148L4();
        m73556pM().mo74380Vx();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30155zb m148786b = C30155zb.m148786b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148786b, "inflate(...)");
        m73986dN(m148786b);
        View root = m73985MM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        int i11;
        int i12;
        try {
            m73985MM().f140137s.setSwitch(AbstractC23309i.m122413t());
            m73985MM().f140136r.setSwitch(AbstractC23309i.m121777c3());
            m73985MM().f140140v.setSwitch(AbstractC23309i.m122156m3());
            ListItemSetting listItemSetting = m73985MM().f140139u;
            if (AbstractC23309i.m122450u()) {
                i11 = AbstractC8020f0.setting_value_on;
            } else {
                i11 = AbstractC8020f0.setting_value_off;
            }
            listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(i11));
            m73985MM().f140135q.setSwitch(C25244a.m130639q());
            int i13 = 0;
            if (AbstractC23304d.f113347X1 && C25244a.m130639q()) {
                m73985MM().f140142x.setVisibility(0);
                C25244a c25244a = C25244a.f121072a;
                if (c25244a.m130654p().size() > 1) {
                    ListItemSetting listItemSetting2 = m73985MM().f140142x;
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_num_people, Integer.valueOf(c25244a.m130654p().size()));
                    AbstractC19074t.m100207e(m118746s0, "getString(...)");
                    listItemSetting2.setSubtitle(m118746s0);
                } else {
                    ListItemSetting listItemSetting3 = m73985MM().f140142x;
                    String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_num_person, Integer.valueOf(c25244a.m130654p().size()));
                    AbstractC19074t.m100207e(m118746s02, "getString(...)");
                    listItemSetting3.setSubtitle(m118746s02);
                }
            } else {
                m73985MM().f140142x.setVisibility(8);
            }
            Switch r02 = m73985MM().f140137s.getSwitch();
            if (r02 != null && r02.isChecked()) {
                m73985MM().f140143y.setVisibility(0);
                m73985MM().f140137s.m90592m(true);
            } else {
                m73985MM().f140143y.setVisibility(8);
                m73985MM().f140137s.m90592m(false);
            }
            String m120822Cb = AbstractC23309i.m120822Cb();
            if (m120822Cb != null && m120822Cb.length() != 0) {
                i13 = new JSONObject(m120822Cb).optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            ListItemSetting listItemSetting4 = m73985MM().f140138t;
            if (i13 != 1) {
                if (i13 != 2) {
                    i12 = AbstractC8020f0.setting_value_off;
                } else {
                    i12 = AbstractC8020f0.setting_state_except;
                }
            } else {
                i12 = AbstractC8020f0.setting_value_on;
            }
            listItemSetting4.setStateSetting(AbstractC23136l9.m118743r0(i12));
            m73985MM().f140144z.setSwitch(AbstractC23309i.m121825dc());
            m73985MM().f140132A.setSwitch(AbstractC23309i.m121827de());
            m73985MM().f140143y.setSwitch(AbstractC23309i.m122126la());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
