package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.zviews.KeyboardAwareLinearLayout;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m2 */
/* loaded from: classes3.dex */
public final class C29920m2 implements InterfaceC22715a {

    /* renamed from: p */
    private final KeyboardFrameLayout f138640p;

    /* renamed from: q */
    public final Button f138641q;

    /* renamed from: r */
    public final KeyboardAwareLinearLayout f138642r;

    /* renamed from: s */
    public final RecyclerView f138643s;

    /* renamed from: t */
    public final C29831h3 f138644t;

    /* renamed from: u */
    public final KeyboardFrameLayout f138645u;

    /* renamed from: v */
    public final C29884k2 f138646v;

    /* renamed from: w */
    public final ZdsActionBar f138647w;

    private C29920m2(KeyboardFrameLayout keyboardFrameLayout, Button button, KeyboardAwareLinearLayout keyboardAwareLinearLayout, RecyclerView recyclerView, C29831h3 c29831h3, KeyboardFrameLayout keyboardFrameLayout2, C29884k2 c29884k2, ZdsActionBar zdsActionBar) {
        this.f138640p = keyboardFrameLayout;
        this.f138641q = button;
        this.f138642r = keyboardAwareLinearLayout;
        this.f138643s = recyclerView;
        this.f138644t = c29831h3;
        this.f138645u = keyboardFrameLayout2;
        this.f138646v = c29884k2;
        this.f138647w = zdsActionBar;
    }

    /* renamed from: a */
    public static C29920m2 m148229a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.button_restore_default_config;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.container;
            KeyboardAwareLinearLayout keyboardAwareLinearLayout = (KeyboardAwareLinearLayout) AbstractC22716b.m117526a(view, i11);
            if (keyboardAwareLinearLayout != null) {
                i11 = AbstractC6918a0.default_list_recycler;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.indicator_view))) != null) {
                    C29831h3 m148021a = C29831h3.m148021a(m117526a);
                    KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) view;
                    i11 = AbstractC6918a0.picker_view;
                    View m117526a2 = AbstractC22716b.m117526a(view, i11);
                    if (m117526a2 != null) {
                        C29884k2 m148149a = C29884k2.m148149a(m117526a2);
                        i11 = AbstractC6918a0.zds_action_bar;
                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                        if (zdsActionBar != null) {
                            return new C29920m2(keyboardFrameLayout, button, keyboardAwareLinearLayout, recyclerView, m148021a, keyboardFrameLayout, m148149a, zdsActionBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29920m2 m148230c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.custom_default_reaction_list_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148229a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardFrameLayout getRoot() {
        return this.f138640p;
    }
}
