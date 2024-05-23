package q10;

import android.view.View;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.UploadVideoItem;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.y0 */
/* loaded from: classes5.dex */
public final class C25069y0 implements InterfaceC22715a {

    /* renamed from: p */
    private final UploadVideoItem f120427p;

    /* renamed from: q */
    public final ImageView f120428q;

    /* renamed from: r */
    public final RecyclingImageView f120429r;

    /* renamed from: s */
    public final SimpleShadowTextView f120430s;

    /* renamed from: t */
    public final View f120431t;

    private C25069y0(UploadVideoItem uploadVideoItem, ImageView imageView, RecyclingImageView recyclingImageView, SimpleShadowTextView simpleShadowTextView, View view) {
        this.f120427p = uploadVideoItem;
        this.f120428q = imageView;
        this.f120429r = recyclingImageView;
        this.f120430s = simpleShadowTextView;
        this.f120431t = view;
    }

    /* renamed from: a */
    public static C25069y0 m129978a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.icoStatus;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.rivThumbnail;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC27409d.txtStatus;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieOverlay))) != null) {
                    return new C25069y0((UploadVideoItem) view, imageView, recyclingImageView, simpleShadowTextView, m117526a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public UploadVideoItem getRoot() {
        return this.f120427p;
    }
}
