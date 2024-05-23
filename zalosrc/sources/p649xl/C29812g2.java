package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g2 */
/* loaded from: classes3.dex */
public final class C29812g2 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f137839p;

    /* renamed from: q */
    public final RecyclerView f137840q;

    private C29812g2(View view, RecyclerView recyclerView) {
        this.f137839p = view;
        this.f137840q = recyclerView;
    }

    /* renamed from: a */
    public static C29812g2 m147975a(View view) {
        int i11 = AbstractC6918a0.color_palette_list;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            return new C29812g2(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29812g2 m147976b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.color_palette_layout, viewGroup);
            return m147975a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f137839p;
    }
}
