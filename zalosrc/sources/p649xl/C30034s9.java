package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.ChangeableHeightRelativeLayout;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s9 */
/* loaded from: classes3.dex */
public final class C30034s9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139319p;

    /* renamed from: q */
    public final RelativeLayout f139320q;

    /* renamed from: r */
    public final ChangeableHeightRelativeLayout f139321r;

    /* renamed from: s */
    public final SwipeRefreshListView f139322s;

    /* renamed from: t */
    public final FrameLayout f139323t;

    /* renamed from: u */
    public final ZdsActionBar f139324u;

    private C30034s9(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ChangeableHeightRelativeLayout changeableHeightRelativeLayout, SwipeRefreshListView swipeRefreshListView, FrameLayout frameLayout, ZdsActionBar zdsActionBar) {
        this.f139319p = relativeLayout;
        this.f139320q = relativeLayout2;
        this.f139321r = changeableHeightRelativeLayout;
        this.f139322s = swipeRefreshListView;
        this.f139323t = frameLayout;
        this.f139324u = zdsActionBar;
    }

    /* renamed from: a */
    public static C30034s9 m148491a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.quick_picker_container;
        ChangeableHeightRelativeLayout changeableHeightRelativeLayout = (ChangeableHeightRelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (changeableHeightRelativeLayout != null) {
            i11 = AbstractC6918a0.swipe_refresh_layout;
            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
            if (swipeRefreshListView != null) {
                i11 = AbstractC6918a0.touch;
                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout != null) {
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        return new C30034s9(relativeLayout, relativeLayout, changeableHeightRelativeLayout, swipeRefreshListView, frameLayout, zdsActionBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30034s9 m148492c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_album_create_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148491a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139319p;
    }
}
