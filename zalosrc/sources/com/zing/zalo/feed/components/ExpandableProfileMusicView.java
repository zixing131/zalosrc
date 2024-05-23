package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlideShowSound;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p426pp.C24902e;
import p426pp.C24903f;
import p716zh.C32065p8;

/* loaded from: classes4.dex */
public class ExpandableProfileMusicView extends ExpandableProfileMusicBaseView {

    /* renamed from: B */
    AspectRatioImageView f44226B;

    /* renamed from: C */
    RobotoTextView f44227C;

    /* renamed from: D */
    RobotoTextView f44228D;

    /* renamed from: E */
    View f44229E;

    /* renamed from: F */
    SlideShowSound f44230F;

    /* renamed from: G */
    View f44231G;

    /* renamed from: H */
    View f44232H;

    /* renamed from: I */
    C24902e f44233I;

    public ExpandableProfileMusicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43625l(context);
    }

    /* renamed from: l */
    private void m43625l(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(AbstractC7409c0.expandable_profile_music_view, this);
            this.f44226B = (AspectRatioImageView) findViewById(AbstractC6918a0.img_icon);
            this.f44227C = (RobotoTextView) findViewById(AbstractC6918a0.tv_song_title);
            this.f44228D = (RobotoTextView) findViewById(AbstractC6918a0.tv_author);
            this.f44229E = findViewById(AbstractC6918a0.img_mp3_icon);
            this.f44230F = (SlideShowSound) findViewById(AbstractC6918a0.gif_sound);
            this.f44231G = findViewById(AbstractC6918a0.thumb_play);
            this.f44232H = findViewById(AbstractC6918a0.gif_sound_container);
            this.f44226B.setScaleOption(1);
            this.f44226B.setRatio(1.0f);
            this.f44227C.setSelected(true);
            this.f44230F.setAnimX(0);
            this.f44230F.setAnimWidth(AbstractC23136l9.m118742r(2.0f));
            this.f44230F.m75887a(AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(20.0f));
            this.f44230F.setShadowPaintColor(637534208);
            this.f44230F.setVisibility(8);
            this.f44227C.setShadowLayer(AbstractC23136l9.m118742r(2.0f), 0.0f, AbstractC23136l9.m118742r(1.0f), AbstractC23136l9.m118641B(context, AbstractC16801x.profile_music_sticky_text_shadow));
            this.f44228D.setShadowLayer(AbstractC23136l9.m118742r(2.0f), 0.0f, AbstractC23136l9.m118742r(1.0f), AbstractC23136l9.m118641B(context, AbstractC16801x.profile_music_sticky_text_shadow));
        }
    }

    /* renamed from: m */
    private boolean m43626m() {
        C24903f m154689d = C32065p8.m154684c().m154689d();
        C24902e c24902e = this.f44233I;
        if (c24902e != null && m154689d != null && TextUtils.equals(c24902e.m129490f(), m154689d.m129502e())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.components.ExpandableProfileMusicBaseView
    /* renamed from: e */
    public void mo43621e() {
        super.mo43621e();
        try {
            this.f44227C.setSingleLine(true);
            this.f44227C.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.f44227C.setMarqueeRepeatLimit(-1);
            this.f44227C.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            this.f44228D.setVisibility(8);
            this.f44228D.startAnimation(this.f44215q);
            this.f44229E.setVisibility(8);
            this.f44229E.startAnimation(this.f44215q);
            this.f44231G.getLayoutParams().width = AbstractC23136l9.m118742r(20.0f);
            this.f44231G.getLayoutParams().height = AbstractC23136l9.m118742r(20.0f);
            this.f44226B.getLayoutParams().width = ExpandableProfileMusicBaseView.f44210w;
            this.f44232H.getLayoutParams().width = ExpandableProfileMusicBaseView.f44210w;
            this.f44232H.getLayoutParams().height = ExpandableProfileMusicBaseView.f44210w;
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.components.ExpandableProfileMusicBaseView
    /* renamed from: f */
    public void mo43622f() {
        super.mo43622f();
        try {
            this.f44227C.setSingleLine(false);
            this.f44227C.setMaxLines(1);
            this.f44227C.setEllipsize(TextUtils.TruncateAt.END);
            this.f44227C.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85299f6));
            this.f44228D.setVisibility(0);
            this.f44228D.startAnimation(this.f44214p);
            this.f44229E.setVisibility(0);
            this.f44229E.startAnimation(this.f44214p);
            this.f44231G.getLayoutParams().width = AbstractC23136l9.m118742r(24.0f);
            this.f44231G.getLayoutParams().height = AbstractC23136l9.m118742r(24.0f);
            this.f44226B.getLayoutParams().width = ExpandableProfileMusicBaseView.f44212y;
            this.f44232H.getLayoutParams().width = ExpandableProfileMusicBaseView.f44212y;
            this.f44232H.getLayoutParams().height = ExpandableProfileMusicBaseView.f44212y;
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m43627k(C24902e c24902e, C23528a c23528a) {
        if (c24902e != null) {
            try {
                this.f44233I = c24902e;
                this.f44227C.setText(c24902e.m129492h());
                this.f44228D.setText(c24902e.m129487c());
                if (!TextUtils.isEmpty(c24902e.m129494j())) {
                    this.f44226B.setImageResource(AbstractC16803z.bg_item_feed_o);
                    ((C23528a) c23528a.m123612r(this.f44226B)).m123618x(c24902e.m129494j(), C23278z2.m120123e0());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m43628n();
    }

    /* renamed from: n */
    public void m43628n() {
        try {
            if (m43626m()) {
                if (C32065p8.m154684c().m154691f()) {
                    this.f44230F.setState(0);
                    this.f44230F.setVisibility(0);
                    this.f44231G.setVisibility(8);
                } else if (C32065p8.m154684c().m154692g()) {
                    this.f44230F.setState(1);
                    this.f44230F.setVisibility(0);
                    this.f44231G.setVisibility(8);
                } else {
                    this.f44230F.setVisibility(8);
                    this.f44231G.setVisibility(0);
                }
            } else {
                this.f44230F.setVisibility(8);
                this.f44231G.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
