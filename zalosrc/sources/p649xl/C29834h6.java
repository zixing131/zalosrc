package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h6 */
/* loaded from: classes3.dex */
public final class C29834h6 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138005p;

    /* renamed from: q */
    public final Button f138006q;

    /* renamed from: r */
    public final ProgressBar f138007r;

    /* renamed from: s */
    public final LinearLayout f138008s;

    /* renamed from: t */
    public final LinearLayout f138009t;

    /* renamed from: u */
    public final RobotoTextView f138010u;

    /* renamed from: v */
    public final RobotoTextView f138011v;

    private C29834h6(LinearLayout linearLayout, Button button, ProgressBar progressBar, LinearLayout linearLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138005p = linearLayout;
        this.f138006q = button;
        this.f138007r = progressBar;
        this.f138008s = linearLayout2;
        this.f138009t = linearLayout3;
        this.f138010u = robotoTextView;
        this.f138011v = robotoTextView2;
    }

    /* renamed from: a */
    public static C29834h6 m148029a(View view) {
        int i11 = AbstractC6918a0.btn_retry;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.ic_loading;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC6918a0.layout_state_fail;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.layout_state_progress;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        i11 = AbstractC6918a0.tv_message;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tv_message_fail;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                return new C29834h6((LinearLayout) view, button, progressBar, linearLayout, linearLayout2, robotoTextView, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29834h6 m148030c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_my_cloud_sync_msg_progress, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148029a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138005p;
    }
}
