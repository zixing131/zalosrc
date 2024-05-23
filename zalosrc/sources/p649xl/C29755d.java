package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d */
/* loaded from: classes3.dex */
public final class C29755d implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137459p;

    /* renamed from: q */
    public final Button f137460q;

    /* renamed from: r */
    public final LinearLayout f137461r;

    /* renamed from: s */
    public final LinearLayout f137462s;

    /* renamed from: t */
    public final LinearLayout f137463t;

    private C29755d(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f137459p = linearLayout;
        this.f137460q = button;
        this.f137461r = linearLayout2;
        this.f137462s = linearLayout3;
        this.f137463t = linearLayout4;
    }

    /* renamed from: a */
    public static C29755d m147829a(View view) {
        int i11 = AbstractC6918a0.btn_open_business_tools;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.ll_auto_replies;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.ll_product_catalog;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout2 != null) {
                    i11 = AbstractC6918a0.ll_quick_messages;
                    LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout3 != null) {
                        return new C29755d((LinearLayout) view, button, linearLayout, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29755d m147830c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.activation_business_tools_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147829a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137459p;
    }
}
