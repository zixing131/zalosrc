package com.zing.zalo.p077ui.mycloud.base;

import ag0.AbstractC0837p0;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import au.EnumC2369r;
import b40.C2526d;
import b90.C2665b;
import b90.C2666c;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.base.AbstractC12521a;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.uidrawing.C16719g;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import i60.C20338d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23081g9;
import me0.C23250w4;
import mg.C23288a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p246iw.C20843c0;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p365nk.C23805a;
import p461qu.AbstractC25495a;
import pk.C24797a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q90.C25199b;
import q90.C25201d;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import u80.InterfaceC27126g2;
import u80.InterfaceC27130h2;
import u80.InterfaceC27158o2;
import vc0.InterfaceC27965d;
import w80.C28824u;

/* renamed from: com.zing.zalo.ui.mycloud.base.a */
/* loaded from: classes6.dex */
public abstract class AbstractC12521a extends AbstractC19962a implements InterfaceC27126g2 {

    /* renamed from: A */
    private boolean f65438A;

    /* renamed from: B */
    private boolean f65439B;

    /* renamed from: C */
    private boolean f65440C;

    /* renamed from: D */
    private boolean f65441D;

    /* renamed from: E */
    private MyCloudItem f65442E;

    /* renamed from: F */
    private final Object f65443F;

    /* renamed from: G */
    private int f65444G;

    /* renamed from: H */
    private C23805a.e f65445H;

    /* renamed from: I */
    private boolean f65446I;

    /* renamed from: J */
    private boolean f65447J;

    /* renamed from: K */
    private long f65448K;

    /* renamed from: L */
    private boolean f65449L;

    /* renamed from: M */
    private boolean f65450M;

    /* renamed from: N */
    private float f65451N;

    /* renamed from: O */
    private int f65452O;

    /* renamed from: P */
    private int f65453P;

    /* renamed from: Q */
    private int f65454Q;

    /* renamed from: R */
    private boolean f65455R;

    /* renamed from: S */
    private int f65456S;

    /* renamed from: T */
    private boolean f65457T;

    /* renamed from: U */
    private int f65458U;

    /* renamed from: V */
    private int f65459V;

    /* renamed from: W */
    private int f65460W;

    /* renamed from: X */
    private final int f65461X;

    /* renamed from: t */
    private final InterfaceC24854k f65462t;

    /* renamed from: u */
    private final InterfaceC24854k f65463u;

    /* renamed from: v */
    private final InterfaceC24854k f65464v;

    /* renamed from: w */
    private BaseMyCloudTabView.AbstractC12510b f65465w;

    /* renamed from: x */
    private final InterfaceC24854k f65466x;

    /* renamed from: y */
    private final InterfaceC24854k f65467y;

    /* renamed from: z */
    private String f65468z;

    /* renamed from: com.zing.zalo.ui.mycloud.base.a$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65469a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f65470b;

        static {
            int[] iArr = new int[C23805a.d.values().length];
            try {
                iArr[C23805a.d.f115058r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C23805a.d.f115056p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C23805a.d.f115059s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C23805a.d.f115060t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C23805a.d.f115057q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f65469a = iArr;
            int[] iArr2 = new int[C23805a.e.values().length];
            try {
                iArr2[C23805a.e.f115063p.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[C23805a.e.f115064q.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f65470b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.base.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f65471q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2665b mo12V4() {
            return new C2665b(0, false, null, 7, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.a$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC27158o2 {
        c() {
        }

        @Override // u80.InterfaceC27158o2
        /* renamed from: a */
        public void mo70518a(MyCloudMessageItem myCloudMessageItem, boolean z11) {
            AbstractC19074t.m100208f(myCloudMessageItem, "item");
            ((InterfaceC27130h2) AbstractC12521a.this.m103742Dp()).mo70343Vm(myCloudMessageItem, z11);
            AbstractC12521a.this.m70463Eq(myCloudMessageItem, z11);
            AbstractC12521a.this.m70498er(myCloudMessageItem, z11);
        }

        @Override // u80.InterfaceC27158o2
        /* renamed from: b */
        public void mo70519b(MyCloudItem myCloudItem, boolean z11) {
            AbstractC19074t.m100208f(myCloudItem, "item");
            AbstractC12521a.this.m70466Iq(myCloudItem, z11);
        }

        @Override // u80.InterfaceC27158o2
        /* renamed from: c */
        public void mo70520c(MyCloudMessageItem myCloudMessageItem, int i11, C16719g c16719g) {
            AbstractC19074t.m100208f(myCloudMessageItem, "item");
            AbstractC12521a.this.mo70464Fq(myCloudMessageItem, i11, c16719g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.base.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f65473q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.base.a$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f65474q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.base.a$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f65475q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23805a mo12V4() {
            return AbstractC23306f.m120605O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.base.a$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f65476q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2665b mo12V4() {
            return new C2665b(0, false, null, 7, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12521a(InterfaceC27130h2 interfaceC27130h2) {
        super(interfaceC27130h2);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(interfaceC27130h2, "mvpView");
        m129210a = AbstractC24856m.m129210a(f.f65475q);
        this.f65462t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f65471q);
        this.f65463u = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(g.f65476q);
        this.f65464v = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(d.f65473q);
        this.f65466x = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(e.f65474q);
        this.f65467y = m129210a5;
        this.f65468z = "";
        this.f65443F = new Object();
        this.f65445H = C23805a.e.f115063p;
        this.f65456S = -1;
        this.f65461X = AbstractC23309i.m120819C8();
    }

    /* renamed from: Aq */
    private final C23805a m70410Aq() {
        return (C23805a) this.f65462t.getValue();
    }

    /* renamed from: Gq */
    public static final void m70411Gq(AbstractC12521a abstractC12521a, float f11) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70338ME(0, (int) f11);
    }

    /* renamed from: Hq */
    public static final void m70412Hq(AbstractC12521a abstractC12521a) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70338ME(0, 0);
    }

    /* renamed from: Lq */
    private final boolean m70416Lq(C17945a0 c17945a0) {
        int i11 = a.f65469a[mo946zq().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return AbstractC23463h.m123190r(c17945a0);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return AbstractC23463h.m123186n(c17945a0);
                }
                return AbstractC23463h.m123184l(c17945a0);
            }
            return AbstractC23463h.m123188p(c17945a0);
        }
        return AbstractC23463h.m123192t(c17945a0);
    }

    /* renamed from: Mq */
    private final boolean m70418Mq(C17945a0 c17945a0) {
        boolean z11;
        int i11 = a.f65469a[mo946zq().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return true;
                    }
                    return AbstractC23463h.m123186n(c17945a0);
                }
                return AbstractC23463h.m123184l(c17945a0);
            }
            return AbstractC23463h.m123188p(c17945a0);
        }
        if (AbstractC19646n0.m103011o1(c17945a0) && c17945a0.m94929K2().f91011p.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC19646n0.m103044x1(c17945a0.m95041W4()) || z11) {
            return true;
        }
        return false;
    }

    /* renamed from: Qq */
    public static final void m70423Qq(AbstractC12521a abstractC12521a) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        if (abstractC12521a.f65460W != ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70365qe()) {
            abstractC12521a.f65455R = true;
            ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70350dd();
        }
    }

    /* renamed from: Sq */
    private final void m70426Sq(MyCloudMessageItem myCloudMessageItem, boolean z11) {
        myCloudMessageItem.m71025i(z11);
        if (z11) {
            if (!m70454yq().containsKey(myCloudMessageItem.mo40586c())) {
                m70453xq().add(myCloudMessageItem);
                m70454yq().put(myCloudMessageItem.mo40586c(), myCloudMessageItem);
                return;
            }
            return;
        }
        m70454yq().remove(myCloudMessageItem.mo40586c());
        m70453xq().remove(myCloudMessageItem);
    }

    /* renamed from: Tq */
    private final void m70428Tq(Object... objArr) {
        boolean z11;
        if (objArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            InterfaceC27130h2.a.m139239b((InterfaceC27130h2) m103742Dp(), new Runnable() { // from class: w80.g

                /* renamed from: p */
                public final /* synthetic */ Object[] f133491p;

                /* renamed from: q */
                public final /* synthetic */ AbstractC12521a f133492q;

                public /* synthetic */ RunnableC28810g(Object[] objArr2, AbstractC12521a this) {
                    r1 = objArr2;
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC12521a.m70429Uq(r1, r2);
                }
            }, 0L, 2, null);
        }
    }

    /* renamed from: Uq */
    public static final void m70429Uq(Object[] objArr, AbstractC12521a abstractC12521a) {
        AbstractC19074t.m100208f(objArr, "$args");
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        int i11 = 0;
        Object obj = objArr[0];
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (objArr[1] == abstractC12521a.f65445H) {
            if (abstractC12521a.m70439dr()) {
                i11 = intValue;
            }
            abstractC12521a.f65444G = i11;
            ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70354hx();
            ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70372tr();
            abstractC12521a.mo70460Dc();
            abstractC12521a.mo70516zk();
        }
    }

    /* renamed from: Xq */
    public static final void m70432Xq(MessageId messageId, AbstractC12521a abstractC12521a) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
        if (m2635r != null && abstractC12521a.m70416Lq(m2635r)) {
            ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70322Da(messageId);
        }
    }

    /* renamed from: aq */
    private final void m70435aq(int i11) {
        CharSequence charSequence;
        if (i11 < 0) {
            return;
        }
        try {
            MyCloudItem mo70342Se = ((InterfaceC27130h2) m103742Dp()).mo70342Se(i11);
            if (mo70342Se != null) {
                if (mo70342Se.m71021e() == -100) {
                    this.f65442E = mo70342Se;
                    charSequence = mo70342Se.m71019a();
                } else {
                    MyCloudItem myCloudItem = null;
                    if (mo70342Se instanceof MyCloudMessageItem) {
                        C2666c c2666c = (C2666c) m70508oq().m13088g().get(Long.valueOf(mo70342Se.m71020d()));
                        if (c2666c != null) {
                            myCloudItem = c2666c.m13099d();
                        }
                        this.f65442E = myCloudItem;
                        charSequence = C23250w4.m119785D(((MyCloudMessageItem) mo70342Se).m71033m().m94974P4(), EnumC2369r.f9911q, true);
                    } else if (mo70342Se.m71021e() == -700) {
                        MyCloudItem mo70342Se2 = ((InterfaceC27130h2) m103742Dp()).mo70342Se(i11 + 1);
                        if (mo70342Se2 != null) {
                            this.f65442E = mo70342Se2;
                            charSequence = mo70342Se2.m71019a();
                        } else {
                            charSequence = null;
                        }
                    } else {
                        charSequence = "";
                    }
                }
                if (!AbstractC19074t.m100204b(charSequence, this.f65468z)) {
                    this.f65468z = String.valueOf(charSequence);
                    ((InterfaceC27130h2) m103742Dp()).mo70351do(String.valueOf(charSequence));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ar */
    public static final void m70436ar(AbstractC12521a abstractC12521a, List list) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        AbstractC19074t.m100208f(list, "$searchResults");
        abstractC12521a.m70410Aq().m124384g(abstractC12521a.m70458Bq(), list, abstractC12521a.mo946zq(), true, 100);
        abstractC12521a.mo70511sf(false);
        ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70340OH(abstractC12521a.m70458Bq());
    }

    /* renamed from: br */
    public static final void m70437br(AbstractC12521a abstractC12521a) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70350dd();
    }

    /* renamed from: cq */
    public static /* synthetic */ boolean m70438cq(AbstractC12521a abstractC12521a, SelectedItemData selectedItemData, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                selectedItemData = null;
            }
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return abstractC12521a.mo70493bq(selectedItemData, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkIfValidToSelectItem");
    }

    /* renamed from: dr */
    private final boolean m70439dr() {
        if (this.f65445H != C23805a.e.f115064q && mo946zq() != C23805a.d.f115057q) {
            return false;
        }
        return true;
    }

    /* renamed from: eq */
    public static final void m70440eq(AbstractC12521a abstractC12521a, boolean z11) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        abstractC12521a.m70410Aq().m124384g(abstractC12521a.m70458Bq(), abstractC12521a.m70459Cq(), abstractC12521a.mo946zq(), z11, 100);
        abstractC12521a.f65439B = false;
        abstractC12521a.mo70511sf(false);
        ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70340OH(abstractC12521a.m70458Bq());
    }

    /* renamed from: fq */
    public static final void m70441fq(boolean z11, AbstractC12521a abstractC12521a) {
        boolean z12;
        Object m131216p0;
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        if (z11) {
            abstractC12521a.m70508oq().m13091j();
            abstractC12521a.m70410Aq().m124381d();
        }
        C23805a m70410Aq = abstractC12521a.m70410Aq();
        AbstractC19074t.m100207e(m70410Aq, "<get-myCloudDataRepo>(...)");
        C24797a m124376l = C23805a.m124376l(m70410Aq, abstractC12521a.f65445H, abstractC12521a.mo946zq(), abstractC12521a.m70508oq().m13086e(), 0, abstractC12521a.f65448K, 8, null);
        C2665b m70508oq = abstractC12521a.m70508oq();
        if (m124376l.m128811b() >= 100) {
            z12 = true;
        } else {
            z12 = false;
        }
        m70508oq.m13092k(z12);
        if (abstractC12521a.f65445H == C23805a.e.f115064q) {
            abstractC12521a.m70508oq().m13092k(false);
        }
        List<MyCloudMessageItem> m128810a = m124376l.m128810a();
        if (!m128810a.isEmpty()) {
            m131216p0 = AbstractC25332a0.m131216p0(m128810a);
            long m119182A0 = AbstractC23160o0.m119182A0(((MyCloudMessageItem) m131216p0).m71033m().m95313z4());
            int i11 = 0;
            int i12 = 0;
            for (MyCloudMessageItem myCloudMessageItem : m128810a) {
                i11++;
                myCloudMessageItem.m71024h(AbstractC23160o0.m119182A0(myCloudMessageItem.m71033m().m95313z4()));
                if (i12 == 0 && m119182A0 == myCloudMessageItem.m71020d()) {
                    i12 = (m128810a.size() - i11) + 1;
                }
                if (!abstractC12521a.m70508oq().m13085d() || i12 == 0 || i12 >= 50) {
                    C2665b m70508oq2 = abstractC12521a.m70508oq();
                    m70508oq2.m13093l(m70508oq2.m13086e() + 1);
                    abstractC12521a.m70508oq().m13083b(myCloudMessageItem);
                    abstractC12521a.m70410Aq().m124379b(myCloudMessageItem);
                }
            }
        }
        abstractC12521a.f65438A = false;
        if (!abstractC12521a.f65446I) {
            abstractC12521a.mo70511sf(false);
            ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70340OH(abstractC12521a.m70508oq());
        }
    }

    /* renamed from: hq */
    public static final void m70442hq(AbstractC12521a abstractC12521a, MyCloudMessageItem myCloudMessageItem, boolean z11) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        AbstractC19074t.m100208f(myCloudMessageItem, "$item");
        abstractC12521a.m70463Eq(myCloudMessageItem, z11);
    }

    /* renamed from: iq */
    private final void m70443iq(MyCloudItem myCloudItem, boolean z11) {
        boolean z12;
        int mo70323Dv = ((InterfaceC27130h2) m103742Dp()).mo70323Dv(myCloudItem);
        if (mo70323Dv >= 0) {
            z12 = ((InterfaceC27130h2) m103742Dp()).mo70378zn(mo70323Dv, z11, true);
        } else {
            z12 = false;
        }
        if (myCloudItem.m71021e() == -100 && AbstractC19074t.m100204b(myCloudItem, m70447qq())) {
            ((InterfaceC27130h2) m103742Dp()).mo70349bk(z11);
        }
        if (!z12 && (myCloudItem instanceof MyCloudMessageItem)) {
            MyCloudMessageItem myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
            m70426Sq(myCloudMessageItem, z11);
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
            if (abstractC12510b != null) {
                abstractC12510b.mo70394m(C23250w4.m119810m(C23250w4.f112644a, myCloudMessageItem.m71033m(), null, 2, null), z11);
            }
        }
    }

    /* renamed from: jq */
    private final void m70444jq() {
        if (!this.f65450M) {
            this.f65450M = true;
            C23081g9.m118410g(30L);
        }
    }

    /* renamed from: kq */
    private final void m70445kq() {
        Iterator it = m70453xq().iterator();
        while (it.hasNext()) {
            ((MyCloudMessageItem) it.next()).m71025i(false);
        }
        synchronized (m70507nq()) {
            try {
                Iterator it2 = m70507nq().m13088g().values().iterator();
                while (it2.hasNext()) {
                    ((C2666c) it2.next()).m13099d().m71025i(false);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m70453xq().clear();
        m70454yq().clear();
    }

    /* renamed from: lq */
    private final int m70446lq(int i11) {
        if (this.f65444G == 0) {
            return i11;
        }
        int mo70365qe = ((InterfaceC27130h2) m103742Dp()).mo70365qe();
        while (i11 < mo70365qe) {
            View mo70325FH = ((InterfaceC27130h2) m103742Dp()).mo70325FH(i11);
            if (mo70325FH != null && mo70325FH.getBottom() > this.f65444G) {
                return i11;
            }
            i11++;
        }
        return m70505mq();
    }

    /* renamed from: qq */
    private final MyCloudItem m70447qq() {
        return this.f65442E;
    }

    /* renamed from: sq */
    public static final void m70448sq(AbstractC12521a abstractC12521a) {
        float f11;
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        if (abstractC12521a.f65465w != null) {
            InterfaceC27130h2 interfaceC27130h2 = (InterfaceC27130h2) abstractC12521a.m103742Dp();
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = abstractC12521a.f65465w;
            if (abstractC12510b != null) {
                f11 = abstractC12510b.mo70387f();
            } else {
                f11 = 0.0f;
            }
            interfaceC27130h2.mo70328Hn(f11, true);
        }
    }

    /* renamed from: tq */
    public static final void m70449tq(AbstractC12521a abstractC12521a) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70350dd();
    }

    /* renamed from: uq */
    public static final void m70450uq(AbstractC12521a abstractC12521a) {
        float f11;
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        if (abstractC12521a.f65465w != null) {
            InterfaceC27130h2 interfaceC27130h2 = (InterfaceC27130h2) abstractC12521a.m103742Dp();
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = abstractC12521a.f65465w;
            if (abstractC12510b != null) {
                f11 = abstractC12510b.mo70387f();
            } else {
                f11 = 0.0f;
            }
            interfaceC27130h2.mo70328Hn(f11, true);
        }
    }

    /* renamed from: vq */
    public static final void m70451vq(AbstractC12521a abstractC12521a) {
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        ((InterfaceC27130h2) abstractC12521a.m103742Dp()).mo70350dd();
    }

    /* renamed from: wq */
    public static final void m70452wq(AbstractC12521a abstractC12521a) {
        float f11;
        AbstractC19074t.m100208f(abstractC12521a, "this$0");
        if (abstractC12521a.f65465w != null) {
            InterfaceC27130h2 interfaceC27130h2 = (InterfaceC27130h2) abstractC12521a.m103742Dp();
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = abstractC12521a.f65465w;
            if (abstractC12510b != null) {
                f11 = abstractC12510b.mo70387f();
            } else {
                f11 = 0.0f;
            }
            interfaceC27130h2.mo70328Hn(f11, true);
        }
    }

    /* renamed from: xq */
    private final List m70453xq() {
        return (List) this.f65466x.getValue();
    }

    /* renamed from: yq */
    private final Map m70454yq() {
        return (Map) this.f65467y.getValue();
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: A1 */
    public void mo70455A1() {
        this.f65441D = false;
        this.f65446I = false;
        ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70508oq());
        if (!this.f65440C) {
            mo70497dq(true);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: A5 */
    public void mo70456A5(int i11) {
        int m70446lq = m70446lq(i11);
        View mo70325FH = ((InterfaceC27130h2) m103742Dp()).mo70325FH(m70446lq);
        boolean z11 = false;
        if (m70507nq().m13089h() == 0) {
            ((InterfaceC27130h2) m103742Dp()).mo70376yw(false);
            return;
        }
        if (mo70325FH != null && m70446lq != m70505mq() && mo70325FH.getBottom() < ((InterfaceC27130h2) m103742Dp()).mo70347Zi()) {
            m70446lq++;
        }
        if (m70446lq == m70505mq()) {
            if (((InterfaceC27130h2) m103742Dp()).mo70353hD() == 0) {
                ((InterfaceC27130h2) m103742Dp()).mo70344XE(false);
            }
            ((InterfaceC27130h2) m103742Dp()).mo70376yw(false);
        } else {
            if (m70446lq > m70505mq()) {
                if (((InterfaceC27130h2) m103742Dp()).mo70353hD() == 8) {
                    ((InterfaceC27130h2) m103742Dp()).mo70344XE(true);
                }
                ((InterfaceC27130h2) m103742Dp()).mo70376yw(true);
                m70435aq(m70446lq);
                if (this.f65449L) {
                    InterfaceC27130h2 interfaceC27130h2 = (InterfaceC27130h2) m103742Dp();
                    MyCloudItem m70447qq = m70447qq();
                    if (m70447qq != null) {
                        z11 = m70447qq.m71022f();
                    }
                    interfaceC27130h2.mo70349bk(z11);
                    return;
                }
                return;
            }
            ((InterfaceC27130h2) m103742Dp()).mo70376yw(false);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Ap */
    public void mo70457Ap(int i11, int i12, boolean z11) {
        if (!z11 || m70438cq(this, null, false, 3, null)) {
            int i13 = i12 + 1;
            while (i11 < i13) {
                ((InterfaceC27130h2) m103742Dp()).mo70378zn(i11, z11, false);
                i11++;
            }
        }
    }

    /* renamed from: Bq */
    public final C2665b m70458Bq() {
        return (C2665b) this.f65464v.getValue();
    }

    /* renamed from: Cq */
    public final List m70459Cq() {
        List mo70388g;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
        if (abstractC12510b == null || (mo70388g = abstractC12510b.mo70388g()) == null) {
            return new ArrayList();
        }
        return mo70388g;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Dc */
    public void mo70460Dc() {
        if (this.f65445H == C23805a.e.f115063p) {
            ((InterfaceC27130h2) m103742Dp()).mo70370sp();
        }
    }

    /* renamed from: Dq */
    public final C23805a.e m70461Dq() {
        return this.f65445H;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: E7 */
    public int mo70462E7() {
        if (m70439dr()) {
            return this.f65444G;
        }
        return 0;
    }

    /* renamed from: Eq */
    public final void m70463Eq(MyCloudMessageItem myCloudMessageItem, boolean z11) {
        AbstractC19074t.m100208f(myCloudMessageItem, "item");
        if (z11) {
            try {
                if (!m70438cq(this, C23250w4.m119810m(C23250w4.f112644a, myCloudMessageItem.m71033m(), null, 2, null), false, 2, null)) {
                    m70443iq(myCloudMessageItem, false);
                    m70426Sq(myCloudMessageItem, false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        m70426Sq(myCloudMessageItem, z11);
        ((InterfaceC27130h2) m103742Dp()).mo70343Vm(myCloudMessageItem, z11);
        mo70475Pq(C23250w4.m119810m(C23250w4.f112644a, myCloudMessageItem.m71033m(), null, 2, null), z11);
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
    }

    /* renamed from: Fq */
    public void mo70464Fq(MyCloudMessageItem myCloudMessageItem, int i11, C16719g c16719g) {
        String str;
        AbstractC19074t.m100208f(myCloudMessageItem, "item");
        ((InterfaceC27130h2) m103742Dp()).mo70356l1(i11);
        InterfaceC27130h2.a.m139238a((InterfaceC27130h2) m103742Dp(), false, false, 3, null);
        m70463Eq(myCloudMessageItem, true);
        m70498er(myCloudMessageItem, true);
        ((InterfaceC27130h2) m103742Dp()).mo70368s2(i11);
        if (!mo70470Nq()) {
            if (this.f65445H == C23805a.e.f115063p) {
                str = "mycloud_listing";
            } else {
                str = "collection_detail";
            }
            C2526d.f10270a.m12699X(myCloudMessageItem.m71033m(), i11, str, "4");
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Gj */
    public void mo70465Gj() {
        ((InterfaceC27130h2) m103742Dp()).mo70348Zl(new Runnable() { // from class: w80.a
            public /* synthetic */ RunnableC28804a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12521a.m70423Qq(AbstractC12521a.this);
            }
        }, 300L);
    }

    /* renamed from: Iq */
    public final void m70466Iq(MyCloudItem myCloudItem, boolean z11) {
        List<MyCloudMessageItem> m13098c;
        AbstractC19074t.m100208f(myCloudItem, "item");
        myCloudItem.m71025i(z11);
        m70443iq(myCloudItem, z11);
        C2666c c2666c = (C2666c) m70507nq().m13088g().get(Long.valueOf(myCloudItem.m71020d()));
        if (c2666c != null && (m13098c = c2666c.m13098c()) != null) {
            boolean z12 = false;
            for (MyCloudMessageItem myCloudMessageItem : m13098c) {
                if (myCloudMessageItem.m71022f() != z11) {
                    if (z11 && !mo70493bq(C23250w4.m119810m(C23250w4.f112644a, myCloudMessageItem.m71033m(), null, 2, null), !z12)) {
                        z12 = true;
                    } else {
                        m70443iq(myCloudMessageItem, z11);
                    }
                }
            }
            if (z12) {
                myCloudItem.m71025i(false);
                m70443iq(myCloudItem, false);
            }
        }
    }

    /* renamed from: Jq */
    public boolean mo70467Jq() {
        return !m70453xq().isEmpty();
    }

    /* renamed from: Kq */
    public final boolean m70468Kq() {
        return this.f65438A;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: M8 */
    public void mo70469M8(Object obj) {
        MessageId messageId;
        AbstractC19074t.m100208f(obj, "obj");
        if (obj instanceof MessageId) {
            messageId = (MessageId) obj;
        } else {
            messageId = null;
        }
        if (messageId != null) {
            ((InterfaceC27130h2) m103742Dp()).mo70333JF(messageId);
        }
    }

    /* renamed from: Nq */
    public boolean mo70470Nq() {
        return false;
    }

    /* renamed from: Oq */
    public final boolean m70471Oq() {
        return this.f65441D;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: P5 */
    public void mo70472P5(Object obj, int i11) {
        C17945a0 c17945a0;
        AbstractC19074t.m100208f(obj, "obj");
        if (obj instanceof C17945a0) {
            c17945a0 = (C17945a0) obj;
        } else {
            c17945a0 = null;
        }
        if (c17945a0 != null) {
            ((InterfaceC27130h2) m103742Dp()).mo70330IH(c17945a0);
            if (i11 == 0) {
                ((InterfaceC27130h2) m103742Dp()).mo70338ME(0, 0);
            }
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: P9 */
    public void mo70473P9(Object obj) {
        C2665b c2665b;
        AbstractC19074t.m100208f(obj, "obj");
        if (obj instanceof C2665b) {
            c2665b = (C2665b) obj;
        } else {
            c2665b = null;
        }
        if (c2665b != null) {
            ((InterfaceC27130h2) m103742Dp()).mo70319Ag(c2665b);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Pb */
    public void mo70474Pb() {
        if (mo70470Nq() || this.f65447J) {
            ((InterfaceC27130h2) m103742Dp()).mo70359nC(false, false);
        }
    }

    /* renamed from: Pq */
    public void mo70475Pq(SelectedItemData selectedItemData, boolean z11) {
        AbstractC19074t.m100208f(selectedItemData, "item");
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
        if (abstractC12510b != null) {
            abstractC12510b.mo70394m(selectedItemData, z11);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: R3 */
    public void mo70476R3(String str, List list) {
        AbstractC19074t.m100208f(str, "keySearch");
        AbstractC19074t.m100208f(list, "searchResults");
        this.f65446I = true;
        if (str.length() == 0) {
            mo70455A1();
            return;
        }
        this.f65441D = true;
        this.f65446I = true;
        AbstractC18428c.m97659b(C23288a.f113033a, "204278670", 0, new Runnable() { // from class: w80.f

            /* renamed from: q */
            public final /* synthetic */ List f133490q;

            public /* synthetic */ RunnableC28809f(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12521a.m70436ar(AbstractC12521a.this, r2);
            }
        }, 2, null);
    }

    /* renamed from: Rq */
    public void m70477Rq(C28824u c28824u, InterfaceC19968g interfaceC19968g) {
        int i11;
        super.mo995Nd(c28824u, interfaceC19968g);
        if (c28824u != null) {
            this.f65446I = c28824u.m144075e();
            if (m70439dr()) {
                i11 = c28824u.m144072b();
            } else {
                i11 = 0;
            }
            this.f65444G = i11;
            this.f65445H = c28824u.m144074d();
            this.f65447J = c28824u.m144073c();
            this.f65448K = c28824u.m144071a();
        }
        ((InterfaceC27130h2) m103742Dp()).mo70366r8();
        ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
        if (!this.f65446I) {
            mo70497dq(true);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Sd */
    public void mo70478Sd(InterfaceC27965d interfaceC27965d, boolean z11) {
        if (interfaceC27965d instanceof MyCloudMessageItem) {
            MyCloudMessageItem myCloudMessageItem = (MyCloudMessageItem) interfaceC27965d;
            m70463Eq(myCloudMessageItem, z11);
            m70498er(myCloudMessageItem, z11);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: T */
    public void mo70479T(boolean z11, boolean z12) {
        int i11;
        if (z11) {
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
            if (abstractC12510b != null) {
                i11 = abstractC12510b.mo70384c();
            } else {
                i11 = 0;
            }
            this.f65444G = i11;
            ((InterfaceC27130h2) m103742Dp()).mo70372tr();
            mo70460Dc();
            mo70516zk();
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: T3 */
    public void mo70480T3() {
        ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: T6 */
    public float mo70481T6() {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
        if (abstractC12510b != null) {
            return abstractC12510b.mo70387f();
        }
        return 0.0f;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Tk */
    public void mo70482Tk() {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        if (this.f65446I && (abstractC12510b = this.f65465w) != null) {
            mo70476R3(abstractC12510b.mo70385d(), abstractC12510b.mo70388g());
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: V7 */
    public void mo70483V7(boolean z11) {
        synchronized (this.f65443F) {
            MyCloudItem myCloudItem = this.f65442E;
            if (myCloudItem != null) {
                m70466Iq(myCloudItem, z11);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: Vq */
    public void mo70484Vq(Object... objArr) {
        C17945a0 c17945a0;
        AbstractC19074t.m100208f(objArr, "args");
        if (objArr.length == 0) {
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof C17945a0) {
            c17945a0 = (C17945a0) obj;
        } else {
            c17945a0 = null;
        }
        if (c17945a0 != null && !mo70470Nq() && this.f65445H != C23805a.e.f115064q && m70418Mq(c17945a0) && m70508oq().m13082a(c17945a0) != null) {
            m70508oq().m13088g();
            ((InterfaceC27130h2) m103742Dp()).mo70329IF(c17945a0);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: W3 */
    public void mo70485W3() {
        List arrayList;
        if (!mo70470Nq()) {
            return;
        }
        C25201d.a mo70352e1 = ((InterfaceC27130h2) m103742Dp()).mo70352e1();
        if (mo70352e1 != null && mo70352e1.mo72545Y0()) {
            mo70504m0(mo70352e1.mo72546Z0());
        }
        if (mo70352e1 == null || (arrayList = mo70352e1.mo72548v()) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() && !mo70467Jq()) {
            return;
        }
        ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
    }

    /* renamed from: Wq */
    public void m70486Wq(Object... objArr) {
        boolean z11;
        MessageId messageId;
        Object obj;
        AbstractC19074t.m100208f(objArr, "args");
        if (objArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Object obj2 = objArr[0];
            String str = null;
            if (obj2 instanceof MessageId) {
                messageId = (MessageId) obj2;
            } else {
                messageId = null;
            }
            if (objArr.length > 1 && (obj = objArr[1]) != null) {
                str = obj.toString();
            }
            if (messageId != null) {
                if (str == null || str.length() == 0 || AbstractC19074t.m100204b(str, "204278670")) {
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: w80.e

                        /* renamed from: q */
                        public final /* synthetic */ AbstractC12521a f133488q;

                        public /* synthetic */ RunnableC28808e(AbstractC12521a this) {
                            r2 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC12521a.m70432Xq(MessageId.this, r2);
                        }
                    });
                }
            }
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Xh */
    public InterfaceC27158o2 mo70487Xh() {
        return new c();
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Y0 */
    public boolean mo70488Y0() {
        int i11 = a.f65470b[this.f65445H.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return C20843c0.Companion.m109092a().m109083n1();
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.f65446I;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: Y2 */
    public void mo70489Y2() {
    }

    /* renamed from: Yq */
    public void m70490Yq(Object... objArr) {
        boolean z11;
        Long l11;
        AbstractC19074t.m100208f(objArr, "args");
        if (this.f65445H == C23805a.e.f115064q) {
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                Object obj = objArr[0];
                if (obj instanceof Long) {
                    l11 = (Long) obj;
                } else {
                    l11 = null;
                }
                long j11 = this.f65448K;
                if (l11 != null && l11.longValue() == j11) {
                    mo70497dq(true);
                }
            }
        }
    }

    /* renamed from: Zq */
    public void mo70491Zq(Object... objArr) {
        C20338d c20338d;
        AbstractC19074t.m100208f(objArr, "args");
        if (objArr.length == 0) {
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof C20338d) {
            c20338d = (C20338d) obj;
        } else {
            c20338d = null;
        }
        if (c20338d != null && c20338d.m106046d() != null && AbstractC19074t.m100204b(c20338d.m106046d().mo95039W2(), "204278670")) {
            if (m70507nq().m13090i(c20338d.m106046d())) {
                ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
            }
            m70500gq();
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: b7 */
    public void mo70492b7(int i11, int i12, int i13, int i14) {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        try {
            mo70456A5(i11);
            if (i12 <= 0) {
                mo70497dq(false);
            }
            if (this.f65444G != 0 && i14 != 0) {
                View mo70325FH = ((InterfaceC27130h2) m103742Dp()).mo70325FH(0);
                BaseMyCloudTabView.AbstractC12510b abstractC12510b2 = this.f65465w;
                if (abstractC12510b2 != null) {
                    abstractC12510b2.mo70391j(mo70325FH);
                }
                if (mo70325FH != null) {
                    this.f65451N = mo70325FH.getY();
                }
            }
            if (i13 == 1 && i14 < 0 && (abstractC12510b = this.f65465w) != null) {
                abstractC12510b.mo70400s();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: bq */
    public boolean mo70493bq(SelectedItemData selectedItemData, boolean z11) {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
        if (abstractC12510b != null) {
            return abstractC12510b.mo70383b(selectedItemData, z11);
        }
        return true;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: cd */
    public void mo70494cd(C2665b c2665b) {
        AbstractC19074t.m100208f(c2665b, "data");
    }

    /* renamed from: cr */
    public final void m70495cr(BaseMyCloudTabView.AbstractC12510b abstractC12510b) {
        this.f65465w = abstractC12510b;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: do */
    public void mo70496do(int i11) {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        if (this.f65444G != 0) {
            if (i11 == 0) {
                View mo70325FH = ((InterfaceC27130h2) m103742Dp()).mo70325FH(0);
                BaseMyCloudTabView.AbstractC12510b abstractC12510b2 = this.f65465w;
                if (abstractC12510b2 != null) {
                    abstractC12510b2.mo70391j(mo70325FH);
                }
            } else if (i11 > 0 && (abstractC12510b = this.f65465w) != null) {
                abstractC12510b.mo70391j(null);
            }
        }
        BaseMyCloudTabView.AbstractC12510b abstractC12510b3 = this.f65465w;
        if (abstractC12510b3 != null) {
            abstractC12510b3.mo70400s();
        }
    }

    /* renamed from: dq */
    public void mo70497dq(boolean z11) {
        if (this.f65446I) {
            if (!this.f65439B) {
                if (z11 || m70458Bq().m13085d()) {
                    this.f65439B = true;
                    AbstractC18428c.m97659b(C23288a.f113033a, "204278670", 0, new Runnable() { // from class: w80.o

                        /* renamed from: q */
                        public final /* synthetic */ boolean f133502q;

                        public /* synthetic */ RunnableC28818o(boolean z112) {
                            r2 = z112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC12521a.m70440eq(AbstractC12521a.this, r2);
                        }
                    }, 2, null);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f65438A) {
            if (z112 || m70508oq().m13085d()) {
                this.f65440C = true;
                this.f65438A = true;
                AbstractC18428c.m97659b(C23288a.f113033a, "204278670", 0, new Runnable() { // from class: w80.b

                    /* renamed from: p */
                    public final /* synthetic */ boolean f133481p;

                    /* renamed from: q */
                    public final /* synthetic */ AbstractC12521a f133482q;

                    public /* synthetic */ RunnableC28805b(boolean z112, AbstractC12521a this) {
                        r1 = z112;
                        r2 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC12521a.m70441fq(r1, r2);
                    }
                }, 2, null);
            }
        }
    }

    /* renamed from: er */
    public final void m70498er(MyCloudMessageItem myCloudMessageItem, boolean z11) {
        MyCloudItem m13099d;
        List m13098c;
        MyCloudItem m13099d2;
        AbstractC19074t.m100208f(myCloudMessageItem, "item");
        synchronized (m70507nq()) {
            try {
                C2666c c2666c = (C2666c) m70507nq().m13088g().get(Long.valueOf(myCloudMessageItem.m71020d()));
                if (c2666c == null || (m13099d2 = c2666c.m13099d()) == null || m13099d2.m71022f() != z11) {
                    boolean z12 = false;
                    if (c2666c != null && (m13098c = c2666c.m13098c()) != null) {
                        List list = m13098c;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (!((MyCloudMessageItem) it.next()).m71022f()) {
                                    break;
                                }
                            }
                        }
                        z12 = true;
                    }
                    if (c2666c != null && (m13099d = c2666c.m13099d()) != null) {
                        m13099d.m71025i(z12);
                        m70443iq(m13099d, z12);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: g7 */
    public C23805a.e mo70499g7() {
        return this.f65445H;
    }

    /* renamed from: gb */
    public void mo16979gb(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        try {
            int m9929A = recyclerView.m9823C0(view).m9929A();
            int mo70365qe = ((InterfaceC27130h2) m103742Dp()).mo70365qe();
            if (m9929A >= 0 && m9929A < mo70365qe) {
                int itemViewType = ((InterfaceC27130h2) m103742Dp()).getItemViewType(m9929A);
                if (m9929A == m70505mq() && itemViewType != 12 && itemViewType != 13) {
                    rect.top = AbstractC23222t7.f112566j;
                }
                if (itemViewType != 2 && itemViewType != 1 && itemViewType != 12 && itemViewType != 13) {
                    rect.bottom = MyCloudFileTabView.Companion.m70808a();
                }
                if (itemViewType == 2) {
                    int i11 = AbstractC23222t7.f112586t;
                    rect.left = i11;
                    rect.right = i11;
                } else {
                    rect.left = 0;
                    rect.right = 0;
                }
                m70510rq(m9929A, rect, itemViewType, view);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: gq */
    public final void m70500gq() {
        if (m70507nq().m13085d() && m70507nq().m13089h() < 100) {
            mo70497dq(false);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: hb */
    public boolean mo70501hb(View view) {
        AbstractC19074t.m100208f(view, "view");
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
        if (abstractC12510b != null) {
            return abstractC12510b.mo70382a(view);
        }
        return false;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: kj */
    public void mo70502kj(float f11, boolean z11, int i11) {
        InterfaceC27126g2.a.m139237a(this, false, 1, null);
        if (f11 == 0.0f) {
            if ((this.f65451N != f11 && i11 != 0) || z11) {
                InterfaceC27130h2.a.m139239b((InterfaceC27130h2) m103742Dp(), new Runnable() { // from class: w80.i
                    public /* synthetic */ RunnableC28812i() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC12521a.m70412Hq(AbstractC12521a.this);
                    }
                }, 0L, 2, null);
            }
        } else if (Math.abs(f11) != this.f65444G || i11 == 0 || z11) {
            InterfaceC27130h2.a.m139239b((InterfaceC27130h2) m103742Dp(), new Runnable() { // from class: w80.h

                /* renamed from: q */
                public final /* synthetic */ float f133494q;

                public /* synthetic */ RunnableC28811h(float f112) {
                    r2 = f112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC12521a.m70411Gq(AbstractC12521a.this, r2);
                }
            }, 0L, 2, null);
        }
        this.f65451N = f112;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: km */
    public void mo70503km(boolean z11, boolean z12) {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        if (this.f65449L) {
            return;
        }
        if (z11 && (abstractC12510b = this.f65465w) != null) {
            abstractC12510b.mo70380B(true);
        }
        this.f65449L = true;
        if (z12) {
            m70444jq();
        }
        ((InterfaceC27130h2) m103742Dp()).mo70335K1(this.f65449L);
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: m0 */
    public void mo70504m0(String str) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(str, "keyWord");
        C25199b.a mo70362p9 = ((InterfaceC27130h2) m103742Dp()).mo70362p9();
        if (mo70362p9 == null || (arrayList = mo70362p9.mo130441a()) == null) {
            arrayList = new ArrayList();
        }
        mo70476R3(str, arrayList);
    }

    /* renamed from: mq */
    public final int m70505mq() {
        return this.f65444G > 0 ? 1 : 0;
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: ni */
    public void mo70506ni() {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        if (mo946zq() == C23805a.d.f115057q && (abstractC12510b = this.f65465w) != null) {
            abstractC12510b.mo70401t();
        }
    }

    /* renamed from: nq */
    public final C2665b m70507nq() {
        if (this.f65441D) {
            return m70458Bq();
        }
        return m70508oq();
    }

    /* renamed from: oq */
    public final C2665b m70508oq() {
        return (C2665b) this.f65463u.getValue();
    }

    /* renamed from: pq */
    public final BaseMyCloudTabView.AbstractC12510b m70509pq() {
        return this.f65465w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0271, code lost:            if (r1 > r11) goto L339;     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0273, code lost:            r1 = r1 - r11;     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0275, code lost:            r1 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0280, code lost:            if (r1 > r11) goto L339;     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149 A[ADDED_TO_REGION] */
    /* renamed from: rq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70510rq(int i11, Rect rect, int i12, View view) {
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        boolean z17;
        int i17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        int i18;
        boolean z23;
        int i19;
        boolean z24;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        String mo70385d;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        if (this.f65445H != C23805a.e.f115063p ? AbstractC23306f.m120602N0().m109057K0().length() > 0 : !((abstractC12510b = this.f65465w) == null || (mo70385d = abstractC12510b.mo70385d()) == null || mo70385d.length() <= 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        int mo70365qe = ((InterfaceC27130h2) m103742Dp()).mo70365qe();
        if (this.f65445H == C23805a.e.f115064q) {
            if (i11 == mo70365qe - 1) {
                switch (i12) {
                    case 12:
                    case 13:
                        if (i12 == 12) {
                            this.f65460W = mo70365qe;
                        } else {
                            this.f65454Q = mo70365qe;
                        }
                        InterfaceC27130h2.a.m139239b((InterfaceC27130h2) m103742Dp(), new Runnable() { // from class: w80.n
                            public /* synthetic */ RunnableC28817n() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC12521a.m70452wq(AbstractC12521a.this);
                            }
                        }, 0L, 2, null);
                        return;
                    case 14:
                        int mo70339Nu = ((InterfaceC27130h2) m103742Dp()).mo70339Nu();
                        int mo70345Xg = ((InterfaceC27130h2) m103742Dp()).mo70345Xg();
                        int mo70332JC = ((InterfaceC27130h2) m103742Dp()).mo70332JC();
                        int mo70341Or = ((InterfaceC27130h2) m103742Dp()).mo70341Or();
                        BaseMyCloudTabView.AbstractC12510b abstractC12510b2 = this.f65465w;
                        if (abstractC12510b2 != null) {
                            i14 = abstractC12510b2.mo70386e();
                        } else {
                            i14 = 0;
                        }
                        int i21 = this.f65453P;
                        if ((i21 == 0 && i14 > 0) || (i21 > 0 && i14 == 0)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (this.f65456S < 0) {
                            this.f65456S = AbstractC23222t7.f112551b0;
                        }
                        if (!z11 && this.f65460W != mo70365qe) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z11 && this.f65454Q != mo70365qe) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((mo70332JC == mo70339Nu && mo70345Xg - mo70339Nu <= this.f65444G) || mo70332JC < mo70339Nu) {
                            if (z11) {
                                if (i14 > 0) {
                                    int i22 = this.f65452O;
                                    if (i22 != 0 && mo70332JC >= mo70339Nu) {
                                        if (i22 > 0) {
                                            if (z14) {
                                                this.f65452O = 0;
                                                z23 = false;
                                                i18 = 0;
                                                z18 = true;
                                                i19 = this.f65456S + i18;
                                                if (1 <= i19 && i19 < mo70339Nu) {
                                                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S + i18);
                                                }
                                                if (z23 && !z14) {
                                                    z24 = false;
                                                    z19 = false;
                                                } else {
                                                    z24 = false;
                                                    z19 = true;
                                                }
                                                this.f65455R = z24;
                                                this.f65453P = i14;
                                                this.f65454Q = mo70365qe;
                                            } else {
                                                i18 = i22 - i14;
                                            }
                                        } else {
                                            this.f65452O = 0;
                                            z18 = z14;
                                            z23 = false;
                                            i18 = 0;
                                            i19 = this.f65456S + i18;
                                            if (1 <= i19) {
                                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S + i18);
                                            }
                                            if (z23) {
                                            }
                                            z24 = false;
                                            z19 = true;
                                            this.f65455R = z24;
                                            this.f65453P = i14;
                                            this.f65454Q = mo70365qe;
                                        }
                                    } else {
                                        int i23 = ((this.f65444G + mo70339Nu) - mo70345Xg) + mo70341Or;
                                        if (this.f65454Q >= mo70365qe) {
                                            i23 = Math.max(i23, i22);
                                        }
                                        this.f65452O = i23;
                                        if (this.f65454Q == 0) {
                                            this.f65452O = i23 + i14;
                                            if (view.getPaddingBottom() == 0) {
                                                this.f65452O -= this.f65456S;
                                            }
                                        }
                                        i18 = this.f65452O - i14;
                                    }
                                    z23 = false;
                                    z18 = false;
                                    i19 = this.f65456S + i18;
                                    if (1 <= i19) {
                                    }
                                    if (z23) {
                                    }
                                    z24 = false;
                                    z19 = true;
                                    this.f65455R = z24;
                                    this.f65453P = i14;
                                    this.f65454Q = mo70365qe;
                                } else {
                                    i18 = this.f65452O;
                                    if (i18 != 0 && mo70332JC >= mo70339Nu) {
                                        if (i18 <= 0 || z14) {
                                            this.f65452O = 0;
                                            z18 = z14;
                                            z23 = false;
                                            i18 = 0;
                                            i19 = this.f65456S + i18;
                                            if (1 <= i19) {
                                            }
                                            if (z23) {
                                            }
                                            z24 = false;
                                            z19 = true;
                                            this.f65455R = z24;
                                            this.f65453P = i14;
                                            this.f65454Q = mo70365qe;
                                        }
                                        z23 = false;
                                        z18 = false;
                                        i19 = this.f65456S + i18;
                                        if (1 <= i19) {
                                        }
                                        if (z23) {
                                        }
                                        z24 = false;
                                        z19 = true;
                                        this.f65455R = z24;
                                        this.f65453P = i14;
                                        this.f65454Q = mo70365qe;
                                    } else {
                                        i18 = ((this.f65444G + mo70339Nu) - mo70345Xg) + mo70341Or;
                                        if (view.getPaddingBottom() == 0) {
                                            i18 -= this.f65456S;
                                        }
                                        if (this.f65454Q >= mo70365qe) {
                                            i18 = Math.max(i18, this.f65452O);
                                        }
                                        this.f65452O = i18;
                                        z23 = true;
                                        z18 = false;
                                        i19 = this.f65456S + i18;
                                        if (1 <= i19) {
                                        }
                                        if (z23) {
                                        }
                                        z24 = false;
                                        z19 = true;
                                        this.f65455R = z24;
                                        this.f65453P = i14;
                                        this.f65454Q = mo70365qe;
                                    }
                                }
                            } else {
                                if (this.f65455R) {
                                    if (view.getPaddingBottom() <= this.f65456S) {
                                        int i24 = ((this.f65444G + mo70339Nu) - mo70345Xg) + mo70341Or;
                                        if (view.getPaddingBottom() == 0) {
                                            i24 -= this.f65456S;
                                        }
                                        if (i24 > 0) {
                                            if (this.f65456S + i24 < mo70339Nu) {
                                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S + i24);
                                                this.f65458U = i24;
                                                z21 = true;
                                                z22 = false;
                                                this.f65460W = mo70365qe;
                                                this.f65455R = false;
                                                z16 = z21;
                                                z17 = z22;
                                            } else {
                                                z21 = false;
                                                z22 = true;
                                                this.f65460W = mo70365qe;
                                                this.f65455R = false;
                                                z16 = z21;
                                                z17 = z22;
                                            }
                                        }
                                    }
                                    z21 = false;
                                    z22 = false;
                                    this.f65460W = mo70365qe;
                                    this.f65455R = false;
                                    z16 = z21;
                                    z17 = z22;
                                } else {
                                    if (z12 && (i17 = this.f65458U) > 0) {
                                        if (i14 > 0) {
                                            int i25 = i17 - i14;
                                            int i26 = this.f65456S + i25;
                                            if (1 <= i26 && i26 < mo70339Nu) {
                                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S + i25);
                                            }
                                        } else {
                                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S + this.f65458U);
                                        }
                                        this.f65453P = i14;
                                    } else {
                                        int i27 = this.f65458U - i14;
                                        int i28 = this.f65456S + i27;
                                        if (1 <= i28 && i28 < mo70339Nu) {
                                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S + i27);
                                        }
                                    }
                                    z16 = false;
                                    z17 = false;
                                }
                                this.f65452O = this.f65458U;
                                this.f65454Q = this.f65460W;
                                z18 = z17;
                                z19 = z16;
                            }
                            if (z19) {
                                InterfaceC27130h2.a.m139239b((InterfaceC27130h2) m103742Dp(), new Runnable() { // from class: w80.j
                                    public /* synthetic */ RunnableC28813j() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC12521a.m70448sq(AbstractC12521a.this);
                                    }
                                }, 0L, 2, null);
                            }
                            if (z18 || z13 || z14 || (this.f65459V == mo70332JC && this.f65457T != z11)) {
                                this.f65455R = true;
                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S);
                                ((InterfaceC27130h2) m103742Dp()).mo70348Zl(new Runnable() { // from class: w80.k
                                    public /* synthetic */ RunnableC28814k() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC12521a.m70449tq(AbstractC12521a.this);
                                    }
                                }, 100L);
                            }
                            this.f65459V = mo70332JC;
                        } else {
                            if (z11) {
                                if (!this.f65457T && this.f65460W == this.f65454Q && this.f65452O == this.f65458U) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                this.f65454Q = mo70365qe;
                                i15 = this.f65452O;
                                break;
                            } else {
                                i15 = this.f65458U;
                                if (i15 == 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                this.f65460W = mo70365qe;
                                break;
                            }
                            if ((z11 && z14) || this.f65457T != z11) {
                                InterfaceC27130h2.a.m139239b((InterfaceC27130h2) m103742Dp(), new Runnable() { // from class: w80.l
                                    public /* synthetic */ RunnableC28815l() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC12521a.m70450uq(AbstractC12521a.this);
                                    }
                                }, 0L, 2, null);
                            }
                            if (!z15 && !z13 && !z14) {
                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S + i16);
                            } else {
                                this.f65455R = true;
                                this.f65452O = 0;
                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f65456S);
                                InterfaceC27130h2.a.m139239b((InterfaceC27130h2) m103742Dp(), new Runnable() { // from class: w80.m
                                    public /* synthetic */ RunnableC28816m() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC12521a.m70451vq(AbstractC12521a.this);
                                    }
                                }, 0L, 2, null);
                            }
                        }
                        this.f65457T = z11;
                        rect.bottom = i14;
                        return;
                    default:
                        return;
                }
            }
            return;
        }
        if (i11 == mo70365qe - 1) {
            BaseMyCloudTabView.AbstractC12510b abstractC12510b3 = this.f65465w;
            if (abstractC12510b3 != null) {
                i13 = abstractC12510b3.mo70386e();
            } else {
                i13 = 0;
            }
            rect.bottom = i13 + MyCloudFileTabView.Companion.m70808a();
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: sf */
    public void mo70511sf(boolean z11) {
        List arrayList;
        boolean z12;
        if (!this.f65449L) {
            return;
        }
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
        if (abstractC12510b == null || (arrayList = abstractC12510b.mo70389h()) == null) {
            arrayList = new ArrayList();
        }
        m70453xq().clear();
        m70454yq().clear();
        for (C2666c c2666c : m70507nq().m13088g().values()) {
            synchronized (c2666c.m13098c()) {
                try {
                    Iterator it = c2666c.m13098c().iterator();
                    while (true) {
                        z12 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        MyCloudMessageItem myCloudMessageItem = (MyCloudMessageItem) it.next();
                        List list = arrayList;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC19074t.m100204b(((SelectedItemData) it2.next()).m72576a().m95029V3(), myCloudMessageItem.m71033m().m95029V3())) {
                                    break;
                                }
                            }
                        }
                        z12 = false;
                        myCloudMessageItem.m71025i(z12);
                        if (c2666c.m13099d().m71022f() && !z12) {
                            c2666c.m13099d().m71025i(false);
                        }
                        if (myCloudMessageItem.m71022f()) {
                            m70453xq().add(myCloudMessageItem);
                            m70454yq().put(myCloudMessageItem.mo40586c(), myCloudMessageItem);
                            if (!z11) {
                                AbstractC19444a.m101697e(new Runnable() { // from class: w80.c

                                    /* renamed from: q */
                                    public final /* synthetic */ MyCloudMessageItem f133484q;

                                    /* renamed from: r */
                                    public final /* synthetic */ boolean f133485r;

                                    public /* synthetic */ RunnableC28806c(MyCloudMessageItem myCloudMessageItem2, boolean z122) {
                                        r2 = myCloudMessageItem2;
                                        r3 = z122;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC12521a.m70442hq(AbstractC12521a.this, r2, r3);
                                    }
                                });
                            } else {
                                m70463Eq(myCloudMessageItem2, z122);
                            }
                        }
                    }
                    List m13098c = c2666c.m13098c();
                    if (!(m13098c instanceof Collection) || !m13098c.isEmpty()) {
                        Iterator it3 = m13098c.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!((MyCloudMessageItem) it3.next()).m71022f()) {
                                    z122 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    c2666c.m13099d().m71025i(z122);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z11) {
            ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: v */
    public List mo70512v() {
        return m70453xq();
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: wp */
    public void mo70513wp() {
        if (!this.f65449L) {
            return;
        }
        this.f65449L = false;
        this.f65450M = false;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
        if (abstractC12510b != null) {
            abstractC12510b.mo70380B(false);
        }
        ((InterfaceC27130h2) m103742Dp()).mo70335K1(this.f65449L);
        m70445kq();
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: x */
    public void mo70514x(int i11, Object... objArr) {
        String str;
        List m131393z;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 9) {
            if (i11 != 51) {
                if (i11 != 5202) {
                    if (i11 != 5208) {
                        if (i11 != 6052) {
                            if (i11 == 174 || i11 == 175) {
                                ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
                                return;
                            }
                            return;
                        }
                        mo70484Vq(Arrays.copyOf(objArr, objArr.length));
                        return;
                    }
                    m70428Tq(Arrays.copyOf(objArr, objArr.length));
                    return;
                }
                m70490Yq(Arrays.copyOf(objArr, objArr.length));
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null && AbstractC25495a.m132078c(str)) {
                m131393z = AbstractC25358n.m131393z(objArr, 1);
                Object[] array = m131393z.toArray(new Object[0]);
                mo70484Vq(Arrays.copyOf(array, array.length));
                return;
            }
            return;
        }
        mo70491Zq(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: xc */
    public void mo70515xc(int i11, int i12, int i13) {
        if (i11 != i12 - i13) {
            ((InterfaceC27130h2) m103742Dp()).mo70348Zl(new Runnable() { // from class: w80.d
                public /* synthetic */ RunnableC28807d() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC12521a.m70437br(AbstractC12521a.this);
                }
            }, 300L);
        }
    }

    @Override // u80.InterfaceC27126g2
    /* renamed from: zk */
    public void mo70516zk() {
        int i11;
        try {
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = this.f65465w;
            if (abstractC12510b != null) {
                i11 = abstractC12510b.mo70386e();
            } else {
                i11 = 0;
            }
            int i12 = AbstractC23222t7.f112586t;
            if (i11 <= 0) {
                i11 = AbstractC23222t7.f112539R;
            }
            ((InterfaceC27130h2) m103742Dp()).mo70346YA(AbstractC23222t7.f112539R + this.f65444G, i12 + i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: zq */
    public abstract C23805a.d mo946zq();
}
