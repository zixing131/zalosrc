package qk0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.utils.C17206r;
import com.zing.zalo.zinstant.zom.meta.ImpressionMeta;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.model.DataDrawing;
import com.zing.zalo.zinstant.zom.model.TransformDrawing;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransition;
import com.zing.zalo.zinstant.zom.properties.ZOMTransitionElement;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ll0.C22518f;
import ln0.AbstractC22543l;
import nk0.C23855s0;
import nk0.InterfaceC23806a;
import pk0.InterfaceC24803b;
import pk0.InterfaceC24808g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qk0.AbstractC25310f;
import rk0.C25818d;
import rk0.InterfaceC25816b;
import tk0.C26730b;

/* renamed from: qk0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC25310f implements InterfaceC23806a, InterfaceC25307c {

    /* renamed from: a */
    private final C23855s0 f121363a;

    /* renamed from: b */
    private final a f121364b;

    /* renamed from: c */
    private final ZOM f121365c;

    /* renamed from: d */
    private int f121366d;

    /* renamed from: e */
    private final Rect f121367e;

    /* renamed from: f */
    private C25818d f121368f;

    /* renamed from: g */
    private final InterfaceC24854k f121369g;

    /* renamed from: h */
    private final DataDrawing f121370h;

    /* renamed from: i */
    private final InterfaceC24854k f121371i;

    /* renamed from: qk0.f$a */
    /* loaded from: classes7.dex */
    public enum a {
        ZinstantNode,
        ZINSComponent
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qk0.f$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        /* renamed from: c */
        public static final boolean m131034c(AbstractC25310f abstractC25310f, Message message) {
            AbstractC19074t.m100208f(abstractC25310f, "this$0");
            AbstractC19074t.m100208f(message, "msg");
            abstractC25310f.mo124499P(message);
            return true;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final Handler mo12V4() {
            return new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: qk0.g
                public /* synthetic */ C25311g() {
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean m131034c;
                    m131034c = AbstractC25310f.b.m131034c(AbstractC25310f.this, message);
                    return m131034c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qk0.f$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: qk0.f$c$a */
        /* loaded from: classes7.dex */
        public static final class a implements InterfaceC25816b {

            /* renamed from: a */
            final /* synthetic */ AbstractC25310f f121377a;

            a(AbstractC25310f abstractC25310f) {
                this.f121377a = abstractC25310f;
            }

            /* renamed from: l */
            public static final void m131041l(ZOMTransition zOMTransition, ZOMTransitionElement zOMTransitionElement) {
                AbstractC19074t.m100208f(zOMTransitionElement, "$transition");
                zOMTransition.onAnimationCancel(zOMTransitionElement.mProperty);
            }

            /* renamed from: m */
            public static final void m131042m(ZOMTransition zOMTransition, ZOMTransitionElement zOMTransitionElement) {
                AbstractC19074t.m100208f(zOMTransitionElement, "$transition");
                zOMTransition.onAnimationEnd(zOMTransitionElement.mProperty);
            }

            /* renamed from: n */
            public static final void m131043n(ZOMTransition zOMTransition, ZOMTransitionElement zOMTransitionElement) {
                AbstractC19074t.m100208f(zOMTransitionElement, "$transition");
                zOMTransition.onAnimationRun(zOMTransitionElement.mProperty);
            }

            /* renamed from: o */
            public static final void m131044o(ZOMTransition zOMTransition, ZOMTransitionElement zOMTransitionElement) {
                AbstractC19074t.m100208f(zOMTransitionElement, "$transition");
                zOMTransition.onAnimationStart(zOMTransitionElement.mProperty);
            }

            @Override // rk0.InterfaceC25816b
            /* renamed from: a */
            public void mo131045a(ZOMTransitionElement zOMTransitionElement, int i11) {
                AbstractC19074t.m100208f(zOMTransitionElement, "transition");
                ZOMTransition zOMTransition = this.f121377a.m131007J().mTransition;
                if (zOMTransition != null && zOMTransition.key == i11 && zOMTransition.mHasOnCancelListener) {
                    this.f121377a.m131000E().m124639c0(new Runnable() { // from class: qk0.k

                        /* renamed from: q */
                        public final /* synthetic */ ZOMTransitionElement f121386q;

                        public /* synthetic */ RunnableC25315k(ZOMTransitionElement zOMTransitionElement2) {
                            r2 = zOMTransitionElement2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC25310f.c.a.m131041l(ZOMTransition.this, r2);
                        }
                    });
                }
            }

            @Override // rk0.InterfaceC25816b
            /* renamed from: b */
            public void mo131046b(float f11, int i11) {
                this.f121377a.m130993o0(f11);
                this.f121377a.m131013W();
            }

            @Override // rk0.InterfaceC25816b
            /* renamed from: c */
            public void mo131047c(float f11, int i11) {
                this.f121377a.m130987f0(f11);
                this.f121377a.m131013W();
            }

            @Override // rk0.InterfaceC25816b
            /* renamed from: d */
            public void mo131048d(ZOMTransitionElement zOMTransitionElement, int i11) {
                AbstractC19074t.m100208f(zOMTransitionElement, "transition");
                ZOMTransition zOMTransition = this.f121377a.m131007J().mTransition;
                if (zOMTransition != null && zOMTransition.key == i11 && zOMTransition.mHasOnStartListener) {
                    this.f121377a.m131000E().m124639c0(new Runnable() { // from class: qk0.h

                        /* renamed from: q */
                        public final /* synthetic */ ZOMTransitionElement f121380q;

                        public /* synthetic */ RunnableC25312h(ZOMTransitionElement zOMTransitionElement2) {
                            r2 = zOMTransitionElement2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC25310f.c.a.m131044o(ZOMTransition.this, r2);
                        }
                    });
                }
            }

            @Override // rk0.InterfaceC25816b
            /* renamed from: e */
            public void mo131049e(float f11, int i11) {
                this.f121377a.m130995z0(f11);
                this.f121377a.m131013W();
            }

            @Override // rk0.InterfaceC25816b
            /* renamed from: f */
            public void mo131050f(ZOMTransitionElement zOMTransitionElement, int i11) {
                AbstractC19074t.m100208f(zOMTransitionElement, "transition");
                ZOMTransition zOMTransition = this.f121377a.m131007J().mTransition;
                if (zOMTransition != null && zOMTransition.key == i11 && zOMTransition.mHasOnRunListener) {
                    this.f121377a.m131000E().m124639c0(new Runnable() { // from class: qk0.j

                        /* renamed from: q */
                        public final /* synthetic */ ZOMTransitionElement f121384q;

                        public /* synthetic */ RunnableC25314j(ZOMTransitionElement zOMTransitionElement2) {
                            r2 = zOMTransitionElement2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC25310f.c.a.m131043n(ZOMTransition.this, r2);
                        }
                    });
                }
            }

            @Override // rk0.InterfaceC25816b
            /* renamed from: g */
            public void mo131051g(ZOMTransitionElement zOMTransitionElement, int i11) {
                AbstractC19074t.m100208f(zOMTransitionElement, "transition");
                ZOMTransition zOMTransition = this.f121377a.m131007J().mTransition;
                if (zOMTransition != null && zOMTransition.key == i11 && zOMTransition.mHasOnEndListener) {
                    this.f121377a.m131000E().m124639c0(new Runnable() { // from class: qk0.i

                        /* renamed from: q */
                        public final /* synthetic */ ZOMTransitionElement f121382q;

                        public /* synthetic */ RunnableC25313i(ZOMTransitionElement zOMTransitionElement2) {
                            r2 = zOMTransitionElement2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC25310f.c.a.m131042m(ZOMTransition.this, r2);
                        }
                    });
                }
            }
        }

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(AbstractC25310f.this);
        }
    }

    public AbstractC25310f(C23855s0 c23855s0, a aVar, ZOM zom) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c23855s0, "root");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(zom, "element");
        this.f121363a = c23855s0;
        this.f121364b = aVar;
        this.f121365c = zom;
        this.f121367e = new Rect();
        m129210a = AbstractC24856m.m129210a(new c());
        this.f121369g = m129210a;
        this.f121370h = new DataDrawing();
        m130984V();
        m129210a2 = AbstractC24856m.m129210a(new b());
        this.f121371i = m129210a2;
    }

    /* renamed from: A */
    private final Handler m130965A() {
        return (Handler) this.f121371i.getValue();
    }

    /* renamed from: A0 */
    private final void m130966A0() {
        if (m130992m(5)) {
            return;
        }
        m130995z0(1.0f);
    }

    /* renamed from: B0 */
    private final void m130967B0() {
        if (m131015Y()) {
            mo124496D0();
        } else {
            mo124500P0();
        }
        m130998C0();
        mo124669q0();
    }

    /* renamed from: F */
    private final c.a m130968F() {
        return (c.a) this.f121369g.getValue();
    }

    /* renamed from: H */
    private final Rect m130969H() {
        return this.f121363a.f115185i.mo128875e();
    }

    /* renamed from: H0 */
    private final void m130970H0() {
        mo124517u0();
    }

    /* renamed from: J0 */
    private final void m130971J0() {
        this.f121366d = m131007J().mVisibility;
        ZOMRect zOMRect = m131007J().mBound;
        this.f121367e.set(zOMRect.left, zOMRect.top, zOMRect.right, zOMRect.bottom);
        mo124443v0();
    }

    /* renamed from: K */
    private final void m130972K(int i11) {
        if ((i11 & 4) != 0) {
            m130977O();
            m130974M();
            m130975N();
            m130973L();
            return;
        }
        if ((i11 & 8) != 0) {
            m130975N();
        }
    }

    /* renamed from: L */
    private final void m130973L() {
        ZOMBackground zOMBackground = m131007J().mBackground;
        if (zOMBackground != null && this.f121370h.setNewBackgroundColor(zOMBackground.mColor)) {
            m130988g0();
        }
    }

    /* renamed from: M */
    private final void m130974M() {
        if (this.f121370h.setNewOpacity(m131007J().mOpacity)) {
            m130994p0();
        }
    }

    /* renamed from: N */
    private final void m130975N() {
        ZOMTransform zOMTransform = m131007J().mTransform;
        if (zOMTransform != null && zOMTransform.getAndResetDirty()) {
            float curTransformFraction = this.f121370h.getCurTransformFraction();
            this.f121370h.setNewTransform(zOMTransform);
            zOMTransform.updateBoundOrigin(m131007J().mBound);
            this.f121370h.setTransformOriginIfNeeded(zOMTransform.valueOriginX, zOMTransform.valueOriginY);
            if (zOMTransform.isNewTransform) {
                m130966A0();
            } else {
                this.f121370h.setTransformFraction(curTransformFraction);
            }
        }
    }

    /* renamed from: N0 */
    private final void m130976N0() {
        mo124500P0();
        m131011O0();
        mo124670w0();
    }

    /* renamed from: O */
    private final void m130977O() {
        if (m131007J().mTransition != null && this.f121368f == null) {
            this.f121368f = new C25818d(m130968F());
        }
    }

    /* renamed from: Q */
    private final void m130978Q() {
        this.f121366d = m131007J().mVisibility;
        ZOMRect zOMRect = m131007J().mBound;
        this.f121367e.set(zOMRect.left, zOMRect.top, zOMRect.right, zOMRect.bottom);
        if (m131007J().mTransition != null) {
            this.f121368f = new C25818d(m130968F());
        }
        m130981S();
    }

    /* renamed from: R */
    private final void m130979R() {
        ZOMBackground zOMBackground = m131007J().mBackground;
        if (zOMBackground == null) {
            return;
        }
        this.f121370h.setNewBackgroundColor(zOMBackground.mColor);
        this.f121370h.setBackgroundColorFraction(1.0f);
    }

    /* renamed from: R0 */
    private final void m130980R0() {
        if (m131014X()) {
            m130967B0();
        } else {
            m130976N0();
        }
    }

    /* renamed from: S */
    private final void m130981S() {
        m130982T();
        m130983U();
        m130979R();
    }

    /* renamed from: T */
    private final void m130982T() {
        this.f121370h.setNewOpacity(m131007J().mOpacity);
        this.f121370h.setOpacityFraction(1.0f);
    }

    /* renamed from: U */
    private final void m130983U() {
        ZOMTransform zOMTransform = m131007J().mTransform;
        if (zOMTransform != null) {
            this.f121370h.setNewTransform(zOMTransform);
            this.f121370h.setTransformFraction(1.0f);
            zOMTransform.updateBoundOrigin(m131007J().mBound);
            this.f121370h.setTransformOriginIfNeeded(zOMTransform.valueOriginX, zOMTransform.valueOriginY);
            zOMTransform.getAndResetDirty();
        }
    }

    /* renamed from: V */
    private final void m130984V() {
        m130978Q();
        mo124512m0();
    }

    /* renamed from: a0 */
    public static /* synthetic */ boolean m130985a0(AbstractC25310f abstractC25310f, float f11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                f11 = 0.0f;
            }
            return abstractC25310f.m131016Z(f11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isVisibleOnScreen");
    }

    /* renamed from: b0 */
    private final boolean m130986b0() {
        return this.f121370h.hasTransform();
    }

    /* renamed from: f0 */
    public final void m130987f0(float f11) {
        if (this.f121370h.setBackgroundColorFraction(f11)) {
            mo124508e0();
        }
    }

    /* renamed from: g0 */
    private final void m130988g0() {
        if (m130992m(4)) {
            return;
        }
        m130987f0(1.0f);
    }

    /* renamed from: m */
    private final boolean m130992m(int i11) {
        C25818d c25818d = this.f121368f;
        if (c25818d == null) {
            return false;
        }
        c25818d.m133121g(i11);
        ZOMTransition zOMTransition = m131007J().mTransition;
        if (zOMTransition == null) {
            return false;
        }
        AbstractC19074t.m100207e(zOMTransition, "getZOM().mTransition ?: return false");
        ZOMTransitionElement zOMTransitionElement = zOMTransition.get(i11);
        if (zOMTransitionElement == null) {
            return false;
        }
        AbstractC19074t.m100207e(zOMTransitionElement, "zomTransition.get(property) ?: return false");
        c25818d.m133120e(i11, zOMTransitionElement, zOMTransition.key);
        return true;
    }

    /* renamed from: o0 */
    public final void m130993o0(float f11) {
        if (this.f121370h.setOpacityFraction(f11)) {
            mo124436n0();
        }
    }

    /* renamed from: p0 */
    private final void m130994p0() {
        if (m130992m(3)) {
            return;
        }
        m130993o0(1.0f);
    }

    /* renamed from: z0 */
    public final void m130995z0(float f11) {
        if (this.f121370h.setTransformFraction(f11)) {
            mo124595y0();
        }
    }

    /* renamed from: B */
    public final float m130996B() {
        return this.f121370h.getOpacity();
    }

    /* renamed from: C */
    public final C26730b m130997C() {
        return this.f121363a.mo124398f();
    }

    /* renamed from: C0 */
    protected void m130998C0() {
        C25818d c25818d = this.f121368f;
        if (c25818d != null) {
            c25818d.m133122k();
        }
    }

    /* renamed from: D */
    public final InterfaceC24803b m130999D() {
        return this.f121363a.f115185i.m128877h();
    }

    /* renamed from: D0 */
    public void mo124496D0() {
    }

    /* renamed from: E */
    public final C23855s0 m131000E() {
        return this.f121363a;
    }

    /* renamed from: E0 */
    public final void m131001E0() {
        m130976N0();
        mo124514t0();
    }

    /* renamed from: F0 */
    public final void m131002F0() {
        m131031z().requestLayout();
    }

    /* renamed from: G */
    public final a m131003G() {
        return this.f121364b;
    }

    /* renamed from: G0 */
    public final void m131004G0(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "nativeTask");
        this.f121363a.m124639c0(runnable);
    }

    /* renamed from: I */
    public final int m131005I() {
        return this.f121367e.width();
    }

    /* renamed from: I0 */
    public final void m131006I0(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "uiTask");
        if (AbstractC19444a.m101693a()) {
            runnable.run();
        } else {
            m130965A().post(runnable);
        }
    }

    /* renamed from: J */
    public final ZOM m131007J() {
        return this.f121365c;
    }

    /* renamed from: K0 */
    public final void m131008K0(Message message, boolean z11, long j11) {
        AbstractC19074t.m100208f(message, "msg");
        if (z11 && m130965A().hasMessages(message.what)) {
            m130965A().removeMessages(message.what);
        }
        m130965A().sendMessageDelayed(message, j11);
    }

    /* renamed from: L0 */
    public void m131009L0(float f11) {
        if (this.f121370h.setOpacityOuter(f11)) {
            mo124436n0();
        }
    }

    /* renamed from: M0 */
    public void m131010M0(TransformDrawing transformDrawing) {
        if (this.f121370h.setTransformOuter(transformDrawing)) {
            mo124595y0();
        }
    }

    /* renamed from: O0 */
    protected void m131011O0() {
        C25818d c25818d = this.f121368f;
        if (c25818d != null) {
            c25818d.m133123l();
        }
    }

    /* renamed from: P */
    public void mo124499P(Message message) {
        AbstractC19074t.m100208f(message, "msg");
    }

    /* renamed from: P0 */
    public void mo124500P0() {
    }

    /* renamed from: Q0 */
    public final void m131012Q0() {
        if (this.f121363a.m124628I()) {
            onStart();
            return;
        }
        if (this.f121363a.m124625F()) {
            onStart();
            onResume();
        } else if (this.f121363a.m124624E()) {
            onPause();
        } else if (this.f121363a.m124630K()) {
            onPause();
            onStop();
        }
    }

    /* renamed from: S0 */
    public abstract void mo124501S0();

    /* renamed from: W */
    public final void m131013W() {
        m131031z().invalidate();
    }

    /* renamed from: X */
    public final boolean m131014X() {
        return this.f121363a.m124629J();
    }

    /* renamed from: Y */
    public boolean m131015Y() {
        return this.f121366d == 0;
    }

    /* renamed from: Z */
    public boolean m131016Z(float f11) {
        int m116584g;
        int m116580c;
        int m116584g2;
        int m116580c2;
        if (!m131015Y()) {
            return false;
        }
        ZOMRect zOMRect = m131007J().mBound;
        AbstractC19074t.m100207e(zOMRect, "getZOM().mBound");
        int width = zOMRect.getWidth();
        int height = zOMRect.getHeight();
        if (width <= 0 || height <= 0 || zOMRect.left >= m130969H().right || m130969H().left >= zOMRect.right || zOMRect.top >= m130969H().bottom || m130969H().top >= zOMRect.bottom) {
            return false;
        }
        if (!C17206r.f87764a.m91845c(f11)) {
            m116584g = AbstractC22543l.m116584g(zOMRect.right, m130969H().right);
            m116580c = AbstractC22543l.m116580c(zOMRect.left, m130969H().left);
            m116584g2 = AbstractC22543l.m116584g(zOMRect.bottom, m130969H().bottom);
            m116580c2 = AbstractC22543l.m116580c(zOMRect.top, m130969H().top);
            int i11 = m116584g2 - m116580c2;
            if (m116584g - m116580c < ((int) (width * f11)) || i11 < ((int) (height * f11))) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public void mo124409b() {
    }

    /* renamed from: c0 */
    public final Message m131017c0(int i11, Object obj) {
        Message obtainMessage = m130965A().obtainMessage(i11, obj);
        AbstractC19074t.m100207e(obtainMessage, "mHandlerUI.obtainMessage(what, obj)");
        return obtainMessage;
    }

    /* renamed from: d0 */
    public abstract void mo124507d0(Canvas canvas);

    /* renamed from: e0 */
    public void mo124508e0() {
    }

    @Override // qk0.InterfaceC25307c
    /* renamed from: f */
    public final void mo130962f(ZOM zom, int i11) {
        AbstractC19074t.m100208f(zom, "zom");
        mo124439r0(i11);
    }

    @Override // qk0.InterfaceC25307c
    /* renamed from: g */
    public final void mo124710g(ZOM zom, int i11) {
        AbstractC19074t.m100208f(zom, "zom");
        if ((i11 & 8) != 0) {
            m131018h0(m131007J());
            m131002F0();
        }
        if ((i11 & 4) != 0) {
            m131025s0(m131007J());
            m131013W();
        }
        m130972K(i11);
        mo124444x0(zom, i11);
        m130980R0();
    }

    /* renamed from: h0 */
    public final void m131018h0(ZOM zom) {
        AbstractC19074t.m100208f(zom, "zom");
        m130971J0();
    }

    /* renamed from: i0 */
    public void mo124509i0() {
    }

    /* renamed from: j0 */
    protected abstract void mo124435j0(Canvas canvas);

    /* renamed from: k0 */
    protected abstract void mo124510k0(Canvas canvas);

    /* renamed from: l0 */
    protected abstract void mo124511l0(Canvas canvas);

    /* renamed from: m0 */
    public void mo124512m0() {
    }

    /* renamed from: n */
    public final void m131019n() {
        if (!m130985a0(this, 0.0f, 1, null)) {
            return;
        }
        mo124509i0();
    }

    /* renamed from: n0 */
    public void mo124436n0() {
    }

    /* renamed from: o */
    public final void m131020o(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (mo124516u() != 2) {
            return;
        }
        boolean m130986b0 = m130986b0();
        if (m130986b0) {
            canvas.save();
            mo124507d0(canvas);
        }
        mo124510k0(canvas);
        mo124435j0(canvas);
        mo124511l0(canvas);
        if (m130986b0) {
            canvas.restore();
        }
    }

    @Override // nk0.InterfaceC23806a
    public void onPause() {
        m130980R0();
    }

    @Override // nk0.InterfaceC23806a
    public void onResume() {
        m130980R0();
    }

    @Override // nk0.InterfaceC23806a
    public void onStart() {
    }

    @Override // nk0.InterfaceC23806a
    public void onStop() {
    }

    /* renamed from: p */
    public final int m131021p() {
        return this.f121370h.getAlpha();
    }

    /* renamed from: q */
    public final int m131022q() {
        return this.f121370h.getBackgroundColor();
    }

    /* renamed from: q0 */
    public void mo124669q0() {
    }

    /* renamed from: r */
    public final Rect m131023r() {
        return this.f121367e;
    }

    /* renamed from: r0 */
    public void mo124439r0(int i11) {
    }

    /* renamed from: s */
    public final InterfaceC25305a m131024s() {
        return this.f121363a.f115185i.mo128873a();
    }

    /* renamed from: s0 */
    public final void m131025s0(ZOM zom) {
        AbstractC19074t.m100208f(zom, "zom");
        m130970H0();
    }

    /* renamed from: t */
    public final DataDrawing m131026t() {
        return this.f121370h;
    }

    /* renamed from: t0 */
    public void mo124514t0() {
    }

    /* renamed from: u */
    protected abstract int mo124516u();

    /* renamed from: u0 */
    public void mo124517u0() {
    }

    /* renamed from: v */
    public final int m131027v() {
        return this.f121367e.height();
    }

    /* renamed from: v0 */
    public void mo124443v0() {
    }

    /* renamed from: w */
    public final C22518f m131028w() {
        return this.f121363a.f115185i.mo128880c();
    }

    /* renamed from: w0 */
    public void mo124670w0() {
    }

    /* renamed from: x */
    public final ImpressionMeta m131029x() {
        return this.f121363a.mo124399g();
    }

    /* renamed from: x0 */
    public void mo124444x0(ZOM zom, int i11) {
        AbstractC19074t.m100208f(zom, "zom");
    }

    /* renamed from: y */
    public final InterfaceC17139d m131030y() {
        return this.f121363a.f115185i.mo128874b();
    }

    /* renamed from: y0 */
    public void mo124595y0() {
    }

    /* renamed from: z */
    public final InterfaceC24808g m131031z() {
        return this.f121363a.f115185i.m128876g();
    }
}
