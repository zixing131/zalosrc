package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.q0 */
/* loaded from: classes5.dex */
public final class C25045q0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120190p;

    /* renamed from: q */
    public final RecyclingImageView f120191q;

    /* renamed from: r */
    public final RobotoTextView f120192r;

    private C25045q0(FrameLayout frameLayout, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView) {
        this.f120190p = frameLayout;
        this.f120191q = recyclingImageView;
        this.f120192r = robotoTextView;
    }

    /* renamed from: a */
    public static C25045q0 m129919a(View view) {
        int i11 = AbstractC27409d.ivIconStart;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC27409d.rowScroll;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C25045q0((FrameLayout) view, recyclingImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25045q0 m129920c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_text_bts, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129919a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120190p;
    }
}
