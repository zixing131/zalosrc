package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SecurityCheckupItemView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.ZaloZinstantRootLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.fc */
/* loaded from: classes3.dex */
public final class C29804fc implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f137765A;

    /* renamed from: B */
    public final ZdsActionBar f137766B;

    /* renamed from: C */
    public final ZaloZinstantRootLayout f137767C;

    /* renamed from: p */
    private final LinearLayout f137768p;

    /* renamed from: q */
    public final ScrollView f137769q;

    /* renamed from: r */
    public final SecurityCheckupItemView f137770r;

    /* renamed from: s */
    public final FrameLayout f137771s;

    /* renamed from: t */
    public final FrameLayout f137772t;

    /* renamed from: u */
    public final LinearLayout f137773u;

    /* renamed from: v */
    public final RecyclerView f137774v;

    /* renamed from: w */
    public final MultiStateView f137775w;

    /* renamed from: x */
    public final MultiStateView f137776x;

    /* renamed from: y */
    public final RobotoTextView f137777y;

    /* renamed from: z */
    public final RobotoTextView f137778z;

    private C29804fc(LinearLayout linearLayout, ScrollView scrollView, SecurityCheckupItemView securityCheckupItemView, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout2, RecyclerView recyclerView, MultiStateView multiStateView, MultiStateView multiStateView2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ZdsActionBar zdsActionBar, ZaloZinstantRootLayout zaloZinstantRootLayout) {
        this.f137768p = linearLayout;
        this.f137769q = scrollView;
        this.f137770r = securityCheckupItemView;
        this.f137771s = frameLayout;
        this.f137772t = frameLayout2;
        this.f137773u = linearLayout2;
        this.f137774v = recyclerView;
        this.f137775w = multiStateView;
        this.f137776x = multiStateView2;
        this.f137777y = robotoTextView;
        this.f137778z = robotoTextView2;
        this.f137765A = robotoTextView3;
        this.f137766B = zdsActionBar;
        this.f137767C = zaloZinstantRootLayout;
    }

    /* renamed from: a */
    public static C29804fc m147954a(View view) {
        int i11 = AbstractC6918a0.content_tab_not_processed;
        ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
        if (scrollView != null) {
            i11 = AbstractC6918a0.header_zinstant_layout;
            SecurityCheckupItemView securityCheckupItemView = (SecurityCheckupItemView) AbstractC22716b.m117526a(view, i11);
            if (securityCheckupItemView != null) {
                i11 = AbstractC6918a0.layout_tab_not_processed;
                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout != null) {
                    i11 = AbstractC6918a0.layout_tab_processed;
                    FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout2 != null) {
                        i11 = AbstractC6918a0.ll_list_item;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                            if (recyclerView != null) {
                                i11 = AbstractC6918a0.state_not_processed;
                                MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                                if (multiStateView != null) {
                                    i11 = AbstractC6918a0.state_processed;
                                    MultiStateView multiStateView2 = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                                    if (multiStateView2 != null) {
                                        i11 = AbstractC6918a0.tv_learn_more;
                                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView != null) {
                                            i11 = AbstractC6918a0.tv_tab_not_processed;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView2 != null) {
                                                i11 = AbstractC6918a0.tv_tab_processed;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView3 != null) {
                                                    i11 = AbstractC6918a0.zds_action_bar;
                                                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                    if (zdsActionBar != null) {
                                                        i11 = AbstractC6918a0.zinstant_layout;
                                                        ZaloZinstantRootLayout zaloZinstantRootLayout = (ZaloZinstantRootLayout) AbstractC22716b.m117526a(view, i11);
                                                        if (zaloZinstantRootLayout != null) {
                                                            return new C29804fc((LinearLayout) view, scrollView, securityCheckupItemView, frameLayout, frameLayout2, linearLayout, recyclerView, multiStateView, multiStateView2, robotoTextView, robotoTextView2, robotoTextView3, zdsActionBar, zaloZinstantRootLayout);
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
    public static C29804fc m147955c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_security_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147954a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137768p;
    }
}
