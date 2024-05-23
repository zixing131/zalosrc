package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.f6 */
/* loaded from: classes3.dex */
public final class C29798f6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137742p;

    /* renamed from: q */
    public final AppCompatImageView f137743q;

    /* renamed from: r */
    public final RelativeLayout f137744r;

    /* renamed from: s */
    public final RobotoTextView f137745s;

    /* renamed from: t */
    public final RobotoTextView f137746t;

    private C29798f6(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137742p = relativeLayout;
        this.f137743q = appCompatImageView;
        this.f137744r = relativeLayout2;
        this.f137745s = robotoTextView;
        this.f137746t = robotoTextView2;
    }

    /* renamed from: a */
    public static C29798f6 m147940a(View view) {
        int i11 = AbstractC6918a0.btn_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i11 = AbstractC6918a0.desc_num;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C29798f6(relativeLayout, appCompatImageView, relativeLayout, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29798f6 m147941c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_my_cloud_multi_select_info_bar, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147940a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137742p;
    }
}
