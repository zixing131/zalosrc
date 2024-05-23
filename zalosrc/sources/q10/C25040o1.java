package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.view.VideoChannelPagerLayout;
import com.zing.zalo.shortvideo.p072ui.widget.NonSwipeableViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zlottie.widget.LottieImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.o1 */
/* loaded from: classes5.dex */
public final class C25040o1 implements InterfaceC22715a {

    /* renamed from: A */
    public final NonSwipeableViewPager f120157A;

    /* renamed from: p */
    private final VideoChannelPagerLayout f120158p;

    /* renamed from: q */
    public final ImageView f120159q;

    /* renamed from: r */
    public final ImageView f120160r;

    /* renamed from: s */
    public final ImageView f120161s;

    /* renamed from: t */
    public final LottieImageView f120162t;

    /* renamed from: u */
    public final LinearLayout f120163u;

    /* renamed from: v */
    public final LinearLayout f120164v;

    /* renamed from: w */
    public final VideoChannelPagerLayout f120165w;

    /* renamed from: x */
    public final FrameLayout f120166x;

    /* renamed from: y */
    public final SimpleShadowTextView f120167y;

    /* renamed from: z */
    public final SimpleShadowTextView f120168z;

    private C25040o1(VideoChannelPagerLayout videoChannelPagerLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LottieImageView lottieImageView, LinearLayout linearLayout, LinearLayout linearLayout2, VideoChannelPagerLayout videoChannelPagerLayout2, FrameLayout frameLayout, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, NonSwipeableViewPager nonSwipeableViewPager) {
        this.f120158p = videoChannelPagerLayout;
        this.f120159q = imageView;
        this.f120160r = imageView2;
        this.f120161s = imageView3;
        this.f120162t = lottieImageView;
        this.f120163u = linearLayout;
        this.f120164v = linearLayout2;
        this.f120165w = videoChannelPagerLayout2;
        this.f120166x = frameLayout;
        this.f120167y = simpleShadowTextView;
        this.f120168z = simpleShadowTextView2;
        this.f120157A = nonSwipeableViewPager;
    }

    /* renamed from: a */
    public static C25040o1 m129908a(View view) {
        int i11 = AbstractC27409d.btnBack;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.btnFloat;
            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView2 != null) {
                i11 = AbstractC27409d.icoSwipeIAB;
                ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView3 != null) {
                    i11 = AbstractC27409d.livGuide;
                    LottieImageView lottieImageView = (LottieImageView) AbstractC22716b.m117526a(view, i11);
                    if (lottieImageView != null) {
                        i11 = AbstractC27409d.lytGuide;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC27409d.lytHeader;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                VideoChannelPagerLayout videoChannelPagerLayout = (VideoChannelPagerLayout) view;
                                i11 = AbstractC27409d.lytSwipeIAB;
                                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                if (frameLayout != null) {
                                    i11 = AbstractC27409d.txtGuide;
                                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                    if (simpleShadowTextView != null) {
                                        i11 = AbstractC27409d.txtSwipeIAB;
                                        SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                        if (simpleShadowTextView2 != null) {
                                            i11 = AbstractC27409d.viePager;
                                            NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) AbstractC22716b.m117526a(view, i11);
                                            if (nonSwipeableViewPager != null) {
                                                return new C25040o1(videoChannelPagerLayout, imageView, imageView2, imageView3, lottieImageView, linearLayout, linearLayout2, videoChannelPagerLayout, frameLayout, simpleShadowTextView, simpleShadowTextView2, nonSwipeableViewPager);
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
    public static C25040o1 m129909c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_pager_video_channel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129908a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public VideoChannelPagerLayout getRoot() {
        return this.f120158p;
    }
}
