package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h5 */
/* loaded from: classes3.dex */
public final class C29833h5 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f137988A;

    /* renamed from: B */
    public final RobotoTextView f137989B;

    /* renamed from: C */
    public final RobotoTextView f137990C;

    /* renamed from: D */
    public final RobotoTextView f137991D;

    /* renamed from: E */
    public final RobotoTextView f137992E;

    /* renamed from: F */
    public final RobotoTextView f137993F;

    /* renamed from: p */
    private final FrameLayout f137994p;

    /* renamed from: q */
    public final Button f137995q;

    /* renamed from: r */
    public final Button f137996r;

    /* renamed from: s */
    public final AppCompatImageView f137997s;

    /* renamed from: t */
    public final FrameLayout f137998t;

    /* renamed from: u */
    public final LinearLayout f137999u;

    /* renamed from: v */
    public final LinearLayout f138000v;

    /* renamed from: w */
    public final LinearLayout f138001w;

    /* renamed from: x */
    public final LinearLayout f138002x;

    /* renamed from: y */
    public final LinearLayout f138003y;

    /* renamed from: z */
    public final RobotoTextView f138004z;

    private C29833h5(FrameLayout frameLayout, Button button, Button button2, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6, RobotoTextView robotoTextView7) {
        this.f137994p = frameLayout;
        this.f137995q = button;
        this.f137996r = button2;
        this.f137997s = appCompatImageView;
        this.f137998t = frameLayout2;
        this.f137999u = linearLayout;
        this.f138000v = linearLayout2;
        this.f138001w = linearLayout3;
        this.f138002x = linearLayout4;
        this.f138003y = linearLayout5;
        this.f138004z = robotoTextView;
        this.f137988A = robotoTextView2;
        this.f137989B = robotoTextView3;
        this.f137990C = robotoTextView4;
        this.f137991D = robotoTextView5;
        this.f137992E = robotoTextView6;
        this.f137993F = robotoTextView7;
    }

    /* renamed from: a */
    public static C29833h5 m148027a(View view) {
        int i11 = AbstractC6918a0.btnAcceptFriendRequest;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btnRejectFriendRequest;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.ivIconWarning;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (appCompatImageView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = AbstractC6918a0.llJoinTimeContainer;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.llMutualGroupContainer;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout2 != null) {
                            i11 = AbstractC6918a0.llPhoneNumberContainer;
                            LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout3 != null) {
                                i11 = AbstractC6918a0.llWarningContainer;
                                LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout4 != null) {
                                    i11 = AbstractC6918a0.llZaloNameContainer;
                                    LinearLayout linearLayout5 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout5 != null) {
                                        i11 = AbstractC6918a0.tvBeCarefulWhenMakingFriends;
                                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView != null) {
                                            i11 = AbstractC6918a0.tvFriendRequestDescription;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView2 != null) {
                                                i11 = AbstractC6918a0.tvFriendRequestSource;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView3 != null) {
                                                    i11 = AbstractC6918a0.tvJoinTime;
                                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView4 != null) {
                                                        i11 = AbstractC6918a0.tvMutualGroup;
                                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView5 != null) {
                                                            i11 = AbstractC6918a0.tvPhoneNumber;
                                                            RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView6 != null) {
                                                                i11 = AbstractC6918a0.tvZaloName;
                                                                RobotoTextView robotoTextView7 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (robotoTextView7 != null) {
                                                                    return new C29833h5(frameLayout, button, button2, appCompatImageView, frameLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5, robotoTextView6, robotoTextView7);
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
    public FrameLayout getRoot() {
        return this.f137994p;
    }
}
