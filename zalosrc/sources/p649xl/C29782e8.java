package p649xl;

import android.view.View;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.rounedlayout.LinearRoundedLayout;
import com.zing.zalo.p077ui.widget.mini.program.MPContainerView;
import com.zing.zalo.p077ui.zviews.MiniAppQRView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zdesign.component.TrackingFrameLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e8 */
/* loaded from: classes3.dex */
public final class C29782e8 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrackingFrameLayout f137666p;

    /* renamed from: q */
    public final View f137667q;

    /* renamed from: r */
    public final DragToCloseLayout f137668r;

    /* renamed from: s */
    public final LinearRoundedLayout f137669s;

    /* renamed from: t */
    public final MiniAppQRView f137670t;

    /* renamed from: u */
    public final MPContainerView f137671u;

    private C29782e8(TrackingFrameLayout trackingFrameLayout, View view, DragToCloseLayout dragToCloseLayout, LinearRoundedLayout linearRoundedLayout, MiniAppQRView miniAppQRView, MPContainerView mPContainerView) {
        this.f137666p = trackingFrameLayout;
        this.f137667q = view;
        this.f137668r = dragToCloseLayout;
        this.f137669s = linearRoundedLayout;
        this.f137670t = miniAppQRView;
        this.f137671u = mPContainerView;
    }

    /* renamed from: a */
    public static C29782e8 m147898a(View view) {
        int i11 = AbstractC6918a0.backgroundView;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC6918a0.drag_to_close_qr_layout;
            DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) AbstractC22716b.m117526a(view, i11);
            if (dragToCloseLayout != null) {
                i11 = AbstractC6918a0.ma_content;
                LinearRoundedLayout linearRoundedLayout = (LinearRoundedLayout) AbstractC22716b.m117526a(view, i11);
                if (linearRoundedLayout != null) {
                    i11 = AbstractC6918a0.ma_qr_view;
                    MiniAppQRView miniAppQRView = (MiniAppQRView) AbstractC22716b.m117526a(view, i11);
                    if (miniAppQRView != null) {
                        i11 = AbstractC6918a0.viewGroup;
                        MPContainerView mPContainerView = (MPContainerView) AbstractC22716b.m117526a(view, i11);
                        if (mPContainerView != null) {
                            return new C29782e8((TrackingFrameLayout) view, m117526a, dragToCloseLayout, linearRoundedLayout, miniAppQRView, mPContainerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TrackingFrameLayout getRoot() {
        return this.f137666p;
    }
}
