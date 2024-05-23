package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import ao.InterfaceC2259a;
import bi0.AbstractC2807a;
import bo.C2949b;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.profile.model.theme.DecorItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C32002l4;

/* loaded from: classes4.dex */
public final class FeedItemSocialAlbumHeader extends ModulesView {

    /* renamed from: K */
    private int f44647K;

    /* renamed from: L */
    public C11850a f44648L;

    /* renamed from: M */
    private C22126c0 f44649M;

    /* renamed from: N */
    private C22126c0 f44650N;

    /* renamed from: O */
    private C16716d f44651O;

    /* renamed from: P */
    public C22122a0 f44652P;

    public FeedItemSocialAlbumHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: X */
    private final void m44021X(boolean z11, final C2949b c2949b, C23528a c23528a, final InterfaceC2259a interfaceC2259a, final boolean z12) {
        if (c2949b == null) {
            return;
        }
        ThemeItem m13960c = c2949b.m13960c();
        C22126c0 c22126c0 = this.f44649M;
        C22126c0 c22126c02 = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c0 = null;
        }
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.album));
        C22126c0 c22126c03 = this.f44649M;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c03 = null;
        }
        c22126c03.m111962J1(c2949b.m13960c().getAlbumCaptionColor());
        if (TextUtils.isEmpty(c2949b.m13962e())) {
            C22126c0 c22126c04 = this.f44650N;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mAlbumDesTxt");
            } else {
                c22126c02 = c22126c04;
            }
            c22126c02.mo44614b1(8);
        } else {
            C22126c0 c22126c05 = this.f44650N;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mAlbumDesTxt");
                c22126c05 = null;
            }
            c22126c05.m111959G1(c2949b.m13962e());
            C22126c0 c22126c06 = this.f44650N;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("mAlbumDesTxt");
                c22126c06 = null;
            }
            c22126c06.m111962J1(c2949b.m13960c().getContent().getTextColor01());
            C22126c0 c22126c07 = this.f44650N;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("mAlbumDesTxt");
            } else {
                c22126c02 = c22126c07;
            }
            c22126c02.mo44614b1(0);
        }
        DecorItem decorItem = c2949b.m13960c().getDecorItem();
        if (!TextUtils.isEmpty(decorItem.getDecorUrl())) {
            getMBackgroundImg().mo44614b1(0);
            C24003n m120080L = C23278z2.m120080L();
            getMBackgroundImg().mo111925v1(new ColorDrawable(AbstractC23136l9.m118641B(getMBackgroundImg().getContext(), AbstractC16801x.transparent)));
            if (!z11 || C23999j.m125696L2(decorItem.getDecorUrl(), m120080L)) {
                getMBackgroundImg().m115375G1(c23528a, decorItem.getDecorUrl(), m120080L);
            }
        } else {
            getMBackgroundImg().mo44614b1(8);
        }
        getMArrowIcon().mo111926w1(AbstractC16803z.ic_feed_album_right_arrow_white);
        getMArrowIcon().m111922s1(m13960c.getContent().getArrowColor(), PorterDuff.Mode.SRC_IN);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.s3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemSocialAlbumHeader.m44022Y(z12, this, interfaceC2259a, c2949b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m44022Y(boolean z11, FeedItemSocialAlbumHeader feedItemSocialAlbumHeader, InterfaceC2259a interfaceC2259a, C2949b c2949b, View view) {
        C32002l4 m154287a;
        AbstractC19074t.m100208f(feedItemSocialAlbumHeader, "this$0");
        if (!z11) {
            int i11 = feedItemSocialAlbumHeader.f44647K;
            if (i11 != 0) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        m154287a = null;
                    } else {
                        m154287a = C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
                    }
                } else {
                    m154287a = C32002l4.Companion.m154287a(10001);
                }
            } else {
                m154287a = C32002l4.Companion.m154287a(10002);
            }
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11926M5(c2949b, 5, m154287a);
            }
        }
    }

    /* renamed from: W */
    public final void m44023W(boolean z11, C2949b c2949b, C23528a c23528a, InterfaceC2259a interfaceC2259a, boolean z12) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        int i11 = this.f44647K;
        if (i11 == 0 || i11 == 1 || i11 == 4) {
            m44021X(z11, c2949b, c23528a, interfaceC2259a, z12);
        }
    }

    /* renamed from: a0 */
    public final void m44024a0(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        try {
            this.f44647K = i11;
            if (i11 == 0) {
                m44026c0(context);
            } else if (i11 == 4) {
                m44026c0(context);
            } else {
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 1) {
                        m44026c0(context);
                    }
                }
                m44025b0();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b0 */
    public final void m44025b0() {
    }

    /* renamed from: c0 */
    public final void m44026c0(Context context) {
        AbstractC19074t.m100208f(context, "context");
        int m118742r = AbstractC23136l9.m118742r(24.0f);
        setMArrowIcon(new C22122a0(context));
        C16718f m89030N = getMArrowIcon().m89106L().m89060k0(m118742r).m89030N(m118742r);
        Boolean bool = Boolean.TRUE;
        m89030N.m89017A(bool).m89027K(true).m89035S(AbstractC23136l9.m118742r(16.0f));
        getMArrowIcon().mo111926w1(AbstractC16803z.ic_feed_album_right_arrow);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f44649M = c22126c0;
        c22126c0.m89106L().m89060k0(-1).m89030N(-2).m89048d0(AbstractC23136l9.m118742r(16.0f));
        C22126c0 c22126c02 = this.f44649M;
        C16716d c16716d = null;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c02 = null;
        }
        c22126c02.m111953A1(1);
        C22126c0 c22126c03 = this.f44649M;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c03 = null;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        C22126c0 c22126c04 = this.f44649M;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c04 = null;
        }
        c22126c04.mo111964L1(AbstractC23136l9.m118742r(11.0f));
        C22126c0 c22126c05 = this.f44649M;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c05 = null;
        }
        c22126c05.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        C22126c0 c22126c06 = new C22126c0(context);
        this.f44650N = c22126c06;
        C16718f m89030N2 = c22126c06.m89106L().m89060k0(-1).m89030N(-2);
        C22126c0 c22126c07 = this.f44649M;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c07 = null;
        }
        m89030N2.m89023G(c22126c07).m89044a0(AbstractC23136l9.m118742r(16.0f));
        C22126c0 c22126c08 = this.f44650N;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("mAlbumDesTxt");
            c22126c08 = null;
        }
        c22126c08.m111953A1(1);
        C22126c0 c22126c09 = this.f44650N;
        if (c22126c09 == null) {
            AbstractC19074t.m100223u("mAlbumDesTxt");
            c22126c09 = null;
        }
        c22126c09.m111980v1(truncateAt);
        C22126c0 c22126c010 = this.f44650N;
        if (c22126c010 == null) {
            AbstractC19074t.m100223u("mAlbumDesTxt");
            c22126c010 = null;
        }
        c22126c010.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        C22126c0 c22126c011 = this.f44650N;
        if (c22126c011 == null) {
            AbstractC19074t.m100223u("mAlbumDesTxt");
            c22126c011 = null;
        }
        c22126c011.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_01));
        C22126c0 c22126c012 = this.f44650N;
        if (c22126c012 == null) {
            AbstractC19074t.m100223u("mAlbumDesTxt");
            c22126c012 = null;
        }
        c22126c012.mo111965M1(1);
        C16716d c16716d2 = new C16716d(context);
        this.f44651O = c16716d2;
        c16716d2.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89049e0(getMArrowIcon());
        C16716d c16716d3 = this.f44651O;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mAlbumTitleGroup");
            c16716d3 = null;
        }
        C22126c0 c22126c013 = this.f44649M;
        if (c22126c013 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c013 = null;
        }
        c16716d3.m89001g1(c22126c013);
        C16716d c16716d4 = this.f44651O;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mAlbumTitleGroup");
            c16716d4 = null;
        }
        C22126c0 c22126c014 = this.f44650N;
        if (c22126c014 == null) {
            AbstractC19074t.m100223u("mAlbumDesTxt");
            c22126c014 = null;
        }
        c16716d4.m89001g1(c22126c014);
        setMBackgroundImg(new C11850a(context));
        C16718f m89017A = getMBackgroundImg().m89106L().m89060k0(-2).m89030N(-2).m89017A(bool);
        C22126c0 c22126c015 = this.f44649M;
        if (c22126c015 == null) {
            AbstractC19074t.m100223u("mAlbumTitleTxt");
            c22126c015 = null;
        }
        C16718f m89020D = m89017A.m89020D(c22126c015);
        C22126c0 c22126c016 = this.f44650N;
        if (c22126c016 == null) {
            AbstractC19074t.m100223u("mAlbumDesTxt");
            c22126c016 = null;
        }
        m89020D.m89067t(c22126c016);
        getMBackgroundImg().m65869e2(5);
        mo69681L(getMBackgroundImg());
        mo69681L(getMArrowIcon());
        C16716d c16716d5 = this.f44651O;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mAlbumTitleGroup");
        } else {
            c16716d = c16716d5;
        }
        mo69681L(c16716d);
    }

    public final C22122a0 getMArrowIcon() {
        C22122a0 c22122a0 = this.f44652P;
        if (c22122a0 != null) {
            return c22122a0;
        }
        AbstractC19074t.m100223u("mArrowIcon");
        return null;
    }

    public final C11850a getMBackgroundImg() {
        C11850a c11850a = this.f44648L;
        if (c11850a != null) {
            return c11850a;
        }
        AbstractC19074t.m100223u("mBackgroundImg");
        return null;
    }

    public final int getMLayoutMode() {
        return this.f44647K;
    }

    public final void setMArrowIcon(C22122a0 c22122a0) {
        AbstractC19074t.m100208f(c22122a0, "<set-?>");
        this.f44652P = c22122a0;
    }

    public final void setMBackgroundImg(C11850a c11850a) {
        AbstractC19074t.m100208f(c11850a, "<set-?>");
        this.f44648L = c11850a;
    }

    public final void setMLayoutMode(int i11) {
        this.f44647K = i11;
    }
}
