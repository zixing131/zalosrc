package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.KeyboardAwareLinearLayout;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.db */
/* loaded from: classes3.dex */
public final class C29767db implements InterfaceC22715a {

    /* renamed from: A */
    public final ZdsActionBar f137557A;

    /* renamed from: p */
    private final KeyboardAwareLinearLayout f137558p;

    /* renamed from: q */
    public final ZAppCompatImageView f137559q;

    /* renamed from: r */
    public final LinearLayout f137560r;

    /* renamed from: s */
    public final KeyboardAwareLinearLayout f137561s;

    /* renamed from: t */
    public final MultiStateView f137562t;

    /* renamed from: u */
    public final View f137563u;

    /* renamed from: v */
    public final RecyclerView f137564v;

    /* renamed from: w */
    public final RecyclerView f137565w;

    /* renamed from: x */
    public final FrameLayout f137566x;

    /* renamed from: y */
    public final CustomEditText f137567y;

    /* renamed from: z */
    public final LinearLayout f137568z;

    private C29767db(KeyboardAwareLinearLayout keyboardAwareLinearLayout, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout, KeyboardAwareLinearLayout keyboardAwareLinearLayout2, MultiStateView multiStateView, View view, RecyclerView recyclerView, RecyclerView recyclerView2, FrameLayout frameLayout, CustomEditText customEditText, LinearLayout linearLayout2, ZdsActionBar zdsActionBar) {
        this.f137558p = keyboardAwareLinearLayout;
        this.f137559q = zAppCompatImageView;
        this.f137560r = linearLayout;
        this.f137561s = keyboardAwareLinearLayout2;
        this.f137562t = multiStateView;
        this.f137563u = view;
        this.f137564v = recyclerView;
        this.f137565w = recyclerView2;
        this.f137566x = frameLayout;
        this.f137567y = customEditText;
        this.f137568z = linearLayout2;
        this.f137557A = zdsActionBar;
    }

    /* renamed from: a */
    public static C29767db m147860a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_done;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.content_section_footer;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                KeyboardAwareLinearLayout keyboardAwareLinearLayout = (KeyboardAwareLinearLayout) view;
                i11 = AbstractC6918a0.multi_state;
                MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                if (multiStateView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.padding_view))) != null) {
                    i11 = AbstractC6918a0.rv_bubbles;
                    RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (recyclerView != null) {
                        i11 = AbstractC6918a0.rv_contact;
                        RecyclerView recyclerView2 = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                        if (recyclerView2 != null) {
                            i11 = AbstractC6918a0.search_input_layout;
                            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout != null) {
                                i11 = AbstractC6918a0.search_input_text;
                                CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
                                if (customEditText != null) {
                                    i11 = AbstractC6918a0.section_footer;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = AbstractC6918a0.zds_action_bar;
                                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                        if (zdsActionBar != null) {
                                            return new C29767db(keyboardAwareLinearLayout, zAppCompatImageView, linearLayout, keyboardAwareLinearLayout, multiStateView, m117526a, recyclerView, recyclerView2, frameLayout, customEditText, linearLayout2, zdsActionBar);
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

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardAwareLinearLayout getRoot() {
        return this.f137558p;
    }
}
