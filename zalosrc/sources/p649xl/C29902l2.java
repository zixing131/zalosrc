package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.CustomEditText;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l2 */
/* loaded from: classes3.dex */
public final class C29902l2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138545p;

    /* renamed from: q */
    public final CustomEditText f138546q;

    private C29902l2(LinearLayout linearLayout, CustomEditText customEditText) {
        this.f138545p = linearLayout;
        this.f138546q = customEditText;
    }

    /* renamed from: a */
    public static C29902l2 m148187a(View view) {
        int i11 = AbstractC6918a0.et_collection_name;
        CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
        if (customEditText != null) {
            return new C29902l2((LinearLayout) view, customEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29902l2 m148188c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.create_new_collection_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148187a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138545p;
    }
}
