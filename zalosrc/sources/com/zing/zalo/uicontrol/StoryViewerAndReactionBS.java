package com.zing.zalo.uicontrol;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22033k0;
import l30.C22037m0;
import m30.C22826a;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p172fy.C19171b;
import p30.C24622a;
import p30.C24628g;
import p30.C24633l;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p649xl.C29787ed;
import p716zh.C31844ab;
import p716zh.C31980jc;
import p716zh.C32002l4;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import v50.C27870vb;

/* loaded from: classes4.dex */
public final class StoryViewerAndReactionBS extends BottomSheet {

    /* renamed from: b1 */
    private C29787ed f83543b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f83544c1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C24628g.class), new C16535h(new C16534g(this)), new C16546s());

    /* renamed from: d1 */
    private final InterfaceC24854k f83545d1;

    /* renamed from: e1 */
    private final InterfaceC24854k f83546e1;

    /* renamed from: f1 */
    private final InterfaceC24854k f83547f1;

    /* renamed from: g1 */
    private final AbstractC22055v0.l f83548g1;

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16528a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83549a;

        static {
            int[] iArr = new int[C24628g.b.values().length];
            try {
                iArr[C24628g.b.f118477p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C24628g.b.f118478q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C24628g.b.f118479r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C24628g.b.f118480s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f83549a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$b */
    /* loaded from: classes4.dex */
    static final class C16529b extends AbstractC19075u implements InterfaceC18494a {
        C16529b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(StoryViewerAndReactionBS.this.m92689tK());
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$c */
    /* loaded from: classes4.dex */
    static final class C16530c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements C22826a.b {

            /* renamed from: a */
            final /* synthetic */ StoryViewerAndReactionBS f83552a;

            a(StoryViewerAndReactionBS storyViewerAndReactionBS) {
                this.f83552a = storyViewerAndReactionBS;
            }

            @Override // m30.C22826a.b
            /* renamed from: a */
            public void mo88173a(C31844ab c31844ab) {
                AbstractC19074t.m100208f(c31844ab, "storyViewer");
                this.f83552a.m88159aM().m128155p0(c31844ab);
            }

            @Override // m30.C22826a.b
            /* renamed from: b */
            public void mo88174b() {
                this.f83552a.m88159aM().m128161v0();
            }

            @Override // m30.C22826a.b
            /* renamed from: c */
            public void mo88175c(C31844ab c31844ab, int i11) {
                AbstractC19074t.m100208f(c31844ab, "storyViewer");
                this.f83552a.m88159aM().m128158s0(c31844ab, i11);
            }

            @Override // m30.C22826a.b
            /* renamed from: d */
            public void mo88176d(int i11, String str) {
                AbstractC19074t.m100208f(str, "uid");
                this.f83552a.m88159aM().m128156q0(i11, str, this.f83552a.f83548g1);
            }
        }

        C16530c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22826a mo12V4() {
            C22826a c22826a = new C22826a(StoryViewerAndReactionBS.this.m88140C2());
            c22826a.m117533N(new a(StoryViewerAndReactionBS.this));
            return c22826a;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$d */
    /* loaded from: classes4.dex */
    public static final class C16531d extends RecyclerView.AbstractC1892s {
        C16531d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0 && StoryViewerAndReactionBS.this.m88158ZL().m9745c2() == StoryViewerAndReactionBS.this.m88157YL().mo10003k() - 1 && !StoryViewerAndReactionBS.this.m88157YL().m117531L()) {
                StoryViewerAndReactionBS.this.m88159aM().m128161v0();
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$e */
    /* loaded from: classes4.dex */
    static final class C16532e extends AbstractC19075u implements InterfaceC18494a {
        C16532e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManager mo12V4() {
            return new LinearLayoutManager(StoryViewerAndReactionBS.this.getContext(), 1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$f */
    /* loaded from: classes4.dex */
    public static final class C16533f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f83555p;

        C16533f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f83555p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f83555p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f83555p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$g */
    /* loaded from: classes4.dex */
    public static final class C16534g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f83556q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16534g(ZaloView zaloView) {
            super(0);
            this.f83556q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f83556q;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$h */
    /* loaded from: classes4.dex */
    public static final class C16535h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f83557q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16535h(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f83557q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f83557q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$i */
    /* loaded from: classes4.dex */
    public static final class C16536i extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$i$a */
        /* loaded from: classes4.dex */
        public static final class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ C31980jc f83559a;

            /* renamed from: b */
            final /* synthetic */ StoryViewerAndReactionBS f83560b;

            /* renamed from: c */
            final /* synthetic */ AbstractC22055v0.n f83561c;

            /* renamed from: d */
            final /* synthetic */ int f83562d;

            a(C31980jc c31980jc, StoryViewerAndReactionBS storyViewerAndReactionBS, AbstractC22055v0.n nVar, int i11) {
                this.f83559a = c31980jc;
                this.f83560b = storyViewerAndReactionBS;
                this.f83561c = nVar;
                this.f83562d = i11;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    if (this.f83559a != null) {
                        C24628g m88159aM = this.f83560b.m88159aM();
                        String str = this.f83559a.f147023p;
                        AbstractC19074t.m100207e(str, "uid");
                        m88159aM.m128159t0(str);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                AbstractC19074t.m100208f(str, "msg");
                if (this.f83560b.m92672lJ() && this.f83560b.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                AbstractC19074t.m100208f(bundle, "bundle");
                if (this.f83560b.m92672lJ() && this.f83560b.m92687sJ() && hVar != null) {
                    AbstractC23647d.m123897g("49150053");
                    bundle.putInt("SHOW_WITH_FLAGS", 134217728);
                    bundle.putBoolean("EXTRA_FLAG_EXCLUDE_MY_STORY", true);
                    if (this.f83561c == null) {
                        bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    }
                    bundle.putInt("srcType", this.f83562d);
                    AbstractC22055v0.m115127Q(hVar, this.f83561c, this.f83560b.m92676n2(), bundle, 1000);
                }
            }
        }

        C16536i() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                C22033k0.m115006h().m115018r(c31980jc, i11, new a(c31980jc, StoryViewerAndReactionBS.this, nVar, i11));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$j */
    /* loaded from: classes4.dex */
    public static final class C16537j extends AbstractC19075u implements InterfaceC18505l {
        C16537j() {
            super(1);
        }

        /* renamed from: a */
        public final void m88180a(List list) {
            C22826a m88157YL = StoryViewerAndReactionBS.this.m88157YL();
            AbstractC19074t.m100205c(list);
            m88157YL.m117532M(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88180a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$k */
    /* loaded from: classes4.dex */
    public static final class C16538k extends AbstractC19075u implements InterfaceC18505l {
        C16538k() {
            super(1);
        }

        /* renamed from: a */
        public final void m88181a(C24628g.c cVar) {
            StoryViewerAndReactionBS storyViewerAndReactionBS = StoryViewerAndReactionBS.this;
            AbstractC19074t.m100205c(cVar);
            storyViewerAndReactionBS.m88170lM(cVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88181a((C24628g.c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$l */
    /* loaded from: classes4.dex */
    public static final class C16539l extends AbstractC19075u implements InterfaceC18505l {
        C16539l() {
            super(1);
        }

        /* renamed from: a */
        public final void m88182a(Integer num) {
            String m118746s0;
            C29787ed c29787ed = StoryViewerAndReactionBS.this.f83543b1;
            if (c29787ed == null) {
                AbstractC19074t.m100223u("binding");
                c29787ed = null;
            }
            RobotoTextView robotoTextView = c29787ed.f137699y;
            AbstractC19074t.m100205c(num);
            if (num.intValue() <= 1) {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_viewers, num);
            } else {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_viewers_plural, num);
            }
            robotoTextView.setText(m118746s0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88182a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$m */
    /* loaded from: classes4.dex */
    public static final class C16540m extends AbstractC19075u implements InterfaceC18505l {
        C16540m() {
            super(1);
        }

        /* renamed from: a */
        public final void m88183a(Integer num) {
            String m118746s0;
            C29787ed c29787ed = StoryViewerAndReactionBS.this.f83543b1;
            if (c29787ed == null) {
                AbstractC19074t.m100223u("binding");
                c29787ed = null;
            }
            RobotoTextView robotoTextView = c29787ed.f137698x;
            AbstractC19074t.m100205c(num);
            if (num.intValue() <= 1) {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_reactions, num);
            } else {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_reactions_plural, num);
            }
            robotoTextView.setText(m118746s0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88183a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$n */
    /* loaded from: classes4.dex */
    public static final class C16541n extends AbstractC19075u implements InterfaceC18505l {
        C16541n() {
            super(1);
        }

        /* renamed from: a */
        public final void m88184a(C24860q c24860q) {
            StoryViewerAndReactionBS.this.m88166hM((String) c24860q.m129213a(), ((Boolean) c24860q.m129214b()).booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88184a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$o */
    /* loaded from: classes4.dex */
    public static final class C16542o extends AbstractC19075u implements InterfaceC18505l {
        C16542o() {
            super(1);
        }

        /* renamed from: a */
        public final void m88185a(String str) {
            StoryViewerAndReactionBS storyViewerAndReactionBS = StoryViewerAndReactionBS.this;
            AbstractC19074t.m100205c(str);
            storyViewerAndReactionBS.m88165gM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88185a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$p */
    /* loaded from: classes4.dex */
    public static final class C16543p extends AbstractC19075u implements InterfaceC18505l {
        C16543p() {
            super(1);
        }

        /* renamed from: a */
        public final void m88186a(String str) {
            StoryViewerAndReactionBS storyViewerAndReactionBS = StoryViewerAndReactionBS.this;
            AbstractC19074t.m100205c(str);
            storyViewerAndReactionBS.m88164fM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88186a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$q */
    /* loaded from: classes4.dex */
    public static final class C16544q extends AbstractC19075u implements InterfaceC18505l {
        C16544q() {
            super(1);
        }

        /* renamed from: a */
        public final void m88187a(Integer num) {
            C22826a m88157YL = StoryViewerAndReactionBS.this.m88157YL();
            AbstractC19074t.m100205c(num);
            m88157YL.m10009q(num.intValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88187a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$r */
    /* loaded from: classes4.dex */
    public static final class C16545r extends AbstractC19075u implements InterfaceC18505l {
        C16545r() {
            super(1);
        }

        /* renamed from: a */
        public final void m88188a(C24848g0 c24848g0) {
            StoryViewerAndReactionBS.this.m88157YL().m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m88188a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryViewerAndReactionBS$s */
    /* loaded from: classes4.dex */
    static final class C16546s extends AbstractC19075u implements InterfaceC18494a {
        C16546s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return StoryViewerAndReactionBS.this.m88160bM();
        }
    }

    public StoryViewerAndReactionBS() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(new C16532e());
        this.f83545d1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C16530c());
        this.f83546e1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C16529b());
        this.f83547f1 = m129210a3;
        this.f83548g1 = new C16536i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C2 */
    public final C23528a m88140C2() {
        return (C23528a) this.f83547f1.getValue();
    }

    /* renamed from: WL */
    private final boolean m88155WL(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (abstractC1876c0 instanceof C22826a.d) {
            View view = ((C22826a.d) abstractC1876c0).f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            int measuredHeight = view.getMeasuredHeight();
            int m118713h0 = AbstractC23136l9.m118713h0();
            view.getLocationOnScreen(new int[2]);
            if (m118713h0 - r2[1] >= measuredHeight * 0.5f) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: XL */
    private final void m88156XL() {
        int m9745c2 = m88158ZL().m9745c2();
        C29787ed c29787ed = this.f83543b1;
        if (c29787ed == null) {
            AbstractC19074t.m100223u("binding");
            c29787ed = null;
        }
        RecyclerView.AbstractC1876c0 m9900t0 = c29787ed.f137692r.m9900t0(m9745c2);
        while (!m88155WL(m9900t0) && m9745c2 > 0) {
            m9745c2--;
            C29787ed c29787ed2 = this.f83543b1;
            if (c29787ed2 == null) {
                AbstractC19074t.m100223u("binding");
                c29787ed2 = null;
            }
            m9900t0 = c29787ed2.f137692r.m9900t0(m9745c2);
        }
        m88159aM().m128162w0(m9745c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YL */
    public final C22826a m88157YL() {
        return (C22826a) this.f83546e1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public final LinearLayoutManager m88158ZL() {
        return (LinearLayoutManager) this.f83545d1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public final C24628g m88159aM() {
        return (C24628g) this.f83544c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public final C24633l m88160bM() {
        return new C24633l();
    }

    /* renamed from: cM */
    private final void m88161cM() {
        m88159aM().m128157r0(C24622a.Companion.m128128a(m92642L3()));
        m88169kM();
    }

    /* renamed from: dM */
    private final void m88162dM() {
        int i11;
        C29787ed c29787ed = this.f83543b1;
        if (c29787ed == null) {
            AbstractC19074t.m100223u("binding");
            c29787ed = null;
        }
        c29787ed.f137692r.setLayoutManager(m88158ZL());
        c29787ed.f137692r.setAdapter(m88157YL());
        c29787ed.f137692r.m9826E(new C16531d());
        int i12 = 0;
        c29787ed.f137692r.setPadding(0, 0, 0, AbstractC17484n.Companion.m92931b());
        c29787ed.f137696v.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryViewerAndReactionBS.m88163eM(StoryViewerAndReactionBS.this, view);
            }
        });
        View view = c29787ed.f137691q;
        C22037m0 c22037m0 = C22037m0.f108553a;
        if (c22037m0.m115034h()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        RobotoTextView robotoTextView = c29787ed.f137698x;
        if (!c22037m0.m115034h()) {
            i12 = 8;
        }
        robotoTextView.setVisibility(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public static final void m88163eM(StoryViewerAndReactionBS storyViewerAndReactionBS, View view) {
        AbstractC19074t.m100208f(storyViewerAndReactionBS, "this$0");
        storyViewerAndReactionBS.m88159aM().m128161v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public final void m88164fM(String str) {
        C17487o0 mo35579p;
        Bundle m140776b = new C27870vb(str).m140776b();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ChatView.class, m140776b, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public final void m88165gM(String str) {
        new C19171b().m101508a(new C19171b.a(this.f88762c0.m92676n2(), new C26365a.b(str, C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START)).m135743b(), 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public final void m88166hM(String str, final boolean z11) {
        int i11;
        int i12;
        int m127173b0;
        String str2;
        if (z11) {
            i11 = AbstractC8020f0.str_block_viewer_story_desc;
        } else {
            i11 = AbstractC8020f0.str_unblock_viewer_story_desc;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        if (z11) {
            i12 = AbstractC8020f0.str_block_viewer_story_comfirm;
        } else {
            i12 = AbstractC8020f0.str_unblock_viewer_story_comfirm;
        }
        String m118743r02 = AbstractC23136l9.m118743r0(i12);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "%s", 0, false, 6, null);
        if (m127173b0 >= 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            SpannableString spannableString = new SpannableString(format);
            spannableString.setSpan(new StyleSpan(1), m127173b0, str.length() + m127173b0, 33);
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a m90943t = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("story_reaction_modal_block_viewer").m90949z(spannableString).m90943t(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.uicontrol.i2
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                    StoryViewerAndReactionBS.m88167iM(StoryViewerAndReactionBS.this, z11, interfaceC17463d, i13);
                }
            });
            if (z11) {
                str2 = "btn_block_story_viewer_detail";
            } else {
                str2 = "btn_unblock_story_viewer_detail";
            }
            m90943t.m90947x(str2).m90934k(m118743r03, new InterfaceC17463d.d() { // from class: com.zing.zalo.uicontrol.j2
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                    StoryViewerAndReactionBS.m88168jM(z11, interfaceC17463d, i13);
                }
            }).m90937n("btn_cancel_block_story_viewer_detail").m90927d().mo13822K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m88167iM(StoryViewerAndReactionBS storyViewerAndReactionBS, boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(storyViewerAndReactionBS, "this$0");
        interfaceC17463d.dismiss();
        storyViewerAndReactionBS.m88159aM().m128143a0();
        if (z11) {
            AbstractC23647d.m123897g("49153101");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public static final void m88168jM(boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        if (z11) {
            AbstractC23647d.m123897g("49153102");
        }
    }

    /* renamed from: kM */
    private final void m88169kM() {
        m88159aM().m128146f0().m9219j(this, new C16533f(new C16537j()));
        m88159aM().m128144c0().m9219j(this, new C16533f(new C16538k()));
        m88159aM().m128152m0().m9219j(this, new C16533f(new C16539l()));
        if (C22037m0.f108553a.m115034h()) {
            m88159aM().m128151l0().m9219j(this, new C16533f(new C16540m()));
        }
        m88159aM().m128149i0().m9219j(this, new C16533f(new C16541n()));
        m88159aM().m128148h0().m9219j(this, new C16533f(new C16542o()));
        m88159aM().m128147g0().m9219j(this, new C16533f(new C16543p()));
        m88159aM().m128153n0().m9219j(this, new C16533f(new C16544q()));
        m88159aM().m128154o0().m9219j(this, new C16533f(new C16545r()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public final void m88170lM(C24628g.c cVar) {
        C29787ed c29787ed = this.f83543b1;
        if (c29787ed == null) {
            AbstractC19074t.m100223u("binding");
            c29787ed = null;
        }
        int i11 = C16528a.f83549a[cVar.m128164a().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        if (cVar.m128165b()) {
                            m88157YL().m117534O(false, true, true);
                            return;
                        }
                        AbstractC23136l9.m118744r1(c29787ed.f137695u, 8);
                        AbstractC23136l9.m118744r1(c29787ed.f137696v, 0);
                        AbstractC23136l9.m118744r1(c29787ed.f137692r, 8);
                        AbstractC23136l9.m118744r1(c29787ed.f137697w, 8);
                        return;
                    }
                    return;
                }
                AbstractC23136l9.m118744r1(c29787ed.f137695u, 8);
                AbstractC23136l9.m118744r1(c29787ed.f137696v, 8);
                AbstractC23136l9.m118744r1(c29787ed.f137692r, 8);
                AbstractC23136l9.m118744r1(c29787ed.f137697w, 0);
                return;
            }
            AbstractC23136l9.m118744r1(c29787ed.f137695u, 8);
            AbstractC23136l9.m118744r1(c29787ed.f137696v, 8);
            AbstractC23136l9.m118744r1(c29787ed.f137692r, 0);
            AbstractC23136l9.m118744r1(c29787ed.f137697w, 8);
            m88157YL().m117534O(false, false, false);
            return;
        }
        if (cVar.m128165b()) {
            m88157YL().m117534O(true, false, true);
            return;
        }
        AbstractC23136l9.m118744r1(c29787ed.f137695u, 0);
        AbstractC23136l9.m118744r1(c29787ed.f137696v, 8);
        AbstractC23136l9.m118744r1(c29787ed.f137692r, 8);
        AbstractC23136l9.m118744r1(c29787ed.f137697w, 8);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        BottomSheetLayout m90518hL = m90518hL();
        if (m90511aL() && m90518hL != null && m90518hL.getTranslationY() == m90518hL.getMinTranslationY()) {
            C29787ed c29787ed = this.f83543b1;
            if (c29787ed == null) {
                AbstractC19074t.m100223u("binding");
                c29787ed = null;
            }
            if (!c29787ed.f137692r.canScrollVertically(1)) {
                C29787ed c29787ed2 = this.f83543b1;
                if (c29787ed2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29787ed2 = null;
                }
                if (c29787ed2.f137692r.canScrollVertically(-1)) {
                    return m90518hL;
                }
            } else {
                return m90518hL;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: X0 */
    public boolean mo47166X0(float f11, boolean z11, float f12) {
        if (z11) {
            close();
            return true;
        }
        return super.mo47166X0(f11, z11, f12);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    public void close() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_STORY_ID", m88159aM().m128150j0());
        intent.putExtra("EXTRA_TOTAL_VIEWER_COUNT", (Serializable) m88159aM().m128152m0().mo9215f());
        intent.putExtra("EXTRA_TOTAL_REACTION_COUNT", (Serializable) m88159aM().m128151l0().mo9215f());
        intent.putExtra("EXTRA_NEED_RE_SORT_STORY", m88159aM().m128145e0());
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        m88156XL();
        m88159aM().m128160u0();
        super.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.DETENTS);
        m90522qL(true);
        m90524sL(0.6f);
        C29787ed m147910c = C29787ed.m147910c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147910c, "inflate(...)");
        this.f83543b1 = m147910c;
        m88162dM();
        m88161cM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1000) {
            m88157YL().m10008p();
        } else {
            super.onActivityResult(i11, i12, intent);
        }
    }
}
