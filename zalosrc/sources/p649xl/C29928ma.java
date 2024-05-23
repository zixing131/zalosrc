package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ma */
/* loaded from: classes3.dex */
public final class C29928ma implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f138678A;

    /* renamed from: p */
    private final RelativeLayout f138679p;

    /* renamed from: q */
    public final Button f138680q;

    /* renamed from: r */
    public final Button f138681r;

    /* renamed from: s */
    public final Button f138682s;

    /* renamed from: t */
    public final ImageView f138683t;

    /* renamed from: u */
    public final RelativeLayout f138684u;

    /* renamed from: v */
    public final RobotoTextView f138685v;

    /* renamed from: w */
    public final RobotoTextView f138686w;

    /* renamed from: x */
    public final RobotoTextView f138687x;

    /* renamed from: y */
    public final RobotoTextView f138688y;

    /* renamed from: z */
    public final RobotoTextView f138689z;

    private C29928ma(RelativeLayout relativeLayout, Button button, Button button2, Button button3, ImageView imageView, RelativeLayout relativeLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6) {
        this.f138679p = relativeLayout;
        this.f138680q = button;
        this.f138681r = button2;
        this.f138682s = button3;
        this.f138683t = imageView;
        this.f138684u = relativeLayout2;
        this.f138685v = robotoTextView;
        this.f138686w = robotoTextView2;
        this.f138687x = robotoTextView3;
        this.f138688y = robotoTextView4;
        this.f138689z = robotoTextView5;
        this.f138678A = robotoTextView6;
    }

    /* renamed from: a */
    public static C29928ma m148250a(View view) {
        int i11 = AbstractC6918a0.btn_action;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_negative_action;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.btn_skip;
                Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button3 != null) {
                    i11 = AbstractC6918a0.imv_icon;
                    ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                    if (imageView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i11 = AbstractC6918a0.tv_action;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.tv_desc;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                i11 = AbstractC6918a0.tv_lasted_backup;
                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView3 != null) {
                                    i11 = AbstractC6918a0.tv_lasted_backup_device;
                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView4 != null) {
                                        i11 = AbstractC6918a0.tv_lasted_backup_time;
                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView5 != null) {
                                            i11 = AbstractC6918a0.tv_title;
                                            RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView6 != null) {
                                                return new C29928ma(relativeLayout, button, button2, button3, imageView, relativeLayout, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5, robotoTextView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29928ma m148251c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.remind_backup_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148250a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138679p;
    }
}
