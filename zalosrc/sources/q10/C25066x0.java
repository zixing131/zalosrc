package q10;

import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SurveyVideoItem;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.x0 */
/* loaded from: classes5.dex */
public final class C25066x0 implements InterfaceC22715a {

    /* renamed from: p */
    private final SurveyVideoItem f120407p;

    /* renamed from: q */
    public final RecyclingImageView f120408q;

    /* renamed from: r */
    public final RoundedImageView f120409r;

    /* renamed from: s */
    public final SimpleShadowTextView f120410s;

    private C25066x0(SurveyVideoItem surveyVideoItem, RecyclingImageView recyclingImageView, RoundedImageView roundedImageView, SimpleShadowTextView simpleShadowTextView) {
        this.f120407p = surveyVideoItem;
        this.f120408q = recyclingImageView;
        this.f120409r = roundedImageView;
        this.f120410s = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25066x0 m129971a(View view) {
        int i11 = AbstractC27409d.rivBackground;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC27409d.rivThumbnail;
            RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
            if (roundedImageView != null) {
                i11 = AbstractC27409d.txtQuestion;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null) {
                    return new C25066x0((SurveyVideoItem) view, recyclingImageView, roundedImageView, simpleShadowTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public SurveyVideoItem getRoot() {
        return this.f120407p;
    }
}
