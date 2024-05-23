package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.zviews.KeyboardAwareLinearLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r0 */
/* loaded from: classes3.dex */
public final class C30008r0 implements InterfaceC22715a {

    /* renamed from: p */
    private final KeyboardFrameLayout f139166p;

    /* renamed from: q */
    public final KeyboardAwareLinearLayout f139167q;

    /* renamed from: r */
    public final C29884k2 f139168r;

    /* renamed from: s */
    public final KeyboardFrameLayout f139169s;

    private C30008r0(KeyboardFrameLayout keyboardFrameLayout, KeyboardAwareLinearLayout keyboardAwareLinearLayout, C29884k2 c29884k2, KeyboardFrameLayout keyboardFrameLayout2) {
        this.f139166p = keyboardFrameLayout;
        this.f139167q = keyboardAwareLinearLayout;
        this.f139168r = c29884k2;
        this.f139169s = keyboardFrameLayout2;
    }

    /* renamed from: a */
    public static C30008r0 m148423a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.container;
        KeyboardAwareLinearLayout keyboardAwareLinearLayout = (KeyboardAwareLinearLayout) AbstractC22716b.m117526a(view, i11);
        if (keyboardAwareLinearLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.content_container))) != null) {
            KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) view;
            return new C30008r0(keyboardFrameLayout, keyboardAwareLinearLayout, C29884k2.m148149a(m117526a), keyboardFrameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30008r0 m148424c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_expand_reaction_picker_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148423a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardFrameLayout getRoot() {
        return this.f139166p;
    }
}
