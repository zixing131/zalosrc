package com.zing.zalo.zinstant.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.util.InterfaceC1479a;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.AbstractC17159j;
import com.zing.zalo.zinstant.AbstractC17162k;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.component.p081ui.ZinstantView;
import com.zing.zalo.zinstant.component.p081ui.input.ZinstantInputText;
import com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewImpl;
import com.zing.zalo.zinstant.component.p081ui.slider.ZinstantSliderView;
import com.zing.zalo.zinstant.component.skeleton.ZinstantShimmerView;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.C17193e;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.meta.ImpressionMeta;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import ik0.AbstractC20595r;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.C20599v;
import ik0.EnumC20598u;
import ik0.InterfaceC20578a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lk0.C22504b;
import lk0.C22505c;
import lk0.InterfaceC22508f;
import ll0.C22514b;
import ll0.C22518f;
import ll0.HandlerC22516d;
import nk0.AbstractC23825g0;
import nk0.AbstractC23838k1;
import nk0.C23813c0;
import nk0.C23855s0;
import nk0.C23857t0;
import nk0.C23859u0;
import nk0.C23869z0;
import nk0.InterfaceC23860v;
import ok0.InterfaceC24284a;
import ok0.InterfaceC24289f;
import org.json.JSONException;
import org.json.JSONObject;
import pj0.AbstractC24788n;
import pj0.AbstractC24795u;
import pj0.C24783i;
import pj0.InterfaceC24785k;
import pj0.InterfaceC24786l;
import pj0.InterfaceC24787m;
import pj0.InterfaceC24794t;
import qk0.InterfaceC25305a;
import rj0.AbstractC25813b;
import uk0.C27290d;
import uk0.C27291e;
import uk0.C27293g;
import uk0.InterfaceC27287a;
import uk0.InterfaceC27292f;
import uk0.InterfaceC27294h;
import wj0.InterfaceC29061b;

/* loaded from: classes7.dex */
public abstract class ZinstantLayout extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, InterfaceC29061b, InterfaceC17225b {

    /* renamed from: A */
    private boolean f87786A;

    /* renamed from: B */
    private boolean f87787B;

    /* renamed from: C */
    private final AbstractC24788n f87788C;

    /* renamed from: D */
    private final InterfaceC24786l f87789D;

    /* renamed from: E */
    private final InterfaceC24794t f87790E;

    /* renamed from: F */
    Handler f87791F;

    /* renamed from: G */
    HandlerC22516d f87792G;

    /* renamed from: H */
    C17222k f87793H;

    /* renamed from: I */
    private final InterfaceC27294h f87794I;

    /* renamed from: J */
    private long f87795J;

    /* renamed from: K */
    private int f87796K;

    /* renamed from: L */
    private String f87797L;

    /* renamed from: M */
    C27290d f87798M;

    /* renamed from: N */
    final Rect f87799N;

    /* renamed from: O */
    protected InterfaceC24289f f87800O;

    /* renamed from: P */
    protected C17223l f87801P;

    /* renamed from: Q */
    protected InterfaceC27292f f87802Q;

    /* renamed from: R */
    public InterfaceC27287a f87803R;

    /* renamed from: S */
    public InterfaceC17139d f87804S;

    /* renamed from: T */
    public InterfaceC23860v f87805T;

    /* renamed from: U */
    public C20588k f87806U;

    /* renamed from: V */
    private final C22518f f87807V;

    /* renamed from: W */
    private final Object f87808W;

    /* renamed from: p */
    protected final String f87809p;

    /* renamed from: q */
    protected AbstractC20601x f87810q;

    /* renamed from: r */
    protected C23855s0 f87811r;

    /* renamed from: s */
    protected C23855s0 f87812s;

    /* renamed from: t */
    protected ProgressBar f87813t;

    /* renamed from: u */
    protected FrameLayout f87814u;

    /* renamed from: v */
    private InterfaceC22508f f87815v;

    /* renamed from: w */
    private InterfaceC17224a f87816w;

    /* renamed from: x */
    protected InterfaceC17225b f87817x;

    /* renamed from: y */
    private String f87818y;

    /* renamed from: z */
    private AbstractC17227d f87819z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$a */
    /* loaded from: classes7.dex */
    public class C17212a extends C20588k {
        C17212a() {
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: a */
        public void mo61857a(AbstractC20601x abstractC20601x, Exception exc) {
            ZinstantLayout.this.m91997o0(abstractC20601x, exc);
            super.mo61857a(abstractC20601x, exc);
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: b */
        public void mo61858b(AbstractC20601x abstractC20601x, Exception exc) {
            ZinstantLayout.this.mo91434i0(abstractC20601x, exc);
            super.mo61858b(abstractC20601x, exc);
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: c */
        public void mo61859c(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
            ZinstantLayout.this.m91994j0(interfaceC20578a0);
            super.mo61859c(abstractC20601x, interfaceC20578a0);
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: d */
        public void mo61860d(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
            super.mo61860d(abstractC20601x, interfaceC20578a0);
            ZinstantLayout.this.m91998p0(interfaceC20578a0);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$b */
    /* loaded from: classes7.dex */
    public class C17213b extends AbstractC24788n {
        C17213b() {
        }

        /* renamed from: h */
        public /* synthetic */ void m92013h() {
            ZinstantLayout.this.m91968G();
        }

        /* renamed from: i */
        public /* synthetic */ void m92014i(String str, String str2, InterfaceC24785k interfaceC24785k, boolean z11) {
            if (ZinstantLayout.this.m91966F(str, str2, interfaceC24785k)) {
                return;
            }
            super.mo61862a(str, str2, z11, interfaceC24785k);
        }

        /* renamed from: j */
        public /* synthetic */ void m92015j() {
            ZinstantLayout.this.m91978M0();
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: W2 */
        public boolean mo87252W2() {
            if (!super.mo87252W2()) {
                ZinstantLayout.this.m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.o
                    public /* synthetic */ RunnableC17238o() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantLayout.C17213b.this.m92015j();
                    }
                });
                return true;
            }
            return true;
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            if (ZinstantLayout.this.m91990U() && !z11) {
                if (interfaceC24785k != null) {
                    interfaceC24785k.mo128801a("{\"error_code\":-998,\"error_message\":\"\",\"data\":\"\"}");
                    return;
                }
                return;
            }
            ZinstantLayout.this.m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.n

                /* renamed from: q */
                public final /* synthetic */ String f87899q;

                /* renamed from: r */
                public final /* synthetic */ String f87900r;

                /* renamed from: s */
                public final /* synthetic */ InterfaceC24785k f87901s;

                /* renamed from: t */
                public final /* synthetic */ boolean f87902t;

                public /* synthetic */ RunnableC17237n(String str3, String str22, InterfaceC24785k interfaceC24785k2, boolean z112) {
                    r2 = str3;
                    r3 = str22;
                    r4 = interfaceC24785k2;
                    r5 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantLayout.C17213b.this.m92014i(r2, r3, r4, r5);
                }
            });
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: b */
        public boolean mo87253b() {
            if (!super.mo87253b()) {
                ZinstantLayout.this.m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.m
                    public /* synthetic */ RunnableC17236m() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantLayout.C17213b.this.m92013h();
                    }
                });
                return true;
            }
            return true;
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: c */
        public Context mo92016c() {
            return ZinstantLayout.this.getContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$c */
    /* loaded from: classes7.dex */
    public class C17214c implements InterfaceC24786l {
        C17214c() {
        }

        @Override // pj0.InterfaceC24786l
        /* renamed from: a */
        public void mo92017a(int i11) {
            ZinstantLayout.this.mo91672h0(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$d */
    /* loaded from: classes7.dex */
    public class C17215d extends AbstractC24795u {
        C17215d() {
        }

        @Override // pj0.InterfaceC24794t
        /* renamed from: a */
        public InterfaceC24786l mo92018a() {
            return ZinstantLayout.this.f87789D;
        }

        @Override // pj0.InterfaceC24794t
        /* renamed from: b */
        public InterfaceC24787m mo92019b() {
            return ZinstantLayout.this.f87788C;
        }

        @Override // pj0.InterfaceC24794t
        /* renamed from: c */
        public void mo92020c() {
            ZinstantLayout.this.m91951e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$e */
    /* loaded from: classes7.dex */
    public class HandlerC17216e extends Handler {
        HandlerC17216e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        ZinstantLayout.this.mo91521y();
                        ZinstantLayout.this.m91964C();
                        return;
                    }
                    return;
                }
                ZinstantLayout.this.mo91992a();
                return;
            }
            ZinstantLayout.this.m91974K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$f */
    /* loaded from: classes7.dex */
    public class C17217f implements InterfaceC27294h {

        /* renamed from: a */
        private long f87825a = 0;

        /* renamed from: b */
        private long f87826b = 0;

        /* renamed from: c */
        private boolean f87827c = false;

        /* renamed from: d */
        private boolean f87828d = false;

        /* renamed from: e */
        private final Object f87829e = new Object();

        C17217f() {
        }

        @Override // uk0.InterfaceC27294h
        /* renamed from: a */
        public void mo91458a() {
            synchronized (this.f87829e) {
                try {
                    if (!this.f87827c) {
                        this.f87827c = true;
                    }
                    if (!this.f87828d) {
                        this.f87828d = true;
                        this.f87826b = System.currentTimeMillis();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // uk0.InterfaceC27294h
        /* renamed from: b */
        public void mo91459b() {
            synchronized (this.f87829e) {
                try {
                    if (this.f87828d) {
                        this.f87828d = false;
                        this.f87825a += System.currentTimeMillis() - this.f87826b;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // uk0.InterfaceC27294h
        public boolean isRunning() {
            return this.f87827c;
        }

        @Override // uk0.InterfaceC27294h
        /* renamed from: z3 */
        public void mo91460z3() {
            synchronized (this.f87829e) {
                try {
                    if (this.f87827c) {
                        this.f87827c = false;
                        mo91459b();
                        String delegateID = ZinstantLayout.this.getDelegateID();
                        ZinstantLayout zinstantLayout = ZinstantLayout.this;
                        InterfaceC27292f interfaceC27292f = zinstantLayout.f87802Q;
                        if (interfaceC27292f != null) {
                            int featureType = zinstantLayout.getFeatureType();
                            if (delegateID == null) {
                                delegateID = "unknown";
                            }
                            interfaceC27292f.mo91778c(featureType, delegateID, this.f87825a);
                        }
                        this.f87825a = 0L;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$g */
    /* loaded from: classes7.dex */
    public class C17218g extends AbstractC17227d {
        C17218g(View view) {
            super(view);
        }

        @Override // com.zing.zalo.zinstant.view.AbstractC17227d
        /* renamed from: l */
        protected void mo91522l(boolean z11) {
            ZinstantLayout.this.m91996n0(z11);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$h */
    /* loaded from: classes7.dex */
    public class C17219h extends View {

        /* renamed from: p */
        final /* synthetic */ C23855s0 f87832p;

        /* renamed from: q */
        final /* synthetic */ ZinstantView f87833q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C17219h(Context context, C23855s0 c23855s0, ZinstantView zinstantView) {
            super(context);
            this.f87832p = c23855s0;
            this.f87833q = zinstantView;
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            ((ZinstantShimmerView) this.f87833q).getBackdrop().draw(canvas);
        }

        @Override // android.view.View
        protected void onMeasure(int i11, int i12) {
            setMeasuredDimension(this.f87832p.m124651z(), this.f87832p.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$i */
    /* loaded from: classes7.dex */
    public class C17220i implements InterfaceC27287a {
        C17220i() {
        }

        @Override // uk0.InterfaceC27287a
        /* renamed from: a */
        public void mo92021a(C27291e c27291e) {
            ZinstantLayout.this.m91984Q0(c27291e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$j */
    /* loaded from: classes7.dex */
    public class C17221j implements InterfaceC23860v {
        C17221j() {
        }

        @Override // nk0.InterfaceC23860v
        /* renamed from: a */
        public InterfaceC25305a mo92022a() {
            return ZinstantLayout.this.f87801P;
        }

        @Override // nk0.InterfaceC23860v
        /* renamed from: b */
        public InterfaceC17139d mo92023b() {
            return ZinstantLayout.this.f87804S;
        }

        @Override // nk0.InterfaceC23860v
        /* renamed from: c */
        public InterfaceC24289f mo92024c() {
            return ZinstantLayout.this.f87800O;
        }

        @Override // nk0.InterfaceC23860v
        /* renamed from: d */
        public InterfaceC27287a mo92025d() {
            return ZinstantLayout.this.f87803R;
        }
    }

    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$k */
    /* loaded from: classes7.dex */
    public static class C17222k implements HandlerC22516d.a {

        /* renamed from: p */
        WeakReference f87837p;

        /* renamed from: q */
        ImpressionMeta f87838q = null;

        /* renamed from: r */
        long f87839r = 0;

        public C17222k(ZinstantLayout zinstantLayout) {
            this.f87837p = new WeakReference(zinstantLayout);
        }

        /* renamed from: a */
        public boolean m92026a(ImpressionMeta impressionMeta) {
            this.f87838q = impressionMeta;
            if (impressionMeta.isOnlyInteraction()) {
                return false;
            }
            this.f87839r = this.f87838q.getIntervalTime();
            return true;
        }

        @Override // ll0.HandlerC22516d.a
        /* renamed from: f0 */
        public long mo92027f0() {
            return this.f87839r;
        }

        @Override // ll0.HandlerC22516d.a
        /* renamed from: g0 */
        public HandlerC22516d.a.EnumC32888a mo92028g0() {
            return HandlerC22516d.a.EnumC32888a.interval;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZinstantLayout zinstantLayout = (ZinstantLayout) this.f87837p.get();
            if (zinstantLayout != null) {
                zinstantLayout.m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.p
                    public /* synthetic */ RunnableC17239p() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantLayout.this.m91964C();
                    }
                });
            }
        }

        @Override // ll0.HandlerC22516d.a
        /* renamed from: v */
        public int mo92029v() {
            return 0;
        }
    }

    /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l */
    /* loaded from: classes7.dex */
    public class C17223l implements InterfaceC25305a {

        /* renamed from: a */
        InterfaceC24284a f87840a;

        /* renamed from: b */
        private final Runnable f87841b = new c();

        /* renamed from: c */
        private final Runnable f87842c = new d();

        /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$a */
        /* loaded from: classes7.dex */
        public class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f87844p;

            /* renamed from: q */
            final /* synthetic */ String f87845q;

            /* renamed from: r */
            final /* synthetic */ String f87846r;

            /* renamed from: s */
            final /* synthetic */ AbstractC23825g0 f87847s;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$a$a */
            /* loaded from: classes7.dex */
            public class C32794a implements InterfaceC24284a.a {

                /* renamed from: a */
                final /* synthetic */ boolean f87849a;

                /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$a$a$a */
                /* loaded from: classes7.dex */
                class RunnableC32795a implements Runnable {

                    /* renamed from: p */
                    final /* synthetic */ String f87851p;

                    /* renamed from: q */
                    final /* synthetic */ String f87852q;

                    /* renamed from: r */
                    final /* synthetic */ String f87853r;

                    /* renamed from: s */
                    final /* synthetic */ String f87854s;

                    /* renamed from: t */
                    final /* synthetic */ ZOMInsight f87855t;

                    /* renamed from: u */
                    final /* synthetic */ String f87856u;

                    RunnableC32795a(String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
                        this.f87851p = str;
                        this.f87852q = str2;
                        this.f87853r = str3;
                        this.f87854s = str4;
                        this.f87855t = zOMInsight;
                        this.f87856u = str5;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C17223l c17223l = C17223l.this;
                        c17223l.f87840a.mo43842i(ZinstantLayout.this, this.f87851p, this.f87852q, this.f87853r, this.f87854s, this.f87855t, this.f87856u);
                    }
                }

                C32794a(boolean z11) {
                    this.f87849a = z11;
                }

                @Override // ok0.InterfaceC24284a.a
                /* renamed from: a */
                public void mo92037a(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
                    if (!this.f87849a && !TextUtils.isEmpty(str3)) {
                        AbstractC19444a.m101695c(new RunnableC32795a(str, str2, str3, str4, zOMInsight, str5));
                    }
                    ZinstantLayout zinstantLayout2 = ZinstantLayout.this;
                    InterfaceC27292f interfaceC27292f = zinstantLayout2.f87802Q;
                    if (interfaceC27292f != null) {
                        interfaceC27292f.mo44292d(zinstantLayout2.getFeatureType(), str, str2, a.this.f87847s.m131007J().mInsight);
                    }
                }
            }

            a(String str, String str2, String str3, AbstractC23825g0 abstractC23825g0) {
                this.f87844p = str;
                this.f87845q = str2;
                this.f87846r = str3;
                this.f87847s = abstractC23825g0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C17223l c17223l;
                InterfaceC24284a interfaceC24284a;
                try {
                    boolean m91966F = ZinstantLayout.this.m91966F(this.f87844p, this.f87845q, null);
                    if (ZinstantLayout.this.getZinstantRootTree() != null && (interfaceC24284a = (c17223l = C17223l.this).f87840a) != null) {
                        ZinstantLayout zinstantLayout = ZinstantLayout.this;
                        interfaceC24284a.mo101522g(zinstantLayout, zinstantLayout.getDelegateID(), this.f87846r, this.f87844p, this.f87845q, this.f87847s.m131007J().mInsight, this.f87847s.m131007J().mExtraData, new C32794a(m91966F));
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104543l(ZinstantLayout.this.f87809p).mo104550c(e11, "onClick error", new Object[0]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$b */
        /* loaded from: classes7.dex */
        public class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f87858p;

            /* renamed from: q */
            final /* synthetic */ String f87859q;

            /* renamed from: r */
            final /* synthetic */ String f87860r;

            /* renamed from: s */
            final /* synthetic */ AbstractC23825g0 f87861s;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$b$a */
            /* loaded from: classes7.dex */
            public class a implements InterfaceC24284a.a {

                /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$b$a$a */
                /* loaded from: classes7.dex */
                class RunnableC32796a implements Runnable {

                    /* renamed from: p */
                    final /* synthetic */ String f87864p;

                    /* renamed from: q */
                    final /* synthetic */ String f87865q;

                    /* renamed from: r */
                    final /* synthetic */ String f87866r;

                    /* renamed from: s */
                    final /* synthetic */ String f87867s;

                    /* renamed from: t */
                    final /* synthetic */ ZOMInsight f87868t;

                    /* renamed from: u */
                    final /* synthetic */ String f87869u;

                    RunnableC32796a(String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
                        this.f87864p = str;
                        this.f87865q = str2;
                        this.f87866r = str3;
                        this.f87867s = str4;
                        this.f87868t = zOMInsight;
                        this.f87869u = str5;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C17223l c17223l = C17223l.this;
                        c17223l.f87840a.mo101521d(ZinstantLayout.this, this.f87864p, this.f87865q, this.f87866r, this.f87867s, this.f87868t, this.f87869u);
                    }
                }

                a() {
                }

                @Override // ok0.InterfaceC24284a.a
                /* renamed from: a */
                public void mo92037a(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
                    AbstractC19444a.m101695c(new RunnableC32796a(str, str2, str3, str4, zOMInsight, str5));
                    ZinstantLayout zinstantLayout2 = ZinstantLayout.this;
                    InterfaceC27292f interfaceC27292f = zinstantLayout2.f87802Q;
                    if (interfaceC27292f != null) {
                        interfaceC27292f.mo91779e(zinstantLayout2.getFeatureType(), str, str2, zOMInsight);
                    }
                }
            }

            b(String str, String str2, String str3, AbstractC23825g0 abstractC23825g0) {
                this.f87858p = str;
                this.f87859q = str2;
                this.f87860r = str3;
                this.f87861s = abstractC23825g0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C17223l c17223l;
                InterfaceC24284a interfaceC24284a;
                try {
                    if (ZinstantLayout.this.getZinstantRootTree() != null && (interfaceC24284a = (c17223l = C17223l.this).f87840a) != null) {
                        ZinstantLayout zinstantLayout = ZinstantLayout.this;
                        interfaceC24284a.mo101522g(zinstantLayout, zinstantLayout.getDelegateID(), this.f87858p, this.f87859q, this.f87860r, this.f87861s.m131007J().mInsight, this.f87861s.m131007J().mExtraData, new a());
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104543l(ZinstantLayout.this.f87809p).mo104550c(e11, "onLongClick error", new Object[0]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$c */
        /* loaded from: classes7.dex */
        public class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC24284a interfaceC24284a = C17223l.this.f87840a;
                if (interfaceC24284a != null) {
                    interfaceC24284a.mo44408b();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zinstant.view.ZinstantLayout$l$d */
        /* loaded from: classes7.dex */
        public class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC24284a interfaceC24284a = C17223l.this.f87840a;
                if (interfaceC24284a != null) {
                    interfaceC24284a.mo61861a();
                }
            }
        }

        protected C17223l() {
        }

        @Override // qk0.InterfaceC25305a
        /* renamed from: a */
        public void mo92030a() {
            AbstractC19444a.m101695c(this.f87842c);
        }

        @Override // qk0.InterfaceC25305a
        /* renamed from: b */
        public void mo92031b() {
            AbstractC19444a.m101695c(this.f87841b);
        }

        @Override // qk0.InterfaceC25305a
        /* renamed from: c */
        public void mo92032c(AbstractC23825g0 abstractC23825g0, String str, String str2, String str3) {
            C22514b.m116415b().m116416a(new a(str2, str3, str, abstractC23825g0));
        }

        @Override // qk0.InterfaceC25305a
        /* renamed from: d */
        public void mo92033d(AbstractC23825g0 abstractC23825g0, String str, String str2, String str3) {
            C22514b.m116415b().m116416a(new b(str, str2, str3, abstractC23825g0));
        }

        @Override // qk0.InterfaceC25305a
        /* renamed from: e */
        public boolean mo92034e() {
            return this.f87840a != null;
        }

        @Override // qk0.InterfaceC25305a
        /* renamed from: f */
        public void mo92035f(AbstractC23825g0 abstractC23825g0, String str, String str2, String str3, JSONObject jSONObject) {
            JSONObject jSONObject2;
            String currentLocale = ZinstantLayout.this.getCurrentLocale();
            if (!TextUtils.isEmpty(currentLocale)) {
                jSONObject2 = jSONObject.optJSONObject(currentLocale);
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("action");
                if (!TextUtils.isEmpty(optString)) {
                    str3 = jSONObject2.optString("data");
                    str2 = optString;
                }
            }
            mo92032c(abstractC23825g0, str, str2, str3);
        }

        /* renamed from: g */
        void m92036g(InterfaceC24284a interfaceC24284a) {
            this.f87840a = interfaceC24284a;
        }
    }

    public ZinstantLayout(Context context) {
        super(context);
        this.f87809p = getClass().getSimpleName();
        this.f87817x = null;
        this.f87818y = null;
        this.f87819z = null;
        this.f87786A = false;
        this.f87787B = false;
        this.f87788C = new C17213b();
        this.f87789D = new C17214c();
        this.f87790E = new C17215d();
        this.f87791F = new HandlerC17216e(Looper.getMainLooper());
        this.f87792G = null;
        this.f87793H = null;
        this.f87794I = new C17217f();
        this.f87795J = 0L;
        this.f87796K = 0;
        this.f87797L = null;
        this.f87799N = new Rect();
        this.f87801P = new C17223l();
        this.f87803R = new C17220i();
        this.f87805T = new C17221j();
        this.f87806U = new C17212a();
        this.f87807V = new C22518f();
        this.f87808W = new Object();
        mo91432H();
    }

    /* renamed from: A */
    private void m91929A(InterfaceC1479a interfaceC1479a) {
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null && c23855s0.m124626G()) {
            interfaceC1479a.accept(c23855s0);
        }
    }

    /* renamed from: B */
    private void m91930B() {
        AbstractC20601x abstractC20601x = this.f87810q;
        if (abstractC20601x != null) {
            m91969G0(abstractC20601x);
        }
    }

    /* renamed from: D */
    private boolean m91931D(String str, String str2) {
        String delegateID;
        String optString;
        InterfaceC29061b rootZINSComponent;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("zinstantdata_id")) {
                delegateID = jSONObject.getString("zinstantdata_id");
            } else {
                delegateID = getDelegateID();
            }
            optString = jSONObject.optString("idNode", "");
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        if ((delegateID == null || delegateID.equals(getDelegateID())) && (rootZINSComponent = getRootZINSComponent()) != null) {
            return rootZINSComponent.mo91519u(optString);
        }
        return false;
    }

    /* renamed from: D0 */
    public void m91945b0(AbstractC23838k1 abstractC23838k1) {
        InterfaceC29061b m124590W0 = abstractC23838k1.m124590W0(this);
        if (m124590W0 != null && indexOfChild(m124590W0.getView()) > 0) {
            removeView(m124590W0.getView());
        }
    }

    /* renamed from: E */
    private boolean m91933E(String str, String str2) {
        String delegateID;
        String optString;
        String optString2;
        int optInt;
        InterfaceC29061b rootZINSComponent;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("zinstantdata_id")) {
                delegateID = jSONObject.getString("zinstantdata_id");
            } else {
                delegateID = getDelegateID();
            }
            optString = jSONObject.optString("idSlider", "");
            optString2 = jSONObject.optString("idNode", "");
            optInt = jSONObject.optInt("scrollType", 0);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        if ((delegateID == null || delegateID.equals(getDelegateID())) && (rootZINSComponent = getRootZINSComponent()) != null) {
            return rootZINSComponent.mo91512f(optString, optString2, optInt);
        }
        return false;
    }

    /* renamed from: E0 */
    public static void m91934E0(InterfaceC29061b interfaceC29061b, int i11) {
        interfaceC29061b.getView().post(new Runnable() { // from class: com.zing.zalo.zinstant.view.k

            /* renamed from: p */
            public final /* synthetic */ int f87893p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC29061b f87894q;

            public /* synthetic */ RunnableC17234k(int i112, InterfaceC29061b interfaceC29061b2) {
                r1 = i112;
                r2 = interfaceC29061b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantLayout.m91949d0(r1, r2);
            }
        });
    }

    /* renamed from: J */
    private void m91935J() {
        synchronized (this.f87808W) {
            try {
                if (this.f87792G != null) {
                    return;
                }
                this.f87792G = new HandlerC22516d(this.f87807V.m116437e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: L0 */
    private void m91936L0(AbstractC23838k1 abstractC23838k1, InterfaceC29061b interfaceC29061b) {
        abstractC23838k1.m124589V0(this, interfaceC29061b);
        ViewParent parent = interfaceC29061b.getView().getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(interfaceC29061b.getView());
        }
        View view = interfaceC29061b.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(abstractC23838k1.m131007J().mWidth, abstractC23838k1.m131007J().mHeight));
        addView(view);
        view.setVisibility(abstractC23838k1.m131007J().mRelativeVisibility);
    }

    /* renamed from: O0 */
    private void m91937O0() {
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null && c23855s0.m124631S()) {
            this.f87794I.mo91460z3();
        }
    }

    /* renamed from: P0 */
    private void m91938P0(AbstractC20601x abstractC20601x) {
        this.f87810q = abstractC20601x;
    }

    /* renamed from: W */
    public /* synthetic */ void m91939W(C23855s0 c23855s0) {
        c23855s0.m124641f0(this.f87790E);
    }

    /* renamed from: X */
    public /* synthetic */ void m91940X(C23855s0 c23855s0) {
        m91959l0(false);
    }

    /* renamed from: c0 */
    public /* synthetic */ void m91947c0() {
        m91965C0();
        m91993g0();
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m91949d0(int i11, InterfaceC29061b interfaceC29061b) {
        if (!(interfaceC29061b.getView().getParent() instanceof InterfaceC29061b)) {
            return;
        }
        for (InterfaceC29061b interfaceC29061b2 = (InterfaceC29061b) interfaceC29061b.getView().getParent(); interfaceC29061b2 != null; interfaceC29061b2 = (InterfaceC29061b) interfaceC29061b2.getView().getParent()) {
            if (interfaceC29061b2 instanceof ZinstantScrollViewImpl) {
                ((ZinstantScrollViewImpl) interfaceC29061b2).m8329j0(0, i11);
                i11 = interfaceC29061b2.getView().getTop();
            } else {
                i11 += interfaceC29061b2.getView().getTop();
            }
            if (!(interfaceC29061b2.getView().getParent() instanceof InterfaceC29061b)) {
                return;
            }
        }
    }

    /* renamed from: e0 */
    public void m91951e0() {
        if (this.f87791F.hasMessages(4)) {
            return;
        }
        this.f87791F.sendEmptyMessageDelayed(4, 100L);
    }

    /* renamed from: f0 */
    private void m91952f0() {
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null && c23855s0.m124631S()) {
            AbstractC20110a.m104535d("Resume tracking time on screen", new Object[0]);
            if (m91989T() && AbstractC17201m.m91822n(this, this.f87799N)) {
                this.f87794I.mo91458a();
            } else {
                this.f87794I.mo91459b();
            }
        }
    }

    private InterfaceC29061b getRootZINSComponent() {
        InterfaceC29061b interfaceC29061b = null;
        for (ViewGroup viewGroup = this; viewGroup instanceof InterfaceC29061b; viewGroup = (ViewGroup) viewGroup.getParent()) {
            try {
                interfaceC29061b = (InterfaceC29061b) viewGroup;
            } catch (Exception unused) {
                return null;
            }
        }
        return interfaceC29061b;
    }

    /* renamed from: l0 */
    private void m91959l0(boolean z11) {
        if (m91983Q()) {
            AbstractC20110a.m104543l(this.f87809p).mo104548a("setLifeCycle: %s (was %s) - %s", 3, Integer.valueOf(this.f87796K), this);
            this.f87796K = 3;
            this.f87819z.m92052n();
            m91962r0(z11);
        }
    }

    /* renamed from: p */
    public void m91943a0(AbstractC23838k1 abstractC23838k1) {
        InterfaceC29061b m92007x;
        ZOM m131007J = abstractC23838k1.m131007J();
        int i11 = m131007J.mType;
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 == 8) {
                    m92007x = m92004v((C23813c0) abstractC23838k1);
                }
                m92007x = null;
            } else {
                m92007x = m92009z((C23869z0) abstractC23838k1);
            }
        } else {
            if (m131007J.mOverflow == 2) {
                m92007x = m92007x((C23857t0) abstractC23838k1);
            }
            m92007x = null;
        }
        if (m92007x != null) {
            m91936L0(abstractC23838k1, m92007x);
        }
    }

    /* renamed from: r0 */
    private void m91962r0(boolean z11) {
        m91952f0();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt instanceof InterfaceC29061b) {
                ((InterfaceC29061b) childAt).onPause();
            }
        }
        if (z11) {
            m91986R0();
        }
    }

    /* renamed from: A0 */
    public void mo91667A0(boolean z11) {
        if (z11) {
            m91972I0();
            this.f87811r = null;
            this.f87812s = null;
        }
    }

    /* renamed from: B0 */
    protected void m91963B0(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        try {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104546o(th2);
        }
    }

    /* renamed from: C */
    public void m91964C() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt instanceof InterfaceC29061b) {
                ((InterfaceC29061b) childAt).mo91515n();
            }
        }
    }

    /* renamed from: C0 */
    void m91965C0() {
        ImpressionMeta mo124399g;
        if (this.f87812s != null) {
            HandlerC22516d handlerC22516d = this.f87792G;
            if ((handlerC22516d == null || !handlerC22516d.m116423d(this.f87793H) || this.f87793H == null) && (mo124399g = this.f87812s.mo124399g()) != null) {
                if (this.f87793H == null) {
                    this.f87793H = new C17222k(this);
                }
                if (!this.f87793H.m92026a(mo124399g)) {
                    this.f87793H = null;
                } else {
                    m91935J();
                    this.f87792G.m116421a(this.f87793H, true);
                }
            }
        }
    }

    /* renamed from: F */
    boolean m91966F(String str, String str2, InterfaceC24785k interfaceC24785k) {
        AbstractC25813b.a aVar = AbstractC25813b.Companion;
        if (aVar.m133102b(str)) {
            boolean m91933E = m91933E(str, str2);
            if (interfaceC24785k != null && m91933E) {
                interfaceC24785k.mo128801a(String.format(Locale.US, "{\"error_code\":%d,\"error_message\":\"\", \"data\": \"\"}", 0));
            }
            return m91933E;
        }
        if (!aVar.m133101a(str)) {
            return false;
        }
        boolean m91931D = m91931D(str, str2);
        if (interfaceC24785k != null && m91931D) {
            interfaceC24785k.mo128801a(String.format(Locale.US, "{\"error_code\":%d,\"error_message\":\"\", \"data\": \"\"}", 0));
        }
        return m91931D;
    }

    /* renamed from: F0 */
    public void m91967F0() {
        this.f87791F.removeMessages(3);
        this.f87791F.sendEmptyMessage(3);
    }

    /* renamed from: G */
    void m91968G() {
        FrameLayout frameLayout = this.f87814u;
        if (frameLayout != null) {
            removeView(frameLayout);
        }
    }

    /* renamed from: G0 */
    public void m91969G0(AbstractC20601x abstractC20601x) {
        AbstractC20601x.b.a aVar;
        int preferredWidth = getPreferredWidth();
        if (preferredWidth <= 0) {
            preferredWidth = getWidth();
        }
        AbstractC20601x.b mo107096o = abstractC20601x.mo107096o();
        if (mo107096o == null) {
            mo107096o = AbstractC20601x.b.m107228a(preferredWidth, getCurrentTheme()).mo107129d(getCurrentLocale()).mo107128c(this.f87804S).mo107126a();
        }
        if (mo107096o.mo107125j() <= 0) {
            if (preferredWidth > 0) {
                aVar = mo107096o.mo107120e().mo107134i(preferredWidth);
            } else {
                m91938P0(abstractC20601x);
                m91963B0(this);
                return;
            }
        } else {
            aVar = null;
        }
        if (mo107096o.mo107117b() <= 0) {
            int preferredHeight = getPreferredHeight();
            if (aVar == null) {
                aVar = mo107096o.mo107120e().mo107127b(preferredHeight);
            } else {
                aVar = aVar.mo107127b(preferredHeight);
            }
        }
        if (mo107096o.mo107118c() != this.f87804S) {
            if (aVar == null) {
                aVar = mo107096o.mo107120e();
            }
            aVar.mo107128c(this.f87804S);
        }
        if (mo107096o.mo107119d() == null) {
            if (aVar == null) {
                aVar = mo107096o.mo107120e();
            }
            aVar.mo107129d(getCurrentLocale());
        }
        if (abstractC20601x.mo107090i() != getFeatureType()) {
            abstractC20601x = abstractC20601x.mo107093l().mo107107g(getFeatureType()).mo107103c();
        }
        if (aVar != null) {
            abstractC20601x = abstractC20601x.mo107093l().mo107112l(aVar.mo107126a()).mo107103c();
        }
        if (abstractC20601x.mo107096o() == null) {
            abstractC20601x = abstractC20601x.mo107093l().mo107112l(mo107096o).mo107103c();
        }
        if (!TextUtils.isEmpty(this.f87818y)) {
            abstractC20601x = abstractC20601x.mo107093l().mo107105e(this.f87818y).mo107103c();
        }
        if (abstractC20601x.mo107096o() != null && abstractC20601x.mo107096o().mo107125j() > 0) {
            m91980N0(abstractC20601x);
        } else {
            m91938P0(abstractC20601x);
        }
    }

    /* renamed from: H */
    public void mo91432H() {
        AbstractC20110a.m104543l(this.f87809p).mo104548a("create %s", this);
        setClickable(true);
        setLongClickable(true);
        setWillNotDraw(false);
        setUseProgressLoading(true);
        this.f87798M = new C27290d(this.f87802Q);
        this.f87819z = new C17218g(this);
    }

    /* renamed from: H0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m91942Z(C23855s0 c23855s0) {
        if (m91985R(c23855s0)) {
            setZinstantSkeletonView(c23855s0);
        } else {
            setZinstantRootView(c23855s0);
        }
    }

    /* renamed from: I */
    protected void m91971I() {
        m91929A(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.view.g
            public /* synthetic */ C17230g() {
            }

            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZinstantLayout.this.m91939W((C23855s0) obj);
            }
        });
    }

    /* renamed from: I0 */
    public void m91972I0() {
        this.f87786A = false;
        this.f87787B = false;
    }

    /* renamed from: J0 */
    public void m91973J0() {
        onStop();
        removeAllViewsInLayout();
        m91972I0();
        this.f87812s = null;
        this.f87811r = null;
    }

    /* renamed from: K */
    public void m91974K() {
        try {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof ZinstantSliderView) {
                    ((ZinstantSliderView) childAt).m91609J2();
                } else if (childAt instanceof ZinstantView) {
                    childAt.invalidate();
                } else if (childAt instanceof ZinstantLayout) {
                    ((ZinstantLayout) childAt).m91974K();
                } else if (childAt instanceof ZinstantScrollViewImpl) {
                    ((ZinstantScrollViewImpl) childAt).m91562w0();
                } else {
                    childAt.postInvalidate();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K0 */
    public final void m91975K0(Runnable runnable) {
        try {
            if (AbstractC19444a.m101693a()) {
                runnable.run();
            } else {
                m92005v0(runnable);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: L */
    protected void m91976L() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt instanceof InterfaceC29061b) {
                ((InterfaceC29061b) childAt).mo91521y();
            }
        }
    }

    /* renamed from: M */
    public boolean m91977M() {
        return this.f87796K == 0;
    }

    /* renamed from: M0 */
    void m91978M0() {
        if (this.f87814u == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.f87814u = frameLayout;
            frameLayout.setBackgroundColor(Color.parseColor("#1A000000"));
            this.f87814u.setFocusableInTouchMode(true);
            LayoutInflater.from(getContext()).inflate(AbstractC17162k.zinstant_holo_circular_progress_bar, this.f87814u).findViewById(AbstractC17159j.holoCircularProgressBar);
        }
        if (indexOfChild(this.f87814u) == -1) {
            addView(this.f87814u, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: N */
    public boolean m91979N() {
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null && c23855s0.m124621B() && this.f87812s.mo124393a()) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    protected void m91980N0(AbstractC20601x abstractC20601x) {
        C20599v.m107204a().m107219m(abstractC20601x, this.f87806U);
    }

    /* renamed from: O */
    public boolean m91981O(InterfaceC20578a0 interfaceC20578a0) {
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null && c23855s0.m124627H(interfaceC20578a0)) {
            setUseProgressLoading(false);
            m91974K();
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public boolean m91982P() {
        return this.f87796K == 3;
    }

    /* renamed from: Q */
    public boolean m91983Q() {
        return this.f87796K == 2;
    }

    /* renamed from: Q0 */
    protected void m91984Q0(C27291e c27291e) {
        HandlerC22516d handlerC22516d;
        C17222k c17222k;
        if (this.f87802Q != null) {
            this.f87798M.m139703c(new C27293g(getFeatureType(), c27291e, getDelegateID()));
        }
        if (getImpressionMeta() != null && (handlerC22516d = this.f87792G) != null && (c17222k = this.f87793H) != null) {
            handlerC22516d.m116424f(c17222k);
        }
    }

    /* renamed from: R */
    public boolean m91985R(C23855s0 c23855s0) {
        if (c23855s0 != null && c23855s0.m124643h0() == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: R0 */
    void m91986R0() {
        HandlerC22516d handlerC22516d = this.f87792G;
        if (handlerC22516d != null) {
            handlerC22516d.m116422c(this.f87793H);
        }
        this.f87793H = null;
    }

    /* renamed from: S */
    public boolean m91987S() {
        return this.f87796K == 1;
    }

    /* renamed from: S0 */
    public void m91988S0(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        try {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104546o(th2);
        }
    }

    /* renamed from: T */
    public boolean m91989T() {
        if (!m91987S() && !m91983Q()) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public boolean m91990U() {
        return this.f87796K == 4;
    }

    /* renamed from: V */
    public boolean m91991V() {
        if (getZinstantSkeletonRootTree() != null && getZinstantRootTree() == null && getZinstantSkeletonRootTree().m124651z() > 0 && getZinstantSkeletonRootTree().getHeight() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zinstant.view.InterfaceC17225b
    /* renamed from: a */
    public void mo91992a() {
        InterfaceC17225b interfaceC17225b = this.f87817x;
        if (interfaceC17225b != null) {
            interfaceC17225b.mo91992a();
        } else {
            m92008x0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f87795J > 5000) {
                this.f87795J = currentTimeMillis;
                AbstractC20110a.m104543l(this.f87809p).mo104548a("checkImpression from touch event", new Object[0]);
                m92000s();
            }
        }
        if (motionEvent.getAction() == 0) {
            View focusedChild = getFocusedChild();
            if ((focusedChild instanceof ZinstantInputText) && !((ZinstantInputText) focusedChild).getGlobalZOMRect().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                C17193e.f87755a.m91802a(focusedChild);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: f */
    public boolean mo91512f(String str, String str2, int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            KeyEvent.Callback childAt = getChildAt(i12);
            if ((childAt instanceof InterfaceC29061b) && ((InterfaceC29061b) childAt).mo91512f(str, str2, i11)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    public void m91993g0() {
        m92000s();
        m91952f0();
        m91971I();
    }

    public List<InterfaceC29061b> getAllChildZINSComponent() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt instanceof InterfaceC29061b) {
                arrayList.add((InterfaceC29061b) childAt);
            }
        }
        return arrayList;
    }

    @Override // com.zing.zalo.zinstant.view.InterfaceC17225b
    public InterfaceC17224a getContextProvider() {
        InterfaceC17225b interfaceC17225b = this.f87817x;
        if (interfaceC17225b != null) {
            return interfaceC17225b.getContextProvider();
        }
        return this.f87816w;
    }

    public String getCurrentLocale() {
        return AbstractC17158i1.f87698h;
    }

    public int getCurrentTheme() {
        return AbstractC17158i1.m91746e();
    }

    @Override // com.zing.zalo.zinstant.view.InterfaceC17225b
    public String getDelegateID() {
        InterfaceC17225b interfaceC17225b = this.f87817x;
        if (interfaceC17225b != null) {
            return interfaceC17225b.getDelegateID();
        }
        try {
            String delegateID = this.f87812s.getDelegateID();
            if (delegateID != null) {
                this.f87797L = delegateID;
            }
            return delegateID;
        } catch (Exception unused) {
            return this.f87797L;
        }
    }

    @Override // com.zing.zalo.zinstant.view.InterfaceC17225b
    public int getFeatureType() {
        InterfaceC17225b interfaceC17225b = this.f87817x;
        if (interfaceC17225b != null) {
            return interfaceC17225b.getFeatureType();
        }
        InterfaceC22508f zinstantDataModel = getZinstantDataModel();
        if (zinstantDataModel != null) {
            return zinstantDataModel.getFeatureType();
        }
        return 0;
    }

    @Override // wj0.InterfaceC29061b
    public abstract /* synthetic */ ZOMRect getGlobalZOMRect();

    protected ImpressionMeta getImpressionMeta() {
        C23855s0 zinstantRootTree = getZinstantRootTree();
        if (zinstantRootTree != null) {
            return zinstantRootTree.mo124399g();
        }
        return null;
    }

    @Override // com.zing.zalo.zinstant.view.InterfaceC17225b
    public String getOriginalId() {
        InterfaceC17225b interfaceC17225b = this.f87817x;
        if (interfaceC17225b != null) {
            return interfaceC17225b.getOriginalId();
        }
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null) {
            return c23855s0.getOriginalId();
        }
        return null;
    }

    public int getPreferredHeight() {
        int mo72953m;
        InterfaceC17224a interfaceC17224a = this.f87816w;
        if (interfaceC17224a != null && (mo72953m = interfaceC17224a.mo72953m()) > 0) {
            return mo72953m;
        }
        return -1;
    }

    public int getPreferredWidth() {
        int mo35797c;
        InterfaceC17224a interfaceC17224a = this.f87816w;
        if (interfaceC17224a != null && (mo35797c = interfaceC17224a.mo35797c()) > 0) {
            return mo35797c;
        }
        return getWidth();
    }

    @Override // wj0.InterfaceC29061b
    public View getView() {
        return this;
    }

    @Override // wj0.InterfaceC29061b
    public ZOM getZINSNode() {
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null) {
            return c23855s0.f115177a;
        }
        return null;
    }

    public InterfaceC22508f getZinstantDataModel() {
        return this.f87815v;
    }

    public C23855s0 getZinstantRootTree() {
        return this.f87812s;
    }

    public C23855s0 getZinstantSkeletonRootTree() {
        return this.f87811r;
    }

    /* renamed from: h0 */
    public void mo91672h0(int i11) {
    }

    /* renamed from: i0 */
    public void mo91434i0(AbstractC20601x abstractC20601x, Exception exc) {
    }

    /* renamed from: j0 */
    protected void m91994j0(InterfaceC20578a0 interfaceC20578a0) {
        C23855s0 m124606T = C23855s0.m124606T(interfaceC20578a0);
        if (m124606T != null) {
            mo91673k0(m124606T);
        }
    }

    /* renamed from: k0 */
    public void mo91673k0(C23855s0 c23855s0) {
        m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.h

            /* renamed from: q */
            public final /* synthetic */ C23855s0 f87888q;

            public /* synthetic */ RunnableC17231h(C23855s0 c23855s02) {
                r2 = c23855s02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantLayout.this.m91941Y(r2);
            }
        });
        m91938P0(null);
    }

    /* renamed from: m0 */
    public void m91995m0() {
        m91959l0(false);
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: n */
    public void mo91515n() {
        m91964C();
    }

    /* renamed from: n0 */
    protected void m91996n0(boolean z11) {
        ZOMDocument zOMDocument;
        C23855s0 zinstantRootTree = getZinstantRootTree();
        if (zinstantRootTree != null) {
            zOMDocument = zinstantRootTree.mo124396d();
        } else {
            zOMDocument = null;
        }
        if (zOMDocument != null) {
            zOMDocument.onScrollStateChanged(z11 ? 1 : 0);
        }
    }

    /* renamed from: o0 */
    protected void m91997o0(AbstractC20601x abstractC20601x, Exception exc) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m91988S0(this);
        super.onDetachedFromWindow();
        m91929A(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.view.e
            public /* synthetic */ C17228e() {
            }

            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZinstantLayout.this.m91940X((C23855s0) obj);
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null && c23855s0.m124631S() && !this.f87794I.isRunning()) {
            m91952f0();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m91988S0(this);
        try {
            m91930B();
        } catch (Exception e11) {
            if (this.f87806U != null) {
                this.f87806U.mo61858b(this.f87810q, e11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof InterfaceC29061b) {
                ZOMRect globalZOMRect = ((InterfaceC29061b) childAt).getGlobalZOMRect();
                if (globalZOMRect != null) {
                    childAt.layout(globalZOMRect.left, globalZOMRect.top, globalZOMRect.right, globalZOMRect.bottom);
                }
            } else if (childAt.getVisibility() != 8) {
                if (childAt == this.f87813t) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int i18 = i13 - i11;
                    int i19 = i14 - i12;
                    int i21 = layoutParams.width;
                    int i22 = layoutParams.height;
                    if (i18 >= i21) {
                        i15 = (i18 / 2) - (i21 / 2);
                    } else {
                        i15 = 0;
                    }
                    if (i18 >= i21) {
                        i21 = (i21 / 2) + (i18 / 2);
                    }
                    if (i19 >= i22) {
                        i16 = (i19 / 2) - (i22 / 2);
                    } else {
                        i16 = 0;
                    }
                    if (i19 >= i22) {
                        i22 = (i22 / 2) + (i19 / 2);
                    }
                    childAt.layout(i15, i16, i21, i22);
                } else {
                    childAt.layout(0, 0, i13 - i11, i14 - i12);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(c23855s0.m124651z(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f87812s.getHeight(), 1073741824));
            setMeasuredDimension(this.f87812s.m124651z(), this.f87812s.getHeight());
        } else {
            super.onMeasure(i11, i12);
        }
    }

    public void onPause() {
        m91959l0(true);
    }

    public void onResume() {
        if (m91977M() || m91990U()) {
            onStart();
        }
        if (m91987S() || m91982P()) {
            AbstractC20110a.m104543l(this.f87809p).mo104548a("setLifeCycle: %s (was %s) - %s", 2, Integer.valueOf(this.f87796K), this);
            this.f87796K = 2;
            this.f87819z.m92051m();
            m92001s0();
        }
    }

    public void onStart() {
        if (m91977M() || m91990U()) {
            AbstractC20110a.m104543l(this.f87809p).mo104548a("setLifeCycle: %s (was %s) - %s", 1, Integer.valueOf(this.f87796K), this);
            this.f87796K = 1;
            m92002t0();
        }
        onResume();
    }

    public void onStop() {
        if (m91983Q()) {
            onPause();
        }
        if (m91982P() || m91987S()) {
            AbstractC20110a.m104543l(this.f87809p).mo104548a("setLifeCycle: %s (was %s) - %s", 4, Integer.valueOf(this.f87796K), this);
            this.f87796K = 4;
            mo92003u0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if ((view instanceof InterfaceC29061b) && m91989T()) {
            InterfaceC29061b interfaceC29061b = (InterfaceC29061b) view;
            interfaceC29061b.onStart();
            interfaceC29061b.onResume();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        m91952f0();
    }

    /* renamed from: p0 */
    protected void m91998p0(InterfaceC20578a0 interfaceC20578a0) {
        C23855s0 m124606T = C23855s0.m124606T(interfaceC20578a0);
        if (m124606T != null) {
            m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.l

                /* renamed from: q */
                public final /* synthetic */ C23855s0 f87896q;

                public /* synthetic */ RunnableC17235l(C23855s0 m124606T2) {
                    r2 = m124606T2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantLayout.this.m91942Z(r2);
                }
            });
        }
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: q */
    public void mo91517q(AbstractC23838k1 abstractC23838k1) {
        m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.i

            /* renamed from: q */
            public final /* synthetic */ AbstractC23838k1 f87890q;

            public /* synthetic */ RunnableC17232i(AbstractC23838k1 abstractC23838k12) {
                r2 = abstractC23838k12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantLayout.this.m91945b0(r2);
            }
        });
    }

    /* renamed from: q0 */
    public void m91999q0(String str, String str2) {
        C23855s0 zinstantRootTree = getZinstantRootTree();
        if (zinstantRootTree != null) {
            zinstantRootTree.m124638b0(str, str2);
        }
    }

    /* renamed from: r */
    protected boolean mo91674r() {
        return false;
    }

    /* renamed from: s */
    public void m92000s() {
        ImpressionMeta impressionMeta = getImpressionMeta();
        if (impressionMeta != null && impressionMeta.isOnlyInterval()) {
            return;
        }
        mo91515n();
    }

    /* renamed from: s0 */
    protected void m92001s0() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt instanceof InterfaceC29061b) {
                ((InterfaceC29061b) childAt).onResume();
            }
        }
        post(new Runnable() { // from class: com.zing.zalo.zinstant.view.f
            public /* synthetic */ RunnableC17229f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantLayout.this.m91947c0();
            }
        });
    }

    public void setContextProvider(InterfaceC17224a interfaceC17224a) {
        this.f87816w = interfaceC17224a;
    }

    public void setCustomCachePath(String str) {
        this.f87818y = str;
    }

    public void setExternal(InterfaceC17225b interfaceC17225b) {
        this.f87817x = interfaceC17225b;
    }

    public void setExternalScriptListener(InterfaceC24787m interfaceC24787m) {
        this.f87788C.m128802d(interfaceC24787m);
    }

    public void setImageLoader(InterfaceC24289f interfaceC24289f) {
        this.f87800O = interfaceC24289f;
    }

    public void setImpressionQueue(C27290d c27290d) {
        this.f87798M = c27290d;
    }

    public void setInteractionTracker(InterfaceC27292f interfaceC27292f) {
        this.f87802Q = interfaceC27292f;
        C27290d c27290d = this.f87798M;
        if (c27290d != null) {
            c27290d.m139704e(interfaceC27292f);
        }
    }

    public void setLayoutGateway(InterfaceC17139d interfaceC17139d) {
        this.f87804S = interfaceC17139d;
    }

    public void setOnClickListener(InterfaceC24284a interfaceC24284a) {
        this.f87801P.m92036g(interfaceC24284a);
    }

    public void setUseProgressLoading(boolean z11) {
        if (!z11) {
            setBackgroundResource(0);
            removeView(this.f87813t);
            return;
        }
        ProgressBar progressBar = this.f87813t;
        if (progressBar == null || progressBar.getParent() != this) {
            ProgressBar progressBar2 = this.f87813t;
            if (progressBar2 == null) {
                this.f87813t = (ProgressBar) LayoutInflater.from(getContext()).inflate(AbstractC17162k.zinstant_holo_circular_progress_bar, this).findViewById(AbstractC17159j.holoCircularProgressBar);
            } else {
                if (progressBar2.getParent() != null) {
                    ((ViewGroup) this.f87813t.getParent()).removeView(this.f87813t);
                }
                addView(this.f87813t);
            }
        }
        if (this.f87813t.getVisibility() != 0) {
            this.f87813t.setVisibility(0);
        }
    }

    public void setZinstantDataModel(InterfaceC22508f interfaceC22508f) {
        this.f87815v = interfaceC22508f;
    }

    public void setZinstantRootView(C23855s0 c23855s0) {
        if (!m91981O(c23855s0)) {
            return;
        }
        if (c23855s0 != null) {
            this.f87786A = true;
            if (this.f87787B || getZinstantSkeletonRootTree() != null) {
                removeAllViewsInLayout();
            }
        }
        setBackgroundResource(0);
        setUseProgressLoading(false);
        if (c23855s0 == null) {
            if (this.f87787B) {
                removeAllViewsInLayout();
            }
            setUseProgressLoading(true);
            return;
        }
        this.f87812s = c23855s0;
        m91971I();
        ZinstantView zinstantView = new ZinstantView(getContext());
        C24783i m91514m = zinstantView.m91514m(this.f87812s, this.f87805T);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(m91514m.f119015a, m91514m.f119016b);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = m91514m.f119015a;
            layoutParams2.height = m91514m.f119016b;
        }
        addView(zinstantView, 0, layoutParams);
        Set<AbstractC23838k1> m124649w = this.f87812s.m124649w();
        if (m124649w != null && m124649w.size() > 0) {
            for (AbstractC23838k1 abstractC23838k1 : m124649w) {
                if (abstractC23838k1 != null) {
                    m91943a0(abstractC23838k1);
                }
            }
        }
        if (m91989T()) {
            m91965C0();
        }
    }

    public void setZinstantSkeletonView(C23855s0 c23855s0) {
        ZinstantView zinstantView;
        if ((!m91985R(c23855s0) || m91981O(c23855s0)) && !this.f87786A && getZinstantRootTree() == null) {
            removeAllViewsInLayout();
            setBackgroundResource(0);
            setUseProgressLoading(false);
            this.f87811r = c23855s0;
            if (c23855s0 == null) {
                setUseProgressLoading(true);
                return;
            }
            if ((c23855s0.f115179c instanceof C23859u0) && c23855s0.m124621B()) {
                C23855s0 c23855s02 = this.f87811r;
                zinstantView = new ZinstantShimmerView(getContext(), (C23859u0) c23855s02.f115179c, c23855s02.mo124394b());
                addView(new C17219h(getContext(), c23855s02, zinstantView), 0);
            } else {
                zinstantView = new ZinstantView(getContext());
            }
            C24783i m91514m = zinstantView.m91514m(this.f87811r, this.f87805T);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(m91514m.f119015a, m91514m.f119016b);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = m91514m.f119015a;
                layoutParams2.height = m91514m.f119016b;
            }
            addView(zinstantView, 1, layoutParams);
            this.f87787B = true;
        }
    }

    public void setZinstantViewRequestListener(C20588k c20588k) {
        this.f87806U.m107136f(c20588k);
    }

    /* renamed from: t0 */
    protected void m92002t0() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt instanceof InterfaceC29061b) {
                ((InterfaceC29061b) childAt).onStart();
            }
        }
        m91952f0();
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: u */
    public boolean mo91519u(String str) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if ((childAt instanceof InterfaceC29061b) && ((InterfaceC29061b) childAt).mo91519u(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u0 */
    public void mo92003u0() {
        HandlerC22516d handlerC22516d;
        m91937O0();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt instanceof InterfaceC29061b) {
                ((InterfaceC29061b) childAt).onStop();
            }
        }
        C17222k c17222k = this.f87793H;
        if (c17222k != null && (handlerC22516d = this.f87792G) != null) {
            handlerC22516d.m116422c(c17222k);
        }
        Handler handler = this.f87791F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m91986R0();
    }

    /* renamed from: v */
    public InterfaceC29061b m92004v(C23813c0 c23813c0) {
        InterfaceC29061b m124590W0 = c23813c0.m124590W0(this);
        if (!(m124590W0 instanceof ZinstantInputText)) {
            return new ZinstantInputText(getContext(), c23813c0, this.f87805T);
        }
        return m124590W0;
    }

    /* renamed from: v0 */
    protected final void m92005v0(Runnable runnable) {
        try {
            this.f87791F.post(runnable);
        } catch (Exception unused) {
        }
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: w */
    public void mo91520w(C23855s0 c23855s0, AbstractC23838k1 abstractC23838k1) {
        m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.view.j

            /* renamed from: q */
            public final /* synthetic */ AbstractC23838k1 f87892q;

            public /* synthetic */ RunnableC17233j(AbstractC23838k1 abstractC23838k12) {
                r2 = abstractC23838k12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantLayout.this.m91943a0(r2);
            }
        });
    }

    /* renamed from: w0 */
    public boolean m92006w0(EnumC20598u enumC20598u) {
        InterfaceC22508f zinstantDataModel = getZinstantDataModel();
        if (zinstantDataModel != null) {
            if (!(zinstantDataModel instanceof C22505c) || zinstantDataModel.mo116352b(enumC20598u)) {
                return mo91675y0(enumC20598u);
            }
            return false;
        }
        return false;
    }

    /* renamed from: x */
    protected InterfaceC29061b m92007x(C23857t0 c23857t0) {
        InterfaceC29061b m124590W0 = c23857t0.m124590W0(this);
        if (!(m124590W0 instanceof ZinstantScrollViewImpl)) {
            m124590W0 = new ZinstantScrollViewImpl(getContext());
        }
        ZinstantScrollViewImpl zinstantScrollViewImpl = (ZinstantScrollViewImpl) m124590W0;
        zinstantScrollViewImpl.setInteractionTracker(this.f87802Q);
        zinstantScrollViewImpl.setImageLoader(this.f87805T.mo92024c());
        zinstantScrollViewImpl.setLayoutGateway(this.f87805T.mo92023b());
        zinstantScrollViewImpl.setOnClickListener(this.f87801P.f87840a);
        zinstantScrollViewImpl.m91561v0(this, c23857t0);
        return zinstantScrollViewImpl;
    }

    /* renamed from: x0 */
    public boolean m92008x0() {
        return mo91675y0(EnumC20598u.DEFAULT);
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: y */
    public void mo91521y() {
        m91976L();
    }

    /* renamed from: y0 */
    public boolean mo91675y0(EnumC20598u enumC20598u) {
        String str;
        InterfaceC22508f zinstantDataModel = getZinstantDataModel();
        InterfaceC17224a contextProvider = getContextProvider();
        if (contextProvider != null) {
            str = contextProvider.mo44290l();
        } else {
            str = null;
        }
        if (zinstantDataModel == null) {
            return false;
        }
        if (zinstantDataModel instanceof C22505c) {
            m91969G0(AbstractC20601x.m107225c(AbstractC20595r.m107194b((C22505c) zinstantDataModel).mo107049a()).mo107107g(getFeatureType()).mo107106f(enumC20598u).mo107112l(AbstractC20601x.b.m107228a(getPreferredWidth(), getCurrentTheme()).mo107129d(getCurrentLocale()).mo107126a()).mo107108h(str).mo107105e(this.f87818y).mo107109i(mo91674r()).mo107104d(getZinstantRootTree()).mo107103c());
            return true;
        }
        if (!(zinstantDataModel instanceof C22504b)) {
            return false;
        }
        m91969G0(AbstractC20601x.m107226d(AbstractC20597t.m107199b((C22504b) zinstantDataModel, this.f87818y, str).mo107081a()).mo107107g(getFeatureType()).mo107106f(enumC20598u).mo107112l(AbstractC20601x.b.m107228a(getPreferredWidth(), getCurrentTheme()).mo107129d(getCurrentLocale()).mo107126a()).mo107108h(str).mo107105e(this.f87818y).mo107109i(mo91674r()).mo107104d(getZinstantRootTree()).mo107103c());
        return true;
    }

    /* renamed from: z */
    protected InterfaceC29061b m92009z(C23869z0 c23869z0) {
        InterfaceC29061b m124590W0 = c23869z0.m124590W0(this);
        if (!(m124590W0 instanceof ZinstantSliderView)) {
            return new ZinstantSliderView(getContext(), c23869z0, this.f87805T);
        }
        return m124590W0;
    }

    /* renamed from: z0 */
    public void mo91437z0() {
    }

    public ZinstantLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87809p = getClass().getSimpleName();
        this.f87817x = null;
        this.f87818y = null;
        this.f87819z = null;
        this.f87786A = false;
        this.f87787B = false;
        this.f87788C = new C17213b();
        this.f87789D = new C17214c();
        this.f87790E = new C17215d();
        this.f87791F = new HandlerC17216e(Looper.getMainLooper());
        this.f87792G = null;
        this.f87793H = null;
        this.f87794I = new C17217f();
        this.f87795J = 0L;
        this.f87796K = 0;
        this.f87797L = null;
        this.f87799N = new Rect();
        this.f87801P = new C17223l();
        this.f87803R = new C17220i();
        this.f87805T = new C17221j();
        this.f87806U = new C17212a();
        this.f87807V = new C22518f();
        this.f87808W = new Object();
        mo91432H();
    }

    public ZinstantLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f87809p = getClass().getSimpleName();
        this.f87817x = null;
        this.f87818y = null;
        this.f87819z = null;
        this.f87786A = false;
        this.f87787B = false;
        this.f87788C = new C17213b();
        this.f87789D = new C17214c();
        this.f87790E = new C17215d();
        this.f87791F = new HandlerC17216e(Looper.getMainLooper());
        this.f87792G = null;
        this.f87793H = null;
        this.f87794I = new C17217f();
        this.f87795J = 0L;
        this.f87796K = 0;
        this.f87797L = null;
        this.f87799N = new Rect();
        this.f87801P = new C17223l();
        this.f87803R = new C17220i();
        this.f87805T = new C17221j();
        this.f87806U = new C17212a();
        this.f87807V = new C22518f();
        this.f87808W = new Object();
        mo91432H();
    }
}
