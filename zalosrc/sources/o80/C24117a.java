package o80;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.zdesign.component.C16982h1;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p667y2.C30268e;
import pm0.C24848g0;

/* renamed from: o80.a */
/* loaded from: classes6.dex */
public class C24117a extends C16716d {

    /* renamed from: M0 */
    private a f116523M0;

    /* renamed from: N0 */
    private final C24119c f116524N0;

    /* renamed from: O0 */
    private final C16982h1 f116525O0;

    /* renamed from: P0 */
    private final Rect f116526P0;

    /* renamed from: Q0 */
    private final GestureDetector.SimpleOnGestureListener f116527Q0;

    /* renamed from: R0 */
    private final GestureDetector f116528R0;

    /* renamed from: o80.a$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        int mo49347a();

        /* renamed from: b */
        boolean mo49348b(boolean z11);

        /* renamed from: c */
        void mo49349c(float f11, float f12, int i11, int i12, InterfaceC18494a interfaceC18494a);

        /* renamed from: d */
        boolean mo49350d();

        /* renamed from: e */
        boolean mo49351e();

        void onDoubleTap(MotionEvent motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o80.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Rect f116530r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Rect rect) {
            super(0);
            this.f116530r = rect;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m126024a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m126024a() {
            a m126020q1;
            a m126020q12 = C24117a.this.m126020q1();
            if (m126020q12 != null && m126020q12.mo49350d() && (m126020q1 = C24117a.this.m126020q1()) != null && m126020q1.mo49347a() == 0) {
                C24117a.this.m126019x1(true, this.f116530r);
                a m126020q13 = C24117a.this.m126020q1();
                if (m126020q13 != null) {
                    m126020q13.mo49348b(true);
                }
            }
        }
    }

    /* renamed from: o80.a$c */
    /* loaded from: classes6.dex */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, "event");
            a m126020q1 = C24117a.this.m126020q1();
            if (m126020q1 != null) {
                m126020q1.onDoubleTap(motionEvent);
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, "event");
            a m126020q1 = C24117a.this.m126020q1();
            if (m126020q1 != null && m126020q1.mo49350d()) {
                C24117a.this.m126018u1(motionEvent);
                C24117a.this.m126021r1().mo89153u0();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24117a(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f116525O0 = new C16982h1(context);
        C24119c c24119c = new C24119c(context);
        c24119c.m89106L().m89028L(-1, -1);
        m89001g1(c24119c);
        this.f116524N0 = c24119c;
        this.f116526P0 = new Rect();
        c cVar = new c();
        this.f116527Q0 = cVar;
        this.f116528R0 = new GestureDetector(context, cVar);
    }

    /* renamed from: s1 */
    private final int m126016s1() {
        return this.f84746F - this.f84744D;
    }

    /* renamed from: t1 */
    private final int m126017t1() {
        return this.f84745E - this.f84743C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m126018u1(MotionEvent motionEvent) {
        a aVar = this.f116523M0;
        if (aVar != null && aVar.mo49351e()) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f11 = 50;
            Rect rect = new Rect((int) (x11 - f11), (int) (y11 - f11), (int) (x11 + f11), (int) (y11 + f11));
            float rawX = motionEvent.getRawX() - (m126017t1() / 2.0f);
            float rawY = motionEvent.getRawY() - (m126016s1() / 2.0f);
            a aVar2 = this.f116523M0;
            if (aVar2 != null) {
                aVar2.mo49349c(rawX, rawY, m126017t1(), m126016s1(), new b(rect));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m126019x1(boolean z11, Rect rect) {
        this.f116524N0.m126028j1(z11, rect);
    }

    /* renamed from: q1 */
    public final a m126020q1() {
        return this.f116523M0;
    }

    /* renamed from: r1 */
    public final C16982h1 m126021r1() {
        return this.f116525O0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: s */
    public void mo44179s(Canvas canvas) {
        super.mo44179s(canvas);
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    public boolean mo65871t0(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
        this.f116528R0.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: v1 */
    public final void m126022v1() {
        m126019x1(false, this.f116526P0);
    }

    /* renamed from: w1 */
    public final void m126023w1(a aVar) {
        this.f116523M0 = aVar;
    }
}
