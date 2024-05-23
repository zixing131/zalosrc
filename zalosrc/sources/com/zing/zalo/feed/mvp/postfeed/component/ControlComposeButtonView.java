package com.zing.zalo.feed.mvp.postfeed.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zlottie.widget.LottieImageView;
import fn0.AbstractC19074t;
import is.C20791e;
import me0.AbstractC23136l9;
import me0.AbstractC23193r0;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p494rv.C25979a;
import p649xl.C29830h2;
import tg.C26657h;
import tg.C26663n;
import tg.C26674y;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ControlComposeButtonView extends RelativeLayout {

    /* renamed from: A */
    private boolean f46428A;

    /* renamed from: B */
    private boolean f46429B;

    /* renamed from: C */
    private boolean f46430C;

    /* renamed from: p */
    private C29830h2 f46431p;

    /* renamed from: q */
    private boolean f46432q;

    /* renamed from: r */
    private boolean f46433r;

    /* renamed from: s */
    private InterfaceC8625a f46434s;

    /* renamed from: t */
    private String f46435t;

    /* renamed from: u */
    private String f46436u;

    /* renamed from: v */
    private boolean f46437v;

    /* renamed from: w */
    private boolean f46438w;

    /* renamed from: x */
    private boolean f46439x;

    /* renamed from: y */
    private boolean f46440y;

    /* renamed from: z */
    private boolean f46441z;

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8625a {
        /* renamed from: a */
        void mo45922a();

        /* renamed from: b */
        void mo45923b(boolean z11, boolean z12);

        /* renamed from: c */
        void mo45924c();

        /* renamed from: d */
        void mo45925d();

        /* renamed from: e */
        void mo45926e();
    }

    public ControlComposeButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46435t = "";
        this.f46436u = "";
        this.f46437v = true;
        this.f46438w = true;
        this.f46439x = true;
        this.f46441z = true;
        this.f46428A = true;
        this.f46429B = true;
        m45918h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m45909i(ControlComposeButtonView controlComposeButtonView, View view) {
        AbstractC19074t.m100208f(controlComposeButtonView, "this$0");
        InterfaceC8625a interfaceC8625a = controlComposeButtonView.f46434s;
        if (interfaceC8625a != null) {
            interfaceC8625a.mo45924c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m45910j(ControlComposeButtonView controlComposeButtonView, View view) {
        AbstractC19074t.m100208f(controlComposeButtonView, "this$0");
        InterfaceC8625a interfaceC8625a = controlComposeButtonView.f46434s;
        if (interfaceC8625a != null) {
            interfaceC8625a.mo45926e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m45911k(ControlComposeButtonView controlComposeButtonView, View view) {
        AbstractC19074t.m100208f(controlComposeButtonView, "this$0");
        InterfaceC8625a interfaceC8625a = controlComposeButtonView.f46434s;
        if (interfaceC8625a != null) {
            interfaceC8625a.mo45922a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m45912l(ControlComposeButtonView controlComposeButtonView, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(controlComposeButtonView, "this$0");
        InterfaceC8625a interfaceC8625a = controlComposeButtonView.f46434s;
        if (interfaceC8625a != null) {
            C29830h2 c29830h2 = controlComposeButtonView.f46431p;
            if (c29830h2 == null) {
                AbstractC19074t.m100223u("binding");
                c29830h2 = null;
            }
            interfaceC8625a.mo45923b(c29830h2.f137944B.isEnabled(), z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m45913m(ControlComposeButtonView controlComposeButtonView, View view) {
        AbstractC19074t.m100208f(controlComposeButtonView, "this$0");
        C29830h2 c29830h2 = controlComposeButtonView.f46431p;
        C29830h2 c29830h22 = null;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        Switch r32 = c29830h2.f137944B;
        C29830h2 c29830h23 = controlComposeButtonView.f46431p;
        if (c29830h23 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29830h22 = c29830h23;
        }
        r32.setChecked(!c29830h22.f137944B.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m45914n(ControlComposeButtonView controlComposeButtonView, View view) {
        AbstractC19074t.m100208f(controlComposeButtonView, "this$0");
        InterfaceC8625a interfaceC8625a = controlComposeButtonView.f46434s;
        if (interfaceC8625a != null) {
            interfaceC8625a.mo45925d();
        }
    }

    /* renamed from: p */
    private final void m45915p() {
        if (this.f46432q && this.f46433r) {
            C29830h2 c29830h2 = this.f46431p;
            C29830h2 c29830h22 = null;
            if (c29830h2 == null) {
                AbstractC19074t.m100223u("binding");
                c29830h2 = null;
            }
            c29830h2.f137953s.setVisibility(8);
            C29830h2 c29830h23 = this.f46431p;
            if (c29830h23 == null) {
                AbstractC19074t.m100223u("binding");
                c29830h23 = null;
            }
            c29830h23.f137960z.setVisibility(0);
            C29830h2 c29830h24 = this.f46431p;
            if (c29830h24 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29830h22 = c29830h24;
            }
            c29830h22.f137960z.m92155v();
        }
    }

    /* renamed from: q */
    private final void m45916q() {
        new C26663n(null, 0).m136827c(getEffectIDLottie(), new C26674y.b() { // from class: eq.h
            @Override // tg.C26674y.b
            /* renamed from: a */
            public final void mo15759a(int i11, String str, String str2, C26657h c26657h) {
                ControlComposeButtonView.m45917r(ControlComposeButtonView.this, i11, str, str2, c26657h);
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m45917r(ControlComposeButtonView controlComposeButtonView, int i11, String str, String str2, C26657h c26657h) {
        AbstractC19074t.m100208f(controlComposeButtonView, "this$0");
        if (AbstractC19074t.m100204b(str, controlComposeButtonView.getEffectIDLottie()) && i11 == 0 && str2 != null && c26657h != null && c26657h.f126157b > 0) {
            C29830h2 c29830h2 = controlComposeButtonView.f46431p;
            C29830h2 c29830h22 = null;
            if (c29830h2 == null) {
                AbstractC19074t.m100223u("binding");
                c29830h2 = null;
            }
            c29830h2.f137960z.m92147B(str2 + "/data.json", "fullscreen_lottie_effect_" + str, !AbstractC23193r0.m119506o(), false);
            LottieConfig lottieConfig = c26657h.f126162g;
            if (lottieConfig != null) {
                C29830h2 c29830h23 = controlComposeButtonView.f46431p;
                if (c29830h23 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29830h22 = c29830h23;
                }
                LottieImageView lottieImageView = c29830h22.f137960z;
                AbstractC19074t.m100207e(lottieImageView, "lottieMusic");
                C25979a.m133810a(lottieImageView, lottieConfig);
            }
            controlComposeButtonView.f46433r = true;
        }
    }

    public final String getEffectIDLottie() {
        if (C23212s8.m119603k()) {
            return C20791e.f102159a.m108486b();
        }
        return C20791e.f102159a.m108485a();
    }

    public final boolean getEnableAlbum() {
        return this.f46429B;
    }

    public final boolean getEnableLyric() {
        return this.f46440y;
    }

    public final boolean getEnableMusic() {
        return this.f46438w;
    }

    public final View getLayoutMusic() {
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        RelativeLayout relativeLayout = c29830h2.f137956v;
        AbstractC19074t.m100207e(relativeLayout, "layoutMusic");
        return relativeLayout;
    }

    public final GlowingReddot getLayoutMusicRedDot() {
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        GlowingReddot glowingReddot = c29830h2.f137943A;
        AbstractC19074t.m100207e(glowingReddot, "musicReddot");
        return glowingReddot;
    }

    public final InterfaceC8625a getListener() {
        return this.f46434s;
    }

    public final boolean getShowAlbum() {
        return this.f46428A;
    }

    public final boolean getShowLyric() {
        return this.f46439x;
    }

    public final boolean getShowMultiPhotoLayoutBottomSheet() {
        return this.f46430C;
    }

    public final boolean getShowMusic() {
        return this.f46437v;
    }

    public final boolean getShowNoLyric() {
        return this.f46441z;
    }

    public final String getTextAlbum() {
        return this.f46436u;
    }

    public final String getTextMusic() {
        return this.f46435t;
    }

    /* renamed from: h */
    public final void m45918h(Context context) {
        C29830h2 m148019c = C29830h2.m148019c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148019c, "inflate(...)");
        this.f46431p = m148019c;
        C29830h2 c29830h2 = null;
        if (m148019c == null) {
            AbstractC19074t.m100223u("binding");
            m148019c = null;
        }
        m148019c.f137948F.setOnClickListener(new View.OnClickListener() { // from class: eq.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlComposeButtonView.m45909i(ControlComposeButtonView.this, view);
            }
        });
        C29830h2 c29830h22 = this.f46431p;
        if (c29830h22 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h22 = null;
        }
        c29830h22.f137945C.setOnClickListener(new View.OnClickListener() { // from class: eq.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlComposeButtonView.m45910j(ControlComposeButtonView.this, view);
            }
        });
        C29830h2 c29830h23 = this.f46431p;
        if (c29830h23 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h23 = null;
        }
        c29830h23.f137956v.setOnClickListener(new View.OnClickListener() { // from class: eq.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlComposeButtonView.m45911k(ControlComposeButtonView.this, view);
            }
        });
        C29830h2 c29830h24 = this.f46431p;
        if (c29830h24 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h24 = null;
        }
        c29830h24.f137944B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: eq.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                ControlComposeButtonView.m45912l(ControlComposeButtonView.this, compoundButton, z11);
            }
        });
        C29830h2 c29830h25 = this.f46431p;
        if (c29830h25 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h25 = null;
        }
        c29830h25.f137955u.setOnClickListener(new View.OnClickListener() { // from class: eq.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlComposeButtonView.m45913m(ControlComposeButtonView.this, view);
            }
        });
        C29830h2 c29830h26 = this.f46431p;
        if (c29830h26 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h26 = null;
        }
        c29830h26.f137953s.setVisibility(0);
        C29830h2 c29830h27 = this.f46431p;
        if (c29830h27 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h27 = null;
        }
        c29830h27.f137960z.setVisibility(8);
        C29830h2 c29830h28 = this.f46431p;
        if (c29830h28 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h28 = null;
        }
        c29830h28.f137954t.setVisibility(8);
        C29830h2 c29830h29 = this.f46431p;
        if (c29830h29 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29830h2 = c29830h29;
        }
        c29830h2.f137954t.setOnClickListener(new View.OnClickListener() { // from class: eq.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlComposeButtonView.m45914n(ControlComposeButtonView.this, view);
            }
        });
    }

    /* renamed from: s */
    public final void m45919s(boolean z11) {
        C29830h2 c29830h2 = null;
        if (z11) {
            C29830h2 c29830h22 = this.f46431p;
            if (c29830h22 == null) {
                AbstractC19074t.m100223u("binding");
                c29830h22 = null;
            }
            c29830h22.f137944B.setChecked(false);
            C29830h2 c29830h23 = this.f46431p;
            if (c29830h23 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29830h2 = c29830h23;
            }
            c29830h2.f137955u.setAlpha(0.3f);
            return;
        }
        C29830h2 c29830h24 = this.f46431p;
        if (c29830h24 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29830h2 = c29830h24;
        }
        c29830h2.f137955u.setAlpha(1.0f);
    }

    public final void setEnableAlbum(boolean z11) {
        float f11;
        this.f46429B = z11;
        C29830h2 c29830h2 = this.f46431p;
        C29830h2 c29830h22 = null;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        c29830h2.f137948F.setEnabled(z11);
        C29830h2 c29830h23 = this.f46431p;
        if (c29830h23 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29830h22 = c29830h23;
        }
        RobotoTextView robotoTextView = c29830h22.f137948F;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.3f;
        }
        robotoTextView.setAlpha(f11);
    }

    public final void setEnableLyric(boolean z11) {
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        c29830h2.f137944B.setChecked(z11);
        this.f46440y = z11;
    }

    public final void setEnableMusic(boolean z11) {
        float f11;
        this.f46438w = z11;
        C29830h2 c29830h2 = this.f46431p;
        C29830h2 c29830h22 = null;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        c29830h2.f137956v.setEnabled(z11);
        C29830h2 c29830h23 = this.f46431p;
        if (c29830h23 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29830h22 = c29830h23;
        }
        RelativeLayout relativeLayout = c29830h22.f137956v;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.3f;
        }
        relativeLayout.setAlpha(f11);
    }

    public final void setListener(InterfaceC8625a interfaceC8625a) {
        this.f46434s = interfaceC8625a;
    }

    public final void setShowAlbum(boolean z11) {
        int i11;
        this.f46428A = z11;
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        RobotoTextView robotoTextView = c29830h2.f137948F;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setShowLyric(boolean z11) {
        int i11;
        this.f46439x = z11;
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        LinearLayout linearLayout = c29830h2.f137955u;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    public final void setShowMultiPhotoLayoutBottomSheet(boolean z11) {
        int i11;
        this.f46430C = z11;
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        RelativeLayout relativeLayout = c29830h2.f137954t;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        relativeLayout.setVisibility(i11);
    }

    public final void setShowMusic(boolean z11) {
        int i11;
        this.f46437v = z11;
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        RelativeLayout relativeLayout = c29830h2.f137956v;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        relativeLayout.setVisibility(i11);
        m45915p();
    }

    public final void setShowNoLyric(boolean z11) {
        int i11;
        this.f46441z = z11;
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        LinearLayout linearLayout = c29830h2.f137957w;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    public final void setTextAlbum(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f46436u = str;
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        c29830h2.f137948F.setText(str);
    }

    public final void setTextMusic(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f46435t = str;
        C29830h2 c29830h2 = this.f46431p;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        c29830h2.f137949G.setText(str);
    }

    /* renamed from: u */
    public final void m45920u() {
        C29830h2 c29830h2 = this.f46431p;
        C29830h2 c29830h22 = null;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        c29830h2.f137948F.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_border_postfeed_album));
        C29830h2 c29830h23 = this.f46431p;
        if (c29830h23 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h23 = null;
        }
        c29830h23.f137948F.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.MusicFeedComposeButtonAlbumTextColor));
        C29830h2 c29830h24 = this.f46431p;
        if (c29830h24 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h24 = null;
        }
        RobotoTextView robotoTextView = c29830h24.f137948F;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        robotoTextView.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(context, AbstractC23322a.zds_ic_album_book_solid_16, AbstractC16781w.fpf_ic_album_book_color), (Drawable) null, (Drawable) null, (Drawable) null);
        C29830h2 c29830h25 = this.f46431p;
        if (c29830h25 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h25 = null;
        }
        c29830h25.f137956v.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_border_postfeed_music));
        C29830h2 c29830h26 = this.f46431p;
        if (c29830h26 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h26 = null;
        }
        c29830h26.f137949G.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.MusicFeedComposeButtonMusicTextColor));
        C29830h2 c29830h27 = this.f46431p;
        if (c29830h27 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h27 = null;
        }
        ImageView imageView = c29830h27.f137953s;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        imageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_melody_solid_16, AbstractC16781w.MusicFeedComposeButtonMusicTextColor));
        C29830h2 c29830h28 = this.f46431p;
        if (c29830h28 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h28 = null;
        }
        AppCompatImageView appCompatImageView = c29830h28.f137952r;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        appCompatImageView.setImageDrawable(C27280g.m139660c(context3, AbstractC23322a.zds_ic_more_grid_solid_16, AbstractC16781w.fpf_select_multi_photo_layout_text_color));
        C29830h2 c29830h29 = this.f46431p;
        if (c29830h29 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h29 = null;
        }
        c29830h29.f137945C.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
        C29830h2 c29830h210 = this.f46431p;
        if (c29830h210 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h210 = null;
        }
        RobotoTextView robotoTextView2 = c29830h210.f137945C;
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        robotoTextView2.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(context4, AbstractC23322a.zds_ic_tag_solid_16, AbstractC16781w.fpf_ic_tag_color), (Drawable) null, (Drawable) null, (Drawable) null);
        C29830h2 c29830h211 = this.f46431p;
        if (c29830h211 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h211 = null;
        }
        c29830h211.f137954t.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_border_postfeed_select_layout));
        C29830h2 c29830h212 = this.f46431p;
        if (c29830h212 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29830h22 = c29830h212;
        }
        c29830h22.f137946D.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.fpf_select_multi_photo_layout_text_color));
        this.f46432q = true;
        m45916q();
    }

    /* renamed from: v */
    public final void m45921v() {
        C29830h2 c29830h2 = this.f46431p;
        C29830h2 c29830h22 = null;
        if (c29830h2 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h2 = null;
        }
        c29830h2.f137948F.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_postfeed_tag));
        C29830h2 c29830h23 = this.f46431p;
        if (c29830h23 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h23 = null;
        }
        c29830h23.f137948F.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        C29830h2 c29830h24 = this.f46431p;
        if (c29830h24 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h24 = null;
        }
        RobotoTextView robotoTextView = c29830h24.f137948F;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        robotoTextView.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(context, AbstractC23322a.zds_ic_album_book_line_16, AbstractC21196a.TextColor1), (Drawable) null, (Drawable) null, (Drawable) null);
        C29830h2 c29830h25 = this.f46431p;
        if (c29830h25 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h25 = null;
        }
        c29830h25.f137956v.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_postfeed_tag));
        C29830h2 c29830h26 = this.f46431p;
        if (c29830h26 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h26 = null;
        }
        c29830h26.f137949G.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        C29830h2 c29830h27 = this.f46431p;
        if (c29830h27 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h27 = null;
        }
        ImageView imageView = c29830h27.f137953s;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        imageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_melody_line_16, AbstractC21196a.TextColor1));
        C29830h2 c29830h28 = this.f46431p;
        if (c29830h28 == null) {
            AbstractC19074t.m100223u("binding");
            c29830h28 = null;
        }
        RobotoTextView robotoTextView2 = c29830h28.f137945C;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        robotoTextView2.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(context3, AbstractC23322a.zds_ic_tag_line_16, AbstractC21196a.TextColor1), (Drawable) null, (Drawable) null, (Drawable) null);
        C29830h2 c29830h29 = this.f46431p;
        if (c29830h29 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29830h22 = c29830h29;
        }
        c29830h22.f137945C.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        this.f46432q = false;
    }
}
