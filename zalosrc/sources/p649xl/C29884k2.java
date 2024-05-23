package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.SearchField;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k2 */
/* loaded from: classes3.dex */
public final class C29884k2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138446p;

    /* renamed from: q */
    public final LinearLayout f138447q;

    /* renamed from: r */
    public final FrameLayout f138448r;

    /* renamed from: s */
    public final SearchField f138449s;

    /* renamed from: t */
    public final MultiStateView f138450t;

    /* renamed from: u */
    public final ListView f138451u;

    private C29884k2(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, SearchField searchField, MultiStateView multiStateView, ListView listView) {
        this.f138446p = linearLayout;
        this.f138447q = linearLayout2;
        this.f138448r = frameLayout;
        this.f138449s = searchField;
        this.f138450t = multiStateView;
        this.f138451u = listView;
    }

    /* renamed from: a */
    public static C29884k2 m148149a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = AbstractC6918a0.content_container;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC6918a0.input_search;
            SearchField searchField = (SearchField) AbstractC22716b.m117526a(view, i11);
            if (searchField != null) {
                i11 = AbstractC6918a0.multistate_view;
                MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                if (multiStateView != null) {
                    i11 = AbstractC6918a0.recycle_view;
                    ListView listView = (ListView) AbstractC22716b.m117526a(view, i11);
                    if (listView != null) {
                        return new C29884k2(linearLayout, linearLayout, frameLayout, searchField, multiStateView, listView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138446p;
    }
}
