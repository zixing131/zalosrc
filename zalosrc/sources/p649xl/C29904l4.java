package p649xl;

import android.view.View;
import android.widget.ProgressBar;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l4 */
/* loaded from: classes3.dex */
public final class C29904l4 implements InterfaceC22715a {

    /* renamed from: p */
    private final ProgressBar f138555p;

    /* renamed from: q */
    public final ProgressBar f138556q;

    private C29904l4(ProgressBar progressBar, ProgressBar progressBar2) {
        this.f138555p = progressBar;
        this.f138556q = progressBar2;
    }

    /* renamed from: a */
    public static C29904l4 m148193a(View view) {
        if (view != null) {
            ProgressBar progressBar = (ProgressBar) view;
            return new C29904l4(progressBar, progressBar);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ProgressBar getRoot() {
        return this.f138555p;
    }
}