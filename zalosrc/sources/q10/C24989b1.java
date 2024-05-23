package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.zing.zalo.shortvideo.p072ui.widget.ChannelInfoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.ChannelLivestreamInfoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.SuggestFollowLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.b1 */
/* loaded from: classes5.dex */
public final class C24989b1 implements InterfaceC22715a {

    /* renamed from: A */
    public final ImageView f119761A;

    /* renamed from: B */
    public final ImageView f119762B;

    /* renamed from: C */
    public final ImageView f119763C;

    /* renamed from: D */
    public final OverScrollableRecyclerView f119764D;

    /* renamed from: E */
    public final ChannelInfoLayout f119765E;

    /* renamed from: F */
    public final ChannelLivestreamInfoLayout f119766F;

    /* renamed from: G */
    public final LoadingLayout f119767G;

    /* renamed from: H */
    public final LinearLayout f119768H;

    /* renamed from: I */
    public final AvatarImageView f119769I;

    /* renamed from: J */
    public final OverScrollableRecyclerView f119770J;

    /* renamed from: K */
    public final OverScrollableRecyclerView f119771K;

    /* renamed from: L */
    public final SimpleShadowTextView f119772L;

    /* renamed from: M */
    public final EllipsizedTextView f119773M;

    /* renamed from: N */
    public final EllipsizedTextView f119774N;

    /* renamed from: O */
    public final EllipsizedTextView f119775O;

    /* renamed from: P */
    public final EllipsizedTextView f119776P;

    /* renamed from: Q */
    public final TextView f119777Q;

    /* renamed from: R */
    public final UsernameTextView f119778R;

    /* renamed from: S */
    public final UsernameTextView f119779S;

    /* renamed from: p */
    private final FrameLayout f119780p;

    /* renamed from: q */
    public final AvatarImageView f119781q;

    /* renamed from: r */
    public final ProgressBar f119782r;

    /* renamed from: s */
    public final OverScrollableRefreshBar f119783s;

    /* renamed from: t */
    public final SimpleShadowTextView f119784t;

    /* renamed from: u */
    public final ImageView f119785u;

    /* renamed from: v */
    public final SimpleShadowTextView f119786v;

    /* renamed from: w */
    public final LinearLayout f119787w;

    /* renamed from: x */
    public final ImageView f119788x;

    /* renamed from: y */
    public final FrameLayout f119789y;

    /* renamed from: z */
    public final SuggestFollowLayout f119790z;

    private C24989b1(FrameLayout frameLayout, AvatarImageView avatarImageView, ProgressBar progressBar, OverScrollableRefreshBar overScrollableRefreshBar, SimpleShadowTextView simpleShadowTextView, ImageView imageView, SimpleShadowTextView simpleShadowTextView2, LinearLayout linearLayout, ImageView imageView2, FrameLayout frameLayout2, SuggestFollowLayout suggestFollowLayout, ImageView imageView3, ImageView imageView4, ImageView imageView5, OverScrollableRecyclerView overScrollableRecyclerView, ChannelInfoLayout channelInfoLayout, ChannelLivestreamInfoLayout channelLivestreamInfoLayout, LoadingLayout loadingLayout, LinearLayout linearLayout2, AvatarImageView avatarImageView2, OverScrollableRecyclerView overScrollableRecyclerView2, OverScrollableRecyclerView overScrollableRecyclerView3, SimpleShadowTextView simpleShadowTextView3, EllipsizedTextView ellipsizedTextView, EllipsizedTextView ellipsizedTextView2, EllipsizedTextView ellipsizedTextView3, EllipsizedTextView ellipsizedTextView4, TextView textView, UsernameTextView usernameTextView, UsernameTextView usernameTextView2) {
        this.f119780p = frameLayout;
        this.f119781q = avatarImageView;
        this.f119782r = progressBar;
        this.f119783s = overScrollableRefreshBar;
        this.f119784t = simpleShadowTextView;
        this.f119785u = imageView;
        this.f119786v = simpleShadowTextView2;
        this.f119787w = linearLayout;
        this.f119788x = imageView2;
        this.f119789y = frameLayout2;
        this.f119790z = suggestFollowLayout;
        this.f119761A = imageView3;
        this.f119762B = imageView4;
        this.f119763C = imageView5;
        this.f119764D = overScrollableRecyclerView;
        this.f119765E = channelInfoLayout;
        this.f119766F = channelLivestreamInfoLayout;
        this.f119767G = loadingLayout;
        this.f119768H = linearLayout2;
        this.f119769I = avatarImageView2;
        this.f119770J = overScrollableRecyclerView2;
        this.f119771K = overScrollableRecyclerView3;
        this.f119772L = simpleShadowTextView3;
        this.f119773M = ellipsizedTextView;
        this.f119774N = ellipsizedTextView2;
        this.f119775O = ellipsizedTextView3;
        this.f119776P = ellipsizedTextView4;
        this.f119777Q = textView;
        this.f119778R = usernameTextView;
        this.f119779S = usernameTextView2;
    }

    /* renamed from: a */
    public static C24989b1 m129763a(View view) {
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.barJustWatched;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC27409d.barRefresh;
                OverScrollableRefreshBar overScrollableRefreshBar = (OverScrollableRefreshBar) AbstractC22716b.m117526a(view, i11);
                if (overScrollableRefreshBar != null) {
                    i11 = AbstractC27409d.btnAction;
                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView != null) {
                        i11 = AbstractC27409d.btnExpand;
                        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView != null) {
                            i11 = AbstractC27409d.btnFollowSuggest;
                            SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                            if (simpleShadowTextView2 != null) {
                                i11 = AbstractC27409d.btnJustWatched;
                                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout != null) {
                                    i11 = AbstractC27409d.btnShare;
                                    ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                    if (imageView2 != null) {
                                        i11 = AbstractC27409d.flExpand;
                                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                        if (frameLayout != null) {
                                            i11 = AbstractC27409d.flSuggestBanner;
                                            SuggestFollowLayout suggestFollowLayout = (SuggestFollowLayout) AbstractC22716b.m117526a(view, i11);
                                            if (suggestFollowLayout != null) {
                                                i11 = AbstractC27409d.icoJustWatched;
                                                ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                if (imageView3 != null) {
                                                    i11 = AbstractC27409d.ivArrowRight;
                                                    ImageView imageView4 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                    if (imageView4 != null) {
                                                        i11 = AbstractC27409d.ivChannelLive;
                                                        ImageView imageView5 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                        if (imageView5 != null) {
                                                            i11 = AbstractC27409d.lstVideo;
                                                            OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                                            if (overScrollableRecyclerView != null) {
                                                                i11 = AbstractC27409d.lytInfo;
                                                                ChannelInfoLayout channelInfoLayout = (ChannelInfoLayout) AbstractC22716b.m117526a(view, i11);
                                                                if (channelInfoLayout != null) {
                                                                    i11 = AbstractC27409d.lytLive;
                                                                    ChannelLivestreamInfoLayout channelLivestreamInfoLayout = (ChannelLivestreamInfoLayout) AbstractC22716b.m117526a(view, i11);
                                                                    if (channelLivestreamInfoLayout != null) {
                                                                        i11 = AbstractC27409d.lytLoading;
                                                                        LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
                                                                        if (loadingLayout != null) {
                                                                            i11 = AbstractC27409d.lytStats;
                                                                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                            if (linearLayout2 != null) {
                                                                                i11 = AbstractC27409d.rivAvatarSuggest;
                                                                                AvatarImageView avatarImageView2 = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
                                                                                if (avatarImageView2 != null) {
                                                                                    i11 = AbstractC27409d.rvChannelCta;
                                                                                    OverScrollableRecyclerView overScrollableRecyclerView2 = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                                                                    if (overScrollableRecyclerView2 != null) {
                                                                                        i11 = AbstractC27409d.rvSimilarVideo;
                                                                                        OverScrollableRecyclerView overScrollableRecyclerView3 = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                                                                        if (overScrollableRecyclerView3 != null) {
                                                                                            i11 = AbstractC27409d.tvSimilarVideo;
                                                                                            SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                            if (simpleShadowTextView3 != null) {
                                                                                                i11 = AbstractC27409d.tvStateLive;
                                                                                                EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                if (ellipsizedTextView != null) {
                                                                                                    i11 = AbstractC27409d.tvTitle;
                                                                                                    EllipsizedTextView ellipsizedTextView2 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                    if (ellipsizedTextView2 != null) {
                                                                                                        i11 = AbstractC27409d.tvTitleSuggest;
                                                                                                        EllipsizedTextView ellipsizedTextView3 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                        if (ellipsizedTextView3 != null) {
                                                                                                            i11 = AbstractC27409d.txtBio;
                                                                                                            EllipsizedTextView ellipsizedTextView4 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                            if (ellipsizedTextView4 != null) {
                                                                                                                i11 = AbstractC27409d.txtJustWatched;
                                                                                                                TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
                                                                                                                if (textView != null) {
                                                                                                                    i11 = AbstractC27409d.txtName;
                                                                                                                    UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                                    if (usernameTextView != null) {
                                                                                                                        i11 = AbstractC27409d.txtVerify;
                                                                                                                        UsernameTextView usernameTextView2 = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                                        if (usernameTextView2 != null) {
                                                                                                                            return new C24989b1((FrameLayout) view, avatarImageView, progressBar, overScrollableRefreshBar, simpleShadowTextView, imageView, simpleShadowTextView2, linearLayout, imageView2, frameLayout, suggestFollowLayout, imageView3, imageView4, imageView5, overScrollableRecyclerView, channelInfoLayout, channelLivestreamInfoLayout, loadingLayout, linearLayout2, avatarImageView2, overScrollableRecyclerView2, overScrollableRecyclerView3, simpleShadowTextView3, ellipsizedTextView, ellipsizedTextView2, ellipsizedTextView3, ellipsizedTextView4, textView, usernameTextView, usernameTextView2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24989b1 m129764c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_channel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129763a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119780p;
    }
}
