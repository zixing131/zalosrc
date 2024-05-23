package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.d1 */
/* loaded from: classes5.dex */
public final class C24997d1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119844p;

    /* renamed from: q */
    public final RobotoEditText f119845q;

    /* renamed from: r */
    public final C25017i1 f119846r;

    /* renamed from: s */
    public final ImageView f119847s;

    /* renamed from: t */
    public final ImageView f119848t;

    /* renamed from: u */
    public final LinearLayout f119849u;

    /* renamed from: v */
    public final FrameLayout f119850v;

    /* renamed from: w */
    public final RobotoTextView f119851w;

    /* renamed from: x */
    public final RobotoTextView f119852x;

    /* renamed from: y */
    public final RobotoTextView f119853y;

    /* renamed from: z */
    public final RobotoTextView f119854z;

    private C24997d1(FrameLayout frameLayout, RobotoEditText robotoEditText, C25017i1 c25017i1, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, FrameLayout frameLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f119844p = frameLayout;
        this.f119845q = robotoEditText;
        this.f119846r = c25017i1;
        this.f119847s = imageView;
        this.f119848t = imageView2;
        this.f119849u = linearLayout;
        this.f119850v = frameLayout2;
        this.f119851w = robotoTextView;
        this.f119852x = robotoTextView2;
        this.f119853y = robotoTextView3;
        this.f119854z = robotoTextView4;
    }

    /* renamed from: a */
    public static C24997d1 m129787a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.edt;
        RobotoEditText robotoEditText = (RobotoEditText) AbstractC22716b.m117526a(view, i11);
        if (robotoEditText != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.header))) != null) {
            C25017i1 m129848a = C25017i1.m129848a(m117526a);
            i11 = AbstractC27409d.ivClearText;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.ivPolicy;
                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView2 != null) {
                    i11 = AbstractC27409d.lytContainer;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        i11 = AbstractC27409d.tvID;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC27409d.tvIdInvalid;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                i11 = AbstractC27409d.tvInfo;
                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView3 != null) {
                                    i11 = AbstractC27409d.tvInputCount;
                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView4 != null) {
                                        return new C24997d1(frameLayout, robotoEditText, m129848a, imageView, imageView2, linearLayout, frameLayout, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24997d1 m129788c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_edit_channel_name, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129787a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119844p;
    }
}
