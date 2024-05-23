package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.DescriptionLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.s0 */
/* loaded from: classes5.dex */
public final class C25051s0 implements InterfaceC22715a {

    /* renamed from: A */
    public final ImageView f120235A;

    /* renamed from: B */
    public final PulseImageView f120236B;

    /* renamed from: C */
    public final View f120237C;

    /* renamed from: D */
    public final DescriptionLayout f120238D;

    /* renamed from: E */
    public final FrameLayout f120239E;

    /* renamed from: F */
    public final RecyclingImageView f120240F;

    /* renamed from: G */
    public final ScrollView f120241G;

    /* renamed from: H */
    public final SimpleShadowTextView f120242H;

    /* renamed from: I */
    public final SimpleShadowTextView f120243I;

    /* renamed from: J */
    public final SimpleShadowTextView f120244J;

    /* renamed from: K */
    public final SimpleShadowTextView f120245K;

    /* renamed from: L */
    public final EllipsizedTextView f120246L;

    /* renamed from: M */
    public final SimpleShadowTextView f120247M;

    /* renamed from: N */
    public final FitUsernameTextView f120248N;

    /* renamed from: O */
    public final SimpleShadowTextView f120249O;

    /* renamed from: P */
    public final View f120250P;

    /* renamed from: Q */
    public final View f120251Q;

    /* renamed from: p */
    private final View f120252p;

    /* renamed from: q */
    public final AvatarImageView f120253q;

    /* renamed from: r */
    public final ProgressBar f120254r;

    /* renamed from: s */
    public final PulseImageView f120255s;

    /* renamed from: t */
    public final BlinkTextView f120256t;

    /* renamed from: u */
    public final PulseImageView f120257u;

    /* renamed from: v */
    public final PulseImageView f120258v;

    /* renamed from: w */
    public final PulseImageView f120259w;

    /* renamed from: x */
    public final SimpleShadowTextView f120260x;

    /* renamed from: y */
    public final PulseImageView f120261y;

    /* renamed from: z */
    public final PulseImageView f120262z;

    private C25051s0(View view, AvatarImageView avatarImageView, ProgressBar progressBar, PulseImageView pulseImageView, BlinkTextView blinkTextView, PulseImageView pulseImageView2, PulseImageView pulseImageView3, PulseImageView pulseImageView4, SimpleShadowTextView simpleShadowTextView, PulseImageView pulseImageView5, PulseImageView pulseImageView6, ImageView imageView, PulseImageView pulseImageView7, View view2, DescriptionLayout descriptionLayout, FrameLayout frameLayout, RecyclingImageView recyclingImageView, ScrollView scrollView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4, SimpleShadowTextView simpleShadowTextView5, EllipsizedTextView ellipsizedTextView, SimpleShadowTextView simpleShadowTextView6, FitUsernameTextView fitUsernameTextView, SimpleShadowTextView simpleShadowTextView7, View view3, View view4) {
        this.f120252p = view;
        this.f120253q = avatarImageView;
        this.f120254r = progressBar;
        this.f120255s = pulseImageView;
        this.f120256t = blinkTextView;
        this.f120257u = pulseImageView2;
        this.f120258v = pulseImageView3;
        this.f120259w = pulseImageView4;
        this.f120260x = simpleShadowTextView;
        this.f120261y = pulseImageView5;
        this.f120262z = pulseImageView6;
        this.f120235A = imageView;
        this.f120236B = pulseImageView7;
        this.f120237C = view2;
        this.f120238D = descriptionLayout;
        this.f120239E = frameLayout;
        this.f120240F = recyclingImageView;
        this.f120241G = scrollView;
        this.f120242H = simpleShadowTextView2;
        this.f120243I = simpleShadowTextView3;
        this.f120244J = simpleShadowTextView4;
        this.f120245K = simpleShadowTextView5;
        this.f120246L = ellipsizedTextView;
        this.f120247M = simpleShadowTextView6;
        this.f120248N = fitUsernameTextView;
        this.f120249O = simpleShadowTextView7;
        this.f120250P = view3;
        this.f120251Q = view4;
    }

    /* renamed from: a */
    public static C25051s0 m129933a(View view) {
        View m117526a;
        View m117526a2;
        View m117526a3;
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.barLoading;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC27409d.btnBookmark;
                PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                if (pulseImageView != null) {
                    i11 = AbstractC27409d.btnCollapse;
                    BlinkTextView blinkTextView = (BlinkTextView) AbstractC22716b.m117526a(view, i11);
                    if (blinkTextView != null) {
                        i11 = AbstractC27409d.btnComment;
                        PulseImageView pulseImageView2 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                        if (pulseImageView2 != null) {
                            i11 = AbstractC27409d.btnDelete;
                            PulseImageView pulseImageView3 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                            if (pulseImageView3 != null) {
                                i11 = AbstractC27409d.btnDislike;
                                PulseImageView pulseImageView4 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                                if (pulseImageView4 != null) {
                                    i11 = AbstractC27409d.btnFollow;
                                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                    if (simpleShadowTextView != null) {
                                        i11 = AbstractC27409d.btnLike;
                                        PulseImageView pulseImageView5 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                                        if (pulseImageView5 != null) {
                                            i11 = AbstractC27409d.btnMore;
                                            PulseImageView pulseImageView6 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                                            if (pulseImageView6 != null) {
                                                i11 = AbstractC27409d.btnPlay;
                                                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                if (imageView != null) {
                                                    i11 = AbstractC27409d.btnShare;
                                                    PulseImageView pulseImageView7 = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                                                    if (pulseImageView7 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.dimBackgroundInfo))) != null) {
                                                        i11 = AbstractC27409d.lytDescription;
                                                        DescriptionLayout descriptionLayout = (DescriptionLayout) AbstractC22716b.m117526a(view, i11);
                                                        if (descriptionLayout != null) {
                                                            i11 = AbstractC27409d.lytPlay;
                                                            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                            if (frameLayout != null) {
                                                                i11 = AbstractC27409d.rivThumbnail;
                                                                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                                                if (recyclingImageView != null) {
                                                                    i11 = AbstractC27409d.scrDescription;
                                                                    ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                                                                    if (scrollView != null) {
                                                                        i11 = AbstractC27409d.txtBookmark;
                                                                        SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                        if (simpleShadowTextView2 != null) {
                                                                            i11 = AbstractC27409d.txtComment;
                                                                            SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                            if (simpleShadowTextView3 != null) {
                                                                                i11 = AbstractC27409d.txtCreatedTime;
                                                                                SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                if (simpleShadowTextView4 != null) {
                                                                                    i11 = AbstractC27409d.txtDelete;
                                                                                    SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                    if (simpleShadowTextView5 != null) {
                                                                                        i11 = AbstractC27409d.txtDescription;
                                                                                        EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                                        if (ellipsizedTextView != null) {
                                                                                            i11 = AbstractC27409d.txtLike;
                                                                                            SimpleShadowTextView simpleShadowTextView6 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                            if (simpleShadowTextView6 != null) {
                                                                                                i11 = AbstractC27409d.txtName;
                                                                                                FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                if (fitUsernameTextView != null) {
                                                                                                    i11 = AbstractC27409d.txtShare;
                                                                                                    SimpleShadowTextView simpleShadowTextView7 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                    if (simpleShadowTextView7 != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieBackground))) != null && (m117526a3 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieOverlay))) != null) {
                                                                                                        return new C25051s0(view, avatarImageView, progressBar, pulseImageView, blinkTextView, pulseImageView2, pulseImageView3, pulseImageView4, simpleShadowTextView, pulseImageView5, pulseImageView6, imageView, pulseImageView7, m117526a, descriptionLayout, frameLayout, recyclingImageView, scrollView, simpleShadowTextView2, simpleShadowTextView3, simpleShadowTextView4, simpleShadowTextView5, ellipsizedTextView, simpleShadowTextView6, fitUsernameTextView, simpleShadowTextView7, m117526a2, m117526a3);
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
        return this.f120252p;
    }
}
