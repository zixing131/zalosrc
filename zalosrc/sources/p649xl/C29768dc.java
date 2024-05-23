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

/* renamed from: xl.dc */
/* loaded from: classes3.dex */
public final class C29768dc implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137569p;

    /* renamed from: q */
    public final RecyclingImageView f137570q;

    /* renamed from: r */
    public final RobotoTextView f137571r;

    /* renamed from: s */
    public final RobotoTextView f137572s;

    private C29768dc(LinearLayout linearLayout, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137569p = linearLayout;
        this.f137570q = recyclingImageView;
        this.f137571r = robotoTextView;
        this.f137572s = robotoTextView2;
    }

    /* renamed from: a */
    public static C29768dc m147862a(View view) {
        int i11 = AbstractC6918a0.img_info;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.tv_content;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.tv_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C29768dc((LinearLayout) view, recyclingImageView, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29768dc m147863c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_security_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147862a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137569p;
    }
}
