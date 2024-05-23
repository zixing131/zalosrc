package com.zing.zalo.p077ui.mycloud.gridtab;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.p077ui.mycloud.base.AbstractC12521a;
import dg0.AbstractC17930e;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import i60.C20338d;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import p365nk.C23805a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import u80.InterfaceC27130h2;

/* renamed from: com.zing.zalo.ui.mycloud.gridtab.a0 */
/* loaded from: classes6.dex */
public class C12587a0 extends AbstractC12521a {
    public static final a Companion = new a(null);

    /* renamed from: Y */
    private long f65756Y;

    /* renamed from: Z */
    private long f65757Z;

    /* renamed from: a0 */
    private final InterfaceC24854k f65758a0;

    /* renamed from: b0 */
    private final InterfaceC24854k f65759b0;

    /* renamed from: c0 */
    private final C23805a.d f65760c0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.a0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.a0$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f65761q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.a0$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f65762q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12587a0(InterfaceC27130h2 interfaceC27130h2) {
        super(interfaceC27130h2);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC27130h2, "mvpView");
        m129210a = AbstractC24856m.m129210a(b.f65761q);
        this.f65758a0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f65762q);
        this.f65759b0 = m129210a2;
        this.f65760c0 = C23805a.d.f115057q;
    }

    /* renamed from: hr */
    private final List m70957hr() {
        return (List) this.f65758a0.getValue();
    }

    /* renamed from: ir */
    private final List m70958ir() {
        return (List) this.f65759b0.getValue();
    }

    /* renamed from: jr */
    public static final void m70959jr(C12587a0 c12587a0) {
        AbstractC19074t.m100208f(c12587a0, "this$0");
        if ((!c12587a0.m70957hr().isEmpty()) && System.currentTimeMillis() - c12587a0.f65756Y >= 250) {
            if (c12587a0.m70957hr().size() > 1) {
                ((InterfaceC27130h2) c12587a0.m103742Dp()).mo70340OH(c12587a0.m70507nq());
            } else if (c12587a0.m70957hr().size() == 1) {
                ((InterfaceC27130h2) c12587a0.m103742Dp()).mo70329IF((C17945a0) c12587a0.m70957hr().get(0));
            }
            c12587a0.m70957hr().clear();
            c12587a0.f65756Y = 0L;
        }
    }

    /* renamed from: lr */
    public static final void m70960lr(C12587a0 c12587a0) {
        AbstractC19074t.m100208f(c12587a0, "this$0");
        if ((!c12587a0.m70958ir().isEmpty()) && System.currentTimeMillis() - c12587a0.f65757Z >= 250) {
            ((InterfaceC27130h2) c12587a0.m103742Dp()).mo70340OH(c12587a0.m70507nq());
            c12587a0.m70958ir().clear();
            c12587a0.m70500gq();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: Vq */
    public void mo70484Vq(Object... objArr) {
        C17945a0 c17945a0;
        AbstractC19074t.m100208f(objArr, "args");
        if (objArr.length == 0 || m70461Dq() == C23805a.e.f115064q) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f65756Y == 0) {
            this.f65756Y = currentTimeMillis;
        }
        Object obj = objArr[0];
        if (obj instanceof C17945a0) {
            c17945a0 = (C17945a0) obj;
        } else {
            c17945a0 = null;
        }
        if (c17945a0 != null && AbstractC23463h.m123190r(c17945a0) && m70508oq().m13082a(c17945a0) != null) {
            if (currentTimeMillis - this.f65756Y >= 250) {
                if (m70957hr().size() > 1) {
                    ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
                } else if (m70957hr().size() == 1) {
                    ((InterfaceC27130h2) m103742Dp()).mo70329IF((C17945a0) m70957hr().get(0));
                }
                m70957hr().clear();
                this.f65756Y = 0L;
            }
            this.f65756Y = currentTimeMillis;
            m70957hr().add(c17945a0);
            if (!m70957hr().isEmpty()) {
                AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.y
                    public /* synthetic */ RunnableC12621y() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C12587a0.m70959jr(C12587a0.this);
                    }
                }, 250L);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
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
            boolean m13090i = m70507nq().m13090i(c20338d.m106046d());
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f65757Z == 0) {
                this.f65757Z = currentTimeMillis;
            }
            if (m13090i) {
                if (currentTimeMillis - this.f65757Z >= 250) {
                    ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
                    m70958ir().clear();
                    m70500gq();
                }
                this.f65757Z = currentTimeMillis;
                m70958ir().add(c20338d.m106046d());
                if (!m70958ir().isEmpty()) {
                    AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.z
                        public /* synthetic */ RunnableC12622z() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C12587a0.m70960lr(C12587a0.this);
                        }
                    }, 250L);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a, u80.InterfaceC27126g2
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
                int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.item_space_grid_chat_view);
                int itemViewType = ((InterfaceC27130h2) m103742Dp()).getItemViewType(m9929A);
                if (m9929A == m70505mq() && itemViewType != 12 && itemViewType != 13) {
                    rect.top = m118655I;
                }
                if (itemViewType != 12 && itemViewType != 13) {
                    rect.left = m118655I;
                }
                if (itemViewType != 2 && itemViewType != 1 && itemViewType != 12 && itemViewType != 13) {
                    rect.bottom = m118655I;
                }
                m70510rq(m9929A, rect, itemViewType, view);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: kr */
    public void m70961kr(Object... objArr) {
        C17945a0 c17945a0;
        boolean m13090i;
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
        if (c17945a0 == null || !AbstractC19074t.m100204b(c17945a0.mo95039W2(), "204278670")) {
            return;
        }
        if (m70471Oq()) {
            m13090i = m70458Bq().m13090i(c17945a0);
        } else {
            m13090i = m70508oq().m13090i(c17945a0);
        }
        if (m13090i) {
            ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
        }
    }

    /* renamed from: nr */
    public void m70962nr() {
        if (!m70468Kq()) {
            ((InterfaceC27130h2) m103742Dp()).mo70340OH(m70507nq());
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: zq */
    public C23805a.d mo946zq() {
        return this.f65760c0;
    }
}
