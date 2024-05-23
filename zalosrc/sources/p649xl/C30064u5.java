package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.mediastore.MediaStoreHeaderContainerView;
import com.zing.zalo.p077ui.mediastore.NestedScrollViewParent;
import com.zing.zalo.p077ui.mediastore.TabViewLayout;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.u5 */
/* loaded from: classes3.dex */
public final class C30064u5 implements InterfaceC22715a {

    /* renamed from: p */
    private final CustomRelativeLayout f139540p;

    /* renamed from: q */
    public final FrameLayout f139541q;

    /* renamed from: r */
    public final MediaStoreHeaderContainerView f139542r;

    /* renamed from: s */
    public final TabViewLayout f139543s;

    /* renamed from: t */
    public final RelativeLayout f139544t;

    /* renamed from: u */
    public final LinearLayout f139545u;

    /* renamed from: v */
    public final NestedScrollViewParent f139546v;

    /* renamed from: w */
    public final ViewStub f139547w;

    /* renamed from: x */
    public final SwipeRefreshLayout f139548x;

    /* renamed from: y */
    public final ViewPagerCustomSwipeable f139549y;

    /* renamed from: z */
    public final ViewStub f139550z;

    private C30064u5(CustomRelativeLayout customRelativeLayout, FrameLayout frameLayout, MediaStoreHeaderContainerView mediaStoreHeaderContainerView, TabViewLayout tabViewLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, NestedScrollViewParent nestedScrollViewParent, ViewStub viewStub, SwipeRefreshLayout swipeRefreshLayout, ViewPagerCustomSwipeable viewPagerCustomSwipeable, ViewStub viewStub2) {
        this.f139540p = customRelativeLayout;
        this.f139541q = frameLayout;
        this.f139542r = mediaStoreHeaderContainerView;
        this.f139543s = tabViewLayout;
        this.f139544t = relativeLayout;
        this.f139545u = linearLayout;
        this.f139546v = nestedScrollViewParent;
        this.f139547w = viewStub;
        this.f139548x = swipeRefreshLayout;
        this.f139549y = viewPagerCustomSwipeable;
        this.f139550z = viewStub2;
    }

    /* renamed from: a */
    public static C30064u5 m148565a(View view) {
        int i11 = AbstractC6918a0.bottom_sheet_container;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC6918a0.header_container;
            MediaStoreHeaderContainerView mediaStoreHeaderContainerView = (MediaStoreHeaderContainerView) AbstractC22716b.m117526a(view, i11);
            if (mediaStoreHeaderContainerView != null) {
                i11 = AbstractC6918a0.layoutTab;
                TabViewLayout tabViewLayout = (TabViewLayout) AbstractC22716b.m117526a(view, i11);
                if (tabViewLayout != null) {
                    i11 = AbstractC6918a0.media_store_container;
                    RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                    if (relativeLayout != null) {
                        i11 = AbstractC6918a0.quick_search_view_container;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.scroll_view;
                            NestedScrollViewParent nestedScrollViewParent = (NestedScrollViewParent) AbstractC22716b.m117526a(view, i11);
                            if (nestedScrollViewParent != null) {
                                i11 = AbstractC6918a0.stub_media_store_multi_select_info_bar;
                                ViewStub viewStub = (ViewStub) AbstractC22716b.m117526a(view, i11);
                                if (viewStub != null) {
                                    i11 = AbstractC6918a0.swipe_refresh_layout;
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC22716b.m117526a(view, i11);
                                    if (swipeRefreshLayout != null) {
                                        i11 = AbstractC6918a0.view_pager;
                                        ViewPagerCustomSwipeable viewPagerCustomSwipeable = (ViewPagerCustomSwipeable) AbstractC22716b.m117526a(view, i11);
                                        if (viewPagerCustomSwipeable != null) {
                                            i11 = AbstractC6918a0.vs_quick_action_view;
                                            ViewStub viewStub2 = (ViewStub) AbstractC22716b.m117526a(view, i11);
                                            if (viewStub2 != null) {
                                                return new C30064u5((CustomRelativeLayout) view, frameLayout, mediaStoreHeaderContainerView, tabViewLayout, relativeLayout, linearLayout, nestedScrollViewParent, viewStub, swipeRefreshLayout, viewPagerCustomSwipeable, viewStub2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30064u5 m148566c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_media_store, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148565a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CustomRelativeLayout getRoot() {
        return this.f139540p;
    }
}
