package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w4 */
/* loaded from: classes3.dex */
public final class C30097w4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139779p;

    /* renamed from: q */
    public final LinearLayout f139780q;

    /* renamed from: r */
    public final RecyclingImageView f139781r;

    /* renamed from: s */
    public final RobotoTextView f139782s;

    private C30097w4(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView) {
        this.f139779p = linearLayout;
        this.f139780q = linearLayout2;
        this.f139781r = recyclingImageView;
        this.f139782s = robotoTextView;
    }

    /* renamed from: a */
    public static C30097w4 m148643a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = AbstractC6918a0.icon;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.title;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C30097w4(linearLayout, linearLayout, recyclingImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30097w4 m148644c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_call_ringtone_category_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148643a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139779p;
    }
}
