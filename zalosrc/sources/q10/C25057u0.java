package q10;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ExtraActionLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.u0 */
/* loaded from: classes5.dex */
public final class C25057u0 implements InterfaceC22715a {

    /* renamed from: A */
    public final LinearLayout f120320A;

    /* renamed from: B */
    public final LinearLayout f120321B;

    /* renamed from: C */
    public final LinearLayout f120322C;

    /* renamed from: D */
    public final LinearLayout f120323D;

    /* renamed from: E */
    public final SimpleShadowTextView f120324E;

    /* renamed from: F */
    public final EllipsizedTextView f120325F;

    /* renamed from: G */
    public final SimpleShadowTextView f120326G;

    /* renamed from: H */
    public final SimpleShadowTextView f120327H;

    /* renamed from: I */
    public final SimpleShadowTextView f120328I;

    /* renamed from: p */
    private final NormalVideoItem f120329p;

    /* renamed from: q */
    public final SimpleShadowTextView f120330q;

    /* renamed from: r */
    public final SimpleShadowTextView f120331r;

    /* renamed from: s */
    public final SimpleShadowTextView f120332s;

    /* renamed from: t */
    public final RecyclingImageView f120333t;

    /* renamed from: u */
    public final RecyclingImageView f120334u;

    /* renamed from: v */
    public final RoundedImageView f120335v;

    /* renamed from: w */
    public final ImageView f120336w;

    /* renamed from: x */
    public final ImageView f120337x;

    /* renamed from: y */
    public final ExtraActionLayout f120338y;

    /* renamed from: z */
    public final LinearLayout f120339z;

    private C25057u0(NormalVideoItem normalVideoItem, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, RecyclingImageView recyclingImageView, RecyclingImageView recyclingImageView2, RoundedImageView roundedImageView, ImageView imageView, ImageView imageView2, ExtraActionLayout extraActionLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, SimpleShadowTextView simpleShadowTextView4, EllipsizedTextView ellipsizedTextView, SimpleShadowTextView simpleShadowTextView5, SimpleShadowTextView simpleShadowTextView6, SimpleShadowTextView simpleShadowTextView7) {
        this.f120329p = normalVideoItem;
        this.f120330q = simpleShadowTextView;
        this.f120331r = simpleShadowTextView2;
        this.f120332s = simpleShadowTextView3;
        this.f120333t = recyclingImageView;
        this.f120334u = recyclingImageView2;
        this.f120335v = roundedImageView;
        this.f120336w = imageView;
        this.f120337x = imageView2;
        this.f120338y = extraActionLayout;
        this.f120339z = linearLayout;
        this.f120320A = linearLayout2;
        this.f120321B = linearLayout3;
        this.f120322C = linearLayout4;
        this.f120323D = linearLayout5;
        this.f120324E = simpleShadowTextView4;
        this.f120325F = ellipsizedTextView;
        this.f120326G = simpleShadowTextView5;
        this.f120327H = simpleShadowTextView6;
        this.f120328I = simpleShadowTextView7;
    }

    /* renamed from: a */
    public static C25057u0 m129945a(View view) {
        int i11 = AbstractC27409d.btnExtraAction;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.btnWarningSensitivePlay;
            SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView2 != null) {
                i11 = AbstractC27409d.btnWarningSensitiveSkip;
                SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView3 != null) {
                    i11 = AbstractC27409d.icoPromoteFooter;
                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                    if (recyclingImageView != null) {
                        i11 = AbstractC27409d.icoPromoteFooterChevron;
                        RecyclingImageView recyclingImageView2 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                        if (recyclingImageView2 != null) {
                            i11 = AbstractC27409d.icoPromoteLink;
                            RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                            if (roundedImageView != null) {
                                i11 = AbstractC27409d.icoWarningDangerous;
                                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                                if (imageView != null) {
                                    i11 = AbstractC27409d.icoWarningSensitive;
                                    ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                    if (imageView2 != null) {
                                        i11 = AbstractC27409d.lytExtraAction;
                                        ExtraActionLayout extraActionLayout = (ExtraActionLayout) AbstractC22716b.m117526a(view, i11);
                                        if (extraActionLayout != null) {
                                            i11 = AbstractC27409d.lytLabel;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout != null) {
                                                i11 = AbstractC27409d.lytPromoteFooter;
                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                if (linearLayout2 != null) {
                                                    i11 = AbstractC27409d.lytPromoteLink;
                                                    LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                    if (linearLayout3 != null) {
                                                        i11 = AbstractC27409d.lytWarningDangerous;
                                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                        if (linearLayout4 != null) {
                                                            i11 = AbstractC27409d.lytWarningSensitive;
                                                            LinearLayout linearLayout5 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                            if (linearLayout5 != null) {
                                                                i11 = AbstractC27409d.txtPromoteFooter;
                                                                SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (simpleShadowTextView4 != null) {
                                                                    i11 = AbstractC27409d.txtPromoteLink;
                                                                    EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                                    if (ellipsizedTextView != null) {
                                                                        i11 = AbstractC27409d.txtWarningDangerous;
                                                                        SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                        if (simpleShadowTextView5 != null) {
                                                                            i11 = AbstractC27409d.txtWarningSensitiveMessage;
                                                                            SimpleShadowTextView simpleShadowTextView6 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                            if (simpleShadowTextView6 != null) {
                                                                                i11 = AbstractC27409d.txtWarningSensitiveTitle;
                                                                                SimpleShadowTextView simpleShadowTextView7 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                if (simpleShadowTextView7 != null) {
                                                                                    return new C25057u0((NormalVideoItem) view, simpleShadowTextView, simpleShadowTextView2, simpleShadowTextView3, recyclingImageView, recyclingImageView2, roundedImageView, imageView, imageView2, extraActionLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, simpleShadowTextView4, ellipsizedTextView, simpleShadowTextView5, simpleShadowTextView6, simpleShadowTextView7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public NormalVideoItem getRoot() {
        return this.f120329p;
    }
}
