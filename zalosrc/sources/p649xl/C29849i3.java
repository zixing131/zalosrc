package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i3 */
/* loaded from: classes3.dex */
public final class C29849i3 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138127p;

    /* renamed from: q */
    public final FrameLayout f138128q;

    /* renamed from: r */
    public final RobotoTextView f138129r;

    /* renamed from: s */
    public final C29940n4 f138130s;

    private C29849i3(FrameLayout frameLayout, FrameLayout frameLayout2, RobotoTextView robotoTextView, C29940n4 c29940n4) {
        this.f138127p = frameLayout;
        this.f138128q = frameLayout2;
        this.f138129r = robotoTextView;
        this.f138130s = c29940n4;
    }

    /* renamed from: a */
    public static C29849i3 m148063a(View view) {
        View m117526a;
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = AbstractC6918a0.list_empty_text;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.pb_loading))) != null) {
            return new C29849i3(frameLayout, frameLayout, robotoTextView, C29940n4.m148270a(m117526a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138127p;
    }
}
