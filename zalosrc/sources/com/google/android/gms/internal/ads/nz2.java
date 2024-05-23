package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class nz2 extends jz2 {
    public nz2(ez2 ez2Var, HashSet hashSet, JSONObject jSONObject, long j11, byte[] bArr) {
        super(ez2Var, hashSet, jSONObject, j11, null);
    }

    /* renamed from: c */
    private final void m25051c(String str) {
        iy2 m23465a = iy2.m23465a();
        if (m23465a != null) {
            for (xx2 xx2Var : m23465a.m23467c()) {
                if (this.f23032c.contains(xx2Var.m28061h())) {
                    xx2Var.m28060g().m27091d(str, this.f23034e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.kz2
    /* renamed from: a */
    public final void onPostExecute(String str) {
        m25051c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f23033d.toString();
    }

    @Override // com.google.android.gms.internal.ads.kz2, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m25051c(str);
        super.onPostExecute(str);
    }
}
