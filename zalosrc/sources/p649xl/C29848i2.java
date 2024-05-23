package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i2 */
/* loaded from: classes3.dex */
public final class C29848i2 implements InterfaceC22715a {

    /* renamed from: p */
    private final ScrollViewVisibleChildViewDetector f138116p;

    /* renamed from: q */
    public final ZAppCompatImageView f138117q;

    /* renamed from: r */
    public final LinearLayout f138118r;

    /* renamed from: s */
    public final LinearLayout f138119s;

    /* renamed from: t */
    public final RelativeLayout f138120t;

    /* renamed from: u */
    public final ScrollViewVisibleChildViewDetector f138121u;

    /* renamed from: v */
    public final Switch f138122v;

    /* renamed from: w */
    public final RobotoTextView f138123w;

    /* renamed from: x */
    public final RobotoTextView f138124x;

    /* renamed from: y */
    public final RobotoTextView f138125y;

    /* renamed from: z */
    public final ZdsActionBar f138126z;

    private C29848i2(ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector2, Switch r7, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ZdsActionBar zdsActionBar) {
        this.f138116p = scrollViewVisibleChildViewDetector;
        this.f138117q = zAppCompatImageView;
        this.f138118r = linearLayout;
        this.f138119s = linearLayout2;
        this.f138120t = relativeLayout;
        this.f138121u = scrollViewVisibleChildViewDetector2;
        this.f138122v = r7;
        this.f138123w = robotoTextView;
        this.f138124x = robotoTextView2;
        this.f138125y = robotoTextView3;
        this.f138126z = zdsActionBar;
    }

    /* renamed from: a */
    public static C29848i2 m148059a(View view) {
        int i11 = AbstractC6918a0.ic_img_next;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.ll_config_backup_msg_e2ee;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.ll_config_network_condition;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout2 != null) {
                    i11 = AbstractC6918a0.ll_config_password_backup;
                    RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                    if (relativeLayout != null) {
                        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view;
                        i11 = AbstractC6918a0.ss_backup_e2ee;
                        Switch r92 = (Switch) AbstractC22716b.m117526a(view, i11);
                        if (r92 != null) {
                            i11 = AbstractC6918a0.tv_password_backup;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.tv_setting_network_condition_desc;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.tv_title_password_backup;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView3 != null) {
                                        i11 = AbstractC6918a0.zds_action_bar;
                                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                        if (zdsActionBar != null) {
                                            return new C29848i2(scrollViewVisibleChildViewDetector, zAppCompatImageView, linearLayout, linearLayout2, relativeLayout, scrollViewVisibleChildViewDetector, r92, robotoTextView, robotoTextView2, robotoTextView3, zdsActionBar);
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
    public static C29848i2 m148060c(LayoutInflater layoutInflater) {
        return m148061d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29848i2 m148061d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.config_backup_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148059a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollViewVisibleChildViewDetector getRoot() {
        return this.f138116p;
    }
}
