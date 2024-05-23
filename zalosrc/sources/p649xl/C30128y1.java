package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.y1 */
/* loaded from: classes3.dex */
public final class C30128y1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139987p;

    /* renamed from: q */
    public final Button f139988q;

    /* renamed from: r */
    public final Button f139989r;

    /* renamed from: s */
    public final LinearLayout f139990s;

    private C30128y1(LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2) {
        this.f139987p = linearLayout;
        this.f139988q = button;
        this.f139989r = button2;
        this.f139990s = linearLayout2;
    }

    /* renamed from: a */
    public static C30128y1 m148716a(View view) {
        int i11 = AbstractC6918a0.btn_apply_selected;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_clear_all_selected;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C30128y1(linearLayout, button, button2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30128y1 m148717c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.chat_tag_filter_action_button_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148716a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139987p;
    }
}
