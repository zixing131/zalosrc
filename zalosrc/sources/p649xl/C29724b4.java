package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b4 */
/* loaded from: classes3.dex */
public final class C29724b4 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137297p;

    /* renamed from: q */
    public final LinearLayout f137298q;

    /* renamed from: r */
    public final C29922m4 f137299r;

    private C29724b4(FrameLayout frameLayout, LinearLayout linearLayout, C29922m4 c29922m4) {
        this.f137297p = frameLayout;
        this.f137298q = linearLayout;
        this.f137299r = c29922m4;
    }

    /* renamed from: a */
    public static C29724b4 m147756a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.layout_error;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.layout_loading))) != null) {
            return new C29724b4((FrameLayout) view, linearLayout, C29922m4.m148235a(m117526a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29724b4 m147757c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.footer_loading_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147756a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137297p;
    }
}
