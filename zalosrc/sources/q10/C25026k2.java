package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.view.BottomGuideLayout;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.k2 */
/* loaded from: classes5.dex */
public final class C25026k2 implements InterfaceC22715a {

    /* renamed from: A */
    public final SimpleShadowTextView f120027A;

    /* renamed from: B */
    public final LinearLayout f120028B;

    /* renamed from: C */
    public final SimpleShadowTextView f120029C;

    /* renamed from: D */
    public final ImageView f120030D;

    /* renamed from: E */
    public final OverScrollableRecyclerView f120031E;

    /* renamed from: F */
    public final FrameLayout f120032F;

    /* renamed from: G */
    public final BottomGuideLayout f120033G;

    /* renamed from: H */
    public final LinearLayout f120034H;

    /* renamed from: I */
    public final LoadingLayout f120035I;

    /* renamed from: J */
    public final VideoPageLayout f120036J;

    /* renamed from: K */
    public final LinearLayout f120037K;

    /* renamed from: L */
    public final VideoLayout f120038L;

    /* renamed from: M */
    public final View f120039M;

    /* renamed from: N */
    public final RecyclingImageView f120040N;

    /* renamed from: O */
    public final EllipsizedTextView f120041O;

    /* renamed from: P */
    public final TextView f120042P;

    /* renamed from: Q */
    public final SimpleShadowTextView f120043Q;

    /* renamed from: R */
    public final SimpleShadowTextView f120044R;

    /* renamed from: S */
    public final SimpleShadowTextView f120045S;

    /* renamed from: T */
    public final FrameLayout f120046T;

    /* renamed from: p */
    private final VideoPageLayout f120047p;

    /* renamed from: q */
    public final ProgressBar f120048q;

    /* renamed from: r */
    public final OverScrollableRefreshBar f120049r;

    /* renamed from: s */
    public final VideoSeekBar f120050s;

    /* renamed from: t */
    public final C25055t1 f120051t;

    /* renamed from: u */
    public final SimpleShadowTextView f120052u;

    /* renamed from: v */
    public final ImageView f120053v;

    /* renamed from: w */
    public final PulseImageView f120054w;

    /* renamed from: x */
    public final SimpleShadowTextView f120055x;

    /* renamed from: y */
    public final RecyclingImageView f120056y;

    /* renamed from: z */
    public final ImageView f120057z;

    private C25026k2(VideoPageLayout videoPageLayout, ProgressBar progressBar, OverScrollableRefreshBar overScrollableRefreshBar, VideoSeekBar videoSeekBar, C25055t1 c25055t1, SimpleShadowTextView simpleShadowTextView, ImageView imageView, PulseImageView pulseImageView, SimpleShadowTextView simpleShadowTextView2, RecyclingImageView recyclingImageView, ImageView imageView2, SimpleShadowTextView simpleShadowTextView3, LinearLayout linearLayout, SimpleShadowTextView simpleShadowTextView4, ImageView imageView3, OverScrollableRecyclerView overScrollableRecyclerView, FrameLayout frameLayout, BottomGuideLayout bottomGuideLayout, LinearLayout linearLayout2, LoadingLayout loadingLayout, VideoPageLayout videoPageLayout2, LinearLayout linearLayout3, VideoLayout videoLayout, View view, RecyclingImageView recyclingImageView2, EllipsizedTextView ellipsizedTextView, TextView textView, SimpleShadowTextView simpleShadowTextView5, SimpleShadowTextView simpleShadowTextView6, SimpleShadowTextView simpleShadowTextView7, FrameLayout frameLayout2) {
        this.f120047p = videoPageLayout;
        this.f120048q = progressBar;
        this.f120049r = overScrollableRefreshBar;
        this.f120050s = videoSeekBar;
        this.f120051t = c25055t1;
        this.f120052u = simpleShadowTextView;
        this.f120053v = imageView;
        this.f120054w = pulseImageView;
        this.f120055x = simpleShadowTextView2;
        this.f120056y = recyclingImageView;
        this.f120057z = imageView2;
        this.f120027A = simpleShadowTextView3;
        this.f120028B = linearLayout;
        this.f120029C = simpleShadowTextView4;
        this.f120030D = imageView3;
        this.f120031E = overScrollableRecyclerView;
        this.f120032F = frameLayout;
        this.f120033G = bottomGuideLayout;
        this.f120034H = linearLayout2;
        this.f120035I = loadingLayout;
        this.f120036J = videoPageLayout2;
        this.f120037K = linearLayout3;
        this.f120038L = videoLayout;
        this.f120039M = view;
        this.f120040N = recyclingImageView2;
        this.f120041O = ellipsizedTextView;
        this.f120042P = textView;
        this.f120043Q = simpleShadowTextView5;
        this.f120044R = simpleShadowTextView6;
        this.f120045S = simpleShadowTextView7;
        this.f120046T = frameLayout2;
    }

    /* renamed from: a */
    public static C25026k2 m129869a(View view) {
        View m117526a;
        View m117526a2;
        int i11 = AbstractC27409d.barLoadingMore;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            i11 = AbstractC27409d.barRefresh;
            OverScrollableRefreshBar overScrollableRefreshBar = (OverScrollableRefreshBar) AbstractC22716b.m117526a(view, i11);
            if (overScrollableRefreshBar != null) {
                i11 = AbstractC27409d.barSeek;
                VideoSeekBar videoSeekBar = (VideoSeekBar) AbstractC22716b.m117526a(view, i11);
                if (videoSeekBar != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.binSimilarVideos))) != null) {
                    C25055t1 m129940a = C25055t1.m129940a(m117526a);
                    i11 = AbstractC27409d.btnAnalytic;
                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView != null) {
                        i11 = AbstractC27409d.btnBack;
                        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView != null) {
                            i11 = AbstractC27409d.btnCommentClose;
                            PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                            if (pulseImageView != null) {
                                i11 = AbstractC27409d.btnDone;
                                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                if (simpleShadowTextView2 != null) {
                                    i11 = AbstractC27409d.btnEmoji;
                                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                    if (recyclingImageView != null) {
                                        i11 = AbstractC27409d.btnFloat;
                                        ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                        if (imageView2 != null) {
                                            i11 = AbstractC27409d.btnRefresh;
                                            SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                            if (simpleShadowTextView3 != null) {
                                                i11 = AbstractC27409d.btnScrollDown;
                                                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                if (linearLayout != null) {
                                                    i11 = AbstractC27409d.btnSkip;
                                                    SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (simpleShadowTextView4 != null) {
                                                        i11 = AbstractC27409d.icoGuideBottom;
                                                        ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                        if (imageView3 != null) {
                                                            i11 = AbstractC27409d.lstVideo;
                                                            OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                                            if (overScrollableRecyclerView != null) {
                                                                i11 = AbstractC27409d.lytContent;
                                                                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                                if (frameLayout != null) {
                                                                    i11 = AbstractC27409d.lytGuideBottom;
                                                                    BottomGuideLayout bottomGuideLayout = (BottomGuideLayout) AbstractC22716b.m117526a(view, i11);
                                                                    if (bottomGuideLayout != null) {
                                                                        i11 = AbstractC27409d.lytHeader;
                                                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                        if (linearLayout2 != null) {
                                                                            i11 = AbstractC27409d.lytLoading;
                                                                            LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
                                                                            if (loadingLayout != null) {
                                                                                VideoPageLayout videoPageLayout = (VideoPageLayout) view;
                                                                                i11 = AbstractC27409d.lytTime;
                                                                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                                if (linearLayout3 != null) {
                                                                                    i11 = AbstractC27409d.lytVideo;
                                                                                    VideoLayout videoLayout = (VideoLayout) AbstractC22716b.m117526a(view, i11);
                                                                                    if (videoLayout != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.ovlFooter))) != null) {
                                                                                        i11 = AbstractC27409d.rivScrollDown;
                                                                                        RecyclingImageView recyclingImageView2 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                                                                        if (recyclingImageView2 != null) {
                                                                                            i11 = AbstractC27409d.txtFooter;
                                                                                            EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                                            if (ellipsizedTextView != null) {
                                                                                                i11 = AbstractC27409d.txtGuideBottom;
                                                                                                TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
                                                                                                if (textView != null) {
                                                                                                    i11 = AbstractC27409d.txtScrollDown;
                                                                                                    SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                    if (simpleShadowTextView5 != null) {
                                                                                                        i11 = AbstractC27409d.txtTimeDuration;
                                                                                                        SimpleShadowTextView simpleShadowTextView6 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                        if (simpleShadowTextView6 != null) {
                                                                                                            i11 = AbstractC27409d.txtTimeElapsed;
                                                                                                            SimpleShadowTextView simpleShadowTextView7 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                                            if (simpleShadowTextView7 != null) {
                                                                                                                i11 = AbstractC27409d.vieComment;
                                                                                                                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                                                                                if (frameLayout2 != null) {
                                                                                                                    return new C25026k2(videoPageLayout, progressBar, overScrollableRefreshBar, videoSeekBar, m129940a, simpleShadowTextView, imageView, pulseImageView, simpleShadowTextView2, recyclingImageView, imageView2, simpleShadowTextView3, linearLayout, simpleShadowTextView4, imageView3, overScrollableRecyclerView, frameLayout, bottomGuideLayout, linearLayout2, loadingLayout, videoPageLayout, linearLayout3, videoLayout, m117526a2, recyclingImageView2, ellipsizedTextView, textView, simpleShadowTextView5, simpleShadowTextView6, simpleShadowTextView7, frameLayout2);
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
    public static C25026k2 m129870c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_video, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129869a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public VideoPageLayout getRoot() {
        return this.f120047p;
    }
}
