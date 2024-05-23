package com.zing.zalo.p077ui.settings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import b90.EnumC2667d;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo;
import com.zing.zalo.p077ui.maintab.me.TabMeAdapter;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC16969d0;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zdesign.component.Switch;
import fn0.AbstractC19074t;
import is.EnumC20799i;
import k30.C21459a;
import kotlin.NoWhenBranchMatchedException;
import kw.C21956b;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mw.AbstractC23463h;
import nl.C23870a;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import r70.C25673e;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;
import vl0.AbstractC28291a;

/* loaded from: classes6.dex */
public final class ListItemSetting extends ListItem {

    /* renamed from: G */
    private RobotoTextView f68293G;

    /* renamed from: H */
    private ZAppCompatImageView f68294H;

    /* renamed from: I */
    private ZAppCompatImageView f68295I;

    /* renamed from: J */
    private Switch f68296J;

    /* renamed from: K */
    private CheckBox f68297K;

    /* renamed from: L */
    private String f68298L;

    /* renamed from: M */
    public AppCompatImageView f68299M;

    /* renamed from: N */
    public LinearLayout f68300N;

    /* renamed from: O */
    private boolean f68301O;

    /* renamed from: P */
    private CompoundButton.OnCheckedChangeListener f68302P;

    /* renamed from: Q */
    private boolean f68303Q;

    /* renamed from: com.zing.zalo.ui.settings.widget.ListItemSetting$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13287a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68304a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f68305b;

        static {
            int[] iArr = new int[EnumC20799i.values().length];
            try {
                iArr[EnumC20799i.f102205s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20799i.f102200A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f68304a = iArr;
            int[] iArr2 = new int[EnumC2667d.values().length];
            try {
                iArr2[EnumC2667d.f10677s.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC2667d.f10683y.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2667d.f10678t.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2667d.f10679u.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC2667d.f10680v.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC2667d.f10682x.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC2667d.f10681w.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            f68305b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemSetting(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f68298L = "SETTING_DEFAULT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m74600B(ListItemSetting listItemSetting, CheckBox checkBox, View view) {
        AbstractC19074t.m100208f(listItemSetting, "$this_run");
        AbstractC19074t.m100208f(checkBox, "$this_apply");
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = listItemSetting.f68302P;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(checkBox, checkBox.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m74601C(ListItemSetting listItemSetting, CheckBox checkBox, View view) {
        AbstractC19074t.m100208f(listItemSetting, "$this_run");
        AbstractC19074t.m100208f(checkBox, "$this_apply");
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = listItemSetting.f68302P;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(checkBox, checkBox.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m74602D(ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(listItemSetting, "this$0");
        CheckBox checkBox = listItemSetting.f68297K;
        if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = listItemSetting.f68302P;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(checkBox, checkBox.isChecked());
            }
        }
        Switch r32 = listItemSetting.f68296J;
        if (r32 != null) {
            if (!listItemSetting.f68303Q) {
                r32.setChecked(!r32.isChecked());
            }
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = listItemSetting.f68302P;
            if (onCheckedChangeListener2 != null) {
                onCheckedChangeListener2.onCheckedChanged(r32, r32.isChecked());
            }
        }
    }

    /* renamed from: F */
    public static /* synthetic */ void m74603F(ListItemSetting listItemSetting, int i11, EnumC16952b0 enumC16952b0, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            enumC16952b0 = EnumC16952b0.CENTER;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        listItemSetting.m74616E(i11, enumC16952b0, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m74604H(ListItemSetting listItemSetting, Switch r12, View view) {
        AbstractC19074t.m100208f(listItemSetting, "$this_run");
        AbstractC19074t.m100208f(r12, "$this_apply");
        if (listItemSetting.f68303Q) {
            r12.setChecked(!r12.isChecked());
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = listItemSetting.f68302P;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(r12, !r12.isChecked());
        }
    }

    private final View getZcloudSettingBottomView() {
        View bottomItem;
        if (getBottomItem() != null && (bottomItem = getBottomItem()) != null && bottomItem.getId() == AbstractC6918a0.zcloud_tab_me_progress_bar) {
            View bottomItem2 = getBottomItem();
            AbstractC19074t.m100206d(bottomItem2, "null cannot be cast to non-null type android.view.View");
            return bottomItem2;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        ProgressBar progressBar = new ProgressBar(context, AbstractC2814h.ProgressBar_Horizontal);
        progressBar.setId(AbstractC6918a0.zcloud_tab_me_progress_bar);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC2807a.progress_indicator_blue));
        progressBar.setVisibility(0);
        linearLayout.addView(progressBar);
        Context context2 = linearLayout.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context2);
        robotoTextView.setId(AbstractC6918a0.zcloud_tab_me_progress_bar_desc);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        robotoTextView.setPadding(0, AbstractC23222t7.f112556e, 0, 0);
        Context context3 = robotoTextView.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26708g(robotoTextView).m137319a(C26705d.m137293a(context3, AbstractC2814h.t_small));
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.list_item_subtitle));
        robotoTextView.setVisibility(0);
        linearLayout.addView(robotoTextView);
        m90586b(linearLayout);
        setPaddingTopOfBottom(EnumC16969d0.PADDING_8);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m74610v(TabMeAdapter.InterfaceC12140b interfaceC12140b, C25673e c25673e, View view) {
        if (interfaceC12140b != null) {
            interfaceC12140b.mo67853a(c25673e);
        }
    }

    /* renamed from: w */
    private final void m74611w() {
        int m119606n;
        int m116584g;
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        CloudQuotaUsage m124755z0 = C23870a.m124755z0(m120679j2, null, null, 3, null);
        long m41231g = m124755z0.m41231g();
        long m41232h = m124755z0.m41232h();
        EnumC2667d m123181i = AbstractC23463h.m123181i(m124755z0, false, 2, null);
        C21956b.m114661k(m123181i, C21956b.a.f108073q);
        setSubtitle(m123181i.mo13110i());
        setSubtitleColor(m123181i.mo13111j());
        View bottomItem = getBottomItem();
        if (bottomItem != null && bottomItem.getId() == AbstractC6918a0.quota_tab_me_progressbar) {
            ProgressBar progressBar = (ProgressBar) bottomItem;
            switch (C13287a.f68305b[m123181i.ordinal()]) {
                case 1:
                case 2:
                    m119606n = C23212s8.m119606n(AbstractC2807a.accent_blue_background);
                    break;
                case 3:
                    m119606n = C23212s8.m119606n(AbstractC2807a.accent_yellow_background);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    m119606n = C23212s8.m119606n(AbstractC2807a.accent_red_background);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            progressBar.setProgressIndicatorColor(m119606n);
            if (m41231g > 0) {
                m116584g = AbstractC22543l.m116584g((int) ((m41232h / m41231g) * 100), 100);
            } else {
                m116584g = 0;
            }
            progressBar.setProgress(m116584g);
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: x */
    private final void m74612x() {
        View bottomItem;
        Badge badgeTitle = getBadgeTitle();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(EnumC16991i.NEW_TEXT);
        badgeTitle.m90493g(c16974f);
        Badge badgeTitle2 = getBadgeTitle();
        CharSequence m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_new);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        badgeTitle2.setBadgeText(m118743r0);
        if (getBottomItem() == null || (bottomItem = getBottomItem()) == null || bottomItem.getId() != AbstractC6918a0.quota_tab_me_progressbar) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            ProgressBar progressBar = new ProgressBar(context2, AbstractC2814h.ProgressBar_Horizontal);
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            progressBar.setProgressIndicatorColor(AbstractC23136l9.m118639A(AbstractC2808b.f150821b60));
            progressBar.setProgress(0);
            progressBar.setId(AbstractC6918a0.quota_tab_me_progressbar);
            m90586b(progressBar);
            setPaddingTopOfBottom(EnumC16969d0.PADDING_8);
        }
        m74611w();
    }

    /* renamed from: y */
    private final void m74613y(C25673e c25673e) {
        CharSequence m118743r0;
        int m116580c;
        if (c25673e.m132576p()) {
            getZcloudSettingBottomView();
            ProgressBar progressBar = (ProgressBar) findViewById(AbstractC6918a0.zcloud_tab_me_progress_bar);
            if (progressBar != null) {
                AbstractC19074t.m100205c(progressBar);
                if (c25673e.m132574n()) {
                    progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC28291a.storage_legend_paused));
                    progressBar.setProgressBackgroundColor(C23212s8.m119606n(AbstractC28291a.storage_legend_empty));
                } else {
                    progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC2807a.progress_indicator_blue));
                    progressBar.setProgressBackgroundColor(C23212s8.m119606n(AbstractC2807a.progress_track_background_black));
                }
                m116580c = AbstractC22543l.m116580c(c25673e.m132569i(), 0);
                progressBar.setProgress(m116580c);
            }
            RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.zcloud_tab_me_progress_bar_desc);
            if (robotoTextView != null) {
                AbstractC19074t.m100205c(robotoTextView);
                robotoTextView.setText(c25673e.m132570j());
            }
            if (c25673e.m132574n()) {
                ImageView imageView = new ImageView(getContext());
                int i11 = AbstractC23222t7.f112582r;
                imageView.setLayoutParams(new ViewGroup.LayoutParams(i11, i11));
                Context context = imageView.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                imageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.badge_background_muted));
                m90589e(imageView);
                setTrailingGravity(EnumC16952b0.CENTER);
                setTrailingItemVisibility(0);
            }
            setSubtitle("");
            setBottomItemVisibility(0);
        } else if (AbstractC23306f.m120691m2().m2468s()) {
            if (AbstractC23306f.m120636Y1().m128530o()) {
                if (AbstractC23306f.m120636Y1().m128531p()) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_you_are_not_connect_to_zcloud);
                    AbstractC19074t.m100205c(m118743r0);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_banner_remind_restore_title);
                    AbstractC19074t.m100205c(m118743r0);
                }
                setSubtitle(m118743r0);
                setBottomItemVisibility(0);
                ImageView imageView2 = new ImageView(getContext());
                int i12 = AbstractC23222t7.f112586t;
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(i12, i12));
                imageView2.setImageResource(AbstractC2810d.zds_ic_exclamation_solid_16);
                Context context2 = imageView2.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                imageView2.setBackground(C27280g.m139660c(context2, AbstractC16803z.triangle_shape, AbstractC2807a.warning_icon));
                m90589e(imageView2);
                setTrailingGravity(EnumC16952b0.CENTER);
                setTrailingItemVisibility(0);
            } else if (AbstractC23306f.m120636Y1().m128529n()) {
                CharSequence m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_setup_incomplete);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                setSubtitle(m118743r02);
                setBottomItemVisibility(0);
                ImageView imageView3 = new ImageView(getContext());
                int i13 = AbstractC23222t7.f112586t;
                imageView3.setLayoutParams(new ViewGroup.LayoutParams(i13, i13));
                imageView3.setImageResource(AbstractC2810d.zds_ic_exclamation_solid_16);
                Context context3 = imageView3.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                imageView3.setBackground(C27280g.m139660c(context3, AbstractC16803z.triangle_shape, AbstractC2807a.warning_icon));
                m90589e(imageView3);
                setTrailingGravity(EnumC16952b0.CENTER);
                setTrailingItemVisibility(0);
            } else {
                setSubtitle(c25673e.m132564d());
                setBottomItemVisibility(8);
            }
        } else if (AbstractC23306f.m120636Y1().m128529n()) {
            setSubtitle(c25673e.m132564d());
            if (c25673e.m132574n()) {
                ImageView imageView4 = new ImageView(getContext());
                int i14 = AbstractC23222t7.f112586t;
                imageView4.setLayoutParams(new ViewGroup.LayoutParams(i14, i14));
                imageView4.setImageResource(AbstractC2810d.zds_ic_exclamation_solid_16);
                Context context4 = imageView4.getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                imageView4.setBackground(C27280g.m139660c(context4, AbstractC16803z.triangle_shape, AbstractC2807a.warning_icon));
                m90589e(imageView4);
                setTrailingGravity(EnumC16952b0.CENTER);
                setTrailingItemVisibility(0);
            }
            setBottomItemVisibility(8);
        } else {
            setSubtitle(c25673e.m132564d());
            setBottomItemVisibility(8);
        }
        m74614z();
    }

    /* renamed from: z */
    private final void m74614z() {
        long j11;
        boolean m89808w = C16805b.Companion.m89811a().m89808w();
        boolean m2466q = AbstractC23306f.m120691m2().m2466q();
        if (m89808w) {
            Badge badgeTitle = getBadgeTitle();
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16974f c16974f = new C16974f(context);
            c16974f.m90974x(EnumC16991i.NEW_TEXT);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_beta_badge);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c16974f.m90972v(m118743r0);
            setVisibility(0);
            badgeTitle.m90493g(c16974f);
            return;
        }
        if (m2466q) {
            CloudSubscriptionInfo m2458h = AbstractC23306f.m120691m2().m2458h();
            if (m2458h != null) {
                j11 = m2458h.m41320d();
            } else {
                j11 = 0;
            }
            Badge badgeTitle2 = getBadgeTitle();
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            C16974f c16974f2 = new C16974f(context2);
            c16974f2.m90974x(EnumC16991i.CUSTOM);
            c16974f2.m90965o(C23212s8.m119607o(c16974f2.m90953c(), AbstractC2807a.accent_sky_blue_background_subtle));
            c16974f2.m90973w(C23212s8.m119607o(c16974f2.m90953c(), AbstractC2807a.accent_sky_blue_text_bold));
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_badge, C21459a.m111038f(j11, 0, 2, null));
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            c16974f2.m90972v(m118746s0);
            badgeTitle2.m90493g(c16974f2);
            if (!AbstractC23306f.m120636Y1().m128530o() && !AbstractC23306f.m120636Y1().m128529n() && j11 > 0) {
                getBadgeTitle().setVisibility(0);
                return;
            } else {
                getBadgeTitle().setVisibility(8);
                return;
            }
        }
        getBadgeTitle().setVisibility(8);
    }

    /* renamed from: A */
    public final boolean m74615A() {
        Switch r02 = this.f68296J;
        if (r02 != null) {
            return r02.isChecked();
        }
        return false;
    }

    /* renamed from: E */
    public final void m74616E(int i11, EnumC16952b0 enumC16952b0, int i12) {
        AbstractC19074t.m100208f(enumC16952b0, "gravity");
        if (i11 != 0) {
            ZAppCompatImageView zAppCompatImageView = this.f68294H;
            if (zAppCompatImageView != null) {
                if (i12 == 0) {
                    zAppCompatImageView.setImageDrawable(C27280g.m139660c(MainApplication.Companion.m35500c(), i11, AbstractC2807a.icon_02));
                } else {
                    zAppCompatImageView.setImageDrawable(C27280g.m139659b(MainApplication.Companion.m35500c(), i11, i12));
                }
                zAppCompatImageView.setVisibility(0);
            } else {
                ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(getContext());
                if (i12 == 0) {
                    zAppCompatImageView2.setImageDrawable(C27280g.m139660c(MainApplication.Companion.m35500c(), i11, AbstractC2807a.icon_02));
                } else {
                    zAppCompatImageView2.setImageDrawable(C27280g.m139659b(MainApplication.Companion.m35500c(), i11, i12));
                }
                zAppCompatImageView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                m90587c(zAppCompatImageView2);
                this.f68294H = zAppCompatImageView2;
                setLeadingGravity(enumC16952b0);
            }
            m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
            return;
        }
        ZAppCompatImageView zAppCompatImageView3 = this.f68294H;
        if (zAppCompatImageView3 != null) {
            zAppCompatImageView3.setVisibility(8);
        }
        m90591l(AbstractC23136l9.m118742r(16.0f), 0, 0, 0);
    }

    /* renamed from: G */
    public final void m74617G(boolean z11, boolean z12) {
        Switch r02 = this.f68296J;
        if (r02 != null) {
            r02.m90686i(z11, z12);
            return;
        }
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        final Switch r03 = new Switch(context);
        r03.m90686i(z11, z12);
        r03.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        r03.setIdTracking(this.f68298L);
        r03.setOnClickListener(new View.OnClickListener() { // from class: ra0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListItemSetting.m74604H(ListItemSetting.this, r03, view);
            }
        });
        getLlRight().addView(r03);
        this.f68296J = r03;
    }

    public final CheckBox getCheckBox() {
        return this.f68297K;
    }

    public final boolean getDisableSwitch() {
        return this.f68303Q;
    }

    public final AppCompatImageView getIconRemind() {
        AppCompatImageView appCompatImageView = this.f68299M;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AbstractC19074t.m100223u("iconRemind");
        return null;
    }

    public final ZAppCompatImageView getIconSetting() {
        return this.f68294H;
    }

    public final ZAppCompatImageView getIconTick() {
        return this.f68295I;
    }

    public final LinearLayout getLlRight() {
        LinearLayout linearLayout = this.f68300N;
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC19074t.m100223u("llRight");
        return null;
    }

    public final Switch getSwitch() {
        return this.f68296J;
    }

    public final RobotoTextView getTvState() {
        return this.f68293G;
    }

    public final String getViewIdTracking() {
        return this.f68298L;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m90591l(AbstractC23136l9.m118742r(16.0f), 0, 0, 0);
        setTitleMaxLine(10);
        setSubtitleMaxLine(10);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(28.0f), AbstractC23136l9.m118742r(16.0f));
        layoutParams.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setPadding(0, 0, AbstractC23136l9.m118742r(12.0f), 0);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setId(AbstractC6918a0.icon_setting_reminder);
        setIconRemind(appCompatImageView);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.addView(getIconRemind());
        setLlRight(linearLayout);
        m90589e(getLlRight());
        setTrailingGravity(EnumC16952b0.CENTER);
    }

    public final void setCheckBox(CheckBox checkBox) {
        this.f68297K = checkBox;
    }

    public final void setCheckBoxRight(boolean z11) {
        CheckBox checkBox = this.f68297K;
        if (checkBox != null) {
            checkBox.setChecked(z11);
            return;
        }
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        final CheckBox checkBox2 = new CheckBox(context);
        checkBox2.setChecked(z11);
        checkBox2.setIdTracking(this.f68298L);
        checkBox2.setOnClickListener(new View.OnClickListener() { // from class: ra0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListItemSetting.m74601C(ListItemSetting.this, checkBox2, view);
            }
        });
        checkBox2.setChecked(z11);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        checkBox2.setLayoutParams(layoutParams);
        getLlRight().addView(checkBox2);
        this.f68297K = checkBox2;
        setLeadingGravity(EnumC16952b0.CENTER);
    }

    public final void setCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        AbstractC19074t.m100208f(onCheckedChangeListener, "listener");
        this.f68302P = onCheckedChangeListener;
        setOnClickListener(new View.OnClickListener() { // from class: ra0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListItemSetting.m74602D(ListItemSetting.this, view);
            }
        });
    }

    public final void setDisableSwitch(boolean z11) {
        this.f68303Q = z11;
    }

    public final void setIconRemind(AppCompatImageView appCompatImageView) {
        AbstractC19074t.m100208f(appCompatImageView, "<set-?>");
        this.f68299M = appCompatImageView;
    }

    public final void setIconSetting(ZAppCompatImageView zAppCompatImageView) {
        this.f68294H = zAppCompatImageView;
    }

    public final void setIconTick(ZAppCompatImageView zAppCompatImageView) {
        this.f68295I = zAppCompatImageView;
    }

    @Override // com.zing.zalo.zdesign.component.ListItem, com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f68301O = true;
        this.f68298L = str;
        super.setIdTracking(str);
    }

    public final void setLlRight(LinearLayout linearLayout) {
        AbstractC19074t.m100208f(linearLayout, "<set-?>");
        this.f68300N = linearLayout;
    }

    public final void setMarginLeftDivider(int i11) {
        m90591l(i11, 0, 0, 0);
    }

    @Override // com.zing.zalo.zdesign.component.ListItem, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!this.f68301O) {
            setIdTracking(this.f68298L);
        }
        super.setOnClickListener(onClickListener);
    }

    public final void setShowChevronRight(boolean z11) {
        if (z11) {
            getIconChevronRight().setImageDrawable(C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
            getIconChevronRight().setVisibility(0);
        } else {
            getIconChevronRight().setVisibility(8);
        }
    }

    public final void setStateSetting(String str) {
        if (str != null && str.length() != 0) {
            RobotoTextView robotoTextView = this.f68293G;
            if (robotoTextView != null) {
                robotoTextView.setText(str);
                robotoTextView.setVisibility(0);
                return;
            }
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView2 = new RobotoTextView(context);
            robotoTextView2.setText(str);
            robotoTextView2.setMaxWidth(AbstractC23136l9.m118742r(120.0f));
            robotoTextView2.setGravity(5);
            robotoTextView2.setTextSize(1, 13.0f);
            robotoTextView2.setTextStyleBold(true);
            robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC21196a.TextColor2));
            robotoTextView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            getLlRight().addView(robotoTextView2);
            this.f68293G = robotoTextView2;
            return;
        }
        RobotoTextView robotoTextView3 = this.f68293G;
        if (robotoTextView3 != null) {
            robotoTextView3.setVisibility(8);
        }
    }

    public final void setSwitch(Switch r12) {
        this.f68296J = r12;
    }

    public final void setTick(boolean z11) {
        ZAppCompatImageView zAppCompatImageView = this.f68295I;
        int i11 = 4;
        if (zAppCompatImageView != null) {
            if (z11) {
                i11 = 0;
            }
            zAppCompatImageView.setVisibility(i11);
            return;
        }
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(getContext());
        Context context = zAppCompatImageView2.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_check_line_24, AbstractC16801x.blue_bg_close_icon));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        zAppCompatImageView2.setLayoutParams(layoutParams);
        if (z11) {
            i11 = 0;
        }
        zAppCompatImageView2.setVisibility(i11);
        getLlRight().addView(zAppCompatImageView2);
        this.f68295I = zAppCompatImageView2;
    }

    public final void setTvState(RobotoTextView robotoTextView) {
        this.f68293G = robotoTextView;
    }

    public final void setViewIdTracking(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f68298L = str;
    }

    /* renamed from: u */
    public final void m74618u(final C25673e c25673e, final TabMeAdapter.InterfaceC12140b interfaceC12140b) {
        int i11;
        if (c25673e == null) {
            return;
        }
        setIdTracking(c25673e.m132579s());
        m74603F(this, c25673e.m132566f(), null, c25673e.m132567g(), 2, null);
        setTitleMaxLine(2);
        setSubtitleMaxLine(2);
        setSubtitleColor(c25673e.m132565e());
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        setBackground(C27280g.m139658a(context, AbstractC2810d.stencils_list_bg));
        setTitle(c25673e.m132578r());
        Badge badgeTitle = getBadgeTitle();
        if (!c25673e.m132572l() && c25673e.m132568h() != EnumC20799i.f102200A) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        badgeTitle.setVisibility(i11);
        setShowChevronRight(c25673e.m132571k());
        setTrailingItemVisibility(8);
        m90592m(c25673e.m132575o());
        int i12 = C13287a.f68304a[c25673e.m132568h().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                m74613y(c25673e);
            }
        } else {
            m74612x();
        }
        setOnClickListener(new View.OnClickListener() { // from class: ra0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListItemSetting.m74610v(TabMeAdapter.InterfaceC12140b.this, c25673e, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f68298L = "SETTING_DEFAULT";
    }

    public final void setCheckBox(boolean z11) {
        CheckBox checkBox = this.f68297K;
        if (checkBox != null) {
            checkBox.setChecked(z11);
        } else {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            final CheckBox checkBox2 = new CheckBox(context);
            checkBox2.setChecked(z11);
            checkBox2.setIdTracking(this.f68298L);
            checkBox2.setOnClickListener(new View.OnClickListener() { // from class: ra0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ListItemSetting.m74600B(ListItemSetting.this, checkBox2, view);
                }
            });
            checkBox2.setChecked(z11);
            checkBox2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            m90587c(checkBox2);
            this.f68297K = checkBox2;
            setLeadingGravity(EnumC16952b0.CENTER);
        }
        m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
    }

    public final void setSwitch(boolean z11) {
        m74617G(z11, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemSetting(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f68298L = "SETTING_DEFAULT";
    }
}
