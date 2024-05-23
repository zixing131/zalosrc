package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b2 */
/* loaded from: classes3.dex */
public final class C29722b2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137292p;

    /* renamed from: q */
    public final RecyclerView f137293q;

    private C29722b2(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f137292p = linearLayout;
        this.f137293q = recyclerView;
    }

    /* renamed from: a */
    public static C29722b2 m147751a(View view) {
        int i11 = AbstractC6918a0.recyclerView;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            return new C29722b2((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29722b2 m147752c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.choose_drive_account_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147751a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137292p;
    }
}
