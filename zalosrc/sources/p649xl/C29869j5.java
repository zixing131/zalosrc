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

/* renamed from: xl.j5 */
/* loaded from: classes3.dex */
public final class C29869j5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138266p;

    /* renamed from: q */
    public final AppCompatImageView f138267q;

    /* renamed from: r */
    public final RobotoTextView f138268r;

    private C29869j5(LinearLayout linearLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView) {
        this.f138266p = linearLayout;
        this.f138267q = appCompatImageView;
        this.f138268r = robotoTextView;
    }

    /* renamed from: a */
    public static C29869j5 m148111a(View view) {
        int i11 = AbstractC6918a0.btn_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            i11 = AbstractC6918a0.tv_title;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C29869j5((LinearLayout) view, appCompatImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29869j5 m148112c(LayoutInflater layoutInflater) {
        return m148113d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29869j5 m148113d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_header_carousel_my_cloud_collection, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148111a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138266p;
    }
}
