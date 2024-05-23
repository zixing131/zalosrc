package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.u1 */
/* loaded from: classes5.dex */
public final class C25058u1 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f120340p;

    /* renamed from: q */
    public final ViewStub f120341q;

    /* renamed from: r */
    public final C25017i1 f120342r;

    /* renamed from: s */
    public final RelativeLayout f120343s;

    private C25058u1(RelativeLayout relativeLayout, ViewStub viewStub, C25017i1 c25017i1, RelativeLayout relativeLayout2) {
        this.f120340p = relativeLayout;
        this.f120341q = viewStub;
        this.f120342r = c25017i1;
        this.f120343s = relativeLayout2;
    }

    /* renamed from: a */
    public static C25058u1 m129947a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.childStub;
        ViewStub viewStub = (ViewStub) AbstractC22716b.m117526a(view, i11);
        if (viewStub != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.header))) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new C25058u1(relativeLayout, viewStub, C25017i1.m129848a(m117526a), relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25058u1 m129948c(LayoutInflater layoutInflater) {
        return m129949d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25058u1 m129949d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_simple, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129947a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f120340p;
    }
}
