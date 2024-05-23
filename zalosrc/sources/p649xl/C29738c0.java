package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c0 */
/* loaded from: classes3.dex */
public final class C29738c0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137376p;

    /* renamed from: q */
    public final RoundedImageView f137377q;

    private C29738c0(FrameLayout frameLayout, RoundedImageView roundedImageView) {
        this.f137376p = frameLayout;
        this.f137377q = roundedImageView;
    }

    /* renamed from: a */
    public static C29738c0 m147791a(View view) {
        int i11 = AbstractC6918a0.banner_item_element;
        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
        if (roundedImageView != null) {
            return new C29738c0((FrameLayout) view, roundedImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29738c0 m147792c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.banner_grid_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147791a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137376p;
    }
}
