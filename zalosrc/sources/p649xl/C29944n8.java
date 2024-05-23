package p649xl;

import android.view.View;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.rounedlayout.RelativeRoundedLayout;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n8 */
/* loaded from: classes3.dex */
public final class C29944n8 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrackingRelativeLayout f138777p;

    /* renamed from: q */
    public final View f138778q;

    /* renamed from: r */
    public final RelativeRoundedLayout f138779r;

    /* renamed from: s */
    public final DragToCloseLayout f138780s;

    /* renamed from: t */
    public final MiniAppZinstantLayout f138781t;

    private C29944n8(TrackingRelativeLayout trackingRelativeLayout, View view, RelativeRoundedLayout relativeRoundedLayout, DragToCloseLayout dragToCloseLayout, MiniAppZinstantLayout miniAppZinstantLayout) {
        this.f138777p = trackingRelativeLayout;
        this.f138778q = view;
        this.f138779r = relativeRoundedLayout;
        this.f138780s = dragToCloseLayout;
        this.f138781t = miniAppZinstantLayout;
    }

    /* renamed from: a */
    public static C29944n8 m148281a(View view) {
        int i11 = AbstractC6918a0.backgroundView;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC6918a0.contentView;
            RelativeRoundedLayout relativeRoundedLayout = (RelativeRoundedLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeRoundedLayout != null) {
                i11 = AbstractC6918a0.drag_to_close_qr_layout;
                DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) AbstractC22716b.m117526a(view, i11);
                if (dragToCloseLayout != null) {
                    i11 = AbstractC6918a0.zinstantView;
                    MiniAppZinstantLayout miniAppZinstantLayout = (MiniAppZinstantLayout) AbstractC22716b.m117526a(view, i11);
                    if (miniAppZinstantLayout != null) {
                        return new C29944n8((TrackingRelativeLayout) view, m117526a, relativeRoundedLayout, dragToCloseLayout, miniAppZinstantLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public TrackingRelativeLayout getRoot() {
        return this.f138777p;
    }
}
