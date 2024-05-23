package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.et.EnterActionEditText;
import com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.ListClickableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.j2 */
/* loaded from: classes5.dex */
public final class C25022j2 implements InterfaceC22715a {

    /* renamed from: A */
    public final LinearLayout f119996A;

    /* renamed from: B */
    public final LinearLayout f119997B;

    /* renamed from: C */
    public final FrameLayout f119998C;

    /* renamed from: D */
    public final LinearLayout f119999D;

    /* renamed from: E */
    public final LinearLayout f120000E;

    /* renamed from: F */
    public final EllipsizedTextView f120001F;

    /* renamed from: G */
    public final C24988b0 f120002G;

    /* renamed from: H */
    public final ViewPager f120003H;

    /* renamed from: p */
    private final FrameLayout f120004p;

    /* renamed from: q */
    public final PageBar f120005q;

    /* renamed from: r */
    public final FrameLayout f120006r;

    /* renamed from: s */
    public final ImageView f120007s;

    /* renamed from: t */
    public final PulseImageView f120008t;

    /* renamed from: u */
    public final BlinkTextView f120009u;

    /* renamed from: v */
    public final EnterActionEditText f120010v;

    /* renamed from: w */
    public final ImageView f120011w;

    /* renamed from: x */
    public final ListClickableRecyclerView f120012x;

    /* renamed from: y */
    public final ListClickableRecyclerView f120013y;

    /* renamed from: z */
    public final LinearLayout f120014z;

    private C25022j2(FrameLayout frameLayout, PageBar pageBar, FrameLayout frameLayout2, ImageView imageView, PulseImageView pulseImageView, BlinkTextView blinkTextView, EnterActionEditText enterActionEditText, ImageView imageView2, ListClickableRecyclerView listClickableRecyclerView, ListClickableRecyclerView listClickableRecyclerView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, FrameLayout frameLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, EllipsizedTextView ellipsizedTextView, C24988b0 c24988b0, ViewPager viewPager) {
        this.f120004p = frameLayout;
        this.f120005q = pageBar;
        this.f120006r = frameLayout2;
        this.f120007s = imageView;
        this.f120008t = pulseImageView;
        this.f120009u = blinkTextView;
        this.f120010v = enterActionEditText;
        this.f120011w = imageView2;
        this.f120012x = listClickableRecyclerView;
        this.f120013y = listClickableRecyclerView2;
        this.f120014z = linearLayout;
        this.f119996A = linearLayout2;
        this.f119997B = linearLayout3;
        this.f119998C = frameLayout3;
        this.f119999D = linearLayout4;
        this.f120000E = linearLayout5;
        this.f120001F = ellipsizedTextView;
        this.f120002G = c24988b0;
        this.f120003H = viewPager;
    }

    /* renamed from: a */
    public static C25022j2 m129860a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.barPage;
        PageBar pageBar = (PageBar) AbstractC22716b.m117526a(view, i11);
        if (pageBar != null) {
            i11 = AbstractC27409d.boxSearch;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC27409d.btnBack;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC27409d.btnClear;
                    PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                    if (pulseImageView != null) {
                        i11 = AbstractC27409d.btnSearch;
                        BlinkTextView blinkTextView = (BlinkTextView) AbstractC22716b.m117526a(view, i11);
                        if (blinkTextView != null) {
                            i11 = AbstractC27409d.edtSearch;
                            EnterActionEditText enterActionEditText = (EnterActionEditText) AbstractC22716b.m117526a(view, i11);
                            if (enterActionEditText != null) {
                                i11 = AbstractC27409d.icoSearch;
                                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                if (imageView2 != null) {
                                    i11 = AbstractC27409d.lstCompletion;
                                    ListClickableRecyclerView listClickableRecyclerView = (ListClickableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                    if (listClickableRecyclerView != null) {
                                        i11 = AbstractC27409d.lstSuggestion;
                                        ListClickableRecyclerView listClickableRecyclerView2 = (ListClickableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                        if (listClickableRecyclerView2 != null) {
                                            i11 = AbstractC27409d.lytCompletion;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout != null) {
                                                i11 = AbstractC27409d.lytContainer;
                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                if (linearLayout2 != null) {
                                                    i11 = AbstractC27409d.lytHeader;
                                                    LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                    if (linearLayout3 != null) {
                                                        FrameLayout frameLayout2 = (FrameLayout) view;
                                                        i11 = AbstractC27409d.lytResult;
                                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                        if (linearLayout4 != null) {
                                                            i11 = AbstractC27409d.lytSuggestion;
                                                            LinearLayout linearLayout5 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                            if (linearLayout5 != null) {
                                                                i11 = AbstractC27409d.txtSearch;
                                                                EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (ellipsizedTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieCompletion))) != null) {
                                                                    C24988b0 m129760a = C24988b0.m129760a(m117526a);
                                                                    i11 = AbstractC27409d.viePager;
                                                                    ViewPager viewPager = (ViewPager) AbstractC22716b.m117526a(view, i11);
                                                                    if (viewPager != null) {
                                                                        return new C25022j2(frameLayout2, pageBar, frameLayout, imageView, pulseImageView, blinkTextView, enterActionEditText, imageView2, listClickableRecyclerView, listClickableRecyclerView2, linearLayout, linearLayout2, linearLayout3, frameLayout2, linearLayout4, linearLayout5, ellipsizedTextView, m129760a, viewPager);
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
    public static C25022j2 m129861c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_search, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129860a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120004p;
    }
}
