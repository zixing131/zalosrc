package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vl1 implements dk1 {

    /* renamed from: a */
    private final ka0 f29388a;

    /* renamed from: b */
    private final o81 f29389b;

    /* renamed from: c */
    private final t71 f29390c;

    /* renamed from: d */
    private final nf1 f29391d;

    /* renamed from: e */
    private final Context f29392e;

    /* renamed from: f */
    private final iq2 f29393f;

    /* renamed from: g */
    private final zzcgv f29394g;

    /* renamed from: h */
    private final dr2 f29395h;

    /* renamed from: i */
    private boolean f29396i = false;

    /* renamed from: j */
    private boolean f29397j = false;

    /* renamed from: k */
    private boolean f29398k = true;

    /* renamed from: l */
    private final ga0 f29399l;

    /* renamed from: m */
    private final ha0 f29400m;

    public vl1(ga0 ga0Var, ha0 ha0Var, ka0 ka0Var, o81 o81Var, t71 t71Var, nf1 nf1Var, Context context, iq2 iq2Var, zzcgv zzcgvVar, dr2 dr2Var, byte[] bArr) {
        this.f29399l = ga0Var;
        this.f29400m = ha0Var;
        this.f29388a = ka0Var;
        this.f29389b = o81Var;
        this.f29390c = t71Var;
        this.f29391d = nf1Var;
        this.f29392e = context;
        this.f29393f = iq2Var;
        this.f29394g = zzcgvVar;
        this.f29395h = dr2Var;
    }

    /* renamed from: b */
    private final void m27291b(View view) {
        try {
            ka0 ka0Var = this.f29388a;
            if (ka0Var != null && !ka0Var.zzA()) {
                this.f29388a.mo23147E2(BinderC4273d.m19913I3(view));
                this.f29390c.onAdClicked();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21415w8)).booleanValue()) {
                    this.f29391d.zzq();
                    return;
                }
                return;
            }
            ga0 ga0Var = this.f29399l;
            if (ga0Var != null && !ga0Var.m22379b5()) {
                this.f29399l.m22376Y4(BinderC4273d.m19913I3(view));
                this.f29390c.onAdClicked();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21415w8)).booleanValue()) {
                    this.f29391d.zzq();
                    return;
                }
                return;
            }
            ha0 ha0Var = this.f29400m;
            if (ha0Var != null && !ha0Var.m22766c5()) {
                this.f29400m.m22762Y4(BinderC4273d.m19913I3(view));
                this.f29390c.onAdClicked();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21415w8)).booleanValue()) {
                    this.f29391d.zzq();
                }
            }
        } catch (RemoteException e11) {
            yk0.zzk("Failed to call handleClick", e11);
        }
    }

    /* renamed from: c */
    private static final HashMap m27292c(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: A */
    public final void mo21432A(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: B */
    public final void mo21433B(zzcu zzcuVar) {
        yk0.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: C */
    public final void mo21434C(f20 f20Var) {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: D */
    public final void mo21435D(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: E */
    public final void mo21436E(String str) {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: F */
    public final void mo21437F(View view, View view2, Map map, Map map2, boolean z11) {
        if (this.f29397j && this.f29393f.f22299M) {
            return;
        }
        m27291b(view);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: G */
    public final void mo21438G(View view, Map map, Map map2) {
        try {
            if (!this.f29396i) {
                this.f29396i = zzt.zzs().zzn(this.f29392e, this.f29394g.f32030p, this.f29393f.f22290D.toString(), this.f29395h.f19400f);
            }
            if (!this.f29398k) {
                return;
            }
            ka0 ka0Var = this.f29388a;
            if (ka0Var != null && !ka0Var.zzB()) {
                this.f29388a.zzx();
                this.f29389b.zza();
                return;
            }
            ga0 ga0Var = this.f29399l;
            if (ga0Var != null && !ga0Var.m22380c5()) {
                this.f29399l.zzt();
                this.f29389b.zza();
                return;
            }
            ha0 ha0Var = this.f29400m;
            if (ha0Var != null && !ha0Var.m22767d5()) {
                this.f29400m.zzr();
                this.f29389b.zza();
            }
        } catch (RemoteException e11) {
            yk0.zzk("Failed to call recordImpression", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: H */
    public final void mo21439H(View view, Map map) {
        try {
            InterfaceC4271b m19913I3 = BinderC4273d.m19913I3(view);
            ka0 ka0Var = this.f29388a;
            if (ka0Var != null) {
                ka0Var.mo23148K(m19913I3);
                return;
            }
            ga0 ga0Var = this.f29399l;
            if (ga0Var != null) {
                ga0Var.m22370E2(m19913I3);
                return;
            }
            ha0 ha0Var = this.f29400m;
            if (ha0Var != null) {
                ha0Var.m22765b5(m19913I3);
            }
        } catch (RemoteException e11) {
            yk0.zzk("Failed to call untrackView", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: I */
    public final void mo21440I(View view, Map map, Map map2, boolean z11) {
        if (!this.f29397j) {
            yk0.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f29393f.f22299M) {
            yk0.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            m27291b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: J */
    public final JSONObject mo21441J(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: K */
    public final void mo21442K(zzcq zzcqVar) {
        yk0.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: L */
    public final void mo21443L(View view) {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: M */
    public final void mo21444M(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        InterfaceC4271b zzn;
        try {
            InterfaceC4271b m19913I3 = BinderC4273d.m19913I3(view);
            JSONObject jSONObject = this.f29393f.f22336l0;
            boolean z11 = true;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21348q1)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21358r1)).booleanValue() && next.equals("3010")) {
                                ka0 ka0Var = this.f29388a;
                                Object obj2 = null;
                                if (ka0Var != null) {
                                    try {
                                        zzn = ka0Var.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    ga0 ga0Var = this.f29399l;
                                    if (ga0Var != null) {
                                        zzn = ga0Var.m22374W4();
                                    } else {
                                        ha0 ha0Var = this.f29400m;
                                        if (ha0Var != null) {
                                            zzn = ha0Var.m22757I3();
                                        } else {
                                            zzn = null;
                                        }
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = BinderC4273d.m19914Q(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbu.zzc(optJSONArray, arrayList);
                                zzt.zzp();
                                ClassLoader classLoader = this.f29392e.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z11 = false;
                        break;
                    }
                }
            }
            this.f29398k = z11;
            HashMap m27292c = m27292c(map);
            HashMap m27292c2 = m27292c(map2);
            ka0 ka0Var2 = this.f29388a;
            if (ka0Var2 != null) {
                ka0Var2.mo23150s4(m19913I3, BinderC4273d.m19913I3(m27292c), BinderC4273d.m19913I3(m27292c2));
                return;
            }
            ga0 ga0Var2 = this.f29399l;
            if (ga0Var2 != null) {
                ga0Var2.m22378a5(m19913I3, BinderC4273d.m19913I3(m27292c), BinderC4273d.m19913I3(m27292c2));
                this.f29399l.m22377Z4(m19913I3);
                return;
            }
            ha0 ha0Var2 = this.f29400m;
            if (ha0Var2 != null) {
                ha0Var2.m22764a5(m19913I3, BinderC4273d.m19913I3(m27292c), BinderC4273d.m19913I3(m27292c2));
                this.f29400m.m22763Z4(m19913I3);
            }
        } catch (RemoteException e11) {
            yk0.zzk("Failed to call trackView", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: N */
    public final boolean mo21445N(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: O */
    public final void mo21446O(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: P */
    public final JSONObject mo21447P(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: a */
    public final void mo21448a() {
        this.f29397j = true;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final boolean zzz() {
        return this.f29393f.f22299M;
    }
}
