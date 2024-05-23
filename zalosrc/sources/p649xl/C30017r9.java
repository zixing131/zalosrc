package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r9 */
/* loaded from: classes3.dex */
public final class C30017r9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139222p;

    /* renamed from: q */
    public final RecyclerView f139223q;

    /* renamed from: r */
    public final SwipeRefreshLayout f139224r;

    private C30017r9(RelativeLayout relativeLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f139222p = relativeLayout;
        this.f139223q = recyclerView;
        this.f139224r = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C30017r9 m148449a(View view) {
        int i11 = AbstractC6918a0.rv_product_manage;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.swipe_refresh_layout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC22716b.m117526a(view, i11);
            if (swipeRefreshLayout != null) {
                return new C30017r9((RelativeLayout) view, recyclerView, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30017r9 m148450c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_product_manage_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148449a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139222p;
    }
}
