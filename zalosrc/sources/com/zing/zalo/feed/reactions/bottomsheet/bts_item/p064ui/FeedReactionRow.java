package com.zing.zalo.feed.reactions.bottomsheet.bts_item.p064ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.feed.reactions.bottomsheet.C8840a;
import com.zing.zalo.feed.reactions.bottomsheet.bts_item.p064ui.FeedReactionRow;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC16969d0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p461qu.AbstractC25495a;
import p584vr.C28605b;
import p584vr.C28606c;
import p584vr.C28607d;
import p619wr.C29198e;
import p691yr.C31060j;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class FeedReactionRow extends ListItem {

    /* renamed from: G */
    private Avatar f47230G;

    /* renamed from: H */
    private ZAppCompatImageView f47231H;

    /* renamed from: I */
    private ImageView f47232I;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedReactionRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
        m47218w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m47215s(C8840a.c cVar, int i11, C29198e c29198e, View view) {
        AbstractC19074t.m100208f(c29198e, "$data");
        if (cVar != null) {
            cVar.mo47168a(new C28605b(i11, c29198e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m47216u(C8840a.c cVar, C29198e c29198e, View view) {
        AbstractC19074t.m100208f(c29198e, "$data");
        if (cVar != null) {
            cVar.mo47168a(new C28607d(c29198e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m47217v(C8840a.c cVar, C29198e c29198e, View view) {
        AbstractC19074t.m100208f(c29198e, "$data");
        if (cVar != null) {
            cVar.mo47168a(new C28606c(c29198e));
        }
    }

    /* renamed from: w */
    private final void m47218w() {
        setTitleMaxLine(1);
        m90592m(false);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Avatar avatar = new Avatar(context);
        this.f47230G = avatar;
        m90587c(avatar);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        int i11 = AbstractC23222t7.f112594x;
        zAppCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(i11, i11));
        zAppCompatImageView.setAdjustViewBounds(true);
        zAppCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f47231H = zAppCompatImageView;
        m90586b(zAppCompatImageView);
        setPaddingTopOfBottom(EnumC16969d0.PADDING_4);
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(getContext());
        int i12 = AbstractC23222t7.f112514B;
        zAppCompatImageView2.setLayoutParams(new LinearLayout.LayoutParams(i12, i12));
        zAppCompatImageView2.setAdjustViewBounds(true);
        Context context2 = zAppCompatImageView2.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_chat_line_24, AbstractC2807a.icon_tertiary));
        this.f47232I = zAppCompatImageView2;
        m90589e(zAppCompatImageView2);
        setTrailingGravity(enumC16952b0);
        setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
    }

    /* renamed from: r */
    public final void m47219r(final int i11, final C29198e c29198e, final C8840a.c cVar) {
        AbstractC19074t.m100208f(c29198e, "data");
        Avatar avatar = this.f47230G;
        ImageView imageView = null;
        if (avatar == null) {
            AbstractC19074t.m100223u("avatar");
            avatar = null;
        }
        avatar.m90479n(c29198e.m145763a());
        avatar.m90482y(c29198e.m145765c(), c29198e.m145764b());
        avatar.setIdTracking("imv_avatar_story_viewer_detail");
        avatar.setOnClickListener(new View.OnClickListener() { // from class: xr.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedReactionRow.m47215s(C8840a.c.this, i11, c29198e, view);
            }
        });
        setTitle(c29198e.m145767e());
        if (!AbstractC25495a.m132077b(c29198e.m145768f())) {
            ZAppCompatImageView zAppCompatImageView = this.f47231H;
            if (zAppCompatImageView == null) {
                AbstractC19074t.m100223u("reaction");
                zAppCompatImageView = null;
            }
            C31060j c31060j = C31060j.f143193a;
            int m145766d = c29198e.m145766d();
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C31060j.m150906E(c31060j, m145766d, context, null, 4, null));
            ZAppCompatImageView zAppCompatImageView2 = this.f47231H;
            if (zAppCompatImageView2 == null) {
                AbstractC19074t.m100223u("reaction");
                zAppCompatImageView2 = null;
            }
            zAppCompatImageView2.setVisibility(0);
        } else {
            ZAppCompatImageView zAppCompatImageView3 = this.f47231H;
            if (zAppCompatImageView3 == null) {
                AbstractC19074t.m100223u("reaction");
                zAppCompatImageView3 = null;
            }
            zAppCompatImageView3.setVisibility(8);
        }
        setOnClickListener(new View.OnClickListener() { // from class: xr.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedReactionRow.m47216u(C8840a.c.this, c29198e, view);
            }
        });
        if (!AbstractC25495a.m132077b(c29198e.m145768f()) && !AbstractC19074t.m100204b(c29198e.m145768f(), CoreUtility.f89233i)) {
            ImageView imageView2 = this.f47232I;
            if (imageView2 == null) {
                AbstractC19074t.m100223u("msgButton");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.f47232I;
            if (imageView3 == null) {
                AbstractC19074t.m100223u("msgButton");
            } else {
                imageView = imageView3;
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: xr.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedReactionRow.m47217v(C8840a.c.this, c29198e, view);
                }
            });
            return;
        }
        ImageView imageView4 = this.f47232I;
        if (imageView4 == null) {
            AbstractC19074t.m100223u("msgButton");
        } else {
            imageView = imageView4;
        }
        imageView.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedReactionRow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m47218w();
    }
}
