package com.zing.zalo.p077ui.mediastore;

import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import ci.C3514m;
import ci.C3516n;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17454d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import id0.C20516b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C24003n;
import p716zh.C31973j5;
import pm0.C24848g0;
import qm0.AbstractC25332a0;

/* loaded from: classes6.dex */
public final class MediaStorePopulatePage extends FrameLayout {
    public static final C12299a Companion = new C12299a(null);

    /* renamed from: N */
    private static int f64038N = 4;

    /* renamed from: A */
    private boolean f64039A;

    /* renamed from: B */
    private int f64040B;

    /* renamed from: C */
    private Handler f64041C;

    /* renamed from: D */
    private C12063c.a f64042D;

    /* renamed from: E */
    private InterfaceC12300b f64043E;

    /* renamed from: F */
    private int f64044F;

    /* renamed from: G */
    private List f64045G;

    /* renamed from: H */
    private List f64046H;

    /* renamed from: I */
    private List f64047I;

    /* renamed from: J */
    private final List f64048J;

    /* renamed from: K */
    private boolean f64049K;

    /* renamed from: L */
    private C16719g.c f64050L;

    /* renamed from: M */
    private boolean f64051M;

    /* renamed from: p */
    private C23528a f64052p;

    /* renamed from: q */
    private DragToCloseLayout f64053q;

    /* renamed from: r */
    private C22126c0 f64054r;

    /* renamed from: s */
    private ModulesView f64055s;

    /* renamed from: t */
    private RobotoTextView f64056t;

    /* renamed from: u */
    private C21693c[] f64057u;

    /* renamed from: v */
    private int[] f64058v;

    /* renamed from: w */
    private C3977j[] f64059w;

    /* renamed from: x */
    private Drawable[] f64060x;

    /* renamed from: y */
    private View f64061y;

    /* renamed from: z */
    private C3977j f64062z;

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePopulatePage$a */
    /* loaded from: classes6.dex */
    public static final class C12299a {
        private C12299a() {
        }

        public /* synthetic */ C12299a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePopulatePage$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12300b {
        /* renamed from: a */
        List mo67229a();

        /* renamed from: b */
        void mo67230b();

        /* renamed from: c */
        String mo67231c();
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePopulatePage$c */
    /* loaded from: classes6.dex */
    public static final class C12301c implements DragToCloseLayout.InterfaceC16432a {

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePopulatePage$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ MediaStorePopulatePage f64064p;

            a(MediaStorePopulatePage mediaStorePopulatePage) {
                this.f64064p = mediaStorePopulatePage;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                C12063c.a mDelegate = this.f64064p.getMDelegate();
                if (mDelegate != null) {
                    mDelegate.mo66808Al(null, this.f64064p.f64044F);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePopulatePage$c$b */
        /* loaded from: classes6.dex */
        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ MediaStorePopulatePage f64065p;

            b(MediaStorePopulatePage mediaStorePopulatePage) {
                this.f64065p = mediaStorePopulatePage;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                C12063c.a mDelegate = this.f64065p.getMDelegate();
                if (mDelegate != null) {
                    mDelegate.mo66883sn(null, this.f64065p.f64044F);
                }
                View view = this.f64065p.f64061y;
                if (view != null) {
                    view.setAlpha(1.0f);
                }
            }
        }

        C12301c() {
        }

        /* renamed from: c */
        public static final void m69138c(MediaStorePopulatePage mediaStorePopulatePage, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            DragToCloseLayout dragToCloseLayout = mediaStorePopulatePage.f64053q;
            if (dragToCloseLayout != null) {
                dragToCloseLayout.setTranslationY(intValue);
            }
            mediaStorePopulatePage.setBackgroundViewAlpha(intValue);
        }

        /* renamed from: d */
        public static final void m69139d(MediaStorePopulatePage mediaStorePopulatePage, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            DragToCloseLayout dragToCloseLayout = mediaStorePopulatePage.f64053q;
            if (dragToCloseLayout != null) {
                dragToCloseLayout.setTranslationY(intValue);
            }
            mediaStorePopulatePage.setBackgroundViewAlpha(intValue);
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: Dg */
        public void mo38328Dg(float f11) {
            MediaStorePopulatePage.this.setBackgroundViewAlpha((int) f11);
            C12063c.a mDelegate = MediaStorePopulatePage.this.getMDelegate();
            if (mDelegate != null) {
                mDelegate.mo66875ns(null, MediaStorePopulatePage.this.f64044F);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: x70.e1.<init>(com.zing.zalo.ui.mediastore.MediaStorePopulatePage):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: EC */
        public void mo38329EC(boolean r5) {
            /*
                r4 = this;
                r0 = 200(0xc8, double:9.9E-322)
                r2 = 0
                if (r5 != 0) goto L54
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage r5 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.this     // Catch: java.lang.Exception -> L13
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r5 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.m69119k(r5)     // Catch: java.lang.Exception -> L13
                if (r5 == 0) goto L16
                float r5 = r5.getTranslationY()     // Catch: java.lang.Exception -> L13
                int r5 = (int) r5     // Catch: java.lang.Exception -> L13
                goto L17
            L13:
                r5 = move-exception
                goto L88
            L16:
                r5 = 0
            L17:
                if (r5 >= 0) goto L27
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage r3 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.this     // Catch: java.lang.Exception -> L13
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r3 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.m69119k(r3)     // Catch: java.lang.Exception -> L13
                if (r3 == 0) goto L25
                int r2 = r3.getHeight()     // Catch: java.lang.Exception -> L13
            L25:
                int r2 = -r2
                goto L33
            L27:
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage r3 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.this     // Catch: java.lang.Exception -> L13
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r3 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.m69119k(r3)     // Catch: java.lang.Exception -> L13
                if (r3 == 0) goto L33
                int r2 = r3.getHeight()     // Catch: java.lang.Exception -> L13
            L33:
                int[] r5 = new int[]{r5, r2}     // Catch: java.lang.Exception -> L13
                android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofInt(r5)     // Catch: java.lang.Exception -> L13
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage r2 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.this     // Catch: java.lang.Exception -> L13
                r5.setDuration(r0)     // Catch: java.lang.Exception -> L13
                x70.e1 r0 = new x70.e1     // Catch: java.lang.Exception -> L13
                r0.<init>()     // Catch: java.lang.Exception -> L13
                r5.addUpdateListener(r0)     // Catch: java.lang.Exception -> L13
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage$c$a r0 = new com.zing.zalo.ui.mediastore.MediaStorePopulatePage$c$a     // Catch: java.lang.Exception -> L13
                r0.<init>(r2)     // Catch: java.lang.Exception -> L13
                r5.addListener(r0)     // Catch: java.lang.Exception -> L13
                r5.start()     // Catch: java.lang.Exception -> L13
                goto L8b
            L54:
                r5 = 2
                int[] r5 = new int[r5]     // Catch: java.lang.Exception -> L13
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage r3 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.this     // Catch: java.lang.Exception -> L13
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r3 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.m69119k(r3)     // Catch: java.lang.Exception -> L13
                if (r3 == 0) goto L65
                float r3 = r3.getTranslationY()     // Catch: java.lang.Exception -> L13
                int r3 = (int) r3     // Catch: java.lang.Exception -> L13
                goto L66
            L65:
                r3 = 0
            L66:
                r5[r2] = r3     // Catch: java.lang.Exception -> L13
                r3 = 1
                r5[r3] = r2     // Catch: java.lang.Exception -> L13
                android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofInt(r5)     // Catch: java.lang.Exception -> L13
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage r2 = com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.this     // Catch: java.lang.Exception -> L13
                r5.setDuration(r0)     // Catch: java.lang.Exception -> L13
                x70.f1 r0 = new x70.f1     // Catch: java.lang.Exception -> L13
                r0.<init>()     // Catch: java.lang.Exception -> L13
                r5.addUpdateListener(r0)     // Catch: java.lang.Exception -> L13
                com.zing.zalo.ui.mediastore.MediaStorePopulatePage$c$b r0 = new com.zing.zalo.ui.mediastore.MediaStorePopulatePage$c$b     // Catch: java.lang.Exception -> L13
                r0.<init>(r2)     // Catch: java.lang.Exception -> L13
                r5.addListener(r0)     // Catch: java.lang.Exception -> L13
                r5.start()     // Catch: java.lang.Exception -> L13
                goto L8b
            L88:
                mm0.AbstractC23350e.m122778h(r5)
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage.C12301c.mo38329EC(boolean):void");
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: f2 */
        public void mo38330f2() {
            C12063c.a mDelegate = MediaStorePopulatePage.this.getMDelegate();
            if (mDelegate != null) {
                mDelegate.mo66872mF(null, MediaStorePopulatePage.this.f64044F);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePopulatePage$d */
    /* loaded from: classes6.dex */
    public static final class C12302d implements C3516n.a {
        C12302d() {
        }

        @Override // ci.C3516n.a
        /* renamed from: a */
        public void mo17761a(C3514m c3514m) {
            try {
                try {
                    List list = MediaStorePopulatePage.this.f64048J;
                    MediaStorePopulatePage mediaStorePopulatePage = MediaStorePopulatePage.this;
                    synchronized (list) {
                        try {
                            mediaStorePopulatePage.f64048J.clear();
                            mediaStorePopulatePage.f64040B = 0;
                            if (c3514m != null) {
                                mediaStorePopulatePage.f64048J.addAll(c3514m.m17755a());
                                mediaStorePopulatePage.f64040B = c3514m.m17756b();
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                MediaStorePopulatePage.this.setLoadingDataFromMediaStore(false);
                MediaStorePopulatePage.this.f64049K = true;
                MediaStorePopulatePage.this.f64041C.sendEmptyMessage(1);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStorePopulatePage(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f64052p = new C23528a(getContext());
        int i11 = f64038N;
        this.f64057u = new C21693c[i11];
        this.f64058v = new int[i11];
        this.f64059w = new C3977j[i11];
        this.f64060x = new Drawable[i11];
        this.f64041C = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: x70.a1
            public /* synthetic */ C29399a1() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m69106E;
                m69106E = MediaStorePopulatePage.m69106E(MediaStorePopulatePage.this, message);
                return m69106E;
            }
        });
        this.f64048J = new ArrayList();
        this.f64050L = new C16719g.c() { // from class: x70.b1
            public /* synthetic */ C29402b1() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MediaStorePopulatePage.m69107F(MediaStorePopulatePage.this, c16719g);
            }
        };
    }

    /* renamed from: A */
    public static final void m69103A(MediaStorePopulatePage mediaStorePopulatePage) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        C21693c c21693c = mediaStorePopulatePage.f64057u[2];
        if (c21693c != null) {
            c21693c.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
        }
    }

    /* renamed from: C */
    public static final void m69104C(MediaStorePopulatePage mediaStorePopulatePage, View view) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        if (mediaStorePopulatePage.f64043E != null) {
            if (mediaStorePopulatePage.f64044F == 0) {
                AbstractC23647d.m123897g("900144044");
            } else {
                AbstractC23647d.m123897g("900144045");
            }
            InterfaceC12300b interfaceC12300b = mediaStorePopulatePage.f64043E;
            AbstractC19074t.m100205c(interfaceC12300b);
            interfaceC12300b.mo67230b();
        }
    }

    /* renamed from: D */
    private final void m69105D() {
        String str;
        if (this.f64051M) {
            return;
        }
        InterfaceC12300b interfaceC12300b = this.f64043E;
        if (interfaceC12300b != null) {
            AbstractC19074t.m100205c(interfaceC12300b);
            str = interfaceC12300b.mo67231c();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f64051M = true;
        C3516n.f14745a.m17760c(str, new C12302d());
    }

    /* renamed from: E */
    public static final boolean m69106E(MediaStorePopulatePage mediaStorePopulatePage, Message message) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        int i11 = message.what;
        if (i11 == 1) {
            mediaStorePopulatePage.m69134s(mediaStorePopulatePage.f64044F);
        } else if (i11 == 2) {
            mediaStorePopulatePage.f64039A = false;
        }
        return false;
    }

    /* renamed from: F */
    public static final void m69107F(MediaStorePopulatePage mediaStorePopulatePage, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        if (mediaStorePopulatePage.f64043E != null) {
            if (mediaStorePopulatePage.f64044F == 0) {
                AbstractC23647d.m123897g("900144046");
            } else {
                AbstractC23647d.m123897g("900144047");
            }
            InterfaceC12300b interfaceC12300b = mediaStorePopulatePage.f64043E;
            AbstractC19074t.m100205c(interfaceC12300b);
            interfaceC12300b.mo67230b();
        }
    }

    /* renamed from: I */
    public static final void m69108I(MediaStorePopulatePage mediaStorePopulatePage) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        try {
            mediaStorePopulatePage.m69134s(mediaStorePopulatePage.f64044F);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: v */
    public static final void m69126v(MediaStorePopulatePage mediaStorePopulatePage) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        C21693c c21693c = mediaStorePopulatePage.f64057u[1];
        if (c21693c != null) {
            c21693c.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
        }
    }

    /* renamed from: w */
    public static final void m69127w(MediaStorePopulatePage mediaStorePopulatePage) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        C21693c c21693c = mediaStorePopulatePage.f64057u[3];
        if (c21693c != null) {
            c21693c.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
        }
    }

    /* renamed from: x */
    public static final void m69128x(MediaStorePopulatePage mediaStorePopulatePage) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        C21693c c21693c = mediaStorePopulatePage.f64057u[2];
        if (c21693c != null) {
            c21693c.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
        }
    }

    /* renamed from: y */
    public static final void m69129y(MediaStorePopulatePage mediaStorePopulatePage) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        C21693c c21693c = mediaStorePopulatePage.f64057u[0];
        if (c21693c != null) {
            c21693c.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
        }
    }

    /* renamed from: z */
    public static final void m69130z(MediaStorePopulatePage mediaStorePopulatePage) {
        AbstractC19074t.m100208f(mediaStorePopulatePage, "this$0");
        C21693c c21693c = mediaStorePopulatePage.f64057u[3];
        if (c21693c != null) {
            c21693c.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
        }
    }

    /* renamed from: B */
    public final void m69131B() {
        boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.layout_media_store_populate, this);
        DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) findViewById(AbstractC6918a0.layout_container);
        this.f64053q = dragToCloseLayout;
        if (dragToCloseLayout != null) {
            dragToCloseLayout.setDirection(2);
        }
        this.f64055s = (ModulesView) findViewById(AbstractC6918a0.mdv_group_photo);
        this.f64056t = (RobotoTextView) findViewById(AbstractC6918a0.btn_open_media_store);
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        this.f64062z = new C3977j(context);
        if (AbstractC23136l9.m118685X() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m118712h = AbstractC23136l9.m118712h(context, 276.0f);
        if (z11) {
            f11 = 80.0f;
        } else {
            f11 = 56.0f;
        }
        int m118712h2 = AbstractC23136l9.m118712h(context, f11);
        if (z11) {
            f12 = 140.0f;
        } else {
            f12 = 100.0f;
        }
        int m118712h3 = AbstractC23136l9.m118712h(context, f12);
        if (z11) {
            f13 = 66.0f;
        } else {
            f13 = 48.0f;
        }
        int m118712h4 = AbstractC23136l9.m118712h(context, f13);
        if (z11) {
            f14 = 114.0f;
        } else {
            f14 = 82.0f;
        }
        int m118712h5 = AbstractC23136l9.m118712h(context, f14);
        if (z11) {
            f15 = 7.2f;
        } else {
            f15 = 5.2f;
        }
        int m118712h6 = AbstractC23136l9.m118712h(context, f15);
        if (z11) {
            f16 = 8.0f;
        } else {
            f16 = 4.0f;
        }
        int m118712h7 = AbstractC23136l9.m118712h(context, f16);
        int i11 = (m118712h - ((((m118712h7 * 2) + m118712h2) + m118712h4) + m118712h5)) / 2;
        int m118712h8 = AbstractC23136l9.m118712h(context, 24.0f);
        if (z11) {
            f17 = 64.0f;
        } else {
            f17 = 40.0f;
        }
        int m118712h9 = AbstractC23136l9.m118712h(context, f17);
        int[] iArr = this.f64058v;
        int i12 = AbstractC16803z.media_store_populate_stock_picture;
        iArr[0] = i12;
        iArr[1] = AbstractC16803z.media_store_populate_stock_search;
        iArr[2] = AbstractC16803z.media_store_populate_stock_idea;
        iArr[3] = AbstractC16803z.media_store_populate_stock_cat;
        this.f64060x[0] = AbstractC23136l9.m118665N(context, i12);
        this.f64060x[1] = AbstractC23136l9.m118665N(context, this.f64058v[1]);
        this.f64060x[2] = AbstractC23136l9.m118665N(context, this.f64058v[2]);
        this.f64060x[3] = AbstractC23136l9.m118665N(context, this.f64058v[3]);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89060k0(m118712h).m89030N(-2).m89026J(true);
        c22126c0.mo111964L1(AbstractC23136l9.m118712h(c22126c0.getContext(), 18.0f));
        c22126c0.mo111965M1(0);
        c22126c0.m111962J1(-1);
        c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
        this.f64054r = c22126c0;
        int i13 = f64038N;
        int i14 = 0;
        while (i14 < i13) {
            C21693c[] c21693cArr = this.f64057u;
            int i15 = i13;
            C21693c c21693c = new C21693c(context);
            int i16 = m118712h9;
            c21693c.m111929z1(5);
            c21693c.mo111927x1(m118712h6);
            c21693c.mo111925v1(AbstractC23136l9.m118665N(context, this.f64058v[i14]));
            C24848g0 c24848g0 = C24848g0.f119245a;
            c21693cArr[i14] = c21693c;
            C3977j[] c3977jArr = this.f64059w;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            c3977jArr[i14] = new C3977j(context2);
            i14++;
            i13 = i15;
            m118712h9 = i16;
        }
        int i17 = m118712h9;
        C21693c c21693c2 = this.f64057u[0];
        AbstractC19074t.m100205c(c21693c2);
        C16718f m89034R = c21693c2.m89106L().m89060k0(m118712h2).m89030N(m118712h3).m89035S(m118712h7).m89034R(i11);
        C22126c0 c22126c02 = this.f64054r;
        C22126c0 c22126c03 = null;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("txtDesc");
            c22126c02 = null;
        }
        m89034R.m89023G(c22126c02).m89036T(m118712h8);
        C21693c c21693c3 = this.f64057u[2];
        AbstractC19074t.m100205c(c21693c3);
        C16718f m89054h0 = c21693c3.m89106L().m89060k0(m118712h4).m89030N(m118712h4).m89033Q(m118712h7).m89054h0(this.f64057u[0]);
        C22126c0 c22126c04 = this.f64054r;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("txtDesc");
            c22126c04 = null;
        }
        m89054h0.m89023G(c22126c04).m89036T(m118712h8);
        C21693c c21693c4 = this.f64057u[3];
        AbstractC19074t.m100205c(c21693c4);
        c21693c4.m89106L().m89060k0(m118712h4).m89030N(m118712h4).m89054h0(this.f64057u[0]).m89023G(this.f64057u[2]);
        C21693c c21693c5 = this.f64057u[1];
        AbstractC19074t.m100205c(c21693c5);
        C16718f m89054h02 = c21693c5.m89106L().m89060k0(m118712h5).m89030N(m118712h3).m89034R(m118712h7).m89054h0(this.f64057u[2]);
        C22126c0 c22126c05 = this.f64054r;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("txtDesc");
            c22126c05 = null;
        }
        m89054h02.m89023G(c22126c05).m89036T(m118712h8);
        int i18 = f64038N;
        for (int i19 = 0; i19 < i18; i19++) {
            C21693c c21693c6 = this.f64057u[i19];
            if (c21693c6 != null) {
                c21693c6.m111929z1(5);
                c21693c6.mo111927x1(m118712h6);
                c21693c6.mo111925v1(AbstractC23136l9.m118665N(context, this.f64058v[i19]));
                c21693c6.mo89109M0(this.f64050L);
            }
            C3977j[] c3977jArr2 = this.f64059w;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            c3977jArr2[i19] = new C3977j(context3);
        }
        ModulesView modulesView = this.f64055s;
        if (modulesView != null) {
            if (z11) {
                f18 = 72.0f;
            } else {
                f18 = 2.0f;
            }
            modulesView.setPadding(0, AbstractC23136l9.m118712h(context, f18) + modulesView.getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_big_height), 0, i17);
            C22126c0 c22126c06 = this.f64054r;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("txtDesc");
            } else {
                c22126c03 = c22126c06;
            }
            modulesView.mo69681L(c22126c03);
            C21693c c21693c7 = this.f64057u[0];
            AbstractC19074t.m100205c(c21693c7);
            modulesView.mo69681L(c21693c7);
            C21693c c21693c8 = this.f64057u[2];
            AbstractC19074t.m100205c(c21693c8);
            modulesView.mo69681L(c21693c8);
            C21693c c21693c9 = this.f64057u[3];
            AbstractC19074t.m100205c(c21693c9);
            modulesView.mo69681L(c21693c9);
            C21693c c21693c10 = this.f64057u[1];
            AbstractC19074t.m100205c(c21693c10);
            modulesView.mo69681L(c21693c10);
        }
        RobotoTextView robotoTextView = this.f64056t;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: x70.c1
                public /* synthetic */ ViewOnClickListenerC29405c1() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MediaStorePopulatePage.m69104C(MediaStorePopulatePage.this, view);
                }
            });
        }
        DragToCloseLayout dragToCloseLayout2 = this.f64053q;
        if (dragToCloseLayout2 != null) {
            dragToCloseLayout2.setOnDragToCloseListener(new C12301c());
        }
        setAnimationState(true);
    }

    /* renamed from: G */
    public final void m69132G(float f11) {
        if (Math.abs(f11) >= 1.0f) {
            setAnimationState(true);
        }
    }

    /* renamed from: H */
    public final void m69133H(MessageId messageId) {
        if (messageId == null) {
            return;
        }
        synchronized (this.f64048J) {
            try {
                Iterator it = this.f64048J.iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b(messageId, ((MediaStoreItem) it.next()).m40571M())) {
                        it.remove();
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: x70.d1
            public /* synthetic */ RunnableC29408d1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MediaStorePopulatePage.m69108I(MediaStorePopulatePage.this);
            }
        });
    }

    public final C12063c.a getMDelegate() {
        return this.f64042D;
    }

    public final InterfaceC12300b getMMediaStorePopulateListener() {
        return this.f64043E;
    }

    /* renamed from: s */
    public final void m69134s(int i11) {
        String str;
        String str2;
        int i12;
        String str3;
        int size;
        try {
            this.f64044F = i11;
            List list = null;
            if (i11 == 0) {
                C22126c0 c22126c0 = this.f64054r;
                if (c22126c0 == null) {
                    AbstractC19074t.m100223u("txtDesc");
                    c22126c0 = null;
                }
                c22126c0.m111959G1(getContext().getString(AbstractC8020f0.str_media_store_populate_start_page));
            } else {
                int i13 = this.f64040B;
                if (i13 == 0) {
                    C0943w c0943w = C0943w.f3447a;
                    InterfaceC12300b interfaceC12300b = this.f64043E;
                    if (interfaceC12300b != null) {
                        str2 = interfaceC12300b.mo67231c();
                    } else {
                        str2 = null;
                    }
                    C31973j5 m4472f = c0943w.m4472f(str2);
                    C22126c0 c22126c02 = this.f64054r;
                    if (c22126c02 == null) {
                        AbstractC19074t.m100223u("txtDesc");
                        c22126c02 = null;
                    }
                    Context context = getContext();
                    if (m4472f != null && m4472f.m153747Y()) {
                        i12 = AbstractC8020f0.str_community_stored_media_populate_end_page;
                    } else {
                        i12 = AbstractC8020f0.str_stored_media_populate_end_page;
                    }
                    c22126c02.m111959G1(context.getString(i12));
                } else {
                    if (i13 > 1) {
                        str = getContext().getString(AbstractC8020f0.str_more_s);
                    } else {
                        str = "";
                    }
                    AbstractC19074t.m100205c(str);
                    C22126c0 c22126c03 = this.f64054r;
                    if (c22126c03 == null) {
                        AbstractC19074t.m100223u("txtDesc");
                        c22126c03 = null;
                    }
                    c22126c03.m111959G1(getContext().getString(AbstractC8020f0.str_stored_media_populate_page_with_total_desc, Integer.valueOf(this.f64040B), str));
                }
            }
            this.f64045G = new ArrayList();
            this.f64046H = new ArrayList();
            this.f64047I = new ArrayList();
            InterfaceC12300b interfaceC12300b2 = this.f64043E;
            if (interfaceC12300b2 != null) {
                AbstractC19074t.m100205c(interfaceC12300b2);
                List mo67229a = interfaceC12300b2.mo67229a();
                if (mo67229a != null) {
                    list = AbstractC25332a0.m131202b0(mo67229a);
                }
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty() && list.size() - 1 >= 0) {
                while (true) {
                    int i14 = size - 1;
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) list.get(size);
                    if (itemAlbumMobile.f42591p == 1) {
                        List list3 = this.f64045G;
                        AbstractC19074t.m100205c(list3);
                        list3.add(itemAlbumMobile);
                        if (itemAlbumMobile.m40496C() != null) {
                            MessageId m40496C = itemAlbumMobile.m40496C();
                            AbstractC19074t.m100205c(m40496C);
                            if (m40496C.m41052p()) {
                                List list4 = this.f64046H;
                                AbstractC19074t.m100205c(list4);
                                MessageId m40496C2 = itemAlbumMobile.m40496C();
                                AbstractC19074t.m100205c(m40496C2);
                                list4.add(m40496C2.m41044h());
                            }
                            MessageId m40496C3 = itemAlbumMobile.m40496C();
                            AbstractC19074t.m100205c(m40496C3);
                            if (m40496C3.m41053q()) {
                                List list5 = this.f64047I;
                                AbstractC19074t.m100205c(list5);
                                MessageId m40496C4 = itemAlbumMobile.m40496C();
                                AbstractC19074t.m100205c(m40496C4);
                                list5.add(m40496C4.m41046j());
                            }
                        }
                    }
                    List list6 = this.f64045G;
                    AbstractC19074t.m100205c(list6);
                    if (list6.size() < f64038N && i14 >= 0) {
                        size = i14;
                    }
                }
            }
            List list7 = this.f64045G;
            AbstractC19074t.m100205c(list7);
            if (list7.size() < f64038N && !this.f64049K) {
                m69105D();
            }
            ArrayList arrayList = new ArrayList();
            List list8 = this.f64045G;
            AbstractC19074t.m100205c(list8);
            int size2 = list8.size();
            for (int i15 = 0; i15 < size2; i15++) {
                List list9 = this.f64045G;
                AbstractC19074t.m100205c(list9);
                if (!TextUtils.isEmpty(((ItemAlbumMobile) list9.get(i15)).m40504N())) {
                    List list10 = this.f64045G;
                    AbstractC19074t.m100205c(list10);
                    String m40504N = ((ItemAlbumMobile) list10.get(i15)).m40504N();
                    AbstractC19074t.m100207e(m40504N, "getViewImageUrl(...)");
                    arrayList.add(m40504N);
                }
            }
            if (arrayList.size() < f64038N) {
                synchronized (this.f64048J) {
                    try {
                        for (MediaStoreItem mediaStoreItem : this.f64048J) {
                            if (!mediaStoreItem.m40594i0() && !mediaStoreItem.m40602n0()) {
                            }
                            List list11 = this.f64046H;
                            AbstractC19074t.m100205c(list11);
                            if (!list11.contains(mediaStoreItem.m40571M().m41046j()) && !TextUtils.isEmpty(mediaStoreItem.m40599m().m95131f5())) {
                                List list12 = this.f64047I;
                                AbstractC19074t.m100205c(list12);
                                if (!list12.contains(mediaStoreItem.m40571M().m41044h()) && arrayList.size() < f64038N) {
                                    String m95131f5 = mediaStoreItem.m40599m().m95131f5();
                                    AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
                                    arrayList.add(m95131f5);
                                }
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
            }
            int length = this.f64057u.length;
            for (int i16 = 0; i16 < length; i16++) {
                C21693c c21693c = this.f64057u[i16];
                C3977j c3977j = this.f64059w[i16];
                if (i16 < arrayList.size()) {
                    str3 = (String) arrayList.get(i16);
                } else {
                    str3 = "";
                }
                String str4 = str3;
                if (!TextUtils.isEmpty(str4)) {
                    if (c21693c != null) {
                        c21693c.m111929z1(5);
                    }
                    C24003n m120061B0 = C23278z2.m120061B0();
                    m120061B0.f116261b = this.f64060x[i16];
                    AbstractC23268y2.m120034h(this.f64052p, c3977j, c21693c, str4, m120061B0, false);
                } else if (i16 < this.f64058v.length) {
                    if (c21693c != null) {
                        c21693c.m111929z1(0);
                    }
                    if (c21693c != null) {
                        c21693c.mo111925v1(AbstractC23136l9.m118665N(getContext(), this.f64058v[i16]));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public final void setAnimationState(boolean z11) {
        float f11;
        int i11;
        if (!z11 && this.f64039A) {
            return;
        }
        int i12 = f64038N;
        for (int i13 = 0; i13 < i12; i13++) {
            C21693c c21693c = this.f64057u[i13];
            if (c21693c != null) {
                if (z11) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                c21693c.mo89158x0(f11);
                if (z11) {
                    i11 = 60;
                } else {
                    i11 = 0;
                }
                c21693c.m89132a1(i11);
            }
        }
    }

    public final void setBackgroundView(View view) {
        this.f64061y = view;
    }

    public final void setBackgroundViewAlpha(int i11) {
        int i12;
        if (this.f64061y != null) {
            float f11 = 1.0f;
            float abs = Math.abs(i11) * 1.0f;
            DragToCloseLayout dragToCloseLayout = this.f64053q;
            if (dragToCloseLayout != null) {
                i12 = dragToCloseLayout.getHeight();
            } else {
                i12 = 1;
            }
            float f12 = 1.0f - (abs / i12);
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            if (f12 <= 1.0f) {
                f11 = f12;
            }
            View view = this.f64061y;
            AbstractC19074t.m100205c(view);
            view.setAlpha(f11);
        }
    }

    public final void setLoadingDataFromMediaStore(boolean z11) {
        this.f64051M = z11;
    }

    public final void setMDelegate(C12063c.a aVar) {
        this.f64042D = aVar;
    }

    public final void setMMediaStorePopulateListener(InterfaceC12300b interfaceC12300b) {
        this.f64043E = interfaceC12300b;
    }

    /* renamed from: u */
    public final void m69135u(int i11) {
        setAnimationState(true);
        if (i11 == 0) {
            C21693c c21693c = this.f64057u[0];
            AbstractC19074t.m100205c(c21693c);
            c21693c.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
            this.f64041C.postDelayed(new Runnable() { // from class: x70.u0
                public /* synthetic */ RunnableC29458u0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePopulatePage.m69130z(MediaStorePopulatePage.this);
                }
            }, 100L);
            this.f64041C.postDelayed(new Runnable() { // from class: x70.v0
                public /* synthetic */ RunnableC29461v0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePopulatePage.m69103A(MediaStorePopulatePage.this);
                }
            }, 100L);
            this.f64041C.postDelayed(new Runnable() { // from class: x70.w0
                public /* synthetic */ RunnableC29464w0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePopulatePage.m69126v(MediaStorePopulatePage.this);
                }
            }, 200L);
        } else {
            C21693c c21693c2 = this.f64057u[1];
            AbstractC19074t.m100205c(c21693c2);
            c21693c2.m89135c1(new C20516b().mo106587c(0.0f).mo106594k(1.0f).m106590f(60).m106597n(0).m106593j(200L));
            this.f64041C.postDelayed(new Runnable() { // from class: x70.x0
                public /* synthetic */ RunnableC29466x0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePopulatePage.m69127w(MediaStorePopulatePage.this);
                }
            }, 100L);
            this.f64041C.postDelayed(new Runnable() { // from class: x70.y0
                public /* synthetic */ RunnableC29468y0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePopulatePage.m69128x(MediaStorePopulatePage.this);
                }
            }, 100L);
            this.f64041C.postDelayed(new Runnable() { // from class: x70.z0
                public /* synthetic */ RunnableC29470z0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePopulatePage.m69129y(MediaStorePopulatePage.this);
                }
            }, 200L);
        }
        this.f64039A = true;
        this.f64041C.sendEmptyMessageDelayed(2, 400L);
    }
}
