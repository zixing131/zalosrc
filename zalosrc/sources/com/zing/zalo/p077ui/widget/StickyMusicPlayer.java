package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.TrackSeekBar;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p716zh.C31948ha;

/* loaded from: classes6.dex */
public class StickyMusicPlayer extends RelativeLayout {

    /* renamed from: p */
    private TrackSeekBar f69754p;

    /* renamed from: q */
    private TextView f69755q;

    /* renamed from: r */
    private TextView f69756r;

    /* renamed from: s */
    private ImageButton f69757s;

    /* renamed from: t */
    private View f69758t;

    /* renamed from: u */
    private View f69759u;

    /* renamed from: v */
    private RecyclingImageView f69760v;

    /* renamed from: w */
    private C23528a f69761w;

    /* renamed from: x */
    private final View.OnClickListener f69762x;

    public StickyMusicPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69762x = new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickyMusicPlayer.m75930f(view);
            }
        };
        m75928d(context);
    }

    /* renamed from: d */
    private void m75928d(Context context) {
        try {
            LayoutInflater.from(context).inflate(AbstractC7409c0.sticky_music_player, this);
            this.f69759u = findViewById(AbstractC6918a0.music_player_progress);
            TrackSeekBar trackSeekBar = (TrackSeekBar) findViewById(AbstractC6918a0.music_player_seekbar);
            this.f69754p = trackSeekBar;
            trackSeekBar.setPadding(0, 0, 0, 0);
            ImageButton imageButton = (ImageButton) findViewById(AbstractC6918a0.music_player_play_button);
            this.f69757s = imageButton;
            imageButton.setOnClickListener(this.f69762x);
            View findViewById = findViewById(AbstractC6918a0.music_player_delete);
            this.f69758t = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StickyMusicPlayer.m75929e(view);
                }
            });
            this.f69755q = (TextView) findViewById(AbstractC6918a0.music_player_song_name);
            this.f69756r = (TextView) findViewById(AbstractC6918a0.music_player_song_artist);
            this.f69760v = (RecyclingImageView) findViewById(AbstractC6918a0.music_player_logo);
            setOnClickListener(this.f69762x);
            this.f69761w = new C23528a(context);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m75929e(View view) {
        C31948ha.m153587d().m153599m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m75930f(View view) {
        C31948ha.m153587d().m153588a();
    }

    /* renamed from: g */
    private void m75931g() {
        try {
            if (C31948ha.m153587d().m153595i()) {
                this.f69757s.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_warning_pause));
                this.f69757s.setVisibility(0);
                this.f69759u.setVisibility(8);
            } else if (C31948ha.m153587d().m153596j()) {
                this.f69757s.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_warning_play));
                this.f69759u.setVisibility(0);
                this.f69757s.setVisibility(4);
            } else {
                this.f69757s.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_warning_play));
                this.f69759u.setVisibility(8);
                this.f69757s.setVisibility(0);
            }
            this.f69754p.setProgress(C31948ha.m153587d().m153592f());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m75932c() {
        try {
            if (C31948ha.m153587d().m153591e() != null) {
                String m153590c = C31948ha.m153587d().m153590c();
                String m153593g = C31948ha.m153587d().m153593g();
                String m153594h = C31948ha.m153587d().m153594h();
                if (!TextUtils.isEmpty(m153590c)) {
                    this.f69756r.setVisibility(0);
                    this.f69756r.setText(m153590c);
                } else {
                    this.f69756r.setVisibility(8);
                }
                if (!TextUtils.isEmpty(m153593g)) {
                    this.f69755q.setVisibility(0);
                    this.f69755q.setText(m153593g);
                } else {
                    this.f69755q.setVisibility(8);
                }
                if (!TextUtils.isEmpty(m153594h)) {
                    this.f69760v.setVisibility(0);
                    ((C23528a) this.f69761w.m123612r(this.f69760v)).m123618x(m153594h, C23278z2.m120090Q());
                } else {
                    this.f69760v.setVisibility(8);
                }
                m75931g();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
