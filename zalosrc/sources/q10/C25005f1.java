package q10;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.f1 */
/* loaded from: classes5.dex */
public final class C25005f1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119898p;

    /* renamed from: q */
    public final RobotoEditText f119899q;

    /* renamed from: r */
    public final SimpleShadowTextView f119900r;

    private C25005f1(LinearLayout linearLayout, RobotoEditText robotoEditText, SimpleShadowTextView simpleShadowTextView) {
        this.f119898p = linearLayout;
        this.f119899q = robotoEditText;
        this.f119900r = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25005f1 m129810a(View view) {
        int i11 = AbstractC27409d.edt;
        RobotoEditText robotoEditText = (RobotoEditText) AbstractC22716b.m117526a(view, i11);
        if (robotoEditText != null) {
            i11 = AbstractC27409d.tvUserName;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                return new C25005f1((LinearLayout) view, robotoEditText, simpleShadowTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119898p;
    }
}
