package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.t1 */
/* loaded from: classes5.dex */
public final class C25055t1 implements InterfaceC22715a {

    /* renamed from: A */
    public final SimpleShadowTextView f120300A;

    /* renamed from: B */
    public final View f120301B;

    /* renamed from: C */
    public final AppCompatImageView f120302C;

    /* renamed from: p */
    private final SimilarVideosLayout f120303p;

    /* renamed from: q */
    public final AvatarImageView f120304q;

    /* renamed from: r */
    public final ImageView f120305r;

    /* renamed from: s */
    public final SimpleShadowTextView f120306s;

    /* renamed from: t */
    public final OverScrollableRecyclerView f120307t;

    /* renamed from: u */
    public final LinearLayout f120308u;

    /* renamed from: v */
    public final FrameLayout f120309v;

    /* renamed from: w */
    public final SimilarVideosLayout f120310w;

    /* renamed from: x */
    public final EllipsizedTextView f120311x;

    /* renamed from: y */
    public final UsernameTextView f120312y;

    /* renamed from: z */
    public final SimpleShadowTextView f120313z;

    private C25055t1(SimilarVideosLayout similarVideosLayout, AvatarImageView avatarImageView, ImageView imageView, SimpleShadowTextView simpleShadowTextView, OverScrollableRecyclerView overScrollableRecyclerView, LinearLayout linearLayout, FrameLayout frameLayout, SimilarVideosLayout similarVideosLayout2, EllipsizedTextView ellipsizedTextView, UsernameTextView usernameTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, View view, AppCompatImageView appCompatImageView) {
        this.f120303p = similarVideosLayout;
        this.f120304q = avatarImageView;
        this.f120305r = imageView;
        this.f120306s = simpleShadowTextView;
        this.f120307t = overScrollableRecyclerView;
        this.f120308u = linearLayout;
        this.f120309v = frameLayout;
        this.f120310w = similarVideosLayout2;
        this.f120311x = ellipsizedTextView;
        this.f120312y = usernameTextView;
        this.f120313z = simpleShadowTextView2;
        this.f120300A = simpleShadowTextView3;
        this.f120301B = view;
        this.f120302C = appCompatImageView;
    }

    /* renamed from: a */
    public static C25055t1 m129940a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.aivSimilarAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.btnSimilarBack;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.btnSimilarFollow;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null) {
                    i11 = AbstractC27409d.lstSimilarVideos;
                    OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (overScrollableRecyclerView != null) {
                        i11 = AbstractC27409d.lytSimilarDescription;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC27409d.lytSimilarHeader;
                            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout != null) {
                                SimilarVideosLayout similarVideosLayout = (SimilarVideosLayout) view;
                                i11 = AbstractC27409d.txtSimilarDescription;
                                EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                if (ellipsizedTextView != null) {
                                    i11 = AbstractC27409d.txtSimilarName;
                                    UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                                    if (usernameTextView != null) {
                                        i11 = AbstractC27409d.txtSimilarSmallTitle;
                                        SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                        if (simpleShadowTextView2 != null) {
                                            i11 = AbstractC27409d.txtSimilarTitle;
                                            SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                            if (simpleShadowTextView3 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieSimilarBackground))) != null) {
                                                i11 = AbstractC27409d.vieSimilarThumb;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                                if (appCompatImageView != null) {
                                                    return new C25055t1(similarVideosLayout, avatarImageView, imageView, simpleShadowTextView, overScrollableRecyclerView, linearLayout, frameLayout, similarVideosLayout, ellipsizedTextView, usernameTextView, simpleShadowTextView2, simpleShadowTextView3, m117526a, appCompatImageView);
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
    public SimilarVideosLayout getRoot() {
        return this.f120303p;
    }
}
