package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q5 */
/* loaded from: classes3.dex */
public final class C29995q5 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139091p;

    /* renamed from: q */
    public final RelativeLayout f139092q;

    /* renamed from: r */
    public final ProgressBar f139093r;

    private C29995q5(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ProgressBar progressBar) {
        this.f139091p = relativeLayout;
        this.f139092q = relativeLayout2;
        this.f139093r = progressBar;
    }

    /* renamed from: a */
    public static C29995q5 m148397a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.progress_bar;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            return new C29995q5(relativeLayout, relativeLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29995q5 m148398c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_loading_with_indeterminate_progress_bar, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148397a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139091p;
    }
}
