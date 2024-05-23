package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.WelcomeCommentLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.z0 */
/* loaded from: classes5.dex */
public final class C25072z0 implements InterfaceC22715a {

    /* renamed from: p */
    private final WelcomeCommentLayout f120438p;

    /* renamed from: q */
    public final RecyclingImageView f120439q;

    /* renamed from: r */
    public final SimpleShadowTextView f120440r;

    private C25072z0(WelcomeCommentLayout welcomeCommentLayout, RecyclingImageView recyclingImageView, SimpleShadowTextView simpleShadowTextView) {
        this.f120438p = welcomeCommentLayout;
        this.f120439q = recyclingImageView;
        this.f120440r = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25072z0 m129983a(View view) {
        int i11 = AbstractC27409d.ivIcon;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC27409d.txtContent;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                return new C25072z0((WelcomeCommentLayout) view, recyclingImageView, simpleShadowTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25072z0 m129984c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_welcome_livestream, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129983a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WelcomeCommentLayout getRoot() {
        return this.f120438p;
    }
}
