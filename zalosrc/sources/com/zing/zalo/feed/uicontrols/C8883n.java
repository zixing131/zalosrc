package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import bo.AbstractC3059y0;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.animation.AnimationTarget;
import i40.InterfaceC20272b;
import id0.C20518d;
import is.AbstractC20809n;
import is.AbstractC20826v0;
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
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: com.zing.zalo.feed.uicontrols.n */
/* loaded from: classes4.dex */
public class C8883n extends C16716d implements InterfaceC20272b {

    /* renamed from: M0 */
    private final String f47486M0;

    /* renamed from: N0 */
    private final boolean f47487N0;

    /* renamed from: O0 */
    private int f47488O0;

    /* renamed from: P0 */
    private int f47489P0;

    /* renamed from: Q0 */
    private int f47490Q0;

    /* renamed from: R0 */
    private int f47491R0;

    /* renamed from: S0 */
    private int f47492S0;

    /* renamed from: T0 */
    private final boolean f47493T0;

    /* renamed from: U0 */
    private int f47494U0;

    /* renamed from: V0 */
    private boolean f47495V0;

    /* renamed from: W0 */
    private int f47496W0;

    /* renamed from: X0 */
    private boolean f47497X0;

    /* renamed from: Y0 */
    private boolean f47498Y0;

    /* renamed from: Z0 */
    List f47499Z0;

    /* renamed from: a1 */
    c f47500a1;

    /* renamed from: b1 */
    d f47501b1;

    /* renamed from: c1 */
    private ArrayList f47502c1;

    /* renamed from: d1 */
    private int f47503d1;

    /* renamed from: e1 */
    private ArrayList f47504e1;

    /* renamed from: f1 */
    private final List f47505f1;

    /* renamed from: g1 */
    public View f47506g1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.n$a */
    /* loaded from: classes4.dex */
    public class a extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ int f47507c;

        /* renamed from: d */
        final /* synthetic */ long f47508d;

        a(int i11, long j11) {
            this.f47507c = i11;
            this.f47508d = j11;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            int i11;
            try {
                super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
                if (!z11 && c3979l != null) {
                    C8883n.this.f47505f1.add(Long.valueOf(c3979l.m18844h()));
                    if (C8883n.this.f47505f1.size() == this.f47507c) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int i12 = 0;
                        long j11 = 0;
                        while (true) {
                            i11 = this.f47507c;
                            if (i12 >= i11) {
                                break;
                            }
                            j11 += ((Long) C8883n.this.f47505f1.get(i12)).longValue();
                            i12++;
                        }
                        FeedItemPhotoMultiModuleView.Companion.m43987a(i11, this.f47508d, currentTimeMillis, j11, c3979l.m18845i());
                    }
                    C22122a0.d.m115394g(c3979l, c23995f.m125661l());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.uicontrols.n$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        int f47510a;

        /* renamed from: b */
        C22141p f47511b;

        /* renamed from: c */
        C22126c0 f47512c;

        /* renamed from: d */
        C21693c f47513d;

        b() {
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.n$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo44793a(C16719g c16719g, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11);
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.n$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: a */
        void mo44850a(C16716d c16716d, C16719g c16719g, int i11);
    }

    public C8883n(Context context) {
        super(context);
        this.f47486M0 = C8883n.class.getSimpleName();
        this.f47487N0 = false;
        this.f47488O0 = 9;
        this.f47489P0 = 0;
        this.f47490Q0 = 0;
        this.f47492S0 = 0;
        this.f47493T0 = C23278z2.m120139l1();
        this.f47494U0 = 0;
        this.f47495V0 = false;
        this.f47496W0 = -1;
        this.f47497X0 = false;
        this.f47498Y0 = false;
        this.f47499Z0 = new ArrayList();
        this.f47502c1 = new ArrayList();
        this.f47504e1 = new ArrayList();
        this.f47505f1 = new ArrayList();
        this.f47506g1 = null;
        m47381r1();
    }

    /* renamed from: M1 */
    private boolean m47377M1() {
        int i11;
        return this.f47498Y0 && ((i11 = this.f47496W0) == 4 || i11 == 0);
    }

    /* renamed from: r1 */
    private void m47381r1() {
        float m118712h = AbstractC23136l9.m118712h(getContext(), this.f47494U0) * 2;
        if (!this.f47493T0) {
            m118712h = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left) + AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right);
        }
        this.f47490Q0 = getContext().getResources().getDisplayMetrics().widthPixels - ((int) m118712h);
        this.f47491R0 = AbstractC23136l9.m118712h(getContext(), 1.0f);
    }

    /* renamed from: t1 */
    private int m47382t1() {
        if (this.f47496W0 != 11) {
            return AbstractC23136l9.m118742r(26.0f);
        }
        return AbstractC23136l9.m118742r(20.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ void m47383w1(ItemAlbumMobile itemAlbumMobile, int i11, C16719g c16719g) {
        c cVar = this.f47500a1;
        if (cVar != null) {
            cVar.mo44793a(c16719g, AbstractC20826v0.m108747A(c16719g), itemAlbumMobile, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public /* synthetic */ void m47384x1(int i11, C16719g c16719g) {
        d dVar = this.f47501b1;
        if (dVar != null) {
            dVar.mo44850a(this, c16719g, i11);
        }
    }

    /* renamed from: z1 */
    private void m47385z1() {
        if (m47377M1()) {
            this.f47490Q0 = getContext().getResources().getDisplayMetrics().widthPixels - (m89106L().f84720p + m89106L().f84722r);
        }
    }

    /* renamed from: A1 */
    public void m47386A1() {
        C22141p c22141p;
        for (int i11 = 0; i11 < this.f47499Z0.size(); i11++) {
            b bVar = (b) this.f47499Z0.get(i11);
            if (bVar != null && (c22141p = bVar.f47511b) != null) {
                c22141p.m115503t2();
            }
        }
    }

    /* renamed from: B1 */
    public void m47387B1(boolean z11) {
        this.f47495V0 = z11;
    }

    /* renamed from: C1 */
    public void m47388C1(int i11) {
        this.f47492S0 = i11;
    }

    /* renamed from: D1 */
    public void m47389D1(ArrayList arrayList, int i11, ArrayList arrayList2) {
        this.f47502c1 = arrayList;
        this.f47503d1 = i11;
        this.f47504e1 = arrayList2;
    }

    /* renamed from: E1 */
    public void m47390E1(int i11) {
        this.f47496W0 = i11;
    }

    /* renamed from: F1 */
    public void m47391F1(int i11) {
        this.f47494U0 = i11;
        m47381r1();
    }

    /* renamed from: G1 */
    public void m47392G1(int i11) {
        this.f47488O0 = i11;
    }

    /* renamed from: H1 */
    public void m47393H1(int i11) {
        this.f47489P0 = i11;
    }

    /* renamed from: I1 */
    public void m47394I1(int i11) {
        this.f47490Q0 = i11;
    }

    /* renamed from: J1 */
    public void m47395J1(c cVar) {
        this.f47500a1 = cVar;
    }

    /* renamed from: K1 */
    public void m47396K1(d dVar) {
        this.f47501b1 = dVar;
    }

    /* renamed from: L1 */
    public void m47397L1(boolean z11) {
        this.f47498Y0 = z11;
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        int i12;
        int i13;
        int i14;
        if (i11 > 8) {
            try {
                if (AbstractC20826v0.m108824n0(this.f47496W0)) {
                    i11 = 8;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        Rect rect = (Rect) this.f47504e1.get(i11);
        if (rect != null) {
            float f11 = (this.f47490Q0 * 1.0f) / this.f47488O0;
            int i15 = rect.left;
            int i16 = 0;
            if (i15 > 0) {
                i12 = this.f47491R0;
            } else {
                i12 = 0;
            }
            int i17 = rect.top;
            if (i17 > 0) {
                i13 = this.f47491R0;
            } else {
                i13 = 0;
            }
            int i18 = (int) ((i15 * f11) + i12);
            int i19 = (int) ((i17 * f11) + i13);
            View view = this.f47506g1;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                i18 += iArr[0] + m89096G();
                i19 += iArr[1] + m89098H();
            }
            if (rect.right < this.f47488O0) {
                if (i12 > 0) {
                    i14 = this.f47491R0 * 2;
                } else {
                    i14 = this.f47491R0;
                }
            } else {
                i14 = 0;
            }
            if (rect.bottom < this.f47489P0) {
                if (i13 > 0) {
                    i16 = this.f47491R0 * 2;
                } else {
                    i16 = this.f47491R0;
                }
            }
            return new Rect(i18, i19, ((int) ((rect.width() * f11) - i14)) + i18, ((int) ((rect.height() * f11) - i16)) + i19);
        }
        return null;
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f47490Q0, 1073741824);
        int i15 = this.f47489P0;
        if (i15 > 0) {
            i13 = View.MeasureSpec.makeMeasureSpec((int) (this.f47490Q0 * ((i15 * 1.0f) / this.f47488O0)), 1073741824);
        }
        super.mo44180q0(makeMeasureSpec, i12, i13, i14);
    }

    /* renamed from: s1 */
    public ArrayList m47398s1() {
        int size;
        ArrayList arrayList = new ArrayList();
        if (AbstractC20826v0.m108824n0(this.f47496W0)) {
            size = Math.min(this.f47502c1.size(), 9);
        } else {
            size = this.f47502c1.size();
        }
        Pair m108589w = AbstractC20809n.m108589w(size);
        this.f47488O0 = ((Integer) m108589w.first).intValue();
        this.f47489P0 = ((Integer) m108589w.second).intValue();
        int m108591y = AbstractC20809n.m108591y(size);
        int i11 = this.f47488O0 / m108591y;
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = (i12 % m108591y) * i11;
            int i14 = (i12 / m108591y) * i11;
            arrayList.add(new Rect(i13, i14, i13 + i11, i14 + i11));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024b A[SYNTHETIC] */
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m47399u1() {
        int size;
        float m118742r;
        int m118742r2;
        int i11;
        int i12;
        int i13;
        System.currentTimeMillis();
        m47385z1();
        int i14 = this.f47490Q0;
        ArrayList arrayList = this.f47502c1;
        if (arrayList != null && !arrayList.isEmpty() && i14 > 0) {
            if (this.f47488O0 == 0 || this.f47504e1.size() != this.f47502c1.size() || !this.f47493T0 || this.f47495V0) {
                this.f47504e1 = m47398s1();
            }
            float f11 = 1.0f;
            float f12 = (i14 * 1.0f) / this.f47488O0;
            if (AbstractC20826v0.m108824n0(this.f47496W0)) {
                size = Math.min(this.f47502c1.size(), 9);
            } else {
                size = this.f47502c1.size();
            }
            while (this.f47499Z0.size() < size) {
                this.f47499Z0.add(new b());
            }
            while (this.f47499Z0.size() > size) {
                List list = this.f47499Z0;
                b bVar = (b) list.remove(list.size() - 1);
                if (bVar != null) {
                    m89006m1(bVar.f47511b);
                    m89006m1(bVar.f47512c);
                    m89006m1(bVar.f47513d);
                }
            }
            char c11 = 0;
            final int i15 = 0;
            while (i15 < size) {
                Rect rect = (Rect) this.f47504e1.get(i15);
                b bVar2 = (b) this.f47499Z0.get(i15);
                bVar2.f47510a = i15;
                if (bVar2.f47511b == null) {
                    C22141p c22141p = new C22141p(getContext());
                    bVar2.f47511b = c22141p;
                    c22141p.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed));
                    m89001g1(bVar2.f47511b);
                }
                C22141p c22141p2 = bVar2.f47511b;
                if (!this.f47498Y0 && !this.f47497X0) {
                    m118742r = 0.0f;
                } else {
                    m118742r = AbstractC23136l9.m118742r(4.0f);
                }
                c22141p2.mo111927x1(m118742r);
                if (this.f47498Y0) {
                    m118742r2 = AbstractC23136l9.m118742r(2.0f);
                } else {
                    m118742r2 = AbstractC23136l9.m118742r(f11);
                }
                this.f47491R0 = m118742r2;
                int i16 = rect.left;
                if (i16 > 0) {
                    i11 = m118742r2;
                } else {
                    i11 = 0;
                }
                int i17 = rect.top;
                if (i17 > 0) {
                    i12 = m118742r2;
                } else {
                    i12 = 0;
                }
                int i18 = (int) ((i16 * f12) + i11);
                int i19 = (int) ((i17 * f12) + i12);
                if (rect.right < this.f47488O0) {
                    if (i11 > 0) {
                        i13 = m118742r2 * 2;
                    } else {
                        i13 = m118742r2;
                    }
                } else {
                    i13 = 0;
                }
                if (rect.bottom < this.f47489P0) {
                    if (i12 > 0) {
                        m118742r2 *= 2;
                    }
                } else {
                    m118742r2 = 0;
                }
                int width = (int) ((rect.width() * f12) - i13);
                int height = (int) ((rect.height() * f12) - m118742r2);
                c22141p2.m89106L().m89063o();
                c22141p2.m89106L().m89060k0(width).m89030N(height).m89036T(i19).m89034R(i18);
                c22141p2.m111929z1(5);
                Object[] objArr = new Object[1];
                objArr[c11] = Integer.valueOf(this.f47492S0 + i15);
                c22141p2.m89129Y0(String.format("image#%s", objArr));
                c22141p2.m115502r2(true);
                final ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f47502c1.get(i15);
                c22141p2.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.uicontrols.l
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        C8883n.this.m47383w1(itemAlbumMobile, i15, c16719g);
                    }
                });
                c22141p2.m89111N0(new C16719g.d() { // from class: com.zing.zalo.feed.uicontrols.m
                    @Override // com.zing.zalo.uidrawing.C16719g.d
                    /* renamed from: f */
                    public final void mo942f(C16719g c16719g) {
                        C8883n.this.m47384x1(i15, c16719g);
                    }
                });
                m89006m1(bVar2.f47512c);
                if (AbstractC20826v0.m108824n0(this.f47496W0) && i15 == 8) {
                    int size2 = this.f47502c1.size() - 8;
                    if (size2 < 2) {
                        size2 = this.f47503d1;
                    }
                    if (size2 > 1) {
                        C22126c0 c22126c0 = new C22126c0(getContext());
                        c22126c0.mo111964L1(m47382t1());
                        c22126c0.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
                        c22126c0.m111959G1(String.format("+%d", Integer.valueOf(size2)));
                        c22126c0.m89106L().m89060k0(width).m89030N(height).m89036T(i19).m89034R(i18).m89029M(15);
                        if (this.f47498Y0) {
                            c22126c0.m89087B0(AbstractC16803z.bg_feed_multi_photo_music_overflow_text);
                        } else {
                            c22126c0.mo89161z0(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_70));
                        }
                        bVar2.f47512c = c22126c0;
                        m89001g1(c22126c0);
                        c22141p2.m115502r2(false);
                        m89006m1(bVar2.f47513d);
                        if (itemAlbumMobile.f42591p != 2) {
                            C21693c c21693c = new C21693c(getContext());
                            c21693c.m89106L().m89028L(-2, -2).m89069v(bVar2.f47511b).m89070w(bVar2.f47511b);
                            c21693c.mo111926w1(AbstractC16803z.icn_csc_play_small);
                            c21693c.mo44614b1(8);
                            bVar2.f47513d = c21693c;
                            m89001g1(c21693c);
                        }
                        i15++;
                        f11 = 1.0f;
                        c11 = 0;
                    }
                }
                m89006m1(bVar2.f47513d);
                if (itemAlbumMobile.f42591p != 2) {
                }
                i15++;
                f11 = 1.0f;
                c11 = 0;
            }
        }
    }

    /* renamed from: v1 */
    public void m47400v1(boolean z11) {
        this.f47497X0 = z11;
    }

    /* renamed from: y1 */
    public void m47401y1(boolean z11, C23528a c23528a) {
        int size;
        String str;
        int i11;
        boolean z12 = AbstractC23304d.m120536g().f147980a;
        if (AbstractC20826v0.m108824n0(this.f47496W0)) {
            size = Math.min(this.f47502c1.size(), 9);
        } else {
            size = this.f47502c1.size();
        }
        this.f47505f1.clear();
        long currentTimeMillis = System.currentTimeMillis();
        for (int i12 = 0; i12 < size; i12++) {
            if (((ItemAlbumMobile) this.f47502c1.get(i12)).f42550D.isEmpty()) {
                str = ((ItemAlbumMobile) this.f47502c1.get(i12)).m40526m0();
            } else {
                str = ((ItemAlbumMobile) this.f47502c1.get(i12)).f42550D;
            }
            String str2 = str;
            b bVar = (b) this.f47499Z0.get(i12);
            C24003n m120098U = C23278z2.m120098U(false);
            if (this.f47488O0 == this.f47489P0 && i12 >= 0 && i12 < this.f47504e1.size()) {
                Rect rect = (Rect) this.f47504e1.get(i12);
                if (rect.width() == this.f47488O0 || rect.height() == this.f47488O0) {
                    m120098U = C23278z2.m120098U(true);
                }
            }
            C24003n c24003n = m120098U;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = (String) bVar.f47511b.getTag(AbstractC6918a0.tag_photo_id_social_image_module);
                C20518d c20518d = null;
                if ((TextUtils.isEmpty(str3) || !TextUtils.equals(str2, str3)) && TextUtils.isEmpty(((ItemAlbumMobile) this.f47502c1.get(i12)).f42550D)) {
                    Drawable m119358p = AbstractC23170p.m119358p(getContext());
                    c24003n.f116261b = m119358p;
                    bVar.f47511b.mo111925v1(m119358p);
                } else {
                    c24003n.f116261b = null;
                }
                bVar.f47511b.setTag(AbstractC6918a0.tag_photo_id_social_image_module, str2);
                boolean m125696L2 = C23999j.m125696L2(str2, c24003n);
                if (!z11 || !z12 || m125696L2) {
                    c24003n.f116283x = AbstractC3059y0.m14706a(this.f47496W0);
                    C3979l.b bVar2 = C3979l.b.UNKNOWN;
                    int i13 = this.f47496W0;
                    if (i13 == 0 || i13 == 1 || i13 == 2) {
                        bVar2 = C3979l.b.FEED_THUMBNAIL;
                    }
                    C3979l.b bVar3 = bVar2;
                    C20518d c20518d2 = new C20518d();
                    if (bVar.f47511b.m115373D1() == null || c24003n.f116261b != null) {
                        c20518d = c20518d2;
                    }
                    bVar.f47511b.m115380N1(c23528a, str2, c24003n, bVar3, new a(size, currentTimeMillis).m115397c(c20518d), AbstractC23166o6.Companion.m119337a());
                }
            }
            C21693c c21693c = bVar.f47513d;
            if (c21693c != null) {
                if (((ItemAlbumMobile) this.f47502c1.get(i12)).f42591p == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                c21693c.mo44614b1(i11);
            }
        }
    }
}
