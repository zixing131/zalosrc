package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextViewStateAware;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.v7 */
/* loaded from: classes3.dex */
public final class C30083v7 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139664p;

    /* renamed from: q */
    public final LinearLayout f139665q;

    /* renamed from: r */
    public final LinearLayout f139666r;

    /* renamed from: s */
    public final RobotoTextViewStateAware f139667s;

    /* renamed from: t */
    public final RobotoTextViewStateAware f139668t;

    /* renamed from: u */
    public final RobotoTextViewStateAware f139669u;

    /* renamed from: v */
    public final RobotoTextViewStateAware f139670v;

    /* renamed from: w */
    public final ViewPagerCustomSwipeable f139671w;

    /* renamed from: x */
    public final ZdsActionBar f139672x;

    private C30083v7(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextViewStateAware robotoTextViewStateAware, RobotoTextViewStateAware robotoTextViewStateAware2, RobotoTextViewStateAware robotoTextViewStateAware3, RobotoTextViewStateAware robotoTextViewStateAware4, ViewPagerCustomSwipeable viewPagerCustomSwipeable, ZdsActionBar zdsActionBar) {
        this.f139664p = frameLayout;
        this.f139665q = linearLayout;
        this.f139666r = linearLayout2;
        this.f139667s = robotoTextViewStateAware;
        this.f139668t = robotoTextViewStateAware2;
        this.f139669u = robotoTextViewStateAware3;
        this.f139670v = robotoTextViewStateAware4;
        this.f139671w = viewPagerCustomSwipeable;
        this.f139672x = zdsActionBar;
    }

    /* renamed from: a */
    public static C30083v7 m148613a(View view) {
        int i11 = AbstractC6918a0.layoutTab;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.search_container;
            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout2 != null) {
                i11 = AbstractC6918a0.tv_tab_all_member;
                RobotoTextViewStateAware robotoTextViewStateAware = (RobotoTextViewStateAware) AbstractC22716b.m117526a(view, i11);
                if (robotoTextViewStateAware != null) {
                    i11 = AbstractC6918a0.tv_tab_blocked;
                    RobotoTextViewStateAware robotoTextViewStateAware2 = (RobotoTextViewStateAware) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextViewStateAware2 != null) {
                        i11 = AbstractC6918a0.tv_tab_invited;
                        RobotoTextViewStateAware robotoTextViewStateAware3 = (RobotoTextViewStateAware) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextViewStateAware3 != null) {
                            i11 = AbstractC6918a0.tv_tab_owner_admin;
                            RobotoTextViewStateAware robotoTextViewStateAware4 = (RobotoTextViewStateAware) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextViewStateAware4 != null) {
                                i11 = AbstractC6918a0.view_pager;
                                ViewPagerCustomSwipeable viewPagerCustomSwipeable = (ViewPagerCustomSwipeable) AbstractC22716b.m117526a(view, i11);
                                if (viewPagerCustomSwipeable != null) {
                                    i11 = AbstractC6918a0.zds_action_bar;
                                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                    if (zdsActionBar != null) {
                                        return new C30083v7((FrameLayout) view, linearLayout, linearLayout2, robotoTextViewStateAware, robotoTextViewStateAware2, robotoTextViewStateAware3, robotoTextViewStateAware4, viewPagerCustomSwipeable, zdsActionBar);
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

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139664p;
    }
}
