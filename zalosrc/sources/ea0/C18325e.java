package ea0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1925r;
import androidx.recyclerview.widget.C1909c;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.C7192r2;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.AbstractC13047d;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.AbstractC13050g;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.AbstractC13055l;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13046c0;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13051h;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13056m;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13058o;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13060q;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13062s;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13063t;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13065v;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.C13068y;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ia0.C20485b;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import p578vk.AbstractC28275a;
import tk.InterfaceC26722a;

/* renamed from: ea0.e */
/* loaded from: classes6.dex */
public class C18325e extends AbstractC1925r implements C7192r2.b, InterfaceC18319c {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private boolean f92638t;

    /* renamed from: u */
    private InterfaceC18319c f92639u;

    /* renamed from: v */
    private boolean f92640v;

    /* renamed from: w */
    private View f92641w;

    /* renamed from: ea0.e$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C18325e() {
        super(new C1909c.a(new C20485b()).m10421b(Executors.newSingleThreadExecutor()).m10420a());
        this.f92638t = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        if (abstractC1876c0 instanceof C13063t) {
            Object m10633M = m10633M(i11);
            AbstractC19074t.m100206d(m10633M, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.SeparatorItem");
            ((C13063t) abstractC1876c0).m73352i0((AbstractC28275a.q) m10633M);
            return;
        }
        if (abstractC1876c0 instanceof C13058o) {
            Object m10633M2 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M2, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.Label");
            ((C13058o) abstractC1876c0).m73342k0((AbstractC28275a.k) m10633M2);
            return;
        }
        if (abstractC1876c0 instanceof C13046c0) {
            Object m10633M3 = m10633M(i11);
            AbstractC19074t.m100207e(m10633M3, "getItem(...)");
            ((C13046c0) abstractC1876c0).m73275i0((InterfaceC26722a) m10633M3);
            return;
        }
        if (abstractC1876c0 instanceof AbstractC13055l) {
            Object m10633M4 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M4, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.HistoryQuery");
            AbstractC13055l.m73330p0((AbstractC13055l) abstractC1876c0, (AbstractC28275a.h) m10633M4, null, 2, null);
            return;
        }
        if (abstractC1876c0 instanceof C13056m) {
            Object m10633M5 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M5, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.HorizontalList");
            C13056m.m73335j0((C13056m) abstractC1876c0, (AbstractC28275a.i) m10633M5, null, 2, null);
            return;
        }
        if (abstractC1876c0 instanceof AbstractC13047d) {
            AbstractC13047d abstractC13047d = (AbstractC13047d) abstractC1876c0;
            Object m10633M6 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M6, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ContactItem");
            AbstractC13047d.m73287t0(abstractC13047d, (AbstractC28275a.b) m10633M6, this.f92640v, null, 4, null);
            return;
        }
        if (abstractC1876c0 instanceof C13068y) {
            Object m10633M7 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M7, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ToggleItem");
            C13068y.m73361m0((C13068y) abstractC1876c0, (AbstractC28275a.x) m10633M7, null, 2, null);
            return;
        }
        if (abstractC1876c0 instanceof AbstractC13050g) {
            AbstractC13050g abstractC13050g = (AbstractC13050g) abstractC1876c0;
            Object m10633M8 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M8, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ContactPickerItem");
            AbstractC13050g.m73311n0(abstractC13050g, (AbstractC28275a.d) m10633M8, this.f92640v, null, 4, null);
            return;
        }
        if (abstractC1876c0 instanceof C13062s) {
            Object m10633M9 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M9, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.SeeMoreItem");
            ((C13062s) abstractC1876c0).m73349k0((AbstractC28275a.o) m10633M9);
            return;
        }
        if (abstractC1876c0 instanceof C13065v) {
            Object m10633M10 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M10, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.Symbol");
            ((C13065v) abstractC1876c0).m73356k0((AbstractC28275a.u) m10633M10);
        } else if (abstractC1876c0 instanceof C13051h) {
            Object m10633M11 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M11, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.Empty");
            ((C13051h) abstractC1876c0).m73321i0((AbstractC28275a.e) m10633M11);
        } else if (abstractC1876c0 instanceof ZInstantFullscreenViewHolder) {
            Object m10633M12 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M12, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ZInstantFullscreen");
            ((ZInstantFullscreenViewHolder) abstractC1876c0).m73262q0((AbstractC28275a.a0) m10633M12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: B */
    public void mo9991B(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, List list) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (!list.isEmpty()) {
            for (Object obj : list) {
                if (AbstractC19074t.m100204b(obj, "ChangeEditMode")) {
                    if (abstractC1876c0 instanceof C13056m) {
                        Object m10633M = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.HorizontalList");
                        ((C13056m) abstractC1876c0).m73336i0((AbstractC28275a.i) m10633M, obj);
                    } else if (abstractC1876c0 instanceof AbstractC13047d) {
                        Object m10633M2 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M2, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ContactItem");
                        ((AbstractC13047d) abstractC1876c0).m73295s0((AbstractC28275a.b) m10633M2, this.f92640v, obj);
                    } else if (abstractC1876c0 instanceof AbstractC13055l) {
                        Object m10633M3 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M3, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.HistoryQuery");
                        ((AbstractC13055l) abstractC1876c0).m73332o0((AbstractC28275a.h) m10633M3, obj);
                    }
                } else if (AbstractC19074t.m100204b(obj, "ResumeShaking")) {
                    if (abstractC1876c0 instanceof AbstractC13047d) {
                        Object m10633M4 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M4, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ContactItem");
                        ((AbstractC13047d) abstractC1876c0).m73295s0((AbstractC28275a.b) m10633M4, this.f92640v, obj);
                    }
                } else if (AbstractC19074t.m100204b(obj, "ScrollStateChanged")) {
                    if ((abstractC1876c0 instanceof AbstractC13047d) && !this.f92640v) {
                        Object m10633M5 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M5, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ContactItem");
                        ((AbstractC13047d) abstractC1876c0).m73295s0((AbstractC28275a.b) m10633M5, this.f92640v, obj);
                    } else if ((abstractC1876c0 instanceof AbstractC13050g) && !this.f92640v) {
                        Object m10633M6 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M6, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ContactPickerItem");
                        ((AbstractC13050g) abstractC1876c0).m73314m0((AbstractC28275a.d) m10633M6, this.f92640v, obj);
                    }
                } else if (AbstractC19074t.m100204b(obj, "HorizontalListChanged")) {
                    if (abstractC1876c0 instanceof C13056m) {
                        Object m10633M7 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M7, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.HorizontalList");
                        ((C13056m) abstractC1876c0).m73336i0((AbstractC28275a.i) m10633M7, obj);
                    }
                } else if (AbstractC19074t.m100204b(obj, "OnSelectStateChanged")) {
                    if (abstractC1876c0 instanceof AbstractC13050g) {
                        Object m10633M8 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M8, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ContactPickerItem");
                        ((AbstractC13050g) abstractC1876c0).m73314m0((AbstractC28275a.d) m10633M8, this.f92640v, obj);
                    } else if (abstractC1876c0 instanceof C13068y) {
                        Object m10633M9 = m10633M(i11);
                        AbstractC19074t.m100206d(m10633M9, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.ToggleItem");
                        ((C13068y) abstractC1876c0).m73363l0((AbstractC28275a.x) m10633M9, obj);
                    }
                }
            }
            return;
        }
        super.mo9991B(abstractC1876c0, i11, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                if (i11 != 10) {
                                    if (i11 != 12) {
                                        if (i11 != 14) {
                                            if (i11 != 16) {
                                                if (i11 != 18) {
                                                    if (i11 != 20) {
                                                        if (i11 != 22) {
                                                            if (i11 != 24) {
                                                                switch (i11) {
                                                                    case 29:
                                                                        return new C13068y(viewGroup, this);
                                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                                                        return new AbstractC13050g.d(viewGroup, this);
                                                                    case 31:
                                                                        return new AbstractC13050g.b(viewGroup, this);
                                                                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                                        return new AbstractC13047d.e(viewGroup, this);
                                                                    case 33:
                                                                        return new AbstractC13047d.c(viewGroup, this);
                                                                    case 34:
                                                                        return new AbstractC13050g.e(viewGroup, this);
                                                                    case 35:
                                                                        return new AbstractC13050g.c(viewGroup, this);
                                                                    default:
                                                                        throw new IllegalArgumentException("ViewType is invalid");
                                                                }
                                                            }
                                                            return new AbstractC13055l.b(viewGroup, this);
                                                        }
                                                        return new AbstractC13047d.b(viewGroup, this);
                                                    }
                                                    return new AbstractC13047d.d(viewGroup, this);
                                                }
                                                return new C13051h(viewGroup, this);
                                            }
                                            return new ZInstantFullscreenViewHolder(viewGroup, this.f92639u);
                                        }
                                        return new C13046c0(viewGroup, this);
                                    }
                                    return new AbstractC13055l.c(viewGroup, this);
                                }
                                return new C13056m(viewGroup, this);
                            }
                            return new C13062s(viewGroup, this);
                        }
                        return new C13063t(viewGroup, true);
                    }
                    return new C13060q(viewGroup, this);
                }
                return new C13065v(viewGroup, this);
            }
            return new C13063t(viewGroup, false);
        }
        return new C13058o(viewGroup, false, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: F */
    public void mo9995F(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        super.mo9995F(abstractC1876c0);
        if (m97249Q() && (abstractC1876c0 instanceof C13056m)) {
            C13056m c13056m = (C13056m) abstractC1876c0;
            Object m10633M = m10633M(c13056m.m9929A());
            AbstractC19074t.m100206d(m10633M, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.prestate.DataItem.HorizontalList");
            c13056m.m73336i0((AbstractC28275a.i) m10633M, "ResumeShaking");
            return;
        }
        if ((abstractC1876c0 instanceof AbstractC13047d) && m97249Q()) {
            ((AbstractC13047d) abstractC1876c0).m73294B0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: H */
    public void mo9997H(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        if (abstractC1876c0 instanceof AbstractC13047d) {
            ((AbstractC13047d) abstractC1876c0).m73293A0();
        }
        super.mo9997H(abstractC1876c0);
    }

    /* renamed from: Q */
    public final boolean m97249Q() {
        C18316b c18316b;
        InterfaceC18319c interfaceC18319c = this.f92639u;
        if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("Search.PreState.IsEditorState", null, null, null, 14, null))) != null) {
            return AbstractC19074t.m100204b(c18316b.m97245a(), Boolean.TRUE);
        }
        return false;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        InterfaceC18319c interfaceC18319c = this.f92639u;
        if (interfaceC18319c != null) {
            return (C18316b) interfaceC18319c.mo205i9(c18316b);
        }
        return null;
    }

    /* renamed from: S */
    public final void m97251S(InterfaceC18319c interfaceC18319c) {
        this.f92639u = interfaceC18319c;
    }

    /* renamed from: T */
    public final void m97252T(boolean z11) {
        this.f92640v = z11;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: a */
    public boolean mo36528a(int i11) {
        if (this.f92638t) {
            return false;
        }
        return ((AbstractC28275a) m10633M(i11)) instanceof AbstractC28275a.k;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: b */
    public void mo36530b(View view, int i11) {
        C13058o c13058o;
        AbstractC19074t.m100208f(view, "header");
        AbstractC28275a abstractC28275a = (AbstractC28275a) m10633M(i11);
        if (abstractC28275a instanceof AbstractC28275a.k) {
            Object tag = view.getTag(AbstractC6918a0.container);
            if (tag instanceof C13058o) {
                c13058o = (C13058o) tag;
            } else {
                c13058o = null;
            }
            if (c13058o != null) {
                c13058o.m73342k0((AbstractC28275a.k) abstractC28275a);
            }
        }
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: c */
    public int mo36532c(int i11) {
        while (!mo36528a(i11)) {
            if (i11 < 0) {
                return 0;
            }
        }
        return i11;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: d */
    public View mo36534d(int i11, ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (((AbstractC28275a) m10633M(i11)) instanceof AbstractC28275a.k) {
            View view = this.f92641w;
            if (view == null) {
                C13058o c13058o = new C13058o(viewGroup, true, this);
                c13058o.f7784p.setTag(AbstractC6918a0.container, c13058o);
                View view2 = c13058o.f7784p;
                this.f92641w = view2;
                AbstractC19074t.m100207e(view2, "itemView");
                return view2;
            }
            return view;
        }
        throw new IllegalStateException("This item type might not be a sticky item");
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: e */
    public boolean mo36536e(int i11) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        boolean z11;
        AbstractC28275a abstractC28275a = (AbstractC28275a) m10633M(i11);
        if (abstractC28275a instanceof AbstractC28275a.e) {
            return 18;
        }
        if (abstractC28275a instanceof AbstractC28275a.k) {
            return 0;
        }
        if (abstractC28275a instanceof AbstractC28275a.i) {
            return 10;
        }
        if (abstractC28275a instanceof AbstractC28275a.b) {
            AbstractC28275a.b bVar = (AbstractC28275a.b) abstractC28275a;
            AbstractC28275a.j m142471f = bVar.m142471f();
            if (AbstractC19074t.m100204b(m142471f, AbstractC28275a.j.a.f131918a)) {
                AbstractC28275a.a m142473a = bVar.m142473a();
                if (AbstractC19074t.m100204b(m142473a, AbstractC28275a.a.C33013a.f131882a)) {
                    return 22;
                }
                if (AbstractC19074t.m100204b(m142473a, AbstractC28275a.a.b.f131883a)) {
                    return 33;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (AbstractC19074t.m100204b(m142471f, AbstractC28275a.j.b.f131919a) || AbstractC19074t.m100204b(m142471f, AbstractC28275a.j.c.f131920a)) {
                AbstractC28275a.a m142473a2 = bVar.m142473a();
                if (AbstractC19074t.m100204b(m142473a2, AbstractC28275a.a.C33013a.f131882a)) {
                    return 20;
                }
                if (AbstractC19074t.m100204b(m142473a2, AbstractC28275a.a.b.f131883a)) {
                    return 32;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (abstractC28275a instanceof AbstractC28275a.h) {
            AbstractC28275a.j m142485c = ((AbstractC28275a.h) abstractC28275a).m142485c();
            if (AbstractC19074t.m100204b(m142485c, AbstractC28275a.j.a.f131918a)) {
                return 24;
            }
            if (AbstractC19074t.m100204b(m142485c, AbstractC28275a.j.c.f131920a) || AbstractC19074t.m100204b(m142485c, AbstractC28275a.j.b.f131919a)) {
                return 12;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (abstractC28275a instanceof AbstractC28275a.z) {
            return 14;
        }
        if (abstractC28275a instanceof AbstractC28275a.p) {
            z11 = true;
        } else {
            z11 = abstractC28275a instanceof AbstractC28275a.t;
        }
        if (z11 || (abstractC28275a instanceof AbstractC28275a.s)) {
            return 1;
        }
        if (abstractC28275a instanceof AbstractC28275a.r) {
            return 4;
        }
        if (abstractC28275a instanceof AbstractC28275a.x) {
            return 29;
        }
        if (abstractC28275a instanceof AbstractC28275a.d) {
            AbstractC28275a.d dVar = (AbstractC28275a.d) abstractC28275a;
            if (AbstractC19074t.m100204b(dVar.m142478f(), AbstractC28275a.j.a.f131918a)) {
                AbstractC28275a.a m142473a3 = dVar.m142473a();
                if (AbstractC19074t.m100204b(m142473a3, AbstractC28275a.a.C33013a.f131882a)) {
                    return 31;
                }
                if (AbstractC19074t.m100204b(m142473a3, AbstractC28275a.a.b.f131883a)) {
                    return 35;
                }
                throw new NoWhenBranchMatchedException();
            }
            AbstractC28275a.a m142473a4 = dVar.m142473a();
            if (AbstractC19074t.m100204b(m142473a4, AbstractC28275a.a.C33013a.f131882a)) {
                return 30;
            }
            if (AbstractC19074t.m100204b(m142473a4, AbstractC28275a.a.b.f131883a)) {
                return 34;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (abstractC28275a instanceof AbstractC28275a.o) {
            return 5;
        }
        if (abstractC28275a instanceof AbstractC28275a.u) {
            return 2;
        }
        if (AbstractC19074t.m100204b(abstractC28275a, AbstractC28275a.m.f131927a)) {
            return 3;
        }
        if (abstractC28275a instanceof AbstractC28275a.a0) {
            return 16;
        }
        throw new NoWhenBranchMatchedException();
    }
}
