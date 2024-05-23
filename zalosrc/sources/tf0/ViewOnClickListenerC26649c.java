package tf0;

import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import p278jv.C21369c;
import p649xl.C29836h8;
import p729zu.InterfaceC32557a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import sf0.InterfaceC26239a;
import uf0.EnumC27244a;

/* renamed from: tf0.c */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC26649c implements View.OnClickListener {

    /* renamed from: p */
    private final InterfaceC32557a f126114p;

    /* renamed from: q */
    private final InterfaceC24854k f126115q;

    /* renamed from: r */
    private final InterfaceC24854k f126116r;

    /* renamed from: s */
    private final InterfaceC24854k f126117s;

    /* renamed from: t */
    private final InterfaceC24854k f126118t;

    /* renamed from: tf0.c$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C29836h8 f126119q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C29836h8 c29836h8) {
            super(0);
            this.f126119q = c29836h8;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button mo12V4() {
            return this.f126119q.f138016r.f138154q;
        }
    }

    /* renamed from: tf0.c$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C29836h8 f126120q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C29836h8 c29836h8) {
            super(0);
            this.f126120q = c29836h8;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button mo12V4() {
            return this.f126120q.f138016r.f138155r;
        }
    }

    /* renamed from: tf0.c$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m136792a(String str) {
            ViewOnClickListenerC26649c.this.m136785g().setText(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m136792a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tf0.c$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m136793a(EnumC27244a enumC27244a) {
            ViewOnClickListenerC26649c.this.m136787j(enumC27244a);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m136793a((EnumC27244a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tf0.c$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m136794a(C21369c c21369c) {
            ViewOnClickListenerC26649c viewOnClickListenerC26649c = ViewOnClickListenerC26649c.this;
            AbstractC19074t.m100205c(c21369c);
            viewOnClickListenerC26649c.m136788k(c21369c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m136794a((C21369c) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tf0.c$f */
    /* loaded from: classes5.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C29836h8 f126124q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C29836h8 c29836h8) {
            super(0);
            this.f126124q = c29836h8;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProgressBar mo12V4() {
            return this.f126124q.f138016r.f138156s;
        }
    }

    /* renamed from: tf0.c$g */
    /* loaded from: classes5.dex */
    static final class g implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f126125p;

        g(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f126125p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f126125p;
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
            this.f126125p.mo205i9(obj);
        }
    }

    /* renamed from: tf0.c$h */
    /* loaded from: classes5.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C29836h8 f126126q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C29836h8 c29836h8) {
            super(0);
            this.f126126q = c29836h8;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return this.f126126q.f138016r.f138157t;
        }
    }

    public ViewOnClickListenerC26649c(C29836h8 c29836h8, InterfaceC32557a interfaceC32557a) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(c29836h8, "rootViewBinding");
        AbstractC19074t.m100208f(interfaceC32557a, "webViewBts");
        this.f126114p = interfaceC32557a;
        m129210a = AbstractC24856m.m129210a(new a(c29836h8));
        this.f126115q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new b(c29836h8));
        this.f126116r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new h(c29836h8));
        this.f126117s = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new f(c29836h8));
        this.f126118t = m129210a4;
    }

    /* renamed from: d */
    private final Button m136782d() {
        return (Button) this.f126115q.getValue();
    }

    /* renamed from: e */
    private final Button m136783e() {
        return (Button) this.f126116r.getValue();
    }

    /* renamed from: f */
    private final ProgressBar m136784f() {
        return (ProgressBar) this.f126118t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final RobotoTextView m136785g() {
        return (RobotoTextView) this.f126117s.getValue();
    }

    /* renamed from: i */
    private final void m136786i() {
        if (this.f126114p.canGoBack()) {
            this.f126114p.mo89719ra();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m136787j(EnumC27244a enumC27244a) {
        Button m136782d = m136782d();
        if (enumC27244a == EnumC27244a.f128027r) {
            if (m136782d.getVisibility() != 4) {
                m136782d.setEnabled(false);
                m136782d.setVisibility(4);
                return;
            }
            return;
        }
        if (m136782d.getVisibility() != 0) {
            m136782d.setEnabled(true);
            m136782d.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m136788k(C21369c c21369c) {
        if (!c21369c.m110764f()) {
            if (m136784f().getVisibility() != 8) {
                m136784f().setVisibility(8);
            }
        } else {
            m136784f().setVisibility(0);
            m136784f().setProgress(c21369c.m110762d());
        }
    }

    /* renamed from: h */
    public final void m136789h(InterfaceC1801w interfaceC1801w, InterfaceC26239a interfaceC26239a) {
        AbstractC19074t.m100208f(interfaceC1801w, "lifeCycleOwner");
        AbstractC19074t.m100208f(interfaceC26239a, "webViewBtsViewModel");
        interfaceC26239a.getTitle().m9219j(interfaceC1801w, new g(new c()));
        interfaceC26239a.mo134925a().m9219j(interfaceC1801w, new g(new d()));
        interfaceC26239a.mo134926b().m9219j(interfaceC1801w, new g(new e()));
        m136782d().setOnClickListener(this);
        m136783e().setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC19074t.m100204b(view, m136782d())) {
            m136786i();
        } else if (AbstractC19074t.m100204b(view, m136783e())) {
            this.f126114p.mo89718cG();
        }
    }
}
