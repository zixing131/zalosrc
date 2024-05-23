package q10;

import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zmedia.view.ZVideoView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.k1 */
/* loaded from: classes5.dex */
public final class C25025k1 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f120024p;

    /* renamed from: q */
    public final RecyclingImageView f120025q;

    /* renamed from: r */
    public final ZVideoView f120026r;

    private C25025k1(View view, RecyclingImageView recyclingImageView, ZVideoView zVideoView) {
        this.f120024p = view;
        this.f120025q = recyclingImageView;
        this.f120026r = zVideoView;
    }

    /* renamed from: a */
    public static C25025k1 m129868a(View view) {
        int i11 = AbstractC27409d.rivBackground;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC27409d.zvvVideo;
            ZVideoView zVideoView = (ZVideoView) AbstractC22716b.m117526a(view, i11);
            if (zVideoView != null) {
                return new C25025k1(view, recyclingImageView, zVideoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f120024p;
    }
}
