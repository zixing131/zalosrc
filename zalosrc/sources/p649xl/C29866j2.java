package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j2 */
/* loaded from: classes3.dex */
public final class C29866j2 implements InterfaceC22715a {

    /* renamed from: p */
    private final ScrollView f138235p;

    /* renamed from: q */
    public final RobotoTextView f138236q;

    /* renamed from: r */
    public final RobotoTextView f138237r;

    /* renamed from: s */
    public final RobotoTextView f138238s;

    /* renamed from: t */
    public final RobotoTextView f138239t;

    private C29866j2(ScrollView scrollView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f138235p = scrollView;
        this.f138236q = robotoTextView;
        this.f138237r = robotoTextView2;
        this.f138238s = robotoTextView3;
        this.f138239t = robotoTextView4;
    }

    /* renamed from: a */
    public static C29866j2 m148101a(View view) {
        int i11 = AbstractC6918a0.btn_change_phone;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_close;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.see_more;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    i11 = AbstractC6918a0.tvContent;
                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView4 != null) {
                        return new C29866j2((ScrollView) view, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29866j2 m148102c(LayoutInflater layoutInflater) {
        return m148103d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29866j2 m148103d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.content_dialog_unmap, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148101a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f138235p;
    }
}
