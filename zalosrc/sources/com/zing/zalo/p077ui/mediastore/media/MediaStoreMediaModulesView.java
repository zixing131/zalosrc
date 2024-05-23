package com.zing.zalo.p077ui.mediastore.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.MotionEvent;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import b40.C2535j;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.media.MediaStoreMediaModulesView;
import com.zing.zalo.p077ui.widget.DumpChatImageView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import i40.InterfaceC20272b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22122a0;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p396ol.C24302e;
import p716zh.C32175x6;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import ui0.C27280g;
import vc0.InterfaceC27965d;
import vc0.InterfaceC27968g;
import x70.C29428k0;
import zl0.AbstractC32232i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MediaStoreMediaModulesView extends ModulesView implements InterfaceC20272b, InterfaceC27968g {

    /* renamed from: K */
    private C7905c f64406K;

    /* renamed from: L */
    private final List f64407L;

    /* renamed from: M */
    private int f64408M;

    /* renamed from: N */
    private int f64409N;

    /* renamed from: O */
    private final C23528a f64410O;

    /* renamed from: P */
    private InterfaceC12379b f64411P;

    /* renamed from: Q */
    private final Map f64412Q;

    /* renamed from: R */
    private int f64413R;

    /* renamed from: S */
    private Drawable f64414S;

    /* renamed from: T */
    private Drawable f64415T;

    /* renamed from: U */
    private int f64416U;

    /* renamed from: V */
    private boolean f64417V;

    /* renamed from: W */
    private boolean f64418W;

    /* renamed from: a0 */
    private int f64419a0;

    /* renamed from: b0 */
    private boolean f64420b0;

    /* renamed from: c0 */
    private boolean f64421c0;

    /* renamed from: com.zing.zalo.ui.mediastore.media.MediaStoreMediaModulesView$a */
    /* loaded from: classes6.dex */
    public static final class C12378a {

        /* renamed from: a */
        private int f64422a;

        /* renamed from: b */
        private MediaStoreItem f64423b;

        /* renamed from: c */
        private C16716d f64424c;

        /* renamed from: d */
        private C22122a0 f64425d;

        /* renamed from: e */
        private DumpChatImageView f64426e;

        /* renamed from: f */
        private C21693c f64427f;

        /* renamed from: g */
        private C21691a f64428g;

        /* renamed from: h */
        private C21693c f64429h;

        /* renamed from: i */
        private C16716d f64430i;

        /* renamed from: j */
        private C21693c f64431j;

        /* renamed from: k */
        private Rect f64432k;

        /* renamed from: l */
        private boolean f64433l;

        /* renamed from: m */
        private C29428k0 f64434m;

        /* renamed from: a */
        public final C21691a m69587a() {
            return this.f64428g;
        }

        /* renamed from: b */
        public final DumpChatImageView m69588b() {
            return this.f64426e;
        }

        /* renamed from: c */
        public final Rect m69589c() {
            return this.f64432k;
        }

        /* renamed from: d */
        public final C16716d m69590d() {
            return this.f64424c;
        }

        /* renamed from: e */
        public final MediaStoreItem m69591e() {
            return this.f64423b;
        }

        /* renamed from: f */
        public final C21693c m69592f() {
            return this.f64431j;
        }

        /* renamed from: g */
        public final C21693c m69593g() {
            return this.f64427f;
        }

        /* renamed from: h */
        public final C29428k0 m69594h() {
            return this.f64434m;
        }

        /* renamed from: i */
        public final C16716d m69595i() {
            return this.f64430i;
        }

        /* renamed from: j */
        public final C22122a0 m69596j() {
            return this.f64425d;
        }

        /* renamed from: k */
        public final C21693c m69597k() {
            return this.f64429h;
        }

        /* renamed from: l */
        public final void m69598l(C21691a c21691a) {
            this.f64428g = c21691a;
        }

        /* renamed from: m */
        public final void m69599m(DumpChatImageView dumpChatImageView) {
            this.f64426e = dumpChatImageView;
        }

        /* renamed from: n */
        public final void m69600n(int i11) {
            this.f64422a = i11;
        }

        /* renamed from: o */
        public final void m69601o(Rect rect) {
            this.f64432k = rect;
        }

        /* renamed from: p */
        public final void m69602p(C16716d c16716d) {
            this.f64424c = c16716d;
        }

        /* renamed from: q */
        public final void m69603q(MediaStoreItem mediaStoreItem) {
            this.f64423b = mediaStoreItem;
        }

        /* renamed from: r */
        public final void m69604r(boolean z11) {
            this.f64433l = z11;
        }

        /* renamed from: s */
        public final void m69605s(C21693c c21693c) {
            this.f64431j = c21693c;
        }

        /* renamed from: t */
        public final void m69606t(C21693c c21693c) {
            this.f64427f = c21693c;
        }

        /* renamed from: u */
        public final void m69607u(C29428k0 c29428k0) {
            this.f64434m = c29428k0;
        }

        /* renamed from: v */
        public final void m69608v(C16716d c16716d) {
            this.f64430i = c16716d;
        }

        /* renamed from: w */
        public final void m69609w(C22122a0 c22122a0) {
            this.f64425d = c22122a0;
        }

        /* renamed from: x */
        public final void m69610x(C21693c c21693c) {
            this.f64429h = c21693c;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.media.MediaStoreMediaModulesView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12379b {
        /* renamed from: a */
        void mo36873a(MediaStoreItem mediaStoreItem, boolean z11, int i11);

        /* renamed from: b */
        void mo36874b(MediaStoreItem mediaStoreItem, int i11);

        /* renamed from: c */
        void mo36875c(AnimationTarget animationTarget, MediaStoreItem mediaStoreItem, C16719g c16719g, int i11);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.media.MediaStoreMediaModulesView$c */
    /* loaded from: classes6.dex */
    public static final class C12380c extends C16716d {

        /* renamed from: M0 */
        private Paint f64435M0;

        /* renamed from: O0 */
        final /* synthetic */ C12378a f64437O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12380c(C12378a c12378a, Context context) {
            super(context);
            this.f64437O0 = c12378a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.uidrawing.C16719g
        /* renamed from: o0 */
        public void mo44775o0(Canvas canvas) {
            float f11;
            float f12;
            AbstractC19074t.m100208f(canvas, "canvas");
            super.mo44775o0(canvas);
            if (MediaStoreMediaModulesView.this.getEnableDrawBorderItem()) {
                if (this.f64435M0 == null) {
                    Paint paint = new Paint();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.border_gray_pic));
                    paint.setStrokeWidth(AbstractC23136l9.m118742r(1.0f));
                    this.f64435M0 = paint;
                }
                Paint paint2 = this.f64435M0;
                if (paint2 != null) {
                    C12378a c12378a = this.f64437O0;
                    Rect m69589c = c12378a.m69589c();
                    if (m69589c != null) {
                        f11 = m69589c.width();
                    } else {
                        f11 = 0.0f;
                    }
                    Rect m69589c2 = c12378a.m69589c();
                    if (m69589c2 != null) {
                        f12 = m69589c2.height();
                    } else {
                        f12 = 0.0f;
                    }
                    canvas.drawRect(0.0f, 0.0f, f11, f12, paint2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.media.MediaStoreMediaModulesView$d */
    /* loaded from: classes6.dex */
    public static final class C12381d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f64438q;

        /* renamed from: r */
        final /* synthetic */ MediaStoreMediaModulesView f64439r;

        /* renamed from: s */
        final /* synthetic */ C12378a f64440s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12381d(C17945a0 c17945a0, MediaStoreMediaModulesView mediaStoreMediaModulesView, C12378a c12378a) {
            super(0);
            this.f64438q = c17945a0;
            this.f64439r = mediaStoreMediaModulesView;
            this.f64440s = c12378a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m69611a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m69611a() {
            if (this.f64438q.m94849A8()) {
                this.f64439r.m69572b0(this.f64440s);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.media.MediaStoreMediaModulesView$e */
    /* loaded from: classes6.dex */
    public static final class C12382e implements C29428k0.h {

        /* renamed from: a */
        final /* synthetic */ MediaStoreItem f64441a;

        /* renamed from: b */
        final /* synthetic */ C12378a f64442b;

        /* renamed from: c */
        final /* synthetic */ MediaStoreMediaModulesView f64443c;

        C12382e(MediaStoreItem mediaStoreItem, C12378a c12378a, MediaStoreMediaModulesView mediaStoreMediaModulesView) {
            this.f64441a = mediaStoreItem;
            this.f64442b = c12378a;
            this.f64443c = mediaStoreMediaModulesView;
        }

        @Override // x70.C29428k0.h
        /* renamed from: a */
        public void mo65107a(C29428k0.a aVar, C32175x6 c32175x6) {
            AbstractC19074t.m100208f(aVar, "photoEntity");
            AbstractC19074t.m100208f(c32175x6, "photoItem");
        }

        @Override // x70.C29428k0.h
        /* renamed from: b */
        public void mo65108b(C29428k0.a aVar, C32175x6 c32175x6) {
            MediaStoreItem m69591e;
            AbstractC19074t.m100208f(aVar, "photoEntity");
            if (AbstractC19074t.m100204b(this.f64441a, this.f64442b.m69591e()) && (m69591e = this.f64442b.m69591e()) != null) {
                this.f64443c.m69582o0(m69591e, this.f64442b, m69591e.m40596j0());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.media.MediaStoreMediaModulesView$f */
    /* loaded from: classes6.dex */
    public static final class C12383f extends SimpleAnimationTarget {

        /* renamed from: q */
        final /* synthetic */ C16719g f64445q;

        C12383f(C16719g c16719g) {
            this.f64445q = c16719g;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            int[] iArr = new int[2];
            MediaStoreMediaModulesView.this.getLocationOnScreen(iArr);
            int m89096G = iArr[0] + this.f64445q.m89096G();
            int m89098H = iArr[1] + this.f64445q.m89098H();
            return new Rect(m89096G, m89098H, this.f64445q.m89114P() + m89096G, this.f64445q.m89112O() + m89098H);
        }
    }

    public MediaStoreMediaModulesView(Context context, int i11) {
        super(context);
        this.f64407L = new ArrayList();
        this.f64410O = new C23528a(context);
        this.f64412Q = new HashMap();
        this.f64413R = AbstractC23222t7.f112572m;
        this.f64417V = true;
        this.f64419a0 = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m69572b0(C12378a c12378a) {
        C16716d m69590d;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_cloud_slash_solid_24, AbstractC2807a.icon_04);
        if (c12378a.m69592f() == null) {
            C21693c c21693c = new C21693c(getContext());
            c21693c.mo111925v1(m139660c);
            c21693c.m89085A0(AbstractC23136l9.m118663M(AbstractC16803z.bg_out_cloud_icon));
            c21693c.m89106L().m89060k0(AbstractC23136l9.m118742r(20.0f)).m89030N(AbstractC23136l9.m118742r(20.0f)).m89034R(AbstractC23222t7.f112554d).m89033Q(AbstractC23222t7.f112554d).m89072y(Boolean.TRUE).m89041Y(AbstractC23222t7.f112552c);
            c12378a.m69605s(c21693c);
        }
        C21693c m69592f = c12378a.m69592f();
        if (m69592f != null && (m69590d = c12378a.m69590d()) != null) {
            m69590d.m89001g1(m69592f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final boolean m69573d0(int i11, int i12, C12378a c12378a, MediaStoreMediaModulesView mediaStoreMediaModulesView, MediaStoreItem mediaStoreItem, C16719g c16719g, MotionEvent motionEvent) {
        int m116584g;
        int m116584g2;
        MessageId messageId;
        MediaStoreItem m69591e;
        InterfaceC12379b interfaceC12379b;
        InterfaceC12379b interfaceC12379b2;
        AbstractC19074t.m100208f(c12378a, "$itemHolder");
        AbstractC19074t.m100208f(mediaStoreMediaModulesView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$item");
        if (motionEvent.getAction() == 1) {
            m116584g = AbstractC22543l.m116584g(i11 / 2, AbstractC23136l9.m118742r(60.0f));
            m116584g2 = AbstractC22543l.m116584g(i12 / 2, AbstractC23136l9.m118742r(60.0f));
            if (motionEvent.getX() > m116584g && motionEvent.getY() < m116584g2) {
                MediaStoreItem m69591e2 = c12378a.m69591e();
                if (m69591e2 != null && (interfaceC12379b2 = mediaStoreMediaModulesView.f64411P) != null) {
                    interfaceC12379b2.mo36873a(m69591e2, !m69591e2.m40597k0(), mediaStoreMediaModulesView.f64416U);
                    return false;
                }
                return false;
            }
            if (mediaStoreMediaModulesView.f64418W) {
                MediaStoreItem m69591e3 = c12378a.m69591e();
                if (m69591e3 != null) {
                    messageId = m69591e3.m40571M();
                } else {
                    messageId = null;
                }
                if (AbstractC19074t.m100204b(messageId, mediaStoreItem.m40571M()) && (m69591e = c12378a.m69591e()) != null && (interfaceC12379b = mediaStoreMediaModulesView.f64411P) != null) {
                    interfaceC12379b.mo36873a(m69591e, !m69591e.m40597k0(), mediaStoreMediaModulesView.f64416U);
                    return false;
                }
                return false;
            }
            AbstractC19074t.m100205c(c16719g);
            mediaStoreMediaModulesView.m69581m0(c16719g, mediaStoreItem);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m69574e0(MediaStoreMediaModulesView mediaStoreMediaModulesView, C12378a c12378a, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        InterfaceC12379b interfaceC12379b;
        AbstractC19074t.m100208f(mediaStoreMediaModulesView, "this$0");
        AbstractC19074t.m100208f(c12378a, "$itemHolder");
        AbstractC19074t.m100208f(mediaStoreItem, "$item");
        if (mediaStoreMediaModulesView.f64418W) {
            MediaStoreItem m69591e = c12378a.m69591e();
            if (m69591e != null && AbstractC19074t.m100204b(m69591e.m40571M(), mediaStoreItem.m40571M()) && (interfaceC12379b = mediaStoreMediaModulesView.f64411P) != null) {
                interfaceC12379b.mo36873a(m69591e, !m69591e.m40597k0(), mediaStoreMediaModulesView.f64416U);
                return;
            }
            return;
        }
        AbstractC19074t.m100205c(c16719g);
        mediaStoreMediaModulesView.m69581m0(c16719g, mediaStoreItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m69575f0(MediaStoreMediaModulesView mediaStoreMediaModulesView, MediaStoreItem mediaStoreItem, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreMediaModulesView, "this$0");
        AbstractC19074t.m100208f(mediaStoreItem, "$item");
        InterfaceC12379b interfaceC12379b = mediaStoreMediaModulesView.f64411P;
        if (interfaceC12379b != null) {
            interfaceC12379b.mo36874b(mediaStoreItem, mediaStoreMediaModulesView.f64416U);
        }
    }

    /* renamed from: g0 */
    private final void m69576g0(C17945a0 c17945a0, C12378a c12378a) {
        AbstractC3489d.m17517y(c17945a0, new C12381d(c17945a0, this, c12378a));
    }

    /* renamed from: i0 */
    private final void m69577i0() {
        Iterator it = this.f64407L.iterator();
        while (it.hasNext()) {
            C29428k0 m69594h = ((C12378a) it.next()).m69594h();
            if (m69594h != null) {
                m69594h.m146629u();
            }
        }
    }

    /* renamed from: j0 */
    private final void m69578j0(C12378a c12378a) {
        MediaStoreItem m69591e;
        C22122a0 m69596j;
        DumpChatImageView m69588b;
        C29428k0.a gVar;
        if (c12378a.m69594h() != null || (m69591e = c12378a.m69591e()) == null || (m69596j = c12378a.m69596j()) == null || (m69588b = c12378a.m69588b()) == null) {
            return;
        }
        if (C24302e.Companion.m126923n()) {
            gVar = new C29428k0.i(m69591e.m40599m());
        } else {
            gVar = new C29428k0.g(m69591e);
        }
        C29428k0.a aVar = gVar;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C29428k0 c29428k0 = new C29428k0(1, context, this.f64410O, m69596j, m69588b, aVar);
        c29428k0.m146628d0(this.f64419a0);
        c29428k0.m146627c0(new C12382e(m69591e, c12378a, this));
        c12378a.m69607u(c29428k0);
    }

    /* renamed from: k0 */
    private final boolean m69579k0(MediaStoreItem mediaStoreItem, MediaStoreItem mediaStoreItem2) {
        return !AbstractC19074t.m100204b(mediaStoreItem.m40571M(), mediaStoreItem2.m40571M());
    }

    /* renamed from: l0 */
    private final void m69580l0(C12378a c12378a) {
        C29428k0.a gVar;
        MediaStoreItem m69591e = c12378a.m69591e();
        if (m69591e == null) {
            return;
        }
        m69591e.m40599m().m94884F1();
        if (m69591e.m40596j0()) {
            m69582o0(m69591e, c12378a, true);
            return;
        }
        m69582o0(m69591e, c12378a, false);
        C29428k0 m69594h = c12378a.m69594h();
        if (m69594h != null) {
            m69594h.m146625a0(this.f64421c0);
            if (C24302e.Companion.m126923n()) {
                gVar = new C29428k0.i(m69591e.m40599m());
            } else {
                gVar = new C29428k0.g(m69591e);
            }
            m69594h.m146626b0(gVar);
            m69594h.m146623O();
        }
    }

    /* renamed from: m0 */
    private final void m69581m0(C16719g c16719g, MediaStoreItem mediaStoreItem) {
        try {
            if (this.f64411P != null) {
                C12383f c12383f = new C12383f(c16719g);
                InterfaceC12379b interfaceC12379b = this.f64411P;
                if (interfaceC12379b != null) {
                    interfaceC12379b.mo36875c(c12383f, mediaStoreItem, c16719g, this.f64416U);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public final void m69582o0(MediaStoreItem mediaStoreItem, C12378a c12378a, boolean z11) {
        C21693c m69592f;
        if (z11) {
            C16716d c16716d = new C16716d(getContext());
            c16716d.m89087B0(AbstractC16803z.chat_icloud_default);
            c16716d.m89106L().m89060k0(-1).m89030N(-1).m89041Y(AbstractC23222t7.f112566j).m89029M(15);
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89060k0(-2).m89030N(-2).m89026J(true);
            c21693c.m111929z1(4);
            if (mediaStoreItem.m40602n0()) {
                c21693c.mo111926w1(AbstractC16803z.ic_rolled_video);
            } else {
                c21693c.mo111926w1(AbstractC16803z.ic_rolled_photo);
            }
            c16716d.m89001g1(c21693c);
            c12378a.m69608v(c16716d);
            C16716d m69595i = c12378a.m69595i();
            if (m69595i != null) {
                C16716d m69590d = c12378a.m69590d();
                if (m69590d != null) {
                    m69590d.m89001g1(m69595i);
                }
                m69595i.mo44614b1(0);
            }
            C21693c m69597k = c12378a.m69597k();
            if (m69597k != null) {
                m69597k.mo44614b1(8);
            }
            C21693c m69592f2 = c12378a.m69592f();
            if (m69592f2 != null) {
                m69592f2.mo44614b1(8);
            }
        } else {
            C16716d m69595i2 = c12378a.m69595i();
            if (m69595i2 != null) {
                m69595i2.mo44614b1(8);
            }
            C21693c m69597k2 = c12378a.m69597k();
            if (m69597k2 != null) {
                m69597k2.mo44614b1(0);
            }
            if (mediaStoreItem.m40599m().m94849A8() && (m69592f = c12378a.m69592f()) != null) {
                m69592f.mo44614b1(0);
            }
        }
        C2535j.f10308a.m12774r("chat_storedmedia", mediaStoreItem, z11);
    }

    @Override // vc0.InterfaceC27968g
    /* renamed from: F */
    public void mo69522F() {
        int m116584g;
        MediaStoreItem m69591e;
        boolean z11;
        int i11;
        List m40789h;
        C7905c c7905c = this.f64406K;
        if (c7905c == null || (m40789h = c7905c.m40789h()) == null) {
            m116584g = AbstractC22543l.m116584g(0, this.f64407L.size());
        } else {
            m116584g = m40789h.size();
        }
        for (int i12 = 0; i12 < m116584g; i12++) {
            C21691a m69587a = ((C12378a) this.f64407L.get(i12)).m69587a();
            if (m69587a != null && ((m69591e = ((C12378a) this.f64407L.get(i12)).m69591e()) == null || m69587a.m89141i0() != m69591e.m40597k0())) {
                MediaStoreItem m69591e2 = ((C12378a) this.f64407L.get(i12)).m69591e();
                if (m69591e2 != null) {
                    z11 = m69591e2.m40597k0();
                } else {
                    z11 = false;
                }
                m69587a.mo89091D0(z11);
                C21693c m69593g = ((C12378a) this.f64407L.get(i12)).m69593g();
                if (m69593g != null) {
                    if (m69587a.m89141i0()) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    m69593g.mo44614b1(i11);
                }
            }
        }
    }

    @Override // vc0.InterfaceC27968g
    /* renamed from: J */
    public Rect mo69523J(int i11) {
        return mo43986q(i11);
    }

    /* renamed from: c0 */
    public final void m69583c0(C7905c c7905c, int i11, boolean z11, boolean z12) {
        List m40789h;
        int i12;
        C29428k0 c29428k0;
        int i13;
        int i14;
        int i15;
        C16718f m89060k0;
        C16718f m89106L;
        C16718f m89060k02;
        C16718f m89030N;
        C16718f m89036T;
        C29428k0 c29428k02 = null;
        if (c7905c != null) {
            try {
                m40789h = c7905c.m40789h();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        } else {
            m40789h = null;
        }
        if (m40789h == null) {
            return;
        }
        this.f64416U = i11;
        setId(AbstractC6918a0.photo_tab_item);
        C19067n0 c19067n0 = C19067n0.f94947a;
        boolean z13 = false;
        String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f64416U)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        setTag(format);
        this.f64412Q.clear();
        mo44090O();
        int size = c7905c.m40789h().size();
        while (this.f64407L.size() < size) {
            this.f64407L.add(new C12378a());
        }
        while (this.f64407L.size() > size) {
            List list = this.f64407L;
            list.remove(list.size() - 1);
        }
        if (this.f64408M == 0) {
            this.f64408M = AbstractC23136l9.m118728m0(getContext(), z11);
        }
        float f11 = (this.f64408M * 1.0f) / 320;
        this.f64409N = (int) (c7905c.m40787f() * f11);
        setLayoutParams(new RecyclerView.LayoutParams(this.f64408M, this.f64409N));
        if (!c7905c.m40789h().isEmpty()) {
            int i16 = 0;
            while (i16 < size) {
                final MediaStoreItem mediaStoreItem = (MediaStoreItem) c7905c.m40789h().get(i16);
                final C12378a c12378a = (C12378a) this.f64407L.get(i16);
                c12378a.m69604r(z13);
                MediaStoreItem m69591e = c12378a.m69591e();
                c12378a.m69600n(i16);
                c12378a.m69603q(mediaStoreItem);
                final int m40567H = (int) ((mediaStoreItem.m40567H() - mediaStoreItem.m40566F()) * f11);
                final int m40561C = (int) ((mediaStoreItem.m40561C() - mediaStoreItem.m40568I()) * f11);
                int m40566F = (int) (mediaStoreItem.m40566F() * f11);
                int m40568I = (int) (mediaStoreItem.m40568I() * f11);
                if (c12378a.m69589c() == null) {
                    c12378a.m69601o(new Rect());
                }
                Rect m69589c = c12378a.m69589c();
                if (m69589c != null) {
                    m69589c.set(m40566F, m40568I, m40566F + m40567H, m40568I + m40561C);
                }
                this.f64412Q.put(Integer.valueOf(i16), c12378a.m69589c());
                if (c12378a.m69588b() == null) {
                    c12378a.m69599m(new DumpChatImageView(getContext()));
                }
                if (c12378a.m69590d() == null) {
                    c12378a.m69602p(new C12380c(c12378a, getContext()));
                }
                C16716d m69590d = c12378a.m69590d();
                if (m69590d != null) {
                    m69590d.m89003j1();
                }
                C16716d m69590d2 = c12378a.m69590d();
                if (m69590d2 != null) {
                    m69590d2.mo89109M0(new C16719g.c() { // from class: c80.a
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            MediaStoreMediaModulesView.m69574e0(MediaStoreMediaModulesView.this, c12378a, mediaStoreItem, c16719g);
                        }
                    });
                }
                C16716d m69590d3 = c12378a.m69590d();
                if (m69590d3 != null) {
                    m69590d3.m89111N0(new C16719g.d() { // from class: c80.b
                        @Override // com.zing.zalo.uidrawing.C16719g.d
                        /* renamed from: f */
                        public final void mo942f(C16719g c16719g) {
                            MediaStoreMediaModulesView.m69575f0(MediaStoreMediaModulesView.this, mediaStoreItem, c16719g);
                        }
                    });
                }
                C16716d m69590d4 = c12378a.m69590d();
                if (m69590d4 != null) {
                    mo69681L(m69590d4);
                }
                C16716d m69590d5 = c12378a.m69590d();
                if (m69590d5 != null && (m89106L = m69590d5.m89106L()) != null && (m89060k02 = m89106L.m89060k0(m40567H)) != null && (m89030N = m89060k02.m89030N(m40561C)) != null && (m89036T = m89030N.m89036T(m40568I)) != null) {
                    m89036T.m89034R(m40566F);
                }
                if (c12378a.m69596j() == null) {
                    c12378a.m69609w(new C22122a0(getContext()));
                    C22122a0 m69596j = c12378a.m69596j();
                    if (m69596j != null) {
                        m69596j.m111929z1(5);
                    }
                }
                C22122a0 m69596j2 = c12378a.m69596j();
                if (m69596j2 != null) {
                    C16718f m89106L2 = m69596j2.m89106L();
                    if (m89106L2 != null && (m89060k0 = m89106L2.m89060k0(-1)) != null) {
                        m89060k0.m89030N(-1);
                    }
                    C16716d m69590d6 = c12378a.m69590d();
                    if (m69590d6 != null) {
                        m69590d6.m89001g1(m69596j2);
                    }
                }
                if (m69591e == null || m69579k0(mediaStoreItem, m69591e)) {
                    C29428k0 m69594h = c12378a.m69594h();
                    if (m69594h != null) {
                        m69594h.m146630z();
                    }
                    c12378a.m69607u(c29428k02);
                }
                if (c12378a.m69594h() == null) {
                    m69578j0(c12378a);
                }
                if (mediaStoreItem.m40599m().m94849A8()) {
                    m69572b0(c12378a);
                }
                this.f64418W = z12;
                if (z12) {
                    if (this.f64414S == null) {
                        this.f64414S = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
                    }
                    if (this.f64415T == null) {
                        this.f64415T = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.btn_radio_on_holo_light);
                    }
                    if (c12378a.m69593g() == null) {
                        c12378a.m69606t(new C21693c(getContext()));
                    }
                    C21693c m69593g = c12378a.m69593g();
                    if (m69593g != null) {
                        m69593g.m89106L().m89060k0(m40567H).m89030N(m40561C).m89036T(m40568I).m89034R(m40566F);
                        m69593g.m89087B0(AbstractC16801x.black_30);
                        if (mediaStoreItem.m40597k0()) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        m69593g.mo44614b1(i15);
                        mo69681L(m69593g);
                    }
                    Drawable drawable = this.f64414S;
                    if (drawable != null) {
                        i13 = drawable.getIntrinsicWidth();
                    } else {
                        i13 = AbstractC23222t7.f112514B;
                    }
                    Drawable drawable2 = this.f64414S;
                    if (drawable2 != null) {
                        i14 = drawable2.getIntrinsicHeight();
                    } else {
                        i14 = AbstractC23222t7.f112514B;
                    }
                    Size size2 = new Size(i13, i14);
                    if (c12378a.m69587a() == null) {
                        c12378a.m69598l(new C21691a(getContext()));
                    }
                    C21691a m69587a = c12378a.m69587a();
                    if (m69587a != null) {
                        m69587a.m111906k1(this.f64414S);
                        m69587a.m111905j1(this.f64415T);
                        m69587a.m89106L().m89060k0(size2.getWidth() + (this.f64413R * 2)).m89030N(size2.getHeight() + (this.f64413R * 2)).m89041Y(this.f64413R).m89036T(m40568I).m89034R(((m40566F + m40567H) - (this.f64413R * 2)) - size2.getWidth());
                        m69587a.mo89091D0(mediaStoreItem.m40597k0());
                        c12378a.m69604r(false);
                        m69587a.m89129Y0(c12378a.m69590d());
                        m69587a.mo89093E0(false);
                    }
                    C21691a m69587a2 = c12378a.m69587a();
                    if (m69587a2 != null) {
                        mo69681L(m69587a2);
                    }
                    C16716d m69590d7 = c12378a.m69590d();
                    if (m69590d7 == null) {
                        i12 = m40568I;
                    } else {
                        i12 = m40568I;
                        m69590d7.m89113O0(new C16719g.e() { // from class: c80.c
                            @Override // com.zing.zalo.uidrawing.C16719g.e
                            /* renamed from: a */
                            public final boolean mo16937a(C16719g c16719g, MotionEvent motionEvent) {
                                boolean m69573d0;
                                m69573d0 = MediaStoreMediaModulesView.m69573d0(m40567H, m40561C, c12378a, this, mediaStoreItem, c16719g, motionEvent);
                                return m69573d0;
                            }
                        });
                    }
                    C16716d m69590d8 = c12378a.m69590d();
                    if (m69590d8 != null) {
                        c29428k0 = null;
                        m69590d8.mo89109M0(null);
                    } else {
                        c29428k0 = null;
                    }
                } else {
                    i12 = m40568I;
                    c29428k0 = c29428k02;
                }
                if (mediaStoreItem.m40598l0()) {
                    Drawable m6964f = AbstractC1388a.m6964f(getContext(), AbstractC16803z.icon_video);
                    if (c12378a.m69597k() == null && m6964f != null) {
                        C21693c c21693c = new C21693c(getContext());
                        c21693c.mo111925v1(m6964f);
                        c21693c.m89106L().m89060k0(m6964f.getIntrinsicWidth()).m89030N(m6964f.getIntrinsicHeight());
                        c12378a.m69610x(c21693c);
                    }
                    C21693c m69597k = c12378a.m69597k();
                    if (m69597k != null) {
                        m69597k.m89106L().m89034R(m40566F + AbstractC32232i.m155453a(3.0f)).m89036T(i12 + AbstractC32232i.m155453a(3.0f));
                        mo69681L(m69597k);
                    }
                }
                i16++;
                c29428k02 = c29428k0;
                z13 = false;
            }
        }
    }

    @Override // vc0.InterfaceC27968g
    public List<InterfaceC27965d> getDragItems() {
        List<InterfaceC27965d> m131502j;
        List<InterfaceC27965d> m40789h;
        C7905c c7905c = this.f64406K;
        if (c7905c == null || (m40789h = c7905c.m40789h()) == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return m40789h;
    }

    @Override // vc0.InterfaceC27968g
    public int getDragPosition() {
        return this.f64416U;
    }

    public final boolean getEnableDrawBorderItem() {
        return this.f64417V;
    }

    public final C7905c getMData() {
        return this.f64406K;
    }

    public final int getMHeight() {
        return this.f64409N;
    }

    public final boolean getMIsScrolling() {
        return this.f64420b0;
    }

    public final int getMWidth() {
        return this.f64408M;
    }

    /* renamed from: h0 */
    public final void m69584h0(C7905c c7905c, boolean z11) {
        int m116584g;
        if (c7905c == null) {
            return;
        }
        try {
            this.f64406K = c7905c;
            this.f64420b0 = z11;
            m116584g = AbstractC22543l.m116584g(c7905c.m40789h().size(), this.f64407L.size());
            for (int i11 = 0; i11 < m116584g; i11++) {
                C12378a c12378a = (C12378a) this.f64407L.get(i11);
                C17945a0 m40599m = ((MediaStoreItem) c7905c.m40789h().get(i11)).m40599m();
                m69580l0(c12378a);
                m69576g0(m40599m, c12378a);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n0 */
    public final void m69585n0() {
        int i11;
        List m40789h;
        try {
            C7905c c7905c = this.f64406K;
            if (c7905c != null) {
                if (c7905c != null && (m40789h = c7905c.m40789h()) != null) {
                    i11 = AbstractC22543l.m116584g(m40789h.size(), this.f64407L.size());
                } else {
                    i11 = 0;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    C12378a c12378a = (C12378a) this.f64407L.get(i12);
                    C29428k0 m69594h = c12378a.m69594h();
                    if (m69594h != null) {
                        m69594h.m146630z();
                    }
                    c12378a.m69607u(null);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m69577i0();
    }

    /* renamed from: p0 */
    public final void m69586p0(MediaStoreItem mediaStoreItem, boolean z11) {
        int m116584g;
        List m40789h;
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        C7905c c7905c = this.f64406K;
        int i11 = 0;
        if (c7905c == null || (m40789h = c7905c.m40789h()) == null) {
            m116584g = AbstractC22543l.m116584g(0, this.f64407L.size());
        } else {
            m116584g = m40789h.size();
        }
        for (int i12 = 0; i12 < m116584g; i12++) {
            MediaStoreItem m69591e = ((C12378a) this.f64407L.get(i12)).m69591e();
            if (m69591e != null && m69591e.m40604o0(mediaStoreItem.m40571M())) {
                C21691a m69587a = ((C12378a) this.f64407L.get(i12)).m69587a();
                if (m69587a != null && m69587a.m89141i0() != mediaStoreItem.m40597k0()) {
                    m69587a.m111904i1(mediaStoreItem.m40597k0(), z11);
                    C21693c m69593g = ((C12378a) this.f64407L.get(i12)).m69593g();
                    if (m69593g != null) {
                        if (!m69587a.m89141i0()) {
                            i11 = 8;
                        }
                        m69593g.mo44614b1(i11);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        try {
            Rect rect = (Rect) this.f64412Q.get(Integer.valueOf(i11));
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
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    public final void setEnableDrawBorderItem(boolean z11) {
        this.f64417V = z11;
    }

    public final void setEnableDrawItemBorder(boolean z11) {
        this.f64417V = z11;
    }

    public final void setHarassing(boolean z11) {
        this.f64421c0 = z11;
    }

    public final void setMData(C7905c c7905c) {
        this.f64406K = c7905c;
    }

    public final void setMHeight(int i11) {
        this.f64409N = i11;
    }

    public final void setMIsScrolling(boolean z11) {
        this.f64420b0 = z11;
    }

    public final void setMWidth(int i11) {
        this.f64408M = i11;
    }

    public final void setModuleViewItemListener(InterfaceC12379b interfaceC12379b) {
        this.f64411P = interfaceC12379b;
    }
}
