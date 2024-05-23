package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e0 */
/* loaded from: classes3.dex */
public final class C29774e0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137620p;

    /* renamed from: q */
    public final HightLightSettingView f137621q;

    /* renamed from: r */
    public final LinearLayout f137622r;

    /* renamed from: s */
    public final LinearLayout f137623s;

    /* renamed from: t */
    public final ScrollViewVisibleChildViewDetector f137624t;

    /* renamed from: u */
    public final FrameLayout f137625u;

    /* renamed from: v */
    public final ViewStub f137626v;

    /* renamed from: w */
    public final ZdsActionBar f137627w;

    private C29774e0(LinearLayout linearLayout, HightLightSettingView hightLightSettingView, LinearLayout linearLayout2, LinearLayout linearLayout3, ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector, FrameLayout frameLayout, ViewStub viewStub, ZdsActionBar zdsActionBar) {
        this.f137620p = linearLayout;
        this.f137621q = hightLightSettingView;
        this.f137622r = linearLayout2;
        this.f137623s = linearLayout3;
        this.f137624t = scrollViewVisibleChildViewDetector;
        this.f137625u = frameLayout;
        this.f137626v = viewStub;
        this.f137627w = zdsActionBar;
    }

    /* renamed from: a */
    public static C29774e0 m147876a(View view) {
        int i11 = AbstractC6918a0.hightLightView;
        HightLightSettingView hightLightSettingView = (HightLightSettingView) AbstractC22716b.m117526a(view, i11);
        if (hightLightSettingView != null) {
            i11 = AbstractC6918a0.ll_content_settings;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i11 = AbstractC6918a0.scroll_main_layout;
                ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) AbstractC22716b.m117526a(view, i11);
                if (scrollViewVisibleChildViewDetector != null) {
                    i11 = AbstractC6918a0.tooltip_container;
                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout != null) {
                        i11 = AbstractC6918a0.viewstub_setting_zinstant_banner;
                        ViewStub viewStub = (ViewStub) AbstractC22716b.m117526a(view, i11);
                        if (viewStub != null) {
                            i11 = AbstractC6918a0.zds_action_bar;
                            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                            if (zdsActionBar != null) {
                                return new C29774e0(linearLayout2, hightLightSettingView, linearLayout, linearLayout2, scrollViewVisibleChildViewDetector, frameLayout, viewStub, zdsActionBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29774e0 m147877c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.base_setting_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147876a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137620p;
    }
}
