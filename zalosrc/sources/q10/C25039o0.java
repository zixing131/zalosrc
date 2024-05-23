package q10;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SimpleLivestreamItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.LivestreamVideoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.o0 */
/* loaded from: classes5.dex */
public final class C25039o0 implements InterfaceC22715a {

    /* renamed from: A */
    public final SimpleShadowTextView f120142A;

    /* renamed from: B */
    public final SimpleShadowTextView f120143B;

    /* renamed from: C */
    public final FitUsernameTextView f120144C;

    /* renamed from: D */
    public final View f120145D;

    /* renamed from: p */
    private final SimpleLivestreamItem f120146p;

    /* renamed from: q */
    public final AvatarImageView f120147q;

    /* renamed from: r */
    public final ProgressBar f120148r;

    /* renamed from: s */
    public final SimpleShadowTextView f120149s;

    /* renamed from: t */
    public final View f120150t;

    /* renamed from: u */
    public final View f120151u;

    /* renamed from: v */
    public final LinearLayout f120152v;

    /* renamed from: w */
    public final LivestreamVideoLayout f120153w;

    /* renamed from: x */
    public final RecyclingImageView f120154x;

    /* renamed from: y */
    public final SimpleShadowTextView f120155y;

    /* renamed from: z */
    public final EllipsizedTextView f120156z;

    private C25039o0(SimpleLivestreamItem simpleLivestreamItem, AvatarImageView avatarImageView, ProgressBar progressBar, SimpleShadowTextView simpleShadowTextView, View view, View view2, LinearLayout linearLayout, LivestreamVideoLayout livestreamVideoLayout, RecyclingImageView recyclingImageView, SimpleShadowTextView simpleShadowTextView2, EllipsizedTextView ellipsizedTextView, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4, FitUsernameTextView fitUsernameTextView, View view3) {
        this.f120146p = simpleLivestreamItem;
        this.f120147q = avatarImageView;
        this.f120148r = progressBar;
        this.f120149s = simpleShadowTextView;
        this.f120150t = view;
        this.f120151u = view2;
        this.f120152v = linearLayout;
        this.f120153w = livestreamVideoLayout;
        this.f120154x = recyclingImageView;
        this.f120155y = simpleShadowTextView2;
        this.f120156z = ellipsizedTextView;
        this.f120142A = simpleShadowTextView3;
        this.f120143B = simpleShadowTextView4;
        this.f120144C = fitUsernameTextView;
        this.f120145D = view3;
    }

    /* renamed from: a */
    public static C25039o0 m129906a(View view) {
        View m117526a;
        View m117526a2;
        View m117526a3;
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.barLoading;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                i11 = AbstractC27409d.btnFollow;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.dividerLeft))) != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.dividerRight))) != null) {
                    i11 = AbstractC27409d.lytInform;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC27409d.lytVideo;
                        LivestreamVideoLayout livestreamVideoLayout = (LivestreamVideoLayout) AbstractC22716b.m117526a(view, i11);
                        if (livestreamVideoLayout != null) {
                            i11 = AbstractC27409d.rivThumbnail;
                            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                            if (recyclingImageView != null) {
                                i11 = AbstractC27409d.tvLive;
                                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                if (simpleShadowTextView2 != null) {
                                    i11 = AbstractC27409d.txtDescription;
                                    EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                    if (ellipsizedTextView != null) {
                                        i11 = AbstractC27409d.txtInform;
                                        SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                        if (simpleShadowTextView3 != null) {
                                            i11 = AbstractC27409d.txtJoinLive;
                                            SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                            if (simpleShadowTextView4 != null) {
                                                i11 = AbstractC27409d.txtName;
                                                FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                                                if (fitUsernameTextView != null && (m117526a3 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieOverlay))) != null) {
                                                    return new C25039o0((SimpleLivestreamItem) view, avatarImageView, progressBar, simpleShadowTextView, m117526a, m117526a2, linearLayout, livestreamVideoLayout, recyclingImageView, simpleShadowTextView2, ellipsizedTextView, simpleShadowTextView3, simpleShadowTextView4, fitUsernameTextView, m117526a3);
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
    public SimpleLivestreamItem getRoot() {
        return this.f120146p;
    }
}
