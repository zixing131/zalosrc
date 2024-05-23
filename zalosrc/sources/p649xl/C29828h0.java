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

/* renamed from: xl.h0 */
/* loaded from: classes3.dex */
public final class C29828h0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137933p;

    /* renamed from: q */
    public final AppCompatImageView f137934q;

    /* renamed from: r */
    public final LinearLayout f137935r;

    /* renamed from: s */
    public final LinearLayout f137936s;

    /* renamed from: t */
    public final LinearLayout f137937t;

    private C29828h0(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f137933p = linearLayout;
        this.f137934q = appCompatImageView;
        this.f137935r = linearLayout2;
        this.f137936s = linearLayout3;
        this.f137937t = linearLayout4;
    }

    /* renamed from: a */
    public static C29828h0 m148012a(View view) {
        int i11 = AbstractC6918a0.icn_slide_hint;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            i11 = AbstractC6918a0.menu_item_delete_collection;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.menu_item_edit_collection;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout2 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) view;
                    return new C29828h0(linearLayout3, appCompatImageView, linearLayout, linearLayout2, linearLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29828h0 m148013c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_menu_collection_detail, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148012a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137933p;
    }
}
