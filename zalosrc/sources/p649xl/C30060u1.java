package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.u1 */
/* loaded from: classes3.dex */
public final class C30060u1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139528p;

    /* renamed from: q */
    public final Button f139529q;

    /* renamed from: r */
    public final ZAppCompatImageView f139530r;

    /* renamed from: s */
    public final RobotoTextView f139531s;

    /* renamed from: t */
    public final RobotoTextView f139532t;

    private C30060u1(LinearLayout linearLayout, Button button, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139528p = linearLayout;
        this.f139529q = button;
        this.f139530r = zAppCompatImageView;
        this.f139531s = robotoTextView;
        this.f139532t = robotoTextView2;
    }

    /* renamed from: a */
    public static C30060u1 m148553a(View view) {
        int i11 = AbstractC6918a0.btnGotIt;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.icLock;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.tvDescription;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        return new C30060u1((LinearLayout) view, button, zAppCompatImageView, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30060u1 m148554c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.change_protect_code_recognition_sheet_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148553a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139528p;
    }
}
