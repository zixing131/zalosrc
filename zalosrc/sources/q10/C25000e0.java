package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.e0 */
/* loaded from: classes5.dex */
public final class C25000e0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119865p;

    /* renamed from: q */
    public final PulseImageView f119866q;

    /* renamed from: r */
    public final ImageView f119867r;

    /* renamed from: s */
    public final EllipsizedTextView f119868s;

    private C25000e0(LinearLayout linearLayout, PulseImageView pulseImageView, ImageView imageView, EllipsizedTextView ellipsizedTextView) {
        this.f119865p = linearLayout;
        this.f119866q = pulseImageView;
        this.f119867r = imageView;
        this.f119868s = ellipsizedTextView;
    }

    /* renamed from: a */
    public static C25000e0 m129796a(View view) {
        int i11 = AbstractC27409d.btnRemove;
        PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
        if (pulseImageView != null) {
            i11 = AbstractC27409d.icoClock;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.txtHistory;
                EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                if (ellipsizedTextView != null) {
                    return new C25000e0((LinearLayout) view, pulseImageView, imageView, ellipsizedTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25000e0 m129797c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_history, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129796a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119865p;
    }
}
