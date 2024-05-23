package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ka */
/* loaded from: classes3.dex */
public final class C29892ka implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138485p;

    /* renamed from: q */
    public final FrameLayout f138486q;

    /* renamed from: r */
    public final RobotoTextView f138487r;

    private C29892ka(FrameLayout frameLayout, FrameLayout frameLayout2, RobotoTextView robotoTextView) {
        this.f138485p = frameLayout;
        this.f138486q = frameLayout2;
        this.f138487r = robotoTextView;
    }

    /* renamed from: a */
    public static C29892ka m148167a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = AbstractC6918a0.reply_suggestion_text;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C29892ka(frameLayout, frameLayout, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29892ka m148168c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.quick_reply_suggestion_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148167a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138485p;
    }
}
