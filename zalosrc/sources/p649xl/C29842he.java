package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.he */
/* loaded from: classes3.dex */
public final class C29842he implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138062p;

    /* renamed from: q */
    public final Button f138063q;

    /* renamed from: r */
    public final Button f138064r;

    /* renamed from: s */
    public final RobotoTextView f138065s;

    private C29842he(RelativeLayout relativeLayout, Button button, Button button2, RobotoTextView robotoTextView) {
        this.f138062p = relativeLayout;
        this.f138063q = button;
        this.f138064r = button2;
        this.f138065s = robotoTextView;
    }

    /* renamed from: a */
    public static C29842he m148047a(View view) {
        int i11 = AbstractC6918a0.btn_action;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_view_help_page;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.tv_desc;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29842he((RelativeLayout) view, button, button2, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29842he m148048c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.warning_full_storage_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148047a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138062p;
    }
}
