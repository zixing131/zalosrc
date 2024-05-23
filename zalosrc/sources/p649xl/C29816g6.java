package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.mediastore.TabViewLayout;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g6 */
/* loaded from: classes3.dex */
public final class C29816g6 implements InterfaceC22715a {

    /* renamed from: A */
    public final TabViewLayout f137855A;

    /* renamed from: B */
    public final RobotoTextView f137856B;

    /* renamed from: C */
    public final RobotoTextView f137857C;

    /* renamed from: D */
    public final ViewPagerCustomSwipeable f137858D;

    /* renamed from: p */
    private final RelativeLayout f137859p;

    /* renamed from: q */
    public final RelativeLayout f137860q;

    /* renamed from: r */
    public final ImageView f137861r;

    /* renamed from: s */
    public final ImageView f137862s;

    /* renamed from: t */
    public final RobotoEditText f137863t;

    /* renamed from: u */
    public final RecyclingImageView f137864u;

    /* renamed from: v */
    public final RelativeLayout f137865v;

    /* renamed from: w */
    public final ImageView f137866w;

    /* renamed from: x */
    public final RelativeLayout f137867x;

    /* renamed from: y */
    public final View f137868y;

    /* renamed from: z */
    public final View f137869z;

    private C29816g6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, RobotoEditText robotoEditText, RecyclingImageView recyclingImageView, RelativeLayout relativeLayout3, ImageView imageView3, RelativeLayout relativeLayout4, View view, View view2, TabViewLayout tabViewLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ViewPagerCustomSwipeable viewPagerCustomSwipeable) {
        this.f137859p = relativeLayout;
        this.f137860q = relativeLayout2;
        this.f137861r = imageView;
        this.f137862s = imageView2;
        this.f137863t = robotoEditText;
        this.f137864u = recyclingImageView;
        this.f137865v = relativeLayout3;
        this.f137866w = imageView3;
        this.f137867x = relativeLayout4;
        this.f137868y = view;
        this.f137869z = view2;
        this.f137855A = tabViewLayout;
        this.f137856B = robotoTextView;
        this.f137857C = robotoTextView2;
        this.f137858D = viewPagerCustomSwipeable;
    }

    /* renamed from: a */
    public static C29816g6 m147983a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.bottom_view_container;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.btn_close;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC6918a0.btn_search;
                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView2 != null) {
                    i11 = AbstractC6918a0.edt_search;
                    RobotoEditText robotoEditText = (RobotoEditText) AbstractC22716b.m117526a(view, i11);
                    if (robotoEditText != null) {
                        i11 = AbstractC6918a0.floating_btn_send;
                        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                        if (recyclingImageView != null) {
                            i11 = AbstractC6918a0.header_container;
                            RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout2 != null) {
                                i11 = AbstractC6918a0.iv_back;
                                ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                if (imageView3 != null) {
                                    RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                    i11 = AbstractC6918a0.seperator1;
                                    View m117526a2 = AbstractC22716b.m117526a(view, i11);
                                    if (m117526a2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.seperator2))) != null) {
                                        i11 = AbstractC6918a0.tab_view;
                                        TabViewLayout tabViewLayout = (TabViewLayout) AbstractC22716b.m117526a(view, i11);
                                        if (tabViewLayout != null) {
                                            i11 = AbstractC6918a0.title;
                                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView != null) {
                                                i11 = AbstractC6918a0.tv_selected_count;
                                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView2 != null) {
                                                    i11 = AbstractC6918a0.view_pager;
                                                    ViewPagerCustomSwipeable viewPagerCustomSwipeable = (ViewPagerCustomSwipeable) AbstractC22716b.m117526a(view, i11);
                                                    if (viewPagerCustomSwipeable != null) {
                                                        return new C29816g6(relativeLayout3, relativeLayout, imageView, imageView2, robotoEditText, recyclingImageView, relativeLayout2, imageView3, relativeLayout3, m117526a2, m117526a, tabViewLayout, robotoTextView, robotoTextView2, viewPagerCustomSwipeable);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29816g6 m147984c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_my_cloud_quick_picker_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147983a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137859p;
    }
}
