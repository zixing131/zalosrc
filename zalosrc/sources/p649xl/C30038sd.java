package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.sd */
/* loaded from: classes3.dex */
public final class C30038sd implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139342p;

    /* renamed from: q */
    public final RecyclerView f139343q;

    /* renamed from: r */
    public final RelativeLayout f139344r;

    private C30038sd(RelativeLayout relativeLayout, RecyclerView recyclerView, RelativeLayout relativeLayout2) {
        this.f139342p = relativeLayout;
        this.f139343q = recyclerView;
        this.f139344r = relativeLayout2;
    }

    /* renamed from: a */
    public static C30038sd m148502a(View view) {
        int i11 = AbstractC6918a0.recyclerView;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new C30038sd(relativeLayout, recyclerView, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30038sd m148503c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.tab_me_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148502a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139342p;
    }
}
