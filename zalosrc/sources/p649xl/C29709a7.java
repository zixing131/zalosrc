package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a7 */
/* loaded from: classes3.dex */
public final class C29709a7 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137215p;

    /* renamed from: q */
    public final RobotoButton f137216q;

    /* renamed from: r */
    public final RobotoButton f137217r;

    /* renamed from: s */
    public final TouchInterceptionFrameLayout f137218s;

    /* renamed from: t */
    public final LinearLayout f137219t;

    /* renamed from: u */
    public final NumberPicker f137220u;

    /* renamed from: v */
    public final FrameLayout f137221v;

    private C29709a7(FrameLayout frameLayout, RobotoButton robotoButton, RobotoButton robotoButton2, TouchInterceptionFrameLayout touchInterceptionFrameLayout, LinearLayout linearLayout, NumberPicker numberPicker, FrameLayout frameLayout2) {
        this.f137215p = frameLayout;
        this.f137216q = robotoButton;
        this.f137217r = robotoButton2;
        this.f137218s = touchInterceptionFrameLayout;
        this.f137219t = linearLayout;
        this.f137220u = numberPicker;
        this.f137221v = frameLayout2;
    }

    /* renamed from: a */
    public static C29709a7 m147720a(View view) {
        int i11 = AbstractC6918a0.btn_cancel;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            i11 = AbstractC6918a0.btn_start;
            RobotoButton robotoButton2 = (RobotoButton) AbstractC22716b.m117526a(view, i11);
            if (robotoButton2 != null) {
                i11 = AbstractC6918a0.layout_parent;
                TouchInterceptionFrameLayout touchInterceptionFrameLayout = (TouchInterceptionFrameLayout) AbstractC22716b.m117526a(view, i11);
                if (touchInterceptionFrameLayout != null) {
                    i11 = AbstractC6918a0.layout_picker;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.number_picker;
                        NumberPicker numberPicker = (NumberPicker) AbstractC22716b.m117526a(view, i11);
                        if (numberPicker != null) {
                            i11 = AbstractC6918a0.popup_content_container;
                            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout != null) {
                                return new C29709a7((FrameLayout) view, robotoButton, robotoButton2, touchInterceptionFrameLayout, linearLayout, numberPicker, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29709a7 m147721c(LayoutInflater layoutInflater) {
        return m147722d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29709a7 m147722d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_self_delete_conversation_config_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147720a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137215p;
    }
}
