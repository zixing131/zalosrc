package p649xl;

import android.view.View;
import android.widget.ProgressBar;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n4 */
/* loaded from: classes3.dex */
public final class C29940n4 implements InterfaceC22715a {

    /* renamed from: p */
    private final ProgressBar f138755p;

    /* renamed from: q */
    public final ProgressBar f138756q;

    private C29940n4(ProgressBar progressBar, ProgressBar progressBar2) {
        this.f138755p = progressBar;
        this.f138756q = progressBar2;
    }

    /* renamed from: a */
    public static C29940n4 m148270a(View view) {
        if (view != null) {
            ProgressBar progressBar = (ProgressBar) view;
            return new C29940n4(progressBar, progressBar);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ProgressBar getRoot() {
        return this.f138755p;
    }
}
