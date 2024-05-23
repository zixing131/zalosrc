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

/* renamed from: xl.u3 */
/* loaded from: classes3.dex */
public final class C30062u3 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139536p;

    /* renamed from: q */
    public final ProgressBar f139537q;

    private C30062u3(RelativeLayout relativeLayout, ProgressBar progressBar) {
        this.f139536p = relativeLayout;
        this.f139537q = progressBar;
    }

    /* renamed from: a */
    public static C30062u3 m148559a(View view) {
        int i11 = AbstractC6918a0.progress_bar;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            return new C30062u3((RelativeLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30062u3 m148560c(LayoutInflater layoutInflater) {
        return m148561d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30062u3 m148561d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_item_zinstant_ads_loading_state, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148559a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139536p;
    }
}
