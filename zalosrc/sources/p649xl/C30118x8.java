package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.qrcode.p069ui.MyQRImageView;
import com.zing.zalo.zview.actionbar.ActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x8 */
/* loaded from: classes3.dex */
public final class C30118x8 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f139910A;

    /* renamed from: B */
    public final MyQRImageView f139911B;

    /* renamed from: C */
    public final RobotoTextView f139912C;

    /* renamed from: D */
    public final RobotoTextView f139913D;

    /* renamed from: E */
    public final ActionBar f139914E;

    /* renamed from: p */
    private final RelativeLayout f139915p;

    /* renamed from: q */
    public final RecyclingImageView f139916q;

    /* renamed from: r */
    public final RecyclingImageView f139917r;

    /* renamed from: s */
    public final RobotoTextView f139918s;

    /* renamed from: t */
    public final RecyclingImageView f139919t;

    /* renamed from: u */
    public final LinearLayout f139920u;

    /* renamed from: v */
    public final LinearLayout f139921v;

    /* renamed from: w */
    public final LinearLayout f139922w;

    /* renamed from: x */
    public final ZAppCompatImageView f139923x;

    /* renamed from: y */
    public final LinearLayout f139924y;

    /* renamed from: z */
    public final MultiStateView f139925z;

    private C30118x8(RelativeLayout relativeLayout, RecyclingImageView recyclingImageView, RecyclingImageView recyclingImageView2, RobotoTextView robotoTextView, RecyclingImageView recyclingImageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout4, MultiStateView multiStateView, RobotoTextView robotoTextView2, MyQRImageView myQRImageView, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, ActionBar actionBar) {
        this.f139915p = relativeLayout;
        this.f139916q = recyclingImageView;
        this.f139917r = recyclingImageView2;
        this.f139918s = robotoTextView;
        this.f139919t = recyclingImageView3;
        this.f139920u = linearLayout;
        this.f139921v = linearLayout2;
        this.f139922w = linearLayout3;
        this.f139923x = zAppCompatImageView;
        this.f139924y = linearLayout4;
        this.f139925z = multiStateView;
        this.f139910A = robotoTextView2;
        this.f139911B = myQRImageView;
        this.f139912C = robotoTextView3;
        this.f139913D = robotoTextView4;
        this.f139914E = actionBar;
    }

    /* renamed from: a */
    public static C30118x8 m148692a(View view) {
        int i11 = AbstractC6918a0.avt;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.btnDownload;
            RecyclingImageView recyclingImageView2 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView2 != null) {
                i11 = AbstractC6918a0.btn_enable;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.btnShare;
                    RecyclingImageView recyclingImageView3 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                    if (recyclingImageView3 != null) {
                        i11 = AbstractC6918a0.buttons_layout;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.circular_loading;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = AbstractC6918a0.disable_layout;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout3 != null) {
                                    i11 = AbstractC6918a0.icVipStatus;
                                    ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                    if (zAppCompatImageView != null) {
                                        i11 = AbstractC6918a0.info_layout;
                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                        if (linearLayout4 != null) {
                                            i11 = AbstractC6918a0.multiState;
                                            MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                                            if (multiStateView != null) {
                                                i11 = AbstractC6918a0.name;
                                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView2 != null) {
                                                    i11 = AbstractC6918a0.qr_code_view;
                                                    MyQRImageView myQRImageView = (MyQRImageView) AbstractC22716b.m117526a(view, i11);
                                                    if (myQRImageView != null) {
                                                        i11 = AbstractC6918a0.tv_hint;
                                                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView3 != null) {
                                                            i11 = AbstractC6918a0.tv_scan_qrcode;
                                                            RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView4 != null) {
                                                                i11 = AbstractC6918a0.zalo_action_bar;
                                                                ActionBar actionBar = (ActionBar) AbstractC22716b.m117526a(view, i11);
                                                                if (actionBar != null) {
                                                                    return new C30118x8((RelativeLayout) view, recyclingImageView, recyclingImageView2, robotoTextView, recyclingImageView3, linearLayout, linearLayout2, linearLayout3, zAppCompatImageView, linearLayout4, multiStateView, robotoTextView2, myQRImageView, robotoTextView3, robotoTextView4, actionBar);
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
    public static C30118x8 m148693c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.my_qr_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148692a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139915p;
    }
}
