package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Divider;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.fb */
/* loaded from: classes3.dex */
public final class C29803fb implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137760p;

    /* renamed from: q */
    public final Divider f137761q;

    /* renamed from: r */
    public final ImageView f137762r;

    /* renamed from: s */
    public final RecyclerView f137763s;

    /* renamed from: t */
    public final RobotoTextView f137764t;

    private C29803fb(RelativeLayout relativeLayout, Divider divider, ImageView imageView, RecyclerView recyclerView, RobotoTextView robotoTextView) {
        this.f137760p = relativeLayout;
        this.f137761q = divider;
        this.f137762r = imageView;
        this.f137763s = recyclerView;
        this.f137764t = robotoTextView;
    }

    /* renamed from: a */
    public static C29803fb m147951a(View view) {
        int i11 = AbstractC6918a0.divider;
        Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
        if (divider != null) {
            i11 = AbstractC6918a0.imv_close;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC6918a0.rvLayout;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null) {
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C29803fb((RelativeLayout) view, divider, imageView, recyclerView, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29803fb m147952c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.select_multi_photo_layout_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147951a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137760p;
    }
}
