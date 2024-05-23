package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.g1 */
/* loaded from: classes5.dex */
public final class C25009g1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119914p;

    /* renamed from: q */
    public final C25021j1 f119915q;

    /* renamed from: r */
    public final LoadingLayout f119916r;

    /* renamed from: s */
    public final FrameLayout f119917s;

    /* renamed from: t */
    public final OverScrollableRecyclerView f119918t;

    private C25009g1(FrameLayout frameLayout, C25021j1 c25021j1, LoadingLayout loadingLayout, FrameLayout frameLayout2, OverScrollableRecyclerView overScrollableRecyclerView) {
        this.f119914p = frameLayout;
        this.f119915q = c25021j1;
        this.f119916r = loadingLayout;
        this.f119917s = frameLayout2;
        this.f119918t = overScrollableRecyclerView;
    }

    /* renamed from: a */
    public static C25009g1 m129821a(View view) {
        int i11 = AbstractC27409d.lytHeader;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            C25021j1 m129858a = C25021j1.m129858a(m117526a);
            i11 = AbstractC27409d.lytLoading;
            LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
            if (loadingLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i11 = AbstractC27409d.f129050rv;
                OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                if (overScrollableRecyclerView != null) {
                    return new C25009g1(frameLayout, m129858a, loadingLayout, frameLayout, overScrollableRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25009g1 m129822c(LayoutInflater layoutInflater) {
        return m129823d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25009g1 m129823d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_follower_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129821a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119914p;
    }
}
