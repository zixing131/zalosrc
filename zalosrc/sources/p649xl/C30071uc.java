package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.PieChartView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.uc */
/* loaded from: classes3.dex */
public final class C30071uc implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f139584A;

    /* renamed from: B */
    public final RobotoTextView f139585B;

    /* renamed from: C */
    public final RobotoTextView f139586C;

    /* renamed from: D */
    public final ImageView f139587D;

    /* renamed from: E */
    public final ImageView f139588E;

    /* renamed from: F */
    public final ImageView f139589F;

    /* renamed from: G */
    public final ZdsActionBar f139590G;

    /* renamed from: p */
    private final LinearLayout f139591p;

    /* renamed from: q */
    public final RobotoTextView f139592q;

    /* renamed from: r */
    public final RobotoTextView f139593r;

    /* renamed from: s */
    public final LinearLayout f139594s;

    /* renamed from: t */
    public final ScrollViewVisibleChildViewDetector f139595t;

    /* renamed from: u */
    public final PieChartView f139596u;

    /* renamed from: v */
    public final RobotoTextView f139597v;

    /* renamed from: w */
    public final RobotoTextView f139598w;

    /* renamed from: x */
    public final RobotoTextView f139599x;

    /* renamed from: y */
    public final RobotoTextView f139600y;

    /* renamed from: z */
    public final RobotoTextView f139601z;

    private C30071uc(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, LinearLayout linearLayout2, ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector, PieChartView pieChartView, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6, RobotoTextView robotoTextView7, RobotoTextView robotoTextView8, RobotoTextView robotoTextView9, RobotoTextView robotoTextView10, ImageView imageView, ImageView imageView2, ImageView imageView3, ZdsActionBar zdsActionBar) {
        this.f139591p = linearLayout;
        this.f139592q = robotoTextView;
        this.f139593r = robotoTextView2;
        this.f139594s = linearLayout2;
        this.f139595t = scrollViewVisibleChildViewDetector;
        this.f139596u = pieChartView;
        this.f139597v = robotoTextView3;
        this.f139598w = robotoTextView4;
        this.f139599x = robotoTextView5;
        this.f139600y = robotoTextView6;
        this.f139601z = robotoTextView7;
        this.f139584A = robotoTextView8;
        this.f139585B = robotoTextView9;
        this.f139586C = robotoTextView10;
        this.f139587D = imageView;
        this.f139588E = imageView2;
        this.f139589F = imageView3;
        this.f139590G = zdsActionBar;
    }

    /* renamed from: a */
    public static C30071uc m148585a(View view) {
        int i11 = AbstractC6918a0.btn_clear_cache;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_storage_usage;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.ll_title_conversation_data;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.main_scroll_view;
                    ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) AbstractC22716b.m117526a(view, i11);
                    if (scrollViewVisibleChildViewDetector != null) {
                        i11 = AbstractC6918a0.piechart;
                        PieChartView pieChartView = (PieChartView) AbstractC22716b.m117526a(view, i11);
                        if (pieChartView != null) {
                            i11 = AbstractC6918a0.txtApp;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.txtCache;
                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView4 != null) {
                                    i11 = AbstractC6918a0.txtFree;
                                    RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView5 != null) {
                                        i11 = AbstractC6918a0.txtOther;
                                        RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView6 != null) {
                                            i11 = AbstractC6918a0.txtStorage;
                                            RobotoTextView robotoTextView7 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView7 != null) {
                                                i11 = AbstractC6918a0.txtTypeCache;
                                                RobotoTextView robotoTextView8 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView8 != null) {
                                                    i11 = AbstractC6918a0.txtTypeFree;
                                                    RobotoTextView robotoTextView9 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView9 != null) {
                                                        i11 = AbstractC6918a0.txtTypeUsage;
                                                        RobotoTextView robotoTextView10 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView10 != null) {
                                                            i11 = AbstractC6918a0.typeCache;
                                                            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                            if (imageView != null) {
                                                                i11 = AbstractC6918a0.typeFree;
                                                                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                                if (imageView2 != null) {
                                                                    i11 = AbstractC6918a0.typeUsage;
                                                                    ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                                                    if (imageView3 != null) {
                                                                        i11 = AbstractC6918a0.zds_action_bar;
                                                                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                                        if (zdsActionBar != null) {
                                                                            return new C30071uc((LinearLayout) view, robotoTextView, robotoTextView2, linearLayout, scrollViewVisibleChildViewDetector, pieChartView, robotoTextView3, robotoTextView4, robotoTextView5, robotoTextView6, robotoTextView7, robotoTextView8, robotoTextView9, robotoTextView10, imageView, imageView2, imageView3, zdsActionBar);
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
    public static C30071uc m148586c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.storage_usage_and_cache_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148585a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139591p;
    }
}
