package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.u */
/* loaded from: classes5.dex */
public final class C25056u implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120314p;

    /* renamed from: q */
    public final SimpleShadowTextView f120315q;

    /* renamed from: r */
    public final ImageView f120316r;

    /* renamed from: s */
    public final SimpleShadowTextView f120317s;

    /* renamed from: t */
    public final SimpleShadowTextView f120318t;

    /* renamed from: u */
    public final SimpleShadowTextView f120319u;

    private C25056u(LinearLayout linearLayout, SimpleShadowTextView simpleShadowTextView, ImageView imageView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4) {
        this.f120314p = linearLayout;
        this.f120315q = simpleShadowTextView;
        this.f120316r = imageView;
        this.f120317s = simpleShadowTextView2;
        this.f120318t = simpleShadowTextView3;
        this.f120319u = simpleShadowTextView4;
    }

    /* renamed from: a */
    public static C25056u m129942a(View view) {
        int i11 = AbstractC27409d.errAction;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.errIcon;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.errMessage;
                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView2 != null) {
                    i11 = AbstractC27409d.errMessageFooter;
                    SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView3 != null) {
                        i11 = AbstractC27409d.errTitle;
                        SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView4 != null) {
                            return new C25056u((LinearLayout) view, simpleShadowTextView, imageView, simpleShadowTextView2, simpleShadowTextView3, simpleShadowTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25056u m129943c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_inform_comment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129942a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120314p;
    }
}
