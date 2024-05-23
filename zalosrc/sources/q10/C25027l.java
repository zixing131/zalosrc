package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BubbleTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitContentTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.l */
/* loaded from: classes5.dex */
public final class C25027l implements InterfaceC22715a {

    /* renamed from: A */
    public final FitContentTextView f120058A;

    /* renamed from: B */
    public final RobotoTextView f120059B;

    /* renamed from: C */
    public final FitUsernameTextView f120060C;

    /* renamed from: D */
    public final BlinkTextView f120061D;

    /* renamed from: E */
    public final RobotoTextView f120062E;

    /* renamed from: F */
    public final RoundedImageView f120063F;

    /* renamed from: p */
    private final CommentItem f120064p;

    /* renamed from: q */
    public final AvatarImageView f120065q;

    /* renamed from: r */
    public final PulseImageView f120066r;

    /* renamed from: s */
    public final ImageView f120067s;

    /* renamed from: t */
    public final BubbleTextView f120068t;

    /* renamed from: u */
    public final FrameLayout f120069u;

    /* renamed from: v */
    public final ImageView f120070v;

    /* renamed from: w */
    public final PulseImageView f120071w;

    /* renamed from: x */
    public final RecyclingImageView f120072x;

    /* renamed from: y */
    public final SimpleShadowTextView f120073y;

    /* renamed from: z */
    public final SimpleShadowTextView f120074z;

    private C25027l(CommentItem commentItem, AvatarImageView avatarImageView, PulseImageView pulseImageView, ImageView imageView, BubbleTextView bubbleTextView, FrameLayout frameLayout, ImageView imageView2, PulseImageView pulseImageView2, RecyclingImageView recyclingImageView, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, FitContentTextView fitContentTextView, RobotoTextView robotoTextView, FitUsernameTextView fitUsernameTextView, BlinkTextView blinkTextView, RobotoTextView robotoTextView2, RoundedImageView roundedImageView) {
        this.f120064p = commentItem;
        this.f120065q = avatarImageView;
        this.f120066r = pulseImageView;
        this.f120067s = imageView;
        this.f120068t = bubbleTextView;
        this.f120069u = frameLayout;
        this.f120070v = imageView2;
        this.f120071w = pulseImageView2;
        this.f120072x = recyclingImageView;
        this.f120073y = simpleShadowTextView;
        this.f120074z = simpleShadowTextView2;
        this.f120058A = fitContentTextView;
        this.f120059B = robotoTextView;
        this.f120060C = fitUsernameTextView;
        this.f120061D = blinkTextView;
        this.f120062E = robotoTextView2;
        this.f120063F = roundedImageView;
    }

    /* renamed from: a */
    public static C25027l m129872a(View view) {
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.btnLike;
            PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
            if (pulseImageView != null) {
                i11 = AbstractC27409d.btnPlay;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC27409d.bubbleView;
                    BubbleTextView bubbleTextView = (BubbleTextView) AbstractC22716b.m117526a(view, i11);
                    if (bubbleTextView != null) {
                        i11 = AbstractC27409d.flVideoCover;
                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout != null) {
                            i11 = AbstractC27409d.icoStatus;
                            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                            if (imageView2 != null) {
                                i11 = AbstractC27409d.ivAuthorHeart;
                                PulseImageView pulseImageView2 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                                if (pulseImageView2 != null) {
                                    i11 = AbstractC27409d.ivAuthorLiked;
                                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                    if (recyclingImageView != null) {
                                        i11 = AbstractC27409d.tagAuthor;
                                        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                        if (simpleShadowTextView != null) {
                                            i11 = AbstractC27409d.tvPinComment;
                                            SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                            if (simpleShadowTextView2 != null) {
                                                i11 = AbstractC27409d.txtContent;
                                                FitContentTextView fitContentTextView = (FitContentTextView) AbstractC22716b.m117526a(view, i11);
                                                if (fitContentTextView != null) {
                                                    i11 = AbstractC27409d.txtLike;
                                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView != null) {
                                                        i11 = AbstractC27409d.txtName;
                                                        FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (fitUsernameTextView != null) {
                                                            i11 = AbstractC27409d.txtReply;
                                                            BlinkTextView blinkTextView = (BlinkTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (blinkTextView != null) {
                                                                i11 = AbstractC27409d.txtTime;
                                                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (robotoTextView2 != null) {
                                                                    i11 = AbstractC27409d.videoCover;
                                                                    RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                                                                    if (roundedImageView != null) {
                                                                        return new C25027l((CommentItem) view, avatarImageView, pulseImageView, imageView, bubbleTextView, frameLayout, imageView2, pulseImageView2, recyclingImageView, simpleShadowTextView, simpleShadowTextView2, fitContentTextView, robotoTextView, fitUsernameTextView, blinkTextView, robotoTextView2, roundedImageView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public CommentItem getRoot() {
        return this.f120064p;
    }
}
