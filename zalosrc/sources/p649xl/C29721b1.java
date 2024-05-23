package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b1 */
/* loaded from: classes3.dex */
public final class C29721b1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137287p;

    /* renamed from: q */
    public final ListItem f137288q;

    /* renamed from: r */
    public final ListItem f137289r;

    /* renamed from: s */
    public final ListItem f137290s;

    /* renamed from: t */
    public final NestedScrollView f137291t;

    private C29721b1(LinearLayout linearLayout, ListItem listItem, ListItem listItem2, ListItem listItem3, NestedScrollView nestedScrollView) {
        this.f137287p = linearLayout;
        this.f137288q = listItem;
        this.f137289r = listItem2;
        this.f137290s = listItem3;
        this.f137291t = nestedScrollView;
    }

    /* renamed from: a */
    public static C29721b1 m147748a(View view) {
        int i11 = AbstractC6918a0.itemSelectFromDevice;
        ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
        if (listItem != null) {
            i11 = AbstractC6918a0.itemTakeNewPicture;
            ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
            if (listItem2 != null) {
                i11 = AbstractC6918a0.itemViewProfilePicture;
                ListItem listItem3 = (ListItem) AbstractC22716b.m117526a(view, i11);
                if (listItem3 != null) {
                    i11 = AbstractC6918a0.scrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) AbstractC22716b.m117526a(view, i11);
                    if (nestedScrollView != null) {
                        return new C29721b1((LinearLayout) view, listItem, listItem2, listItem3, nestedScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29721b1 m147749c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_select_avatar_method_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147748a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137287p;
    }
}
