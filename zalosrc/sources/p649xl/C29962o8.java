package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.rounedlayout.RelativeRoundedLayout;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.o8 */
/* loaded from: classes3.dex */
public final class C29962o8 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrackingRelativeLayout f138877p;

    /* renamed from: q */
    public final View f138878q;

    /* renamed from: r */
    public final RelativeRoundedLayout f138879r;

    /* renamed from: s */
    public final DragToCloseLayout f138880s;

    /* renamed from: t */
    public final MiniAppZinstantLayout f138881t;

    private C29962o8(TrackingRelativeLayout trackingRelativeLayout, View view, RelativeRoundedLayout relativeRoundedLayout, DragToCloseLayout dragToCloseLayout, MiniAppZinstantLayout miniAppZinstantLayout) {
        this.f138877p = trackingRelativeLayout;
        this.f138878q = view;
        this.f138879r = relativeRoundedLayout;
        this.f138880s = dragToCloseLayout;
        this.f138881t = miniAppZinstantLayout;
    }

    /* renamed from: a */
    public static C29962o8 m148322a(View view) {
        int i11 = AbstractC6918a0.backgroundView;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC6918a0.contentView;
            RelativeRoundedLayout relativeRoundedLayout = (RelativeRoundedLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeRoundedLayout != null) {
                i11 = AbstractC6918a0.drag_to_close_layout;
                DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) AbstractC22716b.m117526a(view, i11);
                if (dragToCloseLayout != null) {
                    i11 = AbstractC6918a0.zinstantView;
                    MiniAppZinstantLayout miniAppZinstantLayout = (MiniAppZinstantLayout) AbstractC22716b.m117526a(view, i11);
                    if (miniAppZinstantLayout != null) {
                        return new C29962o8((TrackingRelativeLayout) view, m117526a, relativeRoundedLayout, dragToCloseLayout, miniAppZinstantLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29962o8 m148323c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.mp_zinstant_dynamic_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148322a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TrackingRelativeLayout getRoot() {
        return this.f138877p;
    }
}
