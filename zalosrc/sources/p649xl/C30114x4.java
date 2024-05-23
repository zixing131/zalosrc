package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RecyclerViewWithMaxHeight;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x4 */
/* loaded from: classes3.dex */
public final class C30114x4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139891p;

    /* renamed from: q */
    public final RobotoTextView f139892q;

    /* renamed from: r */
    public final RobotoTextView f139893r;

    /* renamed from: s */
    public final ZAppCompatImageView f139894s;

    /* renamed from: t */
    public final LinearLayout f139895t;

    /* renamed from: u */
    public final RecyclerViewWithMaxHeight f139896u;

    /* renamed from: v */
    public final RobotoTextView f139897v;

    /* renamed from: w */
    public final RobotoTextView f139898w;

    private C30114x4(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout2, RecyclerViewWithMaxHeight recyclerViewWithMaxHeight, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f139891p = linearLayout;
        this.f139892q = robotoTextView;
        this.f139893r = robotoTextView2;
        this.f139894s = zAppCompatImageView;
        this.f139895t = linearLayout2;
        this.f139896u = recyclerViewWithMaxHeight;
        this.f139897v = robotoTextView3;
        this.f139898w = robotoTextView4;
    }

    /* renamed from: a */
    public static C30114x4 m148681a(View view) {
        int i11 = AbstractC6918a0.btn_continue;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_ignore;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.icon;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.layout_content;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.list_account;
                        RecyclerViewWithMaxHeight recyclerViewWithMaxHeight = (RecyclerViewWithMaxHeight) AbstractC22716b.m117526a(view, i11);
                        if (recyclerViewWithMaxHeight != null) {
                            i11 = AbstractC6918a0.tv_description;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.tv_title;
                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView4 != null) {
                                    return new C30114x4((LinearLayout) view, robotoTextView, robotoTextView2, zAppCompatImageView, linearLayout, recyclerViewWithMaxHeight, robotoTextView3, robotoTextView4);
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
    public static C30114x4 m148682c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_choose_account, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148681a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139891p;
    }
}
