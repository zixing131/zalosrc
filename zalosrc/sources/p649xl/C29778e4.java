package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e4 */
/* loaded from: classes3.dex */
public final class C29778e4 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137652p;

    /* renamed from: q */
    public final RelativeLayout f137653q;

    /* renamed from: r */
    public final FrameLayout f137654r;

    private C29778e4(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, FrameLayout frameLayout) {
        this.f137652p = relativeLayout;
        this.f137653q = relativeLayout2;
        this.f137654r = frameLayout;
    }

    /* renamed from: a */
    public static C29778e4 m147888a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.container_media_picker;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            return new C29778e4(relativeLayout, relativeLayout, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29778e4 m147889c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.gallery_picker_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147888a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137652p;
    }
}
