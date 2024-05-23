package bf;

import af.C0772e;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import bf.AbstractC2790b;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.DumpChatImageView;
import java.util.concurrent.atomic.AtomicInteger;
import lt.AbstractC22647c;
import me0.C23278z2;
import org.json.JSONObject;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;

/* renamed from: bf.d */
/* loaded from: classes3.dex */
public class C2792d extends AbstractC2790b {

    /* renamed from: s */
    C23528a f11135s;

    /* renamed from: bf.d$a */
    /* loaded from: classes3.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ View f11136l1;

        /* renamed from: m1 */
        final /* synthetic */ RecyclingImageView f11137m1;

        /* renamed from: n1 */
        final /* synthetic */ int f11138n1;

        /* renamed from: o1 */
        final /* synthetic */ boolean f11139o1;

        /* renamed from: p1 */
        final /* synthetic */ int f11140p1;

        /* renamed from: q1 */
        final /* synthetic */ int f11141q1;

        /* renamed from: r1 */
        final /* synthetic */ AbstractC2790b.a f11142r1;

        a(View view, RecyclingImageView recyclingImageView, int i11, boolean z11, int i12, int i13, AbstractC2790b.a aVar) {
            this.f11136l1 = view;
            this.f11137m1 = recyclingImageView;
            this.f11138n1 = i11;
            this.f11139o1 = z11;
            this.f11140p1 = i12;
            this.f11141q1 = i13;
            this.f11142r1 = aVar;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        if (this.f11136l1 instanceof RecyclingImageView) {
                            this.f11137m1.setImageInfo(c3979l);
                            C2792d.this.m13454q(c3979l.m18839c(), this.f11138n1, this.f11139o1, this.f11137m1, this.f11140p1, this.f11141q1);
                        } else {
                            this.f11137m1.setImageInfo(c3979l, false);
                            this.f11137m1.setImageInfo(null);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            AbstractC2790b.a aVar = this.f11142r1;
            if (aVar != null) {
                aVar.mo13450a();
            }
        }
    }

    public C2792d(JSONObject jSONObject) {
        super(jSONObject);
        this.f11135s = new C23528a(MainApplication.getAppContext());
    }

    /* renamed from: o */
    public static /* synthetic */ void m13453o(AtomicInteger atomicInteger, AbstractC2790b.a aVar) {
        if (atomicInteger.decrementAndGet() <= 0 && aVar != null) {
            aVar.mo13450a();
        }
    }

    /* renamed from: q */
    public void m13454q(Bitmap bitmap, int i11, boolean z11, ImageView imageView, int i12, int i13) {
        AbstractC2790b.b bVar;
        if (bitmap == null) {
            return;
        }
        try {
            if (z11) {
                bVar = ((AbstractC2790b.c) this.f11112d.get(i11)).f11132d;
            } else {
                bVar = ((AbstractC2790b.c) this.f11112d.get(i11)).f11131c;
            }
            AbstractC2790b.b bVar2 = bVar;
            AbstractC2790b.m13440a(bitmap, bVar2, (i12 * bVar2.f11127c) / (bitmap.getWidth() * 100.0f), imageView, i12, i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: bf.c.<init>(java.util.concurrent.atomic.AtomicInteger, bf.b$a):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // bf.AbstractC2790b
    /* renamed from: j */
    public void mo13436j(android.view.ViewGroup r10, int r11, int r12, boolean r13, bf.AbstractC2790b.a r14) {
        /*
            r9 = this;
            int r0 = r9.f11110b
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            java.util.List r1 = r9.f11112d
            int r1 = r1.size()
            r0.<init>(r1)
            r1 = 0
        L11:
            java.util.List r2 = r9.f11112d
            int r2 = r2.size()
            if (r1 >= r2) goto L3a
            com.androidquery.util.RecyclingImageView r5 = new com.androidquery.util.RecyclingImageView
            android.content.Context r2 = r10.getContext()
            r5.<init>(r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r2)
            r10.addView(r5)
            bf.c r8 = new bf.c
            r8.<init>()
            r2 = r9
            r3 = r1
            r4 = r13
            r6 = r11
            r7 = r12
            r2.m13455p(r3, r4, r5, r6, r7, r8)
            int r1 = r1 + 1
            goto L11
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.C2792d.mo13436j(android.view.ViewGroup, int, int, boolean, bf.b$a):void");
    }

    @Override // bf.AbstractC2790b
    /* renamed from: k */
    AbstractC22647c mo13437k(boolean z11) {
        return new C0772e(this, MainApplication.getAppContext(), this.f11135s, C23278z2.m120153s0(), z11);
    }

    /* renamed from: p */
    void m13455p(int i11, boolean z11, View view, int i12, int i13, AbstractC2790b.a aVar) {
        RecyclingImageView dumpChatImageView;
        if (view == null) {
            return;
        }
        try {
            if (this.f11110b != 0) {
                return;
            }
            String str = this.f11122n;
            if (i11 < this.f11112d.size()) {
                if (z11) {
                    str = ((AbstractC2790b.c) this.f11112d.get(i11)).f11130b;
                } else {
                    str = ((AbstractC2790b.c) this.f11112d.get(i11)).f11129a;
                }
            }
            String str2 = str;
            if (view instanceof RecyclingImageView) {
                dumpChatImageView = (RecyclingImageView) view;
            } else {
                dumpChatImageView = new DumpChatImageView(view.getContext());
            }
            RecyclingImageView recyclingImageView = dumpChatImageView;
            ((C23528a) this.f11135s.m123612r(recyclingImageView)).m123579C(str2, C23278z2.m120153s0(), new a(view, recyclingImageView, i11, z11, i12, i13, aVar));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
