package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.AbstractC4270a;
import p123e6.InterfaceC18255e;

/* loaded from: classes2.dex */
public class MapView extends FrameLayout {

    /* renamed from: p */
    private final C5896d f33573p;

    public MapView(Context context) {
        super(context);
        this.f33573p = new C5896d(this, context, null);
        setClickable(true);
    }

    /* renamed from: h */
    public void m30659h(InterfaceC18255e interfaceC18255e) {
        AbstractC4205o.m19717f("getMapAsync() must be called on the main thread");
        AbstractC4205o.m19723l(interfaceC18255e, "callback must not be null.");
        this.f33573p.m30674q(interfaceC18255e);
    }

    /* renamed from: i */
    public void m30660i(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f33573p.m19904c(bundle);
            if (this.f33573p.m19903b() == null) {
                AbstractC4270a.m19895j(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: j */
    public void m30661j() {
        this.f33573p.m19905d();
    }

    /* renamed from: k */
    public void m30662k() {
        this.f33573p.m19906e();
    }

    /* renamed from: l */
    public void m30663l() {
        this.f33573p.m19907f();
    }

    /* renamed from: m */
    public void m30664m() {
        this.f33573p.m19908g();
    }

    /* renamed from: n */
    public void m30665n() {
        this.f33573p.m19909h();
    }

    /* renamed from: p */
    public void m30666p() {
        this.f33573p.m19910i();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33573p = new C5896d(this, context, GoogleMapOptions.m30630M(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f33573p = new C5896d(this, context, GoogleMapOptions.m30630M(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f33573p = new C5896d(this, context, googleMapOptions);
        setClickable(true);
    }
}
