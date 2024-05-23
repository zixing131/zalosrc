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

/* renamed from: xl.z9 */
/* loaded from: classes3.dex */
public final class C30153z9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f140123p;

    /* renamed from: q */
    public final RelativeLayout f140124q;

    /* renamed from: r */
    public final RecyclerView f140125r;

    private C30153z9(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView) {
        this.f140123p = relativeLayout;
        this.f140124q = relativeLayout2;
        this.f140125r = recyclerView;
    }

    /* renamed from: a */
    public static C30153z9 m148779a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.rv_options;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            return new C30153z9(relativeLayout, relativeLayout, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30153z9 m148780c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_cover_bottom_sheet_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148779a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f140123p;
    }
}
