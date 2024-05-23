package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m9 */
/* loaded from: classes3.dex */
public final class C29927m9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138672p;

    /* renamed from: q */
    public final ZAppCompatImageView f138673q;

    /* renamed from: r */
    public final LinearLayout f138674r;

    /* renamed from: s */
    public final RelativeLayout f138675s;

    /* renamed from: t */
    public final RecyclerView f138676t;

    /* renamed from: u */
    public final RobotoTextView f138677u;

    private C29927m9(RelativeLayout relativeLayout, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, RobotoTextView robotoTextView) {
        this.f138672p = relativeLayout;
        this.f138673q = zAppCompatImageView;
        this.f138674r = linearLayout;
        this.f138675s = relativeLayout2;
        this.f138676t = recyclerView;
        this.f138677u = robotoTextView;
    }

    /* renamed from: a */
    public static C29927m9 m148247a(View view) {
        int i11 = AbstractC6918a0.btn_close;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.layout_header;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i11 = AbstractC6918a0.rv_catalog_list;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null) {
                    i11 = AbstractC6918a0.tv_title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C29927m9(relativeLayout, zAppCompatImageView, linearLayout, relativeLayout, recyclerView, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29927m9 m148248c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_catalog_picker_bottom_sheet_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148247a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138672p;
    }
}
