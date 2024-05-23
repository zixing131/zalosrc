package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.widget.NestedScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n0 */
/* loaded from: classes3.dex */
public final class C29936n0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138737p;

    /* renamed from: q */
    public final Button f138738q;

    /* renamed from: r */
    public final ZAppCompatImageView f138739r;

    /* renamed from: s */
    public final FrameLayout f138740s;

    /* renamed from: t */
    public final NestedScrollView f138741t;

    /* renamed from: u */
    public final RobotoTextView f138742u;

    /* renamed from: v */
    public final RobotoTextView f138743v;

    private C29936n0(FrameLayout frameLayout, Button button, ZAppCompatImageView zAppCompatImageView, FrameLayout frameLayout2, NestedScrollView nestedScrollView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138737p = frameLayout;
        this.f138738q = button;
        this.f138739r = zAppCompatImageView;
        this.f138740s = frameLayout2;
        this.f138741t = nestedScrollView;
        this.f138742u = robotoTextView;
        this.f138743v = robotoTextView2;
    }

    /* renamed from: a */
    public static C29936n0 m148261a(View view) {
        int i11 = AbstractC6918a0.btnPositiveAction;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.icCallLogs;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.icCallLogsContainer;
                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout != null) {
                    i11 = AbstractC6918a0.scrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) AbstractC22716b.m117526a(view, i11);
                    if (nestedScrollView != null) {
                        i11 = AbstractC6918a0.tvSubTitle;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tvTitle;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C29936n0((FrameLayout) view, button, zAppCompatImageView, frameLayout, nestedScrollView, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29936n0 m148262c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_call_logs_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148261a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138737p;
    }
}
