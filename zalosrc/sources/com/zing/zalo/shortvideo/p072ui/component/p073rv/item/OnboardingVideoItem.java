package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.graphics.drawable.AbstractC1415b;
import c20.C3226p;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.List;
import pm0.C24848g0;
import q10.C25060v0;
import qm0.AbstractC25368s;
import s20.AbstractC26104f;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class OnboardingVideoItem extends FrameLayout {

    /* renamed from: p */
    private InterfaceC9649a f50873p;

    /* renamed from: q */
    private final int f50874q;

    /* renamed from: r */
    private final int f50875r;

    /* renamed from: s */
    private final int f50876s;

    /* renamed from: t */
    private C25060v0 f50877t;

    /* renamed from: u */
    private final int f50878u;

    /* renamed from: v */
    private MotionEvent f50879v;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.OnboardingVideoItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9649a {
        /* renamed from: a */
        void mo52333a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.OnboardingVideoItem$b */
    /* loaded from: classes5.dex */
    static final class C9650b extends AbstractC19075u implements InterfaceC18494a {
        C9650b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52334a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52334a() {
            InterfaceC9649a callback = OnboardingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52333a();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.OnboardingVideoItem$c */
    /* loaded from: classes5.dex */
    static final class C9651c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25060v0 f50882r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9651c(C25060v0 c25060v0) {
            super(1);
            this.f50882r = c25060v0;
        }

        /* renamed from: a */
        public final void m52335a(View view) {
            AbstractC19074t.m100208f(view, "it");
            C19205a.m100675M(C19205a.f95429a, AbstractC26112n.m134366G(OnboardingVideoItem.this, AbstractC27413h.zch_action_key_onboarding_topic_more, new Object[0]), null, 2, null);
            this.f50882r.f120349r.setExpanding(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52335a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50874q = AbstractC26112n.m134365F(this);
        this.f50875r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f50876s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f50878u = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public final void m52332a(BreakSlot breakSlot) {
        AbstractC19074t.m100208f(breakSlot, "onboarding");
        C25060v0 c25060v0 = this.f50877t;
        if (c25060v0 == null) {
            AbstractC19074t.m100223u("binding");
            c25060v0 = null;
        }
        c25060v0.f120349r.setExpanding(false);
        c25060v0.f120352u.setText(breakSlot.m50689j());
        OnboardingOptionLayout onboardingOptionLayout = c25060v0.f120350s;
        List m50685f = breakSlot.m50685f();
        if (m50685f == null) {
            m50685f = AbstractC25368s.m131502j();
        }
        onboardingOptionLayout.m52330b(m50685f, new C9650b());
        SimpleShadowTextView simpleShadowTextView = c25060v0.f120348q;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnExpand");
        AbstractC26112n.m134367H(simpleShadowTextView);
    }

    public final InterfaceC9649a getCallback() {
        return this.f50873p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25060v0 m129954a = C25060v0.m129954a(this);
        AbstractC19074t.m100207e(m129954a, "bind(...)");
        setBackground(new BitmapDrawable(getResources(), AbstractC1415b.m7218b(AbstractC26112n.m134434z(this, AbstractC27408c.zch_layer_radial_blue), 0, 0, null, 7, null)));
        SimpleShadowTextView simpleShadowTextView = m129954a.f120348q;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnExpand");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C9651c(m129954a));
        this.f50877t = m129954a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        AbstractC19074t.m100208f(motionEvent, "event");
        C25060v0 c25060v0 = this.f50877t;
        if (c25060v0 == null) {
            AbstractC19074t.m100223u("binding");
            c25060v0 = null;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && (motionEvent2 = this.f50879v) != null && motionEvent2 != null) {
                float abs = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs2 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                int i11 = this.f50878u;
                if (abs >= i11 && abs >= abs2) {
                    this.f50879v = null;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return true;
                }
                if (abs2 >= i11 && abs2 >= abs) {
                    this.f50879v = null;
                    if ((motionEvent.getY() > motionEvent2.getY() && c25060v0.f120351t.getScrollY() == 0) || (motionEvent.getY() < motionEvent2.getY() && c25060v0.f120351t.getScrollY() == c25060v0.f120349r.getHeight() - c25060v0.f120351t.getHeight())) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                }
            }
        } else if (c25060v0.f120351t.getHeight() < c25060v0.f120349r.getHeight() && c25060v0.f120351t.getTop() <= motionEvent.getY() && c25060v0.f120351t.getBottom() >= motionEvent.getY()) {
            this.f50879v = AbstractC26104f.m134330a(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            this.f50879v = null;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25060v0 c25060v0 = this.f50877t;
        if (c25060v0 == null) {
            AbstractC19074t.m100223u("binding");
            c25060v0 = null;
        }
        int i15 = this.f50875r;
        if (C3226p.Companion.m16363f()) {
            i15 += this.f50874q;
        }
        ScrollView scrollView = c25060v0.f120351t;
        AbstractC19074t.m100207e(scrollView, "scrOnboarding");
        AbstractC26112n.m134383X(scrollView, i15, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25060v0 c25060v0 = this.f50877t;
        if (c25060v0 == null) {
            AbstractC19074t.m100223u("binding");
            c25060v0 = null;
        }
        int i13 = size2 - this.f50875r;
        C3226p.a aVar = C3226p.Companion;
        if (aVar.m16363f()) {
            i13 -= this.f50874q;
        }
        if (aVar.m16362e()) {
            i13 -= this.f50876s;
        }
        ScrollView scrollView = c25060v0.f120351t;
        AbstractC19074t.m100207e(scrollView, "scrOnboarding");
        AbstractC26112n.m134387a0(scrollView, size, 1073741824, i13, 1073741824);
        setMeasuredDimension(size, size2);
    }

    public final void setCallback(InterfaceC9649a interfaceC9649a) {
        this.f50873p = interfaceC9649a;
    }
}
