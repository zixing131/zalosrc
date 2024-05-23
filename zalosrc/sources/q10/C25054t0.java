package q10;

import android.view.View;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelVideoItem;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.t0 */
/* loaded from: classes5.dex */
public final class C25054t0 implements InterfaceC22715a {

    /* renamed from: p */
    private final ChannelVideoItem f120292p;

    /* renamed from: q */
    public final ImageView f120293q;

    /* renamed from: r */
    public final ImageView f120294r;

    /* renamed from: s */
    public final ImageView f120295s;

    /* renamed from: t */
    public final RecyclingImageView f120296t;

    /* renamed from: u */
    public final SimpleShadowTextView f120297u;

    /* renamed from: v */
    public final View f120298v;

    /* renamed from: w */
    public final SimpleShadowTextView f120299w;

    private C25054t0(ChannelVideoItem channelVideoItem, ImageView imageView, ImageView imageView2, ImageView imageView3, RecyclingImageView recyclingImageView, SimpleShadowTextView simpleShadowTextView, View view, SimpleShadowTextView simpleShadowTextView2) {
        this.f120292p = channelVideoItem;
        this.f120293q = imageView;
        this.f120294r = imageView2;
        this.f120295s = imageView3;
        this.f120296t = recyclingImageView;
        this.f120297u = simpleShadowTextView;
        this.f120298v = view;
        this.f120299w = simpleShadowTextView2;
    }

    /* renamed from: a */
    public static C25054t0 m129938a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.icoPin;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.icoPrivacy;
            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView2 != null) {
                i11 = AbstractC27409d.icoStatus;
                ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView3 != null) {
                    i11 = AbstractC27409d.rivThumbnail;
                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                    if (recyclingImageView != null) {
                        i11 = AbstractC27409d.txtViewer;
                        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieOverlay))) != null) {
                            i11 = AbstractC27409d.vieStatus;
                            SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                            if (simpleShadowTextView2 != null) {
                                return new C25054t0((ChannelVideoItem) view, imageView, imageView2, imageView3, recyclingImageView, simpleShadowTextView, m117526a, simpleShadowTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public ChannelVideoItem getRoot() {
        return this.f120292p;
    }
}
