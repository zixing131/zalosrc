package q10;

import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zmedia.view.ZVideoView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.y1 */
/* loaded from: classes5.dex */
public final class C25070y1 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f120432p;

    /* renamed from: q */
    public final View f120433q;

    /* renamed from: r */
    public final RecyclingImageView f120434r;

    /* renamed from: s */
    public final ZVideoView f120435s;

    private C25070y1(View view, View view2, RecyclingImageView recyclingImageView, ZVideoView zVideoView) {
        this.f120432p = view;
        this.f120433q = view2;
        this.f120434r = recyclingImageView;
        this.f120435s = zVideoView;
    }

    /* renamed from: a */
    public static C25070y1 m129980a(View view) {
        int i11 = AbstractC27409d.bgdVideo;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC27409d.rivThumbnail;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC27409d.zvvVideo;
                ZVideoView zVideoView = (ZVideoView) AbstractC22716b.m117526a(view, i11);
                if (zVideoView != null) {
                    return new C25070y1(view, m117526a, recyclingImageView, zVideoView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f120432p;
    }
}
