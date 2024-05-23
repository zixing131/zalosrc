package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b8 */
/* loaded from: classes3.dex */
public final class C29728b8 implements InterfaceC22715a {

    /* renamed from: A */
    public final StencilSwitch f137315A;

    /* renamed from: B */
    public final RobotoTextView f137316B;

    /* renamed from: p */
    private final FrameLayout f137317p;

    /* renamed from: q */
    public final GroupAvatarView f137318q;

    /* renamed from: r */
    public final View f137319r;

    /* renamed from: s */
    public final View f137320s;

    /* renamed from: t */
    public final View f137321t;

    /* renamed from: u */
    public final LinearLayout f137322u;

    /* renamed from: v */
    public final LinearLayout f137323v;

    /* renamed from: w */
    public final TextView f137324w;

    /* renamed from: x */
    public final TextView f137325x;

    /* renamed from: y */
    public final LinearLayout f137326y;

    /* renamed from: z */
    public final StencilSwitch f137327z;

    private C29728b8(FrameLayout frameLayout, GroupAvatarView groupAvatarView, View view, View view2, View view3, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, LinearLayout linearLayout3, StencilSwitch stencilSwitch, StencilSwitch stencilSwitch2, RobotoTextView robotoTextView) {
        this.f137317p = frameLayout;
        this.f137318q = groupAvatarView;
        this.f137319r = view;
        this.f137320s = view2;
        this.f137321t = view3;
        this.f137322u = linearLayout;
        this.f137323v = linearLayout2;
        this.f137324w = textView;
        this.f137325x = textView2;
        this.f137326y = linearLayout3;
        this.f137327z = stencilSwitch;
        this.f137315A = stencilSwitch2;
        this.f137316B = robotoTextView;
    }

    /* renamed from: a */
    public static C29728b8 m147766a(View view) {
        View m117526a;
        View m117526a2;
        View m117526a3;
        int i11 = AbstractC6918a0.img_avt;
        GroupAvatarView groupAvatarView = (GroupAvatarView) AbstractC22716b.m117526a(view, i11);
        if (groupAvatarView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_add_favorite))) != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_block_msg))) != null && (m117526a3 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_change_alias))) != null) {
            i11 = AbstractC6918a0.llAddFavorite;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.llBlockMsg;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout2 != null) {
                    i11 = AbstractC6918a0.llChangeAlias;
                    TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
                    if (textView != null) {
                        i11 = AbstractC6918a0.llDelete;
                        TextView textView2 = (TextView) AbstractC22716b.m117526a(view, i11);
                        if (textView2 != null) {
                            i11 = AbstractC6918a0.llProfile;
                            LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout3 != null) {
                                i11 = AbstractC6918a0.swAddFavorite;
                                StencilSwitch stencilSwitch = (StencilSwitch) AbstractC22716b.m117526a(view, i11);
                                if (stencilSwitch != null) {
                                    i11 = AbstractC6918a0.swBlockMsg;
                                    StencilSwitch stencilSwitch2 = (StencilSwitch) AbstractC22716b.m117526a(view, i11);
                                    if (stencilSwitch2 != null) {
                                        i11 = AbstractC6918a0.tv_name;
                                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView != null) {
                                            return new C29728b8((FrameLayout) view, groupAvatarView, m117526a, m117526a2, m117526a3, linearLayout, linearLayout2, textView, textView2, linearLayout3, stencilSwitch, stencilSwitch2, robotoTextView);
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
    public static C29728b8 m147767c(LayoutInflater layoutInflater) {
        return m147768d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29728b8 m147768d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.menu_contact_dialog_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147766a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137317p;
    }
}
