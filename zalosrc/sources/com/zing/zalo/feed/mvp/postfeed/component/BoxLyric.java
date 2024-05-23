package com.zing.zalo.feed.mvp.postfeed.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StickerProgressView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p166fq.AbstractC19111h;
import p166fq.C19109f;
import p166fq.InterfaceC19110g;
import p649xl.C29829h1;

/* loaded from: classes4.dex */
public final class BoxLyric extends RelativeLayout {

    /* renamed from: p */
    private C29829h1 f46426p;

    /* renamed from: q */
    private C19109f f46427q;

    public BoxLyric(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m45901b(context);
    }

    /* renamed from: a */
    public final void m45900a(LyricRender lyricRender) {
        int i11;
        int i12;
        int i13;
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        C29829h1 c29829h1 = this.f46426p;
        C19109f c19109f = null;
        if (c29829h1 == null) {
            AbstractC19074t.m100223u("binding");
            c29829h1 = null;
        }
        StickerProgressView stickerProgressView = c29829h1.f137939q;
        int i14 = 8;
        if (lyricRender.m45712i()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        stickerProgressView.setVisibility(i11);
        C29829h1 c29829h12 = this.f46426p;
        if (c29829h12 == null) {
            AbstractC19074t.m100223u("binding");
            c29829h12 = null;
        }
        c29829h12.f137939q.setLoadingView(lyricRender.m45712i());
        C29829h1 c29829h13 = this.f46426p;
        if (c29829h13 == null) {
            AbstractC19074t.m100223u("binding");
            c29829h13 = null;
        }
        RobotoTextView robotoTextView = c29829h13.f137940r;
        if (!lyricRender.m45712i()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        robotoTextView.setVisibility(i12);
        C29829h1 c29829h14 = this.f46426p;
        if (c29829h14 == null) {
            AbstractC19074t.m100223u("binding");
            c29829h14 = null;
        }
        RobotoTextView robotoTextView2 = c29829h14.f137942t;
        if (!lyricRender.m45712i()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        robotoTextView2.setVisibility(i13);
        C29829h1 c29829h15 = this.f46426p;
        if (c29829h15 == null) {
            AbstractC19074t.m100223u("binding");
            c29829h15 = null;
        }
        RobotoTextView robotoTextView3 = c29829h15.f137941s;
        if (!lyricRender.m45712i()) {
            i14 = 0;
        }
        robotoTextView3.setVisibility(i14);
        C19109f c19109f2 = this.f46427q;
        if (c19109f2 == null) {
            AbstractC19074t.m100223u("lyricAnim");
        } else {
            c19109f = c19109f2;
        }
        c19109f.m100350d(lyricRender);
    }

    /* renamed from: b */
    public final void m45901b(Context context) {
        C29829h1 m148016c = C29829h1.m148016c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148016c, "inflate(...)");
        this.f46426p = m148016c;
        AbstractC19111h.a aVar = AbstractC19111h.Companion;
        C29829h1 c29829h1 = null;
        if (m148016c == null) {
            AbstractC19074t.m100223u("binding");
            m148016c = null;
        }
        RobotoTextView robotoTextView = m148016c.f137940r;
        AbstractC19074t.m100207e(robotoTextView, "textCurrent");
        InterfaceC19110g m100354a = aVar.m100354a(robotoTextView);
        C29829h1 c29829h12 = this.f46426p;
        if (c29829h12 == null) {
            AbstractC19074t.m100223u("binding");
            c29829h12 = null;
        }
        RobotoTextView robotoTextView2 = c29829h12.f137942t;
        AbstractC19074t.m100207e(robotoTextView2, "textNext");
        InterfaceC19110g m100354a2 = aVar.m100354a(robotoTextView2);
        C29829h1 c29829h13 = this.f46426p;
        if (c29829h13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29829h1 = c29829h13;
        }
        RobotoTextView robotoTextView3 = c29829h1.f137941s;
        AbstractC19074t.m100207e(robotoTextView3, "textMoving");
        this.f46427q = new C19109f(m100354a, m100354a2, aVar.m100354a(robotoTextView3), AbstractC23136l9.m118742r(18.0f));
    }
}
