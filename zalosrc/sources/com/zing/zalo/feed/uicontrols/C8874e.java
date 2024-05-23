package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.animation.AnimationTarget;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.C20801j;
import java.util.ArrayList;
import java.util.List;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import l80.C22141p;
import me0.AbstractC23136l9;
import me0.AbstractC23166o6;
import me0.AbstractC23170p;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: com.zing.zalo.feed.uicontrols.e */
/* loaded from: classes4.dex */
public class C8874e extends C16716d {

    /* renamed from: M0 */
    int f47405M0;

    /* renamed from: N0 */
    float f47406N0;

    /* renamed from: O0 */
    ArrayList f47407O0;

    /* renamed from: P0 */
    c f47408P0;

    /* renamed from: Q0 */
    d f47409Q0;

    /* renamed from: R0 */
    int f47410R0;

    /* renamed from: S0 */
    int f47411S0;

    /* renamed from: T0 */
    int f47412T0;

    /* renamed from: U0 */
    int f47413U0;

    /* renamed from: V0 */
    List f47414V0;

    /* renamed from: W0 */
    public View f47415W0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.feed.uicontrols.e$a */
    /* loaded from: classes4.dex */
    public class a extends C16716d {

        /* renamed from: M0 */
        private C22141p f47416M0;

        /* renamed from: N0 */
        private C22126c0 f47417N0;

        public a(Context context) {
            super(context);
            m47349p1(context);
        }

        /* renamed from: p1 */
        private void m47349p1(Context context) {
            C22141p c22141p = new C22141p(context);
            this.f47416M0 = c22141p;
            c22141p.m111929z1(5);
            int i11 = C8874e.this.f47405M0;
            if (i11 <= 0) {
                i11 = AbstractC20814p0.m108611J();
            }
            this.f47416M0.m89106L().m89028L(i11, i11);
            this.f47416M0.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_feed));
            this.f47416M0.m115502r2(false);
            m89001g1(this.f47416M0);
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.black_40));
            c16719g.m89106L().m89028L(i11, i11);
            m89001g1(c16719g);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f47417N0 = c22126c0;
            c22126c0.mo111964L1(AbstractC23136l9.m118659K(AbstractC16802y.feed_multi_photo_more_textsize));
            this.f47417N0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cM0));
            this.f47417N0.m89106L().m89028L(-2, -2).m89069v(this.f47416M0).m89070w(this.f47416M0);
            m89001g1(this.f47417N0);
        }

        /* renamed from: o1 */
        public C22141p m47350o1() {
            return this.f47416M0;
        }

        /* renamed from: q1 */
        public void m47351q1(int i11) {
            C22126c0 c22126c0 = this.f47417N0;
            if (c22126c0 != null) {
                c22126c0.m111959G1("+" + i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.e$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        int f47419a;

        /* renamed from: b */
        C22141p f47420b;

        /* renamed from: c */
        a f47421c;

        /* renamed from: d */
        C21693c f47422d;

        b() {
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.e$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo44779a(C16716d c16716d, C16719g c16719g, int i11, boolean z11, AnimationTarget animationTarget);
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.e$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: a */
        void mo44781a(C16716d c16716d, C16719g c16719g, int i11);
    }

    public C8874e(Context context) {
        super(context);
        this.f47405M0 = 0;
        this.f47407O0 = new ArrayList();
        this.f47410R0 = 0;
        this.f47411S0 = 3;
        this.f47412T0 = C20801j.m108535c();
        this.f47414V0 = new ArrayList();
        this.f47415W0 = null;
        this.f47406N0 = AbstractC23136l9.m118712h(context, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m47337s1(int i11, boolean z11, C16719g c16719g) {
        c cVar = this.f47408P0;
        if (cVar != null) {
            cVar.mo44779a(this, c16719g, i11, z11, AbstractC20826v0.m108747A(c16719g));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m47338t1(int i11, C16719g c16719g) {
        d dVar = this.f47409Q0;
        if (dVar != null) {
            dVar.mo44781a(this, c16719g, i11);
        }
    }

    /* renamed from: A1 */
    public void m47339A1(d dVar) {
        this.f47409Q0 = dVar;
    }

    /* renamed from: q */
    public Rect m47340q(int i11) {
        if (i11 > 2) {
            i11 = 2;
        }
        try {
            int i12 = this.f47405M0;
            if (i12 <= 0) {
                i12 = AbstractC20814p0.m108611J();
            }
            int i13 = (int) (i11 * (i12 + this.f47406N0));
            View view = this.f47415W0;
            int i14 = 0;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                i13 += iArr[0] + m89096G();
                i14 = iArr[1] + m89098H();
            }
            return new Rect(i13, i14, i13 + i12, i12 + i14);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: q1 */
    void m47341q1(C16719g c16719g, final int i11, final boolean z11) {
        if (c16719g != null) {
            c16719g.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.uicontrols.d
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g2) {
                    C8874e.this.m47337s1(i11, z11, c16719g2);
                }
            });
        }
    }

    /* renamed from: r1 */
    public void m47342r1() {
        int size;
        int size2;
        int i11;
        if (this.f47410R0 == 0) {
            if (3 < this.f47407O0.size()) {
                size = 3;
            } else {
                size = this.f47407O0.size();
            }
            int i12 = this.f47405M0;
            if (i12 <= 0) {
                i12 = AbstractC20814p0.m108611J();
            }
            if (this.f47407O0.size() <= 9) {
                int size3 = this.f47407O0.size();
                int i13 = this.f47413U0;
                if (i13 > 0) {
                    i11 = i13 - 1;
                } else {
                    i11 = 0;
                }
                size2 = size3 + i11;
            } else {
                size2 = this.f47407O0.size();
            }
            int i14 = size2 - 2;
            if (i14 < 2) {
                i14 = this.f47413U0;
            }
            while (this.f47414V0.size() < size) {
                this.f47414V0.add(new b());
            }
            while (this.f47414V0.size() > size) {
                List list = this.f47414V0;
                b bVar = (b) list.remove(list.size() - 1);
                if (bVar != null) {
                    m89006m1(bVar.f47420b);
                    m89006m1(bVar.f47421c);
                    m89006m1(bVar.f47422d);
                }
            }
            for (final int i15 = 0; i15 < size; i15++) {
                b bVar2 = (b) this.f47414V0.get(i15);
                bVar2.f47419a = i15;
                if (i15 == 2 && i14 > 1) {
                    if (bVar2.f47421c == null) {
                        a aVar = new a(this.f84786r);
                        bVar2.f47421c = aVar;
                        m89001g1(aVar);
                        m47341q1(aVar, 3, true);
                    }
                    bVar2.f47421c.m89106L().m89063o();
                    bVar2.f47421c.m89106L().m89028L(i12, i12).m89034R((int) (i15 * (i12 + this.f47406N0)));
                    bVar2.f47421c.m47351q1(this.f47407O0.size() - 2);
                } else {
                    m89006m1(bVar2.f47421c);
                    bVar2.f47421c = null;
                    if (bVar2.f47420b == null) {
                        C22141p c22141p = new C22141p(this.f84786r);
                        c22141p.m111929z1(5);
                        c22141p.m115384R1(true);
                        c22141p.mo111925v1(AbstractC23136l9.m118665N(this.f84786r, AbstractC16803z.bg_feed));
                        c22141p.m89129Y0(String.format("image#%s", Integer.valueOf(i15)));
                        bVar2.f47420b = c22141p;
                        m89001g1(c22141p);
                        m47341q1(c22141p, i15, false);
                        c22141p.m89111N0(new C16719g.d() { // from class: com.zing.zalo.feed.uicontrols.c
                            @Override // com.zing.zalo.uidrawing.C16719g.d
                            /* renamed from: f */
                            public final void mo942f(C16719g c16719g) {
                                C8874e.this.m47338t1(i15, c16719g);
                            }
                        });
                    }
                    bVar2.f47420b.m89106L().m89063o();
                    bVar2.f47420b.m89106L().m89028L(i12, i12).m89034R((int) (i15 * (i12 + this.f47406N0)));
                }
                if (((ItemAlbumMobile) this.f47407O0.get(i15)).f42591p == 2) {
                    C21693c c21693c = new C21693c(getContext());
                    c21693c.m89106L().m89028L(-2, -2).m89069v(bVar2.f47420b).m89070w(bVar2.f47420b);
                    c21693c.mo111926w1(AbstractC16803z.icn_csc_play_small);
                    c21693c.mo44614b1(8);
                    bVar2.f47422d = c21693c;
                    m89001g1(c21693c);
                }
            }
        } else {
            this.f47411S0 = Math.min(this.f47407O0.size(), 3);
            while (this.f47414V0.size() < this.f47411S0) {
                this.f47414V0.add(new b());
            }
            while (this.f47414V0.size() > this.f47411S0) {
                List list2 = this.f47414V0;
                b bVar3 = (b) list2.remove(list2.size() - 1);
                if (bVar3 != null) {
                    m89006m1(bVar3.f47420b);
                    m89006m1(bVar3.f47421c);
                    m89006m1(bVar3.f47422d);
                }
            }
            int m118742r = this.f47412T0 - (AbstractC23136l9.m118742r(10.0f) * 2);
            int i16 = (int) this.f47406N0;
            int i17 = this.f47411S0;
            int i18 = (m118742r - (i16 * (i17 - 1))) / i17;
            this.f47405M0 = i18;
            for (int i19 = 0; i19 < this.f47411S0; i19++) {
                b bVar4 = (b) this.f47414V0.get(i19);
                bVar4.f47419a = i19;
                int i21 = this.f47411S0;
                if (i21 == 3 && i19 == i21 - 1 && i21 < this.f47407O0.size()) {
                    if (bVar4.f47421c == null) {
                        a aVar2 = new a(this.f84786r);
                        bVar4.f47421c = aVar2;
                        m89001g1(aVar2);
                        m47341q1(aVar2, this.f47411S0, true);
                    }
                    bVar4.f47421c.m89106L().m89063o();
                    bVar4.f47421c.m89106L().m89028L(i18, i18).m89034R((int) (i19 * (i18 + this.f47406N0)));
                    bVar4.f47421c.m47351q1(this.f47407O0.size() - (this.f47411S0 - 1));
                } else {
                    if (bVar4.f47420b == null) {
                        C22141p c22141p2 = new C22141p(this.f84786r);
                        c22141p2.m111929z1(5);
                        c22141p2.m115384R1(true);
                        c22141p2.mo111925v1(AbstractC23136l9.m118665N(this.f84786r, AbstractC16803z.bg_feed));
                        c22141p2.m89129Y0(String.format("image#%s", Integer.valueOf(i19)));
                        m89001g1(c22141p2);
                        bVar4.f47420b = c22141p2;
                        m47341q1(c22141p2, i19, false);
                    }
                    bVar4.f47420b.m89106L().m89063o();
                    bVar4.f47420b.m89106L().m89028L(i18, i18).m89034R((int) (i19 * (i18 + this.f47406N0)));
                }
            }
        }
        requestLayout();
    }

    /* renamed from: u1 */
    public void m47343u1(boolean z11, C23528a c23528a) {
        int i11;
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        for (int i12 = 0; i12 < this.f47414V0.size(); i12++) {
            try {
                b bVar = (b) this.f47414V0.get(i12);
                String m40526m0 = ((ItemAlbumMobile) this.f47407O0.get(i12)).m40526m0();
                if (!((ItemAlbumMobile) this.f47407O0.get(i12)).f42550D.isEmpty()) {
                    m40526m0 = ((ItemAlbumMobile) this.f47407O0.get(i12)).f42550D;
                }
                String str = m40526m0;
                if (!TextUtils.isEmpty(str)) {
                    C24003n m120136k0 = C23278z2.m120136k0();
                    boolean m125696L2 = C23999j.m125696L2(str, m120136k0);
                    String str2 = "";
                    if (i12 == 2 && (aVar4 = bVar.f47421c) != null && aVar4.m47350o1() != null) {
                        str2 = (String) bVar.f47421c.m47350o1().getTag(AbstractC6918a0.tag_photo_id_social_image_module);
                    } else {
                        C22141p c22141p = bVar.f47420b;
                        if (c22141p != null) {
                            str2 = (String) c22141p.getTag(AbstractC6918a0.tag_photo_id_social_image_module);
                        }
                    }
                    if ((TextUtils.isEmpty(str2) || !TextUtils.equals(str, str2)) && TextUtils.isEmpty(((ItemAlbumMobile) this.f47407O0.get(i12)).f42550D)) {
                        m120136k0.f116261b = AbstractC23170p.m119357o();
                        if (i12 == 2 && (aVar = bVar.f47421c) != null && aVar.m47350o1() != null) {
                            bVar.f47421c.m47350o1().mo111925v1(m120136k0.f116261b);
                        } else {
                            C22141p c22141p2 = bVar.f47420b;
                            if (c22141p2 != null) {
                                c22141p2.mo111925v1(m120136k0.f116261b);
                            }
                        }
                    } else {
                        m120136k0.f116261b = null;
                    }
                    if (i12 == 2 && (aVar3 = bVar.f47421c) != null && aVar3.m47350o1() != null) {
                        bVar.f47421c.m47350o1().setTag(AbstractC6918a0.tag_photo_id_social_image_module, str);
                    } else {
                        C22141p c22141p3 = bVar.f47420b;
                        if (c22141p3 != null) {
                            c22141p3.setTag(AbstractC6918a0.tag_photo_id_social_image_module, str);
                        }
                    }
                    if (!z11 || m125696L2) {
                        if (i12 == 2 && (aVar2 = bVar.f47421c) != null && aVar2.m47350o1() != null) {
                            bVar.f47421c.m47350o1().m115382P1(c23528a, str, m120136k0, new C22122a0.d(), AbstractC23166o6.Companion.m119337a());
                        } else {
                            C22141p c22141p4 = bVar.f47420b;
                            if (c22141p4 != null) {
                                C3979l.b bVar2 = C3979l.b.UNKNOWN;
                                if (this.f47410R0 == 0) {
                                    bVar2 = C3979l.b.FEED_THUMBNAIL;
                                }
                                c22141p4.m115380N1(c23528a, str, m120136k0, bVar2, new C22122a0.d(), AbstractC23166o6.Companion.m119337a());
                            }
                        }
                    }
                }
                C21693c c21693c = bVar.f47422d;
                if (c21693c != null) {
                    if (((ItemAlbumMobile) this.f47407O0.get(i12)).f42591p == 2) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    c21693c.mo44614b1(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
    }

    /* renamed from: v1 */
    public void m47344v1(int i11) {
        this.f47412T0 = i11;
    }

    /* renamed from: w1 */
    public void m47345w1(ArrayList arrayList, int i11) {
        this.f47407O0 = arrayList;
        this.f47413U0 = i11;
    }

    /* renamed from: x1 */
    public void m47346x1(int i11) {
        this.f47405M0 = i11;
    }

    /* renamed from: y1 */
    public void m47347y1(int i11) {
        this.f47410R0 = i11;
    }

    /* renamed from: z1 */
    public void m47348z1(c cVar) {
        this.f47408P0 = cVar;
    }
}
