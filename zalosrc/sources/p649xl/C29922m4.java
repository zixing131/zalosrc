package p649xl;

import android.view.View;
import android.widget.ProgressBar;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m4 */
/* loaded from: classes3.dex */
public final class C29922m4 implements InterfaceC22715a {

    /* renamed from: p */
    private final ProgressBar f138653p;

    /* renamed from: q */
    public final ProgressBar f138654q;

    private C29922m4(ProgressBar progressBar, ProgressBar progressBar2) {
        this.f138653p = progressBar;
        this.f138654q = progressBar2;
    }

    /* renamed from: a */
    public static C29922m4 m148235a(View view) {
        if (view != null) {
            ProgressBar progressBar = (ProgressBar) view;
            return new C29922m4(progressBar, progressBar);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ProgressBar getRoot() {
        return this.f138653p;
    }
}
