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

/* renamed from: xl.f1 */
/* loaded from: classes3.dex */
public final class C29793f1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137728p;

    /* renamed from: q */
    public final Button f137729q;

    private C29793f1(LinearLayout linearLayout, Button button) {
        this.f137728p = linearLayout;
        this.f137729q = button;
    }

    /* renamed from: a */
    public static C29793f1 m147925a(View view) {
        int i11 = AbstractC6918a0.btn_got_it;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            return new C29793f1((LinearLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29793f1 m147926c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_un_support_edit_chat_tag, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147925a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137728p;
    }
}