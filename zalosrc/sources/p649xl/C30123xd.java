package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.xd */
/* loaded from: classes3.dex */
public final class C30123xd implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f139955A;

    /* renamed from: B */
    public final RobotoTextView f139956B;

    /* renamed from: C */
    public final RobotoTextView f139957C;

    /* renamed from: D */
    public final RobotoTextView f139958D;

    /* renamed from: E */
    public final RobotoTextView f139959E;

    /* renamed from: F */
    public final RobotoTextView f139960F;

    /* renamed from: G */
    public final LinearLayout f139961G;

    /* renamed from: H */
    public final ZdsActionBar f139962H;

    /* renamed from: p */
    private final LinearLayout f139963p;

    /* renamed from: q */
    public final Button f139964q;

    /* renamed from: r */
    public final Button f139965r;

    /* renamed from: s */
    public final Button f139966s;

    /* renamed from: t */
    public final ToolStorageChartView f139967t;

    /* renamed from: u */
    public final LinearLayout f139968u;

    /* renamed from: v */
    public final LinearLayout f139969v;

    /* renamed from: w */
    public final LinearLayout f139970w;

    /* renamed from: x */
    public final ProgressBar f139971x;

    /* renamed from: y */
    public final RecyclerView f139972y;

    /* renamed from: z */
    public final RobotoTextView f139973z;

    private C30123xd(LinearLayout linearLayout, Button button, Button button2, Button button3, ToolStorageChartView toolStorageChartView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar, RecyclerView recyclerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6, RobotoTextView robotoTextView7, LinearLayout linearLayout5, ZdsActionBar zdsActionBar) {
        this.f139963p = linearLayout;
        this.f139964q = button;
        this.f139965r = button2;
        this.f139966s = button3;
        this.f139967t = toolStorageChartView;
        this.f139968u = linearLayout2;
        this.f139969v = linearLayout3;
        this.f139970w = linearLayout4;
        this.f139971x = progressBar;
        this.f139972y = recyclerView;
        this.f139973z = robotoTextView;
        this.f139955A = robotoTextView2;
        this.f139956B = robotoTextView3;
        this.f139957C = robotoTextView4;
        this.f139958D = robotoTextView5;
        this.f139959E = robotoTextView6;
        this.f139960F = robotoTextView7;
        this.f139961G = linearLayout5;
        this.f139962H = zdsActionBar;
    }

    /* renamed from: a */
    public static C30123xd m148706a(View view) {
        int i11 = AbstractC6918a0.btn_clean_big_file;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_clean_cache;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.btn_clean_conversation_data;
                Button button3 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button3 != null) {
                    i11 = AbstractC6918a0.chart;
                    ToolStorageChartView toolStorageChartView = (ToolStorageChartView) AbstractC22716b.m117526a(view, i11);
                    if (toolStorageChartView != null) {
                        i11 = AbstractC6918a0.container_large_file;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.conversation_data_section;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = AbstractC6918a0.loading_container;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout3 != null) {
                                    i11 = AbstractC6918a0.progress_bar_zalo_size;
                                    ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                                    if (progressBar != null) {
                                        i11 = AbstractC6918a0.rcv_largest_files;
                                        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                                        if (recyclerView != null) {
                                            i11 = AbstractC6918a0.tv_cache_size;
                                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView != null) {
                                                i11 = AbstractC6918a0.tv_conversation_data_size;
                                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView2 != null) {
                                                    i11 = AbstractC6918a0.tv_larger_than;
                                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView3 != null) {
                                                        i11 = AbstractC6918a0.tv_others_data;
                                                        RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView4 != null) {
                                                            i11 = AbstractC6918a0.tv_percent;
                                                            RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView5 != null) {
                                                                i11 = AbstractC6918a0.tv_zalo_size;
                                                                RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (robotoTextView6 != null) {
                                                                    i11 = AbstractC6918a0.tv_zalo_size_percentage;
                                                                    RobotoTextView robotoTextView7 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                    if (robotoTextView7 != null) {
                                                                        i11 = AbstractC6918a0.warning_full_storage_container;
                                                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                        if (linearLayout4 != null) {
                                                                            i11 = AbstractC6918a0.zds_action_bar;
                                                                            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                                            if (zdsActionBar != null) {
                                                                                return new C30123xd((LinearLayout) view, button, button2, button3, toolStorageChartView, linearLayout, linearLayout2, linearLayout3, progressBar, recyclerView, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5, robotoTextView6, robotoTextView7, linearLayout4, zdsActionBar);
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
    public static C30123xd m148707c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.tool_storage_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148706a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139963p;
    }
}
