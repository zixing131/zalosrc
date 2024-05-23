package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.searchdiscovery.widget.ErrorLoadZInstantView;
import com.zing.zalo.p077ui.searchdiscovery.widget.LoadingZInstantView;
import com.zing.zalo.p077ui.searchdiscovery.widget.TouchMonitorFrameLayout;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.ZaloZinstantCommonLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.za */
/* loaded from: classes3.dex */
public final class C30154za implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140126p;

    /* renamed from: q */
    public final ErrorLoadZInstantView f140127q;

    /* renamed from: r */
    public final TouchMonitorFrameLayout f140128r;

    /* renamed from: s */
    public final LoadingZInstantView f140129s;

    /* renamed from: t */
    public final ZdsActionBar f140130t;

    /* renamed from: u */
    public final ZaloZinstantCommonLayout f140131u;

    private C30154za(LinearLayout linearLayout, ErrorLoadZInstantView errorLoadZInstantView, TouchMonitorFrameLayout touchMonitorFrameLayout, LoadingZInstantView loadingZInstantView, ZdsActionBar zdsActionBar, ZaloZinstantCommonLayout zaloZinstantCommonLayout) {
        this.f140126p = linearLayout;
        this.f140127q = errorLoadZInstantView;
        this.f140128r = touchMonitorFrameLayout;
        this.f140129s = loadingZInstantView;
        this.f140130t = zdsActionBar;
        this.f140131u = zaloZinstantCommonLayout;
    }

    /* renamed from: a */
    public static C30154za m148782a(View view) {
        int i11 = AbstractC6918a0.error_load_zinstant;
        ErrorLoadZInstantView errorLoadZInstantView = (ErrorLoadZInstantView) AbstractC22716b.m117526a(view, i11);
        if (errorLoadZInstantView != null) {
            i11 = AbstractC6918a0.fl_multi_state;
            TouchMonitorFrameLayout touchMonitorFrameLayout = (TouchMonitorFrameLayout) AbstractC22716b.m117526a(view, i11);
            if (touchMonitorFrameLayout != null) {
                i11 = AbstractC6918a0.loading_zinstant;
                LoadingZInstantView loadingZInstantView = (LoadingZInstantView) AbstractC22716b.m117526a(view, i11);
                if (loadingZInstantView != null) {
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        i11 = AbstractC6918a0.zinstant_layout;
                        ZaloZinstantCommonLayout zaloZinstantCommonLayout = (ZaloZinstantCommonLayout) AbstractC22716b.m117526a(view, i11);
                        if (zaloZinstantCommonLayout != null) {
                            return new C30154za((LinearLayout) view, errorLoadZInstantView, touchMonitorFrameLayout, loadingZInstantView, zdsActionBar, zaloZinstantCommonLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30154za m148783c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.search_discovery_zinstant_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148782a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140126p;
    }
}
