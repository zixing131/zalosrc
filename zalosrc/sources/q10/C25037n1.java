package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.n1 */
/* loaded from: classes5.dex */
public final class C25037n1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120131p;

    /* renamed from: q */
    public final OverScrollableRefreshBar f120132q;

    /* renamed from: r */
    public final LoadingLayout f120133r;

    /* renamed from: s */
    public final OverScrollableRecyclerView f120134s;

    /* renamed from: t */
    public final SimpleShadowTextView f120135t;

    private C25037n1(FrameLayout frameLayout, OverScrollableRefreshBar overScrollableRefreshBar, LoadingLayout loadingLayout, OverScrollableRecyclerView overScrollableRecyclerView, SimpleShadowTextView simpleShadowTextView) {
        this.f120131p = frameLayout;
        this.f120132q = overScrollableRefreshBar;
        this.f120133r = loadingLayout;
        this.f120134s = overScrollableRecyclerView;
        this.f120135t = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25037n1 m129900a(View view) {
        int i11 = AbstractC27409d.barRefresh;
        OverScrollableRefreshBar overScrollableRefreshBar = (OverScrollableRefreshBar) AbstractC22716b.m117526a(view, i11);
        if (overScrollableRefreshBar != null) {
            i11 = AbstractC27409d.lytLoading;
            LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
            if (loadingLayout != null) {
                i11 = AbstractC27409d.f129050rv;
                OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                if (overScrollableRecyclerView != null) {
                    i11 = AbstractC27409d.tvNewNoti;
                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView != null) {
                        return new C25037n1((FrameLayout) view, overScrollableRefreshBar, loadingLayout, overScrollableRecyclerView, simpleShadowTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25037n1 m129901c(LayoutInflater layoutInflater) {
        return m129902d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25037n1 m129902d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_notification_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129900a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120131p;
    }
}
