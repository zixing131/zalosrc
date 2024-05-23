package com.zing.mp3.sdk.view.widgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.mp3.sdk.connection.model.MediaItemInternal;
import com.zing.mp3.sdk.view.widgets.SongBtsView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import on0.AbstractC24342w;
import p000.AbstractC17681d;
import p000.AbstractC17683d0;
import p000.AbstractC23494n;
import p000.AbstractC2471b;
import p000.AbstractC26054s;
import p000.C19174g;
import p000.C19685h;
import p000.C20893j;
import p000.C21419k;
import p000.C21972l;
import p000.C22693m;
import p000.C24592p0;
import p000.C24956q;
import p156fb.AbstractC18857c;
import p156fb.AbstractC18858d;
import p156fb.AbstractC18859e;
import p156fb.AbstractC18860f;
import p156fb.AbstractC18861g;
import p156fb.AbstractC18862h;
import p156fb.AbstractC18863i;
import p156fb.InterfaceC18864j;
import p204hb.C19956a;
import p227i3.C20218v;
import qm0.AbstractC25332a0;

/* loaded from: classes3.dex */
public final class SongBtsView extends RelativeLayout {

    /* renamed from: F */
    public static final C19685h f37647F = new C19685h();

    /* renamed from: A */
    public final int f37648A;

    /* renamed from: B */
    public final int f37649B;

    /* renamed from: C */
    public final int f37650C;

    /* renamed from: D */
    public final int f37651D;

    /* renamed from: E */
    public final int f37652E;

    /* renamed from: p */
    public InterfaceC18864j f37653p;

    /* renamed from: q */
    public MediaItemInternal f37654q;

    /* renamed from: r */
    public final C20893j f37655r;

    /* renamed from: s */
    public final C24592p0 f37656s;

    /* renamed from: t */
    public final View.OnClickListener f37657t;

    /* renamed from: u */
    public Runnable f37658u;

    /* renamed from: v */
    public boolean f37659v;

    /* renamed from: w */
    public final SongBtsHeader f37660w;

    /* renamed from: x */
    public final View f37661x;

    /* renamed from: y */
    public final ViewGroup f37662y;

    /* renamed from: z */
    public final ViewGroup f37663z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SongBtsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    public static final void m35283a(Context context, View view) {
        AbstractC19074t.m100208f(context, "$context");
        AbstractC26054s.m134147b(context, !AbstractC17681d.f89682c, true);
    }

    /* renamed from: b */
    public static void m35284b(View view, int i11) {
        view.setBackgroundColor(i11);
        int i12 = AbstractC18858d.zingmp3sdk_bts_menu_item_radius;
        AbstractC19074t.m100208f(view, "<this>");
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(i12);
        view.setClipToOutline(true);
        view.setOutlineProvider(new C21972l(dimensionPixelSize));
    }

    /* renamed from: d */
    public static final void m35285d(SongBtsView songBtsView) {
        AbstractC19074t.m100208f(songBtsView, "this$0");
        songBtsView.setPlaying(false);
        songBtsView.f37658u = null;
    }

    /* renamed from: e */
    public static final void m35286e(SongBtsView songBtsView, Context context, View view) {
        String obj;
        List m127132B0;
        Object m131205e0;
        AbstractC19074t.m100208f(songBtsView, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        MediaItemInternal mediaItemInternal = songBtsView.f37654q;
        if (mediaItemInternal == null) {
            InterfaceC18864j interfaceC18864j = songBtsView.f37653p;
            if (interfaceC18864j != null) {
                interfaceC18864j.mo66050c();
                return;
            }
            return;
        }
        Object tag = view.getTag();
        if (tag != null && (obj = tag.toString()) != null) {
            int parseInt = Integer.parseInt(obj);
            if (parseInt == AbstractC18862h.zingmp3sdk_view_album) {
                String str = mediaItemInternal.f37583t;
                AbstractC19074t.m100205c(str);
                AbstractC19074t.m100208f(context, "context");
                AbstractC19074t.m100208f(str, "albumId");
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("zingmp3");
                builder.authority("album");
                builder.appendQueryParameter("id", str);
                Intent intent = new Intent("android.intent.action.VIEW", builder.build());
                intent.putExtra("source_third_party", AbstractC17681d.f89680a);
                try {
                    new C21419k(context, intent).mo12V4();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else if (parseInt == AbstractC18862h.zingmp3sdk_view_artist) {
                String str2 = mediaItemInternal.f37582s;
                AbstractC19074t.m100205c(str2);
                AbstractC19074t.m100208f(context, "context");
                AbstractC19074t.m100208f(str2, "artistId");
                Uri.Builder builder2 = new Uri.Builder();
                builder2.scheme("zingmp3");
                builder2.authority("artist");
                m127132B0 = AbstractC24342w.m127132B0(str2, new String[]{","}, false, 0, 6, null);
                m131205e0 = AbstractC25332a0.m131205e0(m127132B0);
                builder2.appendQueryParameter("id", (String) m131205e0);
                Intent intent2 = new Intent("android.intent.action.VIEW", builder2.build());
                intent2.putExtra("source_third_party", AbstractC17681d.f89680a);
                try {
                    new C22693m(context, intent2).mo12V4();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } else if (parseInt == AbstractC18862h.zingmp3sdk_song_lyrics) {
                AbstractC19074t.m100208f(context, "context");
                Uri.Builder builder3 = new Uri.Builder();
                builder3.scheme("zingmp3");
                builder3.authority("lyrics");
                Intent intent3 = new Intent("android.intent.action.VIEW", builder3.build());
                intent3.putExtra("source_third_party", AbstractC17681d.f89680a);
                try {
                    new C24956q(context, intent3).mo12V4();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        InterfaceC18864j interfaceC18864j2 = songBtsView.f37653p;
        if (interfaceC18864j2 != null) {
            interfaceC18864j2.mo66050c();
        }
    }

    /* renamed from: f */
    public static final void m35287f(SongBtsView songBtsView, View view) {
        C19956a c19956a;
        InterfaceC18864j interfaceC18864j;
        AbstractC19074t.m100208f(songBtsView, "this$0");
        MediaItemInternal mediaItemInternal = songBtsView.f37654q;
        if (mediaItemInternal != null) {
            AbstractC19074t.m100208f(mediaItemInternal, "<this>");
            c19956a = new C19956a(mediaItemInternal.f37579p, mediaItemInternal.f37580q, mediaItemInternal.f37584u, mediaItemInternal.f37585v, mediaItemInternal.f37586w);
        } else {
            c19956a = null;
        }
        if (c19956a != null && (interfaceC18864j = songBtsView.f37653p) != null) {
            interfaceC18864j.mo66051d(c19956a);
        }
        InterfaceC18864j interfaceC18864j2 = songBtsView.f37653p;
        if (interfaceC18864j2 != null) {
            interfaceC18864j2.mo66050c();
        }
    }

    /* renamed from: g */
    public static final void m35288g(SongBtsView songBtsView) {
        InterfaceC18864j interfaceC18864j = songBtsView.f37653p;
        if (interfaceC18864j != null) {
            interfaceC18864j.mo66052f();
        }
    }

    /* renamed from: j */
    public static final void m35291j(SongBtsView songBtsView, View view) {
        C19956a c19956a;
        InterfaceC18864j interfaceC18864j;
        AbstractC19074t.m100208f(songBtsView, "this$0");
        MediaItemInternal mediaItemInternal = songBtsView.f37654q;
        if (mediaItemInternal != null) {
            AbstractC19074t.m100208f(mediaItemInternal, "<this>");
            c19956a = new C19956a(mediaItemInternal.f37579p, mediaItemInternal.f37580q, mediaItemInternal.f37584u, mediaItemInternal.f37585v, mediaItemInternal.f37586w);
        } else {
            c19956a = null;
        }
        if (c19956a != null && (interfaceC18864j = songBtsView.f37653p) != null) {
            interfaceC18864j.mo66054h(c19956a);
        }
        InterfaceC18864j interfaceC18864j2 = songBtsView.f37653p;
        if (interfaceC18864j2 != null) {
            interfaceC18864j2.mo66050c();
        }
    }

    /* renamed from: k */
    public static final void m35292k(SongBtsView songBtsView, View view) {
        C19956a c19956a;
        InterfaceC18864j interfaceC18864j;
        AbstractC19074t.m100208f(songBtsView, "this$0");
        MediaItemInternal mediaItemInternal = songBtsView.f37654q;
        if (mediaItemInternal != null) {
            AbstractC19074t.m100208f(mediaItemInternal, "<this>");
            c19956a = new C19956a(mediaItemInternal.f37579p, mediaItemInternal.f37580q, mediaItemInternal.f37584u, mediaItemInternal.f37585v, mediaItemInternal.f37586w);
        } else {
            c19956a = null;
        }
        if (c19956a != null && (interfaceC18864j = songBtsView.f37653p) != null) {
            interfaceC18864j.mo66053g(c19956a);
        }
        InterfaceC18864j interfaceC18864j2 = songBtsView.f37653p;
        if (interfaceC18864j2 != null) {
            interfaceC18864j2.mo66050c();
        }
    }

    /* renamed from: c */
    public final void m35293c(MediaItemInternal mediaItemInternal) {
        String str;
        String str2;
        String str3 = mediaItemInternal.f37584u;
        if (str3 != null && str3.length() != 0) {
            ImageView imageView = this.f37660w.f37642v;
            if (imageView != null) {
                AbstractC19074t.m100208f(imageView, "<this>");
                imageView.setVisibility(8);
            }
            InterfaceC18864j interfaceC18864j = this.f37653p;
            if (interfaceC18864j != null) {
                interfaceC18864j.mo66029b(this.f37660w.f37636p, str3);
            }
            AbstractC23494n.m123330f(this.f37660w.f37636p);
        } else {
            SongBtsHeader songBtsHeader = this.f37660w;
            ImageView imageView2 = songBtsHeader.f37642v;
            if (imageView2 == null) {
                View inflate = songBtsHeader.f37641u.inflate();
                AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                imageView2 = (ImageView) inflate;
                songBtsHeader.f37642v = imageView2;
            }
            AbstractC23494n.m123330f(imageView2);
            InterfaceC18864j interfaceC18864j2 = this.f37653p;
            if (interfaceC18864j2 != null) {
                interfaceC18864j2.mo66029b(this.f37660w.f37636p, "");
            }
            AbstractC23494n.m123326b(this.f37660w.f37636p);
        }
        this.f37660w.f37639s.setText(mediaItemInternal.f37580q);
        this.f37660w.f37640t.setText(mediaItemInternal.f37581r);
        int i11 = mediaItemInternal.f37587x;
        if (i11 != 1 && i11 != 3) {
            AbstractC23494n.m123326b(this.f37662y);
            AbstractC23494n.m123326b(this.f37661x);
        } else {
            TextView textView = (TextView) this.f37662y.findViewById(AbstractC18860f.itemOne);
            if (mediaItemInternal.f37587x != 3 && (str2 = mediaItemInternal.f37583t) != null && str2.length() != 0) {
                AbstractC19074t.m100207e(textView, C20218v.f100059b);
                int i12 = this.f37651D;
                int i13 = AbstractC18862h.zingmp3sdk_view_album;
                int i14 = this.f37648A;
                textView.setOnClickListener(this.f37657t);
                textView.setTag(Integer.valueOf(i13));
                textView.setCompoundDrawablesWithIntrinsicBounds(i12, 0, 0, 0);
                textView.setText(i13);
                textView.setTextColor(i14);
                textView.setBackgroundResource(this.f37652E);
                AbstractC19074t.m100208f(textView, "<this>");
                textView.setVisibility(0);
            } else {
                AbstractC19074t.m100207e(textView, C20218v.f100059b);
                AbstractC23494n.m123326b(textView);
            }
            TextView textView2 = (TextView) this.f37662y.findViewById(AbstractC18860f.itemTwo);
            if (mediaItemInternal.f37587x != 3 && (str = mediaItemInternal.f37582s) != null && str.length() != 0) {
                AbstractC19074t.m100207e(textView2, C20218v.f100059b);
                int i15 = this.f37649B;
                int i16 = AbstractC18862h.zingmp3sdk_view_artist;
                int i17 = this.f37648A;
                textView2.setOnClickListener(this.f37657t);
                textView2.setTag(Integer.valueOf(i16));
                textView2.setCompoundDrawablesWithIntrinsicBounds(i15, 0, 0, 0);
                textView2.setText(i16);
                textView2.setTextColor(i17);
                textView2.setBackgroundResource(this.f37652E);
                AbstractC19074t.m100208f(textView2, "<this>");
                textView2.setVisibility(0);
            } else {
                AbstractC19074t.m100207e(textView2, C20218v.f100059b);
                AbstractC23494n.m123326b(textView2);
            }
            View findViewById = this.f37662y.findViewById(AbstractC18860f.itemThree);
            AbstractC19074t.m100207e(findViewById, "body.findViewById(R.id.itemThree)");
            TextView textView3 = (TextView) findViewById;
            int i18 = this.f37650C;
            int i19 = AbstractC18862h.zingmp3sdk_song_lyrics;
            int i21 = this.f37648A;
            textView3.setOnClickListener(this.f37657t);
            textView3.setTag(Integer.valueOf(i19));
            textView3.setCompoundDrawablesWithIntrinsicBounds(i18, 0, 0, 0);
            textView3.setText(i19);
            textView3.setTextColor(i21);
            textView3.setBackgroundResource(this.f37652E);
            AbstractC23494n.m123330f(this.f37661x);
            AbstractC23494n.m123330f(this.f37662y);
        }
        if (mediaItemInternal.f37587x == 1) {
            AbstractC23494n.m123330f(this.f37663z);
        } else {
            AbstractC23494n.m123326b(this.f37663z);
        }
    }

    public final InterfaceC18864j getListener() {
        return this.f37653p;
    }

    /* renamed from: l */
    public final void m35294l() {
        if (!this.f37659v) {
            return;
        }
        this.f37659v = false;
        removeCallbacks(this.f37658u);
        Runnable runnable = new Runnable() { // from class: ib.j
            @Override // java.lang.Runnable
            public final void run() {
                SongBtsView.m35285d(SongBtsView.this);
            }
        };
        this.f37658u = runnable;
        postDelayed(runnable, 5000L);
        MediaItemInternal mediaItemInternal = AbstractC17681d.f89681b;
        if (mediaItemInternal != null) {
            this.f37654q = mediaItemInternal;
            m35293c(mediaItemInternal);
        }
        setPlaying(AbstractC17681d.f89682c);
        C24592p0 c24592p0 = this.f37656s;
        int hashCode = hashCode();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        c24592p0.m128076c(hashCode, context, this.f37655r);
    }

    /* renamed from: m */
    public final void m35295m() {
        if (this.f37659v) {
            return;
        }
        this.f37659v = true;
        removeCallbacks(this.f37658u);
        C24592p0 c24592p0 = this.f37656s;
        int hashCode = hashCode();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        c24592p0.m128075b(hashCode, context);
    }

    public final void setListener(InterfaceC18864j interfaceC18864j) {
        this.f37653p = interfaceC18864j;
    }

    public final void setPlaying(boolean z11) {
        removeCallbacks(this.f37658u);
        WaveBar waveBar = this.f37660w.f37638r;
        if (waveBar.f37680z != z11) {
            waveBar.f37680z = z11;
            waveBar.f37679y = System.currentTimeMillis() - ((int) (WaveBar.f37669F * 42.0f));
        }
        waveBar.invalidate();
    }

    public /* synthetic */ SongBtsView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SongBtsView(final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f37655r = new C20893j(this);
        C24592p0 c24592p0 = C24592p0.f118350o;
        this.f37656s = AbstractC17683d0.m93669a();
        this.f37657t = new View.OnClickListener() { // from class: ib.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SongBtsView.m35286e(SongBtsView.this, context, view);
            }
        };
        this.f37659v = true;
        View.inflate(context, AbstractC18861g.zingmp3sdk_bottom_sheet_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC18863i.BottomSheet);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.BottomSheet)");
        int color = obtainStyledAttributes.getColor(AbstractC18863i.BottomSheet_zingmp3sdk_bts_text_title, getResources().getColor(AbstractC18857c.zingmp3sdk_textTitle));
        this.f37648A = color;
        int color2 = obtainStyledAttributes.getColor(AbstractC18863i.BottomSheet_zingmp3sdk_bts_text_subtitle, getResources().getColor(AbstractC18857c.zingmp3sdk_textSubTitle));
        int color3 = obtainStyledAttributes.getColor(AbstractC18863i.BottomSheet_zingmp3sdk_bts_divider_color, getResources().getColor(AbstractC18857c.zingmp3sdk_divider));
        int color4 = obtainStyledAttributes.getColor(AbstractC18863i.BottomSheet_zingmp3sdk_bts_bg_menu_item_color, getResources().getColor(AbstractC18857c.zingmp3sdk_bgMenuItem));
        int color5 = obtainStyledAttributes.getColor(AbstractC18863i.BottomSheet_zingmp3sdk_bts_default_thumb_bg_color, getResources().getColor(AbstractC18857c.zingmp3sdk_defaultThumbBg));
        this.f37651D = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_ic_album_drawable, AbstractC18859e.zingmp3sdk_ic_album);
        this.f37649B = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_ic_artist_drawable, AbstractC18859e.zingmp3sdk_ic_artist);
        this.f37650C = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_ic_lyric_drawable, AbstractC18859e.zingmp3sdk_ic_lyric);
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_ic_ringtone_drawable, AbstractC18859e.zingmp3sdk_ic_ringtone);
        int resourceId2 = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_ic_diary_drawable, AbstractC18859e.zingmp3sdk_ic_zalo_diary);
        int resourceId3 = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_ic_share_drawable, AbstractC18859e.zingmp3sdk_ic_share);
        int resourceId4 = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_bg_drawable, AbstractC18859e.zingmp3sdk_bg_bottomsheet);
        this.f37652E = obtainStyledAttributes.getResourceId(AbstractC18863i.BottomSheet_zingmp3sdk_bts_ripple_drawable, AbstractC18859e.zingmp3sdk_selector);
        obtainStyledAttributes.recycle();
        int dimension = (int) getResources().getDimension(AbstractC18858d.zingmp3sdk_spacing_small);
        setBackground(getResources().getDrawable(resourceId4, context.getTheme()));
        View findViewById = findViewById(AbstractC18860f.header);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.header)");
        SongBtsHeader songBtsHeader = (SongBtsHeader) findViewById;
        this.f37660w = songBtsHeader;
        songBtsHeader.m35281d().setTextColor(color);
        songBtsHeader.m35280c().setTextColor(color2);
        songBtsHeader.m35279b().setBackgroundColor(color5);
        songBtsHeader.m35278a().setBackgroundColor(color5);
        songBtsHeader.m35282e().setOnClickListener(new View.OnClickListener() { // from class: ib.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SongBtsView.m35283a(context, view);
            }
        });
        View findViewById2 = findViewById(AbstractC18860f.divider);
        findViewById2.setBackgroundColor(color3);
        AbstractC19074t.m100207e(findViewById2, "findViewById<View>(R.id.…r(dividerColor)\n        }");
        this.f37661x = findViewById2;
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC18860f.footer);
        AbstractC19074t.m100207e(viewGroup, C20218v.f100059b);
        this.f37663z = viewGroup;
        viewGroup.findViewById(AbstractC18860f.divider).setBackgroundColor(color3);
        View findViewById3 = viewGroup.findViewById(AbstractC18860f.menuItemOne);
        ((TextView) findViewById3.findViewById(AbstractC18860f.f94188tv)).setTextColor(color);
        ((ImageView) findViewById3.findViewById(AbstractC18860f.f94187iv)).setImageResource(resourceId);
        AbstractC19074t.m100207e(findViewById3, "it");
        m35284b(findViewById3, color4);
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: ib.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SongBtsView.m35292k(SongBtsView.this, view);
            }
        });
        View findViewById4 = viewGroup.findViewById(AbstractC18860f.menuItemTwo);
        ((TextView) findViewById4.findViewById(AbstractC18860f.tvTwo)).setTextColor(color);
        ((ImageView) findViewById4.findViewById(AbstractC18860f.ivTwo)).setImageResource(resourceId2);
        AbstractC19074t.m100207e(findViewById4, "it");
        m35284b(findViewById4, color4);
        findViewById4.setOnClickListener(new View.OnClickListener() { // from class: ib.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SongBtsView.m35287f(SongBtsView.this, view);
            }
        });
        View findViewById5 = viewGroup.findViewById(AbstractC18860f.menuItemThree);
        ((TextView) findViewById5.findViewById(AbstractC18860f.tvThree)).setTextColor(color);
        ((ImageView) findViewById5.findViewById(AbstractC18860f.ivThree)).setImageResource(resourceId3);
        AbstractC19074t.m100207e(findViewById5, "it");
        m35284b(findViewById5, color4);
        findViewById5.setOnClickListener(new View.OnClickListener() { // from class: ib.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SongBtsView.m35291j(SongBtsView.this, view);
            }
        });
        View findViewById6 = findViewById(AbstractC18860f.bodyLayout);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.bodyLayout)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById6;
        this.f37662y = viewGroup2;
        viewGroup2.setPadding(0, 0, 0, dimension);
        C19174g c19174g = C19174g.f95302a;
        boolean m12485b = AbstractC2471b.m12485b();
        c19174g.getClass();
        C19174g.m100625a(context, "200", m12485b ? 1 : 0);
    }
}
