package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p2 */
/* loaded from: classes3.dex */
public final class C29974p2 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrackingRelativeLayout f138936p;

    /* renamed from: q */
    public final ListItem f138937q;

    private C29974p2(TrackingRelativeLayout trackingRelativeLayout, ListItem listItem) {
        this.f138936p = trackingRelativeLayout;
        this.f138937q = listItem;
    }

    /* renamed from: a */
    public static C29974p2 m148350a(View view) {
        int i11 = AbstractC6918a0.option_item;
        ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
        if (listItem != null) {
            return new C29974p2((TrackingRelativeLayout) view, listItem);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29974p2 m148351c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.default_bottom_sheet_dynamic_option_row_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148350a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TrackingRelativeLayout getRoot() {
        return this.f138936p;
    }
}
