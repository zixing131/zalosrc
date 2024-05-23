package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qk1 extends t00 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, sl1 {

    /* renamed from: p */
    private final WeakReference f26823p;

    /* renamed from: q */
    private final Map f26824q = new HashMap();

    /* renamed from: r */
    private final Map f26825r = new HashMap();

    /* renamed from: s */
    private final Map f26826s = new HashMap();

    /* renamed from: t */
    private qj1 f26827t;

    /* renamed from: u */
    private ViewOnAttachStateChangeListenerC4917qp f26828u;

    public qk1(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzt.zzx();
        xl0.m27928a(view, this);
        zzt.zzx();
        xl0.m27929b(view, this);
        this.f26823p = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f26824q.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f26826s.putAll(this.f26824q);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f26825r.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f26826s.putAll(this.f26825r);
        this.f26828u = new ViewOnAttachStateChangeListenerC4917qp(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.sl1
    /* renamed from: Z */
    public final synchronized View mo25758Z(String str) {
        WeakReference weakReference = (WeakReference) this.f26826s.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.sl1
    /* renamed from: kt */
    public final synchronized void mo25759kt(String str, View view, boolean z11) {
        this.f26826s.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.f26824q.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        qj1 qj1Var = this.f26827t;
        if (qj1Var != null) {
            qj1Var.m25739S(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        qj1 qj1Var = this.f26827t;
        if (qj1Var != null) {
            qj1Var.m25737Q(zzf(), zzl(), zzm(), qj1.m25723w(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        qj1 qj1Var = this.f26827t;
        if (qj1Var != null) {
            qj1Var.m25737Q(zzf(), zzl(), zzm(), qj1.m25723w(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        qj1 qj1Var = this.f26827t;
        if (qj1Var != null) {
            qj1Var.m25745k(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final synchronized void zzb(InterfaceC4271b interfaceC4271b) {
        try {
            if (this.f26827t != null) {
                Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
                if (!(m19914Q instanceof View)) {
                    yk0.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f26827t.m25747m((View) m19914Q);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final synchronized void zzc(InterfaceC4271b interfaceC4271b) {
        Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
        if (!(m19914Q instanceof qj1)) {
            yk0.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        qj1 qj1Var = this.f26827t;
        if (qj1Var != null) {
            qj1Var.m25753s(this);
        }
        qj1 qj1Var2 = (qj1) m19914Q;
        if (qj1Var2.m25754t()) {
            this.f26827t = qj1Var2;
            qj1Var2.m25752r(this);
            this.f26827t.m25744j(zzf());
            return;
        }
        yk0.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final synchronized void zzd() {
        qj1 qj1Var = this.f26827t;
        if (qj1Var != null) {
            qj1Var.m25753s(this);
            this.f26827t = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final View zzf() {
        return (View) this.f26823p.get();
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final ViewOnAttachStateChangeListenerC4917qp zzi() {
        return this.f26828u;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized InterfaceC4271b zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized Map zzl() {
        return this.f26826s;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized Map zzm() {
        return this.f26824q;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized Map zzn() {
        return this.f26825r;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized JSONObject zzp() {
        qj1 qj1Var = this.f26827t;
        if (qj1Var != null) {
            return qj1Var.m25729H(zzf(), zzl(), zzm());
        }
        return null;
    }
}
