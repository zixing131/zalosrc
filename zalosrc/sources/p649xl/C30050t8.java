package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.t8 */
/* loaded from: classes3.dex */
public final class C30050t8 implements InterfaceC22715a {

    /* renamed from: A */
    public final GroupAvatarView f139432A;

    /* renamed from: B */
    public final LinearLayout f139433B;

    /* renamed from: C */
    public final RobotoTextView f139434C;

    /* renamed from: D */
    public final LinearLayout f139435D;

    /* renamed from: E */
    public final RobotoTextView f139436E;

    /* renamed from: F */
    public final RelativeLayout f139437F;

    /* renamed from: G */
    public final RobotoTextView f139438G;

    /* renamed from: H */
    public final RobotoTextView f139439H;

    /* renamed from: I */
    public final RobotoTextView f139440I;

    /* renamed from: J */
    public final ViewStub f139441J;

    /* renamed from: K */
    public final ZdsActionBar f139442K;

    /* renamed from: p */
    private final LinearLayout f139443p;

    /* renamed from: q */
    public final RobotoTextView f139444q;

    /* renamed from: r */
    public final RobotoTextView f139445r;

    /* renamed from: s */
    public final RobotoTextView f139446s;

    /* renamed from: t */
    public final Button f139447t;

    /* renamed from: u */
    public final TrackingImageView f139448u;

    /* renamed from: v */
    public final Button f139449v;

    /* renamed from: w */
    public final ToolStorageChartView f139450w;

    /* renamed from: x */
    public final LinearLayout f139451x;

    /* renamed from: y */
    public final RobotoTextView f139452y;

    /* renamed from: z */
    public final View f139453z;

    private C30050t8(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, Button button, TrackingImageView trackingImageView, Button button2, ToolStorageChartView toolStorageChartView, LinearLayout linearLayout2, RobotoTextView robotoTextView4, View view, GroupAvatarView groupAvatarView, LinearLayout linearLayout3, RobotoTextView robotoTextView5, LinearLayout linearLayout4, RobotoTextView robotoTextView6, RelativeLayout relativeLayout, RobotoTextView robotoTextView7, RobotoTextView robotoTextView8, RobotoTextView robotoTextView9, ViewStub viewStub, ZdsActionBar zdsActionBar) {
        this.f139443p = linearLayout;
        this.f139444q = robotoTextView;
        this.f139445r = robotoTextView2;
        this.f139446s = robotoTextView3;
        this.f139447t = button;
        this.f139448u = trackingImageView;
        this.f139449v = button2;
        this.f139450w = toolStorageChartView;
        this.f139451x = linearLayout2;
        this.f139452y = robotoTextView4;
        this.f139453z = view;
        this.f139432A = groupAvatarView;
        this.f139433B = linearLayout3;
        this.f139434C = robotoTextView5;
        this.f139435D = linearLayout4;
        this.f139436E = robotoTextView6;
        this.f139437F = relativeLayout;
        this.f139438G = robotoTextView7;
        this.f139439H = robotoTextView8;
        this.f139440I = robotoTextView9;
        this.f139441J = viewStub;
        this.f139442K = zdsActionBar;
    }

    /* renamed from: a */
    public static C30050t8 m148530a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.badge_connect_zcloud;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.banner_desc;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.banner_title;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    i11 = AbstractC6918a0.btn_clean_my_cloud;
                    Button button = (Button) AbstractC22716b.m117526a(view, i11);
                    if (button != null) {
                        i11 = AbstractC6918a0.btn_close_banner;
                        TrackingImageView trackingImageView = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
                        if (trackingImageView != null) {
                            i11 = AbstractC6918a0.btn_connect_zcloud;
                            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                            if (button2 != null) {
                                i11 = AbstractC6918a0.chart;
                                ToolStorageChartView toolStorageChartView = (ToolStorageChartView) AbstractC22716b.m117526a(view, i11);
                                if (toolStorageChartView != null) {
                                    i11 = AbstractC6918a0.clean_section;
                                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout != null) {
                                        i11 = AbstractC6918a0.clean_section_title;
                                        RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView4 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.divider_connect_zcloud))) != null) {
                                            i11 = AbstractC6918a0.my_cloud_image;
                                            GroupAvatarView groupAvatarView = (GroupAvatarView) AbstractC22716b.m117526a(view, i11);
                                            if (groupAvatarView != null) {
                                                i11 = AbstractC6918a0.quota_chart;
                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                if (linearLayout2 != null) {
                                                    i11 = AbstractC6918a0.quota_desc;
                                                    RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView5 != null) {
                                                        i11 = AbstractC6918a0.quota_info;
                                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                        if (linearLayout3 != null) {
                                                            i11 = AbstractC6918a0.quota_title;
                                                            RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView6 != null) {
                                                                i11 = AbstractC6918a0.section_connect_zcloud;
                                                                RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                                                if (relativeLayout != null) {
                                                                    i11 = AbstractC6918a0.tv_verify;
                                                                    RobotoTextView robotoTextView7 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                    if (robotoTextView7 != null) {
                                                                        i11 = AbstractC6918a0.usage_info;
                                                                        RobotoTextView robotoTextView8 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                        if (robotoTextView8 != null) {
                                                                            i11 = AbstractC6918a0.usage_title;
                                                                            RobotoTextView robotoTextView9 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                            if (robotoTextView9 != null) {
                                                                                i11 = AbstractC6918a0.view_stub_my_cloud_usage_detail;
                                                                                ViewStub viewStub = (ViewStub) AbstractC22716b.m117526a(view, i11);
                                                                                if (viewStub != null) {
                                                                                    i11 = AbstractC6918a0.zds_action_bar;
                                                                                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                                                    if (zdsActionBar != null) {
                                                                                        return new C30050t8((LinearLayout) view, robotoTextView, robotoTextView2, robotoTextView3, button, trackingImageView, button2, toolStorageChartView, linearLayout, robotoTextView4, m117526a, groupAvatarView, linearLayout2, robotoTextView5, linearLayout3, robotoTextView6, relativeLayout, robotoTextView7, robotoTextView8, robotoTextView9, viewStub, zdsActionBar);
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
    public static C30050t8 m148531c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.my_cloud_management_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148530a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139443p;
    }
}
