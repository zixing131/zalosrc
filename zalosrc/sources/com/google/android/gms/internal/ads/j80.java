package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j80 implements z60, i80 {

    /* renamed from: p */
    private final i80 f22719p;

    /* renamed from: q */
    private final HashSet f22720q = new HashSet();

    public j80(i80 i80Var) {
        this.f22719p = i80Var;
    }

    @Override // com.google.android.gms.internal.ads.l70
    /* renamed from: C0 */
    public final /* synthetic */ void mo23550C0(String str, JSONObject jSONObject) {
        y60.m28136d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.x60
    /* renamed from: V */
    public final /* synthetic */ void mo23552V(String str, Map map) {
        y60.m28133a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.z60
    /* renamed from: c */
    public final /* synthetic */ void mo23553c(String str, String str2) {
        y60.m28135c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.i80
    /* renamed from: j0 */
    public final void mo23137j0(String str, c40 c40Var) {
        this.f22719p.mo23137j0(str, c40Var);
        this.f22720q.remove(new AbstractMap.SimpleEntry(str, c40Var));
    }

    @Override // com.google.android.gms.internal.ads.i80
    /* renamed from: l0 */
    public final void mo23138l0(String str, c40 c40Var) {
        this.f22719p.mo23138l0(str, c40Var);
        this.f22720q.add(new AbstractMap.SimpleEntry(str, c40Var));
    }

    @Override // com.google.android.gms.internal.ads.z60
    /* renamed from: n */
    public final /* synthetic */ void mo23555n(String str, JSONObject jSONObject) {
        y60.m28134b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void zza(String str) {
        this.f22719p.zza(str);
    }

    public final void zzc() {
        Iterator it = this.f22720q.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((c40) simpleEntry.getValue()).toString())));
            this.f22719p.mo23137j0((String) simpleEntry.getKey(), (c40) simpleEntry.getValue());
        }
        this.f22720q.clear();
    }
}
