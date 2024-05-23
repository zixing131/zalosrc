package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r8 */
/* loaded from: classes3.dex */
public final class C30016r8 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139217p;

    /* renamed from: q */
    public final RecyclingImageView f139218q;

    /* renamed from: r */
    public final FrameLayout f139219r;

    /* renamed from: s */
    public final FrameLayout f139220s;

    /* renamed from: t */
    public final ProgressBar f139221t;

    private C30016r8(FrameLayout frameLayout, RecyclingImageView recyclingImageView, FrameLayout frameLayout2, FrameLayout frameLayout3, ProgressBar progressBar) {
        this.f139217p = frameLayout;
        this.f139218q = recyclingImageView;
        this.f139219r = frameLayout2;
        this.f139220s = frameLayout3;
        this.f139221t = progressBar;
    }

    /* renamed from: a */
    public static C30016r8 m148446a(View view) {
        int i11 = AbstractC6918a0.ic_story_music_effect;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.icon_container;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.loading_progress;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout2 != null) {
                    i11 = AbstractC6918a0.progress_bar_loading;
                    ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                    if (progressBar != null) {
                        return new C30016r8((FrameLayout) view, recyclingImageView, frameLayout, frameLayout2, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30016r8 m148447c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.music_effect_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148446a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139217p;
    }
}
