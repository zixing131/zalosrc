package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a6 */
/* loaded from: classes3.dex */
public final class C29708a6 implements InterfaceC22715a {

    /* renamed from: p */
    private final ListItem f137213p;

    /* renamed from: q */
    public final ListItem f137214q;

    private C29708a6(ListItem listItem, ListItem listItem2) {
        this.f137213p = listItem;
        this.f137214q = listItem2;
    }

    /* renamed from: a */
    public static C29708a6 m147717a(View view) {
        if (view != null) {
            ListItem listItem = (ListItem) view;
            return new C29708a6(listItem, listItem);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29708a6 m147718c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_move_tab_user_row_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147717a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ListItem getRoot() {
        return this.f137213p;
    }
}
