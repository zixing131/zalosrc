package q10;

import android.view.View;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.DiscoverStreamItem;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.o */
/* loaded from: classes5.dex */
public final class C25038o implements InterfaceC22715a {

    /* renamed from: p */
    private final DiscoverStreamItem f120136p;

    /* renamed from: q */
    public final RoundedImageView f120137q;

    /* renamed from: r */
    public final SimpleShadowTextView f120138r;

    /* renamed from: s */
    public final SimpleShadowTextView f120139s;

    /* renamed from: t */
    public final SimpleShadowTextView f120140t;

    /* renamed from: u */
    public final SimpleShadowTextView f120141u;

    private C25038o(DiscoverStreamItem discoverStreamItem, RoundedImageView roundedImageView, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4) {
        this.f120136p = discoverStreamItem;
        this.f120137q = roundedImageView;
        this.f120138r = simpleShadowTextView;
        this.f120139s = simpleShadowTextView2;
        this.f120140t = simpleShadowTextView3;
        this.f120141u = simpleShadowTextView4;
    }

    /* renamed from: a */
    public static C25038o m129904a(View view) {
        int i11 = AbstractC27409d.ivCover;
        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
        if (roundedImageView != null) {
            i11 = AbstractC27409d.tvChannelName;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                i11 = AbstractC27409d.tvLive;
                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView2 != null) {
                    i11 = AbstractC27409d.tvTitle;
                    SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView3 != null) {
                        i11 = AbstractC27409d.tvViewer;
                        SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView4 != null) {
                            return new C25038o((DiscoverStreamItem) view, roundedImageView, simpleShadowTextView, simpleShadowTextView2, simpleShadowTextView3, simpleShadowTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public DiscoverStreamItem getRoot() {
        return this.f120136p;
    }
}
