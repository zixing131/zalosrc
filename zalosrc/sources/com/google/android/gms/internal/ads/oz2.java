package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class oz2 extends jz2 {
    public oz2(ez2 ez2Var, HashSet hashSet, JSONObject jSONObject, long j11, byte[] bArr) {
        super(ez2Var, hashSet, jSONObject, j11, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.kz2
    /* renamed from: a */
    public final void onPostExecute(String str) {
        iy2 m23465a;
        if (!TextUtils.isEmpty(str) && (m23465a = iy2.m23465a()) != null) {
            for (xx2 xx2Var : m23465a.m23467c()) {
                if (this.f23032c.contains(xx2Var.m28061h())) {
                    xx2Var.m28060g().m27092e(str, this.f23034e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (yy2.m28397j(this.f23033d, this.f23654b.m21833a())) {
            return null;
        }
        this.f23654b.m21837e(this.f23033d);
        return this.f23033d.toString();
    }

    @Override // com.google.android.gms.internal.ads.kz2, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
