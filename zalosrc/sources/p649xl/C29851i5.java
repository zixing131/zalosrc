package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i5 */
/* loaded from: classes3.dex */
public final class C29851i5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138144p;

    /* renamed from: q */
    public final RecyclerView f138145q;

    /* renamed from: r */
    public final ZdsActionBar f138146r;

    private C29851i5(LinearLayout linearLayout, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f138144p = linearLayout;
        this.f138145q = recyclerView;
        this.f138146r = zdsActionBar;
    }

    /* renamed from: a */
    public static C29851i5 m148068a(View view) {
        int i11 = AbstractC6918a0.rv_group_list;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
            if (zdsActionBar != null) {
                return new C29851i5((LinearLayout) view, recyclerView, zdsActionBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29851i5 m148069c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_group_invitation_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148068a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138144p;
    }
}
