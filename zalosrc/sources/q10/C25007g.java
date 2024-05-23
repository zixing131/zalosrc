package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p338m2.InterfaceC22715a;
import v00.AbstractC27410e;

/* renamed from: q10.g */
/* loaded from: classes5.dex */
public final class C25007g implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119911p;

    private C25007g(LinearLayout linearLayout) {
        this.f119911p = linearLayout;
    }

    /* renamed from: a */
    public static C25007g m129815a(View view) {
        if (view != null) {
            return new C25007g((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C25007g m129816c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_video_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129815a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119911p;
    }
}
