package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SendingCommentItem;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitContentTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.m0 */
/* loaded from: classes5.dex */
public final class C25032m0 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f120088A;

    /* renamed from: B */
    public final FitUsernameTextView f120089B;

    /* renamed from: C */
    public final RoundedImageView f120090C;

    /* renamed from: p */
    private final SendingCommentItem f120091p;

    /* renamed from: q */
    public final AvatarImageView f120092q;

    /* renamed from: r */
    public final ProgressBar f120093r;

    /* renamed from: s */
    public final PulseImageView f120094s;

    /* renamed from: t */
    public final ImageView f120095t;

    /* renamed from: u */
    public final FrameLayout f120096u;

    /* renamed from: v */
    public final ImageView f120097v;

    /* renamed from: w */
    public final BlinkTextView f120098w;

    /* renamed from: x */
    public final SimpleShadowTextView f120099x;

    /* renamed from: y */
    public final SimpleShadowTextView f120100y;

    /* renamed from: z */
    public final FitContentTextView f120101z;

    private C25032m0(SendingCommentItem sendingCommentItem, AvatarImageView avatarImageView, ProgressBar progressBar, PulseImageView pulseImageView, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, BlinkTextView blinkTextView, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, FitContentTextView fitContentTextView, RobotoTextView robotoTextView, FitUsernameTextView fitUsernameTextView, RoundedImageView roundedImageView) {
        this.f120091p = sendingCommentItem;
        this.f120092q = avatarImageView;
        this.f120093r = progressBar;
        this.f120094s = pulseImageView;
        this.f120095t = imageView;
        this.f120096u = frameLayout;
        this.f120097v = imageView2;
        this.f120098w = blinkTextView;
        this.f120099x = simpleShadowTextView;
        this.f120100y = simpleShadowTextView2;
        this.f120101z = fitContentTextView;
        this.f120088A = robotoTextView;
        this.f120089B = fitUsernameTextView;
        this.f120090C = roundedImageView;
    }

    /* renamed from: a */
    public static C25032m0 m129884a(View view) {
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.barLoading;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC27409d.btnLike;
                PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                if (pulseImageView != null) {
                    i11 = AbstractC27409d.btnPlay;
                    ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                    if (imageView != null) {
                        i11 = AbstractC27409d.flVideoCover;
                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout != null) {
                            i11 = AbstractC27409d.icoStatus;
                            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                            if (imageView2 != null) {
                                i11 = AbstractC27409d.tvDelete;
                                BlinkTextView blinkTextView = (BlinkTextView) AbstractC22716b.m117526a(view, i11);
                                if (blinkTextView != null) {
                                    i11 = AbstractC27409d.tvRetry;
                                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                    if (simpleShadowTextView != null) {
                                        i11 = AbstractC27409d.tvSending;
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
                                                        i11 = AbstractC27409d.videoCover;
                                                        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                                                        if (roundedImageView != null) {
                                                            return new C25032m0((SendingCommentItem) view, avatarImageView, progressBar, pulseImageView, imageView, frameLayout, imageView2, blinkTextView, simpleShadowTextView, simpleShadowTextView2, fitContentTextView, robotoTextView, fitUsernameTextView, roundedImageView);
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
    public SendingCommentItem getRoot() {
        return this.f120091p;
    }
}
