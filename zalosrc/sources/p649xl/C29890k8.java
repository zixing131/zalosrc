package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.imageview.CircleImageView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k8 */
/* loaded from: classes3.dex */
public final class C29890k8 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138472p;

    /* renamed from: q */
    public final Button f138473q;

    /* renamed from: r */
    public final TrackingImageView f138474r;

    /* renamed from: s */
    public final TrackingImageView f138475s;

    /* renamed from: t */
    public final TrackingImageView f138476t;

    /* renamed from: u */
    public final View f138477u;

    /* renamed from: v */
    public final CircleImageView f138478v;

    /* renamed from: w */
    public final TextView f138479w;

    /* renamed from: x */
    public final TextView f138480x;

    private C29890k8(LinearLayout linearLayout, Button button, TrackingImageView trackingImageView, TrackingImageView trackingImageView2, TrackingImageView trackingImageView3, View view, CircleImageView circleImageView, TextView textView, TextView textView2) {
        this.f138472p = linearLayout;
        this.f138473q = button;
        this.f138474r = trackingImageView;
        this.f138475s = trackingImageView2;
        this.f138476t = trackingImageView3;
        this.f138477u = view;
        this.f138478v = circleImageView;
        this.f138479w = textView;
        this.f138480x = textView2;
    }

    /* renamed from: a */
    public static C29890k8 m148162a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_cancel;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_reload;
            TrackingImageView trackingImageView = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
            if (trackingImageView != null) {
                i11 = AbstractC6918a0.btn_report;
                TrackingImageView trackingImageView2 = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
                if (trackingImageView2 != null) {
                    i11 = AbstractC6918a0.btn_share;
                    TrackingImageView trackingImageView3 = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
                    if (trackingImageView3 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.divider))) != null) {
                        i11 = AbstractC6918a0.imv_mp_avt;
                        CircleImageView circleImageView = (CircleImageView) AbstractC22716b.m117526a(view, i11);
                        if (circleImageView != null) {
                            i11 = AbstractC6918a0.mp_name;
                            TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
                            if (textView != null) {
                                i11 = AbstractC6918a0.txt_share;
                                TextView textView2 = (TextView) AbstractC22716b.m117526a(view, i11);
                                if (textView2 != null) {
                                    return new C29890k8((LinearLayout) view, button, trackingImageView, trackingImageView2, trackingImageView3, m117526a, circleImageView, textView, textView2);
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
        return this.f138472p;
    }
}
