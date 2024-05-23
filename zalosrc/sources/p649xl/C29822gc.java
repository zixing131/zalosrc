package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.gc */
/* loaded from: classes3.dex */
public final class C29822gc implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137887p;

    /* renamed from: q */
    public final RobotoTextView f137888q;

    /* renamed from: r */
    public final RobotoTextView f137889r;

    /* renamed from: s */
    public final RelativeLayout f137890s;

    /* renamed from: t */
    public final MultiStateView f137891t;

    /* renamed from: u */
    public final RelativeLayout f137892u;

    /* renamed from: v */
    public final SwipeRefreshListView f137893v;

    /* renamed from: w */
    public final RobotoTextView f137894w;

    /* renamed from: x */
    public final RobotoTextView f137895x;

    /* renamed from: y */
    public final C30063u4 f137896y;

    private C29822gc(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RelativeLayout relativeLayout2, MultiStateView multiStateView, RelativeLayout relativeLayout3, SwipeRefreshListView swipeRefreshListView, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, C30063u4 c30063u4) {
        this.f137887p = relativeLayout;
        this.f137888q = robotoTextView;
        this.f137889r = robotoTextView2;
        this.f137890s = relativeLayout2;
        this.f137891t = multiStateView;
        this.f137892u = relativeLayout3;
        this.f137893v = swipeRefreshListView;
        this.f137894w = robotoTextView3;
        this.f137895x = robotoTextView4;
        this.f137896y = c30063u4;
    }

    /* renamed from: a */
    public static C29822gc m147998a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_clear_multi_thread;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.empty_text_view;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.layout_delete_popup;
                RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (relativeLayout != null) {
                    i11 = AbstractC6918a0.multi_state;
                    MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                    if (multiStateView != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) view;
                        i11 = AbstractC6918a0.swipe_refresh_layout;
                        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
                        if (swipeRefreshListView != null) {
                            i11 = AbstractC6918a0.txt_delete_count;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.txtTitle;
                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView4 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.zalo_action_bar))) != null) {
                                    return new C29822gc(relativeLayout2, robotoTextView, robotoTextView2, relativeLayout, multiStateView, relativeLayout2, swipeRefreshListView, robotoTextView3, robotoTextView4, C30063u4.m148563a(m117526a));
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
    public static C29822gc m147999c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_storage_usage_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147998a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137887p;
    }
}
