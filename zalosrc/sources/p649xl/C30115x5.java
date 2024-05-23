package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x5 */
/* loaded from: classes3.dex */
public final class C30115x5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139899p;

    /* renamed from: q */
    public final ListItem f139900q;

    /* renamed from: r */
    public final ListItem f139901r;

    private C30115x5(LinearLayout linearLayout, ListItem listItem, ListItem listItem2) {
        this.f139899p = linearLayout;
        this.f139900q = listItem;
        this.f139901r = listItem2;
    }

    /* renamed from: a */
    public static C30115x5 m148684a(View view) {
        int i11 = AbstractC6918a0.delete_item;
        ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
        if (listItem != null) {
            i11 = AbstractC6918a0.pin_item;
            ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
            if (listItem2 != null) {
                return new C30115x5((LinearLayout) view, listItem, listItem2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30115x5 m148685c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_more_detail_mc_msg_options_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148684a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139899p;
    }
}
