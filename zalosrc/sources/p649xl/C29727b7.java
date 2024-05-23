package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b7 */
/* loaded from: classes3.dex */
public final class C29727b7 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137309p;

    /* renamed from: q */
    public final LinearLayout f137310q;

    /* renamed from: r */
    public final RecyclerView f137311r;

    /* renamed from: s */
    public final RobotoTextView f137312s;

    /* renamed from: t */
    public final RobotoTextView f137313t;

    /* renamed from: u */
    public final ZdsActionBar f137314u;

    private C29727b7(RelativeLayout relativeLayout, LinearLayout linearLayout, RecyclerView recyclerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ZdsActionBar zdsActionBar) {
        this.f137309p = relativeLayout;
        this.f137310q = linearLayout;
        this.f137311r = recyclerView;
        this.f137312s = robotoTextView;
        this.f137313t = robotoTextView2;
        this.f137314u = zdsActionBar;
    }

    /* renamed from: a */
    public static C29727b7 m147764a(View view) {
        int i11 = AbstractC6918a0.ll_actions;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.rv_file_logs;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.tv_btn_delete;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tv_btn_send;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.zds_action_bar;
                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                        if (zdsActionBar != null) {
                            return new C29727b7((RelativeLayout) view, linearLayout, recyclerView, robotoTextView, robotoTextView2, zdsActionBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137309p;
    }
}
