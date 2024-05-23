package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.widget.SwitchView;
import com.zing.zalo.shortvideo.p072ui.widget.et.NestedEditText;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.x1 */
/* loaded from: classes5.dex */
public final class C25067x1 implements InterfaceC22715a {

    /* renamed from: A */
    public final SimpleShadowTextView f120411A;

    /* renamed from: B */
    public final SimpleShadowTextView f120412B;

    /* renamed from: p */
    private final ScrollView f120413p;

    /* renamed from: q */
    public final RobotoButton f120414q;

    /* renamed from: r */
    public final NestedEditText f120415r;

    /* renamed from: s */
    public final FrameLayout f120416s;

    /* renamed from: t */
    public final FrameLayout f120417t;

    /* renamed from: u */
    public final RoundedImageView f120418u;

    /* renamed from: v */
    public final RelativeLayout f120419v;

    /* renamed from: w */
    public final OverScrollableRecyclerView f120420w;

    /* renamed from: x */
    public final ScrollView f120421x;

    /* renamed from: y */
    public final SwitchView f120422y;

    /* renamed from: z */
    public final RobotoTextView f120423z;

    private C25067x1(ScrollView scrollView, RobotoButton robotoButton, NestedEditText nestedEditText, FrameLayout frameLayout, FrameLayout frameLayout2, RoundedImageView roundedImageView, RelativeLayout relativeLayout, OverScrollableRecyclerView overScrollableRecyclerView, ScrollView scrollView2, SwitchView switchView, RobotoTextView robotoTextView, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2) {
        this.f120413p = scrollView;
        this.f120414q = robotoButton;
        this.f120415r = nestedEditText;
        this.f120416s = frameLayout;
        this.f120417t = frameLayout2;
        this.f120418u = roundedImageView;
        this.f120419v = relativeLayout;
        this.f120420w = overScrollableRecyclerView;
        this.f120421x = scrollView2;
        this.f120422y = switchView;
        this.f120423z = robotoTextView;
        this.f120411A = simpleShadowTextView;
        this.f120412B = simpleShadowTextView2;
    }

    /* renamed from: a */
    public static C25067x1 m129973a(View view) {
        int i11 = AbstractC27409d.btnSelect;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            i11 = AbstractC27409d.etDesc;
            NestedEditText nestedEditText = (NestedEditText) AbstractC22716b.m117526a(view, i11);
            if (nestedEditText != null) {
                i11 = AbstractC27409d.flLockComment;
                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout != null) {
                    i11 = AbstractC27409d.flSuggest;
                    FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout2 != null) {
                        i11 = AbstractC27409d.ivThumb;
                        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                        if (roundedImageView != null) {
                            i11 = AbstractC27409d.rlEdt;
                            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout != null) {
                                i11 = AbstractC27409d.f129050rv;
                                OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                if (overScrollableRecyclerView != null) {
                                    ScrollView scrollView = (ScrollView) view;
                                    i11 = AbstractC27409d.swvAllowComment;
                                    SwitchView switchView = (SwitchView) AbstractC22716b.m117526a(view, i11);
                                    if (switchView != null) {
                                        i11 = AbstractC27409d.tvAllowComment;
                                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView != null) {
                                            i11 = AbstractC27409d.tvCount;
                                            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                            if (simpleShadowTextView != null) {
                                                i11 = AbstractC27409d.tvHashtag;
                                                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                if (simpleShadowTextView2 != null) {
                                                    return new C25067x1(scrollView, robotoButton, nestedEditText, frameLayout, frameLayout2, roundedImageView, relativeLayout, overScrollableRecyclerView, scrollView, switchView, robotoTextView, simpleShadowTextView, simpleShadowTextView2);
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

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f120413p;
    }
}
