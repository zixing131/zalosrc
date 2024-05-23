package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.mycloud.TextScrollView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a5 */
/* loaded from: classes3.dex */
public final class C29707a5 implements InterfaceC22715a {

    /* renamed from: p */
    private final DragToCloseLayout f137202p;

    /* renamed from: q */
    public final RobotoTextView f137203q;

    /* renamed from: r */
    public final FrameLayout f137204r;

    /* renamed from: s */
    public final FrameLayout f137205s;

    /* renamed from: t */
    public final LinearLayout f137206t;

    /* renamed from: u */
    public final RobotoTextView f137207u;

    /* renamed from: v */
    public final DragToCloseLayout f137208v;

    /* renamed from: w */
    public final RobotoTextView f137209w;

    /* renamed from: x */
    public final RobotoTextView f137210x;

    /* renamed from: y */
    public final TextScrollView f137211y;

    /* renamed from: z */
    public final RobotoTextView f137212z;

    private C29707a5(DragToCloseLayout dragToCloseLayout, RobotoTextView robotoTextView, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, RobotoTextView robotoTextView2, DragToCloseLayout dragToCloseLayout2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, TextScrollView textScrollView, RobotoTextView robotoTextView5) {
        this.f137202p = dragToCloseLayout;
        this.f137203q = robotoTextView;
        this.f137204r = frameLayout;
        this.f137205s = frameLayout2;
        this.f137206t = linearLayout;
        this.f137207u = robotoTextView2;
        this.f137208v = dragToCloseLayout2;
        this.f137209w = robotoTextView3;
        this.f137210x = robotoTextView4;
        this.f137211y = textScrollView;
        this.f137212z = robotoTextView5;
    }

    /* renamed from: a */
    public static C29707a5 m147714a(View view) {
        int i11 = AbstractC6918a0.add_or_remove_collection_item;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.bottom_sheet_container;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.content_container;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout2 != null) {
                    i11 = AbstractC6918a0.context_menu_container;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.copy_item;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) view;
                            i11 = AbstractC6918a0.forward_item;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.more_option;
                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView4 != null) {
                                    i11 = AbstractC6918a0.scroll_view;
                                    TextScrollView textScrollView = (TextScrollView) AbstractC22716b.m117526a(view, i11);
                                    if (textScrollView != null) {
                                        i11 = AbstractC6918a0.tv_content;
                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView5 != null) {
                                            return new C29707a5(dragToCloseLayout, robotoTextView, frameLayout, frameLayout2, linearLayout, robotoTextView2, dragToCloseLayout, robotoTextView3, robotoTextView4, textScrollView, robotoTextView5);
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
    public static C29707a5 m147715c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_detail_text_msg_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147714a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DragToCloseLayout getRoot() {
        return this.f137202p;
    }
}
