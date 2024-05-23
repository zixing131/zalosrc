package com.zing.zalo.p077ui.settings.subsettings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetLimitFeedView;
import com.zing.zalo.p077ui.settings.BaseSettingView;
import com.zing.zalo.p077ui.settings.subsettings.SettingFeedPrivacyView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import la0.C22229g7;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import p055ce.C3445n;
import p348mi.AbstractC23309i;
import p492rr.C25959b;
import p492rr.C25973p;
import p649xl.C30036sb;
import p716zh.C32002l4;
import pm0.C24860q;

/* loaded from: classes6.dex */
public final class SettingFeedPrivacyView extends BaseSettingView {
    public static final C13260a Companion = new C13260a(null);

    /* renamed from: T0 */
    private C32002l4 f68226T0 = C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_HAVE_ATTACHMENT_STREAM);

    /* renamed from: U0 */
    public C30036sb f68227U0;

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingFeedPrivacyView$a */
    /* loaded from: classes6.dex */
    public static final class C13260a {
        private C13260a() {
        }

        public /* synthetic */ C13260a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: FM */
    private final void m74503FM(int i11, boolean z11) {
        int i12 = 1;
        if (i11 != 2 && i11 != 4) {
            if (i11 != 21 || !z11) {
                i12 = 0;
            }
        } else if (!z11) {
            i12 = 2;
        }
        m73556pM().mo74371Ie(i11, i12);
    }

    /* renamed from: HM */
    private final void m74504HM() {
        int i11;
        int i12;
        int i13;
        boolean m17340a = C3445n.m17340a();
        RobotoTextView robotoTextView = m74518IM().f139340y;
        int i14 = 8;
        if (m17340a) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        ListItemSetting listItemSetting = m74518IM().f139332q;
        if (m17340a) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        listItemSetting.setVisibility(i12);
        ListItemSetting listItemSetting2 = m74518IM().f139334s;
        if (m17340a) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        listItemSetting2.setVisibility(i13);
        ListItemSetting listItemSetting3 = m74518IM().f139333r;
        if (m17340a) {
            i14 = 0;
        }
        listItemSetting3.setVisibility(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m74505JM(SettingFeedPrivacyView settingFeedPrivacyView, View view) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        settingFeedPrivacyView.m74520TM(1, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m74506KM(SettingFeedPrivacyView settingFeedPrivacyView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingFeedPrivacyView.m74513RM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m74507LM(SettingFeedPrivacyView settingFeedPrivacyView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingFeedPrivacyView.m74513RM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m74508MM(SettingFeedPrivacyView settingFeedPrivacyView, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingFeedPrivacyView.m74513RM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m74509NM(SettingFeedPrivacyView settingFeedPrivacyView, View view) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        settingFeedPrivacyView.m74520TM(4, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m74510OM(SettingFeedPrivacyView settingFeedPrivacyView, View view) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        settingFeedPrivacyView.m74520TM(3, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m74511PM(SettingFeedPrivacyView settingFeedPrivacyView, View view) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        settingFeedPrivacyView.m74520TM(2, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m74512QM(SettingFeedPrivacyView settingFeedPrivacyView, View view) {
        AbstractC19074t.m100208f(settingFeedPrivacyView, "this$0");
        Bundle bundle = new Bundle();
        C17487o0 m92662fJ = settingFeedPrivacyView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(BottomSheetLimitFeedView.class, bundle, 2222, 1, true);
        }
    }

    /* renamed from: RM */
    private final void m74513RM(ListItemSetting listItemSetting, boolean z11) {
        if (AbstractC19074t.m100204b(listItemSetting, m74518IM().f139332q)) {
            m74503FM(21, z11);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74518IM().f139334s)) {
            m74503FM(2, z11);
        } else if (AbstractC19074t.m100204b(listItemSetting, m74518IM().f139333r)) {
            m74503FM(4, z11);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: GM */
    public final void m74517GM(int i11, long j11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ListItemSetting listItemSetting = m74518IM().f139335t;
        if (i11 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItemSetting.setTick(z11);
        ListItemSetting listItemSetting2 = m74518IM().f139336u;
        if (i11 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        listItemSetting2.setTick(z12);
        ListItemSetting listItemSetting3 = m74518IM().f139337v;
        if (i11 == 3) {
            z13 = true;
        } else {
            z13 = false;
        }
        listItemSetting3.setTick(z13);
        ListItemSetting listItemSetting4 = m74518IM().f139338w;
        if (i11 == 2) {
            z14 = true;
        } else {
            z14 = false;
        }
        listItemSetting4.setTick(z14);
        ListItemSetting listItemSetting5 = m74518IM().f139339x;
        if (i11 == 5) {
            z15 = true;
        } else {
            z15 = false;
        }
        listItemSetting5.setTick(z15);
        if (i11 == 5) {
            ListItemSetting listItemSetting6 = m74518IM().f139339x;
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_limit_feed_visible_option_custom_desc_allow, AbstractC23160o0.m119288s0(j11));
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            listItemSetting6.setSubtitle(m118746s0);
        }
    }

    /* renamed from: IM */
    public final C30036sb m74518IM() {
        C30036sb c30036sb = this.f68227U0;
        if (c30036sb != null) {
            return c30036sb;
        }
        AbstractC19074t.m100223u("binding");
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
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_allow_view_and_comment);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    public final void m74519SM(C30036sb c30036sb) {
        AbstractC19074t.m100208f(c30036sb, "<set-?>");
        this.f68227U0 = c30036sb;
    }

    /* renamed from: TM */
    public final void m74520TM(int i11, long j11) {
        m74517GM(i11, j11);
        if (i11 != 0) {
            C24860q m133791c = C25973p.f123927a.m133791c(i11, j11);
            m73556pM().mo74385gy(((Number) m133791c.m129215c()).intValue(), ((Number) m133791c.m129216d()).longValue(), this.f68226T0);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SocialPrivacyView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 133;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m74518IM().f139332q;
        AbstractC19074t.m100207e(listItemSetting, "itemAllow10Feed");
        ListItemSetting listItemSetting2 = m74518IM().f139334s;
        AbstractC19074t.m100207e(listItemSetting2, "itemAllowViewPhoto");
        ListItemSetting listItemSetting3 = m74518IM().f139333r;
        AbstractC19074t.m100207e(listItemSetting3, "itemAllowComment");
        return new C22229g7[]{new C22229g7(listItemSetting, 8), new C22229g7(listItemSetting2, 7), new C22229g7(listItemSetting3, 6)};
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        long j11;
        if (i11 == 2222 && i12 == -1) {
            if (intent != null) {
                j11 = intent.getLongExtra("EXTRA_TIME_LIMIT_FEED", -1L);
            } else {
                j11 = -1;
            }
            if (j11 != -1) {
                m74520TM(5, j11);
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        ListItemSetting listItemSetting = m74518IM().f139335t;
        listItemSetting.setIdTracking("limit_visible_feed");
        listItemSetting.setTick(true);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: oa0.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingFeedPrivacyView.m74505JM(SettingFeedPrivacyView.this, view);
            }
        });
        ListItemSetting listItemSetting2 = m74518IM().f139336u;
        listItemSetting2.setIdTracking("limit_visible_feed");
        listItemSetting2.setTick(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: oa0.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingFeedPrivacyView.m74509NM(SettingFeedPrivacyView.this, view);
            }
        });
        ListItemSetting listItemSetting3 = m74518IM().f139337v;
        listItemSetting3.setIdTracking("limit_visible_feed");
        listItemSetting3.setTick(false);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: oa0.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingFeedPrivacyView.m74510OM(SettingFeedPrivacyView.this, view);
            }
        });
        ListItemSetting listItemSetting4 = m74518IM().f139338w;
        listItemSetting4.setIdTracking("limit_visible_feed");
        listItemSetting4.setTick(false);
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: oa0.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingFeedPrivacyView.m74511PM(SettingFeedPrivacyView.this, view);
            }
        });
        ListItemSetting listItemSetting5 = m74518IM().f139339x;
        listItemSetting5.setIdTracking("limit_visible_feed");
        listItemSetting5.setTick(false);
        listItemSetting5.m90592m(false);
        listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: oa0.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingFeedPrivacyView.m74512QM(SettingFeedPrivacyView.this, view);
            }
        });
        final ListItemSetting listItemSetting6 = m74518IM().f139332q;
        listItemSetting6.setIdTracking("view_feed");
        listItemSetting6.setSwitch(true);
        listItemSetting6.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.x
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingFeedPrivacyView.m74506KM(SettingFeedPrivacyView.this, listItemSetting6, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting7 = m74518IM().f139334s;
        listItemSetting7.setIdTracking("view_photo");
        listItemSetting7.setSwitch(true);
        listItemSetting7.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.y
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingFeedPrivacyView.m74507LM(SettingFeedPrivacyView.this, listItemSetting7, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting8 = m74518IM().f139333r;
        listItemSetting8.setIdTracking("allow_comment");
        listItemSetting8.setSwitch(true);
        listItemSetting8.m90592m(false);
        listItemSetting8.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa0.z
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingFeedPrivacyView.m74508MM(SettingFeedPrivacyView.this, listItemSetting8, compoundButton, z11);
            }
        });
        m74504HM();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C30036sb m148498b = C30036sb.m148498b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148498b, "inflate(...)");
        m74519SM(m148498b);
        View root = m74518IM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        boolean z11;
        C25959b c25959b = C25959b.f123885a;
        c25959b.m133735e();
        m74517GM(C25973p.f123927a.m133790b(c25959b.m133733b(), c25959b.m133732a()), c25959b.m133732a());
        if (C3445n.m17340a()) {
            m74518IM().f139332q.setSwitch(AbstractC23309i.m120821Ca());
            ListItemSetting listItemSetting = m74518IM().f139334s;
            boolean z12 = false;
            if (AbstractC23309i.m120784Ba() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            listItemSetting.setSwitch(z11);
            ListItemSetting listItemSetting2 = m74518IM().f139333r;
            if (AbstractC23309i.m122350ra() == 1) {
                z12 = true;
            }
            listItemSetting2.setSwitch(z12);
        }
    }
}
