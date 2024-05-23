package q10;

import android.view.View;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionButton;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionCount;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zlottie.widget.LottieImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.p1 */
/* loaded from: classes5.dex */
public final class C25043p1 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f120178p;

    /* renamed from: q */
    public final ReactionButton f120179q;

    /* renamed from: r */
    public final LottieImageView f120180r;

    /* renamed from: s */
    public final SimpleShadowTextView f120181s;

    /* renamed from: t */
    public final ReactionCount f120182t;

    private C25043p1(View view, ReactionButton reactionButton, LottieImageView lottieImageView, SimpleShadowTextView simpleShadowTextView, ReactionCount reactionCount) {
        this.f120178p = view;
        this.f120179q = reactionButton;
        this.f120180r = lottieImageView;
        this.f120181s = simpleShadowTextView;
        this.f120182t = reactionCount;
    }

    /* renamed from: a */
    public static C25043p1 m129916a(View view) {
        int i11 = AbstractC27409d.btnReaction;
        ReactionButton reactionButton = (ReactionButton) AbstractC22716b.m117526a(view, i11);
        if (reactionButton != null) {
            i11 = AbstractC27409d.livReaction;
            LottieImageView lottieImageView = (LottieImageView) AbstractC22716b.m117526a(view, i11);
            if (lottieImageView != null) {
                i11 = AbstractC27409d.txtLiked;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null) {
                    i11 = AbstractC27409d.txtReaction;
                    ReactionCount reactionCount = (ReactionCount) AbstractC22716b.m117526a(view, i11);
                    if (reactionCount != null) {
                        return new C25043p1(view, reactionButton, lottieImageView, simpleShadowTextView, reactionCount);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f120178p;
    }
}
