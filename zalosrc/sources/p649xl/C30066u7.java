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

/* renamed from: xl.u7 */
/* loaded from: classes3.dex */
public final class C30066u7 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139562p;

    /* renamed from: q */
    public final RecyclerView f139563q;

    /* renamed from: r */
    public final RelativeLayout f139564r;

    /* renamed from: s */
    public final ZdsActionBar f139565s;

    private C30066u7(RelativeLayout relativeLayout, RecyclerView recyclerView, RelativeLayout relativeLayout2, ZdsActionBar zdsActionBar) {
        this.f139562p = relativeLayout;
        this.f139563q = recyclerView;
        this.f139564r = relativeLayout2;
        this.f139565s = zdsActionBar;
    }

    /* renamed from: a */
    public static C30066u7 m148571a(View view) {
        int i11 = AbstractC6918a0.content_recycle_view;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i12 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i12);
            if (zdsActionBar != null) {
                return new C30066u7(relativeLayout, recyclerView, relativeLayout, zdsActionBar);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30066u7 m148572c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.manage_group_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148571a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139562p;
    }
}
