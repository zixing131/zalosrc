package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l6 */
/* loaded from: classes3.dex */
public final class C29906l6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138566p;

    /* renamed from: q */
    public final RelativeLayout f138567q;

    /* renamed from: r */
    public final RobotoTextView f138568r;

    private C29906l6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RobotoTextView robotoTextView) {
        this.f138566p = relativeLayout;
        this.f138567q = relativeLayout2;
        this.f138568r = robotoTextView;
    }

    /* renamed from: a */
    public static C29906l6 m148198a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.title;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29906l6(relativeLayout, relativeLayout, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29906l6 m148199c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_divider_title, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148198a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138566p;
    }
}
