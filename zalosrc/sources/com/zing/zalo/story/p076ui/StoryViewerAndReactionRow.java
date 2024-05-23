package com.zing.zalo.story.p076ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import cd0.C3430i;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StoryReactedOverviewLayout;
import com.zing.zalo.story.p076ui.StoryViewerAndReactionRow;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC16969d0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.ProgressBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22037m0;
import m30.C22826a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mi0.C23313a;
import mi0.C23314b;
import mj0.AbstractC23322a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p354n3.C23528a;
import p716zh.C31844ab;
import p716zh.C31853b5;
import p716zh.C31980jc;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class StoryViewerAndReactionRow extends ListItem {
    public static final C10915a Companion = new C10915a(null);

    /* renamed from: G */
    private Avatar f55124G;

    /* renamed from: H */
    private StoryReactedOverviewLayout f55125H;

    /* renamed from: I */
    private ZAppCompatImageView f55126I;

    /* renamed from: J */
    private RobotoTextView f55127J;

    /* renamed from: K */
    private ProgressBar f55128K;

    /* renamed from: L */
    private ViewStub f55129L;

    /* renamed from: M */
    private C3430i f55130M;

    /* renamed from: com.zing.zalo.story.ui.StoryViewerAndReactionRow$a */
    /* loaded from: classes5.dex */
    public static final class C10915a {
        private C10915a() {
        }

        public /* synthetic */ C10915a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryViewerAndReactionRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m56601v(C22826a.b bVar, int i11, C31844ab c31844ab, View view) {
        AbstractC19074t.m100208f(c31844ab, "$data");
        if (bVar != null) {
            String str = c31844ab.f146162a;
            AbstractC19074t.m100207e(str, "uid");
            bVar.mo88176d(i11, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m56602w(C22826a.b bVar, int i11, C31844ab c31844ab, View view) {
        AbstractC19074t.m100208f(c31844ab, "$data");
        if (bVar != null) {
            String str = c31844ab.f146162a;
            AbstractC19074t.m100207e(str, "uid");
            bVar.mo88176d(i11, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m56603x(C22826a.b bVar, C31844ab c31844ab, View view) {
        AbstractC19074t.m100208f(c31844ab, "$data");
        if (bVar != null) {
            bVar.mo88173a(c31844ab);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m56604y(C22826a.b bVar, C31844ab c31844ab, View view) {
        AbstractC19074t.m100208f(c31844ab, "$data");
        if (bVar != null) {
            bVar.mo88173a(c31844ab);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m56605z(C22826a.b bVar, C31844ab c31844ab, int i11, View view) {
        AbstractC19074t.m100208f(c31844ab, "$data");
        if (bVar != null) {
            bVar.mo88175c(c31844ab, i11);
        }
    }

    /* renamed from: A */
    public final void m56606A() {
        setTitleMaxLine(1);
        m90592m(false);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Avatar avatar = new Avatar(context);
        this.f55124G = avatar;
        m90587c(avatar);
        StoryReactedOverviewLayout storyReactedOverviewLayout = new StoryReactedOverviewLayout(getContext());
        this.f55125H = storyReactedOverviewLayout;
        storyReactedOverviewLayout.m75959V(C23212s8.m119607o(getContext(), AbstractC2807a.text_02), AbstractC2814h.t_small);
        View view = this.f55125H;
        ViewStub viewStub = null;
        if (view == null) {
            AbstractC19074t.m100223u("reactions");
            view = null;
        }
        m90586b(view);
        setPaddingTopOfBottom(EnumC16969d0.PADDING_2);
        setTrailingGravity(enumC16952b0);
        ViewStub viewStub2 = new ViewStub(getContext());
        this.f55129L = viewStub2;
        viewStub2.setLayoutResource(AbstractC7409c0.story_populate_layout);
        ViewStub viewStub3 = this.f55129L;
        if (viewStub3 == null) {
            AbstractC19074t.m100223u("stubStoryPopulate");
            viewStub3 = null;
        }
        viewStub3.setVisibility(8);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        this.f55126I = zAppCompatImageView;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_hide_line_24, AbstractC2807a.icon_02));
        ZAppCompatImageView zAppCompatImageView2 = this.f55126I;
        if (zAppCompatImageView2 == null) {
            AbstractC19074t.m100223u("btnBlock");
            zAppCompatImageView2 = null;
        }
        zAppCompatImageView2.setBackgroundResource(AbstractC23136l9.m118734o0(getContext(), false));
        ZAppCompatImageView zAppCompatImageView3 = this.f55126I;
        if (zAppCompatImageView3 == null) {
            AbstractC19074t.m100223u("btnBlock");
            zAppCompatImageView3 = null;
        }
        int i11 = AbstractC23222t7.f112566j;
        zAppCompatImageView3.setPadding(i11, i11, i11, i11);
        ZAppCompatImageView zAppCompatImageView4 = this.f55126I;
        if (zAppCompatImageView4 == null) {
            AbstractC19074t.m100223u("btnBlock");
            zAppCompatImageView4 = null;
        }
        zAppCompatImageView4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f55127J = new RobotoTextView(context3);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        C26703b m137293a = C26705d.m137293a(context4, AbstractC2814h.t_normal_m);
        RobotoTextView robotoTextView = this.f55127J;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("tvUnblock");
            robotoTextView = null;
        }
        new C26708g(robotoTextView).m137319a(m137293a);
        RobotoTextView robotoTextView2 = this.f55127J;
        if (robotoTextView2 == null) {
            AbstractC19074t.m100223u("tvUnblock");
            robotoTextView2 = null;
        }
        robotoTextView2.setText(AbstractC8020f0.str_restricted_user_snack_bar_prefix);
        RobotoTextView robotoTextView3 = this.f55127J;
        if (robotoTextView3 == null) {
            AbstractC19074t.m100223u("tvUnblock");
            robotoTextView3 = null;
        }
        robotoTextView3.setTextColor(AbstractC23136l9.m118639A(AbstractC2808b.color_title_list_item));
        RobotoTextView robotoTextView4 = this.f55127J;
        if (robotoTextView4 == null) {
            AbstractC19074t.m100223u("tvUnblock");
            robotoTextView4 = null;
        }
        robotoTextView4.setVisibility(4);
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        this.f55128K = new ProgressBar(context5);
        Context context6 = getContext();
        AbstractC19074t.m100207e(context6, "getContext(...)");
        C23313a m122698a = C23314b.m122698a(context6, AbstractC2814h.ProgressBar_Size32);
        ProgressBar progressBar = this.f55128K;
        if (progressBar == null) {
            AbstractC19074t.m100223u("pbLoadingBlock");
            progressBar = null;
        }
        progressBar.m90610b(m122698a);
        ProgressBar progressBar2 = this.f55128K;
        if (progressBar2 == null) {
            AbstractC19074t.m100223u("pbLoadingBlock");
            progressBar2 = null;
        }
        progressBar2.setIndeterminate(true);
        ProgressBar progressBar3 = this.f55128K;
        if (progressBar3 == null) {
            AbstractC19074t.m100223u("pbLoadingBlock");
            progressBar3 = null;
        }
        progressBar3.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(getContext());
        int i12 = AbstractC23222t7.f112534M;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i12);
        layoutParams.gravity = 8388629;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ZAppCompatImageView zAppCompatImageView5 = this.f55126I;
        if (zAppCompatImageView5 == null) {
            AbstractC19074t.m100223u("btnBlock");
            zAppCompatImageView5 = null;
        }
        frameLayout.addView(zAppCompatImageView5, layoutParams);
        RobotoTextView robotoTextView5 = this.f55127J;
        if (robotoTextView5 == null) {
            AbstractC19074t.m100223u("tvUnblock");
            robotoTextView5 = null;
        }
        frameLayout.addView(robotoTextView5, layoutParams2);
        ProgressBar progressBar4 = this.f55128K;
        if (progressBar4 == null) {
            AbstractC19074t.m100223u("pbLoadingBlock");
            progressBar4 = null;
        }
        frameLayout.addView(progressBar4, layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int i13 = AbstractC23222t7.f112566j;
        layoutParams3.leftMargin = i13;
        layoutParams3.rightMargin = i13;
        ViewStub viewStub4 = this.f55129L;
        if (viewStub4 == null) {
            AbstractC19074t.m100223u("stubStoryPopulate");
        } else {
            viewStub = viewStub4;
        }
        linearLayout.addView(viewStub, layoutParams3);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        m90589e(linearLayout);
        Context context7 = getContext();
        AbstractC19074t.m100207e(context7, "getContext(...)");
        setBackground(C27280g.m139658a(context7, AbstractC16803z.stencils_contact_bg));
    }

    /* renamed from: u */
    public final void m56607u(final int i11, final C31844ab c31844ab, C23528a c23528a, final C22826a.b bVar) {
        boolean z11;
        int i12;
        List list;
        AbstractC19074t.m100208f(c31844ab, "data");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        Avatar avatar = this.f55124G;
        ProgressBar progressBar = null;
        if (avatar == null) {
            AbstractC19074t.m100223u("avatar");
            avatar = null;
        }
        String str = c31844ab.f146163b;
        AbstractC19074t.m100207e(str, "avt");
        avatar.m90479n(str);
        Avatar avatar2 = this.f55124G;
        if (avatar2 == null) {
            AbstractC19074t.m100223u("avatar");
            avatar2 = null;
        }
        int i13 = 0;
        avatar2.m90482y(AbstractC22055v0.m115116F(c31844ab.f146162a, false), AbstractC22055v0.m115115E(c31844ab.f146162a, false));
        Avatar avatar3 = this.f55124G;
        if (avatar3 == null) {
            AbstractC19074t.m100223u("avatar");
            avatar3 = null;
        }
        avatar3.setIdTracking("imv_avatar_story_viewer_detail");
        if (C22013a0.m114928g() && C22013a0.m114924c().m114932h(4)) {
            C31980jc m115161u = AbstractC22055v0.m115161u(c31844ab.f146162a);
            if (AbstractC22055v0.m115113C(m115161u)) {
                ViewStub viewStub = this.f55129L;
                if (viewStub == null) {
                    AbstractC19074t.m100223u("stubStoryPopulate");
                    viewStub = null;
                }
                if (viewStub.getParent() != null) {
                    ViewStub viewStub2 = this.f55129L;
                    if (viewStub2 == null) {
                        AbstractC19074t.m100223u("stubStoryPopulate");
                        viewStub2 = null;
                    }
                    C3430i m17229k = C3430i.m17229k(viewStub2.inflate());
                    m17229k.m17193f(5);
                    this.f55130M = m17229k;
                }
                C3430i c3430i = this.f55130M;
                if (c3430i != null) {
                    c3430i.f14376p.setVisibility(0);
                    c3430i.mo17230p(m115161u, c23528a);
                    c3430i.f14376p.setOnClickListener(new View.OnClickListener() { // from class: p30.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StoryViewerAndReactionRow.m56601v(C22826a.b.this, i11, c31844ab, view);
                        }
                    });
                }
                Avatar avatar4 = this.f55124G;
                if (avatar4 == null) {
                    AbstractC19074t.m100223u("avatar");
                    avatar4 = null;
                }
                avatar4.setClickable(true);
                Avatar avatar5 = this.f55124G;
                if (avatar5 == null) {
                    AbstractC19074t.m100223u("avatar");
                    avatar5 = null;
                }
                avatar5.setOnClickListener(new View.OnClickListener() { // from class: p30.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryViewerAndReactionRow.m56602w(C22826a.b.this, i11, c31844ab, view);
                    }
                });
            } else {
                C3430i c3430i2 = this.f55130M;
                if (c3430i2 != null) {
                    c3430i2.f14376p.setVisibility(8);
                    c3430i2.f14376p.setOnClickListener(null);
                }
            }
        }
        String m114542i = AbstractC21935u.m114542i(c31844ab.f146162a, c31844ab.f146164c);
        AbstractC19074t.m100207e(m114542i, "convertZingNameToPhoneName(...)");
        setTitle(m114542i);
        if (C22037m0.f108553a.m115034h() && (list = c31844ab.f146166e) != null && (!list.isEmpty())) {
            StoryReactedOverviewLayout storyReactedOverviewLayout = this.f55125H;
            if (storyReactedOverviewLayout == null) {
                AbstractC19074t.m100223u("reactions");
                storyReactedOverviewLayout = null;
            }
            storyReactedOverviewLayout.setVisibility(0);
            StoryReactedOverviewLayout storyReactedOverviewLayout2 = this.f55125H;
            if (storyReactedOverviewLayout2 == null) {
                AbstractC19074t.m100223u("reactions");
                storyReactedOverviewLayout2 = null;
            }
            List list2 = c31844ab.f146166e;
            AbstractC19074t.m100207e(list2, "reactionList");
            storyReactedOverviewLayout2.m75960W(list2, String.valueOf(c31844ab.f146165d));
        } else {
            StoryReactedOverviewLayout storyReactedOverviewLayout3 = this.f55125H;
            if (storyReactedOverviewLayout3 == null) {
                AbstractC19074t.m100223u("reactions");
                storyReactedOverviewLayout3 = null;
            }
            storyReactedOverviewLayout3.setVisibility(8);
        }
        ZAppCompatImageView zAppCompatImageView = this.f55126I;
        if (zAppCompatImageView == null) {
            AbstractC19074t.m100223u("btnBlock");
            zAppCompatImageView = null;
        }
        zAppCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: p30.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryViewerAndReactionRow.m56603x(C22826a.b.this, c31844ab, view);
            }
        });
        RobotoTextView robotoTextView = this.f55127J;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("tvUnblock");
            robotoTextView = null;
        }
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: p30.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryViewerAndReactionRow.m56604y(C22826a.b.this, c31844ab, view);
            }
        });
        setIdTracking("story_reaction_user_viewed_list_item");
        setOnClickListener(new View.OnClickListener() { // from class: p30.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryViewerAndReactionRow.m56605z(C22826a.b.this, c31844ab, i11, view);
            }
        });
        C31853b5 m114309G = C21927m.m114302u().m114309G();
        if (m114309G != null) {
            z11 = m114309G.m153137g(c31844ab.f146162a);
        } else {
            z11 = false;
        }
        if (z11) {
            Avatar avatar6 = this.f55124G;
            if (avatar6 == null) {
                AbstractC19074t.m100223u("avatar");
                avatar6 = null;
            }
            avatar6.setAlpha(0.4f);
            StoryReactedOverviewLayout storyReactedOverviewLayout4 = this.f55125H;
            if (storyReactedOverviewLayout4 == null) {
                AbstractC19074t.m100223u("reactions");
                storyReactedOverviewLayout4 = null;
            }
            storyReactedOverviewLayout4.setAlpha(0.4f);
        } else {
            Avatar avatar7 = this.f55124G;
            if (avatar7 == null) {
                AbstractC19074t.m100223u("avatar");
                avatar7 = null;
            }
            avatar7.setAlpha(1.0f);
            StoryReactedOverviewLayout storyReactedOverviewLayout5 = this.f55125H;
            if (storyReactedOverviewLayout5 == null) {
                AbstractC19074t.m100223u("reactions");
                storyReactedOverviewLayout5 = null;
            }
            storyReactedOverviewLayout5.setAlpha(1.0f);
        }
        if (c31844ab.f146167f) {
            ZAppCompatImageView zAppCompatImageView2 = this.f55126I;
            if (zAppCompatImageView2 == null) {
                AbstractC19074t.m100223u("btnBlock");
                zAppCompatImageView2 = null;
            }
            zAppCompatImageView2.setVisibility(8);
            RobotoTextView robotoTextView2 = this.f55127J;
            if (robotoTextView2 == null) {
                AbstractC19074t.m100223u("tvUnblock");
                robotoTextView2 = null;
            }
            robotoTextView2.setVisibility(4);
            ProgressBar progressBar2 = this.f55128K;
            if (progressBar2 == null) {
                AbstractC19074t.m100223u("pbLoadingBlock");
            } else {
                progressBar = progressBar2;
            }
            progressBar.setVisibility(0);
            return;
        }
        ZAppCompatImageView zAppCompatImageView3 = this.f55126I;
        if (zAppCompatImageView3 == null) {
            AbstractC19074t.m100223u("btnBlock");
            zAppCompatImageView3 = null;
        }
        if (z11) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        zAppCompatImageView3.setVisibility(i12);
        RobotoTextView robotoTextView3 = this.f55127J;
        if (robotoTextView3 == null) {
            AbstractC19074t.m100223u("tvUnblock");
            robotoTextView3 = null;
        }
        if (!z11) {
            i13 = 4;
        }
        robotoTextView3.setVisibility(i13);
        ProgressBar progressBar3 = this.f55128K;
        if (progressBar3 == null) {
            AbstractC19074t.m100223u("pbLoadingBlock");
        } else {
            progressBar = progressBar3;
        }
        progressBar.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryViewerAndReactionRow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m56606A();
    }
}
