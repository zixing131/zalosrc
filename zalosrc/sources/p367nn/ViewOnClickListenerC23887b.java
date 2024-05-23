package p367nn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1794s0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.LiveData;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import jg0.AbstractC21248c;
import p663xz.InterfaceC30225a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* renamed from: nn.b */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC23887b implements View.OnClickListener {

    /* renamed from: p */
    private final View f115471p;

    /* renamed from: q */
    private final InterfaceC30225a f115472q;

    /* renamed from: r */
    private final InterfaceC24854k f115473r;

    /* renamed from: s */
    private final InterfaceC24854k f115474s;

    /* renamed from: t */
    private InterfaceC23889d f115475t;

    /* renamed from: u */
    private EnumC23888c f115476u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nn.b$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ImageView mo12V4() {
            return (ImageView) ViewOnClickListenerC23887b.this.f115471p.findViewById(AbstractC21248c.camera_action_button_icon);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nn.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final TextView mo12V4() {
            return (TextView) ViewOnClickListenerC23887b.this.f115471p.findViewById(AbstractC21248c.camera_action_button_name);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nn.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m124977a(Boolean bool) {
            int i11;
            View view = ViewOnClickListenerC23887b.this.f115471p;
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124977a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nn.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m124978a(Boolean bool) {
            int i11;
            TextView m124970e = ViewOnClickListenerC23887b.this.m124970e();
            AbstractC19074t.m100207e(m124970e, "access$getButtonText(...)");
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            m124970e.setVisibility(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124978a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nn.b$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m124979a(Integer num) {
            ImageView m124969d = ViewOnClickListenerC23887b.this.m124969d();
            AbstractC19074t.m100205c(num);
            m124969d.setImageResource(num.intValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124979a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nn.b$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f115482p;

        f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f115482p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f115482p;
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
            this.f115482p.mo205i9(obj);
        }
    }

    public ViewOnClickListenerC23887b(View view, InterfaceC30225a interfaceC30225a) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(interfaceC30225a, "resourcesProvider");
        this.f115471p = view;
        this.f115472q = interfaceC30225a;
        m129210a = AbstractC24856m.m129210a(new b());
        this.f115473r = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new a());
        this.f115474s = m129210a2;
    }

    /* renamed from: d */
    public final ImageView m124969d() {
        return (ImageView) this.f115474s.getValue();
    }

    /* renamed from: e */
    public final TextView m124970e() {
        return (TextView) this.f115473r.getValue();
    }

    /* renamed from: f */
    public final void m124971f(C23886a c23886a, InterfaceC23889d interfaceC23889d, InterfaceC1801w interfaceC1801w) {
        LiveData m9364a;
        AbstractC19074t.m100208f(c23886a, "config");
        AbstractC19074t.m100208f(interfaceC23889d, "listener");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        this.f115475t = interfaceC23889d;
        this.f115476u = c23886a.m124962d();
        m124969d().setOnClickListener(this);
        m124969d().setImageResource(c23886a.m124960b());
        m124969d().setColorFilter(this.f115472q.mo149040d(c23886a.m124959a()));
        LiveData m124961c = c23886a.m124961c();
        if (m124961c != null && (m9364a = AbstractC1794s0.m9364a(m124961c)) != null) {
            m9364a.m9219j(interfaceC1801w, new f(new e()));
        }
        Integer m124964f = c23886a.m124964f();
        if (m124964f != null) {
            m124970e().setText(this.f115472q.getString(m124964f.intValue()));
            m124970e().setOnClickListener(this);
            m124970e().setTextColor(this.f115472q.mo149040d(c23886a.m124963e()));
        }
        Integer m124965g = c23886a.m124965g();
        if (m124965g != null) {
            this.f115471p.setPadding(0, m124965g.intValue(), 0, 0);
        }
    }

    /* renamed from: g */
    public final void m124972g(C23886a c23886a, InterfaceC23890e interfaceC23890e, InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(c23886a, "config");
        AbstractC19074t.m100208f(interfaceC23890e, "baseHandler");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        m124971f(c23886a, interfaceC23890e, interfaceC1801w);
        AbstractC1794s0.m9364a(interfaceC23890e.mo124981f()).m9219j(interfaceC1801w, new f(new d()));
    }

    /* renamed from: h */
    public final void m124973h(C23886a c23886a, InterfaceC23891f interfaceC23891f, InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(c23886a, "config");
        AbstractC19074t.m100208f(interfaceC23891f, "handler");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        m124972g(c23886a, interfaceC23891f, interfaceC1801w);
        AbstractC1794s0.m9364a(interfaceC23891f.mo124982b()).m9219j(interfaceC1801w, new f(new c()));
    }

    /* renamed from: i */
    public final void m124974i(int i11) {
        m124969d().setBackgroundResource(i11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC23889d interfaceC23889d;
        EnumC23888c enumC23888c = this.f115476u;
        if (enumC23888c != null && (interfaceC23889d = this.f115475t) != null) {
            interfaceC23889d.mo38273g(enumC23888c);
        }
    }
}
