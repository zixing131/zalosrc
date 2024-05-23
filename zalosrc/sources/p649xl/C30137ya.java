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

/* renamed from: xl.ya */
/* loaded from: classes3.dex */
public final class C30137ya implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140031p;

    /* renamed from: q */
    public final ListItem f140032q;

    /* renamed from: r */
    public final ListItem f140033r;

    private C30137ya(LinearLayout linearLayout, ListItem listItem, ListItem listItem2) {
        this.f140031p = linearLayout;
        this.f140032q = listItem;
        this.f140033r = listItem2;
    }

    /* renamed from: a */
    public static C30137ya m148742a(View view) {
        int i11 = AbstractC6918a0.btnCopy;
        ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
        if (listItem != null) {
            i11 = AbstractC6918a0.btnSaveToDrive;
            ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
            if (listItem2 != null) {
                return new C30137ya((LinearLayout) view, listItem, listItem2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30137ya m148743c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.save_backup_key_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148742a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140031p;
    }
}
