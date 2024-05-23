package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j */
/* loaded from: classes3.dex */
public final class C29863j implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138216p;

    /* renamed from: q */
    public final SwipeRefreshListView f138217q;

    /* renamed from: r */
    public final ZdsActionBar f138218r;

    private C29863j(RelativeLayout relativeLayout, SwipeRefreshListView swipeRefreshListView, ZdsActionBar zdsActionBar) {
        this.f138216p = relativeLayout;
        this.f138217q = swipeRefreshListView;
        this.f138218r = zdsActionBar;
    }

    /* renamed from: a */
    public static C29863j m148092a(View view) {
        int i11 = AbstractC6918a0.rv_auto_reply_list;
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
        if (swipeRefreshListView != null) {
            i11 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
            if (zdsActionBar != null) {
                return new C29863j((RelativeLayout) view, swipeRefreshListView, zdsActionBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29863j m148093c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.auto_reply_listing_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148092a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138216p;
    }
}
