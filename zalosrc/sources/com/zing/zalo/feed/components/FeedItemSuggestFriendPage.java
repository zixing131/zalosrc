package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p304ks.C21927m;
import p348mi.C23302b;
import p489rn.C25927x0;
import p716zh.C31874cb;
import t00.C26446c;
import ui0.C27280g;

/* loaded from: classes4.dex */
public class FeedItemSuggestFriendPage extends RelativeLayout {

    /* renamed from: p */
    private GroupAvatarView f44758p;

    /* renamed from: q */
    private RobotoTextView f44759q;

    /* renamed from: r */
    private RobotoTextView f44760r;

    /* renamed from: s */
    private final Context f44761s;

    /* renamed from: t */
    private AppCompatImageView f44762t;

    public FeedItemSuggestFriendPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44761s = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m44119e(C25927x0.a aVar, C31874cb c31874cb, int i11, int i12, View view) {
        if (aVar != null) {
            aVar.mo36956x2(c31874cb, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m44120f(C25927x0.a aVar, C31874cb c31874cb, int i11, View view) {
        if (aVar != null) {
            aVar.mo36956x2(c31874cb, 3, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m44121g(C25927x0.a aVar, C31874cb c31874cb, int i11, View view) {
        if (aVar != null) {
            aVar.mo36956x2(c31874cb, 2, i11);
        }
    }

    /* renamed from: d */
    public void m44122d(Context context, int i11) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_suggest_friend_page_content, this);
        this.f44758p = (GroupAvatarView) findViewById(AbstractC6918a0.buddy_dp);
        this.f44759q = (RobotoTextView) findViewById(AbstractC6918a0.name);
        this.f44760r = (RobotoTextView) findViewById(AbstractC6918a0.btn_func);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(AbstractC6918a0.btn_delete);
        this.f44762t = appCompatImageView;
        appCompatImageView.setImageDrawable(C27280g.m139660c(this.f44761s, AbstractC23322a.zds_ic_close_line_16, AbstractC2807a.icon_02));
    }

    /* renamed from: h */
    public void m44123h(final int i11, final C31874cb c31874cb, boolean z11, final C25927x0.a aVar, boolean z12) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (c31874cb != null) {
            final int i17 = 6;
            int i18 = 8;
            if (c31874cb.f146400p == 3) {
                this.f44760r.setText(AbstractC23244v8.m119739c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg)));
                RobotoTextView robotoTextView = this.f44760r;
                if (c31874cb.f146406v == 1) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                robotoTextView.setVisibility(i16);
                AppCompatImageView appCompatImageView = this.f44762t;
                if (c31874cb.f146407w == 1) {
                    i18 = 0;
                }
                appCompatImageView.setVisibility(i18);
            } else if (c31874cb.f146390f > 0) {
                this.f44760r.setText(AbstractC23244v8.m119739c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_follow_page)));
                AppCompatImageView appCompatImageView2 = this.f44762t;
                if (c31874cb.f146407w == 1) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                appCompatImageView2.setVisibility(i15);
                if (C21927m.m114302u().m114357s().m153137g(c31874cb.f146385a)) {
                    RobotoTextView robotoTextView2 = this.f44760r;
                    if (c31874cb.f146406v == 1) {
                        i18 = 0;
                    }
                    robotoTextView2.setVisibility(i18);
                    this.f44760r.setText(AbstractC23244v8.m119739c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg)));
                } else {
                    RobotoTextView robotoTextView3 = this.f44760r;
                    if (c31874cb.f146406v == 1) {
                        i18 = 0;
                    }
                    robotoTextView3.setVisibility(i18);
                    this.f44760r.setText(AbstractC23244v8.m119739c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_follow_page)));
                    i17 = 4;
                }
            } else {
                int i19 = c31874cb.f146399o;
                if (i19 == 1) {
                    this.f44760r.setText(AbstractC23244v8.m119739c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new)));
                    RobotoTextView robotoTextView4 = this.f44760r;
                    if (c31874cb.f146406v == 1) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    robotoTextView4.setVisibility(i14);
                    AppCompatImageView appCompatImageView3 = this.f44762t;
                    if (c31874cb.f146407w == 1) {
                        i18 = 0;
                    }
                    appCompatImageView3.setVisibility(i18);
                } else if (i19 == 2) {
                    this.f44760r.setText(AbstractC23244v8.m119739c(C26446c.m136326b().m136327a()));
                    RobotoTextView robotoTextView5 = this.f44760r;
                    if (c31874cb.f146406v == 1) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    robotoTextView5.setVisibility(i13);
                    AppCompatImageView appCompatImageView4 = this.f44762t;
                    if (c31874cb.f146407w == 1) {
                        i18 = 0;
                    }
                    appCompatImageView4.setVisibility(i18);
                    i17 = 5;
                } else {
                    this.f44760r.setText(AbstractC23244v8.m119739c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new)));
                    RobotoTextView robotoTextView6 = this.f44760r;
                    if (c31874cb.f146406v == 1) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    robotoTextView6.setVisibility(i12);
                    AppCompatImageView appCompatImageView5 = this.f44762t;
                    if (c31874cb.f146407w == 1) {
                        i18 = 0;
                    }
                    appCompatImageView5.setVisibility(i18);
                }
                i17 = 4;
            }
            this.f44760r.setBackgroundResource(AbstractC16803z.bg_btn_suggest_feed);
            RobotoTextView robotoTextView7 = this.f44760r;
            robotoTextView7.setTextColor(C23212s8.m119607o(robotoTextView7.getContext(), AbstractC16781w.feed_ads_text_color));
            this.f44760r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.p4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemSuggestFriendPage.m44119e(C25927x0.a.this, c31874cb, i17, i11, view);
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.q4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemSuggestFriendPage.m44120f(C25927x0.a.this, c31874cb, i11, view);
                }
            });
            this.f44759q.setText(c31874cb.m153180d(true, false));
            if (C23302b.f113247a.m120523d(c31874cb.f146393i) && !TextUtils.isEmpty(c31874cb.f146401q)) {
                this.f44758p.setShortDpnAvt(c31874cb.f146401q);
                this.f44758p.setUidForGenColor(c31874cb.f146385a);
            }
            this.f44758p.setImageOption(C23278z2.m120143n());
            if (!TextUtils.isEmpty(c31874cb.f146393i)) {
                this.f44758p.setScrollingMode(z11);
                this.f44758p.m75732d(c31874cb.f146393i);
            }
            this.f44762t.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.r4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemSuggestFriendPage.m44121g(C25927x0.a.this, c31874cb, i11, view);
                }
            });
        }
    }
}
