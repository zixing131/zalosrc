package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i1 */
/* loaded from: classes3.dex */
public final class C29847i1 implements InterfaceC22715a {

    /* renamed from: A */
    public final LinearLayout f138102A;

    /* renamed from: B */
    public final TextView f138103B;

    /* renamed from: C */
    public final ZdsActionBar f138104C;

    /* renamed from: p */
    private final LinearLayout f138105p;

    /* renamed from: q */
    public final TextView f138106q;

    /* renamed from: r */
    public final TextView f138107r;

    /* renamed from: s */
    public final TextView f138108s;

    /* renamed from: t */
    public final TextView f138109t;

    /* renamed from: u */
    public final TextView f138110u;

    /* renamed from: v */
    public final TextView f138111v;

    /* renamed from: w */
    public final TextView f138112w;

    /* renamed from: x */
    public final LinearLayout f138113x;

    /* renamed from: y */
    public final TextView f138114y;

    /* renamed from: z */
    public final TextView f138115z;

    private C29847i1(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LinearLayout linearLayout2, TextView textView8, TextView textView9, LinearLayout linearLayout3, TextView textView10, ZdsActionBar zdsActionBar) {
        this.f138105p = linearLayout;
        this.f138106q = textView;
        this.f138107r = textView2;
        this.f138108s = textView3;
        this.f138109t = textView4;
        this.f138110u = textView5;
        this.f138111v = textView6;
        this.f138112w = textView7;
        this.f138113x = linearLayout2;
        this.f138114y = textView8;
        this.f138115z = textView9;
        this.f138102A = linearLayout3;
        this.f138103B = textView10;
        this.f138104C = zdsActionBar;
    }

    /* renamed from: a */
    public static C29847i1 m148056a(View view) {
        int i11 = AbstractC6918a0.build_info_abi_tv;
        TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
        if (textView != null) {
            i11 = AbstractC6918a0.build_info_buildId_tv;
            TextView textView2 = (TextView) AbstractC22716b.m117526a(view, i11);
            if (textView2 != null) {
                i11 = AbstractC6918a0.build_info_buildTime_tv;
                TextView textView3 = (TextView) AbstractC22716b.m117526a(view, i11);
                if (textView3 != null) {
                    i11 = AbstractC6918a0.build_info_builder_tv;
                    TextView textView4 = (TextView) AbstractC22716b.m117526a(view, i11);
                    if (textView4 != null) {
                        i11 = AbstractC6918a0.build_info_git_branch_tv;
                        TextView textView5 = (TextView) AbstractC22716b.m117526a(view, i11);
                        if (textView5 != null) {
                            i11 = AbstractC6918a0.build_info_git_commit_tv;
                            TextView textView6 = (TextView) AbstractC22716b.m117526a(view, i11);
                            if (textView6 != null) {
                                i11 = AbstractC6918a0.build_info_installed_module_tv;
                                TextView textView7 = (TextView) AbstractC22716b.m117526a(view, i11);
                                if (textView7 != null) {
                                    LinearLayout linearLayout = (LinearLayout) view;
                                    i11 = AbstractC6918a0.build_info_pipeline_id_tv;
                                    TextView textView8 = (TextView) AbstractC22716b.m117526a(view, i11);
                                    if (textView8 != null) {
                                        i11 = AbstractC6918a0.build_info_version_code_tv;
                                        TextView textView9 = (TextView) AbstractC22716b.m117526a(view, i11);
                                        if (textView9 != null) {
                                            i11 = AbstractC6918a0.build_info_view_root;
                                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout2 != null) {
                                                i11 = AbstractC6918a0.tv_chat_db_info;
                                                TextView textView10 = (TextView) AbstractC22716b.m117526a(view, i11);
                                                if (textView10 != null) {
                                                    i11 = AbstractC6918a0.zds_action_bar;
                                                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                    if (zdsActionBar != null) {
                                                        return new C29847i1(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, textView8, textView9, linearLayout2, textView10, zdsActionBar);
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
    public static C29847i1 m148057c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.build_info_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148056a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138105p;
    }
}
