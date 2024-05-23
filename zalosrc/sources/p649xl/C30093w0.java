package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w0 */
/* loaded from: classes3.dex */
public final class C30093w0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139744p;

    /* renamed from: q */
    public final ListItem f139745q;

    /* renamed from: r */
    public final ListItem f139746r;

    /* renamed from: s */
    public final RobotoTextView f139747s;

    /* renamed from: t */
    public final RobotoTextView f139748t;

    private C30093w0(LinearLayout linearLayout, ListItem listItem, ListItem listItem2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139744p = linearLayout;
        this.f139745q = listItem;
        this.f139746r = listItem2;
        this.f139747s = robotoTextView;
        this.f139748t = robotoTextView2;
    }

    /* renamed from: a */
    public static C30093w0 m148633a(View view) {
        int i11 = AbstractC6918a0.item_admin_option;
        ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
        if (listItem != null) {
            i11 = AbstractC6918a0.item_everyone_option;
            ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
            if (listItem2 != null) {
                i11 = AbstractC6918a0.tv_desc;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tv_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        return new C30093w0((LinearLayout) view, listItem, listItem2, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30093w0 m148634c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_manage_member_permission_setting, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148633a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139744p;
    }
}
