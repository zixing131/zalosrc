package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d5 */
/* loaded from: classes3.dex */
public final class C29761d5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137489p;

    /* renamed from: q */
    public final Button f137490q;

    /* renamed from: r */
    public final AppCompatImageView f137491r;

    /* renamed from: s */
    public final RobotoTextView f137492s;

    private C29761d5(LinearLayout linearLayout, Button button, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView) {
        this.f137489p = linearLayout;
        this.f137490q = button;
        this.f137491r = appCompatImageView;
        this.f137492s = robotoTextView;
    }

    /* renamed from: a */
    public static C29761d5 m147844a(View view) {
        int i11 = AbstractC6918a0.btn_try_now;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.empty_thumb;
            AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (appCompatImageView != null) {
                i11 = AbstractC6918a0.empty_title;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29761d5((LinearLayout) view, button, appCompatImageView, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29761d5 m147845c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_empty_ai_sticker_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147844a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137489p;
    }
}
