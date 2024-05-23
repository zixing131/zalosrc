package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import bo.AbstractC3059y0;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.animation.AnimationTarget;
import i40.InterfaceC20272b;
import id0.C20518d;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22141p;
import me0.AbstractC23136l9;
import me0.AbstractC23166o6;
import me0.AbstractC23170p;
import me0.AbstractC23222t7;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: com.zing.zalo.feed.uicontrols.k */
/* loaded from: classes4.dex */
public class C8880k extends C16716d implements InterfaceC20272b {

    /* renamed from: b1 */
    private static final int f47444b1 = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: M0 */
    List f47445M0;

    /* renamed from: N0 */
    C23528a f47446N0;

    /* renamed from: O0 */
    int f47447O0;

    /* renamed from: P0 */
    int f47448P0;

    /* renamed from: Q0 */
    SparseArray f47449Q0;

    /* renamed from: R0 */
    f f47450R0;

    /* renamed from: S0 */
    int f47451S0;

    /* renamed from: T0 */
    int f47452T0;

    /* renamed from: U0 */
    private int f47453U0;

    /* renamed from: V0 */
    private boolean f47454V0;

    /* renamed from: W0 */
    private int f47455W0;

    /* renamed from: X0 */
    boolean f47456X0;

    /* renamed from: Y0 */
    private boolean f47457Y0;

    /* renamed from: Z0 */
    private final List f47458Z0;

    /* renamed from: a1 */
    public View f47459a1;

    /* renamed from: com.zing.zalo.feed.uicontrols.k$a */
    /* loaded from: classes4.dex */
    public class a extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ C16719g f47460p;

        a(C16719g c16719g) {
            this.f47460p = c16719g;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return C8880k.this.m47376x1(this.f47460p);
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.k$b */
    /* loaded from: classes4.dex */
    public class b extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ e f47462p;

        b(e eVar) {
            this.f47462p = eVar;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return C8880k.this.m47376x1(this.f47462p.f47476b);
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.k$c */
    /* loaded from: classes4.dex */
    public class c extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ int f47464c;

        /* renamed from: d */
        final /* synthetic */ long f47465d;

        /* renamed from: e */
        final /* synthetic */ AbstractC20826v0.j f47466e;

        /* renamed from: f */
        final /* synthetic */ int f47467f;

        c(int i11, long j11, AbstractC20826v0.j jVar, int i12) {
            this.f47464c = i11;
            this.f47465d = j11;
            this.f47466e = jVar;
            this.f47467f = i12;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            int i11;
            super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            if (!z11 && c3979l != null) {
                C8880k.this.f47458Z0.add(Long.valueOf(c3979l.m18844h()));
                if (C8880k.this.f47458Z0.size() == this.f47464c) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i12 = 0;
                    long j11 = 0;
                    while (true) {
                        i11 = this.f47464c;
                        if (i12 >= i11) {
                            break;
                        }
                        j11 += ((Long) C8880k.this.f47458Z0.get(i12)).longValue();
                        i12++;
                    }
                    FeedItemPhotoMultiModuleView.Companion.m43987a(i11, this.f47465d, currentTimeMillis, j11, c3979l.m18845i());
                }
            }
            if (this.f47466e != null && c3979l != null && c3979l.m18849m()) {
                this.f47466e.mo87393a(this.f47467f, c3979l.m18839c().getWidth(), c3979l.m18839c().getHeight());
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.k$d */
    /* loaded from: classes4.dex */
    public class d extends C22141p {

        /* renamed from: A1 */
        int f47469A1;

        /* renamed from: B1 */
        int f47470B1;

        /* renamed from: x1 */
        Paint f47472x1;

        /* renamed from: y1 */
        boolean f47473y1;

        /* renamed from: z1 */
        int f47474z1;

        public d(Context context) {
            super(context);
            this.f47473y1 = false;
        }

        @Override // l80.C22141p, l80.C22122a0, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
        /* renamed from: o0 */
        public void mo44775o0(Canvas canvas) {
            super.mo44775o0(canvas);
            if (this.f47472x1 == null) {
                Paint paint = new Paint();
                this.f47472x1 = paint;
                paint.setAntiAlias(true);
                this.f47472x1.setStyle(Paint.Style.STROKE);
                this.f47472x1.setStrokeWidth(C8880k.this.f47451S0);
            }
            if (this.f47474z1 == 0) {
                this.f47472x1.setColor(C8880k.this.f47452T0);
            } else {
                this.f47472x1.setColor(0);
            }
            if (!this.f47473y1) {
                canvas.drawRect(0.0f, 0.0f, this.f47469A1, this.f47470B1, this.f47472x1);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.k$e */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a */
        int f47475a;

        /* renamed from: b */
        d f47476b;

        /* renamed from: c */
        C21693c f47477c;

        /* renamed from: d */
        C22124b0 f47478d;

        /* renamed from: e */
        C22126c0 f47479e;

        /* renamed from: f */
        C21693c f47480f;

        e() {
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.k$f */
    /* loaded from: classes4.dex */
    public interface f {
        /* renamed from: a */
        void mo43488a(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11);

        /* renamed from: b */
        void mo43489b(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11);

        /* renamed from: c */
        void mo43490c(int i11);

        /* renamed from: d */
        void mo43491d(ItemAlbumMobile itemAlbumMobile, int i11);
    }

    public C8880k(Context context) {
        super(context);
        this.f47445M0 = new ArrayList();
        this.f47453U0 = -1;
        this.f47455W0 = -1;
        this.f47456X0 = true;
        this.f47457Y0 = false;
        this.f47458Z0 = new ArrayList();
        this.f47459a1 = null;
        this.f47446N0 = new C23528a(context);
        this.f47449Q0 = new SparseArray();
        this.f47451S0 = AbstractC23222t7.f112550b;
        this.f47452T0 = 402653184;
    }

    /* renamed from: A1 */
    public /* synthetic */ void m47355A1(int i11, C16719g c16719g) {
        f fVar = this.f47450R0;
        if (fVar != null) {
            fVar.mo43490c(i11);
        }
        if (this.f47455W0 == 1000) {
            AbstractC23647d.m123897g("13711");
        }
    }

    /* renamed from: B1 */
    public /* synthetic */ void m47356B1(e eVar, ItemAlbumMobile itemAlbumMobile, int i11, float f11, C16719g c16719g) {
        if (this.f47450R0 != null) {
            this.f47450R0.mo43488a(new b(eVar), itemAlbumMobile, i11, AbstractC23136l9.m118742r(f11));
        }
        if (this.f47455W0 == 1000) {
            AbstractC23647d.m123897g("13714");
        }
    }

    /* renamed from: w1 */
    private int m47362w1() {
        if (this.f47453U0 != 11) {
            return AbstractC23136l9.m118742r(26.0f);
        }
        return AbstractC23136l9.m118742r(20.0f);
    }

    /* renamed from: y1 */
    public /* synthetic */ void m47363y1(ItemAlbumMobile itemAlbumMobile, int i11, float f11, C16719g c16719g) {
        try {
            a aVar = new a(c16719g);
            if (this.f47450R0 != null && m47376x1(c16719g) != null) {
                this.f47450R0.mo43489b(aVar, itemAlbumMobile, i11, AbstractC23136l9.m118742r(f11));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: z1 */
    public /* synthetic */ void m47364z1(ItemAlbumMobile itemAlbumMobile, int i11, C16719g c16719g) {
        try {
            f fVar = this.f47450R0;
            if (fVar != null) {
                fVar.mo43491d(itemAlbumMobile, i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: C1 */
    public void m47365C1() {
        d dVar;
        for (int i11 = 0; i11 < this.f47445M0.size(); i11++) {
            e eVar = (e) this.f47445M0.get(i11);
            if (eVar != null && (dVar = eVar.f47476b) != null) {
                dVar.m115503t2();
            }
        }
    }

    /* renamed from: D1 */
    public void m47366D1(f fVar) {
        this.f47450R0 = fVar;
    }

    /* renamed from: E1 */
    public void m47367E1(int i11) {
        this.f47453U0 = i11;
    }

    /* renamed from: F1 */
    public void m47368F1(boolean z11) {
        this.f47457Y0 = z11;
    }

    /* renamed from: G1 */
    public void m47369G1(int i11) {
        this.f47455W0 = i11;
    }

    /* renamed from: H1 */
    public void m47370H1(boolean z11) {
        this.f47456X0 = z11;
    }

    /* renamed from: I1 */
    public void m47371I1(int i11) {
        this.f47447O0 = i11;
    }

    /* renamed from: J1 */
    boolean m47372J1(ItemAlbumMobile itemAlbumMobile) {
        boolean z11 = this.f47456X0;
        if (!z11) {
            if (!TextUtils.isEmpty(itemAlbumMobile.f42607x) && itemAlbumMobile.f42607x.startsWith("content://")) {
                return false;
            }
            return true;
        }
        return z11;
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        if (i11 > 8) {
            try {
                if (this.f47454V0) {
                    i11 = 8;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
        Rect rect = (Rect) this.f47449Q0.get(i11);
        if (rect != null) {
            int i12 = rect.left;
            int i13 = rect.top;
            View view = this.f47459a1;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                i12 += iArr[0] + m89096G();
                i13 += iArr[1] + m89098H();
            }
            return new Rect(i12, i13, (rect.right - rect.left) + i12, (rect.bottom - rect.top) + i13);
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.feed.uicontrols.g.<init>(com.zing.zalo.feed.uicontrols.k, com.zing.zalo.control.ItemAlbumMobile, int, float):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:4:0x0008, B:9:0x0010, B:11:0x003a, B:13:0x004c, B:15:0x0054, B:17:0x005f, B:19:0x0067, B:22:0x0076, B:27:0x0090, B:29:0x00a5, B:30:0x00ad, B:32:0x00be, B:34:0x00da, B:35:0x00dc, B:37:0x00e0, B:42:0x00eb, B:44:0x00ef, B:46:0x00fb, B:47:0x0101, B:49:0x0125, B:50:0x0140, B:57:0x0152, B:61:0x0196, B:63:0x01c8, B:64:0x01f7, B:66:0x01fe, B:73:0x0298, B:74:0x02a5, B:76:0x02ac, B:79:0x02e3, B:81:0x02eb, B:83:0x02f2, B:88:0x026d, B:89:0x0275, B:90:0x027d, B:92:0x0281, B:93:0x0289, B:106:0x0047), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fe A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:4:0x0008, B:9:0x0010, B:11:0x003a, B:13:0x004c, B:15:0x0054, B:17:0x005f, B:19:0x0067, B:22:0x0076, B:27:0x0090, B:29:0x00a5, B:30:0x00ad, B:32:0x00be, B:34:0x00da, B:35:0x00dc, B:37:0x00e0, B:42:0x00eb, B:44:0x00ef, B:46:0x00fb, B:47:0x0101, B:49:0x0125, B:50:0x0140, B:57:0x0152, B:61:0x0196, B:63:0x01c8, B:64:0x01f7, B:66:0x01fe, B:73:0x0298, B:74:0x02a5, B:76:0x02ac, B:79:0x02e3, B:81:0x02eb, B:83:0x02f2, B:88:0x026d, B:89:0x0275, B:90:0x027d, B:92:0x0281, B:93:0x0289, B:106:0x0047), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ac A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:4:0x0008, B:9:0x0010, B:11:0x003a, B:13:0x004c, B:15:0x0054, B:17:0x005f, B:19:0x0067, B:22:0x0076, B:27:0x0090, B:29:0x00a5, B:30:0x00ad, B:32:0x00be, B:34:0x00da, B:35:0x00dc, B:37:0x00e0, B:42:0x00eb, B:44:0x00ef, B:46:0x00fb, B:47:0x0101, B:49:0x0125, B:50:0x0140, B:57:0x0152, B:61:0x0196, B:63:0x01c8, B:64:0x01f7, B:66:0x01fe, B:73:0x0298, B:74:0x02a5, B:76:0x02ac, B:79:0x02e3, B:81:0x02eb, B:83:0x02f2, B:88:0x026d, B:89:0x0275, B:90:0x027d, B:92:0x0281, B:93:0x0289, B:106:0x0047), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f2 A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #0 {Exception -> 0x0044, blocks: (B:4:0x0008, B:9:0x0010, B:11:0x003a, B:13:0x004c, B:15:0x0054, B:17:0x005f, B:19:0x0067, B:22:0x0076, B:27:0x0090, B:29:0x00a5, B:30:0x00ad, B:32:0x00be, B:34:0x00da, B:35:0x00dc, B:37:0x00e0, B:42:0x00eb, B:44:0x00ef, B:46:0x00fb, B:47:0x0101, B:49:0x0125, B:50:0x0140, B:57:0x0152, B:61:0x0196, B:63:0x01c8, B:64:0x01f7, B:66:0x01fe, B:73:0x0298, B:74:0x02a5, B:76:0x02ac, B:79:0x02e3, B:81:0x02eb, B:83:0x02f2, B:88:0x026d, B:89:0x0275, B:90:0x027d, B:92:0x0281, B:93:0x0289, B:106:0x0047), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* renamed from: t1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m47373t1(com.zing.zalo.feed.uicontrols.C8884o r22, int r23, boolean r24, boolean r25, int r26) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.feed.uicontrols.C8880k.m47373t1(com.zing.zalo.feed.uicontrols.o, int, boolean, boolean, int):void");
    }

    /* renamed from: u1 */
    public void m47374u1(C8884o c8884o, boolean z11, int i11) {
        m47375v1(c8884o, z11, i11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0126 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:4:0x0006, B:9:0x000e, B:11:0x0030, B:13:0x0042, B:15:0x004a, B:17:0x0056, B:19:0x0062, B:22:0x0085, B:24:0x0089, B:26:0x0098, B:28:0x00b8, B:29:0x00ba, B:34:0x00cf, B:36:0x00de, B:39:0x00e4, B:47:0x00f5, B:48:0x0122, B:50:0x0126, B:53:0x012f, B:58:0x00f2, B:61:0x00a0, B:63:0x00a8, B:66:0x0053), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132 A[SYNTHETIC] */
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m47375v1(C8884o c8884o, boolean z11, int i11, AbstractC20826v0.j jVar) {
        List list;
        boolean z12;
        String str;
        boolean z13;
        e eVar;
        ItemAlbumMobile itemAlbumMobile;
        C21693c c21693c;
        int i12;
        C8880k c8880k = this;
        C8884o c8884o2 = c8884o;
        if (c8884o2 != null) {
            try {
                if (c8884o.m47404c()) {
                    List list2 = c8884o2.f47514a;
                    boolean z14 = AbstractC23304d.m120536g().f147980a;
                    int min = Math.min(list2.size(), c8880k.f47445M0.size());
                    c8880k.f47458Z0.clear();
                    long currentTimeMillis = System.currentTimeMillis();
                    int i13 = 0;
                    while (i13 < min) {
                        ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) list2.get(i13);
                        e eVar2 = (e) c8880k.f47445M0.get(i13);
                        if (eVar2 != null) {
                            if (itemAlbumMobile2.f42550D.isEmpty()) {
                                str = itemAlbumMobile2.m40526m0();
                            } else {
                                str = itemAlbumMobile2.f42550D;
                            }
                            String str2 = str;
                            if (!TextUtils.isEmpty(str2)) {
                                C24003n m120092R = C23278z2.m120092R(min, c8884o2.m47403b(i13));
                                m120092R.f116276q = c8880k.m47372J1(itemAlbumMobile2);
                                m120092R.f116283x = AbstractC3059y0.m14706a(c8880k.f47453U0);
                                boolean m125696L2 = C23999j.m125696L2(str2, m120092R);
                                if (c8880k.f47453U0 == 15) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                d dVar = eVar2.f47476b;
                                if (dVar != null) {
                                    String str3 = (String) dVar.getTag(AbstractC6918a0.tag_photo_id_social_image_module);
                                    C20518d c20518d = null;
                                    if ((TextUtils.isEmpty(str3) || !TextUtils.equals(str2, str3)) && !z13 && TextUtils.isEmpty(itemAlbumMobile2.f42550D)) {
                                        Drawable m119358p = AbstractC23170p.m119358p(getContext());
                                        m120092R.f116261b = m119358p;
                                        eVar2.f47476b.mo111925v1(m119358p);
                                    } else {
                                        m120092R.f116261b = null;
                                    }
                                    eVar2.f47476b.setTag(AbstractC6918a0.tag_photo_id_social_image_module, str2);
                                    if (z11) {
                                        if (z14) {
                                            if (m125696L2) {
                                            }
                                        }
                                    }
                                    C3979l.b bVar = C3979l.b.UNKNOWN;
                                    C20518d c20518d2 = new C20518d();
                                    if (eVar2.f47476b.m115373D1() == null || m120092R.f116261b != null) {
                                        c20518d = c20518d2;
                                    }
                                    int i14 = c8880k.f47453U0;
                                    if (i14 != 0) {
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                            }
                                            list = list2;
                                            eVar = eVar2;
                                            z12 = z14;
                                            itemAlbumMobile = itemAlbumMobile2;
                                            eVar2.f47476b.m115380N1(c8880k.f47446N0, str2, m120092R, bVar, new c(min, currentTimeMillis, jVar, i13).m115397c(c20518d), AbstractC23166o6.Companion.m119337a());
                                            c21693c = eVar.f47480f;
                                            if (c21693c != null) {
                                                if (itemAlbumMobile.f42591p == 2) {
                                                    i12 = 0;
                                                } else {
                                                    i12 = 8;
                                                }
                                                c21693c.mo44614b1(i12);
                                            }
                                            i13++;
                                            c8880k = this;
                                            c8884o2 = c8884o;
                                            list2 = list;
                                            z14 = z12;
                                        }
                                    }
                                    bVar = C3979l.b.FEED_THUMBNAIL;
                                    list = list2;
                                    eVar = eVar2;
                                    z12 = z14;
                                    itemAlbumMobile = itemAlbumMobile2;
                                    eVar2.f47476b.m115380N1(c8880k.f47446N0, str2, m120092R, bVar, new c(min, currentTimeMillis, jVar, i13).m115397c(c20518d), AbstractC23166o6.Companion.m119337a());
                                    c21693c = eVar.f47480f;
                                    if (c21693c != null) {
                                    }
                                    i13++;
                                    c8880k = this;
                                    c8884o2 = c8884o;
                                    list2 = list;
                                    z14 = z12;
                                }
                                list = list2;
                                z12 = z14;
                                eVar = eVar2;
                                itemAlbumMobile = itemAlbumMobile2;
                                c21693c = eVar.f47480f;
                                if (c21693c != null) {
                                }
                                i13++;
                                c8880k = this;
                                c8884o2 = c8884o;
                                list2 = list;
                                z14 = z12;
                            }
                        }
                        list = list2;
                        z12 = z14;
                        i13++;
                        c8880k = this;
                        c8884o2 = c8884o;
                        list2 = list;
                        z14 = z12;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: x1 */
    public Rect m47376x1(C16719g c16719g) {
        int i11;
        try {
            View view = this.f47459a1;
            int i12 = 0;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                i12 = c16719g.m89096G() + iArr[0];
                i11 = iArr[1] + c16719g.m89098H();
            } else {
                i11 = 0;
            }
            return new Rect(i12, i11, c16719g.m89114P() + i12, c16719g.m89112O() + i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }
}
