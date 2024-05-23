package com.zing.zalo.zview.dialog;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalo.zview.dialog.AlertController;
import com.zing.zalo.zview.dialog.InterfaceC17463d;

/* renamed from: com.zing.zalo.zview.dialog.a */
/* loaded from: classes7.dex */
public class C17460a extends KeyEventCallbackC17462c implements InterfaceC17463d {

    /* renamed from: I */
    AlertController f88991I;

    /* renamed from: com.zing.zalo.zview.dialog.a$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.C17457b f88992a;

        public a(Context context) {
            this(context, C17460a.m92825M(context, 0));
        }

        /* renamed from: a */
        public C17460a m92830a() {
            C17460a c17460a = new C17460a(this.f88992a.f88955a, 0, false);
            this.f88992a.m92823a(c17460a.f88991I);
            c17460a.m92873y(this.f88992a.f88969o);
            if (this.f88992a.f88969o) {
                c17460a.m92874z(true);
            }
            c17460a.m92854E(this.f88992a.f88970p);
            c17460a.m92855F(this.f88992a.f88971q);
            InterfaceC17463d.f fVar = this.f88992a.f88972r;
            if (fVar != null) {
                c17460a.m92856G(fVar);
            }
            return c17460a;
        }

        /* renamed from: b */
        public a m92831b(ListAdapter listAdapter, InterfaceC17463d.d dVar) {
            AlertController.C17457b c17457b = this.f88992a;
            c17457b.f88974t = listAdapter;
            c17457b.f88975u = dVar;
            return this;
        }

        /* renamed from: c */
        public a m92832c(boolean z11) {
            this.f88992a.f88969o = z11;
            return this;
        }

        /* renamed from: d */
        public a m92833d(int i11) {
            this.f88992a.f88957c = i11;
            return this;
        }

        /* renamed from: e */
        public a m92834e(CharSequence charSequence) {
            this.f88992a.f88962h = charSequence;
            return this;
        }

        /* renamed from: f */
        public a m92835f(int i11, InterfaceC17463d.d dVar) {
            AlertController.C17457b c17457b = this.f88992a;
            c17457b.f88965k = c17457b.f88955a.getText(i11);
            this.f88992a.f88966l = dVar;
            return this;
        }

        /* renamed from: g */
        public a m92836g(InterfaceC17463d.c cVar) {
            this.f88992a.f88970p = cVar;
            return this;
        }

        /* renamed from: h */
        public a m92837h(int i11, InterfaceC17463d.d dVar) {
            AlertController.C17457b c17457b = this.f88992a;
            c17457b.f88963i = c17457b.f88955a.getText(i11);
            this.f88992a.f88964j = dVar;
            return this;
        }

        /* renamed from: i */
        public a m92838i(CharSequence charSequence, InterfaceC17463d.d dVar) {
            AlertController.C17457b c17457b = this.f88992a;
            c17457b.f88963i = charSequence;
            c17457b.f88964j = dVar;
            return this;
        }

        /* renamed from: j */
        public a m92839j(CharSequence[] charSequenceArr, int i11, InterfaceC17463d.d dVar) {
            AlertController.C17457b c17457b = this.f88992a;
            c17457b.f88973s = charSequenceArr;
            c17457b.f88975u = dVar;
            c17457b.f88948F = i11;
            c17457b.f88947E = true;
            return this;
        }

        /* renamed from: k */
        public a m92840k(int i11) {
            AlertController.C17457b c17457b = this.f88992a;
            c17457b.f88960f = c17457b.f88955a.getText(i11);
            return this;
        }

        /* renamed from: l */
        public a m92841l(CharSequence charSequence) {
            this.f88992a.f88960f = charSequence;
            return this;
        }

        /* renamed from: m */
        public a m92842m(View view) {
            AlertController.C17457b c17457b = this.f88992a;
            c17457b.f88977w = view;
            c17457b.f88976v = 0;
            c17457b.f88944B = false;
            return this;
        }

        /* renamed from: n */
        public C17460a m92843n() {
            C17460a m92830a = m92830a();
            m92830a.mo13822K();
            return m92830a;
        }

        public a(Context context, int i11) {
            this.f88992a = new AlertController.C17457b(new ContextThemeWrapper(context, C17460a.m92825M(context, i11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C17460a(Context context, int i11) {
        this(context, i11, true);
    }

    /* renamed from: M */
    static int m92825M(Context context, int i11) {
        if (i11 >= 16777216) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC17450b.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: J */
    public void mo43148J(CharSequence charSequence) {
        this.f88991I.m92814s(charSequence);
    }

    /* renamed from: L */
    public Button m92826L(int i11) {
        return this.f88991I.m92799d(i11);
    }

    /* renamed from: N */
    public void mo92827N(int i11, CharSequence charSequence, InterfaceC17463d.d dVar) {
        this.f88991I.m92807l(i11, charSequence, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m92828O(int i11) {
        this.f88991I.m92808m(i11);
    }

    /* renamed from: P */
    public void m92829P(View view) {
        this.f88991I.m92816u(view);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.f88991I.m92802g(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f88991I.m92803h(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        this.f88991I.m92801f();
    }

    C17460a(Context context, int i11, boolean z11) {
        super(context, z11 ? m92825M(context, i11) : 0, z11);
        this.f89005r.m92896c();
        this.f88991I = AlertController.m92796c(m92865i(), this, m92867k());
    }
}
