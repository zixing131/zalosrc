package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroupOverlay;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import ao.InterfaceC2266h;
import bo.AbstractC3059y0;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3039t0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p109ds.C18065d;
import p167fs.C19136a;
import p167fs.C19140e;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p615wn.C29106b;
import p691yr.C31060j;
import p716zh.C32002l4;
import th.AbstractC26683d;
import ti0.C26708g;
import vg.AbstractC28245z3;
import vg.C28051e4;

/* loaded from: classes4.dex */
public abstract class FeedItemBase extends RelativeLayout {

    /* renamed from: p0 */
    public static final int f44266p0 = AbstractC23136l9.m118742r(15.0f);

    /* renamed from: q0 */
    public static final int f44267q0 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: A */
    protected View f44268A;

    /* renamed from: B */
    protected RobotoTextView f44269B;

    /* renamed from: C */
    protected RobotoTextView f44270C;

    /* renamed from: D */
    protected RobotoTextView f44271D;

    /* renamed from: E */
    protected RobotoTextView f44272E;

    /* renamed from: F */
    protected AspectRatioImageView f44273F;

    /* renamed from: G */
    protected FeedBackgroundView f44274G;

    /* renamed from: H */
    protected RelativeLayout f44275H;

    /* renamed from: I */
    protected RecyclingImageView f44276I;

    /* renamed from: J */
    protected RobotoTextView f44277J;

    /* renamed from: K */
    protected RobotoTextView f44278K;

    /* renamed from: L */
    protected RobotoTextView f44279L;

    /* renamed from: M */
    protected RobotoTextView f44280M;

    /* renamed from: N */
    protected RobotoTextView f44281N;

    /* renamed from: O */
    protected RobotoTextView f44282O;

    /* renamed from: P */
    protected RobotoTextView f44283P;

    /* renamed from: Q */
    protected RobotoTextView f44284Q;

    /* renamed from: R */
    protected View f44285R;

    /* renamed from: S */
    protected View f44286S;

    /* renamed from: T */
    protected View f44287T;

    /* renamed from: U */
    C18065d f44288U;

    /* renamed from: V */
    ModulesView f44289V;

    /* renamed from: W */
    protected View f44290W;

    /* renamed from: a0 */
    protected ImageView f44291a0;

    /* renamed from: b0 */
    protected RobotoTextView f44292b0;

    /* renamed from: c0 */
    protected RobotoTextView f44293c0;

    /* renamed from: d0 */
    protected View f44294d0;

    /* renamed from: e0 */
    protected C23528a f44295e0;

    /* renamed from: f0 */
    protected int f44296f0;

    /* renamed from: g0 */
    protected int f44297g0;

    /* renamed from: h0 */
    protected C3000l0 f44298h0;

    /* renamed from: i0 */
    protected boolean f44299i0;

    /* renamed from: j0 */
    protected boolean f44300j0;

    /* renamed from: k0 */
    protected View.OnClickListener f44301k0;

    /* renamed from: l0 */
    private boolean f44302l0;

    /* renamed from: m0 */
    Handler f44303m0;

    /* renamed from: n0 */
    private final Drawable f44304n0;

    /* renamed from: o0 */
    private final View.OnLayoutChangeListener f44305o0;

    /* renamed from: p */
    protected RobotoTextView f44306p;

    /* renamed from: q */
    protected View f44307q;

    /* renamed from: r */
    protected View f44308r;

    /* renamed from: s */
    protected RecyclingImageView f44309s;

    /* renamed from: t */
    protected ImageButton f44310t;

    /* renamed from: u */
    protected RobotoTextView f44311u;

    /* renamed from: v */
    protected View f44312v;

    /* renamed from: w */
    protected RobotoTextView f44313w;

    /* renamed from: x */
    protected RobotoTextView f44314x;

    /* renamed from: y */
    protected ImageButton f44315y;

    /* renamed from: z */
    protected ImageButton f44316z;

    /* renamed from: com.zing.zalo.feed.components.FeedItemBase$a */
    /* loaded from: classes4.dex */
    class ViewOnLayoutChangeListenerC8084a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC8084a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (FeedItemBase.this.f44304n0 != null) {
                FeedItemBase feedItemBase = FeedItemBase.this;
                int i19 = feedItemBase.f44296f0;
                if (i19 != 2 && i19 != 3) {
                    feedItemBase.f44304n0.setBounds(0, 0, view.getWidth(), view.getHeight());
                } else {
                    feedItemBase.f44304n0.setBounds(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left_profile), 0, i13 - AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_right_profile), view.getHeight());
                }
            }
        }
    }

    public FeedItemBase(Context context) {
        super(context);
        this.f44302l0 = true;
        this.f44303m0 = new Handler(Looper.getMainLooper());
        this.f44305o0 = new ViewOnLayoutChangeListenerC8084a();
        this.f44304n0 = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
    }

    /* renamed from: B */
    public static void m43657B(FeedItemBase feedItemBase, C3000l0 c3000l0, int i11, boolean z11, InterfaceC10867f interfaceC10867f) {
        feedItemBase.mo43681A(c3000l0, i11, z11, interfaceC10867f);
    }

    /* renamed from: C */
    public static void m43658C(FeedItemBase feedItemBase, C3000l0 c3000l0) {
        feedItemBase.setHeaderFeedMessageChat(c3000l0);
    }

    /* renamed from: D */
    private void m43659D(Context context, final C3000l0 c3000l0, final int i11, final InterfaceC2259a interfaceC2259a) {
        final C3020p0 m14324b0;
        String str;
        if (c3000l0 != null) {
            try {
                m14324b0 = c3000l0.m14324b0(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            m14324b0 = null;
        }
        if (m14324b0 != null) {
            boolean z11 = m14324b0.f12027G;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemBase.this.m43676s(interfaceC2259a, m14324b0, c3000l0, view);
                }
            };
            View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: com.zing.zalo.feed.components.w0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m43677u;
                    m43677u = FeedItemBase.this.m43677u(c3000l0, i11, interfaceC2259a, view);
                    return m43677u;
                }
            };
            RobotoTextView robotoTextView = this.f44280M;
            String str2 = "";
            int i12 = 0;
            if (robotoTextView != null) {
                if (!AbstractC23304d.f113424p2) {
                    str = "";
                } else {
                    str = AbstractC20814p0.m108599D(m14324b0.f12025E.f12243a);
                }
                robotoTextView.setText(str);
                this.f44280M.setEnabled(!z11);
                RobotoTextView robotoTextView2 = this.f44280M;
                if (m14324b0.m14518m0()) {
                    i12 = 8;
                }
                robotoTextView2.setVisibility(i12);
            }
            RobotoTextView robotoTextView3 = this.f44278K;
            if (robotoTextView3 != null) {
                if (this.f44302l0) {
                    str2 = AbstractC20814p0.m108599D(m14324b0.f12025E.f12244b);
                }
                robotoTextView3.setText(str2);
                this.f44278K.setEnabled(!z11);
                this.f44278K.setOnClickListener(onClickListener);
            }
            if (this.f44275H != null) {
                boolean z12 = m14324b0.f12064w;
                RecyclingImageView recyclingImageView = this.f44276I;
                C31060j c31060j = C31060j.f143193a;
                recyclingImageView.setImageDrawable(c31060j.m150929D(z12 ? 1 : 0, getContext(), c31060j.m150937S(this.f44296f0)));
                this.f44275H.setEnabled(!z11);
                this.f44275H.setOnClickListener(onClickListener);
                this.f44275H.setOnLongClickListener(onLongClickListener);
                this.f44275H.setBackground(c31060j.m150940f(z12 ? 1 : 0, getContext(), this.f44296f0));
            }
            if (this.f44289V != null) {
                m43683M(m14324b0);
            }
        }
    }

    /* renamed from: F */
    public static void m43660F(FeedItemBase feedItemBase, C3000l0 c3000l0, int i11, Context context, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, boolean z11, InterfaceC2266h interfaceC2266h) {
        feedItemBase.m43682E(c3000l0, i11, context, interfaceC2259a, interfaceC10867f, z11, interfaceC2266h);
    }

    /* renamed from: G */
    public static void m43661G(FeedItemBase feedItemBase, View.OnClickListener onClickListener) {
        feedItemBase.setOnAvatarClickListener(onClickListener);
    }

    /* renamed from: H */
    public static void m43662H(FeedItemBase feedItemBase, View.OnClickListener onClickListener) {
        feedItemBase.setOnFeedMenuClickListener(onClickListener);
    }

    /* renamed from: I */
    public static void m43663I(FeedItemBase feedItemBase, View.OnClickListener onClickListener) {
        feedItemBase.setOnFooterClickListener(onClickListener);
    }

    /* renamed from: J */
    public static void m43664J(FeedItemBase feedItemBase, View.OnClickListener onClickListener) {
        feedItemBase.setOnProfileClickListener(onClickListener);
    }

    /* renamed from: K */
    public static void m43665K(FeedItemBase feedItemBase, View.OnClickListener onClickListener) {
        if (feedItemBase != null) {
            feedItemBase.setOnRecentlyLikeClickListener(onClickListener);
        }
    }

    /* renamed from: L */
    public static void m43666L(FeedItemBase feedItemBase, View.OnClickListener onClickListener) {
        feedItemBase.setOpenFeedDetailListener(onClickListener);
    }

    /* renamed from: k */
    private void m43672k() {
        boolean z11;
        C3000l0 c3000l0;
        boolean z12;
        C3000l0 c3000l02;
        try {
            ViewGroupOverlay overlay = getOverlay();
            if (overlay != null && this.f44304n0 != null) {
                int i11 = this.f44296f0;
                boolean z13 = true;
                if (i11 != 0 && i11 != 2 && i11 != 3 && i11 != 4) {
                    z11 = false;
                    c3000l0 = this.f44298h0;
                    if (c3000l0 == null && c3000l0.m14285C0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c3000l02 = this.f44298h0;
                    if (c3000l02 != null || c3000l02.m14322a0() == null || this.f44298h0.m14322a0().m14498b0()) {
                        z13 = false;
                    }
                    if (!z11 && z12 && z13) {
                        overlay.add(this.f44304n0);
                        return;
                    } else {
                        overlay.remove(this.f44304n0);
                    }
                }
                z11 = true;
                c3000l0 = this.f44298h0;
                if (c3000l0 == null) {
                }
                z12 = false;
                c3000l02 = this.f44298h0;
                if (c3000l02 != null) {
                }
                z13 = false;
                if (!z11) {
                }
                overlay.remove(this.f44304n0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    private C32002l4 m43673m(C3000l0 c3000l0) {
        int i11;
        int i12 = this.f44296f0;
        if (i12 != 0 && i12 != 1) {
            if (i12 != 2 && i12 != 3) {
                i11 = 10000;
            } else {
                i11 = 10001;
            }
        } else if (c3000l0 != null && c3000l0.m14287D0()) {
            i11 = 10002;
        } else {
            i11 = 10031;
        }
        return C32002l4.m154264g(i11);
    }

    /* renamed from: n */
    private boolean m43674n(C3000l0 c3000l0, int i11, InterfaceC2259a interfaceC2259a) {
        C3020p0 c3020p0;
        int[] iArr = new int[2];
        this.f44275H.getLocationOnScreen(iArr);
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14324b0(i11);
        } else {
            c3020p0 = null;
        }
        C3020p0 c3020p02 = c3020p0;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11972v3(c3020p02, m43673m(c3000l0), iArr[0], iArr[1], this.f44275H.getHeight());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m43675r(View view) {
        ToastUtils.m89266n(AbstractC8020f0.str_feed_edited_hint, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m43676s(InterfaceC2259a interfaceC2259a, C3020p0 c3020p0, C3000l0 c3000l0, View view) {
        if (interfaceC2259a != null) {
            C19136a.f95164a.m100437b(view);
            interfaceC2259a.mo11930Q2(c3020p0, m43673m(c3000l0));
        }
    }

    private void setVisibilityHeaderProperties(C3000l0 c3000l0) {
        boolean z11;
        if (this.f44296f0 == 4 && this.f44282O != null) {
            int i11 = 0;
            if (c3000l0 != null && !c3000l0.m14297H0() && !c3000l0.m14285C0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            RobotoTextView robotoTextView = this.f44282O;
            if (!z11) {
                i11 = 8;
            }
            robotoTextView.setVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ boolean m43677u(C3000l0 c3000l0, int i11, InterfaceC2259a interfaceC2259a, View view) {
        return m43674n(c3000l0, i11, interfaceC2259a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m43678v(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, View view) {
        ContactProfile m118084d = AbstractC23028c0.m118084d(c3020p0.f12022B.f12280b);
        if (interfaceC2259a != null && m118084d != null) {
            interfaceC2259a.mo11959k0(m118084d);
            AbstractC23647d.m123897g("4914003");
        }
    }

    /* renamed from: x */
    public static void m43679x(FeedItemBase feedItemBase, C3000l0 c3000l0) {
        feedItemBase.setFeedContent(c3000l0);
    }

    /* renamed from: z */
    public static void m43680z(Context context, FeedItemBase feedItemBase, C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a) {
        feedItemBase.m43690y(context, c3000l0, i11, z11, interfaceC2259a);
    }

    /* renamed from: A */
    public void mo43681A(C3000l0 c3000l0, int i11, boolean z11, InterfaceC10867f interfaceC10867f) {
        this.f44299i0 = z11;
        AbstractC20814p0.m108653k0(c3000l0, i11, this.f44310t, this.f44311u, this.f44308r, this.f44282O, this.f44284Q, z11, this.f44295e0, interfaceC10867f, this.f44296f0);
        setVisibilityHeaderProperties(c3000l0);
    }

    /* renamed from: E */
    public void m43682E(C3000l0 c3000l0, int i11, Context context, final InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, boolean z11, InterfaceC2266h interfaceC2266h) {
        final C3020p0 m14324b0;
        C3020p0 c3020p0;
        InterfaceC10867f interfaceC10867f2;
        boolean z12;
        boolean z13;
        RobotoTextView robotoTextView;
        if (c3000l0 == null || (m14324b0 = c3000l0.m14324b0(i11)) == null) {
            return;
        }
        int i12 = this.f44296f0;
        int i13 = 0;
        boolean z14 = true;
        if (i12 == 1) {
            AbstractC20814p0.m108681y0(c3000l0, m14324b0, this.f44269B, this.f44270C, this.f44274G, c3000l0.f11861J, context, interfaceC10867f, this.f44299i0);
            if (this.f44315y != null) {
                if (!AbstractC20826v0.m108828p0(m14324b0.f12058q, m14324b0.m14518m0()) || CoreUtility.f89233i.equals(m14324b0.m14465A()) || !AbstractC3059y0.m14708c(this.f44296f0)) {
                    z14 = false;
                }
                ImageButton imageButton = this.f44315y;
                if (!z14) {
                    i13 = 8;
                }
                imageButton.setVisibility(i13);
                this.f44315y.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.u0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FeedItemBase.m43678v(C3020p0.this, interfaceC2259a, view);
                    }
                });
            }
            c3020p0 = m14324b0;
            interfaceC10867f2 = interfaceC10867f;
        } else if (i12 == 2 || i12 == 3) {
            c3020p0 = m14324b0;
            interfaceC10867f2 = interfaceC10867f;
            AbstractC20814p0.m108596B0(c3020p0, this.f44269B, true, context, interfaceC10867f2);
        } else {
            RobotoTextView robotoTextView2 = this.f44269B;
            RobotoTextView robotoTextView3 = this.f44271D;
            RobotoTextView robotoTextView4 = this.f44272E;
            FeedBackgroundView feedBackgroundView = this.f44274G;
            if (i12 != 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i12 == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            c3020p0 = m14324b0;
            interfaceC10867f2 = interfaceC10867f;
            AbstractC20814p0.m108598C0(m14324b0, robotoTextView2, robotoTextView3, robotoTextView4, feedBackgroundView, z12, z13, context, interfaceC10867f, interfaceC2266h, z11, this.f44299i0, i12);
            if (this.f44296f0 == 6) {
                this.f44269B.setOnClickListener(this.f44301k0);
            }
            AbstractC20814p0.m108673u0(interfaceC2259a, c3020p0, this.f44273F, this.f44295e0, this.f44299i0);
        }
        AbstractC20814p0.m108669s0(getContext(), c3000l0.m14324b0(i11), this.f44283P, interfaceC2259a, this.f44296f0);
        AbstractC20814p0.m108610I0(c3000l0, i11, this.f44306p, this.f44307q, interfaceC10867f2);
        if (AbstractC26683d.f126393l && (robotoTextView = this.f44269B) != null) {
            AbstractC28245z3.m142219b(robotoTextView.getText(), this.f44269B);
        }
        if (!this.f44299i0) {
            C28051e4.m141514f().m141527p(c3020p0);
        }
    }

    /* renamed from: M */
    void m43683M(C3020p0 c3020p0) {
        boolean z11;
        ModulesView modulesView = this.f44289V;
        if (modulesView != null) {
            int i11 = this.f44296f0;
            boolean z12 = true;
            if (i11 != 0 && i11 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (c3020p0 == null || c3020p0.f12025E == null) {
                z12 = false;
            }
            if (z11 && z12) {
                C3039t0 c3039t0 = c3020p0.f12025E;
                if (c3039t0.f12244b <= 0 && c3039t0.f12243a <= 0) {
                    modulesView.setVisibility(8);
                    return;
                }
                C18065d c18065d = this.f44288U;
                if (c18065d != null) {
                    c18065d.m96048C1(c3020p0);
                }
                this.f44289V.setVisibility(0);
                return;
            }
            modulesView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public void m43684N(C3000l0 c3000l0, C3020p0 c3020p0) {
        if (c3000l0 != null && c3020p0 != null) {
            try {
                int i11 = this.f44296f0;
                if (i11 == 2 || i11 == 3) {
                    int i12 = this.f44297g0;
                    TextUtils.isEmpty(c3000l0.f11871T);
                    View view = this.f44268A;
                    if (view != null) {
                        view.setBackgroundColor(i12);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public List<Integer> getArrIdsListCallback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        return arrayList;
    }

    public int getFeedLayoutMode() {
        return this.f44296f0;
    }

    /* renamed from: i */
    public void m43685i() {
        if (this.f44289V != null) {
            if (this.f44288U == null) {
                C18065d c18065d = new C18065d(getContext(), this.f44296f0);
                this.f44288U = c18065d;
                c18065d.m89106L().m89027K(true).m89048d0(AbstractC23222t7.f112576o);
            }
            this.f44289V.mo44090O();
            this.f44289V.mo69681L(this.f44288U);
        }
    }

    /* renamed from: j */
    public abstract void mo43686j(C29106b c29106b);

    /* renamed from: l */
    public void m43687l() {
        ImageButton imageButton = this.f44310t;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        View view = this.f44286S;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f44305o0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnLayoutChangeListener(this.f44305o0);
        super.onDetachedFromWindow();
    }

    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        this.f44295e0 = new C23528a(context);
        this.f44297g0 = C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor);
        this.f44306p = (RobotoTextView) findViewById(AbstractC6918a0.tv_suggest_header_tag);
        this.f44307q = findViewById(AbstractC6918a0.divider_suggest_tag);
        this.f44308r = findViewById(AbstractC6918a0.imvAvatar);
        this.f44309s = (RecyclingImageView) findViewById(AbstractC6918a0.imvAvatarBody);
        this.f44311u = (RobotoTextView) findViewById(AbstractC6918a0.tvUserName);
        this.f44283P = (RobotoTextView) findViewById(AbstractC6918a0.tvPrivacyInfo);
        RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.tvEditedInfo);
        this.f44284Q = robotoTextView;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemBase.m43675r(view);
                }
            });
        }
        this.f44310t = (ImageButton) findViewById(AbstractC6918a0.btn_submenu_feed);
        RobotoTextView robotoTextView2 = (RobotoTextView) findViewById(AbstractC6918a0.tvTitle);
        this.f44313w = robotoTextView2;
        if (robotoTextView2 != null) {
            robotoTextView2.setCompoundDrawables(null, null, null, null);
        }
        this.f44312v = findViewById(AbstractC6918a0.dividerTitle);
        this.f44314x = (RobotoTextView) findViewById(AbstractC6918a0.tvSubtitle);
        this.f44315y = (ImageButton) findViewById(AbstractC6918a0.icon_msg_feed);
        this.f44316z = (ImageButton) findViewById(AbstractC6918a0.btn_submenu_feed_header);
        this.f44269B = (RobotoTextView) findViewById(AbstractC6918a0.tvMessage);
        this.f44270C = (RobotoTextView) findViewById(AbstractC6918a0.tvTagString);
        this.f44271D = (RobotoTextView) findViewById(AbstractC6918a0.tvTagAndLocation);
        this.f44272E = (RobotoTextView) findViewById(AbstractC6918a0.tvTranslation);
        this.f44268A = findViewById(AbstractC6918a0.feedItemBodyTimeBar);
        FeedBackgroundView feedBackgroundView = (FeedBackgroundView) findViewById(AbstractC6918a0.bg_feed_view);
        this.f44274G = feedBackgroundView;
        if (feedBackgroundView != null) {
            feedBackgroundView.setModeUse(0);
            this.f44274G.setModeView(0);
            FeedBackgroundView feedBackgroundView2 = this.f44274G;
            if (this.f44296f0 == 1) {
                i12 = f44266p0;
            } else {
                i12 = f44267q0;
            }
            feedBackgroundView2.setStatusLeftRightMargin(i12);
        }
        this.f44273F = (AspectRatioImageView) findViewById(AbstractC6918a0.imv_thumb_location);
        this.f44290W = findViewById(AbstractC6918a0.feed_item_comment_top_divider);
        this.f44291a0 = (ImageView) findViewById(AbstractC6918a0.imvCommentAvatar);
        this.f44292b0 = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentUserName);
        this.f44293c0 = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentMessage);
        this.f44294d0 = findViewById(AbstractC6918a0.bg_group);
        this.f44275H = (RelativeLayout) findViewById(AbstractC6918a0.ibtnLike);
        this.f44276I = (RecyclingImageView) findViewById(AbstractC6918a0.btn_like_icon);
        this.f44277J = (RobotoTextView) findViewById(AbstractC6918a0.btn_like_text);
        this.f44278K = (RobotoTextView) findViewById(AbstractC6918a0.tvLikeInfo);
        this.f44279L = (RobotoTextView) findViewById(AbstractC6918a0.tvLikeText);
        this.f44280M = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentInfo);
        this.f44281N = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentText);
        this.f44282O = (RobotoTextView) findViewById(AbstractC6918a0.tvTime);
        this.f44285R = findViewById(AbstractC6918a0.like_touch_delegate);
        this.f44286S = findViewById(AbstractC6918a0.layoutFeedItemFooter);
        this.f44287T = findViewById(AbstractC6918a0.feed_footer_overlay);
        this.f44289V = (ModulesView) findViewById(AbstractC6918a0.view_recently_like);
        m43685i();
        if (this.f44277J != null) {
            new C26708g(this.f44277J).m137319a(C19140e.f95172a.m100454d(context));
            this.f44277J.setTextColor(C31060j.f143193a.m150932I(0, context, this.f44296f0));
        }
        int i13 = this.f44296f0;
        if (i13 == 2 && !AbstractC23304d.f113420o2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i13 == 0 && !AbstractC23304d.f113424p2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i13 == 1 && !AbstractC23304d.f113424p2) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 || z12 || z13) {
            this.f44302l0 = false;
        }
        if ((i13 == 0 && !AbstractC23304d.f113424p2) || (i13 == 1 && !AbstractC23304d.f113424p2)) {
            RobotoTextView robotoTextView3 = this.f44278K;
            if (robotoTextView3 != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) robotoTextView3.getLayoutParams();
                layoutParams.setMargins(AbstractC23136l9.m118742r(6.0f), 0, 0, 0);
                this.f44278K.setLayoutParams(layoutParams);
            }
            RobotoTextView robotoTextView4 = this.f44280M;
            if (robotoTextView4 != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) robotoTextView4.getLayoutParams();
                layoutParams2.setMargins(AbstractC23136l9.m118742r(25.0f), 0, 0, 0);
                this.f44280M.setLayoutParams(layoutParams2);
            }
        }
    }

    public void setFeedContent(C3000l0 c3000l0) {
        this.f44298h0 = c3000l0;
        m43672k();
    }

    public void setHeaderFeedMessageChat(C3000l0 c3000l0) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14322a0 = c3000l0.m14322a0();
            if (m14322a0 == null) {
                return;
            }
            if (this.f44313w != null && this.f44312v != null) {
                if (!TextUtils.isEmpty(m14322a0.f12066y)) {
                    this.f44313w.setVisibility(0);
                    this.f44312v.setVisibility(0);
                    this.f44313w.setText(m14322a0.f12066y);
                } else {
                    this.f44312v.setVisibility(8);
                    this.f44313w.setVisibility(8);
                }
                this.f44313w.setOnClickListener(this.f44301k0);
            }
            if (this.f44314x != null) {
                if (!TextUtils.isEmpty(m14322a0.f12067z)) {
                    this.f44314x.setVisibility(0);
                    this.f44314x.setText(m14322a0.f12067z);
                } else {
                    this.f44314x.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setListListener(SparseArray<View.OnClickListener> sparseArray) {
        if (sparseArray != null) {
            setOnProfileClickListener(sparseArray.get(0));
            setOnAvatarClickListener(sparseArray.get(1));
        }
    }

    public void setOnAvatarClickListener(View.OnClickListener onClickListener) {
        View view = this.f44308r;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setOnFeedMenuClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.f44310t;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
        ImageButton imageButton2 = this.f44316z;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(onClickListener);
        }
    }

    public void setOnFooterClickListener(View.OnClickListener onClickListener) {
        RobotoTextView robotoTextView = this.f44280M;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
        View view = this.f44286S;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        View view = this.f44294d0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setOnProfileClickListener(View.OnClickListener onClickListener) {
        View view = this.f44308r;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
        RecyclingImageView recyclingImageView = this.f44309s;
        if (recyclingImageView != null) {
            recyclingImageView.setOnClickListener(onClickListener);
        }
        RobotoTextView robotoTextView = this.f44311u;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    public void setOnRecentlyLikeClickListener(View.OnClickListener onClickListener) {
        ModulesView modulesView = this.f44289V;
        if (modulesView != null) {
            modulesView.setOnClickListener(onClickListener);
        }
    }

    public void setOpenFeedDetailListener(View.OnClickListener onClickListener) {
        this.f44301k0 = onClickListener;
    }

    public void setShowMutualAvatar(boolean z11) {
        this.f44300j0 = z11;
    }

    /* renamed from: w */
    public void m43689w() {
        RobotoTextView robotoTextView = this.f44269B;
        if (robotoTextView != null) {
            AbstractC28245z3.m142218a(robotoTextView.getText(), this.f44269B);
        }
    }

    /* renamed from: y */
    public void m43690y(Context context, C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a) {
        this.f44299i0 = z11;
        int i12 = this.f44296f0;
        if ((i12 == 2 && !AbstractC23304d.f113420o2) || ((i12 == 0 && !AbstractC23304d.f113424p2) || (i12 == 1 && !AbstractC23304d.f113424p2))) {
            RobotoTextView robotoTextView = this.f44279L;
            if (robotoTextView != null) {
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_like_new));
            }
            RobotoTextView robotoTextView2 = this.f44281N;
            if (robotoTextView2 != null) {
                robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_comment_title_new));
            }
        }
        m43659D(context, c3000l0, i11, interfaceC2259a);
        int i13 = this.f44296f0;
        int i14 = 0;
        if (i13 == 1 || i13 == 0) {
            ImageButton imageButton = this.f44310t;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            ImageButton imageButton2 = this.f44316z;
            if (imageButton2 != null) {
                imageButton2.setVisibility(0);
            }
        }
        View view = this.f44287T;
        if (view != null) {
            if (!c3000l0.m14285C0()) {
                i14 = 8;
            }
            view.setVisibility(i14);
        }
    }

    public FeedItemBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44302l0 = true;
        this.f44303m0 = new Handler(Looper.getMainLooper());
        this.f44305o0 = new ViewOnLayoutChangeListenerC8084a();
        this.f44304n0 = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
    }
}
