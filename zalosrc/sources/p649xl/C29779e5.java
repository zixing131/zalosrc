package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e5 */
/* loaded from: classes3.dex */
public final class C29779e5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137655p;

    /* renamed from: q */
    public final Button f137656q;

    /* renamed from: r */
    public final RobotoTextView f137657r;

    /* renamed from: s */
    public final RobotoTextView f137658s;

    private C29779e5(LinearLayout linearLayout, Button button, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137655p = linearLayout;
        this.f137656q = button;
        this.f137657r = robotoTextView;
        this.f137658s = robotoTextView2;
    }

    /* renamed from: a */
    public static C29779e5 m147891a(View view) {
        int i11 = AbstractC6918a0.bt_create;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.tv_desc;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.tv_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C29779e5((LinearLayout) view, button, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29779e5 m147892c(LayoutInflater layoutInflater) {
        return m147893d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29779e5 m147893d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_empty_carousel_my_cloud_collection, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147891a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137655p;
    }
}
