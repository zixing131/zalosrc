package com.google.android.gms.dynamic;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.internal.AbstractC4235y;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4270a {

    /* renamed from: a */
    private InterfaceC4272c f16803a;

    /* renamed from: b */
    private Bundle f16804b;

    /* renamed from: c */
    private LinkedList f16805c;

    /* renamed from: d */
    private final InterfaceC4274e f16806d = new C4275f(this);

    /* renamed from: j */
    public static void m19895j(FrameLayout frameLayout) {
        C4070a m19196p = C4070a.m19196p();
        Context context = frameLayout.getContext();
        int mo19200i = m19196p.mo19200i(context);
        String m19815d = AbstractC4235y.m19815d(context, mo19200i);
        String m19814c = AbstractC4235y.m19814c(context, mo19200i);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(m19815d);
        linearLayout.addView(textView);
        Intent mo19197d = m19196p.mo19197d(context, mo19200i, null);
        if (mo19197d != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(m19814c);
            linearLayout.addView(button);
            button.setOnClickListener(new ViewOnClickListenerC4277h(context, mo19197d));
        }
    }

    /* renamed from: o */
    private final void m19900o(int i11) {
        while (!this.f16805c.isEmpty() && ((InterfaceC4280k) this.f16805c.getLast()).mo19916a() >= i11) {
            this.f16805c.removeLast();
        }
    }

    /* renamed from: p */
    private final void m19901p(Bundle bundle, InterfaceC4280k interfaceC4280k) {
        InterfaceC4272c interfaceC4272c = this.f16803a;
        if (interfaceC4272c != null) {
            interfaceC4280k.mo19917b(interfaceC4272c);
            return;
        }
        if (this.f16805c == null) {
            this.f16805c = new LinkedList();
        }
        this.f16805c.add(interfaceC4280k);
        if (bundle != null) {
            Bundle bundle2 = this.f16804b;
            if (bundle2 == null) {
                this.f16804b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo19902a(this.f16806d);
    }

    /* renamed from: a */
    protected abstract void mo19902a(InterfaceC4274e interfaceC4274e);

    /* renamed from: b */
    public InterfaceC4272c m19903b() {
        return this.f16803a;
    }

    /* renamed from: c */
    public void m19904c(Bundle bundle) {
        m19901p(bundle, new C4276g(this, bundle));
    }

    /* renamed from: d */
    public void m19905d() {
        InterfaceC4272c interfaceC4272c = this.f16803a;
        if (interfaceC4272c != null) {
            interfaceC4272c.onDestroy();
        } else {
            m19900o(1);
        }
    }

    /* renamed from: e */
    public void m19906e() {
        InterfaceC4272c interfaceC4272c = this.f16803a;
        if (interfaceC4272c != null) {
            interfaceC4272c.onLowMemory();
        }
    }

    /* renamed from: f */
    public void m19907f() {
        InterfaceC4272c interfaceC4272c = this.f16803a;
        if (interfaceC4272c != null) {
            interfaceC4272c.onPause();
        } else {
            m19900o(5);
        }
    }

    /* renamed from: g */
    public void m19908g() {
        m19901p(null, new C4279j(this));
    }

    /* renamed from: h */
    public void m19909h() {
        m19901p(null, new C4278i(this));
    }

    /* renamed from: i */
    public void m19910i() {
        InterfaceC4272c interfaceC4272c = this.f16803a;
        if (interfaceC4272c != null) {
            interfaceC4272c.onStop();
        } else {
            m19900o(4);
        }
    }
}
