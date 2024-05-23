package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Divider;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q2 */
/* loaded from: classes3.dex */
public final class C29992q2 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139082p;

    /* renamed from: q */
    public final Divider f139083q;

    private C29992q2(RelativeLayout relativeLayout, Divider divider) {
        this.f139082p = relativeLayout;
        this.f139083q = divider;
    }

    /* renamed from: a */
    public static C29992q2 m148387a(View view) {
        int i11 = AbstractC6918a0.full_divider;
        Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
        if (divider != null) {
            return new C29992q2((RelativeLayout) view, divider);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29992q2 m148388c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.default_bottom_sheet_full_divider, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148387a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139082p;
    }
}
