package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.TimelineFeedFooterReactionDescription;
import com.zing.zalo.feed.reactions.p065ui.TimelineFeedCommentButton;
import com.zing.zalo.feed.uicontrols.FeedLikeButtonModulesView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Divider;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p5 */
/* loaded from: classes3.dex */
public final class C29977p5 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138954p;

    /* renamed from: q */
    public final RelativeLayout f138955q;

    /* renamed from: r */
    public final TimelineFeedCommentButton f138956r;

    /* renamed from: s */
    public final RelativeLayout f138957s;

    /* renamed from: t */
    public final FeedLikeButtonModulesView f138958t;

    /* renamed from: u */
    public final RobotoTextView f138959u;

    /* renamed from: v */
    public final View f138960v;

    /* renamed from: w */
    public final RelativeLayout f138961w;

    /* renamed from: x */
    public final TimelineFeedFooterReactionDescription f138962x;

    /* renamed from: y */
    public final Divider f138963y;

    private C29977p5(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TimelineFeedCommentButton timelineFeedCommentButton, RelativeLayout relativeLayout3, FeedLikeButtonModulesView feedLikeButtonModulesView, RobotoTextView robotoTextView, View view, RelativeLayout relativeLayout4, TimelineFeedFooterReactionDescription timelineFeedFooterReactionDescription, Divider divider) {
        this.f138954p = relativeLayout;
        this.f138955q = relativeLayout2;
        this.f138956r = timelineFeedCommentButton;
        this.f138957s = relativeLayout3;
        this.f138958t = feedLikeButtonModulesView;
        this.f138959u = robotoTextView;
        this.f138960v = view;
        this.f138961w = relativeLayout4;
        this.f138962x = timelineFeedFooterReactionDescription;
        this.f138963y = divider;
    }

    /* renamed from: a */
    public static C29977p5 m148359a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.action_buttons;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.btn_comment;
            TimelineFeedCommentButton timelineFeedCommentButton = (TimelineFeedCommentButton) AbstractC22716b.m117526a(view, i11);
            if (timelineFeedCommentButton != null) {
                i11 = AbstractC6918a0.btn_like;
                RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (relativeLayout2 != null) {
                    i11 = AbstractC6918a0.btn_like_icon;
                    FeedLikeButtonModulesView feedLikeButtonModulesView = (FeedLikeButtonModulesView) AbstractC22716b.m117526a(view, i11);
                    if (feedLikeButtonModulesView != null) {
                        i11 = AbstractC6918a0.btn_like_text;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.feed_overlay))) != null) {
                            RelativeLayout relativeLayout3 = (RelativeLayout) view;
                            i11 = AbstractC6918a0.like_description;
                            TimelineFeedFooterReactionDescription timelineFeedFooterReactionDescription = (TimelineFeedFooterReactionDescription) AbstractC22716b.m117526a(view, i11);
                            if (timelineFeedFooterReactionDescription != null) {
                                i11 = AbstractC6918a0.top_divider;
                                Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
                                if (divider != null) {
                                    return new C29977p5(relativeLayout3, relativeLayout, timelineFeedCommentButton, relativeLayout2, feedLikeButtonModulesView, robotoTextView, m117526a, relativeLayout3, timelineFeedFooterReactionDescription, divider);
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
    public static C29977p5 m148360c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_like_info_footer_timeline, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148359a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138954p;
    }
}
