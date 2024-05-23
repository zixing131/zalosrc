package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.y0 */
/* loaded from: classes3.dex */
public final class C30127y0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139982p;

    /* renamed from: q */
    public final Button f139983q;

    /* renamed from: r */
    public final ListItem f139984r;

    /* renamed from: s */
    public final ListItem f139985s;

    /* renamed from: t */
    public final RobotoTextView f139986t;

    private C30127y0(LinearLayout linearLayout, Button button, ListItem listItem, ListItem listItem2, RobotoTextView robotoTextView) {
        this.f139982p = linearLayout;
        this.f139983q = button;
        this.f139984r = listItem;
        this.f139985s = listItem2;
        this.f139986t = robotoTextView;
    }

    /* renamed from: a */
    public static C30127y0 m148713a(View view) {
        int i11 = AbstractC6918a0.btn_got_it;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.listItem1;
            ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
            if (listItem != null) {
                i11 = AbstractC6918a0.listItem2;
                ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
                if (listItem2 != null) {
                    i11 = AbstractC6918a0.tv_title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C30127y0((LinearLayout) view, button, listItem, listItem2, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30127y0 m148714c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_pre_download, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148713a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139982p;
    }
}
