package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import ao.InterfaceC2260b;
import bo.C2949b;
import bo.C2954c;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3039t0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto;
import com.zing.zalo.feed.mvp.profile.model.theme.DecorItem;
import com.zing.zalo.feed.reactions.p065ui.FeedCommentButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import i40.InterfaceC20272b;
import is.AbstractC20809n;
import is.AbstractC20814p0;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p354n3.C23528a;
import p489rn.C25897n0;
import p615wn.C29106b;
import p615wn.C29107c;
import p691yr.C31060j;
import p691yr.C31063m;
import p726zr.C32546b;

/* loaded from: classes4.dex */
public final class FeedItemSocialAlbum extends FeedItemBase implements InterfaceC20272b {

    /* renamed from: A0 */
    private int f44635A0;

    /* renamed from: B0 */
    private View f44636B0;

    /* renamed from: C0 */
    private int f44637C0;

    /* renamed from: r0 */
    public FeedItemSocialAlbumPhoto f44638r0;

    /* renamed from: s0 */
    public FeedItemSocialAlbumVideo f44639s0;

    /* renamed from: t0 */
    private FeedItemSocialAlbumHeader f44640t0;

    /* renamed from: u0 */
    private View f44641u0;

    /* renamed from: v0 */
    private View f44642v0;

    /* renamed from: w0 */
    private FeedCommentButton f44643w0;

    /* renamed from: x0 */
    private boolean f44644x0;

    /* renamed from: y0 */
    private int f44645y0;

    /* renamed from: z0 */
    private int f44646z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemSocialAlbum(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    private final void m44006Q(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, Context context) {
        boolean z12;
        boolean z13;
        boolean z14;
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        AbstractC20814p0.m108669s0(context, m14324b0, this.f44283P, interfaceC2259a, this.f44296f0);
        int i12 = this.f44296f0;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    if (i12 == 4) {
                        mo43681A(c3000l0, i11, z11, interfaceC10867f);
                        RobotoTextView robotoTextView = this.f44269B;
                        RobotoTextView robotoTextView2 = this.f44271D;
                        RobotoTextView robotoTextView3 = this.f44272E;
                        FeedBackgroundView feedBackgroundView = this.f44274G;
                        int i14 = this.f44296f0;
                        if (i14 != 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i14 == 0) {
                            i13 = 1;
                        }
                        AbstractC20814p0.m108598C0(m14324b0, robotoTextView, robotoTextView2, robotoTextView3, feedBackgroundView, z14, i13, context, interfaceC10867f, null, false, this.f44299i0, i14);
                        return;
                    }
                    return;
                }
                m43684N(c3000l0, m14324b0);
                RobotoTextView robotoTextView4 = this.f44269B;
                int i15 = this.f44296f0;
                if (i15 != 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i15 == 0) {
                    i13 = 1;
                }
                AbstractC20814p0.m108675v0(m14324b0, robotoTextView4, z13, i13, context, interfaceC10867f);
                return;
            }
            RobotoTextView robotoTextView5 = this.f44283P;
            if (robotoTextView5 != null) {
                robotoTextView5.setMaxLines(1);
                this.f44283P.setEllipsize(TextUtils.TruncateAt.END);
            }
            mo43681A(c3000l0, i11, z11, interfaceC10867f);
            AbstractC20814p0.m108681y0(this.f44298h0, m14324b0, this.f44269B, this.f44270C, this.f44274G, c3000l0.f11861J, context, interfaceC10867f, this.f44299i0);
            RobotoTextView robotoTextView6 = this.f44270C;
            if (robotoTextView6 != null && robotoTextView6.getText() != null) {
                RobotoTextView robotoTextView7 = this.f44270C;
                CharSequence text = robotoTextView7.getText();
                AbstractC19074t.m100207e(text, "getText(...)");
                if (text.length() == 0) {
                    i13 = 8;
                }
                robotoTextView7.setVisibility(i13);
                return;
            }
            return;
        }
        RobotoTextView robotoTextView8 = this.f44269B;
        RobotoTextView robotoTextView9 = this.f44271D;
        FeedBackgroundView feedBackgroundView2 = this.f44274G;
        if (i12 != 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i12 == 0) {
            i13 = 1;
        }
        AbstractC20814p0.m108598C0(m14324b0, robotoTextView8, robotoTextView9, null, feedBackgroundView2, z12, i13, context, interfaceC10867f, null, false, this.f44299i0, i12);
    }

    /* renamed from: U */
    private final void m44007U(int i11) {
        FeedItemSocialAlbumVideo feedItemSocialAlbumVideo = getFeedItemSocialAlbumVideo();
        C3000l0 c3000l0 = this.f44298h0;
        C23528a c23528a = this.f44295e0;
        AbstractC19074t.m100207e(c23528a, "mAQ");
        feedItemSocialAlbumVideo.m44055B(c3000l0, i11, c23528a);
    }

    /* renamed from: O */
    public final void m44008O(int i11) {
        Drawable background;
        View view;
        C2949b m44013V = m44013V(i11);
        if (m44013V != null) {
            DecorItem decorItem = m44013V.m13960c().getDecorItem();
            int i12 = this.f44296f0;
            GradientDrawable gradientDrawable = null;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 4 && (view = this.f44641u0) != null) {
                        background = view.getBackground();
                    }
                    background = null;
                } else {
                    View view2 = this.f44642v0;
                    if (view2 != null) {
                        background = view2.getBackground();
                    }
                    background = null;
                }
            } else {
                background = getBackground();
            }
            if (background instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) background;
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColor(decorItem.getBgColor());
                gradientDrawable.setStroke(AbstractC23136l9.m118742r(1.0f), decorItem.getBgStrokeColor());
            }
        }
    }

    /* renamed from: P */
    public final void m44009P(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, Context context) {
        int i12;
        int i13;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        AbstractC19074t.m100208f(context, "context");
        if (m44016Y()) {
            m44006Q(c3000l0, i11, z11, interfaceC2259a, interfaceC10867f, context);
            i13 = 8;
        } else {
            int i14 = this.f44296f0;
            if (i14 != 1) {
                if (i14 != 2 && i14 != 3) {
                    if (i14 == 4) {
                        mo43681A(c3000l0, i11, z11, interfaceC10867f);
                    }
                } else {
                    m43684N(c3000l0, c3000l0.m14324b0(i11));
                }
            } else {
                RobotoTextView robotoTextView = this.f44283P;
                if (robotoTextView != null) {
                    robotoTextView.setMaxLines(1);
                    this.f44283P.setEllipsize(TextUtils.TruncateAt.END);
                }
                mo43681A(c3000l0, i11, z11, interfaceC10867f);
                C3000l0 c3000l02 = this.f44298h0;
                AbstractC20814p0.m108681y0(c3000l02, c3000l02.m14324b0(i11), this.f44269B, this.f44270C, this.f44274G, c3000l0.f11861J, context, interfaceC10867f, this.f44299i0);
                RobotoTextView robotoTextView2 = this.f44270C;
                if (robotoTextView2 != null && robotoTextView2.getText() != null) {
                    RobotoTextView robotoTextView3 = this.f44270C;
                    CharSequence text = robotoTextView3.getText();
                    AbstractC19074t.m100207e(text, "getText(...)");
                    if (text.length() == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    robotoTextView3.setVisibility(i12);
                }
            }
            i13 = 8;
            m43682E(c3000l0, i11, context, interfaceC2259a, interfaceC10867f, false, null);
        }
        ImageButton imageButton = this.f44315y;
        if (imageButton != null) {
            imageButton.setVisibility(i13);
        }
    }

    /* renamed from: R */
    public final void m44010R(int i11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, TrackingSource trackingSource) {
        if (!m44015X()) {
            getFeedItemSocialAlbumPhoto().setVisibility(8);
            getFeedItemSocialAlbumVideo().setVisibility(8);
            return;
        }
        m44008O(i11);
        boolean z11 = this.f44644x0;
        C23528a c23528a = this.f44295e0;
        AbstractC19074t.m100207e(c23528a, "mAQ");
        m44011S(z11, c23528a, interfaceC2259a, i11);
        C3000l0 c3000l0 = this.f44298h0;
        AbstractC19074t.m100207e(c3000l0, "mFeedContent");
        boolean z12 = this.f44644x0;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        m44009P(c3000l0, i11, z12, interfaceC2259a, interfaceC10867f, context);
        if (m44016Y()) {
            getFeedItemSocialAlbumPhoto().setVisibility(8);
            m44007U(i11);
            getFeedItemSocialAlbumVideo().setVisibility(0);
        } else {
            getFeedItemSocialAlbumVideo().setVisibility(8);
            m44012T(trackingSource, interfaceC2259a, i11);
            getFeedItemSocialAlbumPhoto().setVisibility(0);
        }
    }

    /* renamed from: S */
    public final void m44011S(boolean z11, C23528a c23528a, InterfaceC2259a interfaceC2259a, int i11) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        C2949b m44013V = m44013V(i11);
        FeedItemSocialAlbumHeader feedItemSocialAlbumHeader = null;
        if (m44013V == null) {
            FeedItemSocialAlbumHeader feedItemSocialAlbumHeader2 = this.f44640t0;
            if (feedItemSocialAlbumHeader2 == null) {
                AbstractC19074t.m100223u("feedItemSocialAlbumHeader");
            } else {
                feedItemSocialAlbumHeader = feedItemSocialAlbumHeader2;
            }
            feedItemSocialAlbumHeader.setVisibility(8);
            return;
        }
        FeedItemSocialAlbumHeader feedItemSocialAlbumHeader3 = this.f44640t0;
        if (feedItemSocialAlbumHeader3 == null) {
            AbstractC19074t.m100223u("feedItemSocialAlbumHeader");
            feedItemSocialAlbumHeader3 = null;
        }
        feedItemSocialAlbumHeader3.m44023W(z11, m44013V, c23528a, interfaceC2259a, this.f44298h0.m14285C0());
        FeedItemSocialAlbumHeader feedItemSocialAlbumHeader4 = this.f44640t0;
        if (feedItemSocialAlbumHeader4 == null) {
            AbstractC19074t.m100223u("feedItemSocialAlbumHeader");
        } else {
            feedItemSocialAlbumHeader = feedItemSocialAlbumHeader4;
        }
        feedItemSocialAlbumHeader.setVisibility(0);
    }

    /* renamed from: T */
    public final void m44012T(TrackingSource trackingSource, InterfaceC2259a interfaceC2259a, int i11) {
        getFeedItemSocialAlbumPhoto().m44049r0(this.f44645y0, this.f44646z0, this.f44298h0, i11, this.f44636B0, this.f44644x0, this.f44635A0, trackingSource, interfaceC2259a);
    }

    /* renamed from: V */
    public final C2949b m44013V(int i11) {
        C3020p0 c3020p0;
        C3025q0 c3025q0;
        C3000l0 c3000l0 = this.f44298h0;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14324b0(i11);
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3025q0 == null) {
            return null;
        }
        return c3025q0.f12106O;
    }

    /* renamed from: W */
    public final void m44014W(Context context, int i11, View view) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(view, "parentView");
        m44019b0(i11, view);
        mo43688p(context, i11);
    }

    /* renamed from: X */
    public final boolean m44015X() {
        C3020p0 c3020p0;
        C3000l0 c3000l0 = this.f44298h0;
        C3025q0 c3025q0 = null;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        }
        if (c3020p0 != null && c3025q0 != null && c3020p0.f12058q == 23 && c3025q0.m14569f()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final boolean m44016Y() {
        C2954c c2954c;
        ArrayList<C2954c> albumItemsList = getAlbumItemsList();
        if (albumItemsList != null && albumItemsList.size() == 1) {
            c2954c = albumItemsList.get(0);
        } else {
            c2954c = null;
        }
        if (c2954c == null || c2954c.m13988c() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public final void m44017Z(C3000l0 c3000l0, int i11) {
        C3020p0 c3020p0;
        int i12;
        C32546b c32546b;
        ViewGroup.LayoutParams layoutParams = null;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14324b0(i11);
        } else {
            c3020p0 = null;
        }
        if (c3020p0 == null) {
            return;
        }
        if (c3020p0.f12064w) {
            C3039t0 c3039t0 = c3020p0.f12025E;
            if (c3039t0 != null && (c32546b = c3039t0.f12247e) != null) {
                i12 = c32546b.m157605a();
            } else {
                i12 = 1;
            }
            RelativeLayout relativeLayout = this.f44275H;
            C31060j c31060j = C31060j.f143193a;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            relativeLayout.setBackground(c31060j.m150940f(i12, context, getFeedLayoutMode()));
            this.f44275H.setPadding(AbstractC23222t7.f112576o, AbstractC23222t7.f112558f, AbstractC23222t7.f112576o, AbstractC23222t7.f112558f);
            RecyclingImageView recyclingImageView = this.f44276I;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            recyclingImageView.setImageDrawable(c31060j.m150929D(i12, context2, C31063m.a.f143211q));
            ViewGroup.LayoutParams layoutParams2 = this.f44276I.getLayoutParams();
            if (layoutParams2 != null) {
                int i13 = AbstractC23222t7.f112594x;
                layoutParams2.height = i13;
                layoutParams2.width = i13;
            }
            RobotoTextView robotoTextView = this.f44277J;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            robotoTextView.setTextColor(c31060j.m150932I(i12, context3, this.f44296f0));
            RobotoTextView robotoTextView2 = this.f44277J;
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            robotoTextView2.setText(c31060j.m150931H(i12, context4));
        } else {
            RelativeLayout relativeLayout2 = this.f44275H;
            C31060j c31060j2 = C31060j.f143193a;
            Context context5 = getContext();
            AbstractC19074t.m100207e(context5, "getContext(...)");
            relativeLayout2.setBackground(c31060j2.m150940f(0, context5, getFeedLayoutMode()));
            this.f44275H.setPadding(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e);
            RecyclingImageView recyclingImageView2 = this.f44276I;
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "getContext(...)");
            recyclingImageView2.setImageDrawable(c31060j2.m150929D(0, context6, C31063m.a.f143211q));
            ViewGroup.LayoutParams layoutParams3 = this.f44276I.getLayoutParams();
            if (layoutParams3 != null) {
                int i14 = AbstractC23222t7.f112514B;
                layoutParams3.height = i14;
                layoutParams3.width = i14;
            }
            RobotoTextView robotoTextView3 = this.f44277J;
            Context context7 = getContext();
            AbstractC19074t.m100207e(context7, "getContext(...)");
            robotoTextView3.setTextColor(c31060j2.m150932I(0, context7, this.f44296f0));
            RobotoTextView robotoTextView4 = this.f44277J;
            Context context8 = getContext();
            AbstractC19074t.m100207e(context8, "getContext(...)");
            robotoTextView4.setText(c31060j2.m150931H(0, context8));
        }
        RobotoTextView robotoTextView5 = this.f44278K;
        if (robotoTextView5 != null) {
            robotoTextView5.setVisibility(8);
        }
        RobotoTextView robotoTextView6 = this.f44280M;
        if (robotoTextView6 != null) {
            robotoTextView6.setVisibility(8);
        }
        RobotoTextView robotoTextView7 = this.f44281N;
        if (robotoTextView7 != null) {
            robotoTextView7.setVisibility(8);
        }
        View view = this.f44286S;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (layoutParams != null) {
            layoutParams.height = (int) AbstractC20809n.m108578l(c3000l0.m14359s0());
        }
    }

    /* renamed from: a0 */
    public final void m44018a0(int i11, int i12) {
        getFeedItemSocialAlbumVideo().m44074y(i11, i12);
    }

    /* renamed from: b0 */
    public final void m44019b0(int i11, View view) {
        AbstractC19074t.m100208f(view, "parentView");
        if (i11 != 2 && i11 != 3) {
            view.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        } else {
            view.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ProfilePrimaryBackgroundColor));
        }
    }

    public final ArrayList<C2954c> getAlbumItemsList() {
        C3020p0 c3020p0;
        C3000l0 c3000l0 = this.f44298h0;
        C3025q0 c3025q0 = null;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        }
        if (c3025q0 != null) {
            return c3025q0.f12107P;
        }
        return new ArrayList<>();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public List<Integer> getArrIdsListCallback() {
        List<Integer> arrIdsListCallback = super.getArrIdsListCallback();
        arrIdsListCallback.add(15);
        AbstractC19074t.m100205c(arrIdsListCallback);
        return arrIdsListCallback;
    }

    public final int getCurrentPosition() {
        return this.f44635A0;
    }

    public final int getDataPosition() {
        return this.f44646z0;
    }

    public final int getDataType() {
        return this.f44645y0;
    }

    public final FeedItemSocialAlbumPhoto getFeedItemSocialAlbumPhoto() {
        FeedItemSocialAlbumPhoto feedItemSocialAlbumPhoto = this.f44638r0;
        if (feedItemSocialAlbumPhoto != null) {
            return feedItemSocialAlbumPhoto;
        }
        AbstractC19074t.m100223u("feedItemSocialAlbumPhoto");
        return null;
    }

    public final FeedItemSocialAlbumVideo getFeedItemSocialAlbumVideo() {
        FeedItemSocialAlbumVideo feedItemSocialAlbumVideo = this.f44639s0;
        if (feedItemSocialAlbumVideo != null) {
            return feedItemSocialAlbumVideo;
        }
        AbstractC19074t.m100223u("feedItemSocialAlbumVideo");
        return null;
    }

    public final int getMaxHeight() {
        return this.f44637C0;
    }

    public final View getParentView() {
        return this.f44636B0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
        AbstractC19074t.m100208f(c29106b, "dataObject");
        setFeedContent(c29106b.f134937a);
        getFeedItemSocialAlbumVideo().setShouldReleaseWhenDetached(false);
        C29107c c29107c = (C29107c) c29106b;
        m44018a0(c29107c.f134947k, c29107c.f134948l);
        m44010R(0, c29106b.f134941e, c29106b.f134942f, c29106b.f134944h);
        m43687l();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        FeedCommentButton.EnumC8849a enumC8849a;
        AbstractC19074t.m100208f(context, "context");
        try {
            this.f44296f0 = i11;
            Object systemService = context.getSystemService("layout_inflater");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            LayoutInflater layoutInflater = (LayoutInflater) systemService;
            int i12 = this.f44296f0;
            if (i12 == 0) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_social_album_timeline, this);
                setBackgroundResource(AbstractC16803z.bg_social_album_header);
            } else if (i12 == 4) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_social_album_details, this);
                View findViewById = findViewById(AbstractC6918a0.feed_item_social_album_detail_container);
                this.f44641u0 = findViewById;
                if (findViewById != null) {
                    findViewById.setBackgroundResource(AbstractC16803z.bg_social_album_header);
                }
            } else {
                if (i12 != 2 && i12 != 3) {
                    if (i12 == 1) {
                        layoutInflater.inflate(AbstractC7409c0.feed_item_social_album_timeline_group, this);
                        View findViewById2 = findViewById(AbstractC6918a0.feed_item_social_album_timeline_group_container);
                        this.f44642v0 = findViewById2;
                        if (findViewById2 != null) {
                            findViewById2.setBackgroundResource(AbstractC16803z.bg_social_album_header);
                        }
                        this.f44643w0 = (FeedCommentButton) findViewById(AbstractC6918a0.btn_comment_group);
                        if (C31060j.m150913U()) {
                            enumC8849a = FeedCommentButton.EnumC8849a.f47289q;
                        } else {
                            enumC8849a = FeedCommentButton.EnumC8849a.f47288p;
                        }
                        FeedCommentButton feedCommentButton = this.f44643w0;
                        if (feedCommentButton != null) {
                            feedCommentButton.setDisplayMode(enumC8849a);
                        }
                    }
                }
                setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
                layoutInflater.inflate(AbstractC7409c0.feed_item_social_album_profile, this);
            }
            View findViewById3 = findViewById(AbstractC6918a0.feed_item_social_album_photo);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            setFeedItemSocialAlbumPhoto((FeedItemSocialAlbumPhoto) findViewById3);
            getFeedItemSocialAlbumPhoto().m44046n0(context, i11);
            View findViewById4 = findViewById(AbstractC6918a0.feed_item_social_album_video);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            setFeedItemSocialAlbumVideo((FeedItemSocialAlbumVideo) findViewById4);
            getFeedItemSocialAlbumVideo().m44064k(context, i11);
            View findViewById5 = findViewById(AbstractC6918a0.feed_item_social_album_header);
            AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
            FeedItemSocialAlbumHeader feedItemSocialAlbumHeader = (FeedItemSocialAlbumHeader) findViewById5;
            this.f44640t0 = feedItemSocialAlbumHeader;
            if (feedItemSocialAlbumHeader == null) {
                AbstractC19074t.m100223u("feedItemSocialAlbumHeader");
                feedItemSocialAlbumHeader = null;
            }
            feedItemSocialAlbumHeader.m44024a0(context, i11);
            setMargin(this.f44296f0);
            setRoundRect(this.f44296f0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        super.mo43688p(context, i11);
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        return getFeedItemSocialAlbumPhoto().mo43986q(i11);
    }

    public final void setCurrentPosition(int i11) {
        this.f44635A0 = i11;
    }

    public final void setDataPosition(int i11) {
        this.f44646z0 = i11;
    }

    public final void setDataType(int i11) {
        this.f44645y0 = i11;
    }

    public final void setFeedItemSocialAlbumPhoto(FeedItemSocialAlbumPhoto feedItemSocialAlbumPhoto) {
        AbstractC19074t.m100208f(feedItemSocialAlbumPhoto, "<set-?>");
        this.f44638r0 = feedItemSocialAlbumPhoto;
    }

    public final void setFeedItemSocialAlbumVideo(FeedItemSocialAlbumVideo feedItemSocialAlbumVideo) {
        AbstractC19074t.m100208f(feedItemSocialAlbumVideo, "<set-?>");
        this.f44639s0 = feedItemSocialAlbumVideo;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setListListener(SparseArray<View.OnClickListener> sparseArray) {
        super.setListListener(sparseArray);
        if (sparseArray != null) {
            View.OnClickListener onClickListener = sparseArray.get(15);
            AbstractC19074t.m100207e(onClickListener, "get(...)");
            setOnVideoViewClickListener(onClickListener);
        }
    }

    public final void setMargin(int i11) {
        ViewGroup.MarginLayoutParams layoutParams;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr);
        if (getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        if (i11 == 0) {
            layoutParams.setMargins(m118655I, 0, m118655I, 0);
            setLayoutParams(layoutParams);
        }
    }

    public final void setMaxHeight(int i11) {
        this.f44637C0 = i11;
        getFeedItemSocialAlbumPhoto().setMaxHeight(i11);
        getFeedItemSocialAlbumVideo().setMAvailableHeight(i11);
    }

    public final void setOnHorFeedGrListener(C25897n0.c cVar) {
        getFeedItemSocialAlbumPhoto().setOnHorFeedGrListener(cVar);
    }

    public final void setOnVideoViewClickListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "listener");
        if (m44015X() && m44016Y()) {
            getFeedItemSocialAlbumVideo().setOnVideoViewClickListener(onClickListener);
        }
    }

    public final void setOnViewClickListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "listener");
        if (m44015X() && m44016Y()) {
            getFeedItemSocialAlbumVideo().setOnClickListener(onClickListener);
        }
    }

    public final void setParentView(View view) {
        this.f44636B0 = view;
    }

    public final void setPhotoLongClickListener(InterfaceC2260b interfaceC2260b) {
        getFeedItemSocialAlbumPhoto().setPhotoLongClickListener(interfaceC2260b);
    }

    public final void setRoundRect(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 4) {
                    AbstractC23136l9.m118729m1(this.f44641u0, AbstractC23136l9.m118742r(6.0f));
                    AbstractC23136l9.m118729m1(getFeedItemSocialAlbumPhoto(), AbstractC23136l9.m118742r(4.0f));
                    AbstractC23136l9.m118729m1(getFeedItemSocialAlbumVideo(), AbstractC23136l9.m118742r(4.0f));
                    return;
                }
                return;
            }
            AbstractC23136l9.m118729m1(this.f44642v0, AbstractC23136l9.m118742r(6.0f));
            AbstractC23136l9.m118729m1(getFeedItemSocialAlbumPhoto(), AbstractC23136l9.m118742r(4.0f));
            AbstractC23136l9.m118729m1(getFeedItemSocialAlbumVideo(), AbstractC23136l9.m118742r(4.0f));
            return;
        }
        AbstractC23136l9.m118729m1(this, AbstractC23136l9.m118742r(6.0f));
        AbstractC23136l9.m118729m1(getFeedItemSocialAlbumPhoto(), AbstractC23136l9.m118742r(4.0f));
        AbstractC23136l9.m118729m1(getFeedItemSocialAlbumVideo(), AbstractC23136l9.m118742r(4.0f));
    }

    public final void setScrolling(boolean z11) {
        this.f44644x0 = z11;
    }

    public final void setVideoMixClickListener(FeedItemSocialAlbumPhoto.InterfaceC8127a interfaceC8127a) {
        AbstractC19074t.m100208f(interfaceC8127a, "listener");
        if (m44015X()) {
            getFeedItemSocialAlbumPhoto().setOnVideoClickListener(interfaceC8127a);
        }
    }

    public final void setViewTag(int i11) {
        if (m44015X() && m44016Y()) {
            getFeedItemSocialAlbumVideo().setTag(AbstractC6918a0.id_video_data_index, Integer.valueOf(i11));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedItemSocialAlbum(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }
}
