package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l1 */
/* loaded from: classes3.dex */
public final class C29901l1 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138542p;

    /* renamed from: q */
    public final RecyclerView f138543q;

    /* renamed from: r */
    public final ZdsActionBar f138544r;

    private C29901l1(RelativeLayout relativeLayout, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f138542p = relativeLayout;
        this.f138543q = recyclerView;
        this.f138544r = zdsActionBar;
    }

    /* renamed from: a */
    public static C29901l1 m148184a(View view) {
        int i11 = AbstractC6918a0.rv_business_tools;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
            if (zdsActionBar != null) {
                return new C29901l1((RelativeLayout) view, recyclerView, zdsActionBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29901l1 m148185c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.business_tools_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148184a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138542p;
    }
}
