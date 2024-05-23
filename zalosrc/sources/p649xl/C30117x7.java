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

/* renamed from: xl.x7 */
/* loaded from: classes3.dex */
public final class C30117x7 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139906p;

    /* renamed from: q */
    public final AppCompatImageView f139907q;

    /* renamed from: r */
    public final LinearLayout f139908r;

    /* renamed from: s */
    public final RobotoTextView f139909s;

    private C30117x7(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.f139906p = linearLayout;
        this.f139907q = appCompatImageView;
        this.f139908r = linearLayout2;
        this.f139909s = robotoTextView;
    }

    /* renamed from: a */
    public static C30117x7 m148689a(View view) {
        int i11 = AbstractC6918a0.camera_empty_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = AbstractC6918a0.camera_empty_text_view;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i12);
            if (robotoTextView != null) {
                return new C30117x7(linearLayout, appCompatImageView, linearLayout, robotoTextView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30117x7 m148690c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.media_picker_empty_gallery_with_camera_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148689a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139906p;
    }
}
