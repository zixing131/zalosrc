package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i0 */
/* loaded from: classes3.dex */
public final class C29846i0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138099p;

    /* renamed from: q */
    public final AppCompatImageView f138100q;

    /* renamed from: r */
    public final LinearLayout f138101r;

    private C29846i0(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2) {
        this.f138099p = linearLayout;
        this.f138100q = appCompatImageView;
        this.f138101r = linearLayout2;
    }

    /* renamed from: a */
    public static C29846i0 m148053a(View view) {
        int i11 = AbstractC6918a0.btn_create_collection;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C29846i0(linearLayout, appCompatImageView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29846i0 m148054c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_menu_select_collection_to_add_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148053a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138099p;
    }
}
