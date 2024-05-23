package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class wk1 {

    /* renamed from: a */
    private final zzg f29970a;

    /* renamed from: b */
    private final dr2 f29971b;

    /* renamed from: c */
    private final ak1 f29972c;

    /* renamed from: d */
    private final vj1 f29973d;

    /* renamed from: e */
    private final il1 f29974e;

    /* renamed from: f */
    private final ql1 f29975f;

    /* renamed from: g */
    private final Executor f29976g;

    /* renamed from: h */
    private final Executor f29977h;

    /* renamed from: i */
    private final zzbls f29978i;

    /* renamed from: j */
    private final sj1 f29979j;

    public wk1(zzg zzgVar, dr2 dr2Var, ak1 ak1Var, vj1 vj1Var, il1 il1Var, ql1 ql1Var, Executor executor, Executor executor2, sj1 sj1Var) {
        this.f29970a = zzgVar;
        this.f29971b = dr2Var;
        this.f29978i = dr2Var.f19403i;
        this.f29972c = ak1Var;
        this.f29973d = vj1Var;
        this.f29974e = il1Var;
        this.f29975f = ql1Var;
        this.f29976g = executor;
        this.f29977h = executor2;
        this.f29979j = sj1Var;
    }

    /* renamed from: g */
    private static void m27641g(RelativeLayout.LayoutParams layoutParams, int i11) {
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    return;
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    return;
                }
            }
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            return;
        }
        layoutParams.addRule(10);
        layoutParams.addRule(9);
    }

    /* renamed from: h */
    private final boolean m27642h(ViewGroup viewGroup, boolean z11) {
        View m27246O;
        FrameLayout.LayoutParams layoutParams;
        if (z11) {
            m27246O = this.f29973d.m27245N();
        } else {
            m27246O = this.f29973d.m27246O();
        }
        if (m27246O == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (m27246O.getParent() instanceof ViewGroup) {
            ((ViewGroup) m27246O.getParent()).removeView(m27246O);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21162X2)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(m27246O, layoutParams);
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ void m27643a(ViewGroup viewGroup) {
        boolean z11;
        if (viewGroup != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        vj1 vj1Var = this.f29973d;
        if (vj1Var.m27245N() != null) {
            if (vj1Var.m27242K() != 2 && vj1Var.m27242K() != 1) {
                if (vj1Var.m27242K() == 6) {
                    this.f29970a.zzI(this.f29971b.f19400f, "2", z11);
                    this.f29970a.zzI(this.f29971b.f19400f, "1", z11);
                    return;
                }
                return;
            }
            this.f29970a.zzI(this.f29971b.f19400f, String.valueOf(vj1Var.m27242K()), z11);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void m27644b(sl1 sl1Var) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        h00 m26338a;
        Drawable drawable;
        Context context = null;
        if (this.f29972c.mo20166f() || this.f29972c.mo20165e()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i11 = 0; i11 < 2; i11++) {
                View mo25758Z = sl1Var.mo25758Z(strArr[i11]);
                if (mo25758Z != null && (mo25758Z instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) mo25758Z;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context2 = sl1Var.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        vj1 vj1Var = this.f29973d;
        if (vj1Var.m27244M() != null) {
            view = vj1Var.m27244M();
            zzbls zzblsVar = this.f29978i;
            if (zzblsVar != null && viewGroup == null) {
                m27641g(layoutParams, zzblsVar.f31898t);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(vj1Var.m27251T() instanceof BinderC5075uz)) {
            view = null;
        } else {
            BinderC5075uz binderC5075uz = (BinderC5075uz) vj1Var.m27251T();
            if (viewGroup == null) {
                m27641g(layoutParams, binderC5075uz.zzc());
            }
            View zzbloVar = new zzblo(context2, binderC5075uz, layoutParams);
            zzbloVar.setContentDescription((CharSequence) zzay.zzc().m21823b(AbstractC4554gx.f21144V2));
            view = zzbloVar;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zzaVar = new zza(sl1Var.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = sl1Var.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            sl1Var.mo25759kt(sl1Var.zzk(), view, true);
        }
        c83 c83Var = sk1.f27755C;
        int size = c83Var.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                View mo25758Z2 = sl1Var.mo25758Z((String) c83Var.get(i12));
                i12++;
                if (mo25758Z2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) mo25758Z2;
                    break;
                }
            } else {
                viewGroup2 = null;
                break;
            }
        }
        this.f29977h.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tk1

            /* renamed from: q */
            public final /* synthetic */ ViewGroup f28420q;

            public /* synthetic */ tk1(ViewGroup viewGroup22) {
                r2 = viewGroup22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wk1.this.m27643a(r2);
            }
        });
        if (viewGroup22 != null) {
            if (m27642h(viewGroup22, true)) {
                vj1 vj1Var2 = this.f29973d;
                if (vj1Var2.m27257Z() != null) {
                    vj1Var2.m27257Z().mo26700k0(new vk1(sl1Var, viewGroup22));
                    return;
                }
                return;
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21295k8)).booleanValue() && m27642h(viewGroup22, false)) {
                vj1 vj1Var3 = this.f29973d;
                if (vj1Var3.m27255X() != null) {
                    vj1Var3.m27255X().mo26700k0(new vk1(sl1Var, viewGroup22));
                    return;
                }
                return;
            }
            viewGroup22.removeAllViews();
            View zzf = sl1Var.zzf();
            if (zzf != null) {
                context = zzf.getContext();
            }
            if (context != null && (m26338a = this.f29979j.m26338a()) != null) {
                try {
                    InterfaceC4271b zzi = m26338a.zzi();
                    if (zzi != null && (drawable = (Drawable) BinderC4273d.m19914Q(zzi)) != null) {
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(drawable);
                        InterfaceC4271b zzj = sl1Var.zzj();
                        if (zzj != null) {
                            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21302l5)).booleanValue()) {
                                imageView.setScaleType((ImageView.ScaleType) BinderC4273d.m19914Q(zzj));
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                viewGroup22.addView(imageView);
                            }
                        }
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup22.addView(imageView);
                    }
                } catch (RemoteException unused) {
                    yk0.zzj("Could not get main image drawable");
                }
            }
        }
    }

    /* renamed from: c */
    public final void m27645c(sl1 sl1Var) {
        if (sl1Var == null || this.f29974e == null || sl1Var.zzh() == null || !this.f29972c.mo20167g()) {
            return;
        }
        try {
            sl1Var.zzh().addView(this.f29974e.m23287a());
        } catch (zzcna e11) {
            zze.zzb("web view can not be obtained", e11);
        }
    }

    /* renamed from: d */
    public final void m27646d(sl1 sl1Var) {
        if (sl1Var == null) {
            return;
        }
        Context context = sl1Var.zzf().getContext();
        if (!zzbx.zzh(context, this.f29972c.f17152a)) {
            return;
        }
        if (!(context instanceof Activity)) {
            yk0.zze("Activity context is needed for policy validator.");
            return;
        }
        if (this.f29975f != null && sl1Var.zzh() != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f29975f.m25775a(sl1Var.zzh(), windowManager), zzbx.zzb());
            } catch (zzcna e11) {
                zze.zzb("web view can not be obtained", e11);
            }
        }
    }

    /* renamed from: e */
    public final void m27647e(sl1 sl1Var) {
        this.f29976g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uk1

            /* renamed from: q */
            public final /* synthetic */ sl1 f28964q;

            public /* synthetic */ uk1(sl1 sl1Var2) {
                r2 = sl1Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wk1.this.m27644b(r2);
            }
        });
    }

    /* renamed from: f */
    public final boolean m27648f(ViewGroup viewGroup) {
        return m27642h(viewGroup, true);
    }
}
