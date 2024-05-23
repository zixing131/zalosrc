package com.zing.zalo.story.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.story.component.StoryBarFooterRetry;
import com.zing.zalo.uidrawing.ModulesView;
import me0.AbstractC23136l9;
import me0.C23212s8;
import t80.C26597j;

/* loaded from: classes5.dex */
public class StoryBarFooterRetry extends RelativeLayout {

    /* renamed from: p */
    int f55098p;

    /* renamed from: q */
    RecyclingImageView f55099q;

    /* renamed from: r */
    ProgressBar f55100r;

    /* renamed from: s */
    View f55101s;

    /* renamed from: t */
    RobotoTextView f55102t;

    /* renamed from: u */
    ModulesView f55103u;

    /* renamed from: v */
    C26597j f55104v;

    public StoryBarFooterRetry(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m56583d(AbstractC7220t8 abstractC7220t8, View view) {
        if (abstractC7220t8 != null) {
            abstractC7220t8.mo36734b();
        }
    }

    /* renamed from: b */
    public void m56584b(final AbstractC7220t8 abstractC7220t8) {
        C26597j c26597j;
        try {
            int i11 = this.f55098p;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2 && (c26597j = this.f55104v) != null) {
                    c26597j.m136549z1();
                }
                setOnClickListener(new View.OnClickListener() { // from class: n30.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryBarFooterRetry.m56583d(AbstractC7220t8.this, view);
                    }
                });
            }
            AbstractC23136l9.m118744r1(this.f55099q, 0);
            RobotoTextView robotoTextView = this.f55102t;
            if (robotoTextView != null) {
                robotoTextView.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_story_reload));
                this.f55102t.setVisibility(0);
            }
            AbstractC23136l9.m118744r1(this.f55100r, 8);
            AbstractC23136l9.m118744r1(this.f55101s, 0);
            setOnClickListener(new View.OnClickListener() { // from class: n30.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryBarFooterRetry.m56583d(AbstractC7220t8.this, view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m56585c(Context context, int i11) {
        this.f55098p = i11;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setGravity(17);
        setMinimumWidth(AbstractC23136l9.m118655I(AbstractC16802y.story_bar_avatar_width));
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            int i12 = this.f55098p;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    layoutInflater.inflate(AbstractC7409c0.story_bar_item_loading_retry_content_large, this);
                    this.f55103u = (ModulesView) findViewById(AbstractC6918a0.story_bar_footer_retry_module_view);
                    if (this.f55104v == null) {
                        this.f55104v = new C26597j(context);
                    }
                    ModulesView modulesView = this.f55103u;
                    if (modulesView != null) {
                        modulesView.mo69681L(this.f55104v);
                        return;
                    }
                    return;
                }
                return;
            }
            layoutInflater.inflate(AbstractC7409c0.story_bar_item_loading_retry_content, this);
            this.f55099q = (RecyclingImageView) findViewById(AbstractC6918a0.ic_story_avatar);
            this.f55100r = (ProgressBar) findViewById(AbstractC6918a0.ic_story_loading);
            this.f55101s = findViewById(AbstractC6918a0.img_story_retry);
            this.f55102t = (RobotoTextView) findViewById(AbstractC6918a0.tv_story_name);
            m56586e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    void m56586e() {
        int i11;
        int i12;
        int i13;
        try {
            int i14 = this.f55098p;
            if (i14 == 1) {
                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_width);
                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_height);
                i13 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_item_circle_corner_radius);
            } else if (i14 == 0) {
                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_width);
                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_height);
                i13 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_item_roundrect_corner_radius);
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            RecyclingImageView recyclingImageView = this.f55099q;
            if (recyclingImageView != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclingImageView.getLayoutParams();
                layoutParams.width = i11;
                layoutParams.height = i12;
                this.f55099q.setLayoutParams(layoutParams);
                RecyclingImageView recyclingImageView2 = this.f55099q;
                if (recyclingImageView2 instanceof RoundCornerImageView) {
                    ((RoundCornerImageView) recyclingImageView2).setRoundRadius(i13);
                    RecyclingImageView recyclingImageView3 = this.f55099q;
                    ((RoundCornerImageView) recyclingImageView3).setRoundCornerColor(C23212s8.m119607o(recyclingImageView3.getContext(), AbstractC16781w.PrimaryBackgroundColor));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public StoryBarFooterRetry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
