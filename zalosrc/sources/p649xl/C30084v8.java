package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.v8 */
/* loaded from: classes3.dex */
public final class C30084v8 implements InterfaceC22715a {

    /* renamed from: p */
    private final ScrollView f139673p;

    /* renamed from: q */
    public final RobotoTextView f139674q;

    /* renamed from: r */
    public final Button f139675r;

    /* renamed from: s */
    public final Button f139676s;

    /* renamed from: t */
    public final ScrollView f139677t;

    private C30084v8(ScrollView scrollView, RobotoTextView robotoTextView, Button button, Button button2, ScrollView scrollView2) {
        this.f139673p = scrollView;
        this.f139674q = robotoTextView;
        this.f139675r = button;
        this.f139676s = button2;
        this.f139677t = scrollView2;
    }

    /* renamed from: a */
    public static C30084v8 m148615a(View view) {
        int i11 = AbstractC6918a0.bts_title;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.confirm_btn;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.more_detail_btn;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null) {
                    ScrollView scrollView = (ScrollView) view;
                    return new C30084v8(scrollView, robotoTextView, button, button2, scrollView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30084v8 m148616c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.my_cloud_quota_onboarding_bts, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148615a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f139673p;
    }
}
