package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.y7 */
/* loaded from: classes3.dex */
public final class C30134y7 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140019p;

    /* renamed from: q */
    public final RobotoButton f140020q;

    /* renamed from: r */
    public final LinearLayout f140021r;

    /* renamed from: s */
    public final RobotoTextView f140022s;

    /* renamed from: t */
    public final RobotoTextView f140023t;

    private C30134y7(LinearLayout linearLayout, RobotoButton robotoButton, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f140019p = linearLayout;
        this.f140020q = robotoButton;
        this.f140021r = linearLayout2;
        this.f140022s = robotoTextView;
        this.f140023t = robotoTextView2;
    }

    /* renamed from: a */
    public static C30134y7 m148733a(View view) {
        int i11 = AbstractC6918a0.storage_permission_deny_allow_button;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = AbstractC6918a0.storage_permission_deny_text_view_descri;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.storage_permission_deny_text_view_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C30134y7(linearLayout, robotoButton, linearLayout, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30134y7 m148734c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.media_picker_storage_permission_deny_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148733a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140019p;
    }
}
