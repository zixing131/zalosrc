package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.zc */
/* loaded from: classes3.dex */
public final class C30156zc implements InterfaceC22715a {

    /* renamed from: p */
    private final CustomRelativeLayout f140145p;

    /* renamed from: q */
    public final SwipeRefreshListView f140146q;

    /* renamed from: r */
    public final ZdsActionBar f140147r;

    private C30156zc(CustomRelativeLayout customRelativeLayout, SwipeRefreshListView swipeRefreshListView, ZdsActionBar zdsActionBar) {
        this.f140145p = customRelativeLayout;
        this.f140146q = swipeRefreshListView;
        this.f140147r = zdsActionBar;
    }

    /* renamed from: a */
    public static C30156zc m148787a(View view) {
        int i11 = AbstractC6918a0.swipe_refresh_layout;
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
        if (swipeRefreshListView != null) {
            i11 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
            if (zdsActionBar != null) {
                return new C30156zc((CustomRelativeLayout) view, swipeRefreshListView, zdsActionBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30156zc m148788c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_archive_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148787a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CustomRelativeLayout getRoot() {
        return this.f140145p;
    }
}
