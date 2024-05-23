package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.RecyclerView;
import b10.C2484c;
import b10.C2491j;
import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import s20.AbstractC26104f;
import s20.AbstractC26112n;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import y10.C30263f;
import z10.C31189w;

/* loaded from: classes5.dex */
public final class LivestreamCommentLayout extends FrameLayout {
    public static final C10687a Companion = new C10687a(null);

    /* renamed from: p */
    private final InterfaceC24854k f54100p;

    /* renamed from: q */
    private final InterfaceC24854k f54101q;

    /* renamed from: r */
    private final int f54102r;

    /* renamed from: s */
    private MotionEvent f54103s;

    /* renamed from: t */
    private C31189w f54104t;

    /* renamed from: u */
    private OverScrollableRecyclerView.LinearLayoutManager f54105u;

    /* renamed from: v */
    private Integer f54106v;

    /* renamed from: w */
    private boolean f54107w;

    /* renamed from: x */
    private boolean f54108x;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$a */
    /* loaded from: classes5.dex */
    public static final class C10687a {
        private C10687a() {
        }

        public /* synthetic */ C10687a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$b */
    /* loaded from: classes5.dex */
    static final class C10688b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ int f54110r;

        /* renamed from: s */
        final /* synthetic */ boolean f54111s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10688b(int i11, boolean z11) {
            super(1);
            this.f54110r = i11;
            this.f54111s = z11;
        }

        /* renamed from: a */
        public final void m55771a(int i11) {
            Integer m56027g;
            int intValue;
            m56027g = AbstractC10789p.m56027g(LivestreamCommentLayout.this.getLstComment());
            if (m56027g != null) {
                int intValue2 = m56027g.intValue();
                Integer num = LivestreamCommentLayout.this.f54106v;
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = intValue2 - num.intValue();
                }
                if (this.f54110r > 1 && intValue > 0) {
                    LivestreamCommentLayout.this.getTvNewCmtNum().setText(LivestreamCommentLayout.this.getTvNewCmtNum().getContext().getString(AbstractC27413h.zch_livestream_got_new_cmt));
                    AbstractC26112n.m134431w0(LivestreamCommentLayout.this.getTvNewCmtNum());
                } else {
                    AbstractC26112n.m134367H(LivestreamCommentLayout.this.getTvNewCmtNum());
                }
                if (this.f54111s) {
                    LivestreamCommentLayout.this.m55757v(0);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55771a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$c */
    /* loaded from: classes5.dex */
    static final class C10689c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Integer f54112q;

        /* renamed from: r */
        final /* synthetic */ float f54113r;

        /* renamed from: s */
        final /* synthetic */ Integer f54114s;

        /* renamed from: t */
        final /* synthetic */ LivestreamCommentLayout f54115t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10689c(Integer num, float f11, Integer num2, LivestreamCommentLayout livestreamCommentLayout) {
            super(0);
            this.f54112q = num;
            this.f54113r = f11;
            this.f54114s = num2;
            this.f54115t = livestreamCommentLayout;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55772a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55772a() {
            Integer num = this.f54112q;
            if (num != null && num.intValue() == 0) {
                if (this.f54113r > 80.0f || AbstractC19074t.m100204b(this.f54114s, this.f54112q)) {
                    this.f54115t.m55757v(0);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$d */
    /* loaded from: classes5.dex */
    static final class C10690d extends AbstractC19075u implements InterfaceC18505l {
        C10690d() {
            super(1);
        }

        /* renamed from: a */
        public final void m55773a(int i11) {
            LivestreamCommentLayout.this.m55757v(0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55773a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$e */
    /* loaded from: classes5.dex */
    static final class C10691e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Integer f54117q;

        /* renamed from: r */
        final /* synthetic */ float f54118r;

        /* renamed from: s */
        final /* synthetic */ Integer f54119s;

        /* renamed from: t */
        final /* synthetic */ LivestreamCommentLayout f54120t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10691e(Integer num, float f11, Integer num2, LivestreamCommentLayout livestreamCommentLayout) {
            super(0);
            this.f54117q = num;
            this.f54118r = f11;
            this.f54119s = num2;
            this.f54120t = livestreamCommentLayout;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55774a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55774a() {
            Integer num = this.f54117q;
            if (num != null && num.intValue() == 0) {
                if (this.f54118r > 80.0f || AbstractC19074t.m100204b(this.f54119s, this.f54117q)) {
                    this.f54120t.m55757v(0);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$f */
    /* loaded from: classes5.dex */
    static final class C10692f extends AbstractC19075u implements InterfaceC18494a {
        C10692f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverScrollableRecyclerView mo12V4() {
            return (OverScrollableRecyclerView) LivestreamCommentLayout.this.findViewById(AbstractC27409d.lstComment);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$g */
    /* loaded from: classes5.dex */
    public static final class C10693g extends RecyclerView.AbstractC1892s {
        C10693g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            int i13;
            Integer m56027g;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            C24860q m56026f = AbstractC10789p.m56026f(recyclerView, null, 1, null);
            if (m56026f != null) {
                i13 = ((Number) m56026f.m129215c()).intValue();
            } else {
                i13 = Integer.MAX_VALUE;
            }
            if (i13 <= 2) {
                LivestreamCommentLayout livestreamCommentLayout = LivestreamCommentLayout.this;
                m56027g = AbstractC10789p.m56027g(recyclerView);
                livestreamCommentLayout.f54106v = m56027g;
            }
            if (i13 <= 0) {
                AbstractC26112n.m134367H(LivestreamCommentLayout.this.getTvNewCmtNum());
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$h */
    /* loaded from: classes5.dex */
    public static final class C10694h extends C1923p {

        /* renamed from: q */
        final /* synthetic */ int f54123q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10694h(int i11, Context context) {
            super(context);
            this.f54123q = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            AbstractC19074t.m100208f(displayMetrics, "displayMetrics");
            return (super.mo10405v(displayMetrics) * 5.0f) / (this.f54123q + 1);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamCommentLayout$i */
    /* loaded from: classes5.dex */
    static final class C10695i extends AbstractC19075u implements InterfaceC18494a {
        C10695i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleShadowTextView mo12V4() {
            return (SimpleShadowTextView) LivestreamCommentLayout.this.findViewById(AbstractC27409d.tvNewCmtNum);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamCommentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C10692f());
        this.f54100p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10695i());
        this.f54101q = m129210a2;
        this.f54102r = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OverScrollableRecyclerView getLstComment() {
        Object value = this.f54100p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (OverScrollableRecyclerView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleShadowTextView getTvNewCmtNum() {
        Object value = this.f54101q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SimpleShadowTextView) value;
    }

    /* renamed from: p */
    private final void m55754p() {
        if (getLstComment().getItemAnimator() instanceof C30263f) {
            getLstComment().setItemAnimator(new C1914g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m55755r(LivestreamCommentLayout livestreamCommentLayout, View view) {
        Integer m56027g;
        AbstractC19074t.m100208f(livestreamCommentLayout, "this$0");
        AbstractC26112n.m134367H(livestreamCommentLayout.getTvNewCmtNum());
        m56027g = AbstractC10789p.m56027g(livestreamCommentLayout.getLstComment());
        livestreamCommentLayout.f54106v = m56027g;
        livestreamCommentLayout.m55757v(0);
    }

    /* renamed from: u */
    private final void m55756u() {
        if (!(getLstComment().getItemAnimator() instanceof C30263f)) {
            getLstComment().setItemAnimator(new C30263f(new AccelerateInterpolator()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m55757v(final int i11) {
        getLstComment().postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.o
            @Override // java.lang.Runnable
            public final void run() {
                LivestreamCommentLayout.m55758w(LivestreamCommentLayout.this, i11);
            }
        }, ViewConfiguration.getTapTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m55758w(LivestreamCommentLayout livestreamCommentLayout, int i11) {
        AbstractC19074t.m100208f(livestreamCommentLayout, "this$0");
        if (livestreamCommentLayout.getLstComment().getScrollState() == 0) {
            if (i11 <= 5) {
                OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager = livestreamCommentLayout.f54105u;
                if (linearLayoutManager != null) {
                    C10694h c10694h = new C10694h(i11, livestreamCommentLayout.getContext());
                    c10694h.m10244p(0);
                    linearLayoutManager.m10090H1(c10694h);
                    return;
                }
                return;
            }
            if (i11 <= 15) {
                livestreamCommentLayout.getLstComment().mo9854S1(i11);
            } else {
                livestreamCommentLayout.getLstComment().m9837K1(i11);
            }
        }
    }

    /* renamed from: h */
    public final void m55759h(List list) {
        List m131187O0;
        AbstractC19074t.m100208f(list, "comments");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9440a m51646d = ((GetCommentLiveRes.CommentData) it.next()).m51646d(this.f54107w);
            if (m51646d != null) {
                arrayList.add(m51646d);
            }
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList);
        m55756u();
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151939a0(m131187O0, null);
        }
    }

    /* renamed from: i */
    public final void m55760i(List list) {
        int i11;
        float f11;
        List m131187O0;
        AbstractC19074t.m100208f(list, "comments");
        m55754p();
        boolean z11 = true;
        C24860q m56026f = AbstractC10789p.m56026f(getLstComment(), null, 1, null);
        if (m56026f != null) {
            i11 = ((Number) m56026f.m129215c()).intValue();
        } else {
            i11 = -1;
        }
        if (m56026f != null) {
            f11 = ((Number) m56026f.m129216d()).floatValue();
        } else {
            f11 = -1.0f;
        }
        if (i11 != 0 && (i11 != 1 || f11 <= 50.0f)) {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9440a m51646d = ((GetCommentLiveRes.CommentData) it.next()).m51646d(this.f54107w);
            if (m51646d != null) {
                arrayList.add(m51646d);
            }
        }
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            m131187O0 = AbstractC25332a0.m131187O0(arrayList);
            c31189w.m151939a0(m131187O0, new C10688b(i11, z11));
        }
    }

    /* renamed from: j */
    public final void m55761j(InteractEventResponse.InteractItem interactItem) {
        float f11;
        Integer m56024d;
        AbstractC19074t.m100208f(interactItem, "interact");
        m55754p();
        Integer num = null;
        C24860q m56026f = AbstractC10789p.m56026f(getLstComment(), null, 1, null);
        if (m56026f != null) {
            num = (Integer) m56026f.m129215c();
        }
        if (m56026f != null) {
            f11 = ((Number) m56026f.m129216d()).floatValue();
        } else {
            f11 = -1.0f;
        }
        m56024d = AbstractC10789p.m56024d(getLstComment());
        C2484c c2484c = new C2484c(interactItem, this.f54107w);
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151940c0(c2484c, new C10689c(num, f11, m56024d, this));
        }
    }

    /* renamed from: k */
    public final C9440a m55762k(GetCommentLiveRes.CommentData commentData) {
        List m131506n;
        AbstractC19074t.m100208f(commentData, "comments");
        m55754p();
        C9440a m51646d = commentData.m51646d(this.f54107w);
        if (m51646d == null) {
            return null;
        }
        m51646d.m51406i(true);
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            m131506n = AbstractC25368s.m131506n(m51646d);
            c31189w.m151939a0(m131506n, new C10690d());
        }
        return m51646d;
    }

    /* renamed from: l */
    public final void m55763l(InteractEventResponse.InteractItem interactItem) {
        float f11;
        Integer m56024d;
        AbstractC19074t.m100208f(interactItem, "interact");
        Integer num = null;
        C24860q m56026f = AbstractC10789p.m56026f(getLstComment(), null, 1, null);
        if (m56026f != null) {
            num = (Integer) m56026f.m129215c();
        }
        if (m56026f != null) {
            f11 = ((Number) m56026f.m129216d()).floatValue();
        } else {
            f11 = -1.0f;
        }
        m56024d = AbstractC10789p.m56024d(getLstComment());
        C2491j c2491j = new C2491j(interactItem, this.f54107w);
        m55756u();
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151938Y(c2491j, new C10691e(num, f11, m56024d, this));
        }
    }

    /* renamed from: m */
    public final void m55764m(boolean z11) {
        m55754p();
        getLstComment().setItemAnimator(new C1914g());
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151948q0(z11);
        }
    }

    /* renamed from: n */
    public final void m55765n() {
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151941f0();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        OverScrollableRecyclerView lstComment = getLstComment();
        C31189w c31189w = new C31189w(null, 1, null);
        lstComment.setAdapter(c31189w);
        this.f54104t = c31189w;
        Context context = lstComment.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager = new OverScrollableRecyclerView.LinearLayoutManager(context, 0, false, false, 14, null);
        lstComment.setLayoutManager(linearLayoutManager);
        linearLayoutManager.m9725D2(true);
        this.f54105u = linearLayoutManager;
        lstComment.m9826E(new C10693g());
        getTvNewCmtNum().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivestreamCommentLayout.m55755r(LivestreamCommentLayout.this, view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        AbstractC19074t.m100208f(motionEvent, "event");
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && (motionEvent2 = this.f54103s) != null && motionEvent2 != null) {
                float abs = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs2 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                int i11 = this.f54102r;
                if (abs >= i11 && abs >= abs2) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f54103s = null;
                    return true;
                }
                if (abs2 >= i11 && abs2 >= abs) {
                    this.f54103s = null;
                    if (((motionEvent.getY() > motionEvent2.getY() && !getLstComment().canScrollVertically(-1)) || (motionEvent.getY() < motionEvent2.getY() && !getLstComment().canScrollVertically(1))) && !this.f54107w && !this.f54108x) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                }
            }
        } else {
            this.f54103s = AbstractC26104f.m134330a(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: q */
    public final void m55766q(List list) {
        AbstractC19074t.m100208f(list, "cmtIds");
        m55754p();
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151942h0(list);
        }
    }

    /* renamed from: s */
    public final void m55767s() {
        m55754p();
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151947o0();
        }
    }

    /* renamed from: x */
    public final void m55768x(boolean z11) {
        this.f54108x = z11;
    }

    /* renamed from: y */
    public final void m55769y(boolean z11) {
        this.f54107w = z11;
    }

    /* renamed from: z */
    public final void m55770z(String str) {
        AbstractC19074t.m100208f(str, "statusMsg");
        m55754p();
        C31189w c31189w = this.f54104t;
        if (c31189w != null) {
            c31189w.m151949s0(str);
        }
    }
}
