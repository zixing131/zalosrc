package q10;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.p072ui.widget.Divider;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.s1 */
/* loaded from: classes5.dex */
public final class C25052s1 implements InterfaceC22715a {

    /* renamed from: A */
    public final LinearLayout f120263A;

    /* renamed from: B */
    public final LinearLayout f120264B;

    /* renamed from: C */
    public final SimpleShadowTextView f120265C;

    /* renamed from: D */
    public final Divider f120266D;

    /* renamed from: E */
    public final RobotoButton f120267E;

    /* renamed from: F */
    public final RelativeLayout f120268F;

    /* renamed from: G */
    public final SimpleShadowTextView f120269G;

    /* renamed from: H */
    public final UsernameTextView f120270H;

    /* renamed from: I */
    public final SimpleShadowTextView f120271I;

    /* renamed from: p */
    private final ScrollView f120272p;

    /* renamed from: q */
    public final SimpleShadowTextView f120273q;

    /* renamed from: r */
    public final SimpleShadowTextView f120274r;

    /* renamed from: s */
    public final SimpleShadowTextView f120275s;

    /* renamed from: t */
    public final SimpleShadowTextView f120276t;

    /* renamed from: u */
    public final SimpleShadowTextView f120277u;

    /* renamed from: v */
    public final Divider f120278v;

    /* renamed from: w */
    public final SimpleShadowTextView f120279w;

    /* renamed from: x */
    public final AvatarImageView f120280x;

    /* renamed from: y */
    public final SimpleShadowTextView f120281y;

    /* renamed from: z */
    public final LinearLayout f120282z;

    private C25052s1(ScrollView scrollView, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4, SimpleShadowTextView simpleShadowTextView5, Divider divider, SimpleShadowTextView simpleShadowTextView6, AvatarImageView avatarImageView, SimpleShadowTextView simpleShadowTextView7, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, SimpleShadowTextView simpleShadowTextView8, Divider divider2, RobotoButton robotoButton, RelativeLayout relativeLayout, SimpleShadowTextView simpleShadowTextView9, UsernameTextView usernameTextView, SimpleShadowTextView simpleShadowTextView10) {
        this.f120272p = scrollView;
        this.f120273q = simpleShadowTextView;
        this.f120274r = simpleShadowTextView2;
        this.f120275s = simpleShadowTextView3;
        this.f120276t = simpleShadowTextView4;
        this.f120277u = simpleShadowTextView5;
        this.f120278v = divider;
        this.f120279w = simpleShadowTextView6;
        this.f120280x = avatarImageView;
        this.f120281y = simpleShadowTextView7;
        this.f120282z = linearLayout;
        this.f120263A = linearLayout2;
        this.f120264B = linearLayout3;
        this.f120265C = simpleShadowTextView8;
        this.f120266D = divider2;
        this.f120267E = robotoButton;
        this.f120268F = relativeLayout;
        this.f120269G = simpleShadowTextView9;
        this.f120270H = usernameTextView;
        this.f120271I = simpleShadowTextView10;
    }

    /* renamed from: a */
    public static C25052s1 m129934a(View view) {
        int i11 = AbstractC27409d.blockedChannel;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.blockedUser;
            SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView2 != null) {
                i11 = AbstractC27409d.bookmarkVideo;
                SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView3 != null) {
                    i11 = AbstractC27409d.channelLocked;
                    SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView4 != null) {
                        i11 = AbstractC27409d.channelNotif;
                        SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView5 != null) {
                            i11 = AbstractC27409d.divider;
                            Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
                            if (divider != null) {
                                i11 = AbstractC27409d.followingList;
                                SimpleShadowTextView simpleShadowTextView6 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                if (simpleShadowTextView6 != null) {
                                    i11 = AbstractC27409d.ivAvatar;
                                    AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
                                    if (avatarImageView != null) {
                                        i11 = AbstractC27409d.likedVideo;
                                        SimpleShadowTextView simpleShadowTextView7 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                        if (simpleShadowTextView7 != null) {
                                            i11 = AbstractC27409d.llChannel;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout != null) {
                                                i11 = AbstractC27409d.llChannelLocked;
                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                if (linearLayout2 != null) {
                                                    i11 = AbstractC27409d.llNoChannel;
                                                    LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                    if (linearLayout3 != null) {
                                                        i11 = AbstractC27409d.privacy;
                                                        SimpleShadowTextView simpleShadowTextView8 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (simpleShadowTextView8 != null) {
                                                            i11 = AbstractC27409d.privacyDivider;
                                                            Divider divider2 = (Divider) AbstractC22716b.m117526a(view, i11);
                                                            if (divider2 != null) {
                                                                i11 = AbstractC27409d.register;
                                                                RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
                                                                if (robotoButton != null) {
                                                                    i11 = AbstractC27409d.rlChannel;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                                                    if (relativeLayout != null) {
                                                                        i11 = AbstractC27409d.tvInsight;
                                                                        SimpleShadowTextView simpleShadowTextView9 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                        if (simpleShadowTextView9 != null) {
                                                                            i11 = AbstractC27409d.tvName;
                                                                            UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                                                                            if (usernameTextView != null) {
                                                                                i11 = AbstractC27409d.userNotif;
                                                                                SimpleShadowTextView simpleShadowTextView10 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                                                if (simpleShadowTextView10 != null) {
                                                                                    return new C25052s1((ScrollView) view, simpleShadowTextView, simpleShadowTextView2, simpleShadowTextView3, simpleShadowTextView4, simpleShadowTextView5, divider, simpleShadowTextView6, avatarImageView, simpleShadowTextView7, linearLayout, linearLayout2, linearLayout3, simpleShadowTextView8, divider2, robotoButton, relativeLayout, simpleShadowTextView9, usernameTextView, simpleShadowTextView10);
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
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f120272p;
    }
}
