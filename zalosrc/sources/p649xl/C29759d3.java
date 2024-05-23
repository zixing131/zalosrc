package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d3 */
/* loaded from: classes3.dex */
public final class C29759d3 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137478p;

    /* renamed from: q */
    public final Button f137479q;

    /* renamed from: r */
    public final Button f137480r;

    /* renamed from: s */
    public final ZAppCompatImageView f137481s;

    /* renamed from: t */
    public final ZAppCompatImageView f137482t;

    /* renamed from: u */
    public final LinearLayout f137483u;

    /* renamed from: v */
    public final Button f137484v;

    /* renamed from: w */
    public final RobotoTextView f137485w;

    /* renamed from: x */
    public final RobotoTextView f137486x;

    private C29759d3(LinearLayout linearLayout, Button button, Button button2, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, LinearLayout linearLayout2, Button button3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137478p = linearLayout;
        this.f137479q = button;
        this.f137480r = button2;
        this.f137481s = zAppCompatImageView;
        this.f137482t = zAppCompatImageView2;
        this.f137483u = linearLayout2;
        this.f137484v = button3;
        this.f137485w = robotoTextView;
        this.f137486x = robotoTextView2;
    }

    /* renamed from: a */
    public static C29759d3 m147839a(View view) {
        int i11 = AbstractC6918a0.btnBack;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btnRetry;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.e2ee_inprogress;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.imgProgress;
                    ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i11 = AbstractC6918a0.text_back_btn;
                        Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                        if (button3 != null) {
                            i11 = AbstractC6918a0.tvDesProgress;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.tvTitleProgress;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    return new C29759d3(linearLayout, button, button2, zAppCompatImageView, zAppCompatImageView2, linearLayout, button3, robotoTextView, robotoTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137478p;
    }
}
