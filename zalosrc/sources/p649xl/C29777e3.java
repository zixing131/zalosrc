package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e3 */
/* loaded from: classes3.dex */
public final class C29777e3 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f137640A;

    /* renamed from: p */
    private final FrameLayout f137641p;

    /* renamed from: q */
    public final View f137642q;

    /* renamed from: r */
    public final RelativeLayout f137643r;

    /* renamed from: s */
    public final RobotoTextView f137644s;

    /* renamed from: t */
    public final RelativeLayout f137645t;

    /* renamed from: u */
    public final RobotoTextView f137646u;

    /* renamed from: v */
    public final AppCompatImageView f137647v;

    /* renamed from: w */
    public final RecyclerView f137648w;

    /* renamed from: x */
    public final ProgressBar f137649x;

    /* renamed from: y */
    public final View f137650y;

    /* renamed from: z */
    public final RobotoTextView f137651z;

    private C29777e3(FrameLayout frameLayout, View view, RelativeLayout relativeLayout, RobotoTextView robotoTextView, RelativeLayout relativeLayout2, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, RecyclerView recyclerView, ProgressBar progressBar, View view2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f137641p = frameLayout;
        this.f137642q = view;
        this.f137643r = relativeLayout;
        this.f137644s = robotoTextView;
        this.f137645t = relativeLayout2;
        this.f137646u = robotoTextView2;
        this.f137647v = appCompatImageView;
        this.f137648w = recyclerView;
        this.f137649x = progressBar;
        this.f137650y = view2;
        this.f137651z = robotoTextView3;
        this.f137640A = robotoTextView4;
    }

    /* renamed from: a */
    public static C29777e3 m147885a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.bottom_separator;
        View m117526a2 = AbstractC22716b.m117526a(view, i11);
        if (m117526a2 != null) {
            i11 = AbstractC6918a0.btn_container;
            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout != null) {
                i11 = AbstractC6918a0.btn_done;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.container;
                    RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                    if (relativeLayout2 != null) {
                        i11 = AbstractC6918a0.empty_edit_pin_board;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            i11 = AbstractC6918a0.icn_pin_board;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (appCompatImageView != null) {
                                i11 = AbstractC6918a0.list_topic;
                                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                                if (recyclerView != null) {
                                    i11 = AbstractC6918a0.progress_bar;
                                    ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                                    if (progressBar != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.separator_line))) != null) {
                                        i11 = AbstractC6918a0.subtitle_tv;
                                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView3 != null) {
                                            i11 = AbstractC6918a0.title_tv;
                                            RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView4 != null) {
                                                return new C29777e3((FrameLayout) view, m117526a2, relativeLayout, robotoTextView, relativeLayout2, robotoTextView2, appCompatImageView, recyclerView, progressBar, m117526a, robotoTextView3, robotoTextView4);
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
    public static C29777e3 m147886c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.edit_pin_board_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147885a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137641p;
    }
}
