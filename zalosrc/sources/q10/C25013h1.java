package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.h1 */
/* loaded from: classes5.dex */
public final class C25013h1 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f119936p;

    /* renamed from: q */
    public final OverScrollableRefreshBar f119937q;

    /* renamed from: r */
    public final C25021j1 f119938r;

    /* renamed from: s */
    public final LoadingLayout f119939s;

    /* renamed from: t */
    public final RelativeLayout f119940t;

    /* renamed from: u */
    public final OverScrollableRecyclerView f119941u;

    private C25013h1(RelativeLayout relativeLayout, OverScrollableRefreshBar overScrollableRefreshBar, C25021j1 c25021j1, LoadingLayout loadingLayout, RelativeLayout relativeLayout2, OverScrollableRecyclerView overScrollableRecyclerView) {
        this.f119936p = relativeLayout;
        this.f119937q = overScrollableRefreshBar;
        this.f119938r = c25021j1;
        this.f119939s = loadingLayout;
        this.f119940t = relativeLayout2;
        this.f119941u = overScrollableRecyclerView;
    }

    /* renamed from: a */
    public static C25013h1 m129834a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.barRefresh;
        OverScrollableRefreshBar overScrollableRefreshBar = (OverScrollableRefreshBar) AbstractC22716b.m117526a(view, i11);
        if (overScrollableRefreshBar != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.lytHeader))) != null) {
            C25021j1 m129858a = C25021j1.m129858a(m117526a);
            i11 = AbstractC27409d.lytLoading;
            LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
            if (loadingLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i11 = AbstractC27409d.f129050rv;
                OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                if (overScrollableRecyclerView != null) {
                    return new C25013h1(relativeLayout, overScrollableRefreshBar, m129858a, loadingLayout, relativeLayout, overScrollableRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25013h1 m129835c(LayoutInflater layoutInflater) {
        return m129836d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25013h1 m129836d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_hash_tag_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129834a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f119936p;
    }
}
