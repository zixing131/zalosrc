package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.f5 */
/* loaded from: classes3.dex */
public final class C29797f5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137738p;

    /* renamed from: q */
    public final Button f137739q;

    /* renamed from: r */
    public final AppCompatImageView f137740r;

    /* renamed from: s */
    public final RobotoTextView f137741s;

    private C29797f5(LinearLayout linearLayout, Button button, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView) {
        this.f137738p = linearLayout;
        this.f137739q = button;
        this.f137740r = appCompatImageView;
        this.f137741s = robotoTextView;
    }

    /* renamed from: a */
    public static C29797f5 m147936a(View view) {
        int i11 = AbstractC6918a0.bt_retry;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.ic_warning;
            AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (appCompatImageView != null) {
                i11 = AbstractC6918a0.tv_title;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29797f5((LinearLayout) view, button, appCompatImageView, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29797f5 m147937c(LayoutInflater layoutInflater) {
        return m147938d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29797f5 m147938d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_error_carousel_my_cloud_collection, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147936a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137738p;
    }
}
