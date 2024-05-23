package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.cd */
/* loaded from: classes3.dex */
public final class C29751cd implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137443p;

    /* renamed from: q */
    public final RecyclingImageView f137444q;

    /* renamed from: r */
    public final RobotoTextView f137445r;

    private C29751cd(LinearLayout linearLayout, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView) {
        this.f137443p = linearLayout;
        this.f137444q = recyclingImageView;
        this.f137445r = robotoTextView;
    }

    /* renamed from: a */
    public static C29751cd m147821a(View view) {
        int i11 = AbstractC6918a0.img_quick_action;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.tv_quick_action;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C29751cd((LinearLayout) view, recyclingImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137443p;
    }
}
