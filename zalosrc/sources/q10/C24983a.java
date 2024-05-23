package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.shortvideo.p072ui.component.bts.BottomSheetLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.a */
/* loaded from: classes5.dex */
public final class C24983a implements InterfaceC22715a {

    /* renamed from: p */
    private final BottomSheetLayout f119704p;

    /* renamed from: q */
    public final PulseImageView f119705q;

    /* renamed from: r */
    public final BottomSheetLayout f119706r;

    /* renamed from: s */
    public final FrameLayout f119707s;

    /* renamed from: t */
    public final View f119708t;

    /* renamed from: u */
    public final AppCompatImageView f119709u;

    private C24983a(BottomSheetLayout bottomSheetLayout, PulseImageView pulseImageView, BottomSheetLayout bottomSheetLayout2, FrameLayout frameLayout, View view, AppCompatImageView appCompatImageView) {
        this.f119704p = bottomSheetLayout;
        this.f119705q = pulseImageView;
        this.f119706r = bottomSheetLayout2;
        this.f119707s = frameLayout;
        this.f119708t = view;
        this.f119709u = appCompatImageView;
    }

    /* renamed from: a */
    public static C24983a m129747a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.btnClose;
        PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
        if (pulseImageView != null) {
            BottomSheetLayout bottomSheetLayout = (BottomSheetLayout) view;
            i11 = AbstractC27409d.lytContainer;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.touchOutside))) != null) {
                i11 = AbstractC27409d.vieThumb;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (appCompatImageView != null) {
                    return new C24983a(bottomSheetLayout, pulseImageView, bottomSheetLayout, frameLayout, m117526a, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24983a m129748c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_base, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129747a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BottomSheetLayout getRoot() {
        return this.f119704p;
    }
}
