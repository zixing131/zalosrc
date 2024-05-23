package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.v1 */
/* loaded from: classes5.dex */
public final class C25061v1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120353p;

    /* renamed from: q */
    public final OverScrollableRefreshBar f120354q;

    /* renamed from: r */
    public final LoadingLayout f120355r;

    /* renamed from: s */
    public final OverScrollableRecyclerView f120356s;

    private C25061v1(FrameLayout frameLayout, OverScrollableRefreshBar overScrollableRefreshBar, LoadingLayout loadingLayout, OverScrollableRecyclerView overScrollableRecyclerView) {
        this.f120353p = frameLayout;
        this.f120354q = overScrollableRefreshBar;
        this.f120355r = loadingLayout;
        this.f120356s = overScrollableRecyclerView;
    }

    /* renamed from: a */
    public static C25061v1 m129956a(View view) {
        int i11 = AbstractC27409d.barRefresh;
        OverScrollableRefreshBar overScrollableRefreshBar = (OverScrollableRefreshBar) AbstractC22716b.m117526a(view, i11);
        if (overScrollableRefreshBar != null) {
            i11 = AbstractC27409d.lytLoading;
            LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
            if (loadingLayout != null) {
                i11 = AbstractC27409d.f129050rv;
                OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                if (overScrollableRecyclerView != null) {
                    return new C25061v1((FrameLayout) view, overScrollableRefreshBar, loadingLayout, overScrollableRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25061v1 m129957c(LayoutInflater layoutInflater) {
        return m129958d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25061v1 m129958d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_simple_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129956a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120353p;
    }
}
