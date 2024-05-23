package com.zing.zalo.zdesign.component.popover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2812f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zing.zalo.zdesign.component.popover.b */
/* loaded from: classes7.dex */
public class C17033b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final List f87150r;

    /* renamed from: s */
    private b f87151s;

    /* renamed from: t */
    protected Context f87152t;

    /* renamed from: com.zing.zalo.zdesign.component.popover.b$a */
    /* loaded from: classes7.dex */
    public class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C17033b f87153I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17033b c17033b, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f87153I = c17033b;
        }

        /* renamed from: k0 */
        public static final void m91194k0(C17033b c17033b, InterfaceC17034c interfaceC17034c, View view) {
            AbstractC19074t.m100208f(c17033b, "this$0");
            AbstractC19074t.m100208f(interfaceC17034c, "$popoverItem");
            b m91188N = c17033b.m91188N();
            if (m91188N != null) {
                AbstractC19074t.m100207e(view, "it");
                m91188N.mo91196a(view, interfaceC17034c);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.zdesign.component.popover.a.<init>(com.zing.zalo.zdesign.component.popover.b, com.zing.zalo.zdesign.component.popover.c):void, class status: GENERATED_AND_UNLOADED
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
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        /* renamed from: j0 */
        public void m91195j0(int r11) {
            /*
                r10 = this;
                android.view.View r0 = r10.f7784p
                boolean r1 = r0 instanceof com.zing.zalo.zdesign.component.ListItem
                if (r1 == 0) goto Le0
                java.lang.String r1 = "null cannot be cast to non-null type com.zing.zalo.zdesign.component.ListItem"
                fn0.AbstractC19074t.m100206d(r0, r1)
                com.zing.zalo.zdesign.component.ListItem r0 = (com.zing.zalo.zdesign.component.ListItem) r0
                com.zing.zalo.zdesign.component.popover.b r1 = r10.f87153I
                com.zing.zalo.zdesign.component.popover.c r11 = r1.m91187M(r11)
                ui0.b r8 = ui0.C27275b.f128316a
                com.zing.zalo.zdesign.component.popover.b r1 = r10.f87153I
                android.content.Context r2 = r1.m91186L()
                int r3 = bi0.AbstractC2807a.popover_menu_icon
                r4 = 0
                r5 = 0
                r6 = 6
                r7 = 0
                r1 = r8
                int r1 = ui0.C27275b.m139639c(r1, r2, r3, r4, r5, r6, r7)
                com.zing.zalo.zdesign.component.popover.b r2 = r10.f87153I
                java.lang.String r3 = r11.getTitle()
                r0.setTitle(r3)
                com.zing.zalo.zdesign.component.popover.a r3 = new com.zing.zalo.zdesign.component.popover.a
                r3.<init>()
                r0.setOnClickListener(r3)
                com.zing.zalo.zdesign.component.popover.f r2 = r11.mo91199c()
                com.zing.zalo.zdesign.component.popover.f r3 = com.zing.zalo.zdesign.component.popover.EnumC17037f.DESTRUCTIVE
                if (r2 != r3) goto L61
                com.zing.zalo.zdesign.component.popover.b r1 = r10.f87153I
                android.content.Context r2 = r1.m91186L()
                int r3 = bi0.AbstractC2807a.popover_menu_icon_destructive
                r4 = 0
                r5 = 0
                r6 = 6
                r7 = 0
                r1 = r8
                int r9 = ui0.C27275b.m139639c(r1, r2, r3, r4, r5, r6, r7)
                com.zing.zalo.zdesign.component.popover.b r1 = r10.f87153I
                android.content.Context r2 = r1.m91186L()
                int r3 = bi0.AbstractC2807a.popover_menu_title_destructive
                r1 = r8
                int r1 = ui0.C27275b.m139639c(r1, r2, r3, r4, r5, r6, r7)
                r0.setTitleColor(r1)
                r1 = r9
            L61:
                java.lang.String r2 = r11.mo91201e()
                int r2 = r2.length()
                r3 = 0
                if (r2 <= 0) goto L7a
                com.zing.zalo.ui.widget.RobotoTextView r2 = r0.getSubtitleTextView$zdesign_release()
                r2.setVisibility(r3)
                java.lang.String r2 = r11.mo91201e()
                r0.setSubtitle(r2)
            L7a:
                android.graphics.drawable.Drawable r2 = r11.getIcon()
                if (r2 == 0) goto La9
                com.zing.zalo.zdesign.component.popover.b r4 = r10.f87153I
                androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
                android.content.Context r4 = r4.m91186L()
                r5.<init>(r4)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
                if (r2 == 0) goto L9a
                android.graphics.drawable.Drawable r2 = r2.newDrawable()
                goto L9b
            L9a:
                r2 = 0
            L9b:
                if (r2 == 0) goto La9
                androidx.core.graphics.drawable.AbstractC1414a.m7196n(r2, r1)
                r5.setImageDrawable(r2)
                r0.m90587c(r5)
                r0.setLeadingItemVisibility(r3)
            La9:
                boolean r1 = r11.mo91197a()
                if (r1 == 0) goto Lce
                com.zing.zalo.zdesign.component.f r1 = new com.zing.zalo.zdesign.component.f
                com.zing.zalo.zdesign.component.popover.b r2 = r10.f87153I
                android.content.Context r2 = r2.m91186L()
                r1.<init>(r2)
                com.zing.zalo.zdesign.component.i r2 = com.zing.zalo.zdesign.component.EnumC16991i.NEW_DOT
                r1.m90974x(r2)
                com.zing.zalo.zdesign.component.h r2 = com.zing.zalo.zdesign.component.EnumC16980h.SIZE_8
                r1.m90971u(r2)
                com.zing.zalo.zdesign.component.Badge r2 = r0.getBadgeTitle()
                r2.setVisibility(r3)
                r2.m90493g(r1)
            Lce:
                java.lang.String r1 = r11.mo91198b()
                if (r1 == 0) goto Ld7
                r0.setIdTracking(r1)
            Ld7:
                ac.i r11 = r11.mo91200d()
                if (r11 == 0) goto Le0
                r0.setTrackingExtraData(r11)
            Le0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.zdesign.component.popover.C17033b.a.m91195j0(int):void");
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.popover.b$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        void mo91196a(View view, InterfaceC17034c interfaceC17034c);
    }

    public /* synthetic */ C17033b(List list, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    /* renamed from: L */
    protected final Context m91186L() {
        Context context = this.f87152t;
        if (context != null) {
            return context;
        }
        AbstractC19074t.m100223u("context");
        return null;
    }

    /* renamed from: M */
    public final InterfaceC17034c m91187M(int i11) {
        return (InterfaceC17034c) this.f87150r.get(i11);
    }

    /* renamed from: N */
    protected final b m91188N() {
        return this.f87151s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        aVar.m91195j0(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "parent.context");
        m91191Q(context);
        if (i11 == EnumC17037f.DIVIDER.ordinal()) {
            View inflate = LayoutInflater.from(m91186L()).inflate(AbstractC2812f.item_divider, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "divider");
            return new a(this, inflate);
        }
        return new a(this, new PopoverItemView(m91186L()));
    }

    /* renamed from: Q */
    protected final void m91191Q(Context context) {
        AbstractC19074t.m100208f(context, "<set-?>");
        this.f87152t = context;
    }

    /* renamed from: R */
    public final void m91192R(b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        this.f87151s = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f87150r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((InterfaceC17034c) this.f87150r.get(i11)).mo91199c().ordinal();
    }

    public C17033b(List list) {
        AbstractC19074t.m100208f(list, "data");
        ArrayList arrayList = new ArrayList();
        this.f87150r = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
    }
}
