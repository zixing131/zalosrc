package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d4 */
/* loaded from: classes3.dex */
public final class C29760d4 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137487p;

    /* renamed from: q */
    public final ProgressBar f137488q;

    private C29760d4(FrameLayout frameLayout, ProgressBar progressBar) {
        this.f137487p = frameLayout;
        this.f137488q = progressBar;
    }

    /* renamed from: a */
    public static C29760d4 m147841a(View view) {
        int i11 = AbstractC6918a0.loading_progress_bar;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            return new C29760d4((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29760d4 m147842c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.footer_reaction_loading_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147841a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137487p;
    }
}
