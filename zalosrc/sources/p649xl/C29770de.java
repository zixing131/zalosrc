package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.de */
/* loaded from: classes3.dex */
public final class C29770de implements InterfaceC22715a {

    /* renamed from: A */
    public final ProgressBar f137577A;

    /* renamed from: B */
    public final View f137578B;

    /* renamed from: C */
    public final RecyclingImageView f137579C;

    /* renamed from: D */
    public final RobotoTextView f137580D;

    /* renamed from: E */
    public final RobotoTextView f137581E;

    /* renamed from: p */
    private final FrameLayout f137582p;

    /* renamed from: q */
    public final View f137583q;

    /* renamed from: r */
    public final RobotoTextView f137584r;

    /* renamed from: s */
    public final LinearLayout f137585s;

    /* renamed from: t */
    public final RobotoTextView f137586t;

    /* renamed from: u */
    public final RelativeLayout f137587u;

    /* renamed from: v */
    public final RobotoTextView f137588v;

    /* renamed from: w */
    public final AppCompatImageView f137589w;

    /* renamed from: x */
    public final AppCompatImageView f137590x;

    /* renamed from: y */
    public final RecyclerView f137591y;

    /* renamed from: z */
    public final LinearLayout f137592z;

    private C29770de(FrameLayout frameLayout, View view, RobotoTextView robotoTextView, LinearLayout linearLayout, RobotoTextView robotoTextView2, RelativeLayout relativeLayout, RobotoTextView robotoTextView3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, LinearLayout linearLayout2, ProgressBar progressBar, View view2, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5) {
        this.f137582p = frameLayout;
        this.f137583q = view;
        this.f137584r = robotoTextView;
        this.f137585s = linearLayout;
        this.f137586t = robotoTextView2;
        this.f137587u = relativeLayout;
        this.f137588v = robotoTextView3;
        this.f137589w = appCompatImageView;
        this.f137590x = appCompatImageView2;
        this.f137591y = recyclerView;
        this.f137592z = linearLayout2;
        this.f137577A = progressBar;
        this.f137578B = view2;
        this.f137579C = recyclingImageView;
        this.f137580D = robotoTextView4;
        this.f137581E = robotoTextView5;
    }

    /* renamed from: a */
    public static C29770de m147867a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.bottom_separator;
        View m117526a2 = AbstractC22716b.m117526a(view, i11);
        if (m117526a2 != null) {
            i11 = AbstractC6918a0.btn_cancel;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.btn_container;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.btn_done;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.container;
                        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout != null) {
                            i11 = AbstractC6918a0.empty_edit_pin_board;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.icn_pin_board;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                if (appCompatImageView != null) {
                                    i11 = AbstractC6918a0.icn_topic_type;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                    if (appCompatImageView2 != null) {
                                        i11 = AbstractC6918a0.list_topic;
                                        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                                        if (recyclerView != null) {
                                            i11 = AbstractC6918a0.pending_pin_topic;
                                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout2 != null) {
                                                i11 = AbstractC6918a0.progress_bar;
                                                ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                                                if (progressBar != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.separator_line))) != null) {
                                                    i11 = AbstractC6918a0.thumb_image;
                                                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                                    if (recyclingImageView != null) {
                                                        i11 = AbstractC6918a0.title_tv;
                                                        RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView4 != null) {
                                                            i11 = AbstractC6918a0.tv_title;
                                                            RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView5 != null) {
                                                                return new C29770de((FrameLayout) view, m117526a2, robotoTextView, linearLayout, robotoTextView2, relativeLayout, robotoTextView3, appCompatImageView, appCompatImageView2, recyclerView, linearLayout2, progressBar, m117526a, recyclingImageView, robotoTextView4, robotoTextView5);
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
    public static C29770de m147868c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.unpin_topic_pin_board_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147867a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137582p;
    }
}
