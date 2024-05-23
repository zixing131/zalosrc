package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitContentTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.v */
/* loaded from: classes5.dex */
public final class C25059v implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120344p;

    /* renamed from: q */
    public final RecyclingImageView f120345q;

    /* renamed from: r */
    public final FitContentTextView f120346r;

    private C25059v(LinearLayout linearLayout, RecyclingImageView recyclingImageView, FitContentTextView fitContentTextView) {
        this.f120344p = linearLayout;
        this.f120345q = recyclingImageView;
        this.f120346r = fitContentTextView;
    }

    /* renamed from: a */
    public static C25059v m129951a(View view) {
        int i11 = AbstractC27409d.ivIcon;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC27409d.txtContent;
            FitContentTextView fitContentTextView = (FitContentTextView) AbstractC22716b.m117526a(view, i11);
            if (fitContentTextView != null) {
                return new C25059v((LinearLayout) view, recyclingImageView, fitContentTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25059v m129952c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_interact_livestream, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129951a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120344p;
    }
}
