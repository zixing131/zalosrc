package com.zing.zalo.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.dialog.MaterialZaloDialogController;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* renamed from: com.zing.zalo.dialog.j */
/* loaded from: classes3.dex */
public class C8009j extends KeyEventCallbackC17462c {

    /* renamed from: I */
    MaterialZaloDialogController f43817I;

    /* renamed from: com.zing.zalo.dialog.j$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final MaterialZaloDialogController.C7992b f43818a;

        public a(Context context) {
            this.f43818a = new MaterialZaloDialogController.C7992b(context);
        }

        /* renamed from: A */
        public a m43150A(View view, int i11, int i12, int i13, int i14) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43667w = view;
            c7992b.f43625B = true;
            c7992b.f43668x = i11;
            c7992b.f43669y = i12;
            c7992b.f43670z = i13;
            c7992b.f43624A = i14;
            return this;
        }

        /* renamed from: B */
        public C8009j m43151B() {
            C8009j m43152a = m43152a();
            m43152a.mo13822K();
            return m43152a;
        }

        /* renamed from: a */
        public C8009j m43152a() {
            C8009j c8009j = new C8009j(this.f43818a.f43645a);
            this.f43818a.m43039b(c8009j.f43817I);
            c8009j.m92873y(this.f43818a.f43661q);
            c8009j.m92854E(this.f43818a.f43662r);
            InterfaceC17463d.f fVar = this.f43818a.f43663s;
            if (fVar != null) {
                c8009j.m92856G(fVar);
            }
            return c8009j;
        }

        /* renamed from: b */
        public a m43153b(ListAdapter listAdapter, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43665u = listAdapter;
            c7992b.f43666v = dVar;
            return this;
        }

        /* renamed from: c */
        public a m43154c(boolean z11) {
            this.f43818a.f43636M = z11;
            return this;
        }

        /* renamed from: d */
        public a m43155d(boolean z11) {
            this.f43818a.f43661q = z11;
            return this;
        }

        /* renamed from: e */
        public a m43156e(int i11) {
            this.f43818a.f43642S = i11;
            return this;
        }

        /* renamed from: f */
        public a m43157f(int i11) {
            this.f43818a.f43640Q = i11;
            return this;
        }

        /* renamed from: g */
        public a m43158g(View view) {
            this.f43818a.f43650f = view;
            return this;
        }

        /* renamed from: h */
        public a m43159h(int i11) {
            this.f43818a.f43641R = i11;
            return this;
        }

        /* renamed from: i */
        public a m43160i(CharSequence[] charSequenceArr, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43664t = charSequenceArr;
            c7992b.f43666v = dVar;
            return this;
        }

        /* renamed from: j */
        public a m43161j(int i11) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43651g = c7992b.f43645a.getText(i11);
            return this;
        }

        /* renamed from: k */
        public a m43162k(CharSequence charSequence) {
            this.f43818a.f43651g = charSequence;
            return this;
        }

        /* renamed from: l */
        public a m43163l(MovementMethod movementMethod) {
            this.f43818a.f43652h = movementMethod;
            return this;
        }

        /* renamed from: m */
        public a m43164m(int i11, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43655k = c7992b.f43645a.getText(i11);
            this.f43818a.f43656l = dVar;
            return this;
        }

        /* renamed from: n */
        public a m43165n(CharSequence charSequence, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43655k = charSequence;
            c7992b.f43656l = dVar;
            return this;
        }

        /* renamed from: o */
        public a m43166o(CharSequence charSequence, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43657m = charSequence;
            c7992b.f43658n = dVar;
            return this;
        }

        /* renamed from: p */
        public a m43167p(InterfaceC17463d.c cVar) {
            this.f43818a.f43662r = cVar;
            return this;
        }

        /* renamed from: q */
        public a m43168q(CharSequence charSequence, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43659o = charSequence;
            c7992b.f43660p = dVar;
            return this;
        }

        /* renamed from: r */
        public a m43169r(int i11, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43653i = c7992b.f43645a.getText(i11);
            this.f43818a.f43654j = dVar;
            return this;
        }

        /* renamed from: s */
        public a m43170s(CharSequence charSequence, InterfaceC17463d.d dVar) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43653i = charSequence;
            c7992b.f43654j = dVar;
            return this;
        }

        /* renamed from: t */
        public a m43171t(int i11) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43649e = c7992b.f43645a.getText(i11);
            return this;
        }

        /* renamed from: u */
        public a m43172u(CharSequence charSequence) {
            this.f43818a.f43649e = charSequence;
            return this;
        }

        /* renamed from: v */
        public a m43173v(int i11) {
            this.f43818a.f43639P = i11;
            return this;
        }

        /* renamed from: w */
        public a m43174w(boolean z11) {
            this.f43818a.f43637N = z11;
            return this;
        }

        /* renamed from: x */
        public a m43175x(boolean z11) {
            this.f43818a.f43643T = z11;
            return this;
        }

        /* renamed from: y */
        public a m43176y(boolean z11) {
            this.f43818a.f43644U = z11;
            return this;
        }

        /* renamed from: z */
        public a m43177z(View view) {
            MaterialZaloDialogController.C7992b c7992b = this.f43818a;
            c7992b.f43667w = view;
            c7992b.f43625B = false;
            return this;
        }
    }

    protected C8009j(Context context) {
        this(context, AbstractC8915g0.Theme_Dialog_Translucent);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: J */
    public void mo43148J(CharSequence charSequence) {
        super.mo43148J(charSequence);
        this.f43817I.m43026p(charSequence);
    }

    /* renamed from: L */
    public void m43149L(CharSequence charSequence) {
        this.f43817I.m43024n(charSequence);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.f43817I.m43013c(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f43817I.m43014d(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        this.f43817I.m43012b();
    }

    protected C8009j(Context context, int i11) {
        super(context, i11);
        this.f43817I = new MaterialZaloDialogController(context, this, m92867k());
    }
}
