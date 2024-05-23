package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.KeyboardAwareRelativeLayout;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i4 */
/* loaded from: classes3.dex */
public final class C29850i4 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f138131A;

    /* renamed from: B */
    public final ZdsActionBar f138132B;

    /* renamed from: p */
    private final KeyboardFrameLayout f138133p;

    /* renamed from: q */
    public final RobotoTextView f138134q;

    /* renamed from: r */
    public final KeyboardAwareRelativeLayout f138135r;

    /* renamed from: s */
    public final RelativeLayout f138136s;

    /* renamed from: t */
    public final CustomEditText f138137t;

    /* renamed from: u */
    public final MultiStateView f138138u;

    /* renamed from: v */
    public final RelativeLayout f138139v;

    /* renamed from: w */
    public final RobotoTextView f138140w;

    /* renamed from: x */
    public final RelativeLayout f138141x;

    /* renamed from: y */
    public final RelativeLayout f138142y;

    /* renamed from: z */
    public final RecyclerView f138143z;

    private C29850i4(KeyboardFrameLayout keyboardFrameLayout, RobotoTextView robotoTextView, KeyboardAwareRelativeLayout keyboardAwareRelativeLayout, RelativeLayout relativeLayout, CustomEditText customEditText, MultiStateView multiStateView, RelativeLayout relativeLayout2, RobotoTextView robotoTextView2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RecyclerView recyclerView, RobotoTextView robotoTextView3, ZdsActionBar zdsActionBar) {
        this.f138133p = keyboardFrameLayout;
        this.f138134q = robotoTextView;
        this.f138135r = keyboardAwareRelativeLayout;
        this.f138136s = relativeLayout;
        this.f138137t = customEditText;
        this.f138138u = multiStateView;
        this.f138139v = relativeLayout2;
        this.f138140w = robotoTextView2;
        this.f138141x = relativeLayout3;
        this.f138142y = relativeLayout4;
        this.f138143z = recyclerView;
        this.f138131A = robotoTextView3;
        this.f138132B = zdsActionBar;
    }

    /* renamed from: a */
    public static C29850i4 m148065a(View view) {
        int i11 = AbstractC6918a0.btn_send_poll;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.container;
            KeyboardAwareRelativeLayout keyboardAwareRelativeLayout = (KeyboardAwareRelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (keyboardAwareRelativeLayout != null) {
                i11 = AbstractC6918a0.container_footer;
                RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (relativeLayout != null) {
                    i11 = AbstractC6918a0.et_option_input;
                    CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
                    if (customEditText != null) {
                        i11 = AbstractC6918a0.multi_state;
                        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                        if (multiStateView != null) {
                            i11 = AbstractC6918a0.poll_add_option_view;
                            RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout2 != null) {
                                i11 = AbstractC6918a0.poll_closed_text_view;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.poll_closed_view;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                    if (relativeLayout3 != null) {
                                        i11 = AbstractC6918a0.poll_save_view;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                        if (relativeLayout4 != null) {
                                            i11 = AbstractC6918a0.rv_poll_detail;
                                            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                                            if (recyclerView != null) {
                                                i11 = AbstractC6918a0.tv_option_action;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView3 != null) {
                                                    i11 = AbstractC6918a0.zds_action_bar;
                                                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                    if (zdsActionBar != null) {
                                                        return new C29850i4((KeyboardFrameLayout) view, robotoTextView, keyboardAwareRelativeLayout, relativeLayout, customEditText, multiStateView, relativeLayout2, robotoTextView2, relativeLayout3, relativeLayout4, recyclerView, robotoTextView3, zdsActionBar);
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
    public static C29850i4 m148066c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_poll_voting_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148065a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardFrameLayout getRoot() {
        return this.f138133p;
    }
}
