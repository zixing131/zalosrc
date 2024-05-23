package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.edittext.PhoneInputCustom;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingFrameLayout;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e */
/* loaded from: classes3.dex */
public final class C29773e implements InterfaceC22715a {

    /* renamed from: A */
    public final MultiStateView f137605A;

    /* renamed from: B */
    public final RobotoTextView f137606B;

    /* renamed from: C */
    public final RobotoTextView f137607C;

    /* renamed from: D */
    public final ZdsActionBar f137608D;

    /* renamed from: p */
    private final LinearLayout f137609p;

    /* renamed from: q */
    public final Button f137610q;

    /* renamed from: r */
    public final LinearLayout f137611r;

    /* renamed from: s */
    public final RobotoTextView f137612s;

    /* renamed from: t */
    public final PhoneInputCustom f137613t;

    /* renamed from: u */
    public final ListItemSetting f137614u;

    /* renamed from: v */
    public final ListItemSetting f137615v;

    /* renamed from: w */
    public final ListItemSetting f137616w;

    /* renamed from: x */
    public final TrackingFrameLayout f137617x;

    /* renamed from: y */
    public final RecyclingImageView f137618y;

    /* renamed from: z */
    public final ScrollView f137619z;

    private C29773e(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, RobotoTextView robotoTextView, PhoneInputCustom phoneInputCustom, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, TrackingFrameLayout trackingFrameLayout, RecyclingImageView recyclingImageView, ScrollView scrollView, MultiStateView multiStateView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ZdsActionBar zdsActionBar) {
        this.f137609p = linearLayout;
        this.f137610q = button;
        this.f137611r = linearLayout2;
        this.f137612s = robotoTextView;
        this.f137613t = phoneInputCustom;
        this.f137614u = listItemSetting;
        this.f137615v = listItemSetting2;
        this.f137616w = listItemSetting3;
        this.f137617x = trackingFrameLayout;
        this.f137618y = recyclingImageView;
        this.f137619z = scrollView;
        this.f137605A = multiStateView;
        this.f137606B = robotoTextView2;
        this.f137607C = robotoTextView3;
        this.f137608D = zdsActionBar;
    }

    /* renamed from: a */
    public static C29773e m147873a(View view) {
        int i11 = AbstractC6918a0.btnNext;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.content_view;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.desc_qr_code;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.edtPhone;
                    PhoneInputCustom phoneInputCustom = (PhoneInputCustom) AbstractC22716b.m117526a(view, i11);
                    if (phoneInputCustom != null) {
                        i11 = AbstractC6918a0.item_contact_native;
                        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting != null) {
                            i11 = AbstractC6918a0.item_scan_qr_code;
                            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting2 != null) {
                                i11 = AbstractC6918a0.item_suggest_friend;
                                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting3 != null) {
                                    i11 = AbstractC6918a0.layout_qr_code;
                                    TrackingFrameLayout trackingFrameLayout = (TrackingFrameLayout) AbstractC22716b.m117526a(view, i11);
                                    if (trackingFrameLayout != null) {
                                        i11 = AbstractC6918a0.qr_code_view;
                                        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                        if (recyclingImageView != null) {
                                            i11 = AbstractC6918a0.scroll_view;
                                            ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                                            if (scrollView != null) {
                                                i11 = AbstractC6918a0.state_view;
                                                MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                                                if (multiStateView != null) {
                                                    i11 = AbstractC6918a0.title_qr_code;
                                                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView2 != null) {
                                                        i11 = AbstractC6918a0.tv_request_friend;
                                                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView3 != null) {
                                                            i11 = AbstractC6918a0.zds_action_bar;
                                                            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                            if (zdsActionBar != null) {
                                                                return new C29773e((LinearLayout) view, button, linearLayout, robotoTextView, phoneInputCustom, listItemSetting, listItemSetting2, listItemSetting3, trackingFrameLayout, recyclingImageView, scrollView, multiStateView, robotoTextView2, robotoTextView3, zdsActionBar);
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
    public static C29773e m147874c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.add_friend_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147873a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137609p;
    }
}
