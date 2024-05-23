package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ld */
/* loaded from: classes3.dex */
public final class C29913ld implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138619p;

    /* renamed from: q */
    public final Button f138620q;

    private C29913ld(LinearLayout linearLayout, Button button) {
        this.f138619p = linearLayout;
        this.f138620q = button;
    }

    /* renamed from: a */
    public static C29913ld m148215a(View view) {
        int i11 = AbstractC6918a0.story_reaction_onboarding_cta;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            return new C29913ld((LinearLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29913ld m148216c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_reaction_onboarding, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148215a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138619p;
    }
}
