package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r5 */
/* loaded from: classes3.dex */
public final class C30013r5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139204p;

    /* renamed from: q */
    public final MultiStateView f139205q;

    /* renamed from: r */
    public final RecyclerView f139206r;

    /* renamed from: s */
    public final SwipeRefreshLayout f139207s;

    /* renamed from: t */
    public final ZdsActionBar f139208t;

    private C30013r5(LinearLayout linearLayout, MultiStateView multiStateView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ZdsActionBar zdsActionBar) {
        this.f139204p = linearLayout;
        this.f139205q = multiStateView;
        this.f139206r = recyclerView;
        this.f139207s = swipeRefreshLayout;
        this.f139208t = zdsActionBar;
    }

    /* renamed from: a */
    public static C30013r5 m148438a(View view) {
        int i11 = AbstractC6918a0.multi_state_view;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.recycler_category_event;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.swipe_refresh_layout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC22716b.m117526a(view, i11);
                if (swipeRefreshLayout != null) {
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        return new C30013r5((LinearLayout) view, multiStateView, recyclerView, swipeRefreshLayout, zdsActionBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139204p;
    }
}
