package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.RobotoTextViewStateAware;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j4 */
/* loaded from: classes3.dex */
public final class C29868j4 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextViewStateAware f138253A;

    /* renamed from: B */
    public final RobotoTextViewStateAware f138254B;

    /* renamed from: p */
    private final LinearLayout f138255p;

    /* renamed from: q */
    public final LinearLayout f138256q;

    /* renamed from: r */
    public final LinearLayout f138257r;

    /* renamed from: s */
    public final LinearLayout f138258s;

    /* renamed from: t */
    public final LinearLayout f138259t;

    /* renamed from: u */
    public final View f138260u;

    /* renamed from: v */
    public final View f138261v;

    /* renamed from: w */
    public final RobotoTextViewStateAware f138262w;

    /* renamed from: x */
    public final RobotoTextView f138263x;

    /* renamed from: y */
    public final RobotoTextView f138264y;

    /* renamed from: z */
    public final RobotoTextView f138265z;

    private C29868j4(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, View view, View view2, RobotoTextViewStateAware robotoTextViewStateAware, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextViewStateAware robotoTextViewStateAware2, RobotoTextViewStateAware robotoTextViewStateAware3) {
        this.f138255p = linearLayout;
        this.f138256q = linearLayout2;
        this.f138257r = linearLayout3;
        this.f138258s = linearLayout4;
        this.f138259t = linearLayout5;
        this.f138260u = view;
        this.f138261v = view2;
        this.f138262w = robotoTextViewStateAware;
        this.f138263x = robotoTextView;
        this.f138264y = robotoTextView2;
        this.f138265z = robotoTextView3;
        this.f138253A = robotoTextViewStateAware2;
        this.f138254B = robotoTextViewStateAware3;
    }

    /* renamed from: a */
    public static C29868j4 m148108a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.header_page_all;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.header_page_new_friend;
            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout2 != null) {
                i11 = AbstractC6918a0.header_page_online;
                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout3 != null) {
                    LinearLayout linearLayout4 = (LinearLayout) view;
                    i11 = AbstractC6918a0.reddot_new_friend;
                    View m117526a2 = AbstractC22716b.m117526a(view, i11);
                    if (m117526a2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.separate_line))) != null) {
                        i11 = AbstractC6918a0.title_all_contact;
                        RobotoTextViewStateAware robotoTextViewStateAware = (RobotoTextViewStateAware) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextViewStateAware != null) {
                            i11 = AbstractC6918a0.title_count_contact;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.title_count_new_friend;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.title_count_online;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView3 != null) {
                                        i11 = AbstractC6918a0.title_new_friend;
                                        RobotoTextViewStateAware robotoTextViewStateAware2 = (RobotoTextViewStateAware) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextViewStateAware2 != null) {
                                            i11 = AbstractC6918a0.title_online;
                                            RobotoTextViewStateAware robotoTextViewStateAware3 = (RobotoTextViewStateAware) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextViewStateAware3 != null) {
                                                return new C29868j4(linearLayout4, linearLayout, linearLayout2, linearLayout3, linearLayout4, m117526a2, m117526a, robotoTextViewStateAware, robotoTextView, robotoTextView2, robotoTextView3, robotoTextViewStateAware2, robotoTextViewStateAware3);
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
    public static C29868j4 m148109c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.header_page_tab_contact, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148108a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138255p;
    }
}
