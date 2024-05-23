package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.view.PreviewPageLayout;
import com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.i2 */
/* loaded from: classes5.dex */
public final class C25018i2 implements InterfaceC22715a {

    /* renamed from: A */
    public final EllipsizedTextView f119967A;

    /* renamed from: B */
    public final SimpleShadowTextView f119968B;

    /* renamed from: C */
    public final SimpleShadowTextView f119969C;

    /* renamed from: D */
    public final View f119970D;

    /* renamed from: p */
    private final PreviewPageLayout f119971p;

    /* renamed from: q */
    public final ProgressBar f119972q;

    /* renamed from: r */
    public final VideoSeekBar f119973r;

    /* renamed from: s */
    public final ImageView f119974s;

    /* renamed from: t */
    public final ImageView f119975t;

    /* renamed from: u */
    public final SimpleShadowTextView f119976u;

    /* renamed from: v */
    public final FrameLayout f119977v;

    /* renamed from: w */
    public final LinearLayout f119978w;

    /* renamed from: x */
    public final PreviewPageLayout f119979x;

    /* renamed from: y */
    public final LinearLayout f119980y;

    /* renamed from: z */
    public final VideoLayout f119981z;

    private C25018i2(PreviewPageLayout previewPageLayout, ProgressBar progressBar, VideoSeekBar videoSeekBar, ImageView imageView, ImageView imageView2, SimpleShadowTextView simpleShadowTextView, FrameLayout frameLayout, LinearLayout linearLayout, PreviewPageLayout previewPageLayout2, LinearLayout linearLayout2, VideoLayout videoLayout, EllipsizedTextView ellipsizedTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, View view) {
        this.f119971p = previewPageLayout;
        this.f119972q = progressBar;
        this.f119973r = videoSeekBar;
        this.f119974s = imageView;
        this.f119975t = imageView2;
        this.f119976u = simpleShadowTextView;
        this.f119977v = frameLayout;
        this.f119978w = linearLayout;
        this.f119979x = previewPageLayout2;
        this.f119980y = linearLayout2;
        this.f119981z = videoLayout;
        this.f119967A = ellipsizedTextView;
        this.f119968B = simpleShadowTextView2;
        this.f119969C = simpleShadowTextView3;
        this.f119970D = view;
    }

    /* renamed from: a */
    public static C25018i2 m129850a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.barLoading;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            i11 = AbstractC27409d.barSeek;
            VideoSeekBar videoSeekBar = (VideoSeekBar) AbstractC22716b.m117526a(view, i11);
            if (videoSeekBar != null) {
                i11 = AbstractC27409d.btnBack;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC27409d.btnPlay;
                    ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                    if (imageView2 != null) {
                        i11 = AbstractC27409d.btnSelect;
                        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView != null) {
                            i11 = AbstractC27409d.lytContent;
                            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout != null) {
                                i11 = AbstractC27409d.lytHeader;
                                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout != null) {
                                    PreviewPageLayout previewPageLayout = (PreviewPageLayout) view;
                                    i11 = AbstractC27409d.lytTime;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = AbstractC27409d.lytVideo;
                                        VideoLayout videoLayout = (VideoLayout) AbstractC22716b.m117526a(view, i11);
                                        if (videoLayout != null) {
                                            i11 = AbstractC27409d.txtFooter;
                                            EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                            if (ellipsizedTextView != null) {
                                                i11 = AbstractC27409d.txtTimeDuration;
                                                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                if (simpleShadowTextView2 != null) {
                                                    i11 = AbstractC27409d.txtTimeElapsed;
                                                    SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (simpleShadowTextView3 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieTouch))) != null) {
                                                        return new C25018i2(previewPageLayout, progressBar, videoSeekBar, imageView, imageView2, simpleShadowTextView, frameLayout, linearLayout, previewPageLayout, linearLayout2, videoLayout, ellipsizedTextView, simpleShadowTextView2, simpleShadowTextView3, m117526a);
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
    public static C25018i2 m129851c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_preview, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129850a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public PreviewPageLayout getRoot() {
        return this.f119971p;
    }
}
