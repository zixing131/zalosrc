package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w7 */
/* loaded from: classes3.dex */
public final class C30100w7 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139791p;

    /* renamed from: q */
    public final AppCompatImageView f139792q;

    /* renamed from: r */
    public final RobotoTextView f139793r;

    private C30100w7(LinearLayout linearLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView) {
        this.f139791p = linearLayout;
        this.f139792q = appCompatImageView;
        this.f139793r = robotoTextView;
    }

    /* renamed from: a */
    public static C30100w7 m148650a(View view) {
        int i11 = AbstractC6918a0.empty_gallery_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            i11 = AbstractC6918a0.empty_gallery_text_view;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C30100w7((LinearLayout) view, appCompatImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30100w7 m148651c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.media_picker_empty_gallery, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148650a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139791p;
    }
}
