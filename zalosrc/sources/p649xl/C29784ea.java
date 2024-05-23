package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ea */
/* loaded from: classes3.dex */
public final class C29784ea implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137679p;

    /* renamed from: q */
    public final FeedRecyclerView f137680q;

    /* renamed from: r */
    public final SwipeRefreshListView f137681r;

    private C29784ea(RelativeLayout relativeLayout, FeedRecyclerView feedRecyclerView, SwipeRefreshListView swipeRefreshListView) {
        this.f137679p = relativeLayout;
        this.f137680q = feedRecyclerView;
        this.f137681r = swipeRefreshListView;
    }

    /* renamed from: a */
    public static C29784ea m147900a(View view) {
        int i11 = AbstractC6918a0.feed_recycler_view;
        FeedRecyclerView feedRecyclerView = (FeedRecyclerView) AbstractC22716b.m117526a(view, i11);
        if (feedRecyclerView != null) {
            i11 = AbstractC6918a0.swipe_refresh_layout;
            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
            if (swipeRefreshListView != null) {
                return new C29784ea((RelativeLayout) view, feedRecyclerView, swipeRefreshListView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29784ea m147901c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_suggest_album, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147900a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137679p;
    }
}
