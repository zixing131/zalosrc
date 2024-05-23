package com.zing.zalo.p077ui.mediastore.file;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import b40.C2526d;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import ci.C3521p0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17014k0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import id0.C20518d;
import java.util.HashMap;
import java.util.List;
import kd0.C21691a;
import kd0.C21693c;
import ki0.C21739g;
import ki0.C21740h;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23250w4;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p461qu.AbstractC25495a;
import p698yz.AbstractC31111g;
import p698yz.C31106b;
import p698yz.EnumC31105a;
import p698yz.EnumC31107c;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import th.AbstractC26687h;
import ui0.C27280g;
import vc0.InterfaceC27965d;
import vc0.InterfaceC27968g;
import vg.AbstractC28236y3;
import w50.C28770b;

/* loaded from: classes6.dex */
public final class MediaStoreItemFileModuleView extends ModulesView implements InterfaceC27968g, C17945a0.x, C28770b.a {

    /* renamed from: K */
    private int f64331K;

    /* renamed from: L */
    private final int f64332L;

    /* renamed from: M */
    private int f64333M;

    /* renamed from: N */
    private int f64334N;

    /* renamed from: O */
    private int f64335O;

    /* renamed from: P */
    private final int f64336P;

    /* renamed from: Q */
    private C16716d f64337Q;

    /* renamed from: R */
    private C21693c f64338R;

    /* renamed from: S */
    private C16716d f64339S;

    /* renamed from: T */
    private C17014k0 f64340T;

    /* renamed from: U */
    private C21740h f64341U;

    /* renamed from: V */
    private C21739g f64342V;

    /* renamed from: W */
    private C21739g f64343W;

    /* renamed from: a0 */
    private C21693c f64344a0;

    /* renamed from: b0 */
    private C3977j f64345b0;

    /* renamed from: c0 */
    private C16719g f64346c0;

    /* renamed from: d0 */
    private C16716d f64347d0;

    /* renamed from: e0 */
    private C3521p0.c f64348e0;

    /* renamed from: f0 */
    private InterfaceC12362a f64349f0;

    /* renamed from: g0 */
    private C23528a f64350g0;

    /* renamed from: h0 */
    private C21691a f64351h0;

    /* renamed from: i0 */
    private final InterfaceC24854k f64352i0;

    /* renamed from: j0 */
    private final InterfaceC24854k f64353j0;

    /* renamed from: k0 */
    private boolean f64354k0;

    /* renamed from: l0 */
    private MediaStoreItem f64355l0;

    /* renamed from: m0 */
    private int f64356m0;

    /* renamed from: n0 */
    private int f64357n0;

    /* renamed from: o0 */
    private boolean f64358o0;

    /* renamed from: p0 */
    private EnumC31105a f64359p0;

    /* renamed from: q0 */
    private C28770b f64360q0;

    /* renamed from: r0 */
    private final HashMap f64361r0;

    /* renamed from: com.zing.zalo.ui.mediastore.file.MediaStoreItemFileModuleView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12362a {
        /* renamed from: a */
        void mo36880a(MediaStoreItem mediaStoreItem, boolean z11, int i11);

        /* renamed from: b */
        void mo36881b(MediaStoreItem mediaStoreItem);

        /* renamed from: c */
        void mo36882c(MediaStoreItem mediaStoreItem);

        /* renamed from: d */
        void mo36883d(MediaStoreItem mediaStoreItem);

        /* renamed from: e */
        void mo36884e(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem);

        /* renamed from: f */
        void mo36885f(MediaStoreItem mediaStoreItem, int i11);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.file.MediaStoreItemFileModuleView$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12363b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64362a;

        static {
            int[] iArr = new int[EnumC31105a.values().length];
            try {
                iArr[EnumC31105a.f143330q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31105a.f143334u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31105a.f143332s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31105a.f143336w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31105a.f143331r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31105a.f143329p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31105a.f143333t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC31105a.f143335v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC31105a.f143337x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f64362a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.file.MediaStoreItemFileModuleView$c */
    /* loaded from: classes6.dex */
    public static final class C12364c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ MediaStoreItem f64364r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12364c(MediaStoreItem mediaStoreItem) {
            super(0);
            this.f64364r = mediaStoreItem;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m69526a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m69526a() {
            MediaStoreItemFileModuleView.this.m69503h0(this.f64364r);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.file.MediaStoreItemFileModuleView$d */
    /* loaded from: classes6.dex */
    public static final class C12365d extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ boolean f64366m1;

        C12365d(boolean z11) {
            this.f64366m1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                C21693c c21693c = MediaStoreItemFileModuleView.this.f64338R;
                C21693c c21693c2 = null;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c = null;
                }
                if (AbstractC19074t.m100204b(c21693c.m89133b0(), str) && c3979l != null) {
                    C21693c c21693c3 = MediaStoreItemFileModuleView.this.f64338R;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c3 = null;
                    }
                    c21693c3.m89087B0(AbstractC16803z.bg_border_thumb_media_store);
                    C3977j c3977j = MediaStoreItemFileModuleView.this.f64345b0;
                    if (c3977j == null) {
                        AbstractC19074t.m100223u("mDumpView");
                        c3977j = null;
                    }
                    c3977j.setImageInfo(c3979l, false);
                    if (this.f64366m1) {
                        C21693c c21693c4 = MediaStoreItemFileModuleView.this.f64338R;
                        if (c21693c4 == null) {
                            AbstractC19074t.m100223u("thumbImage");
                        } else {
                            c21693c2 = c21693c4;
                        }
                        c21693c2.mo111924u1(c3979l.m18839c());
                        return;
                    }
                    C21693c c21693c5 = MediaStoreItemFileModuleView.this.f64338R;
                    if (c21693c5 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c5 = null;
                    }
                    c21693c5.mo111924u1(c3979l.m18839c());
                    C21693c c21693c6 = MediaStoreItemFileModuleView.this.f64338R;
                    if (c21693c6 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                    } else {
                        c21693c2 = c21693c6;
                    }
                    c21693c2.m89135c1(new C20518d().m106593j(200L));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.file.MediaStoreItemFileModuleView$e */
    /* loaded from: classes6.dex */
    static final class C12366e extends AbstractC19075u implements InterfaceC18494a {
        C12366e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MediaStoreItemFileModuleView.this.getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.file.MediaStoreItemFileModuleView$f */
    /* loaded from: classes6.dex */
    static final class C12367f extends AbstractC19075u implements InterfaceC18494a {
        C12367f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MediaStoreItemFileModuleView.this.getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemFileModuleView(Context context, boolean z11, boolean z12) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f64331K = AbstractC23136l9.m118742r(12.0f);
        this.f64332L = AbstractC23136l9.m118742r(72.0f);
        this.f64333M = AbstractC23136l9.m118742r(60.0f);
        this.f64334N = AbstractC23136l9.m118742r(60.0f);
        this.f64335O = AbstractC23136l9.m118742r(16.0f);
        this.f64336P = AbstractC23222t7.f112534M;
        m129210a = AbstractC24856m.m129210a(new C12367f());
        this.f64352i0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12366e());
        this.f64353j0 = m129210a2;
        this.f64359p0 = EnumC31105a.f143330q;
        this.f64360q0 = new C28770b();
        this.f64361r0 = new HashMap();
        this.f64354k0 = z11;
        this.f64358o0 = z12;
        this.f64357n0 = AbstractC23136l9.m118728m0(context, z12);
        m69524p0(context);
    }

    /* renamed from: C0 */
    public static /* synthetic */ void m69491C0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mediaStoreItemFileModuleView.m69521B0(z11);
    }

    /* renamed from: f0 */
    private final void m69501f0(MediaStoreItem mediaStoreItem) {
        AbstractC3489d.m17517y(mediaStoreItem.m40599m(), new C12364c(mediaStoreItem));
    }

    /* renamed from: g0 */
    private final void m69502g0(MediaStoreItem mediaStoreItem) {
        int i11;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C31106b m151126g = AbstractC31111g.m151126g(context, EnumC31107c.f143343q, mediaStoreItem.m40599m(), this.f64359p0);
        C21739g c21739g = this.f64343W;
        C21739g c21739g2 = null;
        if (c21739g == null) {
            AbstractC19074t.m100223u("tvStatus");
            c21739g = null;
        }
        c21739g.f105572M0.m111959G1(m151126g.m151115a());
        C21739g c21739g3 = this.f64343W;
        if (c21739g3 == null) {
            AbstractC19074t.m100223u("tvStatus");
            c21739g3 = null;
        }
        c21739g3.f105572M0.m111962J1(m151126g.m151116b());
        C21739g c21739g4 = this.f64343W;
        if (c21739g4 == null) {
            AbstractC19074t.m100223u("tvStatus");
        } else {
            c21739g2 = c21739g4;
        }
        if (m151126g.m151115a().length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c21739g2.mo44614b1(i11);
    }

    private final Drawable getMDrawableChecked() {
        return (Drawable) this.f64353j0.getValue();
    }

    private final Drawable getMDrawableNormal() {
        return (Drawable) this.f64352i0.getValue();
    }

    private final Rect getRectView() {
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            C16716d c16716d = this.f64347d0;
            if (c16716d == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d = null;
            }
            int m89114P = c16716d.m89114P() + i11;
            C16716d c16716d2 = this.f64347d0;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d2 = null;
            }
            return new Rect(i11, i12, m89114P, c16716d2.m89112O() + i12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m69503h0(MediaStoreItem mediaStoreItem) {
        String m40572N;
        CharSequence charSequence;
        String m94862C4 = mediaStoreItem.m40599m().m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        String m119788L = C23250w4.m119788L(m94862C4, mediaStoreItem.m40599m().m94854B4());
        if (mediaStoreItem.m40585b0()) {
            m40572N = mediaStoreItem.m40613w();
        } else {
            m40572N = mediaStoreItem.m40572N();
        }
        C21739g c21739g = this.f64342V;
        if (c21739g == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c21739g = null;
        }
        c21739g.mo44614b1(0);
        C21740h c21740h = c21739g.f105572M0;
        if (mediaStoreItem.m40599m().m94849A8()) {
            Context context = c21739g.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            charSequence = m69519z0(AbstractC23463h.m123175c(context, m40572N + " • " + m119788L, false, 4, null));
        } else {
            charSequence = m40572N + " • " + m119788L;
        }
        c21740h.m111959G1(charSequence);
        c21739g.m112184o1(AbstractC23136l9.m118742r(8.0f));
    }

    /* renamed from: i0 */
    private final void m69504i0(MediaStoreItem mediaStoreItem) {
        C21693c c21693c = null;
        switch (C12363b.f64362a[this.f64359p0.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (AbstractC25495a.m132078c(mediaStoreItem.m40599m().mo95039W2()) && !AbstractC26687h.m137065f(mediaStoreItem.m40599m().mo95039W2(), mediaStoreItem.m40599m().m95238r3())) {
                    C16716d c16716d = this.f64339S;
                    if (c16716d == null) {
                        AbstractC19074t.m100223u("loadingProgressContainer");
                        c16716d = null;
                    }
                    c16716d.mo44614b1(8);
                    C21693c c21693c2 = this.f64338R;
                    if (c21693c2 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c2 = null;
                    }
                    c21693c2.mo44614b1(0);
                    C21693c c21693c3 = this.f64338R;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("thumbImage");
                        c21693c3 = null;
                    }
                    c21693c3.m89129Y0(null);
                    m69511q0(mediaStoreItem);
                    return;
                }
                C16716d c16716d2 = this.f64339S;
                if (c16716d2 == null) {
                    AbstractC19074t.m100223u("loadingProgressContainer");
                    c16716d2 = null;
                }
                c16716d2.mo44614b1(8);
                C21693c c21693c4 = this.f64338R;
                if (c21693c4 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c4 = null;
                }
                c21693c4.mo44614b1(0);
                C21693c c21693c5 = this.f64338R;
                if (c21693c5 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c5 = null;
                }
                c21693c5.m89106L().m89060k0(this.f64336P).m89030N(this.f64336P);
                C21693c c21693c6 = this.f64338R;
                if (c21693c6 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c6 = null;
                }
                c21693c6.m89129Y0(null);
                C21693c c21693c7 = this.f64338R;
                if (c21693c7 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c7 = null;
                }
                c21693c7.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                C21693c c21693c8 = this.f64338R;
                if (c21693c8 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c8 = null;
                }
                c21693c8.m111929z1(4);
                C21693c c21693c9 = this.f64338R;
                if (c21693c9 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                } else {
                    c21693c = c21693c9;
                }
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_download_solid_24, AbstractC2807a.icon_01));
                return;
            case 5:
                C16716d c16716d3 = this.f64339S;
                if (c16716d3 == null) {
                    AbstractC19074t.m100223u("loadingProgressContainer");
                    c16716d3 = null;
                }
                c16716d3.mo44614b1(0);
                C17014k0 c17014k0 = this.f64340T;
                if (c17014k0 == null) {
                    AbstractC19074t.m100223u("thumbLoadingProgress");
                    c17014k0 = null;
                }
                c17014k0.m91066k1(mediaStoreItem.m40599m().m94982Q2());
                C21693c c21693c10 = this.f64338R;
                if (c21693c10 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c10 = null;
                }
                c21693c10.mo44614b1(8);
                C21693c c21693c11 = this.f64338R;
                if (c21693c11 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c11 = null;
                }
                c21693c11.m89129Y0(null);
                return;
            case 6:
            case 7:
                C16716d c16716d4 = this.f64339S;
                if (c16716d4 == null) {
                    AbstractC19074t.m100223u("loadingProgressContainer");
                    c16716d4 = null;
                }
                c16716d4.mo44614b1(8);
                C21693c c21693c12 = this.f64338R;
                if (c21693c12 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c12 = null;
                }
                c21693c12.mo44614b1(0);
                C21693c c21693c13 = this.f64338R;
                if (c21693c13 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c13 = null;
                }
                c21693c13.m89129Y0(null);
                m69511q0(mediaStoreItem);
                return;
            case 8:
            case 9:
                C16716d c16716d5 = this.f64339S;
                if (c16716d5 == null) {
                    AbstractC19074t.m100223u("loadingProgressContainer");
                    c16716d5 = null;
                }
                c16716d5.mo44614b1(8);
                C21693c c21693c14 = this.f64338R;
                if (c21693c14 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c14 = null;
                }
                c21693c14.mo44614b1(0);
                C21693c c21693c15 = this.f64338R;
                if (c21693c15 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c15 = null;
                }
                c21693c15.m89106L().m89060k0(this.f64336P).m89030N(this.f64336P);
                C21693c c21693c16 = this.f64338R;
                if (c21693c16 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c16 = null;
                }
                c21693c16.m89129Y0(null);
                C21693c c21693c17 = this.f64338R;
                if (c21693c17 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c17 = null;
                }
                c21693c17.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                C21693c c21693c18 = this.f64338R;
                if (c21693c18 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                    c21693c18 = null;
                }
                c21693c18.m111929z1(4);
                C21693c c21693c19 = this.f64338R;
                if (c21693c19 == null) {
                    AbstractC19074t.m100223u("thumbImage");
                } else {
                    c21693c = c21693c19;
                }
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                c21693c.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_file_rolled_out_solid_24, AbstractC2807a.icon_03));
                return;
            default:
                return;
        }
    }

    /* renamed from: j0 */
    private final void m69505j0(MediaStoreItem mediaStoreItem) {
        CharSequence m69519z0;
        C21740h c21740h = this.f64341U;
        if (c21740h == null) {
            AbstractC19074t.m100223u("tvTitle");
            c21740h = null;
        }
        if (TextUtils.isEmpty(mediaStoreItem.m40607q())) {
            m69519z0 = "File";
        } else {
            m69519z0 = m69519z0(mediaStoreItem.m40607q());
        }
        c21740h.m111959G1(m69519z0);
    }

    /* renamed from: k0 */
    private final void m69506k0(MediaStoreItem mediaStoreItem) {
        m69505j0(mediaStoreItem);
        m69503h0(mediaStoreItem);
        m69502g0(mediaStoreItem);
        m69504i0(mediaStoreItem);
        m69491C0(this, false, 1, null);
        m69501f0(mediaStoreItem);
    }

    /* renamed from: l0 */
    private final void m69507l0(C17945a0 c17945a0) {
        int m103071n = AbstractC19656s0.m103071n(c17945a0);
        EnumC31105a enumC31105a = this.f64359p0;
        if (enumC31105a == EnumC31105a.f143333t || enumC31105a == EnumC31105a.f143334u) {
            m103071n |= 1;
        }
        if (m103071n != 0) {
            this.f64360q0.m143924q(c17945a0, m103071n, this);
        }
    }

    /* renamed from: m0 */
    private final void m69508m0() {
        this.f64359p0 = EnumC31105a.f143330q;
        this.f64360q0 = new C28770b();
        C21740h c21740h = this.f64341U;
        C21693c c21693c = null;
        if (c21740h == null) {
            AbstractC19074t.m100223u("tvTitle");
            c21740h = null;
        }
        c21740h.m111959G1("");
        C21739g c21739g = this.f64342V;
        if (c21739g == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c21739g = null;
        }
        c21739g.f105572M0.m111959G1("");
        C21739g c21739g2 = this.f64343W;
        if (c21739g2 == null) {
            AbstractC19074t.m100223u("tvStatus");
            c21739g2 = null;
        }
        c21739g2.f105572M0.m111959G1("");
        C17014k0 c17014k0 = this.f64340T;
        if (c17014k0 == null) {
            AbstractC19074t.m100223u("thumbLoadingProgress");
            c17014k0 = null;
        }
        c17014k0.mo44614b1(8);
        C21693c c21693c2 = this.f64338R;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("thumbImage");
        } else {
            c21693c = c21693c2;
        }
        c21693c.mo44614b1(8);
    }

    /* renamed from: n0 */
    private final void m69509n0(MediaStoreItem mediaStoreItem) {
        if (this.f64354k0 && this.f64351h0 != null) {
            InterfaceC12362a interfaceC12362a = this.f64349f0;
            if (interfaceC12362a != null) {
                interfaceC12362a.mo36880a(mediaStoreItem, !mediaStoreItem.m40597k0(), this.f64356m0);
                return;
            }
            return;
        }
        if (this.f64359p0 == EnumC31105a.f143331r) {
            InterfaceC12362a interfaceC12362a2 = this.f64349f0;
            if (interfaceC12362a2 != null) {
                interfaceC12362a2.mo36881b(mediaStoreItem);
                return;
            }
            return;
        }
        InterfaceC12362a interfaceC12362a3 = this.f64349f0;
        if (interfaceC12362a3 != null) {
            interfaceC12362a3.mo36884e(this, mediaStoreItem);
        }
    }

    /* renamed from: o0 */
    private final void m69510o0(MediaStoreItem mediaStoreItem) {
        InterfaceC12362a interfaceC12362a;
        if (this.f64354k0 && this.f64351h0 != null) {
            InterfaceC12362a interfaceC12362a2 = this.f64349f0;
            if (interfaceC12362a2 != null) {
                interfaceC12362a2.mo36880a(mediaStoreItem, !mediaStoreItem.m40597k0(), this.f64356m0);
                return;
            }
            return;
        }
        int i11 = C12363b.f64362a[this.f64359p0.ordinal()];
        if (i11 != 4) {
            if (i11 != 5) {
                InterfaceC12362a interfaceC12362a3 = this.f64349f0;
                if (interfaceC12362a3 != null) {
                    interfaceC12362a3.mo36884e(this, mediaStoreItem);
                    return;
                }
                return;
            }
            InterfaceC12362a interfaceC12362a4 = this.f64349f0;
            if (interfaceC12362a4 != null) {
                interfaceC12362a4.mo36881b(mediaStoreItem);
                return;
            }
            return;
        }
        MediaStoreItem mediaStoreItem2 = this.f64355l0;
        if (mediaStoreItem2 != null && (interfaceC12362a = this.f64349f0) != null) {
            interfaceC12362a.mo36882c(mediaStoreItem2);
        }
    }

    /* renamed from: q0 */
    private final void m69511q0(MediaStoreItem mediaStoreItem) {
        C21693c c21693c = this.f64338R;
        C21693c c21693c2 = null;
        C3977j c3977j = null;
        C21693c c21693c3 = null;
        if (c21693c == null) {
            AbstractC19074t.m100223u("thumbImage");
            c21693c = null;
        }
        c21693c.m89087B0(0);
        C21693c c21693c4 = this.f64338R;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("thumbImage");
            c21693c4 = null;
        }
        c21693c4.mo111926w1(0);
        String m95131f5 = mediaStoreItem.m40599m().m95131f5();
        AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
        if (!TextUtils.isEmpty(m95131f5)) {
            C21693c c21693c5 = this.f64338R;
            if (c21693c5 == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c5 = null;
            }
            c21693c5.m111929z1(5);
            C21693c c21693c6 = this.f64338R;
            if (c21693c6 == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c6 = null;
            }
            c21693c6.m89106L().m89060k0(this.f64333M).m89030N(this.f64334N);
            C21693c c21693c7 = this.f64338R;
            if (c21693c7 == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c7 = null;
            }
            c21693c7.mo111926w1(AbstractC16803z.chat_icloud_default);
            boolean m125696L2 = C23999j.m125696L2(m95131f5, C23278z2.m120126f0());
            C21693c c21693c8 = this.f64338R;
            if (c21693c8 == null) {
                AbstractC19074t.m100223u("thumbImage");
                c21693c8 = null;
            }
            c21693c8.m89129Y0(m95131f5);
            C23528a c23528a = this.f64350g0;
            if (c23528a == null) {
                AbstractC19074t.m100223u("mAQ");
                c23528a = null;
            }
            C3977j c3977j2 = this.f64345b0;
            if (c3977j2 == null) {
                AbstractC19074t.m100223u("mDumpView");
            } else {
                c3977j = c3977j2;
            }
            ((C23528a) c23528a.m123612r(c3977j)).m123579C(m95131f5, C23278z2.m120126f0(), new C12365d(m125696L2));
            return;
        }
        C21693c c21693c9 = this.f64338R;
        if (c21693c9 == null) {
            AbstractC19074t.m100223u("thumbImage");
            c21693c9 = null;
        }
        c21693c9.m111929z1(0);
        C21693c c21693c10 = this.f64338R;
        if (c21693c10 == null) {
            AbstractC19074t.m100223u("thumbImage");
            c21693c10 = null;
        }
        c21693c10.m89106L().m89060k0(-1).m89030N(-1);
        if (mediaStoreItem.m40585b0()) {
            C21693c c21693c11 = this.f64338R;
            if (c21693c11 == null) {
                AbstractC19074t.m100223u("thumbImage");
            } else {
                c21693c3 = c21693c11;
            }
            c21693c3.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_folder));
            return;
        }
        C21693c c21693c12 = this.f64338R;
        if (c21693c12 == null) {
            AbstractC19074t.m100223u("thumbImage");
        } else {
            c21693c2 = c21693c12;
        }
        Context context = getContext();
        String m95223p3 = mediaStoreItem.m40599m().m95223p3();
        if (m95223p3 == null) {
            m95223p3 = "";
        }
        c21693c2.mo111925v1(AbstractC28236y3.m142197h(context, m95223p3));
    }

    /* renamed from: s0 */
    private final void m69512s0(final MediaStoreItem mediaStoreItem, final int i11) {
        C16716d c16716d = this.f64347d0;
        C16716d c16716d2 = null;
        if (c16716d == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d = null;
        }
        c16716d.mo89109M0(new C16719g.c() { // from class: a80.b
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MediaStoreItemFileModuleView.m69513t0(MediaStoreItemFileModuleView.this, mediaStoreItem, c16719g);
            }
        });
        C21693c c21693c = this.f64338R;
        if (c21693c == null) {
            AbstractC19074t.m100223u("thumbImage");
            c21693c = null;
        }
        c21693c.mo89109M0(new C16719g.c() { // from class: a80.c
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MediaStoreItemFileModuleView.m69514u0(MediaStoreItemFileModuleView.this, mediaStoreItem, c16719g);
            }
        });
        C21739g c21739g = this.f64343W;
        if (c21739g == null) {
            AbstractC19074t.m100223u("tvStatus");
            c21739g = null;
        }
        c21739g.mo89109M0(new C16719g.c() { // from class: a80.d
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MediaStoreItemFileModuleView.m69515v0(MediaStoreItemFileModuleView.this, mediaStoreItem, c16719g);
            }
        });
        C16716d c16716d3 = this.f64347d0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
        } else {
            c16716d2 = c16716d3;
        }
        c16716d2.m89111N0(new C16719g.d() { // from class: a80.e
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                MediaStoreItemFileModuleView.m69516w0(MediaStoreItemFileModuleView.this, mediaStoreItem, i11, c16719g);
            }
        });
        C21693c c21693c2 = this.f64344a0;
        if (c21693c2 != null) {
            c21693c2.mo89109M0(new C16719g.c() { // from class: a80.f
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    MediaStoreItemFileModuleView.m69517x0(MediaStoreItemFileModuleView.this, mediaStoreItem, c16719g);
                }
            });
        }
        setOnClickListener(new View.OnClickListener() { // from class: a80.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaStoreItemFileModuleView.m69518y0(MediaStoreItemFileModuleView.this, mediaStoreItem, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m69513t0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        mediaStoreItemFileModuleView.m69509n0(mediaStoreItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m69514u0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        mediaStoreItemFileModuleView.m69509n0(mediaStoreItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m69515v0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        mediaStoreItemFileModuleView.m69510o0(mediaStoreItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m69516w0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem, int i11, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        InterfaceC12362a interfaceC12362a = mediaStoreItemFileModuleView.f64349f0;
        if (interfaceC12362a != null) {
            interfaceC12362a.mo36885f(mediaStoreItem, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m69517x0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        AbstractC23647d.m123897g("1001526");
        InterfaceC12362a interfaceC12362a = mediaStoreItemFileModuleView.f64349f0;
        if (interfaceC12362a != null) {
            interfaceC12362a.mo36883d(mediaStoreItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m69518y0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem, View view) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$itemData");
        InterfaceC12362a interfaceC12362a = mediaStoreItemFileModuleView.f64349f0;
        if (interfaceC12362a != null) {
            interfaceC12362a.mo36884e(mediaStoreItemFileModuleView, mediaStoreItem);
        }
    }

    /* renamed from: z0 */
    private final CharSequence m69519z0(CharSequence charSequence) {
        if (charSequence == null) {
            return new SpannableString("");
        }
        try {
            C21740h c21740h = this.f64341U;
            C21740h c21740h2 = null;
            if (c21740h == null) {
                AbstractC19074t.m100223u("tvTitle");
                c21740h = null;
            }
            String str = "[" + ((Object) charSequence) + "][" + c21740h.m111971k1() + "][" + this.f64357n0 + "]";
            CharSequence charSequence2 = (CharSequence) this.f64361r0.get(str);
            if (charSequence2 != null) {
                return charSequence2;
            }
            C13704p1 c13704p1 = new C13704p1(1);
            C21740h c21740h3 = this.f64341U;
            if (c21740h3 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c21740h3 = null;
            }
            c13704p1.setTextSize(c21740h3.m111977q1());
            C21740h c21740h4 = this.f64341U;
            if (c21740h4 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c21740h4 = null;
            }
            c13704p1.setTypeface(c21740h4.m111978r1());
            int i11 = this.f64357n0;
            C21740h c21740h5 = this.f64341U;
            if (c21740h5 == null) {
                AbstractC19074t.m100223u("tvTitle");
            } else {
                c21740h2 = c21740h5;
            }
            CharSequence m102924Q0 = AbstractC19646n0.m102924Q0(charSequence, c13704p1, i11, c21740h2.m111971k1(), 7);
            this.f64361r0.put(str, m102924Q0);
            return m102924Q0;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return charSequence;
        }
    }

    /* renamed from: A0 */
    public final void m69520A0() {
        MediaStoreItem mediaStoreItem = this.f64355l0;
        if (mediaStoreItem == null) {
            return;
        }
        this.f64359p0 = AbstractC31111g.m151138s(mediaStoreItem);
        m69502g0(mediaStoreItem);
        m69504i0(mediaStoreItem);
    }

    /* renamed from: B0 */
    public final void m69521B0(boolean z11) {
        C21691a c21691a;
        boolean z12;
        MediaStoreItem mediaStoreItem = this.f64355l0;
        if (mediaStoreItem != null) {
            C21691a c21691a2 = this.f64351h0;
            if ((c21691a2 == null || c21691a2.m89141i0() != mediaStoreItem.m40597k0()) && (c21691a = this.f64351h0) != null) {
                MediaStoreItem mediaStoreItem2 = this.f64355l0;
                if (mediaStoreItem2 != null) {
                    z12 = mediaStoreItem2.m40597k0();
                } else {
                    z12 = false;
                }
                c21691a.m111904i1(z12, z11);
            }
        }
    }

    @Override // vc0.InterfaceC27968g
    /* renamed from: F */
    public void mo69522F() {
        boolean z11;
        C21691a c21691a = this.f64351h0;
        if (c21691a != null) {
            MediaStoreItem mediaStoreItem = this.f64355l0;
            if (mediaStoreItem != null) {
                z11 = mediaStoreItem.m40597k0();
            } else {
                z11 = false;
            }
            c21691a.mo89091D0(z11);
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: G */
    public void mo61268G(int i11, MessageId messageId) {
        MediaStoreItem mediaStoreItem = this.f64355l0;
        if (mediaStoreItem != null && mediaStoreItem.m40604o0(messageId)) {
            mediaStoreItem.m40589f(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:            if (p348mi.AbstractC23309i.m121415Sc() <= java.lang.System.currentTimeMillis()) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:            if (p348mi.AbstractC23309i.m121415Sc() <= java.lang.System.currentTimeMillis()) goto L25;     */
    @Override // dj.C17945a0.x
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo61269H(MessageId messageId, boolean z11) {
        MediaStoreItem mediaStoreItem = this.f64355l0;
        if (mediaStoreItem == null) {
            return;
        }
        boolean z12 = true;
        try {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                if (z11) {
                    if (AbstractC23309i.m122525w0() == 1) {
                    }
                }
            }
            if (!mediaStoreItem.m40604o0(messageId)) {
                return;
            }
            mediaStoreItem.m40610t0(true);
            if (z11) {
                if (AbstractC23309i.m122525w0() == 1) {
                }
            }
            z12 = false;
            mediaStoreItem.m40589f(false);
            C2526d.f10270a.m12690N(mediaStoreItem, z12, false, false);
        } finally {
            if (!z11 || AbstractC23309i.m122525w0() != 1 || AbstractC23309i.m121415Sc() > System.currentTimeMillis()) {
                z12 = false;
            }
            mediaStoreItem.m40589f(false);
            C2526d.f10270a.m12690N(mediaStoreItem, z12, false, false);
        }
    }

    @Override // vc0.InterfaceC27968g
    /* renamed from: J */
    public Rect mo69523J(int i11) {
        Rect rectView = getRectView();
        if (rectView == null) {
            return new Rect();
        }
        return rectView;
    }

    @Override // vc0.InterfaceC27968g
    public List<InterfaceC27965d> getDragItems() {
        List<InterfaceC27965d> m131506n;
        m131506n = AbstractC25368s.m131506n(this.f64355l0);
        return m131506n;
    }

    @Override // vc0.InterfaceC27968g
    public int getDragPosition() {
        return this.f64356m0;
    }

    @Override // dj.C17945a0.x
    /* renamed from: m */
    public void mo61273m(int i11, MessageId messageId) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        MediaStoreItem mediaStoreItem;
        super.onDetachedFromWindow();
        C3521p0.c cVar = this.f64348e0;
        if (cVar != null && (mediaStoreItem = this.f64355l0) != null) {
            mediaStoreItem.m40606p0(cVar);
        }
    }

    @Override // w50.C28770b.a
    /* renamed from: p */
    public void mo61097p(C17945a0 c17945a0, boolean z11) {
        C17945a0 c17945a02;
        MediaStoreItem mediaStoreItem = this.f64355l0;
        if (mediaStoreItem != null) {
            c17945a02 = mediaStoreItem.m40599m();
        } else {
            c17945a02 = null;
        }
        if (c17945a0 == c17945a02 && z11) {
            if (c17945a0 != null) {
                c17945a0.m95045W9(this.f64360q0);
            }
            MediaStoreItem mediaStoreItem2 = this.f64355l0;
            if (mediaStoreItem2 != null) {
                this.f64359p0 = AbstractC31111g.m151138s(mediaStoreItem2);
                m69506k0(mediaStoreItem2);
            }
        }
    }

    /* renamed from: p0 */
    public final void m69524p0(Context context) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(context, "context");
        setId(AbstractC6918a0.file_tab_item);
        mo44090O();
        this.f64350g0 = new C23528a(context);
        this.f64345b0 = new C3977j(context);
        this.f64357n0 = AbstractC23136l9.m118728m0(context, this.f64358o0);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89060k0(-1).m89030N(-2).m89044a0(this.f64331K);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f64347d0 = c16716d;
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89060k0(this.f64332L).m89030N(-1);
        this.f64337Q = c16716d2;
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89030N(this.f64334N).m89060k0(this.f64333M).m89025I(true);
        c21693c.m111929z1(5);
        c21693c.mo111927x1(AbstractC23136l9.m118742r(6.0f));
        this.f64338R = c21693c;
        C16716d c16716d3 = this.f64337Q;
        C16716d c16716d4 = null;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d3 = null;
        }
        C21693c c21693c2 = this.f64338R;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("thumbImage");
            c21693c2 = null;
        }
        c16716d3.m89001g1(c21693c2);
        C16716d c16716d5 = new C16716d(context);
        c16716d5.m89106L().m89060k0(this.f64336P).m89030N(this.f64336P).m89025I(true);
        c16716d5.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
        c16716d5.mo44614b1(8);
        this.f64339S = c16716d5;
        C17014k0 c17014k0 = new C17014k0(context, AbstractC2814h.ProgressBar_Size24_Blue);
        c17014k0.m89106L().m89060k0(-2).m89030N(-2).m89025I(true);
        c17014k0.m91065j1(false);
        c17014k0.m91067l1(true);
        this.f64340T = c17014k0;
        C16716d c16716d6 = this.f64339S;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("loadingProgressContainer");
            c16716d6 = null;
        }
        C17014k0 c17014k02 = this.f64340T;
        if (c17014k02 == null) {
            AbstractC19074t.m100223u("thumbLoadingProgress");
            c17014k02 = null;
        }
        c16716d6.m89001g1(c17014k02);
        C16716d c16716d7 = this.f64337Q;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d7 = null;
        }
        C16716d c16716d8 = this.f64339S;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("loadingProgressContainer");
            c16716d8 = null;
        }
        c16716d7.m89001g1(c16716d8);
        C16716d c16716d9 = this.f64347d0;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d9 = null;
        }
        C16716d c16716d10 = this.f64337Q;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d10 = null;
        }
        c16716d9.m89001g1(c16716d10);
        this.f64357n0 -= this.f64332L;
        if (this.f64354k0) {
            Drawable mDrawableNormal = getMDrawableNormal();
            if (mDrawableNormal != null) {
                i11 = mDrawableNormal.getIntrinsicWidth();
            } else {
                i11 = AbstractC23222t7.f112514B;
            }
            Drawable mDrawableNormal2 = getMDrawableNormal();
            if (mDrawableNormal2 != null) {
                i12 = mDrawableNormal2.getIntrinsicHeight();
            } else {
                i12 = AbstractC23222t7.f112514B;
            }
            Size size = new Size(i11, i12);
            C21691a c21691a = new C21691a(context);
            c21691a.m89106L().m89060k0(size.getWidth() + (this.f64335O * 2)).m89030N(size.getHeight() + (this.f64335O * 2)).m89041Y(this.f64335O).m89027K(true).m89017A(Boolean.TRUE);
            c21691a.m111906k1(getMDrawableNormal());
            c21691a.m111905j1(getMDrawableChecked());
            c21691a.mo89093E0(false);
            this.f64351h0 = c21691a;
            C16716d c16716d11 = this.f64347d0;
            if (c16716d11 == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d11 = null;
            }
            c16716d11.m89001g1(c21691a);
        } else {
            Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_more_horizontal_solid_24, AbstractC2807a.icon_01);
            C21693c c21693c3 = new C21693c(context);
            c21693c3.m89106L().m89030N(-2).m89060k0(-2).m89041Y(this.f64335O).m89027K(true).m89017A(Boolean.TRUE);
            c21693c3.m111929z1(5);
            c21693c3.mo111925v1(m139660c);
            this.f64344a0 = c21693c3;
            C16716d c16716d12 = this.f64347d0;
            if (c16716d12 == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d12 = null;
            }
            c16716d12.m89001g1(c21693c3);
        }
        this.f64357n0 -= AbstractC23222t7.f112522F + AbstractC23222t7.f112594x;
        C16716d c16716d13 = new C16716d(context);
        C16718f m89027K = c16716d13.m89106L().m89030N(-2).m89060k0(-2).m89027K(true);
        C16716d c16716d14 = this.f64337Q;
        if (c16716d14 == null) {
            AbstractC19074t.m100223u("thumbContainer");
            c16716d14 = null;
        }
        m89027K.m89054h0(c16716d14).m89049e0(this.f64344a0);
        if (this.f64354k0) {
            c16716d13.m89106L().m89049e0(this.f64351h0);
        }
        C21740h c21740h = new C21740h(context);
        c21740h.m89106L().m89060k0(-1).m89030N(-2);
        c21740h.m111953A1(1);
        c21740h.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        c21740h.setMaxScaledTextSize(AbstractC23222t7.f112514B);
        c21740h.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        this.f64341U = c21740h;
        c16716d13.m89001g1(c21740h);
        C21739g c21739g = new C21739g(context);
        C16718f m89036T = c21739g.m89106L().m89060k0(-2).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C21740h c21740h2 = this.f64341U;
        if (c21740h2 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c21740h2 = null;
        }
        m89036T.m89023G(c21740h2);
        c21739g.f105572M0.m111953A1(1);
        C21740h c21740h3 = c21739g.f105572M0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c21740h3.m111980v1(truncateAt);
        c21739g.f105572M0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c21739g.f105572M0.setMaxScaledTextSize(AbstractC23222t7.f112594x);
        c21739g.f105572M0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f64342V = c21739g;
        c16716d13.m89001g1(c21739g);
        C21739g c21739g2 = new C21739g(context);
        C16718f m89036T2 = c21739g2.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C21739g c21739g3 = this.f64342V;
        if (c21739g3 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c21739g3 = null;
        }
        m89036T2.m89023G(c21739g3);
        c21739g2.f105572M0.m111953A1(1);
        c21739g2.f105572M0.m111980v1(truncateAt);
        c21739g2.f105572M0.m111962J1(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
        c21739g2.f105572M0.setMaxScaledTextSize(AbstractC23222t7.f112586t);
        c21739g2.f105572M0.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f64343W = c21739g2;
        c16716d13.m89001g1(c21739g2);
        C16716d c16716d15 = this.f64347d0;
        if (c16716d15 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d15 = null;
        }
        c16716d15.m89001g1(c16716d13);
        C16716d c16716d16 = this.f64347d0;
        if (c16716d16 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d16 = null;
        }
        mo69681L(c16716d16);
        C16719g c16719g = new C16719g(context);
        C16718f m89034R = c16719g.m89106L().m89030N(1).m89060k0(-1).m89034R(AbstractC23222t7.f112561g0);
        C16716d c16716d17 = this.f64347d0;
        if (c16716d17 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
        } else {
            c16716d4 = c16716d17;
        }
        m89034R.m89023G(c16716d4);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64346c0 = c16719g;
        mo69681L(c16719g);
    }

    /* renamed from: r0 */
    public final void m69525r0(C7905c c7905c, int i11, C3521p0.c cVar) {
        MediaStoreItem mediaStoreItem;
        try {
            this.f64356m0 = i11;
            if (c7905c != null) {
                mediaStoreItem = c7905c.m40788g();
            } else {
                mediaStoreItem = null;
            }
            this.f64355l0 = mediaStoreItem;
            this.f64348e0 = cVar;
            if (mediaStoreItem == null) {
                m69508m0();
                return;
            }
            EnumC31105a m151138s = AbstractC31111g.m151138s(mediaStoreItem);
            this.f64359p0 = m151138s;
            if (m151138s != EnumC31105a.f143331r && m151138s != EnumC31105a.f143329p) {
                mediaStoreItem.m40599m().m94997R9(this);
                this.f64360q0.m143917j(mediaStoreItem.m40599m().m94930K3());
                m69507l0(mediaStoreItem.m40599m());
                mediaStoreItem.m40599m().m94884F1();
                m69506k0(mediaStoreItem);
                m69512s0(mediaStoreItem, i11);
            }
            mediaStoreItem.m40599m().m94859Bb(this);
            mediaStoreItem.m40587e(this.f64348e0);
            this.f64360q0.m143917j(mediaStoreItem.m40599m().m94930K3());
            m69507l0(mediaStoreItem.m40599m());
            mediaStoreItem.m40599m().m94884F1();
            m69506k0(mediaStoreItem);
            m69512s0(mediaStoreItem, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: s */
    public void mo61274s(MessageId messageId, String str, boolean z11) {
        boolean z12;
        MediaStoreItem mediaStoreItem = this.f64355l0;
        if (mediaStoreItem == null || !mediaStoreItem.m40604o0(messageId)) {
            return;
        }
        mediaStoreItem.m40610t0(false);
        mediaStoreItem.m40589f(true);
        if (z11 && AbstractC23309i.m122525w0() == 1 && AbstractC23309i.m121415Sc() <= System.currentTimeMillis()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            String m94983Q3 = mediaStoreItem.m40599m().m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            mediaStoreItem.m40590g(m94983Q3);
        }
        C2526d.f10270a.m12690N(mediaStoreItem, z12, false, true);
    }

    public final void setEnableMultiSelect(boolean z11) {
        if (this.f64354k0 != z11) {
            this.f64354k0 = z11;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m69524p0(context);
            m69491C0(this, false, 1, null);
        }
    }

    public final void setFileListener(InterfaceC12362a interfaceC12362a) {
        this.f64349f0 = interfaceC12362a;
    }

    public final void setPaddingTopLayoutLinkFile(int i11) {
        C16716d c16716d = this.f64347d0;
        if (c16716d == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d = null;
        }
        c16716d.m89106L().m89042Z(0, i11, 0, AbstractC23136l9.m118742r(12.0f));
    }

    public final void setVisibilityCline(boolean z11) {
        int i11;
        C16719g c16719g = this.f64346c0;
        if (c16719g == null) {
            AbstractC19074t.m100223u("cline");
            c16719g = null;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c16719g.mo44614b1(i11);
    }

    public /* synthetic */ MediaStoreItemFileModuleView(Context context, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
        this(context, z11, (i11 & 4) != 0 ? false : z12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemFileModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f64331K = AbstractC23136l9.m118742r(12.0f);
        this.f64332L = AbstractC23136l9.m118742r(72.0f);
        this.f64333M = AbstractC23136l9.m118742r(60.0f);
        this.f64334N = AbstractC23136l9.m118742r(60.0f);
        this.f64335O = AbstractC23136l9.m118742r(16.0f);
        this.f64336P = AbstractC23222t7.f112534M;
        m129210a = AbstractC24856m.m129210a(new C12367f());
        this.f64352i0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12366e());
        this.f64353j0 = m129210a2;
        this.f64359p0 = EnumC31105a.f143330q;
        this.f64360q0 = new C28770b();
        this.f64361r0 = new HashMap();
        m69524p0(context);
    }
}
