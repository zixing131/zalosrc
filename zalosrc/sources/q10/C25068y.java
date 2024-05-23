package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.y */
/* loaded from: classes5.dex */
public final class C25068y implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120424p;

    /* renamed from: q */
    public final EllipsizedTextView f120425q;

    /* renamed from: r */
    public final EllipsizedTextView f120426r;

    private C25068y(LinearLayout linearLayout, EllipsizedTextView ellipsizedTextView, EllipsizedTextView ellipsizedTextView2) {
        this.f120424p = linearLayout;
        this.f120425q = ellipsizedTextView;
        this.f120426r = ellipsizedTextView2;
    }

    /* renamed from: a */
    public static C25068y m129975a(View view) {
        int i11 = AbstractC27409d.tvDesc;
        EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
        if (ellipsizedTextView != null) {
            i11 = AbstractC27409d.tvTitle;
            EllipsizedTextView ellipsizedTextView2 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
            if (ellipsizedTextView2 != null) {
                return new C25068y((LinearLayout) view, ellipsizedTextView, ellipsizedTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25068y m129976c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_location_header, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129975a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120424p;
    }
}
