package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p4 */
/* loaded from: classes3.dex */
public final class C29976p4 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f138941A;

    /* renamed from: B */
    public final RobotoTextView f138942B;

    /* renamed from: p */
    private final LinearLayout f138943p;

    /* renamed from: q */
    public final LinearLayout f138944q;

    /* renamed from: r */
    public final RobotoTextView f138945r;

    /* renamed from: s */
    public final RobotoTextView f138946s;

    /* renamed from: t */
    public final ImageButton f138947t;

    /* renamed from: u */
    public final RobotoTextView f138948u;

    /* renamed from: v */
    public final RobotoTextView f138949v;

    /* renamed from: w */
    public final LinearLayout f138950w;

    /* renamed from: x */
    public final LinearLayout f138951x;

    /* renamed from: y */
    public final RecyclerView f138952y;

    /* renamed from: z */
    public final View f138953z;

    private C29976p4(LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ImageButton imageButton, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, LinearLayout linearLayout3, LinearLayout linearLayout4, RecyclerView recyclerView, View view, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6) {
        this.f138943p = linearLayout;
        this.f138944q = linearLayout2;
        this.f138945r = robotoTextView;
        this.f138946s = robotoTextView2;
        this.f138947t = imageButton;
        this.f138948u = robotoTextView3;
        this.f138949v = robotoTextView4;
        this.f138950w = linearLayout3;
        this.f138951x = linearLayout4;
        this.f138952y = recyclerView;
        this.f138953z = view;
        this.f138941A = robotoTextView5;
        this.f138942B = robotoTextView6;
    }

    /* renamed from: a */
    public static C29976p4 m148356a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.bottom_button_layout_container;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.btn_action;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.btn_cancel;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    i11 = AbstractC6918a0.btn_close;
                    ImageButton imageButton = (ImageButton) AbstractC22716b.m117526a(view, i11);
                    if (imageButton != null) {
                        i11 = AbstractC6918a0.btn_recall_all_add_member;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            i11 = AbstractC6918a0.btn_sure;
                            RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView4 != null) {
                                i11 = AbstractC6918a0.layout_header;
                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout2 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                    i11 = AbstractC6918a0.rv_invite_contact_list;
                                    RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                                    if (recyclerView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.top_divider))) != null) {
                                        i11 = AbstractC6918a0.tv_hint;
                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView5 != null) {
                                            i11 = AbstractC6918a0.tv_title;
                                            RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView6 != null) {
                                                return new C29976p4(linearLayout3, linearLayout, robotoTextView, robotoTextView2, imageButton, robotoTextView3, robotoTextView4, linearLayout2, linearLayout3, recyclerView, m117526a, robotoTextView5, robotoTextView6);
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
    public static C29976p4 m148357c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.invite_contact_list_dialog_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148356a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138943p;
    }
}
