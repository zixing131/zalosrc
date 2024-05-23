package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c4 */
/* loaded from: classes3.dex */
public final class C29742c4 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137391p;

    /* renamed from: q */
    public final C29815g5 f137392q;

    private C29742c4(FrameLayout frameLayout, C29815g5 c29815g5) {
        this.f137391p = frameLayout;
        this.f137392q = c29815g5;
    }

    /* renamed from: a */
    public static C29742c4 m147799a(View view) {
        int i11 = AbstractC6918a0.layout_reaction_error;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            return new C29742c4((FrameLayout) view, C29815g5.m147981a(m117526a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29742c4 m147800c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.footer_reaction_error_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147799a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137391p;
    }
}
