package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.Layout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import kd0.C21692b;
import l80.C22126c0;
import me0.AbstractC23136l9;
import p166fq.AbstractC19111h;
import p166fq.C19109f;

/* renamed from: com.zing.zalo.feed.components.y2 */
/* loaded from: classes4.dex */
public final class C8439y2 extends C16716d {

    /* renamed from: M0 */
    private int f45875M0;

    /* renamed from: N0 */
    private final C22126c0 f45876N0;

    /* renamed from: O0 */
    private final C22126c0 f45877O0;

    /* renamed from: P0 */
    private final C22126c0 f45878P0;

    /* renamed from: Q0 */
    private final C21692b f45879Q0;

    /* renamed from: R0 */
    private C19109f f45880R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8439y2(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f45875M0 = -1;
        this.f45876N0 = new C22126c0(context);
        this.f45877O0 = new C22126c0(context);
        this.f45878P0 = new C22126c0(context);
        this.f45879Q0 = new C21692b(context);
    }

    /* renamed from: p1 */
    private final void m44964p1(C22126c0 c22126c0) {
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        c22126c0.m111962J1(AbstractC23136l9.m118641B(c22126c0.getContext(), AbstractC16801x.white));
        c22126c0.m89106L().m89028L(-1, -2).m89034R(AbstractC23136l9.m118742r(4.0f)).m89025I(true);
        c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
    }

    /* renamed from: r1 */
    private final void m44965r1() {
        this.f45879Q0.m111908h1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.profile_music_loading_drawable));
        this.f45879Q0.m89106L().m89060k0(AbstractC23136l9.m118742r(14.0f)).m89030N(AbstractC23136l9.m118742r(14.0f)).m89025I(true);
        this.f45879Q0.mo44614b1(8);
        m44964p1(this.f45876N0);
        m44964p1(this.f45877O0);
        m44964p1(this.f45878P0);
        m89001g1(this.f45879Q0);
        m89001g1(this.f45876N0);
        m89001g1(this.f45877O0);
        m89001g1(this.f45878P0);
        AbstractC19111h.a aVar = AbstractC19111h.Companion;
        this.f45880R0 = new C19109f(aVar.m100355b(this.f45876N0), aVar.m100355b(this.f45877O0), aVar.m100355b(this.f45878P0), AbstractC23136l9.m118742r(18.0f));
    }

    /* renamed from: s1 */
    private final void m44966s1() {
        m44965r1();
    }

    /* renamed from: t1 */
    private final void m44967t1() {
        m44965r1();
    }

    /* renamed from: u1 */
    private final void m44968u1() {
        mo44614b1(0);
    }

    /* renamed from: o1 */
    public final void m44969o1(LyricRender lyricRender) {
        int i11;
        int i12;
        int i13;
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        m44968u1();
        C21692b c21692b = this.f45879Q0;
        int i14 = 8;
        if (lyricRender.m45712i()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c21692b.mo44614b1(i11);
        C22126c0 c22126c0 = this.f45876N0;
        if (!lyricRender.m45712i()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        c22126c0.mo44614b1(i12);
        C22126c0 c22126c02 = this.f45877O0;
        if (!lyricRender.m45712i()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        c22126c02.mo44614b1(i13);
        C22126c0 c22126c03 = this.f45878P0;
        if (!lyricRender.m45712i()) {
            i14 = 0;
        }
        c22126c03.mo44614b1(i14);
        C19109f c19109f = this.f45880R0;
        if (c19109f == null) {
            AbstractC19074t.m100223u("lyricAnim");
            c19109f = null;
        }
        c19109f.m100350d(lyricRender);
    }

    /* renamed from: q1 */
    public final void m44970q1(int i11) {
        this.f45875M0 = i11;
        if (i11 != 0) {
            if (i11 == 4) {
                m44966s1();
                return;
            }
            return;
        }
        m44967t1();
    }
}
