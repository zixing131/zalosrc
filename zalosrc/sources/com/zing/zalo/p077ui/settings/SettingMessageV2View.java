package com.zing.zalo.p077ui.settings;

import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import b40.C2526d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.settings.SettingMessageV2View;
import com.zing.zalo.p077ui.settings.subsettings.BlockContactsView;
import com.zing.zalo.p077ui.settings.subsettings.SettingHiddenChatView;
import com.zing.zalo.p077ui.settings.subsettings.SettingPreDownloadView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.QuickMessageListingFullView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19074t;
import hf0.C20048j;
import la0.C22229g7;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import p161fg.C18922m;
import p162fh.C18932a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p423pi.C24759a;
import p542ub.InterfaceC27218a;
import p649xl.C30138yb;
import p732zy.C32592h;
import th.AbstractC26681b;
import th.AbstractC26683d;
import th.AbstractC26689j;

/* loaded from: classes6.dex */
public final class SettingMessageV2View extends BaseSettingView {

    /* renamed from: T0 */
    private final int f67712T0 = 11121;

    /* renamed from: U0 */
    private final int f67713U0 = 11122;

    /* renamed from: V0 */
    private final int f67714V0 = 1;

    /* renamed from: W0 */
    public C30138yb f67715W0;

    /* renamed from: OM */
    private final void m73910OM(boolean z11) {
        try {
            if (z11) {
                if (AbstractC23034c6.m118126L(MainApplication.Companion.m35500c())) {
                    AbstractC23309i.m122545wk(true);
                    AbstractC23647d.m123897g("22001403");
                } else {
                    AbstractC23034c6.m118182u0(m92662fJ(), this.f67712T0);
                }
            } else {
                AbstractC23647d.m123897g("22001404");
                AbstractC23309i.m122545wk(false);
                C18922m.m99141t().m99156p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    public static final void m73911PM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, false);
    }

    /* renamed from: QM */
    public static final void m73912QM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: RM */
    public static final void m73913RM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, false);
    }

    /* renamed from: SM */
    public static final void m73914SM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, false);
    }

    /* renamed from: TM */
    public static final void m73915TM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: UM */
    public static final void m73916UM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: VM */
    public static final void m73917VM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: WM */
    public static final void m73918WM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: XM */
    public static final void m73919XM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, false);
    }

    /* renamed from: YM */
    public static final void m73920YM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, false);
    }

    /* renamed from: ZM */
    public static final void m73921ZM(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, false);
    }

    /* renamed from: aN */
    public static final void m73922aN(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: bN */
    public static final void m73923bN(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, false);
    }

    /* renamed from: cN */
    public static final void m73924cN(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: dN */
    public static final void m73925dN(SettingMessageV2View settingMessageV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingMessageV2View.m73926eN(listItemSetting, z11);
    }

    /* renamed from: eN */
    private final void m73926eN(ListItemSetting listItemSetting, boolean z11) {
        C17487o0 m92662fJ;
        if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140035B)) {
            Bundle bundle = new Bundle();
            bundle.putString("STR_SOURCE_START_VIEW", "setting");
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(QuickMessageListingFullView.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140043u)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("STR_SOURCE_START_VIEW", "setting");
            if (this.f72421L0.m92662fJ() != null) {
                C17487o0 m92662fJ3 = this.f72421L0.m92662fJ();
                AbstractC19074t.m100205c(m92662fJ3);
                m92662fJ3.m93066i2(ManageConversationLabelSetting.class, bundle2, 11123, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140042t)) {
            if (m73932NM().f140042t.getSwitch() != null) {
                if (AbstractC23165o5.m119333b()) {
                    m73932NM().f140042t.post(new Runnable() { // from class: la0.d3

                        /* renamed from: q */
                        public final /* synthetic */ boolean f109330q;

                        public /* synthetic */ RunnableC22198d3(boolean z112) {
                            r2 = z112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingMessageV2View.m73927fN(SettingMessageV2View.this, r2);
                        }
                    });
                    removeDialog(this.f67714V0);
                    showDialog(this.f67714V0);
                } else {
                    m73910OM(z112);
                }
            } else {
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    AbstractC23034c6.m118176r0(m92676n2.mo35575n1(), (int) System.currentTimeMillis());
                }
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140036C)) {
            AbstractC0924m0.m3933jh(z112);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140037D)) {
            m73556pM().mo74387o3(19, z112 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140041s)) {
            C17487o0 m92662fJ4 = m92662fJ();
            if (m92662fJ4 != null) {
                m92662fJ4.m93069k2(BlockContactsView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140047y)) {
            C17487o0 m92662fJ5 = m92662fJ();
            if (m92662fJ5 != null) {
                m92662fJ5.m93069k2(SettingHiddenChatView.class, null, 1, true);
            }
            AbstractC23647d.m123897g("22001331");
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140048z)) {
            AbstractC23309i.m121129Km(z112);
            C2526d.f10270a.m12726s0("tabme_msg_settings", z112);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140045w)) {
            m73556pM().mo74387o3(3, z112 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140046x)) {
            AbstractC23309i.m120943Fl(z112);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140039q)) {
            m73556pM().mo74387o3(1, z112 ? 1 : 0);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140040r)) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("EXTRA_SETTING_ID", 17);
            bundle3.putBoolean("EXTRA_BOL_PRIVACY", false);
            C17487o0 m92662fJ6 = m92662fJ();
            if (m92662fJ6 != null) {
                m92662fJ6.m93069k2(BottomSheetSettingView.class, bundle3, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140044v)) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("EXTRA_SETTING_ID", 40);
            bundle4.putBoolean("EXTRA_BOL_PRIVACY", false);
            C17487o0 m92662fJ7 = m92662fJ();
            if (m92662fJ7 != null) {
                m92662fJ7.m93069k2(BottomSheetSettingView.class, bundle4, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73932NM().f140034A) && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93069k2(SettingPreDownloadView.class, null, 1, true);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: fN */
    public static final void m73927fN(SettingMessageV2View settingMessageV2View, boolean z11) {
        AbstractC19074t.m100208f(settingMessageV2View, "this$0");
        settingMessageV2View.m73932NM().f140042t.setSwitch(!z11);
    }

    /* renamed from: hN */
    private final void m73928hN() {
        ListItemSetting listItemSetting = m73932NM().f140043u;
        listItemSetting.setShowChevronRight(true);
        Switch r12 = listItemSetting.getSwitch();
        if (r12 != null) {
            r12.setVisibility(8);
        }
        if (C18932a.f94442a.m99185i()) {
            listItemSetting.getBadgeTitle().setVisibility(0);
            Badge badgeTitle = listItemSetting.getBadgeTitle();
            Context context = listItemSetting.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16974f c16974f = new C16974f(context);
            c16974f.m90974x(EnumC16991i.NEW_TEXT);
            c16974f.m90972v("BETA");
            badgeTitle.m90493g(c16974f);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        try {
            if (i11 == this.f67714V0) {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(4);
                aVar.m43155d(true);
                aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_announce_unable_chat_head_when_use_passcode));
                aVar.m43169r(AbstractC8020f0.ls_ok, new InterfaceC17463d.b());
                return aVar.m43152a();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: NM */
    public final C30138yb m73932NM() {
        C30138yb c30138yb = this.f67715W0;
        if (c30138yb != null) {
            return c30138yb;
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
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_title_message);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gN */
    public final void m73933gN(C30138yb c30138yb) {
        AbstractC19074t.m100208f(c30138yb, "<set-?>");
        this.f67715W0 = c30138yb;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingMessageView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 41;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73932NM().f140035B;
        AbstractC19074t.m100207e(listItemSetting, "itemQuickMsg");
        ListItemSetting listItemSetting2 = m73932NM().f140043u;
        AbstractC19074t.m100207e(listItemSetting2, "itemChatLabel");
        ListItemSetting listItemSetting3 = m73932NM().f140042t;
        AbstractC19074t.m100207e(listItemSetting3, "itemBubbleChat");
        ListItemSetting listItemSetting4 = m73932NM().f140036C;
        AbstractC19074t.m100207e(listItemSetting4, "itemSuggestNewPhoto");
        ListItemSetting listItemSetting5 = m73932NM().f140037D;
        AbstractC19074t.m100207e(listItemSetting5, "itemSuggestSticker");
        ListItemSetting listItemSetting6 = m73932NM().f140041s;
        AbstractC19074t.m100207e(listItemSetting6, "itemBlockMsg");
        ListItemSetting listItemSetting7 = m73932NM().f140047y;
        AbstractC19074t.m100207e(listItemSetting7, "itemHiddenChat");
        ListItemSetting listItemSetting8 = m73932NM().f140048z;
        AbstractC19074t.m100207e(listItemSetting8, "itemPhotoHd");
        ListItemSetting listItemSetting9 = m73932NM().f140045w;
        AbstractC19074t.m100207e(listItemSetting9, "itemEnterSendMsg");
        ListItemSetting listItemSetting10 = m73932NM().f140046x;
        AbstractC19074t.m100207e(listItemSetting10, "itemFloatingEmoji");
        ListItemSetting listItemSetting11 = m73932NM().f140039q;
        AbstractC19074t.m100207e(listItemSetting11, "itemAutoPlayAudio");
        ListItemSetting listItemSetting12 = m73932NM().f140040r;
        AbstractC19074t.m100207e(listItemSetting12, "itemAutoPlayVideo");
        ListItemSetting listItemSetting13 = m73932NM().f140034A;
        AbstractC19074t.m100207e(listItemSetting13, "itemPreDownload");
        ListItemSetting listItemSetting14 = m73932NM().f140044v;
        AbstractC19074t.m100207e(listItemSetting14, "itemDisplayMsg");
        return new C22229g7[]{new C22229g7(listItemSetting, 127), new C22229g7(listItemSetting2, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422), new C22229g7(listItemSetting3, 114), new C22229g7(listItemSetting4, 139), new C22229g7(listItemSetting5, 16), new C22229g7(listItemSetting6, 68), new C22229g7(listItemSetting7, 69), new C22229g7(listItemSetting8, 140), new C22229g7(listItemSetting9, 22), new C22229g7(listItemSetting10, 138), new C22229g7(listItemSetting11, 15), new C22229g7(listItemSetting12, 67), new C22229g7(listItemSetting13, 142), new C22229g7(listItemSetting14, 93)};
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == this.f67712T0) {
            if (AbstractC23034c6.m118126L(MainApplication.Companion.m35500c())) {
                if (m73932NM().f140042t.getSwitch() != null) {
                    m73932NM().f140042t.setSwitch(true);
                }
                AbstractC23647d.m123897g("22001403");
                AbstractC23309i.m122545wk(true);
            }
        } else if (i11 == this.f67713U0 && i12 == -1) {
            m73928hN();
        }
        super.onActivityResult(i11, i12, intent);
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
        int i13;
        int i14;
        ListItemSetting listItemSetting = m73932NM().f140035B;
        listItemSetting.setShowChevronRight(true);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.x2

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109577q;

            public /* synthetic */ ViewOnClickListenerC22367x2(ListItemSetting listItemSetting2) {
                r2 = listItemSetting2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingMessageV2View.m73911PM(SettingMessageV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting2 = m73932NM().f140043u;
        listItemSetting2.setSwitch(true);
        listItemSetting2.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.j3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109404b;

            public /* synthetic */ C22252j3(ListItemSetting listItemSetting22) {
                r2 = listItemSetting22;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingMessageV2View.m73922aN(SettingMessageV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting3 = m73932NM().f140042t;
        int i15 = 8;
        if (AbstractC26683d.f126391B) {
            listItemSetting3.setShowChevronRight(true);
            listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: la0.k3

                /* renamed from: q */
                public final /* synthetic */ ListItemSetting f109417q;

                public /* synthetic */ ViewOnClickListenerC22261k3(ListItemSetting listItemSetting32) {
                    r2 = listItemSetting32;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingMessageV2View.m73923bN(SettingMessageV2View.this, r2, view);
                }
            });
        } else if (AbstractC23309i.m122004i2() && AbstractC26681b.f126356a) {
            listItemSetting32.setShowChevronRight(false);
            listItemSetting32.setSwitch(false);
            listItemSetting32.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.l3

                /* renamed from: b */
                public final /* synthetic */ ListItemSetting f109431b;

                public /* synthetic */ C22270l3(ListItemSetting listItemSetting32) {
                    r2 = listItemSetting32;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    SettingMessageV2View.m73924cN(SettingMessageV2View.this, r2, compoundButton, z11);
                }
            });
        } else {
            listItemSetting32.setVisibility(8);
        }
        ListItemSetting listItemSetting4 = m73932NM().f140036C;
        listItemSetting4.setSwitch(true);
        listItemSetting4.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.m3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109442b;

            public /* synthetic */ C22279m3(ListItemSetting listItemSetting42) {
                r2 = listItemSetting42;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingMessageV2View.m73925dN(SettingMessageV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting5 = m73932NM().f140037D;
        listItemSetting5.setSwitch(true);
        listItemSetting5.m90592m(false);
        listItemSetting5.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.y2

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109591b;

            public /* synthetic */ C22375y2(ListItemSetting listItemSetting52) {
                r2 = listItemSetting52;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingMessageV2View.m73912QM(SettingMessageV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting6 = m73932NM().f140041s;
        listItemSetting6.setShowChevronRight(true);
        listItemSetting6.setOnClickListener(new View.OnClickListener() { // from class: la0.z2

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109605q;

            public /* synthetic */ ViewOnClickListenerC22383z2(ListItemSetting listItemSetting62) {
                r2 = listItemSetting62;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingMessageV2View.m73913RM(SettingMessageV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting7 = m73932NM().f140047y;
        listItemSetting7.setShowChevronRight(true);
        listItemSetting7.m90592m(false);
        listItemSetting7.setOnClickListener(new View.OnClickListener() { // from class: la0.a3

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109285q;

            public /* synthetic */ ViewOnClickListenerC22171a3(ListItemSetting listItemSetting72) {
                r2 = listItemSetting72;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingMessageV2View.m73914SM(SettingMessageV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting8 = m73932NM().f140048z;
        if (AbstractC26689j.m137085L()) {
            i11 = AbstractC8020f0.setting_photo_and_video_hd_title;
        } else {
            i11 = AbstractC8020f0.setting_photo_hd_title;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        listItemSetting8.setTitle(m118743r0);
        listItemSetting8.setSwitch(true);
        listItemSetting8.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.b3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109299b;

            public /* synthetic */ C22180b3(ListItemSetting listItemSetting82) {
                r2 = listItemSetting82;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingMessageV2View.m73915TM(SettingMessageV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting9 = m73932NM().f140045w;
        listItemSetting9.setSwitch(true);
        listItemSetting9.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.c3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109312b;

            public /* synthetic */ C22189c3(ListItemSetting listItemSetting92) {
                r2 = listItemSetting92;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingMessageV2View.m73916UM(SettingMessageV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting10 = m73932NM().f140046x;
        listItemSetting10.setSwitch(true);
        listItemSetting10.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.e3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109342b;

            public /* synthetic */ C22207e3(ListItemSetting listItemSetting102) {
                r2 = listItemSetting102;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingMessageV2View.m73917VM(SettingMessageV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting11 = m73932NM().f140039q;
        listItemSetting11.setSwitch(true);
        listItemSetting11.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.f3

            /* renamed from: b */
            public final /* synthetic */ ListItemSetting f109355b;

            public /* synthetic */ C22216f3(ListItemSetting listItemSetting112) {
                r2 = listItemSetting112;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingMessageV2View.m73918WM(SettingMessageV2View.this, r2, compoundButton, z11);
            }
        });
        ListItemSetting listItemSetting12 = m73932NM().f140040r;
        listItemSetting12.setOnClickListener(new View.OnClickListener() { // from class: la0.g3

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109368q;

            public /* synthetic */ ViewOnClickListenerC22225g3(ListItemSetting listItemSetting122) {
                r2 = listItemSetting122;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingMessageV2View.m73919XM(SettingMessageV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting13 = m73932NM().f140034A;
        listItemSetting13.setShowChevronRight(true);
        listItemSetting13.setOnClickListener(new View.OnClickListener() { // from class: la0.h3

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109381q;

            public /* synthetic */ ViewOnClickListenerC22234h3(ListItemSetting listItemSetting132) {
                r2 = listItemSetting132;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingMessageV2View.m73920YM(SettingMessageV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting14 = m73932NM().f140044v;
        listItemSetting14.setOnClickListener(new View.OnClickListener() { // from class: la0.i3

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109392q;

            public /* synthetic */ ViewOnClickListenerC22243i3(ListItemSetting listItemSetting142) {
                r2 = listItemSetting142;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingMessageV2View.m73921ZM(SettingMessageV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting15 = m73932NM().f140037D;
        if (AbstractC23309i.m121234Ng()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        listItemSetting15.setVisibility(i12);
        m73932NM().f140043u.setVisibility(0);
        ListItemSetting listItemSetting16 = m73932NM().f140040r;
        if (ZMediaPlayerSettings.getVideoConfig(0).getPlayInline() == 1) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        listItemSetting16.setVisibility(i13);
        ListItemSetting listItemSetting17 = m73932NM().f140044v;
        if (AbstractC23306f.m120562A().m2526U()) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        listItemSetting17.setVisibility(i14);
        C24759a m109886m0 = AbstractC23306f.m120652d().m109886m0();
        if (m109886m0.m128663z()) {
            m73932NM().f140034A.setTitle(m109886m0.m128657s());
            m73932NM().f140034A.setVisibility(0);
        } else {
            m73932NM().f140034A.setVisibility(8);
        }
        ListItemSetting listItemSetting18 = m73932NM().f140035B;
        if (C32592h.f150598a.m157755b()) {
            i15 = 0;
        }
        listItemSetting18.setVisibility(i15);
        m73556pM().mo74380Vx();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30138yb m148746b = C30138yb.m148746b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148746b, "inflate(...)");
        m73933gN(m148746b);
        View root = m73932NM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        int i11;
        int i12;
        int i13;
        boolean z11;
        try {
            AbstractC26683d.m137045e();
            m73932NM().f140039q.setSwitch(AbstractC23309i.m121106K());
            m73932NM().f140045w.setSwitch(AbstractC23309i.m121699a0());
            m73932NM().f140037D.setSwitch(AbstractC23309i.m121527Vd());
            m73932NM().f140043u.setSwitch(AbstractC0924m0.m3838gc());
            m73932NM().f140036C.setSwitch(AbstractC0924m0.m4046na());
            m73932NM().f140048z.setSwitch(AbstractC23309i.m121048If());
            m73932NM().f140046x.setSwitch(AbstractC23309i.m121220N2());
            ListItemSetting listItemSetting = m73932NM().f140044v;
            if (AbstractC23306f.m120562A().m2525T()) {
                i11 = AbstractC8020f0.str_setting_display_msg_first_unread;
            } else {
                i11 = AbstractC8020f0.str_setting_display_msg_newest;
            }
            listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(i11));
            if (m73932NM().f140042t.getSwitch() != null) {
                ListItemSetting listItemSetting2 = m73932NM().f140042t;
                if (!AbstractC23165o5.m119333b() && AbstractC23309i.m121966h2() && AbstractC23034c6.m118126L(MainApplication.Companion.m35500c())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                listItemSetting2.setSwitch(z11);
            }
            ListItemSetting listItemSetting3 = m73932NM().f140040r;
            int m104104c = C20048j.f98580a.m104104c();
            if (m104104c != 0) {
                if (m104104c != 2) {
                    i12 = AbstractC8020f0.str_setting_video_mode_auto_play_always;
                } else {
                    i12 = AbstractC8020f0.str_setting_video_mode_auto_play_with_wifi;
                }
            } else {
                i12 = AbstractC8020f0.str_setting_video_mode_auto_play_off;
            }
            listItemSetting3.setStateSetting(AbstractC23136l9.m118743r0(i12));
            ListItemSetting listItemSetting4 = m73932NM().f140034A;
            if (AbstractC23306f.m120660f().m124326d()) {
                i13 = AbstractC8020f0.setting_value_on;
            } else {
                i13 = AbstractC8020f0.setting_value_off;
            }
            listItemSetting4.setStateSetting(AbstractC23136l9.m118743r0(i13));
            m73928hN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
