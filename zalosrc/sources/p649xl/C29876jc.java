package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.jc */
/* loaded from: classes3.dex */
public final class C29876jc implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138336p;

    /* renamed from: q */
    public final ImageView f138337q;

    /* renamed from: r */
    public final RobotoTextView f138338r;

    /* renamed from: s */
    public final RobotoTextView f138339s;

    /* renamed from: t */
    public final RelativeLayout f138340t;

    /* renamed from: u */
    public final MultiStateView f138341u;

    /* renamed from: v */
    public final RecyclerView f138342v;

    /* renamed from: w */
    public final LinearLayout f138343w;

    /* renamed from: x */
    public final RobotoTextView f138344x;

    /* renamed from: y */
    public final RobotoTextView f138345y;

    /* renamed from: z */
    public final C30063u4 f138346z;

    private C29876jc(LinearLayout linearLayout, ImageView imageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RelativeLayout relativeLayout, MultiStateView multiStateView, RecyclerView recyclerView, LinearLayout linearLayout2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, C30063u4 c30063u4) {
        this.f138336p = linearLayout;
        this.f138337q = imageView;
        this.f138338r = robotoTextView;
        this.f138339s = robotoTextView2;
        this.f138340t = relativeLayout;
        this.f138341u = multiStateView;
        this.f138342v = recyclerView;
        this.f138343w = linearLayout2;
        this.f138344x = robotoTextView3;
        this.f138345y = robotoTextView4;
        this.f138346z = c30063u4;
    }

    /* renamed from: a */
    public static C29876jc m148130a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_clear_multi_thread;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC6918a0.btn_select_all;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.empty_text_view;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    i11 = AbstractC6918a0.layout_delete_popup;
                    RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                    if (relativeLayout != null) {
                        i11 = AbstractC6918a0.multi_state;
                        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                        if (multiStateView != null) {
                            i11 = AbstractC6918a0.rcv_users;
                            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                            if (recyclerView != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                i11 = AbstractC6918a0.tv_selected;
                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView3 != null) {
                                    i11 = AbstractC6918a0.tv_selected_file_size;
                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView4 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.zalo_action_bar))) != null) {
                                        return new C29876jc(linearLayout, imageView, robotoTextView, robotoTextView2, relativeLayout, multiStateView, recyclerView, linearLayout, robotoTextView3, robotoTextView4, C30063u4.m148563a(m117526a));
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
    public static C29876jc m148131c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_tool_storage_list_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148130a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138336p;
    }
}
