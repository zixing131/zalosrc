package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ed */
/* loaded from: classes3.dex */
public final class C29787ed implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137690p;

    /* renamed from: q */
    public final View f137691q;

    /* renamed from: r */
    public final RecyclerView f137692r;

    /* renamed from: s */
    public final View f137693s;

    /* renamed from: t */
    public final LinearLayout f137694t;

    /* renamed from: u */
    public final FrameLayout f137695u;

    /* renamed from: v */
    public final LinearLayout f137696v;

    /* renamed from: w */
    public final RobotoTextView f137697w;

    /* renamed from: x */
    public final RobotoTextView f137698x;

    /* renamed from: y */
    public final RobotoTextView f137699y;

    private C29787ed(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, View view2, LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f137690p = relativeLayout;
        this.f137691q = view;
        this.f137692r = recyclerView;
        this.f137693s = view2;
        this.f137694t = linearLayout;
        this.f137695u = frameLayout;
        this.f137696v = linearLayout2;
        this.f137697w = robotoTextView;
        this.f137698x = robotoTextView2;
        this.f137699y = robotoTextView3;
    }

    /* renamed from: a */
    public static C29787ed m147909a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.dot_separator_reaction_tv;
        View m117526a2 = AbstractC22716b.m117526a(view, i11);
        if (m117526a2 != null) {
            i11 = AbstractC6918a0.rv_story_views;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.story_viewer_and_reaction_divider))) != null) {
                i11 = AbstractC6918a0.story_viewer_and_reaction_header;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.story_views_loading_layout;
                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout != null) {
                        i11 = AbstractC6918a0.story_views_retry_layout;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout2 != null) {
                            i11 = AbstractC6918a0.tv_no_views_yet;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.tv_story_reactions_count;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.tv_story_views_count;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView3 != null) {
                                        return new C29787ed((RelativeLayout) view, m117526a2, recyclerView, m117526a, linearLayout, frameLayout, linearLayout2, robotoTextView, robotoTextView2, robotoTextView3);
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
    public static C29787ed m147910c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_details_viewer_and_reaction_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147909a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137690p;
    }
}
