package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.CheckBox;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.la */
/* loaded from: classes3.dex */
public final class C29910la implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138593p;

    /* renamed from: q */
    public final CheckBox f138594q;

    /* renamed from: r */
    public final RobotoTextView f138595r;

    private C29910la(LinearLayout linearLayout, CheckBox checkBox, RobotoTextView robotoTextView) {
        this.f138593p = linearLayout;
        this.f138594q = checkBox;
        this.f138595r = robotoTextView;
    }

    /* renamed from: a */
    public static C29910la m148208a(View view) {
        int i11 = AbstractC6918a0.checkbox;
        CheckBox checkBox = (CheckBox) AbstractC22716b.m117526a(view, i11);
        if (checkBox != null) {
            i11 = AbstractC6918a0.tvAction;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C29910la((LinearLayout) view, checkBox, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29910la m148209c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.region_action_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148208a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138593p;
    }
}
