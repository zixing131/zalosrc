package com.zing.zalo.uicontrol.mediastore;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2966e1;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.animation.AnimationTarget;
import i40.InterfaceC20272b;
import id0.C20518d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23170p;
import me0.C23278z2;
import p266jg.C21243a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C32187y4;

/* loaded from: classes4.dex */
public class ProfileMediaModulesView extends ModulesView implements InterfaceC20272b {

    /* renamed from: V */
    static Drawable f83839V = AbstractC1388a.m6964f(MainApplication.getAppContext(), AbstractC16803z.profile_album_duration_background);

    /* renamed from: W */
    static Drawable f83840W = AbstractC1388a.m6964f(MainApplication.getAppContext(), AbstractC16803z.icon_profile_album_photo_like);

    /* renamed from: a0 */
    static Drawable f83841a0 = AbstractC1388a.m6964f(MainApplication.getAppContext(), AbstractC16803z.icon_profile_album_photo_comment);

    /* renamed from: K */
    C2966e1 f83842K;

    /* renamed from: L */
    List f83843L;

    /* renamed from: M */
    public int f83844M;

    /* renamed from: N */
    public int f83845N;

    /* renamed from: O */
    C23528a f83846O;

    /* renamed from: P */
    InterfaceC16624d f83847P;

    /* renamed from: Q */
    Map f83848Q;

    /* renamed from: R */
    private boolean f83849R;

    /* renamed from: S */
    private boolean f83850S;

    /* renamed from: T */
    boolean f83851T;

    /* renamed from: U */
    boolean f83852U;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView$a */
    /* loaded from: classes4.dex */
    public class C16621a extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ C16719g f83853p;

        C16621a(C16719g c16719g) {
            this.f83853p = c16719g;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            int[] iArr = new int[2];
            ProfileMediaModulesView.this.getLocationOnScreen(iArr);
            int m89096G = iArr[0] + this.f83853p.m89096G();
            int m89098H = iArr[1] + this.f83853p.m89098H();
            return new Rect(m89096G, m89098H, this.f83853p.m89114P() + m89096G, this.f83853p.m89112O() + m89098H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView$b */
    /* loaded from: classes4.dex */
    public class C16622b extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ C16623c f83855c;

        C16622b(C16623c c16623c) {
            this.f83855c = c16623c;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            if (ProfileMediaModulesView.this.f83849R || ProfileMediaModulesView.this.f83850S) {
                this.f83855c.f83865i.mo44614b1(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView$c */
    /* loaded from: classes4.dex */
    public static class C16623c {

        /* renamed from: a */
        int f83857a;

        /* renamed from: b */
        C32187y4 f83858b;

        /* renamed from: c */
        C22122a0 f83859c;

        /* renamed from: d */
        C24003n f83860d;

        /* renamed from: e */
        Rect f83861e;

        /* renamed from: f */
        C22126c0 f83862f;

        /* renamed from: g */
        C21693c f83863g;

        /* renamed from: h */
        C22126c0 f83864h;

        /* renamed from: i */
        C16716d f83865i;

        C16623c() {
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC16624d {
        /* renamed from: a */
        void mo43333a(AnimationTarget animationTarget, C32187y4 c32187y4, C16719g c16719g);

        /* renamed from: b */
        void mo43334b(C32187y4 c32187y4, ProfileMediaModulesView profileMediaModulesView, C16719g c16719g);
    }

    public ProfileMediaModulesView(Context context) {
        super(context);
        this.f83843L = new ArrayList();
        this.f83844M = 0;
        this.f83851T = false;
        this.f83852U = false;
        this.f83846O = new C23528a(context);
        this.f83848Q = new HashMap();
    }

    /* renamed from: e0 */
    private int m88387e0(boolean z11) {
        if (z11 && getResources().getConfiguration().orientation == 2) {
            return (AbstractC23136l9.m118722k0() - C21243a.f103541p) - (C21243a.f103542q * 2);
        }
        return AbstractC23136l9.m118722k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m88389g0(C32187y4 c32187y4, C16719g c16719g) {
        InterfaceC16624d interfaceC16624d = this.f83847P;
        if (interfaceC16624d != null) {
            interfaceC16624d.mo43334b(c32187y4, this, c16719g);
        }
    }

    /* renamed from: i0 */
    private void m88390i0(C16623c c16623c, int i11, int i12, int i13, int i14) {
        int i15 = (int) (i12 * 0.25f);
        int m118742r = AbstractC23136l9.m118742r(16.0f);
        int m118742r2 = AbstractC23136l9.m118742r(8.0f);
        int m118742r3 = AbstractC23136l9.m118742r(4.0f);
        if (c16623c.f83865i == null) {
            c16623c.f83865i = new C16716d(getContext());
        }
        c16623c.f83865i.m89106L().m89028L(i11, i15).m89034R(i13).m89036T((i14 + i12) - i15);
        mo69681L(c16623c.f83865i);
        if (!this.f83849R && !this.f83850S) {
            c16623c.f83865i.m89087B0(AbstractC17466e.transparent);
        } else {
            c16623c.f83865i.m89087B0(AbstractC16803z.shadow_profile_media_item);
            if (c16623c.f83863g == null) {
                C21693c c21693c = new C21693c(getContext());
                c21693c.m89106L().m89028L(m118742r, m118742r).m89034R(m118742r2).m89033Q(m118742r2).m89072y(Boolean.TRUE);
                c16623c.f83863g = c21693c;
            }
            c16623c.f83865i.m89001g1(c16623c.f83863g);
            if (c16623c.f83862f == null) {
                C22126c0 c22126c0 = new C22126c0(getContext());
                c22126c0.m89106L().m89028L(-2, -2).m89054h0(c16623c.f83863g).m89034R(m118742r3).m89029M(15).m89070w(c16623c.f83863g);
                c22126c0.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
                c22126c0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
                c16623c.f83862f = c22126c0;
            }
            c16623c.f83865i.m89001g1(c16623c.f83862f);
        }
        if (c16623c.f83864h == null) {
            C22126c0 c22126c02 = new C22126c0(getContext());
            C16718f m89044a0 = c22126c02.m89106L().m89028L(-2, -2).m89029M(15).m89035S(m118742r2).m89033Q(m118742r2).m89046b0(AbstractC23136l9.m118742r(4.0f)).m89047c0(AbstractC23136l9.m118742r(4.0f)).m89048d0(AbstractC23136l9.m118742r(2.0f)).m89044a0(AbstractC23136l9.m118742r(2.0f));
            Boolean bool = Boolean.TRUE;
            m89044a0.m89072y(bool).m89017A(bool);
            c22126c02.m89085A0(f83839V);
            c22126c02.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
            c22126c02.mo111964L1(AbstractC23136l9.m118742r(10.0f));
            c16623c.f83864h = c22126c02;
        }
        c16623c.f83865i.m89001g1(c16623c.f83864h);
    }

    /* renamed from: j0 */
    private void m88391j0(final C32187y4 c32187y4, C16623c c16623c, int i11, int i12, int i13, int i14) {
        if (c16623c.f83859c == null) {
            C22122a0 c22122a0 = new C22122a0(getContext());
            c16623c.f83859c = c22122a0;
            c22122a0.m111929z1(5);
        }
        c16623c.f83860d = m88395d0(c32187y4);
        c16623c.f83859c.m89106L().m89060k0(i11).m89030N(i12).m89036T(i14).m89034R(i13);
        c16623c.f83859c.mo89109M0(new C16719g.c() { // from class: wc0.a
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ProfileMediaModulesView.this.m88388f0(c32187y4, c16719g);
            }
        });
        c16623c.f83859c.m89111N0(new C16719g.d() { // from class: wc0.b
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                ProfileMediaModulesView.this.m88389g0(c32187y4, c16719g);
            }
        });
        mo69681L(c16623c.f83859c);
    }

    /* renamed from: a0 */
    public void m88392a0(C2966e1 c2966e1, int i11, boolean z11, boolean z12) {
        if (c2966e1 != null) {
            try {
                if (c2966e1.f11708f != null) {
                    setTag(String.format("image#%s", Integer.valueOf(i11)));
                    this.f83848Q.clear();
                    mo44090O();
                    int size = c2966e1.f11708f.size();
                    while (this.f83843L.size() < size) {
                        this.f83843L.add(new C16623c());
                    }
                    while (this.f83843L.size() > size) {
                        List list = this.f83843L;
                        list.remove(list.size() - 1);
                    }
                    if (this.f83844M == 0) {
                        this.f83844M = m88387e0(z11);
                    }
                    float f11 = (this.f83844M * 1.0f) / 320.0f;
                    this.f83845N = (int) (c2966e1.m14029a() * f11);
                    setLayoutParams(new RecyclerView.LayoutParams(this.f83844M, this.f83845N));
                    List list2 = c2966e1.f11708f;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i12 = 0; i12 < size; i12++) {
                            C32187y4 c32187y4 = (C32187y4) c2966e1.f11708f.get(i12);
                            C16623c c16623c = (C16623c) this.f83843L.get(i12);
                            c16623c.f83857a = i12;
                            c16623c.f83858b = c32187y4;
                            int m155180h = (int) ((c32187y4.m155180h() - c32187y4.m155179g()) * f11);
                            int m155177e = (int) ((c32187y4.m155177e() - c32187y4.m155181i()) * f11);
                            int m155179g = (int) (c32187y4.m155179g() * f11);
                            int m155181i = (int) (c32187y4.m155181i() * f11);
                            if (c16623c.f83861e == null) {
                                c16623c.f83861e = new Rect();
                            }
                            c16623c.f83861e.set(m155179g, m155181i, m155179g + m155180h, m155181i + m155177e);
                            this.f83848Q.put(Integer.valueOf(i12), c16623c.f83861e);
                            c16623c.f83857a = i12;
                            c16623c.f83858b = c32187y4;
                            m88391j0(c32187y4, c16623c, m155180h, m155177e, m155179g, m155181i);
                            m88390i0(c16623c, m155180h, m155177e, m155179g, m155181i);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b0 */
    public void m88393b0(C2966e1 c2966e1, boolean z11, int i11) {
        if (c2966e1 != null) {
            try {
                List list = c2966e1.f11708f;
                if (list != null) {
                    this.f83842K = c2966e1;
                    this.f83851T = z11;
                    int min = Math.min(list.size(), this.f83843L.size());
                    for (int i12 = 0; i12 < min; i12++) {
                        C16623c c16623c = (C16623c) this.f83843L.get(i12);
                        if (c16623c != null) {
                            C32187y4 c32187y4 = c16623c.f83858b;
                            String m155191s = c32187y4.m155191s();
                            if (!TextUtils.isEmpty(c32187y4.m155186n())) {
                                m155191s = c32187y4.m155186n();
                            }
                            String str = m155191s;
                            C22122a0 c22122a0 = c16623c.f83859c;
                            if (c22122a0 != null) {
                                c22122a0.mo111925v1(AbstractC23170p.m119358p(getContext()));
                            }
                            if (c16623c.f83859c != null && !TextUtils.isEmpty(str)) {
                                c16623c.f83859c.m89129Y0(str);
                                boolean m125696L2 = C23999j.m125696L2(str, c16623c.f83860d);
                                if (i12 != c16623c.f83857a) {
                                    return;
                                }
                                if (!this.f83852U || m125696L2) {
                                    c16623c.f83859c.m115382P1(this.f83846O, str, c16623c.f83860d, new C16622b(c16623c).m115397c(new C20518d()), 26006);
                                }
                            }
                            if (this.f83849R) {
                                c16623c.f83863g.mo111925v1(f83840W);
                                c16623c.f83862f.m111959G1(String.format("%d", Integer.valueOf(c32187y4.m155184l())));
                            } else if (this.f83850S) {
                                c16623c.f83863g.mo111925v1(f83841a0);
                                c16623c.f83862f.m111959G1(String.format("%d", Integer.valueOf(c32187y4.m155184l())));
                            }
                            if (c16623c.f83864h != null) {
                                if (c32187y4.m155189q() && c32187y4.m155174b() >= 0) {
                                    c16623c.f83864h.mo44614b1(0);
                                    c16623c.f83864h.m111959G1(AbstractC23160o0.m119258i0(c32187y4.m155174b()));
                                } else {
                                    c16623c.f83864h.mo44614b1(8);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c0 */
    public void m88394c0() {
        C22122a0 c22122a0;
        for (int i11 = 0; i11 < this.f83843L.size(); i11++) {
            C16623c c16623c = (C16623c) this.f83843L.get(i11);
            if (c16623c != null && (c22122a0 = c16623c.f83859c) != null) {
                c22122a0.m115371B1();
            }
        }
    }

    /* renamed from: d0 */
    C24003n m88395d0(C32187y4 c32187y4) {
        if (c32187y4.m155176d() != null && ((c32187y4.m155179g() == 0.0f && c32187y4.m155180h() == 320.0f) || (c32187y4.m155181i() == 0.0f && c32187y4.m155177e() == 320.0f))) {
            return C23278z2.m120111a0();
        }
        return C23278z2.m120126f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void m88388f0(C16719g c16719g, C32187y4 c32187y4) {
        try {
            if (this.f83847P != null) {
                this.f83847P.mo43333a(new C16621a(c16719g), c32187y4, c16719g);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m88394c0();
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        try {
            Rect rect = (Rect) this.f83848Q.get(Integer.valueOf(i11));
            if (rect != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = rect.left;
                int i14 = i12 + i13;
                int i15 = iArr[1];
                int i16 = rect.top;
                int i17 = i15 + i16;
                return new Rect(i14, i17, (rect.right - i13) + i14, (rect.bottom - i16) + i17);
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public void setBeingHarassing(boolean z11) {
        this.f83852U = z11;
    }

    public void setEnableShowComment(boolean z11) {
        this.f83850S = z11;
    }

    public void setEnableShowLike(boolean z11) {
        this.f83849R = z11;
    }

    public void setModuleViewItemListener(InterfaceC16624d interfaceC16624d) {
        this.f83847P = interfaceC16624d;
    }
}
