package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC7409c0;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r7 */
/* loaded from: classes3.dex */
public final class C30015r7 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139216p;

    private C30015r7(LinearLayout linearLayout) {
        this.f139216p = linearLayout;
    }

    /* renamed from: a */
    public static C30015r7 m148443a(View view) {
        if (view != null) {
            return new C30015r7((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C30015r7 m148444c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_warning_delete_conversation_item_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148443a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139216p;
    }
}
