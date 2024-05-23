package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import ao.InterfaceC2263e;
import bo.EnumC2963d3;
import bo.InterfaceC2946a1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlideShowSound;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p509sp.C26361j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class FeedSongInfoView extends RelativeLayout {

    /* renamed from: A */
    private int f45020A;

    /* renamed from: p */
    private final InterfaceC24854k f45021p;

    /* renamed from: q */
    private final InterfaceC24854k f45022q;

    /* renamed from: r */
    private final InterfaceC24854k f45023r;

    /* renamed from: s */
    private final InterfaceC24854k f45024s;

    /* renamed from: t */
    private final InterfaceC24854k f45025t;

    /* renamed from: u */
    private final InterfaceC24854k f45026u;

    /* renamed from: v */
    private final InterfaceC24854k f45027v;

    /* renamed from: w */
    private final InterfaceC24854k f45028w;

    /* renamed from: x */
    private final InterfaceC24854k f45029x;

    /* renamed from: y */
    private final InterfaceC24854k f45030y;

    /* renamed from: z */
    private final InterfaceC24854k f45031z;

    /* renamed from: com.zing.zalo.feed.components.FeedSongInfoView$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8208a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45032a;

        static {
            int[] iArr = new int[EnumC2963d3.values().length];
            try {
                iArr[EnumC2963d3.f11683r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2963d3.f11685t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2963d3.f11684s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2963d3.f11682q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f45032a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedSongInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        InterfaceC24854k m129210a10;
        InterfaceC24854k m129210a11;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m129210a = AbstractC24856m.m129210a(new C8336m6(this));
        this.f45021p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8376r6(this));
        this.f45022q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8344n6(this));
        this.f45023r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C8303i6(this));
        this.f45024s = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C8352o6(this));
        this.f45025t = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C8368q6(this));
        this.f45026u = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C8360p6(this));
        this.f45027v = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C8384s6(this));
        this.f45028w = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(new C8320k6(this));
        this.f45029x = m129210a9;
        m129210a10 = AbstractC24856m.m129210a(new C8312j6(this));
        this.f45030y = m129210a10;
        m129210a11 = AbstractC24856m.m129210a(new C8328l6(this));
        this.f45031z = m129210a11;
        this.f45020A = -1;
    }

    /* renamed from: c */
    private final void m44412c(final InterfaceC2946a1 interfaceC2946a1, final InterfaceC2263e interfaceC2263e) {
        int i11 = C8208a.f45032a[interfaceC2946a1.mo14160c().getState().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                setErrorStateVisibility(8);
                setValidStateVisibility(0);
                getSongTitle().setText(C26361j.f125215a.m135698d(interfaceC2946a1.mo14160c().mo14227a(), interfaceC2946a1.mo14160c().mo14229c()));
                if (interfaceC2946a1.mo14158a().mo14385b()) {
                    m44418k(interfaceC2946a1.mo14160c().mo14228b());
                    getSpeakerIconContainer().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.h6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeedSongInfoView.m44414e(InterfaceC2263e.this, interfaceC2946a1, view);
                        }
                    });
                    return;
                } else {
                    getSpeakerIcon().setImageResource(AbstractC16803z.ic_warning_circle_line_16);
                    getSpeakerIconContainer().setOnClickListener(null);
                    return;
                }
            }
            return;
        }
        setErrorStateVisibility(0);
        setValidStateVisibility(8);
        getErrorRetryButton().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.g6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedSongInfoView.m44413d(InterfaceC2263e.this, interfaceC2946a1, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m44413d(InterfaceC2263e interfaceC2263e, InterfaceC2946a1 interfaceC2946a1, View view) {
        AbstractC19074t.m100208f(interfaceC2946a1, "$feedMusicData");
        if (interfaceC2263e != null) {
            interfaceC2263e.mo11980kb(interfaceC2946a1.mo13947I(), interfaceC2946a1.mo14159b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m44414e(InterfaceC2263e interfaceC2263e, InterfaceC2946a1 interfaceC2946a1, View view) {
        AbstractC19074t.m100208f(interfaceC2946a1, "$feedMusicData");
        if (interfaceC2263e != null) {
            interfaceC2263e.mo11979N4(interfaceC2946a1.mo13947I());
        }
    }

    private final SlideShowSound getAnimRhythm() {
        return (SlideShowSound) this.f45024s.getValue();
    }

    private final RobotoTextView getErrorDesc() {
        return (RobotoTextView) this.f45030y.getValue();
    }

    private final AspectRatioImageView getErrorIcon() {
        return (AspectRatioImageView) this.f45029x.getValue();
    }

    private final RobotoTextView getErrorRetryButton() {
        return (RobotoTextView) this.f45031z.getValue();
    }

    private final RelativeLayout getGroupThumbSong() {
        return (RelativeLayout) this.f45021p.getValue();
    }

    private final RoundedImageView getRoundedThumbSong() {
        return (RoundedImageView) this.f45023r.getValue();
    }

    private final RobotoTextView getSongTitle() {
        return (RobotoTextView) this.f45025t.getValue();
    }

    private final AspectRatioImageView getSpeakerIcon() {
        return (AspectRatioImageView) this.f45027v.getValue();
    }

    private final FrameLayout getSpeakerIconContainer() {
        return (FrameLayout) this.f45026u.getValue();
    }

    private final AspectRatioImageView getThumbSong() {
        return (AspectRatioImageView) this.f45022q.getValue();
    }

    private final RobotoTextView getZingMp3View() {
        return (RobotoTextView) this.f45028w.getValue();
    }

    /* renamed from: h */
    private final void m44415h() {
        if (this.f45020A == 10) {
            m44416i();
        }
    }

    /* renamed from: i */
    private final void m44416i() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), -2);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        AspectRatioImageView errorIcon = getErrorIcon();
        errorIcon.setLayoutParams(layoutParams);
        errorIcon.setId(View.generateViewId());
        errorIcon.setImageResource(AbstractC16803z.ic_warning_feed_music_view_full);
        errorIcon.setScaleOption(0);
        addView(getErrorIcon());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = AbstractC23136l9.m118742r(8.0f);
        layoutParams2.rightMargin = AbstractC23136l9.m118742r(80.0f);
        layoutParams2.addRule(1, getErrorIcon().getId());
        layoutParams2.addRule(15);
        RobotoTextView errorDesc = getErrorDesc();
        errorDesc.setLayoutParams(layoutParams2);
        errorDesc.setTextSize(0, AbstractC23136l9.m118742r(13.0f));
        errorDesc.setTextColor(C23212s8.m119607o(errorDesc.getContext(), AbstractC16781w.TextColor6));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        errorDesc.setEllipsize(truncateAt);
        errorDesc.setMaxLines(1);
        errorDesc.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_music_post_can_not_load_song));
        addView(getErrorDesc());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = AbstractC23136l9.m118742r(8.0f);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        RobotoTextView errorRetryButton = getErrorRetryButton();
        errorRetryButton.setLayoutParams(layoutParams3);
        errorRetryButton.setTextSize(0, AbstractC23136l9.m118742r(13.0f));
        errorRetryButton.setTextColor(C23212s8.m119607o(errorRetryButton.getContext(), AbstractC16781w.TextColor6));
        errorRetryButton.setEllipsize(truncateAt);
        errorRetryButton.setMaxLines(1);
        errorRetryButton.setAllCaps(true);
        errorRetryButton.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
        getErrorRetryButton().setPaintFlags(getErrorRetryButton().getPaintFlags() | 8);
        addView(getErrorRetryButton());
    }

    /* renamed from: j */
    private final void m44417j() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(14.0f), -2);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        AspectRatioImageView thumbSong = getThumbSong();
        thumbSong.setLayoutParams(layoutParams);
        thumbSong.setId(View.generateViewId());
        thumbSong.setImageResource(AbstractC16803z.ic_music_feed_musical_note_view_full);
        thumbSong.setScaleOption(0);
        addView(getThumbSong());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = AbstractC23136l9.m118742r(8.0f);
        layoutParams2.rightMargin = AbstractC23136l9.m118742r(100.0f);
        layoutParams2.addRule(1, getThumbSong().getId());
        layoutParams2.addRule(15);
        RobotoTextView songTitle = getSongTitle();
        songTitle.setLayoutParams(layoutParams2);
        songTitle.setTextSize(0, AbstractC23136l9.m118742r(13.0f));
        songTitle.setTextColor(C23212s8.m119607o(songTitle.getContext(), AbstractC16781w.TextColor6));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        songTitle.setEllipsize(truncateAt);
        songTitle.setMaxLines(1);
        addView(getSongTitle());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        getSpeakerIconContainer().setLayoutParams(layoutParams3);
        getSpeakerIconContainer().setId(View.generateViewId());
        getSpeakerIconContainer().setPadding(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(6.0f));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, AbstractC23136l9.m118742r(20.0f));
        AspectRatioImageView speakerIcon = getSpeakerIcon();
        speakerIcon.setLayoutParams(layoutParams4);
        speakerIcon.setScaleOption(5);
        getSpeakerIconContainer().addView(getSpeakerIcon());
        addView(getSpeakerIconContainer());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(0, getSpeakerIconContainer().getId());
        layoutParams5.addRule(15);
        RobotoTextView zingMp3View = getZingMp3View();
        zingMp3View.setLayoutParams(layoutParams5);
        zingMp3View.setTextSize(0, AbstractC23136l9.m118742r(8.0f));
        zingMp3View.setTextColor(AbstractC23136l9.m118641B(zingMp3View.getContext(), AbstractC16801x.white_50));
        zingMp3View.setBackgroundResource(AbstractC16803z.bg_zing_mp3_feed_music);
        zingMp3View.setEllipsize(truncateAt);
        zingMp3View.setMaxLines(1);
        zingMp3View.setPadding(AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(2.0f));
        zingMp3View.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zing_mp3));
        addView(getZingMp3View());
    }

    /* renamed from: k */
    private final void m44418k(boolean z11) {
        if (!z11) {
            getSpeakerIcon().setImageResource(AbstractC16803z.ic_feed_music_mute);
        } else {
            getSpeakerIcon().setImageResource(AbstractC16803z.ic_feed_music_unmute);
        }
    }

    private final void setErrorStateVisibility(int i11) {
        getErrorIcon().setVisibility(i11);
        getErrorDesc().setVisibility(i11);
        getErrorRetryButton().setVisibility(i11);
    }

    private final void setValidStateVisibility(int i11) {
        getGroupThumbSong().setVisibility(i11);
        getThumbSong().setVisibility(i11);
        getRoundedThumbSong().setVisibility(i11);
        getAnimRhythm().setVisibility(i11);
        getSongTitle().setVisibility(i11);
        getSpeakerIconContainer().setVisibility(i11);
        getSpeakerIcon().setVisibility(i11);
        getZingMp3View().setVisibility(i11);
    }

    /* renamed from: f */
    public final void m44419f(InterfaceC2946a1 interfaceC2946a1, InterfaceC2263e interfaceC2263e) {
        AbstractC19074t.m100208f(interfaceC2946a1, "feedMusicData");
        if (this.f45020A == 10) {
            m44412c(interfaceC2946a1, interfaceC2263e);
        }
    }

    /* renamed from: g */
    public final void m44420g(int i11) {
        this.f45020A = i11;
        if (i11 == 10) {
            m44417j();
        }
        m44415h();
    }
}
