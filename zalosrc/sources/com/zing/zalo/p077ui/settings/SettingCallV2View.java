package com.zing.zalo.p077ui.settings;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.C3080a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.call.settingringtone.SettingRingtoneView;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import com.zing.zalo.p077ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2;
import com.zing.zalo.p077ui.settings.SettingCallV2View;
import com.zing.zalo.p077ui.settings.subsettings.BlockCallView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.SettingMutedCallersView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19067n0;
import java.util.Arrays;
import je.C21228a;
import l50.C22080b;
import l50.C22083e;
import l50.C22086h;
import la0.C22229g7;
import lo0.AbstractC22609k0;
import lo0.C22592c;
import lo0.C22626t;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23046d7;
import me0.C23055e5;
import mj0.AbstractC23322a;
import p173fz.C19172a;
import p321le.C22451b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p445qe.C25244a;
import p542ub.InterfaceC27218a;
import p649xl.C30001qb;
import pm0.C24848g0;
import th.AbstractC26681b;
import ui0.C27280g;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32257b4;
import zm.voip.service.C32328p3;

/* loaded from: classes6.dex */
public final class SettingCallV2View extends BaseSettingView {

    /* renamed from: T0 */
    public C30001qb f67675T0;

    /* renamed from: V0 */
    private ListItemSetting f67677V0;

    /* renamed from: U0 */
    private String f67676U0 = "";

    /* renamed from: W0 */
    private final Handler f67678W0 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: la0.q1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m73818hN;
            m73818hN = SettingCallV2View.m73818hN(SettingCallV2View.this, message);
            return m73818hN;
        }
    });

    /* renamed from: X0 */
    private final int f67679X0 = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingCallV2View$a */
    /* loaded from: classes6.dex */
    public static final class C13139a extends AbstractC19075u implements InterfaceC18505l {
        C13139a() {
            super(1);
        }

        /* renamed from: a */
        public final void m73842a(boolean z11) {
            SettingCallV2View.this.mo49315c4();
            SettingCallV2View.this.mo73550ao();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73842a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingCallV2View$b */
    /* loaded from: classes6.dex */
    public static final class C13140b extends AbstractC19075u implements InterfaceC18505l {
        C13140b() {
            super(1);
        }

        /* renamed from: a */
        public final void m73843a(boolean z11) {
            SettingCallV2View.this.mo49315c4();
            SettingCallV2View.this.mo73550ao();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73843a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingCallV2View$c */
    /* loaded from: classes6.dex */
    public static final class C13141c implements C22451b.a {
        C13141c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m73845c(C21228a c21228a, SettingCallV2View settingCallV2View) {
            AbstractC19074t.m100208f(c21228a, "$ringBackTone");
            AbstractC19074t.m100208f(settingCallV2View, "this$0");
            if (c21228a.m110007g()) {
                ListItemSetting listItemSetting = settingCallV2View.m73839UM().f139134x;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_setting_default);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                listItemSetting.setSubtitle(m118743r0);
                return;
            }
            ListItemSetting listItemSetting2 = settingCallV2View.m73839UM().f139134x;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s - %s", Arrays.copyOf(new Object[]{c21228a.m110004d(), c21228a.m110001a()}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            listItemSetting2.setSubtitle(format);
        }

        @Override // p321le.C22451b.a
        /* renamed from: a */
        public void mo73846a(final C21228a c21228a) {
            AbstractC19074t.m100208f(c21228a, "ringBackTone");
            final SettingCallV2View settingCallV2View = SettingCallV2View.this;
            settingCallV2View.mo70710wy(new Runnable() { // from class: la0.i2
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallV2View.C13141c.m73845c(C21228a.this, settingCallV2View);
                }
            });
        }
    }

    /* renamed from: BN */
    private final void m73784BN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: la0.a2
            @Override // java.lang.Runnable
            public final void run() {
                SettingCallV2View.m73786CN(SettingCallV2View.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public static final void m73786CN(final SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        try {
            Integer num = (Integer) new C22083e(null, 1, null).m101509a(Boolean.TRUE);
            final C19059j0 c19059j0 = new C19059j0();
            c19059j0.f94941p = "";
            if (num != null && num.intValue() == 0) {
                String m3683b7 = AbstractC0924m0.m3683b7();
                AbstractC19074t.m100207e(m3683b7, "getUriRingtone(...)");
                settingCallV2View.f67676U0 = m3683b7;
                if (m3683b7.length() == 0) {
                    String str = AbstractC22609k0.f110725a;
                    AbstractC19074t.m100207e(str, "ZALO_RINGTONE_RESOURCE");
                    settingCallV2View.f67676U0 = str;
                    AbstractC0924m0.m3497Up(str);
                }
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.zalo);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                c19059j0.f94941p = m118743r0;
                if (AbstractC23304d.f113267D1 == 2) {
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_setting_default);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    c19059j0.f94941p = m118743r02;
                }
            } else {
                if (num != null && num.intValue() == 1) {
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_base_on_system_ringtone);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    c19059j0.f94941p = m118743r03;
                }
                if (num.intValue() == 2) {
                    String m3713c7 = AbstractC0924m0.m3713c7();
                    AbstractC19074t.m100207e(m3713c7, "getUriSelectedSystemRingtone(...)");
                    settingCallV2View.f67676U0 = m3713c7;
                    c19059j0.f94941p = settingCallV2View.m73806VM();
                }
                if (num != null && num.intValue() == 3) {
                    c19059j0.f94941p = settingCallV2View.m73807WM();
                }
            }
            settingCallV2View.mo70710wy(new Runnable() { // from class: la0.r1
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallV2View.m73788DN(SettingCallV2View.this, c19059j0);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public static final void m73788DN(SettingCallV2View settingCallV2View, C19059j0 c19059j0) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(c19059j0, "$subText");
        settingCallV2View.m73839UM().f139135y.setSubtitle((CharSequence) c19059j0.f94941p);
    }

    /* renamed from: EN */
    private final void m73790EN() {
        new C22451b(null, 1, null).m101508a(new C13141c());
    }

    /* renamed from: TM */
    private final boolean m73805TM(boolean z11) {
        String[] strArr;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            strArr = new String[]{"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"};
        } else {
            strArr = new String[]{"android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE"};
        }
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        if (!AbstractC23034c6.m118116D(context, strArr)) {
            if (z11) {
                if (i12 >= 28) {
                    i11 = 121;
                } else {
                    i11 = 123;
                }
                InterfaceC27218a m92676n2 = m92676n2();
                AbstractC19074t.m100205c(m92676n2);
                AbstractC23034c6.m118186w0(m92676n2, strArr, i11);
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: VM */
    private final String m73806VM() {
        Uri parse = Uri.parse(this.f67676U0);
        if (parse != null) {
            String title = RingtoneManager.getRingtone(getContext(), parse).getTitle(getContext());
            AbstractC19074t.m100207e(title, "getTitle(...)");
            return title;
        }
        return "";
    }

    /* renamed from: WM */
    private final String m73807WM() {
        try {
            RingtoneData ringtoneData = (RingtoneData) new C22086h(null, 1, null).m101506a();
            if (ringtoneData == null) {
                return "";
            }
            return ringtoneData.m58733e() + " - " + ringtoneData.m58731c();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public static final void m73808XM(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m73809YM(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m73810ZM(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public static final void m73811aN(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public static final void m73812bN(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public static final void m73813cN(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public static final void m73814dN(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public static final void m73815eN(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public static final void m73816fN(SettingCallV2View settingCallV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingCallV2View.m73819iN(listItemSetting, z11);
    }

    /* renamed from: gN */
    private final void m73817gN() {
        C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 0, "call_open_zalo_melody", new String[0]), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public static final boolean m73818hN(SettingCallV2View settingCallV2View, Message message) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        int i11 = message.what;
        if (i11 == 1) {
            AbstractC32273e3.m155748Q().mo155899m2();
            settingCallV2View.m73838AN("onResume", 8);
            settingCallV2View.mo78960q3();
            return false;
        }
        if (i11 == 2) {
            AbstractC32273e3.m155748Q().mo155914r2();
            settingCallV2View.m73841zN("HomeApp", 2);
            return false;
        }
        return false;
    }

    /* renamed from: iN */
    private final void m73819iN(ListItemSetting listItemSetting, boolean z11) {
        C17487o0 m92662fJ;
        String str;
        String str2;
        String str3;
        String str4;
        C17487o0 m92662fJ2;
        if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139135y)) {
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_OPEN_SETTING_RING_TONE_SCREEN", "1");
            int i11 = AbstractC23304d.f113267D1;
            if (i11 == 1) {
                C17487o0 m92662fJ3 = m92662fJ();
                if (m92662fJ3 != null) {
                    m92662fJ3.m93069k2(SettingRingtoneView.class, bundle, 1, true);
                }
            } else if (i11 == 2 && (m92662fJ2 = m92662fJ()) != null) {
                m92662fJ2.m93069k2(SettingRingtoneViewV2.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139134x)) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                ZaloWebView.Companion.m87172G(m92676n2, AbstractC3096i0.m15495J(), new Bundle(), 12);
            }
            m73817gN();
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139129s)) {
            if (AbstractC23309i.m121377Rb() != 0) {
                if (z11) {
                    if (m73805TM(true)) {
                        if (C8937j0.m47663l("call_log_noti_call")) {
                            AbstractC23309i.m121846dx(true);
                        } else {
                            Context m92689tK = m92689tK();
                            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                            C23046d7.m118239b(m92689tK).mo13822K();
                            this.f67677V0 = listItemSetting;
                            m73839UM().f139129s.post(new Runnable() { // from class: la0.s1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingCallV2View.m73820jN(SettingCallV2View.this);
                                }
                            });
                        }
                    } else {
                        this.f67677V0 = listItemSetting;
                        m73839UM().f139129s.post(new Runnable() { // from class: la0.t1
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingCallV2View.m73821kN(SettingCallV2View.this);
                            }
                        });
                    }
                } else {
                    AbstractC23309i.m121846dx(false);
                }
                if (z11) {
                    str4 = "400503";
                } else {
                    str4 = "400504";
                }
                AbstractC23647d.m123897g(str4);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139133w)) {
            if (z11) {
                if (m73805TM(true)) {
                    if (C8937j0.m47663l("call_log_noti_call")) {
                        AbstractC23309i.m122412sz(true);
                    } else {
                        Context m92689tK2 = m92689tK();
                        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                        C23046d7.m118239b(m92689tK2).mo13822K();
                        this.f67677V0 = listItemSetting;
                        m73839UM().f139133w.post(new Runnable() { // from class: la0.u1
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingCallV2View.m73822lN(SettingCallV2View.this);
                            }
                        });
                    }
                } else {
                    this.f67677V0 = listItemSetting;
                    m73839UM().f139133w.post(new Runnable() { // from class: la0.v1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingCallV2View.m73823mN(SettingCallV2View.this);
                        }
                    });
                }
            } else {
                AbstractC23309i.m122412sz(false);
            }
            if (z11) {
                str3 = "37205";
            } else {
                str3 = "37206";
            }
            AbstractC23647d.m123897g(str3);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139131u)) {
            if (z11) {
                if (AbstractC3096i0.m15511R()) {
                    if (AbstractC23034c6.m118130P(AbstractC3096i0.m15574y())) {
                        AbstractC23309i.m122323qk(1);
                    } else {
                        m73839UM().f139131u.post(new Runnable() { // from class: la0.w1
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingCallV2View.m73824nN(SettingCallV2View.this);
                            }
                        });
                        AbstractC23034c6.m118190y0(m92662fJ(), 157);
                    }
                } else if (AbstractC23034c6.m118126L(MainApplication.Companion.m35500c())) {
                    AbstractC23309i.m122323qk(1);
                    m73830uN();
                } else {
                    m73839UM().f139131u.post(new Runnable() { // from class: la0.y1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingCallV2View.m73825oN(SettingCallV2View.this);
                        }
                    });
                    AbstractC23034c6.m118182u0(m92662fJ(), 11122);
                }
            } else {
                AbstractC23309i.m122323qk(0);
                m73832wN();
            }
            if (z11) {
                str2 = "400501";
            } else {
                str2 = "400502";
            }
            AbstractC23647d.m123897g(str2);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139130t)) {
            if (C23055e5.m118272g(true)) {
                if (z11) {
                    mo46829Y();
                    C25244a.m130623Q(true, new C13139a());
                } else {
                    m73839UM().f139130t.post(new Runnable() { // from class: la0.z1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingCallV2View.m73826pN(SettingCallV2View.this);
                        }
                    });
                    showDialog(this.f67679X0);
                }
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139132v)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("CALL_FROM_STRANGER_SETTING_ENTRY_POINT", "setting_call");
            C17487o0 m92662fJ4 = m92662fJ();
            if (m92662fJ4 != null) {
                m92662fJ4.m93069k2(SettingMutedCallersView.class, bundle2, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139127q)) {
            if (AbstractC23304d.f113263C1) {
                Bundle bundle3 = new Bundle();
                bundle3.putInt("EXTRA_SETTING_ID", 25);
                C17487o0 m92662fJ5 = m92662fJ();
                if (m92662fJ5 != null) {
                    m92662fJ5.m93069k2(BottomSheetSettingView.class, bundle3, 1, true);
                }
            } else {
                m73556pM().mo74371Ie(25, z11 ? 1 : 0);
                if (z11) {
                    str = "37026";
                } else {
                    str = "37025";
                }
                AbstractC23647d.m123897g(str);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73839UM().f139128r) && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93069k2(BlockCallView.class, null, 1, true);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public static final void m73820jN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.m73839UM().f139129s.setSwitch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public static final void m73821kN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.m73839UM().f139129s.setSwitch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public static final void m73822lN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.m73839UM().f139133w.setSwitch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public static final void m73823mN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.m73839UM().f139133w.setSwitch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m73824nN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.m73839UM().f139131u.setSwitch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public static final void m73825oN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.m73839UM().f139131u.setSwitch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m73826pN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.m73839UM().f139130t.setSwitch(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final void m73827qN(SettingCallV2View settingCallV2View, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (C23055e5.m118272g(true)) {
            settingCallV2View.mo46829Y();
            C25244a.m130623Q(false, new C13140b());
        }
    }

    /* renamed from: sN */
    private final boolean m73828sN() {
        if (AbstractC23309i.m121627Y2() && (AbstractC3096i0.m15511R() || AbstractC26681b.f126356a)) {
            return true;
        }
        return false;
    }

    /* renamed from: tN */
    private final boolean m73829tN() {
        if (C19172a.m100601l("features@voip@display_rbt@badge", 0, 2, null) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: uN */
    private final void m73830uN() {
        if (AbstractC3096i0.m15538g() && !AbstractC3096i0.f13166j && AbstractC32273e3.m155748Q().mo155799F0()) {
            AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: la0.m1
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallV2View.m73831vN(SettingCallV2View.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public static final void m73831vN(SettingCallV2View settingCallV2View) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        settingCallV2View.f67678W0.removeMessages(2);
        settingCallV2View.f67678W0.sendEmptyMessageDelayed(1, 2000L);
    }

    /* renamed from: wN */
    private final void m73832wN() {
        m73834xN(0);
    }

    /* renamed from: xN */
    private final void m73834xN(final int i11) {
        if (AbstractC32273e3.m155748Q().mo155799F0()) {
            AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: la0.x1
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallV2View.m73836yN(SettingCallV2View.this, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public static final void m73836yN(SettingCallV2View settingCallV2View, int i11) {
        AbstractC19074t.m100208f(settingCallV2View, "this$0");
        settingCallV2View.f67678W0.removeMessages(1);
        settingCallV2View.f67678W0.sendEmptyMessageDelayed(2, i11);
    }

    /* renamed from: AN */
    public final void m73838AN(String str, int i11) {
        AbstractC19074t.m100208f(str, "reason");
        C22626t m155737l = C32257b4.m155726m().m155737l();
        AbstractC19074t.m100207e(m155737l, "getActiveCallInfo(...)");
        if (m155737l.m117047N0() && AbstractC32273e3.m155748Q().mo155855W().f123737b) {
            AbstractC3082b0.m15421c("SettingCallView", "turnOnCamera ifOffCamera = " + m155737l.m117114h0() + " " + str);
            AbstractC32273e3.m155748Q().mo155785B2(str, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == this.f67679X0) {
            return new C8009j.a(getContext()).m43159h(7).m43172u(m92652XI(AbstractC8020f0.str_call_setting_notif_off_popup_title)).m43161j(AbstractC8020f0.str_call_setting_notif_off_popup_desc).m43169r(AbstractC8020f0.str_call_setting_notif_off_popup_confirm, new InterfaceC17463d.d() { // from class: la0.b2
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SettingCallV2View.m73827qN(SettingCallV2View.this, interfaceC17463d, i12);
                }
            }).m43164m(AbstractC8020f0.str_call_setting_notif_off_popup_cancel, new InterfaceC17463d.b()).m43152a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_setting_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: UM */
    public final C30001qb m73839UM() {
        C30001qb c30001qb = this.f67675T0;
        if (c30001qb != null) {
            return c30001qb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingCallView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 42;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73839UM().f139135y;
        AbstractC19074t.m100207e(listItemSetting, "itemRingtone");
        ListItemSetting listItemSetting2 = m73839UM().f139134x;
        AbstractC19074t.m100207e(listItemSetting2, "itemRingBackTone");
        ListItemSetting listItemSetting3 = m73839UM().f139129s;
        AbstractC19074t.m100207e(listItemSetting3, "itemBubbleCallInChat");
        ListItemSetting listItemSetting4 = m73839UM().f139133w;
        AbstractC19074t.m100207e(listItemSetting4, "itemPopupMissCall");
        ListItemSetting listItemSetting5 = m73839UM().f139131u;
        AbstractC19074t.m100207e(listItemSetting5, "itemMiniVideo");
        ListItemSetting listItemSetting6 = m73839UM().f139127q;
        AbstractC19074t.m100207e(listItemSetting6, "itemAllowCall");
        ListItemSetting listItemSetting7 = m73839UM().f139130t;
        AbstractC19074t.m100207e(listItemSetting7, "itemCallIncoming");
        ListItemSetting listItemSetting8 = m73839UM().f139132v;
        AbstractC19074t.m100207e(listItemSetting8, "itemOffNotiCall");
        ListItemSetting listItemSetting9 = m73839UM().f139128r;
        AbstractC19074t.m100207e(listItemSetting9, "itemBlockCall");
        return new C22229g7[]{new C22229g7(listItemSetting, 124), new C22229g7(listItemSetting2, 129), new C22229g7(listItemSetting3, 94), new C22229g7(listItemSetting4, 20), new C22229g7(listItemSetting5, 95), new C22229g7(listItemSetting6, 149), new C22229g7(listItemSetting7, 131), new C22229g7(listItemSetting8, 132), new C22229g7(listItemSetting9, 141)};
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11 = true;
        if (i11 != 157) {
            if (i11 == 11122) {
                MainApplication.C6895a c6895a = MainApplication.Companion;
                if (AbstractC23034c6.m118126L(c6895a.m35500c()) && !AbstractC3096i0.m15511R()) {
                    AbstractC23309i.m122323qk(1);
                    ListItemSetting listItemSetting = m73839UM().f139131u;
                    if (AbstractC23309i.m121776c2() != 1 || !AbstractC23034c6.m118126L(c6895a.m35500c())) {
                        z11 = false;
                    }
                    listItemSetting.setSwitch(z11);
                    m73830uN();
                }
            }
        } else if (AbstractC23034c6.m118130P(MainApplication.Companion.m35500c()) && AbstractC3096i0.m15511R()) {
            AbstractC23309i.m122323qk(1);
            m73839UM().f139131u.setSwitch(true);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        boolean z11;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 121 || i11 == 123) {
            if (m73805TM(false)) {
                if (AbstractC19074t.m100204b(this.f67677V0, m73839UM().f139133w)) {
                    m73839UM().f139133w.setSwitch(true);
                    AbstractC23309i.m122412sz(true);
                }
                if (AbstractC19074t.m100204b(this.f67677V0, m73839UM().f139129s) && AbstractC23309i.m121377Rb() != 0) {
                    m73839UM().f139129s.setSwitch(true);
                    AbstractC23309i.m121846dx(true);
                }
            } else {
                if (iArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    m73839UM().f139133w.setSwitch(false);
                    m73839UM().f139129s.setSwitch(false);
                    AbstractC23309i.m121846dx(false);
                    AbstractC23309i.m122412sz(false);
                }
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
        if (!AbstractC3096i0.m15511R() && !AbstractC23034c6.m118126L(MainApplication.Companion.m35500c())) {
            m73839UM().f139131u.setSwitch(false);
            this.f67678W0.removeMessages(1);
            m73834xN(0);
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        int i11;
        AbstractC23304d.m120531b();
        final ListItemSetting listItemSetting = m73839UM().f139135y;
        listItemSetting.setShowChevronRight(true);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingCallV2View.m73808XM(SettingCallV2View.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m73839UM().f139134x;
        listItemSetting2.setShowChevronRight(true);
        int i12 = 0;
        listItemSetting2.m90592m(false);
        if (m73829tN()) {
            Context context = listItemSetting2.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16974f c16974f = new C16974f(context);
            c16974f.m90974x(EnumC16991i.CUSTOM);
            c16974f.m90967q(C27280g.m139658a(c16974f.m90953c(), AbstractC23322a.zds_oic_premium_crown_color_24));
            listItemSetting2.getBadgeTitle().m90493g(c16974f);
            listItemSetting2.getBadgeTitle().setVisibility(0);
        }
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingCallV2View.m73814dN(SettingCallV2View.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m73839UM().f139129s;
        listItemSetting3.setSwitch(true);
        listItemSetting3.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.e2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingCallV2View.m73815eN(SettingCallV2View.this, listItemSetting3, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting4 = m73839UM().f139133w;
        listItemSetting4.setSwitch(true);
        listItemSetting4.m90592m(false);
        listItemSetting4.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.f2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingCallV2View.m73816fN(SettingCallV2View.this, listItemSetting4, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting5 = m73839UM().f139131u;
        listItemSetting5.setSwitch(true);
        listItemSetting5.m90592m(false);
        listItemSetting5.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.g2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingCallV2View.m73809YM(SettingCallV2View.this, listItemSetting5, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting6 = m73839UM().f139130t;
        listItemSetting6.setSwitch(true);
        listItemSetting6.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.h2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingCallV2View.m73810ZM(SettingCallV2View.this, listItemSetting6, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting7 = m73839UM().f139132v;
        listItemSetting7.setShowChevronRight(true);
        listItemSetting7.m90592m(false);
        listItemSetting7.setOnClickListener(new View.OnClickListener() { // from class: la0.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingCallV2View.m73811aN(SettingCallV2View.this, listItemSetting7, view);
            }
        });
        final ListItemSetting listItemSetting8 = m73839UM().f139127q;
        if (!AbstractC23304d.f113263C1) {
            listItemSetting8.setSwitch(false);
        }
        listItemSetting8.setOnClickListener(new View.OnClickListener() { // from class: la0.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingCallV2View.m73812bN(SettingCallV2View.this, listItemSetting8, view);
            }
        });
        final ListItemSetting listItemSetting9 = m73839UM().f139128r;
        listItemSetting9.setShowChevronRight(true);
        listItemSetting9.m90592m(false);
        listItemSetting9.setOnClickListener(new View.OnClickListener() { // from class: la0.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingCallV2View.m73813cN(SettingCallV2View.this, listItemSetting9, view);
            }
        });
        if (!m73828sN()) {
            m73839UM().f139131u.setVisibility(8);
            m73839UM().f139120A.setVisibility(8);
            m73839UM().f139123D.setVisibility(8);
        }
        ListItemSetting listItemSetting10 = m73839UM().f139135y;
        if (AbstractC23148n.m118840n()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItemSetting10.setVisibility(i11);
        if (!AbstractC3096i0.m15564t().booleanValue()) {
            m73839UM().f139134x.setVisibility(8);
            if (m73839UM().f139135y.getVisibility() == 0) {
                m73839UM().f139135y.m90592m(false);
            } else {
                m73839UM().f139122C.setVisibility(8);
                m73839UM().f139125F.setVisibility(8);
            }
        }
        LinearLayout linearLayout = m73839UM().f139136z;
        if (!AbstractC23304d.f113347X1) {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
        if (AbstractC23309i.m121377Rb() == 0) {
            m73839UM().f139129s.setVisibility(8);
        }
        m73556pM().mo74380Vx();
        new C22080b(null, 1, null).m101504a();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30001qb m148413b = C30001qb.m148413b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148413b, "inflate(...)");
        m73840rN(m148413b);
        View root = m73839UM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: rN */
    public final void m73840rN(C30001qb c30001qb) {
        AbstractC19074t.m100208f(c30001qb, "<set-?>");
        this.f67675T0 = c30001qb;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        boolean z11;
        boolean z12;
        m73784BN();
        Boolean m15564t = AbstractC3096i0.m15564t();
        AbstractC19074t.m100207e(m15564t, "enableRingBackTone(...)");
        if (m15564t.booleanValue()) {
            m73790EN();
        }
        try {
            if (AbstractC23304d.f113263C1) {
                m73839UM().f139127q.setStateSetting(C3080a0.f13112a.m15416g());
            } else {
                m73839UM().f139127q.setSwitch(C3080a0.f13112a.m15417j());
            }
            if (AbstractC23309i.m121377Rb() != 0) {
                if (AbstractC23309i.m121414Sb()) {
                    m73839UM().f139129s.setSwitch(m73805TM(true));
                } else {
                    m73839UM().f139129s.setSwitch(false);
                }
            }
            if (AbstractC23309i.m121342Qd()) {
                m73839UM().f139133w.setSwitch(m73805TM(true));
            } else {
                m73839UM().f139133w.setSwitch(false);
            }
            if (AbstractC3096i0.m15511R()) {
                ListItemSetting listItemSetting = m73839UM().f139131u;
                if (AbstractC23309i.m121776c2() == 1 && AbstractC23034c6.m118130P(MainApplication.Companion.m35500c())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                listItemSetting.setSwitch(z12);
            } else {
                ListItemSetting listItemSetting2 = m73839UM().f139131u;
                if (AbstractC23309i.m121776c2() == 1 && AbstractC23034c6.m118126L(MainApplication.Companion.m35500c())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                listItemSetting2.setSwitch(z11);
            }
            m73839UM().f139130t.setSwitch(C25244a.m130639q());
            if (AbstractC23304d.f113347X1 && C25244a.m130639q()) {
                m73839UM().f139132v.setVisibility(0);
                C25244a c25244a = C25244a.f121072a;
                if (c25244a.m130654p().size() > 1) {
                    ListItemSetting listItemSetting3 = m73839UM().f139132v;
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_num_people, Integer.valueOf(c25244a.m130654p().size()));
                    AbstractC19074t.m100207e(m118746s0, "getString(...)");
                    listItemSetting3.setSubtitle(m118746s0);
                    return;
                }
                ListItemSetting listItemSetting4 = m73839UM().f139132v;
                String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_num_person, Integer.valueOf(c25244a.m130654p().size()));
                AbstractC19074t.m100207e(m118746s02, "getString(...)");
                listItemSetting4.setSubtitle(m118746s02);
                return;
            }
            m73839UM().f139132v.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zN */
    public final void m73841zN(String str, int i11) {
        AbstractC19074t.m100208f(str, "reason");
        if (AbstractC32273e3.f148886z) {
            C22592c m156362c = C32328p3.m156358e().m156362c();
            if (m156362c != null && !m156362c.m116850H()) {
                AbstractC32273e3.m155748Q().mo155781A2(str, i11);
                return;
            }
            return;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        AbstractC19074t.m100207e(m155737l, "getActiveCallInfo(...)");
        if (m155737l.m117047N0() && !m155737l.m117114h0()) {
            AbstractC3082b0.m15421c("SettingCallView", "turnOffCamera ifOffCamera = " + m155737l.m117114h0() + " " + str);
            AbstractC32273e3.m155748Q().mo155781A2(str, i11);
        }
    }
}
