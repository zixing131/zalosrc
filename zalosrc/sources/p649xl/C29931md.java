package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StoryReactedOverviewLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.md */
/* loaded from: classes3.dex */
public final class C29931md implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138710p;

    /* renamed from: q */
    public final RobotoTextView f138711q;

    /* renamed from: r */
    public final StoryReactedOverviewLayout f138712r;

    /* renamed from: s */
    public final LinearLayout f138713s;

    /* renamed from: t */
    public final LinearLayout f138714t;

    /* renamed from: u */
    public final RelativeLayout f138715u;

    /* renamed from: v */
    public final LinearLayout f138716v;

    /* renamed from: w */
    public final RobotoTextView f138717w;

    private C29931md(RelativeLayout relativeLayout, RobotoTextView robotoTextView, StoryReactedOverviewLayout storyReactedOverviewLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView2) {
        this.f138710p = relativeLayout;
        this.f138711q = robotoTextView;
        this.f138712r = storyReactedOverviewLayout;
        this.f138713s = linearLayout;
        this.f138714t = linearLayout2;
        this.f138715u = relativeLayout2;
        this.f138716v = linearLayout3;
        this.f138717w = robotoTextView2;
    }

    /* renamed from: a */
    public static C29931md m148259a(View view) {
        int i11 = AbstractC6918a0.ll_story_mine_add_new;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.story_reaction_overview_layout;
            StoryReactedOverviewLayout storyReactedOverviewLayout = (StoryReactedOverviewLayout) AbstractC22716b.m117526a(view, i11);
            if (storyReactedOverviewLayout != null) {
                i11 = AbstractC6918a0.story_recently_reacted_layout;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.story_viewer_count_layout;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i11 = AbstractC6918a0.story_viewer_reaction_layout;
                        LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout3 != null) {
                            i11 = AbstractC6918a0.tv_story_views_mine;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C29931md(relativeLayout, robotoTextView, storyReactedOverviewLayout, linearLayout, linearLayout2, relativeLayout, linearLayout3, robotoTextView2);
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
    public RelativeLayout getRoot() {
        return this.f138710p;
    }
}
