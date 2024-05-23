package p649xl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.y6 */
/* loaded from: classes3.dex */
public final class C30133y6 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140015p;

    /* renamed from: q */
    public final CheckBox f140016q;

    /* renamed from: r */
    public final RobotoTextView f140017r;

    /* renamed from: s */
    public final View f140018s;

    private C30133y6(LinearLayout linearLayout, CheckBox checkBox, RobotoTextView robotoTextView, View view) {
        this.f140015p = linearLayout;
        this.f140016q = checkBox;
        this.f140017r = robotoTextView;
        this.f140018s = view;
    }

    /* renamed from: a */
    public static C30133y6 m148731a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.checkbox;
        CheckBox checkBox = (CheckBox) AbstractC22716b.m117526a(view, i11);
        if (checkBox != null) {
            i11 = AbstractC6918a0.name;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.separate))) != null) {
                return new C30133y6((LinearLayout) view, checkBox, robotoTextView, m117526a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140015p;
    }
}
