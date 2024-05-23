package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3021p1;
import bo.C3052w1;
import bo.C3056x1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public class SocialMemoryFeedItem extends LinearLayout {

    /* renamed from: p */
    ModulesView f45121p;

    /* renamed from: q */
    C22126c0 f45122q;

    /* renamed from: r */
    int f45123r;

    /* renamed from: s */
    View f45124s;

    /* renamed from: t */
    ModulesView f45125t;

    /* renamed from: u */
    C8323l1 f45126u;

    /* renamed from: v */
    FeedItemCommentBarModulesView f45127v;

    /* renamed from: w */
    ViewGroup f45128w;

    /* renamed from: x */
    int[] f45129x;

    public SocialMemoryFeedItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m44499b(C3056x1 c3056x1, C23528a c23528a) {
        C3020p0 c3020p0;
        C3000l0 m44502g = m44502g(c3056x1);
        if (m44502g != null) {
            c3020p0 = m44502g.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (this.f45127v != null && c3020p0 != null) {
            if (c3020p0.m14533x() != null) {
                this.f45127v.m43727d0(c3020p0.m14533x(), 0, false, null);
                this.f45127v.setVisibility(0);
            } else {
                this.f45127v.setVisibility(8);
            }
        }
    }

    /* renamed from: e */
    private void m44500e(C3056x1 c3056x1) {
        C3000l0 m44502g = m44502g(c3056x1);
        if (m44502g == null) {
            return;
        }
        C3020p0 m14322a0 = m44502g.m14322a0();
        if (this.f45121p != null && m14322a0 != null) {
            String m119260j = AbstractC23160o0.m119260j(m14322a0.f12062u, true);
            C22126c0 c22126c0 = this.f45122q;
            if (c22126c0 != null) {
                c22126c0.m111959G1(m119260j);
            }
        }
    }

    /* renamed from: f */
    private void m44501f() {
        int i11 = this.f45123r;
        if (i11 == 1 || i11 == 4) {
            m44508p();
        }
    }

    /* renamed from: g */
    private C3000l0 m44502g(C3056x1 c3056x1) {
        C3052w1 c3052w1;
        C3021p1 c3021p1;
        if (c3056x1 != null && (c3052w1 = c3056x1.f12358e) != null && (c3021p1 = c3052w1.f12305d) != null) {
            return c3021p1.f12071d;
        }
        return null;
    }

    private int getCommentHeight() {
        FeedItemCommentBarModulesView feedItemCommentBarModulesView = this.f45127v;
        if (feedItemCommentBarModulesView != null) {
            return feedItemCommentBarModulesView.getMeasuredHeight();
        }
        return 0;
    }

    private int getContentHeight() {
        View view = this.f45124s;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int getCurrentHeight() {
        return getHeaderHeight() + getContentHeight() + getFooterHeight() + getCommentHeight();
    }

    private int getFooterHeight() {
        C8323l1 c8323l1 = this.f45126u;
        if (c8323l1 != null) {
            return c8323l1.m89112O();
        }
        return 0;
    }

    private int getHeaderHeight() {
        ModulesView modulesView = this.f45121p;
        if (modulesView != null) {
            return modulesView.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: i */
    private FeedItemCommentBarModulesView m44503i() {
        FeedItemCommentBarModulesView feedItemCommentBarModulesView = new FeedItemCommentBarModulesView(getContext());
        feedItemCommentBarModulesView.m43726Y(getContext(), 11);
        return feedItemCommentBarModulesView;
    }

    /* renamed from: k */
    private int m44504k(C3056x1 c3056x1) {
        C3052w1 c3052w1;
        C3000l0 c3000l0;
        if (c3056x1 != null && (c3052w1 = c3056x1.f12358e) != null) {
            C3021p1 c3021p1 = c3052w1.f12305d;
            C3020p0 c3020p0 = null;
            if (c3021p1 != null) {
                c3000l0 = c3021p1.f12071d;
            } else {
                c3000l0 = null;
            }
            if (c3000l0 != null) {
                c3020p0 = c3000l0.m14322a0();
            }
            if (c3020p0 != null) {
                int i11 = c3020p0.f12058q;
                if (i11 == 1) {
                    return 3;
                }
                if (i11 == 2) {
                    return 1;
                }
                if (i11 == 3) {
                    return 2;
                }
                if (i11 == 17) {
                    return 4;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: l */
    private ModulesView m44505l() {
        ModulesView modulesView = new ModulesView(getContext());
        C8323l1 c8323l1 = new C8323l1(getContext());
        this.f45126u = c8323l1;
        c8323l1.m44778w1(getContext(), 11);
        modulesView.mo69681L(this.f45126u);
        return modulesView;
    }

    /* renamed from: m */
    private ModulesView m44506m() {
        ModulesView modulesView = new ModulesView(getContext());
        modulesView.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118742r(35.0f)));
        modulesView.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        C22126c0 c22126c0 = new C22126c0(getContext());
        this.f45122q = c22126c0;
        c22126c0.m89106L().m89027K(true).m89034R(AbstractC23136l9.m118742r(12.0f));
        this.f45122q.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f45122q.m111962J1(Color.parseColor("#ff828c95"));
        C16719g c16719g = new C16719g(getContext());
        c16719g.m89106L().m89028L(-1, AbstractC23136l9.m118742r(0.8f)).m89072y(Boolean.TRUE);
        c16719g.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.ItemSeparatorColor));
        c16719g.mo89158x0(0.5f);
        modulesView.mo69681L(this.f45122q);
        modulesView.mo69681L(c16719g);
        return modulesView;
    }

    /* renamed from: n */
    private void m44507n() {
        try {
            this.f45128w.getLocationOnScreen(this.f45129x);
            int currentHeight = getCurrentHeight() - ((AbstractC23136l9.m118713h0() - this.f45129x[1]) - AbstractC23136l9.m118655I(AbstractC16802y.social_memory_card_pd_bottom));
            if (currentHeight > 0) {
                int i11 = this.f45123r;
                if (i11 == 1) {
                    View view = this.f45124s;
                    if (view instanceof FeedItemPhotoModuleView) {
                        ((FeedItemPhotoModuleView) view).setShrinkHeight(currentHeight);
                    }
                }
                if (i11 == 4) {
                    View view2 = this.f45124s;
                    if (view2 instanceof FeedItemVideo) {
                        ((FeedItemVideo) view2).setShrinkHeight(currentHeight);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m44508p() {
        post(new Runnable() { // from class: com.zing.zalo.feed.components.e7
            @Override // java.lang.Runnable
            public final void run() {
                SocialMemoryFeedItem.this.requestLayout();
            }
        });
    }

    /* renamed from: a */
    public void m44509a(C3056x1 c3056x1, C23528a c23528a) {
        m44500e(c3056x1);
        m44510c(c3056x1, c23528a);
        m44511d(c3056x1);
        m44499b(c3056x1, c23528a);
        m44501f();
    }

    /* renamed from: c */
    public void m44510c(C3056x1 c3056x1, C23528a c23528a) {
        C3000l0 m44502g = m44502g(c3056x1);
        View view = this.f45124s;
        if (view != null && m44502g != null) {
            int i11 = this.f45123r;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4 && (view instanceof FeedItemVideo)) {
                            FeedItemVideo feedItemVideo = (FeedItemVideo) view;
                            FeedItemBase.m43679x(feedItemVideo, m44502g);
                            feedItemVideo.mo43681A(m44502g, 0, false, null);
                            feedItemVideo.setReleaseWhenDetached(false);
                            feedItemVideo.mo43897w0(m44502g, 0, false, getContext(), null, null);
                            return;
                        }
                        return;
                    }
                    if (view instanceof FeedItemTextModuleView) {
                        FeedItemTextModuleView feedItemTextModuleView = (FeedItemTextModuleView) view;
                        FeedItemBaseModuleView.m43693l0(feedItemTextModuleView, m44502g);
                        feedItemTextModuleView.m43696Y(m44502g, 0, false, null, null);
                        feedItemTextModuleView.mo43698b0(m44502g, 0, getContext(), null, null, true, null, false);
                        return;
                    }
                    return;
                }
                if (view instanceof FeedItemPhotoMultiModuleView) {
                    FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = (FeedItemPhotoMultiModuleView) view;
                    FeedItemBaseModuleView.m43693l0(feedItemPhotoMultiModuleView, m44502g);
                    feedItemPhotoMultiModuleView.m43696Y(m44502g, 0, false, null, null);
                    feedItemPhotoMultiModuleView.mo43698b0(m44502g, 0, getContext(), null, null, false, null, false);
                    feedItemPhotoMultiModuleView.m43984n1(3, 0, m44502g, 0, null, false, 0, null, null);
                    return;
                }
                return;
            }
            if (view instanceof FeedItemPhotoModuleView) {
                FeedItemPhotoModuleView feedItemPhotoModuleView = (FeedItemPhotoModuleView) view;
                feedItemPhotoModuleView.setScaleOption(m44502g.m14322a0());
                FeedItemBaseModuleView.m43693l0(feedItemPhotoModuleView, m44502g);
                feedItemPhotoModuleView.m43696Y(m44502g, 0, false, null, null);
                feedItemPhotoModuleView.mo43698b0(m44502g, 0, getContext(), null, null, false, null, false);
                feedItemPhotoModuleView.m43936W0(m44502g, 0, 0, this, false, null, null);
            }
        }
    }

    /* renamed from: d */
    public void m44511d(C3056x1 c3056x1) {
        C3000l0 m44502g = m44502g(c3056x1);
        C8323l1 c8323l1 = this.f45126u;
        if (c8323l1 != null && m44502g != null) {
            c8323l1.m44767T1(m44502g, 0, null, false);
        }
    }

    /* renamed from: h */
    public void m44512h(C3056x1 c3056x1, ViewGroup viewGroup) {
        this.f45128w = viewGroup;
        this.f45121p = m44506m();
        int m44504k = m44504k(c3056x1);
        this.f45123r = m44504k;
        this.f45124s = m44513j(this, m44504k);
        this.f45125t = m44505l();
        this.f45127v = m44503i();
        removeAllViews();
        setOrientation(1);
        ModulesView modulesView = this.f45121p;
        if (modulesView != null) {
            addView(modulesView);
        }
        View view = this.f45124s;
        if (view != null) {
            addView(view);
        }
        ModulesView modulesView2 = this.f45125t;
        if (modulesView2 != null) {
            addView(modulesView2);
        }
        FeedItemCommentBarModulesView feedItemCommentBarModulesView = this.f45127v;
        if (feedItemCommentBarModulesView != null) {
            addView(feedItemCommentBarModulesView);
        }
        AbstractC23136l9.m118729m1(this, AbstractC23136l9.m118742r(8.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public View m44513j(ViewGroup viewGroup, int i11) {
        FeedItemBaseModuleView feedItemBaseModuleView;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        feedItemBaseModuleView = null;
                    } else {
                        FeedItemVideo feedItemVideo = new FeedItemVideo(getContext());
                        feedItemVideo.mo43688p(getContext(), 11);
                        feedItemVideo.m44211d0();
                        feedItemBaseModuleView = feedItemVideo;
                    }
                } else {
                    FeedItemBaseModuleView feedItemTextModuleView = new FeedItemTextModuleView(getContext());
                    feedItemTextModuleView.mo43705j0(getContext(), 11);
                    feedItemBaseModuleView = feedItemTextModuleView;
                }
            } else {
                FeedItemBaseModuleView feedItemPhotoMultiModuleView = new FeedItemPhotoMultiModuleView(viewGroup.getContext());
                feedItemPhotoMultiModuleView.mo43705j0(viewGroup.getContext(), 11);
                feedItemBaseModuleView = feedItemPhotoMultiModuleView;
            }
        } else {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            FeedItemBaseModuleView feedItemPhotoModuleView = new FeedItemPhotoModuleView(viewGroup.getContext());
            feedItemPhotoModuleView.setLayoutParams(layoutParams);
            feedItemPhotoModuleView.mo43705j0(viewGroup.getContext(), 11);
            feedItemBaseModuleView = feedItemPhotoModuleView;
        }
        if (feedItemBaseModuleView == null) {
            return new View(viewGroup.getContext());
        }
        return feedItemBaseModuleView;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        m44507n();
    }

    public SocialMemoryFeedItem(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f45129x = new int[2];
    }
}
