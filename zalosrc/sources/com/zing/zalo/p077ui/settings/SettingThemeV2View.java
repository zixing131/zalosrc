package com.zing.zalo.p077ui.settings;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.SettingThemeV2View;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.p077ui.zviews.SettingFontSizeView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.RadioButton;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import la0.C22229g7;
import la0.InterfaceC22266l;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23152n3;
import me0.AbstractC23193r0;
import me0.C23212s8;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p405ov.C24559a;
import p542ub.InterfaceC27218a;
import p649xl.C29840hc;

/* loaded from: classes6.dex */
public final class SettingThemeV2View extends BaseSettingView {

    /* renamed from: T0 */
    public C29840hc f67960T0;

    /* renamed from: U0 */
    private int f67961U0;

    /* renamed from: com.zing.zalo.ui.settings.SettingThemeV2View$a */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC13173a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ RoundCornerImageView f67962p;

        ViewTreeObserverOnGlobalLayoutListenerC13173a(RoundCornerImageView roundCornerImageView) {
            this.f67962p = roundCornerImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int m116584g;
            m116584g = AbstractC22543l.m116584g(this.f67962p.getWidth(), AbstractC23136l9.m118742r(128.0f));
            int i11 = (m116584g * 76) / 80;
            if (this.f67962p.getHeight() == i11 && this.f67962p.getWidth() == m116584g) {
                this.f67962p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f67962p.getLayoutParams();
            layoutParams.width = m116584g;
            layoutParams.height = i11;
            this.f67962p.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingThemeV2View$b */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC13174b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ RoundCornerImageView f67963p;

        ViewTreeObserverOnGlobalLayoutListenerC13174b(RoundCornerImageView roundCornerImageView) {
            this.f67963p = roundCornerImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int m116584g;
            m116584g = AbstractC22543l.m116584g(this.f67963p.getWidth(), AbstractC23136l9.m118742r(128.0f));
            int i11 = (m116584g * 76) / 80;
            if (this.f67963p.getHeight() == i11 && this.f67963p.getWidth() == m116584g) {
                this.f67963p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f67963p.getLayoutParams();
            layoutParams.width = m116584g;
            layoutParams.height = i11;
            this.f67963p.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingThemeV2View$c */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC13175c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ RoundCornerImageView f67964p;

        ViewTreeObserverOnGlobalLayoutListenerC13175c(RoundCornerImageView roundCornerImageView) {
            this.f67964p = roundCornerImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int m116584g;
            m116584g = AbstractC22543l.m116584g(this.f67964p.getWidth(), AbstractC23136l9.m118742r(128.0f));
            int i11 = (m116584g * 76) / 80;
            if (this.f67964p.getHeight() == i11 && this.f67964p.getWidth() == m116584g) {
                this.f67964p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f67964p.getLayoutParams();
            layoutParams.width = m116584g;
            layoutParams.height = i11;
            this.f67964p.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m74129GM(SettingThemeV2View settingThemeV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingThemeV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingThemeV2View.m74135MM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m74130HM(SettingThemeV2View settingThemeV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingThemeV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingThemeV2View.m74135MM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m74131IM(SettingThemeV2View settingThemeV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingThemeV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingThemeV2View.m74135MM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m74132JM(SettingThemeV2View settingThemeV2View, View view) {
        AbstractC19074t.m100208f(settingThemeV2View, "this$0");
        settingThemeV2View.m74140EM(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m74133KM(SettingThemeV2View settingThemeV2View, View view) {
        AbstractC19074t.m100208f(settingThemeV2View, "this$0");
        settingThemeV2View.m74140EM(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m74134LM(SettingThemeV2View settingThemeV2View, View view) {
        AbstractC19074t.m100208f(settingThemeV2View, "this$0");
        settingThemeV2View.m74140EM(2);
    }

    /* renamed from: MM */
    private final void m74135MM(ListItemSetting listItemSetting) {
        C17487o0 m92662fJ;
        if (AbstractC19074t.m100204b(listItemSetting, m74141FM().f138052t)) {
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(SettingFontView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74141FM().f138054v)) {
            AbstractC23647d.m123897g("110000");
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(SettingFontSizeView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74141FM().f138053u) && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93069k2(SettingLanguageView.class, null, 1, true);
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m74136QM() {
        AbstractC23152n3.m118985A0(null);
        AbstractC23193r0.m119508q();
    }

    /* renamed from: EM */
    public final void m74140EM(int i11) {
        if (i11 != this.f67961U0) {
            m74143OM(i11);
            m74144PM(i11);
        }
        InterfaceC22266l m73556pM = m73556pM();
        LinearLayout linearLayout = m74141FM().f138055w;
        AbstractC19074t.m100207e(linearLayout, "layoutTheme");
        m73556pM.mo74383a6(linearLayout);
    }

    /* renamed from: FM */
    public final C29840hc m74141FM() {
        C29840hc c29840hc = this.f67960T0;
        if (c29840hc != null) {
            return c29840hc;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: NM */
    public final void m74142NM(C29840hc c29840hc) {
        AbstractC19074t.m100208f(c29840hc, "<set-?>");
        this.f67960T0 = c29840hc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_theme_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OM */
    public final void m74143OM(int i11) {
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        this.f67961U0 = i11;
        boolean z13 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i11 < 0 || i11 > 2) {
                this.f67961U0 = 2;
            }
        } else if (i11 < 0 || i11 > 1) {
            this.f67961U0 = 0;
        }
        RoundCornerImageView roundCornerImageView = m74141FM().f138050r;
        if (this.f67961U0 == 0) {
            i12 = AbstractC16803z.bg_select_theme_v2;
        } else {
            i12 = AbstractC17466e.transparent;
        }
        roundCornerImageView.setBackgroundResource(i12);
        RoundCornerImageView roundCornerImageView2 = m74141FM().f138049q;
        if (this.f67961U0 == 1) {
            i13 = AbstractC16803z.bg_select_theme_v2;
        } else {
            i13 = AbstractC17466e.transparent;
        }
        roundCornerImageView2.setBackgroundResource(i13);
        RoundCornerImageView roundCornerImageView3 = m74141FM().f138051s;
        if (this.f67961U0 == 2) {
            i14 = AbstractC16803z.bg_select_theme_v2;
        } else {
            i14 = AbstractC17466e.transparent;
        }
        roundCornerImageView3.setBackgroundResource(i14);
        RadioButton radioButton = m74141FM().f138047C;
        if (this.f67961U0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        radioButton.setChecked(z11);
        RadioButton radioButton2 = m74141FM().f138046B;
        if (this.f67961U0 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        radioButton2.setChecked(z12);
        RadioButton radioButton3 = m74141FM().f138045A;
        if (this.f67961U0 == 1) {
            z13 = true;
        }
        radioButton3.setChecked(z13);
    }

    /* renamed from: PM */
    public final void m74144PM(int i11) {
        try {
            C24559a.m127933c("SettingTheme", "User update theme to " + i11);
            if (CoreUtility.f89235k.get()) {
                AbstractC23304d.f113375d2 = true;
            }
            AbstractC23148n.m118851y(31, i11, 31);
            C23212s8.m119597d(m92648SI(), false, 0, 0, 14, null);
            if (Build.VERSION.SDK_INT < 23) {
                ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_app_need_restart_when_theme_change_android_5_message));
                mo78955kl(new Runnable() { // from class: la0.u5
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingThemeV2View.m74136QM();
                    }
                }, 2000L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingThemeView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 104;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        LinearLayout linearLayout = m74141FM().f138055w;
        AbstractC19074t.m100207e(linearLayout, "layoutTheme");
        ListItemSetting listItemSetting = m74141FM().f138052t;
        AbstractC19074t.m100207e(listItemSetting, "itemChangeFont");
        ListItemSetting listItemSetting2 = m74141FM().f138054v;
        AbstractC19074t.m100207e(listItemSetting2, "itemChangeSizeText");
        ListItemSetting listItemSetting3 = m74141FM().f138053u;
        AbstractC19074t.m100207e(listItemSetting3, "itemChangeLanguage");
        return new C22229g7[]{new C22229g7(linearLayout, 78), new C22229g7(listItemSetting, 80), new C22229g7(listItemSetting2, 97), new C22229g7(listItemSetting3, 79)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        final ListItemSetting listItemSetting = m74141FM().f138052t;
        listItemSetting.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting.setShowChevronRight(true);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.o5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingThemeV2View.m74129GM(SettingThemeV2View.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m74141FM().f138054v;
        listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting2.setShowChevronRight(true);
        listItemSetting2.m90592m(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.p5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingThemeV2View.m74130HM(SettingThemeV2View.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m74141FM().f138053u;
        listItemSetting3.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting3.setShowChevronRight(true);
        listItemSetting3.m90592m(false);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: la0.q5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingThemeV2View.m74131IM(SettingThemeV2View.this, listItemSetting3, view);
            }
        });
        if (Build.VERSION.SDK_INT < 29) {
            m74141FM().f138058z.setVisibility(8);
        }
        m74141FM().f138057y.setOnClickListener(new View.OnClickListener() { // from class: la0.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingThemeV2View.m74132JM(SettingThemeV2View.this, view);
            }
        });
        m74141FM().f138056x.setOnClickListener(new View.OnClickListener() { // from class: la0.s5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingThemeV2View.m74133KM(SettingThemeV2View.this, view);
            }
        });
        m74141FM().f138058z.setOnClickListener(new View.OnClickListener() { // from class: la0.t5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingThemeV2View.m74134LM(SettingThemeV2View.this, view);
            }
        });
        RoundCornerImageView roundCornerImageView = m74141FM().f138050r;
        roundCornerImageView.setRoundCornerColor(0);
        roundCornerImageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13173a(roundCornerImageView));
        RoundCornerImageView roundCornerImageView2 = m74141FM().f138049q;
        roundCornerImageView2.setRoundCornerColor(0);
        roundCornerImageView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13174b(roundCornerImageView2));
        RoundCornerImageView roundCornerImageView3 = m74141FM().f138051s;
        roundCornerImageView3.setRoundCornerColor(0);
        roundCornerImageView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13175c(roundCornerImageView3));
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29840hc m148044b = C29840hc.m148044b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148044b, "inflate(...)");
        m74142NM(m148044b);
        View root = m74141FM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
        String str;
        int i11;
        String[] stringArray = m92651WI().getStringArray(AbstractC16775v.array_language);
        AbstractC19074t.m100207e(stringArray, "getStringArray(...)");
        String[] stringArray2 = m92651WI().getStringArray(AbstractC16775v.array_language_as_code);
        AbstractC19074t.m100207e(stringArray2, "getStringArray(...)");
        String[] stringArray3 = m92651WI().getStringArray(AbstractC16775v.array_font_setting);
        AbstractC19074t.m100207e(stringArray3, "getStringArray(...)");
        int m122089kb = AbstractC23309i.m122089kb();
        int m122165mb = AbstractC23309i.m122165mb();
        ListItemSetting listItemSetting = m74141FM().f138052t;
        int i12 = 0;
        if (m122089kb >= 0 && m122089kb < stringArray3.length) {
            str = stringArray3[m122089kb];
        } else {
            str = stringArray3[0];
        }
        listItemSetting.setStateSetting(str);
        int length = stringArray2.length;
        int i13 = 0;
        while (true) {
            if (i13 < length) {
                if (AbstractC18458a.f93019a.equals(stringArray2[i13])) {
                    break;
                } else {
                    i13++;
                }
            } else {
                i13 = 0;
                break;
            }
        }
        if (i13 >= 0 && i13 < stringArray.length) {
            i12 = i13;
        }
        m74141FM().f138053u.setStateSetting(stringArray[i12]);
        RobotoTextView tvState = m74141FM().f138053u.getTvState();
        if (tvState != null) {
            if (i12 == 1) {
                i11 = AbstractC16803z.ic_language_en;
            } else {
                i11 = AbstractC16803z.ic_language_vn;
            }
            tvState.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118663M(i11), (Drawable) null, (Drawable) null, (Drawable) null);
            tvState.setCompoundDrawablePadding(AbstractC23136l9.m118742r(8.0f));
        }
        m74141FM().f138054v.setStateSetting("");
        m74143OM(m122165mb);
    }
}
