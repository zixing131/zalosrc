package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC7409c0;
import p338m2.InterfaceC22715a;

/* renamed from: xl.jd */
/* loaded from: classes3.dex */
public final class C29877jd implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138347p;

    private C29877jd(LinearLayout linearLayout) {
        this.f138347p = linearLayout;
    }

    /* renamed from: a */
    public static C29877jd m148133a(View view) {
        if (view != null) {
            return new C29877jd((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29877jd m148134c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_privacy_header_info, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148133a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138347p;
    }
}
