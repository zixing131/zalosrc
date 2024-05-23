package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.od */
/* loaded from: classes3.dex */
public final class C29967od implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138902p;

    /* renamed from: q */
    public final RobotoTextView f138903q;

    /* renamed from: r */
    public final RobotoTextView f138904r;

    /* renamed from: s */
    public final RobotoTextView f138905s;

    /* renamed from: t */
    public final RobotoTextView f138906t;

    /* renamed from: u */
    public final RobotoTextView f138907u;

    private C29967od(View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5) {
        this.f138902p = view;
        this.f138903q = robotoTextView;
        this.f138904r = robotoTextView2;
        this.f138905s = robotoTextView3;
        this.f138906t = robotoTextView4;
        this.f138907u = robotoTextView5;
    }

    /* renamed from: a */
    public static C29967od m148336a(View view) {
        int i11 = AbstractC6918a0.btn_backup_now;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.desc_type_0_1;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.desc_type_0_2;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    i11 = AbstractC6918a0.desc_type_1_1;
                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView4 != null) {
                        i11 = AbstractC6918a0.title;
                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView5 != null) {
                            return new C29967od(view, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29967od m148337b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.sync_empty_backup_layout, viewGroup);
            return m148336a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138902p;
    }
}
