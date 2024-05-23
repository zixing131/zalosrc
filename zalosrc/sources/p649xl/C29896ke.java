package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ke */
/* loaded from: classes3.dex */
public final class C29896ke implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138505p;

    /* renamed from: q */
    public final AppCompatImageView f138506q;

    private C29896ke(LinearLayout linearLayout, AppCompatImageView appCompatImageView) {
        this.f138505p = linearLayout;
        this.f138506q = appCompatImageView;
    }

    /* renamed from: a */
    public static C29896ke m148176a(View view) {
        int i11 = AbstractC6918a0.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            return new C29896ke((LinearLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138505p;
    }
}
