package p649xl;

import android.view.View;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.InterfaceC22715a;

/* renamed from: xl.uf */
/* loaded from: classes3.dex */
public final class C30074uf implements InterfaceC22715a {

    /* renamed from: p */
    private final RobotoTextView f139609p;

    /* renamed from: q */
    public final RobotoTextView f139610q;

    private C30074uf(RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139609p = robotoTextView;
        this.f139610q = robotoTextView2;
    }

    /* renamed from: a */
    public static C30074uf m148591a(View view) {
        if (view != null) {
            RobotoTextView robotoTextView = (RobotoTextView) view;
            return new C30074uf(robotoTextView, robotoTextView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RobotoTextView getRoot() {
        return this.f139609p;
    }
}
