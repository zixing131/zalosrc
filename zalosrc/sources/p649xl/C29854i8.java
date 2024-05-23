package p649xl;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i8 */
/* loaded from: classes3.dex */
public final class C29854i8 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138153p;

    /* renamed from: q */
    public final Button f138154q;

    /* renamed from: r */
    public final Button f138155r;

    /* renamed from: s */
    public final ProgressBar f138156s;

    /* renamed from: t */
    public final RobotoTextView f138157t;

    private C29854i8(RelativeLayout relativeLayout, Button button, Button button2, ProgressBar progressBar, RobotoTextView robotoTextView) {
        this.f138153p = relativeLayout;
        this.f138154q = button;
        this.f138155r = button2;
        this.f138156s = progressBar;
        this.f138157t = robotoTextView;
    }

    /* renamed from: a */
    public static C29854i8 m148074a(View view) {
        int i11 = AbstractC6918a0.back_button;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.close_button;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.progress_bar;
                ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                if (progressBar != null) {
                    i11 = AbstractC6918a0.toolbar_bar_title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C29854i8((RelativeLayout) view, button, button2, progressBar, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138153p;
    }
}
