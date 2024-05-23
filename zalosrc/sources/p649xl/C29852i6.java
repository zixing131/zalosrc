package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i6 */
/* loaded from: classes3.dex */
public final class C29852i6 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138147p;

    /* renamed from: q */
    public final C29725b5 f138148q;

    /* renamed from: r */
    public final RecyclerView f138149r;

    private C29852i6(FrameLayout frameLayout, C29725b5 c29725b5, RecyclerView recyclerView) {
        this.f138147p = frameLayout;
        this.f138148q = c29725b5;
        this.f138149r = recyclerView;
    }

    /* renamed from: a */
    public static C29852i6 m148071a(View view) {
        int i11 = AbstractC6918a0.dock_view_layout;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            C29725b5 m147759a = C29725b5.m147759a(m117526a);
            int i12 = AbstractC6918a0.rv_item_list;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i12);
            if (recyclerView != null) {
                return new C29852i6((FrameLayout) view, m147759a, recyclerView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29852i6 m148072c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_my_cloud_tab_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148071a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138147p;
    }
}
