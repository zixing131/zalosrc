package p664y;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;
import p467r.C25589l;
import p512t.C26435a;
import p562v.AbstractC27389b;
import p664y.AbstractAsyncTaskC30232e;

/* renamed from: y.i */
/* loaded from: classes2.dex */
public class AsyncTaskC30236i extends AbstractAsyncTaskC30231d {
    public AsyncTaskC30236i(AbstractAsyncTaskC30232e.b bVar, HashSet hashSet, JSONObject jSONObject, long j11) {
        super(bVar, hashSet, jSONObject, j11);
    }

    /* renamed from: e */
    private void m149092e(String str) {
        C26435a m136271a = C26435a.m136271a();
        if (m136271a != null) {
            for (C25589l c25589l : m136271a.m136273c()) {
                if (this.f140429c.contains(c25589l.m132175t())) {
                    c25589l.m132176u().m146278e(str, this.f140431e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p664y.AbstractAsyncTaskC30232e, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m149092e(str);
        }
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (AbstractC27389b.m140327l(this.f140430d, this.f140433b.mo149085a())) {
            return null;
        }
        this.f140433b.mo149086b(this.f140430d);
        return this.f140430d.toString();
    }
}
