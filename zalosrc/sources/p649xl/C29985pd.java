package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.pd */
/* loaded from: classes3.dex */
public final class C29985pd implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139028p;

    /* renamed from: q */
    public final LinearLayout f139029q;

    /* renamed from: r */
    public final Button f139030r;

    /* renamed from: s */
    public final Button f139031s;

    /* renamed from: t */
    public final RobotoTextView f139032t;

    /* renamed from: u */
    public final RobotoTextView f139033u;

    /* renamed from: v */
    public final RobotoTextView f139034v;

    private C29985pd(View view, LinearLayout linearLayout, Button button, Button button2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f139028p = view;
        this.f139029q = linearLayout;
        this.f139030r = button;
        this.f139031s = button2;
        this.f139032t = robotoTextView;
        this.f139033u = robotoTextView2;
        this.f139034v = robotoTextView3;
    }

    /* renamed from: a */
    public static C29985pd m148376a(View view) {
        int i11 = AbstractC6918a0.bottomContainerConfirm;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.btnConnectZCloud;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.btnConnectZaloServer;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null) {
                    i11 = AbstractC6918a0.desc_type_0_1;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.desc_type_0_2;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            i11 = AbstractC6918a0.title;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                return new C29985pd(view, linearLayout, button, button2, robotoTextView, robotoTextView2, robotoTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29985pd m148377b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.sync_empty_backup_layout_zcloud, viewGroup);
            return m148376a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139028p;
    }
}
