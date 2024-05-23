package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.pb */
/* loaded from: classes3.dex */
public final class C29983pb implements InterfaceC22715a {

    /* renamed from: A */
    public final ScrollViewVisibleChildViewDetector f139009A;

    /* renamed from: B */
    public final RobotoTextView f139010B;

    /* renamed from: C */
    public final RobotoTextView f139011C;

    /* renamed from: D */
    public final RobotoTextView f139012D;

    /* renamed from: E */
    public final RobotoTextView f139013E;

    /* renamed from: F */
    public final ZdsActionBar f139014F;

    /* renamed from: p */
    private final LinearLayout f139015p;

    /* renamed from: q */
    public final RobotoTextView f139016q;

    /* renamed from: r */
    public final HightLightSettingView f139017r;

    /* renamed from: s */
    public final LinearLayout f139018s;

    /* renamed from: t */
    public final View f139019t;

    /* renamed from: u */
    public final RelativeLayout f139020u;

    /* renamed from: v */
    public final RelativeLayout f139021v;

    /* renamed from: w */
    public final RelativeLayout f139022w;

    /* renamed from: x */
    public final CheckBox f139023x;

    /* renamed from: y */
    public final CheckBox f139024y;

    /* renamed from: z */
    public final CheckBox f139025z;

    private C29983pb(LinearLayout linearLayout, RobotoTextView robotoTextView, HightLightSettingView hightLightSettingView, LinearLayout linearLayout2, View view, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, ZdsActionBar zdsActionBar) {
        this.f139015p = linearLayout;
        this.f139016q = robotoTextView;
        this.f139017r = hightLightSettingView;
        this.f139018s = linearLayout2;
        this.f139019t = view;
        this.f139020u = relativeLayout;
        this.f139021v = relativeLayout2;
        this.f139022w = relativeLayout3;
        this.f139023x = checkBox;
        this.f139024y = checkBox2;
        this.f139025z = checkBox3;
        this.f139009A = scrollViewVisibleChildViewDetector;
        this.f139010B = robotoTextView2;
        this.f139011C = robotoTextView3;
        this.f139012D = robotoTextView4;
        this.f139013E = robotoTextView5;
        this.f139014F = zdsActionBar;
    }

    /* renamed from: a */
    public static C29983pb m148370a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.beta_badge;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.hightLightView;
            HightLightSettingView hightLightSettingView = (HightLightSettingView) AbstractC22716b.m117526a(view, i11);
            if (hightLightSettingView != null) {
                i11 = AbstractC6918a0.layout_selected_mp3_ringtone;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_same_as_system))) != null) {
                    i11 = AbstractC6918a0.ll_same_as_system;
                    RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                    if (relativeLayout != null) {
                        i11 = AbstractC6918a0.ll_select_ringtone_zalo;
                        RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout2 != null) {
                            i11 = AbstractC6918a0.ll_select_ringtone_zing;
                            RelativeLayout relativeLayout3 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout3 != null) {
                                i11 = AbstractC6918a0.radio_ringtone_zalo;
                                CheckBox checkBox = (CheckBox) AbstractC22716b.m117526a(view, i11);
                                if (checkBox != null) {
                                    i11 = AbstractC6918a0.radio_ringtone_zing_mp3;
                                    CheckBox checkBox2 = (CheckBox) AbstractC22716b.m117526a(view, i11);
                                    if (checkBox2 != null) {
                                        i11 = AbstractC6918a0.radio_system_ringtone;
                                        CheckBox checkBox3 = (CheckBox) AbstractC22716b.m117526a(view, i11);
                                        if (checkBox3 != null) {
                                            i11 = AbstractC6918a0.scroll_main_layout;
                                            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) AbstractC22716b.m117526a(view, i11);
                                            if (scrollViewVisibleChildViewDetector != null) {
                                                i11 = AbstractC6918a0.tv_other_ringtone_zing;
                                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView2 != null) {
                                                    i11 = AbstractC6918a0.tv_system_ringtone_description;
                                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView3 != null) {
                                                        i11 = AbstractC6918a0.tv_zing_ringtone_not_selected;
                                                        RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView4 != null) {
                                                            i11 = AbstractC6918a0.txt_system_ringtone_title;
                                                            RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView5 != null) {
                                                                i11 = AbstractC6918a0.zds_action_bar;
                                                                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                                if (zdsActionBar != null) {
                                                                    return new C29983pb((LinearLayout) view, robotoTextView, hightLightSettingView, linearLayout, m117526a, relativeLayout, relativeLayout2, relativeLayout3, checkBox, checkBox2, checkBox3, scrollViewVisibleChildViewDetector, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5, zdsActionBar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29983pb m148371c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_call_ringtone_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148370a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139015p;
    }
}
