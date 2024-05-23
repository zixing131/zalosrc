package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zlottie.widget.LottieImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c5 */
/* loaded from: classes3.dex */
public final class C29743c5 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137393p;

    /* renamed from: q */
    public final GlowingReddot f137394q;

    /* renamed from: r */
    public final RecyclingImageView f137395r;

    /* renamed from: s */
    public final ProgressBar f137396s;

    /* renamed from: t */
    public final LottieImageView f137397t;

    /* renamed from: u */
    public final ModulesView f137398u;

    private C29743c5(FrameLayout frameLayout, GlowingReddot glowingReddot, RecyclingImageView recyclingImageView, ProgressBar progressBar, LottieImageView lottieImageView, ModulesView modulesView) {
        this.f137393p = frameLayout;
        this.f137394q = glowingReddot;
        this.f137395r = recyclingImageView;
        this.f137396s = progressBar;
        this.f137397t = lottieImageView;
        this.f137398u = modulesView;
    }

    /* renamed from: a */
    public static C29743c5 m147802a(View view) {
        int i11 = AbstractC6918a0.glowing_reddot_music;
        GlowingReddot glowingReddot = (GlowingReddot) AbstractC22716b.m117526a(view, i11);
        if (glowingReddot != null) {
            i11 = AbstractC6918a0.image_music;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.loading_music;
                ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                if (progressBar != null) {
                    i11 = AbstractC6918a0.lottie_music;
                    LottieImageView lottieImageView = (LottieImageView) AbstractC22716b.m117526a(view, i11);
                    if (lottieImageView != null) {
                        i11 = AbstractC6918a0.tv_select_music;
                        ModulesView modulesView = (ModulesView) AbstractC22716b.m117526a(view, i11);
                        if (modulesView != null) {
                            return new C29743c5((FrameLayout) view, glowingReddot, recyclingImageView, progressBar, lottieImageView, modulesView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137393p;
    }
}
