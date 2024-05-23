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
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n9 */
/* loaded from: classes3.dex */
public final class C29945n9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138782p;

    /* renamed from: q */
    public final RelativeLayout f138783q;

    /* renamed from: r */
    public final ZAppCompatImageView f138784r;

    /* renamed from: s */
    public final Button f138785s;

    /* renamed from: t */
    public final LinearLayout f138786t;

    /* renamed from: u */
    public final RelativeLayout f138787u;

    /* renamed from: v */
    public final RecyclerView f138788v;

    /* renamed from: w */
    public final RecyclerView f138789w;

    /* renamed from: x */
    public final RobotoTextView f138790x;

    private C29945n9(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ZAppCompatImageView zAppCompatImageView, Button button, LinearLayout linearLayout, RelativeLayout relativeLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, RobotoTextView robotoTextView) {
        this.f138782p = relativeLayout;
        this.f138783q = relativeLayout2;
        this.f138784r = zAppCompatImageView;
        this.f138785s = button;
        this.f138786t = linearLayout;
        this.f138787u = relativeLayout3;
        this.f138788v = recyclerView;
        this.f138789w = recyclerView2;
        this.f138790x = robotoTextView;
    }

    /* renamed from: a */
    public static C29945n9 m148283a(View view) {
        int i11 = AbstractC6918a0.bottom_view_container;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.btn_close;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.btn_send;
                Button button = (Button) AbstractC22716b.m117526a(view, i11);
                if (button != null) {
                    i11 = AbstractC6918a0.layout_header;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) view;
                        i11 = AbstractC6918a0.rv_catalog_list;
                        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                        if (recyclerView != null) {
                            i11 = AbstractC6918a0.rv_product_list;
                            RecyclerView recyclerView2 = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                            if (recyclerView2 != null) {
                                i11 = AbstractC6918a0.tv_title;
                                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView != null) {
                                    return new C29945n9(relativeLayout2, relativeLayout, zAppCompatImageView, button, linearLayout, relativeLayout2, recyclerView, recyclerView2, robotoTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29945n9 m148284c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_product_catalog_bottom_sheet_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148283a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138782p;
    }
}
