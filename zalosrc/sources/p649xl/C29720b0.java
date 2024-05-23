package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ViewSwitcher;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b0 */
/* loaded from: classes3.dex */
public final class C29720b0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137279p;

    /* renamed from: q */
    public final SyncBannerCommonView f137280q;

    /* renamed from: r */
    public final RobotoTextView f137281r;

    /* renamed from: s */
    public final RecyclingImageView f137282s;

    /* renamed from: t */
    public final RobotoTextView f137283t;

    /* renamed from: u */
    public final ProgressBar f137284u;

    /* renamed from: v */
    public final RelativeLayout f137285v;

    /* renamed from: w */
    public final ViewSwitcher f137286w;

    private C29720b0(FrameLayout frameLayout, SyncBannerCommonView syncBannerCommonView, RobotoTextView robotoTextView, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView2, ProgressBar progressBar, RelativeLayout relativeLayout, ViewSwitcher viewSwitcher) {
        this.f137279p = frameLayout;
        this.f137280q = syncBannerCommonView;
        this.f137281r = robotoTextView;
        this.f137282s = recyclingImageView;
        this.f137283t = robotoTextView2;
        this.f137284u = progressBar;
        this.f137285v = relativeLayout;
        this.f137286w = viewSwitcher;
    }

    /* renamed from: a */
    public static C29720b0 m147745a(View view) {
        int i11 = AbstractC6918a0.banner_result;
        SyncBannerCommonView syncBannerCommonView = (SyncBannerCommonView) AbstractC22716b.m117526a(view, i11);
        if (syncBannerCommonView != null) {
            i11 = AbstractC6918a0.btHidden;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.icon_state;
                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                if (recyclingImageView != null) {
                    i11 = AbstractC6918a0.msg_state;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.progress_state;
                        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                        if (progressBar != null) {
                            i11 = AbstractC6918a0.rl_progress;
                            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout != null) {
                                i11 = AbstractC6918a0.vs_progress_result;
                                ViewSwitcher viewSwitcher = (ViewSwitcher) AbstractC22716b.m117526a(view, i11);
                                if (viewSwitcher != null) {
                                    return new C29720b0((FrameLayout) view, syncBannerCommonView, robotoTextView, recyclingImageView, robotoTextView2, progressBar, relativeLayout, viewSwitcher);
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
    public static C29720b0 m147746c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.banner_backup_restore_top_tab_msg, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147745a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137279p;
    }
}
