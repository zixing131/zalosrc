package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k4 */
/* loaded from: classes3.dex */
public final class C29886k4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138458p;

    /* renamed from: q */
    public final RelativeLayout f138459q;

    /* renamed from: r */
    public final AppCompatImageView f138460r;

    /* renamed from: s */
    public final RobotoTextView f138461s;

    private C29886k4(LinearLayout linearLayout, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView) {
        this.f138458p = linearLayout;
        this.f138459q = relativeLayout;
        this.f138460r = appCompatImageView;
        this.f138461s = robotoTextView;
    }

    /* renamed from: a */
    public static C29886k4 m148154a(View view) {
        int i11 = AbstractC6918a0.bg_hint_on_notify;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.icon_close_banner_hint;
            AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (appCompatImageView != null) {
                i11 = AbstractC6918a0.text_hint_on_notify;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29886k4((LinearLayout) view, relativeLayout, appCompatImageView, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29886k4 m148155c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.hint_on_msg_noti, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148154a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138458p;
    }
}
