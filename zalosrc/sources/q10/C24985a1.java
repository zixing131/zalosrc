package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.widget.et.EnterActionEditText;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.a1 */
/* loaded from: classes5.dex */
public final class C24985a1 implements InterfaceC22715a {

    /* renamed from: A */
    public final FrameLayout f119716A;

    /* renamed from: B */
    public final LinearLayout f119717B;

    /* renamed from: C */
    public final LinearLayout f119718C;

    /* renamed from: D */
    public final RecyclingImageView f119719D;

    /* renamed from: E */
    public final EllipsizedTextView f119720E;

    /* renamed from: F */
    public final SimpleShadowTextView f119721F;

    /* renamed from: G */
    public final SimpleShadowTextView f119722G;

    /* renamed from: H */
    public final SimpleShadowTextView f119723H;

    /* renamed from: I */
    public final SimpleShadowTextView f119724I;

    /* renamed from: J */
    public final SimpleShadowTextView f119725J;

    /* renamed from: K */
    public final SimpleShadowTextView f119726K;

    /* renamed from: L */
    public final SimpleShadowTextView f119727L;

    /* renamed from: M */
    public final SimpleShadowTextView f119728M;

    /* renamed from: N */
    public final BlinkTextView f119729N;

    /* renamed from: O */
    public final FitUsernameTextView f119730O;

    /* renamed from: P */
    public final View f119731P;

    /* renamed from: p */
    private final View f119732p;

    /* renamed from: q */
    public final AvatarImageView f119733q;

    /* renamed from: r */
    public final PulseImageView f119734r;

    /* renamed from: s */
    public final PulseImageView f119735s;

    /* renamed from: t */
    public final PulseImageView f119736t;

    /* renamed from: u */
    public final PulseImageView f119737u;

    /* renamed from: v */
    public final EnterActionEditText f119738v;

    /* renamed from: w */
    public final ImageView f119739w;

    /* renamed from: x */
    public final ImageView f119740x;

    /* renamed from: y */
    public final ImageView f119741y;

    /* renamed from: z */
    public final LinearLayout f119742z;

    private C24985a1(View view, AvatarImageView avatarImageView, PulseImageView pulseImageView, PulseImageView pulseImageView2, PulseImageView pulseImageView3, PulseImageView pulseImageView4, EnterActionEditText enterActionEditText, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclingImageView recyclingImageView, EllipsizedTextView ellipsizedTextView, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4, SimpleShadowTextView simpleShadowTextView5, SimpleShadowTextView simpleShadowTextView6, SimpleShadowTextView simpleShadowTextView7, SimpleShadowTextView simpleShadowTextView8, BlinkTextView blinkTextView, FitUsernameTextView fitUsernameTextView, View view2) {
        this.f119732p = view;
        this.f119733q = avatarImageView;
        this.f119734r = pulseImageView;
        this.f119735s = pulseImageView2;
        this.f119736t = pulseImageView3;
        this.f119737u = pulseImageView4;
        this.f119738v = enterActionEditText;
        this.f119739w = imageView;
        this.f119740x = imageView2;
        this.f119741y = imageView3;
        this.f119742z = linearLayout;
        this.f119716A = frameLayout;
        this.f119717B = linearLayout2;
        this.f119718C = linearLayout3;
        this.f119719D = recyclingImageView;
        this.f119720E = ellipsizedTextView;
        this.f119721F = simpleShadowTextView;
        this.f119722G = simpleShadowTextView2;
        this.f119723H = simpleShadowTextView3;
        this.f119724I = simpleShadowTextView4;
        this.f119725J = simpleShadowTextView5;
        this.f119726K = simpleShadowTextView6;
        this.f119727L = simpleShadowTextView7;
        this.f119728M = simpleShadowTextView8;
        this.f119729N = blinkTextView;
        this.f119730O = fitUsernameTextView;
        this.f119731P = view2;
    }

    /* renamed from: a */
    public static C24985a1 m129753a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.btnEmoji;
            PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
            if (pulseImageView != null) {
                i11 = AbstractC27409d.btnSend;
                PulseImageView pulseImageView2 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                if (pulseImageView2 != null) {
                    i11 = AbstractC27409d.btnUpload;
                    PulseImageView pulseImageView3 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                    if (pulseImageView3 != null) {
                        i11 = AbstractC27409d.btnVideoClose;
                        PulseImageView pulseImageView4 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                        if (pulseImageView4 != null) {
                            i11 = AbstractC27409d.edtInput;
                            EnterActionEditText enterActionEditText = (EnterActionEditText) AbstractC22716b.m117526a(view, i11);
                            if (enterActionEditText != null) {
                                i11 = AbstractC27409d.icoSwitch;
                                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                                if (imageView != null) {
                                    i11 = AbstractC27409d.icoVideoPlay;
                                    ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                    if (imageView2 != null) {
                                        i11 = AbstractC27409d.icoVideoSensitive;
                                        ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                        if (imageView3 != null) {
                                            i11 = AbstractC27409d.lytActions;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout != null) {
                                                i11 = AbstractC27409d.lytEmoji;
                                                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                if (frameLayout != null) {
                                                    i11 = AbstractC27409d.lytEmojiRecent;
                                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                    if (linearLayout2 != null) {
                                                        i11 = AbstractC27409d.lytInput;
                                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                        if (linearLayout3 != null) {
                                                            i11 = AbstractC27409d.rivVideo;
                                                            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                                            if (recyclingImageView != null) {
                                                                i11 = AbstractC27409d.txtBlocked;
                                                                EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (ellipsizedTextView != null) {
                                                                    i11 = AbstractC27409d.txtEmojiRecent0;
                                                                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                    if (simpleShadowTextView != null) {
                                                                        i11 = AbstractC27409d.txtEmojiRecent1;
                                                                        SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                        if (simpleShadowTextView2 != null) {
                                                                            i11 = AbstractC27409d.txtEmojiRecent2;
                                                                            SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                            if (simpleShadowTextView3 != null) {
                                                                                i11 = AbstractC27409d.txtEmojiRecent3;
                                                                                SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                if (simpleShadowTextView4 != null) {
                                                                                    i11 = AbstractC27409d.txtEmojiRecent4;
                                                                                    SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                    if (simpleShadowTextView5 != null) {
                                                                                        i11 = AbstractC27409d.txtEmojiRecent5;
                                                                                        SimpleShadowTextView simpleShadowTextView6 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                        if (simpleShadowTextView6 != null) {
                                                                                            i11 = AbstractC27409d.txtEmojiRecent6;
                                                                                            SimpleShadowTextView simpleShadowTextView7 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                            if (simpleShadowTextView7 != null) {
                                                                                                i11 = AbstractC27409d.txtMention;
                                                                                                SimpleShadowTextView simpleShadowTextView8 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                if (simpleShadowTextView8 != null) {
                                                                                                    i11 = AbstractC27409d.txtMentionClose;
                                                                                                    BlinkTextView blinkTextView = (BlinkTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                    if (blinkTextView != null) {
                                                                                                        i11 = AbstractC27409d.txtMentionName;
                                                                                                        FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                        if (fitUsernameTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieDivider))) != null) {
                                                                                                            return new C24985a1(view, avatarImageView, pulseImageView, pulseImageView2, pulseImageView3, pulseImageView4, enterActionEditText, imageView, imageView2, imageView3, linearLayout, frameLayout, linearLayout2, linearLayout3, recyclingImageView, ellipsizedTextView, simpleShadowTextView, simpleShadowTextView2, simpleShadowTextView3, simpleShadowTextView4, simpleShadowTextView5, simpleShadowTextView6, simpleShadowTextView7, simpleShadowTextView8, blinkTextView, fitUsernameTextView, m117526a);
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
    public View getRoot() {
        return this.f119732p;
    }
}
